package com.tencent.mm.sdk.p061a.p062a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.sdk.constants.Build;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.p063b.C0589b;
import com.tencent.mm.sdk.p063b.C0597h;

/* renamed from: com.tencent.mm.sdk.a.a.a */
public final class C0584a {

    /* renamed from: com.tencent.mm.sdk.a.a.a.a */
    public static class C0583a {
        public String f1577Y;
        public Bundle f1578Z;
        public String aa;
        public String ab;
    }

    public static boolean m2008a(Context context, C0583a c0583a) {
        if (context == null) {
            C0589b.m2018b("MicroMsg.SDK.MMessage", "send fail, invalid argument");
            return false;
        } else if (C0597h.m2033h(c0583a.ab)) {
            C0589b.m2018b("MicroMsg.SDK.MMessage", "send fail, action is null");
            return false;
        } else {
            String str = null;
            if (!C0597h.m2033h(c0583a.aa)) {
                str = c0583a.aa + ".permission.MM_MESSAGE";
            }
            Intent intent = new Intent(c0583a.ab);
            if (c0583a.f1578Z != null) {
                intent.putExtras(c0583a.f1578Z);
            }
            String packageName = context.getPackageName();
            intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
            intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
            intent.putExtra(ConstantsAPI.CONTENT, c0583a.f1577Y);
            intent.putExtra(ConstantsAPI.CHECK_SUM, C0585b.m2009a(c0583a.f1577Y, Build.SDK_INT, packageName));
            context.sendBroadcast(intent, str);
            C0589b.m2021e("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str);
            return true;
        }
    }
}
