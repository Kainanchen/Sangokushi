package org.p005a.p006a.p007a;

import a.does.not.Exists0;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: org.a.a.a.b */
public abstract class DatabaseOpenHelper extends SQLiteOpenHelper {
    private final Context f378a;
    private final String f379b;
    private final int f380c;
    private DatabaseOpenHelper f381d;
    private boolean f382e;

    /* renamed from: org.a.a.a.b.a */
    private class DatabaseOpenHelper extends net.sqlcipher.database.SQLiteOpenHelper {
        final /* synthetic */ DatabaseOpenHelper f377a;

        static {
            fixHelper.fixfunc(new int[]{10407, 10408, 10409, 10410});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native DatabaseOpenHelper(DatabaseOpenHelper databaseOpenHelper, Context context, String str, int i, boolean z);

        public final native void onCreate(SQLiteDatabase sQLiteDatabase);

        public final native void onOpen(SQLiteDatabase sQLiteDatabase);

        public final native void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

        protected static Database m375a(SQLiteDatabase sQLiteDatabase) {
            return new EncryptedDatabase(sQLiteDatabase);
        }
    }

    static {
        fixHelper.fixfunc(new int[]{16604, 16605, 16606, 16607, 16608, 16609, 16610});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native DatabaseOpenHelper(Context context, String str);

    public final native Database m377a(String str);

    public native void m378a(Database database);

    public native void m379a(Database database, int i, int i2);

    public native void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase);

    public native void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase);

    public native void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2);

    private static Database m376a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return new StandardDatabase(sQLiteDatabase);
    }
}
