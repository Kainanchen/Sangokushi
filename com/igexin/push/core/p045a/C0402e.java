package com.igexin.push.core.p045a;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Message;
import android.os.PowerManager;
import android.os.Process;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Log;
import com.alipay.sdk.cons.C0167c;
import com.alipay.sdk.data.C0168a;
import com.alipay.sdk.sys.C0190a;
import com.alipay.sdk.util.C0203j;
import com.igexin.download.Downloads;
import com.igexin.getuiext.data.Consts;
import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p027b.p028a.p029a.C0231a;
import com.igexin.p022a.p023a.p027b.p028a.p029a.C0232b;
import com.igexin.p022a.p023a.p027b.p028a.p029a.C0240g;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.config.C0367a;
import com.igexin.push.config.C0378l;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.C0416a;
import com.igexin.push.core.C0426b;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.C0485i;
import com.igexin.push.core.C0487k;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.C0427a;
import com.igexin.push.core.bean.C0431e;
import com.igexin.push.core.bean.C0432f;
import com.igexin.push.core.bean.C0435i;
import com.igexin.push.core.bean.C0438l;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p044c.C0441c;
import com.igexin.push.core.p044c.C0444f;
import com.igexin.push.core.p044c.C0461w;
import com.igexin.push.core.p045a.p046a.C0383a;
import com.igexin.push.core.p045a.p046a.C0384b;
import com.igexin.push.core.p045a.p046a.C0385c;
import com.igexin.push.core.p045a.p046a.C0386d;
import com.igexin.push.core.p045a.p046a.C0387e;
import com.igexin.push.core.p045a.p046a.C0388f;
import com.igexin.push.core.p045a.p046a.C0389g;
import com.igexin.push.core.p045a.p046a.C0390h;
import com.igexin.push.core.p045a.p046a.C0391i;
import com.igexin.push.core.p045a.p046a.C0392j;
import com.igexin.push.core.p045a.p046a.C0393k;
import com.igexin.push.core.p045a.p046a.C0394l;
import com.igexin.push.core.p050d.C0467a;
import com.igexin.push.core.p050d.C0468b;
import com.igexin.push.core.p050d.C0469c;
import com.igexin.push.core.p050d.C0475i;
import com.igexin.push.core.p050d.C0476j;
import com.igexin.push.extension.C0511a;
import com.igexin.push.extension.stub.IPushExtension;
import com.igexin.push.p035e.p036b.C0508b;
import com.igexin.push.p035e.p036b.C0509c;
import com.igexin.push.p035e.p036b.C0510e;
import com.igexin.push.p035e.p049a.C0505a;
import com.igexin.push.p035e.p049a.C0506c;
import com.igexin.push.p037a.p038a.C0338c;
import com.igexin.push.p040c.p042b.C0348a;
import com.igexin.push.p040c.p042b.C0349b;
import com.igexin.push.p040c.p043c.C0351e;
import com.igexin.push.p040c.p043c.C0352a;
import com.igexin.push.p040c.p043c.C0354c;
import com.igexin.push.p040c.p043c.C0355d;
import com.igexin.push.p040c.p043c.C0356f;
import com.igexin.push.p040c.p043c.C0358h;
import com.igexin.push.p040c.p043c.C0359i;
import com.igexin.push.p040c.p043c.C0360j;
import com.igexin.push.p047d.C0401k;
import com.igexin.push.p047d.C0504j;
import com.igexin.push.p052f.C0512a;
import com.igexin.push.p052f.C0513b;
import com.igexin.sdk.PushConsts;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import com.tencent.tauth.Tencent;
import com.ut.device.AidConstants;
import com.zkunity.app.ResourceIDs;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.UnresolvedAddressException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.e */
public class C0402e extends C0397a implements C0401k {
    private static Map f1056a;
    private static Map f1057b;
    private static C0402e f1058c;

    private C0402e() {
        f1056a = new HashMap();
        f1056a.put(Integer.valueOf(0), new C0405h());
        f1056a.put(Integer.valueOf(5), new C0406i());
        f1056a.put(Integer.valueOf(37), new C0408k());
        f1056a.put(Integer.valueOf(9), new C0412o());
        f1056a.put(Integer.valueOf(26), new C0404g());
        f1056a.put(Integer.valueOf(28), new C0400d());
        f1057b = new HashMap();
        f1057b.put("goto", new C0389g());
        f1057b.put("notification", new C0390h());
        f1057b.put("startapp", new C0393k());
        f1057b.put("null", new C0388f());
        f1057b.put("wakeupsdk", new C0394l());
        f1057b.put("startweb", new C0392j());
        f1057b.put("checkapp", new C0384b());
        f1057b.put("cleanext", new C0385c());
        f1057b.put("enablelog", new C0387e());
        f1057b.put("disablelog", new C0386d());
        f1057b.put("reportext", new C0391i());
    }

