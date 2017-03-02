package com.alipay.sdk.authjs;

import com.igexin.sdk.PushBuildConfig;
import com.tencent.wxop.stat.common.StatConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.authjs.a */
public final class C0161a {
    public static final String f315a = "CallInfo";
    public static final String f316b = "call";
    public static final String f317c = "callback";
    public static final String f318d = "bundleName";
    public static final String f319e = "clientId";
    public static final String f320f = "param";
    public static final String f321g = "func";
    public static final String f322h = "msgType";
    public String f323i;
    public String f324j;
    public String f325k;
    public String f326l;
    public JSONObject f327m;
    private boolean f328n;

    /* renamed from: com.alipay.sdk.authjs.a.1 */
    static /* synthetic */ class C01591 {
        static final /* synthetic */ int[] f308a;

        static {
            f308a = new int[C0160a.m445a().length];
            try {
                f308a[C0160a.f310b - 1] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f308a[C0160a.f311c - 1] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f308a[C0160a.f312d - 1] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* renamed from: com.alipay.sdk.authjs.a.a */
    public enum C0160a {
        ;

        public static int[] m445a() {
            return (int[]) f314f.clone();
        }

        static {
            f309a = 1;
            f310b = 2;
            f311c = 3;
            f312d = 4;
            f313e = 5;
            f314f = new int[]{f309a, f310b, f311c, f312d, f313e};
        }
    }

    private static String m446a(int i) {
        switch (C01591.f308a[i - 1]) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                return "function not found";
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                return "invalid parameter";
            case StatConstants.STAT_DB_VERSION /*3*/:
                return "runtime error";
            default:
                return PushBuildConfig.sdk_conf_debug_level;
        }
    }

    private boolean m450a() {
        return this.f328n;
    }

    private void m449a(boolean z) {
        this.f328n = z;
    }

    public C0161a(String str) {
        this.f328n = false;
        this.f326l = str;
    }

    private String m451b() {
        return this.f323i;
    }

    private void m447a(String str) {
        this.f323i = str;
    }

    private String m453c() {
        return this.f324j;
    }

    private void m452b(String str) {
        this.f324j = str;
    }

    private String m455d() {
        return this.f325k;
    }

    private void m454c(String str) {
        this.f325k = str;
    }

    private String m457e() {
        return this.f326l;
    }

    private void m456d(String str) {
        this.f326l = str;
    }

    private JSONObject m458f() {
        return this.f327m;
    }

    private void m448a(JSONObject jSONObject) {
        this.f327m = jSONObject;
    }

    private String m459g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f319e, this.f323i);
        jSONObject.put(f321g, this.f325k);
        jSONObject.put(f320f, this.f327m);
        jSONObject.put(f322h, this.f326l);
        return jSONObject.toString();
    }
}
