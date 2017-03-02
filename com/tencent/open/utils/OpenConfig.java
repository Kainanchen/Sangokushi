package com.tencent.open.utils;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProGuard */
public class OpenConfig {
    private static Map<String, OpenConfig> f1720a;
    private static String f1721b;
    private Context f1722c;
    private String f1723d;
    private JSONObject f1724e;
    private long f1725f;
    private int f1726g;
    private boolean f1727h;

    /* renamed from: com.tencent.open.utils.OpenConfig.1 */
    class ProGuard extends Thread {
        final /* synthetic */ Bundle f1718a;
        final /* synthetic */ OpenConfig f1719b;

        ProGuard(OpenConfig openConfig, Bundle bundle) {
            this.f1719b = openConfig;
            this.f1718a = bundle;
        }

        public void run() {
            try {
                this.f1719b.m2187a(Util.parseJson(HttpUtils.openUrl2(this.f1719b.f1722c, "http://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", Constants.HTTP_GET, this.f1718a).response));
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f1719b.f1726g = 0;
        }
    }

    static {
        f1720a = Collections.synchronizedMap(new HashMap());
        f1721b = null;
    }

    public static OpenConfig getInstance(Context context, String str) {
        OpenConfig openConfig;
        synchronized (f1720a) {
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.OpenConfig", "getInstance begin");
            if (str != null) {
                f1721b = str;
            }
            if (str == null) {
                if (f1721b != null) {
                    str = f1721b;
                } else {
                    str = Constants.VIA_RESULT_SUCCESS;
                }
            }
            openConfig = (OpenConfig) f1720a.get(str);
            if (openConfig == null) {
                openConfig = new OpenConfig(context, str);
                f1720a.put(str, openConfig);
            }
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.OpenConfig", "getInstance end");
        }
        return openConfig;
    }

    private OpenConfig(Context context, String str) {
        this.f1722c = null;
        this.f1723d = null;
        this.f1724e = null;
        this.f1725f = 0;
        this.f1726g = 0;
        this.f1727h = true;
        this.f1722c = context.getApplicationContext();
        this.f1723d = str;
        m2184a();
        m2188b();
    }

