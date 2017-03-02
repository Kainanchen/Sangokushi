package com.igexin.push.core.p044c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.igexin.p022a.p023a.p024a.C0227a;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0483g;
import com.igexin.push.p052f.C0513b;
import com.igexin.push.p052f.C0515d;
import com.tencent.connect.common.Constants;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import com.zkunity.app.ResourceIDs;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.igexin.push.core.c.f */
public class C0444f implements C0366a {
    private static final String f1206a;
    private static C0444f f1207b;
    private Map f1208c;

    static {
        f1206a = C0377k.f1013a + "_RuntimeDataManager";
    }

    private C0444f() {
        this.f1208c = new HashMap();
    }

    public static C0444f m1577a() {
        if (f1207b == null) {
            f1207b = new C0444f();
        }
        return f1207b;
    }

    private void m1578a(SQLiteDatabase sQLiteDatabase, int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ResourceIDs.ID, Integer.valueOf(i));
        contentValues.put("value", str);
        sQLiteDatabase.replace("runtime", null, contentValues);
    }

    private void m1579a(SQLiteDatabase sQLiteDatabase, int i, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ResourceIDs.ID, Integer.valueOf(i));
        contentValues.put("value", bArr);
        sQLiteDatabase.replace("runtime", null, contentValues);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1584d(android.database.sqlite.SQLiteDatabase r6) {
        /*
        r5 = this;
        r0 = 0;
        r1 = "select value from runtime where id=25";
        r2 = 0;
        r0 = r6.rawQuery(r1, r2);	 Catch:{ Exception -> 0x0045, all -> 0x004c }
        if (r0 == 0) goto L_0x002f;
    L_0x000a:
        r1 = r0.moveToFirst();	 Catch:{ Exception -> 0x0045, all -> 0x0059 }
        if (r1 == 0) goto L_0x002f;
    L_0x0010:
        r1 = "value";
        r1 = r0.getColumnIndex(r1);	 Catch:{ Exception -> 0x0045, all -> 0x0059 }
        r1 = r0.getBlob(r1);	 Catch:{ Exception -> 0x0045, all -> 0x0059 }
        r2 = new java.lang.String;	 Catch:{ Exception -> 0x0045, all -> 0x0059 }
        r3 = com.igexin.push.core.C0483g.f1321g;	 Catch:{ Exception -> 0x0045, all -> 0x0059 }
        r3 = r3.getPackageName();	 Catch:{ Exception -> 0x0045, all -> 0x0059 }
        r3 = com.igexin.p022a.p031b.C0259a.m877a(r3);	 Catch:{ Exception -> 0x0045, all -> 0x0059 }
        r1 = com.igexin.p022a.p023a.p024a.C0227a.m722a(r1, r3);	 Catch:{ Exception -> 0x0045, all -> 0x0059 }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0045, all -> 0x0059 }
        com.igexin.push.core.C0483g.f1290B = r2;	 Catch:{ Exception -> 0x0045, all -> 0x0059 }
    L_0x002f:
        if (r0 == 0) goto L_0x0034;
    L_0x0031:
        r0.close();
    L_0x0034:
        r0 = com.igexin.push.core.C0483g.f1290B;
        if (r0 != 0) goto L_0x0044;
    L_0x0038:
        r0 = com.igexin.push.core.C0483g.f1335u;
        if (r0 != 0) goto L_0x0056;
    L_0x003c:
        r0 = "cantgetimei";
    L_0x003e:
        r0 = com.igexin.p022a.p031b.C0259a.m877a(r0);
        com.igexin.push.core.C0483g.f1290B = r0;
    L_0x0044:
        return;
    L_0x0045:
        r1 = move-exception;
        if (r0 == 0) goto L_0x0034;
    L_0x0048:
        r0.close();
        goto L_0x0034;
    L_0x004c:
        r1 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
    L_0x0050:
        if (r1 == 0) goto L_0x0055;
    L_0x0052:
        r1.close();
    L_0x0055:
        throw r0;
    L_0x0056:
        r0 = com.igexin.push.core.C0483g.f1335u;
        goto L_0x003e;
    L_0x0059:
        r1 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.c.f.d(android.database.sqlite.SQLiteDatabase):void");
    }

    private boolean m1585e() {
        return C0244d.m802c().m795a(new C0453o(this), false, true);
    }

    private byte[] m1586e(String str) {
        return C0515d.m1857a(str.getBytes());
    }

    private void m1587f() {
        C0513b.m1847a();
        String c = C0513b.m1853c();
        if (c == null || c.length() <= 5) {
            C0513b.m1855e();
        }
    }

    private String m1588g() {
        String str = Constants.STR_EMPTY;
        Random random = new Random(Math.abs(new Random().nextLong()));
        for (int i = 0; i < 15; i++) {
            str = str + random.nextInt(10);
        }
        return str;
    }

    public void m1589a(SQLiteDatabase sQLiteDatabase) {
    }

    public boolean m1590a(int i) {
        C0483g.f1309U = i;
        C0244d.m802c().m795a(new C0452n(this), false, true);
        return true;
    }

    public boolean m1591a(long j) {
        C0483g.m1724a(j);
        C0244d.m802c().m795a(new C0455q(this), false, true);
        return true;
    }

    public boolean m1592a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C0483g.f1338x = str;
        return C0244d.m802c().m795a(new C0454p(this), false, true);
    }

    public boolean m1593a(String str, String str2, long j) {
        C0483g.f1332r = j;
        if (TextUtils.isEmpty(C0483g.f1340z)) {
            C0483g.f1340z = str2;
        }
        C0483g.f1333s = str;
        return m1585e();
    }

    public boolean m1594a(boolean z) {
        if (C0483g.f1302N == z) {
            return false;
        }
        C0483g.f1302N = z;
        C0244d.m802c().m795a(new C0449k(this), false, true);
        return true;
    }

    public void m1595b() {
        C0244d.m802c().m795a(new C0445g(this), false, true);
    }

    public void m1596b(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery;
        long parseLong;
        Throwable th;
        String b;
        Cursor cursor = null;
        m1584d(sQLiteDatabase);
        try {
            rawQuery = sQLiteDatabase.rawQuery("select id, value from runtime order by id", null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    try {
                        byte[] blob;
                        String str;
                        int i = rawQuery.getInt(0);
                        if (i == 1 || i == 14 || i == 19 || i == 20 || i == 25) {
                            blob = rawQuery.getBlob(1);
                            str = null;
                        } else {
                            str = rawQuery.getString(1);
                            blob = null;
                        }
                        switch (i) {
                            case StatConstants.XG_PRO_VERSION /*1*/:
                                str = new String(C0227a.m722a(blob, C0483g.f1290B));
                                if (str != null) {
                                    try {
                                        if (!str.equals("null")) {
                                            parseLong = Long.parseLong(str);
                                            C0483g.f1332r = parseLong;
                                            break;
                                        }
                                    } catch (Exception e) {
                                        C0483g.f1332r = 0;
                                        break;
                                    } catch (Throwable th2) {
                                        Throwable th3 = th2;
                                        cursor = rawQuery;
                                        th = th3;
                                        break;
                                    }
                                }
                                parseLong = 0;
                                C0483g.f1332r = parseLong;
                            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                                if (str.equals("null")) {
                                    str = null;
                                }
                                C0483g.f1340z = str;
                                break;
                            case StatConstants.STAT_DB_VERSION /*3*/:
                                if (str.equals("null")) {
                                    str = null;
                                }
                                C0483g.f1289A = str;
                                break;
                            case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                                C0483g.f1326l = str.equals("null") ? true : Boolean.parseBoolean(str);
                                break;
                            case StatAccount.EMAIL_TYPE /*6*/:
                                C0483g.f1294F = str.equals("null") ? 0 : Long.parseLong(str);
                                break;
                            case StatAccount.CUSTOM_TYPE /*7*/:
                                C0483g.f1295G = str.equals("null") ? 0 : Long.parseLong(str);
                                break;
                            case IMediaObject.TYPE_EMOJI /*8*/:
                                C0483g.f1296H = str.equals("null") ? 0 : Long.parseLong(str);
                                break;
                            case ConstantsAPI.COMMAND_ADD_CARD_TO_EX_CARD_PACKAGE /*9*/:
                                C0483g.f1304P = str.equals("null") ? 0 : Long.parseLong(str);
                                break;
                            case IMediaObject.TYPE_PRODUCT /*10*/:
                                C0483g.f1305Q = str.equals("null") ? 0 : Long.parseLong(str);
                                break;
                            case IMediaObject.TYPE_EMOTICON_GIFT /*11*/:
                                C0483g.f1299K = str.equals("null") ? 0 : Long.parseLong(str);
                                break;
                            case IMediaObject.TYPE_DEVICE_ACCESS /*12*/:
                                C0483g.f1300L = str.equals("null") ? 0 : Long.parseLong(str);
                                break;
                            case IMediaObject.TYPE_MALL_PRODUCT /*13*/:
                                if (str.equals("null")) {
                                    str = null;
                                }
                                C0483g.f1301M = str;
                                break;
                            case IMediaObject.TYPE_OLD_TV /*14*/:
                                C0483g.au = new String(C0227a.m722a(blob, C0483g.f1290B));
                                break;
                            case IMediaObject.TYPE_EMOTICON_SHARED /*15*/:
                                if (!str.equals("null")) {
                                    C0483g.f1302N = Boolean.parseBoolean(str);
                                    break;
                                }
                                break;
                            case IMediaObject.TYPE_CARD_SHARE /*16*/:
                                C0483g.f1303O = str.equals("null") ? 0 : Long.parseLong(str);
                                break;
                            case IMediaObject.TYPE_LOCATION_SHARE /*17*/:
                                if (str.equals("null")) {
                                    str = null;
                                }
                                C0483g.f1307S = str;
                                break;
                            case 18:
                                C0483g.f1309U = str.equals("null") ? 0 : Integer.parseInt(str);
                                break;
                            case IMediaObject.TYPE_RECORD /*19*/:
                                str = new String(C0227a.m722a(blob, C0483g.f1290B));
                                if (str.equals("null")) {
                                    str = null;
                                }
                                C0483g.f1338x = str;
                                break;
                            case IMediaObject.TYPE_TV /*20*/:
                                str = new String(C0227a.m722a(blob, C0483g.f1290B));
                                if (str.equals("null")) {
                                    str = null;
                                }
                                C0483g.f1334t = str;
                                C0483g.f1333s = str;
                                break;
                            case 21:
                                C0483g.aw = str.equals("null") ? 0 : Long.parseLong(str);
                                break;
                            default:
                                break;
                        }
                    } catch (Exception e2) {
                    } catch (Throwable th22) {
                        Throwable th32 = th22;
                        cursor = rawQuery;
                        th = th32;
                        break;
                    }
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e3) {
            rawQuery = null;
            if (rawQuery != null) {
                rawQuery.close();
            }
            if (C0483g.f1332r == 0) {
                parseLong = C0513b.m1854d();
                if (parseLong != 0) {
                    C0483g.f1332r = parseLong;
                    m1579a(sQLiteDatabase, 1, C0515d.m1857a(String.valueOf(parseLong).getBytes()));
                }
            }
            if (C0483g.f1333s == null) {
                b = C0513b.m1851b();
                if (b != null) {
                    C0483g.f1334t = b;
                    C0483g.f1333s = b;
                    m1579a(sQLiteDatabase, 20, C0515d.m1857a(String.valueOf(C0483g.f1333s).getBytes()));
                }
            }
            C0483g.f1334t = C0259a.m877a(String.valueOf(C0483g.f1332r));
            C0483g.m1724a(C0483g.f1332r);
            m1579a(sQLiteDatabase, 20, C0515d.m1857a(String.valueOf(C0483g.f1333s).getBytes()));
            if ("cfcd208495d565ef66e7dff9f98764da".equals(C0483g.f1333s)) {
                if (C0483g.f1332r == 0) {
                    C0483g.f1334t = null;
                    C0483g.f1333s = null;
                    C0483g.f1332r = 0;
                } else {
                    C0444f.m1577a().m1591a(C0483g.f1332r);
                    C0483g.f1334t = C0483g.f1333s;
                    C0513b.m1856f();
                }
            }
            C0483g.au = C0259a.m875a(32);
            m1579a(sQLiteDatabase, 14, C0515d.m1857a(C0483g.au.getBytes()));
            b = C0513b.m1853c();
            C0483g.f1340z = b;
            m1578a(sQLiteDatabase, 2, String.valueOf(C0483g.f1340z));
            if (C0483g.f1289A == null) {
                b = C0483g.f1335u;
                if (b == null) {
                    b = "V" + m1588g();
                }
                C0483g.f1289A = "A-" + b + "-" + System.currentTimeMillis();
                m1578a(sQLiteDatabase, 3, String.valueOf(C0483g.f1289A));
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (C0483g.f1332r == 0) {
            parseLong = C0513b.m1854d();
            if (parseLong != 0) {
                C0483g.f1332r = parseLong;
                m1579a(sQLiteDatabase, 1, C0515d.m1857a(String.valueOf(parseLong).getBytes()));
            }
        }
        if (C0483g.f1333s == null) {
            b = C0513b.m1851b();
            if (b != null) {
                C0483g.f1334t = b;
                C0483g.f1333s = b;
                m1579a(sQLiteDatabase, 20, C0515d.m1857a(String.valueOf(C0483g.f1333s).getBytes()));
            }
        }
        if (C0483g.f1333s == null && C0483g.f1332r != 0) {
            C0483g.f1334t = C0259a.m877a(String.valueOf(C0483g.f1332r));
            C0483g.m1724a(C0483g.f1332r);
            m1579a(sQLiteDatabase, 20, C0515d.m1857a(String.valueOf(C0483g.f1333s).getBytes()));
        }
        if ("cfcd208495d565ef66e7dff9f98764da".equals(C0483g.f1333s)) {
            if (C0483g.f1332r == 0) {
                C0444f.m1577a().m1591a(C0483g.f1332r);
                C0483g.f1334t = C0483g.f1333s;
                C0513b.m1856f();
            } else {
                C0483g.f1334t = null;
                C0483g.f1333s = null;
                C0483g.f1332r = 0;
            }
        }
        if (TextUtils.isEmpty(C0483g.au) || "null".equals(C0483g.au)) {
            C0483g.au = C0259a.m875a(32);
            m1579a(sQLiteDatabase, 14, C0515d.m1857a(C0483g.au.getBytes()));
        }
        b = C0513b.m1853c();
        if (C0483g.f1340z == null && b != null && b.length() > 5) {
            C0483g.f1340z = b;
            m1578a(sQLiteDatabase, 2, String.valueOf(C0483g.f1340z));
        }
        if (C0483g.f1289A == null) {
            b = C0483g.f1335u;
            if (b == null) {
                b = "V" + m1588g();
            }
            C0483g.f1289A = "A-" + b + "-" + System.currentTimeMillis();
            m1578a(sQLiteDatabase, 3, String.valueOf(C0483g.f1289A));
        }
    }

    public boolean m1597b(long j) {
        if (C0483g.f1304P == j) {
            return false;
        }
        C0483g.f1304P = j;
        C0244d.m802c().m795a(new C0457s(this), false, true);
        return true;
    }

    public boolean m1598b(String str) {
        C0483g.f1340z = str;
        C0244d.m802c().m795a(new C0456r(this), false, true);
        return true;
    }

    public void m1599c(SQLiteDatabase sQLiteDatabase) {
        m1579a(sQLiteDatabase, 1, C0227a.m724b(String.valueOf(C0483g.f1332r).getBytes(), C0483g.f1290B));
        m1578a(sQLiteDatabase, 4, String.valueOf(C0483g.f1326l));
        m1578a(sQLiteDatabase, 8, String.valueOf(C0483g.f1296H));
        m1578a(sQLiteDatabase, 7, String.valueOf(C0483g.f1295G));
        m1578a(sQLiteDatabase, 6, String.valueOf(C0483g.f1294F));
        m1578a(sQLiteDatabase, 9, String.valueOf(C0483g.f1304P));
        m1578a(sQLiteDatabase, 10, String.valueOf(C0483g.f1305Q));
        m1578a(sQLiteDatabase, 3, String.valueOf(C0483g.f1289A));
        m1578a(sQLiteDatabase, 11, String.valueOf(C0483g.f1299K));
        m1578a(sQLiteDatabase, 12, String.valueOf(C0483g.f1300L));
        m1579a(sQLiteDatabase, 20, C0227a.m724b(String.valueOf(C0483g.f1333s).getBytes(), C0483g.f1290B));
        m1578a(sQLiteDatabase, 2, String.valueOf(C0483g.f1340z));
        m1579a(sQLiteDatabase, 25, C0227a.m724b(C0483g.f1290B.getBytes(), C0259a.m877a(C0483g.f1321g.getPackageName())));
    }

    public boolean m1600c() {
        C0483g.f1332r = 0;
        C0483g.f1333s = null;
        return m1585e();
    }

    public boolean m1601c(long j) {
        if (C0483g.f1300L == j) {
            return false;
        }
        C0483g.f1300L = j;
        C0244d.m802c().m795a(new C0458t(this), false, true);
        return true;
    }

    public boolean m1602c(String str) {
        if (str == null || str.equals(C0483g.f1301M)) {
            return false;
        }
        C0483g.f1301M = str;
        C0244d.m802c().m795a(new C0448j(this), false, true);
        return true;
    }

    public Map m1603d() {
        return this.f1208c;
    }

    public boolean m1604d(long j) {
        C0483g.aw = j;
        C0247a.m838b(f1206a + " save idc config failed time : " + j);
        C0244d.m802c().m795a(new C0459u(this, j), false, true);
        return true;
    }

    public boolean m1605d(String str) {
        if (str.equals(C0483g.f1307S)) {
            return false;
        }
        C0483g.f1307S = str;
        C0244d.m802c().m795a(new C0451m(this), false, true);
        return true;
    }

    public boolean m1606e(long j) {
        if (C0483g.f1305Q == j) {
            return false;
        }
        C0483g.f1305Q = j;
        C0244d.m802c().m795a(new C0460v(this), false, true);
        return true;
    }

    public boolean m1607f(long j) {
        if (C0483g.f1295G == j) {
            return false;
        }
        C0483g.f1295G = j;
        C0244d.m802c().m795a(new C0446h(this), false, true);
        return true;
    }

    public boolean m1608g(long j) {
        if (C0483g.f1299K == j) {
            return false;
        }
        C0483g.f1299K = j;
        C0244d.m802c().m795a(new C0447i(this), false, true);
        return true;
    }

    public boolean m1609h(long j) {
        if (C0483g.f1303O == j) {
            return false;
        }
        C0483g.f1303O = j;
        C0244d.m802c().m795a(new C0450l(this), false, true);
        return true;
    }
}
