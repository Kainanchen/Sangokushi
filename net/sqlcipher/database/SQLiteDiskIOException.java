package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class SQLiteDiskIOException extends SQLiteException {
    static {
        fixHelper.fixfunc(new int[]{8032, 8033});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteDiskIOException(String str);
}
