package org.p005a.p006a;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import org.p005a.p006a.p010d.WhereCondition;

/* renamed from: org.a.a.f */
public final class Property {
    public final int f478a;
    public final Class<?> f479b;
    public final String f480c;
    public final boolean f481d;
    public final String f482e;

    static {
        fixHelper.fixfunc(new int[]{31464, 31465, 31466, 31467, 31468, 31469});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Property(int i, Class<?> cls, String str, boolean z, String str2);

    public final native WhereCondition m529a(Object obj);

    public final native WhereCondition m530b(Object obj);

    public final native WhereCondition m531c(Object obj);

    public final native WhereCondition m532d(Object obj);

    public final native WhereCondition m533e(Object obj);
}
