package com.illuminate.texaspoker.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class LocalChangeReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        intent.getAction().equals("android.intent.action.LOCALE_CHANGED");
    }
}
