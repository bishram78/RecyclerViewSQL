package com.bishram.recyclerviewsql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, Constants.DB_NAME, null, Constants.DB_VERSION);
    }

    //TABLE CREATION
    @Override
    public void onCreate(SQLiteDatabase database) {
        try
        {
            database.execSQL(Constants.CREATE_TABLE);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    //TABLE UPGRADE
    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS " + Constants.TB_NAME);
        onCreate(database);
    }
}
