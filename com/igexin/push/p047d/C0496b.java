package com.igexin.push.p047d;

import android.content.ServiceConnection;
import com.igexin.sdk.aidl.IGexinMsgService;

/* renamed from: com.igexin.push.d.b */
public class C0496b {
    private String f1364a;
    private String f1365b;
    private IGexinMsgService f1366c;
    private ServiceConnection f1367d;
    private String f1368e;

    public String m1745a() {
        return this.f1364a;
    }

    public void m1746a(ServiceConnection serviceConnection) {
        this.f1367d = serviceConnection;
    }

    public void m1747a(IGexinMsgService iGexinMsgService) {
        this.f1366c = iGexinMsgService;
    }

    public void m1748a(String str) {
        this.f1364a = str;
    }

    public String m1749b() {
        return this.f1365b;
    }

    public void m1750b(String str) {
        this.f1365b = str;
    }

    public IGexinMsgService m1751c() {
        return this.f1366c;
    }

    public void m1752c(String str) {
        this.f1368e = str;
    }

    public ServiceConnection m1753d() {
        return this.f1367d;
    }

    public String m1754e() {
        return this.f1368e;
    }
}
