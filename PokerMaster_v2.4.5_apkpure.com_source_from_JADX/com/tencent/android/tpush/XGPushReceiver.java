package com.tencent.android.tpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.ProGuard;

@JgClassChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.RECEIVERCHECK})
/* compiled from: ProGuard */
public class XGPushReceiver extends BroadcastReceiver {
    private static final String f7265a;

    static {
        f7265a = XGPushReceiver.class.getSimpleName();
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null && ProGuard.m4840h(context)) {
            String action = intent.getAction();
            if (action != null) {
                com.tencent.android.tpush.service.ProGuard.m5375c(context.getApplicationContext());
                if (XGPushConfig.enableDebug) {
                    com.tencent.android.tpush.p067a.ProGuard.m4715c(f7265a, "PushReceiver received " + action + " @@ " + context.getPackageName());
                }
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    com.tencent.android.tpush.horse.ProGuard.m4920a().m4930a(intent);
                } else if (Constants.ACTION_INTERNAL_PUSH_MESSAGE.equals(action)) {
                    com.tencent.android.tpush.p068b.ProGuard.m4761a(context).m4763a(intent);
                } else {
                    com.tencent.android.tpush.service.ProGuard.m5369a(context);
                }
            }
        }
    }
}
