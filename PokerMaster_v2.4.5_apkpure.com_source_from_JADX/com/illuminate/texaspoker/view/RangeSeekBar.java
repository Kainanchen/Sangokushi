package com.illuminate.texaspoker.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.android.volley.DefaultRetryPolicy;
import com.illuminate.texaspoker.R.R;
import com.illuminate.texaspoker.application.BaseApplication;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import net.sqlcipher.database.SQLiteDatabase;

public class RangeSeekBar extends View {
    private Paint f6906A;
    private int f6907B;
    private int f6908C;
    private int f6909D;
    private int f6910E;
    private boolean f6911F;
    private boolean f6912G;
    private boolean f6913H;
    private int f6914I;
    private C0947b f6915J;
    private C0929c f6916K;
    private Rect[] f6917L;
    private int f6918M;
    private int f6919N;
    private int f6920O;
    private float f6921P;
    private int f6922a;
    private Scroller f6923b;
    private Scroller f6924c;
    private Drawable f6925d;
    private Drawable f6926e;
    private int[] f6927f;
    private int[] f6928g;
    private int f6929h;
    private int f6930i;
    private int f6931j;
    private int f6932k;
    private int f6933l;
    private int f6934m;
    private int f6935n;
    private int f6936o;
    private CharSequence[] f6937p;
    private float[] f6938q;
    private Rect f6939r;
    private Rect f6940s;
    private Rect f6941t;
    private RectF f6942u;
    private RectF f6943v;
    private float f6944w;
    private float f6945x;
    private int f6946y;
    private int f6947z;

    /* renamed from: com.illuminate.texaspoker.view.RangeSeekBar.c */
    public interface C0929c {
        void m4544a();
    }

    /* renamed from: com.illuminate.texaspoker.view.RangeSeekBar.a */
    private enum C0946a {
        ;

        static {
            f6903a = 1;
            f6904b = 2;
            f6905c = new int[]{f6903a, f6904b};
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.RangeSeekBar.b */
    public interface C0947b {
    }

    public RangeSeekBar(Context context) {
        this(context, null, 0);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6927f = new int[]{16842919, 16842910};
        this.f6928g = new int[]{-16842919, 16842910};
        this.f6944w = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
        this.f6945x = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
        this.f6946y = 0;
        this.f6947z = 1;
        this.f6909D = -1;
        this.f6910E = -1;
        this.f6918M = -1;
        this.f6919N = -1;
        this.f6920O = -1;
        this.f6921P = BaseApplication.m3548a().getResources().getDimension(2131230908);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.RangeSeekBar);
            this.f6922a = obtainStyledAttributes.getInteger(10, 100);
            this.f6925d = obtainStyledAttributes.getDrawable(3);
            this.f6926e = obtainStyledAttributes.getDrawable(4);
            this.f6929h = obtainStyledAttributes.getColor(6, ViewCompat.MEASURED_STATE_MASK);
            this.f6930i = obtainStyledAttributes.getColor(7, Color.rgb(242, 79, 115));
            this.f6931j = obtainStyledAttributes.getColor(8, Color.rgb(218, 215, 215));
            this.f6932k = obtainStyledAttributes.getColor(9, Color.rgb(242, 79, 115));
            this.f6933l = (int) obtainStyledAttributes.getDimension(0, 10.0f);
            this.f6934m = (int) obtainStyledAttributes.getDimension(1, 15.0f);
            this.f6935n = (int) obtainStyledAttributes.getDimension(2, 15.0f);
            this.f6937p = obtainStyledAttributes.getTextArray(5);
            if (this.f6937p != null && this.f6937p.length > 0) {
                this.f6944w = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                this.f6945x = (float) (this.f6937p.length - 1);
                this.f6947z = (int) this.f6945x;
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f6939r == null) {
            this.f6939r = new Rect();
        }
        this.f6939r.left = getPaddingLeft();
        this.f6939r.top = getPaddingTop();
        this.f6939r.right = getPaddingRight();
        this.f6939r.bottom = getPaddingBottom();
        this.f6940s = new Rect();
        this.f6941t = new Rect();
        this.f6942u = new RectF();
        this.f6943v = new RectF();
        if (this.f6937p != null) {
            this.f6938q = new float[this.f6937p.length];
            this.f6917L = new Rect[this.f6937p.length];
        }
        this.f6923b = new Scroller(context, new DecelerateInterpolator());
        this.f6924c = new Scroller(context, new DecelerateInterpolator());
        this.f6906A = new Paint(1);
        this.f6906A.setAntiAlias(true);
        this.f6906A.setStyle(Style.FILL);
        this.f6906A.setTextSize((float) this.f6934m);
        m4553a();
        setWillNotDraw(false);
        setFocusable(true);
        setClickable(true);
    }

