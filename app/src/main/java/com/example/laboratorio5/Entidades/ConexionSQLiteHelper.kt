package com.example.laboratorio5.Entidades

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.laboratorio5.question

class ConexionSQLiteHelper (context: Context): SQLiteOpenHelper(context,
    DATABASE_NAME, null,
    DATABASE_VERSION
){
    private val db: SQLiteDatabase
    private val values: ContentValues

    companion object{
        private val DATABASE_VERSION=1
        private val DATABASE_NAME="question_Table"
    }

    init {
        db=this.writableDatabase
        values= ContentValues()
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL("CREATE TABLE " + question_table.question.tabla +" (" +
                question_table.question.ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                question_table.question.Name + " TEXT NOT NULL," +
                question_table.question.type + " TEXT NOT NULL,"+
                question_table.question.default + " TEXT NOT NULL,");
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
    fun insert(question: List<question>){
        values.put(question_table.question.ID,question[0].getID())
        values.put(question_table.question.Name,question[0].getName())
        values.put(question_table.question.type,question[0].getType())
        values.put(question_table.question.default,question[0].getDefault())
        db.insert(question_table.question.tabla, null, values)
    }
}