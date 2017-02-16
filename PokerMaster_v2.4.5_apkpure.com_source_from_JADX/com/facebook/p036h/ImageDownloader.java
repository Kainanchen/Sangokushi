package com.facebook.p036h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.p036h.ImageRequest.ImageRequest;
import com.facebook.p036h.ai.WorkQueue;
import java.io.Closeable;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.h.r */
public final class ImageDownloader {
    private static Handler f1732a;
    private static ai f1733b;
    private static ai f1734c;
    private static final Map<ImageDownloader, ImageDownloader> f1735d;

    /* renamed from: com.facebook.h.r.1 */
    static class ImageDownloader implements Runnable {
        final /* synthetic */ ImageRequest f1717a;
        final /* synthetic */ Exception f1718b;
        final /* synthetic */ boolean f1719c;
        final /* synthetic */ Bitmap f1720d;
        final /* synthetic */ ImageRequest f1721e;

        ImageDownloader(ImageRequest imageRequest, Exception exception, boolean z, Bitmap bitmap, ImageRequest imageRequest2) {
            this.f1717a = imageRequest;
            this.f1718b = exception;
            this.f1719c = z;
            this.f1720d = bitmap;
            this.f1721e = imageRequest2;
        }

        public final void run() {
            this.f1721e.m1675a(new ImageResponse(this.f1717a, this.f1718b, this.f1719c, this.f1720d));
        }
    }

    /* renamed from: com.facebook.h.r.a */
    private static class ImageDownloader implements Runnable {
        private Context f1722a;
        private ImageDownloader f1723b;
        private boolean f1724c;

        ImageDownloader(Context context, ImageDownloader imageDownloader, boolean z) {
            this.f1722a = context;
            this.f1723b = imageDownloader;
            this.f1724c = z;
        }

        public final void run() {
            ImageDownloader.m1671a(this.f1723b, this.f1724c);
        }
    }

    /* renamed from: com.facebook.h.r.b */
    private static class ImageDownloader implements Runnable {
        private Context f1725a;
        private ImageDownloader f1726b;

        ImageDownloader(Context context, ImageDownloader imageDownloader) {
            this.f1725a = context;
            this.f1726b = imageDownloader;
        }

        public final void run() {
            ImageDownloader.m1669a(this.f1726b, this.f1725a);
        }
    }

    /* renamed from: com.facebook.h.r.c */
    private static class ImageDownloader {
        WorkQueue f1727a;
        ImageRequest f1728b;
        boolean f1729c;

        private ImageDownloader() {
        }
    }

    /* renamed from: com.facebook.h.r.d */
    private static class ImageDownloader {
        Uri f1730a;
        Object f1731b;

        ImageDownloader(Uri uri, Object obj) {
            this.f1730a = uri;
            this.f1731b = obj;
        }

