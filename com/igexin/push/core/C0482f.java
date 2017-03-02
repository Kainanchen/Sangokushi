package com.igexin.push.core;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p025d.C0243e;
import com.igexin.p022a.p023a.p025d.p026a.C0229f;
import com.igexin.p022a.p023a.p025d.p026a.C0249c;
import com.igexin.p022a.p023a.p027b.C0242c;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.config.C0367a;
import com.igexin.push.config.C0376j;
import com.igexin.push.core.p044c.C0440b;
import com.igexin.push.core.p044c.C0441c;
import com.igexin.push.core.p044c.C0444f;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.core.p048b.C0421e;
import com.igexin.push.extension.C0511a;
import com.igexin.push.p035e.p036b.C0395f;
import com.igexin.push.p035e.p036b.C0507a;
import com.igexin.push.p035e.p036b.C0509c;
import com.igexin.push.p035e.p036b.C0510e;
import com.igexin.push.p037a.p038a.C0336a;
import com.igexin.push.p037a.p038a.C0337b;
import com.igexin.push.p037a.p038a.C0338c;
import com.igexin.push.p037a.p038a.C0339d;
import com.igexin.push.p039b.C0340a;
import com.igexin.push.p039b.C0341b;
import com.igexin.push.p040c.C0347a;
import com.igexin.push.p040c.p041a.C0346c;
import com.igexin.push.p047d.C0495a;
import com.igexin.push.p047d.C0497c;
import com.igexin.push.p047d.C0504j;
import com.igexin.push.p052f.C0512a;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.PushService;
import com.igexin.sdk.p053a.C0517b;
import com.igexin.sdk.p053a.C0518c;
import com.igexin.sdk.p053a.C0519d;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.AuthActivity;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.igexin.push.core.f */
public class C0482f implements C0249c {
    private static C0482f f1276l;
    private Context f1277a;
    private C0484h f1278b;
    private Handler f1279c;
    private ConcurrentLinkedQueue f1280d;
    private C0402e f1281e;
    private ConnectivityManager f1282f;
    private C0244d f1283g;
    private C0242c f1284h;
    private C0504j f1285i;
    private C0497c f1286j;
    private C0341b f1287k;
    private final AtomicBoolean f1288m;

    private C0482f() {
        this.f1288m = new AtomicBoolean(false);
        this.f1280d = new ConcurrentLinkedQueue();
        this.f1278b = new C0484h();
    }

    public static C0482f m1694a() {
        if (f1276l == null) {
            f1276l = new C0482f();
        }
        return f1276l;
    }

