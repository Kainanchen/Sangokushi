package org.p005a.p006a.p010d;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import org.p005a.p006a.AbstractDao;

/* renamed from: org.a.a.d.d */
public final class CountQuery<T> extends AbstractQuery<T> {
    private final CountQuery<T> f447f;

    /* renamed from: org.a.a.d.d.a */
    private static final class CountQuery<T2> extends AbstractQueryData<T2, CountQuery<T2>> {
        static {
            fixHelper.fixfunc(new int[]{32984, 32985, 32986});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CountQuery(AbstractDao<T2, ?> abstractDao, String str, String[] strArr);

        native /* synthetic */ CountQuery(AbstractDao abstractDao, String str, String[] strArr, byte b);

        protected final native /* synthetic */ AbstractQuery m500b();
    }

    static {
        fixHelper.fixfunc(new int[]{23159, 23160, 23161});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native CountQuery(CountQuery<T> countQuery, AbstractDao<T, ?> abstractDao, String str, String[] strArr);

    native /* synthetic */ CountQuery(CountQuery countQuery, AbstractDao abstractDao, String str, String[] strArr, byte b);

    public final native long m502b();

    static <T2> CountQuery<T2> m501a(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr) {
        return (CountQuery) new CountQuery(abstractDao, str, AbstractQuery.m496a(objArr), (byte) 0).m498a();
    }
}
