package com.facebook.p036h;

import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.h.w */
public final class LockOnGetVariable<T> {
    public T f1756a;
    public CountDownLatch f1757b;

    /* renamed from: com.facebook.h.w.1 */
    class LockOnGetVariable implements Callable<Void> {
        final /* synthetic */ Callable f1754a;
        final /* synthetic */ LockOnGetVariable f1755b;

        LockOnGetVariable(LockOnGetVariable lockOnGetVariable, Callable callable) {
            this.f1755b = lockOnGetVariable;
            this.f1754a = callable;
        }

        public final /* synthetic */ Object call() {
            return m1680a();
        }

        private Void m1680a() {
            try {
                this.f1755b.f1756a = this.f1754a.call();
                return null;
            } finally {
                this.f1755b.f1757b.countDown();
            }
        }
    }

    public LockOnGetVariable(Callable<T> callable) {
        this.f1757b = new CountDownLatch(1);
        FacebookSdk.m2583d().execute(new FutureTask(new LockOnGetVariable(this, callable)));
    }
}
