package com.igexin.getuiext.activity;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alipay.sdk.cons.C0167c;
import com.android.volley.DefaultRetryPolicy;
import com.igexin.getuiext.data.p034a.C0292e;
import com.igexin.getuiext.data.p034a.C0293f;
import com.igexin.getuiext.service.C0295a;
import com.igexin.getuiext.ui.C0305a;
import com.igexin.getuiext.ui.C0306b;
import com.igexin.getuiext.ui.C0308d;
import com.igexin.getuiext.ui.C0310f;
import com.igexin.getuiext.ui.promotion.C0313c;
import com.igexin.getuiext.ui.promotion.C0314d;
import com.igexin.getuiext.ui.promotion.C0317g;
import com.igexin.getuiext.ui.promotion.C0323m;
import com.igexin.getuiext.ui.promotion.UrlImageView;
import com.igexin.getuiext.util.C0334h;
import com.tencent.open.SocialConstants;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import com.ut.device.AidConstants;
import org.json.JSONException;

public class GetuiExtActivity extends Activity implements OnClickListener, OnTouchListener {
    private int f739a;
    private int f740b;
    private int f741c;
    private int f742d;
    private C0310f f743e;
    private UpgradeProgressReceiver f744f;
    private C0313c f745g;
    private RelativeLayout f746h;
    private C0292e f747i;
    private int f748j;
    private C0308d f749k;
    private ProgressBar f750l;
    private ImageView f751m;
    private TextView f752n;
    private RelativeLayout f753o;
    private String f754p;
    private int f755q;

    public class UpgradeProgressReceiver extends BroadcastReceiver {
        final /* synthetic */ GetuiExtActivity f738a;

        public UpgradeProgressReceiver(GetuiExtActivity getuiExtActivity) {
            this.f738a = getuiExtActivity;
        }

        private void m974a(int i, int i2, String str) {
            if (i == this.f738a.f748j) {
                if (i2 == -1) {
                    this.f738a.f749k = C0308d.ERROR;
                    this.f738a.m987a();
                    return;
                }
                this.f738a.f750l.setProgress(i2);
                if (i2 >= 100) {
                    this.f738a.f749k = C0308d.DOWNLOADED;
                    this.f738a.f754p = str;
                    this.f738a.m987a();
                }
            } else if (this.f738a.f745g instanceof C0314d) {
                ((C0314d) this.f738a.f745g).m1076a(i, i2, str);
            }
        }

        public void onReceive(Context context, Intent intent) {
            if ("com.igexin.getuiext.ui.upgrade_progress".equals(intent.getAction())) {
                m974a(intent.getIntExtra("download_id", -1), intent.getIntExtra("progress", 0), intent.getStringExtra("file_path"));
            }
        }
    }

    public GetuiExtActivity() {
        this.f749k = C0308d.SLEEP;
    }

    private C0292e m976a(Bundle bundle) {
        C0292e c0292e = new C0292e();
        c0292e.f = bundle.getString("logo_url");
        c0292e.j = bundle.getString("sendId");
        c0292e.k = bundle.getString("taskid");
        c0292e.a = bundle.getString(C0167c.f364e);
        c0292e.g = bundle.getString(SocialConstants.PARAM_URL);
        c0292e.f785r = bundle.getString(SocialConstants.PARAM_COMMENT);
        c0292e.f782o = bundle.getLong("diffSize");
        c0292e.i = bundle.getLong("fullSize");
        c0292e.h = bundle.getString("originalUrl");
        c0292e.b = bundle.getString("pkgname");
        c0292e.f781n = C0293f.m999a(bundle.getString("updateType"));
        c0292e.d = bundle.getInt("versionCode");
        c0292e.c = bundle.getString("versionName");
        c0292e.f780m = bundle.getInt("previous_version_code");
        return c0292e;
    }

    private C0313c m980b(Bundle bundle) {
        C0323m c0323m = C0323m.UNKNOWN;
        String string = bundle.getString("recommendType");
        if (SocialConstants.PARAM_IMG_URL.equals(string)) {
            c0323m = C0323m.IMG;
        } else if ("app".equals(string)) {
            c0323m = C0323m.APP;
        } else if ("txt".equals(string)) {
            c0323m = C0323m.TEXT;
        }
        if (c0323m == C0323m.UNKNOWN) {
            return null;
        }
        C0313c a = C0317g.m1079a(this, c0323m);
        a.m1072b(this.f747i.k);
        a.m1069a(this.f747i.j);
        try {
            a.m1074c(bundle.getString("promotion_attrs"));
            return a;
        } catch (JSONException e) {
            return null;
        }
    }

