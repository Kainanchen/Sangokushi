package com.alipay.apmobilesecuritysdk.p009f;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.p011b.p012a.p013a.p014a.p015a.C0109c;
import com.alipay.p011b.p012a.p013a.p020d.C0127c;
import com.tencent.connect.common.Constants;

/* renamed from: com.alipay.apmobilesecuritysdk.f.g */
public final class C0100g {
    public static synchronized String m185a(Context context, String str) {
        String a;
        synchronized (C0100g.class) {
            a = C0127c.m343a(context, "openapi_file_pri", "openApi" + str, Constants.STR_EMPTY);
            if (C0110a.m234a(a)) {
                a = Constants.STR_EMPTY;
            } else {
                a = C0109c.m229b(C0109c.m226a(), a);
                if (C0110a.m234a(a)) {
                    a = Constants.STR_EMPTY;
                }
            }
        }
        return a;
    }

    public static synchronized void m186a() {
        synchronized (C0100g.class) {
        }
    }

    public static synchronized void m187a(Context context) {
        synchronized (C0100g.class) {
            Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                edit.commit();
            }
        }
    }

    public static synchronized void m188a(Context context, String str, String str2) {
        synchronized (C0100g.class) {
            try {
                Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
                if (edit != null) {
                    edit.putString("openApi" + str, C0109c.m227a(C0109c.m226a(), str2));
                    edit.commit();
                }
            } catch (Throwable th) {
            }
        }
    }
}