        public final int hashCode() {
            return ((this.f1730a.hashCode() + 1073) * 37) + this.f1731b.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof ImageDownloader)) {
                return false;
            }
            ImageDownloader imageDownloader = (ImageDownloader) obj;
            if (imageDownloader.f1730a == this.f1730a && imageDownloader.f1731b == this.f1731b) {
                return true;
            }
            return false;
        }
    }

    static {
        f1733b = new ai(8);
        f1734c = new ai(2);
        f1735d = new HashMap();
    }

    public static void m1672a(ImageRequest imageRequest) {
        ImageDownloader imageDownloader = new ImageDownloader(imageRequest.f1742b, imageRequest.f1745e);
        synchronized (f1735d) {
            ImageDownloader imageDownloader2 = (ImageDownloader) f1735d.get(imageDownloader);
            if (imageDownloader2 != null) {
                imageDownloader2.f1728b = imageRequest;
                imageDownloader2.f1729c = false;
                imageDownloader2.f1727a.m1573a();
            } else {
                ImageDownloader.m1674a(imageRequest, imageDownloader, imageRequest.f1744d);
            }
        }
    }

    private static void m1674a(ImageRequest imageRequest, ImageDownloader imageDownloader, boolean z) {
        ImageDownloader.m1673a(imageRequest, imageDownloader, f1734c, new ImageDownloader(imageRequest.f1741a, imageDownloader, z));
    }

    private static void m1673a(ImageRequest imageRequest, ImageDownloader imageDownloader, ai aiVar, Runnable runnable) {
        synchronized (f1735d) {
            ImageDownloader imageDownloader2 = new ImageDownloader();
            imageDownloader2.f1728b = imageRequest;
            f1735d.put(imageDownloader, imageDownloader2);
            imageDownloader2.f1727a = aiVar.m1582a(runnable);
        }
    }

    private static void m1670a(ImageDownloader imageDownloader, Exception exception, Bitmap bitmap, boolean z) {
        ImageDownloader a = ImageDownloader.m1668a(imageDownloader);
        if (a != null && !a.f1729c) {
            ImageRequest imageRequest = a.f1728b;
            ImageRequest imageRequest2 = imageRequest.f1743c;
            if (imageRequest2 != null) {
                ImageDownloader.m1667a().post(new ImageDownloader(imageRequest, exception, z, bitmap, imageRequest2));
            }
        }
    }

    private static synchronized Handler m1667a() {
        Handler handler;
        synchronized (ImageDownloader.class) {
            if (f1732a == null) {
                f1732a = new Handler(Looper.getMainLooper());
            }
            handler = f1732a;
        }
        return handler;
    }

    private static ImageDownloader m1668a(ImageDownloader imageDownloader) {
        ImageDownloader imageDownloader2;
        synchronized (f1735d) {
            imageDownloader2 = (ImageDownloader) f1735d.remove(imageDownloader);
        }
        return imageDownloader2;
    }

    static /* synthetic */ void m1671a(ImageDownloader imageDownloader, boolean z) {
        Closeable closeable;
        boolean z2;
        ImageDownloader a;
        boolean z3 = false;
        if (z) {
            Uri a2 = ae.m1483a(imageDownloader.f1730a);
            if (a2 != null) {
                InputStream a3 = ImageResponseCache.m1677a(a2);
                if (a3 != null) {
                    z3 = true;
                }
                boolean z4 = z3;
                closeable = a3;
                z2 = z4;
                if (!z2) {
                    closeable = ImageResponseCache.m1677a(imageDownloader.f1730a);
                }
                if (closeable == null) {
                    Bitmap decodeStream = BitmapFactory.decodeStream(closeable);
                    af.m1513a(closeable);
                    ImageDownloader.m1670a(imageDownloader, null, decodeStream, z2);
                }
                a = ImageDownloader.m1668a(imageDownloader);
                if (a != null && !a.f1729c) {
                    ImageRequest imageRequest = a.f1728b;
                    ImageDownloader.m1673a(imageRequest, imageDownloader, f1733b, new ImageDownloader(imageRequest.f1741a, imageDownloader));
                    return;
                }
                return;
            }
        }
        z2 = false;
        closeable = null;
        if (z2) {
            closeable = ImageResponseCache.m1677a(imageDownloader.f1730a);
        }
        if (closeable == null) {
            a = ImageDownloader.m1668a(imageDownloader);
            if (a != null) {
                return;
            }
            return;
        }
        Bitmap decodeStream2 = BitmapFactory.decodeStream(closeable);
        af.m1513a(closeable);
        ImageDownloader.m1670a(imageDownloader, null, decodeStream2, z2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m1669a(com.facebook.p036h.ImageDownloader.ImageDownloader r11, android.content.Context r12) {
        /*
        r3 = 0;
        r2 = 0;
        r1 = 1;
        r0 = new java.net.URL;	 Catch:{ IOException -> 0x00bf, all -> 0x00b7 }
        r4 = r11.f1730a;	 Catch:{ IOException -> 0x00bf, all -> 0x00b7 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x00bf, all -> 0x00b7 }
        r0.<init>(r4);	 Catch:{ IOException -> 0x00bf, all -> 0x00b7 }
        r0 = r0.openConnection();	 Catch:{ IOException -> 0x00bf, all -> 0x00b7 }
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IOException -> 0x00bf, all -> 0x00b7 }
        r4 = 0;
        r0.setInstanceFollowRedirects(r4);	 Catch:{ IOException -> 0x00c4, all -> 0x00ba }
        r4 = r0.getResponseCode();	 Catch:{ IOException -> 0x00c4, all -> 0x00ba }
        switch(r4) {
            case 200: goto L_0x0088;
            case 301: goto L_0x0052;
            case 302: goto L_0x0052;
            default: goto L_0x001f;
        };	 Catch:{ IOException -> 0x00c4, all -> 0x00ba }
    L_0x001f:
        r5 = r0.getErrorStream();	 Catch:{ IOException -> 0x00c4, all -> 0x00ba }
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        r6.<init>();	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        if (r5 == 0) goto L_0x00ad;
    L_0x002a:
        r4 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        r4.<init>(r5);	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r7 = new char[r7];	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
    L_0x0033:
        r8 = 0;
        r9 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r8 = r4.read(r7, r8, r9);	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        if (r8 <= 0) goto L_0x0094;
    L_0x003c:
        r9 = 0;
        r6.append(r7, r9, r8);	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        goto L_0x0033;
    L_0x0041:
        r4 = move-exception;
        r10 = r4;
        r4 = r0;
        r0 = r10;
    L_0x0045:
        com.facebook.p036h.af.m1513a(r5);
        com.facebook.p036h.af.m1517a(r4);
        r4 = r0;
    L_0x004c:
        if (r1 == 0) goto L_0x0051;
    L_0x004e:
        com.facebook.p036h.ImageDownloader.m1670a(r11, r4, r3, r2);
    L_0x0051:
        return;
    L_0x0052:
        r1 = "location";
        r1 = r0.getHeaderField(r1);	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        r4 = com.facebook.p036h.af.m1523a(r1);	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        if (r4 != 0) goto L_0x00d2;
    L_0x005e:
        r1 = android.net.Uri.parse(r1);	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        r4 = r11.f1730a;	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        com.facebook.p036h.ae.m1485a(r4, r1);	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        r4 = com.facebook.p036h.ImageDownloader.m1668a(r11);	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        if (r4 == 0) goto L_0x007e;
    L_0x006d:
        r5 = r4.f1729c;	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        if (r5 != 0) goto L_0x007e;
    L_0x0071:
        r4 = r4.f1728b;	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        r5 = new com.facebook.h.r$d;	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        r6 = r11.f1731b;	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        r5.<init>(r1, r6);	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
        r1 = 0;
        com.facebook.p036h.ImageDownloader.m1674a(r4, r5, r1);	 Catch:{ IOException -> 0x00cb, all -> 0x00ba }
    L_0x007e:
        r1 = r2;
        r4 = r3;
        r5 = r3;
    L_0x0081:
        com.facebook.p036h.af.m1513a(r5);
        com.facebook.p036h.af.m1517a(r0);
        goto L_0x004c;
    L_0x0088:
        r5 = com.facebook.p036h.ImageResponseCache.m1678a(r0);	 Catch:{ IOException -> 0x00c4, all -> 0x00ba }
        r4 = android.graphics.BitmapFactory.decodeStream(r5);	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        r10 = r4;
        r4 = r3;
        r3 = r10;
        goto L_0x0081;
    L_0x0094:
        com.facebook.p036h.af.m1513a(r4);	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
    L_0x0097:
        r4 = new com.facebook.i;	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        r6 = r6.toString();	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        r4.<init>(r6);	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        goto L_0x0081;
    L_0x00a1:
        r1 = move-exception;
        r3 = r5;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x00a6:
        com.facebook.p036h.af.m1513a(r3);
        com.facebook.p036h.af.m1517a(r1);
        throw r0;
    L_0x00ad:
        r4 = com.facebook.ab.R.com_facebook_image_download_unknown_error;	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        r4 = r12.getString(r4);	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        r6.append(r4);	 Catch:{ IOException -> 0x0041, all -> 0x00a1 }
        goto L_0x0097;
    L_0x00b7:
        r0 = move-exception;
        r1 = r3;
        goto L_0x00a6;
    L_0x00ba:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
        goto L_0x00a6;
    L_0x00bf:
        r0 = move-exception;
        r5 = r3;
        r4 = r3;
        goto L_0x0045;
    L_0x00c4:
        r4 = move-exception;
        r5 = r3;
        r10 = r4;
        r4 = r0;
        r0 = r10;
        goto L_0x0045;
    L_0x00cb:
        r1 = move-exception;
        r5 = r3;
        r4 = r0;
        r0 = r1;
        r1 = r2;
        goto L_0x0045;
    L_0x00d2:
        r1 = r2;
        r4 = r3;
        r5 = r3;
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.h.r.a(com.facebook.h.r$d, android.content.Context):void");
    }
}
