package com.facebook.p036h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.support.v4.os.EnvironmentCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.MessageKey;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: Utility */
/* renamed from: com.facebook.h.af */
public final class af {
    private static int f1565a;
    private static long f1566b;
    private static long f1567c;
    private static long f1568d;
    private static String f1569e;
    private static String f1570f;
    private static String f1571g;

    /* renamed from: com.facebook.h.af.1 */
    static class Utility implements GraphRequest {
        final /* synthetic */ Utility f1561a;
        final /* synthetic */ String f1562b;

        Utility(Utility utility, String str) {
            this.f1561a = utility;
            this.f1562b = str;
        }

        public final void m1486a(GraphResponse graphResponse) {
            if (graphResponse.f2736b != null) {
                this.f1561a.m1487a(graphResponse.f2736b.f2655f);
                return;
            }
            ab.m1476a(this.f1562b, graphResponse.f2735a);
            this.f1561a.m1488a(graphResponse.f2735a);
        }
    }

    /* renamed from: com.facebook.h.af.2 */
    static class Utility implements FilenameFilter {
        Utility() {
        }

        public final boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    /* renamed from: com.facebook.h.af.a */
    public interface Utility {
        void m1487a(FacebookException facebookException);

        void m1488a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.h.af.b */
    public interface Utility<T, K> {
        K m1489a(T t);
    }

    /* renamed from: com.facebook.h.af.c */
    public static class Utility {
        public List<String> f1563a;
        public List<String> f1564b;

        public Utility(List<String> list, List<String> list2) {
            this.f1563a = list;
            this.f1564b = list2;
        }
    }

    static {
        f1565a = 0;
        f1566b = -1;
        f1567c = -1;
        f1568d = -1;
        f1569e = LetterIndexBar.SEARCH_ICON_LETTER;
        f1570f = LetterIndexBar.SEARCH_ICON_LETTER;
        f1571g = "NoCarrier";
    }

    public static <T> boolean m1524a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean m1523a(String str) {
        return str == null || str.length() == 0;
    }

