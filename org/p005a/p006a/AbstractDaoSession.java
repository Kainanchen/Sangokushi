package org.p005a.p006a;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.Map;
import org.p005a.p006a.p007a.Database;

/* renamed from: org.a.a.c */
public class AbstractDaoSession {
    private final Database f434a;
    private final Map<Class<?>, AbstractDao<?, ?>> f435b;

    static {
        fixHelper.fixfunc(new int[]{31903, 31904, 31905});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native AbstractDaoSession(Database database);

    public final native <T> void m494a(Class<T> cls, AbstractDao<T, ?> abstractDao);

    public final native void m495a(Runnable runnable);
}
