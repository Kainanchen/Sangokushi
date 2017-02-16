package com.facebook.imagepipeline.p049j;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.memory.FlexByteArrayPool;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(19)
@ThreadSafe
/* renamed from: com.facebook.imagepipeline.j.d */
public final class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    private final FlexByteArrayPool f2162b;

    public final /* bridge */ /* synthetic */ CloseableReference m2087a(Bitmap bitmap) {
        return super.m2073a(bitmap);
    }

    public KitKatPurgeableDecoder(FlexByteArrayPool flexByteArrayPool) {
        this.f2162b = flexByteArrayPool;
    }

    protected final Bitmap m2086a(CloseableReference<PooledByteBuffer> closeableReference, Options options) {
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) closeableReference.m1099a();
        int a = pooledByteBuffer.m2395a();
        CloseableReference a2 = this.f2162b.m2387a(a);
        try {
            byte[] bArr = (byte[]) a2.m1099a();
            pooledByteBuffer.m2396a(0, bArr, 0, a);
            Bitmap bitmap = (Bitmap) Preconditions.m1031a(BitmapFactory.decodeByteArray(bArr, 0, a, options), (Object) "BitmapFactory returned null");
            return bitmap;
        } finally {
            CloseableReference.m1097c(a2);
        }
    }

    protected final Bitmap m2085a(CloseableReference<PooledByteBuffer> closeableReference, int i, Options options) {
        boolean z = false;
        byte[] bArr = DalvikPurgeableDecoder.m2070a((CloseableReference) closeableReference, i) ? null : a;
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) closeableReference.m1099a();
        if (i <= pooledByteBuffer.m2395a()) {
            z = true;
        }
        Preconditions.m1033a(z);
        CloseableReference a = this.f2162b.m2387a(i + 2);
        try {
            byte[] bArr2 = (byte[]) a.m1099a();
            pooledByteBuffer.m2396a(0, bArr2, 0, i);
            if (bArr != null) {
                bArr2[i] = (byte) -1;
                bArr2[i + 1] = (byte) -39;
                i += 2;
            }
            Bitmap bitmap = (Bitmap) Preconditions.m1031a(BitmapFactory.decodeByteArray(bArr2, 0, i, options), (Object) "BitmapFactory returned null");
            return bitmap;
        } finally {
            CloseableReference.m1097c(a);
        }
    }
}
