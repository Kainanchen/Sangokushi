package com.facebook.p035g;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.support.v4.util.Pools.SynchronizedPool;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Pair;
import com.facebook.common.p011d.Preconditions;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.facebook.g.a */
public final class BitmapUtil {
    private static final SynchronizedPool<ByteBuffer> f1529a;

    /* renamed from: com.facebook.g.a.1 */
    static /* synthetic */ class BitmapUtil {
        static final /* synthetic */ int[] f1528a;

        static {
            f1528a = new int[Config.values().length];
            try {
                f1528a[Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f1528a[Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f1528a[Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f1528a[Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    static {
        f1529a = new SynchronizedPool(12);
    }

    @SuppressLint({"NewApi"})
    public static int m1463a(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException e) {
            }
        }
        if (VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getWidth() * bitmap.getRowBytes();
    }

    @Nullable
    public static Pair<Integer, Integer> m1464a(InputStream inputStream) {
        Pair<Integer, Integer> pair = null;
        Preconditions.m1030a((Object) inputStream);
        ByteBuffer byteBuffer = (ByteBuffer) f1529a.acquire();
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(AccessibilityNodeInfoCompat.ACTION_COPY);
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBuffer.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            if (!(options.outWidth == -1 || options.outHeight == -1)) {
                pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            f1529a.release(byteBuffer);
            return pair;
        } catch (Throwable th) {
            f1529a.release(byteBuffer);
        }
    }

    public static int m1462a(int i, int i2, Config config) {
        int i3 = 2;
        int i4 = i * i2;
        switch (BitmapUtil.f1528a[config.ordinal()]) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                i3 = 4;
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                i3 = 1;
                break;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                break;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
        return i3 * i4;
    }
}
