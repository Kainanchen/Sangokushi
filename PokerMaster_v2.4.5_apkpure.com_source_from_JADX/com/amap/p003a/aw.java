package com.amap.p003a;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.autonavi.aps.amapapi.model.AMapLocationServer;

/* compiled from: LocFilter */
/* renamed from: com.amap.a.aw */
public final class aw {
    private static aw f296c;
    boolean f297a;
    int f298b;
    private AMapLocationServer f299d;
    private long f300e;
    private long f301f;

    static {
        f296c = null;
    }

    private aw() {
        this.f299d = null;
        this.f300e = 0;
        this.f301f = 0;
        this.f297a = true;
        this.f298b = 0;
    }

    public static synchronized aw m262a() {
        aw awVar;
        synchronized (aw.class) {
            if (f296c == null) {
                f296c = new aw();
            }
            awVar = f296c;
        }
        return awVar;
    }

    private AMapLocationServer m263b(AMapLocationServer aMapLocationServer) {
        if (bu.m471a(aMapLocationServer)) {
            if (!this.f297a || !bn.m394b(aMapLocationServer.getTime())) {
                aMapLocationServer.setLocationType(this.f298b);
            } else if (aMapLocationServer.getLocationType() == 5 || aMapLocationServer.getLocationType() == 6) {
                aMapLocationServer.setLocationType(2);
            }
        }
        return aMapLocationServer;
    }

    public final synchronized AMapLocationServer m264a(AMapLocationServer aMapLocationServer) {
        if (!bu.m471a(this.f299d) || !bu.m471a(aMapLocationServer)) {
            this.f300e = bu.m477b();
            this.f299d = aMapLocationServer;
            aMapLocationServer = this.f299d;
        } else if (aMapLocationServer.getTime() != this.f299d.getTime() || aMapLocationServer.getAccuracy() >= 300.0f) {
            if (aMapLocationServer.getProvider().equals("gps")) {
                this.f300e = bu.m477b();
                this.f299d = aMapLocationServer;
                aMapLocationServer = this.f299d;
            } else if (aMapLocationServer.m787b() != this.f299d.m787b()) {
                this.f300e = bu.m477b();
                this.f299d = aMapLocationServer;
                aMapLocationServer = this.f299d;
            } else if (aMapLocationServer.m792d().equals(this.f299d.m792d()) || TextUtils.isEmpty(aMapLocationServer.m792d())) {
                this.f298b = aMapLocationServer.getLocationType();
                float a = bu.m458a((AMapLocation) aMapLocationServer, this.f299d);
                float accuracy = this.f299d.getAccuracy();
                float accuracy2 = aMapLocationServer.getAccuracy();
                float f = accuracy2 - accuracy;
                long b = bu.m477b();
                long j = b - this.f300e;
                if ((accuracy < 101.0f && accuracy2 > 299.0f) || (accuracy > 299.0f && accuracy2 > 299.0f)) {
                    if (this.f301f == 0) {
                        this.f301f = b;
                    } else if (b - this.f301f > StatisticConfig.MIN_UPLOAD_INTERVAL) {
                        this.f300e = b;
                        this.f299d = aMapLocationServer;
                        this.f301f = 0;
                        aMapLocationServer = this.f299d;
                    }
                    this.f299d = m263b(this.f299d);
                    aMapLocationServer = this.f299d;
                } else if (accuracy2 >= 100.0f || accuracy <= 299.0f) {
                    if (accuracy2 <= 299.0f) {
                        this.f301f = 0;
                    }
                    if (a >= 10.0f || ((double) a) <= 0.1d) {
                        if (f < 300.0f) {
                            this.f300e = bu.m477b();
                            this.f299d = aMapLocationServer;
                            aMapLocationServer = this.f299d;
                        } else if (j >= StatisticConfig.MIN_UPLOAD_INTERVAL) {
                            this.f300e = bu.m477b();
                            this.f299d = aMapLocationServer;
                            aMapLocationServer = this.f299d;
                        } else {
                            this.f299d = m263b(this.f299d);
                            aMapLocationServer = this.f299d;
                        }
                    } else if (f >= -300.0f) {
                        this.f299d = m263b(this.f299d);
                        aMapLocationServer = this.f299d;
                    } else if (accuracy / accuracy2 >= 2.0f) {
                        this.f300e = b;
                        this.f299d = aMapLocationServer;
                        aMapLocationServer = this.f299d;
                    } else {
                        this.f299d = m263b(this.f299d);
                        aMapLocationServer = this.f299d;
                    }
                } else {
                    this.f300e = b;
                    this.f299d = aMapLocationServer;
                    this.f301f = 0;
                    aMapLocationServer = this.f299d;
                }
            } else {
                this.f300e = bu.m477b();
                this.f299d = aMapLocationServer;
                aMapLocationServer = this.f299d;
            }
        }
        return aMapLocationServer;
    }

    public final synchronized void m265b() {
        this.f299d = null;
        this.f300e = 0;
        this.f301f = 0;
    }
}
