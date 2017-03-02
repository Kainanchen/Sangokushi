package com.tencent.wxop.stat;

import android.content.Context;
import android.content.IntentFilter;
import com.alipay.sdk.util.C0201h;
import com.igexin.sdk.PushConsts;
import com.tencent.connect.common.Constants;
import com.tencent.wxop.stat.common.C0633e;
import com.tencent.wxop.stat.common.C0639k;
import com.tencent.wxop.stat.common.C0645q;
import com.tencent.wxop.stat.common.StatConstants;
import com.tencent.wxop.stat.common.StatLogger;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import org.apache.http.HttpHost;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a */
public class C0625a {
    private static C0625a f1894g;
    private List<String> f1895a;
    private volatile int f1896b;
    private volatile String f1897c;
    private volatile HttpHost f1898d;
    private C0633e f1899e;
    private int f1900f;
    private Context f1901h;
    private StatLogger f1902i;

    static {
        f1894g = null;
    }

    private C0625a(Context context) {
        this.f1895a = null;
        this.f1896b = 2;
        this.f1897c = Constants.STR_EMPTY;
        this.f1898d = null;
        this.f1899e = null;
        this.f1900f = 0;
        this.f1901h = null;
        this.f1902i = null;
        this.f1901h = context.getApplicationContext();
        this.f1899e = new C0633e();
        C0651i.m2469a(context);
        this.f1902i = C0639k.m2401b();
        m2289l();
        m2286i();
        m2297g();
    }

    public static C0625a m2283a(Context context) {
        if (f1894g == null) {
            synchronized (C0625a.class) {
                if (f1894g == null) {
                    f1894g = new C0625a(context);
                }
            }
        }
        return f1894g;
    }

    private boolean m2285b(String str) {
        return Pattern.compile("(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})").matcher(str).matches();
    }

    private void m2286i() {
        this.f1895a = new ArrayList(10);
        this.f1895a.add("117.135.169.101");
        this.f1895a.add("140.207.54.125");
        this.f1895a.add("180.153.8.53");
        this.f1895a.add("120.198.203.175");
        this.f1895a.add("14.17.43.18");
        this.f1895a.add("163.177.71.186");
        this.f1895a.add("111.30.131.31");
        this.f1895a.add("123.126.121.167");
        this.f1895a.add("123.151.152.111");
        this.f1895a.add("113.142.45.79");
        this.f1895a.add("123.138.162.90");
        this.f1895a.add("103.7.30.94");
    }

    private String m2287j() {
        try {
            String str = StatConstants.MTA_SERVER_HOST;
            if (!m2285b(str)) {
                return InetAddress.getByName(str).getHostAddress();
            }
        } catch (Throwable e) {
            this.f1902i.m2360e(e);
        }
        return Constants.STR_EMPTY;
    }

    private void m2288k() {
        String j = m2287j();
        if (StatConfig.isDebugEnable()) {
            this.f1902i.m2361i("remoteIp ip is " + j);
        }
        if (C0639k.m2405c(j)) {
            String str;
            if (this.f1895a.contains(j)) {
                str = j;
            } else {
                str = (String) this.f1895a.get(this.f1900f);
                if (StatConfig.isDebugEnable()) {
                    this.f1902i.m2363w(j + " not in ip list, change to:" + str);
                }
            }
            StatConfig.setStatReportUrl("http://" + str + ":80/mstat/report");
        }
    }

    private void m2289l() {
        this.f1896b = 0;
        this.f1898d = null;
        this.f1897c = null;
    }

    public HttpHost m2290a() {
        return this.f1898d;
    }

    public void m2291a(String str) {
        if (StatConfig.isDebugEnable()) {
            this.f1902i.m2361i("updateIpList " + str);
        }
        try {
            if (C0639k.m2405c(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.length() > 0) {
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String string = jSONObject.getString((String) keys.next());
                        if (C0639k.m2405c(string)) {
                            for (String str2 : string.split(C0201h.f510b)) {
                                String str22;
                                if (C0639k.m2405c(str22)) {
                                    String[] split = str22.split(":");
                                    if (split.length > 1) {
                                        str22 = split[0];
                                        if (m2285b(str22) && !this.f1895a.contains(str22)) {
                                            if (StatConfig.isDebugEnable()) {
                                                this.f1902i.m2361i("add new ip:" + str22);
                                            }
                                            this.f1895a.add(str22);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            this.f1902i.m2360e(e);
        }
        this.f1900f = new Random().nextInt(this.f1895a.size());
    }

    public String m2292b() {
        return this.f1897c;
    }

    public int m2293c() {
        return this.f1896b;
    }

    public void m2294d() {
        this.f1900f = (this.f1900f + 1) % this.f1895a.size();
    }

    public boolean m2295e() {
        return this.f1896b == 1;
    }

    public boolean m2296f() {
        return this.f1896b != 0;
    }

    void m2297g() {
        if (C0645q.m2456f(this.f1901h)) {
            if (StatConfig.f1798g) {
                m2288k();
            }
            this.f1897c = C0639k.m2419l(this.f1901h);
            if (StatConfig.isDebugEnable()) {
                this.f1902i.m2361i("NETWORK name:" + this.f1897c);
            }
            if (C0639k.m2405c(this.f1897c)) {
                if ("WIFI".equalsIgnoreCase(this.f1897c)) {
                    this.f1896b = 1;
                } else {
                    this.f1896b = 2;
                }
                this.f1898d = C0639k.m2396a(this.f1901h);
            }
            if (StatServiceImpl.m2230a()) {
                StatServiceImpl.m2240d(this.f1901h);
                return;
            }
            return;
        }
        if (StatConfig.isDebugEnable()) {
            this.f1902i.m2361i("NETWORK TYPE: network is close.");
        }
        m2289l();
    }

    public void m2298h() {
        this.f1901h.getApplicationContext().registerReceiver(new C0627b(this), new IntentFilter(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE));
    }
}
