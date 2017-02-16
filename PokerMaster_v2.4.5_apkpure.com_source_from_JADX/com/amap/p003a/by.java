package com.amap.p003a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: LastLocationManager */
/* renamed from: com.amap.a.by */
public final class by {
    String f532a;
    AMapLocation f533b;
    DBOperation f534c;
    long f535d;
    Runnable f536e;
    private Context f537f;
    private ExecutorService f538g;

    /* renamed from: com.amap.a.by.1 */
    class LastLocationManager implements Runnable {
        final /* synthetic */ by f531a;

        LastLocationManager(by byVar) {
            this.f531a = byVar;
        }

        public final void run() {
            try {
                if (bu.m470a(this.f531a.f533b)) {
                    Object toStr = this.f531a.f533b.toStr();
                    Object obj = null;
                    if (!TextUtils.isEmpty(toStr)) {
                        obj = cf.m577a(bb.m322c(toStr.getBytes(GameManager.DEFAULT_CHARSET), this.f531a.f532a));
                    }
                    if (!TextUtils.isEmpty(obj)) {
                        toStr = new bh();
                        toStr.f381a = obj;
                        toStr.f382b = bu.m464a();
                        this.f531a.f534c.m683a(toStr, "_id=1");
                        this.f531a.f535d = bu.m477b();
                    }
                }
            } catch (Throwable th) {
                bc.m330a(th, "LastLocationManager", "saveLastFix");
            }
        }
    }

    public by(Context context) {
        this.f532a = null;
        this.f533b = null;
        this.f538g = null;
        this.f535d = 0;
        this.f536e = new LastLocationManager(this);
        this.f537f = context.getApplicationContext();
        try {
            this.f532a = bb.m316a("MD5", ce.m559i(this.f537f));
            this.f534c = new DBOperation(context, DBOperation.m675a(bi.class), bu.m502i());
        } catch (Throwable th) {
            bc.m330a(th, "LastLocationManager", "<init>:DBOperation");
        }
    }

    private synchronized void m508c() {
        if (this.f538g == null || this.f538g.isShutdown()) {
            this.f538g = cp.m658b();
        }
        this.f538g.submit(this.f536e);
    }

    private synchronized AMapLocation m509d() {
        Throwable th;
        AMapLocation aMapLocation = null;
        synchronized (this) {
            if (this.f537f != null) {
                AMapLocation aMapLocation2;
                try {
                    this.f534c = new DBOperation(this.f537f, DBOperation.m675a(bi.class), bu.m502i());
                    List a = this.f534c.m681a("_id=1", bh.class, false);
                    Object str = a.size() > 0 ? new String(bb.m323d(cf.m581b(((bh) a.get(0)).f381a), this.f532a), GameManager.DEFAULT_CHARSET) : null;
                    if (TextUtils.isEmpty(str)) {
                        aMapLocation2 = null;
                    } else {
                        aMapLocation2 = new AMapLocation(LetterIndexBar.SEARCH_ICON_LETTER);
                        try {
                            bc.m329a(aMapLocation2, new JSONObject(str));
                        } catch (Throwable th2) {
                            th = th2;
                            bc.m330a(th, "LastLocationManager", "readLastFix");
                            aMapLocation = aMapLocation2;
                            return aMapLocation;
                        }
                    }
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    aMapLocation2 = null;
                    th = th4;
                    bc.m330a(th, "LastLocationManager", "readLastFix");
                    aMapLocation = aMapLocation2;
                    return aMapLocation;
                }
                aMapLocation = aMapLocation2;
            }
        }
        return aMapLocation;
    }

    public final synchronized AMapLocation m510a() {
        return this.f533b == null ? m509d() : this.f533b;
    }

    public final synchronized void m511a(AMapLocation aMapLocation) {
        if (!(this.f537f == null || !bu.m470a(aMapLocation) || aMapLocation.getLocationType() == 2)) {
            try {
                this.f533b = aMapLocation;
                if (bu.m477b() - this.f535d > StatisticConfig.MIN_UPLOAD_INTERVAL) {
                    m508c();
                }
            } catch (Throwable th) {
                bc.m330a(th, "LastLocationManager", "setLastFix");
            }
        }
    }

    public final synchronized void m512b() {
        try {
            m508c();
            if (this.f538g != null) {
                this.f538g.shutdown();
                this.f538g = null;
            }
            this.f535d = 0;
        } catch (Throwable th) {
            bc.m330a(th, "LastLocationManager", "destroy");
        }
    }
}
