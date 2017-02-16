package com.illuminate.texaspoker.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import com.facebook.common.p013b.CallerThreadExecutor;
import com.facebook.drawee.p024a.p025a.Fresco;
import com.facebook.imagepipeline.p041c.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.p043e.ImagePipelineFactory;
import com.facebook.imagepipeline.p045f.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.p050l.ImageRequest;
import com.facebook.imagepipeline.p050l.ImageRequestBuilder;
import com.facebook.p006b.FileBinaryResource;
import com.facebook.p007c.p008a.CacheKey;
import com.facebook.p023d.DataSource;
import com.illuminate.texaspoker.application.BaseApplication;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ImageUtility {

    /* renamed from: com.illuminate.texaspoker.utils.ImageUtility.1 */
    static class C09131 extends BaseBitmapDataSubscriber {
        final /* synthetic */ long f6565a;

        C09131(long j) {
            this.f6565a = j;
        }

        public final void m4069a() {
            Utility.m4478a("NOTIFY_CC_REFRESH_HEAD", Long.valueOf(this.f6565a));
        }

        public final void m4070e(DataSource dataSource) {
        }
    }

    public static byte[] getBitmapBytes(long j, String str, int i, int i2, int i3) {
        boolean z;
        Bitmap decodeResource;
        File file;
        CacheKey a;
        Bitmap createScaledBitmap;
        Bitmap a2;
        byte[] a3;
        int i4 = i2 * 2;
        int i5 = i3 * 2;
        Uri parse = Uri.parse(str);
        if (parse != null) {
            CacheKey a4 = DefaultCacheKeyFactory.m1912a().m1913a(ImageRequest.m2327a(parse));
            if (ImagePipelineFactory.m1949a().m1958c().m974c(a4) || ImagePipelineFactory.m1949a().m1960e().m974c(a4)) {
                z = true;
                if (z) {
                    if (i != 1) {
                        decodeResource = BitmapFactory.decodeResource(BaseApplication.m3548a().getResources(), 2130903198);
                    } else {
                        decodeResource = BitmapFactory.decodeResource(BaseApplication.m3548a().getResources(), 2130903193);
                    }
                    Fresco.m1213b().m1945a(ImageRequestBuilder.m2330a(parse).m2331a(), BaseApplication.m3548a(), ImageRequest.ImageRequest.FULL_FETCH).m1144a(new C09131(j), CallerThreadExecutor.m1005a());
                } else {
                    file = null;
                    if (parse != null) {
                        a = DefaultCacheKeyFactory.m1912a().m1913a(ImageRequest.m2327a(parse));
                        if (ImagePipelineFactory.m1949a().m1958c().m974c(a)) {
                            file = ((FileBinaryResource) ImagePipelineFactory.m1949a().m1958c().m971a(a)).f946a;
                        } else if (ImagePipelineFactory.m1949a().m1960e().m974c(a)) {
                            file = ((FileBinaryResource) ImagePipelineFactory.m1949a().m1960e().m971a(a)).f946a;
                        }
                    }
                    decodeResource = Utility.m4470a(BitmapFactory.decodeFile(file.getAbsolutePath()));
                }
                createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i4, i5, false);
                a2 = Utility.m4470a(createScaledBitmap);
                a3 = m4071a(a2);
                a2.recycle();
                createScaledBitmap.recycle();
                decodeResource.recycle();
                return a3;
            }
        }
        z = false;
        if (z) {
            if (i != 1) {
                decodeResource = BitmapFactory.decodeResource(BaseApplication.m3548a().getResources(), 2130903193);
            } else {
                decodeResource = BitmapFactory.decodeResource(BaseApplication.m3548a().getResources(), 2130903198);
            }
            Fresco.m1213b().m1945a(ImageRequestBuilder.m2330a(parse).m2331a(), BaseApplication.m3548a(), ImageRequest.ImageRequest.FULL_FETCH).m1144a(new C09131(j), CallerThreadExecutor.m1005a());
        } else {
            file = null;
            if (parse != null) {
                a = DefaultCacheKeyFactory.m1912a().m1913a(ImageRequest.m2327a(parse));
                if (ImagePipelineFactory.m1949a().m1958c().m974c(a)) {
                    file = ((FileBinaryResource) ImagePipelineFactory.m1949a().m1958c().m971a(a)).f946a;
                } else if (ImagePipelineFactory.m1949a().m1960e().m974c(a)) {
                    file = ((FileBinaryResource) ImagePipelineFactory.m1949a().m1960e().m971a(a)).f946a;
                }
            }
            decodeResource = Utility.m4470a(BitmapFactory.decodeFile(file.getAbsolutePath()));
        }
        createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i4, i5, false);
        a2 = Utility.m4470a(createScaledBitmap);
        a3 = m4071a(a2);
        a2.recycle();
        createScaledBitmap.recycle();
        decodeResource.recycle();
        return a3;
    }

    public static byte[] m4071a(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String m4072b(Bitmap bitmap) {
        String str = BaseApplication.m3548a().getExternalCacheDir() + "/temp_image/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        str = str + "tempImage.jpg";
        File file2 = new File(str);
        if (file2.exists()) {
            file2.delete();
        }
        try {
            OutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            Log.i("ImageUtility", "\u5df2\u7ecf\u4fdd\u5b58");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file2.exists() ? str : null;
    }
}
