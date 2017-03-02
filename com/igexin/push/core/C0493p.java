package com.igexin.push.core;

import com.igexin.push.config.C0378l;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.core.p048b.C0419c;
import com.igexin.push.core.p048b.C0421e;
import com.igexin.push.core.p048b.C0425i;
import com.igexin.sdk.aidl.C0492c;
import com.tencent.connect.common.Constants;

/* renamed from: com.igexin.push.core.p */
final class C0493p extends C0492c {
    C0493p() {
    }

    public byte[] extFunction(byte[] bArr) {
        return null;
    }

    public int isStarted(String str) {
        int a = C0419c.m1436a().m1437a(C0421e.m1442a().m1454b(str), C0425i.IS_STARTED);
        return (a != 0 || C0483g.f1324j) ? a : 1;
    }

    public int onASNLConnected(String str, String str2, String str3, long j) {
        return C0482f.m1694a() != null ? C0482f.m1694a().m1713h().m1768a(str3) : -1;
    }

    public int onASNLNetworkConnected() {
        if (C0482f.m1694a().m1712g().m1800a()) {
            return -1;
        }
        C0482f.m1694a().m1712g().m1801b();
        return 0;
    }

    public int onASNLNetworkDisconnected() {
        if (C0482f.m1694a().m1712g().m1800a()) {
            return -1;
        }
        C0482f.m1694a().m1712g().m1802b(false);
        return 0;
    }

    public int onPSNLConnected(String str, String str2, String str3, long j) {
        return (C0482f.m1694a() == null || str.equals(Constants.STR_EMPTY) || str2.equals(Constants.STR_EMPTY)) ? -1 : C0482f.m1694a().m1713h().m1770a(str, str2);
    }

    public int receiveToPSNL(String str, String str2, byte[] bArr) {
        return (str2 == null || bArr == null || C0482f.m1694a().m1712g().m1800a()) ? -1 : C0482f.m1694a().m1713h().m1777b(str, str2, bArr);
    }

    public int sendByASNL(String str, String str2, byte[] bArr) {
        return (str2 == null || bArr == null || !C0482f.m1694a().m1712g().m1800a()) ? -1 : C0482f.m1694a().m1713h().m1771a(str, str2, bArr);
    }

    public int setSilentTime(int i, int i2, String str) {
        String b = C0421e.m1442a().m1454b(str);
        int a = C0419c.m1436a().m1437a(b, C0425i.SET_SILENTTIME);
        if (a == 0 && C0378l.f1024k) {
            C0402e.m1330a().m1348a(i, i2, b);
        }
        return a;
    }

    public int startService(String str) {
        String b = C0421e.m1442a().m1454b(str);
        int a = C0419c.m1436a().m1437a(b, C0425i.START_SERVICE);
        if (a == 0) {
            C0482f.m1694a().m1705a(true);
            C0483g.f1291C = b;
        }
        return a;
    }

    public int stopService(String str) {
        String b = C0421e.m1442a().m1454b(str);
        int a = C0419c.m1436a().m1437a(b, C0425i.STOP_SERVICE);
        if (a == 0) {
            C0482f.m1694a().m1704a(b);
        }
        return a;
    }
}
