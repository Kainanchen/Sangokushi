package com.tencent.wxop.stat.common;

import com.tencent.wxop.stat.StatAccount;

/* renamed from: com.tencent.wxop.stat.common.g */
public class C0635g {
    static final /* synthetic */ boolean f2026a;

    static {
        f2026a = !C0635g.class.desiredAssertionStatus();
    }

    private C0635g() {
    }

    public static byte[] m2379a(byte[] bArr, int i) {
        return C0635g.m2380a(bArr, 0, bArr.length, i);
    }

    public static byte[] m2380a(byte[] bArr, int i, int i2, int i3) {
        C0637i c0637i = new C0637i(i3, new byte[((i2 * 3) / 4)]);
        if (!c0637i.m2383a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        } else if (c0637i.b == c0637i.a.length) {
            return c0637i.a;
        } else {
            Object obj = new byte[c0637i.b];
            System.arraycopy(c0637i.a, 0, obj, 0, c0637i.b);
            return obj;
        }
    }

    public static byte[] m2381b(byte[] bArr, int i) {
        return C0635g.m2382b(bArr, 0, bArr.length, i);
    }

    public static byte[] m2382b(byte[] bArr, int i, int i2, int i3) {
        C0638j c0638j = new C0638j(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!c0638j.f2038d) {
            switch (i2 % 3) {
                case StatAccount.DEFAULT_TYPE /*0*/:
                    break;
                case StatConstants.XG_PRO_VERSION /*1*/:
                    i4 += 2;
                    break;
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    i4 += 3;
                    break;
                default:
                    break;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (c0638j.f2039e && i2 > 0) {
            i4 += (c0638j.f2040f ? 2 : 1) * (((i2 - 1) / 57) + 1);
        }
        c0638j.a = new byte[i4];
        c0638j.m2384a(bArr, i, i2, true);
        if (f2026a || c0638j.b == i4) {
            return c0638j.a;
        }
        throw new AssertionError();
    }
}
