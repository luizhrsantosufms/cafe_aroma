package com.example.cafe_aroma;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "cafe_aroma.db";
    private static final int VERSAO = 1;

    public static final String TABELA_USUARIOS = "usuarios";
    public static final String COL_ID = "id";
    public static final String COL_NOME = "nome";
    public static final String COL_EMAIL = "email";
    public static final String COL_SENHA = "senha";

    public DatabaseHelper(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABELA_USUARIOS + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_NOME + " TEXT NOT NULL, " +
                COL_EMAIL + " TEXT NOT NULL UNIQUE, " +
                COL_SENHA + " TEXT NOT NULL)";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELA_USUARIOS);
        onCreate(db);
    }

    public boolean cadastrarUsuario(String nome, String email, String senha) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(COL_NOME, nome);
        valores.put(COL_EMAIL, email);
        valores.put(COL_SENHA, senha);

        long resultado = db.insert(TABELA_USUARIOS, null, valores);
        db.close();

        return resultado != -1;
    }

    public boolean autenticarUsuario(String email, String senha) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA_USUARIOS,
                new String[]{COL_ID},
                COL_EMAIL + "=? AND " + COL_SENHA + "=?",
                new String[]{email, senha},
                null, null, null
        );

        boolean autenticado = cursor.moveToFirst();
        cursor.close();
        db.close();
        return autenticado;
    }
}
