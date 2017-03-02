package com.igexin.push.core.bean;

import android.os.Build.VERSION;
import com.igexin.push.core.C0483g;
import com.igexin.sdk.PushBuildConfig;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import com.zkunity.app.ResourceIDs;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.bean.a */
public class C0427a {
    public String f1132a;
    public String f1133b;
    public String f1134c;
    public String f1135d;
    public String f1136e;
    public String f1137f;
    public String f1138g;
    public String f1139h;
    public String f1140i;
    public String f1141j;
    public String f1142k;
    public long f1143l;

    public C0427a() {
        this.f1137f = PushBuildConfig.sdk_conf_channelid;
        if (C0483g.f1319e != null) {
            this.f1137f += ":" + C0483g.f1319e;
        }
        this.f1136e = PushBuildConfig.sdk_conf_version;
        this.f1133b = C0483g.f1336v;
        this.f1134c = C0483g.f1335u;
        this.f1135d = C0483g.f1338x;
        this.f1140i = C0483g.f1339y;
        this.f1132a = C0483g.f1337w;
        this.f1139h = "ANDROID";
        this.f1141j = "android" + VERSION.RELEASE;
        this.f1142k = "MDP";
        this.f1138g = C0483g.f1340z;
        this.f1143l = System.currentTimeMillis();
    }

    public static String m1470a(C0427a c0427a) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("model", c0427a.f1132a == null ? Constants.STR_EMPTY : c0427a.f1132a);
        jSONObject.put("sim", c0427a.f1133b == null ? Constants.STR_EMPTY : c0427a.f1133b);
        jSONObject.put("imei", c0427a.f1134c == null ? Constants.STR_EMPTY : c0427a.f1134c);
        jSONObject.put("mac", c0427a.f1135d == null ? Constants.STR_EMPTY : c0427a.f1135d);
        jSONObject.put("version", c0427a.f1136e == null ? Constants.STR_EMPTY : c0427a.f1136e);
        jSONObject.put("channelid", c0427a.f1137f == null ? Constants.STR_EMPTY : c0427a.f1137f);
        jSONObject.put(SocialConstants.PARAM_TYPE, "ANDROID");
        jSONObject.put("app", c0427a.f1142k == null ? Constants.STR_EMPTY : c0427a.f1142k);
        jSONObject.put("deviceid", "ANDROID-" + (c0427a.f1138g == null ? Constants.STR_EMPTY : c0427a.f1138g));
        jSONObject.put("system_version", c0427a.f1141j == null ? Constants.STR_EMPTY : c0427a.f1141j);
        jSONObject.put("cell", c0427a.f1140i == null ? Constants.STR_EMPTY : c0427a.f1140i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(AuthActivity.ACTION_KEY, "addphoneinfo");
        jSONObject2.put(ResourceIDs.ID, String.valueOf(c0427a.f1143l));
        jSONObject2.put("info", jSONObject);
        return jSONObject2.toString();
    }
}
