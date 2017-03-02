package com.igexin.p022a.p023a.p030c;

import android.app.Activity;
import android.os.Environment;
import android.util.Log;
import com.igexin.push.config.C0382p;
import com.igexin.push.core.C0483g;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.igexin.a.a.c.a */
public class C0247a extends Activity implements UncaughtExceptionHandler {
    public static boolean f641a;

    static {
        f641a = C0382p.f1039a.equals("debug");
    }

    public static synchronized void m836a(String str) {
        synchronized (C0247a.class) {
            C0247a.m838b(str);
        }
    }

    public static final void m837a(String str, String str2) {
        if (f641a) {
            Log.d(str, str2);
        }
    }

    public static synchronized void m838b(String str) {
        synchronized (C0247a.class) {
            if (f641a || (C0483g.f1302N && C0483g.f1303O >= System.currentTimeMillis())) {
                C0247a.m841d(str, C0483g.f1319e);
            }
        }
    }

    public static final void m839b(String str, String str2) {
        if (f641a) {
            Log.i(str, str2);
        }
    }

    public static final void m840c(String str, String str2) {
        if (f641a) {
            Log.e(str, str2);
        }
    }

    public static synchronized void m841d(String str, String str2) {
        synchronized (C0247a.class) {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            if (!(str2 == null || Constants.STR_EMPTY.equals(str2))) {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    String str3 = "/sdcard/libs/";
                    File file = new File(str3);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    try {
                        file = new File(str3 + str2 + "." + format + ".log");
                        if (file.exists() || file.createNewFile()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                            fileOutputStream.write(((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "|" + str) + "\r\n").getBytes());
                            fileOutputStream.close();
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
    }
}
