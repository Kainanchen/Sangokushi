package com.amap.p003a;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.amap.a.z */
public final class DynamicFileDBCreator implements DBCreator {
    private static DynamicFileDBCreator f732a;

    private DynamicFileDBCreator() {
    }

    public static synchronized DynamicFileDBCreator m751b() {
        DynamicFileDBCreator dynamicFileDBCreator;
        synchronized (DynamicFileDBCreator.class) {
            if (f732a == null) {
                f732a = new DynamicFileDBCreator();
            }
            dynamicFileDBCreator = f732a;
        }
        return dynamicFileDBCreator;
    }

    public final String m752a() {
        return "dafile.db";
    }

    public final void m753a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS file (_id integer primary key autoincrement, sname  varchar(20), fname varchar(100),md varchar(20),version varchar(20),dversion varchar(20),status varchar(20),reservedfield varchar(20));");
        } catch (Throwable th) {
            cm.m637a(th, "DynamicFileDBCreator", "onCreate");
        }
    }
}
