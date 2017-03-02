package com.tencent.mm.sdk.p061a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.sdk.constants.Build;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.p061a.p062a.C0585b;
import com.tencent.mm.sdk.p063b.C0589b;
import com.tencent.mm.sdk.p063b.C0597h;

/* renamed from: com.tencent.mm.sdk.a.a */
public final class C0586a {

    /* renamed from: com.tencent.mm.sdk.a.a.a */
    public static class C0582a {
        public String f1573W;
        public String f1574X;
        public String f1575Y;
        public Bundle f1576Z;
        public int flags;

        public C0582a() {
            this.flags = -1;
        }

        public final String toString() {
            return "targetPkgName:" + this.f1573W + ", targetClassName:" + this.f1574X + ", content:" + this.f1575Y + ", flags:" + this.flags + ", bundle:" + this.f1576Z;
        }
    }

    public static boolean m2010a(Context context, C0582a c0582a) {
        if (context == null) {
            C0589b.m2018b("MicroMsg.SDK.MMessageAct", "send fail, invalid argument");
            return false;
        } else if (C0597h.m2033h(c0582a.f1573W)) {
            C0589b.m2018b("MicroMsg.SDK.MMessageAct", "send fail, invalid targetPkgName, targetPkgName = " + c0582a.f1573W);
            return false;
        } else {
            if (C0597h.m2033h(c0582a.f1574X)) {
                c0582a.f1574X = c0582a.f1573W + ".wxapi.WXEntryActivity";
            }
            C0589b.m2021e("MicroMsg.SDK.MMessageAct", "send, targetPkgName = " + c0582a.f1573W + ", targetClassName = " + c0582a.f1574X);
            Intent intent = new Intent();
            intent.setClassName(c0582a.f1573W, c0582a.f1574X);
            if (c0582a.f1576Z != null) {
                intent.putExtras(c0582a.f1576Z);
            }
            String packageName = context.getPackageName();
            intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
            intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
            intent.putExtra(ConstantsAPI.CONTENT, c0582a.f1575Y);
            intent.putExtra(ConstantsAPI.CHECK_SUM, C0585b.m2009a(c0582a.f1575Y, Build.SDK_INT, packageName));
            if (c0582a.flags == -1) {
                intent.addFlags(268435456).addFlags(134217728);
            } else {
                intent.setFlags(c0582a.flags);
            }
            try {
                context.startActivity(intent);
                C0589b.m2021e("MicroMsg.SDK.MMessageAct", "send mm message, intent=" + intent);
                return true;
            } catch (Exception e) {
                C0589b.m2017a("MicroMsg.SDK.MMessageAct", "send fail, ex = %s", e.getMessage());
                return false;
            }
        }
    }
}
