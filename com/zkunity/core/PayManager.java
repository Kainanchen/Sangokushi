package com.zkunity.core;

import com.igexin.download.Downloads;
import com.zkunity.sdk.MUnityPlayerProxy;
import com.zkunity.sdk.ZKResEvent;

public class PayManager {
    private static PayManager manager;
    private MPay[] pays;

    static {
        manager = new PayManager();
    }

    private PayManager() {
        this.pays = new MPay[]{new MAlipay(), new MIWXPay()};
    }

    public static PayManager getManager() {
        return manager;
    }

    public void initAllPaySystem() {
        for (MPay init : this.pays) {
            init.init();
        }
    }

    public void startPayRequest(int payType, String sid, String gid, String uid, String roleId) {
        if (payType == 1 && this.pays[0] != null && (this.pays[0] instanceof MAlipay)) {
            this.pays[0].pay(sid, gid, uid, roleId);
        } else if (payType == 2 && this.pays[1] != null && (this.pays[1] instanceof MIWXPay)) {
            this.pays[1].pay(sid, gid, uid, roleId);
        } else {
            sPayCall(-1);
        }
    }

    public void closeAllPaySystem() {
        for (MPay init : this.pays) {
            init.init();
        }
    }

    public void sPayCall(int r) {
        ZKResEvent rEvent = new ZKResEvent();
        rEvent.createNewFromNull();
        rEvent.putString(Downloads.COLUMN_URI, "sPayCall");
        rEvent.putString("rs", String.valueOf(r));
        MUnityPlayerProxy.getManager().sendMessage(rEvent);
    }
}
