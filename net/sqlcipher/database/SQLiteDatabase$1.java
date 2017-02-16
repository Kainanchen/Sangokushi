package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

class SQLiteDatabase$1 implements Runnable {
    final /* synthetic */ SQLiteDatabase this$0;
    final /* synthetic */ byte[] val$keyMaterial;

    static {
        fixHelper.fixfunc(new int[]{9689, 9690});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    native SQLiteDatabase$1(SQLiteDatabase sQLiteDatabase, byte[] bArr);

    public native void run();
}
