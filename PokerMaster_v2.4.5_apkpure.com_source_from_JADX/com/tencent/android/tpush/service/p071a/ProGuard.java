package com.tencent.android.tpush.service.p071a;

import android.content.Context;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.encrypt.Rijndael;
import org.json.JSONObject;

/* renamed from: com.tencent.android.tpush.service.a.a */
public class ProGuard {
    private static ProGuard f7503D;
    public int f7504A;
    public int f7505B;
    public boolean f7506C;
    private Context f7507E;
    public long f7508a;
    public int f7509b;
    public int f7510c;
    public int f7511d;
    public int f7512e;
    public int f7513f;
    public int f7514g;
    public int f7515h;
    public int f7516i;
    public int f7517j;
    public int f7518k;
    public int f7519l;
    public int f7520m;
    public int f7521n;
    public int f7522o;
    public int f7523p;
    public int f7524q;
    public int f7525r;
    public int f7526s;
    public int f7527t;
    public String f7528u;
    public int f7529v;
    public int f7530w;
    public String f7531x;
    public int f7532y;
    public int f7533z;

    static {
        f7503D = null;
    }

    private ProGuard(Context context) {
        this.f7507E = null;
        this.f7531x = null;
        this.f7532y = 1;
        this.f7533z = 1;
        this.f7504A = 60000;
        this.f7505B = 1;
        this.f7506C = true;
        this.f7507E = context.getApplicationContext();
        m4977a();
    }

    public static ProGuard m4972a(Context context) {
        if (f7503D == null) {
            synchronized (ProGuard.class) {
                if (f7503D == null) {
                    f7503D = new ProGuard(context);
                }
            }
        }
        return f7503D;
    }

    public String toString() {
        return "ConfigurationManager [context=" + this.f7507E + ", configurationVersion=" + this.f7508a + ", receiveTimeout=" + this.f7509b + ", heartbeatInterval=" + this.f7510c + ", httpHeartbeatInterval=" + this.f7511d + ", speedTestInterval=" + this.f7512e + ", channelMessageExpires=" + this.f7513f + ", freqencySuccess=" + this.f7514g + ", freqencyFailed=" + this.f7515h + ", reportInterval=" + this.f7516i + ", reportMaxCount=" + this.f7517j + ", httpRetryCount=" + this.f7518k + ", ackMaxCount=" + this.f7519l + ", ackDuration=" + this.f7520m + ", loadIpInerval=" + this.f7521n + ", redirectConnectTimeOut=" + this.f7522o + ", redirectSoTimeOut=" + this.f7523p + ", strategyExpiredTime=" + this.f7524q + ", logLevel=" + this.f7525r + ", logFileSizeLimit=" + this.f7526s + ", errCount=" + this.f7527t + ", logUploadDomain=" + this.f7528u + ", rptLive=" + this.f7529v + ", rptLiveIntvl=" + this.f7530w + ", disableXG=" + this.f7531x + ", enableNewWd=" + this.f7532y + ", enableMonitor=" + this.f7533z + ", monitorFreg=" + this.f7504A + ", enableReport=" + this.f7505B + ", isXGServiceEnable=" + this.f7506C + "]";
    }

    public void m4977a() {
        if (this.f7508a == 0) {
            this.f7508a = m4980b();
            this.f7509b = m4974a("recTo", 30000);
            this.f7510c = m4974a("hbIntvl", 299980);
            this.f7511d = m4974a("httpHbIntvl", 600000);
            this.f7512e = m4974a("stIntvl", 54000000);
            this.f7513f = m4974a("cnMsgExp", 60000);
            this.f7514g = m4974a("fqcSuc", 10);
            this.f7515h = m4974a("fqcFal", 100);
            this.f7516i = m4974a("rptIntvl", 1200);
            this.f7517j = m4974a("rptMaxCnt", 5);
            this.f7518k = m4974a("httpRtCnt", 3);
            this.f7519l = m4974a("ackMaxCnt", 3);
            this.f7520m = m4974a("ackDuration", 180000);
            this.f7521n = m4974a("loadIpIntvl", 72000000);
            this.f7522o = m4974a("redirectConnectTime", 30000);
            this.f7523p = m4974a("redirectSoTime", 20000);
            this.f7524q = m4974a("strategyExpiredTime", 1440);
            this.f7529v = m4974a("rptLive", 0);
            this.f7530w = m4974a("rptLiveIntvl", 3600);
            this.f7526s = m4974a("logFileSizeLimit", (int) AccessibilityNodeInfoCompat.ACTION_EXPAND);
            this.f7527t = m4974a("errCount", 5);
            this.f7528u = m4976a("logUploadDomain", "183.61.46.193");
            this.f7531x = m4976a("stopXG", LetterIndexBar.SEARCH_ICON_LETTER);
            this.f7532y = m4974a("enableNewWd", 1);
            this.f7505B = m4974a("report", 1);
            this.f7533z = m4974a("enable.monitor", 1);
            this.f7504A = m4974a("m.freq", 60000);
        }
    }

