package com.amap.p003a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.amap.p003a.DexFileManager.DexFileManager;
import com.amap.p003a.aa.DynamicPlugin;
import com.amap.p003a.aj.DownloadManager;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.List;

/* renamed from: com.amap.a.q */
public final class DexDownLoad extends Thread implements DownloadManager {
    private DexDownloadItem f695a;
    private aj f696b;
    private cj f697c;
    private String f698d;
    private RandomAccessFile f699e;
    private Context f700f;

    public DexDownLoad(Context context, DexDownloadItem dexDownloadItem, cj cjVar) {
        try {
            this.f700f = context.getApplicationContext();
            this.f697c = cjVar;
            if (dexDownloadItem != null) {
                this.f695a = dexDownloadItem;
                this.f696b = new aj(new DexDownLoadRequest(this.f695a));
                this.f698d = DexFileManager.m735a(context, this.f695a.f703c);
            }
        } catch (Throwable th) {
            cm.m637a(th, "dDownLoad", "DexDownLoad()");
        }
    }

    private boolean m710a(DBOperation dBOperation) {
        try {
            List a = DexFileManager.m732a(dBOperation, this.f695a.f704d, "used");
            if (a != null && a.size() > 0 && ac.m103a(((aa) a.get(0)).f78d, this.f695a.f706f) > 0) {
                return true;
            }
        } catch (Throwable th) {
            cm.m637a(th, "dDownLoad", "isUsed()");
        }
        return false;
    }

    private boolean m711a(DBOperation dBOperation, aa aaVar, DexDownloadItem dexDownloadItem) {
        String str = dexDownloadItem.f704d;
        String str2 = dexDownloadItem.f705e;
        String str3 = dexDownloadItem.f706f;
        if ("errorstatus".equals(aaVar.f79e)) {
            if (new File(DexFileManager.m742b(this.f700f, this.f697c.m611a(), this.f697c.m612b())).exists() || TextUtils.isEmpty(DexFileManager.m734a(this.f700f, dBOperation, this.f697c))) {
                return true;
            }
            try {
                DexFileManager.m738a(this.f700f, this.f697c);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return true;
            }
        } else if (!new File(this.f698d).exists()) {
            return false;
        } else {
            if (dBOperation.m681a(aa.m67a(DexFileManager.m736a(this.f700f, str, str2), str, str2, str3), aa.class, false).size() > 0) {
                return true;
            }
            try {
                DexFileManager.m736a(this.f700f, str, this.f697c.m612b());
                DexFileManager.m739a(this.f700f, dBOperation, this.f697c, this.f698d, str3);
                DexFileManager.m738a(this.f700f, this.f697c);
                return true;
            } catch (Throwable th2) {
                cm.m637a(th2, "dDownLoad", "processDownloadedFile()");
                return true;
            }
        }
    }

    private boolean m712d() {
        try {
            Object obj = (this.f697c != null && this.f697c.m611a().equals(this.f695a.f704d) && this.f697c.m612b().equals(this.f695a.f705e)) ? 1 : null;
            if (obj != null) {
                obj = (VERSION.SDK_INT < this.f695a.f708h || VERSION.SDK_INT > this.f695a.f707g) ? null : 1;
                if (obj != null) {
                    if ((ce.m563m(this.f700f) == 1 ? 1 : null) != null) {
                        boolean z;
                        DBOperation dBOperation = new DBOperation(this.f700f, DynamicFileDBCreator.m751b());
                        if (m710a(dBOperation)) {
                            z = true;
                        } else {
                            aa a = DexFileManager.m731a(dBOperation, this.f695a.f703c);
                            z = a != null ? m711a(dBOperation, a, this.f695a) : false;
                        }
                        if (!z) {
                            Context context = this.f700f;
                            String a2 = this.f697c.m611a();
                            DBOperation dBOperation2 = new DBOperation(context, DynamicFileDBCreator.m751b());
                            List a3 = DexFileManager.m732a(dBOperation2, a2, "copy");
                            ac.m106a(a3);
                            if (a3 != null && a3.size() > 1) {
                                int size = a3.size();
                                for (int i = 1; i < size; i++) {
                                    DexFileManager.m743b(context, dBOperation2, ((aa) a3.get(i)).f75a);
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            cm.m637a(th, "dDownLoad", "isNeedDownload()");
            return false;
        }
    }

    public final void m713a() {
        ac.m105a(this.f699e);
    }

    public final void m714a(byte[] bArr, long j) {
        try {
            if (this.f699e == null) {
                File file = new File(this.f698d);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                this.f699e = new RandomAccessFile(file, "rw");
            }
            this.f699e.seek(j);
            this.f699e.write(bArr);
        } catch (Throwable th) {
            cm.m637a(th, "dDownLoad", "onDownload()");
        }
    }

    public final void m715b() {
        try {
            if (this.f699e != null) {
                ac.m105a(this.f699e);
                String str = this.f695a.f702b;
                if (ac.m108b(this.f698d, str)) {
                    String str2 = this.f695a.f705e;
                    DBOperation dBOperation = new DBOperation(this.f700f, DynamicFileDBCreator.m751b());
                    DynamicPlugin dynamicPlugin = new DynamicPlugin(this.f695a.f703c, str, this.f695a.f704d, str2, this.f695a.f706f);
                    dynamicPlugin.f74f = "copy";
                    dBOperation.m683a(dynamicPlugin.m64a(), aa.m67a(this.f695a.f703c, this.f695a.f704d, str2, this.f695a.f706f));
                    Editor edit = this.f700f.getSharedPreferences(this.f695a.f704d, 0).edit();
                    edit.clear();
                    edit.commit();
                    try {
                        DexFileManager.m739a(this.f700f, dBOperation, this.f697c, this.f698d, this.f695a.f706f);
                        DexFileManager.m738a(this.f700f, this.f697c);
                    } catch (Throwable th) {
                        cm.m637a(th, "dDownLoad", "onFinish1");
                    }
                    aq aqVar = new aq(this.f700f, this.f697c.m611a(), this.f697c.m612b(), "O008");
                    aqVar.m187a("{\"param_int_first\":1}");
                    ar.m190a(aqVar, this.f700f);
                    return;
                }
                try {
                    new File(this.f698d).delete();
                } catch (Throwable th2) {
                    cm.m637a(th2, "dDownLoad", "onFinish");
                }
            }
        } catch (Throwable th22) {
            cm.m637a(th22, "dDownLoad", "onFinish()");
        }
    }

    public final void m716c() {
    }

    public final void run() {
        try {
            if (m712d()) {
                aq aqVar = new aq(this.f700f, this.f697c.m611a(), this.f697c.m612b(), "O008");
                aqVar.m187a("{\"param_int_first\":0}");
                ar.m190a(aqVar, this.f700f);
                this.f696b.m172a(this);
            }
        } catch (Throwable th) {
            cm.m637a(th, "dDownLoad", "run()");
        }
    }
}
