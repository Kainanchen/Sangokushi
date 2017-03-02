package com.igexin.push.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;

/* renamed from: com.igexin.push.core.m */
public class C0489m extends BroadcastReceiver {
    private static C0489m f1357a;

    private C0489m() {
    }

    public static C0489m m1738a() {
        if (f1357a == null) {
            f1357a = new C0489m();
        }
        return f1357a;
    }

    public void onReceive(Context context, Intent intent) {
        if (C0482f.m1694a() != null) {
            Message message = new Message();
            message.what = C0416a.f1074e;
            message.obj = intent;
            C0482f.m1694a().m1700a(message);
        }
    }
}
