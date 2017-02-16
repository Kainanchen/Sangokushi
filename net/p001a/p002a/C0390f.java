package net.p001a.p002a;

import com.hp.hpl.sparta.Element;
import com.hp.hpl.sparta.ParseException;
import net.p001a.p002a.C0389e.C0388a;

/* renamed from: net.a.a.f */
final class C0390f {
    static String m360a(String str, C0391g c0391g, C0391g c0391g2) {
        String b = C0393i.m365b(str);
        String a = C0393i.m364a(str);
        String str2 = null;
        try {
            Element xpathSelectElement = C0388a.f366a.f367a.xpathSelectElement(new StringBuffer("//").append(c0391g.m361a()).append("[text()='").append(b).append("']").toString());
            if (xpathSelectElement != null) {
                str2 = new StringBuffer().append(xpathSelectElement.xpathSelectString(new StringBuffer("../").append(c0391g2.m361a()).append("/text()").toString())).append(a).toString();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str2;
    }
}
