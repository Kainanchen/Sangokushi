package com.igexin.getuiext.ui.promotion;

import android.content.Context;
import android.widget.ImageView;

public class UrlImageView extends ImageView {
    public UrlImageView(Context context) {
        super(context);
    }

    public void m1060a(String str) {
        setImageResource(getContext().getApplicationInfo().icon);
        new C0325o().execute(new String[]{str});
    }
}
