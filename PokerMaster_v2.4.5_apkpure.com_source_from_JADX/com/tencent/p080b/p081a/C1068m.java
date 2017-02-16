package com.tencent.p080b.p081a;

import android.content.Context;
import com.tencent.p080b.p081a.p082a.C1029d;
import com.tencent.p080b.p081a.p082a.C1035g;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;

/* renamed from: com.tencent.b.a.m */
final class C1068m implements Runnable {
    private Context f8202a;
    private Map<String, Integer> f8203b;
    private C1061f f8204c;

    public C1068m(Context context) {
        this.f8202a = null;
        this.f8203b = null;
        this.f8204c = null;
        this.f8202a = context;
        this.f8204c = null;
    }

    private static C1057b m5820a(String str, int i) {
        Throwable th;
        C1057b c1057b = new C1057b();
        Socket socket = new Socket();
        int i2 = 0;
        try {
            c1057b.f8104c = str;
            c1057b.f8105d = i;
            long currentTimeMillis = System.currentTimeMillis();
            SocketAddress inetSocketAddress = new InetSocketAddress(str, i);
            socket.connect(inetSocketAddress, 30000);
            c1057b.f8102a = System.currentTimeMillis() - currentTimeMillis;
            c1057b.f8106e = inetSocketAddress.getAddress().getHostAddress();
            socket.close();
            try {
                socket.close();
            } catch (Throwable th2) {
                C1060e.f8178q.m5665b(th2);
            }
        } catch (Throwable e) {
            th2 = e;
            i2 = -1;
            C1060e.f8178q.m5665b(th2);
            socket.close();
        } catch (Throwable th22) {
            C1060e.f8178q.m5665b(th22);
        }
        c1057b.f8103b = i2;
        return c1057b;
    }

    private static Map<String, Integer> m5821a() {
        Map<String, Integer> hashMap = new HashMap();
        String a = C1058c.m5749a("__MTA_TEST_SPEED__");
        if (!(a == null || a.trim().length() == 0)) {
            for (String a2 : a2.split(";")) {
                String[] split = a2.split(",");
                if (split != null && split.length == 2) {
                    String str = split[0];
                    if (!(str == null || str.trim().length() == 0)) {
                        try {
                            hashMap.put(str, Integer.valueOf(Integer.valueOf(split[1]).intValue()));
                        } catch (Throwable e) {
                            C1060e.f8178q.m5665b(e);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public final void run() {
        try {
            if (this.f8203b == null) {
                this.f8203b = C1068m.m5821a();
            }
            if (this.f8203b == null || this.f8203b.size() == 0) {
                C1060e.f8178q.m5662a((Object) "empty domain list.");
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (Entry entry : this.f8203b.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null || str.length() == 0) {
                    C1060e.f8178q.m5666c("empty domain name.");
                } else if (((Integer) entry.getValue()) == null) {
                    C1060e.f8178q.m5666c("port is null for " + str);
                } else {
                    jSONArray.put(C1068m.m5820a((String) entry.getKey(), ((Integer) entry.getValue()).intValue()).m5746a());
                }
            }
            if (jSONArray.length() != 0) {
                C1029d c1035g = new C1035g(this.f8202a, C1060e.m5788a(this.f8202a, this.f8204c), this.f8204c);
                c1035g.f7984a = jSONArray.toString();
                new C1069n(c1035g).m5827a();
            }
        } catch (Throwable th) {
            C1060e.f8178q.m5665b(th);
        }
    }
}
