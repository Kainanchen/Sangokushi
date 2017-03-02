package com.p054p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.unity3d.player.UnityPlayer;

/* renamed from: com.p.TelePhoneStateListener */
public class TelePhoneStateListener extends PhoneStateListener {
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        int level;
        String[] parts = signalStrength.toString().split(" ");
        int dbm = 0;
        if (((TelephonyManager) UnityPlayer.currentActivity.getSystemService("phone")).getNetworkType() == 13) {
            dbm = (Integer.parseInt(parts[8]) * 2) - 113;
        } else if (signalStrength.getGsmSignalStrength() != 99) {
            dbm = (signalStrength.getGsmSignalStrength() * 2) - 113;
        }
        int asu = (dbm + 113) / 2;
        if (asu <= 2 || asu == 99) {
            level = 0;
        } else if (asu >= 17) {
            level = 5;
        } else if (asu >= 12) {
            level = 4;
        } else if (asu >= 8) {
            level = 3;
        } else if (asu >= 5) {
            level = 2;
        } else {
            level = 1;
        }
        NativeTools.refreshSemaphoreInfo("gsm", level);
    }

    public boolean isWiFiActive(Context inContext) {
        ConnectivityManager connectivity = (ConnectivityManager) inContext.getApplicationContext().getSystemService("connectivity");
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                int i = 0;
                while (i < info.length) {
                    if (info[i].getTypeName().equals("WIFI") && info[i].isConnected()) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
