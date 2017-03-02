package com.igexin.download;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.igexin.download.b */
final class C0261b extends SQLiteOpenHelper {
    final /* synthetic */ DownloadProvider f708a;

    public C0261b(DownloadProvider downloadProvider, Context context) {
        this.f708a = downloadProvider;
        super(context, DownloadProvider.f680a, null, 101);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f708a.m884a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != 31 || i2 != 100) {
            this.f708a.m887b(sQLiteDatabase);
            this.f708a.m884a(sQLiteDatabase);
        }
    }
}
