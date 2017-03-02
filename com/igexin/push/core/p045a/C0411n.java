package com.igexin.push.core.p045a;

import android.content.Intent;
import android.text.TextUtils;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.config.C0378l;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.p044c.C0461w;
import com.igexin.push.core.p044c.C0464z;
import com.igexin.push.core.p050d.C0472f;
import com.igexin.push.p035e.p049a.C0506c;
import com.igexin.sdk.PushBuildConfig;
import com.tencent.tauth.AuthActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.n */
public class C0411n extends C0398b {
    private static final String f1066a;

    static {
        f1066a = C0377k.f1013a + "_RedirectServerAction";
    }

    private void m1420a() {
        try {
            String[] idcConfigUrl = SDKUrlConfig.getIdcConfigUrl();
            if (idcConfigUrl == null || idcConfigUrl.length == 0) {
                C0247a.m838b(f1066a + "idc config is empty or null");
                return;
            }
            String str = idcConfigUrl[0];
            C0247a.m838b(f1066a + " start fetch idc config, url : " + str);
            C0244d.m802c().m795a(new C0506c(new C0472f(str)), false, true);
        } catch (Exception e) {
            C0247a.m838b(f1066a + e.toString());
        }
    }

    private void m1421a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str2.equals(str)) {
            C0247a.m838b(f1066a + "new location = " + str + "; pre location = " + str2 + ", send snl retire broadcast");
            Intent intent = new Intent();
            intent.setAction("com.igexin.sdk.action.snlretire");
            intent.putExtra("groupid", str2);
            intent.putExtra("branch", PushBuildConfig.sdk_conf_channelid);
            C0483g.f1321g.sendBroadcast(intent);
        }
    }

    public boolean m1422a(Object obj, JSONObject jSONObject) {
        C0247a.m838b(f1066a + " redirect server resp data : " + jSONObject);
        try {
            if (jSONObject.has(AuthActivity.ACTION_KEY) && jSONObject.getString(AuthActivity.ACTION_KEY).equals("redirect_server")) {
                int i;
                long parseLong;
                String string = jSONObject.getString("delay");
                List arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("address_list");
                C0247a.m838b("redirect|" + string + "|" + jSONArray.toString());
                for (i = 0; i < jSONArray.length(); i++) {
                    String string2 = jSONArray.getString(i);
                    int indexOf = string2.indexOf(44);
                    if (indexOf > 0) {
                        String substring = string2.substring(0, indexOf);
                        string2 = string2.substring(indexOf + 1);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (string2 != null) {
                            try {
                                long parseLong2 = Long.parseLong(string2);
                                C0464z c0464z = new C0464z();
                                c0464z.f1237a = "socket://" + substring;
                                c0464z.f1238b = (parseLong2 * 1000) + currentTimeMillis;
                                arrayList.add(c0464z);
                            } catch (NumberFormatException e) {
                            }
                        }
                    }
                }
                try {
                    parseLong = Long.parseLong(string) * 1000;
                } catch (NumberFormatException e2) {
                    parseLong = 0;
                }
                if (parseLong >= 0) {
                    C0483g.f1292D = parseLong;
                }
                if (jSONObject.has("loc") && jSONObject.has("conf")) {
                    try {
                        String string3 = jSONObject.getString("loc");
                        string = C0483g.f1318d;
                        SDKUrlConfig.setLocation(string3);
                        if (C0378l.f1028o) {
                            m1421a(string3, string);
                        }
                        C0247a.m838b(f1066a + " set group id : " + C0483g.f1318d);
                        JSONArray jSONArray2 = jSONObject.getJSONArray("conf");
                        String[] strArr = new String[jSONArray2.length()];
                        for (i = 0; i < jSONArray2.length(); i++) {
                            strArr[i] = "http://" + jSONArray2.getString(i);
                        }
                        SDKUrlConfig.setIdcConfigUrl(strArr);
                    } catch (Exception e3) {
                        C0247a.m838b(f1066a + e3.toString());
                    }
                    if (C0483g.aw == 0) {
                        m1420a();
                    } else if (System.currentTimeMillis() - C0483g.aw > 7200000) {
                        m1420a();
                    } else {
                        C0247a.m838b(f1066a + " get idc cfg last time less than 2 hours return");
                    }
                }
                C0247a.m838b(f1066a + "|set cm list and disconnect !");
                C0461w.m1628a(arrayList);
                C0482f.m1694a().m1714i().m1385e();
            }
        } catch (Exception e32) {
            C0247a.m838b(f1066a + e32.toString());
        }
        return true;
    }
}
