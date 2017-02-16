package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import net.sqlcipher.Cursor;

public class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    private Cursor mCursor;
    private SQLiteDatabase mDatabase;
    private String mEditTable;
    private SQLiteQuery mQuery;
    private String mSql;

    static {
        fixHelper.fixfunc(new int[]{16650, 16651, 16652, 16653, 16654, 16655, 16656});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2);

    public native void cursorClosed();

    public native void cursorDeactivated();

    public native void cursorRequeried(android.database.Cursor cursor);

    public native Cursor query(SQLiteDatabase$CursorFactory sQLiteDatabase$CursorFactory, String[] strArr);

    public native void setBindArguments(String[] strArr);

    public native String toString();
}
