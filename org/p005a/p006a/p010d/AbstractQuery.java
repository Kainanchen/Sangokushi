package org.p005a.p006a.p010d;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import org.p005a.p006a.AbstractDao;
import org.p005a.p006a.InternalQueryDaoAccess;

/* renamed from: org.a.a.d.a */
abstract class AbstractQuery<T> {
    protected final AbstractDao<T, ?> f436a;
    protected final InternalQueryDaoAccess<T> f437b;
    protected final String f438c;
    protected final String[] f439d;
    protected final Thread f440e;

    static {
        fixHelper.fixfunc(new int[]{19929, 19930});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    protected native AbstractQuery(AbstractDao<T, ?> abstractDao, String str, String[] strArr);

    protected final native void m497a();

    protected static String[] m496a(Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                strArr[i] = obj.toString();
            } else {
                strArr[i] = null;
            }
        }
        return strArr;
    }
}
