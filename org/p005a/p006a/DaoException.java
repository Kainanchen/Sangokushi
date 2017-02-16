package org.p005a.p006a;

import a.does.not.Exists0;
import android.database.SQLException;
import android.os.Build.VERSION;
import com.ali.fixHelper;

/* renamed from: org.a.a.d */
public final class DaoException extends SQLException {
    static {
        fixHelper.fixfunc(new int[]{31883, 31884, 31885});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native DaoException(String str);

    public native DaoException(String str, Throwable th);
}
