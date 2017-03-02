package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.TDialog;
import com.tencent.open.utils.AsynLoadImg;
import com.tencent.open.utils.AsynLoadImgBack;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.util.ArrayList;

/* compiled from: ProGuard */
public class QQShare extends BaseApi {
    public static final int QQ_SHARE_SUMMARY_MAX_LENGTH = 60;
    public static final int QQ_SHARE_TITLE_MAX_LENGTH = 45;
    public static final String SHARE_TO_QQ_APP_NAME = "appName";
    public static final String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final int SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN = 1;
    public static final int SHARE_TO_QQ_FLAG_QZONE_ITEM_HIDE = 2;
    public static final String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final String SHARE_TO_QQ_KEY_TYPE = "req_type";
    public static final String SHARE_TO_QQ_SITE = "site";
    public static final String SHARE_TO_QQ_SUMMARY = "summary";
    public static final String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final String SHARE_TO_QQ_TITLE = "title";
    public static final int SHARE_TO_QQ_TYPE_APP = 6;
    public static final int SHARE_TO_QQ_TYPE_AUDIO = 2;
    public static final int SHARE_TO_QQ_TYPE_DEFAULT = 1;
    public static final int SHARE_TO_QQ_TYPE_IMAGE = 5;
    public String mViaShareQQType;

    /* renamed from: com.tencent.connect.share.QQShare.1 */
    class ProGuard implements AsynLoadImgBack {
        final /* synthetic */ Bundle f1540a;
        final /* synthetic */ String f1541b;
        final /* synthetic */ String f1542c;
        final /* synthetic */ IUiListener f1543d;
        final /* synthetic */ Activity f1544e;
        final /* synthetic */ QQShare f1545f;

        ProGuard(QQShare qQShare, Bundle bundle, String str, String str2, IUiListener iUiListener, Activity activity) {
            this.f1545f = qQShare;
            this.f1540a = bundle;
            this.f1541b = str;
            this.f1542c = str2;
            this.f1543d = iUiListener;
            this.f1544e = activity;
        }

        public void saved(int i, String str) {
            if (i == 0) {
                this.f1540a.putString(QQShare.SHARE_TO_QQ_IMAGE_LOCAL_URL, str);
            } else if (TextUtils.isEmpty(this.f1541b) && TextUtils.isEmpty(this.f1542c)) {
                if (this.f1543d != null) {
                    this.f1543d.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                    com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: \u83b7\u53d6\u5206\u4eab\u56fe\u7247\u5931\u8d25!");
                }
                com.tencent.open.p068b.ProGuard.m2146a().m2147a(QQShare.SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f1545f.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, QQShare.SHARE_TO_QQ_TYPE_DEFAULT, Constants.MSG_SHARE_GETIMG_ERROR);
                return;
            }
            this.f1545f.m1993b(this.f1544e, this.f1540a, this.f1543d);
        }

        public void batchSaved(int i, ArrayList<String> arrayList) {
        }
    }

    /* renamed from: com.tencent.connect.share.QQShare.2 */
    class ProGuard implements AsynLoadImgBack {
        final /* synthetic */ Bundle f1546a;
        final /* synthetic */ String f1547b;
        final /* synthetic */ String f1548c;
        final /* synthetic */ IUiListener f1549d;
        final /* synthetic */ Activity f1550e;
        final /* synthetic */ QQShare f1551f;

        ProGuard(QQShare qQShare, Bundle bundle, String str, String str2, IUiListener iUiListener, Activity activity) {
            this.f1551f = qQShare;
            this.f1546a = bundle;
            this.f1547b = str;
            this.f1548c = str2;
            this.f1549d = iUiListener;
            this.f1550e = activity;
        }

        public void saved(int i, String str) {
            if (i == 0) {
                this.f1546a.putString(QQShare.SHARE_TO_QQ_IMAGE_LOCAL_URL, str);
            } else if (TextUtils.isEmpty(this.f1547b) && TextUtils.isEmpty(this.f1548c)) {
                if (this.f1549d != null) {
                    this.f1549d.onError(new UiError(-6, Constants.MSG_SHARE_GETIMG_ERROR, null));
                    com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QQShare", "shareToMobileQQ -- error: \u83b7\u53d6\u5206\u4eab\u56fe\u7247\u5931\u8d25!");
                }
                com.tencent.open.p068b.ProGuard.m2146a().m2147a(QQShare.SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.f1551f.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, QQShare.SHARE_TO_QQ_TYPE_DEFAULT, Constants.MSG_SHARE_GETIMG_ERROR);
                return;
            }
            this.f1551f.m1993b(this.f1550e, this.f1546a, this.f1549d);
        }

