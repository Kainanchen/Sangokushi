package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class DatabaseObjectNotClosedException extends RuntimeException {
    private static final String f376s = "Application did not close the cursor or database object that was opened here";

    static {
        fixHelper.fixfunc(new int[]{31541, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }
}
