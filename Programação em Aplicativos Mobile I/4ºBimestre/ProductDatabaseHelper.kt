package com.example.appbasickotlin
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper
class ProductDatabaseHelper private constructor(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(
            """
            CREATE TABLE $TABLE_NAME (
                $COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUMN_NAME TEXT NOT NULL,
                $COLUMN_QUANTITY INTEGER NOT NULL,
                $COLUMN_DESCRIPTION TEXT
            )
            """.trimIndent()
        )
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }
    @Synchronized
    fun insertProduct(nome: String, quantidade: Int, descricao: String): Boolean {
        val values = ContentValues().apply {
            put(COLUMN_NAME, nome)
            put(COLUMN_QUANTITY, quantidade)
            put(COLUMN_DESCRIPTION, descricao.takeIf { it.isNotBlank() })
        }
        return tryInsert(values)
    }
    companion object {
        private const val DATABASE_NAME = "produtos.db"
        private const val DATABASE_VERSION = 1
        @Volatile
        private var instance: ProductDatabaseHelper? = null
        fun getInstance(context: Context): ProductDatabaseHelper =
            instance ?: synchronized(this) {
                instance ?: ProductDatabaseHelper(context.applicationContext).also {
                    instance = it
                }
            }
        const val TABLE_NAME = "produtos"
        const val COLUMN_ID = "id"
        const val COLUMN_NAME = "nome"
        const val COLUMN_QUANTITY = "quantidade"
        const val COLUMN_DESCRIPTION = "descricao"
    }
    private fun tryInsert(values: ContentValues, retryOnClosedDb: Boolean = true): Boolean {
        return try {
            val result = writableDatabase.insert(TABLE_NAME, null, values)
            result != -1L
        } catch (exception: IllegalStateException) {
            if (retryOnClosedDb && exception.message?.contains("closed", ignoreCase = true) == true) {
                close()
                tryInsert(values, retryOnClosedDb = false)
            } else {
                false
            }
        } catch (exception: SQLiteException) {
            false
        }
    }
}