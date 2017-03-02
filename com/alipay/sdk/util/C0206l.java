package com.alipay.sdk.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebSettings.TextSize;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.alipay.sdk.app.C0142h;
import com.alipay.sdk.app.C0143i;
import com.alipay.sdk.app.statistic.C0144a;
import com.alipay.sdk.app.statistic.C0146c;
import com.alipay.sdk.cons.C0165a;
import com.alipay.sdk.sys.C0190a;
import com.android.volley.DefaultRetryPolicy;
import com.igexin.download.Downloads;
import com.tencent.connect.common.Constants;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"SetJavaScriptEnabled", "DefaultLocale"})
/* renamed from: com.alipay.sdk.util.l */
public final class C0206l {
    static final String f523a = "com.alipay.android.app";
    public static final String f524b = "com.eg.android.AlipayGphone";
    public static final int f525c = 99;
    public static final int f526d = 73;

    /* renamed from: com.alipay.sdk.util.l.a */
    public static class C0205a {
        public Signature[] f521a;
        public int f522b;

        public final boolean m673a() {
            if (this.f521a == null || this.f521a.length <= 0) {
                return false;
            }
            int i = 0;
            while (i < this.f521a.length) {
                String a = C0206l.m678a(this.f521a[i].toByteArray());
                if (a == null || TextUtils.equals(a, C0165a.f341g)) {
                    i++;
                } else {
                    C0144a.m398a(C0146c.f242b, C0146c.f260t, a);
                    return true;
                }
            }
            return false;
        }
    }

    public static Map<String, String> m679a(String str) {
        Map<String, String> hashMap = new HashMap();
        for (String str2 : str.split(C0190a.f451b)) {
            int indexOf = str2.indexOf("=", 1);
            hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
        }
        return hashMap;
    }

    public static String m677a(String str, String str2, String str3) {
        try {
            int length = str.length() + str3.indexOf(str);
            if (length <= str.length()) {
                return Constants.STR_EMPTY;
            }
            int i = 0;
            if (!TextUtils.isEmpty(str2)) {
                i = str3.indexOf(str2, length);
            }
            if (i <= 0) {
                return str3.substring(length);
            }
            return str3.substring(length, i);
        } catch (Throwable th) {
            return Constants.STR_EMPTY;
        }
    }

    public static String m678a(byte[] bArr) {
        try {
            String obj = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey().toString();
            if (obj.indexOf("modulus") != -1) {
                return obj.substring(obj.indexOf("modulus") + 8, obj.lastIndexOf(",")).trim();
            }
        } catch (Throwable e) {
            C0144a.m399a(C0146c.f244d, C0146c.f254n, e);
        }
        return null;
    }

    private static C0205a m699i(Context context) {
        return C0206l.m675a(context, f524b);
    }

