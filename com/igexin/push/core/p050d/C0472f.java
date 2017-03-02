package com.igexin.push.core.p050d;

import android.util.Base64;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.config.C0367a;
import com.igexin.push.config.C0380n;
import com.igexin.push.core.p044c.C0444f;
import com.igexin.push.p035e.p049a.C0466b;

/* renamed from: com.igexin.push.core.d.f */
public class C0472f extends C0466b {
    public C0472f(String str) {
        super(str);
        m1654a();
    }

    public void m1654a() {
    }

    public void m1655a(Exception exception) {
        C0444f.m1577a().m1604d(System.currentTimeMillis());
        C0247a.m838b("-> get idc config " + exception.toString());
    }

    public void m1656a(byte[] bArr) {
        if (bArr != null) {
            try {
                String str = new String(C0259a.m882c(Base64.decode(bArr, 0)));
                C0247a.m838b("-> get idc config server resp data : " + str);
                if (str != null) {
                    C0367a.m1224a().m1232a(str);
                    C0380n.m1255a(str);
                    C0444f.m1577a().m1604d(0);
                }
            } catch (Exception e) {
                C0444f.m1577a().m1604d(System.currentTimeMillis());
                throw e;
            }
        }
    }

    public int m1657b() {
        return 0;
    }
}
