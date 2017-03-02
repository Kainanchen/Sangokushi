package com.speedfish.pokerfishs.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;
import com.tencent.mm.sdk.modelmsg.ShowMessageFromWX.Req;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

public class WXEntryActivity extends Activity implements IWXAPIEventHandler {
    public static boolean isSendToWx;
    public static String type;
    private IWXAPI api;

    static {
        isSendToWx = false;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.api = WXAPIFactory.createWXAPI(this, "wxbffae0764e6dbd19");
        this.api.handleIntent(getIntent(), this);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.api.handleIntent(intent, this);
    }

    public void onReq(BaseReq req) {
        isSendToWx = false;
        if (req.getType() == 4) {
            Log.e("11111111111111", ((Req) req).message.mediaObject.extInfo);
        }
    }

    public void onResp(BaseResp resp) {
        isSendToWx = false;
        Log.e("WXEntryActivity.BaseResp.errCode", String.valueOf(resp.errCode));
        type = null;
        finish();
    }
}