    public static C0205a m675a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, Downloads.STATUS_RUNNING);
            if (!C0206l.m681a(packageInfo)) {
                try {
                    packageInfo = C0206l.m688c(context, str);
                } catch (Throwable th) {
                    C0144a.m399a(C0146c.f244d, C0146c.f253m, th);
                }
            }
        } catch (Throwable th2) {
            C0144a.m399a(C0146c.f244d, C0146c.f253m, th2);
            packageInfo = null;
        }
        if (!C0206l.m681a(packageInfo) || packageInfo == null) {
            return null;
        }
        C0205a c0205a = new C0205a();
        c0205a.f521a = packageInfo.signatures;
        c0205a.f522b = packageInfo.versionCode;
        return c0205a;
    }

    private static boolean m681a(PackageInfo packageInfo) {
        String str = Constants.STR_EMPTY;
        boolean z = false;
        if (packageInfo == null) {
            str = str + "info == null";
        } else if (packageInfo.signatures == null) {
            str = str + "info.signatures == null";
        } else if (packageInfo.signatures.length <= 0) {
            str = str + "info.signatures.length <= 0";
        } else {
            z = true;
        }
        if (!z) {
            C0144a.m398a(C0146c.f244d, C0146c.f252l, str);
        }
        return z;
    }

    private static PackageInfo m683b(Context context, String str) throws NameNotFoundException {
        return context.getPackageManager().getPackageInfo(str, Downloads.STATUS_RUNNING);
    }

    private static PackageInfo m688c(Context context, String str) {
        for (PackageInfo packageInfo : context.getPackageManager().getInstalledPackages(Downloads.STATUS_RUNNING)) {
            if (packageInfo.packageName.equals(str)) {
                return packageInfo;
            }
        }
        return null;
    }

    private static C0205a m684b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        C0205a c0205a = new C0205a();
        c0205a.f521a = packageInfo.signatures;
        c0205a.f522b = packageInfo.versionCode;
        return c0205a;
    }

    public static boolean m680a(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo(f523a, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == null) {
                return false;
            }
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean m686b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f524b, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (packageInfo != null && packageInfo.versionCode > f526d) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C0144a.m399a(C0146c.f242b, C0146c.f235B, th);
            return false;
        }
    }

    public static boolean m690c(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f524b, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (packageInfo != null && packageInfo.versionCode < f525c) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static String m693d(Context context) {
        String a = C0206l.m676a();
        String b = C0206l.m685b();
        String e = C0206l.m695e(context);
        return " (" + a + C0201h.f510b + b + C0201h.f510b + e + ";;" + C0206l.m696f(context) + ")(sdk android)";
    }

    public static String m676a() {
        return "Android " + VERSION.RELEASE;
    }

    public static WebView m674a(Activity activity, String str, String str2) {
        Method method;
        if (!TextUtils.isEmpty(str2)) {
            CookieSyncManager.createInstance(activity.getApplicationContext()).sync();
            CookieManager.getInstance().setCookie(str, str2);
            CookieSyncManager.getInstance().sync();
        }
        View linearLayout = new LinearLayout(activity);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setOrientation(1);
        activity.setContentView(linearLayout, layoutParams);
        View webView = new WebView(activity);
        layoutParams.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
        webView.setVisibility(0);
        linearLayout.addView(webView, layoutParams);
        WebSettings settings = webView.getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + C0206l.m693d(activity));
        settings.setRenderPriority(RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMinimumFontSize(settings.getMinimumFontSize() + 8);
        settings.setAllowFileAccess(false);
        settings.setTextSize(TextSize.NORMAL);
        webView.setVerticalScrollbarOverlay(true);
        webView.setDownloadListener(new C0207m(activity));
        if (VERSION.SDK_INT >= 7) {
            try {
                method = webView.getSettings().getClass().getMethod("setDomStorageEnabled", new Class[]{Boolean.TYPE});
                if (method != null) {
                    method.invoke(webView.getSettings(), new Object[]{Boolean.valueOf(true)});
                }
            } catch (Exception e) {
            }
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
        }
        if (VERSION.SDK_INT >= 19) {
            webView.getSettings().setCacheMode(1);
        }
        webView.loadUrl(str);
        return webView;
    }

    public static String m685b() {
        String d = C0206l.m692d();
        int indexOf = d.indexOf("-");
        if (indexOf != -1) {
            d = d.substring(0, indexOf);
        }
        indexOf = d.indexOf("\n");
        if (indexOf != -1) {
            d = d.substring(0, indexOf);
        }
        return "Linux " + d;
    }

    private static String m692d() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/version"), AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
            CharSequence readLine = bufferedReader.readLine();
            bufferedReader.close();
            Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
            if (!matcher.matches()) {
                return "Unavailable";
            }
            if (matcher.groupCount() < 4) {
                return "Unavailable";
            }
            return new StringBuilder(matcher.group(1)).append("\n").append(matcher.group(2)).append(" ").append(matcher.group(3)).append("\n").append(matcher.group(4)).toString();
        } catch (IOException e) {
            return "Unavailable";
        } catch (Throwable th) {
            bufferedReader.close();
        }
    }

    public static String m695e(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String m696f(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(displayMetrics.widthPixels);
        stringBuilder.append("*");
        stringBuilder.append(displayMetrics.heightPixels);
        return stringBuilder.toString();
    }

    private static DisplayMetrics m700j(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    private static String m701k(Context context) {
        String a = C0204k.m671a(context);
        return a.substring(0, a.indexOf("://"));
    }

    private static String m694e() {
        return "-1;-1";
    }

    public static String m689c() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 24; i++) {
            switch (random.nextInt(3)) {
                case StatAccount.DEFAULT_TYPE /*0*/:
                    stringBuilder.append(String.valueOf((char) ((int) Math.round((Math.random() * 25.0d) + 65.0d))));
                    break;
                case StatConstants.XG_PRO_VERSION /*1*/:
                    stringBuilder.append(String.valueOf((char) ((int) Math.round((Math.random() * 25.0d) + 97.0d))));
                    break;
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    stringBuilder.append(String.valueOf(new Random().nextInt(10)));
                    break;
                default:
                    break;
            }
        }
        return stringBuilder.toString();
    }

    public static boolean m687b(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static String m697g(Context context) {
        String str = Constants.STR_EMPTY;
        try {
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(f524b)) {
                    str = str + "#M";
                } else {
                    String str2;
                    if (runningAppProcessInfo.processName.startsWith("com.eg.android.AlipayGphone:")) {
                        str2 = str + "#" + runningAppProcessInfo.processName.replace("com.eg.android.AlipayGphone:", Constants.STR_EMPTY);
                    } else {
                        str2 = str;
                    }
                    str = str2;
                }
            }
        } catch (Throwable th) {
            str = Constants.STR_EMPTY;
        }
        if (str.length() > 0) {
            str = str.substring(1);
        }
        if (str.length() == 0) {
            return "N";
        }
        return str;
    }

    public static String m698h(Context context) {
        try {
            List installedPackages = context.getPackageManager().getInstalledPackages(0);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < installedPackages.size(); i++) {
                Object obj;
                PackageInfo packageInfo = (PackageInfo) installedPackages.get(i);
                int i2 = packageInfo.applicationInfo.flags;
                if ((i2 & 1) == 0 && (i2 & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == 0) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    if (packageInfo.packageName.equals(f524b)) {
                        stringBuilder.append(packageInfo.packageName).append(packageInfo.versionCode).append("-");
                    } else if (!(packageInfo.packageName.contains("theme") || packageInfo.packageName.startsWith("com.google.") || packageInfo.packageName.startsWith("com.android."))) {
                        stringBuilder.append(packageInfo.packageName).append("-");
                    }
                }
            }
            return stringBuilder.toString();
        } catch (Throwable th) {
            C0144a.m399a(C0146c.f242b, C0146c.f237D, th);
            return Constants.STR_EMPTY;
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean m691c(PackageInfo packageInfo) {
        int i = packageInfo.applicationInfo.flags;
        return (i & 1) == 0 && (i & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == 0;
    }

    public static boolean m682a(WebView webView, String str, Activity activity) {
        if (!TextUtils.isEmpty(str)) {
            if (str.toLowerCase().startsWith(C0165a.f342h.toLowerCase()) || str.toLowerCase().startsWith(C0165a.f343i.toLowerCase())) {
                try {
                    C0205a a = C0206l.m675a(activity, f524b);
                    if (!(a == null || a.m673a())) {
                        if (str.startsWith("intent://platformapi/startapp")) {
                            str = str.replaceFirst("intent://platformapi/startapp\\?", C0165a.f342h);
                        }
                        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    }
                } catch (Throwable th) {
                }
            } else if (TextUtils.equals(str, C0165a.f345k) || TextUtils.equals(str, C0165a.f346l)) {
                C0142h.f219a = C0142h.m385a();
                activity.finish();
            } else if (str.startsWith(C0165a.f344j)) {
                C0143i a2;
                try {
                    String substring = str.substring(str.indexOf(C0165a.f344j) + 24);
                    int parseInt = Integer.parseInt(substring.substring(substring.lastIndexOf(C0165a.f347m) + 10));
                    if (parseInt == C0143i.SUCCEEDED.f228h || parseInt == C0143i.PAY_WAITTING.f228h) {
                        String decode = URLDecoder.decode(str);
                        decode = decode.substring(decode.indexOf(C0165a.f344j) + 24, decode.lastIndexOf(C0165a.f347m));
                        a2 = C0143i.m392a(parseInt);
                        C0142h.f219a = C0142h.m386a(a2.f228h, a2.f229i, decode);
                        activity.runOnUiThread(new C0208n(activity));
                    } else {
                        a2 = C0143i.m392a(C0143i.FAILED.f228h);
                        C0142h.f219a = C0142h.m386a(a2.f228h, a2.f229i, Constants.STR_EMPTY);
                        activity.runOnUiThread(new C0208n(activity));
                    }
                } catch (Exception e) {
                    a2 = C0143i.m392a(C0143i.PARAMS_ERROR.f228h);
                    C0142h.f219a = C0142h.m386a(a2.f228h, a2.f229i, Constants.STR_EMPTY);
                }
            } else {
                webView.loadUrl(str);
            }
        }
        return true;
    }
}
