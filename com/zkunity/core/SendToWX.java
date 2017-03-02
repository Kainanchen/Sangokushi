package com.zkunity.core;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.widget.Toast;
import com.tencent.connect.common.Constants;
import com.tencent.mm.sdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.sdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.sdk.modelmsg.WXImageObject;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.WXTextObject;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.zkunity.app.AppManager;
import java.io.ByteArrayOutputStream;

public class SendToWX {
    private static IWXAPI api;

    public static boolean checkWX() {
        if (api == null) {
            api = WXAPIFactory.createWXAPI(AppManager.getManager().getAppActivity(), "wxbffae0764e6dbd19");
        }
        if (api.isWXAppInstalled() && api.isWXAppSupportAPI()) {
            return true;
        }
        Toast.makeText(AppManager.getManager().getAppActivity(), "\u672a\u5b89\u88c5\u5fae\u4fe1\u5ba2\u6237\u7aef\u6216\u8005\u5fae\u4fe1\u5ba2\u6237\u7aef\u7248\u672c\u4e0d\u652f\u6301.", 0).show();
        return false;
    }

    public static boolean sendText(String txt, boolean isTimelineCb) {
        if (txt == null || txt.trim().equals(Constants.STR_EMPTY)) {
            return false;
        }
        WXTextObject textObj = new WXTextObject();
        textObj.text = txt;
        WXMediaMessage msg = new WXMediaMessage();
        msg.mediaObject = textObj;
        msg.description = txt;
        sendTransaction(msg, isTimelineCb);
        return true;
    }

    public static boolean sendImage(Bitmap bmp, boolean isTimelineCb) {
        if (bmp == null || bmp.isRecycled()) {
            return false;
        }
        int len;
        WXImageObject imgObj = new WXImageObject(bmp);
        WXMediaMessage msg = new WXMediaMessage();
        msg.mediaObject = imgObj;
        if (bmp.getWidth() <= bmp.getHeight()) {
            len = bmp.getWidth();
        } else {
            len = bmp.getHeight();
        }
        Bitmap thumbBmp_old = Bitmap.createBitmap(bmp, 0, 0, len, len);
        bmp.recycle();
        Bitmap thumbBmp = Bitmap.createScaledBitmap(thumbBmp_old, 150, 150, true);
        thumbBmp_old.recycle();
        msg.thumbData = bmpToByteArray(thumbBmp, true);
        sendTransaction(msg, isTimelineCb);
        return true;
    }

    public static boolean sendWebpage(String title, String desc, String extInfo, boolean isTimelineCb, Bitmap bm, String url) {
        WXAppExtendObject appdata = new WXAppExtendObject();
        appdata.extInfo = "this is ext info";
        Bitmap thumbBmp = Bitmap.createScaledBitmap(bm, 40, 40, true);
        bm.recycle();
        appdata.fileData = bmpToByteArray(thumbBmp, true);
        WXMediaMessage msg = new WXMediaMessage();
        msg.title = "this is title";
        msg.description = "this is description";
        msg.mediaObject = appdata;
        Req req = new Req();
        req.transaction = buildTransaction("appdata");
        req.message = msg;
        req.scene = 0;
        api.sendReq(req);
        return true;
    }

    private static String buildTransaction(String type) {
        if (type == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return new StringBuilder(String.valueOf(type)).append(System.currentTimeMillis()).toString();
    }

    private static void sendTransaction(WXMediaMessage msg, boolean isTimelineCb) {
        int i;
        Req req = new Req();
        req.transaction = "appdata";
        req.message = msg;
        if (isTimelineCb) {
            i = 1;
        } else {
            i = 0;
        }
        req.scene = i;
        api.sendReq(req);
    }

    private static byte[] bmpToByteArray(Bitmap bmp, boolean needRecycle) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        bmp.compress(CompressFormat.PNG, 100, output);
        if (needRecycle) {
            bmp.recycle();
        }
        byte[] result = output.toByteArray();
        try {
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
