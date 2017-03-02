package com.igexin.push.p047d;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.config.C0378l;
import com.igexin.push.core.C0465c;
import com.igexin.push.core.C0478d;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.C0494q;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.p035e.p036b.C0395f;
import com.igexin.push.p040c.p043c.C0351e;
import com.igexin.push.p040c.p043c.C0352a;
import com.igexin.push.p040c.p043c.C0353b;
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
import com.igexin.sdk.PushBuildConfig;
import com.igexin.sdk.PushService;
import com.tencent.connect.common.Constants;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.igexin.push.d.c */
public class C0497c {
    private Context f1369a;
    private C0478d f1370b;
    private C0395f f1371c;
    private C0395f f1372d;
    private C0496b f1373e;
    private List f1374f;
    private Map f1375g;
    private Map f1376h;
    private boolean f1377i;

    private C0351e m1755a(byte[] bArr) {
        C0353b b = m1758b(bArr);
        C0351e c0351e = null;
        switch (b.f938b) {
            case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                c0351e = new C0359i();
                break;
            case StatAccount.PHONE_NUM_TYPE /*5*/:
                c0351e = new C0361k();
                break;
            case StatAccount.EMAIL_TYPE /*6*/:
                c0351e = new C0356f();
                break;
            case ConstantsAPI.COMMAND_ADD_CARD_TO_EX_CARD_PACKAGE /*9*/:
                c0351e = new C0365o();
                break;
            case IMediaObject.TYPE_DESIGNER_SHARED /*25*/:
                c0351e = new C0355d();
                break;
            case (byte) 26:
                c0351e = new C0364n();
                break;
            case (byte) 27:
                c0351e = new C0354c();
                break;
            case (byte) 28:
                c0351e = new C0352a();
                break;
            case (byte) 36:
                c0351e = new C0362l();
                break;
            case (byte) 37:
                c0351e = new C0363m();
                break;
        }
        if (c0351e != null) {
            c0351e.m1174a(b.f940d);
        }
        return c0351e;
    }

    private C0353b m1758b(byte[] bArr) {
        C0353b c0353b = new C0353b();
        c0353b.f937a = C0246g.m830b(bArr, 0);
        c0353b.f938b = bArr[2];
        c0353b.f940d = new byte[c0353b.f937a];
        C0246g.m822a(bArr, 3, c0353b.f940d, 0, c0353b.f937a);
        return c0353b;
    }

    private void m1760b(String str) {
        C0496b c0496b = (C0496b) this.f1375g.get(str);
        c0496b.m1746a(new C0501g(this, c0496b, str));
        try {
            Context createPackageContext = this.f1369a.createPackageContext(c0496b.m1745a(), 3);
            this.f1369a.bindService(new Intent(createPackageContext, createPackageContext.getClassLoader().loadClass(c0496b.m1749b())), c0496b.m1753d(), 0);
        } catch (Exception e) {
        }
        this.f1375g.put(str, c0496b);
    }

