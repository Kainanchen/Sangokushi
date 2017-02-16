package net.sqlcipher.database;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public abstract class SQLiteProgram extends SQLiteClosable {
    private static final String TAG = "SQLiteProgram";
    private SQLiteCompiledSql mCompiledSql;
    @Deprecated
    protected SQLiteDatabase mDatabase;
    final String mSql;
    @Deprecated
    protected int nHandle;
    @Deprecated
    protected int nStatement;

    static {
        fixHelper.fixfunc(new int[]{2923, 2924, 2925, 2926, 2927, 2928, 2929, 2930, 2931, 2932, 2933, 2934, 2935, 2936});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    native SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str);

    private final native void native_clear_bindings();

    private native void releaseCompiledSqlIfNotInCache();

    public native void bindBlob(int i, byte[] bArr);

    public native void bindDouble(int i, double d);

    public native void bindLong(int i, long j);

    public native void bindNull(int i);

    public native void bindString(int i, String str);

    public native void clearBindings();

    public native void close();

    @Deprecated
    protected native void compile(String str, boolean z);

    native String getSqlString();

    public final native int getUniqueId();

    protected final native void native_bind_blob(int i, byte[] bArr);

    protected final native void native_bind_double(int i, double d);

    protected final native void native_bind_long(int i, long j);

    protected final native void native_bind_null(int i);

    protected final native void native_bind_string(int i, String str);

    @Deprecated
    protected final native void native_compile(String str);

    @Deprecated
    protected final native void native_finalize();

    protected native void onAllReferencesReleased();

    protected native void onAllReferencesReleasedFromContainer();
}
