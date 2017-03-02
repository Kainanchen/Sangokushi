package com.igexin.getuiext.p032a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.data.p034a.C0288a;
import com.igexin.getuiext.data.p034a.C0292e;
import com.igexin.getuiext.data.p034a.C0293f;
import com.igexin.getuiext.service.C0297c;
import com.igexin.getuiext.service.GetuiExtService;
import com.igexin.getuiext.util.C0331e;
import com.tencent.wxop.stat.common.StatConstants;

/* renamed from: com.igexin.getuiext.a.j */
public class C0279j implements C0270a {
    public void m968a(Context context, Intent intent) {
        if (Consts.verifyCode == intent.getIntExtra("verifyCode", -1)) {
            String stringExtra = intent.getStringExtra("filepath");
            String stringExtra2 = intent.getStringExtra("pkgname");
            if (!TextUtils.isEmpty(stringExtra)) {
                C0288a b = C0297c.m1021a().m1025b(stringExtra2);
                if (b == null) {
                    return;
                }
                if (b instanceof C0292e) {
                    C0292e c0292e = (C0292e) b;
                    C0293f c0293f = c0292e.f781n;
                    String str = c0292e.a;
                    String str2 = b.f766c;
                    String str3 = "new";
                    if (str != null) {
                        str3 = str;
                    }
                    if (str2 != null) {
                        str3 = str3 + str2;
                    }
                    str3 = C0331e.f897a + (str3 + ".apk");
                    switch (C0280k.f730a[c0293f.ordinal()]) {
                        case StatConstants.XG_PRO_VERSION /*1*/:
                            C0331e.m1106a(context, stringExtra, str3, c0292e.b);
                            break;
                        case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                            C0331e.m1107b(context, stringExtra);
                            break;
                    }
                    Intent intent2 = new Intent(context, GetuiExtService.class);
                    intent2.putExtra("what", Consts.INSTALL_APP);
                    intent2.putExtra("pkgName", c0292e.b);
                    context.startService(intent2);
                    return;
                }
                C0331e.m1107b(context, stringExtra);
                Intent intent3 = new Intent(context, GetuiExtService.class);
                intent3.putExtra("what", Consts.INSTALL_APP);
                intent3.putExtra("pkgName", b.f765b);
                context.startService(intent3);
            }
        }
    }
}
