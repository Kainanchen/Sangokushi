package com.tencent.mm.sdk.p085a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.sdk.constants.Build;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.p085a.p086a.C1086b;
import com.tencent.mm.sdk.p087b.C1090b;
import com.tencent.mm.sdk.p087b.C1098h;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.tencent.mm.sdk.a.a */
public final class C1087a {

    /* renamed from: com.tencent.mm.sdk.a.a.a */
    public static class C1083a {
        public String f8251W;
        public String f8252X;
        public String f8253Y;
        public Bundle f8254Z;
        public int flags;

        public C1083a() {
            this.flags = -1;
        }

        public final String toString() {
            return "targetPkgName:" + this.f8251W + ", targetClassName:" + this.f8252X + ", content:" + this.f8253Y + ", flags:" + this.flags + ", bundle:" + this.f8254Z;
        }
    }

    public static boolean m5866a(Context context, C1083a c1083a) {
        if (context == null) {
            C1090b.m5874b("MicroMsg.SDK.MMessageAct", "send fail, invalid argument");
            return false;
        } else if (C1098h.m5889h(c1083a.f8251W)) {
            C1090b.m5874b("MicroMsg.SDK.MMessageAct", "send fail, invalid targetPkgName, targetPkgName = " + c1083a.f8251W);
            return false;
        } else {
            if (C1098h.m5889h(c1083a.f8252X)) {
                c1083a.f8252X = c1083a.f8251W + ".wxapi.WXEntryActivity";
            }
            C1090b.m5877e("MicroMsg.SDK.MMessageAct", "send, targetPkgName = " + c1083a.f8251W + ", targetClassName = " + c1083a.f8252X);
            Intent intent = new Intent();
            intent.setClassName(c1083a.f8251W, c1083a.f8252X);
            if (c1083a.f8254Z != null) {
                intent.putExtras(c1083a.f8254Z);
            }
            String packageName = context.getPackageName();
            intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
            intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
            intent.putExtra(ConstantsAPI.CONTENT, c1083a.f8253Y);
            intent.putExtra(ConstantsAPI.CHECK_SUM, C1086b.m5865a(c1083a.f8253Y, Build.SDK_INT, packageName));
            if (c1083a.flags == -1) {
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY).addFlags(134217728);
            } else {
                intent.setFlags(c1083a.flags);
            }
            try {
                context.startActivity(intent);
                C1090b.m5877e("MicroMsg.SDK.MMessageAct", "send mm message, intent=" + intent);
                return true;
            } catch (Exception e) {
                C1090b.m5873a("MicroMsg.SDK.MMessageAct", "send fail, ex = %s", e.getMessage());
                return false;
            }
        }
    }
}
