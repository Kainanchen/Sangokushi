package com.igexin.push.core.p050d;

import android.content.ContentValues;
import com.alipay.sdk.util.C0203j;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.p044c.C0444f;
import com.igexin.push.p035e.p049a.C0466b;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.d.j */
public class C0476j extends C0466b {
    private boolean f1264a;

    public C0476j(String str, byte[] bArr, int i, boolean z) {
        super(str);
        this.f1264a = false;
        this.f1264a = z;
        m1665a(bArr, i);
    }

    private void m1665a(byte[] bArr, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthActivity.ACTION_KEY, "upload_BI");
            jSONObject.put("BIType", String.valueOf(i));
            jSONObject.put("cid", C0483g.f1333s);
            jSONObject.put("BIData", new String(C0246g.m835e(bArr, 0), AsyncHttpResponseHandler.DEFAULT_CHARSET));
            m1638b(C0259a.m881b(jSONObject.toString().getBytes()));
        } catch (Exception e) {
        }
    }

    public void m1666a(byte[] bArr) {
        JSONObject jSONObject = new JSONObject(new String(bArr));
        if (this.f1264a && jSONObject.has(C0203j.f519c) && jSONObject.getString(C0203j.f519c).equals("ok")) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(SocialConstants.PARAM_TYPE, Constants.VIA_RESULT_SUCCESS);
            C0482f.m1694a().m1716k().m1148a("bi", contentValues, new String[]{SocialConstants.PARAM_TYPE}, new String[]{Constants.VIA_SSO_LOGIN});
            C0444f.m1577a().m1601c(System.currentTimeMillis());
        }
    }

    public int m1667b() {
        return 0;
    }
}
