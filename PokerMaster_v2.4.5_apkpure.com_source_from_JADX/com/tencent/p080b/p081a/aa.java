package com.tencent.p080b.p081a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.p080b.p081a.p083b.C1055r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.b.a.aa */
final class aa extends SQLiteOpenHelper {
    private String f7988a;
    private Context f7989b;

    public aa(Context context, String str) {
        super(context, str, null, 3);
        this.f7988a = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7989b = null;
        this.f7988a = str;
        this.f7989b = context.getApplicationContext();
        if (C1058c.m5762b()) {
            C1073r.f8214d.m5662a("SQLiteOpenHelper " + this.f7988a);
        }
    }

    private static void m5647a(SQLiteDatabase sQLiteDatabase) {
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
                    contentValues.put(ParamKey.UID, C1055r.m5740b(str));
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
                    C1073r.f8214d.m5665b(th);
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

    private static void m5648b(SQLiteDatabase sQLiteDatabase) {
        Throwable th;
        Cursor cursor;
        Cursor query;
        try {
            query = sQLiteDatabase.query("events", null, null, null, null, null, null);
            try {
                List<ab> arrayList = new ArrayList();
                while (query.moveToNext()) {
                    arrayList.add(new ab(query.getLong(0), query.getString(1), query.getInt(2), query.getInt(3)));
                }
                ContentValues contentValues = new ContentValues();
                for (ab abVar : arrayList) {
                    contentValues.put(MessageKey.MSG_CONTENT, C1055r.m5740b(abVar.f7991b));
                    sQLiteDatabase.update("events", contentValues, "event_id=?", new String[]{Long.toString(abVar.f7990a)});
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

    public final synchronized void close() {
        super.close();
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists events(event_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, content TEXT, status INTEGER, send_count INTEGER, timestamp LONG)");
        sQLiteDatabase.execSQL("create table if not exists user(uid TEXT PRIMARY KEY, user_type INTEGER, app_ver TEXT, ts INTEGER)");
        sQLiteDatabase.execSQL("create table if not exists config(type INTEGER PRIMARY KEY NOT NULL, content TEXT, md5sum TEXT, version INTEGER)");
        sQLiteDatabase.execSQL("create table if not exists keyvalues(key TEXT PRIMARY KEY NOT NULL, value TEXT)");
        sQLiteDatabase.execSQL("CREATE INDEX if not exists status_idx ON events(status)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C1073r.f8214d.m5669f("upgrade DB from oldVersion " + i + " to newVersion " + i2);
        if (i == 1) {
            sQLiteDatabase.execSQL("create table if not exists keyvalues(key TEXT PRIMARY KEY NOT NULL, value TEXT)");
            aa.m5647a(sQLiteDatabase);
            aa.m5648b(sQLiteDatabase);
        }
        if (i == 2) {
            aa.m5647a(sQLiteDatabase);
            aa.m5648b(sQLiteDatabase);
        }
    }
}
