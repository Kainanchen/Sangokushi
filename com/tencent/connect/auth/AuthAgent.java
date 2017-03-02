package com.tencent.connect.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.webkit.CookieSyncManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.volley.DefaultRetryPolicy;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.BaseApi.TempRequestListener;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.SocialConstants;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.ThreadManager;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IRequestListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProGuard */
public class AuthAgent extends BaseApi {
    public static final String SECURE_LIB_ARM64_FILE_NAME = "libwbsafeedit_64";
    public static final String SECURE_LIB_ARM_FILE_NAME = "libwbsafeedit";
    public static String SECURE_LIB_FILE_NAME = null;
    public static String SECURE_LIB_NAME = null;
    public static final String SECURE_LIB_X86_64_FILE_NAME = "libwbsafeedit_x86_64";
    public static final String SECURE_LIB_X86_FILE_NAME = "libwbsafeedit_x86";
    private IUiListener f1495a;
    private String f1496b;
    private WeakReference<Activity> f1497c;

    /* renamed from: com.tencent.connect.auth.AuthAgent.1 */
    class ProGuard implements Runnable {
        final /* synthetic */ String f1470a;
        final /* synthetic */ IUiListener f1471b;
        final /* synthetic */ AuthAgent f1472c;

        /* renamed from: com.tencent.connect.auth.AuthAgent.1.1 */
        class ProGuard implements Runnable {
            final /* synthetic */ Activity f1468a;
            final /* synthetic */ ProGuard f1469b;

            ProGuard(ProGuard proGuard, Activity activity) {
                this.f1469b = proGuard;
                this.f1468a = activity;
            }

            public void run() {
                AuthDialog authDialog = new AuthDialog(this.f1468a, SystemUtils.ACTION_LOGIN, this.f1469b.f1470a, this.f1469b.f1471b, this.f1469b.f1472c.mToken);
                if (this.f1468a != null && !this.f1468a.isFinishing()) {
                    authDialog.show();
                }
            }
        }

        ProGuard(AuthAgent authAgent, String str, IUiListener iUiListener) {
            this.f1472c = authAgent;
            this.f1470a = str;
            this.f1471b = iUiListener;
        }

        public void run() {
            SystemUtils.extractSecureLib(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 3);
            Activity activity = (Activity) this.f1472c.f1497c.get();
            if (activity != null) {
                activity.runOnUiThread(new ProGuard(this, activity));
            }
        }
    }

    /* compiled from: ProGuard */
    private class CheckLoginListener implements IUiListener {
        IUiListener f1473a;
        final /* synthetic */ AuthAgent f1474b;

        public CheckLoginListener(AuthAgent authAgent, IUiListener iUiListener) {
            this.f1474b = authAgent;
            this.f1473a = iUiListener;
        }

