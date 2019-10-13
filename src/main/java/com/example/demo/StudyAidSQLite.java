package com.example.demo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StudyAidSQLite extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "StudyAidNamnt01.db";
    public static final int VERSION = 1;

    public StudyAidSQLite(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CourseDAO.SQL_COURSE);
        sqLiteDatabase.execSQL(CourseDAO.SQL_COURSE_NEW);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

