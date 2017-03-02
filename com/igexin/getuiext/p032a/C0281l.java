package com.igexin.getuiext.p032a;

import android.content.Context;
import android.content.Intent;
import com.alipay.sdk.cons.C0167c;
import com.alipay.sdk.util.C0203j;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.service.GetuiExtService;
import com.igexin.getuiext.util.C0334h;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.getuiext.a.l */
public class C0281l implements C0270a {
    private final String f731a;

    public C0281l() {
        this.f731a = "GetuiExt-QueryUpdateAction";
    }

    private void m969a(Context context, String str, String str2, String str3, String str4, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt(C0203j.f519c);
            if (z) {
                if (Consts.APPID == null) {
                    Consts.APPID = C0334h.m1114a(context);
                }
                if (Consts.APPID != null) {
                    Intent intent = new Intent("com.igexin.sdk.action." + Consts.APPID);
                    intent.putExtra(AuthActivity.ACTION_KEY, Consts.UPDATE_RESULT);
                    intent.putExtra(C0203j.f519c, i);
                    context.sendBroadcast(intent);
                }
            }
            if (i != 0) {
                Intent intent2 = new Intent(context, GetuiExtService.class);
                intent2.putExtra(AuthActivity.ACTION_KEY, "handleUpdate");
                intent2.putExtra(C0167c.f364e, jSONObject.getString(C0167c.f364e));
                intent2.putExtra("logo_url", jSONObject.getString("logo"));
                intent2.putExtra("versionCode", jSONObject.getString("versionCode"));
                intent2.putExtra("versionName", jSONObject.getString("versionName"));
                intent2.putExtra("fullSize", jSONObject.getLong("fullsize"));
                intent2.putExtra("diffSize", jSONObject.getLong("diffsize"));
                intent2.putExtra("updateType", jSONObject.getString("updateType"));
                intent2.putExtra("diffFileurl", jSONObject.getString("diffFileurl"));
                intent2.putExtra("fullFileurl", jSONObject.getString("fullFileurl"));
                intent2.putExtra("originalUrl", jSONObject.getString("originalUrl"));
                intent2.putExtra("diffChecksum", jSONObject.getString("diffChecksum"));
                intent2.putExtra("fullChecksum", jSONObject.getString("fullChecksum"));
                intent2.putExtra(SocialConstants.PARAM_COMMENT, jSONObject.getString(SocialConstants.PARAM_COMMENT));
                if (jSONObject.has("recommendType")) {
                    intent2.putExtra("recommendType", jSONObject.getString("recommendType"));
                }
                if (jSONObject.has("recommendApps")) {
                    intent2.putExtra("recommendApps", jSONObject.getString("recommendApps"));
                }
                if (jSONObject.has("recommendImg")) {
                    intent2.putExtra("recommendImg", jSONObject.getString("recommendImg"));
                }
                if (jSONObject.has("recommendTxt")) {
                    intent2.putExtra("recommendTxt", jSONObject.getString("recommendTxt"));
                }
                intent2.putExtra("pkgname", str2);
                intent2.putExtra("sendId", str3);
                intent2.putExtra("taskid", str4);
                intent2.putExtra("what", Consts.SERVICE_ONRECEIVE);
                context.startService(intent2);
            }
        } catch (JSONException e) {
        }
    }

    public void m971a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("pkgName");
        String stringExtra2 = intent.getStringExtra("versionCode");
        boolean booleanExtra = intent.getBooleanExtra("manual", false);
        String stringExtra3 = intent.getStringExtra("taskid");
        String stringExtra4 = intent.getStringExtra("sendId");
        if (C0334h.m1115a(context, stringExtra, stringExtra2, intent.getBooleanExtra("cleanInstall", false)) != null) {
            new C0282m(this, context, stringExtra4, stringExtra3, booleanExtra).execute(new JSONObject[]{r6});
        }
    }
}
