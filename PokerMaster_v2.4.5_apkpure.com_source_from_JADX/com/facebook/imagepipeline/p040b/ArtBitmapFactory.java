package com.facebook.imagepipeline.p040b;

import android.annotation.TargetApi;
import com.facebook.imagepipeline.memory.BitmapPool;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(21)
@ThreadSafe
/* renamed from: com.facebook.imagepipeline.b.a */
public final class ArtBitmapFactory extends PlatformBitmapFactory {
    private final BitmapPool f1898a;

    public ArtBitmapFactory(BitmapPool bitmapPool) {
        this.f1898a = bitmapPool;
    }
}
