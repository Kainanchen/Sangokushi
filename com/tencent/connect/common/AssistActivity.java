package com.tencent.connect.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.open.SocialConstants;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONObject;

/* compiled from: ProGuard */
public class AssistActivity extends Activity {
    public static final String EXTRA_INTENT = "openSDK_LOG.AssistActivity.ExtraIntent";
    protected static final int FINISH_BY_TIMEOUT = 0;
    private static final String RESTART_FLAG = "RESTART_FLAG";
    private static final String TAG = "openSDK_LOG.AssistActivity";
    private boolean canFinishByTimeout;
    private boolean canStartTimeout;
    protected Handler handler;
    private boolean isRestart;

    /* renamed from: com.tencent.connect.common.AssistActivity.1 */
    class ProGuard extends Handler {
        ProGuard() {
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case AssistActivity.FINISH_BY_TIMEOUT /*0*/:
                    if (!AssistActivity.this.isFinishing()) {
                        AssistActivity.this.finish();
                    }
                default:
            }
        }
    }

    public AssistActivity() {
        this.isRestart = false;
        this.canFinishByTimeout = false;
        this.canStartTimeout = false;
        this.handler = new ProGuard();
    }

    public static Intent getAssistActivityIntent(Context context) {
        return new Intent(context, AssistActivity.class);
    }

    protected void onCreate(Bundle bundle) {
        int i;
        requestWindowFeature(1);
        super.onCreate(bundle);
        setRequestedOrientation(3);
        com.tencent.open.p067a.ProGuard.m2117b(TAG, "--onCreate--");
        if (getIntent() == null) {
            com.tencent.open.p067a.ProGuard.m2122e(TAG, "-->onCreate--getIntent() returns null");
            finish();
        }
        Intent intent = (Intent) getIntent().getParcelableExtra(EXTRA_INTENT);
        if (intent == null) {
            i = FINISH_BY_TIMEOUT;
        } else {
            i = intent.getIntExtra(Constants.KEY_REQUEST_CODE, FINISH_BY_TIMEOUT);
        }
        Bundle bundleExtra = getIntent().getBundleExtra(SystemUtils.H5_SHARE_DATA);
        if (bundle != null) {
            this.isRestart = bundle.getBoolean(RESTART_FLAG);
        }
        if (this.isRestart) {
            com.tencent.open.p067a.ProGuard.m2117b(TAG, "is restart");
        } else if (bundleExtra != null) {
            com.tencent.open.p067a.ProGuard.m2121d(TAG, "--onCreate--h5 bundle not null, will open browser");
            openBrowser(bundleExtra);
        } else if (intent != null) {
            com.tencent.open.p067a.ProGuard.m2120c(TAG, "--onCreate--activityIntent not null, will start activity, reqcode = " + i);
            if (intent.getComponent() != null) {
                this.canFinishByTimeout = false;
                startActivityForResult(intent, i);
                return;
            }
            this.canFinishByTimeout = true;
            this.canStartTimeout = false;
            startActivity(intent);
        } else {
            com.tencent.open.p067a.ProGuard.m2122e(TAG, "--onCreate--activityIntent is null");
            finish();
        }
    }

    protected void onStart() {
        com.tencent.open.p067a.ProGuard.m2117b(TAG, "-->onStart");
        super.onStart();
    }

    protected void onResume() {
        com.tencent.open.p067a.ProGuard.m2117b(TAG, "-->onResume");
        super.onResume();
        Intent intent = getIntent();
        if (!intent.getBooleanExtra(SystemUtils.IS_LOGIN, false)) {
            if (!(intent.getBooleanExtra(SystemUtils.IS_QQ_MOBILE_SHARE, false) || !this.isRestart || isFinishing())) {
                finish();
            }
            if (this.canFinishByTimeout && this.canStartTimeout) {
                this.handler.sendMessageDelayed(this.handler.obtainMessage(FINISH_BY_TIMEOUT), 200);
            }
        }
    }

    protected void onPause() {
        com.tencent.open.p067a.ProGuard.m2117b(TAG, "-->onPause");
        if (this.canFinishByTimeout) {
            if (this.canStartTimeout) {
                this.handler.removeMessages(FINISH_BY_TIMEOUT);
            } else {
                this.canStartTimeout = true;
            }
        }
        super.onPause();
    }

    protected void onStop() {
        com.tencent.open.p067a.ProGuard.m2117b(TAG, "-->onStop");
        super.onStop();
    }

    protected void onDestroy() {
        com.tencent.open.p067a.ProGuard.m2117b(TAG, "-->onDestroy");
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent) {
        com.tencent.open.p067a.ProGuard.m2120c(TAG, "--onNewIntent");
        super.onNewIntent(intent);
        intent.putExtra(Constants.KEY_ACTION, SystemUtils.ACTION_SHARE);
        setResult(-1, intent);
        if (!isFinishing()) {
            com.tencent.open.p067a.ProGuard.m2120c(TAG, "--onNewIntent--activity not finished, finish now");
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        com.tencent.open.p067a.ProGuard.m2117b(TAG, "--onSaveInstanceState--");
        bundle.putBoolean(RESTART_FLAG, true);
        super.onSaveInstanceState(bundle);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        com.tencent.open.p067a.ProGuard.m2120c(TAG, "--onActivityResult--requestCode: " + i + " | resultCode: " + i2 + "data = null ? " + (intent == null));
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            if (intent != null) {
                intent.putExtra(Constants.KEY_ACTION, SystemUtils.ACTION_LOGIN);
            }
            setResultData(i2, intent);
            finish();
        }
    }

    public void setResultData(int i, Intent intent) {
        if (intent == null) {
            com.tencent.open.p067a.ProGuard.m2121d(TAG, "--setResultData--intent is null, setResult ACTIVITY_CANCEL");
            setResult(FINISH_BY_TIMEOUT, intent);
            return;
        }
        try {
            Object stringExtra = intent.getStringExtra(Constants.KEY_RESPONSE);
            com.tencent.open.p067a.ProGuard.m2117b(TAG, "--setResultDataForLogin-- " + stringExtra);
            if (TextUtils.isEmpty(stringExtra)) {
                com.tencent.open.p067a.ProGuard.m2121d(TAG, "--setResultData--response is empty, setResult ACTIVITY_OK");
                setResult(-1, intent);
                return;
            }
            JSONObject jSONObject = new JSONObject(stringExtra);
            CharSequence optString = jSONObject.optString(SocialConstants.PARAM_OPEN_ID);
            CharSequence optString2 = jSONObject.optString(Constants.PARAM_ACCESS_TOKEN);
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                com.tencent.open.p067a.ProGuard.m2121d(TAG, "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                setResult(FINISH_BY_TIMEOUT, intent);
                return;
            }
            com.tencent.open.p067a.ProGuard.m2120c(TAG, "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
            setResult(-1, intent);
        } catch (Exception e) {
            com.tencent.open.p067a.ProGuard.m2122e(TAG, "--setResultData--parse response failed");
            e.printStackTrace();
        }
    }

    private void openBrowser(Bundle bundle) {
        String string = bundle.getString("viaShareType");
        String string2 = bundle.getString("callbackAction");
        String string3 = bundle.getString(SocialConstants.PARAM_URL);
        String string4 = bundle.getString("openId");
        String string5 = bundle.getString("appId");
        String str = Constants.STR_EMPTY;
        String str2 = Constants.STR_EMPTY;
        if (SystemUtils.QQ_SHARE_CALLBACK_ACTION.equals(string2)) {
            str = Constants.VIA_SHARE_TO_QQ;
            str2 = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        } else if (SystemUtils.QZONE_SHARE_CALLBACK_ACTION.equals(string2)) {
            str = Constants.VIA_SHARE_TO_QZONE;
            str2 = Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE;
        }
        if (Util.openBrowser(this, string3)) {
            com.tencent.open.p068b.ProGuard.m2146a().m2149a(string4, string5, str, str2, Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP, Constants.VIA_RESULT_SUCCESS, string, Constants.VIA_RESULT_SUCCESS, Constants.VIA_SSO_LOGIN, Constants.VIA_RESULT_SUCCESS);
        } else {
            IUiListener listnerWithAction = UIListenerManager.getInstance().getListnerWithAction(string2);
            if (listnerWithAction != null) {
                listnerWithAction.onError(new UiError(-6, Constants.MSG_OPEN_BROWSER_ERROR, null));
            }
            com.tencent.open.p068b.ProGuard.m2146a().m2149a(string4, string5, str, str2, Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP, Constants.VIA_TO_TYPE_QQ_GROUP, string, Constants.VIA_RESULT_SUCCESS, Constants.VIA_SSO_LOGIN, Constants.VIA_RESULT_SUCCESS);
            finish();
        }
        getIntent().removeExtra("shareH5");
    }
}
