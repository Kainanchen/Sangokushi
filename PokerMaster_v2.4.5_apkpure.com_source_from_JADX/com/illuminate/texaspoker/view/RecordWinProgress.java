package com.illuminate.texaspoker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class RecordWinProgress extends View {
    private Context f6953a;
    private float f6954b;
    private float f6955c;
    private float f6956d;
    private float f6957e;
    private float f6958f;
    private float f6959g;
    private float f6960h;
    private float f6961i;
    private float f6962j;
    private float f6963k;
    private Paint f6964l;

    public RecordWinProgress(Context context) {
        super(context);
        this.f6953a = context;
        m4559a();
    }

    public RecordWinProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6953a = context;
        m4559a();
    }

    public RecordWinProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6953a = context;
        m4559a();
    }

    private void m4559a() {
        this.f6964l = new Paint(1);
        this.f6964l.setAntiAlias(true);
        this.f6956d = this.f6953a.getResources().getDimension(2131230912);
        this.f6957e = this.f6953a.getResources().getDimension(2131230913);
        this.f6958f = this.f6953a.getResources().getDimension(2131230915);
        this.f6959g = this.f6953a.getResources().getDimension(2131230916);
        float f = this.f6958f;
        Paint paint = new Paint();
        if (f != 0.0f) {
            paint.setTextSize(f);
        }
        FontMetrics fontMetrics = paint.getFontMetrics();
        this.f6960h = fontMetrics.descent - fontMetrics.ascent;
        this.f6961i = this.f6953a.getResources().getDimension(2131230909);
        this.f6962j = this.f6953a.getResources().getDimension(2131230910);
        this.f6963k = this.f6953a.getResources().getDimension(2131230911);
    }

    public void setWinRate(float f) {
        this.f6954b = f;
        invalidate();
    }

    public void setVpipRate(float f) {
        this.f6955c = f;
        invalidate();
    }

    public final void m4560a(float f, float f2) {
        this.f6954b = f2;
        this.f6955c = f;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (float) getWidth();
        this.f6964l.setColor(-11447983);
        RectF rectF = new RectF();
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = width;
        rectF.bottom = this.f6956d;
        canvas.drawRoundRect(rectF, this.f6957e, this.f6957e, this.f6964l);
        rectF = new RectF();
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = this.f6955c * width;
        rectF.bottom = this.f6956d;
        this.f6964l.setColor(-73826);
        canvas.drawRoundRect(rectF, this.f6957e, this.f6957e, this.f6964l);
        float f = width * this.f6954b;
        rectF = new RectF();
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = f;
        rectF.bottom = this.f6956d;
        this.f6964l.setColor(-481972);
        canvas.drawRoundRect(rectF, this.f6957e, this.f6957e, this.f6964l);
        this.f6964l.setTextSize(this.f6958f);
        this.f6964l.setColor(-6316386);
        Rect rect = new Rect();
        String string = this.f6953a.getResources().getString(2131165909);
        this.f6964l.setTextAlign(Align.LEFT);
        this.f6964l.getTextBounds(string, 0, string.length(), rect);
        canvas.drawText(string, 0.0f, this.f6959g + this.f6960h, this.f6964l);
        this.f6964l.setColor(-481972);
        this.f6964l.setStrokeWidth(this.f6963k);
        Canvas canvas2 = canvas;
        canvas2.drawLine(this.f6957e + (f * 0.5f), this.f6956d, this.f6957e + (f * 0.5f), this.f6961i + this.f6956d, this.f6964l);
        canvas2 = canvas;
        canvas2.drawLine(this.f6957e + (f * 0.5f), this.f6961i + this.f6956d, (float) rect.centerX(), this.f6961i + this.f6956d, this.f6964l);
        canvas2 = canvas;
        canvas2.drawLine((float) rect.centerX(), this.f6961i + this.f6956d, (float) rect.centerX(), this.f6962j + (this.f6956d + this.f6961i), this.f6964l);
        this.f6964l.setColor(-6316386);
        string = this.f6953a.getResources().getString(2131165876);
        this.f6964l.setTextAlign(Align.RIGHT);
        this.f6964l.getTextBounds(string, 0, string.length(), rect);
        canvas.drawText(string, width, this.f6959g + this.f6960h, this.f6964l);
        canvas2 = canvas;
        canvas2.drawLine(width - this.f6957e, this.f6956d, width - this.f6957e, this.f6961i + this.f6956d, this.f6964l);
        canvas2 = canvas;
        canvas2.drawLine(width - this.f6957e, this.f6961i + this.f6956d, width - ((float) rect.centerX()), this.f6961i + this.f6956d, this.f6964l);
        canvas2 = canvas;
        canvas2.drawLine(width - ((float) rect.centerX()), this.f6961i + this.f6956d, width - ((float) rect.centerX()), this.f6962j + (this.f6956d + this.f6961i), this.f6964l);
    }
}
