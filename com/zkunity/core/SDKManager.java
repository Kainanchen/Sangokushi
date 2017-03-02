package com.zkunity.core;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.support.v4.view.MotionEventCompat;
import android.util.Base64;
import com.android.volley.VolleyError;
import com.igexin.download.Downloads;
import com.igexin.sdk.PushConsts;
import com.igexin.sdk.PushManager;
import com.igexin.sdk.Tag;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.speedfish.pokerfishs.wxapi.WXEntryActivity;
import com.tencent.connect.common.Constants;
import com.zkunity.app.AppManager;
import com.zkunity.config.MConfig;
import com.zkunity.model.MJSONObject;
import com.zkunity.network.SyncNetworkCall;
import com.zkunity.network.SyncNetworkUtils;
import com.zkunity.sdk.MUnityPlayerProxy;
import com.zkunity.sdk.ZKResEvent;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SDKManager {
    private static SDKManager manager;
    private String sid;
    private String uid;

    private class BaseListener implements SyncNetworkCall {
        private String oUri;

        public BaseListener(String oUri) {
            this.oUri = Constants.STR_EMPTY;
            this.oUri = oUri;
        }

        public void onSuccess(int statusCode, String rs) {
            ZKResEvent rEvent = new ZKResEvent();
            MJSONObject mjObj = new MJSONObject();
            rEvent.invokeData(rs);
            mjObj.invokeData(rs);
            String uri = mjObj.getString(Downloads.COLUMN_URI);
            if (uri.equals("sRregisterByMobileNumsCall") && mjObj.getString("rs").equals(PushConsts.SEND_MESSAGE_ERROR_GENERAL)) {
                SDKManager.this.uid = mjObj.getString("uid");
                SDKManager.this.sid = mjObj.getString("sid");
                PushManager.getInstance().bindAlias(AppManager.getManager().getAppContext(), SDKManager.this.uid);
            } else if (uri.equals("sLoginCall") && mjObj.getString("rs").equals(PushConsts.SEND_MESSAGE_ERROR_GENERAL)) {
                SDKManager.this.uid = mjObj.getString("uid");
                SDKManager.this.sid = mjObj.getString("sid");
                MobileInfoManager.getManager().pushMobileInfo();
                PushManager.getInstance().bindAlias(AppManager.getManager().getAppContext(), SDKManager.this.uid);
            } else if (uri.equals("sGetNewTokenCall") && mjObj.getString("rs").equals(PushConsts.SEND_MESSAGE_ERROR_GENERAL)) {
                SDKManager.this.uid = mjObj.getString("uid");
                SDKManager.this.sid = mjObj.getString("sid");
                PushManager.getInstance().bindAlias(AppManager.getManager().getAppContext(), SDKManager.this.uid);
            }
            rEvent.putString(Downloads.COLUMN_URI, uri);
            MUnityPlayerProxy.getManager().sendMessage(rEvent);
        }

        public void onFailure(int statusCode, VolleyError error) {
            ZKResEvent rEvent = new ZKResEvent();
            rEvent.createNewFromNull();
            if (this.oUri.equals("sGetNewTokenCall")) {
                rEvent.putString(Downloads.COLUMN_URI, "sGetNewTokenCall");
                rEvent.putString("rs", "-3");
            } else {
                rEvent.putString(Downloads.COLUMN_URI, "sNonetwork");
                rEvent.putString("oUri", this.oUri);
                rEvent.putString("rs", "-3");
            }
            MUnityPlayerProxy.getManager().sendMessage(rEvent);
        }
    }

    static {
        manager = new SDKManager();
    }

    private SDKManager() {
    }

    public static SDKManager getManager() {
        return manager;
    }

    public String getUid() {
        return this.uid;
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void sendWXText(String txt, boolean isTimelineCb) {
        if (SendToWX.checkWX()) {
            WXEntryActivity.isSendToWx = true;
            WXEntryActivity.type = "sendWXText";
            if (!SendToWX.sendText(txt, isTimelineCb)) {
                WXEntryActivity.isSendToWx = false;
                WXEntryActivity.type = null;
            }
        }
    }

    public void sendWXImage(String bmp, boolean isTimelineCb) {
        if (SendToWX.checkWX()) {
            WXEntryActivity.isSendToWx = true;
            WXEntryActivity.type = "sendWXImage";
            if (!SendToWX.sendImage(getBitmapFromByte(Base64.decode(bmp.getBytes(), 0)), isTimelineCb)) {
                WXEntryActivity.isSendToWx = false;
                WXEntryActivity.type = null;
            }
        }
    }

    public void sendWXWebpage(String title, String desc, String extInfo, boolean isTimelineCb, String bmp, String url) {
        if (SendToWX.checkWX()) {
            WXEntryActivity.isSendToWx = true;
            WXEntryActivity.type = "sendWXWebpage";
            if (!SendToWX.sendWebpage(title, desc, extInfo, isTimelineCb, getBitmapFromByte(Base64.decode(bmp.getBytes(), 0)), url)) {
                WXEntryActivity.isSendToWx = false;
                WXEntryActivity.type = null;
            }
        }
    }

    public Bitmap getBitmapFromByte(byte[] temp) {
        if (temp == null) {
            return null;
        }
        Options options = new Options();
        options.inPreferredConfig = Config.ARGB_8888;
        return BitmapFactory.decodeByteArray(temp, 0, temp.length, options);
    }

    public void sLoginRelated(String fName, String msg) {
        SyncNetworkUtils.postByHttp(new StringBuilder(String.valueOf(MConfig.getString("baseUrl"))).append("plat").toString(), msg, new BaseListener(fName));
    }

    public int sBindUserAttrs(String attrs) {
        String[] tags = attrs.split(",");
        Tag[] tagParam = new Tag[tags.length];
        for (int i = 0; i < tags.length; i++) {
            Tag t = new Tag();
            t.setName(tags[i]);
            tagParam[i] = t;
        }
        return PushManager.getInstance().setTag(AppManager.getManager().getAppContext(), tagParam);
    }

    public String getMD5(String info) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(info.getBytes(AsyncHttpResponseHandler.DEFAULT_CHARSET));
            byte[] encryption = md5.digest();
            StringBuffer strBuf = new StringBuffer();
            for (int i = 0; i < encryption.length; i++) {
                if (Integer.toHexString(encryption[i] & MotionEventCompat.ACTION_MASK).length() == 1) {
                    strBuf.append(Constants.VIA_RESULT_SUCCESS).append(Integer.toHexString(encryption[i] & MotionEventCompat.ACTION_MASK));
                } else {
                    strBuf.append(Integer.toHexString(encryption[i] & MotionEventCompat.ACTION_MASK));
                }
            }
            return strBuf.toString();
        } catch (NoSuchAlgorithmException e) {
            return Constants.STR_EMPTY;
        } catch (UnsupportedEncodingException e2) {
            return Constants.STR_EMPTY;
        }
    }
}
