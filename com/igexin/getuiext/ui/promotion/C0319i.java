package com.igexin.getuiext.ui.promotion;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.igexin.getuiext.data.p034a.C0291d;
import com.igexin.getuiext.service.C0295a;
import com.igexin.getuiext.ui.C0306b;
import com.tencent.tauth.AuthActivity;
import com.tencent.wxop.stat.common.StatConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.igexin.getuiext.ui.promotion.i */
public class C0319i extends C0313c {
    private String f865f;
    private String f866g;
    private String f867h;
    private C0311a f868i;
    private C0291d f869j;
    private int f870k;

    public C0319i(Context context, C0323m c0323m) {
        super(context, c0323m);
        this.f868i = C0311a.UNKNOWN;
        this.f870k = -1;
    }

    public View m1080a(int i, int i2) {
        View relativeLayout = new RelativeLayout(this.f845b);
        View urlImageView = new UrlImageView(this.b);
        urlImageView.setPadding(this.d, this.d, this.d, this.d);
        urlImageView.setOnClickListener(this);
        urlImageView.setScaleType(ScaleType.FIT_CENTER);
        if (this.f866g != null) {
            urlImageView.setImageBitmap(BitmapFactory.decodeFile(this.f866g));
        } else {
            urlImageView.m1060a(this.f865f);
        }
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        layoutParams.addRule(13);
        relativeLayout.addView(urlImageView, layoutParams);
        urlImageView.setOnClickListener(this);
        C0295a.m1017a(this.b, m1067a(), 1, m1070b(), m1073c());
        return relativeLayout;
    }

    protected void m1081b(View view) {
        C0295a.m1017a(this.b, m1067a(), 2, m1070b(), m1073c());
        if (this.f867h != null) {
            switch (C0320j.f871a[this.f868i.ordinal()]) {
                case StatConstants.XG_PRO_VERSION /*1*/:
                    if (this.f869j.f774g == null) {
                        return;
                    }
                    if (this.f870k == -1) {
                        this.f870k = C0306b.m1042a(this.b, this.f869j, false);
                    } else {
                        Toast.makeText(this.b, "\u5e94\u7528\u4e0b\u8f7d\u5df2\u7ecf\u5f00\u59cb\uff0c\u8bf7\u67e5\u770b\u901a\u77e5\u680f\u8fdb\u5ea6\u3002", 0).show();
                    }
                case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                    if (!(this.f867h.startsWith("http://") || this.f867h.startsWith("https://"))) {
                        this.f867h = "http://" + this.f867h;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(this.f867h));
                    intent.setFlags(268435456);
                    try {
                        this.b.startActivity(intent);
                    } catch (Exception e) {
                    }
                default:
            }
        }
    }

    public void m1082c(String str) {
        JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
        if (jSONObject.has("imgUrl")) {
            this.f865f = jSONObject.getString("imgUrl");
        }
        if (jSONObject.has("linkUrl")) {
            this.f867h = jSONObject.getString("linkUrl");
        }
        if (jSONObject.has("imgPath")) {
            this.f866g = jSONObject.getString("imgPath");
        }
        if (jSONObject.has(AuthActivity.ACTION_KEY)) {
            this.f868i = C0311a.m1061a(jSONObject.getString(AuthActivity.ACTION_KEY));
        }
        if (this.f868i.equals(C0311a.DOWNLOAD)) {
            this.f869j = new C0291d();
            this.f869j.a = jSONObject.getString("linkAppName");
            this.f869j.b = jSONObject.getString("linkAppPkg");
            this.f869j.f773f = jSONObject.getString("linkAppLogo");
            this.f869j.f774g = this.f867h;
        }
    }
}
