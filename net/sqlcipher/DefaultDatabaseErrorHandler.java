package net.sqlcipher;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import net.sqlcipher.database.SQLiteDatabase;

public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private static final String TAG = "DefaultDatabaseErrorHandler";

    static {
        fixHelper.fixfunc(new int[]{24622, 24623, 24624});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native void deleteDatabaseFile(String str);

    public final native void onCorruption(SQLiteDatabase sQLiteDatabase);
}
