package com.igexin.push.core.p050d;

import com.igexin.p022a.p023a.p024a.C0227a;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.p035e.p049a.C0466b;
import com.igexin.push.p040c.p043c.C0351e;
import com.igexin.push.p040c.p043c.C0352a;
import com.igexin.push.p040c.p043c.C0354c;
import com.tencent.tauth.AuthActivity;
import com.zkunity.app.ResourceIDs;
import java.util.Timer;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.d.c */
public class C0469c extends C0466b {
    private String f1252a;
    private String f1253b;
    private C0352a f1254c;
    private PushTaskBean f1255d;

    public C0469c(String str, C0352a c0352a, PushTaskBean pushTaskBean) {
        super(str);
        this.f1253b = str;
        this.f1252a = pushTaskBean.getMessageId();
        this.f1254c = c0352a;
        this.f1255d = pushTaskBean;
    }

    protected void m1650a(PushTaskBean pushTaskBean, C0352a c0352a) {
        C0351e c0354c = new C0354c();
        c0354c.m1185a();
        c0354c.f943c = "RTV" + pushTaskBean.getMessageId() + "@" + pushTaskBean.getTaskId();
        c0354c.f944d = C0483g.f1333s;
        c0354c.f941a = (int) System.currentTimeMillis();
        C0482f.m1694a().m1712g().m1795a("C-" + C0483g.f1333s, c0354c);
        C0247a.m838b("cdnRetrieve|" + pushTaskBean.getMessageId() + "|" + pushTaskBean.getTaskId());
        if (c0352a.m1181c() < 2) {
            long k = C0402e.m1330a().m1391k();
            Timer timer = new Timer();
            timer.schedule(new C0471e(this, pushTaskBean, c0352a), k);
            C0483g.ak.put(pushTaskBean.getTaskId(), timer);
        }
    }

    public void m1651a(Exception exception) {
        if (this.f1254c.m1177a() < 2) {
            new Timer().schedule(new C0470d(this), C0402e.m1330a().m1391k());
            return;
        }
        m1650a(this.f1255d, this.f1254c);
    }

    public void m1652a(byte[] bArr) {
        if (bArr != null) {
            byte[] b = C0246g.m831b(C0227a.m722a(bArr, C0483g.f1317c));
            if (b != null) {
                JSONObject jSONObject = new JSONObject(new String(b, "utf-8"));
                jSONObject.put(ResourceIDs.ID, this.f1252a);
                jSONObject.put("messageid", this.f1252a);
                jSONObject.put("cdnType", true);
                b = null;
                try {
                    if ("pushmessage".equals(jSONObject.getString(AuthActivity.ACTION_KEY))) {
                        if (jSONObject.has("extraData")) {
                            b = jSONObject.getString("extraData").getBytes();
                        }
                        C0402e.m1330a().m1369a(jSONObject, b, true);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    return;
                }
            }
            throw new Exception("Get error CDNData, can not UnGzip it...");
        }
    }

    public int m1653b() {
        return 0;
    }
}
