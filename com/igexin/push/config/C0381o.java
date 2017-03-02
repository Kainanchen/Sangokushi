package com.igexin.push.config;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.core.C0483g;

/* renamed from: com.igexin.push.config.o */
public class C0381o {
    public static void m1257a() {
        try {
            Bundle bundle = C0483g.f1321g.getPackageManager().getApplicationInfo(C0483g.f1321g.getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS).metaData;
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    if (str.equals("PUSH_DOMAIN")) {
                        C0247a.m838b("PUSH_DOMAIN:" + bundle.getString(str));
                        C0381o.m1258a(bundle.getString(str));
                        return;
                    }
                }
            }
        } catch (Exception e) {
            C0247a.m838b(e.toString());
        }
    }

    private static void m1258a(String str) {
        SDKUrlConfig.XFR_ADDRESS_IPS = new String[]{"socket://xfr." + str + ":5224"};
        C0247a.m838b("XFR_ADDRESS_IPS:" + SDKUrlConfig.XFR_ADDRESS_IPS[0]);
        SDKUrlConfig.XFR_ADDRESS_IPS_BAK = new String[]{"socket://xfr_bak." + str + ":5224"};
        C0247a.m838b("XFR_ADDRESS_IPS_BAK:" + SDKUrlConfig.XFR_ADDRESS_IPS_BAK[0]);
        SDKUrlConfig.BI_ADDRESS_IPS = new String[]{"http://bi." + str + "/api.php"};
        C0247a.m838b("BI_ADDRESS_IPS:" + SDKUrlConfig.BI_ADDRESS_IPS[0]);
        SDKUrlConfig.CONFIG_ADDRESS_IPS = new String[]{"http://config." + str + "/api.php"};
        C0247a.m838b("CONFIG_ADDRESS_IPS:" + SDKUrlConfig.CONFIG_ADDRESS_IPS[0]);
        SDKUrlConfig.STATE_ADDRESS_IPS = new String[]{"http://stat." + str + "/api.php"};
        C0247a.m838b("STATE_ADDRESS_IPS:" + SDKUrlConfig.STATE_ADDRESS_IPS[0]);
        SDKUrlConfig.LOG_ADDRESS_IPS = new String[]{"http://log." + str + "/api.php"};
        C0247a.m838b("LOG_ADDRESS_IPS:" + SDKUrlConfig.LOG_ADDRESS_IPS[0]);
        SDKUrlConfig.AMP_ADDRESS_IPS = new String[]{"http://amp." + str + "/api.htm"};
        C0247a.m838b("AMP_ADDRESS_IPS:" + SDKUrlConfig.AMP_ADDRESS_IPS[0]);
        SDKUrlConfig.LBS_ADDRESS_IPS = new String[]{"http://lbs." + str + "/api.htm"};
        C0247a.m838b("LBS_ADDRESS_IPS:" + SDKUrlConfig.LBS_ADDRESS_IPS[0]);
        SDKUrlConfig.INC_ADDRESS_IPS = new String[]{"http://inc." + str + "/api.php"};
        C0247a.m838b("INC_ADDRESS_IPS:" + SDKUrlConfig.INC_ADDRESS_IPS[0]);
    }
}
