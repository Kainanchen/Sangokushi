package com.facebook.imagepipeline.p047h;

import android.util.Pair;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.PooledByteBufferInputStream;
import com.facebook.p034f.DefaultImageFormats;
import com.facebook.p034f.ImageFormat;
import com.facebook.p034f.ImageFormatChecker;
import com.facebook.p035g.BitmapUtil;
import com.facebook.p035g.JfifUtil;
import com.facebook.p035g.TiffUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.facebook.imagepipeline.h.d */
public final class EncodedImage implements Closeable {
    @Nullable
    public final CloseableReference<PooledByteBuffer> f2142a;
    @Nullable
    public final Supplier<FileInputStream> f2143b;
    public ImageFormat f2144c;
    public int f2145d;
    public int f2146e;
    public int f2147f;
    public int f2148g;
    private int f2149h;

    public EncodedImage(CloseableReference<PooledByteBuffer> closeableReference) {
        this.f2144c = ImageFormat.f1518a;
        this.f2145d = -1;
        this.f2146e = -1;
        this.f2147f = -1;
        this.f2148g = 1;
        this.f2149h = -1;
        Preconditions.m1033a(CloseableReference.m1095a((CloseableReference) closeableReference));
        this.f2142a = closeableReference.m1100b();
        this.f2143b = null;
    }

    private EncodedImage(Supplier<FileInputStream> supplier) {
        this.f2144c = ImageFormat.f1518a;
        this.f2145d = -1;
        this.f2146e = -1;
        this.f2147f = -1;
        this.f2148g = 1;
        this.f2149h = -1;
        Preconditions.m1030a((Object) supplier);
        this.f2142a = null;
        this.f2143b = supplier;
    }

    public EncodedImage(Supplier<FileInputStream> supplier, int i) {
        this((Supplier) supplier);
        this.f2149h = i;
    }

    public static EncodedImage m2026a(EncodedImage encodedImage) {
        return encodedImage != null ? encodedImage.m2028d() : null;
    }

    private EncodedImage m2028d() {
        EncodedImage encodedImage;
        if (this.f2143b != null) {
            encodedImage = new EncodedImage(this.f2143b, this.f2149h);
        } else {
            CloseableReference b = CloseableReference.m1096b(this.f2142a);
            if (b == null) {
                encodedImage = null;
            } else {
                try {
                    encodedImage = new EncodedImage(b);
                } catch (Throwable th) {
                    CloseableReference.m1097c(b);
                }
            }
            CloseableReference.m1097c(b);
        }
        if (encodedImage != null) {
            encodedImage.m2034b(this);
        }
        return encodedImage;
    }

    public final void close() {
        CloseableReference.m1097c(this.f2142a);
    }

    private synchronized boolean m2030e() {
        boolean z;
        z = CloseableReference.m1095a(this.f2142a) || this.f2143b != null;
        return z;
    }

    public final InputStream m2032a() {
        if (this.f2143b != null) {
            return (InputStream) this.f2143b.m963a();
        }
        CloseableReference b = CloseableReference.m1096b(this.f2142a);
        if (b == null) {
            return null;
        }
        try {
            InputStream pooledByteBufferInputStream = new PooledByteBufferInputStream((PooledByteBuffer) b.m1099a());
            return pooledByteBufferInputStream;
        } finally {
            CloseableReference.m1097c(b);
        }
    }

    public final int m2033b() {
        if (this.f2142a == null || this.f2142a.m1099a() == null) {
            return this.f2149h;
        }
        return ((PooledByteBuffer) this.f2142a.m1099a()).m2395a();
    }

    public final void m2035c() {
        ImageFormat a = ImageFormatChecker.m1454a(m2032a());
        this.f2144c = a;
        Pair pair = null;
        if (!DefaultImageFormats.m1447a(a)) {
            Pair a2 = BitmapUtil.m1464a(m2032a());
            if (a2 != null) {
                this.f2146e = ((Integer) a2.first).intValue();
                this.f2147f = ((Integer) a2.second).intValue();
            }
            pair = a2;
        }
        if (a != DefaultImageFormats.f1506a || this.f2145d != -1) {
            this.f2145d = 0;
        } else if (pair != null) {
            this.f2145d = TiffUtil.m1467a(JfifUtil.m1465a(m2032a()));
        }
    }

    public static boolean m2027c(EncodedImage encodedImage) {
        return encodedImage.f2145d >= 0 && encodedImage.f2146e >= 0 && encodedImage.f2147f >= 0;
    }

    public static void m2029d(@Nullable EncodedImage encodedImage) {
        if (encodedImage != null) {
            encodedImage.close();
        }
    }

    public static boolean m2031e(@Nullable EncodedImage encodedImage) {
        return encodedImage != null && encodedImage.m2030e();
    }

    public final void m2034b(EncodedImage encodedImage) {
        this.f2144c = encodedImage.f2144c;
        this.f2146e = encodedImage.f2146e;
        this.f2147f = encodedImage.f2147f;
        this.f2145d = encodedImage.f2145d;
        this.f2148g = encodedImage.f2148g;
        this.f2149h = encodedImage.m2033b();
    }
}
