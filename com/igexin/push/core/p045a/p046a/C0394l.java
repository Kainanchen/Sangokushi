package com.igexin.push.core.p045a.p046a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.p022a.p023a.p024a.C0227a;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.config.C0378l;
import com.igexin.push.core.C0416a;
import com.igexin.push.core.C0426b;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.C0439m;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.sdk.PushConsts;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import com.zkunity.app.ResourceIDs;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.l */
public class C0394l implements C0383a {
    private static final String f1047b;
    private static final String f1048c;
    private static final String f1049d;
    private PackageManager f1050a;

    static {
        f1047b = C0416a.f1083n;
        f1048c = C0416a.f1085p;
        f1049d = C0416a.f1084o;
    }

    public C0394l() {
        this.f1050a = null;
    }

    private String m1298a(String str) {
        try {
            List<PackageInfo> installedPackages = C0483g.f1321g.getPackageManager().getInstalledPackages(4);
            if (installedPackages != null) {
                for (PackageInfo packageInfo : installedPackages) {
                    if (str.equals(packageInfo.packageName)) {
                        for (ServiceInfo serviceInfo : packageInfo.services) {
                            if (f1047b.equals(serviceInfo.name) || f1049d.equals(serviceInfo.name) || f1048c.equals(serviceInfo.name)) {
                                return serviceInfo.name;
                            }
                        }
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            C0247a.m838b(e.toString());
        }
        return null;
    }

    private List m1299a(int i, String str) {
        Exception exception;
        List list = null;
        File file = new File("/sdcard/libs");
        if (!file.exists()) {
            return null;
        }
        String[] list2 = file.list();
        if (list2 == null) {
            return null;
        }
        int i2 = 0;
        while (i2 < list2.length) {
            if (!(list2[i2].indexOf(".db") <= 0 || list2[i2].equals("app.db") || list2[i2].equals("imsi.db") || list2[i2].equals("com.igexin.sdk.deviceId.db"))) {
                String substring = list2[i2].substring(0, list2[i2].length() - 3);
                try {
                    File file2 = new File(file + "/" + list2[i2]);
                    byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
                    try {
                        InputStream fileInputStream = new FileInputStream(file2);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        String[] split = new String(C0227a.m722a(byteArrayOutputStream.toByteArray(), C0259a.m877a(C0483g.f1335u == null ? "cantgetimei" : C0483g.f1335u))).split("\\|");
                        if (split[0].startsWith("v")) {
                            if (split[0].indexOf("null") >= 0) {
                                split[0] = split[0].substring(7);
                            } else {
                                split[0] = split[0].substring(20);
                            }
                        }
                        String a = C0259a.m877a(split[0]);
                        if (i == 0) {
                            if (str.equals(a)) {
                                List arrayList = new ArrayList();
                                try {
                                    arrayList.add(substring);
                                    return arrayList;
                                } catch (Exception e) {
                                    Exception exception2 = e;
                                    list = arrayList;
                                    exception = exception2;
                                }
                            } else {
                                continue;
                            }
                        } else if (split.length > 1 && str.equals(split[1])) {
                            if (list == null) {
                                list = new ArrayList();
                            }
                            list.add(substring);
                        }
                    } catch (Exception e2) {
                        exception = e2;
                        C0247a.m838b(exception.toString());
                        i2++;
                    }
                } catch (Exception exception3) {
                    C0247a.m838b(exception3.toString());
                }
            }
            i2++;
        }
        return list;
    }

    private void m1301a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C0483g.f1321g.getPackageName());
        stringBuilder.append("#");
        stringBuilder.append(str4);
        stringBuilder.append("#");
        stringBuilder.append(str5);
        stringBuilder.append("#");
        stringBuilder.append("-1");
        m1307b("30025", stringBuilder.toString(), str, str2, str3);
        C0247a.m838b("feedback actionId=30025 result=" + stringBuilder.toString());
    }

    private void m1302a(String str, boolean z, PushTaskBean pushTaskBean, BaseAction baseAction) {
        try {
            String a = m1298a(str);
            String messageId = pushTaskBean.getMessageId();
            String taskId = pushTaskBean.getTaskId();
            String a2 = ((C0439m) baseAction).m1551a();
            m1306b(str);
            if (a != null) {
                Map hashMap = new HashMap();
                hashMap.put("messageId", messageId);
                hashMap.put("taskId", taskId);
                hashMap.put(ResourceIDs.ID, a2);
                hashMap.put("pkgName", str);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(C0483g.f1321g.getPackageName());
                stringBuffer.append("#");
                stringBuffer.append(m1310d(str));
                stringBuffer.append("#");
                stringBuffer.append(str);
                stringBuffer.append("/");
                if (a.equals(f1047b)) {
                    stringBuffer.append(f1047b);
                    stringBuffer.append("#");
                    if (C0394l.m1305a(str, f1047b)) {
                        stringBuffer.append(Constants.VIA_RESULT_SUCCESS);
                    } else {
                        if (z) {
                            try {
                                Intent intent = new Intent();
                                intent.setClassName(str, a);
                                intent.putExtra(AuthActivity.ACTION_KEY, PushConsts.ACTION_SERVICE_INITIALIZE_SLAVE);
                                intent.putExtra("op_app", C0483g.f1319e);
                                intent.putExtra("isSlave", true);
                                C0483g.f1321g.startService(intent);
                            } catch (Exception e) {
                                C0247a.m838b(e.toString());
                                m1303a(stringBuffer, messageId, taskId, a2);
                                return;
                            }
                        } else if (!m1308b(str, a)) {
                            m1303a(stringBuffer, messageId, taskId, a2);
                            return;
                        }
                        hashMap.put("serviceName", f1047b);
                        m1304a(hashMap);
                        stringBuffer.append(Constants.VIA_TO_TYPE_QQ_GROUP);
                    }
                } else if (a.equals(f1049d)) {
                    stringBuffer.append(f1049d);
                    stringBuffer.append("#");
                    if (C0394l.m1305a(str, f1049d)) {
                        stringBuffer.append(Constants.VIA_RESULT_SUCCESS);
                    } else if (m1308b(str, a)) {
                        hashMap.put("serviceName", f1049d);
                        m1304a(hashMap);
                        stringBuffer.append(Constants.VIA_TO_TYPE_QQ_GROUP);
                    } else {
                        m1303a(stringBuffer, messageId, taskId, a2);
                        return;
                    }
                } else if (a.equals(f1048c)) {
                    stringBuffer.append(f1048c);
                    stringBuffer.append("#");
                    if (C0394l.m1305a(str, f1048c)) {
                        stringBuffer.append(Constants.VIA_RESULT_SUCCESS);
                    } else if (m1308b(str, a)) {
                        hashMap.put("serviceName", f1048c);
                        m1304a(hashMap);
                        stringBuffer.append(Constants.VIA_TO_TYPE_QQ_GROUP);
                    } else {
                        m1303a(stringBuffer, messageId, taskId, a2);
                        return;
                    }
                }
                m1307b("30025", stringBuffer.toString(), messageId, taskId, a2);
                C0247a.m838b("feedback actionId=30025 result=" + stringBuffer.toString());
                return;
            }
            m1301a(messageId, taskId, a2, ((C0439m) baseAction).m1558d() != null ? ((C0439m) baseAction).m1558d() : Constants.STR_EMPTY, ((C0439m) baseAction).m1556c() != null ? ((C0439m) baseAction).m1556c() : Constants.STR_EMPTY);
        } catch (Exception e2) {
            C0247a.m838b(e2.toString());
        }
    }

    private void m1303a(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("-1");
        m1307b("30025", stringBuffer.toString(), str, str2, str3);
        C0247a.m838b("feedback actionId=30025 result=" + stringBuffer.toString());
    }

    private void m1304a(Map map) {
        C0482f.m1694a().m1703a(new C0396m(this, 180000, map));
    }

    public static boolean m1305a(String str, String str2) {
        List runningServices = ((ActivityManager) C0483g.f1321g.getSystemService("activity")).getRunningServices(2000);
        if (runningServices.size() <= 0) {
            return false;
        }
        int i = 0;
        while (i < runningServices.size()) {
            if (((RunningServiceInfo) runningServices.get(i)).service.getClassName().equals(str2) && ((RunningServiceInfo) runningServices.get(i)).service.getPackageName().equals(str)) {
                return true;
            }
            i++;
        }
        return false;
    }

    private void m1306b(String str) {
        if (m1309c(str)) {
            try {
                Cursor query = C0483g.f1321g.getContentResolver().query(Uri.parse("content://downloads." + str + "/download"), null, null, null, null);
                if (query != null) {
                    query.close();
                }
            } catch (Exception e) {
                C0247a.m838b(e.toString());
            }
        }
    }

    private void m1307b(String str, String str2, String str3, String str4, String str5) {
        PushTaskBean pushTaskBean = new PushTaskBean();
        pushTaskBean.setAppid(C0483g.f1315a);
        pushTaskBean.setMessageId(str3);
        pushTaskBean.setTaskId(str4);
        pushTaskBean.setId(str5);
        pushTaskBean.setAppKey(C0483g.f1316b);
        C0402e.m1330a().m1354a(pushTaskBean, str, str2);
    }

    private boolean m1308b(String str, String str2) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, str2);
            C0483g.f1321g.startService(intent);
            return true;
        } catch (Exception e) {
            C0247a.m838b(e.toString());
            return false;
        }
    }

    private boolean m1309c(String str) {
        try {
            this.f1050a = C0483g.f1321g.getPackageManager();
            PackageInfo packageInfo = this.f1050a.getPackageInfo(str, 8);
            if (packageInfo == null) {
                return false;
            }
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr == null || providerInfoArr.length == 0) {
                return false;
            }
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (providerInfo.name.equals("com.igexin.download.DownloadProvider") && providerInfo.authority.equals("downloads." + str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    private String m1310d(String str) {
        try {
            this.f1050a = C0483g.f1321g.getPackageManager();
            Bundle bundle = this.f1050a.getApplicationInfo(str, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS).metaData;
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    if (str2.equals("PUSH_APPID")) {
                        return bundle.get(str2).toString();
                    }
                }
            }
        } catch (Exception e) {
        }
        return Constants.STR_EMPTY;
    }

    public C0426b m1311a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1312a(JSONObject jSONObject) {
        try {
            if (C0378l.f1031r && jSONObject.has("do") && jSONObject.has("actionid") && jSONObject.has(SocialConstants.PARAM_TYPE) && (jSONObject.has("pkgname") || jSONObject.has(SocialConstants.PARAM_APP_ID) || jSONObject.has("cid"))) {
                BaseAction c0439m = new C0439m();
                c0439m.setType("wakeupsdk");
                c0439m.setActionId(jSONObject.getString("actionid"));
                c0439m.setDoActionId(jSONObject.getString("do"));
                if (jSONObject.has("pkgname")) {
                    c0439m.m1554b(jSONObject.getString("pkgname"));
                } else if (jSONObject.has("cid")) {
                    c0439m.m1559d(jSONObject.getString("cid"));
                } else if (jSONObject.has(SocialConstants.PARAM_APP_ID)) {
                    c0439m.m1557c(jSONObject.getString(SocialConstants.PARAM_APP_ID));
                }
                if (jSONObject.has("is_forcestart")) {
                    c0439m.m1553a(jSONObject.getBoolean("is_forcestart"));
                }
                if (!jSONObject.has(ResourceIDs.ID)) {
                    return c0439m;
                }
                c0439m.m1552a(jSONObject.getString(ResourceIDs.ID));
                return c0439m;
            }
        } catch (JSONException e) {
            C0247a.m838b(e.toString());
        }
        return null;
    }

    public boolean m1313b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        if (!(pushTaskBean == null || baseAction == null)) {
            boolean z;
            boolean z2;
            C0439m c0439m = (C0439m) baseAction;
            String c = c0439m.m1556c();
            if (c != null || c0439m.m1560e() == null) {
                z = true;
            } else {
                List a = m1299a(0, c0439m.m1560e());
                if (a == null || a.size() != 1) {
                    z = false;
                } else {
                    c = (String) a.get(0);
                    z = true;
                }
            }
            if (c != null) {
                m1302a(c, c0439m.m1555b(), pushTaskBean, baseAction);
                z2 = z;
            } else if (c0439m.m1558d() != null) {
                List<String> a2 = m1299a(1, c0439m.m1558d());
                if (a2 == null || a2.size() <= 0) {
                    z2 = false;
                } else {
                    for (String c2 : a2) {
                        m1302a(c2, c0439m.m1555b(), pushTaskBean, baseAction);
                    }
                    z2 = z;
                }
            } else {
                z2 = z;
            }
            if (!z2) {
                m1301a(pushTaskBean.getMessageId(), pushTaskBean.getTaskId(), ((C0439m) baseAction).m1551a(), ((C0439m) baseAction).m1558d() != null ? ((C0439m) baseAction).m1558d() : Constants.STR_EMPTY, ((C0439m) baseAction).m1556c() != null ? ((C0439m) baseAction).m1556c() : Constants.STR_EMPTY);
            }
            if (!baseAction.getDoActionId().equals(Constants.STR_EMPTY)) {
                C0402e.m1330a().m1367a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
            }
        }
        return true;
    }
}
