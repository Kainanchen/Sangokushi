package com.igexin.push.p047d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0378l;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.C0465c;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.C0485i;
import com.igexin.push.core.C0487k;
import com.igexin.push.core.p044c.C0461w;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.p035e.p036b.C0510e;
import com.igexin.push.p040c.C0350b;
import com.igexin.push.p040c.p042b.C0349b;
import com.igexin.push.p040c.p043c.C0351e;
import com.igexin.push.p040c.p043c.C0352a;
import com.igexin.push.p040c.p043c.C0354c;
import com.igexin.push.p040c.p043c.C0355d;
import com.igexin.push.p040c.p043c.C0356f;
import com.igexin.push.p040c.p043c.C0359i;
import com.igexin.push.p040c.p043c.C0361k;
import com.igexin.push.p040c.p043c.C0362l;
import com.igexin.push.p040c.p043c.C0363m;
import com.igexin.push.p040c.p043c.C0364n;
import com.igexin.push.p040c.p043c.C0365o;
import com.igexin.push.p052f.C0512a;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.zkunity.app.ResourceIDs;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.igexin.push.d.j */
public class C0504j {
    private static String f1391a;
    private Context f1392b;
    private C0244d f1393c;
    private C0401k f1394d;
    private boolean f1395e;
    private long f1396f;
    private long f1397g;
    private boolean f1398h;

    static {
        f1391a = "SNL";
    }

    public C0504j() {
        this.f1395e = false;
        this.f1396f = 0;
        this.f1397g = 0;
        this.f1398h = false;
    }

    private long m1791a(long j) {
        long j2 = j / 10;
        return ((long) (((Math.random() * ((double) j2)) * 2.0d) - ((double) j2))) + j;
    }

    private String m1792b(C0351e c0351e) {
        String str = Constants.STR_EMPTY;
        if (c0351e instanceof C0356f) {
            return "R-" + ((C0356f) c0351e).m1195a();
        }
        if (c0351e instanceof C0365o) {
            return "R-" + ((C0365o) c0351e).f996b;
        }
        if (c0351e instanceof C0359i) {
            return "S-" + String.valueOf(((C0359i) c0351e).f969a);
        }
        if (c0351e instanceof C0361k) {
            if (((C0361k) c0351e).f980e != 0) {
                return "S-" + String.valueOf(((C0361k) c0351e).f980e);
            }
        } else if (c0351e instanceof C0362l) {
            return "S-" + String.valueOf(((C0362l) c0351e).f981a);
        } else {
            if (c0351e instanceof C0363m) {
                return "S-" + String.valueOf(((C0363m) c0351e).f986e);
            }
            if (c0351e instanceof C0355d) {
                return "C-" + ((C0355d) c0351e).f954g;
            }
            if (c0351e instanceof C0364n) {
                return "C-" + ((C0364n) c0351e).f993g;
            }
            if (c0351e instanceof C0352a) {
                return "C-" + ((C0352a) c0351e).f933d;
            }
            if (c0351e instanceof C0354c) {
                return "C-" + ((C0354c) c0351e).f944d;
            }
        }
        return str;
    }

    private boolean m1793d() {
        if (C0378l.f1028o && this.f1396f + this.f1397g >= C0378l.f1029p) {
            C0495a c0495a = new C0495a();
            c0495a.m1744a(C0465c.check);
            C0482f.m1694a().m1713h().m1774a(c0495a);
        }
        return false;
    }

