package com.kusitms.team7

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBManager(
    context: Context?,
    name: String?,
    factory: SQLiteDatabase.CursorFactory?,
    version: Int
) : SQLiteOpenHelper(context, name, factory, version) {
    override fun onCreate(db: SQLiteDatabase?) {
        // Food 테이블 추가
        db!!.execSQL("CREATE TABLE Food (name text PRIMARY KEY, date text)")
    }

    // Food 테이블 삭제
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS Food")
        onCreate(db)
    }

    // DB에 새로운 음식 정보 삽입
    fun insertFood(name: String, date : String){
        val db = this.writableDatabase
        /* insert될 데이터값 */
        db.execSQL(
            "INSERT INTO Food VALUES('" + name + "'" + ", '" + date + "');")

        db.close()
    }
}