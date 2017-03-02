package com.alipay.apmobilesecuritysdk.p009f;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.p011b.p012a.p013a.p014a.p015a.C0108b;
import com.alipay.p011b.p012a.p013a.p014a.p015a.C0109c;
import com.alipay.p011b.p012a.p013a.p020d.C0127c;
import com.tencent.connect.common.Constants;
import java.util.UUID;

/* renamed from: com.alipay.apmobilesecuritysdk.f.h */
public final class C0101h {
    private static String f123a;

    static {
        f123a = Constants.STR_EMPTY;
    }

    public static String m189a(Context context) {
        try {
            String a = C0127c.m343a(context, "vkeyid_settings", "last_apdid_env", Constants.STR_EMPTY);
            if (C0110a.m234a(a)) {
                return Constants.STR_EMPTY;
            }
            a = C0109c.m229b(C0109c.m226a(), a);
            return C0110a.m234a(a) ? Constants.STR_EMPTY : a;
        } catch (Throwable th) {
            return Constants.STR_EMPTY;
        }
    }

    public static void m190a(Context context, String str) {
        try {
            Editor edit = context.getSharedPreferences("vkeyid_settings", 0).edit();
            if (edit != null) {
                edit.putString("last_apdid_env", C0109c.m227a(C0109c.m226a(), str));
                edit.commit();
            }
        } catch (Throwable th) {
        }
    }

    public static void m191a(Context context, String str, long j) {
        try {
            Editor edit = context.getSharedPreferences("vkeyid_settings", 0).edit();
            if (edit != null) {
                edit.putString("vkey_valid" + str, C0109c.m227a(C0109c.m226a(), String.valueOf(j)));
                edit.commit();
            }
        } catch (Throwable th) {
        }
    }

    public static void m192a(Context context, boolean z) {
        try {
            Editor edit = context.getSharedPreferences("vkeyid_settings", 0).edit();
            if (edit != null) {
                edit.putString("log_switch", z ? C0109c.m227a(C0109c.m226a(), Constants.VIA_TO_TYPE_QQ_GROUP) : C0109c.m227a(C0109c.m226a(), Constants.VIA_RESULT_SUCCESS));
                edit.commit();
            }
        } catch (Throwable th) {
        }
    }

    public static void m193b(Context context, String str) {
        try {
            Editor edit = context.getSharedPreferences("vkeyid_settings", 0).edit();
            if (edit != null) {
                edit.putString("agent_switch", C0109c.m227a(C0109c.m226a(), str));
                edit.commit();
            }
        } catch (Throwable th) {
        }
    }

    public static boolean m194b(Context context) {
        boolean z = false;
        try {
            String a = C0127c.m343a(context, "vkeyid_settings", "log_switch", Constants.STR_EMPTY);
            if (!C0110a.m234a(a)) {
                a = C0109c.m229b(C0109c.m226a(), a);
                if (!C0110a.m234a(a)) {
                    z = a.equals(Constants.VIA_TO_TYPE_QQ_GROUP);
                }
            }
        } catch (Throwable th) {
        }
        return z;
    }

    public static long m195c(Context context, String str) {
        long j = 0;
        try {
            String string = context.getSharedPreferences("vkeyid_settings", 0).getString("vkey_valid" + str, Constants.STR_EMPTY);
            if (!C0110a.m234a(string)) {
                string = C0109c.m229b(C0109c.m226a(), string);
                if (!C0110a.m234a(string)) {
                    j = Long.parseLong(string);
                }
            }
        } catch (Throwable th) {
        }
        return j;
    }

    public static synchronized String m196c(Context context) {
        String a;
        synchronized (C0101h.class) {
            if (C0110a.m234a(f123a)) {
                a = C0127c.m343a(context, "alipay_vkey_random", "random", Constants.STR_EMPTY);
                f123a = a;
                if (C0110a.m234a(a)) {
                    f123a = C0108b.m225a(UUID.randomUUID().toString());
                    a = "alipay_vkey_random";
                    String str = "random";
                    String str2 = f123a;
                    if (str2 != null) {
                        Editor edit = context.getSharedPreferences(a, 0).edit();
                        if (edit != null) {
                            edit.clear();
                            edit.putString(str, str2);
                            edit.commit();
                        }
                    }
                }
            }
            a = f123a;
        }
        return a;
    }
}
