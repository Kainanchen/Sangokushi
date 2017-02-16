package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import net.sqlcipher.SQLException;

public class SQLiteException extends SQLException {
    static {
        fixHelper.fixfunc(new int[]{4969, 4970});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteException(String str);
}
