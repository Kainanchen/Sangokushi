package net.sqlcipher.database;

import a.does.not.Exists0;
import android.content.Context;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import net.sqlcipher.DatabaseErrorHandler;

public abstract class SQLiteOpenHelper {
    private static final String TAG = null;
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase$CursorFactory mFactory;
    private final SQLiteDatabaseHook mHook;
    private boolean mIsInitializing;
    private final String mName;
    private final int mNewVersion;

    static {
        fixHelper.fixfunc(new int[]{13412, 13413, 13414, 13415, 13416, 13417, 13418, 13419, 13420});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteOpenHelper(Context context, String str, SQLiteDatabase$CursorFactory sQLiteDatabase$CursorFactory, int i);

    public native SQLiteOpenHelper(Context context, String str, SQLiteDatabase$CursorFactory sQLiteDatabase$CursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook);

    public native SQLiteOpenHelper(Context context, String str, SQLiteDatabase$CursorFactory sQLiteDatabase$CursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler);

    public native synchronized void close();

    public native synchronized SQLiteDatabase getReadableDatabase(String str);

    public native synchronized SQLiteDatabase getReadableDatabase(char[] cArr);

    public native synchronized SQLiteDatabase getWritableDatabase(String str);

    public native synchronized SQLiteDatabase getWritableDatabase(char[] cArr);

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public native void onOpen(SQLiteDatabase sQLiteDatabase);

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    static void __clinit__() {
        TAG = SQLiteOpenHelper.class.getSimpleName();
    }
}
