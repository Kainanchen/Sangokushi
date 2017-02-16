package org.p005a.p006a;

import a.does.not.Exists0;
import android.database.Cursor;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.List;

/* renamed from: org.a.a.e */
public final class InternalQueryDaoAccess<T> {
    private final AbstractDao<T, ?> f477a;

    static {
        fixHelper.fixfunc(new int[]{31546, 31547, 31548});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native InternalQueryDaoAccess(AbstractDao<T, ?> abstractDao);

    public final native List<T> m527a(Cursor cursor);

    public final native T m528b(Cursor cursor);
}
