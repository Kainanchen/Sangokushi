package com.jg;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.tencent.android.tpush.XGPushManager;

public enum EType {
    ;

    static {
        fixHelper.fixfunc(new int[]{XGPushManager.OPERATION_REQ_UNREGISTER, 1});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    static void __clinit__() {
        ALL = new EType("ALL", 0);
        ACTIVITYCHECK = new EType("ACTIVITYCHECK", 1);
        PROVIDERCHECK = new EType("PROVIDERCHECK", 2);
        RECEIVERCHECK = new EType("RECEIVERCHECK", 3);
        SERVICESCHECK = new EType("SERVICESCHECK", 4);
        PERMISSIONCHECK = new EType("PERMISSIONCHECK", 5);
        INTENTCHECK = new EType("INTENTCHECK", 6);
        SECURERANDOMCHECK = new EType("SECURERANDOMCHECK", 7);
        JSEXECUTECHECK = new EType("JSEXECUTECHECK", 8);
        HTTPSCHECK = new EType("HTTPSCHECK", 9);
        INTENTSCHEMECHECK = new EType("INTENTSCHEMECHECK", 10);
        ENUM$VALUES = new EType[]{ALL, ACTIVITYCHECK, PROVIDERCHECK, RECEIVERCHECK, SERVICESCHECK, PERMISSIONCHECK, INTENTCHECK, SECURERANDOMCHECK, JSEXECUTECHECK, HTTPSCHECK, INTENTSCHEMECHECK};
    }
}
