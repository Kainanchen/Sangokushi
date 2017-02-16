package com.facebook.p035g;

import com.facebook.common.p014e.FLog;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.facebook.g.d */
public class TiffUtil {
    private static final Class<?> f1533a;

    /* renamed from: com.facebook.g.d.a */
    private static class TiffUtil {
        boolean f1530a;
        int f1531b;
        int f1532c;

        private TiffUtil() {
        }
    }

    TiffUtil() {
    }

    static {
        f1533a = TiffUtil.class;
    }

    public static int m1467a(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return 0;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                return 180;
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                return 90;
            case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                return 270;
            default:
                FLog.m1052b(f1533a, "Unsupported orientation");
                return 0;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m1468a(java.io.InputStream r12, int r13) {
        /*
        r6 = 8;
        r1 = 1;
        r11 = 4;
        r10 = 2;
        r2 = 0;
        r5 = new com.facebook.g.d$a;
        r5.<init>();
        if (r13 > r6) goto L_0x0017;
    L_0x000d:
        r0 = r2;
    L_0x000e:
        r3 = r5.f1532c;
        r3 = r3 + -8;
        if (r0 == 0) goto L_0x0016;
    L_0x0014:
        if (r3 <= r0) goto L_0x005f;
    L_0x0016:
        return r2;
    L_0x0017:
        r0 = com.facebook.p035g.StreamProcessor.m1466a(r12, r11, r2);
        r5.f1531b = r0;
        r3 = r13 + -4;
        r0 = r5.f1531b;
        r4 = 1229531648; // 0x49492a00 float:823968.0 double:6.074693478E-315;
        if (r0 == r4) goto L_0x0036;
    L_0x0026:
        r0 = r5.f1531b;
        r4 = 1296891946; // 0x4d4d002a float:2.14958752E8 double:6.40749757E-315;
        if (r0 == r4) goto L_0x0036;
    L_0x002d:
        r0 = f1533a;
        r3 = "Invalid TIFF header";
        com.facebook.common.p014e.FLog.m1061d(r0, r3);
        r0 = r2;
        goto L_0x000e;
    L_0x0036:
        r0 = r5.f1531b;
        r4 = 1229531648; // 0x49492a00 float:823968.0 double:6.074693478E-315;
        if (r0 != r4) goto L_0x005d;
    L_0x003d:
        r0 = r1;
    L_0x003e:
        r5.f1530a = r0;
        r0 = r5.f1530a;
        r0 = com.facebook.p035g.StreamProcessor.m1466a(r12, r11, r0);
        r5.f1532c = r0;
        r0 = r3 + -4;
        r3 = r5.f1532c;
        if (r3 < r6) goto L_0x0054;
    L_0x004e:
        r3 = r5.f1532c;
        r3 = r3 + -8;
        if (r3 <= r0) goto L_0x000e;
    L_0x0054:
        r0 = f1533a;
        r3 = "Invalid offset";
        com.facebook.common.p014e.FLog.m1061d(r0, r3);
        r0 = r2;
        goto L_0x000e;
    L_0x005d:
        r0 = r2;
        goto L_0x003e;
    L_0x005f:
        r6 = (long) r3;
        r12.skip(r6);
        r3 = r0 - r3;
        r6 = r5.f1530a;
        r0 = 14;
        if (r3 < r0) goto L_0x00aa;
    L_0x006b:
        r0 = com.facebook.p035g.StreamProcessor.m1466a(r12, r10, r6);
        r3 = r3 + -2;
        r4 = r3;
    L_0x0072:
        r3 = r0 + -1;
        if (r0 <= 0) goto L_0x00aa;
    L_0x0076:
        r0 = 12;
        if (r4 < r0) goto L_0x00aa;
    L_0x007a:
        r7 = com.facebook.p035g.StreamProcessor.m1466a(r12, r10, r6);
        r0 = r4 + -2;
        r4 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        if (r7 != r4) goto L_0x00a0;
    L_0x0084:
        r3 = r5.f1530a;
        r4 = 10;
        if (r0 < r4) goto L_0x0016;
    L_0x008a:
        r0 = com.facebook.p035g.StreamProcessor.m1466a(r12, r10, r3);
        r4 = 3;
        if (r0 != r4) goto L_0x0016;
    L_0x0091:
        r0 = com.facebook.p035g.StreamProcessor.m1466a(r12, r11, r3);
        if (r0 != r1) goto L_0x0016;
    L_0x0097:
        r2 = com.facebook.p035g.StreamProcessor.m1466a(r12, r10, r3);
        com.facebook.p035g.StreamProcessor.m1466a(r12, r10, r3);
        goto L_0x0016;
    L_0x00a0:
        r8 = 10;
        r12.skip(r8);
        r0 = r0 + -10;
        r4 = r0;
        r0 = r3;
        goto L_0x0072;
    L_0x00aa:
        r0 = r2;
        goto L_0x0084;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.g.d.a(java.io.InputStream, int):int");
    }
}