        public void onComplete(Object obj) {
            if (obj == null) {
                com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.AuthAgent", "CheckLoginListener response data is null");
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            try {
                int i = jSONObject.getInt("ret");
                Object string = i == 0 ? "success" : jSONObject.getString(SocialConstants.PARAM_SEND_MSG);
                if (this.f1473a != null) {
                    this.f1473a.onComplete(new JSONObject().put("ret", i).put(SocialConstants.PARAM_SEND_MSG, string));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.AuthAgent", "CheckLoginListener response data format error");
            }
        }

        public void onError(UiError uiError) {
            if (this.f1473a != null) {
                this.f1473a.onError(uiError);
            }
        }

        public void onCancel() {
            if (this.f1473a != null) {
                this.f1473a.onCancel();
            }
        }
    }

    /* compiled from: ProGuard */
    private class FeedConfirmListener implements IUiListener {
        IUiListener f1486a;
        final /* synthetic */ AuthAgent f1487b;
        private final String f1488c;
        private final String f1489d;
        private final String f1490e;

        /* compiled from: ProGuard */
        private abstract class ButtonListener implements OnClickListener {
            Dialog f1475d;
            final /* synthetic */ FeedConfirmListener f1476e;

            ButtonListener(FeedConfirmListener feedConfirmListener, Dialog dialog) {
                this.f1476e = feedConfirmListener;
                this.f1475d = dialog;
            }
        }

        /* renamed from: com.tencent.connect.auth.AuthAgent.FeedConfirmListener.1 */
        class ProGuard extends ButtonListener {
            final /* synthetic */ IUiListener f1477a;
            final /* synthetic */ Object f1478b;
            final /* synthetic */ FeedConfirmListener f1479c;

            ProGuard(FeedConfirmListener feedConfirmListener, Dialog dialog, IUiListener iUiListener, Object obj) {
                this.f1479c = feedConfirmListener;
                this.f1477a = iUiListener;
                this.f1478b = obj;
                super(feedConfirmListener, dialog);
            }

            public void onClick(View view) {
                this.f1479c.m1942a();
                if (this.d != null && this.d.isShowing()) {
                    this.d.dismiss();
                }
                if (this.f1477a != null) {
                    this.f1477a.onComplete(this.f1478b);
                }
            }
        }

        /* renamed from: com.tencent.connect.auth.AuthAgent.FeedConfirmListener.2 */
        class ProGuard extends ButtonListener {
            final /* synthetic */ IUiListener f1480a;
            final /* synthetic */ Object f1481b;
            final /* synthetic */ FeedConfirmListener f1482c;

            ProGuard(FeedConfirmListener feedConfirmListener, Dialog dialog, IUiListener iUiListener, Object obj) {
                this.f1482c = feedConfirmListener;
                this.f1480a = iUiListener;
                this.f1481b = obj;
                super(feedConfirmListener, dialog);
            }

            public void onClick(View view) {
                if (this.d != null && this.d.isShowing()) {
                    this.d.dismiss();
                }
                if (this.f1480a != null) {
                    this.f1480a.onComplete(this.f1481b);
                }
            }
        }

        /* renamed from: com.tencent.connect.auth.AuthAgent.FeedConfirmListener.3 */
        class ProGuard implements OnCancelListener {
            final /* synthetic */ IUiListener f1483a;
            final /* synthetic */ Object f1484b;
            final /* synthetic */ FeedConfirmListener f1485c;

            ProGuard(FeedConfirmListener feedConfirmListener, IUiListener iUiListener, Object obj) {
                this.f1485c = feedConfirmListener;
                this.f1483a = iUiListener;
                this.f1484b = obj;
            }

            public void onCancel(DialogInterface dialogInterface) {
                if (this.f1483a != null) {
                    this.f1483a.onComplete(this.f1484b);
                }
            }
        }

        public FeedConfirmListener(AuthAgent authAgent, IUiListener iUiListener) {
            this.f1487b = authAgent;
            this.f1488c = "sendinstall";
            this.f1489d = "installwording";
            this.f1490e = "http://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";
            this.f1486a = iUiListener;
        }

        public void onComplete(Object obj) {
            Object obj2 = null;
            if (obj != null) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    String string;
                    Object obj3;
                    Object obj4;
                    String str = Constants.STR_EMPTY;
                    try {
                        if (jSONObject.getInt("sendinstall") == 1) {
                            obj2 = 1;
                        }
                        string = jSONObject.getString("installwording");
                        obj3 = obj2;
                    } catch (JSONException e) {
                        obj4 = null;
                        com.tencent.open.p067a.ProGuard.m2121d("openSDK_LOG.AuthAgent", "FeedConfirmListener onComplete There is no value for sendinstall.");
                        String str2 = str;
                        obj3 = obj4;
                        string = str2;
                    }
                    obj4 = URLDecoder.decode(string);
                    com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.AuthAgent", " WORDING = " + obj4 + "xx");
                    if (obj3 != null && !TextUtils.isEmpty(obj4)) {
                        m1941a(obj4, this.f1486a, obj);
                    } else if (this.f1486a != null) {
                        this.f1486a.onComplete(obj);
                    }
                }
            }
        }

