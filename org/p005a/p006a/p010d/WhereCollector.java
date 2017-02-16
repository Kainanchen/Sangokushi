package org.p005a.p006a.p010d;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.List;
import org.p005a.p006a.AbstractDao;
import org.p005a.p006a.Property;

/* renamed from: org.a.a.d.h */
public final class WhereCollector<T> {
    final List<WhereCondition> f468a;
    private final AbstractDao<T, ?> f469b;
    private final String f470c;

    static {
        fixHelper.fixfunc(new int[]{22255, 22256, 22257, 22258, 22259, 22260});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    native WhereCollector(AbstractDao<T, ?> abstractDao, String str);

    final native void m517a(StringBuilder stringBuilder, String str, List<Object> list);

    public final native void m518a(StringBuilder stringBuilder, List<Object> list, WhereCondition whereCondition);

    final native void m519a(WhereCondition whereCondition);

    final native void m520a(Property property);

    final native boolean m521a();
}