    private void m981b() {
        this.f743e = C0310f.m1054a(getApplicationContext());
        this.f739a = C0305a.m1041a(this, 10.0f);
        this.f740b = C0305a.m1041a(this, 3.0f);
        this.f741c = C0305a.m1041a(this, 2.0f);
        this.f742d = C0305a.m1041a(this, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
    }

    private void m983c() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        LayoutParams layoutParams = new LayoutParams(2003);
        i = (int) (((double) i) * 0.9d);
        layoutParams.width = i;
        this.f755q = i;
        layoutParams.height = -2;
        getWindow().setAttributes(layoutParams);
    }

    private void m984d() {
        if (this.f745g != null) {
            View a = this.f745g.m1066a(C0305a.m1041a(this, 386.0f), C0305a.m1041a(this, 146.0f));
            if (a == null) {
                Log.w("GetuiExt-UpgradeActivity", "No Promotion Applications, Hide Promotion View");
                return;
            }
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C0305a.m1041a(this, 146.0f));
            layoutParams.addRule(3, 1012);
            layoutParams.addRule(5, 1012);
            layoutParams.setMargins(this.f739a, this.f740b, this.f739a, this.f740b);
            this.f746h.addView(a, layoutParams);
        }
    }

    private void m985e() {
        String str = "package";
        str = "com.android.settings.ApplicationPkgName";
        str = "pkg";
        str = "com.android.settings";
        str = "com.android.settings.InstalledAppDetails";
        str = "android.settings.APPLICATION_DETAILS_SETTINGS";
        Intent intent = new Intent();
        int i = VERSION.SDK_INT;
        if (i >= 9) {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f747i.b, null));
        } else {
            str = i == 8 ? "pkg" : "com.android.settings.ApplicationPkgName";
            intent.setAction("android.intent.action.VIEW");
            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
            intent.putExtra(str, this.f747i.b);
        }
        startActivity(intent);
        if (this.f747i != null) {
            C0295a.m1016a((Context) this, this.f747i, 10);
        }
    }

    private RelativeLayout m986f() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setId(1012);
        View imageView = new ImageView(this);
        imageView.setScaleType(ScaleType.FIT_XY);
        imageView.setImageBitmap(this.f743e.m1059c("inc_icon_close.png"));
        relativeLayout.addView(imageView, new RelativeLayout.LayoutParams(this.f739a * 3, this.f739a * 3));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.addRule(11);
        imageView.setLayoutParams(layoutParams);
        imageView.setId(AidConstants.EVENT_REQUEST_SUCCESS);
        imageView.setOnClickListener(this);
        imageView = new TextView(this);
        imageView.setTextSize(2, 18.0f);
        imageView.setTextColor(-16777216);
        imageView.setText(this.f747i.a + "\u6b63\u5728\u5347\u7ea7");
        imageView.setEllipsize(TruncateAt.END);
        imageView.setSingleLine();
        relativeLayout.addView(imageView, 0, new RelativeLayout.LayoutParams(-1, -2));
        layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.addRule(10);
        layoutParams.addRule(0, AidConstants.EVENT_REQUEST_SUCCESS);
        layoutParams.topMargin = this.f739a;
        layoutParams.leftMargin = (this.f740b + this.f741c) + this.f741c;
        imageView.setLayoutParams(layoutParams);
        imageView.setId(AidConstants.EVENT_REQUEST_STARTED);
        View textView = new TextView(this);
        textView.setBackgroundColor(-16711936);
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, this.f742d);
        layoutParams2.topMargin = this.f740b + this.f740b;
        relativeLayout.addView(textView, 2, layoutParams2);
        layoutParams2.addRule(3, AidConstants.EVENT_REQUEST_STARTED);
        textView.setId(AidConstants.EVENT_REQUEST_FAILED);
        textView = new RelativeLayout(this);
        textView.setPadding(this.f740b, this.f740b, this.f740b, this.f740b);
        textView.setId(AidConstants.EVENT_NETWORK_ERROR);
        layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, AidConstants.EVENT_REQUEST_FAILED);
        layoutParams2.topMargin = this.f741c + this.f740b;
        relativeLayout.addView(textView, layoutParams2);
        imageView = new UrlImageView(this);
        imageView.m1060a(this.f747i.f);
        imageView.setId(1005);
        ViewGroup.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15);
        textView.addView(imageView, layoutParams3);
        if (C0293f.DIFF.equals(this.f747i.f781n)) {
            imageView = new ImageView(this);
            imageView.setImageBitmap(this.f743e.m1059c("inc_province.png"));
            layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(8, 1005);
            layoutParams3.addRule(6, 1005);
            layoutParams3.addRule(5, 1005);
            layoutParams3.addRule(7, 1005);
            textView.addView(imageView, layoutParams3);
        }
        imageView = new RelativeLayout(this);
        imageView.setId(1011);
        layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = this.f740b + this.f741c;
        textView.addView(imageView, layoutParams3);
        this.f751m = new ImageView(this);
        this.f751m.setImageBitmap(this.f743e.m1059c("inc_pause.png"));
        this.f751m.setId(1016);
        layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(14);
        imageView.addView(this.f751m, layoutParams3);
        this.f751m.setOnClickListener(this);
        this.f752n = new TextView(this);
        this.f752n.setTextColor(-16777216);
        this.f752n.setTextSize(2, 12.0f);
        this.f752n.setText("\u6682\u505c");
        this.f752n.setId(1017);
        layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, 1016);
        layoutParams3.setMargins(0, this.f740b + this.f740b, 0, 0);
        layoutParams3.addRule(14);
        imageView.addView(this.f752n, layoutParams3);
        imageView = new RelativeLayout(this);
        imageView.setPadding(this.f740b, this.f740b, this.f740b, this.f740b);
        imageView.setId(1004);
        layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(1, 1005);
        layoutParams3.addRule(15);
        layoutParams3.addRule(0, 1011);
        layoutParams3.leftMargin = this.f740b + this.f740b;
        layoutParams3.rightMargin = layoutParams3.leftMargin;
        textView.addView(imageView, layoutParams3);
        textView = new TextView(this);
        textView.setTextColor(-16777216);
        textView.setTextSize(2, 15.0f);
        textView.setText(this.f747i.a);
        textView.setEms(6);
        textView.setEllipsize(TruncateAt.END);
        textView.setSingleLine();
        textView.setId(1006);
        imageView.addView(textView, new RelativeLayout.LayoutParams(-2, -2));
        textView = new TextView(this);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(-16777216);
        textView.setSingleLine();
        textView.setEllipsize(TruncateAt.END);
        textView.setText("\u7248\u672c:" + this.f747i.c);
        textView.setId(1007);
        layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = this.f741c + this.f740b;
        layoutParams3.addRule(1, 1006);
        layoutParams3.addRule(4, 1006);
        imageView.addView(textView, layoutParams3);
        textView = new TextView(this);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(-16777216);
        textView.setId(1008);
        if (this.f747i.f781n.equals(C0293f.DIFF)) {
            textView.getPaint().setFlags(17);
        }
        float f = ((float) this.f747i.i) / 1048576.0f;
        textView.setText("\u5927\u5c0f:" + String.format("%.2f", new Object[]{Float.valueOf(f)}) + "M");
        layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, 1006);
        layoutParams3.addRule(5, 1006);
        imageView.addView(textView, layoutParams3);
        textView = new TextView(this);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(-16777216);
        textView.setSingleLine();
        textView.setId(1009);
        f = ((float) this.f747i.f782o) / 1048576.0f;
        textView.setText("\u53ea\u9700:" + String.format("%.2f", new Object[]{Float.valueOf(f)}) + "M");
        layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(1, 1008);
        layoutParams3.addRule(4, 1008);
        layoutParams3.leftMargin = this.f741c + this.f740b;
        imageView.addView(textView, layoutParams3);
        if (this.f747i.f781n.equals(C0293f.FULL)) {
            textView.setVisibility(8);
        }
        this.f750l = new ProgressBar(this, null, 16842872);
        this.f750l.setId(1010);
        this.f750l.getProgressDrawable().setColorFilter(-256, Mode.MULTIPLY);
        this.f750l.setMax(100);
        this.f750l.setProgress(0);
        ViewGroup.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, this.f740b);
        layoutParams4.addRule(3, 1008);
        layoutParams4.addRule(5, 1008);
        layoutParams4.topMargin = this.f740b;
        imageView.addView(this.f750l, layoutParams4);
        textView = new TextView(this);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(-16777216);
        textView.setLines(2);
        textView.setEllipsize(TruncateAt.END);
        textView.setText("\u66f4\u65b0\u8bf4\u660e\uff1a" + this.f747i.f785r);
        textView.setId(1013);
        layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(5, AidConstants.EVENT_NETWORK_ERROR);
        layoutParams2.addRule(3, AidConstants.EVENT_NETWORK_ERROR);
        layoutParams2.topMargin = this.f741c + this.f740b;
        layoutParams2.leftMargin = layoutParams2.topMargin;
        relativeLayout.addView(textView, layoutParams2);
        this.f753o = new RelativeLayout(this);
        this.f753o.setBackgroundColor(Color.parseColor("#8a8a8a"));
        this.f753o.setId(1018);
        layoutParams4 = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams4.addRule(3, 1013);
        layoutParams4.topMargin = this.f739a;
        relativeLayout.addView(this.f753o, layoutParams4);
        textView = new TextView(this);
        textView.setTextColor(-1);
        textView.setText("\u8fd8\u53ef\u4ee5\u8fdb\u884c\u4e0b\u5217\u64cd\u4f5c\uff1a");
        textView.setTextSize(2, 12.0f);
        textView.setId(1022);
        layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = this.f740b + this.f740b;
        layoutParams2.bottomMargin = this.f740b + this.f740b;
        layoutParams2.leftMargin = this.f740b + this.f740b;
        this.f753o.addView(textView, layoutParams2);
        textView = new Button(this);
        textView.setBackgroundDrawable(this.f743e.m1058b("inc_btn_normal.png"));
        int i = this.f755q / 9;
        textView.setText("\u7ba1\u7406\u6b64\u5e94\u7528");
        textView.setSingleLine();
        textView.setTextSize(2, 12.0f);
        textView.setId(1019);
        textView.setOnClickListener(this);
        textView.setOnTouchListener(this);
        layoutParams3 = new RelativeLayout.LayoutParams(i * 3, i);
        layoutParams3.leftMargin = i;
        layoutParams3.addRule(3, 1022);
        this.f753o.addView(textView, layoutParams3);
        textView = new Button(this);
        textView.setBackgroundDrawable(this.f743e.m1058b("inc_btn_emphasize_normal.png"));
        textView.setText("WiFi\u4e0b\u4e0b\u8f7d");
        textView.setSingleLine();
        textView.setTextSize(2, 12.0f);
        textView.setId(1020);
        textView.setOnClickListener(this);
        textView.setOnTouchListener(this);
        layoutParams3 = new RelativeLayout.LayoutParams(i * 3, i);
        layoutParams3.rightMargin = i;
        layoutParams3.addRule(3, 1022);
        layoutParams3.addRule(11);
        this.f753o.addView(textView, layoutParams3);
        textView = new View(this);
        layoutParams3 = new RelativeLayout.LayoutParams(i, this.f742d);
        layoutParams3.addRule(1, 1019);
        layoutParams3.addRule(0, 1020);
        layoutParams3.addRule(3, 1022);
        this.f753o.addView(textView, layoutParams3);
        textView = new Button(this);
        textView.setBackgroundColor(0);
        textView.getPaint().setFlags(9);
        textView.setText("\u4e0b\u6b21\u518d\u8bf4");
        textView.setTextColor(-1);
        textView.setId(1021);
        textView.setTextSize(2, 12.0f);
        layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.rightMargin = i;
        layoutParams3.addRule(3, 1020);
        layoutParams3.addRule(11);
        this.f753o.addView(textView, layoutParams3);
        textView.setOnClickListener(this);
        textView = new RelativeLayout(this);
        textView.setBackgroundDrawable(this.f743e.m1057a("inc_more.9.png"));
        textView.setId(1014);
        layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, 1018);
        relativeLayout.addView(textView, layoutParams2);
        imageView = new ImageView(this);
        imageView.setImageBitmap(this.f743e.m1059c("inc_click_down.png"));
        imageView.setId(1015);
        imageView.setOnClickListener(this);
        imageView.setScaleType(ScaleType.CENTER_INSIDE);
        layoutParams3 = new RelativeLayout.LayoutParams(32, 32);
        layoutParams3.addRule(14);
        textView.addView(imageView, layoutParams3);
        return relativeLayout;
    }

    public void m987a() {
        switch (C0284a.f756a[this.f749k.ordinal()]) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                this.f752n.setText("\u66f4\u65b0");
                this.f751m.setImageBitmap(this.f743e.m1059c("inc_update.png"));
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                this.f752n.setText("\u6682\u505c");
                this.f751m.setImageBitmap(this.f743e.m1059c("inc_pause.png"));
            case StatConstants.STAT_DB_VERSION /*3*/:
                this.f752n.setText("\u7ee7\u7eed");
                this.f751m.setImageBitmap(this.f743e.m1059c("inc_update.png"));
            case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                this.f752n.setText("\u5b89\u88c5");
                this.f751m.setImageBitmap(this.f743e.m1059c("inc_setup.png"));
            case StatAccount.PHONE_NUM_TYPE /*5*/:
                this.f752n.setText("\u6253\u5f00");
                this.f751m.setImageBitmap(this.f743e.m1059c("inc_open.png"));
            case StatAccount.EMAIL_TYPE /*6*/:
                this.f752n.setText("\u9519\u8bef");
                this.f751m.setImageBitmap(this.f743e.m1059c("inc_icon_close.png"));
            default:
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case AidConstants.EVENT_REQUEST_SUCCESS /*1001*/:
                finish();
            case 1015:
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f753o.getLayoutParams();
                ImageView imageView = (ImageView) view;
                if (layoutParams.height == 0) {
                    layoutParams.height = -2;
                    imageView.setImageBitmap(this.f743e.m1059c("inc_click_up.png"));
                } else {
                    layoutParams.height = 0;
                    imageView.setImageBitmap(this.f743e.m1059c("inc_click_down.png"));
                }
                this.f753o.setLayoutParams(layoutParams);
            case 1016:
                switch (C0284a.f756a[this.f749k.ordinal()]) {
                    case StatConstants.XG_PRO_VERSION /*1*/:
                        this.f749k = C0308d.DOWNLOADING;
                        this.f748j = C0306b.m1042a((Context) this, this.f747i, false);
                        C0295a.m1016a((Context) this, this.f747i, 3);
                        break;
                    case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                        C0306b.m1044a((Context) this, this.f748j, this.f747i);
                        this.f749k = C0308d.PAUSE;
                        break;
                    case StatConstants.STAT_DB_VERSION /*3*/:
                        C0306b.m1043a((Context) this, this.f748j, this.f747i);
                        this.f749k = C0308d.DOWNLOADING;
                        break;
                    case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                        break;
                    case StatAccount.PHONE_NUM_TYPE /*5*/:
                        C0306b.m1046a((Context) this, this.f747i.b);
                        finish();
                        break;
                    case StatAccount.EMAIL_TYPE /*6*/:
                        Toast.makeText(this, "\u4e0b\u8f7d\u5931\u8d25", 0).show();
                        break;
                }
                ((NotificationManager) getSystemService("notification")).cancel(this.f748j << 11);
                if (this.f754p != null) {
                    C0306b.m1047a(this, this.f754p, this.f748j, this.f747i);
                }
                m987a();
            case 1019:
                m985e();
            case 1020:
                if (this.f748j == -1 && !C0334h.m1118b(this)) {
                    C0306b.m1042a((Context) this, this.f747i, true);
                }
                C0295a.m1016a((Context) this, this.f747i, 11);
                finish();
            case 1021:
                C0295a.m1016a((Context) this, this.f747i, 12);
                finish();
            default:
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m981b();
        Bundle extras = getIntent().getExtras();
        this.f747i = m976a(extras);
        this.f745g = m980b(extras);
        m983c();
        C0295a.m1016a((Context) this, this.f747i, 2);
        this.f748j = -1;
        if (C0334h.m1118b(this)) {
            this.f749k = C0308d.DOWNLOADING;
            this.f748j = C0306b.m1042a((Context) this, this.f747i, true);
            C0295a.m1016a((Context) this, this.f747i, 3);
        }
        this.f746h = new RelativeLayout(this);
        Drawable a = this.f743e.m1057a("inc_bg.9.png");
        if (a != null) {
            this.f746h.setBackgroundDrawable(a);
        }
        setContentView(this.f746h, new RelativeLayout.LayoutParams(-1, -2));
        this.f746h.addView(m986f(), -1, -2);
        if (this.f745g != null) {
            m984d();
        }
    }

    protected void onDestroy() {
        C0295a.m1016a((Context) this, this.f747i, 7);
        super.onDestroy();
    }

    protected void onPause() {
        super.onPause();
        unregisterReceiver(this.f744f);
        this.f744f = null;
    }

    protected void onResume() {
        super.onResume();
        if (this.f744f == null) {
            this.f744f = new UpgradeProgressReceiver(this);
        }
        registerReceiver(this.f744f, new IntentFilter("com.igexin.getuiext.ui.upgrade_progress"));
        m987a();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        switch (view.getId()) {
            case 1019:
                if (action != 0) {
                    if (action == 3 || action == 1 || action == 4) {
                        view.setBackgroundDrawable(this.f743e.m1058b("inc_btn_normal.png"));
                        break;
                    }
                }
                view.setBackgroundDrawable(this.f743e.m1058b("inc_btn_pressed.png"));
                break;
            case 1020:
                if (action != 0) {
                    if (action == 3 || action == 1 || action == 4) {
                        view.setBackgroundDrawable(this.f743e.m1058b("inc_btn_emphasize_normal.png"));
                        break;
                    }
                }
                view.setBackgroundDrawable(this.f743e.m1058b("inc_btn_emphasize_pressed.png"));
                break;
        }
        return false;
    }
}
