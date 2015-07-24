package com.nuc.xml.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {

	public DBOpenHelper(Context context) {
		super(context, "person.db", null, 2);
	}

	/**
	 * ���ݿ��һ�δ�����ʱ��ᱻ����
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "CREATE TABLE person(id integer primary key autoincrement,name varchar(20),gender varchar(10),address varchar(10))";
		db.execSQL(sql);
	}

	/**
	 * ���ݿ�汾��������ʱ�����ã�������������ʹ��
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		String sql = "ALTER TABLE person ADD email VARCHAR(20) NULL";
		db.execSQL(sql);
	}

}