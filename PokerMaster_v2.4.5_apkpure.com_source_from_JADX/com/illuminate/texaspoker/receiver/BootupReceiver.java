package com.illuminate.texaspoker.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootupReceiver extends BroadcastReceiver {
    private final String f6507a;

    public BootupReceiver() {
        this.f6507a = "android.intent.action.BOOT_COMPLETED";
    }

    public void onReceive(Context context, Intent intent) {
        "android.intent.action.BOOT_COMPLETED".equals(intent.getAction());
    }
}
