package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class SQLiteFullException extends SQLiteException {
    static {
        fixHelper.fixfunc(new int[]{18706, 18707});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native SQLiteFullException(String str);
}
