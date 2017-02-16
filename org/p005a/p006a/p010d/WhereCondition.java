package org.p005a.p006a.p010d;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.List;
import org.p005a.p006a.Property;

/* renamed from: org.a.a.d.i */
public interface WhereCondition {

    /* renamed from: org.a.a.d.i.a */
    public static abstract class WhereCondition implements WhereCondition {
        protected final boolean f471a;
        protected final Object f472b;
        protected final Object[] f473c;

        static {
            fixHelper.fixfunc(new int[]{22657, 22658, 22659});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native WhereCondition(Object obj);

        public native WhereCondition(Object[] objArr);

        public final native void m524a(List<Object> list);
    }

    /* renamed from: org.a.a.d.i.b */
    public static class WhereCondition extends WhereCondition {
        public final Property f474d;
        public final String f475e;

        static {
            fixHelper.fixfunc(new int[]{22881, 22882});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native WhereCondition(Property property, String str, Object obj);

        public final native void m525a(StringBuilder stringBuilder, String str);
    }

    /* renamed from: org.a.a.d.i.c */
    public static class WhereCondition extends WhereCondition {
        protected final String f476d;

        static {
            fixHelper.fixfunc(new int[]{21965, 21966});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native WhereCondition(String str, Object... objArr);

        public final native void m526a(StringBuilder stringBuilder, String str);
    }

    void m522a(StringBuilder stringBuilder, String str);

    void m523a(List<Object> list);
}
