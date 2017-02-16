package org.p005a.p006a.p009c;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;

/* renamed from: org.a.a.c.c */
public final class LongHashMap<T> {
    public LongHashMap<T>[] f421a;
    public int f422b;
    public int f423c;
    private int f424d;

    /* renamed from: org.a.a.c.c.a */
    static final class LongHashMap<T> {
        public final long f418a;
        public T f419b;
        public LongHashMap<T> f420c;

        static {
            fixHelper.fixfunc(new int[]{19571, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native LongHashMap(long j, T t, LongHashMap<T> longHashMap);
    }

    static {
        fixHelper.fixfunc(new int[]{31892, 31893, 31894, 31895, 31896});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native LongHashMap(byte b);

    public final native T m479a(long j);

    public final native T m480a(long j, T t);

    public final native void m481a(int i);
}
