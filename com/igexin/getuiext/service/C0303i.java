package com.igexin.getuiext.service;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alipay.sdk.util.C0203j;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.data.p034a.C0289b;
import com.igexin.getuiext.util.C0329c;
import com.igexin.getuiext.util.C0330d;
import com.igexin.getuiext.util.C0333g;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.AuthActivity;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.getuiext.service.i */
public class C0303i extends Handler {
    final /* synthetic */ GetuiExtService f821a;

    public C0303i(GetuiExtService getuiExtService, Looper looper) {
        this.f821a = getuiExtService;
        super(looper);
    }

    private boolean m1039a(String str) {
        ArrayList a = C0295a.m1015a(str);
        if (a != null && a.size() > 0) {
            String a2;
            StringBuffer stringBuffer = new StringBuffer();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    stringBuffer.append("\n");
                }
                stringBuffer.append(((C0289b) a.get(i)).f770b);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AuthActivity.ACTION_KEY, "upload_BI");
                jSONObject.put("BIType", str);
                jSONObject.put("cid", Consts.CID);
                jSONObject.put("BIData", new String(C0330d.m1104a(stringBuffer.toString().getBytes(), 0), AsyncHttpResponseHandler.DEFAULT_CHARSET));
                a2 = C0329c.m1098a("http://sdk.open.phone.igexin.com/api.php?format=json&t=1", C0333g.m1111a(jSONObject.toString().getBytes()), Consts.DEFAULT_RETRY_TIMES);
            } catch (Exception e) {
                a2 = null;
            }
            if (a2 != null) {
                try {
                    a2 = new JSONObject(a2).getString(C0203j.f519c);
                } catch (JSONException e2) {
                    a2 = null;
                }
                if (a2 != null && a2.equals("ok")) {
                    return true;
                }
            }
        }
        return false;
    }

    public void m1040a(String str, int i) {
        C0295a.m1019a(str, i);
        if (m1039a(Constants.VIA_SSO_LOGIN)) {
            C0295a.m1020b(Constants.VIA_SSO_LOGIN);
        }
        if (m1039a(Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP)) {
            C0295a.m1020b(Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP);
        }
        if (m1039a(Constants.VIA_REPORT_TYPE_JOININ_GROUP)) {
            C0295a.m1020b(Constants.VIA_REPORT_TYPE_JOININ_GROUP);
        }
    }

    public void handleMessage(Message message) {
        if (message.what == Consts.SEND_BI) {
            Intent intent = (Intent) message.obj;
            if (intent != null) {
                m1040a(intent.getStringExtra("BIData"), Integer.valueOf(intent.getStringExtra("BIType")).intValue());
            }
        }
    }
}
