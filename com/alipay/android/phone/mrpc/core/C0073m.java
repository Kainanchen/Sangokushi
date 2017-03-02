package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.alipay.android.phone.mrpc.core.m */
final class C0073m extends FutureTask<C0077u> {
    final /* synthetic */ C0079q f54a;
    final /* synthetic */ C0072l f55b;

    C0073m(C0072l c0072l, Callable callable, C0079q c0079q) {
        this.f55b = c0072l;
        this.f54a = c0079q;
        super(callable);
    }

    protected final void done() {
        C0075t a = this.f54a.m122a();
        if (a.m88f() == null) {
            super.done();
            return;
        }
        try {
            get();
            if (isCancelled() || a.m90h()) {
                a.m89g();
                if (!isCancelled() || !isDone()) {
                    cancel(false);
                }
            }
        } catch (InterruptedException e) {
            new StringBuilder().append(e);
        } catch (ExecutionException e2) {
            if (e2.getCause() == null || !(e2.getCause() instanceof HttpException)) {
                new StringBuilder().append(e2);
                return;
            }
            HttpException httpException = (HttpException) e2.getCause();
            httpException.getCode();
            httpException.getMsg();
        } catch (CancellationException e3) {
            a.m89g();
        } catch (Throwable th) {
            RuntimeException runtimeException = new RuntimeException("An error occured while executing http request", th);
        }
    }
}
