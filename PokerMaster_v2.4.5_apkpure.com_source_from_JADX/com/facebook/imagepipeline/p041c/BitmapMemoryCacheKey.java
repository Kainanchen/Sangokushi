package com.facebook.imagepipeline.p041c;

import com.facebook.common.p011d.Objects;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.p042d.ImageDecodeOptions;
import com.facebook.imagepipeline.p042d.ResizeOptions;
import com.facebook.imagepipeline.p042d.RotationOptions;
import com.facebook.p007c.p008a.CacheKey;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.facebook.imagepipeline.c.c */
public final class BitmapMemoryCacheKey implements CacheKey {
    private final String f1906a;
    @Nullable
    private final ResizeOptions f1907b;
    private final RotationOptions f1908c;
    private final ImageDecodeOptions f1909d;
    @Nullable
    private final CacheKey f1910e;
    @Nullable
    private final String f1911f;
    private final int f1912g;
    private final Object f1913h;
    private final long f1914i;

    public BitmapMemoryCacheKey(String str, @Nullable ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, @Nullable CacheKey cacheKey, @Nullable String str2, Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.f1906a = (String) Preconditions.m1030a((Object) str);
        this.f1907b = resizeOptions;
        this.f1908c = rotationOptions;
        this.f1909d = imageDecodeOptions;
        this.f1910e = cacheKey;
        this.f1911f = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        Integer valueOf2 = Integer.valueOf(resizeOptions != null ? resizeOptions.hashCode() : 0);
        Integer valueOf3 = Integer.valueOf(rotationOptions.hashCode());
        ImageDecodeOptions imageDecodeOptions2 = this.f1909d;
        CacheKey cacheKey2 = this.f1910e;
        if (valueOf == null) {
            i = 0;
        } else {
            i = valueOf.hashCode();
        }
        if (valueOf2 == null) {
            i2 = 0;
        } else {
            i2 = valueOf2.hashCode();
        }
        if (valueOf3 == null) {
            i3 = 0;
        } else {
            i3 = valueOf3.hashCode();
        }
        if (imageDecodeOptions2 == null) {
            i4 = 0;
        } else {
            i4 = imageDecodeOptions2.hashCode();
        }
        if (cacheKey2 == null) {
            i5 = 0;
        } else {
            i5 = cacheKey2.hashCode();
        }
        if (str2 == null) {
            i6 = 0;
        } else {
            i6 = str2.hashCode();
        }
        this.f1912g = i6 + ((i5 + ((i4 + ((i3 + ((i2 + ((i + 31) * 31)) * 31)) * 31)) * 31)) * 31);
        this.f1913h = obj;
        RealtimeSinceBootClock.get();
        this.f1914i = RealtimeSinceBootClock.m1140a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BitmapMemoryCacheKey)) {
            return false;
        }
        BitmapMemoryCacheKey bitmapMemoryCacheKey = (BitmapMemoryCacheKey) obj;
        if (this.f1912g == bitmapMemoryCacheKey.f1912g && this.f1906a.equals(bitmapMemoryCacheKey.f1906a) && Objects.m1029a(this.f1907b, bitmapMemoryCacheKey.f1907b) && Objects.m1029a(this.f1908c, bitmapMemoryCacheKey.f1908c) && Objects.m1029a(this.f1909d, bitmapMemoryCacheKey.f1909d) && Objects.m1029a(this.f1910e, bitmapMemoryCacheKey.f1910e) && Objects.m1029a(this.f1911f, bitmapMemoryCacheKey.f1911f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1912g;
    }

    public final String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.f1906a, this.f1907b, this.f1908c, this.f1909d, this.f1910e, this.f1911f, Integer.valueOf(this.f1912g)});
    }
}
