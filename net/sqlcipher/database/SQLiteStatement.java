package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class SQLiteStatement extends SQLiteProgram {
    static {
        fixHelper.fixfunc(new int[]{31979, 31980, 31981, 31982, 31983, 31984});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    native SQLiteStatement(SQLiteDatabase sQLiteDatabase, String str);

    private final native long native_1x1_long();

    private final native String native_1x1_string();

    private final native void native_execute();

    public native void execute();

    public native long executeInsert();

    public native int executeUpdateDelete();

    public native long simpleQueryForLong();

    public native String simpleQueryForString();
}
