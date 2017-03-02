package com.zkunity.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;

public class MetaDataUtil {
    public static String getAppString(Context ctx, String keyName) {
        String data = null;
        try {
            data = ctx.getPackageManager().getApplicationInfo(ctx.getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS).metaData.getString(keyName);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static String getActivityString(Context ctx, ComponentName componentName, String keyName) {
        String data = null;
        try {
            data = ctx.getPackageManager().getActivityInfo(componentName, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS).metaData.getString(keyName);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static String getServiceString(Context ctx, Class clazz, String keyName) {
        String data = null;
        try {
            data = ctx.getPackageManager().getServiceInfo(new ComponentName(ctx, clazz), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS).metaData.getString(keyName);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static String getReceiverString(Context ctx, Class clazz, String keyName) {
        String data = null;
        try {
            data = ctx.getPackageManager().getReceiverInfo(new ComponentName(ctx, clazz), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS).metaData.getString(keyName);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}
