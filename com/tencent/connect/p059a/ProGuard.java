package com.tencent.connect.p059a;

import android.content.Context;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.utils.OpenConfig;
import java.lang.reflect.Method;

/* renamed from: com.tencent.connect.a.a */
public class ProGuard {
    private static Class<?> f1461a;
    private static Class<?> f1462b;
    private static Method f1463c;
    private static Method f1464d;
    private static Method f1465e;
    private static Method f1466f;
    private static boolean f1467g;

    static {
        f1461a = null;
        f1462b = null;
        f1463c = null;
        f1464d = null;
        f1465e = null;
        f1466f = null;
        f1467g = false;
    }

    public static boolean m1935a(Context context, QQToken qQToken) {
        return OpenConfig.getInstance(context, qQToken.getAppId()).getBoolean("Common_ta_enable");
    }

    public static void m1936b(Context context, QQToken qQToken) {
        try {
            if (ProGuard.m1935a(context, qQToken)) {
                f1466f.invoke(f1461a, new Object[]{Boolean.valueOf(true)});
                return;
            }
            f1466f.invoke(f1461a, new Object[]{Boolean.valueOf(false)});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void m1937c(Context context, QQToken qQToken) {
        String str = "Aqc" + qQToken.getAppId();
        try {
            f1461a = Class.forName("com.tencent.stat.StatConfig");
            f1462b = Class.forName("com.tencent.stat.StatService");
            f1463c = f1462b.getMethod("reportQQ", new Class[]{Context.class, String.class});
            f1464d = f1462b.getMethod("trackCustomEvent", new Class[]{Context.class, String.class, String[].class});
            f1465e = f1462b.getMethod("commitEvents", new Class[]{Context.class, Integer.TYPE});
            f1466f = f1461a.getMethod("setEnableStatService", new Class[]{Boolean.TYPE});
            ProGuard.m1936b(context, qQToken);
            f1461a.getMethod("setAutoExceptionCaught", new Class[]{Boolean.TYPE}).invoke(f1461a, new Object[]{Boolean.valueOf(false)});
            f1461a.getMethod("setEnableSmartReporting", new Class[]{Boolean.TYPE}).invoke(f1461a, new Object[]{Boolean.valueOf(true)});
            f1461a.getMethod("setSendPeriodMinutes", new Class[]{Integer.TYPE}).invoke(f1461a, new Object[]{Integer.valueOf(1440)});
            Class cls = Class.forName("com.tencent.stat.StatReportStrategy");
            f1461a.getMethod("setStatSendStrategy", new Class[]{cls}).invoke(f1461a, new Object[]{cls.getField("PERIOD").get(null)});
            f1462b.getMethod("startStatService", new Class[]{Context.class, String.class, String.class}).invoke(f1462b, new Object[]{context, str, Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null)});
            f1467g = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void m1938d(Context context, QQToken qQToken) {
        if (f1467g) {
            ProGuard.m1936b(context, qQToken);
            if (qQToken.getOpenId() != null) {
                try {
                    f1463c.invoke(f1462b, new Object[]{context, qQToken.getOpenId()});
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void m1934a(Context context, QQToken qQToken, String str, String... strArr) {
        if (f1467g) {
            ProGuard.m1936b(context, qQToken);
            try {
                f1464d.invoke(f1462b, new Object[]{context, str, strArr});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
