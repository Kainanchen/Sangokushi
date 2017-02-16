package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class SQLiteAbortException extends SQLiteException {
    static {
        fixHelper.fixfunc(new int[]{22193, 22194});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteAbortException(String str);
}
