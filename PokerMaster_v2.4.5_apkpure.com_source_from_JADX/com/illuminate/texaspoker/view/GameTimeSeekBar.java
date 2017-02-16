package com.illuminate.texaspoker.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import java.util.ArrayList;

public class GameTimeSeekBar extends LinearLayout {
    int f6782a;
    int f6783b;
    private ArrayList<TextView> f6784c;
    private SeekBar f6785d;

    public GameTimeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6785d = null;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6784c = new ArrayList();
        LayoutInflater.from(getContext()).inflate(2130968778, this);
        this.f6785d = (SeekBar) findViewById(2131559235);
        if (VERSION.SDK_INT >= 21) {
            this.f6785d.setSplitTrack(false);
        }
        findViewById(2131559181);
        TextView textView = (TextView) findViewById(2131559227);
        TextView textView2 = (TextView) findViewById(2131559228);
        TextView textView3 = (TextView) findViewById(2131559229);
        TextView textView4 = (TextView) findViewById(2131559230);
        TextView textView5 = (TextView) findViewById(2131559231);
        TextView textView6 = (TextView) findViewById(2131559232);
        TextView textView7 = (TextView) findViewById(2131559233);
        this.f6784c.add((TextView) findViewById(2131559226));
        this.f6784c.add(textView);
        this.f6784c.add(textView2);
        this.f6784c.add(textView3);
        this.f6784c.add(textView4);
        this.f6784c.add(textView5);
        this.f6784c.add(textView6);
        this.f6784c.add(textView7);
        this.f6785d.setMax(7);
        getResources().getDimensionPixelOffset(2131230918);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131230919);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131230917);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(2131230920);
        this.f6783b = dimensionPixelOffset2 - (dimensionPixelOffset * 2);
        this.f6782a = (dimensionPixelOffset3 - this.f6783b) / 2;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            for (int i5 = 0; i5 < 8; i5++) {
                TextView textView = (TextView) this.f6784c.get(i5);
                LayoutParams layoutParams = (LayoutParams) textView.getLayoutParams();
                layoutParams.setMargins((this.f6782a - (textView.getWidth() / 2)) + ((this.f6783b * i5) / 7), 0, 0, 0);
                textView.setLayoutParams(layoutParams);
            }
        }
    }

    public int getProgress() {
        return this.f6785d.getProgress();
    }

    public void setProgress(int i) {
        this.f6785d.setProgress(i);
        setSelectedColor(i);
    }

    public void setSelectedColor(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            TextView textView = (TextView) this.f6784c.get(i2);
            if (i != i2) {
                textView.setTextColor(-6118750);
            } else {
                textView.setTextColor(-73826);
            }
        }
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f6785d.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }
}