    private void m1328C() {
        boolean z = false;
        C0485i.m1729a().m1732a(C0487k.NETWORK_SWITCH);
        C0247a.m838b("CoreAction onInternalReceiver: network changed");
        ConnectivityManager j = C0482f.m1694a().m1715j();
        if (j != null) {
            NetworkInfo activeNetworkInfo = j.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                z = true;
            }
            C0483g.f1323i = z;
        } else {
            C0483g.f1323i = false;
        }
        C0247a.m838b("CoreAction|network changed|" + C0483g.f1323i);
        m1385e();
        C0482f.m1694a().m1712g().m1804c(true);
        C0247a.m838b("CoreAction network changed start to check condition status....");
        if (m1401u()) {
            m1400t();
        }
    }

    private int m1329D() {
        if (C0483g.ai.isEmpty() && C0483g.f1329o) {
            Cursor a = C0482f.m1694a().m1716k().m1146a("message", new String[]{Downloads.COLUMN_STATUS}, new String[]{Constants.VIA_RESULT_SUCCESS}, null, null);
            if (a != null) {
                while (a.moveToNext()) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(C0259a.m882c(a.getBlob(a.getColumnIndex("info")))));
                        String string = jSONObject.getString(ResourceIDs.ID);
                        String string2 = jSONObject.getString(SocialConstants.PARAM_APP_ID);
                        String string3 = jSONObject.getString("messageid");
                        String string4 = jSONObject.getString("taskid");
                        String string5 = jSONObject.getString(C0190a.f455f);
                        String a2 = C0402e.m1330a().m1345a(string4, string3);
                        PushTaskBean pushTaskBean = new PushTaskBean();
                        pushTaskBean.setAppid(string2);
                        pushTaskBean.setMessageId(string3);
                        pushTaskBean.setTaskId(string4);
                        pushTaskBean.setId(string);
                        pushTaskBean.setAppKey(string5);
                        pushTaskBean.setCurrentActionid(1);
                        pushTaskBean.setStatus(a.getInt(a.getColumnIndex(Downloads.COLUMN_STATUS)));
                        if (jSONObject.has("cdnType")) {
                            pushTaskBean.setCDNType(jSONObject.getBoolean("cdnType"));
                        }
                        if (jSONObject.has("condition")) {
                            m1335b(jSONObject, pushTaskBean);
                        }
                        C0483g.ai.put(a2, pushTaskBean);
                    } catch (JSONException e) {
                    }
                }
                a.close();
            }
            C0483g.f1329o = false;
        }
        return C0483g.ai.size();
    }

    public static C0402e m1330a() {
        if (f1058c == null) {
            f1058c = new C0402e();
        }
        return f1058c;
    }

    private void m1331a(int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Downloads.COLUMN_STATUS, Integer.valueOf(i));
        C0482f.m1694a().m1716k().m1148a("message", contentValues, new String[]{"taskid"}, new String[]{str});
    }

    private void m1332a(C0354c c0354c, PushTaskBean pushTaskBean, String str, String str2) {
        c0354c.m1187a(new C0508b(pushTaskBean, str, m1391k()));
        C0483g.al.put(str2, c0354c);
    }

    private void m1333a(List list) {
        Comparator c0403f = new C0403f(this);
        PackageManager packageManager = C0483g.f1321g.getPackageManager();
        List installedPackages = packageManager.getInstalledPackages(0);
        for (int i = 0; i < installedPackages.size(); i++) {
            try {
                PackageInfo packageInfo = (PackageInfo) installedPackages.get(i);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if ((applicationInfo.flags & 1) <= 0) {
                    C0438l c0438l = new C0438l();
                    c0438l.m1546b(applicationInfo.loadLabel(packageManager).toString());
                    c0438l.m1550d(applicationInfo.packageName);
                    c0438l.m1548c(String.valueOf(packageInfo.versionCode));
                    c0438l.m1544a(packageInfo.versionName);
                    list.add(c0438l);
                }
            } catch (Exception e) {
            }
        }
        Collections.sort(list, c0403f);
    }

    private void m1334b(List list) {
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                String str = (String) list.get(i);
                PushTaskBean pushTaskBean = (PushTaskBean) C0483g.ai.get(str);
                pushTaskBean.setStatus(C0416a.f1081l);
                C0483g.ai.put(str, pushTaskBean);
            }
        }
    }

    private void m1335b(JSONObject jSONObject, PushTaskBean pushTaskBean) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("condition");
            Map hashMap = new HashMap();
            if (jSONObject2.has("wifi")) {
                hashMap.put("wifi", jSONObject2.getString("wifi"));
            }
            if (jSONObject2.has("screenOn")) {
                hashMap.put("screenOn", jSONObject2.getString("screenOn"));
            }
            if (jSONObject2.has("ssid")) {
                hashMap.put("ssid", jSONObject2.getString("ssid"));
                if (jSONObject2.has("bssid")) {
                    hashMap.put("bssid", jSONObject2.getString("bssid"));
                }
            }
            if (jSONObject2.has("duration")) {
                String string = jSONObject2.getString("duration");
                if (string.contains("-")) {
                    int indexOf = string.indexOf("-");
                    String substring = string.substring(0, indexOf);
                    string = string.substring(indexOf + 1, string.length());
                    hashMap.put("startTime", substring);
                    hashMap.put("endTime", string);
                }
            }
            pushTaskBean.setConditionMap(hashMap);
        } catch (JSONException e) {
        }
    }

    private void m1336e(Intent intent) {
        String stringExtra = intent.getStringExtra("taskid");
        String stringExtra2 = intent.getStringExtra("messageid");
        String stringExtra3 = intent.getStringExtra("actionid");
        String stringExtra4 = intent.getStringExtra("accesstoken");
        int intExtra = intent.getIntExtra("notifID", 0);
        NotificationManager notificationManager = (NotificationManager) C0483g.f1321g.getSystemService("notification");
        if (intExtra != 0) {
            notificationManager.cancel(intExtra);
        } else if (C0483g.aj.get(stringExtra) != null) {
            notificationManager.cancel(((Integer) C0483g.aj.get(stringExtra)).intValue());
        }
        if (stringExtra4.equals(C0483g.au)) {
            m1376b(stringExtra, stringExtra2, stringExtra3);
        }
    }

    private void m1337f(Intent intent) {
        Throwable th;
        Cursor cursor = null;
        String stringExtra = intent.getStringExtra("taskid");
        String stringExtra2 = intent.getStringExtra("messageid");
        String stringExtra3 = intent.getStringExtra(SocialConstants.PARAM_APP_ID);
        String stringExtra4 = intent.getStringExtra("pkgname");
        ContentValues contentValues = new ContentValues();
        String str = "EXEC_" + stringExtra;
        contentValues.put("taskid", stringExtra);
        contentValues.put(SocialConstants.PARAM_APP_ID, stringExtra3);
        contentValues.put("key", str);
        contentValues.put("createtime", Long.valueOf(System.currentTimeMillis()));
        Cursor a;
        try {
            a = C0482f.m1694a().m1716k().m1146a("message", new String[]{"key"}, new String[]{str}, null, null);
            if (a != null) {
                try {
                    if (a.getCount() == 0) {
                        C0482f.m1694a().m1716k().m1147a("message", contentValues);
                        if (stringExtra4.equals(C0483g.f1319e)) {
                            if (stringExtra2 == null || stringExtra == null) {
                                if (a != null) {
                                    a.close();
                                    return;
                                }
                                return;
                            } else if (C0482f.m1694a() != null && m1370b(stringExtra, stringExtra2) == C0426b.success) {
                                m1367a(stringExtra, stringExtra2, Constants.VIA_TO_TYPE_QQ_GROUP);
                            }
                        }
                    }
                } catch (Exception e) {
                    if (a != null) {
                        a.close();
                    }
                } catch (Throwable th2) {
                    cursor = a;
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
        } catch (Exception e2) {
            a = null;
            if (a != null) {
                a.close();
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private void m1338f(String str) {
        if (str != null && str.startsWith("package:")) {
            String substring = str.substring(8);
            if (C0444f.m1577a().m1603d().containsKey(substring)) {
                C0444f.m1577a().m1603d().remove(substring);
            }
        }
    }

    private void m1339g(String str) {
        if (str != null && str.startsWith("package:")) {
            String substring = str.substring(8);
            try {
                PackageInfo packageInfo = C0483g.f1321g.getPackageManager().getPackageInfo(substring, 4);
                if (packageInfo != null) {
                    ServiceInfo[] serviceInfoArr = packageInfo.services;
                    if (serviceInfoArr != null) {
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            if (C0416a.f1084o.equals(serviceInfo.name) || C0416a.f1083n.equals(serviceInfo.name) || C0416a.f1085p.equals(serviceInfo.name)) {
                                C0444f.m1577a().m1603d().put(substring, serviceInfo.name);
                                return;
                            }
                        }
                    }
                }
            } catch (NameNotFoundException e) {
            }
        }
    }

    private void m1340h(String str) {
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        try {
            File file = new File(C0483g.aa);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(C0483g.aa);
            try {
                fileOutputStream.write(C0259a.m877a(str).getBytes());
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e2) {
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e3) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e4) {
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            fileOutputStream = null;
            th = th4;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    public void m1341A() {
        if (C0483g.f1303O < System.currentTimeMillis()) {
            C0444f.m1577a().m1594a(false);
        }
    }

    public void m1342B() {
        if (!C0483g.af) {
            C0483g.af = C0244d.m802c().m795a(C0509c.m1821g(), false, true);
        }
        if (!C0483g.ag) {
            C0483g.ag = C0244d.m802c().m795a(C0510e.m1828g(), true, true);
        }
        if (!C0483g.ah) {
            C0482f.m1694a().m1708c();
        }
    }

    public C0432f m1343a(JSONObject jSONObject) {
        C0432f c0432f = new C0432f();
        c0432f.m1502a(jSONObject.getString("version"));
        JSONArray jSONArray = jSONObject.getJSONArray("extensions");
        if (jSONArray == null || jSONArray.length() <= 0) {
            c0432f.m1503a(new HashMap());
        } else {
            Map hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                C0431e c0431e = new C0431e();
                c0431e.m1482a(jSONObject2.getInt(ResourceIDs.ID));
                c0431e.m1484a(jSONObject2.getString("version"));
                c0431e.m1488b(jSONObject2.getString(C0167c.f364e));
                c0431e.m1490c(jSONObject2.getString("cls_name"));
                c0431e.m1492d(jSONObject2.getString(SocialConstants.PARAM_URL));
                c0431e.m1494e(jSONObject2.getString("checksum"));
                c0431e.m1496f(jSONObject2.getString("key"));
                if (jSONObject2.has("isdestroy")) {
                    c0431e.m1485a(jSONObject2.getBoolean("isdestroy"));
                }
                if (jSONObject2.has("effective")) {
                    String string = jSONObject2.getString("effective");
                    long j = 0;
                    if (string != null && string.length() <= 13) {
                        j = Long.parseLong(string);
                    }
                    c0431e.m1483a(j);
                }
                if (jSONObject2.has("loadTime")) {
                    c0431e.m1487b(jSONObject2.getLong("loadTime"));
                }
                hashMap.put(Integer.valueOf(c0431e.m1481a()), c0431e);
            }
            c0432f.m1503a(hashMap);
        }
        return c0432f;
    }

    public String m1344a(C0432f c0432f) {
        JSONObject jSONObject = new JSONObject();
        try {
            String a = c0432f.m1501a();
            Map b = c0432f.m1504b();
            String str = "[]";
            if (a != null) {
                jSONObject.put("version", a);
            }
            if (b != null && b.size() > 0) {
                a = "[";
                for (Entry value : b.entrySet()) {
                    C0431e c0431e = (C0431e) value.getValue();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(ResourceIDs.ID, c0431e.m1481a());
                    jSONObject2.put("version", c0431e.m1486b());
                    jSONObject2.put(C0167c.f364e, c0431e.m1489c());
                    jSONObject2.put("cls_name", c0431e.m1491d());
                    jSONObject2.put(SocialConstants.PARAM_URL, c0431e.m1493e());
                    jSONObject2.put("checksum", c0431e.m1495f());
                    jSONObject2.put("isdestroy", c0431e.m1497g());
                    jSONObject2.put("effective", c0431e.m1498h());
                    jSONObject2.put("loadTime", c0431e.m1499i());
                    jSONObject2.put("key", c0431e.m1500j());
                    a = (a + jSONObject2.toString()) + ",";
                }
                str = (a.endsWith(",") ? a.substring(0, a.length() - 1) : a) + "]";
            }
            jSONObject.put("extensions", new JSONArray(str));
            return jSONObject.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    public String m1345a(String str, String str2) {
        return str + ":" + str2;
    }

    public String m1346a(boolean z, int i) {
        String str;
        Throwable th;
        Cursor cursor;
        Cursor cursor2 = null;
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        if (i == -1) {
            try {
                str = format + "|" + C0483g.f1289A + "|" + "register" + "|" + C0483g.f1334t;
            } catch (Exception e) {
                str = null;
                if (cursor2 != null) {
                    cursor2.close();
                }
                return str;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else if (i == 0) {
            cursor = z ? C0482f.m1694a().m1716k().m1146a("bi", new String[]{SocialConstants.PARAM_TYPE}, new String[]{Constants.VIA_TO_TYPE_QQ_GROUP, Constants.VIA_SSO_LOGIN}, null, null) : C0482f.m1694a().m1716k().m1146a("bi", new String[]{SocialConstants.PARAM_TYPE}, new String[]{Constants.VIA_SSO_LOGIN}, null, null);
            if (cursor != null) {
                str = null;
                while (cursor.moveToNext()) {
                    try {
                        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("start_service_count"));
                        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("login_count"));
                        int i4 = cursor.getInt(cursor.getColumnIndexOrThrow("loginerror_nonetwork_count"));
                        int i5 = cursor.getInt(cursor.getColumnIndexOrThrow("loginerror_connecterror_count"));
                        int i6 = cursor.getInt(cursor.getColumnIndexOrThrow("online_time"));
                        int i7 = cursor.getInt(cursor.getColumnIndexOrThrow("network_time"));
                        int i8 = cursor.getInt(cursor.getColumnIndexOrThrow("running_time"));
                        String str2 = cursor.getString(cursor.getColumnIndexOrThrow("create_time")) + " 00:00:00";
                        str = str == null ? str2 + "|" + C0483g.f1289A + "|" + "startservice" + "|" + i2 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "login" + "|" + i3 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "loginerror-nonetwork" + "|" + i4 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "loginerror-connecterror" + "|" + i5 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "online" + "|" + i6 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "network" + "|" + i7 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "running" + "|" + i8 : str + "\n" + str2 + "|" + C0483g.f1289A + "|" + "startservice" + "|" + i2 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "login" + "|" + i3 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "loginerror-nonetwork" + "|" + i4 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "loginerror-connecterror" + "|" + i5 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "online" + "|" + i6 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "network" + "|" + i7 + "\n" + str2 + "|" + C0483g.f1289A + "|" + "running" + "|" + i8;
                    } catch (Exception e2) {
                        cursor2 = cursor;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } else {
                str = null;
            }
            cursor2 = cursor;
        } else if (i == 1) {
            long j = C0485i.m1729a().f1342a;
            if (C0378l.f1017d > 0) {
                j = (long) (C0378l.f1017d * AidConstants.EVENT_REQUEST_STARTED);
            }
            str = format + "|" + C0483g.f1333s + "|" + C0483g.f1315a + "|" + C0483g.f1324j + "|" + (C0378l.f1014a + "," + C0378l.f1015b) + "|" + j + "|";
        } else {
            str = i == 4 ? format + "|" + C0483g.f1333s + "|" + C0483g.f1315a + "|" : i == 5 ? format + "|" + C0483g.f1333s + "|" + C0483g.f1315a : null;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return str;
    }

    public void m1347a(int i) {
        Intent intent = new Intent();
        intent.addFlags(32);
        intent.setAction("com.igexin.sdk.action." + C0483g.f1315a);
        Bundle bundle = new Bundle();
        bundle.putInt(AuthActivity.ACTION_KEY, PushConsts.GET_SDKSERVICEPID);
        bundle.putInt("pid", i);
        intent.putExtras(bundle);
        C0482f.m1694a().m1699a(intent);
    }

    public void m1348a(int i, int i2, String str) {
        C0378l.f1014a = i;
        C0378l.f1015b = i2;
        C0367a.m1224a().m1233b();
        C0338c.m1132c().m1136d();
    }

    public void m1349a(int i, String str) {
        C0378l.f1017d = i;
        C0367a.m1224a().m1235c();
        if (C0483g.f1327m) {
            C0247a.m838b("setHeartbeatInterval heartbeatReq");
            if (System.currentTimeMillis() - C0483g.f1306R > 5000) {
                C0483g.f1306R = System.currentTimeMillis();
                m1386f();
            }
        }
    }

    public void m1350a(Intent intent) {
        if (intent != null) {
            C0482f.m1694a().m1705a(false);
            if (intent.hasExtra("op_app")) {
                C0483g.f1291C = intent.getStringExtra("op_app");
            } else {
                C0483g.f1291C = Constants.STR_EMPTY;
            }
            C0483g.f1328n = false;
            if (C0483g.f1327m) {
                m1392l();
                C0483g.f1328n = true;
            }
        }
    }

    public void m1351a(Bundle bundle) {
        String string = bundle.getString(AuthActivity.ACTION_KEY);
        if (string.equals("setTag")) {
            if (C0378l.f1023j) {
                m1375b(bundle.getString("tags"));
            }
        } else if (string.equals("setSilentTime")) {
            if (C0378l.f1024k) {
                m1348a(bundle.getInt("beginHour", 0), bundle.getInt("duration", 0), C0483g.f1321g.getPackageName());
            }
        } else if (string.equals("sendMessage")) {
            C0247a.m838b("CoreAction onPushManagerMessage recevie action : sendMessage");
            if (C0378l.f1022i) {
                string = bundle.getString("taskid");
                byte[] byteArray = bundle.getByteArray("extraData");
                C0247a.m838b("CoreAction receive broadcast msg data , task id : " + string + " ######@##@@@#");
                m1360a(string, byteArray);
            }
        } else if (string.equals("stopService")) {
            C0482f.m1694a().m1704a(C0483g.f1321g.getPackageName());
        } else if (string.equals("setHeartbeatInterval")) {
            if (C0378l.f1025l) {
                m1349a(bundle.getInt("interval", 0), C0483g.f1321g.getPackageName());
            }
        } else if (string.equals("setSocketTimeout")) {
            if (C0378l.f1026m) {
                m1372b(bundle.getInt(C0168a.f379f, 0), C0483g.f1321g.getPackageName());
            }
        } else if (string.equals("sendFeedbackMessage")) {
            if (C0378l.f1032s && C0483g.an <= Downloads.STATUS_SUCCESS) {
                string = bundle.getString("taskid");
                String string2 = bundle.getString("messageid");
                String string3 = bundle.getString("actionid");
                String str = string + ":" + string2 + ":" + string3;
                if (C0483g.am.get(str) == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    PushTaskBean pushTaskBean = new PushTaskBean();
                    pushTaskBean.setTaskId(string);
                    pushTaskBean.setMessageId(string2);
                    pushTaskBean.setAppid(C0483g.f1315a);
                    pushTaskBean.setAppKey(C0483g.f1316b);
                    m1353a(pushTaskBean, string3);
                    C0483g.an++;
                    C0483g.am.put(str, Long.valueOf(currentTimeMillis));
                }
            }
        } else if (string.equals("turnOffPush")) {
            C0482f.m1694a().m1707b(C0483g.f1321g.getPackageName());
        } else if (string.equals("bindAlias")) {
            string = bundle.getString("alias");
            C0247a.m838b("-> CoreAction onPushManagerMessage bindAlias...");
            m1380c(string);
        } else if (string.equals("unbindAlias")) {
            string = bundle.getString("alias");
            boolean z = bundle.getBoolean("isSeft");
            C0247a.m838b("-> CoreAction onPushManagerMessage unbindAlias...");
            m1359a(string, z);
        }
    }

    public void m1352a(PushTaskBean pushTaskBean) {
        C0351e c0354c = new C0354c();
        c0354c.m1185a();
        c0354c.f943c = "RCV" + pushTaskBean.getMessageId();
        c0354c.f944d = C0483g.f1333s;
        c0354c.f941a = (int) System.currentTimeMillis();
        C0482f.m1694a().m1712g().m1795a("C-" + C0483g.f1333s, c0354c);
        C0247a.m838b("cdnreceive|" + pushTaskBean.getTaskId() + "|" + pushTaskBean.getMessageId());
    }

    public void m1353a(PushTaskBean pushTaskBean, String str) {
        if (pushTaskBean.isCDNType()) {
            m1374b(pushTaskBean, str);
        } else {
            m1354a(pushTaskBean, str, "ok");
        }
    }

    public void m1354a(PushTaskBean pushTaskBean, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = "{\"action\":\"pushmessage_feedback\",\"appid\":\"" + pushTaskBean.getAppid() + "\", \"id\":\"" + currentTimeMillis + "\", \"appkey\":\"" + pushTaskBean.getAppKey() + "\", \"messageid\":\"" + pushTaskBean.getMessageId() + "\",\"taskid\":\"" + pushTaskBean.getTaskId() + "\",\"actionid\": \"" + str + "\",\"result\":\"" + str2 + "\",\"timestamp\":\"" + System.currentTimeMillis() + "\"}";
        C0351e c0355d = new C0355d();
        c0355d.m1192a();
        c0355d.f948a = (int) currentTimeMillis;
        c0355d.f951d = "17258000";
        c0355d.f952e = str3;
        c0355d.f954g = C0483g.f1333s;
        C0482f.m1694a().m1712g().m1795a("C-" + C0483g.f1333s, c0355d);
        C0441c a = C0441c.m1566a();
        if (a != null) {
            a.m1570a(new C0435i(currentTimeMillis, str3, (byte) 3, currentTimeMillis));
        }
        C0247a.m838b("feedback|" + pushTaskBean.getTaskId() + "|" + pushTaskBean.getMessageId() + "|" + str);
    }

    public void m1355a(String str) {
        String str2 = "{\"action\":\"received\",\"id\":\"" + str + "\"}";
        C0351e c0355d = new C0355d();
        c0355d.m1192a();
        c0355d.f948a = (int) System.currentTimeMillis();
        c0355d.f951d = "17258000";
        c0355d.f952e = str2;
        c0355d.f954g = C0483g.f1333s;
        C0482f.m1694a().m1712g().m1795a("C-" + C0483g.f1333s, c0355d);
    }

    public void m1356a(String str, C0352a c0352a, PushTaskBean pushTaskBean) {
        C0244d.m802c().m795a(new C0505a(new C0469c(str, c0352a, pushTaskBean)), false, true);
    }

    public void m1357a(String str, String str2, String str3, String str4) {
        Intent intent = new Intent("com.igexin.sdk.action.execute");
        intent.putExtra("taskid", str);
        intent.putExtra("messageid", str2);
        intent.putExtra(SocialConstants.PARAM_APP_ID, C0483g.f1315a);
        intent.putExtra("pkgname", C0483g.f1319e);
        C0482f.m1694a().m1699a(intent);
    }

    public void m1358a(String str, String str2, String str3, String str4, long j) {
        Intent intent = new Intent();
        intent.addFlags(32);
        intent.setAction("com.igexin.sdk.action." + C0483g.f1315a);
        Bundle bundle = new Bundle();
        bundle.putInt(AuthActivity.ACTION_KEY, PushConsts.THIRDPART_FEEDBACK);
        bundle.putString(SocialConstants.PARAM_APP_ID, str);
        bundle.putString("taskid", str2);
        bundle.putString("actionid", str3);
        bundle.putString(C0203j.f519c, str4);
        bundle.putLong("timestamp", j);
        intent.putExtras(bundle);
        C0482f.m1694a().m1699a(intent);
    }

    public void m1359a(String str, boolean z) {
        if (!z || !C0259a.m880b(C0483g.f1333s)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - C0483g.f1308T > 5000) {
                String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date(currentTimeMillis));
                if (!format.equals(C0483g.f1307S)) {
                    C0444f.m1577a().m1605d(format);
                    C0444f.m1577a().m1590a(0);
                }
                if (C0483g.f1309U < 100) {
                    C0483g.f1308T = currentTimeMillis;
                    C0444f.m1577a().m1590a(C0483g.f1309U + 1);
                    C0244d.m802c().m795a(new C0506c(new C0475i(SDKUrlConfig.getAmpServiceUrl(), str, z)), false, true);
                }
            }
        }
    }

    public void m1360a(String str, byte[] bArr) {
        if (C0483g.f1333s != null) {
            JSONObject jSONObject = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                jSONObject.put(AuthActivity.ACTION_KEY, "sendmessage");
                jSONObject.put(ResourceIDs.ID, String.valueOf(currentTimeMillis));
                jSONObject.put("cid", C0483g.f1333s);
                jSONObject.put(SocialConstants.PARAM_APP_ID, C0483g.f1315a);
                jSONObject.put("taskid", str);
                String jSONObject2 = jSONObject.toString();
                C0351e c0355d = new C0355d();
                c0355d.m1192a();
                c0355d.f948a = (int) currentTimeMillis;
                c0355d.f951d = C0483g.f1333s;
                c0355d.f952e = jSONObject2;
                c0355d.f953f = bArr;
                c0355d.f954g = C0483g.f1333s;
                C0482f.m1694a().m1712g().m1796a("C-" + C0483g.f1333s, c0355d, true);
                if (str != null && str.startsWith("4T5@S_")) {
                    C0247a.m838b("CoreAction sending lbs report message : " + jSONObject2);
                }
            } catch (JSONException e) {
                C0247a.m838b("CoreAction" + e.toString());
            }
        }
    }

    public void m1361a(boolean z) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1362a(byte[] r7) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 0;
        r1 = android.util.Base64.decode(r7, r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = com.igexin.p022a.p031b.C0259a.m882c(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2 = new java.lang.String;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2.<init>();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "CoreAction parse sdk config from server resp : ";
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2 = r2.append(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.p022a.p023a.p030c.C0247a.m838b(r2);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2 = "result";
        r2 = r1.has(r2);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r2 == 0) goto L_0x0330;
    L_0x0032:
        r2 = "result";
        r2 = r1.getString(r2);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "ok";
        r2 = r3.equals(r2);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r2 == 0) goto L_0x0330;
    L_0x0040:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r4 = com.igexin.push.core.p044c.C0444f.m1577a();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r4.m1608g(r2);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2 = "config";
        r2 = r1.has(r2);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r2 == 0) goto L_0x0330;
    L_0x0053:
        r2 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "config";
        r1 = r1.getString(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = "sdk.uploadapplist.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x0086;
    L_0x0066:
        r1 = "sdk.uploadapplist.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x007c;
    L_0x0074:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x0086;
    L_0x007c:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1021h = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x0086:
        r1 = "sdk.feature.sendmessage.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x00ae;
    L_0x008e:
        r1 = "sdk.feature.sendmessage.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x00a4;
    L_0x009c:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x00ae;
    L_0x00a4:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1022i = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x00ae:
        r1 = "sdk.readlocalcell.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x00d6;
    L_0x00b6:
        r1 = "sdk.readlocalcell.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x00cc;
    L_0x00c4:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x00d6;
    L_0x00cc:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1020g = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x00d6:
        r1 = "sdk.ca.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x00fe;
    L_0x00de:
        r1 = "sdk.ca.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x00f4;
    L_0x00ec:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x00fe;
    L_0x00f4:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1027n = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x00fe:
        r1 = "sdk.snl.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x0126;
    L_0x0106:
        r1 = "sdk.snl.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x011c;
    L_0x0114:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x0126;
    L_0x011c:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1028o = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x0126:
        r1 = "sdk.domainbackup.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x014e;
    L_0x012e:
        r1 = "sdk.domainbackup.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x0144;
    L_0x013c:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x014e;
    L_0x0144:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1019f = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x014e:
        r1 = "sdk.feature.setsilenttime.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x0186;
    L_0x0156:
        r1 = "sdk.feature.setsilenttime.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x016c;
    L_0x0164:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x0186;
    L_0x016c:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1024k = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = com.igexin.push.config.C0378l.f1024k;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 != 0) goto L_0x0186;
    L_0x017a:
        r1 = com.igexin.push.config.C0378l.f1015b;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x0186;
    L_0x017e:
        r1 = 12;
        r3 = 0;
        r4 = "server";
        r6.m1348a(r1, r3, r4);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x0186:
        r1 = "sdk.snl.maxactiveflow";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x019b;
    L_0x018e:
        r1 = "sdk.snl.maxactiveflow";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ Exception -> 0x033c, Throwable -> 0x033a }
        r4 = (long) r1;	 Catch:{ Exception -> 0x033c, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1029p = r4;	 Catch:{ Exception -> 0x033c, Throwable -> 0x033a }
    L_0x019b:
        r1 = "sdk.feature.settag.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x01c3;
    L_0x01a3:
        r1 = "sdk.feature.settag.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x01b9;
    L_0x01b1:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x01c3;
    L_0x01b9:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1023j = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x01c3:
        r1 = "sdk.feature.setheartbeatinterval.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x01eb;
    L_0x01cb:
        r1 = "sdk.feature.setheartbeatinterval.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x01e1;
    L_0x01d9:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x01eb;
    L_0x01e1:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1025l = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x01eb:
        r1 = "sdk.feature.setsockettimeout.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x0213;
    L_0x01f3:
        r1 = "sdk.feature.setsockettimeout.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x0209;
    L_0x0201:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x0213;
    L_0x0209:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1026m = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x0213:
        r1 = "sdk.guard.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x023b;
    L_0x021b:
        r1 = "sdk.guard.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x0231;
    L_0x0229:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x023b;
    L_0x0231:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1030q = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x023b:
        r1 = "sdk.wakeupsdk.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x0263;
    L_0x0243:
        r1 = "sdk.wakeupsdk.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x0259;
    L_0x0251:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x0263;
    L_0x0259:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1031r = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x0263:
        r1 = "sdk.feature.feedback.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x028b;
    L_0x026b:
        r1 = "sdk.feature.feedback.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x0281;
    L_0x0279:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x028b;
    L_0x0281:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1032s = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x028b:
        r1 = "sdk.watchout.app";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x029b;
    L_0x0293:
        r1 = "sdk.watchout.app";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1034u = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x029b:
        r1 = "sdk.watchout.service";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x02ab;
    L_0x02a3:
        r1 = "sdk.watchout.service";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1035v = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x02ab:
        r1 = "sdk.daemon.enable";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x02d3;
    L_0x02b3:
        r1 = "sdk.daemon.enable";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = "true";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 != 0) goto L_0x02c9;
    L_0x02c1:
        r3 = "false";
        r3 = r1.equals(r3);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x02d3;
    L_0x02c9:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        com.igexin.push.config.C0378l.f1036w = r1;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x02d3:
        r1 = "ext_infos";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x0329;
    L_0x02db:
        r1 = "ext_infos";
        r1 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x0329;
    L_0x02e3:
        r2 = "";
        r2 = r2.equals(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r2 != 0) goto L_0x0329;
    L_0x02eb:
        r2 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2.<init>(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = "version";
        r1 = r2.has(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r1 == 0) goto L_0x0329;
    L_0x02f8:
        r1 = "version";
        r3 = r2.getString(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1 = 1;
        r4 = com.igexin.push.config.C0378l.f1033t;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r4 == 0) goto L_0x033f;
    L_0x0303:
        r4 = com.igexin.push.config.C0378l.f1033t;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r4 = r4.m1501a();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r3 = r3.equals(r4);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r3 == 0) goto L_0x033f;
    L_0x030f:
        if (r0 == 0) goto L_0x0329;
    L_0x0311:
        r0 = r6.m1343a(r2);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        if (r0 == 0) goto L_0x0329;
    L_0x0317:
        r1 = new android.os.Message;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1.<init>();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r2 = com.igexin.push.core.C0416a.f1078i;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1.what = r2;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r1.obj = r0;	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r0 = com.igexin.push.core.C0482f.m1694a();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r0.m1700a(r1);	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x0329:
        r0 = com.igexin.push.config.C0367a.m1224a();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
        r0.m1239f();	 Catch:{ Exception -> 0x0331, Throwable -> 0x033a }
    L_0x0330:
        return;
    L_0x0331:
        r0 = move-exception;
        r0 = r0.toString();
        r6.m1383d(r0);
        goto L_0x0330;
    L_0x033a:
        r0 = move-exception;
        goto L_0x0330;
    L_0x033c:
        r1 = move-exception;
        goto L_0x019b;
    L_0x033f:
        r0 = r1;
        goto L_0x030f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.core.a.e.a(byte[]):void");
    }

    public boolean m1363a(long j) {
        Date date = new Date(j);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(11);
        int i2 = C0378l.f1014a + C0378l.f1015b;
        if (i2 >= 24) {
            i2 -= 24;
        }
        if (C0378l.f1015b == 0) {
            return false;
        }
        if (C0378l.f1014a < i2) {
            if (i >= C0378l.f1014a && i < i2) {
                return true;
            }
        } else if (C0378l.f1014a > i2) {
            if (i >= 0 && i < i2) {
                return true;
            }
            if (i >= C0378l.f1014a && i < 24) {
                return true;
            }
        }
        return false;
    }

    public boolean m1364a(C0233d c0233d) {
        switch (c0233d.m726b()) {
            case -2047:
                C0247a.m838b("disconnected|network");
                C0485i.m1729a().m1732a(C0487k.NETWORK_ERROR);
                C0461w.m1631d();
                if ((c0233d.f557M instanceof ClosedChannelException) || (c0233d.f557M instanceof SocketTimeoutException) || (c0233d.f557M instanceof UnknownHostException) || (c0233d.f557M instanceof UnresolvedAddressException) || (c0233d.f557M instanceof UnknownServiceException)) {
                    C0461w.m1626a();
                }
                if (C0483g.f1324j && C0483g.f1325k) {
                    if (C0483g.f1327m) {
                        C0483g.f1327m = false;
                        m1393m();
                    }
                    C0482f.m1694a().m1712g().m1804c(false);
                } else if (C0483g.f1327m) {
                    C0483g.f1327m = false;
                    m1393m();
                }
                C0244d.m802c().m796a(C0240g.class);
                break;
            case -2045:
                C0247a.m838b("disconnected|user");
                break;
            default:
                return true;
        }
        return false;
    }

    public boolean m1365a(C0351e c0351e) {
        if (c0351e == null) {
            return false;
        }
        C0397a c0397a = (C0397a) f1056a.get(Integer.valueOf(c0351e.f928i));
        if (c0397a != null) {
            c0397a.m1319a((Object) c0351e);
        }
        C0509c.m1821g().m1826h();
        return true;
    }

    public boolean m1366a(Object obj) {
        C0504j g = C0482f.m1694a().m1712g();
        if ((obj instanceof C0351e) && g != null) {
            g.m1798a((C0351e) obj);
        } else if (obj instanceof C0232b) {
            if (C0483g.f1327m) {
                C0483g.f1327m = false;
                m1393m();
            }
        } else if (!(obj instanceof C0231a)) {
            if (obj instanceof C0348a) {
                g.m1804c(false);
            } else if (obj instanceof C0349b) {
                g.m1804c(true);
            }
        }
        C0247a.m838b("doHandleFilter return false");
        return false;
    }

    public boolean m1367a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("taskid", str);
        bundle.putString("messageid", str2);
        bundle.putString("actionid", str3);
        Message message = new Message();
        message.what = C0416a.f1077h;
        message.obj = bundle;
        return C0482f.m1694a().m1700a(message);
    }

    public boolean m1368a(JSONObject jSONObject, PushTaskBean pushTaskBean) {
        List arrayList = new ArrayList();
        try {
            Object obj;
            JSONArray jSONArray = jSONObject.getJSONArray("action_chains");
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = ((JSONObject) jSONArray.get(i)).getString(SocialConstants.PARAM_TYPE);
                if (string != null) {
                    for (IPushExtension isActionSupported : C0511a.m1834a().m1839c()) {
                        if (isActionSupported.isActionSupported(string)) {
                            obj = 1;
                            break;
                        }
                    }
                    obj = null;
                    if (obj == null && f1057b.get(string) == null) {
                        return false;
                    }
                }
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i2);
                String string2 = jSONObject2.getString(SocialConstants.PARAM_TYPE);
                if (string2 != null) {
                    BaseAction baseAction = null;
                    for (IPushExtension parseAction : C0511a.m1834a().m1839c()) {
                        baseAction = parseAction.parseAction(jSONObject2);
                        if (baseAction != null) {
                            break;
                        }
                    }
                    if (baseAction == null) {
                        C0383a c0383a = (C0383a) f1057b.get(string2);
                        if (c0383a != null) {
                            obj = c0383a.m1260a(jSONObject2);
                            if (obj != null) {
                                obj.setSupportExt(false);
                            }
                            if (obj == null) {
                                return false;
                            }
                            arrayList.add(obj);
                        }
                    }
                    BaseAction baseAction2 = baseAction;
                    if (obj == null) {
                        return false;
                    }
                    arrayList.add(obj);
                }
            }
        } catch (Throwable th) {
            C0247a.m838b("CoreAction|" + th.toString());
        }
        pushTaskBean.setActionChains(arrayList);
        return true;
    }

    public boolean m1369a(JSONObject jSONObject, byte[] bArr, boolean z) {
        Cursor a;
        Exception e;
        Throwable th;
        try {
            if (jSONObject.has(AuthActivity.ACTION_KEY) && jSONObject.getString(AuthActivity.ACTION_KEY).equals("pushmessage")) {
                String string = jSONObject.getString(ResourceIDs.ID);
                String string2 = jSONObject.getString(SocialConstants.PARAM_APP_ID);
                String string3 = jSONObject.getString("messageid");
                String string4 = jSONObject.getString("taskid");
                String string5 = jSONObject.getString(C0190a.f455f);
                JSONArray jSONArray = jSONObject.getJSONArray("action_chains");
                C0247a.m838b("pushmessage|" + string4 + "|" + string3 + "|" + string2 + "|" + z);
                if (string2 == null || string == null || string3 == null || string4 == null || jSONArray == null || !string2.equals(C0483g.f1315a)) {
                    C0247a.m838b("CoreAction|receieve error  pushmessage");
                } else {
                    PushTaskBean pushTaskBean = new PushTaskBean();
                    pushTaskBean.setAppid(string2);
                    pushTaskBean.setMessageId(string3);
                    pushTaskBean.setTaskId(string4);
                    pushTaskBean.setId(string);
                    pushTaskBean.setAppKey(string5);
                    pushTaskBean.setCurrentActionid(1);
                    if (jSONObject.has("cdnType")) {
                        pushTaskBean.setCDNType(jSONObject.getBoolean("cdnType"));
                    }
                    String a2 = C0402e.m1330a().m1345a(string4, string3);
                    if (z) {
                        C0402e.m1330a().m1353a(pushTaskBean, Constants.VIA_RESULT_SUCCESS);
                        if (C0402e.m1330a().m1363a(System.currentTimeMillis())) {
                            return true;
                        }
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("messageid", string3);
                    contentValues.put("taskid", string4);
                    contentValues.put(SocialConstants.PARAM_APP_ID, string2);
                    contentValues.put("key", "CACHE_" + a2);
                    contentValues.put("info", C0259a.m881b(jSONObject.toString().getBytes()));
                    contentValues.put("createtime", Long.valueOf(System.currentTimeMillis()));
                    if (bArr != null) {
                        contentValues.put("msgextra", bArr);
                        pushTaskBean.setMsgExtra(bArr);
                    }
                    if (jSONArray.length() > 0 && !C0402e.m1330a().m1368a(jSONObject, pushTaskBean)) {
                        return true;
                    }
                    if (z) {
                        try {
                            a = C0482f.m1694a().m1716k().m1146a("message", new String[]{"taskid"}, new String[]{string4}, null, null);
                            if (a != null) {
                                try {
                                    C0247a.m838b("CoreAction|taskid = " + string4 + "; db cnt = " + Integer.valueOf(a.getCount()).toString());
                                    if (a.getCount() == 0) {
                                        if (jSONObject.has("condition")) {
                                            m1335b(jSONObject, pushTaskBean);
                                            pushTaskBean.setStatus(C0416a.f1080k);
                                            contentValues.put(Downloads.COLUMN_STATUS, Integer.valueOf(C0416a.f1080k));
                                        } else {
                                            pushTaskBean.setStatus(C0416a.f1081l);
                                            contentValues.put(Downloads.COLUMN_STATUS, Integer.valueOf(C0416a.f1081l));
                                        }
                                        C0482f.m1694a().m1716k().m1147a("message", contentValues);
                                        C0483g.ai.put(a2, pushTaskBean);
                                        C0247a.m838b("CoreAction| pushMessageMap size=" + C0483g.ai.size());
                                        if (jSONObject.has("condition")) {
                                            m1400t();
                                        } else {
                                            C0402e.m1330a().m1357a(string4, string3, C0483g.f1315a, C0483g.f1319e);
                                            C0247a.m838b("CoreAction|broadcastExecute taskid = " + string4 + " messageid = " + string3 + " pkg = " + C0483g.f1319e);
                                        }
                                    } else if (a == null) {
                                        return true;
                                    } else {
                                        a.close();
                                        return true;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    try {
                                        C0247a.m838b("CoreAction|" + e.toString());
                                        if (a != null) {
                                            a.close();
                                        }
                                        return true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (a != null) {
                                            a.close();
                                        }
                                        throw th;
                                    }
                                }
                            }
                            if (a != null) {
                                a.close();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            a = null;
                            C0247a.m838b("CoreAction|" + e.toString());
                            if (a != null) {
                                a.close();
                            }
                            return true;
                        } catch (Throwable th3) {
                            th = th3;
                            a = null;
                            if (a != null) {
                                a.close();
                            }
                            throw th;
                        }
                    }
                    if (jSONObject.has("condition")) {
                        m1335b(jSONObject, pushTaskBean);
                    }
                    pushTaskBean.setStatus(C0416a.f1081l);
                    C0483g.ai.put(a2, pushTaskBean);
                }
            }
        } catch (Exception e4) {
            C0247a.m838b("CoreAction|" + e4.toString());
        }
        return true;
    }

    public C0426b m1370b(String str, String str2) {
        C0426b c0426b = C0426b.success;
        PushTaskBean pushTaskBean = (PushTaskBean) C0483g.ai.get(str + ":" + str2);
        if (pushTaskBean == null) {
            return C0426b.stop;
        }
        int i = 0;
        C0426b c0426b2 = c0426b;
        for (BaseAction baseAction : pushTaskBean.getActionChains()) {
            c0426b = C0426b.stop;
            if (baseAction == null) {
                return c0426b;
            }
            C0426b c0426b3;
            for (IPushExtension prepareExecuteAction : C0511a.m1834a().m1839c()) {
                c0426b = prepareExecuteAction.prepareExecuteAction(pushTaskBean, baseAction);
                if (c0426b != C0426b.stop) {
                    c0426b3 = c0426b;
                    break;
                }
            }
            c0426b3 = c0426b;
            if (c0426b3 == C0426b.stop) {
                C0383a c0383a = (C0383a) f1057b.get(baseAction.getType());
                if (c0383a == null) {
                    return c0426b3;
                }
                c0426b3 = c0383a.m1259a(pushTaskBean, baseAction);
                if (c0426b3 == C0426b.stop) {
                    return c0426b3;
                }
            }
            i = c0426b3 == C0426b.wait ? i + 1 : i;
            c0426b2 = c0426b2 == C0426b.success ? c0426b3 : c0426b2;
        }
        if (!(i == 0 || C0483g.m1726a(str, Integer.valueOf(i), true))) {
            c0426b2 = C0426b.success;
        }
        return c0426b2;
    }

    public void m1371b() {
        m1381d();
    }

    public void m1372b(int i, String str) {
        C0378l.f1018e = i;
        C0367a.m1224a().m1237d();
    }

    public void m1373b(Intent intent) {
        if (intent != null && intent.hasExtra("isSlave") && intent.getBooleanExtra("isSlave", false)) {
            C0482f.m1694a().m1705a(true);
            if (intent.hasExtra("op_app")) {
                C0483g.f1291C = intent.getStringExtra("op_app");
            } else {
                C0483g.f1291C = Constants.STR_EMPTY;
            }
            if (C0483g.f1327m) {
                m1392l();
            }
        }
    }

    public void m1374b(PushTaskBean pushTaskBean, String str) {
        String str2 = pushTaskBean.getMessageId() + "|" + str;
        C0354c c0354c;
        if (C0483g.al.containsKey(str2)) {
            c0354c = (C0354c) C0483g.al.get(str2);
            if (c0354c.m1189c() < 2) {
                C0482f.m1694a().m1712g().m1795a("C-" + C0483g.f1333s, c0354c);
                c0354c.m1186a(c0354c.m1189c() + 1);
                m1332a(c0354c, pushTaskBean, str, str2);
            }
        } else {
            c0354c = new C0354c();
            long currentTimeMillis = System.currentTimeMillis();
            c0354c.m1185a();
            c0354c.f943c = "FDB" + pushTaskBean.getMessageId() + "|" + pushTaskBean.getTaskId() + "|" + str + "|" + "ok" + "|" + currentTimeMillis;
            c0354c.f944d = C0483g.f1333s;
            c0354c.f941a = (int) currentTimeMillis;
            C0482f.m1694a().m1712g().m1795a("C-" + C0483g.f1333s, c0354c);
            m1332a(c0354c, pushTaskBean, str, str2);
        }
        C0247a.m838b("cdnfeedback|" + pushTaskBean.getTaskId() + "|" + pushTaskBean.getMessageId() + "|" + str);
    }

    public void m1375b(String str) {
        if (C0483g.f1333s != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String str2 = "{\"action\":\"set_tag\",\"id\":\"" + currentTimeMillis + "\", \"cid\":\"" + C0483g.f1333s + "\", \"appid\":\"" + C0483g.f1315a + "\", \"tags\":\"" + URLEncoder.encode(str, "utf-8") + "\"}";
                C0441c a = C0441c.m1566a();
                if (a != null) {
                    a.m1570a(new C0435i(currentTimeMillis, str2, (byte) 2, currentTimeMillis));
                }
                C0355d c0355d = new C0355d();
                c0355d.m1192a();
                c0355d.f951d = "17258000";
                c0355d.f952e = str2;
                C0244d.m802c().m805a(SDKUrlConfig.getCmAddress(), 3, C0482f.m1694a().m1711f(), c0355d, false);
                C0247a.m838b("settag");
            } catch (Exception e) {
            }
        }
    }

    public boolean m1376b(String str, String str2, String str3) {
        Throwable th;
        BaseAction baseAction;
        C0383a c0383a;
        PushTaskBean pushTaskBean = (PushTaskBean) C0483g.ai.get(str + ":" + str2);
        if (pushTaskBean == null) {
            Cursor a;
            try {
                a = C0482f.m1694a().m1716k().m1146a("message", new String[]{"taskid", "messageid"}, new String[]{str, str2}, null, null);
                if (a != null) {
                    try {
                        if (a.getCount() > 0) {
                            while (a.moveToNext()) {
                                m1369a(new JSONObject(new String(C0259a.m882c(a.getBlob(a.getColumnIndexOrThrow("info"))))), a.getBlob(a.getColumnIndexOrThrow("msgextra")), false);
                                PushTaskBean pushTaskBean2 = (PushTaskBean) C0483g.ai.get(str + ":" + str2);
                                if (pushTaskBean2 == null) {
                                    if (a != null) {
                                        a.close();
                                    }
                                    return false;
                                }
                                pushTaskBean = pushTaskBean2;
                            }
                            if (a != null) {
                                a.close();
                            }
                        } else {
                            if (a != null) {
                                a.close();
                            }
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            C0247a.m838b("CoreAction|" + th.toString());
                            if (a != null) {
                                a.close();
                            }
                            C0402e.m1330a().m1353a(pushTaskBean, str3);
                            baseAction = pushTaskBean.getBaseAction(str3);
                            if (baseAction != null) {
                                return false;
                            }
                            if (baseAction.isSupportExt()) {
                                for (IPushExtension executeAction : C0511a.m1834a().m1839c()) {
                                    if (executeAction.executeAction(pushTaskBean, baseAction)) {
                                        C0247a.m838b("CoreAction|extension process " + baseAction.toString() + " ok");
                                        return true;
                                    }
                                }
                            }
                            c0383a = (C0383a) f1057b.get(baseAction.getType());
                            if (c0383a != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (a != null) {
                                a.close();
                            }
                            throw th;
                        }
                    }
                }
                if (a != null) {
                    a.close();
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                a = null;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        }
        C0402e.m1330a().m1353a(pushTaskBean, str3);
        try {
            baseAction = pushTaskBean.getBaseAction(str3);
            if (baseAction != null) {
                return false;
            }
            if (baseAction.isSupportExt()) {
                while (r2.hasNext()) {
                    if (executeAction.executeAction(pushTaskBean, baseAction)) {
                        C0247a.m838b("CoreAction|extension process " + baseAction.toString() + " ok");
                        return true;
                    }
                }
            }
            c0383a = (C0383a) f1057b.get(baseAction.getType());
            return (c0383a != null || pushTaskBean.isStop()) ? false : c0383a.m1261b(pushTaskBean, baseAction);
        } catch (Throwable th5) {
            C0247a.m838b("CoreAction|" + th5.toString());
            return false;
        }
    }

    public boolean m1377b(String str, String str2, String str3, String str4) {
        byte[] bytes;
        C0247a.m838b("startapp|broadcastPayload");
        Intent intent = new Intent();
        intent.addFlags(32);
        Bundle bundle = new Bundle();
        bundle.putInt(AuthActivity.ACTION_KEY, Tencent.REQUEST_LOGIN);
        bundle.putString("taskid", str);
        bundle.putString("messageid", str2);
        bundle.putString(SocialConstants.PARAM_APP_ID, str3);
        bundle.putString("payloadid", str2 + ":" + str);
        bundle.putString("packagename", C0483g.f1319e);
        intent.setAction("com.igexin.sdk.action." + str3);
        if (str4 != null) {
            bytes = str4.getBytes();
        } else {
            PushTaskBean pushTaskBean = (PushTaskBean) C0483g.ai.get(m1345a(str, str2));
            bytes = pushTaskBean != null ? pushTaskBean.getMsgExtra() : null;
        }
        if (bytes != null) {
            C0247a.m838b("startapp|broadcast|payload is " + new String(bytes));
        } else {
            C0247a.m838b("startapp|broadcast|payload is empty!");
        }
        bundle.putByteArray("payload", bytes);
        intent.putExtras(bundle);
        if (bytes != null) {
            try {
                C0247a.m838b("startapp|broadcast|" + str3 + "|" + new String(bytes, "utf-8"));
            } catch (Exception e) {
                C0247a.m838b("startapp|broadcast|error|" + e.toString());
                return false;
            }
        }
        C0483g.f1321g.sendBroadcast(intent);
        return true;
    }

    public C0359i m1378c() {
        C0359i c0359i = new C0359i();
        c0359i.f969a = C0483g.f1332r;
        c0359i.f970b = (byte) 0;
        c0359i.f971c = MotionEventCompat.ACTION_POINTER_INDEX_MASK;
        c0359i.f972d = C0483g.f1315a;
        try {
            if (C0512a.m1841a()) {
                List arrayList = new ArrayList();
                WifiManager wifiManager = (WifiManager) C0483g.f1321g.getSystemService("wifi");
                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    if (connectionInfo != null) {
                        String ssid = connectionInfo.getSSID();
                        String bssid = connectionInfo.getBSSID();
                        if (ssid != null) {
                            C0360j c0360j = new C0360j();
                            c0360j.f974a = (byte) 1;
                            c0360j.f975b = ssid;
                            arrayList.add(c0360j);
                        }
                        if (bssid != null) {
                            C0360j c0360j2 = new C0360j();
                            c0360j2.f974a = (byte) 4;
                            c0360j2.f975b = bssid;
                            arrayList.add(c0360j2);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    c0359i.f973e = arrayList;
                }
            }
        } catch (Exception e) {
        }
        return c0359i;
    }

    public void m1379c(Intent intent) {
        if (intent != null && intent.getAction() != null) {
            try {
                String action = intent.getAction();
                if (PushConsts.ACTION_BROADCAST_NETWORK_CHANGE.equals(action)) {
                    if (C0244d.m802c() != null) {
                        m1328C();
                    }
                } else if ("com.igexin.sdk.action.snlrefresh".equals(action) || C0483g.f1311W.equals(action) || "com.igexin.sdk.action.snlretire".equals(action)) {
                    C0482f.m1694a().m1713h().m1773a(intent);
                } else if ("com.igexin.sdk.action.execute".equals(action)) {
                    m1337f(intent);
                } else if ("com.igexin.sdk.action.doaction".equals(action)) {
                    m1336e(intent);
                } else if ("android.intent.action.TIME_SET".equals(action)) {
                    if (C0378l.f1015b != 0) {
                        C0338c.m1132c().m1136d();
                    }
                } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                    C0483g.f1331q = 1;
                    if (m1401u()) {
                        m1400t();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C0483g.f1331q = 0;
                } else if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    m1339g(intent.getDataString());
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    m1338f(intent.getDataString());
                } else if ("com.igexin.sdk.action.core.clearmsg".equals(action)) {
                    C0482f.m1694a().m1716k().m1149a("message", null);
                } else if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action) && intent.getIntExtra("wifi_state", 0) == 3) {
                    C0482f.m1694a().m1709d();
                }
            } catch (Exception e) {
                C0247a.m838b("CoreAction" + e.toString());
            }
        }
    }

    public void m1380c(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - C0483g.f1308T > 5000) {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date(currentTimeMillis));
            if (!format.equals(C0483g.f1307S)) {
                C0444f.m1577a().m1605d(format);
                C0444f.m1577a().m1590a(0);
            }
            C0247a.m838b("-> CoreRuntimeInfo.opAliasTimes:" + C0483g.f1309U);
            if (C0483g.f1309U < 100) {
                C0247a.m838b("requestService bindAlias HttpTask ...");
                C0483g.f1308T = currentTimeMillis;
                C0444f.m1577a().m1590a(C0483g.f1309U + 1);
                C0244d.m802c().m795a(new C0506c(new C0468b(SDKUrlConfig.getAmpServiceUrl(), str)), false, true);
            }
        }
    }

    public int m1381d() {
        Cursor cursor;
        Throwable th;
        if (!C0483g.f1324j || !C0483g.f1325k || m1363a(System.currentTimeMillis()) || !C0512a.m1844b()) {
            return -1;
        }
        boolean z;
        if (C0483g.f1326l) {
            C0483g.f1326l = !C0483g.f1326l;
            C0483g.f1300L = (((long) Math.abs(new Random().nextInt() % 24)) * 3600000) + System.currentTimeMillis();
        }
        C0461w.m1629b();
        if (C0483g.f1332r == 0) {
            C0247a.m838b("registerReqBefore|" + C0483g.f1289A);
            z = C0482f.m1694a().m1712g().m1796a(new StringBuilder().append("R-").append(C0483g.f1289A).toString(), new C0356f(C0483g.f1335u, C0483g.f1336v, C0483g.f1289A, C0483g.f1315a), true) >= 0;
            C0247a.m838b("registerReq|" + z + "|" + C0483g.f1289A);
        } else {
            C0351e c = m1378c();
            C0247a.m838b("loginReqBefore|" + c.f969a);
            z = C0482f.m1694a().m1712g().m1796a(new StringBuilder().append("S-").append(String.valueOf(C0483g.f1332r)).toString(), c, true) >= 0;
            C0247a.m838b("loginReq|" + z + "|" + C0483g.f1333s);
        }
        if (z) {
            return 1;
        }
        Cursor a;
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            a = C0482f.m1694a().m1716k().m1146a("bi", new String[]{SocialConstants.PARAM_TYPE}, new String[]{Constants.VIA_TO_TYPE_QQ_GROUP}, null, null);
            if (a != null) {
                try {
                    if (a.getCount() == 0) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("loginerror_nonetwork_count", Integer.valueOf(1));
                        contentValues.put("create_time", format);
                        contentValues.put(SocialConstants.PARAM_TYPE, Constants.VIA_TO_TYPE_QQ_GROUP);
                        C0482f.m1694a().m1716k().m1147a("bi", contentValues);
                    } else {
                        int i = 0;
                        while (a.moveToNext()) {
                            String string = a.getString(a.getColumnIndexOrThrow("create_time"));
                            String string2 = a.getString(a.getColumnIndexOrThrow(ResourceIDs.ID));
                            ContentValues contentValues2;
                            if (format.equals(string)) {
                                i = a.getInt(a.getColumnIndexOrThrow("loginerror_nonetwork_count"));
                                contentValues2 = new ContentValues();
                                contentValues2.put("loginerror_nonetwork_count", Integer.valueOf(i + 1));
                                C0482f.m1694a().m1716k().m1148a("bi", contentValues2, new String[]{ResourceIDs.ID}, new String[]{string2});
                            } else {
                                contentValues2 = new ContentValues();
                                contentValues2.put(SocialConstants.PARAM_TYPE, Constants.VIA_SSO_LOGIN);
                                C0482f.m1694a().m1716k().m1148a("bi", contentValues2, new String[]{ResourceIDs.ID}, new String[]{string2});
                                contentValues2 = new ContentValues();
                                contentValues2.put("loginerror_nonetwork_count", Integer.valueOf(i + 1));
                                contentValues2.put("create_time", format);
                                contentValues2.put(SocialConstants.PARAM_TYPE, Constants.VIA_TO_TYPE_QQ_GROUP);
                                C0482f.m1694a().m1716k().m1147a("bi", contentValues2);
                            }
                        }
                    }
                } catch (Exception e) {
                    cursor = a;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (a != null) {
                a.close();
            }
        } catch (Exception e2) {
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            if (a != null) {
                a.close();
            }
            throw th;
        }
        return 0;
    }

    public void m1382d(Intent intent) {
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra(ResourceIDs.ID, -1);
                boolean booleanExtra = intent.getBooleanExtra(C0203j.f519c, false);
                if (intExtra != -1) {
                    C0483g.ar++;
                    if (booleanExtra) {
                        if (intent.getBooleanExtra("isReload", false)) {
                            Process.killProcess(Process.myPid());
                            return;
                        }
                        C0483g.aq++;
                        Map b = C0483g.as != null ? C0483g.as.m1504b() : null;
                        if (b != null) {
                            Object obj;
                            Map map;
                            if (C0378l.f1033t != null) {
                                Map b2 = C0378l.f1033t.m1504b();
                                if (b2 == null) {
                                    return;
                                }
                                if (b2.containsKey(Integer.valueOf(intExtra))) {
                                    obj = 1;
                                    C0431e c0431e = (C0431e) b2.get(Integer.valueOf(intExtra));
                                    if (c0431e != null) {
                                        C0513b.m1850a(c0431e.m1489c());
                                    }
                                    b2.remove(Integer.valueOf(intExtra));
                                    map = b2;
                                } else {
                                    obj = null;
                                    map = b2;
                                }
                            } else {
                                Map hashMap = new HashMap();
                                C0432f c0432f = new C0432f();
                                c0432f.m1502a(Constants.VIA_RESULT_SUCCESS);
                                c0432f.m1503a(hashMap);
                                C0378l.f1033t = c0432f;
                                map = hashMap;
                                obj = null;
                            }
                            C0431e c0431e2 = (C0431e) b.get(Integer.valueOf(intExtra));
                            if (c0431e2 != null) {
                                String str = C0483g.ad + "/" + c0431e2.m1489c();
                                if (new File(str).exists()) {
                                    map.put(Integer.valueOf(intExtra), c0431e2);
                                    if (C0483g.aq == C0483g.ap) {
                                        C0378l.f1033t.m1502a(C0483g.as.m1501a());
                                    }
                                    if (obj == null && C0511a.m1834a().m1837a(C0483g.f1321g, str, c0431e2.m1491d(), c0431e2.m1500j(), c0431e2.m1489c())) {
                                        C0247a.m838b("CoreAction load " + c0431e2.m1491d() + " success");
                                        c0431e2.m1487b(System.currentTimeMillis());
                                        if (c0431e2.m1497g()) {
                                            C0513b.m1850a(c0431e2.m1489c());
                                            map.remove(Integer.valueOf(intExtra));
                                        }
                                    }
                                    C0367a.m1224a().m1240g();
                                }
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    if (C0483g.ar == C0483g.ap && C0483g.at) {
                        C0247a.m838b("CoreActiondown load ext success, restart service ############");
                        Process.killProcess(Process.myPid());
                    }
                }
            } catch (Throwable th) {
                C0247a.m838b("CoreAction|" + th.toString());
            }
        }
    }

    public void m1383d(String str) {
        C0244d.m802c().m795a(new C0506c(new C0476j(SDKUrlConfig.getBiUploadServiceUrl(), ((m1346a(true, 4) + "2.7.0.0|sdkconfig-error|") + str).getBytes(), 0, true)), false, true);
    }

    public String m1384e(String str) {
        return C0483g.m1728c() == null ? null : (String) C0483g.m1728c().get(str);
    }

    public void m1385e() {
        C0247a.m836a("CoreAction|do disconnect|" + SDKUrlConfig.getCmAddress().replaceFirst("socket", "disConnect"));
        C0244d.m802c().m804a(SDKUrlConfig.getCmAddress().replaceFirst("socket", "disConnect"), 0, null);
    }

    public int m1386f() {
        C0247a.m836a("CoreAction send heart beat data ........");
        return C0482f.m1694a().m1712g().m1796a("H-" + C0483g.f1333s, new C0358h(), true);
    }

    public void m1387g() {
        for (C0435i c0435i : C0441c.m1566a().m1572b()) {
            if (c0435i.m1527d() + 10000 <= System.currentTimeMillis()) {
                long currentTimeMillis = System.currentTimeMillis();
                C0351e c0355d = new C0355d();
                c0355d.m1192a();
                c0355d.f948a = (int) currentTimeMillis;
                c0355d.f951d = "17258000";
                c0355d.f952e = c0435i.m1525b();
                c0355d.f954g = C0483g.f1333s;
                C0482f.m1694a().m1712g().m1795a("C-" + C0483g.f1333s, c0355d);
                C0247a.m838b("freshral|" + c0435i.m1525b());
                C0441c.m1566a().m1571a(c0435i.m1523a());
                c0435i.m1524a(c0435i.m1527d() + 10000);
                C0441c.m1566a().m1570a(c0435i);
                return;
            }
        }
    }

    public void m1388h() {
        long currentTimeMillis = System.currentTimeMillis();
        String str = "{\"action\":\"request_deviceid\",\"id\":\"" + currentTimeMillis + "\"}";
        C0351e c0355d = new C0355d();
        c0355d.m1192a();
        c0355d.f948a = (int) currentTimeMillis;
        c0355d.f951d = "17258000";
        c0355d.f952e = str;
        c0355d.f954g = C0483g.f1333s;
        C0482f.m1694a().m1712g().m1795a("C-" + C0483g.f1333s, c0355d);
        C0247a.m838b("deviceidReq");
    }

    public void m1389i() {
        long j;
        String str = null;
        long j2 = -1;
        try {
            C0427a c0427a = new C0427a();
            j2 = c0427a.f1143l;
            str = C0427a.m1470a(c0427a);
            j = j2;
        } catch (JSONException e) {
            j = j2;
        }
        if (str != null) {
            C0247a.m838b("addphoneinfo");
            C0441c a = C0441c.m1566a();
            if (a != null) {
                a.m1570a(new C0435i(j, str, (byte) 5, j));
            }
            C0351e c0355d = new C0355d();
            c0355d.m1192a();
            c0355d.f948a = (int) j;
            c0355d.f951d = "17258000";
            c0355d.f952e = str;
            c0355d.f954g = C0483g.f1333s;
            C0482f.m1694a().m1712g().m1795a("C-" + C0483g.f1333s, c0355d);
        }
    }

    public void m1390j() {
        long currentTimeMillis = System.currentTimeMillis();
        String str = "{\"action\":\"request_ca_list\",\"id\":\"" + currentTimeMillis + "\", \"appid\":\"" + C0483g.f1315a + "\", \"cid\":\"" + C0483g.f1333s + "\"}";
        C0351e c0355d = new C0355d();
        c0355d.m1192a();
        c0355d.f948a = (int) currentTimeMillis;
        c0355d.f951d = "17258000";
        c0355d.f952e = str;
        c0355d.f954g = C0483g.f1333s;
        C0482f.m1694a().m1712g().m1795a("C-" + C0483g.f1333s, c0355d);
    }

    public long m1391k() {
        return ((long) (new Random().nextInt(6) + 2)) * 60000;
    }

    public void m1392l() {
        Intent intent = new Intent();
        intent.addFlags(32);
        intent.setAction("com.igexin.sdk.action." + C0483g.f1315a);
        Bundle bundle = new Bundle();
        bundle.putInt(AuthActivity.ACTION_KEY, PushConsts.GET_CLIENTID);
        bundle.putString("clientid", C0483g.f1333s);
        intent.putExtras(bundle);
        C0247a.m838b("broadcastClientid|" + C0483g.f1333s);
        C0482f.m1694a().m1699a(intent);
        Log.d("PushService", "clientid is " + C0483g.f1333s);
    }

    public void m1393m() {
        Intent intent = new Intent();
        intent.addFlags(32);
        intent.setAction("com.igexin.sdk.action." + C0483g.f1315a);
        Bundle bundle = new Bundle();
        bundle.putInt(AuthActivity.ACTION_KEY, PushConsts.GET_SDKONLINESTATE);
        bundle.putBoolean("onlineState", C0483g.f1327m);
        intent.putExtras(bundle);
        C0482f.m1694a().m1699a(intent);
    }

    public String m1394n() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        FileInputStream fileInputStream2;
        Throwable th;
        if (new File(C0483g.aa).exists()) {
            byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            try {
                fileInputStream = new FileInputStream(C0483g.aa);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (Exception e) {
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            fileInputStream2 = fileInputStream;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    String str = new String(byteArrayOutputStream.toByteArray());
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e2) {
                        }
                    }
                    if (byteArrayOutputStream == null) {
                        return str;
                    }
                    try {
                        byteArrayOutputStream.close();
                        return str;
                    } catch (Exception e3) {
                        return str;
                    }
                } catch (Exception e4) {
                    byteArrayOutputStream2 = null;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Exception e5) {
                        }
                    }
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                            return null;
                        } catch (Exception e6) {
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e7) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e8) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e9) {
                byteArrayOutputStream2 = null;
                fileInputStream2 = null;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                    return null;
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                fileInputStream = null;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        }
        return null;
    }

    public void m1395o() {
        List arrayList = new ArrayList();
        m1333a(arrayList);
        int size = arrayList.size();
        if (size > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AuthActivity.ACTION_KEY, "reportapplist");
                jSONObject.put("session_last", C0483g.f1332r);
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(SocialConstants.PARAM_APP_ID, ((C0438l) arrayList.get(i)).m1549d());
                    jSONObject2.put(C0167c.f364e, ((C0438l) arrayList.get(i)).m1545b());
                    jSONObject2.put("version", ((C0438l) arrayList.get(i)).m1547c());
                    jSONObject2.put("versionName", ((C0438l) arrayList.get(i)).m1543a());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("applist", jSONArray);
            } catch (JSONException e) {
            }
            byte[] b = C0259a.m881b(jSONObject.toString().getBytes());
            if (b != null) {
                C0244d.m802c().m795a(new C0506c(new C0467a(SDKUrlConfig.getBiUploadServiceUrl(), b)), false, true);
                m1340h(m1396p());
                C0247a.m838b("reportapplist");
            }
        }
    }

    public String m1396p() {
        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        m1333a(arrayList2);
        int size = arrayList2.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.add(((C0438l) arrayList2.get(i)).m1549d());
            }
        }
        return arrayList.toString();
    }

    public boolean m1397q() {
        String packageName;
        boolean z;
        boolean z2;
        boolean z3;
        if (C0483g.f1321g == null) {
            packageName = C0483g.f1321g.getApplicationContext().getPackageName();
        } else {
            packageName = C0483g.f1321g.getApplicationContext().getPackageName();
        }
        try {
            int i;
            ServiceInfo[] serviceInfoArr = C0483g.f1321g.getPackageManager().getPackageInfo(packageName, 4).services;
            if (serviceInfoArr != null) {
                int length = serviceInfoArr.length;
                i = 0;
                z = false;
                while (i < length) {
                    try {
                        if (serviceInfoArr[i].name.indexOf("DownloadService") != -1) {
                            z = true;
                        }
                        i++;
                    } catch (NameNotFoundException e) {
                        z2 = false;
                        z3 = z;
                        z = false;
                    }
                }
                z3 = z;
            } else {
                z3 = false;
            }
            try {
                int length2;
                ProviderInfo[] providerInfoArr = C0483g.f1321g.getPackageManager().getPackageInfo(packageName, 8).providers;
                if (providerInfoArr != null) {
                    length2 = providerInfoArr.length;
                    i = 0;
                    z = false;
                    while (i < length2) {
                        try {
                            if (providerInfoArr[i].name.indexOf("DownloadProvider") != -1) {
                                z = true;
                            }
                            i++;
                        } catch (NameNotFoundException e2) {
                            z2 = z;
                            z = false;
                        }
                    }
                    z2 = z;
                } else {
                    z2 = false;
                }
                try {
                    ActivityInfo[] activityInfoArr = C0483g.f1321g.getPackageManager().getPackageInfo(packageName, 2).receivers;
                    if (activityInfoArr != null) {
                        length2 = activityInfoArr.length;
                        int i2 = 0;
                        z = false;
                        while (i2 < length2) {
                            try {
                                if (activityInfoArr[i2].name.indexOf("DownloadReceiver") != -1) {
                                    z = true;
                                }
                                i2++;
                            } catch (NameNotFoundException e3) {
                            }
                        }
                    } else {
                        z = false;
                    }
                } catch (NameNotFoundException e4) {
                    z = false;
                }
            } catch (NameNotFoundException e5) {
                z = false;
                z2 = false;
            }
        } catch (NameNotFoundException e6) {
            z = false;
            z2 = false;
            z3 = false;
        }
        return z3 && z2 && z;
    }

    public void m1398r() {
        C0482f.m1694a().m1716k().m1149a("message", "createtime <= " + (System.currentTimeMillis() - 604800000));
    }

    public void m1399s() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        String str = "/sdcard/libs/";
        File file = new File(str);
        String str2 = C0483g.f1319e;
        if (str2 == null) {
            str2 = "unknowPacageName";
        }
        if (file.exists()) {
            String[] list = file.list();
            int length = list.length;
            int i = 0;
            while (i < length) {
                int length2 = list[i].length();
                if (list[i].startsWith(str2) && list[i].endsWith(".log") && length2 > str2.length() + 14 && str2.equals(list[i].substring(0, length2 - 15))) {
                    try {
                        if (Math.abs((simpleDateFormat.parse(format).getTime() - simpleDateFormat.parse(list[i].substring(str2.length() + 1, length2 - 4)).getTime()) / Consts.TIME_24HOUR) > 6) {
                            File file2 = new File(str + list[i]);
                            if (file2.exists()) {
                                file2.delete();
                            }
                        }
                    } catch (Exception e) {
                    }
                }
                i++;
            }
        }
    }

    public void m1400t() {
        if (m1329D() > 0) {
            List arrayList = new ArrayList();
            for (Entry key : C0483g.ai.entrySet()) {
                String str = (String) key.getKey();
                PushTaskBean pushTaskBean = (PushTaskBean) C0483g.ai.get(str);
                Object obj = Constants.STR_EMPTY;
                if (pushTaskBean != null && pushTaskBean.getStatus() == C0416a.f1080k) {
                    String taskId = pushTaskBean.getTaskId();
                    Map conditionMap = pushTaskBean.getConditionMap();
                    if (conditionMap != null) {
                        if (!conditionMap.containsKey("endTime") || Long.valueOf((String) conditionMap.get("endTime")).longValue() >= System.currentTimeMillis()) {
                            int intValue;
                            String str2;
                            if (conditionMap.containsKey("wifi")) {
                                intValue = Integer.valueOf((String) conditionMap.get("wifi")).intValue();
                                m1403w();
                                if (intValue != C0483g.f1330p) {
                                }
                            }
                            if (conditionMap.containsKey("screenOn")) {
                                intValue = Integer.valueOf((String) conditionMap.get("screenOn")).intValue();
                                m1402v();
                                if (intValue != C0483g.f1331q) {
                                }
                            }
                            if (conditionMap.containsKey("ssid")) {
                                str2 = (String) conditionMap.get("ssid");
                                m1404x();
                                if (C0483g.ao.containsValue(str2)) {
                                    obj = str2;
                                }
                            }
                            if (conditionMap.containsKey("bssid")) {
                                str2 = (String) conditionMap.get("bssid");
                                if (C0483g.ao.containsKey(str2)) {
                                    if (!((String) C0483g.ao.get(str2)).equals(obj)) {
                                    }
                                }
                            }
                            if (!conditionMap.containsKey("startTime") || Long.valueOf((String) conditionMap.get("startTime")).longValue() <= System.currentTimeMillis()) {
                                C0402e.m1330a().m1357a(taskId, pushTaskBean.getMessageId(), C0483g.f1315a, C0483g.f1319e);
                                m1331a(C0416a.f1081l, taskId, str);
                                arrayList.add(str);
                            }
                        } else {
                            m1331a(C0416a.f1082m, taskId, str);
                            arrayList.add(str);
                        }
                    } else {
                        return;
                    }
                }
            }
            m1334b(arrayList);
        }
    }

    public boolean m1401u() {
        long currentTimeMillis = System.currentTimeMillis();
        if (C0483g.f1297I <= 0) {
            C0483g.f1297I = currentTimeMillis - 60000;
            return true;
        } else if (currentTimeMillis - C0483g.f1297I <= 60000) {
            return false;
        } else {
            C0483g.f1297I = currentTimeMillis;
            return true;
        }
    }

    public void m1402v() {
        if (((PowerManager) C0483g.f1321g.getSystemService("power")).isScreenOn()) {
            C0483g.f1331q = 1;
        } else {
            C0483g.f1331q = 0;
        }
    }

    public void m1403w() {
        State state = ((ConnectivityManager) C0483g.f1321g.getSystemService("connectivity")).getNetworkInfo(1).getState();
        if (state == State.CONNECTED || state == State.CONNECTING) {
            C0483g.f1330p = 1;
        } else {
            C0483g.f1330p = 0;
        }
    }

    public void m1404x() {
        List scanResults = ((WifiManager) C0483g.f1321g.getSystemService("wifi")).getScanResults();
        C0483g.ao.clear();
        if (scanResults != null) {
            for (int i = 0; i < scanResults.size(); i++) {
                C0483g.ao.put(((ScanResult) scanResults.get(i)).BSSID, ((ScanResult) scanResults.get(i)).SSID);
            }
        }
    }

    public void m1405y() {
        if (C0378l.f1030q) {
            Map d = C0444f.m1577a().m1603d();
            if (d != null && d.size() > 0) {
                for (String str : d.keySet()) {
                    String str2 = (String) d.get(str);
                    try {
                        Intent intent = new Intent();
                        intent.setClassName(str, str2);
                        C0483g.f1321g.startService(intent);
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    public void m1406z() {
        int i = C0483g.an - 100;
        if (i < 0) {
            C0483g.an = 0;
        } else {
            C0483g.an = i;
        }
        List<String> arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        for (Entry entry : C0483g.am.entrySet()) {
            if (currentTimeMillis - ((Long) entry.getValue()).longValue() > 3600000) {
                arrayList.add((String) entry.getKey());
            }
        }
        for (String remove : arrayList) {
            C0483g.am.remove(remove);
        }
    }
}
