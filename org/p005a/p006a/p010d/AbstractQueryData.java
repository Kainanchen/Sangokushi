package org.p005a.p006a.p010d;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.p005a.p006a.AbstractDao;

/* renamed from: org.a.a.d.b */
abstract class AbstractQueryData<T, Q extends AbstractQuery<T>> {
    final String f441a;
    final AbstractDao<T, ?> f442b;
    final String[] f443c;
    final Map<Long, WeakReference<Q>> f444d;

    static {
        fixHelper.fixfunc(new int[]{23702, 23703});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    native AbstractQueryData(AbstractDao<T, ?> abstractDao, String str, String[] strArr);

    final native Q m498a();

    protected abstract Q m499b();
}
