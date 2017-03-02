package com.igexin.push.config;

import android.text.TextUtils;
import com.igexin.getuiext.data.Consts;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.core.C0483g;

public class SDKUrlConfig {
    public static String[] AMP_ADDRESS_IPS;
    public static String[] BI_ADDRESS_IPS;
    public static String[] CONFIG_ADDRESS_IPS;
    public static String[] INC_ADDRESS_IPS;
    public static String[] LBS_ADDRESS_IPS;
    public static String[] LOG_ADDRESS_IPS;
    public static String[] STATE_ADDRESS_IPS;
    public static String[] XFR_ADDRESS_IPS;
    public static String[] XFR_ADDRESS_IPS_BAK;
    private static String[] f999a;
    private static String f1000b;
    private static String f1001c;

    static {
        f1000b = "HZ";
        XFR_ADDRESS_IPS = new String[]{"socket://sdk.open.talk.igexin.com:5224", "socket://sdk.open.talk.getui.net:5224", "socket://sdk.open.talk.gepush.com:5224"};
        XFR_ADDRESS_IPS_BAK = new String[]{"socket://sdk.open.talk.igexin.com:5224"};
        BI_ADDRESS_IPS = new String[]{Consts.PHONE_ADDRESS_URL};
        CONFIG_ADDRESS_IPS = new String[]{Consts.PHONE_ADDRESS_URL};
        STATE_ADDRESS_IPS = new String[]{Consts.PHONE_ADDRESS_URL};
        LOG_ADDRESS_IPS = new String[]{Consts.PHONE_ADDRESS_URL};
        AMP_ADDRESS_IPS = new String[]{"http://sdk.open.amp.igexin.com/api.htm"};
        LBS_ADDRESS_IPS = new String[]{"http://sdk.open.lbs.igexin.com/api.htm"};
        INC_ADDRESS_IPS = new String[]{Consts.DELIVER_URL};
    }

    public static String getAmpServiceUrl() {
        return AMP_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String getBiUploadServiceUrl() {
        return BI_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String getCmAddress() {
        if (f1001c == null) {
            C0247a.m838b(C0377k.f1013a + " get cm address : " + XFR_ADDRESS_IPS[0]);
            return XFR_ADDRESS_IPS[0];
        }
        C0247a.m838b(C0377k.f1013a + " get cm address : " + f1001c);
        return f1001c;
    }

    public static String getConfigServiceUrl() {
        return CONFIG_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String[] getIdcConfigUrl() {
        return f999a;
    }

    public static String getIncreaseServiceUrl() {
        return INC_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String getLbsServiceUrl() {
        return LBS_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String getLocation() {
        return f1000b;
    }

    public static String getLogServiceUrl() {
        return LOG_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static String getStatServiceUrl() {
        return STATE_ADDRESS_IPS[0] + "?format=json&t=1";
    }

    public static void setCmAddress(String str) {
        C0247a.m838b(C0377k.f1013a + " set cm address : " + str);
        f1001c = str;
    }

    public static void setIdcConfigUrl(String[] strArr) {
        f999a = strArr;
    }

    public static void setLocation(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0483g.f1318d = str;
            f1000b = str;
        }
    }
}
