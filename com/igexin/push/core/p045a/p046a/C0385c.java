package com.igexin.push.core.p045a.p046a;

import android.os.Process;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0367a;
import com.igexin.push.config.C0377k;
import com.igexin.push.config.C0378l;
import com.igexin.push.core.C0426b;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.C0429c;
import com.igexin.push.core.bean.C0431e;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.p052f.C0513b;
import com.tencent.connect.common.Constants;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.c */
public class C0385c implements C0383a {
    private static final String f1041a;

    static {
        f1041a = C0377k.f1013a;
    }

    private boolean m1266a(C0431e c0431e) {
        String c = c0431e.m1489c();
        if (c == null) {
            return false;
        }
        C0513b.m1850a(c);
        return true;
    }

    public C0426b m1267a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1268a(JSONObject jSONObject) {
        if (jSONObject.has("ids")) {
            try {
                JSONArray jSONArray = new JSONArray(jSONObject.getString("ids"));
                if (jSONArray != null && jSONArray.length() > 0) {
                    int[] iArr = new int[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        iArr[i] = jSONArray.getInt(i);
                    }
                    BaseAction c0429c = new C0429c();
                    c0429c.setType("cleanext");
                    c0429c.m1477a(iArr);
                    c0429c.setActionId(jSONObject.getString("actionid"));
                    c0429c.setDoActionId(jSONObject.getString("do"));
                    return c0429c;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public boolean m1269b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        boolean z = false;
        if (C0378l.f1033t == null || C0378l.f1033t.m1504b() == null || C0378l.f1033t.m1504b().size() == 0) {
            return false;
        }
        if (!(pushTaskBean == null || baseAction == null)) {
            boolean z2;
            C0429c c0429c = (C0429c) baseAction;
            Map b = C0378l.f1033t.m1504b();
            Object a = c0429c.m1478a();
            if (a == null || a.length <= 0) {
                z2 = false;
            } else {
                C0247a.m838b("cleanext|" + a.toString());
                int i = 0;
                z2 = false;
                while (i < c0429c.m1478a().length) {
                    boolean z3;
                    if (b.containsKey(Integer.valueOf(a[i]))) {
                        m1266a((C0431e) b.get(Integer.valueOf(a[i])));
                        b.remove(Integer.valueOf(a[i]));
                        z2 = true;
                        z3 = true;
                    } else {
                        z3 = z2;
                        z2 = z;
                    }
                    i++;
                    z = z2;
                    z2 = z3;
                }
                if (z) {
                    C0367a.m1224a().m1240g();
                }
            }
            if (z2) {
                Process.killProcess(Process.myPid());
            }
        }
        if (baseAction.getDoActionId().equals(Constants.STR_EMPTY)) {
            return true;
        }
        C0402e.m1330a().m1367a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
        return true;
    }
}
