package com.igexin.getuiext.p032a;

import com.igexin.sdk.PushConsts;
import java.util.HashMap;

/* renamed from: com.igexin.getuiext.a.b */
public class C0271b {
    private static HashMap f724a;

    static {
        f724a = new HashMap();
        f724a.put(PushConsts.ACTION_BROADCAST_USER_PRESENT, new C0283n());
        f724a.put("com.igexin.download.action.notify.click", new C0275f());
        f724a.put("com.igexin.increment", new C0278i());
        f724a.put("install", new C0279j());
        f724a.put("download", new C0274e());
        f724a.put("bindApp", new C0272c());
        f724a.put("update", new C0281l());
        f724a.put("handleUpdate", new C0276g());
    }

    public static C0270a m955a(String str) {
        return (C0270a) f724a.get(str);
    }
}
