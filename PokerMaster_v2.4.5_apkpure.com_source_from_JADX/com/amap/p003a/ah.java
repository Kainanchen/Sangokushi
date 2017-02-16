package com.amap.p003a;

import android.text.TextUtils;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.net.URLConnection;
import java.util.Map;

/* compiled from: BaseNetManager */
/* renamed from: com.amap.a.ah */
public final class ah {
    private static ah f176a;

    /* renamed from: com.amap.a.ah.a */
    public interface BaseNetManager {
        URLConnection m148a();
    }

    public static ah m149a() {
        if (f176a == null) {
            f176a = new ah();
        }
        return f176a;
    }

    public static byte[] m151a(am amVar) {
        ca e;
        try {
            an a = ah.m150a(amVar, false);
            return a != null ? a.f197a : null;
        } catch (ca e2) {
            throw e2;
        } catch (Throwable th) {
            cm.m637a(th, "BaseNetManager", "makeSyncPostRequest");
            e2 = new ca("\u672a\u77e5\u7684\u9519\u8bef");
        }
    }

    public static an m150a(am amVar, boolean z) {
        ca e;
        if (amVar == null) {
            try {
                throw new ca("requeust is null");
            } catch (ca e2) {
                throw e2;
            } catch (Throwable th) {
                th.printStackTrace();
                e2 = new ca("\u672a\u77e5\u7684\u9519\u8bef");
            }
        } else if (amVar.m154c() == null || LetterIndexBar.SEARCH_ICON_LETTER.equals(amVar.m154c())) {
            throw new ca("request url is empty");
        } else {
            String c;
            ak akVar = new ak(amVar.f177c, amVar.f178d, amVar.f179e == null ? null : amVar.f179e, z);
            byte[] e3 = amVar.m155e();
            if (e3 == null || e3.length == 0) {
                c = amVar.m154c();
            } else {
                Map a = amVar.m152a();
                if (a == null) {
                    c = amVar.m154c();
                } else {
                    String a2 = ak.m174a(a);
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(amVar.m154c()).append("?").append(a2);
                    c = stringBuffer.toString();
                }
            }
            Map b = amVar.m153b();
            e3 = amVar.m155e();
            if (e3 == null || e3.length == 0) {
                String a3 = ak.m174a(amVar.m152a());
                if (!TextUtils.isEmpty(a3)) {
                    e3 = ck.m624a(a3);
                }
            }
            return akVar.m176a(c, b, e3);
        }
    }
}