    public static <T> Collection<T> m1503a(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    public static String m1526b(String str) {
        return af.m1499a("MD5", str.getBytes());
    }

    public static String m1500a(byte[] bArr) {
        return af.m1499a("SHA-1", bArr);
    }

    private static String m1499a(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : digest) {
                stringBuilder.append(Integer.toHexString((b >> 4) & 15));
                stringBuilder.append(Integer.toHexString((b >> 0) & 15));
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static Uri m1492a(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    public static Bundle m1532c(String str) {
        Bundle bundle = new Bundle();
        if (!af.m1523a(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], GameManager.DEFAULT_CHARSET), URLDecoder.decode(split2[1], GameManager.DEFAULT_CHARSET));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], GameManager.DEFAULT_CHARSET), LetterIndexBar.SEARCH_ICON_LETTER);
                    }
                } catch (Exception e) {
                    af.m1515a(e);
                }
            }
        }
        return bundle;
    }

    public static void m1511a(Bundle bundle, String str, String str2) {
        if (!af.m1523a(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static void m1510a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            af.m1511a(bundle, str, uri.toString());
        }
    }

    public static boolean m1520a(Bundle bundle, String str, Object obj) {
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else {
            bundle.putString(str, obj.toString());
        }
        return true;
    }

    public static void m1513a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static void m1517a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static String m1496a(Context context) {
        ag.m1544a((Object) context, "context");
        FacebookSdk.m2574a(context);
        return FacebookSdk.m2590j();
    }

    public static Object m1495a(JSONObject jSONObject, String str, String str2) {
        Object obj;
        Object opt = jSONObject.opt(str);
        if (opt == null || !(opt instanceof String)) {
            obj = opt;
        } else {
            obj = new JSONTokener((String) opt).nextValue();
        }
        if (obj == null || (obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            return obj;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, obj);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    public static String m1498a(InputStream inputStream) {
        Closeable inputStreamReader;
        Throwable th;
        Closeable closeable = null;
        try {
            Closeable bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    char[] cArr = new char[AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            stringBuilder.append(cArr, 0, read);
                        } else {
                            String stringBuilder2 = stringBuilder.toString();
                            af.m1513a(bufferedInputStream);
                            af.m1513a(inputStreamReader);
                            return stringBuilder2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = bufferedInputStream;
                    af.m1513a(closeable);
                    af.m1513a(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                closeable = bufferedInputStream;
                af.m1513a(closeable);
                af.m1513a(inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
            af.m1513a(closeable);
            af.m1513a(inputStreamReader);
            throw th;
        }
    }

    public static int m1490a(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        int i = 0;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i += read;
                }
                bufferedInputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    private static void m1509a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    instance.setCookie(str, split2[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                }
            }
            instance.removeExpiredCookie();
        }
    }

    public static void m1529b(Context context) {
        af.m1509a(context, "facebook.com");
        af.m1509a(context, ".facebook.com");
        af.m1509a(context, "https://facebook.com");
        af.m1509a(context, "https://.facebook.com");
    }

    public static void m1515a(Exception exception) {
        if (FacebookSdk.m2579b()) {
            new StringBuilder().append(exception.getClass().getSimpleName()).append(": ").append(exception.getMessage());
        }
    }

    public static void m1508a() {
        FacebookSdk.m2579b();
    }

    public static void m1535d(String str) {
        if (FacebookSdk.m2579b()) {
            af.m1523a(str);
        }
    }

    public static <T> boolean m1522a(T t, T t2) {
        if (t == null) {
            return t2 == null;
        } else {
            return t.equals(t2);
        }
    }

    public static void m1514a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File a : listFiles) {
                        af.m1514a(a);
                    }
                }
            }
            file.delete();
        }
    }

    public static <T> List<T> m1527b(T... tArr) {
        List arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Object obj = tArr[i];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List<String> m1506a(JSONArray jSONArray) {
        List arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static Set<String> m1528b(JSONArray jSONArray) {
        Set<String> hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    public static void m1519a(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, String str, boolean z) {
        boolean z2 = true;
        if (!(attributionIdentifiers == null || attributionIdentifiers.f1628a == null)) {
            jSONObject.put("attribution", attributionIdentifiers.f1628a);
        }
        if (!(attributionIdentifiers == null || attributionIdentifiers.f1629b == null)) {
            jSONObject.put("advertiser_id", attributionIdentifiers.f1629b);
            jSONObject.put("advertiser_tracking_enabled", !attributionIdentifiers.f1631d);
        }
        if (!(attributionIdentifiers == null || attributionIdentifiers.f1630c == null)) {
            jSONObject.put("installer_package", attributionIdentifiers.f1630c);
        }
        jSONObject.put("anon_id", str);
        String str2 = "application_tracking_enabled";
        if (z) {
            z2 = false;
        }
        jSONObject.put(str2, z2);
    }

    public static void m1518a(JSONObject jSONObject, Context context) {
        Locale locale;
        double d;
        int i;
        int i2;
        int i3;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        if (f1566b == -1 || System.currentTimeMillis() - f1566b >= 1800000) {
            StatFs statFs;
            f1566b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                f1569e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                f1570f = timeZone.getID();
            } catch (Exception e) {
            }
            if (f1571g.equals("NoCarrier")) {
                try {
                    f1571g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                } catch (Exception e2) {
                }
            }
            try {
                if (af.m1536d()) {
                    statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f1567c = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
                }
                f1567c = af.m1491a((double) f1567c);
            } catch (Exception e3) {
            }
            try {
                if (af.m1536d()) {
                    statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f1568d = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
                }
                f1568d = af.m1491a((double) f1568d);
            } catch (Exception e4) {
            }
        }
        String packageName = context.getPackageName();
        int i4 = -1;
        Object obj = LetterIndexBar.SEARCH_ICON_LETTER;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i4 = packageInfo.versionCode;
            obj = packageInfo.versionName;
        } catch (NameNotFoundException e5) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i4);
        jSONArray.put(obj);
        jSONArray.put(VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception e6) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + "_" + locale.getCountry());
        jSONArray.put(f1569e);
        jSONArray.put(f1571g);
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i5 = displayMetrics.widthPixels;
                try {
                    int i6 = displayMetrics.heightPixels;
                    try {
                        d = (double) displayMetrics.density;
                        i = i6;
                        i2 = i5;
                    } catch (Exception e7) {
                        i3 = i6;
                        i4 = i5;
                        i = i3;
                        i2 = i4;
                        d = 0.0d;
                        jSONArray.put(i2);
                        jSONArray.put(i);
                        jSONArray.put(String.format("%.2f", new Object[]{Double.valueOf(d)}));
                        jSONArray.put(af.m1531c());
                        jSONArray.put(f1567c);
                        jSONArray.put(f1568d);
                        jSONArray.put(f1570f);
                        jSONObject.put("extinfo", jSONArray.toString());
                    }
                } catch (Exception e8) {
                    i3 = 0;
                    i4 = i5;
                    i = i3;
                    i2 = i4;
                    d = 0.0d;
                    jSONArray.put(i2);
                    jSONArray.put(i);
                    jSONArray.put(String.format("%.2f", new Object[]{Double.valueOf(d)}));
                    jSONArray.put(af.m1531c());
                    jSONArray.put(f1567c);
                    jSONArray.put(f1568d);
                    jSONArray.put(f1570f);
                    jSONObject.put("extinfo", jSONArray.toString());
                }
            }
            d = 0.0d;
            i = 0;
            i2 = 0;
        } catch (Exception e9) {
            i3 = 0;
            i4 = 0;
            i = i3;
            i2 = i4;
            d = 0.0d;
            jSONArray.put(i2);
            jSONArray.put(i);
            jSONArray.put(String.format("%.2f", new Object[]{Double.valueOf(d)}));
            jSONArray.put(af.m1531c());
            jSONArray.put(f1567c);
            jSONArray.put(f1568d);
            jSONArray.put(f1570f);
            jSONObject.put("extinfo", jSONArray.toString());
        }
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(String.format("%.2f", new Object[]{Double.valueOf(d)}));
        jSONArray.put(af.m1531c());
        jSONArray.put(f1567c);
        jSONArray.put(f1568d);
        jSONArray.put(f1570f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static Method m1501a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    public static Method m1502a(String str, String str2, Class<?>... clsArr) {
        try {
            return af.m1501a(Class.forName(str), str2, (Class[]) clsArr);
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static Object m1494a(Object obj, Method method, Object... objArr) {
        Object obj2 = null;
        try {
            obj2 = method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e2) {
        }
        return obj2;
    }

    public static String m1533c(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return context.getClass().getSimpleName();
    }

    public static <T, K> List<K> m1505a(List<T> list, Utility<T, K> utility) {
        if (list == null) {
            return null;
        }
        List<K> arrayList = new ArrayList();
        for (T a : list) {
            Object a2 = utility.m1489a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        return null;
    }

    public static String m1497a(Uri uri) {
        return uri == null ? null : uri.toString();
    }

    public static boolean m1530b(Uri uri) {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
    }

    public static boolean m1534c(Uri uri) {
        return uri != null && MessageKey.MSG_CONTENT.equalsIgnoreCase(uri.getScheme());
    }

    public static boolean m1537d(Uri uri) {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public static long m1538e(Uri uri) {
        Throwable th;
        Cursor query;
        try {
            query = FacebookSdk.m2586f().getContentResolver().query(uri, null, null, null, null);
            try {
                int columnIndex = query.getColumnIndex("_size");
                query.moveToFirst();
                long j = query.getLong(columnIndex);
                if (query != null) {
                    query.close();
                }
                return j;
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public static Date m1504a(Bundle bundle, String str, Date date) {
        if (bundle == null) {
            return null;
        }
        long longValue;
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            longValue = ((Long) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                longValue = Long.parseLong((String) obj);
            } catch (NumberFormatException e) {
                return null;
            }
        }
        if (longValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((longValue * 1000) + date.getTime());
    }

    public static void m1512a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public static Map<String, String> m1507a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        Map<String, String> hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    public static boolean m1521a(AccessToken accessToken) {
        return accessToken != null ? accessToken.equals(AccessToken.m883a()) : false;
    }

    public static void m1516a(String str, Utility utility) {
        JSONObject a = ab.m1475a(str);
        if (a != null) {
            utility.m1488a(a);
            return;
        }
        GraphRequest utility2 = new Utility(utility, str);
        com.facebook.GraphRequest f = af.m1540f(str);
        f.m2643a(utility2);
        f.m2644b();
    }

    public static JSONObject m1539e(String str) {
        JSONObject a = ab.m1475a(str);
        if (a != null) {
            return a;
        }
        GraphResponse a2 = af.m1540f(str).m2642a();
        if (a2.f2736b != null) {
            return null;
        }
        return a2.f2735a;
    }

    private static com.facebook.GraphRequest m1540f(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString(WBConstants.AUTH_ACCESS_TOKEN, str);
        return new com.facebook.GraphRequest(null, "me", bundle, HttpMethod.GET, null);
    }

    private static int m1531c() {
        if (f1565a > 0) {
            return f1565a;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new Utility());
            if (listFiles != null) {
                f1565a = listFiles.length;
            }
        } catch (Exception e) {
        }
        if (f1565a <= 0) {
            f1565a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f1565a;
    }

    private static boolean m1536d() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static long m1491a(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    public static Utility m1493a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray(ShareRequestParam.RESP_UPLOAD_PIC_PARAM_DATA);
        List arrayList = new ArrayList(jSONArray.length());
        List arrayList2 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("permission");
            if (!(optString == null || optString.equals("installed"))) {
                String optString2 = optJSONObject.optString(NotificationCompatApi24.CATEGORY_STATUS);
                if (optString2 != null) {
                    if (optString2.equals("granted")) {
                        arrayList.add(optString);
                    } else if (optString2.equals("declined")) {
                        arrayList2.add(optString);
                    }
                }
            }
        }
        return new Utility(arrayList, arrayList2);
    }

    public static String m1525b() {
        return new BigInteger(100, new Random()).toString(32);
    }
}
