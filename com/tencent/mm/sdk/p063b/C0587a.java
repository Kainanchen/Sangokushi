package com.tencent.mm.sdk.p063b;

import android.os.Bundle;

/* renamed from: com.tencent.mm.sdk.b.a */
public final class C0587a {
    public static int m2011a(Bundle bundle, String str) {
        int i = -1;
        if (bundle != null) {
            try {
                i = bundle.getInt(str, -1);
            } catch (Exception e) {
                C0589b.m2017a("MicroMsg.IntentUtil", "getIntExtra exception:%s", e.getMessage());
            }
        }
        return i;
    }

    public static String m2012b(Bundle bundle, String str) {
        String str2 = null;
        if (bundle != null) {
            try {
                str2 = bundle.getString(str);
            } catch (Exception e) {
                C0589b.m2017a("MicroMsg.IntentUtil", "getStringExtra exception:%s", e.getMessage());
            }
        }
        return str2;
    }
}