    private void m1695q() {
        try {
            if (m1721p()) {
                String packageName = this.f1277a.getPackageName();
                List<PackageInfo> installedPackages = this.f1277a.getPackageManager().getInstalledPackages(4);
                if (installedPackages != null && !installedPackages.isEmpty()) {
                    for (PackageInfo packageInfo : installedPackages) {
                        if ((packageInfo.applicationInfo.flags & 1) == 0 || (packageInfo.applicationInfo.flags & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == 1) {
                            ServiceInfo[] serviceInfoArr = packageInfo.services;
                            if (!(serviceInfoArr == null || serviceInfoArr.length == 0)) {
                                int length = serviceInfoArr.length;
                                int i = 0;
                                while (i < length) {
                                    ServiceInfo serviceInfo = serviceInfoArr[i];
                                    if (C0416a.f1084o.equals(serviceInfo.name) || C0416a.f1083n.equals(serviceInfo.name) || C0416a.f1085p.equals(serviceInfo.name)) {
                                        String str = packageInfo.packageName;
                                        if (!packageName.equals(str)) {
                                            C0444f.m1577a().m1603d().put(str, serviceInfo.name);
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                    installedPackages.clear();
                }
            }
        } catch (Throwable th) {
        }
    }

    private boolean m1696r() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE);
        intentFilter.addAction("com.igexin.sdk.action.snlrefresh");
        intentFilter.addAction("com.igexin.sdk.action.snlretire");
        intentFilter.addAction(C0483g.f1311W);
        intentFilter.addAction("com.igexin.sdk.action.execute");
        intentFilter.addAction("com.igexin.sdk.action.doaction");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        if (C0512a.m1846c()) {
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        }
        if (this.f1277a.registerReceiver(C0490n.m1739a(), intentFilter) == null) {
            C0247a.m838b("CoreLogic|InternalPublicReceiver|null");
        }
        intentFilter = new IntentFilter();
        intentFilter.addDataScheme("package");
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        if (this.f1277a.registerReceiver(C0489m.m1738a(), intentFilter) == null) {
            C0247a.m838b("CoreLogic|InternalPackageReceiver|null");
        }
        return true;
    }

    public void m1697a(C0481e c0481e) {
        this.f1279c = c0481e;
    }

    public boolean m1698a(Context context) {
        this.f1277a = context;
        if ((this.f1278b == null || !this.f1278b.isAlive()) && !this.f1288m.getAndSet(true)) {
            this.f1278b.start();
        }
        return true;
    }

    public boolean m1699a(Intent intent) {
        if (C0483g.f1321g == null) {
            return false;
        }
        C0483g.f1321g.sendBroadcast(intent);
        return true;
    }

    public boolean m1700a(Message message) {
        if (C0483g.f1322h.get()) {
            this.f1279c.sendMessage(message);
        } else {
            this.f1280d.add(message);
        }
        return true;
    }

    public boolean m1701a(C0229f c0229f, C0243e c0243e) {
        return this.f1281e != null ? this.f1281e.m1366a((Object) c0229f) : false;
    }

    public boolean m1702a(C0233d c0233d, C0243e c0243e) {
        return this.f1281e != null ? this.f1281e.m1364a(c0233d) : false;
    }

    public boolean m1703a(C0395f c0395f) {
        return c0395f != null ? C0244d.m802c().m795a(c0395f, false, true) : false;
    }

    public boolean m1704a(String str) {
        String e = C0402e.m1330a().m1384e("ss");
        if (!(C0483g.f1321g == null || this.f1286j == null)) {
            new C0519d(C0483g.f1321g).m1879b();
            C0483g.f1324j = false;
            C0483g.f1328n = false;
            C0495a c0495a = new C0495a();
            c0495a.m1744a(C0465c.stop);
            this.f1286j.m1774a(c0495a);
            if (e != null && Constants.VIA_TO_TYPE_QQ_GROUP.equals(e)) {
                try {
                    InputStream inputStream = Runtime.getRuntime().exec("ps").getInputStream();
                    if (inputStream != null) {
                        Object split;
                        String packageName = C0483g.f1321g.getPackageName();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        List arrayList = new ArrayList();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            split = readLine.split("\\s+");
                            arrayList.add(split);
                            if (readLine.indexOf(packageName + "/files/gdaemon") != -1 && split.length > 0) {
                                break;
                            }
                        }
                        Process.killProcess(Integer.valueOf(split[1]).intValue());
                        bufferedReader.close();
                        inputStream.close();
                    }
                } catch (Exception e2) {
                }
                m1710e();
            }
        }
        return true;
    }

    public boolean m1705a(boolean z) {
        if (!(C0483g.f1321g == null || this.f1286j == null)) {
            new C0519d(C0483g.f1321g).m1878a();
            C0483g.f1324j = true;
            if (!new C0517b(C0483g.f1321g).m1874b()) {
                new C0518c(C0483g.f1321g).m1875a();
                C0483g.f1325k = true;
                new C0517b(C0483g.f1321g).m1873a();
            }
            if (z) {
                new C0518c(C0483g.f1321g).m1875a();
                C0483g.f1325k = true;
            }
            C0495a c0495a = new C0495a();
            c0495a.m1744a(C0465c.start);
            this.f1286j.m1774a(c0495a);
        }
        return true;
    }

    public void m1706b() {
        try {
            C0247a.m838b("CoreLogic|init starts");
            this.f1282f = (ConnectivityManager) this.f1277a.getSystemService("connectivity");
            C0483g.m1725a(this.f1277a);
            this.f1287k = new C0341b(this.f1277a);
            C0247a.m838b("CoreLogic|init config");
            C0376j.m1250a().m1251b();
            C0247a.m838b("CoreLogic|init receiver");
            m1696r();
            this.f1283g = C0244d.m802c();
            this.f1283g.m809a(new C0347a(this.f1277a, m1715j()));
            this.f1283g.m792a((C0249c) this);
            this.f1283g.m791a(this.f1277a);
            C0233d c0340a = new C0340a();
            c0340a.m1140a(C0444f.m1577a());
            c0340a.m1140a(C0441c.m1566a());
            c0340a.m1140a(C0440b.m1561a());
            c0340a.m1140a(C0421e.m1442a());
            c0340a.m1140a(C0367a.m1224a());
            this.f1283g.m795a(c0340a, true, false);
            C0244d.m802c().m810a(C0259a.m879a(C0483g.f1289A.getBytes()));
            C0483g.af = this.f1283g.m795a(C0509c.m1821g(), false, true);
            C0483g.ag = this.f1283g.m795a(C0510e.m1828g(), true, true);
            m1708c();
            this.f1281e = C0402e.m1330a();
            m1709d();
            this.f1285i = new C0504j();
            this.f1285i.m1797a(this.f1277a, this.f1283g, this.f1281e);
            this.f1286j = new C0497c();
            this.f1286j.m1772a(this.f1277a);
            C0495a c0495a = new C0495a();
            c0495a.m1744a(C0465c.start);
            this.f1286j.m1774a(c0495a);
            C0338c.m1132c().m1136d();
            C0483g.f1322h.set(true);
            Iterator it = this.f1280d.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (this.f1279c != null) {
                    this.f1279c.sendMessage(message);
                }
            }
            C0402e.m1330a().m1400t();
            this.f1281e.m1347a(Process.myPid());
            m1695q();
            C0247a.m838b("CoreLogic|init extensions");
            C0511a.m1834a().m1836a(this.f1277a);
            C0247a.m838b("CoreLogic|init finished");
        } catch (Exception e) {
            C0247a.m838b("CoreLogic|init|failed");
        }
    }

    public boolean m1707b(String str) {
        if (!(C0483g.f1321g == null || this.f1286j == null)) {
            new C0518c(C0483g.f1321g).m1876b();
            C0483g.f1325k = false;
            C0483g.f1328n = false;
            C0495a c0495a = new C0495a();
            c0495a.m1744a(C0465c.stop);
            this.f1286j.m1774a(c0495a);
        }
        return true;
    }

    public C0507a m1708c() {
        C0233d g = C0507a.m1813g();
        g.m1816a(new C0336a());
        g.m1816a(new C0337b());
        g.m1816a(new C0339d());
        g.m1816a(C0338c.m1132c());
        C0483g.ah = this.f1283g.m795a(g, false, true);
        this.f1277a.sendBroadcast(new Intent());
        return g;
    }

    public void m1709d() {
        if (TextUtils.isEmpty(C0483g.f1338x)) {
            try {
                if (C0512a.m1841a()) {
                    WifiInfo connectionInfo = ((WifiManager) this.f1277a.getSystemService("wifi")).getConnectionInfo();
                    if (connectionInfo != null) {
                        C0444f.m1577a().m1592a(connectionInfo.getMacAddress());
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    public void m1710e() {
        Intent intent = new Intent(this.f1277a.getApplicationContext(), PushService.class);
        intent.putExtra(AuthActivity.ACTION_KEY, "stopUserService");
        this.f1277a.getApplicationContext().startService(intent);
        this.f1277a.stopService(new Intent(this.f1277a, PushService.class));
    }

    public C0242c m1711f() {
        if (this.f1284h == null) {
            this.f1284h = C0346c.m1160a();
        }
        return this.f1284h;
    }

    public C0504j m1712g() {
        return this.f1285i;
    }

    public C0497c m1713h() {
        return this.f1286j;
    }

    public C0402e m1714i() {
        return this.f1281e;
    }

    public ConnectivityManager m1715j() {
        return this.f1282f;
    }

    public C0341b m1716k() {
        return this.f1287k;
    }

    public void m1717l() {
        try {
            this.f1277a.unregisterReceiver(C0244d.m802c());
        } catch (Exception e) {
        }
        try {
            this.f1277a.unregisterReceiver(C0489m.m1738a());
        } catch (Exception e2) {
        }
        try {
            this.f1277a.unregisterReceiver(C0490n.m1739a());
        } catch (Exception e3) {
        }
        try {
            C0511a.m1834a().m1838b();
        } catch (Throwable th) {
        }
    }

    public String m1718m() {
        if (this.f1282f == null) {
            return null;
        }
        NetworkInfo activeNetworkInfo = this.f1282f.getActiveNetworkInfo();
        return activeNetworkInfo != null ? activeNetworkInfo.getType() == 1 ? "wifi" : activeNetworkInfo.getType() == 0 ? "mobile" : null : null;
    }

    public boolean m1719n() {
        return true;
    }

    public long m1720o() {
        return 94808;
    }

    public boolean m1721p() {
        try {
            ActivityManager activityManager = (ActivityManager) C0483g.f1321g.getSystemService("activity");
            MemoryInfo memoryInfo = new MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = (memoryInfo.availMem / 1024) / 1024;
            if (memoryInfo.lowMemory) {
                C0247a.m839b("CoreLogic", "system in lowMemory, available menmory = " + j + "M");
                return false;
            }
            boolean z = (((Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory()) + Runtime.getRuntime().freeMemory()) / 1024) / 1024 > 30 && j > 100;
            return z;
        } catch (Throwable th) {
            return false;
        }
    }
}
