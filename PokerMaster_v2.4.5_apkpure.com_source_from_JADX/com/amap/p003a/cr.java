package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.List;

/* compiled from: CrashLogProcessor */
/* renamed from: com.amap.a.cr */
public final class cr extends LogProcessor {
    private static boolean f674c;

    static {
        fixHelper.fixfunc(new int[]{956, 957, 958, 959});
        cr.__clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    protected native cr(int i);

    static void __clinit__() {
        f674c = true;
    }

    protected final native String m667a(String str);

    protected final native String m668a(List<cj> list);

    protected final native boolean m669c(Context context);
}
