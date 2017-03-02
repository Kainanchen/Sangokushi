package com.igexin.push.core.p044c;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.alipay.sdk.packet.C0182d;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.core.bean.C0435i;
import com.tencent.open.SocialConstants;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import com.zkunity.app.ResourceIDs;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.igexin.push.core.c.c */
public class C0441c implements C0366a {
    private static C0441c f1201a;
    private List f1202b;

    private C0441c() {
        this.f1202b = new CopyOnWriteArrayList();
    }

    private int m1565a(int i) {
        int i2 = 0;
        for (C0435i c : this.f1202b) {
            i2 = c.m1526c() == i ? i2 + 1 : i2;
        }
        return i2;
    }

    public static C0441c m1566a() {
        if (f1201a == null) {
            f1201a = new C0441c();
        }
        return f1201a;
    }

    private static ContentValues m1567b(C0435i c0435i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ResourceIDs.ID, Long.valueOf(c0435i.m1523a()));
        contentValues.put(C0182d.f429k, C0259a.m881b(c0435i.m1525b().getBytes()));
        contentValues.put(SocialConstants.PARAM_TYPE, Byte.valueOf(c0435i.m1526c()));
        contentValues.put("time", Long.valueOf(c0435i.m1527d()));
        return contentValues;
    }

    private C0435i m1568b(long j) {
        for (C0435i c0435i : this.f1202b) {
            if (c0435i.m1523a() == j) {
                return c0435i;
            }
        }
        return null;
    }

    public void m1569a(SQLiteDatabase sQLiteDatabase) {
    }

    public void m1570a(C0435i c0435i) {
        if (c0435i != null && this.f1202b.size() < 47) {
            switch (c0435i.m1526c()) {
                case StatConstants.XG_PRO_VERSION /*1*/:
                    if (m1565a(1) >= 1) {
                        return;
                    }
                    break;
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    if (m1565a(2) >= 3) {
                        return;
                    }
                    break;
                case StatConstants.STAT_DB_VERSION /*3*/:
                    if (m1565a(3) >= 30) {
                        return;
                    }
                    break;
                case StatAccount.PHONE_NUM_TYPE /*5*/:
                    if (m1565a(5) >= 3) {
                        return;
                    }
                    break;
                case StatAccount.EMAIL_TYPE /*6*/:
                    if (m1565a(6) >= 10) {
                        return;
                    }
                    break;
            }
            this.f1202b.add(c0435i);
            C0244d.m802c().m795a(new C0442d(this, C0441c.m1567b(c0435i)), false, true);
        }
    }

    public boolean m1571a(long j) {
        C0435i b = m1568b(j);
        if (b == null) {
            return false;
        }
        this.f1202b.remove(b);
        C0244d.m802c().m795a(new C0443e(this, C0441c.m1567b(b), j), true, false);
        return true;
    }

    public List m1572b() {
        return this.f1202b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1573b(android.database.sqlite.SQLiteDatabase r13) {
        /*
        r12 = this;
        r0 = 0;
        r1 = "select id,data,type,time from ral";
        r2 = 0;
        r0 = r13.rawQuery(r1, r2);	 Catch:{ Exception -> 0x0049, all -> 0x0056 }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        if (r0 == 0) goto L_0x0050;
    L_0x000e:
        r1 = r0.moveToNext();	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        if (r1 == 0) goto L_0x0050;
    L_0x0014:
        r1 = 0;
        r2 = r0.getLong(r1);	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r4 = new java.lang.String;	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r1 = 1;
        r1 = r0.getBlob(r1);	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r1 = com.igexin.p022a.p031b.C0259a.m882c(r1);	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r4.<init>(r1);	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r1 = 2;
        r1 = r0.getInt(r1);	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r5 = (byte) r1;	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r1 = 3;
        r6 = r0.getLong(r1);	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r10 = r12.f1202b;	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r1 = new com.igexin.push.core.bean.i;	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r1.<init>(r2, r4, r5, r6);	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r10.add(r1);	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        r4 = r8 - r6;
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x000e;
    L_0x0045:
        r12.m1571a(r2);	 Catch:{ Exception -> 0x0049, all -> 0x0060 }
        goto L_0x000e;
    L_0x0049:
        r1 = move-exception;
        if (r0 == 0) goto L_0x004f;
    L_0x004c:
        r0.close();
    L_0x004f:
        return;
    L_0x0050:
        if (r0 == 0) goto L_0x004f;
    L_0x0052:
        r0.close();
        goto L_0x004f;
    L_0x0056:
        r1 = move-exception;
        r11 = r1;
        r1 = r0;
        r0 = r11;
    L_0x005a:
        if (r1 == 0) goto L_0x005f;
    L_0x005c:
        r1.close();
    L_0x005f:
        throw r0;
    L_0x0060:
        r1 = move-exception;
        r11 = r1;
        r1 = r0;
        r0 = r11;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.c.c.b(android.database.sqlite.SQLiteDatabase):void");
    }

    public void m1574c(SQLiteDatabase sQLiteDatabase) {
    }
}
