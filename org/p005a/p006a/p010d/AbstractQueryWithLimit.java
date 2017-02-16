package org.p005a.p006a.p010d;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import org.p005a.p006a.AbstractDao;

/* renamed from: org.a.a.d.c */
abstract class AbstractQueryWithLimit<T> extends AbstractQuery<T> {
    protected final int f445f;
    protected final int f446g;

    static {
        fixHelper.fixfunc(new int[]{23419, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    protected native AbstractQueryWithLimit(AbstractDao<T, ?> abstractDao, String str, String[] strArr, int i, int i2);
}
