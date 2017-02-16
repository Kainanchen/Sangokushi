package com.facebook.imagepipeline.p044k;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.p014e.FLog;
import com.facebook.common.p021l.UriUtil;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.p042d.ResizeOptions;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import com.facebook.p035g.TiffUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: com.facebook.imagepipeline.k.v */
public class LocalContentUriThumbnailFetchProducer extends LocalFetchProducer implements ar<EncodedImage> {
    private static final Class<?> f2371a;
    private static final String[] f2372b;
    private static final String[] f2373c;
    private static final Rect f2374d;
    private static final Rect f2375e;
    private final ContentResolver f2376f;

    static {
        f2371a = LocalContentUriThumbnailFetchProducer.class;
        f2372b = new String[]{"_id", "_data"};
        f2373c = new String[]{"_data"};
        f2374d = new Rect(0, 0, AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY, 384);
        f2375e = new Rect(0, 0, 96, 96);
    }

    public LocalContentUriThumbnailFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver, boolean z) {
        super(executor, pooledByteBufferFactory, z);
        this.f2376f = contentResolver;
    }

    public final boolean m2307a(ResizeOptions resizeOptions) {
        return as.m2222a(f2374d.width(), f2374d.height(), resizeOptions);
    }

    @Nullable
    private EncodedImage m2303a(Uri uri, ResizeOptions resizeOptions) {
        Cursor query = this.f2376f.query(uri, f2372b, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (resizeOptions != null) {
                EncodedImage a = m2304a(resizeOptions, query.getInt(query.getColumnIndex("_id")));
                if (a != null) {
                    a.f2145d = LocalContentUriThumbnailFetchProducer.m2302a(string);
                    query.close();
                    return a;
                }
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    protected final String m2306a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    private static int m2302a(String str) {
        int i = 0;
        if (str != null) {
            try {
                i = TiffUtil.m1467a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (Throwable e) {
                FLog.m1056b(f2371a, e, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return i;
    }

    protected final EncodedImage m2305a(ImageRequest imageRequest) {
        Uri uri = imageRequest.f2401b;
        if (UriUtil.m1126e(uri)) {
            EncodedImage a = m2303a(uri, imageRequest.f2405f);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    private EncodedImage m2304a(ResizeOptions resizeOptions, int i) {
        int i2;
        Throwable th;
        EncodedImage encodedImage = null;
        if (as.m2222a(f2375e.width(), f2375e.height(), resizeOptions)) {
            i2 = 3;
        } else if (as.m2222a(f2374d.width(), f2374d.height(), resizeOptions)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            Cursor queryMiniThumbnail;
            try {
                queryMiniThumbnail = Thumbnails.queryMiniThumbnail(this.f2376f, (long) i, i2, f2373c);
                if (queryMiniThumbnail != null) {
                    try {
                        queryMiniThumbnail.moveToFirst();
                        if (queryMiniThumbnail.getCount() > 0) {
                            String string = queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data"));
                            if (new File(string).exists()) {
                                int i3;
                                InputStream fileInputStream = new FileInputStream(string);
                                if (string == null) {
                                    i3 = -1;
                                } else {
                                    i3 = (int) new File(string).length();
                                }
                                encodedImage = m2247b(fileInputStream, i3);
                                if (queryMiniThumbnail != null) {
                                    queryMiniThumbnail.close();
                                }
                            }
                        }
                        if (queryMiniThumbnail != null) {
                            queryMiniThumbnail.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (queryMiniThumbnail != null) {
                            queryMiniThumbnail.close();
                        }
                        throw th;
                    }
                } else if (queryMiniThumbnail != null) {
                    queryMiniThumbnail.close();
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                queryMiniThumbnail = null;
                th = th4;
                if (queryMiniThumbnail != null) {
                    queryMiniThumbnail.close();
                }
                throw th;
            }
        }
        return encodedImage;
    }
}
