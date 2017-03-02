package com.tencent.wxop.stat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.connect.common.Constants;
import com.tencent.wxop.stat.common.C0645q;
import java.util.ArrayList;
import java.util.List;

class bc extends SQLiteOpenHelper {
    private String f1984a;
    private Context f1985b;

    public bc(Context context, String str) {
        super(context, str, null, 3);
        this.f1984a = Constants.STR_EMPTY;
        this.f1985b = null;
        this.f1984a = str;
        this.f1985b = context.getApplicationContext();
        if (StatConfig.isDebugEnable()) {
            au.f1947h.m2361i("SQLiteOpenHelper " + this.f1984a);
        }
    }

    private void m2355a(SQLiteDatabase sQLiteDatabase) {
        Throwable th;
        String str = null;
        Cursor query;
        try {
            query = sQLiteDatabase.query("user", null, null, null, null, null, null);
            try {
                ContentValues contentValues = new ContentValues();
                if (query.moveToNext()) {
                    str = query.getString(0);
                    query.getInt(1);
                    query.getString(2);
                    query.getLong(3);
                    contentValues.put("uid", C0645q.m2452b(str));
                }
                if (str != null) {
                    sQLiteDatabase.update("user", contentValues, "uid=?", new String[]{str});
                }
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    au.f1947h.m2360e(th);
                    if (query != null) {
                        query.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    private void m2356b(SQLiteDatabase sQLiteDatabase) {
        Throwable th;
        Cursor cursor;
        Cursor query;
        try {
            query = sQLiteDatabase.query("events", null, null, null, null, null, null);
            try {
                List<bd> arrayList = new ArrayList();
                while (query.moveToNext()) {
                    arrayList.add(new bd(query.getLong(0), query.getString(1), query.getInt(2), query.getInt(3)));
                }
                ContentValues contentValues = new ContentValues();
                for (bd bdVar : arrayList) {
                    contentValues.put("content", C0645q.m2452b(bdVar.f1987b));
                    sQLiteDatabase.update("events", contentValues, "event_id=?", new String[]{Long.toString(bdVar.f1986a)});
                }
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public synchronized void close() {
        super.close();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists events(event_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, content TEXT, status INTEGER, send_count INTEGER, timestamp LONG)");
        sQLiteDatabase.execSQL("create table if not exists user(uid TEXT PRIMARY KEY, user_type INTEGER, app_ver TEXT, ts INTEGER)");
        sQLiteDatabase.execSQL("create table if not exists config(type INTEGER PRIMARY KEY NOT NULL, content TEXT, md5sum TEXT, version INTEGER)");
        sQLiteDatabase.execSQL("create table if not exists keyvalues(key TEXT PRIMARY KEY NOT NULL, value TEXT)");
        sQLiteDatabase.execSQL("CREATE INDEX if not exists status_idx ON events(status)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        au.f1947h.debug("upgrade DB from oldVersion " + i + " to newVersion " + i2);
        if (i == 1) {
            sQLiteDatabase.execSQL("create table if not exists keyvalues(key TEXT PRIMARY KEY NOT NULL, value TEXT)");
            m2355a(sQLiteDatabase);
            m2356b(sQLiteDatabase);
        }
        if (i == 2) {
            m2355a(sQLiteDatabase);
            m2356b(sQLiteDatabase);
        }
    }
}