        private void m1941a(String str, IUiListener iUiListener, Object obj) {
            Drawable drawable = null;
            Activity activity = (Activity) this.f1487b.f1497c.get();
            if (activity != null) {
                PackageInfo packageInfo;
                Dialog dialog = new Dialog(activity);
                dialog.requestWindowFeature(1);
                PackageManager packageManager = activity.getPackageManager();
                try {
                    packageInfo = packageManager.getPackageInfo(activity.getPackageName(), 0);
                } catch (NameNotFoundException e) {
                    e.printStackTrace();
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    drawable = packageInfo.applicationInfo.loadIcon(packageManager);
                }
                OnClickListener proGuard = new ProGuard(this, dialog, iUiListener, obj);
                OnClickListener proGuard2 = new ProGuard(this, dialog, iUiListener, obj);
                Drawable colorDrawable = new ColorDrawable();
                colorDrawable.setAlpha(0);
                dialog.getWindow().setBackgroundDrawable(colorDrawable);
                dialog.setContentView(m1940a(activity, drawable, str, proGuard, proGuard2));
                dialog.setOnCancelListener(new ProGuard(this, iUiListener, obj));
                if (activity != null && !activity.isFinishing()) {
                    dialog.show();
                }
            }
        }

        private Drawable m1939a(String str, Context context) {
            Drawable createFromStream;
            IOException e;
            try {
                InputStream open = context.getApplicationContext().getAssets().open(str);
                if (open == null) {
                    return null;
                }
                if (str.endsWith(".9.png")) {
                    Bitmap decodeStream;
                    try {
                        decodeStream = BitmapFactory.decodeStream(open);
                    } catch (OutOfMemoryError e2) {
                        e2.printStackTrace();
                        decodeStream = null;
                    }
                    if (decodeStream == null) {
                        return null;
                    }
                    byte[] ninePatchChunk = decodeStream.getNinePatchChunk();
                    NinePatch.isNinePatchChunk(ninePatchChunk);
                    return new NinePatchDrawable(decodeStream, ninePatchChunk, new Rect(), null);
                }
                createFromStream = Drawable.createFromStream(open, str);
                try {
                    open.close();
                    return createFromStream;
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    return createFromStream;
                }
            } catch (IOException e4) {
                IOException iOException = e4;
                createFromStream = null;
                e = iOException;
                e.printStackTrace();
                return createFromStream;
            }
        }