    private ProGuard() {
        this.f7507E = null;
        this.f7531x = null;
        this.f7532y = 1;
        this.f7533z = 1;
        this.f7504A = 60000;
        this.f7505B = 1;
        this.f7506C = true;
    }

    public void m4979a(String str) {
        int i = 30000;
        int i2 = 3600;
        int i3 = 5;
        int i4 = 3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f7508a = (long) m4975a("confVer", jSONObject);
            this.f7508a = this.f7508a == 0 ? 1 : this.f7508a;
            this.f7509b = m4975a("recTo", jSONObject) * PointerIconCompat.TYPE_DEFAULT;
            this.f7509b = this.f7509b == 0 ? 30000 : this.f7509b;
            this.f7510c = (m4975a("hbIntvl", jSONObject) * 60) * PointerIconCompat.TYPE_DEFAULT;
            this.f7510c = this.f7510c == 0 ? 299980 : this.f7510c;
            this.f7511d = (m4975a("httpHbIntvl", jSONObject) * 60) * PointerIconCompat.TYPE_DEFAULT;
            this.f7511d = this.f7511d == 0 ? 600000 : this.f7511d;
            this.f7512e = (m4975a("stIntvl", jSONObject) * 60) * PointerIconCompat.TYPE_DEFAULT;
            this.f7512e = this.f7512e == 0 ? 54000000 : this.f7512e;
            this.f7513f = m4975a("cnMsgExp", jSONObject) * PointerIconCompat.TYPE_DEFAULT;
            this.f7513f = this.f7513f == 0 ? 60000 : this.f7513f;
            this.f7514g = m4975a("fqcSuc", jSONObject);
            this.f7514g = this.f7514g == 0 ? 10 : this.f7514g;
            this.f7515h = m4975a("fqcFal", jSONObject);
            this.f7515h = this.f7515h == 0 ? 100 : this.f7515h;
            this.f7516i = m4975a("rptIntvl", jSONObject);
            this.f7516i = this.f7516i == 0 ? 1200 : this.f7516i;
            this.f7517j = m4975a("rptMaxCnt", jSONObject);
            this.f7517j = this.f7517j == 0 ? 5 : this.f7517j;
            this.f7518k = m4975a("httpRtCnt", jSONObject);
            this.f7518k = this.f7518k == 0 ? 3 : this.f7518k;
            this.f7519l = m4975a("ackMaxCnt", jSONObject);
            if (this.f7519l != 0) {
                i4 = this.f7519l;
            }
            this.f7519l = i4;
            this.f7520m = m4975a("ackDuration", jSONObject) * PointerIconCompat.TYPE_DEFAULT;
            this.f7520m = this.f7520m == 0 ? 180000 : this.f7520m;
            this.f7521n = ((m4975a("loadIpIntvl", jSONObject) * 60) * 60) * PointerIconCompat.TYPE_DEFAULT;
            this.f7521n = this.f7521n == 0 ? 72000000 : this.f7521n;
            this.f7522o = m4975a("redirectConnectTime", jSONObject);
            if (this.f7522o != 0) {
                i = this.f7522o;
            }
            this.f7522o = i;
            this.f7523p = m4975a("redirectSoTime", jSONObject);
            this.f7523p = this.f7523p == 0 ? 20000 : this.f7523p;
            this.f7524q = m4975a("strategyExpiredTime", jSONObject);
            this.f7524q = this.f7524q == 0 ? 1440 : this.f7524q;
            this.f7529v = m4975a("rptLive", jSONObject);
            this.f7529v = this.f7529v == 0 ? 0 : this.f7529v;
            this.f7530w = m4975a("rptLiveIntvl", jSONObject);
            if (this.f7530w != 3600) {
                i2 = this.f7530w;
            }
            this.f7530w = i2;
            this.f7525r = m4975a("logLevel", jSONObject);
            this.f7526s = m4975a("logFileSizeLimit", jSONObject) * AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
            this.f7526s = this.f7526s == 0 ? AccessibilityNodeInfoCompat.ACTION_EXPAND : this.f7526s;
            this.f7527t = m4975a("errCount", jSONObject);
            if (this.f7527t != 0) {
                i3 = this.f7527t;
            }
            this.f7527t = i3;
            this.f7528u = m4982b("logUploadDomain", jSONObject);
            this.f7528u = TextUtils.isEmpty(this.f7528u) ? "183.61.46.193" : this.f7528u;
            this.f7532y = jSONObject.optInt("enableNewWd", 1);
            this.f7505B = jSONObject.optInt("report", 1);
            this.f7531x = jSONObject.optString("stopXG", null);
            this.f7533z = jSONObject.optInt("enable.monitor", 1);
            this.f7504A = jSONObject.optInt("m.freq", 60000);
            Object optString = jSONObject.optString("st.kv", LetterIndexBar.SEARCH_ICON_LETTER);
            Object optString2 = jSONObject.optString("sp.kv", LetterIndexBar.SEARCH_ICON_LETTER);
            com.tencent.android.tpush.common.ProGuard.m4819b(m4973c(), m4981b("confVer"), this.f7508a);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("recTo"), this.f7509b);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("hbIntvl"), this.f7510c);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("httpHbIntvl"), this.f7511d);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("stIntvl"), this.f7512e);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("cnMsgExp"), this.f7513f);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("fqcSuc"), this.f7514g);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("fqcFal"), this.f7515h);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("rptIntvl"), this.f7516i);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("rptMaxCnt"), this.f7517j);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("httpRtCnt"), this.f7518k);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("ackMaxCnt"), this.f7519l);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("ackDuration"), this.f7520m);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("loadIpIntvl"), this.f7521n);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("redirectConnectTime"), this.f7522o);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("redirectSoTime"), this.f7523p);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("strategyExpiredTime"), this.f7524q);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("rptLive"), this.f7529v);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("rptLiveIntvl"), this.f7530w);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("logLevel"), this.f7525r);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("logFileSizeLimit"), this.f7526s);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("errCount"), this.f7527t);
            if (!com.tencent.android.tpush.service.p077d.ProGuard.m5317a(this.f7531x)) {
                com.tencent.android.tpush.common.ProGuard.m4820b(m4973c(), m4981b("stopXG"), Rijndael.encrypt(this.f7531x));
            }
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("enableNewWd"), this.f7532y);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("report"), this.f7505B);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("enable.monitor"), this.f7533z);
            com.tencent.android.tpush.common.ProGuard.m4818b(m4973c(), m4981b("m.freq"), this.f7504A);
            if (!TextUtils.isEmpty(optString)) {
                ProGuard.m4984b(m4973c(), optString);
            }
            if (!TextUtils.isEmpty(optString2)) {
                ProGuard.m4983a(m4973c(), optString2);
            }
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, "parseValue failed.", e);
        }
    }

    public long m4980b() {
        if (this.f7507E != null) {
            return com.tencent.android.tpush.common.ProGuard.m4813a(this.f7507E, m4981b("confVer"), 1);
        }
        return 1;
    }

    public void m4978a(long j) {
        if (this.f7507E != null && m4980b() != j) {
            com.tencent.android.tpush.common.ProGuard.m4819b(this.f7507E, m4981b("confVer"), j);
        }
    }

    private Context m4973c() {
        if (this.f7507E != null) {
            return this.f7507E;
        }
        if (m4973c() != null) {
            this.f7507E = com.tencent.android.tpush.service.ProGuard.m5376e();
            return this.f7507E;
        }
        if (XGPushManager.getContext() != null) {
            this.f7507E = XGPushManager.getContext();
        }
        return this.f7507E;
    }

    public int m4974a(String str, int i) {
        return com.tencent.android.tpush.common.ProGuard.m4812a(m4973c(), m4981b(str), i);
    }

    public String m4976a(String str, String str2) {
        CharSequence a = com.tencent.android.tpush.common.ProGuard.m4815a(m4973c(), m4981b(str), str2);
        return TextUtils.isEmpty(a) ? str2 : a;
    }

    public int m4975a(String str, JSONObject jSONObject) {
        if (!(jSONObject == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str))) {
            try {
                return jSONObject.getInt(str);
            } catch (Throwable e) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, "getJsonInt", e);
            }
        }
        return 0;
    }

    public String m4982b(String str, JSONObject jSONObject) {
        if (!(jSONObject == null || com.tencent.android.tpush.service.p077d.ProGuard.m5317a(str))) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable e) {
                com.tencent.android.tpush.p067a.ProGuard.m4716c(Constants.ServiceLogTag, "getJsonStr", e);
            }
        }
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public String m4981b(String str) {
        return "com.tencent.tpus." + str;
    }
}
