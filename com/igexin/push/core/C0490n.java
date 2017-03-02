package com.igexin.push.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;

/* renamed from: com.igexin.push.core.n */
public class C0490n extends BroadcastReceiver {
    private static C0490n f1358a;

    private C0490n() {
    }

    public static C0490n m1739a() {
        if (f1358a == null) {
            f1358a = new C0490n();
        }
        return f1358a;
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
