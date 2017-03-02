package com.igexin.push.core.p045a;

import android.text.TextUtils;
import com.igexin.getuiext.data.Consts;
import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.config.C0378l;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.p044c.C0444f;
import com.igexin.push.core.p044c.C0461w;
import com.igexin.push.core.p050d.C0473g;
import com.igexin.push.p035e.p049a.C0506c;
import com.igexin.push.p040c.p042b.C0349b;
import com.igexin.push.p040c.p043c.C0361k;
import com.igexin.push.p052f.C0513b;
import com.tencent.connect.common.Constants;

/* renamed from: com.igexin.push.core.a.i */
public class C0406i extends C0397a {
    public boolean m1412a(C0233d c0233d) {
        return false;
    }

    public boolean m1413a(Object obj) {
        boolean z = false;
        if (obj instanceof C0361k) {
            C0483g.f1292D = 0;
            if (!C0483g.f1327m) {
                C0461w.m1630c();
                if (((C0361k) obj).f976a) {
                    C0247a.m838b("loginRsp|" + C0483g.f1333s + "|success");
                    C0247a.m838b("isCidBroadcast|" + C0483g.f1328n);
                    if (!C0483g.f1328n) {
                        C0402e.m1330a().m1392l();
                        C0483g.f1328n = true;
                    }
                    C0483g.f1327m = true;
                    C0402e.m1330a().m1393m();
                    C0402e.m1330a().m1387g();
                    if (TextUtils.isEmpty(C0483g.f1340z)) {
                        C0247a.m838b("LoginResultAction device id is empty, get device id from server ++++++++++++");
                        C0402e.m1330a().m1388h();
                    }
                    C0513b.m1856f();
                    try {
                        long currentTimeMillis = System.currentTimeMillis() - C0483g.f1296H;
                        String e = C0402e.m1330a().m1384e("ua");
                        if (e == null || Constants.VIA_TO_TYPE_QQ_GROUP.equals(e)) {
                            z = true;
                        }
                        if (z && C0378l.f1021h && currentTimeMillis - 259200000 > 0) {
                            if (!C0259a.m877a(C0402e.m1330a().m1396p()).equals(C0402e.m1330a().m1394n()) || C0483g.f1296H == 0) {
                                C0483g.f1296H = System.currentTimeMillis();
                                C0402e.m1330a().m1395o();
                            }
                        }
                    } catch (Exception e2) {
                    }
                    try {
                        if ((System.currentTimeMillis() - C0483g.f1295G) - Consts.TIME_24HOUR > 0) {
                            C0402e.m1330a().m1390j();
                        }
                    } catch (Exception e3) {
                    }
                    if ((System.currentTimeMillis() - C0483g.f1294F) - Consts.TIME_24HOUR > 0) {
                        if (TextUtils.isEmpty(C0483g.f1340z)) {
                            if (C0483g.av != null) {
                                C0483g.av.m753t();
                                C0483g.av = null;
                            }
                            C0483g.av = new C0407j(this, 30000);
                            C0482f.m1694a().m1703a(C0483g.av);
                        } else {
                            C0402e.m1330a().m1389i();
                        }
                        C0483g.f1294F = System.currentTimeMillis();
                    }
                    try {
                        if ((System.currentTimeMillis() - C0483g.f1299K) - Consts.TIME_24HOUR > 0) {
                            C0244d.m802c().m795a(new C0506c(new C0473g(SDKUrlConfig.getConfigServiceUrl())), false, true);
                        }
                    } catch (Exception e4) {
                    }
                    C0444f.m1577a().m1595b();
                    C0482f.m1694a().m1713h().m1775a();
                } else {
                    C0247a.m838b("loginRsp|" + C0483g.f1333s + "|failed");
                    C0247a.m838b("LoginResultAction login failed, clear session or cid");
                    C0444f.m1577a().m1600c();
                    C0402e.m1330a().m1385e();
                    C0244d.m802c().m797a((Object) new C0349b());
                    C0244d.m802c().m814d();
                }
            }
        }
        return true;
    }
}
