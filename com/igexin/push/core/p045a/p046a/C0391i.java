package com.igexin.push.core.p045a.p046a;

import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.config.C0378l;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.C0426b;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.C0431e;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p050d.C0477k;
import com.igexin.push.p035e.p049a.C0506c;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.i */
public class C0391i implements C0383a {
    private static final String f1044a;

    static {
        f1044a = C0377k.f1013a;
    }

    public C0426b m1287a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1288a(JSONObject jSONObject) {
        try {
            BaseAction baseAction = new BaseAction();
            baseAction.setType("reportext");
            baseAction.setActionId(jSONObject.getString("actionid"));
            baseAction.setDoActionId(jSONObject.getString("do"));
            return baseAction;
        } catch (JSONException e) {
            return null;
        }
    }

    public boolean m1289b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        if (!(pushTaskBean == null || baseAction == null || C0378l.f1033t == null || C0378l.f1033t.m1504b() == null)) {
            StringBuilder stringBuilder = new StringBuilder();
            try {
                File[] listFiles = new File(C0483g.ad).listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    Map b = C0378l.f1033t.m1504b();
                    C0247a.m838b(f1044a + "|DynamicConfig.extInfos");
                    boolean z = true;
                    for (Entry entry : b.entrySet()) {
                        boolean z2;
                        int intValue = ((Integer) entry.getKey()).intValue();
                        C0431e c0431e = (C0431e) entry.getValue();
                        if (z) {
                            stringBuilder.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                            stringBuilder.append("|");
                            stringBuilder.append(C0483g.f1333s);
                            stringBuilder.append("|");
                            stringBuilder.append(C0483g.f1315a);
                            stringBuilder.append("|");
                            stringBuilder.append(C0483g.f1301M);
                            stringBuilder.append("|");
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        for (File name : listFiles) {
                            if (name.getName().equals(c0431e.m1489c())) {
                                stringBuilder.append(intValue);
                                stringBuilder.append(",");
                                stringBuilder.append(c0431e.m1486b());
                                stringBuilder.append(",");
                                stringBuilder.append(c0431e.m1489c());
                                stringBuilder.append("|");
                            }
                        }
                        z = z2;
                    }
                    C0247a.m838b(f1044a + "check ext data : " + stringBuilder.toString());
                    if (stringBuilder.length() > 0) {
                        C0244d.m802c().m795a(new C0506c(new C0477k(SDKUrlConfig.getStatServiceUrl(), stringBuilder.toString().getBytes(), 17)), false, true);
                    }
                }
            } catch (Exception e) {
            }
        }
        return true;
    }
}
