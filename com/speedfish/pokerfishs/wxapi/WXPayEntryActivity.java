package com.speedfish.pokerfishs.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.zkunity.core.PayManager;

public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {
    public static boolean ispayWx;
    private IWXAPI api;

    static {
        ispayWx = false;
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
        ispayWx = false;
    }

    public void onResp(BaseResp resp) {
        Log.e("BaseResp.errCode", String.valueOf(resp.errCode));
        if (resp.errCode == -1) {
            PayManager.getManager().sPayCall(-5);
        } else if (resp.errCode == -2) {
            PayManager.getManager().sPayCall(0);
        } else if (resp.errCode == 0) {
            PayManager.getManager().sPayCall(1);
        } else {
            PayManager.getManager().sPayCall(-5);
        }
        finish();
    }
}
