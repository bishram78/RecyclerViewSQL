package com.bishram.recyclerviewsql;

public class Constants {

    //DATABASE PROPERTIES
    static final int DB_VERSION = 1;
    static final String DB_NAME = "d_DB";
    static final String TB_NAME = "d_TB";

    //COLUMNS OF THE TABLE
    static final String ROW_ID = "id";
    static final String COLUMN_NAME = "name";
    static final String COLUMN_POSITION = "position";

    //COMMAND THAT CREATE TABLE TO THE DATABASE
    static final String CREATE_TABLE = "CREATE TABLE d_TB (id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "name TEXT NOT NULL, position TEXT NOT NULL);";
}
