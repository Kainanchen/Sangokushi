package com.amap.p003a;

import android.content.Context;
import android.text.TextUtils;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.amap.a.y */
public final class DynamicExceptionHandler implements UncaughtExceptionHandler {
    private static DynamicExceptionHandler f728a;
    private UncaughtExceptionHandler f729b;
    private Context f730c;
    private cj f731d;

    private DynamicExceptionHandler(Context context, cj cjVar) {
        this.f730c = context.getApplicationContext();
        this.f731d = cjVar;
        this.f729b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    static synchronized DynamicExceptionHandler m750a(Context context, cj cjVar) {
        DynamicExceptionHandler dynamicExceptionHandler;
        synchronized (DynamicExceptionHandler.class) {
            if (f728a == null) {
                f728a = new DynamicExceptionHandler(context, cjVar);
            }
            dynamicExceptionHandler = f728a;
        }
        return dynamicExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String a = ck.m616a(th);
        try {
            if (!TextUtils.isEmpty(a)) {
                if ((a.contains("amapdynamic") || a.contains("admic")) && a.contains("com.amap.api")) {
                    DBOperation dBOperation = new DBOperation(this.f730c, DynamicFileDBCreator.m751b());
                    if (a.contains("loc")) {
                        DexFileManager.m741a(dBOperation, this.f730c, "loc");
                    }
                    if (a.contains("navi")) {
                        DexFileManager.m741a(dBOperation, this.f730c, "navi");
                    }
                    if (a.contains("sea")) {
                        DexFileManager.m741a(dBOperation, this.f730c, "sea");
                    }
                    if (a.contains("2dmap")) {
                        DexFileManager.m741a(dBOperation, this.f730c, "2dmap");
                    }
                    if (a.contains("3dmap")) {
                        DexFileManager.m741a(dBOperation, this.f730c, "3dmap");
                    }
                } else if (a.contains("com.autonavi.aps.amapapi.offline")) {
                    DexFileManager.m741a(new DBOperation(this.f730c, DynamicFileDBCreator.m751b()), this.f730c, "OfflineLocation");
                } else if (a.contains("com.data.carrier_v4")) {
                    DexFileManager.m741a(new DBOperation(this.f730c, DynamicFileDBCreator.m751b()), this.f730c, "Collection");
                }
            }
        } catch (Throwable th2) {
            cm.m637a(th2, "DynamicExceptionHandler", "uncaughtException");
        }
        if (this.f729b != null) {
            this.f729b.uncaughtException(thread, th);
        }
    }
}
