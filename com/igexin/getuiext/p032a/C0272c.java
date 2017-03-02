package com.igexin.getuiext.p032a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.alipay.sdk.util.C0203j;
import com.igexin.getuiext.data.C0294a;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.data.p034a.C0290c;
import com.igexin.getuiext.p033b.C0287c;
import com.igexin.getuiext.service.GetuiExtService;
import com.igexin.getuiext.util.C0329c;
import com.igexin.getuiext.util.C0333g;
import com.igexin.getuiext.util.C0334h;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.AuthActivity;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.getuiext.a.c */
public class C0272c implements C0270a {
    private final String f725a;

    public C0272c() {
        this.f725a = "GetuiExt-BindCIDAction";
    }

    private static void m956a(long j) {
        C0294a.f792b = j;
        C0287c.m994d().m995a().m1008b();
    }

    private void m957a(Context context, long j) {
        List arrayList = new ArrayList();
        m958a(context, arrayList);
        int size = arrayList.size();
        if (size > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AuthActivity.ACTION_KEY, "reportApps");
                jSONObject.put("cid", Consts.CID);
                jSONObject.put("app_id", Consts.APPID);
                jSONObject.put("selfpkg", context.getPackageName());
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject2 = new JSONObject();
                    C0290c c0290c = (C0290c) arrayList.get(i);
                    jSONObject2.put("pkgname", c0290c.b);
                    jSONObject2.put("versionCode", String.valueOf(c0290c.d));
                    jSONObject2.put("checksum", c0290c.f772f);
                    jSONArray.put(jSONObject2);
                }
                String a = C0333g.m1109a(String.valueOf(System.currentTimeMillis()));
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(jSONArray.toString().getBytes());
                gZIPOutputStream.close();
                int size2 = byteArrayOutputStream.size();
                Object obj = new byte[(size2 + 16)];
                Object bytes = a.substring(0, 8).getBytes();
                Object bytes2 = a.substring(24, 32).getBytes();
                System.arraycopy(bytes, 0, obj, 0, 8);
                System.arraycopy(byteArrayOutputStream.toByteArray(), 0, obj, 8, size2);
                System.arraycopy(bytes2, 0, obj, size2 + 8, 8);
                byteArrayOutputStream.close();
                jSONObject.put("apps", new String(obj, "ISO-8859-1"));
                a = C0329c.m1097a(Consts.DELIVER_URL, jSONObject, Consts.DEFAULT_RETRY_TIMES);
                if (a != null) {
                    if (Constants.VIA_TO_TYPE_QQ_GROUP.equals(new JSONObject(a).getString(C0203j.f519c))) {
                        C0294a.f791a = j;
                        C0287c.m994d().m995a().m1005a();
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    private void m958a(Context context, List list) {
        Comparator c0273d = new C0273d(this);
        List installedPackages = context.getPackageManager().getInstalledPackages(0);
        int size = installedPackages.size();
        for (int i = 0; i < size; i++) {
            try {
                PackageInfo packageInfo = (PackageInfo) installedPackages.get(i);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if ((applicationInfo.flags & 1) <= 0) {
                    C0290c c0290c = new C0290c();
                    c0290c.b = applicationInfo.packageName;
                    c0290c.d = packageInfo.versionCode;
                    c0290c.f772f = C0334h.m1117b(context, applicationInfo.packageName, applicationInfo.sourceDir);
                    list.add(c0290c);
                }
            } catch (Exception e) {
            }
        }
        Collections.sort(list, c0273d);
    }

    public void m959a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("cid");
        Consts.CID = stringExtra;
        if (System.currentTimeMillis() - C0294a.f792b < Consts.TIME_24HOUR) {
            context.stopService(new Intent(context, GetuiExtService.class));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthActivity.ACTION_KEY, "bindApp");
            jSONObject.put("cid", stringExtra);
            jSONObject.put("app_id", Consts.APPID);
            jSONObject.put("pkgname", context.getPackageName());
            jSONObject.put("inc_version", Consts.VERSION);
            stringExtra = C0329c.m1097a(Consts.DELIVER_URL, jSONObject, Consts.DEFAULT_RETRY_TIMES);
            if (stringExtra != null) {
                try {
                    if (Constants.VIA_TO_TYPE_QQ_GROUP.equals(new JSONObject(stringExtra).getString(C0203j.f519c))) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = currentTimeMillis - C0294a.f791a;
                        C0272c.m956a(currentTimeMillis);
                        if (j > 259200000) {
                            m957a(context, currentTimeMillis);
                        }
                    }
                } catch (JSONException e) {
                }
            }
        } catch (JSONException e2) {
        }
        context.stopService(new Intent(context, GetuiExtService.class));
    }
}
