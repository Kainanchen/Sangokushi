package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class SQLiteDoneException extends SQLiteException {
    static {
        fixHelper.fixfunc(new int[]{22740, 22741});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteDoneException(String str);
}
