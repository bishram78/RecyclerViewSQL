package com.bishram.recyclerviewsql;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class DBAdapter {
    Context context;
    SQLiteDatabase database;
    DBHelper mDBHelper;

    public DBAdapter(Context context) {
        this.context = context;
        mDBHelper = new DBHelper(context);
    }

    //OPEN DATABASE

    public DBAdapter openDB() {
        try {
            database = mDBHelper.getWritableDatabase();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return this;
    }

    //CLOSE DATABASE
    public void closeDB() {
        try {
            mDBHelper.close();
        } catch (SQLiteException exception) {
            exception.printStackTrace();
        }
    }

    //INSERT INTO DATABASE
    public long addData(String name, String pos) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(Constants.COLUMN_NAME, name);
            contentValues.put(Constants.COLUMN_POSITION, pos);

            return database.insert(Constants.TB_NAME, Constants.ROW_ID, contentValues);
        } catch (SQLiteException exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    //RETRIEVE FROM DATABASE
    public Cursor getAllPlayers() {
        String[] columns = {
                Constants.ROW_ID,
                Constants.COLUMN_NAME,
                Constants.COLUMN_POSITION
        };

        return database.query(Constants.TB_NAME, columns, null, null, null, null, null);
    }
}
