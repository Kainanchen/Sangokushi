package android.support.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.customtabs.ICustomTabsCallback.Stub;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class CustomTabsClient {
    private final ICustomTabsService mService;
    private final ComponentName mServiceComponentName;

    /* renamed from: android.support.customtabs.CustomTabsClient.1 */
    static class C00001 extends CustomTabsServiceConnection {
        final /* synthetic */ Context val$applicationContext;

        C00001(Context context) {
            this.val$applicationContext = context;
        }

        public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            customTabsClient.warmup(0);
            this.val$applicationContext.unbindService(this);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: android.support.customtabs.CustomTabsClient.2 */
    class C00012 extends Stub {
        final /* synthetic */ CustomTabsCallback val$callback;

        C00012(CustomTabsCallback customTabsCallback) {
            this.val$callback = customTabsCallback;
        }

        public void onNavigationEvent(int i, Bundle bundle) {
            if (this.val$callback != null) {
                this.val$callback.onNavigationEvent(i, bundle);
            }
        }

        public void extraCallback(String str, Bundle bundle) {
            if (this.val$callback != null) {
                this.val$callback.extraCallback(str, bundle);
            }
        }
    }

    @RestrictTo({Scope.GROUP_ID})
    CustomTabsClient(ICustomTabsService iCustomTabsService, ComponentName componentName) {
        this.mService = iCustomTabsService;
        this.mServiceComponentName = componentName;
    }

    public static boolean bindCustomTabsService(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static String getPackageName(Context context, @Nullable List<String> list) {
        return getPackageName(context, list, false);
    }

    public static String getPackageName(Context context, @Nullable List<String> list, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        if (list == null) {
            List arrayList = new ArrayList();
        } else {
            List<String> list2 = list;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                List arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(str);
                if (list != null) {
                    arrayList2.addAll(list);
                }
                arrayList = arrayList2;
            }
        }
        intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        for (String str2 : r0) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public static boolean connectAndInitialize(Context context, String str) {
        boolean z = false;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                z = bindCustomTabsService(applicationContext, str, new C00001(applicationContext));
            } catch (SecurityException e) {
            }
        }
        return z;
    }

    public boolean warmup(long j) {
        try {
            return this.mService.warmup(j);
        } catch (RemoteException e) {
            return false;
        }
    }

    public CustomTabsSession newSession(CustomTabsCallback customTabsCallback) {
        ICustomTabsCallback c00012 = new C00012(customTabsCallback);
        try {
            if (this.mService.newSession(c00012)) {
                return new CustomTabsSession(this.mService, c00012, this.mServiceComponentName);
            }
            return null;
        } catch (RemoteException e) {
            return null;
        }
    }

    public Bundle extraCommand(String str, Bundle bundle) {
        try {
            return this.mService.extraCommand(str, bundle);
        } catch (RemoteException e) {
            return null;
        }
    }
}
