package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

class SQLiteDatabase$SyncUpdateInfo {
    String deletedTable;
    String foreignKey;
    String masterTable;

    static {
        fixHelper.fixfunc(new int[]{23979, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    native SQLiteDatabase$SyncUpdateInfo(String str, String str2, String str3);
}
