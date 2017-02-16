package com.illuminate.texaspoker.view;

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

public class GameAnteSeekBar extends LinearLayout {
    int f6766a;
    int f6767b;
    private int f6768c;
    private long f6769d;
    private ArrayList<TextView> f6770e;
    private SeekBar f6771f;
    private TextView f6772g;
    private TextView f6773h;
    private TextView f6774i;
    private TextView f6775j;
    private TextView f6776k;
    private ImageView f6777l;

    public GameAnteSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6771f = null;
        this.f6768c = 2;
        this.f6769d = 2;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f6770e = new ArrayList();
        LayoutInflater.from(getContext()).inflate(2130968771, this);
        this.f6771f = (SeekBar) findViewById(2131559188);
        if (VERSION.SDK_INT >= 21) {
            this.f6771f.setSplitTrack(false);
        }
        findViewById(2131559181);
        this.f6772g = (TextView) findViewById(2131559182);
        this.f6773h = (TextView) findViewById(2131559183);
        this.f6774i = (TextView) findViewById(2131559184);
        this.f6775j = (TextView) findViewById(2131559185);
        this.f6776k = (TextView) findViewById(2131559186);
        this.f6770e.add(this.f6772g);
        this.f6770e.add(this.f6773h);
        this.f6770e.add(this.f6774i);
        this.f6770e.add(this.f6775j);
        this.f6770e.add(this.f6776k);
        this.f6771f.setMax(this.f6768c);
        this.f6777l = (ImageView) findViewById(2131559187);
        getResources().getDimensionPixelOffset(2131230918);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131230919);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131230801);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(2131230802);
        this.f6767b = dimensionPixelOffset2 - (dimensionPixelOffset * 2);
        this.f6766a = (dimensionPixelOffset3 - this.f6767b) / 2;
        setBigBlind(2);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4511a();
        }
    }

    private void m4511a() {
        for (int i = 0; i < this.f6768c + 1; i++) {
            TextView textView = (TextView) this.f6770e.get(i);
            LayoutParams layoutParams = (LayoutParams) textView.getLayoutParams();
            layoutParams.setMargins((this.f6766a - (textView.getWidth() / 2)) + ((this.f6767b * i) / this.f6768c), 0, 0, 0);
            textView.setLayoutParams(layoutParams);
        }
    }

    public void setBigBlind(long j) {
        this.f6769d = j;
        if (j == 2) {
            this.f6768c = 2;
            this.f6772g.setText("0");
            this.f6773h.setText("1");
            this.f6774i.setText("2");
            this.f6775j.setVisibility(4);
            this.f6776k.setVisibility(4);
            this.f6777l.setImageResource(2130903323);
        } else if (j == 4) {
            this.f6768c = 3;
            this.f6772g.setText("0");
            this.f6773h.setText("1");
            this.f6774i.setText("2");
            this.f6775j.setText("4");
            this.f6775j.setVisibility(0);
            this.f6776k.setVisibility(4);
            this.f6777l.setImageResource(2130903324);
        } else if (j == 10) {
            this.f6768c = 4;
            this.f6772g.setText("0");
            this.f6773h.setText("1");
            this.f6774i.setText("2");
            this.f6775j.setText("5");
            this.f6776k.setText("10");
            this.f6775j.setVisibility(0);
            this.f6776k.setVisibility(0);
            this.f6777l.setImageResource(2130903325);
        } else if (j == 20) {
            this.f6768c = 4;
            this.f6772g.setText("0");
            this.f6773h.setText("2");
            this.f6774i.setText("5");
            this.f6775j.setText("10");
            this.f6776k.setText("20");
            this.f6775j.setVisibility(0);
            this.f6776k.setVisibility(0);
            this.f6777l.setImageResource(2130903325);
        } else if (j == 40) {
            this.f6768c = 4;
            this.f6772g.setText("0");
            this.f6773h.setText("5");
            this.f6774i.setText("10");
            this.f6775j.setText("20");
            this.f6776k.setText("40");
            this.f6775j.setVisibility(0);
            this.f6776k.setVisibility(0);
            this.f6777l.setImageResource(2130903325);
        } else if (j == 50) {
            this.f6768c = 4;
            this.f6772g.setText("0");
            this.f6773h.setText("5");
            this.f6774i.setText("10");
            this.f6775j.setText("25");
            this.f6776k.setText("50");
            this.f6775j.setVisibility(0);
            this.f6776k.setVisibility(0);
            this.f6777l.setImageResource(2130903325);
        } else if (j == 100) {
            this.f6768c = 4;
            this.f6772g.setText("0");
            this.f6773h.setText("10");
            this.f6774i.setText("25");
            this.f6775j.setText("50");
            this.f6776k.setText("100");
            this.f6775j.setVisibility(0);
            this.f6776k.setVisibility(0);
            this.f6777l.setImageResource(2130903325);
        } else if (j == 200) {
            this.f6768c = 4;
            this.f6772g.setText("0");
            this.f6773h.setText("25");
            this.f6774i.setText("50");
            this.f6775j.setText("100");
            this.f6776k.setText("200");
            this.f6775j.setVisibility(0);
            this.f6776k.setVisibility(0);
            this.f6777l.setImageResource(2130903325);
        } else if (j == 400) {
            this.f6768c = 4;
            this.f6772g.setText("0");
            this.f6773h.setText("50");
            this.f6774i.setText("100");
            this.f6775j.setText("200");
            this.f6776k.setText("400");
            this.f6775j.setVisibility(0);
            this.f6776k.setVisibility(0);
            this.f6777l.setImageResource(2130903325);
        }
        this.f6771f.setMax(this.f6768c);
        m4511a();
    }

    public long getAnte() {
        int progress = getProgress();
        if (this.f6769d == 2) {
            if (progress == 0) {
                return 0;
            }
            if (progress == 1) {
                return 1;
            }
            if (progress == 2) {
                return this.f6769d;
            }
            return 0;
        } else if (this.f6769d == 4) {
            if (progress == 0) {
                return 0;
            }
            if (progress == 1) {
                return 1;
            }
            if (progress == 2) {
                return 2;
            }
            if (progress == 3) {
                return this.f6769d;
            }
            return 0;
        } else if (this.f6769d == 10) {
            if (progress == 0) {
                return 0;
            }
            if (progress == 1) {
                return 1;
            }
            if (progress == 2) {
                return 2;
            }
            if (progress == 3) {
                return 5;
            }
            if (progress == 4) {
                return this.f6769d;
            }
            return 0;
        } else if (this.f6769d == 20) {
            if (progress == 0) {
                return 0;
            }
            if (progress == 1) {
                return 2;
            }
            if (progress == 2) {
                return 5;
            }
            if (progress == 3) {
                return 10;
            }
            if (progress == 4) {
                return this.f6769d;
            }
            return 0;
        } else if (this.f6769d == 40) {
            if (progress == 0) {
                return 0;
            }
            if (progress == 1) {
                return 5;
            }
            if (progress == 2) {
                return 10;
            }
            if (progress == 3) {
                return 20;
            }
            if (progress == 4) {
                return this.f6769d;
            }
            return 0;
        } else if (this.f6769d == 50) {
            if (progress == 0) {
                return 0;
            }
            if (progress == 1) {
                return 5;
            }
            if (progress == 2) {
                return 10;
            }
            if (progress == 3) {
                return 25;
            }
            if (progress == 4) {
                return this.f6769d;
            }
            return 0;
        } else if (this.f6769d == 100) {
            if (progress == 0) {
                return 0;
            }
            if (progress == 1) {
                return 10;
            }
            if (progress == 2) {
                return 25;
            }
            if (progress == 3) {
                return 50;
            }
            if (progress == 4) {
                return this.f6769d;
            }
            return 0;
        } else if (this.f6769d == 200) {
            if (progress == 0) {
                return 0;
            }
            if (progress == 1) {
                return 25;
            }
            if (progress == 2) {
                return 50;
            }
            if (progress == 3) {
                return 100;
            }
            if (progress == 4) {
                return this.f6769d;
            }
            return 0;
        } else if (this.f6769d != 400 || progress == 0) {
            return 0;
        } else {
            if (progress == 1) {
                return 50;
            }
            if (progress == 2) {
                return 100;
            }
            if (progress == 3) {
                return 200;
            }
            if (progress == 4) {
                return this.f6769d;
            }
            return 0;
        }
    }

    public int getProgress() {
        return this.f6771f.getProgress();
    }

    public void setProgress(int i) {
        this.f6771f.setProgress(i);
        setSelectedColor(i);
    }

    public void setSelectedColor(int i) {
        for (int i2 = 0; i2 < this.f6768c + 1; i2++) {
            TextView textView = (TextView) this.f6770e.get(i2);
            if (i != i2) {
                textView.setTextColor(-10066587);
            } else {
                textView.setTextColor(-73826);
            }
        }
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f6771f.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }
}
