package com.zkunity.sdk;

import android.content.Intent;
import com.unity3d.player.UnityPlayer;
import com.zkunity.core.ZKManager;
import com.zkunity.log.ZLogger;

public class MUnityPlayerProxy {
    private static final String UnityObjectName = "ZSDKCallbackObject";
    private static MUnityPlayerProxy _proxy = null;
    private static final String callFunName = "ZSDKPlatformCallBack";

    static {
        _proxy = new MUnityPlayerProxy();
    }

    private MUnityPlayerProxy() {
    }

    public static MUnityPlayerProxy getManager() {
        return _proxy;
    }

    public void onCreate() {
        ZKManager.getManager().startUp();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        ZKManager.getManager().onActivityResult(requestCode, resultCode, data);
    }

    public void onStart() {
        ZKManager.getManager().onStart();
    }

    public void onPause() {
        ZKManager.getManager().onPause();
    }

    public void onResume() {
        ZKManager.getManager().onResume();
    }

    public void onDestroy() {
        ZKManager.getManager().onResume();
    }

    public void onNewIntent(Intent intent) {
        ZKManager.getManager().onNewIntent(intent);
    }

    public String ZSDKPlatformRequest(String data) {
        return ZKManager.getManager().ZSDKPlatformRequest(data);
    }

    public void sendMessage(String value) {
        ZLogger.printLog(value);
        UnityPlayer.UnitySendMessage(UnityObjectName, callFunName, value);
    }

    public void sendMessage(ZKResEvent resEvent) {
        ZLogger.printLog(resEvent.toString());
        UnityPlayer.UnitySendMessage(UnityObjectName, callFunName, resEvent.toString());
    }
}
