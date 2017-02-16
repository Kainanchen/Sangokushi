package com.amap.p003a;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: SdCardDBCreator */
/* renamed from: com.amap.a.bi */
public class bi implements DBCreator {
    public final String m360a() {
        return "als.db";
    }

    public final void m361a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS a (_id integer primary key autoincrement, a2 varchar(100), a3 LONG );");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS b (_id integer primary key autoincrement, b1 integer );");
        } catch (Throwable th) {
            bc.m330a(th, "SdCardDBCreator", "onCreate");
        }
    }
}
