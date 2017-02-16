package com.illuminate.texaspoker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class RecordRingProgress extends View {
    private Context f6948a;
    private double f6949b;
    private double f6950c;
    private float f6951d;
    private Paint f6952e;

    public RecordRingProgress(Context context) {
        super(context);
        this.f6948a = context;
        m4557a();
    }

    public RecordRingProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6948a = context;
        m4557a();
    }

    public RecordRingProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6948a = context;
        m4557a();
    }

    private void m4557a() {
        this.f6952e = new Paint(1);
        this.f6952e.setAntiAlias(true);
        this.f6951d = this.f6948a.getResources().getDimension(2131230914);
    }

    public final void m4558a(double d, double d2) {
        this.f6949b = d;
        this.f6950c = d2;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (float) ((int) (((float) (getWidth() / 2)) - (this.f6951d / 2.0f)));
        this.f6952e.setStyle(Style.STROKE);
        this.f6952e.setStrokeWidth(this.f6951d);
        this.f6952e.setColor(-11447983);
        canvas.drawArc(new RectF(this.f6951d / 2.0f, this.f6951d / 2.0f, width * 2.0f, width * 2.0f), -230.0f, 280.0f, false, this.f6952e);
        this.f6952e.setColor(-73826);
        canvas.drawArc(new RectF(this.f6951d / 2.0f, this.f6951d / 2.0f, width * 2.0f, width * 2.0f), -230.0f, (float) (this.f6949b * 280.0d), false, this.f6952e);
        this.f6952e.setColor(-481972);
        canvas.drawArc(new RectF(this.f6951d / 2.0f, this.f6951d / 2.0f, width * 2.0f, width * 2.0f), -230.0f, (float) (this.f6950c * 280.0d), false, this.f6952e);
    }
}
