package com.zkunity.core;

import com.android.volley.VolleyError;
import com.igexin.download.Downloads;
import com.igexin.sdk.PushConsts;
import com.speedfish.pokerfishs.wxapi.WXPayEntryActivity;
import com.tencent.mm.sdk.modelpay.PayReq;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.tencent.open.SocialConstants;
import com.zkunity.app.AppManager;
import com.zkunity.config.MConfig;
import com.zkunity.model.MJSONObject;
import com.zkunity.network.SyncNetworkCall;
import com.zkunity.network.SyncNetworkUtils;

public class MIWXPay implements MPay {
    private IWXAPI wxObj;

    /* renamed from: com.zkunity.core.MIWXPay.1 */
    class C07301 implements Runnable {
        private final /* synthetic */ PayReq val$req;

        C07301(PayReq payReq) {
            this.val$req = payReq;
        }

        public void run() {
            if (MIWXPay.this.wxObj == null) {
                PayManager.getManager().sPayCall(0);
                return;
            }
            MIWXPay.this.wxObj.registerApp("wxbffae0764e6dbd19");
            MIWXPay.this.wxObj.sendReq(this.val$req);
            WXPayEntryActivity.ispayWx = true;
        }
    }

    private class CreateWXListener implements SyncNetworkCall {
        private CreateWXListener() {
        }

        public void onSuccess(int statusCode, String rs) {
            MJSONObject mObj = new MJSONObject();
            mObj.invokeData(rs);
            if (mObj.getInt("rs") != PushConsts.SETTAG_ERROR_COUNT) {
                return;
            }
            if (mObj != null && mObj.getString(SocialConstants.PARAM_APP_ID).equals("wxbffae0764e6dbd19") && mObj.getString("partnerid").equals("1299952001")) {
                PayReq req = new PayReq();
                req.appId = mObj.getString(SocialConstants.PARAM_APP_ID);
                req.partnerId = mObj.getString("partnerid");
                req.prepayId = mObj.getString("prepayid");
                req.packageValue = mObj.getString("package");
                req.nonceStr = mObj.getString("noncestr");
                req.timeStamp = mObj.getString("timestamp");
                req.sign = mObj.getString("sign");
                MIWXPay.this.send(req);
                return;
            }
            PayManager.getManager().sPayCall(-3);
        }

        public void onFailure(int statusCode, VolleyError error) {
            PayManager.getManager().sPayCall(-3);
        }
    }

    public void init() {
        this.wxObj = WXAPIFactory.createWXAPI(AppManager.getManager().getAppContext(), "wxbffae0764e6dbd19", false);
    }

    public void pay(String sid, String gid, String uid, String roleId) {
        if (SendToWX.checkWX()) {
            MJSONObject mObj = new MJSONObject();
            mObj.createNewFromNull();
            mObj.putString(Downloads.COLUMN_URI, "createIWXPayOrderInfo");
            mObj.putString("sid", sid);
            mObj.putString("gid", gid);
            mObj.putString("uid", uid);
            mObj.putString("roleId", roleId);
            SyncNetworkUtils.postByHttp(new StringBuilder(String.valueOf(MConfig.getString("baseUrl"))).append("pay").toString(), mObj.toString(), new CreateWXListener());
            return;
        }
        PayManager.getManager().sPayCall(-1);
    }

    private void send(PayReq req) {
        new Thread(new C07301(req)).start();
    }

    public void close() {
    }
}