    private void m4553a() {
        if (this.f6937p != null && this.f6937p.length > 0) {
            int length = this.f6937p.length;
            for (int i = 0; i < length; i++) {
                this.f6938q[i] = this.f6906A.measureText(this.f6937p[i].toString());
            }
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f6939r == null) {
            this.f6939r = new Rect();
        }
        this.f6939r.left = i;
        this.f6939r.top = i2;
        this.f6939r.right = i3;
        this.f6939r.bottom = i4;
    }

    protected void onMeasure(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(Math.max(MeasureSpec.getSize(i2), (((Math.max(this.f6933l, Math.max(this.f6925d.getIntrinsicHeight(), this.f6926e.getIntrinsicHeight())) + this.f6935n) + this.f6934m) + this.f6939r.top) + this.f6939r.bottom), 1073741824);
        int size = MeasureSpec.getSize(i);
        this.f6942u.left = (float) (this.f6939r.left + (this.f6925d.getIntrinsicWidth() / 2));
        this.f6942u.right = ((float) ((size - this.f6939r.right) - (this.f6926e.getIntrinsicWidth() / 2))) - this.f6921P;
        this.f6942u.top = (float) ((this.f6939r.top + this.f6934m) + this.f6935n);
        this.f6942u.bottom = this.f6942u.top + ((float) this.f6933l);
        this.f6943v.top = this.f6942u.top;
        this.f6943v.bottom = this.f6942u.bottom;
        this.f6936o = ((int) (this.f6942u.right - this.f6942u.left)) / (this.f6937p.length - 1);
        this.f6914I = (int) (this.f6942u.right + ((float) (this.f6926e.getIntrinsicWidth() / 2)));
        super.onMeasure(i, makeMeasureSpec);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int length = this.f6937p.length;
        this.f6906A.setTextSize((float) this.f6934m);
        int i = 0;
        while (i < length) {
            if ((((float) i) > this.f6944w && ((float) i) < this.f6945x) || ((float) i) == this.f6944w || ((float) i) == this.f6945x) {
                this.f6906A.setColor(this.f6930i);
            } else {
                this.f6906A.setColor(this.f6929h);
            }
            String charSequence = this.f6937p[i].toString();
            float f = this.f6938q[i];
            float f2 = (this.f6942u.left + ((float) (this.f6936o * i))) - (f / 2.0f);
            canvas.drawText(charSequence, f2, (float) (this.f6939r.top + this.f6934m), this.f6906A);
            if (this.f6917L[i] == null) {
                Rect rect = new Rect();
                rect.top = this.f6939r.top;
                rect.bottom = ((rect.top + this.f6934m) + this.f6935n) + this.f6933l;
                rect.left = (int) f2;
                rect.right = (int) (f + ((float) rect.left));
                this.f6917L[i] = rect;
            }
            i++;
        }
        float measureText = ((((this.f6921P - this.f6906A.measureText("5")) - this.f6906A.measureText("6")) - this.f6906A.measureText("7")) - (this.f6906A.measureText("8") / 2.0f)) - (this.f6906A.measureText("4") / 2.0f);
        this.f6906A.setColor(this.f6929h);
        float measureText2 = (this.f6942u.right + (this.f6906A.measureText("4") / 2.0f)) + (measureText / 4.0f);
        canvas.drawText("5", measureText2, (float) (this.f6939r.top + this.f6934m), this.f6906A);
        measureText2 = (measureText2 + this.f6906A.measureText("5")) + (measureText / 4.0f);
        canvas.drawText("6", measureText2, (float) (this.f6939r.top + this.f6934m), this.f6906A);
        measureText2 = (measureText2 + this.f6906A.measureText("6")) + (measureText / 4.0f);
        canvas.drawText("7", measureText2, (float) (this.f6939r.top + this.f6934m), this.f6906A);
        canvas.drawText("8", (measureText / 4.0f) + (measureText2 + this.f6906A.measureText("7")), (float) (this.f6939r.top + this.f6934m), this.f6906A);
        canvas.drawText(getResources().getString(2131165672), this.f6942u.right + 20.0f, (this.f6942u.bottom + 18.0f) + ((float) this.f6934m), this.f6906A);
        measureText = ((float) this.f6933l) / 2.0f;
        this.f6943v.left = this.f6942u.left + (((float) this.f6936o) * this.f6944w);
        this.f6943v.right = this.f6942u.left + (((float) this.f6936o) * this.f6945x);
        if (this.f6944w == 0.0f && this.f6945x == ((float) (length - 1))) {
            this.f6906A.setColor(this.f6932k);
            canvas.drawRoundRect(this.f6942u, measureText, measureText, this.f6906A);
        } else {
            this.f6906A.setColor(this.f6931j);
            canvas.drawRoundRect(this.f6942u, measureText, measureText, this.f6906A);
            RectF rectF = new RectF();
            rectF.left = this.f6942u.right - measureText;
            rectF.top = this.f6942u.top;
            rectF.right = this.f6942u.right;
            rectF.bottom = this.f6942u.bottom;
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.f6906A);
            this.f6906A.setColor(this.f6932k);
            canvas.drawRect(this.f6943v, this.f6906A);
        }
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), 2130903327), this.f6942u.right, this.f6942u.top, null);
        i = this.f6925d.getIntrinsicWidth();
        length = this.f6925d.getIntrinsicHeight();
        int i2 = (int) (this.f6943v.left - (((float) i) / 2.0f));
        int i3 = (int) ((this.f6942u.top + ((float) (this.f6933l / 2))) - ((float) (length / 2)));
        this.f6940s.left = i2;
        this.f6940s.top = i3;
        this.f6940s.right = i + i2;
        this.f6940s.bottom = length + i3;
        this.f6925d.setBounds(this.f6940s);
        this.f6925d.draw(canvas);
        i = this.f6926e.getIntrinsicWidth();
        length = this.f6926e.getIntrinsicHeight();
        i2 = (int) (this.f6943v.right - (((float) i) / 2.0f));
        i3 = (int) ((this.f6943v.top + ((float) (this.f6933l / 2))) - ((float) (length / 2)));
        this.f6941t.left = i2;
        this.f6941t.top = i3;
        this.f6941t.right = i + i2;
        this.f6941t.bottom = length + i3;
        this.f6926e.setBounds(this.f6941t);
        this.f6926e.draw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        switch (motionEvent.getActionMasked()) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                m4554a(motionEvent);
                break;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                m4556b(motionEvent);
                this.f6918M = -1;
                this.f6919N = -1;
                this.f6920O = -1;
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                int action;
                float x;
                float f;
                if (this.f6918M != -1) {
                    action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                    int x2 = (int) motionEvent.getX(action);
                    action = (int) motionEvent.getY(action);
                    if (((float) x2) >= this.f6942u.right || !this.f6917L[this.f6918M].contains(x2, action)) {
                        this.f6918M = -1;
                    }
                }
                if (this.f6913H) {
                    this.f6913H = false;
                    if ((motionEvent.getX(motionEvent.findPointerIndex(this.f6909D)) - ((float) this.f6907B) < 0.0f ? C0946a.f6903a : C0946a.f6904b) == C0946a.f6903a) {
                        this.f6912G = false;
                        this.f6911F = true;
                        this.f6925d.setState(this.f6927f);
                        this.f6910E = -1;
                    } else {
                        this.f6911F = false;
                        this.f6912G = true;
                        this.f6926e.setState(this.f6927f);
                        this.f6909D = -1;
                    }
                    invalidate();
                }
                if (this.f6911F && this.f6909D != -1) {
                    x = motionEvent.getX(motionEvent.findPointerIndex(this.f6909D));
                    f = x - ((float) this.f6907B);
                    this.f6907B = (int) x;
                    if (!((f < 0.0f ? C0946a.f6903a : C0946a.f6904b) == C0946a.f6903a && this.f6944w == 0.0f)) {
                        if (((float) this.f6940s.left) + f < ((float) this.f6939r.left)) {
                            this.f6944w = 0.0f;
                            invalidate();
                            break;
                        } else if (((float) this.f6940s.right) + f >= ((float) this.f6941t.right)) {
                            this.f6944w = this.f6945x;
                            invalidate();
                            break;
                        } else if (f != 0.0f) {
                            this.f6944w = (f / ((float) this.f6936o)) + this.f6944w;
                            invalidate();
                        }
                    }
                }
                if (this.f6912G && this.f6910E != -1) {
                    x = motionEvent.getX(motionEvent.findPointerIndex(this.f6910E));
                    f = x - ((float) this.f6908C);
                    this.f6908C = (int) x;
                    action = f < 0.0f ? C0946a.f6903a : C0946a.f6904b;
                    int length = this.f6937p.length - 1;
                    if (!(action == C0946a.f6904b && this.f6945x == ((float) length))) {
                        if (((float) this.f6941t.right) + f > ((float) this.f6914I)) {
                            f = (float) (this.f6914I - this.f6941t.right);
                        }
                        length = this.f6937p.length - 1;
                        if (!(action == C0946a.f6904b && this.f6945x == ((float) length))) {
                            if (((float) this.f6941t.left) + f >= ((float) this.f6940s.left)) {
                                if (f != 0.0f) {
                                    this.f6945x = (f / ((float) this.f6936o)) + this.f6945x;
                                    invalidate();
                                    break;
                                }
                            }
                            this.f6945x = this.f6944w;
                            invalidate();
                            break;
                        }
                    }
                }
                break;
            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                m4554a(motionEvent);
                break;
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                m4556b(motionEvent);
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void m4554a(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        int x = (int) motionEvent.getX(action);
        int y = (int) motionEvent.getY(action);
        if (this.f6941t.contains(x, y) && this.f6940s.contains(x, y)) {
            if (!this.f6913H) {
                this.f6907B = x;
                this.f6909D = motionEvent.getPointerId(action);
                this.f6908C = x;
                this.f6910E = motionEvent.getPointerId(action);
                this.f6913H = true;
                invalidate();
            }
        } else if (this.f6940s.contains(x, y)) {
            if (!this.f6911F) {
                this.f6907B = x;
                this.f6925d.setState(this.f6927f);
                this.f6909D = motionEvent.getPointerId(action);
                this.f6911F = true;
                invalidate();
            }
        } else if (!this.f6941t.contains(x, y)) {
            action = this.f6917L[0].top;
            int i = this.f6917L[0].bottom;
            this.f6919N = x;
            this.f6920O = y;
            if (y < action || y > i) {
                this.f6918M = -1;
                return;
            }
            action = (int) ((((float) x) - this.f6942u.left) / ((float) this.f6936o));
            i = (int) ((((float) x) - this.f6942u.left) % ((float) this.f6936o));
            if (i < this.f6936o / 2) {
                this.f6918M = action;
            } else if (i > this.f6936o / 2) {
                this.f6918M = action + 1;
            }
            if (((float) this.f6918M) == this.f6944w || ((float) this.f6918M) == this.f6945x) {
                this.f6918M = -1;
            } else if (((float) x) >= this.f6942u.right || !this.f6917L[this.f6918M].contains(x, y)) {
                this.f6918M = -1;
            }
        } else if (!this.f6912G) {
            this.f6908C = x;
            this.f6926e.setState(this.f6927f);
            this.f6910E = motionEvent.getPointerId(action);
            this.f6912G = true;
            invalidate();
        }
    }

    private void m4556b(MotionEvent motionEvent) {
        int pointerId = motionEvent.getPointerId((motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
        if (this.f6913H) {
            this.f6907B = 0;
            this.f6925d.setState(this.f6928g);
            this.f6909D = -1;
            this.f6911F = false;
            this.f6908C = 0;
            this.f6925d.setState(this.f6928g);
            this.f6910E = -1;
            this.f6912G = false;
            this.f6913H = false;
        } else if (pointerId == this.f6909D) {
            if (this.f6911F) {
                pointerId = (int) Math.floor((double) this.f6944w);
                r1 = (int) Math.ceil((double) this.f6944w);
                r3 = this.f6944w - ((float) pointerId);
                if (r3 != 0.0f) {
                    if (r3 < 0.5f) {
                        this.f6946y = pointerId;
                    } else if (r3 > 0.5f) {
                        this.f6946y = r1;
                        if (Math.abs(this.f6944w - this.f6945x) <= DefaultRetryPolicy.DEFAULT_BACKOFF_MULT && this.f6946y == this.f6947z) {
                            this.f6946y = pointerId;
                        }
                    }
                    if (!this.f6923b.computeScrollOffset()) {
                        r1 = (int) (this.f6944w * ((float) this.f6936o));
                        this.f6923b.startScroll(r1, 0, (this.f6946y * this.f6936o) - r1, 0, this.f6922a);
                        m4555a(true, this.f6946y);
                    }
                }
                this.f6907B = 0;
                this.f6925d.setState(this.f6928g);
                this.f6909D = -1;
                this.f6911F = false;
                invalidate();
            }
        } else if (pointerId != this.f6910E) {
            pointerId = motionEvent.findPointerIndex(pointerId);
            r1 = (int) motionEvent.getX(pointerId);
            pointerId = (int) motionEvent.getY(pointerId);
            if (this.f6918M != -1 && this.f6917L[this.f6918M].contains(r1, pointerId)) {
                if (Math.abs(this.f6944w - ((float) this.f6918M)) <= Math.abs(this.f6945x - ((float) this.f6918M))) {
                    if (!this.f6923b.computeScrollOffset()) {
                        this.f6946y = this.f6918M;
                        r1 = (int) (this.f6944w * ((float) this.f6936o));
                        this.f6923b.startScroll(r1, 0, (this.f6946y * this.f6936o) - r1, 0, this.f6922a);
                        m4555a(true, this.f6946y);
                        invalidate();
                    }
                } else if (!this.f6924c.computeScrollOffset()) {
                    this.f6947z = this.f6918M;
                    r1 = (int) (this.f6945x * ((float) this.f6936o));
                    this.f6924c.startScroll(r1, 0, (this.f6947z * this.f6936o) - r1, 0, this.f6922a);
                    m4555a(false, this.f6947z);
                    invalidate();
                }
            }
        } else if (this.f6912G) {
            pointerId = (int) Math.floor((double) this.f6945x);
            r1 = (int) Math.ceil((double) this.f6945x);
            r3 = this.f6945x - ((float) pointerId);
            if (r3 != 0.0f) {
                if (r3 > 0.5f) {
                    this.f6947z = r1;
                } else if (r3 < 0.5f) {
                    this.f6947z = pointerId;
                    if (Math.abs(this.f6944w - this.f6945x) <= DefaultRetryPolicy.DEFAULT_BACKOFF_MULT && this.f6947z == this.f6946y) {
                        this.f6947z = r1;
                    }
                }
                if (!this.f6924c.computeScrollOffset()) {
                    r1 = (int) (this.f6945x * ((float) this.f6936o));
                    this.f6924c.startScroll(r1, 0, (this.f6947z * this.f6936o) - r1, 0, this.f6922a);
                    m4555a(false, this.f6947z);
                }
            }
            this.f6908C = 0;
            this.f6925d.setState(this.f6928g);
            this.f6910E = -1;
            this.f6912G = false;
            invalidate();
        }
    }

    public void computeScroll() {
        if (this.f6923b.computeScrollOffset()) {
            this.f6944w = ((float) this.f6923b.getCurrX()) / ((float) this.f6936o);
            invalidate();
        }
        if (this.f6924c.computeScrollOffset()) {
            this.f6945x = ((float) this.f6924c.getCurrX()) / ((float) this.f6936o);
            invalidate();
        }
        this.f6916K.m4544a();
    }

    private void m4555a(boolean z, int i) {
        if (this.f6915J != null) {
            if (z) {
                this.f6937p[i].toString();
            } else {
                this.f6937p[i].toString();
            }
        }
    }

    public void setLeftSelection(int i) {
        if (i >= this.f6937p.length - 1 || i <= 0) {
            throw new IllegalArgumentException("Index should from 0 to size of text array minus 2!");
        } else if (((float) i) != this.f6944w) {
            if (!this.f6923b.isFinished()) {
                this.f6923b.abortAnimation();
            }
            this.f6946y = i;
            int i2 = (int) (this.f6944w * ((float) this.f6936o));
            this.f6923b.startScroll(i2, 0, (this.f6946y * this.f6936o) - i2, 0, this.f6922a);
            m4555a(true, this.f6946y);
            if (this.f6945x <= ((float) this.f6946y)) {
                if (!this.f6924c.isFinished()) {
                    this.f6924c.abortAnimation();
                }
                this.f6947z = this.f6946y + 1;
                i2 = (int) (this.f6945x * ((float) this.f6936o));
                this.f6924c.startScroll(i2, 0, (this.f6947z * this.f6936o) - i2, 0, this.f6922a);
                m4555a(false, this.f6947z);
            }
            invalidate();
        }
    }

    public void setRightSelection(int i) {
        if (i >= this.f6937p.length || i <= 0) {
            throw new IllegalArgumentException("Index should from 1 to size of text array minus 1!");
        } else if (((float) i) != this.f6945x) {
            if (!this.f6924c.isFinished()) {
                this.f6924c.abortAnimation();
            }
            this.f6947z = i;
            int i2 = (int) (((float) this.f6936o) * this.f6945x);
            this.f6924c.startScroll(i2, 0, (this.f6947z * this.f6936o) - i2, 0, this.f6922a);
            m4555a(false, this.f6947z);
            if (this.f6944w >= ((float) this.f6947z)) {
                if (!this.f6923b.isFinished()) {
                    this.f6923b.abortAnimation();
                }
                this.f6946y = this.f6947z - 1;
                i2 = (int) (this.f6944w * ((float) this.f6936o));
                this.f6923b.startScroll(i2, 0, (this.f6946y * this.f6936o) - i2, 0, this.f6922a);
                m4555a(true, this.f6946y);
            }
            invalidate();
        }
    }

    public void setLeftCursorBackground(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Do you want to make left cursor invisible?");
        }
        this.f6925d = drawable;
        requestLayout();
        invalidate();
    }

    public void setLeftCursorBackground(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Do you want to make left cursor invisible?");
        }
        this.f6925d = getResources().getDrawable(i);
        requestLayout();
        invalidate();
    }

    public void setRightCursorBackground(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Do you want to make right cursor invisible?");
        }
        this.f6926e = drawable;
        requestLayout();
        invalidate();
    }

    public void setRightCursorBackground(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Do you want to make right cursor invisible?");
        }
        this.f6926e = getResources().getDrawable(i);
        requestLayout();
        invalidate();
    }

    public void setTextMarkColorNormal(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Do you want to make text mark invisible?");
        }
        this.f6929h = i;
        invalidate();
    }

    public void setTextMarkColorSelected(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Do you want to make text mark invisible?");
        }
        this.f6930i = i;
        invalidate();
    }

    public void setSeekbarColorNormal(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Do you want to make seekbar invisible?");
        }
        this.f6931j = i;
        invalidate();
    }

    public void setSeekbarColorSelected(int i) {
        if (i <= 0 || i == 0) {
            throw new IllegalArgumentException("Do you want to make seekbar invisible?");
        }
        this.f6932k = i;
        invalidate();
    }

    public void setSeekbarHeight(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Height of seekbar can not less than 0!");
        }
        this.f6933l = i;
    }

    public void setSpaceBetween(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Space between text mark and seekbar can not less than 0!");
        }
        this.f6935n = i;
        requestLayout();
        invalidate();
    }

    public void setTextMarks(CharSequence... charSequenceArr) {
        if (charSequenceArr == null || charSequenceArr.length == 0) {
            throw new IllegalArgumentException("Text array is null, how can i do...");
        }
        this.f6937p = charSequenceArr;
        this.f6944w = 0.0f;
        this.f6945x = (float) (this.f6937p.length - 1);
        this.f6947z = (int) this.f6945x;
        this.f6938q = new float[charSequenceArr.length];
        this.f6917L = new Rect[this.f6937p.length];
        m4553a();
        requestLayout();
        invalidate();
    }

    public void setTextMarkSize(int i) {
        if (i >= 0) {
            this.f6934m = i;
            this.f6906A.setTextSize((float) i);
        }
    }

    public int getLeftCursorIndex() {
        return (int) this.f6944w;
    }

    public int getRightCursorIndex() {
        return (int) this.f6945x;
    }

    public void setOnCursorChangeListener(C0947b c0947b) {
        this.f6915J = c0947b;
    }

    public void setOnCursorStopListener(C0929c c0929c) {
        this.f6916K = c0929c;
    }
}
