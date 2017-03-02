package com.p054p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiManager;
import com.unity3d.player.UnityPlayer;

/* renamed from: com.p.NetworkBroadcastReciver */
public class NetworkBroadcastReciver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.wifi.RSSI_CHANGED")) {
            NativeTools.refreshSemaphoreInfo("wifi", WifiManager.calculateSignalLevel(((WifiManager) UnityPlayer.currentActivity.getSystemService("wifi")).getConnectionInfo().getRssi(), 5));
        } else if (intent.getAction().equals("android.net.wifi.STATE_CHANGE")) {
            NetworkInfo info = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (info.getState().equals(State.DISCONNECTED)) {
                NativeTools.refreshSemaphoreInfo("wifi", 0);
            } else if (info.getState().equals(State.CONNECTED)) {
                NativeTools.refreshSemaphoreInfo("wifi", WifiManager.calculateSignalLevel(((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getRssi(), 5));
            }
        } else if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
            int wifistate = intent.getIntExtra("wifi_state", 1);
            if (wifistate == 1) {
                NativeTools.refreshSemaphoreInfo("wifi", 0);
            } else if (wifistate == 3) {
                NativeTools.refreshSemaphoreInfo("wifi", WifiManager.calculateSignalLevel(((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getRssi(), 5));
            }
        }
    }
}
