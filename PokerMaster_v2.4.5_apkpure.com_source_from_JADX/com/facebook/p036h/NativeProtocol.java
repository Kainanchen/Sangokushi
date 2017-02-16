package com.facebook.p036h;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.p037i.DefaultAudience;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.h.z */
public final class NativeProtocol {
    private static final String f1774a;
    private static List<NativeProtocol> f1775b;
    private static Map<String, List<NativeProtocol>> f1776c;
    private static AtomicBoolean f1777d;
    private static final List<Integer> f1778e;

    /* renamed from: com.facebook.h.z.1 */
    static class NativeProtocol implements Runnable {
        NativeProtocol() {
        }

        public final void run() {
            try {
                for (NativeProtocol a : NativeProtocol.f1775b) {
                    a.m1702a(true);
                }
            } finally {
                NativeProtocol.f1777d.set(false);
            }
        }
    }

    /* renamed from: com.facebook.h.z.d */
    private static abstract class NativeProtocol {
        private static final HashSet<String> f1772b;
        TreeSet<Integer> f1773a;

        protected abstract String m1701a();

        protected abstract String m1703b();

        private NativeProtocol() {
        }

        public static boolean m1700a(Context context, String str) {
            String str2 = Build.BRAND;
            int i = context.getApplicationInfo().flags;
            if (str2.startsWith("generic") && (i & 2) != 0) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                    return false;
                }
                for (Signature toByteArray : packageInfo.signatures) {
                    if (!f1772b.contains(af.m1500a(toByteArray.toByteArray()))) {
                        return false;
                    }
                }
                return true;
            } catch (NameNotFoundException e) {
                return false;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        final synchronized void m1702a(boolean r2) {
            /*
            r1 = this;
            monitor-enter(r1);
            if (r2 != 0) goto L_0x0007;
        L_0x0003:
            r0 = r1.f1773a;	 Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x000d;
        L_0x0007:
            r0 = com.facebook.p036h.NativeProtocol.m1730b(r1);	 Catch:{ all -> 0x000f }
            r1.f1773a = r0;	 Catch:{ all -> 0x000f }
        L_0x000d:
            monitor-exit(r1);
            return;
        L_0x000f:
            r0 = move-exception;
            monitor-exit(r1);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.h.z.d.a(boolean):void");
        }

        static {
            HashSet hashSet = new HashSet();
            hashSet.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
            hashSet.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
            hashSet.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
            f1772b = hashSet;
        }
    }

    /* renamed from: com.facebook.h.z.a */
    private static class NativeProtocol extends NativeProtocol {
        private NativeProtocol() {
            super();
        }

        protected final String m1704a() {
            return "com.facebook.lite";
        }

        protected final String m1705b() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }
    }

    /* renamed from: com.facebook.h.z.b */
    private static class NativeProtocol extends NativeProtocol {
        private NativeProtocol() {
            super();
        }

        protected final String m1706a() {
            return "com.facebook.katana";
        }

        protected final String m1707b() {
            return "com.facebook.katana.ProxyAuth";
        }
    }

    /* renamed from: com.facebook.h.z.c */
    private static class NativeProtocol extends NativeProtocol {
        private NativeProtocol() {
            super();
        }

        protected final String m1708a() {
            return "com.facebook.orca";
        }

        protected final String m1709b() {
            return null;
        }
    }

    /* renamed from: com.facebook.h.z.e */
    private static class NativeProtocol extends NativeProtocol {
        private NativeProtocol() {
            super();
        }

        protected final String m1710a() {
            return "com.facebook.wakizashi";
        }

        protected final String m1711b() {
            return "com.facebook.katana.ProxyAuth";
        }
    }

    static {
        f1774a = NativeProtocol.class.getName();
        List arrayList = new ArrayList();
        arrayList.add(new NativeProtocol());
        arrayList.add(new NativeProtocol());
        f1775b = arrayList;
        Map hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new NativeProtocol());
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", f1775b);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", f1775b);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", f1775b);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", f1775b);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
        f1776c = hashMap;
        f1777d = new AtomicBoolean(false);
        f1778e = Arrays.asList(new Integer[]{Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101)});
    }

    private static Intent m1716a(Context context, Intent intent) {
        if (intent == null) {
            return null;
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity == null) {
            return null;
        }
        if (NativeProtocol.m1700a(context, resolveActivity.activityInfo.packageName)) {
            return intent;
        }
        return null;
    }

    public static Intent m1718a(Context context, String str, Collection<String> collection, String str2, boolean z, DefaultAudience defaultAudience, String str3) {
        return NativeProtocol.m1716a(context, NativeProtocol.m1720a(new NativeProtocol(), str, (Collection) collection, str2, z, defaultAudience, str3));
    }

    private static Intent m1720a(NativeProtocol nativeProtocol, String str, Collection<String> collection, String str2, boolean z, DefaultAudience defaultAudience, String str3) {
        String b = nativeProtocol.m1703b();
        if (b == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(nativeProtocol.m1701a(), b).putExtra(WBConstants.AUTH_PARAMS_CLIENT_ID, str);
        if (!af.m1524a((Collection) collection)) {
            putExtra.putExtra(WBConstants.SSO_USER_SCOPE, TextUtils.join(",", collection));
        }
        if (!af.m1523a(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra(WBConstants.AUTH_PARAMS_RESPONSE_TYPE, "token,signed_request");
        putExtra.putExtra("return_scopes", "true");
        if (z) {
            putExtra.putExtra("default_audience", defaultAudience.f1792e);
        }
        putExtra.putExtra("legacy_override", FacebookSdk.m2587g());
        putExtra.putExtra("auth_type", "rerequest");
        return putExtra;
    }

    public static Intent m1728b(Context context, String str, Collection<String> collection, String str2, boolean z, DefaultAudience defaultAudience, String str3) {
        for (NativeProtocol a : f1775b) {
            Intent a2 = NativeProtocol.m1716a(context, NativeProtocol.m1720a(a, str, (Collection) collection, str2, z, defaultAudience, str3));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static final int m1712a() {
        return ((Integer) f1778e.get(0)).intValue();
    }

    public static boolean m1726a(int i) {
        return f1778e.contains(Integer.valueOf(i)) && i >= 20140701;
    }

    public static Intent m1717a(Context context, String str, String str2, int i, Bundle bundle) {
        Intent intent;
        String str3 = "com.facebook.platform.PLATFORM_ACTIVITY";
        List<NativeProtocol> list = (List) f1776c.get(str2);
        if (list != null) {
            intent = null;
            for (NativeProtocol a : list) {
                intent = NativeProtocol.m1716a(context, new Intent().setAction(str3).setPackage(a.m1701a()).addCategory("android.intent.category.DEFAULT"));
                if (intent != null) {
                    break;
                }
            }
        }
        intent = null;
        if (intent == null) {
            return null;
        }
        NativeProtocol.m1725a(intent, str, str2, i, bundle);
        return intent;
    }

    public static void m1725a(Intent intent, String str, String str2, int i, Bundle bundle) {
        String j = FacebookSdk.m2590j();
        String k = FacebookSdk.m2591k();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", j);
        if (NativeProtocol.m1726a(i)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            af.m1511a(bundle2, "app_name", k);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
            return;
        }
        intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
        if (!af.m1523a(k)) {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", k);
        }
        intent.putExtras(bundle);
    }

    public static Intent m1719a(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID a = NativeProtocol.m1724a(intent);
        if (a == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", a.toString());
        if (facebookException != null) {
            bundle2.putBundle("error", NativeProtocol.m1721a(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle == null) {
            return intent2;
        }
        intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        return intent2;
    }

    public static Intent m1715a(Context context) {
        for (NativeProtocol a : f1775b) {
            Intent addCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(a.m1701a()).addCategory("android.intent.category.DEFAULT");
            if (addCategory == null) {
                addCategory = null;
                continue;
            } else {
                ResolveInfo resolveService = context.getPackageManager().resolveService(addCategory, 0);
                if (resolveService == null) {
                    addCategory = null;
                    continue;
                } else if (NativeProtocol.m1700a(context, resolveService.serviceInfo.packageName)) {
                    continue;
                } else {
                    addCategory = null;
                    continue;
                }
            }
            if (addCategory != null) {
                return addCategory;
            }
        }
        return null;
    }

    public static UUID m1724a(Intent intent) {
        UUID uuid = null;
        if (intent != null) {
            String string;
            if (NativeProtocol.m1726a(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                if (bundleExtra != null) {
                    string = bundleExtra.getString("action_id");
                } else {
                    Object obj = uuid;
                }
            } else {
                string = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (string != null) {
                try {
                    uuid = UUID.fromString(string);
                } catch (IllegalArgumentException e) {
                }
            }
        }
        return uuid;
    }

    public static FacebookException m1722a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string == null || !string.equalsIgnoreCase("UserCanceled")) {
            return new FacebookException(string2);
        }
        return new FacebookOperationCanceledException(string2);
    }

    public static Bundle m1721a(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (!(facebookException instanceof FacebookOperationCanceledException)) {
            return bundle;
        }
        bundle.putString("error_type", "UserCanceled");
        return bundle;
    }

    public static int m1727b(int i) {
        return NativeProtocol.m1714a(f1775b, new int[]{i});
    }

    public static int m1713a(String str, int[] iArr) {
        return NativeProtocol.m1714a((List) f1776c.get(str), iArr);
    }

    private static int m1714a(List<NativeProtocol> list, int[] iArr) {
        NativeProtocol.m1731b();
        if (list == null) {
            return -1;
        }
        for (NativeProtocol nativeProtocol : list) {
            if (nativeProtocol.f1773a == null) {
                nativeProtocol.m1702a(false);
            }
            TreeSet treeSet = nativeProtocol.f1773a;
            int a = NativeProtocol.m1712a();
            int length = iArr.length - 1;
            Iterator descendingIterator = treeSet.descendingIterator();
            int i = -1;
            int i2 = length;
            while (descendingIterator.hasNext()) {
                int intValue = ((Integer) descendingIterator.next()).intValue();
                length = Math.max(i, intValue);
                i = i2;
                while (i >= 0 && iArr[i] > intValue) {
                    i--;
                }
                if (i < 0) {
                    break;
                } else if (iArr[i] == intValue) {
                    if (i % 2 == 0) {
                        length = Math.min(length, a);
                        continue;
                    } else {
                        length = -1;
                        continue;
                    }
                    if (length != -1) {
                        return length;
                    }
                } else {
                    i2 = i;
                    i = length;
                }
            }
            length = -1;
            continue;
            if (length != -1) {
                return length;
            }
        }
        return -1;
    }

    public static void m1731b() {
        if (f1777d.compareAndSet(false, true)) {
            FacebookSdk.m2583d().execute(new NativeProtocol());
        }
    }

    private static TreeSet<Integer> m1730b(NativeProtocol nativeProtocol) {
        Throwable th;
        Cursor cursor;
        TreeSet<Integer> treeSet = new TreeSet();
        ContentResolver contentResolver = FacebookSdk.m2586f().getContentResolver();
        String[] strArr = new String[]{LogBuilder.KEY_VERSION};
        Uri parse = Uri.parse("content://" + nativeProtocol.m1701a() + ".provider.PlatformProvider/versions");
        try {
            ProviderInfo resolveContentProvider = FacebookSdk.m2586f().getPackageManager().resolveContentProvider(nativeProtocol.m1701a() + ".provider.PlatformProvider", 0);
        } catch (Throwable e) {
            Log.e(f1774a, "Failed to query content resolver.", e);
            resolveContentProvider = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (resolveContentProvider != null) {
            try {
                cursor = contentResolver.query(parse, strArr, null, null, null);
            } catch (NullPointerException e2) {
                Log.e(f1774a, "Failed to query content resolver.");
                cursor = null;
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex(LogBuilder.KEY_VERSION))));
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return treeSet;
            } catch (SecurityException e3) {
                Log.e(f1774a, "Failed to query content resolver.");
                cursor = null;
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex(LogBuilder.KEY_VERSION))));
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return treeSet;
            }
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex(LogBuilder.KEY_VERSION))));
                }
            }
        } else {
            cursor = null;
        }
        if (cursor != null) {
            cursor.close();
        }
        return treeSet;
    }

    private static Bundle m1736e(Intent intent) {
        if (NativeProtocol.m1726a(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
            return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        }
        return null;
    }

    public static Bundle m1729b(Intent intent) {
        if (NativeProtocol.m1726a(intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0))) {
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        }
        return intent.getExtras();
    }

    public static Bundle m1732c(Intent intent) {
        int intExtra = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        Bundle extras = intent.getExtras();
        return (!NativeProtocol.m1726a(intExtra) || extras == null) ? extras : extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
    }

    public static Bundle m1734d(Intent intent) {
        boolean containsKey;
        Bundle e = NativeProtocol.m1736e(intent);
        if (e != null) {
            containsKey = e.containsKey("error");
        } else {
            containsKey = intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        }
        if (!containsKey) {
            return null;
        }
        e = NativeProtocol.m1736e(intent);
        if (e != null) {
            return e.getBundle("error");
        }
        return intent.getExtras();
    }
}
