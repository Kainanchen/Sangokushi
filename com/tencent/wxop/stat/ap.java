package com.tencent.wxop.stat;

import android.content.Context;
import com.alipay.sdk.util.C0201h;
import com.tencent.wxop.stat.p069a.C0613e;
import com.tencent.wxop.stat.p069a.C0622j;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;

class ap implements Runnable {
    private Context f1935a;
    private Map<String, Integer> f1936b;
    private StatSpecifyReportedInfo f1937c;

    public ap(Context context, Map<String, Integer> map, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f1935a = null;
        this.f1936b = null;
        this.f1937c = null;
        this.f1935a = context;
        this.f1937c = statSpecifyReportedInfo;
        if (map != null) {
            this.f1936b = map;
        }
    }

    private NetworkMonitor m2299a(String str, int i) {
        Throwable th;
        NetworkMonitor networkMonitor = new NetworkMonitor();
        Socket socket = new Socket();
        int i2 = 0;
        try {
            networkMonitor.setDomain(str);
            networkMonitor.setPort(i);
            long currentTimeMillis = System.currentTimeMillis();
            SocketAddress inetSocketAddress = new InetSocketAddress(str, i);
            socket.connect(inetSocketAddress, 30000);
            networkMonitor.setMillisecondsConsume(System.currentTimeMillis() - currentTimeMillis);
            networkMonitor.setRemoteIp(inetSocketAddress.getAddress().getHostAddress());
            socket.close();
            try {
                socket.close();
            } catch (Throwable th2) {
                StatServiceImpl.f1839q.m2360e(th2);
            }
        } catch (Throwable e) {
            th2 = e;
            i2 = -1;
            StatServiceImpl.f1839q.m2360e(th2);
            socket.close();
        } catch (Throwable th22) {
            StatServiceImpl.f1839q.m2360e(th22);
        }
        networkMonitor.setStatusCode(i2);
        return networkMonitor;
    }

    private Map<String, Integer> m2300a() {
        Map<String, Integer> hashMap = new HashMap();
        String a = StatConfig.m2206a("__MTA_TEST_SPEED__", null);
        if (!(a == null || a.trim().length() == 0)) {
            for (String a2 : a2.split(C0201h.f510b)) {
                String[] split = a2.split(",");
                if (split != null && split.length == 2) {
                    String str = split[0];
                    if (!(str == null || str.trim().length() == 0)) {
                        try {
                            hashMap.put(str, Integer.valueOf(Integer.valueOf(split[1]).intValue()));
                        } catch (Throwable e) {
                            StatServiceImpl.f1839q.m2360e(e);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public void run() {
        try {
            if (this.f1936b == null) {
                this.f1936b = m2300a();
            }
            if (this.f1936b == null || this.f1936b.size() == 0) {
                StatServiceImpl.f1839q.m2361i("empty domain list.");
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (Entry entry : this.f1936b.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null || str.length() == 0) {
                    StatServiceImpl.f1839q.m2363w("empty domain name.");
                } else if (((Integer) entry.getValue()) == null) {
                    StatServiceImpl.f1839q.m2363w("port is null for " + str);
                } else {
                    jSONArray.put(m2299a((String) entry.getKey(), ((Integer) entry.getValue()).intValue()).toJSONObject());
                }
            }
            if (jSONArray.length() != 0) {
                C0613e c0622j = new C0622j(this.f1935a, StatServiceImpl.m2223a(this.f1935a, false, this.f1937c), this.f1937c);
                c0622j.m2277a(jSONArray.toString());
                new aq(c0622j).m2308a();
            }
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
        }
    }
}
