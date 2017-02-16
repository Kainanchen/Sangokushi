package com.tencent.mm.sdk.openapi;

import android.content.Context;
import com.tencent.mm.sdk.p087b.C1090b;

public class WXAPIFactory {
    private static final String TAG = "MicroMsg.PaySdk.WXFactory";

    private WXAPIFactory() {
        throw new RuntimeException(getClass().getSimpleName() + " should not be instantiated");
    }

    public static IWXAPI createWXAPI(Context context, String str) {
        return createWXAPI(context, str, false);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z) {
        C1090b.m5877e(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z);
        return new WXApiImplV10(context, str, z);
    }
}
