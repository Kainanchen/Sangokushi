package org.p005a.p006a.p010d;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.List;
import org.p005a.p006a.AbstractDao;
import org.p005a.p006a.Property;

/* renamed from: org.a.a.d.g */
public final class QueryBuilder<T> {
    public static boolean f457a;
    public final WhereCollector<T> f458b;
    private StringBuilder f459c;
    private final List<Object> f460d;
    private final List<Join<T, ?>> f461e;
    private final AbstractDao<T, ?> f462f;
    private final String f463g;
    private Integer f464h;
    private Integer f465i;
    private boolean f466j;
    private String f467k;

    static {
        fixHelper.fixfunc(new int[]{22646, 22647, 22648, 22649, 22650, 22651, 22652, 22653, 22654, 22655, 22656});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native QueryBuilder(AbstractDao<T, ?> abstractDao);

    private native QueryBuilder(AbstractDao<T, ?> abstractDao, String str);

    private native void m508a(String str, Property... propertyArr);

    private native void m509a(StringBuilder stringBuilder, String str);

    private native void m510c();

    public final native Query<T> m511a();

    public final native QueryBuilder<T> m512a(int i);

    public final native QueryBuilder<T> m513a(WhereCondition whereCondition, WhereCondition... whereConditionArr);

    public final native QueryBuilder<T> m514a(Property... propertyArr);

    public final native long m515b();

    public final native QueryBuilder<T> m516b(Property... propertyArr);

    public static <T2> QueryBuilder<T2> m507a(AbstractDao<T2, ?> abstractDao) {
        return new QueryBuilder(abstractDao);
    }
}
