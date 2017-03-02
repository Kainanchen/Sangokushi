package com.zkunity.core;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.util.Base64;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.igexin.download.Downloads;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.PushManager;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.unity3d.player.UnityPlayer;
import com.zkunity.app.AppManager;
import com.zkunity.app.ResourceIDs;
import com.zkunity.config.MConfig;
import com.zkunity.core.ImageSelectDialog.OnDataListener;
import com.zkunity.info.MobileInfoUtil;
import com.zkunity.log.ZLogger;
import com.zkunity.model.MJSONObject;
import com.zkunity.sdk.MUnityPlayerProxy;
import com.zkunity.sdk.ZKReqEvent;
import com.zkunity.sdk.ZKResEvent;

public class ZKManager {
    private static ZKManager manager;
    private String selectType;

    /* renamed from: com.zkunity.core.ZKManager.10 */
    class AnonymousClass10 implements Runnable {
        private final /* synthetic */ ZKReqEvent val$reqEvent;

        AnonymousClass10(ZKReqEvent zKReqEvent) {
            this.val$reqEvent = zKReqEvent;
        }

        public void run() {
            boolean z = true;
            SDKManager manager = SDKManager.getManager();
            String string = this.val$reqEvent.getString("bmp");
            if (this.val$reqEvent.getInt("isTimelineCb") != 1) {
                z = false;
            }
            manager.sendWXImage(string, z);
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.11 */
    class AnonymousClass11 implements Runnable {
        private final /* synthetic */ ZKReqEvent val$reqEvent;

        AnonymousClass11(ZKReqEvent zKReqEvent) {
            this.val$reqEvent = zKReqEvent;
        }

        public void run() {
            boolean z = true;
            SDKManager manager = SDKManager.getManager();
            String string = this.val$reqEvent.getString(SocialConstants.PARAM_TITLE);
            String string2 = this.val$reqEvent.getString(SocialConstants.PARAM_APP_DESC);
            String string3 = this.val$reqEvent.getString("extInfo");
            if (this.val$reqEvent.getInt("isTimelineCb") != 1) {
                z = false;
            }
            manager.sendWXWebpage(string, string2, string3, z, this.val$reqEvent.getString("bmp"), this.val$reqEvent.getString(SocialConstants.PARAM_URL));
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.13 */
    class AnonymousClass13 implements OnDismissListener {
        private final /* synthetic */ ZKReqEvent val$reqEvent;

        AnonymousClass13(ZKReqEvent zKReqEvent) {
            this.val$reqEvent = zKReqEvent;
        }

        public void onDismiss(DialogInterface dialog) {
            if (ZKManager.this.selectType != null && ZKManager.this.selectType.equals("NativeGallery")) {
                PayManager.getManager().startPayRequest(1, SDKManager.getManager().getSid(), this.val$reqEvent.getString(ResourceIDs.ID), SDKManager.getManager().getUid(), this.val$reqEvent.getString("roleid"));
            } else if (ZKManager.this.selectType == null || !ZKManager.this.selectType.equals("Camera")) {
                PayManager.getManager().sPayCall(0);
            } else {
                PayManager.getManager().startPayRequest(2, SDKManager.getManager().getSid(), this.val$reqEvent.getString(ResourceIDs.ID), SDKManager.getManager().getUid(), this.val$reqEvent.getString("roleid"));
            }
            ZKManager.this.selectType = null;
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.1 */
    class C07351 implements Runnable {
        private final /* synthetic */ ZKReqEvent val$req;

        C07351(ZKReqEvent zKReqEvent) {
            this.val$req = zKReqEvent;
        }

        public void run() {
            MConfig.setIsLimit(this.val$req.getBoolean("isLimit"));
            SDKManager.getManager().sLoginRelated(this.val$req.getString(Downloads.COLUMN_URI), this.val$req.toString());
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.2 */
    class C07362 implements Runnable {
        C07362() {
        }

        public void run() {
            ZKResEvent rEvent = new ZKResEvent();
            rEvent.createNewFromNull();
            rEvent.putString(Downloads.COLUMN_URI, "sInitCall");
            rEvent.putInt("r", PushConsts.SETTAG_ERROR_COUNT);
            MUnityPlayerProxy.getManager().sendMessage(rEvent);
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.3 */
    class C07373 implements Runnable {
        private final /* synthetic */ ZKReqEvent val$req;

        C07373(ZKReqEvent zKReqEvent) {
            this.val$req = zKReqEvent;
        }

        public void run() {
            String sid = this.val$req.getString("sid");
            if (!(sid == null || sid.trim().equals(Constants.STR_EMPTY))) {
                SDKManager.getManager().setSid(sid);
            }
            ZKManager.this.openSelect(this.val$req);
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.4 */
    class C07384 implements Runnable {
        private final /* synthetic */ ZKReqEvent val$reqEvent;

        C07384(ZKReqEvent zKReqEvent) {
            this.val$reqEvent = zKReqEvent;
        }

        public void run() {
            SendToQQ.sendPictureToFriends(SDKManager.getManager().getBitmapFromByte(Base64.decode(this.val$reqEvent.getString("bmp").getBytes(), 0)));
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.5 */
    class C07395 implements Runnable {
        C07395() {
        }

        public void run() {
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.6 */
    class C07406 implements Runnable {
        private final /* synthetic */ ZKReqEvent val$reqEvent;

        C07406(ZKReqEvent zKReqEvent) {
            this.val$reqEvent = zKReqEvent;
        }

        public void run() {
            SendToQQ.sendBitmapAndWordsToFriends(this.val$reqEvent.getString(SocialConstants.PARAM_TITLE), this.val$reqEvent.getString(SocialConstants.PARAM_SUMMARY), this.val$reqEvent.getString(SocialConstants.PARAM_TARGET_URL), SDKManager.getManager().getBitmapFromByte(Base64.decode(this.val$reqEvent.getString("bmp").getBytes(), 0)));
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.7 */
    class C07417 implements Runnable {
        C07417() {
        }

        public void run() {
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.8 */
    class C07428 implements Runnable {
        private final /* synthetic */ ZKReqEvent val$reqEvent;

        C07428(ZKReqEvent zKReqEvent) {
            this.val$reqEvent = zKReqEvent;
        }

        public void run() {
            SendToQQ.sendBitmapAndWordsToQzone(this.val$reqEvent.getString(SocialConstants.PARAM_TITLE), this.val$reqEvent.getString(SocialConstants.PARAM_SUMMARY), this.val$reqEvent.getString(SocialConstants.PARAM_TARGET_URL), SDKManager.getManager().getBitmapFromByte(Base64.decode(this.val$reqEvent.getString("bmp").getBytes(), 0)));
        }
    }

    /* renamed from: com.zkunity.core.ZKManager.9 */
    class C07439 implements Runnable {
        private final /* synthetic */ ZKReqEvent val$reqEvent;

        C07439(ZKReqEvent zKReqEvent) {
            this.val$reqEvent = zKReqEvent;
        }

        public void run() {
            boolean z = true;
            SDKManager manager = SDKManager.getManager();
            String string = this.val$reqEvent.getString("txt");
            if (this.val$reqEvent.getInt("isTimelineCb") != 1) {
                z = false;
            }
            manager.sendWXText(string, z);
        }
    }

    static {
        manager = new ZKManager();
    }

    private ZKManager() {
    }

    public static ZKManager getManager() {
        return manager;
    }

    public void startUp() {
        AppManager.getManager().initAppManager(UnityPlayer.currentActivity);
        PayManager.getManager().initAllPaySystem();
        PushManager.getInstance().initialize(UnityPlayer.currentActivity);
    }

    public String ZSDKPlatformRequest(String data) {
        ZKReqEvent reqEvent = new ZKReqEvent();
        reqEvent.invokeData(data);
        String uri = reqEvent.getString(Downloads.COLUMN_URI);
        if (uri.equals("sInit")) {
            sInit(reqEvent);
        } else if (uri.equals("sLogin") || uri.equals("sVaildNum") || uri.equals("visitorLogin") || uri.equals("sGetVaildNum") || uri.equals("sVaildNum") || uri.equals("sRregisterByMobileNums") || uri.equals("sUpdateMima") || uri.equals("sVisAccount") || uri.equals("getNewToken") || uri.equals("sGetExitClubVaildNum") || uri.equals("sExitClubVaildNums")) {
            MJSONObject jObject = reqEvent.getMObjs();
            if (uri.equals("sVisAccount") || uri.equals("getNewToken")) {
                jObject.putString("uid", SDKManager.getManager().getUid());
                reqEvent.replaceData(jObject);
            }
            jObject.putString("deviceId", MobileInfoUtil.getDeviceId());
            sLoginRelated(reqEvent);
        } else if (uri.equals("sBindUserAttrs")) {
            int r = SDKManager.getManager().sBindUserAttrs(reqEvent.getString("attrs"));
            rEvent = new ZKResEvent();
            rEvent.createNewFromNull();
            rEvent.putString("rs", String.valueOf(r));
            return rEvent.toString();
        } else if (uri.equals("sLogout")) {
            rEvent = new ZKResEvent();
            rEvent.createNewFromNull();
            rEvent.putString(Downloads.COLUMN_URI, "sLogoutCall");
            rEvent.putInt("rs", PushConsts.SETTAG_ERROR_COUNT);
            MUnityPlayerProxy.getManager().sendMessage(rEvent);
        } else if (uri.equals("sendWXText")) {
            sendWXText(reqEvent);
        } else if (uri.equals("sendWXImage")) {
            sendWXImage(reqEvent);
        } else if (uri.equals("sendWXWebpage")) {
            sendWXWebpage(reqEvent);
        } else if (uri.equals("sendPictureAndWordsToFriends")) {
            sendPictureAndWordsToFriends(reqEvent);
        } else if (uri.equals("sendPictureToFriends")) {
            sendPictureToFriends(reqEvent);
        } else if (uri.equals("sendPictureAndWordsToQzone")) {
            sendPictureAndWordsToQzone(reqEvent);
        } else if (uri.equals("sendBitmapAndWordsToFriends")) {
            sendBitmapAndWordsToFriends(reqEvent);
        } else if (uri.equals("sendBitmapAndWordsToQzone")) {
            sendBitmapAndWordsToQzone(reqEvent);
        } else if (uri.equals("sPay")) {
            sPay(reqEvent);
        }
        return Constants.STR_EMPTY;
    }

    private void sLoginRelated(ZKReqEvent req) {
        runSafelyOnUiThread(new C07351(req));
    }

    private void sInit(ZKReqEvent req) {
        runSafelyOnUiThread(new C07362());
    }

    private void sPay(ZKReqEvent req) {
        runSafelyOnUiThread(new C07373(req));
    }

    private void sendPictureToFriends(ZKReqEvent reqEvent) {
        runSafelyOnUiThread(new C07384(reqEvent));
    }

    private void sendPictureAndWordsToFriends(ZKReqEvent reqEvent) {
        runSafelyOnUiThread(new C07395());
    }

    private void sendBitmapAndWordsToFriends(ZKReqEvent reqEvent) {
        runSafelyOnUiThread(new C07406(reqEvent));
    }

    private void sendPictureAndWordsToQzone(ZKReqEvent reqEvent) {
        runSafelyOnUiThread(new C07417());
    }

    private void sendBitmapAndWordsToQzone(ZKReqEvent reqEvent) {
        runSafelyOnUiThread(new C07428(reqEvent));
    }

    private void sendWXText(ZKReqEvent reqEvent) {
        runSafelyOnUiThread(new C07439(reqEvent));
    }

    private void sendWXImage(ZKReqEvent reqEvent) {
        runSafelyOnUiThread(new AnonymousClass10(reqEvent));
    }

    private void sendWXWebpage(ZKReqEvent reqEvent) {
        runSafelyOnUiThread(new AnonymousClass11(reqEvent));
    }

    private void openSelect(ZKReqEvent reqEvent) {
        int style = ResourceIDs.getResourseId(UnityPlayer.currentActivity, "cp_dialog", "style");
        ImageSelectDialog dialog = new ImageSelectDialog(UnityPlayer.currentActivity, style);
        dialog.setOnCancelListener(new OnCancelListener() {
            public void onCancel(DialogInterface dialog) {
                ZKManager.this.selectType = null;
            }
        });
        dialog.setOnDismissListener(new AnonymousClass13(reqEvent));
        dialog.setOnDataListener(new OnDataListener() {
            public void onData(String type) {
                ZKManager.this.selectType = type;
            }
        });
        Window window = dialog.getWindow();
        LayoutParams wl = window.getAttributes();
        wl.x = 0;
        wl.y = window.getWindowManager().getDefaultDisplay().getHeight();
        dialog.onWindowAttributesChanged(wl);
        dialog.getWindow().setWindowAnimations(style);
        dialog.show();
    }

    protected void runSafelyOnUiThread(Runnable r) {
        AppManager.getManager().getAppActivity().runOnUiThread(r);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        SendToQQ.onActivityResult(requestCode, resultCode, data);
    }

    public void onStart() {
        ZLogger.printLog("ZKManager:onStart()");
    }

    public void onPause() {
        ZLogger.printLog("ZKManager:onPause()");
    }

    public void onResume() {
        ZLogger.printLog("ZKManager:onResume()");
    }

    public void onDestroy() {
        ZLogger.printLog("ZKManager:onDestroy()");
    }

    public void onNewIntent(Intent intent) {
        ZLogger.printLog("ZKManager:onNewIntent()");
    }
}
