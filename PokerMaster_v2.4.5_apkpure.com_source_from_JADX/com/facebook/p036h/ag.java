package com.facebook.p036h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.CustomTabActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.List;

/* compiled from: Validate */
/* renamed from: com.facebook.h.ag */
public final class ag {
    private static final String f1572a;

    static {
        f1572a = ag.class.getName();
    }

    public static void m1544a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }

    public static void m1545a(String str, String str2) {
        if (af.m1523a(str)) {
            throw new IllegalArgumentException("Argument '" + str2 + "' cannot be null or empty");
        }
    }

    public static void m1541a() {
        if (!FacebookSdk.m2576a()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static String m1547b() {
        String j = FacebookSdk.m2590j();
        if (j != null) {
            return j;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    public static String m1550c() {
        String l = FacebookSdk.m2592l();
        if (l != null) {
            return l;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    public static void m1542a(Context context) {
        ag.m1543a(context, true);
    }

    public static void m1543a(Context context, boolean z) {
        ag.m1544a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != -1) {
            return;
        }
        if (z) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
        Log.w(f1572a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
    }

    public static void m1548b(Context context) {
        ag.m1549b(context, true);
    }

    public static void m1549b(Context context, boolean z) {
        ag.m1544a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        ActivityInfo activityInfo = null;
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, FacebookActivity.class), 1);
            } catch (NameNotFoundException e) {
            }
        }
        if (activityInfo != null) {
            return;
        }
        if (z) {
            throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
        Log.w(f1572a, "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
    }

    public static boolean m1551c(Context context) {
        boolean z;
        ag.m1544a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        List list = null;
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse("fb" + FacebookSdk.m2590j() + "://authorize"));
            list = packageManager.queryIntentActivities(intent, 64);
        }
        if (r0 != null) {
            z = false;
            for (ResolveInfo resolveInfo : r0) {
                if (!resolveInfo.activityInfo.name.equals(CustomTabActivity.class.getName())) {
                    return false;
                }
                z = true;
            }
        } else {
            z = false;
        }
        return z;
    }

    public static void m1552d(Context context) {
        ag.m1544a((Object) context, "context");
        String b = ag.m1547b();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            if (packageManager.resolveContentProvider("com.facebook.app.FacebookContentProvider" + b, 0) == null) {
                throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[]{"com.facebook.app.FacebookContentProvider" + b}));
            }
        }
    }

    public static <T> void m1546a(Collection<T> collection, String str) {
        ag.m1544a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Container '" + str + "' cannot be empty");
        }
    }
}
