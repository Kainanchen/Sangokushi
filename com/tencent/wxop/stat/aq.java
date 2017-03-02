package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C0639k;
import com.tencent.wxop.stat.common.C0644p;
import com.tencent.wxop.stat.common.StatConstants;
import com.tencent.wxop.stat.p069a.C0613e;
import com.ut.device.AidConstants;

class aq {
    private static volatile long f1938f;
    private C0613e f1939a;
    private StatReportStrategy f1940b;
    private boolean f1941c;
    private Context f1942d;
    private long f1943e;

    static {
        f1938f = 0;
    }

    public aq(C0613e c0613e) {
        this.f1940b = null;
        this.f1941c = false;
        this.f1942d = null;
        this.f1943e = System.currentTimeMillis();
        this.f1939a = c0613e;
        this.f1940b = StatConfig.getStatSendStrategy();
        this.f1941c = c0613e.m2257f();
        this.f1942d = c0613e.m2256e();
    }

    private void m2302a(C0626h c0626h) {
        C0651i.m2471b(StatServiceImpl.f1842t).m2472a(this.f1939a, c0626h);
    }

    private void m2304b() {
        if (this.f1939a.m2255d() != null && this.f1939a.m2255d().isSendImmediately()) {
            this.f1940b = StatReportStrategy.INSTANT;
        }
        if (StatConfig.f1801j && C0625a.m2283a(StatServiceImpl.f1842t).m2295e()) {
            this.f1940b = StatReportStrategy.INSTANT;
        }
        if (StatConfig.isDebugEnable()) {
            StatServiceImpl.f1839q.m2361i("strategy=" + this.f1940b.name());
        }
        switch (ag.f1916a[this.f1940b.ordinal()]) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                m2305c();
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                au.m2317a(this.f1942d).m2346a(this.f1939a, null, this.f1941c, false);
                if (StatConfig.isDebugEnable()) {
                    StatServiceImpl.f1839q.m2361i("PERIOD currTime=" + this.f1943e + ",nextPeriodSendTs=" + StatServiceImpl.f1825c + ",difftime=" + (StatServiceImpl.f1825c - this.f1943e));
                }
                if (StatServiceImpl.f1825c == 0) {
                    StatServiceImpl.f1825c = C0644p.m2440a(this.f1942d, "last_period_ts", 0);
                    if (this.f1943e > StatServiceImpl.f1825c) {
                        StatServiceImpl.m2242e(this.f1942d);
                    }
                    long sendPeriodMinutes = this.f1943e + ((long) ((StatConfig.getSendPeriodMinutes() * 60) * AidConstants.EVENT_REQUEST_STARTED));
                    if (StatServiceImpl.f1825c > sendPeriodMinutes) {
                        StatServiceImpl.f1825c = sendPeriodMinutes;
                    }
                    C0647d.m2459a(this.f1942d).m2460a();
                }
                if (StatConfig.isDebugEnable()) {
                    StatServiceImpl.f1839q.m2361i("PERIOD currTime=" + this.f1943e + ",nextPeriodSendTs=" + StatServiceImpl.f1825c + ",difftime=" + (StatServiceImpl.f1825c - this.f1943e));
                }
                if (this.f1943e > StatServiceImpl.f1825c) {
                    StatServiceImpl.m2242e(this.f1942d);
                }
            case StatConstants.STAT_DB_VERSION /*3*/:
            case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                au.m2317a(this.f1942d).m2346a(this.f1939a, null, this.f1941c, false);
            case StatAccount.PHONE_NUM_TYPE /*5*/:
                au.m2317a(this.f1942d).m2346a(this.f1939a, new ar(this), this.f1941c, true);
            case StatAccount.EMAIL_TYPE /*6*/:
                if (C0625a.m2283a(StatServiceImpl.f1842t).m2293c() == 1) {
                    m2305c();
                } else {
                    au.m2317a(this.f1942d).m2346a(this.f1939a, null, this.f1941c, false);
                }
            case StatAccount.CUSTOM_TYPE /*7*/:
                if (C0639k.m2409e(this.f1942d)) {
                    m2302a(new as(this));
                }
            default:
                StatServiceImpl.f1839q.error("Invalid stat strategy:" + StatConfig.getStatSendStrategy());
        }
    }

    private void m2305c() {
        if (au.m2331b().f1950a <= 0 || !StatConfig.f1803l) {
            m2302a(new at(this));
            return;
        }
        au.m2331b().m2346a(this.f1939a, null, this.f1941c, true);
        au.m2331b().m2345a(-1);
    }

    private boolean m2307d() {
        if (StatConfig.f1799h > 0) {
            if (this.f1943e > StatServiceImpl.f1830h) {
                StatServiceImpl.f1829g.clear();
                StatServiceImpl.f1830h = this.f1943e + StatConfig.f1800i;
                if (StatConfig.isDebugEnable()) {
                    StatServiceImpl.f1839q.m2361i("clear methodsCalledLimitMap, nextLimitCallClearTime=" + StatServiceImpl.f1830h);
                }
            }
            Integer valueOf = Integer.valueOf(this.f1939a.m2251a().m2269a());
            Integer num = (Integer) StatServiceImpl.f1829g.get(valueOf);
            if (num != null) {
                StatServiceImpl.f1829g.put(valueOf, Integer.valueOf(num.intValue() + 1));
                if (num.intValue() > StatConfig.f1799h) {
                    if (StatConfig.isDebugEnable()) {
                        StatServiceImpl.f1839q.m2359e("event " + this.f1939a.m2258g() + " was discard, cause of called limit, current:" + num + ", limit:" + StatConfig.f1799h + ", period:" + StatConfig.f1800i + " ms");
                    }
                    return true;
                }
            }
            StatServiceImpl.f1829g.put(valueOf, Integer.valueOf(1));
        }
        return false;
    }

    public void m2308a() {
        if (!m2307d()) {
            if (StatConfig.f1804m > 0 && this.f1943e >= f1938f) {
                StatServiceImpl.flushDataToDB(this.f1942d);
                f1938f = this.f1943e + StatConfig.f1805n;
                if (StatConfig.isDebugEnable()) {
                    StatServiceImpl.f1839q.m2361i("nextFlushTime=" + f1938f);
                }
            }
            if (C0625a.m2283a(this.f1942d).m2296f()) {
                if (StatConfig.isDebugEnable()) {
                    StatServiceImpl.f1839q.m2361i("sendFailedCount=" + StatServiceImpl.f1823a);
                }
                if (StatServiceImpl.m2230a()) {
                    au.m2317a(this.f1942d).m2346a(this.f1939a, null, this.f1941c, false);
                    if (this.f1943e - StatServiceImpl.f1824b > 1800000) {
                        StatServiceImpl.m2240d(this.f1942d);
                        return;
                    }
                    return;
                }
                m2304b();
                return;
            }
            au.m2317a(this.f1942d).m2346a(this.f1939a, null, this.f1941c, false);
        }
    }
}
