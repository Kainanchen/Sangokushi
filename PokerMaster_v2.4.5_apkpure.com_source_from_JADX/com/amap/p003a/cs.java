package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.List;

/* compiled from: ExceptionLogProcessor */
/* renamed from: com.amap.a.cs */
public final class cs extends LogProcessor {
    private static boolean f675c;

    static {
        fixHelper.fixfunc(new int[]{1540, 1541, 1542});
        cs.__clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    protected native cs(int i);

    static void __clinit__() {
        f675c = true;
    }

    protected final native String m670a(List<cj> list);

    protected final native boolean m671c(Context context);
}
