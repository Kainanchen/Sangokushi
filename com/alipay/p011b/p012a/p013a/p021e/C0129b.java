package com.alipay.p011b.p012a.p013a.p021e;

import com.alipay.p011b.p012a.p013a.p014a.C0111b;
import com.alipay.p011b.p012a.p013a.p017c.p019b.C0120a;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.zkunity.app.ResourceIDs;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.alipay.b.a.a.e.b */
public final class C0129b {
    private File f183a;
    private C0120a f184b;

    public C0129b(String str, C0120a c0120a) {
        this.f183a = null;
        this.f184b = null;
        this.f183a = new File(str);
        this.f184b = c0120a;
    }

    private static String m345a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SocialConstants.PARAM_TYPE, ResourceIDs.ID);
            jSONObject.put("error", str);
            return jSONObject.toString();
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private synchronized void m347b() {
        int i = 0;
        synchronized (this) {
            if (this.f183a != null) {
                if (this.f183a.exists() && this.f183a.isDirectory() && this.f183a.list().length != 0) {
                    int i2;
                    String str;
                    List arrayList = new ArrayList();
                    for (Object add : this.f183a.list()) {
                        arrayList.add(add);
                    }
                    Collections.sort(arrayList);
                    String str2 = (String) arrayList.get(arrayList.size() - 1);
                    int size = arrayList.size();
                    int i3;
                    if (!str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                        i3 = size;
                        str = str2;
                        i2 = i3;
                    } else if (arrayList.size() >= 2) {
                        i3 = size - 1;
                        str = (String) arrayList.get(arrayList.size() - 2);
                        i2 = i3;
                    }
                    size = !this.f184b.m329a(C0129b.m345a(C0111b.m242a(this.f183a.getAbsolutePath(), str))) ? i2 - 1 : i2;
                    while (i < size) {
                        new File(this.f183a, (String) arrayList.get(i)).delete();
                        i++;
                    }
                }
            }
        }
    }

    public final void m348a() {
        new Thread(new C0130c(this)).start();
    }
}
