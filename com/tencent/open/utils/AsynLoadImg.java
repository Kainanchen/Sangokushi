package com.tencent.open.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.connect.common.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: ProGuard */
public class AsynLoadImg {
    private static String f1703c;
    private String f1704a;
    private AsynLoadImgBack f1705b;
    private long f1706d;
    private Handler f1707e;
    private Runnable f1708f;

    /* renamed from: com.tencent.open.utils.AsynLoadImg.1 */
    class ProGuard extends Handler {
        final /* synthetic */ AsynLoadImg f1701a;

        ProGuard(AsynLoadImg asynLoadImg, Looper looper) {
            this.f1701a = asynLoadImg;
            super(looper);
        }

        public void handleMessage(Message message) {
            com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "handleMessage:" + message.arg1);
            if (message.arg1 == 0) {
                this.f1701a.f1705b.saved(message.arg1, (String) message.obj);
            } else {
                this.f1701a.f1705b.saved(message.arg1, null);
            }
        }
    }

    /* renamed from: com.tencent.open.utils.AsynLoadImg.2 */
    class ProGuard implements Runnable {
        final /* synthetic */ AsynLoadImg f1702a;

        ProGuard(AsynLoadImg asynLoadImg) {
            this.f1702a = asynLoadImg;
        }

        public void run() {
            com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "saveFileRunnable:");
            String str = "share_qq_" + Util.encrypt(this.f1702a.f1704a) + ".jpg";
            String str2 = AsynLoadImg.f1703c + str;
            File file = new File(str2);
            Message obtainMessage = this.f1702a.f1707e.obtainMessage();
            if (file.exists()) {
                obtainMessage.arg1 = 0;
                obtainMessage.obj = str2;
                com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - this.f1702a.f1706d));
            } else {
                boolean saveFile;
                Bitmap bitmap = AsynLoadImg.getbitmap(this.f1702a.f1704a);
                if (bitmap != null) {
                    saveFile = this.f1702a.saveFile(bitmap, str);
                } else {
                    com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "saveFileRunnable:get bmp fail---");
                    saveFile = false;
                }
                if (saveFile) {
                    obtainMessage.arg1 = 0;
                    obtainMessage.obj = str2;
                } else {
                    obtainMessage.arg1 = 1;
                }
                com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - this.f1702a.f1706d));
            }
            this.f1702a.f1707e.sendMessage(obtainMessage);
        }
    }

    public AsynLoadImg(Activity activity) {
        this.f1708f = new ProGuard(this);
        this.f1707e = new ProGuard(this, activity.getMainLooper());
    }

    public void save(String str, AsynLoadImgBack asynLoadImgBack) {
        com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "--save---");
        if (str == null || str.equals(Constants.STR_EMPTY)) {
            asynLoadImgBack.saved(1, null);
        } else if (Util.hasSDCard()) {
            f1703c = Environment.getExternalStorageDirectory() + "/tmp/";
            this.f1706d = System.currentTimeMillis();
            this.f1704a = str;
            this.f1705b = asynLoadImgBack;
            new Thread(this.f1708f).start();
        } else {
            asynLoadImgBack.saved(2, null);
        }
    }

    public boolean saveFile(Bitmap bitmap, String str) {
        Throwable e;
        OutputStream outputStream;
        String str2 = f1703c;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdir();
            }
            str2 = str2 + str;
            com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "saveFile:" + str);
            OutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(str2)));
            try {
                bitmap.compress(CompressFormat.JPEG, 80, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return true;
            } catch (IOException e3) {
                e = e3;
                outputStream = bufferedOutputStream2;
                try {
                    e.printStackTrace();
                    com.tencent.open.p067a.ProGuard.m2118b("AsynLoadImg", "saveFile bmp fail---", e);
                    if (bufferedOutputStream != null) {
                        return false;
                    }
                    try {
                        bufferedOutputStream.close();
                        return false;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    e = th;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e42) {
                            e42.printStackTrace();
                        }
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                outputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw e;
            }
        } catch (IOException e5) {
            e = e5;
            e.printStackTrace();
            com.tencent.open.p067a.ProGuard.m2118b("AsynLoadImg", "saveFile bmp fail---", e);
            if (bufferedOutputStream != null) {
                return false;
            }
            bufferedOutputStream.close();
            return false;
        }
    }

    public static Bitmap getbitmap(String str) {
        com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "getbitmap:" + str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "image download finished." + str);
            return decodeStream;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            com.tencent.open.p067a.ProGuard.m2114a("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        }
    }
}
