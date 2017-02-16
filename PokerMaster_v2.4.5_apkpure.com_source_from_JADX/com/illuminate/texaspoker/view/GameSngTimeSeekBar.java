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

public class GameSngTimeSeekBar extends LinearLayout {
    int f6778a;
    int f6779b;
    private ArrayList<TextView> f6780c;
    private SeekBar f6781d;

    public GameSngTimeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6781d = null;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6780c = new ArrayList();
        LayoutInflater.from(getContext()).inflate(2130968828, this);
        this.f6781d = (SeekBar) findViewById(2131559235);
        if (VERSION.SDK_INT >= 21) {
            this.f6781d.setSplitTrack(false);
        }
        findViewById(2131559181);
        TextView textView = (TextView) findViewById(2131559227);
        TextView textView2 = (TextView) findViewById(2131559228);
        TextView textView3 = (TextView) findViewById(2131559229);
        this.f6780c.add((TextView) findViewById(2131559226));
        this.f6780c.add(textView);
        this.f6780c.add(textView2);
        this.f6780c.add(textView3);
        this.f6781d.setMax(3);
        getResources().getDimensionPixelOffset(2131230918);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131230919);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131230948);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(2131230949);
        this.f6779b = dimensionPixelOffset2 - (dimensionPixelOffset * 2);
        this.f6778a = (dimensionPixelOffset3 - this.f6779b) / 2;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            for (int i5 = 0; i5 < 4; i5++) {
                TextView textView = (TextView) this.f6780c.get(i5);
                LayoutParams layoutParams = (LayoutParams) textView.getLayoutParams();
                layoutParams.setMargins((this.f6778a - (textView.getWidth() / 2)) + ((this.f6779b * i5) / 3), 0, 0, 0);
                textView.setLayoutParams(layoutParams);
            }
        }
    }

    public int getProgress() {
        return this.f6781d.getProgress();
    }

    public void setProgress(int i) {
        this.f6781d.setProgress(i);
        setSelectedColor(i);
    }

    public void setSelectedColor(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            TextView textView = (TextView) this.f6780c.get(i2);
            if (i != i2) {
                textView.setTextColor(-6118750);
            } else {
                textView.setTextColor(-73826);
            }
        }
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f6781d.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }
}
