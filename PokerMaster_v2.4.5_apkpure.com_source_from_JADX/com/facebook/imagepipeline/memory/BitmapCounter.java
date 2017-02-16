package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p017h.ResourceReleaser;
import com.facebook.p035g.BitmapUtil;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.facebook.imagepipeline.memory.b */
public final class BitmapCounter {
    public final ResourceReleaser<Bitmap> f2442a;
    @GuardedBy("this")
    private int f2443b;
    @GuardedBy("this")
    private long f2444c;
    private final int f2445d;
    private final int f2446e;

    /* renamed from: com.facebook.imagepipeline.memory.b.1 */
    class BitmapCounter implements ResourceReleaser<Bitmap> {
        final /* synthetic */ BitmapCounter f2441a;

        BitmapCounter(BitmapCounter bitmapCounter) {
            this.f2441a = bitmapCounter;
        }

        public final /* synthetic */ void m2364a(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            try {
                this.f2441a.m2366b(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public BitmapCounter(int i) {
        boolean z = true;
        Preconditions.m1033a(true);
        if (i <= 0) {
            z = false;
        }
        Preconditions.m1033a(z);
        this.f2445d = 384;
        this.f2446e = i;
        this.f2442a = new BitmapCounter(this);
    }

    public final synchronized boolean m2365a(Bitmap bitmap) {
        boolean z;
        int a = BitmapUtil.m1463a(bitmap);
        if (this.f2443b >= this.f2445d || this.f2444c + ((long) a) > ((long) this.f2446e)) {
            z = false;
        } else {
            this.f2443b++;
            this.f2444c = ((long) a) + this.f2444c;
            z = true;
        }
        return z;
    }

    public final synchronized void m2366b(Bitmap bitmap) {
        Object obj = 1;
        synchronized (this) {
            boolean z;
            int a = BitmapUtil.m1463a(bitmap);
            if (this.f2443b > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.m1034a(z, (Object) "No bitmaps registered.");
            if (((long) a) > this.f2444c) {
                obj = null;
            }
            String str = "Bitmap size bigger than the total registered size: %d, %d";
            Object[] objArr = new Object[]{Integer.valueOf(a), Long.valueOf(this.f2444c)};
            if (obj == null) {
                throw new IllegalArgumentException(Preconditions.m1032a(str, objArr));
            }
            this.f2444c -= (long) a;
            this.f2443b--;
        }
    }
}