    private List m1762c(String str) {
        List arrayList = new ArrayList();
        for (Entry entry : this.f1376h.entrySet()) {
            String obj = entry.getKey().toString();
            if (((C0496b) entry.getValue()).m1754e().equals(str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private void m1763c() {
        this.f1370b = C0478d.init;
        C0495a c0495a = new C0495a();
        c0495a.m1744a(C0465c.start);
        m1774a(c0495a);
    }

    private void m1764d() {
        this.f1374f.clear();
        this.f1370b = C0478d.active;
        if (this.f1377i) {
            for (Entry key : this.f1375g.entrySet()) {
                m1760b((String) key.getKey());
            }
            this.f1377i = false;
        }
        C0482f.m1694a().m1712g().m1799a(true);
    }

    public int m1768a(String str) {
        if (this.f1370b != C0478d.prepare || str.equals(Constants.STR_EMPTY)) {
            return -1;
        }
        this.f1372d.m753t();
        this.f1375g.clear();
        this.f1376h.clear();
        this.f1377i = false;
        this.f1374f.clear();
        this.f1373e.m1752c(str);
        this.f1370b = C0478d.passive;
        C0482f.m1694a().m1712g().m1799a(false);
        return 0;
    }

    public int m1769a(String str, C0351e c0351e) {
        C0353b c0353b = new C0353b();
        c0353b.f940d = c0351e.m1176d();
        if (c0353b.f940d != null) {
            c0353b.f937a = c0353b.f940d.length;
            c0353b.f938b = (byte) c0351e.f928i;
            byte[] a = c0353b.m1184a();
            if (!(this.f1373e == null || this.f1373e.m1751c() == null)) {
                try {
                    return this.f1373e.m1751c().sendByASNL(this.f1373e.m1754e(), str, a);
                } catch (Exception e) {
                    m1763c();
                }
            }
        }
        return -1;
    }

    public int m1770a(String str, String str2) {
        if (this.f1370b == C0478d.prepare || this.f1370b == C0478d.passive) {
            return -1;
        }
        C0496b c0496b = new C0496b();
        c0496b.m1748a(str);
        c0496b.m1750b(str2);
        c0496b.m1752c(str);
        this.f1375g.put(str, c0496b);
        if (this.f1370b == C0478d.active) {
            m1760b(str);
        } else {
            this.f1377i = true;
        }
        return 0;
    }

    public int m1771a(String str, String str2, byte[] bArr) {
        C0351e a = m1755a(bArr);
        C0496b c0496b = (C0496b) this.f1375g.get(str);
        if (c0496b == null || !C0483g.f1327m) {
            return -1;
        }
        this.f1376h.put(str2, c0496b);
        return C0482f.m1694a().m1712g().m1795a(str2, a);
    }

    public void m1772a(Context context) {
        this.f1369a = context;
        this.f1370b = C0478d.init;
        this.f1374f = new ArrayList();
        this.f1375g = new HashMap();
        this.f1376h = new HashMap();
    }

    public void m1773a(Intent intent) {
        String stringExtra;
        String stringExtra2;
        if (intent.getAction().equals("com.igexin.sdk.action.snlrefresh") && C0378l.f1028o) {
            stringExtra = intent.getStringExtra("groupid");
            stringExtra2 = intent.getStringExtra("responseSNLAction");
            boolean z = C0483g.f1324j;
            boolean z2 = C0483g.f1325k;
            String stringExtra3 = intent.getStringExtra("branch");
            boolean a = C0402e.m1330a().m1363a(System.currentTimeMillis());
            long a2 = C0494q.m1742a() + C0494q.m1743b();
            if (C0483g.f1318d.equals(stringExtra) && PushBuildConfig.sdk_conf_channelid.equals(stringExtra3) && z && z2 && !a) {
                Intent intent2 = new Intent();
                intent2.setAction(stringExtra2);
                intent2.putExtra("groupid", C0483g.f1318d);
                intent2.putExtra("branch", PushBuildConfig.sdk_conf_channelid);
                intent2.putExtra("pkgname", C0483g.f1321g.getPackageName());
                intent2.putExtra("classname", PushService.class.getName());
                intent2.putExtra("startup_time", C0483g.f1310V);
                intent2.putExtra("network_traffic", a2);
                C0483g.f1321g.sendBroadcast(intent2);
            }
        } else if (intent.getAction().equals(C0483g.f1311W) && C0378l.f1028o) {
            stringExtra = intent.getStringExtra("groupid");
            stringExtra2 = intent.getStringExtra("branch");
            if (C0483g.f1318d.equals(stringExtra) && PushBuildConfig.sdk_conf_channelid.equals(stringExtra2)) {
                C0503i c0503i = new C0503i();
                c0503i.m1785a(intent.getStringExtra("groupid"));
                c0503i.m1788b(intent.getStringExtra("pkgname"));
                c0503i.m1790c(intent.getStringExtra("classname"));
                c0503i.m1784a(intent.getLongExtra("startup_time", 0));
                c0503i.m1787b(intent.getLongExtra("network_traffic", 0));
                this.f1374f.add(c0503i);
            }
        } else if (intent.getAction().equals("com.igexin.sdk.action.snlretire") && C0378l.f1028o) {
            stringExtra = intent.getStringExtra("groupid");
            stringExtra2 = intent.getStringExtra("branch");
            if (C0483g.f1318d.equals(stringExtra) && PushBuildConfig.sdk_conf_channelid.equals(stringExtra2)) {
                C0495a c0495a = new C0495a();
                c0495a.m1744a(C0465c.retire);
                C0482f.m1694a().m1713h().m1774a(c0495a);
            }
        }
    }

    public void m1774a(C0495a c0495a) {
        Intent intent;
        C0495a c0495a2;
        switch (C0502h.f1385b[this.f1370b.ordinal()]) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                switch (C0502h.f1384a[c0495a.f1363a.ordinal()]) {
                    case StatConstants.XG_PRO_VERSION /*1*/:
                        this.f1374f.clear();
                        this.f1375g.clear();
                        this.f1376h.clear();
                        if (this.f1371c != null) {
                            this.f1371c.m753t();
                        }
                        if (this.f1372d != null) {
                            this.f1372d.m753t();
                        }
                        this.f1377i = false;
                        boolean z = C0483g.f1324j;
                        boolean z2 = C0483g.f1325k;
                        boolean a = C0402e.m1330a().m1363a(System.currentTimeMillis());
                        boolean b = C0512a.m1844b();
                        if (!z || !z2 || a || !b) {
                            return;
                        }
                        if (C0378l.f1028o) {
                            intent = new Intent();
                            intent.setAction("com.igexin.sdk.action.snlrefresh");
                            intent.putExtra("groupid", C0483g.f1318d);
                            intent.putExtra("branch", PushBuildConfig.sdk_conf_channelid);
                            intent.putExtra("responseSNLAction", C0483g.f1311W);
                            this.f1369a.sendBroadcast(intent);
                            this.f1371c = new C0498d(this, 1000);
                            if (!C0482f.m1694a().m1703a(this.f1371c)) {
                                return;
                            }
                            return;
                        }
                        m1764d();
                    case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                        int size = this.f1374f.size();
                        if (size == 0) {
                            m1764d();
                            return;
                        }
                        int i = 1;
                        C0503i c0503i = (C0503i) this.f1374f.get(0);
                        while (i < size) {
                            C0503i c0503i2 = (C0503i) this.f1374f.get(i);
                            if (c0503i2.m1789c() >= c0503i.m1789c()) {
                                c0503i2 = c0503i;
                            }
                            i++;
                            c0503i = c0503i2;
                        }
                        if (this.f1369a.getPackageName().equals(c0503i.m1783a())) {
                            m1764d();
                            return;
                        }
                        this.f1370b = C0478d.prepare;
                        this.f1373e = new C0496b();
                        this.f1373e.m1748a(c0503i.m1783a());
                        this.f1373e.m1750b(c0503i.m1786b());
                        c0495a2 = new C0495a();
                        c0495a2.m1744a(C0465c.determine);
                        m1774a(c0495a2);
                    case StatConstants.STAT_DB_VERSION /*3*/:
                    case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                        if (this.f1371c != null) {
                            this.f1371c.m753t();
                        }
                        m1763c();
                    default:
                }
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                switch (C0502h.f1384a[c0495a.f1363a.ordinal()]) {
                    case StatConstants.STAT_DB_VERSION /*3*/:
                    case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                        if (this.f1372d != null) {
                            this.f1372d.m753t();
                        }
                        if (this.f1373e.m1751c() != null) {
                            try {
                                this.f1369a.unbindService(this.f1373e.m1753d());
                            } catch (Exception e) {
                            }
                        }
                        m1763c();
                    case StatAccount.PHONE_NUM_TYPE /*5*/:
                        this.f1372d = new C0499e(this, 5000);
                        if (C0482f.m1694a().m1703a(this.f1372d)) {
                            this.f1373e.m1746a(new C0500f(this));
                        } else {
                            this.f1373e.m1746a(new C0500f(this));
                        }
                        try {
                            Context createPackageContext = this.f1369a.createPackageContext(this.f1373e.m1745a(), 3);
                            this.f1369a.bindService(new Intent(createPackageContext, createPackageContext.getClassLoader().loadClass(this.f1373e.m1749b())), this.f1373e.m1753d(), 0);
                        } catch (Exception e2) {
                        }
                    case StatAccount.EMAIL_TYPE /*6*/:
                        try {
                            this.f1373e.m1751c().onPSNLConnected(this.f1369a.getPackageName(), PushService.class.getName(), Constants.STR_EMPTY, 0);
                        } catch (Exception e3) {
                        }
                    default:
                }
            case StatConstants.STAT_DB_VERSION /*3*/:
                switch (C0502h.f1384a[c0495a.f1363a.ordinal()]) {
                    case StatConstants.STAT_DB_VERSION /*3*/:
                        C0482f.m1694a().m1712g().m1799a(false);
                        C0482f.m1694a().m1712g().m1802b(true);
                        if (C0378l.f1028o) {
                            intent = new Intent();
                            intent.setAction("com.igexin.sdk.action.snlretire");
                            intent.putExtra("groupid", C0483g.f1318d);
                            intent.putExtra("branch", PushBuildConfig.sdk_conf_channelid);
                            this.f1369a.sendBroadcast(intent);
                            return;
                        }
                        c0495a2 = new C0495a();
                        c0495a2.m1744a(C0465c.retire);
                        C0482f.m1694a().m1713h().m1774a(c0495a2);
                    case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                        C0483g.f1310V = System.currentTimeMillis();
                        for (Entry value : this.f1375g.entrySet()) {
                            try {
                                this.f1369a.unbindService(((C0496b) value.getValue()).m1753d());
                            } catch (Exception e4) {
                            }
                        }
                        C0482f.m1694a().m1712g().m1799a(false);
                        m1763c();
                    case StatAccount.CUSTOM_TYPE /*7*/:
                        intent = new Intent();
                        intent.setAction("com.igexin.sdk.action.snlretire");
                        intent.putExtra("groupid", C0483g.f1318d);
                        intent.putExtra("branch", PushBuildConfig.sdk_conf_channelid);
                        this.f1369a.sendBroadcast(intent);
                    default:
                }
            case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                switch (C0502h.f1384a[c0495a.f1363a.ordinal()]) {
                    case StatConstants.STAT_DB_VERSION /*3*/:
                        if (C0483g.f1327m) {
                            C0351e c0362l = new C0362l();
                            c0362l.f981a = C0483g.f1332r;
                            C0482f.m1694a().m1712g().m1796a("S-" + String.valueOf(C0483g.f1332r), c0362l, true);
                            break;
                        }
                        break;
                    case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                        break;
                    default:
                        return;
                }
                C0483g.f1310V = System.currentTimeMillis();
                C0482f.m1694a().m1712g().m1802b(true);
                try {
                    this.f1369a.unbindService(this.f1373e.m1753d());
                } catch (Exception e5) {
                }
                m1763c();
            default:
        }
    }

    public boolean m1775a() {
        if (this.f1370b != C0478d.active) {
            return false;
        }
        for (Entry value : this.f1375g.entrySet()) {
            try {
                ((C0496b) value.getValue()).m1751c().onASNLNetworkConnected();
            } catch (Exception e) {
            }
        }
        return true;
    }

    public int m1776b(String str, C0351e c0351e) {
        C0353b c0353b = new C0353b();
        c0353b.f940d = c0351e.m1176d();
        c0353b.f937a = c0353b.f940d.length;
        c0353b.f938b = (byte) c0351e.f928i;
        byte[] a = c0353b.m1184a();
        C0496b c0496b = (C0496b) this.f1376h.get(str);
        if (c0496b != null) {
            try {
                if (str.startsWith("S-")) {
                    this.f1376h.put("C-" + C0259a.m877a(str.substring(2, str.length())), c0496b);
                }
                return c0496b.m1751c().receiveToPSNL(c0496b.m1754e(), str, a);
            } catch (RemoteException e) {
                this.f1375g.remove(c0496b.m1754e());
                this.f1376h.remove(str);
            }
        }
        return -1;
    }

    public int m1777b(String str, String str2, byte[] bArr) {
        C0482f.m1694a().m1712g().m1798a(m1755a(bArr));
        return 0;
    }

    public boolean m1778b() {
        if (this.f1370b != C0478d.active) {
            return false;
        }
        for (Entry value : this.f1375g.entrySet()) {
            try {
                ((C0496b) value.getValue()).m1751c().onASNLNetworkDisconnected();
            } catch (Exception e) {
            }
        }
        return true;
    }
}
