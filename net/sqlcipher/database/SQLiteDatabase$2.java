package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

class SQLiteDatabase$2 implements Runnable {
    final /* synthetic */ SQLiteDatabase this$0;
    final /* synthetic */ char[] val$password;

    static {
        fixHelper.fixfunc(new int[]{10038, 10039});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    native SQLiteDatabase$2(SQLiteDatabase sQLiteDatabase, char[] cArr);

    public native void run();
}
