package com.p054p;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.telephony.TelephonyManager;
import com.alipay.sdk.packet.C0182d;
import com.tencent.connect.common.Constants;
import com.unity3d.player.UnityPlayer;
import java.util.Locale;

/* renamed from: com.p.NativeTools */
public class NativeTools {
    private static boolean isLisPowser;
    private static boolean isLisSemaphore;

    /* renamed from: com.p.NativeTools.1 */
    class C05661 implements Runnable {
        private final /* synthetic */ String val$data;

        C05661(String str) {
            this.val$data = str;
        }

        public void run() {
            ((ClipboardManager) UnityPlayer.currentActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(C0182d.f429k, this.val$data));
        }
    }

    /* renamed from: com.p.NativeTools.2 */
    class C05672 implements Runnable {
        private final /* synthetic */ String[] val$ss;

        C05672(String[] strArr) {
            this.val$ss = strArr;
        }

        public void run() {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.val$ss[0]));
            String s = this.val$ss[1];
            for (int i = 2; i < this.val$ss.length; i++) {
                s = new StringBuilder(String.valueOf(new StringBuilder(String.valueOf(s)).append(":").toString())).append(this.val$ss[i]).toString();
            }
            intent.putExtra("sms_body", s);
            UnityPlayer.currentActivity.startActivity(intent);
        }
    }

    /* renamed from: com.p.NativeTools.3 */
    class C05683 implements Runnable {
        private final /* synthetic */ String val$infos;

        C05683(String str) {
            this.val$infos = str;
        }

        public void run() {
            String[] ss = this.val$infos.split(":");
            Intent intent = new Intent();
            intent.putExtra("w", Integer.parseInt(ss[0]));
            intent.putExtra("h", Integer.parseInt(ss[1]));
            intent.setClass(UnityPlayer.currentActivity, ImageActivity.class);
            UnityPlayer.currentActivity.startActivity(intent);
        }
    }

    /* renamed from: com.p.NativeTools.4 */
    class C05694 implements Runnable {
        C05694() {
        }

        public void run() {
            IntentFilter filter = new IntentFilter();
            filter.addAction("android.intent.action.BATTERY_CHANGED");
            filter.addAction("android.intent.action.BATTERY_LOW");
            filter.addAction("android.intent.action.BATTERY_OKAY");
            UnityPlayer.currentActivity.registerReceiver(new BatteryBroadcastReciver(), filter);
        }
    }

    /* renamed from: com.p.NativeTools.5 */
    class C05705 implements Runnable {
        C05705() {
        }

        public void run() {
            IntentFilter filter = new IntentFilter();
            filter.addAction("android.net.wifi.RSSI_CHANGED");
            filter.addAction("android.net.wifi.STATE_CHANGE");
            filter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            UnityPlayer.currentActivity.registerReceiver(new NetworkBroadcastReciver(), filter);
            ((TelephonyManager) UnityPlayer.currentActivity.getSystemService("phone")).listen(new TelePhoneStateListener(), AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY);
        }
    }

    /* renamed from: com.p.NativeTools.6 */
    class C05716 implements Runnable {
        C05716() {
        }

        public void run() {
            UnityPlayer.UnitySendMessage("NativeTools", "RefreshAddressList", new PhoneContacts().loadAllContacts());
        }
    }

    static {
        isLisPowser = false;
        isLisSemaphore = false;
    }

    public static void copyTextToClipboard(String data) {
        NativeTools.safeRun(new C05661(data));
    }

    public static String getTextFromClipboard() {
        ClipboardManager clipboard = (ClipboardManager) UnityPlayer.currentActivity.getSystemService("clipboard");
        if (clipboard != null && clipboard.hasPrimaryClip() && clipboard.getPrimaryClipDescription().hasMimeType("text/plain")) {
            return clipboard.getPrimaryClip().getItemAt(0).getText().toString();
        }
        return Constants.STR_EMPTY;
    }

    public static String getLanguageEnv() {
        try {
            Locale locale = Locale.getDefault();
            return new StringBuilder(String.valueOf(locale.getLanguage().toLowerCase())).append("-").append(locale.getCountry().toUpperCase()).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return Constants.STR_EMPTY;
        }
    }

    public static int sendSMS(String infos) {
        if (infos == null) {
            return 1;
        }
        String[] ss = infos.split(":");
        if (ss == null || ss.length <= 1) {
            return 2;
        }
        NativeTools.safeRun(new C05672(ss));
        return 0;
    }

    public static void nativeGetPicture(String infos) {
        NativeTools.safeRun(new C05683(infos));
    }

    public static void getPictureCallBack(String path) {
        UnityPlayer.UnitySendMessage("NativeTools", "GetPictureCallBack", path);
    }

    public static void nativeOpenPowerListener() {
        if (!isLisPowser) {
            isLisPowser = true;
            NativeTools.safeRun(new C05694());
        }
    }

    public static void refreshPowerInfo(int power, int status) {
        UnityPlayer.UnitySendMessage("NativeTools", "RefreshPowerInfo", new StringBuilder(String.valueOf(power)).append(":").append(status).toString());
    }

    public static void openSemaphoreListener() {
        if (!isLisSemaphore) {
            isLisSemaphore = true;
            NativeTools.safeRun(new C05705());
        }
    }

    public static void refreshSemaphoreInfo(String type, int signalLevel) {
        UnityPlayer.UnitySendMessage("NativeTools", "RefreshSemaphoreInfo", new StringBuilder(String.valueOf(type)).append(":").append(String.valueOf(signalLevel)).toString());
    }

    public static void getAddressList() {
        NativeTools.safeRun(new C05716());
    }

    public static void safeRun(Runnable r) {
        UnityPlayer.currentActivity.runOnUiThread(r);
    }
}
