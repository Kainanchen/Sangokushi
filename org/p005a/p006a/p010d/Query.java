package org.p005a.p006a.p010d;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.List;
import org.p005a.p006a.AbstractDao;

/* renamed from: org.a.a.d.f */
public final class Query<T> extends AbstractQueryWithLimit<T> {
    private final Query<T> f456h;

    /* renamed from: org.a.a.d.f.a */
    private static final class Query<T2> extends AbstractQueryData<T2, Query<T2>> {
        private final int f454e;
        private final int f455f;

        static {
            fixHelper.fixfunc(new int[]{15145, 15146});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native Query(AbstractDao<T2, ?> abstractDao, String str, String[] strArr, int i, int i2);

        protected final native /* synthetic */ AbstractQuery m503b();
    }

    static {
        fixHelper.fixfunc(new int[]{22877, 22878, 22879, 22880});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native Query(Query<T> query, AbstractDao<T, ?> abstractDao, String str, String[] strArr, int i, int i2);

    native /* synthetic */ Query(Query query, AbstractDao abstractDao, String str, String[] strArr, int i, int i2, byte b);

    public final native List<T> m505b();

    public final native T m506c();

    static <T2> Query<T2> m504a(AbstractDao<T2, ?> abstractDao, String str, Object[] objArr, int i, int i2) {
        return (Query) new Query(abstractDao, str, AbstractQuery.m496a(objArr), i, i2).m498a();
    }
}
