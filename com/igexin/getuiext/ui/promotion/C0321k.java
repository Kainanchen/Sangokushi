package com.igexin.getuiext.ui.promotion;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.igexin.getuiext.data.p034a.C0291d;
import com.igexin.getuiext.service.C0295a;
import com.igexin.getuiext.ui.C0306b;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import com.tencent.wxop.stat.common.StatConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.igexin.getuiext.ui.promotion.k */
public class C0321k extends C0313c {
    private String f872f;
    private int f873g;
    private int f874h;
    private int f875i;
    private String f876j;
    private int f877k;
    private int f878l;
    private C0311a f879m;
    private String f880n;
    private C0291d f881o;
    private int f882p;

    public C0321k(Context context, C0323m c0323m) {
        super(context, c0323m);
        this.f873g = 15;
        this.f874h = -16777216;
        this.f876j = Constants.STR_EMPTY;
        this.f877k = 12;
        this.f878l = -16777216;
        this.f879m = C0311a.UNKNOWN;
        this.f882p = -1;
    }

    public View m1083a(int i, int i2) {
        View scrollView = new ScrollView(this.f845b);
        scrollView.setVerticalFadingEdgeEnabled(true);
        scrollView.setVerticalScrollBarEnabled(true);
        View relativeLayout = new RelativeLayout(this.f845b);
        int i3 = this.c + this.d;
        relativeLayout.setPadding(i3, i3, i3, i3);
        scrollView.addView(relativeLayout, -1, -1);
        relativeLayout.setOnClickListener(this);
        View textView = new TextView(this.f845b);
        textView.setTextColor(this.f874h);
        textView.setTextSize(2, (float) this.f873g);
        textView.setGravity(this.f875i);
        textView.setId(101);
        if (TextUtils.isEmpty(this.f872f)) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.f872f);
        }
        relativeLayout.addView(textView, new LayoutParams(-1, -2));
        textView = new TextView(this.f845b);
        textView.setTextColor(this.f878l);
        textView.setTextSize(2, (float) this.f877k);
        textView.setText(this.f876j);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.addRule(3, 101);
        layoutParams.topMargin = this.d * 2;
        relativeLayout.addView(textView, layoutParams);
        C0295a.m1017a(this.b, m1067a(), 1, m1070b(), m1073c());
        return scrollView;
    }

    protected void m1084b(View view) {
        C0295a.m1017a(this.b, m1067a(), 2, m1070b(), m1073c());
        if (this.f880n != null) {
            switch (C0322l.f883a[this.f879m.ordinal()]) {
                case StatConstants.XG_PRO_VERSION /*1*/:
                    if (this.f881o.f774g == null) {
                        return;
                    }
                    if (this.f882p == -1) {
                        this.f882p = C0306b.m1042a(this.b, this.f881o, false);
                    } else {
                        Toast.makeText(this.b, "\u5e94\u7528\u4e0b\u8f7d\u5df2\u7ecf\u5f00\u59cb\uff0c\u8bf7\u67e5\u770b\u901a\u77e5\u680f\u8fdb\u5ea6\u3002", 0).show();
                    }
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    if (!(this.f880n.startsWith("http://") || this.f880n.startsWith("https://"))) {
                        this.f880n = "http://" + this.f880n;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(this.f880n));
                    intent.setFlags(268435456);
                    try {
                        this.b.startActivity(intent);
                    } catch (Exception e) {
                    }
                default:
            }
        }
    }

    public void m1085c(String str) {
        JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
        if (jSONObject.has(SocialConstants.PARAM_TITLE)) {
            this.f872f = jSONObject.getString(SocialConstants.PARAM_TITLE);
        }
        if (jSONObject.has("titleFontSize")) {
            this.f873g = jSONObject.getInt("titleFontSize");
        }
        if (jSONObject.has("titleFontColor")) {
            try {
                this.f874h = Color.parseColor(jSONObject.getString("titleFontColor"));
            } catch (Exception e) {
                this.f874h = -16777216;
            }
        }
        if (jSONObject.has("titleAlign")) {
            String string = jSONObject.getString("titleAlign");
            if ("right".equals(string)) {
                this.f875i = 5;
            } else if ("center".equals(string)) {
                this.f875i = 17;
            } else {
                this.f875i = 3;
            }
        }
        if (jSONObject.has("content")) {
            this.f876j = jSONObject.getString("content");
        }
        if (jSONObject.has("contentFontSize")) {
            this.f877k = jSONObject.getInt("contentFontSize");
        }
        if (jSONObject.has("contentFontColor")) {
            try {
                this.f878l = Color.parseColor(jSONObject.getString("contentFontColor"));
            } catch (Exception e2) {
                this.f878l = -16777216;
            }
        }
        if (jSONObject.has(AuthActivity.ACTION_KEY)) {
            if ("download".equals(jSONObject.getString(AuthActivity.ACTION_KEY))) {
                this.f879m = C0311a.DOWNLOAD;
            } else {
                this.f879m = C0311a.OPEN_LINK;
            }
        }
        if (jSONObject.has("linkUrl")) {
            this.f880n = jSONObject.getString("linkUrl");
        }
        if (this.f879m.equals(C0311a.DOWNLOAD)) {
            this.f881o = new C0291d();
            this.f881o.a = jSONObject.getString("linkAppName");
            this.f881o.f773f = jSONObject.getString("linkAppLogo");
            this.f881o.b = jSONObject.getString("linkAppPkg");
            this.f881o.f774g = this.f880n;
        }
    }
}
