package com.igexin.push.core.p050d;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.alipay.sdk.util.C0203j;
import com.igexin.download.Downloads;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.C0431e;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.p052f.C0513b;
import com.igexin.sdk.PushService;
import com.tencent.tauth.AuthActivity;
import com.zkunity.app.ResourceIDs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/* renamed from: com.igexin.push.core.d.h */
public class C0474h implements Runnable {
    private Context f1260a;
    private C0431e f1261b;
    private boolean f1262c;
    private int f1263d;

    public C0474h(Context context, C0431e c0431e, boolean z) {
        this.f1260a = context;
        this.f1261b = c0431e;
        this.f1262c = z;
    }

    protected boolean m1661a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            C0247a.m838b("HttpExtensionDownload downLoad ext name is invalid name = " + str2);
            return false;
        } else if (TextUtils.isEmpty(str)) {
            this.f1263d = 3;
            C0402e.m1330a().m1383d("url is invalid");
            C0247a.m838b("HttpExtensionDownload downLoad ext url is invalid, url = " + str);
            return false;
        } else if (str.startsWith("http://") || str.startsWith("https://")) {
            Process.setThreadPriority(10);
            try {
                HttpResponse execute = new DefaultHttpClient().execute(new HttpGet(str));
                if (execute.getStatusLine().getStatusCode() != Downloads.STATUS_SUCCESS) {
                    this.f1263d++;
                    return false;
                }
                InputStream content = execute.getEntity().getContent();
                String str4 = C0483g.ad + "/" + str2;
                File file = new File(str4);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                while (true) {
                    int read = content.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                content.close();
                if (C0259a.m876a(this.f1260a, str4).equals(str3)) {
                    File file2 = new File(C0483g.ad + "/" + this.f1261b.m1489c());
                    file.renameTo(file2);
                    if (this.f1261b.m1497g() || this.f1261b.m1498h() != 0) {
                        C0247a.m838b("HttpExtensionDownload downLoadFile success do not copy ext to local tmp name = " + this.f1261b.m1489c());
                    } else {
                        File file3 = new File(C0483g.ac + "/" + this.f1261b.m1489c());
                        if (!file3.exists()) {
                            C0247a.m838b("HttpExtensionDownload downLoadFile success cope ext to local tmp name = " + this.f1261b.m1489c());
                            C0513b.m1849a(file2, file3, this.f1261b.m1495f());
                        } else if (!C0259a.m876a(C0483g.f1321g, file3.getAbsolutePath()).equals(this.f1261b.m1495f())) {
                            file3.delete();
                            C0513b.m1849a(file2, file3, this.f1261b.m1495f());
                            C0247a.m838b("HttpExtensionDownload downLoadFile success delete local tmp and copy ext name = " + this.f1261b.m1489c());
                        }
                    }
                    return true;
                }
                C0247a.m838b("HttpExtensionDownload download ext failed CheckSum error name = " + this.f1261b.m1489c());
                if (file.exists()) {
                    file.delete();
                }
                this.f1263d = 4;
                return false;
            } catch (IllegalArgumentException e) {
                this.f1263d = 3;
                C0402e.m1330a().m1383d(e.toString());
                C0247a.m838b("HttpExtensionDownload" + e.toString());
                return false;
            } catch (Exception e2) {
                this.f1263d++;
                C0247a.m838b("HttpExtensionDownload" + e2.toString());
                return false;
            }
        } else {
            this.f1263d = 3;
            C0402e.m1330a().m1383d("httpUrl : " + str + " is invalid ...");
            C0247a.m838b("HttpExtensionDownload downLoad ext url is invalid url = " + str);
            return false;
        }
    }

    public void run() {
        while (true) {
            try {
                C0247a.m838b("HttpExtensionDownload downloading " + this.f1261b.m1489c() + ".tmp");
                Intent intent;
                if (m1661a(this.f1261b.m1493e(), this.f1261b.m1489c() + ".tmp", this.f1261b.m1495f())) {
                    C0247a.m838b("HttpExtensionDownload download " + this.f1261b.m1489c() + ".tmp, success ########");
                    intent = new Intent(this.f1260a, PushService.class);
                    intent.putExtra(AuthActivity.ACTION_KEY, "com.igexin.sdk.action.extdownloadsuccess");
                    intent.putExtra(ResourceIDs.ID, this.f1261b.m1481a());
                    intent.putExtra(C0203j.f519c, true);
                    intent.putExtra("isReload", this.f1262c);
                    this.f1260a.startService(intent);
                    return;
                }
                C0247a.m838b("HttpExtensionDownload download ext failed name = " + this.f1261b.m1489c() + " downloadFailedTimes = " + this.f1263d);
                if (this.f1263d >= 3) {
                    intent = new Intent(this.f1260a, PushService.class);
                    intent.putExtra(AuthActivity.ACTION_KEY, "com.igexin.sdk.action.extdownloadsuccess");
                    intent.putExtra(ResourceIDs.ID, this.f1261b.m1481a());
                    intent.putExtra(C0203j.f519c, false);
                    this.f1260a.startService(intent);
                    return;
                }
            } catch (Exception e) {
                C0247a.m838b("HttpExtensionDownload|" + e.toString());
            }
        }
    }
}
