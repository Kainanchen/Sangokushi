package com.igexin.push.config;

import com.igexin.p022a.p023a.p030c.C0247a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.config.n */
public class C0380n {
    private static final String f1038a;

    static {
        f1038a = C0377k.f1013a + "_IDCConfigParse";
    }

    public static void m1255a(String str) {
        JSONObject jSONObject;
        C0247a.m838b(f1038a + " parse idc config data : " + str);
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            String[] a;
            if (jSONObject.has("N")) {
                try {
                    SDKUrlConfig.setLocation(jSONObject.getString("N"));
                } catch (JSONException e2) {
                }
            }
            if (jSONObject.has("X1")) {
                a = C0380n.m1256a(jSONObject, "X1");
                if (a != null && a.length > 0) {
                    SDKUrlConfig.XFR_ADDRESS_IPS = a;
                }
            }
            if (jSONObject.has("X2")) {
                a = C0380n.m1256a(jSONObject, "X2");
                if (a != null && a.length > 0) {
                    SDKUrlConfig.XFR_ADDRESS_IPS_BAK = a;
                }
            }
            if (jSONObject.has("B")) {
                a = C0380n.m1256a(jSONObject, "B");
                if (a != null && a.length > 0) {
                    SDKUrlConfig.BI_ADDRESS_IPS = a;
                }
            }
            if (jSONObject.has("C")) {
                a = C0380n.m1256a(jSONObject, "C");
                if (a != null && a.length > 0) {
                    SDKUrlConfig.CONFIG_ADDRESS_IPS = a;
                }
            }
            if (jSONObject.has("S")) {
                a = C0380n.m1256a(jSONObject, "S");
                if (a != null && a.length > 0) {
                    SDKUrlConfig.STATE_ADDRESS_IPS = a;
                }
            }
            if (jSONObject.has("LO")) {
                a = C0380n.m1256a(jSONObject, "LO");
                if (a != null && a.length > 0) {
                    SDKUrlConfig.LOG_ADDRESS_IPS = a;
                }
            }
            if (jSONObject.has("A")) {
                a = C0380n.m1256a(jSONObject, "A");
                if (a != null && a.length > 0) {
                    SDKUrlConfig.AMP_ADDRESS_IPS = a;
                }
            }
            if (jSONObject.has("LB")) {
                a = C0380n.m1256a(jSONObject, "LB");
                if (a != null && a.length > 0) {
                    SDKUrlConfig.LBS_ADDRESS_IPS = a;
                }
            }
            if (jSONObject.has("I")) {
                String[] a2 = C0380n.m1256a(jSONObject, "I");
                if (a2 != null && a2.length > 0) {
                    SDKUrlConfig.INC_ADDRESS_IPS = a2;
                }
            }
        }
    }

    private static String[] m1256a(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                if (str.equals("X1") || str.equals("X2")) {
                    strArr[i] = "socket://" + jSONArray.getString(i);
                } else {
                    strArr[i] = "http://" + jSONArray.getString(i);
                }
            }
            return strArr;
        } catch (Exception e) {
            return null;
        }
    }
}
