package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.amap.p003a.aj.DownloadManager;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Map;

/* compiled from: SDKCoordinatorDownload */
/* renamed from: com.amap.a.ci */
public final class ci extends Thread implements DownloadManager {
    private static String f612h;
    private static String f613i;
    SDKCoordinatorDownload f614a;
    String f615b;
    private aj f616c;
    private RandomAccessFile f617d;
    private String f618e;
    private String f619f;
    private Context f620g;

    /* renamed from: com.amap.a.ci.a */
    private static class SDKCoordinatorDownload extends am {
        String f611a;

        SDKCoordinatorDownload(String str) {
            this.f611a = str;
        }

        public final Map<String, String> m596a() {
            return null;
        }

        public final Map<String, String> m597b() {
            return null;
        }

        public final String m598c() {
            return this.f611a;
        }
    }

    static {
        fixHelper.fixfunc(new int[]{309, 310, 311, 312, 313, 314, 315});
        ci.__clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native ci(Context context, String str, String str2, String str3);

    static void __clinit__() {
        f612h = "sodownload";
        f613i = "sofail";
    }

    public static String m599a(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "libso" + File.separator + str;
    }

    private native void m600d();

    public final native void m601a();

    public final native void m602a(byte[] bArr, long j);

    public final native void m603b();

    public final native void m604c();

    public final native void run();
}
