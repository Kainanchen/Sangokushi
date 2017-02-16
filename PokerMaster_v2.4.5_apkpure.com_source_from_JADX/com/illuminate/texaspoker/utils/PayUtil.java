package com.illuminate.texaspoker.utils;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import android.widget.RelativeLayout;
import com.ali.fixHelper;
import com.illuminate.texaspoker.application.BaseApplication;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

/* renamed from: com.illuminate.texaspoker.utils.f */
public final class PayUtil {
    private static PayUtil f6667c;
    public RelativeLayout f6668a;
    public IWXAPI f6669b;

    static {
        fixHelper.fixfunc(new int[]{1135, 1136});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public final native IWXAPI m4247b();

    public static PayUtil m4246a() {
        if (f6667c == null) {
            f6667c = new PayUtil();
        }
        f6667c.f6669b = WXAPIFactory.createWXAPI(BaseApplication.m3548a(), "wxc373d29b97145fd3", true);
        return f6667c;
    }
}
