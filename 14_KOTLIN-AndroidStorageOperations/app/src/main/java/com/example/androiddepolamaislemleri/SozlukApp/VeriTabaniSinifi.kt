package com.example.androiddepolamaislemleri.SozlukApp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class VeriTabaniSinifi(mContext:Context):SQLiteOpenHelper(mContext,"sozluk",null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(
            "CREATE TABLE sozluk (" +
                    "sozcuk_No INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "sozcuk_Turkce TEXT," +
                    "sozcuk_Ingilizce TEXT);"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(
            "DROP TABLE IF EXISTS sozluk"
        )
        onCreate(db)
    }

}