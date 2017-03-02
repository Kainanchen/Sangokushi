package com.igexin.push.extension;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Process;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.p022a.p023a.p024a.C0227a;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.config.C0367a;
import com.igexin.push.config.C0377k;
import com.igexin.push.config.C0378l;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.C0431e;
import com.igexin.push.core.p050d.C0474h;
import com.igexin.push.extension.stub.IPushExtension;
import com.igexin.push.p052f.C0513b;
import dalvik.system.DexClassLoader;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.igexin.push.extension.a */
public class C0511a {
    private static String f1412a;
    private static C0511a f1413c;
    private List f1414b;

    static {
        f1412a = C0377k.f1013a;
    }

    private C0511a() {
        this.f1414b = new ArrayList();
    }

    public static C0511a m1834a() {
        if (f1413c == null) {
            f1413c = new C0511a();
        }
        return f1413c;
    }

    public void m1835a(File file, File file2, String str) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream;
        Throwable th;
        Throwable th2;
        BufferedOutputStream bufferedOutputStream = null;
        FileInputStream fileInputStream2;
        BufferedOutputStream bufferedOutputStream2;
        try {
            fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                } catch (Exception e) {
                    bufferedOutputStream2 = null;
                    fileOutputStream2 = fileOutputStream;
                    fileInputStream = fileInputStream2;
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e2) {
                                return;
                            }
                        }
                        if (bufferedOutputStream2 != null) {
                            bufferedOutputStream2.close();
                        }
                        if (fileOutputStream2 == null) {
                            fileOutputStream2.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream2 = fileInputStream;
                        fileOutputStream = fileOutputStream2;
                        bufferedOutputStream = bufferedOutputStream2;
                        th2 = th;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e3) {
                                throw th2;
                            }
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th2;
                }
            } catch (Exception e4) {
                bufferedOutputStream2 = null;
                fileInputStream = fileInputStream2;
                if (file2.exists()) {
                    file2.delete();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                if (fileOutputStream2 == null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th5) {
                th2 = th5;
                fileOutputStream = null;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th2;
            }
            try {
                Object obj = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                while (true) {
                    int read = fileInputStream2.read(obj);
                    if (read == -1) {
                        break;
                    }
                    byte[] bArr = new byte[read];
                    System.arraycopy(obj, 0, bArr, 0, read);
                    bufferedOutputStream2.write(C0227a.m722a(bArr, str));
                }
                fileInputStream2.close();
                bufferedOutputStream2.flush();
                bufferedOutputStream2.close();
                fileOutputStream.close();
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e5) {
                        return;
                    }
                }
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Exception e6) {
                fileOutputStream2 = fileOutputStream;
                fileInputStream = fileInputStream2;
                if (file2.exists()) {
                    file2.delete();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                if (fileOutputStream2 == null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedOutputStream = bufferedOutputStream2;
                th2 = th;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th2;
            }
        } catch (Exception e7) {
            bufferedOutputStream2 = null;
            fileInputStream = null;
            if (file2.exists()) {
                file2.delete();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            if (fileOutputStream2 == null) {
                fileOutputStream2.close();
            }
        } catch (Throwable th7) {
            th2 = th7;
            fileOutputStream = null;
            fileInputStream2 = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th2;
        }
    }

    public boolean m1836a(Context context) {
        try {
            if (C0378l.f1033t != null) {
                Map b = C0378l.f1033t.m1504b();
                List<Integer> arrayList = new ArrayList();
                for (Entry entry : b.entrySet()) {
                    int intValue = ((Integer) entry.getKey()).intValue();
                    C0431e c0431e = (C0431e) entry.getValue();
                    String str = C0483g.ad + "/" + c0431e.m1489c();
                    File file = new File(str);
                    if (file.exists()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (c0431e.m1498h() == 0 || c0431e.m1499i() + c0431e.m1498h() >= currentTimeMillis) {
                            if (m1837a(context, str, c0431e.m1491d(), c0431e.m1500j(), c0431e.m1489c()) && c0431e.m1499i() != 0) {
                                c0431e.m1487b(currentTimeMillis);
                            }
                            if (c0431e.m1497g()) {
                                C0513b.m1850a(c0431e.m1489c());
                                arrayList.add(Integer.valueOf(intValue));
                            }
                        } else {
                            C0513b.m1850a(c0431e.m1489c());
                            arrayList.add(Integer.valueOf(intValue));
                        }
                    } else {
                        File file2 = new File(C0483g.ac + "/" + c0431e.m1489c());
                        if (file2.exists() && c0431e.m1495f().equals(C0259a.m876a(C0483g.f1321g, file2.getAbsolutePath()))) {
                            C0247a.m838b(f1412a + " public local file match the condition...");
                            if (file.createNewFile()) {
                                if (C0513b.m1849a(file2, file, c0431e.m1495f())) {
                                    C0247a.m838b(f1412a + " restart the service to load ext:" + file.getAbsolutePath());
                                    Process.killProcess(Process.myPid());
                                } else {
                                    C0247a.m838b(f1412a + " copy " + file2.getAbsolutePath() + " to " + file.getAbsolutePath() + " failed...");
                                    C0513b.m1850a(c0431e.m1489c());
                                }
                            }
                        }
                        if (((ConnectivityManager) C0483g.f1321g.getSystemService("connectivity")).getNetworkInfo(1).isConnected()) {
                            new Thread(new C0474h(C0483g.f1321g, c0431e, true)).start();
                        } else {
                            C0247a.m838b(f1412a + " init ext not exit don't download because connect state is not wifi");
                        }
                    }
                }
                if (arrayList != null && arrayList.size() > 0) {
                    for (Integer intValue2 : arrayList) {
                        b.remove(Integer.valueOf(intValue2.intValue()));
                    }
                    C0247a.m838b(f1412a + " save extension info data to db");
                    C0367a.m1224a().m1240g();
                }
                return true;
            }
            List<String> arrayList2 = new ArrayList();
            arrayList2.add("com.igexin.push.extension.distribution.basic.stub.PushExtension");
            arrayList2.add("com.igexin.push.extension.distribution.gbd.stub.PushExtension");
            arrayList2.add("com.igexin.push.extension.distribution.lbs.stub.PushExtension");
            for (String str2 : arrayList2) {
                try {
                    IPushExtension iPushExtension = (IPushExtension) context.getClassLoader().loadClass(str2).newInstance();
                    iPushExtension.init(C0483g.f1321g);
                    this.f1414b.add(iPushExtension);
                    C0247a.m838b("[main] extension loaded(mock): " + str2);
                } catch (Exception e) {
                    C0247a.m838b(f1412a + e.toString());
                }
            }
            return true;
        } catch (Exception e2) {
            C0247a.m838b(f1412a + e2.toString());
        }
    }

    public boolean m1837a(Context context, String str, String str2, String str3, String str4) {
        Class cls = null;
        File file = new File(str);
        File file2 = new File(str + ".jar");
        File file3 = new File(context.getFilesDir().getAbsolutePath() + "/" + str4 + ".dex");
        m1835a(file, file2, str3);
        if (file2.exists()) {
            try {
                try {
                    cls = new DexClassLoader(file2.getAbsolutePath(), context.getFilesDir().getAbsolutePath(), null, context.getClassLoader()).loadClass(str2);
                } catch (Exception e) {
                }
                file2.delete();
                IPushExtension iPushExtension;
                if (file3.exists()) {
                    if (cls == null) {
                        return false;
                    }
                    iPushExtension = (IPushExtension) cls.newInstance();
                    if (iPushExtension != null) {
                        iPushExtension.init(C0483g.f1321g);
                        this.f1414b.add(iPushExtension);
                        C0247a.m838b("[main] extension loaded: " + str);
                        return true;
                    }
                } else if (cls == null) {
                    return false;
                } else {
                    iPushExtension = (IPushExtension) cls.newInstance();
                    if (iPushExtension != null) {
                        iPushExtension.init(C0483g.f1321g);
                        this.f1414b.add(iPushExtension);
                        C0247a.m838b("[main] extension loaded: " + str);
                        return true;
                    }
                }
            } catch (Exception e2) {
                C0247a.m838b(f1412a + e2.toString());
            } catch (Throwable th) {
                C0247a.m838b(f1412a + th.toString());
                if (file2.exists()) {
                    file2.delete();
                }
                if (file3.exists()) {
                }
            }
        }
        return false;
    }

    public void m1838b() {
        for (IPushExtension onDestroy : this.f1414b) {
            onDestroy.onDestroy();
        }
    }

    public List m1839c() {
        return this.f1414b;
    }
}
