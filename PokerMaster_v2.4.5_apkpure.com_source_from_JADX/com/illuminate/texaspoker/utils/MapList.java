package com.illuminate.texaspoker.utils;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.List;
import java.util.Map;

/* renamed from: com.illuminate.texaspoker.utils.e */
public final class MapList<K, V> {
    public List<K> f6665a;
    public Map<K, V> f6666b;

    static {
        fixHelper.fixfunc(new int[]{1205, 1206, 1207, 1208, 1209, 1210, 1211, 1212, 1213});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public final native int m4238a();

    public final native V m4239a(int i);

    public final native V m4240a(Object obj);

    public final native void m4241a(K k, V v);

    public final native int m4242b(Object obj);

    public final native void m4243b();

    public final native void m4244b(K k, V v);

    public final native void m4245c(Object obj);
}
