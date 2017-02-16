package com.tencent.p080b.p081a;

import android.content.Context;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.p080b.p081a.p083b.C1039b;
import com.tencent.p080b.p081a.p083b.C1043f;
import com.tencent.p080b.p081a.p083b.C1049l;
import com.tencent.p080b.p081a.p083b.C1055r;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.http.HttpHost;

/* renamed from: com.tencent.b.a.g */
public class C1062g {
    private static C1062g f8187i;
    List<String> f8188a;
    volatile int f8189b;
    public volatile String f8190c;
    volatile HttpHost f8191d;
    int f8192e;
    Context f8193f;
    C1039b f8194g;
    private C1043f f8195h;

    static {
        f8187i = null;
    }

    private C1062g(Context context) {
        this.f8188a = null;
        this.f8189b = 2;
        this.f8190c = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f8191d = null;
        this.f8195h = null;
        this.f8192e = 0;
        this.f8193f = null;
        this.f8194g = null;
        this.f8193f = context.getApplicationContext();
        this.f8195h = new C1043f();
        ai.m5655a(context);
        this.f8194g = C1049l.m5693c();
        m5816e();
        this.f8188a = new ArrayList(10);
        this.f8188a.add("117.135.169.101");
        this.f8188a.add("140.207.54.125");
        this.f8188a.add("180.153.8.53");
        this.f8188a.add("120.198.203.175");
        this.f8188a.add("14.17.43.18");
        this.f8188a.add("163.177.71.186");
        this.f8188a.add("111.30.131.31");
        this.f8188a.add("123.126.121.167");
        this.f8188a.add("123.151.152.111");
        this.f8188a.add("113.142.45.79");
        this.f8188a.add("123.138.162.90");
        this.f8188a.add("103.7.30.94");
        m5819c();
    }

    public static C1062g m5813a(Context context) {
        if (f8187i == null) {
            synchronized (C1062g.class) {
                if (f8187i == null) {
                    f8187i = new C1062g(context);
                }
            }
        }
        return f8187i;
    }

    static boolean m5814a(String str) {
        return Pattern.compile("(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})").matcher(str).matches();
    }

    private String m5815d() {
        try {
            String str = Constants.UNSTALL_DOMAIN;
            if (!C1062g.m5814a(str)) {
                return InetAddress.getByName(str).getHostAddress();
            }
        } catch (Throwable e) {
            this.f8194g.m5665b(e);
        }
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }

    private void m5816e() {
        this.f8189b = 0;
        this.f8191d = null;
        this.f8190c = null;
    }

    public final boolean m5817a() {
        return this.f8189b == 1;
    }

    public final boolean m5818b() {
        return this.f8189b != 0;
    }

    final void m5819c() {
        if (C1055r.m5743e(this.f8193f)) {
            if (C1058c.f8133g) {
                String d = m5815d();
                if (C1058c.m5762b()) {
                    this.f8194g.m5662a("remoteIp ip is " + d);
                }
                if (C1049l.m5695c(d)) {
                    String str;
                    if (this.f8188a.contains(d)) {
                        str = d;
                    } else {
                        str = (String) this.f8188a.get(this.f8192e);
                        if (C1058c.m5762b()) {
                            this.f8194g.m5666c(d + " not in ip list, change to:" + str);
                        }
                    }
                    C1058c.m5764c("http://" + str + ":80/mstat/report");
                }
            }
            this.f8190c = C1049l.m5709j(this.f8193f);
            if (C1058c.m5762b()) {
                this.f8194g.m5662a("NETWORK name:" + this.f8190c);
            }
            if (C1049l.m5695c(this.f8190c)) {
                if ("WIFI".equalsIgnoreCase(this.f8190c)) {
                    this.f8189b = 1;
                } else {
                    this.f8189b = 2;
                }
                this.f8191d = C1049l.m5686a(this.f8193f);
            }
            if (C1060e.m5795a()) {
                C1060e.m5792a(this.f8193f);
                return;
            }
            return;
        }
        if (C1058c.m5762b()) {
            this.f8194g.m5662a((Object) "NETWORK TYPE: network is close.");
        }
        m5816e();
    }
}
