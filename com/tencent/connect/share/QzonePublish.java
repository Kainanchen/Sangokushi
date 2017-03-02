package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.util.C0201h;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.TDialog;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;

/* compiled from: ProGuard */
public class QzonePublish extends BaseApi {
    public static final String PUBLISH_TO_QZONE_APP_NAME = "appName";
    public static final String PUBLISH_TO_QZONE_IMAGE_URL = "imageUrl";
    public static final String PUBLISH_TO_QZONE_KEY_TYPE = "req_type";
    public static final String PUBLISH_TO_QZONE_SUMMARY = "summary";
    public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHMOOD = 3;
    public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO = 4;
    public static final String PUBLISH_TO_QZONE_VIDEO_DURATION = "videoDuration";
    public static final String PUBLISH_TO_QZONE_VIDEO_PATH = "videoPath";
    public static final String PUBLISH_TO_QZONE_VIDEO_SIZE = "videoSize";

    /* renamed from: com.tencent.connect.share.QzonePublish.1 */
    class ProGuard implements OnPreparedListener {
        final /* synthetic */ String f1552a;
        final /* synthetic */ Bundle f1553b;
        final /* synthetic */ Activity f1554c;
        final /* synthetic */ IUiListener f1555d;
        final /* synthetic */ QzonePublish f1556e;

        ProGuard(QzonePublish qzonePublish, String str, Bundle bundle, Activity activity, IUiListener iUiListener) {
            this.f1556e = qzonePublish;
            this.f1552a = str;
            this.f1553b = bundle;
            this.f1554c = activity;
            this.f1555d = iUiListener;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            long length = new File(this.f1552a).length();
            int duration = mediaPlayer.getDuration();
            this.f1553b.putString(QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH, this.f1552a);
            this.f1553b.putInt(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, duration);
            this.f1553b.putLong(QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, length);
            this.f1556e.m1994a(this.f1554c, this.f1553b, this.f1555d);
            com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QzonePublish", "publishToQzone() --end");
        }
    }

    /* renamed from: com.tencent.connect.share.QzonePublish.2 */
    class ProGuard implements OnErrorListener {
        final /* synthetic */ IUiListener f1557a;
        final /* synthetic */ QzonePublish f1558b;

        ProGuard(QzonePublish qzonePublish, IUiListener iUiListener) {
            this.f1558b = qzonePublish;
            this.f1557a = iUiListener;
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QzonePublish", "publishToQzone() mediaplayer onError()");
            this.f1557a.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
            return false;
        }
    }

    public QzonePublish(Context context, QQToken qQToken) {
        super(qQToken);
    }

