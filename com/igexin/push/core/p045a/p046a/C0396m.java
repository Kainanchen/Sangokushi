package com.igexin.push.core.p045a.p046a;

import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.core.C0483g;
import com.igexin.push.p035e.p036b.C0395f;
import com.tencent.connect.common.Constants;
import com.zkunity.app.ResourceIDs;
import java.util.Map;

/* renamed from: com.igexin.push.core.a.a.m */
class C0396m extends C0395f {
    final /* synthetic */ Map f1052a;
    final /* synthetic */ C0394l f1053b;

    C0396m(C0394l c0394l, long j, Map map) {
        this.f1053b = c0394l;
        this.f1052a = map;
        super(j);
    }

    protected void m1316a() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C0483g.f1321g.getPackageName());
            stringBuffer.append("#");
            stringBuffer.append(this.f1053b.m1310d((String) this.f1052a.get("pkgName")));
            stringBuffer.append("#");
            stringBuffer.append((String) this.f1052a.get("pkgName"));
            stringBuffer.append("/");
            stringBuffer.append((String) this.f1052a.get("serviceName"));
            stringBuffer.append("#");
            if (C0394l.m1305a((String) this.f1052a.get("pkgName"), (String) this.f1052a.get("serviceName"))) {
                stringBuffer.append(Constants.VIA_TO_TYPE_QQ_GROUP);
            } else {
                stringBuffer.append(Constants.VIA_RESULT_SUCCESS);
            }
            this.f1053b.m1307b("30026", stringBuffer.toString(), (String) this.f1052a.get("messageId"), (String) this.f1052a.get("taskId"), (String) this.f1052a.get(ResourceIDs.ID));
            C0247a.m838b("feedback actionId=30026 result=" + stringBuffer.toString());
        } catch (Exception e) {
        }
    }

    public int m1317b() {
        return 0;
    }
}
