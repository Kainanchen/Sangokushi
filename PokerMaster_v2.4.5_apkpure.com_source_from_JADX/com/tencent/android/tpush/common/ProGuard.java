package com.tencent.android.tpush.common;

import android.content.Context;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.XGPushConfig;
import org.json.JSONObject;

/* renamed from: com.tencent.android.tpush.common.n */
public class ProGuard {
    private static ProGuard f7387a;
    private Context f7388b;
    private String f7389c;
    private String f7390d;

    static {
        f7387a = null;
    }

    private ProGuard(Context context) {
        this.f7388b = null;
        this.f7389c = null;
        this.f7390d = null;
        this.f7388b = context.getApplicationContext();
        this.f7389c = ProGuard.m4838f(context);
        this.f7390d = "2.47";
    }

    public static synchronized ProGuard m4821a(Context context) {
        ProGuard proGuard;
        synchronized (ProGuard.class) {
            if (f7387a == null) {
                f7387a = new ProGuard(context);
            }
            proGuard = f7387a;
        }
        return proGuard;
    }

    public String m4822a() {
        Object obj = null;
        JSONObject jSONObject = new JSONObject();
        try {
            int i;
            ProGuard.m4792a(jSONObject, "appVer", this.f7389c);
            ProGuard.m4792a(jSONObject, "appSdkVer", this.f7390d);
            ProGuard.m4792a(jSONObject, "ch", XGPushConfig.getInstallChannel(this.f7388b));
            ProGuard.m4792a(jSONObject, "gs", XGPushConfig.getGameServer(this.f7388b));
            if (ProGuard.m4823a(this.f7388b).m4825b() && com.tencent.android.tpush.p069c.ProGuard.m4782d(this.f7388b)) {
                String b = com.tencent.android.tpush.p069c.ProGuard.m4778b();
                Object c = com.tencent.android.tpush.p069c.ProGuard.m4781c(this.f7388b);
                com.tencent.android.tpush.p067a.ProGuard.m4720e(Constants.OTHER_PUSH_TAG, "Reservert info: other push token is : " + c + "  other push type: " + b);
                if (!(ProGuard.m4834b(b) || ProGuard.m4834b((String) c))) {
                    ProGuard.m4792a(jSONObject, b, c);
                    obj = 1;
                }
            }
            if (obj == null) {
                com.tencent.android.tpush.p067a.ProGuard.m4720e(Constants.OTHER_PUSH_TAG, "Reservert info: use normal xg token register");
                ProGuard.m4792a(jSONObject, "gcm", LetterIndexBar.SEARCH_ICON_LETTER);
                ProGuard.m4792a(jSONObject, "miid", LetterIndexBar.SEARCH_ICON_LETTER);
            }
            int a = ProGuard.m4812a(this.f7388b, ".firstregister", 1);
            int a2 = ProGuard.m4812a(this.f7388b, ".usertype", 0);
            long a3 = ProGuard.m4813a(this.f7388b, ".installtime", 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (a3 == 0) {
                ProGuard.m4819b(this.f7388b, ".installtime", currentTimeMillis);
                i = a2;
            } else {
                if (a2 == 0 && a != 1) {
                    if (!ProGuard.m4827a(a3).equals(ProGuard.m4827a(System.currentTimeMillis()))) {
                        ProGuard.m4818b(this.f7388b, ".usertype", 1);
                        currentTimeMillis = a3;
                        i = 1;
                    }
                }
                currentTimeMillis = a3;
                i = a2;
            }
            jSONObject.put("ut", i);
            if (a == 1) {
                jSONObject.put("freg", 1);
            }
            jSONObject.put("it", (int) (currentTimeMillis / 1000));
            if (ProGuard.m4833b(this.f7388b)) {
                jSONObject.put("aidl", 1);
            }
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c("RegisterReservedInfo", "toSting", e);
        }
        return jSONObject.toString();
    }
}
