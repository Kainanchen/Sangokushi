package com.tencent.android.tpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.android.tpush.common.ProGuard;

/* compiled from: ProGuard */
final class aa extends BroadcastReceiver {
    final /* synthetic */ XGIOperateCallback f7302a;

    aa(XGIOperateCallback xGIOperateCallback) {
        this.f7302a = xGIOperateCallback;
    }

    public final void onReceive(Context context, Intent intent) {
        ProGuard.m4831a(context, (BroadcastReceiver) this);
        try {
            ProGuard.m4795a().m4798a(new ab(this.f7302a, context, intent, 1, 1));
        } catch (Exception e) {
        }
    }
}
