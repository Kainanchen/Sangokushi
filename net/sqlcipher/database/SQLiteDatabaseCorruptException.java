package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class SQLiteDatabaseCorruptException extends SQLiteException {
    static {
        fixHelper.fixfunc(new int[]{13707, 13708});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteDatabaseCorruptException(String str);
}
