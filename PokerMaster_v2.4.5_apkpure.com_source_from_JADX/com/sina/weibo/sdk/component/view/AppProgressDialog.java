package com.sina.weibo.sdk.component.view;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sina.weibo.sdk.utils.ResourceManager;

public class AppProgressDialog extends Dialog {
    private TextView info;
    private ProgressBar myBar;

    public AppProgressDialog(Context context) {
        super(context);
        setCanceledOnTouchOutside(false);
        View linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LayoutParams(ResourceManager.dp2px(context, 100), ResourceManager.dp2px(context, 100)));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        this.myBar = new ProgressBar(context);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -2);
        int dp2px = ResourceManager.dp2px(context, 20);
        layoutParams.bottomMargin = dp2px;
        layoutParams.topMargin = dp2px;
        layoutParams.leftMargin = dp2px;
        this.myBar.setLayoutParams(layoutParams);
        linearLayout.addView(this.myBar);
        this.info = new TextView(context);
        setTitle("\u63d0\u793a");
        this.info.setTextSize(2, 17.0f);
        this.info.setText("\u6b63\u5728\u5904\u7406...");
        this.info.setTextColor(-11382190);
        this.info.setGravity(16);
        layoutParams = new LayoutParams(-2, -2);
        layoutParams.leftMargin = ResourceManager.dp2px(context, 20);
        layoutParams.rightMargin = ResourceManager.dp2px(context, 20);
        this.info.setLayoutParams(layoutParams);
        linearLayout.addView(this.info);
        setContentView(linearLayout);
    }

    public void setMessage(String str) {
        this.info.setText(str);
    }
}
