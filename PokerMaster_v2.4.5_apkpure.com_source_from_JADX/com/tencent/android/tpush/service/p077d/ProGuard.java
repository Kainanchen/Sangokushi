package com.tencent.android.tpush.service.p077d;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.service.cache.CacheManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.android.tpush.service.d.d */
public class ProGuard {
    private static volatile ProGuard f7740a;
    private Context f7741b;
    private Map f7742c;
    private Map f7743d;

    static {
        f7740a = null;
    }

    private ProGuard(Context context) {
        this.f7741b = null;
        this.f7742c = new HashMap(10);
        this.f7743d = new HashMap(10);
        this.f7741b = context.getApplicationContext();
        this.f7743d.put(Long.valueOf(-1), LetterIndexBar.SEARCH_ICON_LETTER);
    }

    public static ProGuard m5297a(Context context) {
        if (f7740a == null) {
            synchronized (ProGuard.class) {
                if (f7740a == null) {
                    f7740a = new ProGuard(context);
                }
            }
        }
        return f7740a;
    }

    public String m5298a(long j) {
        if (this.f7743d.containsKey(Long.valueOf(j))) {
            return (String) this.f7743d.get(Long.valueOf(j));
        }
        List<String> registerInfos = CacheManager.getRegisterInfos(this.f7741b);
        if (registerInfos != null) {
            for (String str : registerInfos) {
                com.tencent.android.tpush.data.ProGuard registerInfoByPkgName = CacheManager.getRegisterInfoByPkgName(str);
                if (registerInfoByPkgName != null) {
                    this.f7743d.put(Long.valueOf(registerInfoByPkgName.f7419a), m5299a(str));
                }
            }
        }
        return this.f7743d.get(Long.valueOf(j)) == null ? LetterIndexBar.SEARCH_ICON_LETTER : (String) this.f7743d.get(Long.valueOf(j));
    }

    public String m5299a(String str) {
        if (str == null) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (this.f7742c.containsKey(str)) {
            return (String) this.f7742c.get(str);
        }
        List<PackageInfo> installedPackages = this.f7741b.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (PackageInfo packageInfo : installedPackages) {
                if (str.equals(packageInfo.packageName)) {
                    this.f7742c.put(str, packageInfo.versionName);
                    return packageInfo.versionName;
                }
            }
        }
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }
}