    private void m2184a() {
        try {
            this.f1724e = new JSONObject(m2183a("com.tencent.open.config.json"));
        } catch (JSONException e) {
            this.f1724e = new JSONObject();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m2183a(java.lang.String r6) {
        /*
        r5 = this;
        r1 = "";
        r0 = r5.f1723d;	 Catch:{ FileNotFoundException -> 0x0052 }
        if (r0 == 0) goto L_0x0050;
    L_0x0006:
        r0 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0052 }
        r0.<init>();	 Catch:{ FileNotFoundException -> 0x0052 }
        r0 = r0.append(r6);	 Catch:{ FileNotFoundException -> 0x0052 }
        r2 = ".";
        r0 = r0.append(r2);	 Catch:{ FileNotFoundException -> 0x0052 }
        r2 = r5.f1723d;	 Catch:{ FileNotFoundException -> 0x0052 }
        r0 = r0.append(r2);	 Catch:{ FileNotFoundException -> 0x0052 }
        r0 = r0.toString();	 Catch:{ FileNotFoundException -> 0x0052 }
    L_0x001f:
        r2 = r5.f1722c;	 Catch:{ FileNotFoundException -> 0x0052 }
        r0 = r2.openFileInput(r0);	 Catch:{ FileNotFoundException -> 0x0052 }
    L_0x0025:
        r3 = new java.io.BufferedReader;
        r2 = new java.io.InputStreamReader;
        r4 = "UTF-8";
        r4 = java.nio.charset.Charset.forName(r4);
        r2.<init>(r0, r4);
        r3.<init>(r2);
        r2 = new java.lang.StringBuffer;
        r2.<init>();
    L_0x003a:
        r4 = r3.readLine();	 Catch:{ IOException -> 0x0044 }
        if (r4 == 0) goto L_0x0064;
    L_0x0040:
        r2.append(r4);	 Catch:{ IOException -> 0x0044 }
        goto L_0x003a;
    L_0x0044:
        r2 = move-exception;
        r2.printStackTrace();	 Catch:{ all -> 0x007c }
        r0.close();	 Catch:{ IOException -> 0x0076 }
        r3.close();	 Catch:{ IOException -> 0x0076 }
        r0 = r1;
    L_0x004f:
        return r0;
    L_0x0050:
        r0 = r6;
        goto L_0x001f;
    L_0x0052:
        r0 = move-exception;
        r0 = r5.f1722c;	 Catch:{ IOException -> 0x005e }
        r0 = r0.getAssets();	 Catch:{ IOException -> 0x005e }
        r0 = r0.open(r6);	 Catch:{ IOException -> 0x005e }
        goto L_0x0025;
    L_0x005e:
        r0 = move-exception;
        r0.printStackTrace();
        r0 = r1;
        goto L_0x004f;
    L_0x0064:
        r1 = r2.toString();	 Catch:{ IOException -> 0x0044 }
        r0.close();	 Catch:{ IOException -> 0x0070 }
        r3.close();	 Catch:{ IOException -> 0x0070 }
        r0 = r1;
        goto L_0x004f;
    L_0x0070:
        r0 = move-exception;
        r0.printStackTrace();
        r0 = r1;
        goto L_0x004f;
    L_0x0076:
        r0 = move-exception;
        r0.printStackTrace();
        r0 = r1;
        goto L_0x004f;
    L_0x007c:
        r1 = move-exception;
        r0.close();	 Catch:{ IOException -> 0x0084 }
        r3.close();	 Catch:{ IOException -> 0x0084 }
    L_0x0083:
        throw r1;
    L_0x0084:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.utils.OpenConfig.a(java.lang.String):java.lang.String");
    }

    private void m2186a(String str, String str2) {
        try {
            if (this.f1723d != null) {
                str = str + "." + this.f1723d;
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f1722c.openFileOutput(str, 0), Charset.forName(AsyncHttpResponseHandler.DEFAULT_CHARSET));
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void m2188b() {
        if (this.f1726g != 0) {
            m2189b("update thread is running, return");
            return;
        }
        this.f1726g = 1;
        Bundle bundle = new Bundle();
        bundle.putString(SocialConstants.PARAM_APP_ID, this.f1723d);
        bundle.putString("appid_for_getting_config", this.f1723d);
        bundle.putString("status_os", VERSION.RELEASE);
        bundle.putString("status_machine", Build.MODEL);
        bundle.putString("status_version", VERSION.SDK);
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
        new ProGuard(this, bundle).start();
    }

    private void m2187a(JSONObject jSONObject) {
        m2189b("cgi back, do update");
        this.f1724e = jSONObject;
        m2186a("com.tencent.open.config.json", jSONObject.toString());
        this.f1725f = SystemClock.elapsedRealtime();
    }

    private void m2190c() {
        int optInt = this.f1724e.optInt("Common_frequency");
        if (optInt == 0) {
            optInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f1725f >= ((long) (optInt * 3600000))) {
            m2188b();
        }
    }

    public int getInt(String str) {
        m2189b("get " + str);
        m2190c();
        return this.f1724e.optInt(str);
    }

    public long getLong(String str) {
        m2189b("get " + str);
        m2190c();
        return this.f1724e.optLong(str);
    }

    public boolean getBoolean(String str) {
        m2189b("get " + str);
        m2190c();
        Object opt = this.f1724e.opt(str);
        if (opt == null) {
            return false;
        }
        if (opt instanceof Integer) {
            return !opt.equals(Integer.valueOf(0));
        } else if (opt instanceof Boolean) {
            return ((Boolean) opt).booleanValue();
        } else {
            return false;
        }
    }

    private void m2189b(String str) {
        if (this.f1727h) {
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.OpenConfig", str + "; appid: " + this.f1723d);
        }
    }
}
