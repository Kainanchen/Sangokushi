package com.igexin.push.core.p045a;

import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.core.C0483g;
import com.igexin.push.p040c.p043c.C0364n;
import com.tencent.tauth.AuthActivity;
import java.util.Timer;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.l */
public class C0409l extends C0398b {
    public boolean m1418a(Object obj, JSONObject jSONObject) {
        try {
            C0364n c0364n = (C0364n) obj;
            if (jSONObject.has(AuthActivity.ACTION_KEY) && jSONObject.getString(AuthActivity.ACTION_KEY).equals("pushmessage")) {
                byte[] bArr = (c0364n.f992f == null || !(c0364n.f992f instanceof byte[])) ? null : (byte[]) c0364n.f992f;
                String string = jSONObject.getString("taskid");
                if (C0483g.ak.containsKey(string)) {
                    ((Timer) C0483g.ak.get(string)).cancel();
                    C0483g.ak.remove(string);
                }
                C0402e.m1330a().m1369a(jSONObject, bArr, true);
                C0247a.m838b("PushmessageAction| pushMessageAction = " + jSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C0247a.m838b("PushmessageAction|" + e.toString());
        }
        return true;
    }
}
