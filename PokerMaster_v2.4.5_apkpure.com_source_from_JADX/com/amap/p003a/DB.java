package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.io.File;

/* renamed from: com.amap.a.i */
public final class DB extends SQLiteOpenHelper {
    private DBCreator f686a;

    /* renamed from: com.amap.a.i.a */
    public static class DB extends ContextWrapper {
        private String f684a;
        private Context f685b;

        static {
            fixHelper.fixfunc(new int[]{2829, 2830, 2831, 2832});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native DB(Context context, String str);

        public final native File getDatabasePath(String str);

        public final native SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory);

        public final native SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler);
    }

    public DB(Context context, String str, DBCreator dBCreator) {
        super(context, str, null, 1);
        this.f686a = dBCreator;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f686a.m359a(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