    private void m1794e() {
        Cursor cursor;
        Throwable th;
        Cursor a;
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            a = C0482f.m1694a().m1716k().m1146a("bi", new String[]{SocialConstants.PARAM_TYPE}, new String[]{Constants.VIA_TO_TYPE_QQ_GROUP}, null, null);
            if (a != null) {
                try {
                    if (a.getCount() == 0) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("loginerror_connecterror_count", Integer.valueOf(1));
                        contentValues.put("create_time", format);
                        contentValues.put(SocialConstants.PARAM_TYPE, Constants.VIA_TO_TYPE_QQ_GROUP);
                        C0482f.m1694a().m1716k().m1147a("bi", contentValues);
                    } else {
                        int i = 0;
                        while (a.moveToNext()) {
                            String string = a.getString(a.getColumnIndexOrThrow("create_time"));
                            String string2 = a.getString(a.getColumnIndexOrThrow(ResourceIDs.ID));
                            ContentValues contentValues2;
                            if (format.equals(string)) {
                                i = a.getInt(a.getColumnIndexOrThrow("loginerror_connecterror_count"));
                                contentValues2 = new ContentValues();
                                contentValues2.put("loginerror_connecterror_count", Integer.valueOf(i + 1));
                                C0482f.m1694a().m1716k().m1148a("bi", contentValues2, new String[]{ResourceIDs.ID}, new String[]{string2});
                            } else {
                                contentValues2 = new ContentValues();
                                contentValues2.put(SocialConstants.PARAM_TYPE, Constants.VIA_SSO_LOGIN);
                                C0482f.m1694a().m1716k().m1148a("bi", contentValues2, new String[]{ResourceIDs.ID}, new String[]{string2});
                                contentValues2 = new ContentValues();
                                contentValues2.put("loginerror_connecterror_count", Integer.valueOf(i + 1));
                                contentValues2.put("create_time", format);
                                contentValues2.put(SocialConstants.PARAM_TYPE, Constants.VIA_TO_TYPE_QQ_GROUP);
                                C0482f.m1694a().m1716k().m1147a("bi", contentValues2);
                            }
                        }
                    }
                } catch (Exception e) {
                    cursor = a;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
        } catch (Exception e2) {
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public int m1795a(String str, C0351e c0351e) {
        return m1796a(str, c0351e, false);
    }

    public int m1796a(String str, C0351e c0351e, boolean z) {
        if (str == null || c0351e == null) {
            return -1;
        }
        if (!C0483g.f1327m && !(c0351e instanceof C0359i) && !(c0351e instanceof C0356f)) {
            C0247a.m836a("snl|sendData|not online|" + c0351e.getClass().getName());
            return -3;
        } else if (!this.f1395e) {
            return C0482f.m1694a().m1713h().m1769a(str, c0351e);
        } else {
            if (z) {
                int i = 15;
                if (C0378l.f1018e > 0) {
                    i = C0378l.f1018e;
                }
                if (this.f1393c.m808a(SDKUrlConfig.getCmAddress(), 3, C0482f.m1694a().m1711f(), c0351e, true, i, new C0350b()) == null) {
                    return -2;
                }
            } else if (this.f1393c.m805a(SDKUrlConfig.getCmAddress(), 3, C0482f.m1694a().m1711f(), c0351e, true) == null) {
                return -2;
            }
            byte[] d = c0351e.m1176d();
            if (d != null) {
                this.f1397g = (((long) d.length) + 8) + this.f1397g;
            } else {
                this.f1397g += 8;
            }
            m1793d();
            return 0;
        }
    }

    public void m1797a(Context context, C0244d c0244d, C0401k c0401k) {
        this.f1392b = context;
        this.f1393c = c0244d;
        this.f1394d = c0401k;
    }

    public void m1798a(C0351e c0351e) {
        if (c0351e != null) {
            if (this.f1395e) {
                String b = m1792b(c0351e);
                if (!b.equals("S-") && !b.equals("R-")) {
                    if (b.length() > 0 && !b.equals("C-") && !b.equals("C-" + C0483g.f1333s) && !b.equals("R-" + C0483g.f1289A) && !b.equals("S-" + C0483g.f1332r)) {
                        C0482f.m1694a().m1713h().m1776b(b, c0351e);
                    } else if (this.f1394d != null) {
                        this.f1394d.m1326a(c0351e);
                    }
                    byte[] d = c0351e.m1176d();
                    if (d != null) {
                        this.f1396f = (((long) d.length) + 8) + this.f1396f;
                    } else {
                        this.f1396f += 8;
                    }
                    m1793d();
                }
            } else if (this.f1394d != null) {
                this.f1394d.m1326a(c0351e);
            }
        }
    }

    public void m1799a(boolean z) {
        if (this.f1395e != z) {
            this.f1395e = z;
            this.f1398h = false;
            if (z) {
                this.f1397g = 0;
                this.f1396f = 0;
                this.f1393c.m797a((Object) new C0349b());
                this.f1393c.m814d();
                return;
            }
            this.f1393c.m804a(SDKUrlConfig.getCmAddress().replaceFirst("socket", "disConnect"), 0, null);
        }
    }

    public boolean m1800a() {
        return this.f1395e;
    }

    public void m1801b() {
        C0483g.f1292D = 0;
        if (!this.f1395e && this.f1394d != null) {
            this.f1394d.m1327b();
        }
    }

    public void m1802b(boolean z) {
        if (z) {
            C0247a.m838b("disconnected by user");
            C0461w.m1631d();
            if (C0483g.f1327m) {
                C0483g.f1327m = false;
                C0402e.m1330a().m1393m();
            }
        } else {
            C0247a.m838b("disconnected|network");
            C0485i.m1729a().m1732a(C0487k.NETWORK_ERROR);
            C0461w.m1631d();
            C0461w.m1626a();
            m1794e();
            if (C0483g.f1327m) {
                C0483g.f1327m = false;
                C0402e.m1330a().m1393m();
            }
            C0247a.m838b("SNL autoReconnect notifyNetworkDisconnected");
            m1804c(true);
        }
        if (this.f1395e) {
            C0482f.m1694a().m1713h().m1778b();
        } else if (this.f1394d != null) {
            this.f1394d.m1325a(z);
        }
    }

    public long m1803c() {
        return C0483g.f1292D;
    }

    public void m1804c(boolean z) {
        if (C0483g.ax) {
            C0247a.m838b(f1391a + "autoReconnect isResetDelay = " + z);
            if (z) {
                C0483g.f1292D = 0;
                C0247a.m838b(f1391a + " isResetDelay = true, auto reconnect connect DelayTime = 0");
            }
            boolean a = C0402e.m1330a().m1363a(System.currentTimeMillis());
            boolean b = C0512a.m1844b();
            C0247a.m838b(f1391a + " autoReconnect isSdkOn = " + C0483g.f1324j + " isPushOn = " + C0483g.f1325k + " checkIsSilentTime = " + a + " isBlockEndTime = " + b + " isNetworkAvailable = " + C0483g.f1323i);
            if (C0483g.f1323i && C0483g.f1324j && C0483g.f1325k && !a && b) {
                if (C0483g.f1292D <= 0) {
                    C0483g.f1292D = 200;
                } else if (C0483g.f1292D <= 10000) {
                    C0483g.f1292D += 1000;
                } else {
                    C0483g.f1292D += 60000;
                }
                if (C0483g.f1292D > 3600000) {
                    C0483g.f1292D = 3600000;
                }
                C0483g.f1292D = m1791a(C0483g.f1292D);
                C0247a.m838b(f1391a + "autoReconnect reConnectDelayTime = " + C0483g.f1292D);
            } else {
                C0483g.f1292D = 3600000;
                C0247a.m838b(f1391a + "auto reconnect stop");
            }
            C0510e.m1828g().m1833h();
            return;
        }
        C0247a.m838b(f1391a + "|autoReconnect CoreRuntimeInfo.initSuccess = false");
    }
}
