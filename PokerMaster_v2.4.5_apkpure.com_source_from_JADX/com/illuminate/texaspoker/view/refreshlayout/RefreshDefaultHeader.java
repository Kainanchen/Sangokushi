package com.illuminate.texaspoker.view.refreshlayout;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.illuminate.texaspoker.view.refreshlayout.b */
public final class RefreshDefaultHeader extends FrameLayout implements RefreshUIHandler {
    public RefreshDefaultHeader(Context context) {
        super(context);
        ((AnimationDrawable) ((ImageView) LayoutInflater.from(getContext()).inflate(2130968815, this).findViewById(2131559343)).getDrawable()).start();
    }
}
