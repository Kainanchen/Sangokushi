package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

class SQLiteCompiledSql {
    private static final String TAG = "SQLiteCompiledSql";
    SQLiteDatabase mDatabase;
    private boolean mInUse;
    private String mSqlStmt;
    private Throwable mStackTrace;
    int nHandle;
    int nStatement;

    static {
        fixHelper.fixfunc(new int[]{30100, 30101, 30102, 30103, 30104, 30105});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    native SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str);

    private native void compile(String str, boolean z);

    private final native void native_compile(String str);

    private final native void native_finalize();

    native synchronized boolean acquire();

    protected native void finalize();

    native synchronized void release();

    native void releaseSqlStatement();
}
