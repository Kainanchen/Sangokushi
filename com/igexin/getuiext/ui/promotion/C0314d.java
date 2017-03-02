package com.igexin.getuiext.ui.promotion;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.sdk.cons.C0167c;
import com.android.volley.DefaultRetryPolicy;
import com.igexin.getuiext.data.p034a.C0288a;
import com.igexin.getuiext.data.p034a.C0291d;
import com.igexin.getuiext.service.C0295a;
import com.igexin.getuiext.service.C0297c;
import com.igexin.getuiext.ui.C0306b;
import com.igexin.getuiext.ui.C0308d;
import com.igexin.getuiext.util.C0334h;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.igexin.getuiext.ui.promotion.d */
public class C0314d extends C0313c {
    private final String f852f;
    private final int f853g;
    private final int f854h;
    private final int f855i;
    private final int f856j;
    private final int f857k;
    private ArrayList f858l;
    private SparseArray f859m;
    private RelativeLayout f860n;

    public C0314d(Context context, C0323m c0323m) {
        super(context, c0323m);
        this.f852f = "GetuiExt-PromotionApp";
        this.f853g = 201;
        this.f854h = 300;
        this.f855i = 310;
        this.f856j = 320;
        this.f857k = 4;
        this.f858l = new ArrayList();
        this.f859m = new SparseArray();
    }

