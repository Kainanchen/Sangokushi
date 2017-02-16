package com.facebook.imagepipeline.p049j;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Throwables;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.memory.BitmapCounter;
import com.facebook.imagepipeline.memory.BitmapCounterProvider;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.facebook.imagepipeline.p042d.TooManyBitmapsException;
import com.facebook.imagepipeline.p047h.EncodedImage;

/* renamed from: com.facebook.imagepipeline.j.b */
abstract class DalvikPurgeableDecoder implements PlatformDecoder {
    protected static final byte[] f2158a;
    private final BitmapCounter f2159b;

    abstract Bitmap m2071a(CloseableReference<PooledByteBuffer> closeableReference, int i, Options options);

    abstract Bitmap m2072a(CloseableReference<PooledByteBuffer> closeableReference, Options options);

    static {
        f2158a = new byte[]{(byte) -1, (byte) -39};
    }

    DalvikPurgeableDecoder() {
        this.f2159b = BitmapCounterProvider.m2367a();
    }

    private static Options m2069a(int i, Config config) {
        Options options = new Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    protected static boolean m2070a(CloseableReference<PooledByteBuffer> closeableReference, int i) {
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) closeableReference.m1099a();
        return i >= 2 && pooledByteBuffer.m2394a(i - 2) == -1 && pooledByteBuffer.m2394a(i - 1) == -39;
    }

    public CloseableReference<Bitmap> m2073a(Bitmap bitmap) {
        try {
            Bitmaps.m2431a(bitmap);
            if (this.f2159b.m2365a(bitmap)) {
                return CloseableReference.m1094a(bitmap, this.f2159b.f2442a);
            }
            bitmap.recycle();
            throw new TooManyBitmapsException();
        } catch (Throwable e) {
            bitmap.recycle();
            throw Throwables.m1039b(e);
        }
    }

    public CloseableReference<Bitmap> m2074a(EncodedImage encodedImage, Config config) {
        Options a = DalvikPurgeableDecoder.m2069a(encodedImage.f2148g, config);
        CloseableReference b = CloseableReference.m1096b(encodedImage.f2142a);
        Preconditions.m1030a((Object) b);
        try {
            CloseableReference<Bitmap> a2 = m2073a(m2072a(b, a));
            return a2;
        } finally {
            CloseableReference.m1097c(b);
        }
    }

    public CloseableReference<Bitmap> m2075a(EncodedImage encodedImage, Config config, int i) {
        Options a = DalvikPurgeableDecoder.m2069a(encodedImage.f2148g, config);
        CloseableReference b = CloseableReference.m1096b(encodedImage.f2142a);
        Preconditions.m1030a((Object) b);
        try {
            CloseableReference<Bitmap> a2 = m2073a(m2071a(b, i, a));
            return a2;
        } finally {
            CloseableReference.m1097c(b);
        }
    }
}
