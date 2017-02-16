package com.tencent.android.tpush.service.channel.security;

/* renamed from: com.tencent.android.tpush.service.channel.security.a */
public class ProGuard {
    static final /* synthetic */ boolean f7718a;

    static {
        f7718a = !ProGuard.class.desiredAssertionStatus();
    }

    public static byte[] m5274a(String str, int i) {
        return ProGuard.m5275a(str.getBytes(), i);
    }

    public static byte[] m5275a(byte[] bArr, int i) {
        return ProGuard.m5276a(bArr, 0, bArr.length, i);
    }

    public static byte[] m5276a(byte[] bArr, int i, int i2, int i3) {
        ProGuard proGuard = new ProGuard(i3, new byte[((i2 * 3) / 4)]);
        if (!proGuard.m5277a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        } else if (proGuard.b == proGuard.a.length) {
            return proGuard.a;
        } else {
            byte[] bArr2 = new byte[proGuard.b];
            System.arraycopy(proGuard.a, 0, bArr2, 0, proGuard.b);
            return bArr2;
        }
    }

    private ProGuard() {
    }
}