        public void batchSaved(int i, ArrayList<String> arrayList) {
        }
    }

    public QQShare(Context context, QQToken qQToken) {
        super(qQToken);
        this.mViaShareQQType = Constants.STR_EMPTY;
    }

    public void shareToQQ(Activity activity, Bundle bundle, IUiListener iUiListener) {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "shareToQQ() -- start.");
        String string = bundle.getString(SHARE_TO_QQ_IMAGE_URL);
        String string2 = bundle.getString(SHARE_TO_QQ_TITLE);
        String string3 = bundle.getString(SHARE_TO_QQ_SUMMARY);
        String string4 = bundle.getString(SHARE_TO_QQ_TARGET_URL);
        String string5 = bundle.getString(SHARE_TO_QQ_IMAGE_LOCAL_URL);
        int i = bundle.getInt(SHARE_TO_QQ_KEY_TYPE, SHARE_TO_QQ_TYPE_DEFAULT);
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "shareToQQ -- type: " + i);
        switch (i) {
            case SHARE_TO_QQ_TYPE_DEFAULT /*1*/:
                this.mViaShareQQType = Constants.VIA_TO_TYPE_QQ_GROUP;
                break;
            case SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                this.mViaShareQQType = Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP;
                break;
            case SHARE_TO_QQ_TYPE_IMAGE /*5*/:
                this.mViaShareQQType = Constants.VIA_SSO_LOGIN;
                break;
            case SHARE_TO_QQ_TYPE_APP /*6*/:
                this.mViaShareQQType = Constants.VIA_TO_TYPE_QZONE;
                break;
        }
        if (i == SHARE_TO_QQ_TYPE_APP) {
            if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_5_0_0) < 0) {
                iUiListener.onError(new UiError(-15, Constants.MSG_PARAM_APPSHARE_TOO_LOW, null));
                com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QQShare", "shareToQQ, app share is not support below qq5.0.");
                com.tencent.open.p068b.ProGuard.m2146a().m2147a(SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, SHARE_TO_QQ_TYPE_DEFAULT, "shareToQQ, app share is not support below qq5.0.");
                return;
            }
            string4 = ServerSetting.APP_DETAIL_PAGE;
            Object[] objArr = new Object[SHARE_TO_QQ_TYPE_AUDIO];
            objArr[0] = this.mToken.getAppId();
            objArr[SHARE_TO_QQ_TYPE_DEFAULT] = "mqq";
            string4 = String.format(string4, objArr);
            bundle.putString(SHARE_TO_QQ_TARGET_URL, string4);
        }
        if (Util.hasSDCard() || SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_5_0) >= 0) {
            if (i == SHARE_TO_QQ_TYPE_IMAGE) {
                if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_3_0) < 0) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_QQ_VERSION_ERROR, null));
                    com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QQShare", "shareToQQ, version below 4.3 is not support.");
                    com.tencent.open.p068b.ProGuard.m2146a().m2147a(SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, SHARE_TO_QQ_TYPE_DEFAULT, "shareToQQ, version below 4.3 is not support.");
                    return;
                } else if (!Util.fileExists(string5)) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                    com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QQShare", "shareToQQ -- error: \u975e\u6cd5\u7684\u56fe\u7247\u5730\u5740!");
                    com.tencent.open.p068b.ProGuard.m2146a().m2147a(SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, SHARE_TO_QQ_TYPE_DEFAULT, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR);
                    return;
                }
            }
            if (i != SHARE_TO_QQ_TYPE_IMAGE) {
                if (TextUtils.isEmpty(string4) || !(string4.startsWith("http://") || string4.startsWith("https://"))) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_ERROR, null));
                    com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QQShare", "shareToQQ, targetUrl is empty or illegal..");
                    com.tencent.open.p068b.ProGuard.m2146a().m2147a(SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, SHARE_TO_QQ_TYPE_DEFAULT, "shareToQQ, targetUrl is empty or illegal..");
                    return;
                } else if (TextUtils.isEmpty(string2)) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_TITLE_NULL_ERROR, null));
                    com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QQShare", "shareToQQ, title is empty.");
                    com.tencent.open.p068b.ProGuard.m2146a().m2147a(SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, SHARE_TO_QQ_TYPE_DEFAULT, "shareToQQ, title is empty.");
                    return;
                }
            }
            if (TextUtils.isEmpty(string) || string.startsWith("http://") || string.startsWith("https://") || new File(string).exists()) {
                if (!TextUtils.isEmpty(string2) && string2.length() > QQ_SHARE_TITLE_MAX_LENGTH) {
                    bundle.putString(SHARE_TO_QQ_TITLE, Util.subString(string2, QQ_SHARE_TITLE_MAX_LENGTH, null, null));
                }
                if (!TextUtils.isEmpty(string3) && string3.length() > QQ_SHARE_SUMMARY_MAX_LENGTH) {
                    bundle.putString(SHARE_TO_QQ_SUMMARY, Util.subString(string3, QQ_SHARE_SUMMARY_MAX_LENGTH, null, null));
                }
                if (Util.isMobileQQSupportShare(activity)) {
                    com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "shareToQQ, support share");
                    m1990a(activity, bundle, iUiListener);
                } else {
                    try {
                        com.tencent.open.p067a.ProGuard.m2121d("openSDK_LOG.QQShare", "shareToQQ, don't support share, will show download dialog");
                        new TDialog(activity, Constants.STR_EMPTY, getCommonDownloadQQUrl(Constants.STR_EMPTY), null, this.mToken).show();
                    } catch (Throwable e) {
                        com.tencent.open.p067a.ProGuard.m2118b("openSDK_LOG.QQShare", " shareToQQ, TDialog.show not in main thread", e);
                        e.printStackTrace();
                        iUiListener.onError(new UiError(-6, Constants.MSG_NOT_CALL_ON_MAIN_THREAD, null));
                    }
                }
                com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "shareToQQ() -- end.");
                return;
            }
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QQShare", "shareToQQ, image url is emprty or illegal.");
            com.tencent.open.p068b.ProGuard.m2146a().m2147a(SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, SHARE_TO_QQ_TYPE_DEFAULT, "shareToQQ, image url is emprty or illegal.");
            return;
        }
        iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
        com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QQShare", "shareToQQ sdcard is null--end");
        com.tencent.open.p068b.ProGuard.m2146a().m2147a(SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, SHARE_TO_QQ_TYPE_DEFAULT, "shareToQQ sdcard is null");
    }

    private void m1990a(Activity activity, Bundle bundle, IUiListener iUiListener) {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "shareToMobileQQ() -- start.");
        String string = bundle.getString(SHARE_TO_QQ_IMAGE_URL);
        String string2 = bundle.getString(SHARE_TO_QQ_TITLE);
        String string3 = bundle.getString(SHARE_TO_QQ_SUMMARY);
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.QQShare", "shareToMobileQQ -- imageUrl: " + string);
        if (TextUtils.isEmpty(string)) {
            m1993b(activity, bundle, iUiListener);
        } else if (!Util.isValidUrl(string)) {
            bundle.putString(SHARE_TO_QQ_IMAGE_URL, null);
            if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_3_0) < 0) {
                com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is < 4.3.0 ");
                m1993b(activity, bundle, iUiListener);
            } else {
                com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is > 4.3.0 ");
                ProGuard.m2002a((Context) activity, string, new ProGuard(this, bundle, string2, string3, iUiListener, activity));
            }
        } else if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
            if (iUiListener != null) {
                iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
                com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.QQShare", Constants.MSG_SHARE_NOSD_ERROR);
            }
            com.tencent.open.p068b.ProGuard.m2146a().m2147a(SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, SHARE_TO_QQ_TYPE_DEFAULT, Constants.MSG_SHARE_NOSD_ERROR);
            return;
        } else if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_3_0) >= 0) {
            m1993b(activity, bundle, iUiListener);
        } else {
            new AsynLoadImg(activity).save(string, new ProGuard(this, bundle, string2, string3, iUiListener, activity));
        }
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "shareToMobileQQ() -- end");
    }

    private void m1993b(Activity activity, Bundle bundle, IUiListener iUiListener) {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "doShareToQQ() -- start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_fri?src_type=app&version=1&file_type=news");
        Object string = bundle.getString(SHARE_TO_QQ_IMAGE_URL);
        Object string2 = bundle.getString(SHARE_TO_QQ_TITLE);
        Object string3 = bundle.getString(SHARE_TO_QQ_SUMMARY);
        Object string4 = bundle.getString(SHARE_TO_QQ_TARGET_URL);
        Object string5 = bundle.getString(SHARE_TO_QQ_AUDIO_URL);
        int i = bundle.getInt(SHARE_TO_QQ_KEY_TYPE, SHARE_TO_QQ_TYPE_DEFAULT);
        int i2 = bundle.getInt(SHARE_TO_QQ_EXT_INT, 0);
        Object string6 = bundle.getString(SHARE_TO_QQ_EXT_STR);
        String applicationLable = Util.getApplicationLable(activity);
        if (applicationLable == null) {
            applicationLable = bundle.getString(SHARE_TO_QQ_APP_NAME);
        }
        Object string7 = bundle.getString(SHARE_TO_QQ_IMAGE_LOCAL_URL);
        Object appId = this.mToken.getAppId();
        Object openId = this.mToken.getOpenId();
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.QQShare", "doShareToQQ -- openid: " + openId);
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&image_url=" + Base64.encodeToString(Util.getBytesUTF8(string), SHARE_TO_QQ_TYPE_AUDIO));
        }
        if (!TextUtils.isEmpty(string7)) {
            stringBuffer.append("&file_data=" + Base64.encodeToString(Util.getBytesUTF8(string7), SHARE_TO_QQ_TYPE_AUDIO));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&title=" + Base64.encodeToString(Util.getBytesUTF8(string2), SHARE_TO_QQ_TYPE_AUDIO));
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&description=" + Base64.encodeToString(Util.getBytesUTF8(string3), SHARE_TO_QQ_TYPE_AUDIO));
        }
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
        }
        if (!TextUtils.isEmpty(string4)) {
            stringBuffer.append("&url=" + Base64.encodeToString(Util.getBytesUTF8(string4), SHARE_TO_QQ_TYPE_AUDIO));
        }
        if (!TextUtils.isEmpty(applicationLable)) {
            if (applicationLable.length() > 20) {
                applicationLable = applicationLable.substring(0, 20) + "...";
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(Util.getBytesUTF8(applicationLable), SHARE_TO_QQ_TYPE_AUDIO));
        }
        if (!TextUtils.isEmpty(openId)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(Util.getBytesUTF8(openId), SHARE_TO_QQ_TYPE_AUDIO));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&audioUrl=" + Base64.encodeToString(Util.getBytesUTF8(string5), SHARE_TO_QQ_TYPE_AUDIO));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(i)), SHARE_TO_QQ_TYPE_AUDIO));
        if (!TextUtils.isEmpty(string6)) {
            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(Util.getBytesUTF8(string6), SHARE_TO_QQ_TYPE_AUDIO));
        }
        stringBuffer.append("&cflag=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(i2)), SHARE_TO_QQ_TYPE_AUDIO));
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.QQShare", "doShareToQQ -- url: " + stringBuffer.toString());
        String[] strArr = new String[SHARE_TO_QQ_TYPE_DEFAULT];
        strArr[0] = "shareToNativeQQ";
        com.tencent.connect.p059a.ProGuard.m1934a(Global.getContext(), this.mToken, "requireApi", strArr);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.putExtra("pkg_name", activity.getPackageName());
        if (SystemUtils.compareQQVersion(activity, SystemUtils.QQ_VERSION_NAME_4_6_0) < 0) {
            com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "doShareToQQ, qqver below 4.6.");
            if (hasActivityForIntent(intent)) {
                UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_OLD_SHARE, iUiListener);
                startAssitActivity(activity, intent, (int) Constants.REQUEST_OLD_SHARE);
            }
        } else {
            com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "doShareToQQ, qqver greater than 4.6.");
            if (UIListenerManager.getInstance().setListnerWithAction(SystemUtils.QQ_SHARE_CALLBACK_ACTION, iUiListener) != null) {
                com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "doShareToQQ, last listener is not null, cancel it.");
            }
            if (hasActivityForIntent(intent)) {
                startAssistActivity(activity, (int) Constants.REQUEST_QQ_SHARE, intent, true);
            }
        }
        if (hasActivityForIntent(intent)) {
            com.tencent.open.p068b.ProGuard.m2146a().m2149a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SHARE_TO_QQ, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP, Constants.VIA_RESULT_SUCCESS, this.mViaShareQQType, Constants.VIA_RESULT_SUCCESS, Constants.VIA_TO_TYPE_QQ_GROUP, Constants.VIA_RESULT_SUCCESS);
            com.tencent.open.p068b.ProGuard.m2146a().m2147a(0, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, SHARE_TO_QQ_TYPE_DEFAULT, Constants.STR_EMPTY);
        } else {
            com.tencent.open.p068b.ProGuard.m2146a().m2149a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SHARE_TO_QQ, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP, Constants.VIA_TO_TYPE_QQ_GROUP, this.mViaShareQQType, Constants.VIA_RESULT_SUCCESS, Constants.VIA_TO_TYPE_QQ_GROUP, Constants.VIA_RESULT_SUCCESS);
            com.tencent.open.p068b.ProGuard.m2146a().m2147a(SHARE_TO_QQ_TYPE_DEFAULT, "SHARE_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, SHARE_TO_QQ_TYPE_DEFAULT, "hasActivityForIntent fail");
        }
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.QQShare", "doShareToQQ() --end");
    }

    public void releaseResource() {
    }
}
