package com.igexin.push.core.p045a;

import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.p035e.p036b.C0508b;
import com.igexin.push.p040c.p043c.C0352a;
import com.igexin.push.p040c.p043c.C0354c;
import com.tencent.connect.common.Constants;

/* renamed from: com.igexin.push.core.a.d */
public class C0400d extends C0397a {
    private static final String f1055a;

    static {
        f1055a = C0377k.f1013a;
    }

    private void m1322a(String str, C0352a c0352a) {
        String str2 = Constants.STR_EMPTY;
        str2 = Constants.STR_EMPTY;
        str2 = Constants.STR_EMPTY;
        if (str != null) {
            str2 = str.substring("CDN".length(), str.length());
            if (str2.contains("@")) {
                String[] split = str2.split("\\@");
                String str3 = split[0];
                if (split[1].contains("|")) {
                    split = split[1].split("\\|");
                    String str4 = split[0];
                    str2 = split[1];
                    if (str3 != null && str4 != null && str2 != null) {
                        PushTaskBean pushTaskBean = new PushTaskBean();
                        pushTaskBean.setAppid(C0483g.f1315a);
                        pushTaskBean.setMessageId(str3);
                        pushTaskBean.setTaskId(str4);
                        pushTaskBean.setId(str3);
                        pushTaskBean.setAppKey(C0483g.f1316b);
                        pushTaskBean.setCurrentActionid(1);
                        C0402e.m1330a().m1352a(pushTaskBean);
                        C0402e.m1330a().m1356a(str2, c0352a, pushTaskBean);
                    }
                }
            }
        }
    }

    public boolean m1323a(C0233d c0233d) {
        return super.m1318a(c0233d);
    }

    public boolean m1324a(Object obj) {
        if (obj instanceof C0352a) {
            C0352a c0352a = (C0352a) obj;
            if (c0352a.f932c != null) {
                String str = (String) c0352a.f932c;
                C0247a.m838b("cdnpushmessage|" + str);
                if (str.startsWith("RCV")) {
                    String substring = str.substring("RCV".length(), str.length());
                    if (C0483g.al.containsKey(substring)) {
                        C0354c c0354c = (C0354c) C0483g.al.get(substring);
                        C0483g.al.remove(substring);
                        if (c0354c != null) {
                            C0508b e = c0354c.m1191e();
                            if (e != null) {
                                e.m753t();
                            }
                        }
                    }
                } else if (str.contains("CDN")) {
                    m1322a(str, c0352a);
                }
            }
        }
        return true;
    }
}
