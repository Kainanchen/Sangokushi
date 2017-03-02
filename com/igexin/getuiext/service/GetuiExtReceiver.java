package com.igexin.getuiext.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.igexin.getuiext.p032a.C0270a;
import com.igexin.getuiext.p032a.C0271b;

public class GetuiExtReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C0270a a = C0271b.m955a(intent.getAction());
            if (a != null) {
                a.m954a(context, intent);
            }
        }
    }
}
