package com.amap.p003a;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.Map;

/* compiled from: LogUpdateRequest */
/* renamed from: com.amap.a.co */
public final class co extends am {
    private byte[] f660a;
    private String f661b;

    static {
        fixHelper.fixfunc(new int[]{916, 917, 918, 919, 920, 921});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native co(byte[] bArr);

    public native co(byte[] bArr, String str);

    public final native Map<String, String> m650a();

    public final native Map<String, String> m651b();

    public final native String m652c();

    public final native byte[] m653e();
}
