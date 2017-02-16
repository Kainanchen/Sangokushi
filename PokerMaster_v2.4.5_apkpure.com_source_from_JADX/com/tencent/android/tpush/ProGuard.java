package com.tencent.android.tpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.tencent.android.tpush.z */
final class ProGuard extends BroadcastReceiver {
    final /* synthetic */ XGIOperateCallback f7949a;

    ProGuard(XGIOperateCallback xGIOperateCallback) {
        this.f7949a = xGIOperateCallback;
    }

    public final void onReceive(Context context, Intent intent) {
        if (XGPushConfig.enableDebug) {
            com.tencent.android.tpush.p067a.ProGuard.m4720e(XGPushManager.f7261a, "Register call back to " + context.getPackageName());
        }
        try {
            com.tencent.android.tpush.common.ProGuard.m4795a().m4798a(new ab(this.f7949a, context, intent, 1, 0));
        } catch (Exception e) {
        }
        com.tencent.android.tpush.common.ProGuard.m4831a(context, (BroadcastReceiver) this);
    }
}
