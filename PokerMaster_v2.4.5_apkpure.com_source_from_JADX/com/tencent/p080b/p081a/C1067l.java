package com.tencent.p080b.p081a;

import com.tencent.p080b.p081a.p082a.C1032c;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.tencent.b.a.l */
final class C1067l implements UncaughtExceptionHandler {
    C1067l() {
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (C1058c.m5765c() && C1060e.f8181t != null) {
            if (C1058c.m5778m()) {
                C1073r.m5835a(C1060e.f8181t).m5859a(new C1032c(C1060e.f8181t, C1060e.m5788a(C1060e.f8181t, null), th, thread), null, false, true);
                C1060e.f8178q.m5669f("MTA has caught the following uncaught exception:");
                C1060e.f8178q.m5663a(th);
            }
            C1060e.m5801c(C1060e.f8181t);
            if (C1060e.f8179r != null) {
                C1060e.f8178q.m5670g("Call the original uncaught exception handler.");
                if (!(C1060e.f8179r instanceof C1067l)) {
                    C1060e.f8179r.uncaughtException(thread, th);
                }
            }
        }
    }
}
