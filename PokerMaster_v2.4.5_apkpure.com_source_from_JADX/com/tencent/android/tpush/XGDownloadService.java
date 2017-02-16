package com.tencent.android.tpush;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import com.google.protobuf.CodedOutputStream;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.ProGuard;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: ProGuard */
public class XGDownloadService extends Service {
    private static final String f7210c;
    private int f7211a;
    private String f7212b;
    private File f7213d;
    private File f7214e;
    private NotificationManager f7215f;
    private Notification f7216g;
    private Intent f7217h;
    private PendingIntent f7218i;
    private Handler f7219j;

    public XGDownloadService() {
        this.f7211a = 0;
        this.f7212b = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7213d = null;
        this.f7214e = null;
        this.f7215f = null;
        this.f7216g = null;
        this.f7217h = null;
        this.f7218i = null;
        this.f7219j = new ProGuard(this);
    }

    static {
        f7210c = XGDownloadService.class.getSimpleName();
    }

    public long m4673a(String str, File file, int i) {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        Throwable th;
        FileOutputStream fileOutputStream;
        long j = 0;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setRequestProperty("User-Agent", "PacificHttpClient");
                httpURLConnection2.setConnectTimeout(Constants.ERRORCODE_UNKNOWN);
                httpURLConnection2.setReadTimeout(20000);
                int contentLength = httpURLConnection2.getContentLength();
                if (httpURLConnection2.getResponseCode() == 404) {
                    throw new Exception("fail!");
                }
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                    try {
                        byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                        int i2 = 0;
                        while (true) {
                            int read = inputStream2.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                            j += (long) read;
                            if (i2 == 0 || ((int) ((100 * j) / ((long) contentLength))) - 10 > i2) {
                                i2 += 10;
                                this.f7216g.setLatestEventInfo(this, "\u6b63\u5728\u4e0b\u8f7d", ((((int) j) * 100) / contentLength) + "%", this.f7218i);
                                this.f7215f.notify(i, this.f7216g);
                            }
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        fileOutputStream2.close();
                        return j;
                    } catch (Throwable th2) {
                        inputStream = inputStream2;
                        FileOutputStream fileOutputStream3 = fileOutputStream2;
                        httpURLConnection = httpURLConnection2;
                        th = th2;
                        fileOutputStream = fileOutputStream3;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th22) {
                    httpURLConnection = httpURLConnection2;
                    th = th22;
                    fileOutputStream = null;
                    inputStream = inputStream2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th222) {
                Throwable th3 = th222;
                fileOutputStream = null;
                inputStream = null;
                httpURLConnection = httpURLConnection2;
                th = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            httpURLConnection = null;
            fileOutputStream = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int a;
        int i3;
        Throwable th;
        this.f7212b = intent.getStringExtra(Constants.FLAG_PACKAGE_DOWNLOAD_URL);
        try {
            String str = "NOTIFY_ID";
            a = ProGuard.m4812a((Context) this, str, 0);
            if (a >= 2147483646) {
                a = 0;
            }
            try {
                ProGuard.m4818b((Context) this, str, a + 1);
                i3 = a;
            } catch (Throwable th2) {
                th = th2;
                com.tencent.android.tpush.p067a.ProGuard.m4716c(f7210c, LetterIndexBar.SEARCH_ICON_LETTER, th);
                i3 = a;
                if (com.tencent.android.tpush.service.p077d.ProGuard.m5322b()) {
                    this.f7213d = new File(Environment.getExternalStorageDirectory(), "app/download/");
                    this.f7214e = new File(this.f7213d.getPath(), "downloadApp" + i3 + ".apk");
                }
                this.f7215f = (NotificationManager) getSystemService("notification");
                this.f7216g = new Notification();
                this.f7216g.icon = getApplicationInfo().icon;
                this.f7216g.tickerText = "\u5f00\u59cb\u4e0b\u8f7d";
                this.f7216g.setLatestEventInfo(this, "\u4e0b\u8f7d\u5e94\u7528", "0%", this.f7218i);
                this.f7215f.notify(i3, this.f7216g);
                ProGuard.m4795a().m4798a(new ProGuard(this, intent, i3));
                return super.onStartCommand(intent, i, i2);
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            a = 0;
            th = th4;
            com.tencent.android.tpush.p067a.ProGuard.m4716c(f7210c, LetterIndexBar.SEARCH_ICON_LETTER, th);
            i3 = a;
            if (com.tencent.android.tpush.service.p077d.ProGuard.m5322b()) {
                this.f7213d = new File(Environment.getExternalStorageDirectory(), "app/download/");
                this.f7214e = new File(this.f7213d.getPath(), "downloadApp" + i3 + ".apk");
            }
            this.f7215f = (NotificationManager) getSystemService("notification");
            this.f7216g = new Notification();
            this.f7216g.icon = getApplicationInfo().icon;
            this.f7216g.tickerText = "\u5f00\u59cb\u4e0b\u8f7d";
            this.f7216g.setLatestEventInfo(this, "\u4e0b\u8f7d\u5e94\u7528", "0%", this.f7218i);
            this.f7215f.notify(i3, this.f7216g);
            ProGuard.m4795a().m4798a(new ProGuard(this, intent, i3));
            return super.onStartCommand(intent, i, i2);
        }
        if (com.tencent.android.tpush.service.p077d.ProGuard.m5322b()) {
            this.f7213d = new File(Environment.getExternalStorageDirectory(), "app/download/");
            this.f7214e = new File(this.f7213d.getPath(), "downloadApp" + i3 + ".apk");
        }
        this.f7215f = (NotificationManager) getSystemService("notification");
        this.f7216g = new Notification();
        this.f7216g.icon = getApplicationInfo().icon;
        this.f7216g.tickerText = "\u5f00\u59cb\u4e0b\u8f7d";
        this.f7216g.setLatestEventInfo(this, "\u4e0b\u8f7d\u5e94\u7528", "0%", this.f7218i);
        this.f7215f.notify(i3, this.f7216g);
        ProGuard.m4795a().m4798a(new ProGuard(this, intent, i3));
        return super.onStartCommand(intent, i, i2);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}
