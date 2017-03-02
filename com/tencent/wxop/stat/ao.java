package com.tencent.wxop.stat;

import com.tencent.wxop.stat.p069a.C0617d;
import java.lang.Thread.UncaughtExceptionHandler;

class ao implements UncaughtExceptionHandler {
    ao() {
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (StatConfig.isEnableStatService() && StatServiceImpl.f1842t != null) {
            if (StatConfig.isAutoExceptionCaught()) {
                au.m2317a(StatServiceImpl.f1842t).m2346a(new C0617d(StatServiceImpl.f1842t, StatServiceImpl.m2223a(StatServiceImpl.f1842t, false, null), 2, th, thread, null), null, false, true);
                StatServiceImpl.f1839q.debug("MTA has caught the following uncaught exception:");
                StatServiceImpl.f1839q.error(th);
            }
            StatServiceImpl.flushDataToDB(StatServiceImpl.f1842t);
            if (StatServiceImpl.f1840r != null) {
                StatServiceImpl.f1839q.m2358d("Call the original uncaught exception handler.");
                if (!(StatServiceImpl.f1840r instanceof ao)) {
                    StatServiceImpl.f1840r.uncaughtException(thread, th);
                }
            }
        }
    }
}