    public void publishToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        int i = 0;
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QzonePublish", "publishToQzone() -- start");
        if (bundle == null) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_NULL_ERROR, null));
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QzonePublish", "-->publishToQzone, params is null");
            com.tencent.open.p068b.ProGuard.m2146a().m2147a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_NULL_ERROR);
        } else if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_5_9_5) < 0) {
            iUiListener.onError(new UiError(-15, Constants.MSG_PARAM_VERSION_TOO_LOW, null));
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QzonePublish", "-->publishToQzone, this is not support below qq 5.9.5");
            com.tencent.open.p068b.ProGuard.m2146a().m2147a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publicToQzone, this is not support below qq 5.9.5");
            new TDialog(activity, Constants.STR_EMPTY, getCommonDownloadQQUrl(Constants.STR_EMPTY), null, this.mToken).show();
        } else {
            String string = bundle.getString(PUBLISH_TO_QZONE_SUMMARY);
            ArrayList stringArrayList = bundle.getStringArrayList(PUBLISH_TO_QZONE_IMAGE_URL);
            Object applicationLable = Util.getApplicationLable(activity);
            if (applicationLable == null) {
                applicationLable = bundle.getString(PUBLISH_TO_QZONE_APP_NAME);
            } else if (applicationLable.length() > 20) {
                applicationLable = applicationLable.substring(0, 20) + "...";
            }
            if (!TextUtils.isEmpty(applicationLable)) {
                bundle.putString(PUBLISH_TO_QZONE_APP_NAME, applicationLable);
            }
            bundle.putString(PUBLISH_TO_QZONE_SUMMARY, string);
            int i2 = bundle.getInt(PUBLISH_TO_QZONE_KEY_TYPE);
            if (i2 == PUBLISH_TO_QZONE_TYPE_PUBLISHMOOD) {
                if (stringArrayList != null && stringArrayList.size() > 0) {
                    while (i < stringArrayList.size()) {
                        if (!Util.isValidPath((String) stringArrayList.get(i))) {
                            stringArrayList.remove(i);
                        }
                        i++;
                    }
                    bundle.putStringArrayList(PUBLISH_TO_QZONE_IMAGE_URL, stringArrayList);
                }
                m1994a(activity, bundle, iUiListener);
                com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QzonePublish", "publishToQzone() --end");
            } else if (i2 == PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO) {
                string = bundle.getString(PUBLISH_TO_QZONE_VIDEO_PATH);
                if (Util.isValidPath(string)) {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    mediaPlayer.setOnPreparedListener(new ProGuard(this, string, bundle, activity, iUiListener));
                    mediaPlayer.setOnErrorListener(new ProGuard(this, iUiListener));
                    try {
                        mediaPlayer.setDataSource(string);
                        mediaPlayer.prepareAsync();
                        return;
                    } catch (Exception e) {
                        com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QzonePublish", "publishToQzone() exception(s) occurred when preparing mediaplayer");
                        iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
                        return;
                    }
                }
                com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QzonePublish", "publishToQzone() video url invalid");
                iUiListener.onError(new UiError(-5, Constants.MSG_PUBLISH_VIDEO_ERROR, null));
            } else {
                iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
                com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QzonePublish", "publishToQzone() error--end\u8bf7\u9009\u62e9\u652f\u6301\u7684\u5206\u4eab\u7c7b\u578b");
                com.tencent.open.p068b.ProGuard.m2146a().m2147a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publishToQzone() \u8bf7\u9009\u62e9\u652f\u6301\u7684\u5206\u4eab\u7c7b\u578b");
            }
        }
    }

    private void m1994a(Activity activity, Bundle bundle, IUiListener iUiListener) {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QzonePublish", "doPublishToQzone() --start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://qzone/publish?src_type=app&version=1&file_type=news");
        ArrayList stringArrayList = bundle.getStringArrayList(PUBLISH_TO_QZONE_IMAGE_URL);
        Object string = bundle.getString(PUBLISH_TO_QZONE_SUMMARY);
        int i = bundle.getInt(PUBLISH_TO_QZONE_KEY_TYPE, PUBLISH_TO_QZONE_TYPE_PUBLISHMOOD);
        Object string2 = bundle.getString(PUBLISH_TO_QZONE_APP_NAME);
        String string3 = bundle.getString(PUBLISH_TO_QZONE_VIDEO_PATH);
        int i2 = bundle.getInt(PUBLISH_TO_QZONE_VIDEO_DURATION);
        long j = bundle.getLong(PUBLISH_TO_QZONE_VIDEO_SIZE);
        Object appId = this.mToken.getAppId();
        String openId = this.mToken.getOpenId();
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.QzonePublish", "openId:" + openId);
        if (PUBLISH_TO_QZONE_TYPE_PUBLISHMOOD == i && stringArrayList != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            int size = stringArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                stringBuffer2.append(URLEncoder.encode((String) stringArrayList.get(i3)));
                if (i3 != size - 1) {
                    stringBuffer2.append(C0201h.f510b);
                }
            }
            stringBuffer.append("&image_url=" + Base64.encodeToString(Util.getBytesUTF8(stringBuffer2.toString()), 2));
        }
        if (PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO == i) {
            stringBuffer.append("&videoPath=" + Base64.encodeToString(Util.getBytesUTF8(string3), 2));
            stringBuffer.append("&videoDuration=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(i2)), 2));
            stringBuffer.append("&videoSize=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(j)), 2));
        }
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&description=" + Base64.encodeToString(Util.getBytesUTF8(string), 2));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&app_name=" + Base64.encodeToString(Util.getBytesUTF8(string2), 2));
        }
        if (!Util.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(Util.getBytesUTF8(openId), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(i)), 2));
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + stringBuffer.toString());
        com.tencent.connect.p059a.ProGuard.m1934a(Global.getContext(), this.mToken, "requireApi", "shareToNativeQQ");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.putExtra("pkg_name", activity.getPackageName());
        if (hasActivityForIntent(intent)) {
            startAssistActivity(activity, (int) Constants.REQUEST_QZONE_SHARE, intent, false);
            com.tencent.open.p068b.ProGuard.m2146a().m2147a(0, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent success");
        } else {
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QzonePublish", "doPublishToQzone() target activity not found");
            com.tencent.open.p068b.ProGuard.m2146a().m2147a(1, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
        }
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG", "doPublishToQzone() --end");
    }
}
