package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class SQLiteConstraintException extends SQLiteException {
    static {
        fixHelper.fixfunc(new int[]{33188, 33189});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteConstraintException(String str);
}
