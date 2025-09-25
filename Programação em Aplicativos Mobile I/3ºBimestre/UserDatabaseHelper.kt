package com.example.snackparadiseapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class UserDatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, "users.db", null, 2) { // mudou p/ versão 2

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(
            "CREATE TABLE users (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "username TEXT UNIQUE, " +
                    "email TEXT UNIQUE, " +
                    "password TEXT)"
        )
        db.execSQL(
            "CREATE TABLE itens (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nome TEXT, " +
                    "qntd INTEGER, " +
                    "descr TEXT)"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS users")
        db.execSQL("DROP TABLE IF EXISTS itens")
        onCreate(db)
    }

    fun insertUser(username: String, email: String, password: String): Boolean {
        val db = writableDatabase
        val values = ContentValues().apply {
            put("username", username)
            put("email", email)
            put("password", password)
        }
        return try {
            db.insertOrThrow("users", null, values) != -1L
        } catch (e: Exception) {
            false
        }
    }

    fun insertItens(nome: String, qntd: Int, descr: String): Boolean {
        val db = writableDatabase
        val values = ContentValues().apply {
            put("nome", nome)
            put("qntd", qntd)
            put("descr", descr)
        }
        return db.insert("itens", null, values) != -1L
    }
}
