package com.tencent.mm.sdk.p085a.p086a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.sdk.constants.Build;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.p087b.C1090b;
import com.tencent.mm.sdk.p087b.C1098h;

/* renamed from: com.tencent.mm.sdk.a.a.a */
public final class C1085a {

    /* renamed from: com.tencent.mm.sdk.a.a.a.a */
    public static class C1084a {
        public String f8255Y;
        public Bundle f8256Z;
        public String aa;
        public String ab;
    }

    public static boolean m5864a(Context context, C1084a c1084a) {
        if (context == null) {
            C1090b.m5874b("MicroMsg.SDK.MMessage", "send fail, invalid argument");
            return false;
        } else if (C1098h.m5889h(c1084a.ab)) {
            C1090b.m5874b("MicroMsg.SDK.MMessage", "send fail, action is null");
            return false;
        } else {
            String str = null;
            if (!C1098h.m5889h(c1084a.aa)) {
                str = c1084a.aa + ".permission.MM_MESSAGE";
            }
            Intent intent = new Intent(c1084a.ab);
            if (c1084a.f8256Z != null) {
                intent.putExtras(c1084a.f8256Z);
            }
            String packageName = context.getPackageName();
            intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
            intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
            intent.putExtra(ConstantsAPI.CONTENT, c1084a.f8255Y);
            intent.putExtra(ConstantsAPI.CHECK_SUM, C1086b.m5865a(c1084a.f8255Y, Build.SDK_INT, packageName));
            context.sendBroadcast(intent, str);
            C1090b.m5877e("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str);
            return true;
        }
    }
}
