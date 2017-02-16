package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import net.sqlcipher.CursorWindow;

public class SQLiteQuery extends SQLiteProgram {
    private static final String TAG = "Cursor";
    private String[] mBindArgs;
    private boolean mClosed;
    private int mOffsetIndex;

    static {
        fixHelper.fixfunc(new int[]{20787, 20788, 20789, 20790, 20791, 20792, 20793, 20794, 20795, 20796, 20797});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    native SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i, String[] strArr);

    private final native int native_column_count();

    private final native String native_column_name(int i);

    private final native int native_fill_window(CursorWindow cursorWindow, int i, int i2, int i3, int i4);

    public native void bindDouble(int i, double d);

    public native void bindLong(int i, long j);

    public native void bindNull(int i);

    public native void bindString(int i, String str);

    public native void close();

    native int columnCountLocked();

    native String columnNameLocked(int i);

    native int fillWindow(CursorWindow cursorWindow, int i, int i2);

    native void requery();

    public native String toString();
}
