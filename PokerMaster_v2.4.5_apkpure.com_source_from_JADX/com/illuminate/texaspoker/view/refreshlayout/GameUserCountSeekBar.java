package com.illuminate.texaspoker.view.refreshlayout;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import java.util.ArrayList;

public class GameUserCountSeekBar extends LinearLayout {
    int f7093a;
    int f7094b;
    private int f7095c;
    private boolean f7096d;
    private ArrayList<TextView> f7097e;
    private SeekBar f7098f;
    private TextView f7099g;
    private TextView f7100h;
    private TextView f7101i;
    private TextView f7102j;
    private TextView f7103k;
    private ImageView f7104l;

    public GameUserCountSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7098f = null;
        this.f7095c = 4;
        this.f7096d = false;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f7097e = new ArrayList();
        LayoutInflater.from(getContext()).inflate(2130968771, this);
        this.f7098f = (SeekBar) findViewById(2131559188);
        if (VERSION.SDK_INT >= 21) {
            this.f7098f.setSplitTrack(false);
        }
        findViewById(2131559181);
        this.f7099g = (TextView) findViewById(2131559182);
        this.f7100h = (TextView) findViewById(2131559183);
        this.f7101i = (TextView) findViewById(2131559184);
        this.f7102j = (TextView) findViewById(2131559185);
        this.f7103k = (TextView) findViewById(2131559186);
        this.f7097e.add(this.f7099g);
        this.f7097e.add(this.f7100h);
        this.f7097e.add(this.f7101i);
        this.f7097e.add(this.f7102j);
        this.f7097e.add(this.f7103k);
        this.f7098f.setMax(this.f7095c);
        this.f7104l = (ImageView) findViewById(2131559187);
        getResources().getDimensionPixelOffset(2131230918);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131230919);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131230801);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(2131230802);
        this.f7094b = dimensionPixelOffset2 - (dimensionPixelOffset * 2);
        this.f7093a = (dimensionPixelOffset3 - this.f7094b) / 2;
        setIsSng(false);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4574a();
        }
    }

    private void m4574a() {
        for (int i = 0; i < this.f7095c + 1; i++) {
            TextView textView = (TextView) this.f7097e.get(i);
            LayoutParams layoutParams = (LayoutParams) textView.getLayoutParams();
            layoutParams.setMargins((this.f7093a - (textView.getWidth() / 2)) + ((this.f7094b * i) / this.f7095c), 0, 0, 0);
            textView.setLayoutParams(layoutParams);
        }
    }

    public void setIsSng(boolean z) {
        this.f7096d = z;
        if (z) {
            this.f7095c = 2;
            this.f7099g.setText("2");
            this.f7100h.setText("6");
            this.f7101i.setText("9");
            this.f7102j.setVisibility(4);
            this.f7103k.setVisibility(4);
            this.f7104l.setImageResource(2130903323);
        } else {
            this.f7095c = 4;
            this.f7099g.setText("2");
            this.f7100h.setText("6");
            this.f7101i.setText("7");
            this.f7102j.setText("8");
            this.f7103k.setText("9");
            this.f7102j.setVisibility(0);
            this.f7103k.setVisibility(0);
            this.f7104l.setImageResource(2130903325);
        }
        this.f7098f.setMax(this.f7095c);
        m4574a();
    }

    public int getGameUserCount() {
        int progress = getProgress();
        if (this.f7096d) {
            if (progress == 0) {
                return 2;
            }
            if (progress == 1) {
                return 6;
            }
            if (progress == 2) {
                return 9;
            }
        } else if (progress == 0) {
            return 2;
        } else {
            if (progress == 1) {
                return 6;
            }
            if (progress == 2) {
                return 7;
            }
            if (progress == 3) {
                return 8;
            }
            if (progress == 4) {
                return 9;
            }
        }
        return 0;
    }

    public int getProgress() {
        return this.f7098f.getProgress();
    }

    public void setProgress(int i) {
        int i2 = 0;
        if (this.f7096d) {
            if (i != 2) {
                if (i == 6) {
                    i2 = 1;
                } else if (i == 9) {
                    i2 = 2;
                }
            }
        } else if (i != 2) {
            if (i == 6) {
                i2 = 1;
            } else if (i == 7) {
                i2 = 2;
            } else if (i == 8) {
                i2 = 3;
            } else if (i == 9) {
                i2 = 4;
            }
        }
        this.f7098f.setProgress(i2);
        setSelectedColor(i2);
    }

    public void setSelectedColor(int i) {
        for (int i2 = 0; i2 < this.f7095c + 1; i2++) {
            TextView textView = (TextView) this.f7097e.get(i2);
            if (i != i2) {
                textView.setTextColor(-10066587);
            } else {
                textView.setTextColor(-73826);
            }
        }
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f7098f.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }
}
