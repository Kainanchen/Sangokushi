package com.igexin.push.core.p048b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.RemoteException;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.core.C0483g;
import com.igexin.sdk.PushConsts;
import com.tencent.tauth.AuthActivity;
import java.util.List;

/* renamed from: com.igexin.push.core.b.c */
public class C0419c {
    private static C0419c f1091a;

    public static C0419c m1436a() {
        if (f1091a == null) {
            f1091a = new C0419c();
        }
        return f1091a;
    }

    public int m1437a(String str, C0425i c0425i) {
        if (str == null) {
            return -1;
        }
        C0424h a = C0421e.m1442a().m1447a(str);
        if (System.currentTimeMillis() > Long.valueOf(a.m1466c()).longValue()) {
            return -1;
        }
        List e = a.m1469e();
        for (int i = 0; i < e.size(); i++) {
            if (e.get(i) == c0425i) {
                return 0;
            }
        }
        return -2;
    }

    public String m1438a(String str) {
        List installedPackages = C0483g.f1321g.getPackageManager().getInstalledPackages(64);
        for (int i = 0; i < installedPackages.size(); i++) {
            PackageInfo packageInfo = (PackageInfo) installedPackages.get(i);
            if (packageInfo.packageName.equals(str)) {
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null && signatureArr.length > 0) {
                    return signatureArr[0].toCharsString();
                }
            }
        }
        return null;
    }

    public void m1439a(Intent intent) {
        if (intent != null && intent.hasExtra(AuthActivity.ACTION_KEY)) {
            String stringExtra = intent.getStringExtra(AuthActivity.ACTION_KEY);
            if (stringExtra.equals("connected")) {
                stringExtra = intent.getStringExtra("pkgname");
                C0417a a = C0418b.m1433a().m1434a(stringExtra);
                long currentTimeMillis = System.currentTimeMillis();
                C0424h a2 = C0421e.m1442a().m1447a(stringExtra);
                String b = a2.m1464b();
                long c = a2.m1466c();
                if (currentTimeMillis > c) {
                    b = C0259a.m877a(stringExtra + "-" + currentTimeMillis);
                    c = 604800 + currentTimeMillis;
                    a2.m1465b(b);
                    a2.m1461a(c);
                }
                C0421e.m1442a().m1451a(stringExtra, a2);
                try {
                    if (a.m1432b() != null) {
                        a.m1432b().onAuthenticated(C0483g.f1319e, "com.igexin.sdk.PushService", b, c);
                    }
                } catch (RemoteException e) {
                }
                try {
                    if (a.m1432b() != null) {
                        C0483g.f1321g.unbindService(a.m1428a());
                    }
                } catch (Exception e2) {
                }
            } else if (stringExtra.equals("disconnected")) {
                C0417a a3 = C0418b.m1433a().m1434a(intent.getStringExtra("pkgname"));
                try {
                    if (a3.m1432b() != null) {
                        C0483g.f1321g.unbindService(a3.m1428a());
                    }
                } catch (Exception e3) {
                }
            }
        }
    }

    public void m1440b(Intent intent) {
        if (intent.getStringExtra(AuthActivity.ACTION_KEY).equals(PushConsts.ACTION_BROADCAST_REFRESHLS)) {
            String stringExtra = intent.getStringExtra("callback_pkgname");
            String stringExtra2 = intent.getStringExtra("callback_classname");
            C0417a c0417a = new C0417a();
            c0417a.m1431a(stringExtra);
            c0417a.m1429a(new C0420d(this));
            C0418b.m1433a().m1435a(stringExtra, c0417a);
            try {
                Context createPackageContext = C0483g.f1321g.createPackageContext(stringExtra, 3);
                C0483g.f1321g.bindService(new Intent(createPackageContext, createPackageContext.getClassLoader().loadClass(stringExtra2)), c0417a.m1428a(), 1);
            } catch (Exception e) {
            }
        }
    }
}