        private View m1940a(Context context, Drawable drawable, String str, OnClickListener onClickListener, OnClickListener onClickListener2) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.density;
            View relativeLayout = new RelativeLayout(context);
            View imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ScaleType.FIT_XY);
            imageView.setId(1);
            int i = (int) (14.0f * f);
            i = (int) (18.0f * f);
            int i2 = (int) (6.0f * f);
            int i3 = (int) (18.0f * f);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (60.0f * f), (int) (60.0f * f));
            layoutParams.addRule(9);
            layoutParams.setMargins(0, i, i2, i3);
            relativeLayout.addView(imageView, layoutParams);
            imageView = new TextView(context);
            imageView.setText(str);
            imageView.setTextSize(14.0f);
            imageView.setGravity(3);
            imageView.setIncludeFontPadding(false);
            imageView.setPadding(0, 0, 0, 0);
            imageView.setLines(2);
            imageView.setId(5);
            imageView.setMinWidth((int) (185.0f * f));
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(1, 1);
            layoutParams2.addRule(6, 1);
            int i4 = (int) (10.0f * f);
            layoutParams2.setMargins(0, 0, (int) (5.0f * f), 0);
            relativeLayout.addView(imageView, layoutParams2);
            imageView = new View(context);
            imageView.setBackgroundColor(Color.rgb(214, 214, 214));
            imageView.setId(3);
            layoutParams2 = new RelativeLayout.LayoutParams(-2, 2);
            layoutParams2.addRule(3, 1);
            layoutParams2.addRule(5, 1);
            layoutParams2.addRule(7, 5);
            layoutParams2.setMargins(0, 0, 0, (int) (12.0f * f));
            relativeLayout.addView(imageView, layoutParams2);
            imageView = new LinearLayout(context);
            layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(5, 1);
            layoutParams2.addRule(7, 5);
            layoutParams2.addRule(3, 3);
            View button = new Button(context);
            button.setText("\u8df3\u8fc7");
            button.setBackgroundDrawable(m1939a("buttonNegt.png", context));
            button.setTextColor(Color.rgb(36, 97, 131));
            button.setTextSize(20.0f);
            button.setOnClickListener(onClickListener2);
            button.setId(4);
            LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, (int) (45.0f * f));
            layoutParams3.rightMargin = (int) (14.0f * f);
            layoutParams3.leftMargin = (int) (4.0f * f);
            layoutParams3.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
            imageView.addView(button, layoutParams3);
            button = new Button(context);
            button.setText("\u786e\u5b9a");
            button.setTextSize(20.0f);
            button.setTextColor(Color.rgb(MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK, MotionEventCompat.ACTION_MASK));
            button.setBackgroundDrawable(m1939a("buttonPost.png", context));
            button.setOnClickListener(onClickListener);
            layoutParams3 = new LinearLayout.LayoutParams(0, (int) (45.0f * f));
            layoutParams3.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
            layoutParams3.rightMargin = (int) (4.0f * f);
            imageView.addView(button, layoutParams3);
            relativeLayout.addView(imageView, layoutParams2);
            LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (279.0f * f), (int) (163.0f * f));
            relativeLayout.setPadding((int) (14.0f * f), 0, (int) (12.0f * f), (int) (12.0f * f));
            relativeLayout.setLayoutParams(layoutParams4);
            relativeLayout.setBackgroundColor(Color.rgb(247, 251, 247));
            Drawable paintDrawable = new PaintDrawable(Color.rgb(247, 251, 247));
            paintDrawable.setCornerRadius(f * 5.0f);
            relativeLayout.setBackgroundDrawable(paintDrawable);
            return relativeLayout;
        }

        protected void m1942a() {
            Bundle g = this.f1487b.composeActivityParams();
            Activity activity = (Activity) this.f1487b.f1497c.get();
            if (activity != null) {
                HttpUtils.requestAsync(this.f1487b.mToken, activity, "http://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi", g, Constants.HTTP_POST, null);
            }
        }

        public void onError(UiError uiError) {
            if (this.f1486a != null) {
                this.f1486a.onError(uiError);
            }
        }

        public void onCancel() {
            if (this.f1486a != null) {
                this.f1486a.onCancel();
            }
        }
    }

    /* compiled from: ProGuard */
    private class TokenListener implements IUiListener {
        final /* synthetic */ AuthAgent f1491a;
        private final IUiListener f1492b;
        private final boolean f1493c;
        private final Context f1494d;

        public TokenListener(AuthAgent authAgent, Context context, IUiListener iUiListener, boolean z, boolean z2) {
            this.f1491a = authAgent;
            this.f1494d = context;
            this.f1492b = iUiListener;
            this.f1493c = z;
            com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener()");
        }

        public void onComplete(Object obj) {
            com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete");
            JSONObject jSONObject = (JSONObject) obj;
            try {
                String string = jSONObject.getString(Constants.PARAM_ACCESS_TOKEN);
                String string2 = jSONObject.getString(Constants.PARAM_EXPIRES_IN);
                String string3 = jSONObject.getString(SocialConstants.PARAM_OPEN_ID);
                if (!(string == null || this.f1491a.mToken == null || string3 == null)) {
                    this.f1491a.mToken.setAccessToken(string, string2);
                    this.f1491a.mToken.setOpenId(string3);
                    com.tencent.connect.p059a.ProGuard.m1938d(this.f1494d, this.f1491a.mToken);
                }
                string = jSONObject.getString(Constants.PARAM_PLATFORM_ID);
                if (string != null) {
                    try {
                        this.f1494d.getSharedPreferences(Constants.PREFERENCE_PF, 0).edit().putString(Constants.PARAM_PLATFORM_ID, string).commit();
                    } catch (Throwable e) {
                        e.printStackTrace();
                        com.tencent.open.p067a.ProGuard.m2118b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e);
                    }
                }
                if (this.f1493c) {
                    CookieSyncManager.getInstance().sync();
                }
            } catch (Throwable e2) {
                e2.printStackTrace();
                com.tencent.open.p067a.ProGuard.m2118b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e2);
            }
            this.f1492b.onComplete(jSONObject);
            this.f1491a.releaseResource();
            com.tencent.open.p067a.ProGuard.m2116b();
        }

        public void onError(UiError uiError) {
            com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onError");
            this.f1492b.onError(uiError);
            com.tencent.open.p067a.ProGuard.m2116b();
        }

        public void onCancel() {
            com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onCancel");
            this.f1492b.onCancel();
            com.tencent.open.p067a.ProGuard.m2116b();
        }
    }

    static {
        SECURE_LIB_FILE_NAME = SECURE_LIB_ARM_FILE_NAME;
        SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
        String str = Build.CPU_ABI;
        if (str == null || str.equals(Constants.STR_EMPTY)) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_ARM_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "is arm(default) architecture");
        } else if (str.equalsIgnoreCase("arm64-v8a")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_ARM64_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
        } else if (str.equalsIgnoreCase("x86")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_X86_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "is x86 architecture");
        } else if (str.equalsIgnoreCase("x86_64")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_X86_64_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "is x86_64 architecture");
        } else {
            SECURE_LIB_FILE_NAME = SECURE_LIB_ARM_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
            com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "is arm(default) architecture");
        }
    }

    public AuthAgent(QQToken qQToken) {
        super(qQToken);
    }

    public int doLogin(Activity activity, String str, IUiListener iUiListener) {
        return doLogin(activity, str, iUiListener, false, null);
    }

    public int doLogin(Activity activity, String str, IUiListener iUiListener, boolean z, Fragment fragment) {
        this.f1496b = str;
        this.f1497c = new WeakReference(activity);
        this.f1495a = iUiListener;
        if (m1945a(activity, fragment, z)) {
            com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "OpenUi, showUi, return Constants.UI_ACTIVITY");
            com.tencent.open.p068b.ProGuard.m2146a().m2148a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SSO_LOGIN, Constants.VIA_REPORT_TYPE_SSO_LOGIN, Constants.VIA_SHARE_TYPE_TEXT, Constants.VIA_RESULT_SUCCESS, Constants.VIA_RESULT_SUCCESS, Constants.VIA_RESULT_SUCCESS);
            return 1;
        }
        com.tencent.open.p068b.ProGuard.m2146a().m2148a(this.mToken.getOpenId(), this.mToken.getAppId(), Constants.VIA_SSO_LOGIN, Constants.VIA_REPORT_TYPE_SSO_LOGIN, Constants.VIA_SHARE_TYPE_TEXT, Constants.VIA_TO_TYPE_QQ_GROUP, Constants.VIA_RESULT_SUCCESS, Constants.VIA_RESULT_SUCCESS);
        com.tencent.open.p067a.ProGuard.m2121d("openSDK_LOG.AuthAgent", "doLogin startActivity fail show dialog.");
        this.f1495a = new FeedConfirmListener(this, this.f1495a);
        return m1943a(z, this.f1495a);
    }

    public void releaseResource() {
        this.f1497c = null;
        this.f1495a = null;
    }

    private int m1943a(boolean z, IUiListener iUiListener) {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- start");
        CookieSyncManager.createInstance(Global.getContext());
        Bundle composeCGIParams = composeCGIParams();
        if (z) {
            composeCGIParams.putString("isadd", Constants.VIA_TO_TYPE_QQ_GROUP);
        }
        composeCGIParams.putString(Constants.PARAM_SCOPE, this.f1496b);
        composeCGIParams.putString(Constants.PARAM_CLIENT_ID, this.mToken.getAppId());
        if (isOEM) {
            composeCGIParams.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + "-" + "android" + "-" + registerChannel + "-" + businessId);
        } else {
            composeCGIParams.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
        }
        String str = (System.currentTimeMillis() / 1000) + Constants.STR_EMPTY;
        composeCGIParams.putString("sign", SystemUtils.getAppSignatureMD5(Global.getContext(), str));
        composeCGIParams.putString("time", str);
        composeCGIParams.putString("display", "mobile");
        composeCGIParams.putString("response_type", "token");
        composeCGIParams.putString("redirect_uri", ServerSetting.DEFAULT_REDIRECT_URI);
        composeCGIParams.putString("cancel_display", Constants.VIA_TO_TYPE_QQ_GROUP);
        composeCGIParams.putString("switch", Constants.VIA_TO_TYPE_QQ_GROUP);
        composeCGIParams.putString("status_userip", Util.getUserIp());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ServerSetting.getInstance().getEnvUrl(Global.getContext(), ServerSetting.DEFAULT_CGI_AUTHORIZE));
        stringBuilder.append(Util.encodeUrl(composeCGIParams));
        String stringBuilder2 = stringBuilder.toString();
        IUiListener tokenListener = new TokenListener(this, Global.getContext(), iUiListener, true, false);
        com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AuthAgent", "OpenUi, showDialog TDialog");
        ThreadManager.executeOnSubThread(new ProGuard(this, stringBuilder2, tokenListener));
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- end");
        return 2;
    }

    private boolean m1945a(Activity activity, Fragment fragment, boolean z) {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "startActionActivity() -- start");
        Intent targetActivityIntent = getTargetActivityIntent("com.tencent.open.agent.AgentActivity");
        if (targetActivityIntent != null) {
            Bundle composeCGIParams = composeCGIParams();
            if (z) {
                composeCGIParams.putString("isadd", Constants.VIA_TO_TYPE_QQ_GROUP);
            }
            composeCGIParams.putString(Constants.PARAM_SCOPE, this.f1496b);
            composeCGIParams.putString(Constants.PARAM_CLIENT_ID, this.mToken.getAppId());
            if (isOEM) {
                composeCGIParams.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + "-" + "android" + "-" + registerChannel + "-" + businessId);
            } else {
                composeCGIParams.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
            }
            composeCGIParams.putString("need_pay", Constants.VIA_TO_TYPE_QQ_GROUP);
            composeCGIParams.putString(Constants.KEY_APP_NAME, SystemUtils.getAppName(Global.getContext()));
            targetActivityIntent.putExtra(Constants.KEY_ACTION, SystemUtils.ACTION_LOGIN);
            targetActivityIntent.putExtra(Constants.KEY_PARAMS, composeCGIParams);
            if (hasActivityForIntent(targetActivityIntent)) {
                this.f1495a = new FeedConfirmListener(this, this.f1495a);
                UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_LOGIN, this.f1495a);
                if (fragment != null) {
                    com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AuthAgent", "startAssitActivity fragment");
                    startAssitActivity(fragment, targetActivityIntent, (int) Constants.REQUEST_LOGIN);
                } else {
                    com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.AuthAgent", "startAssitActivity activity");
                    startAssitActivity(activity, targetActivityIntent, (int) Constants.REQUEST_LOGIN);
                }
                com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "startActionActivity() -- end, found activity for loginIntent");
                com.tencent.open.p068b.ProGuard.m2146a().m2147a(0, "LOGIN_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), Constants.STR_EMPTY, Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.STR_EMPTY);
                return true;
            }
        }
        com.tencent.open.p068b.ProGuard.m2146a().m2147a(1, "LOGIN_CHECK_SDK", Constants.DEFAULT_UIN, this.mToken.getAppId(), Constants.STR_EMPTY, Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "startActionActivity fail");
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "startActionActivity() -- end, no target activity for loginIntent");
        return false;
    }

    protected void m1953a(IUiListener iUiListener) {
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "reportDAU() -- start");
        String str = "tencent&sdk&qazxc***14969%%";
        String str2 = "qzone3.4";
        Object accessToken = this.mToken.getAccessToken();
        Object openId = this.mToken.getOpenId();
        Object appId = this.mToken.getAppId();
        Object obj = Constants.STR_EMPTY;
        if (!(TextUtils.isEmpty(accessToken) || TextUtils.isEmpty(openId) || TextUtils.isEmpty(appId))) {
            obj = Util.encrypt(str + accessToken + appId + openId + str2);
        }
        if (TextUtils.isEmpty(obj)) {
            com.tencent.open.p067a.ProGuard.m2122e("openSDK_LOG.AuthAgent", "reportDAU -- encrytoken is null");
            return;
        }
        Bundle composeCGIParams = composeCGIParams();
        composeCGIParams.putString("encrytoken", obj);
        HttpUtils.requestAsync(this.mToken, Global.getContext(), "https://openmobile.qq.com/user/user_login_statis", composeCGIParams, Constants.HTTP_POST, null);
        com.tencent.open.p067a.ProGuard.m2120c("openSDK_LOG.AuthAgent", "reportDAU() -- end");
    }

    protected void m1954b(IUiListener iUiListener) {
        Bundle composeCGIParams = composeCGIParams();
        composeCGIParams.putString("reqType", "checkLogin");
        IRequestListener tempRequestListener = new TempRequestListener(new CheckLoginListener(this, iUiListener));
        HttpUtils.requestAsync(this.mToken, Global.getContext(), "https://openmobile.qq.com/v3/user/get_info", composeCGIParams, Constants.HTTP_GET, tempRequestListener);
    }
}
