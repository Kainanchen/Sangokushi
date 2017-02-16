package net.p001a.p002a;

import com.hp.hpl.sparta.Element;
import com.hp.hpl.sparta.ParseException;
import net.p001a.p002a.C0385b.C0384a;

/* renamed from: net.a.a.c */
public final class C0386c {
    private static String[] f365a;

    static {
        f365a = new String[]{"_I", "_II", "_III", "_IV", "_V"};
    }

    public static String m356a(String str) {
        String b = C0393i.m365b(str);
        String a = C0393i.m364a(str);
        String str2 = null;
        try {
            Element xpathSelectElement = C0384a.f363a.f364a.xpathSelectElement(new StringBuffer("//").append(C0391g.f368a.m361a()).append("[text()='").append(b).append("']").toString());
            if (xpathSelectElement != null) {
                str2 = xpathSelectElement.xpathSelectString(new StringBuffer("../").append(C0391g.f373f.m361a()).append(f365a[Integer.parseInt(a) - 1]).append("/text()").toString());
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str2;
    }
}
