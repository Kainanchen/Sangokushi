package com.tencent.connect.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.loopj.android.http.AsyncHttpClient;
import com.tencent.open.utils.AsynLoadImgBack;
import com.tencent.open.utils.Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: com.tencent.connect.share.a */
public class ProGuard {

    /* renamed from: com.tencent.connect.share.a.1 */
    static class ProGuard extends Handler {
        final /* synthetic */ AsynLoadImgBack f1567a;

        ProGuard(Looper looper, AsynLoadImgBack asynLoadImgBack) {
            this.f1567a = asynLoadImgBack;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 101:
                    this.f1567a.saved(0, (String) message.obj);
                case 102:
                    this.f1567a.saved(message.arg1, null);
                default:
                    super.handleMessage(message);
            }
        }
    }

    /* renamed from: com.tencent.connect.share.a.2 */
    static class ProGuard implements Runnable {
        final /* synthetic */ String f1568a;
        final /* synthetic */ Handler f1569b;

        ProGuard(String str, Handler handler) {
            this.f1568a = str;
            this.f1569b = handler;
        }

        public void run() {
            Bitmap a = ProGuard.m2000a(this.f1568a, 140);
            if (a != null) {
                String a2;
                String str = Environment.getExternalStorageDirectory() + "/tmp/";
                String str2 = "share2qq_temp" + Util.encrypt(this.f1568a) + ".jpg";
                if (ProGuard.m2006b(this.f1568a, 140, 140)) {
                    com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AsynScaleCompressImage", "out of bound,compress!");
                    a2 = ProGuard.m2001a(a, str, str2);
                } else {
                    com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AsynScaleCompressImage", "not out of bound,not compress!");
                    a2 = this.f1568a;
                }
                com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AsynScaleCompressImage", "-->destFilePath: " + a2);
                if (a2 != null) {
                    Message obtainMessage = this.f1569b.obtainMessage(101);
                    obtainMessage.obj = a2;
                    this.f1569b.sendMessage(obtainMessage);
                    return;
                }
            }
            Message obtainMessage2 = this.f1569b.obtainMessage(102);
            obtainMessage2.arg1 = 3;
            this.f1569b.sendMessage(obtainMessage2);
        }
    }

    /* renamed from: com.tencent.connect.share.a.3 */
    static class ProGuard extends Handler {
        final /* synthetic */ AsynLoadImgBack f1570a;

        ProGuard(Looper looper, AsynLoadImgBack asynLoadImgBack) {
            this.f1570a = asynLoadImgBack;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 101:
                    this.f1570a.batchSaved(0, message.getData().getStringArrayList("images"));
                default:
                    super.handleMessage(message);
            }
        }
    }

    /* renamed from: com.tencent.connect.share.a.4 */
    static class ProGuard implements Runnable {
        final /* synthetic */ ArrayList f1571a;
        final /* synthetic */ Handler f1572b;

        ProGuard(ArrayList arrayList, Handler handler) {
            this.f1571a = arrayList;
            this.f1572b = handler;
        }

        public void run() {
            for (int i = 0; i < this.f1571a.size(); i++) {
                Object obj = (String) this.f1571a.get(i);
                if (!Util.isValidUrl(obj) && Util.fileExists(obj)) {
                    Bitmap a = ProGuard.m2000a((String) obj, (int) AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT);
                    if (a != null) {
                        String str = Environment.getExternalStorageDirectory() + "/tmp/";
                        String str2 = "share2qzone_temp" + Util.encrypt(obj) + ".jpg";
                        if (ProGuard.m2006b((String) obj, 640, (int) AsyncHttpClient.DEFAULT_SOCKET_TIMEOUT)) {
                            com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AsynScaleCompressImage", "out of bound, compress!");
                            obj = ProGuard.m2001a(a, str, str2);
                        } else {
                            com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AsynScaleCompressImage", "not out of bound,not compress!");
                        }
                        if (obj != null) {
                            this.f1571a.set(i, obj);
                        }
                    }
                }
            }
            Message obtainMessage = this.f1572b.obtainMessage(101);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("images", this.f1571a);
            obtainMessage.setData(bundle);
            this.f1572b.sendMessage(obtainMessage);
        }
    }

    public static final void m2002a(Context context, String str, AsynLoadImgBack asynLoadImgBack) {
        com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage");
        if (TextUtils.isEmpty(str)) {
            asynLoadImgBack.saved(1, null);
        } else if (Util.hasSDCard()) {
            new Thread(new ProGuard(str, new ProGuard(context.getMainLooper(), asynLoadImgBack))).start();
        } else {
            asynLoadImgBack.saved(2, null);
        }
    }

    public static final void m2003a(Context context, ArrayList<String> arrayList, AsynLoadImgBack asynLoadImgBack) {
        com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AsynScaleCompressImage", "batchScaleCompressImage");
        if (arrayList == null) {
            asynLoadImgBack.saved(1, null);
        } else {
            new Thread(new ProGuard(arrayList, new ProGuard(context.getMainLooper(), asynLoadImgBack))).start();
        }
    }

    private static Bitmap m1999a(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            width = height;
        }
        float f = ((float) i) / ((float) width);
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    protected static final String m2001a(Bitmap bitmap, String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        String stringBuffer = new StringBuffer(str).append(str2).toString();
        File file2 = new File(stringBuffer);
        if (file2.exists()) {
            file2.delete();
        }
        if (bitmap != null) {
            try {
                OutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(CompressFormat.JPEG, 80, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                bitmap.recycle();
                return stringBuffer;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    private static final boolean m2006b(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (options.mCancel || options.outWidth == -1 || options.outHeight == -1) {
            return false;
        }
        int i5 = i3 > i4 ? i3 : i4;
        if (i3 >= i4) {
            i3 = i4;
        }
        com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AsynScaleCompressImage", "longSide=" + i5 + "shortSide=" + i3);
        options.inPreferredConfig = Config.RGB_565;
        if (i5 > i2 || i3 > i) {
            return true;
        }
        return false;
    }

    public static final Bitmap m2000a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (options.mCancel || options.outWidth == -1 || options.outHeight == -1) {
            return null;
        }
        Bitmap decodeFile;
        if (i2 <= i3) {
            i2 = i3;
        }
        options.inPreferredConfig = Config.RGB_565;
        if (i2 > i) {
            options.inSampleSize = ProGuard.m1998a(options, -1, i * i);
        }
        options.inJustDecodeBounds = false;
        try {
            decodeFile = BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            decodeFile = null;
        }
        if (decodeFile == null) {
            return null;
        }
        i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 <= i4) {
            i3 = i4;
        }
        if (i3 > i) {
            return ProGuard.m1999a(decodeFile, i);
        }
        return decodeFile;
    }

    public static final int m1998a(Options options, int i, int i2) {
        int b = ProGuard.m2005b(options, i, i2);
        if (b > 8) {
            return ((b + 7) / 8) * 8;
        }
        int i3 = 1;
        while (i3 < b) {
            i3 <<= 1;
        }
        return i3;
    }

    private static int m2005b(Options options, int i, int i2) {
        double d = (double) options.outWidth;
        double d2 = (double) options.outHeight;
        int ceil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / ((double) i2)));
        int min = i == -1 ? AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS : (int) Math.min(Math.floor(d / ((double) i)), Math.floor(d2 / ((double) i)));
        if (min < ceil) {
            return ceil;
        }
        if (i2 == -1 && i == -1) {
            return 1;
        }
        if (i != -1) {
            return min;
        }
        return ceil;
    }
}
