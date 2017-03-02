package com.igexin.getuiext.p032a;

import android.content.Context;
import android.os.AsyncTask;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.util.C0329c;
import com.tencent.tauth.AuthActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.getuiext.a.m */
class C0282m extends AsyncTask {
    final /* synthetic */ Context f732a;
    final /* synthetic */ String f733b;
    final /* synthetic */ String f734c;
    final /* synthetic */ boolean f735d;
    final /* synthetic */ C0281l f736e;
    private Context f737f;

    C0282m(C0281l c0281l, Context context, String str, String str2, boolean z) {
        this.f736e = c0281l;
        this.f732a = context;
        this.f733b = str;
        this.f734c = str2;
        this.f735d = z;
        this.f737f = this.f732a;
    }

    protected Void m972a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = jSONObjectArr[0];
        try {
            String string = jSONObject.getString("packageName");
            String string2 = jSONObject.getString("versionCode");
            String string3 = jSONObject.getString("checksum");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AuthActivity.ACTION_KEY, "queryUpdate");
            jSONObject2.put("cid", Consts.CID);
            jSONObject2.put("app_id", Consts.APPID);
            jSONObject2.put("selfpkg", this.f737f.getPackageName());
            jSONObject2.put("pkgname", string);
            jSONObject2.put("versionCode", string2);
            jSONObject2.put("checksum", string3);
            jSONObject2.put("sendId", this.f733b);
            jSONObject2.put("context", this.f737f);
            jSONObject2.put("selfCode", Consts.VERSION);
            String a = C0329c.m1097a(Consts.DELIVER_URL, jSONObject2, Consts.DEFAULT_RETRY_TIMES);
            if (a != null) {
                this.f736e.m969a(this.f737f, a, string, this.f734c, this.f733b, this.f735d);
            }
        } catch (JSONException e) {
        }
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m972a((JSONObject[]) objArr);
    }
}