    public View m1075a(int i, int i2) {
        int size = this.f858l.size();
        if (size == 0) {
            return null;
        }
        int i3 = size > 4 ? 4 : size;
        this.f860n = new RelativeLayout(this.f845b);
        size = this.d + this.c;
        this.f860n.setPadding(size, size, size, size);
        View textView = new TextView(this.f845b);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(-16777216);
        textView.setText("\u731c\u4f60\u559c\u6b22");
        textView.setId(201);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = this.c * 3;
        this.f860n.addView(textView, layoutParams);
        View linearLayout = new LinearLayout(this.f845b);
        linearLayout.setOrientation(0);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, 201);
        layoutParams2.topMargin = this.c + this.c;
        this.f860n.addView(linearLayout, layoutParams2);
        linearLayout.setWeightSum(4.0f);
        for (int i4 = 0; i4 < i3; i4++) {
            C0288a c0288a = (C0316f) this.f858l.get(i4);
            C0297c.m1021a().m1024a(c0288a.b, (C0291d) c0288a);
            View relativeLayout = new RelativeLayout(this.f845b);
            relativeLayout.setTag(c0288a);
            relativeLayout.setOnClickListener(this);
            LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
            layoutParams3.weight = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
            linearLayout.addView(relativeLayout, layoutParams3);
            View urlImageView = new UrlImageView(this.f845b);
            urlImageView.m1060a(c0288a.f);
            urlImageView.setId(i4 + 300);
            LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(this.d * 16, this.d * 16);
            layoutParams4.addRule(14);
            relativeLayout.addView(urlImageView, layoutParams4);
            View textView2 = new TextView(this.f845b);
            textView2.setTextSize(2, 6.0f);
            textView2.setPadding(this.d, this.d, this.d, this.d);
            textView2.setTextColor(-16777216);
            textView2.setText("\u70b9\u51fb\u4e0b\u8f7d");
            textView2.setGravity(17);
            textView2.setId(i4 + 310);
            textView2.setBackgroundDrawable(this.e.m1058b("inc_setup_bg.png"));
            LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams5.addRule(8, urlImageView.getId());
            layoutParams5.bottomMargin = this.d;
            layoutParams5.addRule(14);
            relativeLayout.addView(textView2, layoutParams5);
            urlImageView = new ProgressBar(this.f845b, null, 16842872);
            urlImageView.setId(i4 + 320);
            urlImageView.getProgressDrawable().setColorFilter(-256, Mode.MULTIPLY);
            urlImageView.setMax(100);
            layoutParams5 = new RelativeLayout.LayoutParams(this.d * 12, this.d * 2);
            layoutParams5.addRule(3, textView2.getId());
            layoutParams5.addRule(14);
            relativeLayout.addView(urlImageView, layoutParams5);
            urlImageView.setVisibility(4);
            textView2 = new TextView(this.f845b);
            textView2.setTextSize(2, 15.0f);
            textView2.setTextColor(-16777216);
            textView2.setText(c0288a.a);
            textView2.setSingleLine();
            textView2.setEllipsize(TruncateAt.END);
            layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams5.addRule(3, urlImageView.getId());
            layoutParams5.addRule(14);
            relativeLayout.addView(textView2, layoutParams5);
            c0288a.j = m1070b();
            c0288a.k = m1073c();
            c0288a.f862m = i4 + 1;
            C0295a.m1018a(this.f845b, C0295a.m1014a(c0288a, 1), Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP);
        }
        return this.f860n;
    }

    public void m1076a(int i, int i2, String str) {
        C0316f c0316f = (C0316f) this.f859m.get(i);
        if (c0316f != null) {
            int indexOf = this.f858l.indexOf(c0316f);
            if (i2 < 100) {
                ProgressBar progressBar = (ProgressBar) this.f860n.findViewById(indexOf + 320);
                if (progressBar != null) {
                    progressBar.setProgress(i2);
                }
            } else if (str != null && !str.equals(Constants.STR_EMPTY)) {
                c0316f.e = str;
                this.f859m.remove(i);
                c0316f.f863n = C0308d.DOWNLOADED;
                this.f860n.findViewById(indexOf + 320).setVisibility(4);
                ((TextView) this.f860n.findViewById(indexOf + 310)).setText("\u70b9\u51fb\u5b89\u88c5");
            }
        }
    }

    protected void m1077b(View view) {
        Object tag = view.getTag();
        if (tag instanceof C0316f) {
            C0288a c0288a = (C0316f) tag;
            int indexOf = this.f858l.indexOf(c0288a);
            TextView textView = (TextView) this.f860n.findViewById(indexOf + 310);
            ProgressBar progressBar = (ProgressBar) this.f860n.findViewById(indexOf + 320);
            switch (C0315e.f861a[c0288a.f863n.ordinal()]) {
                case StatConstants.XG_PRO_VERSION /*1*/:
                    int a = C0306b.m1042a(this.b, (C0291d) c0288a, false);
                    c0288a.l = a;
                    this.f859m.put(a, c0288a);
                    C0295a.m1016a(this.f845b, c0288a, 2);
                    c0288a.f863n = C0308d.DOWNLOADING;
                    progressBar.setVisibility(0);
                    textView.setText("\u70b9\u51fb\u6682\u505c");
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    C0306b.m1044a(this.b, c0288a.l, (C0291d) c0288a);
                    c0288a.f863n = C0308d.PAUSE;
                    textView.setText("\u70b9\u51fb\u7ee7\u7eed");
                case StatConstants.STAT_DB_VERSION /*3*/:
                    C0306b.m1043a(this.b, c0288a.l, c0288a);
                    c0288a.f863n = C0308d.DOWNLOADING;
                    textView.setText("\u70b9\u51fb\u6682\u505c");
                case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                    if (!TextUtils.isEmpty(c0288a.e)) {
                        C0306b.m1047a(this.b, c0288a.e, c0288a.l, c0288a);
                        ((NotificationManager) this.b.getSystemService("notification")).cancel(c0288a.l << 11);
                    }
                default:
            }
        }
    }

    public void m1078c(String str) {
        this.f858l.clear();
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("pkgname");
            if (!C0334h.m1120c(this.b, string)) {
                C0316f c0316f = new C0316f();
                c0316f.b = string;
                c0316f.f = jSONObject.getString("logo_url");
                c0316f.a = jSONObject.getString(C0167c.f364e);
                c0316f.g = jSONObject.getString(SocialConstants.PARAM_URL);
                c0316f.i = jSONObject.getLong("size");
                this.f858l.add(c0316f);
            }
        }
    }
}
