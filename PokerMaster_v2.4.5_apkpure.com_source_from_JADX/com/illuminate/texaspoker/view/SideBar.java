package com.illuminate.texaspoker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import net.sqlcipher.database.SQLiteDatabase;

public class SideBar extends View {
    public static String[] f6965a;
    private C0489a f6966b;
    private int f6967c;
    private Paint f6968d;
    private TextView f6969e;

    /* renamed from: com.illuminate.texaspoker.view.SideBar.a */
    public interface C0489a {
        void m2958a(String str);
    }

    static {
        f6965a = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#"};
    }

    public void setTextView(TextView textView) {
        this.f6969e = textView;
    }

    public SideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6967c = -1;
        this.f6968d = new Paint();
    }

    public SideBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6967c = -1;
        this.f6968d = new Paint();
    }

    public SideBar(Context context) {
        super(context);
        this.f6967c = -1;
        this.f6968d = new Paint();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        int length = height / f6965a.length;
        for (height = 0; height < f6965a.length; height++) {
            this.f6968d.setColor(Color.parseColor("#a2a2a2"));
            this.f6968d.setTypeface(Typeface.DEFAULT);
            this.f6968d.setAntiAlias(true);
            this.f6968d.setTextSize((float) (length - 16));
            if (height == this.f6967c) {
                this.f6968d.setColor(Color.parseColor("#fedf9e"));
                this.f6968d.setFakeBoldText(true);
            }
            canvas.drawText(f6965a[height], ((float) (width / 2)) - (this.f6968d.measureText(f6965a[height]) / 2.0f), (float) ((length * height) + length), this.f6968d);
            this.f6968d.reset();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.f6967c;
        C0489a c0489a = this.f6966b;
        int height = (int) ((y / ((float) getHeight())) * ((float) f6965a.length));
        switch (action) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                setBackgroundColor(Color.parseColor("#00000000"));
                this.f6967c = -1;
                invalidate();
                if (this.f6969e != null) {
                    this.f6969e.setVisibility(4);
                    break;
                }
                break;
            default:
                setBackgroundColor(Color.parseColor("#7f000000"));
                if (i != height && height >= 0 && height < f6965a.length) {
                    if (c0489a != null) {
                        c0489a.m2958a(f6965a[height]);
                    }
                    if (this.f6969e != null) {
                        this.f6969e.setText(f6965a[height]);
                        this.f6969e.setVisibility(0);
                    }
                    this.f6967c = height;
                    invalidate();
                    break;
                }
        }
        return true;
    }

    public void setOnTouchingLetterChangedListener(C0489a c0489a) {
        this.f6966b = c0489a;
    }
}
