package com.facebook.imagepipeline.p049j;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.support.v4.util.Pools.SynchronizedPool;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.common.p020k.LimitedInputStream;
import com.facebook.common.p020k.TailAppendingInputStream;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.p034f.DefaultImageFormats;
import com.facebook.p035g.BitmapUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(21)
@ThreadSafe
/* renamed from: com.facebook.imagepipeline.j.a */
public final class ArtDecoder implements PlatformDecoder {
    private static final byte[] f2155c;
    final SynchronizedPool<ByteBuffer> f2156a;
    private final BitmapPool f2157b;

    static {
        f2155c = new byte[]{(byte) -1, (byte) -39};
    }

    public ArtDecoder(BitmapPool bitmapPool, int i, SynchronizedPool synchronizedPool) {
        this.f2157b = bitmapPool;
        this.f2156a = synchronizedPool;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2156a.release(ByteBuffer.allocate(AccessibilityNodeInfoCompat.ACTION_COPY));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.common.p017h.CloseableReference<android.graphics.Bitmap> m2067a(com.facebook.imagepipeline.p047h.EncodedImage r4, android.graphics.Bitmap.Config r5) {
        /*
        r3 = this;
    L_0x0000:
        r1 = com.facebook.imagepipeline.p049j.ArtDecoder.m2066b(r4, r5);
        r0 = r1.inPreferredConfig;
        r2 = android.graphics.Bitmap.Config.ARGB_8888;
        if (r0 == r2) goto L_0x0014;
    L_0x000a:
        r0 = 1;
    L_0x000b:
        r2 = r4.m2032a();	 Catch:{ RuntimeException -> 0x0016 }
        r0 = r3.m2065a(r2, r1);	 Catch:{ RuntimeException -> 0x0016 }
        return r0;
    L_0x0014:
        r0 = 0;
        goto L_0x000b;
    L_0x0016:
        r1 = move-exception;
        if (r0 == 0) goto L_0x001c;
    L_0x0019:
        r5 = android.graphics.Bitmap.Config.ARGB_8888;
        goto L_0x0000;
    L_0x001c:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.j.a.a(com.facebook.imagepipeline.h.d, android.graphics.Bitmap$Config):com.facebook.common.h.a<android.graphics.Bitmap>");
    }

    public final CloseableReference<Bitmap> m2068a(EncodedImage encodedImage, Config config, int i) {
        Object obj;
        InputStream limitedInputStream;
        InputStream tailAppendingInputStream;
        Object obj2 = 1;
        if (encodedImage.f2144c != DefaultImageFormats.f1506a) {
            obj = 1;
        } else if (encodedImage.f2143b != null) {
            r0 = 1;
        } else {
            Preconditions.m1030a(encodedImage.f2142a);
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) encodedImage.f2142a.m1099a();
            if (pooledByteBuffer.m2394a(i - 2) == -1 && pooledByteBuffer.m2394a(i - 1) == -39) {
                r0 = 1;
            } else {
                obj = null;
            }
        }
        Options b = ArtDecoder.m2066b(encodedImage, config);
        InputStream a = encodedImage.m2032a();
        Preconditions.m1030a((Object) a);
        if (encodedImage.m2033b() > i) {
            limitedInputStream = new LimitedInputStream(a, i);
        } else {
            limitedInputStream = a;
        }
        if (obj == null) {
            tailAppendingInputStream = new TailAppendingInputStream(limitedInputStream, f2155c);
        } else {
            tailAppendingInputStream = limitedInputStream;
        }
        if (b.inPreferredConfig == Config.ARGB_8888) {
            obj2 = null;
        }
        try {
            return m2065a(tailAppendingInputStream, b);
        } catch (RuntimeException e) {
            if (obj2 != null) {
                return m2067a(encodedImage, Config.ARGB_8888);
            }
            throw e;
        }
    }

    private CloseableReference<Bitmap> m2065a(InputStream inputStream, Options options) {
        ByteBuffer allocate;
        Preconditions.m1030a((Object) inputStream);
        Bitmap bitmap = (Bitmap) this.f2157b.m2354a(BitmapUtil.m1462a(options.outWidth, options.outHeight, options.inPreferredConfig));
        if (bitmap == null) {
            throw new NullPointerException("BitmapPool.get returned null");
        }
        options.inBitmap = bitmap;
        ByteBuffer byteBuffer = (ByteBuffer) this.f2156a.acquire();
        if (byteBuffer == null) {
            allocate = ByteBuffer.allocate(AccessibilityNodeInfoCompat.ACTION_COPY);
        } else {
            allocate = byteBuffer;
        }
        try {
            options.inTempStorage = allocate.array();
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            this.f2156a.release(allocate);
            if (bitmap == decodeStream) {
                return CloseableReference.m1094a(decodeStream, this.f2157b);
            }
            this.f2157b.m2355a((Object) bitmap);
            decodeStream.recycle();
            throw new IllegalStateException();
        } catch (RuntimeException e) {
            this.f2157b.m2355a((Object) bitmap);
            throw e;
        } catch (Throwable th) {
            this.f2156a.release(allocate);
        }
    }

    private static Options m2066b(EncodedImage encodedImage, Config config) {
        Options options = new Options();
        options.inSampleSize = encodedImage.f2148g;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(encodedImage.m2032a(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }
}
