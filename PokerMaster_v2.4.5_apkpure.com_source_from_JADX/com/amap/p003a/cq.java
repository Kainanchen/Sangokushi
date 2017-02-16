package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.List;

/* compiled from: AnrLogProcessor */
/* renamed from: com.amap.a.cq */
public final class cq extends LogProcessor {
    private static boolean f669c;
    private String[] f670d;
    private int f671e;
    private boolean f672f;
    private int f673g;

    static {
        fixHelper.fixfunc(new int[]{1066, 1067, 1068, 1069});
        cq.__clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    protected native cq(int i);

    static void __clinit__() {
        f669c = true;
    }

    private native String m664b();

    protected final native String m665a(List<cj> list);

    protected final native boolean m666c(Context context);
}
