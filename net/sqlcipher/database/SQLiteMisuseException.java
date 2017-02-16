package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class SQLiteMisuseException extends SQLiteException {
    static {
        fixHelper.fixfunc(new int[]{7888, 7889});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteMisuseException(String str);
}
