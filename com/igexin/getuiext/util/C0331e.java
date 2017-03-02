package com.igexin.getuiext.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.util.List;

/* renamed from: com.igexin.getuiext.util.e */
public class C0331e {
    public static final String f897a;

    static {
        f897a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/libs/tmp/";
    }

    public static String m1105a(Context context, String str) {
        if (str == null) {
            return null;
        }
        List installedApplications = context.getPackageManager().getInstalledApplications(0);
        int size = installedApplications.size();
        for (int i = 0; i < size; i++) {
            ApplicationInfo applicationInfo = (ApplicationInfo) installedApplications.get(i);
            if (str.equals(applicationInfo.packageName)) {
                return applicationInfo.sourceDir;
            }
        }
        return null;
    }

    public static void m1106a(Context context, String str, String str2, String str3) {
        if (new File(str).exists()) {
            String a = C0331e.m1105a(context, str3);
            if (a != null && new BsPatchUtil().m1089a(a, str2, str) == 0) {
                C0331e.m1107b(context, str2);
            }
        }
    }

    public static void m1107b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setDataAndType(Uri.fromFile(new File(str)), "application/vnd.android.package-archive");
        context.startActivity(intent);
    }
}
