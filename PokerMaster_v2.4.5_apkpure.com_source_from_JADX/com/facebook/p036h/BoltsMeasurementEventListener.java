package com.facebook.p036h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import bolts.MeasurementEvent;
import com.facebook.p004a.AppEventsLogger;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* renamed from: com.facebook.h.d */
public final class BoltsMeasurementEventListener extends BroadcastReceiver {
    private static BoltsMeasurementEventListener f1633a;
    private Context f1634b;

    private BoltsMeasurementEventListener(Context context) {
        this.f1634b = context.getApplicationContext();
    }

    public static BoltsMeasurementEventListener m1590a(Context context) {
        if (f1633a != null) {
            return f1633a;
        }
        BroadcastReceiver boltsMeasurementEventListener = new BoltsMeasurementEventListener(context);
        f1633a = boltsMeasurementEventListener;
        LocalBroadcastManager.getInstance(boltsMeasurementEventListener.f1634b).registerReceiver(boltsMeasurementEventListener, new IntentFilter(MeasurementEvent.MEASUREMENT_EVENT_NOTIFICATION_NAME));
        return f1633a;
    }

    public final void onReceive(Context context, Intent intent) {
        AppEventsLogger a = AppEventsLogger.m824a(context);
        String str = "bf_" + intent.getStringExtra(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY);
        Bundle bundleExtra = intent.getBundleExtra(MeasurementEvent.MEASUREMENT_EVENT_ARGS_KEY);
        Bundle bundle = new Bundle();
        for (String str2 : bundleExtra.keySet()) {
            bundle.putString(str2.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", LetterIndexBar.SEARCH_ICON_LETTER).replaceAll("[ -]*$", LetterIndexBar.SEARCH_ICON_LETTER), (String) bundleExtra.get(str2));
        }
        a.m836a(str, bundle);
    }

    protected final void finalize() {
        try {
            LocalBroadcastManager.getInstance(this.f1634b).unregisterReceiver(this);
        } finally {
            super.finalize();
        }
    }
}
