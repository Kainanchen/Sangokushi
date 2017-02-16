package com.facebook.imagepipeline.p045f;

import com.facebook.common.p011d.Preconditions;
import com.facebook.imagepipeline.p044k.BaseConsumer;
import com.facebook.imagepipeline.p044k.ag;
import com.facebook.imagepipeline.p044k.al;
import com.facebook.imagepipeline.p048i.RequestListener;
import com.facebook.p023d.AbstractDataSource;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.f.a */
public abstract class AbstractProducerToDataSourceAdapter<T> extends AbstractDataSource<T> {
    private final al f2125a;
    private final RequestListener f2126b;

    /* renamed from: com.facebook.imagepipeline.f.a.1 */
    class AbstractProducerToDataSourceAdapter extends BaseConsumer<T> {
        final /* synthetic */ AbstractProducerToDataSourceAdapter f2124a;

        AbstractProducerToDataSourceAdapter(AbstractProducerToDataSourceAdapter abstractProducerToDataSourceAdapter) {
            this.f2124a = abstractProducerToDataSourceAdapter;
        }

        protected final void m1995a(@Nullable T t, boolean z) {
            this.f2124a.m1998b(t, z);
        }

        protected final void m1996a(Throwable th) {
            AbstractProducerToDataSourceAdapter.m1997a(this.f2124a, th);
        }

        protected final void m1993a() {
            this.f2124a.m2000h();
        }

        protected final void m1994a(float f) {
            this.f2124a.m1161a(f);
        }
    }

    protected AbstractProducerToDataSourceAdapter(ag<T> agVar, al alVar, RequestListener requestListener) {
        this.f2125a = alVar;
        this.f2126b = requestListener;
        this.f2126b.m2049a(alVar.f2231a, this.f2125a.f2233c, this.f2125a.f2232b, this.f2125a.m2200f());
        agVar.m2094a(new AbstractProducerToDataSourceAdapter(this), alVar);
    }

    protected void m1998b(@Nullable T t, boolean z) {
        if (super.m1162a((Object) t, z) && z) {
            this.f2126b.m2051a(this.f2125a.f2231a, this.f2125a.f2232b, this.f2125a.m2200f());
        }
    }

    final synchronized void m2000h() {
        Preconditions.m1035b(m1160a());
    }

    public final boolean m1999g() {
        if (!super.m1169g()) {
            return false;
        }
        if (!super.m1164b()) {
            this.f2126b.m2052a(this.f2125a.f2232b);
            this.f2125a.m2203i();
        }
        return true;
    }

    static /* synthetic */ void m1997a(AbstractProducerToDataSourceAdapter abstractProducerToDataSourceAdapter, Throwable th) {
        if (super.m1163a(th)) {
            abstractProducerToDataSourceAdapter.f2126b.m2050a(abstractProducerToDataSourceAdapter.f2125a.f2231a, abstractProducerToDataSourceAdapter.f2125a.f2232b, th, abstractProducerToDataSourceAdapter.f2125a.m2200f());
        }
    }
}
