package com.zkunity.app;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;

public class ApkManager {
    public static int getIconId(Context ctx) {
        try {
            return ctx.getPackageManager().getApplicationInfo(ctx.getPackageName(), 0).icon;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static String getAppVersion(Context ctx) {
        try {
            return ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getAppName(Context ctx) {
        try {
            return ctx.getPackageManager().getApplicationInfo(ctx.getPackageName(), 0).loadLabel(ctx.getPackageManager()).toString();
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String[] getAppPremission(Context ctx) {
        try {
            return ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD).requestedPermissions;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getAppSignature(Context ctx) {
        try {
            return ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 64).signatures[0].toCharsString();
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
