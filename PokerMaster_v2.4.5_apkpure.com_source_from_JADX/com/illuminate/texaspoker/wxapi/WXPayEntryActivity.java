package com.illuminate.texaspoker.wxapi;

import a.does.not.Exists2;
import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.ali.fixHelper;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;

public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {
    private static String f7164a;
    private RelativeLayout f7165b;

    static {
        fixHelper.fixfunc(new int[]{522, 523, 524, 525, 526, 527});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void m4612a(int i, int i2);

    protected native void onCreate(Bundle bundle);

    protected native void onNewIntent(Intent intent);

    public native void onReq(BaseReq baseReq);

    public native void onResp(BaseResp baseResp);

    static void __clinit__() {
        f7164a = "WXEntryActivity";
    }
}
