package com.illuminate.texaspoker.swipback;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.volley.DefaultRetryPolicy;
import com.illuminate.texaspoker.R.R;
import com.illuminate.texaspoker.swipback.ViewDragHelper.ViewDragHelper;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

public class SwipeBackLayout extends FrameLayout {
    private static final int[] f6518b;
    Activity f6519a;
    private int f6520c;
    private float f6521d;
    private boolean f6522e;
    private View f6523f;
    private ViewDragHelper f6524g;
    private float f6525h;
    private int f6526i;
    private int f6527j;
    private List<C0911a> f6528k;
    private Drawable f6529l;
    private Drawable f6530m;
    private Drawable f6531n;
    private float f6532o;
    private int f6533p;
    private boolean f6534q;
    private Rect f6535r;
    private int f6536s;

    /* renamed from: com.illuminate.texaspoker.swipback.SwipeBackLayout.a */
    public interface C0911a {
        void m4013a();
    }

    /* renamed from: com.illuminate.texaspoker.swipback.SwipeBackLayout.b */
    private class C0912b extends ViewDragHelper {
        final /* synthetic */ SwipeBackLayout f6516a;
        private boolean f6517b;

        private C0912b(SwipeBackLayout swipeBackLayout) {
            this.f6516a = swipeBackLayout;
        }

        public final boolean m4026a(int i) {
            int i2 = 1;
            boolean b = this.f6516a.f6524g.m4066b(this.f6516a.f6520c, i);
            if (b) {
                if (this.f6516a.f6524g.m4066b(1, i)) {
                    this.f6516a.f6536s = 1;
                } else if (this.f6516a.f6524g.m4066b(2, i)) {
                    this.f6516a.f6536s = 2;
                } else if (this.f6516a.f6524g.m4066b(8, i)) {
                    this.f6516a.f6536s = 8;
                }
                if (!(this.f6516a.f6528k == null || this.f6516a.f6528k.isEmpty())) {
                    for (C0911a c0911a : this.f6516a.f6528k) {
                        this.f6516a.f6536s;
                        c0911a.m4013a();
                    }
                }
                this.f6517b = true;
            }
            if (this.f6516a.f6520c == 1 || this.f6516a.f6520c == 2) {
                i2 = !this.f6516a.f6524g.m4060a(2, i) ? 1 : 0;
            } else if (this.f6516a.f6520c == 8) {
                if (this.f6516a.f6524g.m4060a(1, i)) {
                    i2 = 0;
                }
            } else if (this.f6516a.f6520c != 11) {
                i2 = 0;
            }
            return b & i2;
        }

        public final int m4022a() {
            return this.f6516a.f6520c & 3;
        }

        public final int m4027b() {
            return this.f6516a.f6520c & 8;
        }

        public final void m4025a(View view, int i, int i2, int i3, int i4) {
            super.m4017a(view, i, i2, i3, i4);
            if ((this.f6516a.f6536s & 1) != 0) {
                this.f6516a.f6525h = Math.abs(((float) i) / ((float) (this.f6516a.f6523f.getWidth() + this.f6516a.f6529l.getIntrinsicWidth())));
            } else if ((this.f6516a.f6536s & 2) != 0) {
                this.f6516a.f6525h = Math.abs(((float) i) / ((float) (this.f6516a.f6523f.getWidth() + this.f6516a.f6530m.getIntrinsicWidth())));
            } else if ((this.f6516a.f6536s & 8) != 0) {
                this.f6516a.f6525h = Math.abs(((float) i2) / ((float) (this.f6516a.f6523f.getHeight() + this.f6516a.f6531n.getIntrinsicHeight())));
            }
            this.f6516a.f6526i = i;
            this.f6516a.f6527j = i2;
            this.f6516a.invalidate();
            if (this.f6516a.f6525h < this.f6516a.f6521d && !this.f6517b) {
                this.f6517b = true;
            }
            if (this.f6516a.f6528k != null && !this.f6516a.f6528k.isEmpty() && this.f6516a.f6524g.f6542a == 1 && this.f6516a.f6525h >= this.f6516a.f6521d && this.f6517b) {
                this.f6517b = false;
                Iterator it = this.f6516a.f6528k.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            if (this.f6516a.f6525h >= DefaultRetryPolicy.DEFAULT_BACKOFF_MULT && !this.f6516a.f6519a.isFinishing()) {
                this.f6516a.f6519a.finish();
                this.f6516a.f6519a.overridePendingTransition(0, 0);
            }
        }

        public final void m4024a(View view, float f, float f2) {
            int width = view.getWidth();
            int height = view.getHeight();
            if ((this.f6516a.f6536s & 1) != 0) {
                width = (f > 0.0f || (f == 0.0f && this.f6516a.f6525h > this.f6516a.f6521d)) ? (width + this.f6516a.f6529l.getIntrinsicWidth()) + 10 : 0;
                height = width;
                width = 0;
            } else if ((this.f6516a.f6536s & 2) != 0) {
                width = (f < 0.0f || (f == 0.0f && this.f6516a.f6525h > this.f6516a.f6521d)) ? -((width + this.f6516a.f6529l.getIntrinsicWidth()) + 10) : 0;
                height = width;
                width = 0;
            } else if ((this.f6516a.f6536s & 8) != 0) {
                width = (f2 < 0.0f || (f2 == 0.0f && this.f6516a.f6525h > this.f6516a.f6521d)) ? -((this.f6516a.f6531n.getIntrinsicHeight() + height) + 10) : 0;
                height = 0;
            } else {
                width = 0;
                height = 0;
            }
            ViewDragHelper b = this.f6516a.f6524g;
            if (b.f6557p) {
                int xVelocity = (int) VelocityTrackerCompat.getXVelocity(b.f6549h, b.f6543b);
                int yVelocity = (int) VelocityTrackerCompat.getYVelocity(b.f6549h, b.f6543b);
                int left = b.f6556o.getLeft();
                int top = b.f6556o.getTop();
                height -= left;
                int i = width - top;
                if (height == 0 && i == 0) {
                    b.f6554m.abortAnimation();
                    b.m4065b(0);
                } else {
                    View view2 = b.f6556o;
                    int b2 = ViewDragHelper.m4052b(xVelocity, (int) b.f6551j, (int) b.f6550i);
                    yVelocity = ViewDragHelper.m4052b(yVelocity, (int) b.f6551j, (int) b.f6550i);
                    width = Math.abs(height);
                    int abs = Math.abs(i);
                    xVelocity = Math.abs(b2);
                    int abs2 = Math.abs(yVelocity);
                    int i2 = xVelocity + abs2;
                    int i3 = width + abs;
                    b.f6554m.startScroll(left, top, height, i, (int) (((yVelocity != 0 ? ((float) abs2) / ((float) i2) : ((float) abs) / ((float) i3)) * ((float) b.m4054a(i, yVelocity, b.f6555n.m4019b()))) + ((b2 != 0 ? ((float) xVelocity) / ((float) i2) : ((float) width) / ((float) i3)) * ((float) b.m4054a(height, b2, b.f6555n.m4014a())))));
                    b.m4065b(2);
                }
                this.f6516a.invalidate();
                return;
            }
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }

        public final int m4023a(View view, int i) {
            if ((this.f6516a.f6536s & 1) != 0) {
                return Math.min(view.getWidth(), Math.max(i, 0));
            }
            if ((this.f6516a.f6536s & 2) != 0) {
                return Math.min(0, Math.max(i, -view.getWidth()));
            }
            return 0;
        }

        public final int m4028b(View view, int i) {
            if ((this.f6516a.f6536s & 8) != 0) {
                return Math.min(0, Math.max(i, -view.getHeight()));
            }
            return 0;
        }

        public final void m4029b(int i) {
            super.m4021b(i);
            if (this.f6516a.f6528k != null && !this.f6516a.f6528k.isEmpty()) {
                Iterator it = this.f6516a.f6528k.iterator();
                while (it.hasNext()) {
                    it.next();
                    this.f6516a.f6525h;
                }
            }
        }
    }

    static {
        f6518b = new int[]{1, 2, 8, 11};
    }

    public SwipeBackLayout(Context context) {
        this(context, null);
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130771968);
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f6521d = 0.3f;
        this.f6522e = true;
        this.f6533p = -1728053248;
        this.f6535r = new Rect();
        this.f6524g = ViewDragHelper.m4049a((ViewGroup) this, new C0912b());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.SwipeBackLayout, i, 2131296492);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        if (dimensionPixelSize > 0) {
            setEdgeSize(dimensionPixelSize);
        }
        setEdgeTrackingEnabled(f6518b[obtainStyledAttributes.getInt(1, 0)]);
        dimensionPixelSize = obtainStyledAttributes.getResourceId(2, 2130837749);
        int resourceId = obtainStyledAttributes.getResourceId(3, 2130837750);
        int resourceId2 = obtainStyledAttributes.getResourceId(4, 2130837748);
        m4033a(dimensionPixelSize, 1);
        m4033a(resourceId, 2);
        m4033a(resourceId2, 8);
        obtainStyledAttributes.recycle();
        float f = getResources().getDisplayMetrics().density * 400.0f;
        this.f6524g.f6551j = f;
        this.f6524g.f6550i = f * 2.0f;
    }

    void setContentView(View view) {
        this.f6523f = view;
    }

    public void setEnableGesture(boolean z) {
        this.f6522e = z;
    }

    public void setEdgeTrackingEnabled(int i) {
        this.f6520c = i;
        this.f6524g.f6553l = this.f6520c;
    }

    public void setScrimColor(int i) {
        this.f6533p = i;
        invalidate();
    }

    public void setEdgeSize(int i) {
        this.f6524g.f6552k = i;
    }

    @Deprecated
    public void setSwipeListener(C0911a c0911a) {
        m4046a(c0911a);
    }

    public final void m4046a(C0911a c0911a) {
        if (this.f6528k == null) {
            this.f6528k = new ArrayList();
        }
        this.f6528k.add(c0911a);
    }

    public void setScrollThresHold(float f) {
        if (f >= DefaultRetryPolicy.DEFAULT_BACKOFF_MULT || f <= 0.0f) {
            throw new IllegalArgumentException("Threshold value should be between 0 and 1.0");
        }
        this.f6521d = f;
    }

    private void m4033a(int i, int i2) {
        Drawable drawable = getResources().getDrawable(i);
        if ((i2 & 1) != 0) {
            this.f6529l = drawable;
        } else if ((i2 & 2) != 0) {
            this.f6530m = drawable;
        } else if ((i2 & 8) != 0) {
            this.f6531n = drawable;
        }
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f6522e) {
            return false;
        }
        try {
            ViewDragHelper viewDragHelper = this.f6524g;
            int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
            int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
            if (actionMasked == 0) {
                viewDragHelper.m4055a();
            }
            if (viewDragHelper.f6549h == null) {
                viewDragHelper.f6549h = VelocityTracker.obtain();
            }
            viewDragHelper.f6549h.addMovement(motionEvent);
            float y;
            int pointerId;
            switch (actionMasked) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    float x = motionEvent.getX();
                    y = motionEvent.getY();
                    pointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                    viewDragHelper.m4057a(x, y, pointerId);
                    View c = viewDragHelper.m4067c((int) x, (int) y);
                    if (c == viewDragHelper.f6556o && viewDragHelper.f6542a == 2) {
                        viewDragHelper.m4062a(c, pointerId);
                    }
                    if ((viewDragHelper.f6548g[pointerId] & viewDragHelper.f6553l) != 0) {
                        break;
                    }
                    break;
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                    viewDragHelper.m4055a();
                    break;
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    actionIndex = MotionEventCompat.getPointerCount(motionEvent);
                    actionMasked = 0;
                    while (actionMasked < actionIndex) {
                        pointerId = MotionEventCompat.getPointerId(motionEvent, actionMasked);
                        float x2 = MotionEventCompat.getX(motionEvent, actionMasked);
                        float y2 = MotionEventCompat.getY(motionEvent, actionMasked);
                        float f = x2 - viewDragHelper.f6544c[pointerId];
                        float f2 = y2 - viewDragHelper.f6545d[pointerId];
                        viewDragHelper.m4064b(f, f2, pointerId);
                        if (viewDragHelper.f6542a != 1) {
                            View c2 = viewDragHelper.m4067c((int) x2, (int) y2);
                            if (c2 == null || !viewDragHelper.m4061a(c2, f, f2) || !viewDragHelper.m4062a(c2, pointerId)) {
                                actionMasked++;
                            }
                        }
                        viewDragHelper.m4059a(motionEvent);
                        break;
                    }
                    viewDragHelper.m4059a(motionEvent);
                    break;
                case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                    actionMasked = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    float x3 = MotionEventCompat.getX(motionEvent, actionIndex);
                    y = MotionEventCompat.getY(motionEvent, actionIndex);
                    viewDragHelper.m4057a(x3, y, actionMasked);
                    if (viewDragHelper.f6542a != 0 && viewDragHelper.f6542a == 2) {
                        View c3 = viewDragHelper.m4067c((int) x3, (int) y);
                        if (c3 == viewDragHelper.f6556o) {
                            viewDragHelper.m4062a(c3, actionMasked);
                            break;
                        }
                    }
                    break;
                case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                    viewDragHelper.m4058a(MotionEventCompat.getPointerId(motionEvent, actionIndex));
                    break;
            }
            if (viewDragHelper.f6542a == 1) {
                return true;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (!this.f6522e) {
            return false;
        }
        ViewDragHelper viewDragHelper = this.f6524g;
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked == 0) {
            viewDragHelper.m4055a();
        }
        if (viewDragHelper.f6549h == null) {
            viewDragHelper.f6549h = VelocityTracker.obtain();
        }
        viewDragHelper.f6549h.addMovement(motionEvent);
        float x;
        float y;
        View c;
        int left;
        switch (actionMasked) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                x = motionEvent.getX();
                y = motionEvent.getY();
                i = MotionEventCompat.getPointerId(motionEvent, 0);
                c = viewDragHelper.m4067c((int) x, (int) y);
                viewDragHelper.m4057a(x, y, i);
                viewDragHelper.m4062a(c, i);
                if ((viewDragHelper.f6548g[i] & viewDragHelper.f6553l) != 0) {
                    break;
                }
                break;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                if (viewDragHelper.f6542a == 1) {
                    viewDragHelper.m4063b();
                }
                viewDragHelper.m4055a();
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                int i2;
                if (viewDragHelper.f6542a == 1) {
                    i = MotionEventCompat.findPointerIndex(motionEvent, viewDragHelper.f6543b);
                    x = MotionEventCompat.getX(motionEvent, i);
                    i2 = (int) (x - viewDragHelper.f6546e[viewDragHelper.f6543b]);
                    i = (int) (MotionEventCompat.getY(motionEvent, i) - viewDragHelper.f6547f[viewDragHelper.f6543b]);
                    actionMasked = viewDragHelper.f6556o.getLeft() + i2;
                    actionIndex = viewDragHelper.f6556o.getTop() + i;
                    left = viewDragHelper.f6556o.getLeft();
                    int top = viewDragHelper.f6556o.getTop();
                    if (i2 != 0) {
                        actionMasked = viewDragHelper.f6555n.m4015a(viewDragHelper.f6556o, actionMasked);
                        viewDragHelper.f6556o.offsetLeftAndRight(actionMasked - left);
                    }
                    if (i != 0) {
                        actionIndex = viewDragHelper.f6555n.m4020b(viewDragHelper.f6556o, actionIndex);
                        viewDragHelper.f6556o.offsetTopAndBottom(actionIndex - top);
                    }
                    if (!(i2 == 0 && i == 0)) {
                        viewDragHelper.f6555n.m4017a(viewDragHelper.f6556o, actionMasked, actionIndex, actionMasked - left, actionIndex - top);
                    }
                    viewDragHelper.m4059a(motionEvent);
                    break;
                }
                i2 = MotionEventCompat.getPointerCount(motionEvent);
                while (i < i2) {
                    actionMasked = MotionEventCompat.getPointerId(motionEvent, i);
                    float x2 = MotionEventCompat.getX(motionEvent, i);
                    float y2 = MotionEventCompat.getY(motionEvent, i);
                    float f = x2 - viewDragHelper.f6544c[actionMasked];
                    float f2 = y2 - viewDragHelper.f6545d[actionMasked];
                    viewDragHelper.m4064b(f, f2, actionMasked);
                    if (viewDragHelper.f6542a != 1) {
                        c = viewDragHelper.m4067c((int) x2, (int) y2);
                        if (!viewDragHelper.m4061a(c, f, f2) || !viewDragHelper.m4062a(c, actionMasked)) {
                            i++;
                        }
                    }
                    viewDragHelper.m4059a(motionEvent);
                    break;
                }
                viewDragHelper.m4059a(motionEvent);
                break;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                if (viewDragHelper.f6542a == 1) {
                    viewDragHelper.m4056a(0.0f, 0.0f);
                }
                viewDragHelper.m4055a();
                break;
            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                i = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                x = MotionEventCompat.getX(motionEvent, actionIndex);
                y = MotionEventCompat.getY(motionEvent, actionIndex);
                viewDragHelper.m4057a(x, y, i);
                if (viewDragHelper.f6542a != 0) {
                    if (ViewDragHelper.m4051a(viewDragHelper.f6556o, (int) x, (int) y)) {
                        viewDragHelper.m4062a(viewDragHelper.f6556o, i);
                        break;
                    }
                }
                viewDragHelper.m4062a(viewDragHelper.m4067c((int) x, (int) y), i);
                break;
                break;
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                actionMasked = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                if (viewDragHelper.f6542a == 1 && actionMasked == viewDragHelper.f6543b) {
                    actionIndex = MotionEventCompat.getPointerCount(motionEvent);
                    while (i < actionIndex) {
                        left = MotionEventCompat.getPointerId(motionEvent, i);
                        if (left != viewDragHelper.f6543b) {
                            if (viewDragHelper.m4067c((int) MotionEventCompat.getX(motionEvent, i), (int) MotionEventCompat.getY(motionEvent, i)) == viewDragHelper.f6556o && viewDragHelper.m4062a(viewDragHelper.f6556o, left)) {
                                i = viewDragHelper.f6543b;
                                if (i == -1) {
                                    viewDragHelper.m4063b();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        viewDragHelper.m4063b();
                    }
                }
                viewDragHelper.m4058a(actionMasked);
                break;
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f6534q = true;
        if (this.f6523f != null) {
            this.f6523f.layout(this.f6526i, this.f6527j, this.f6526i + this.f6523f.getMeasuredWidth(), this.f6527j + this.f6523f.getMeasuredHeight());
        }
        this.f6534q = false;
    }

    public void requestLayout() {
        if (!this.f6534q) {
            super.requestLayout();
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i = view == this.f6523f ? 1 : 0;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (!(this.f6532o <= 0.0f || i == 0 || this.f6524g.f6542a == 0)) {
            Rect rect = this.f6535r;
            view.getHitRect(rect);
            if ((this.f6520c & 1) != 0) {
                this.f6529l.setBounds(rect.left - this.f6529l.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
                this.f6529l.setAlpha((int) (this.f6532o * 255.0f));
                this.f6529l.draw(canvas);
            }
            if ((this.f6520c & 2) != 0) {
                this.f6530m.setBounds(rect.right, rect.top, rect.right + this.f6530m.getIntrinsicWidth(), rect.bottom);
                this.f6530m.setAlpha((int) (this.f6532o * 255.0f));
                this.f6530m.draw(canvas);
            }
            if ((this.f6520c & 8) != 0) {
                this.f6531n.setBounds(rect.left, rect.bottom, rect.right, rect.bottom + this.f6531n.getIntrinsicHeight());
                this.f6531n.setAlpha((int) (this.f6532o * 255.0f));
                this.f6531n.draw(canvas);
            }
            i = (((int) (((float) ((this.f6533p & ViewCompat.MEASURED_STATE_MASK) >>> 24)) * this.f6532o)) << 24) | (this.f6533p & ViewCompat.MEASURED_SIZE_MASK);
            if ((this.f6536s & 1) != 0) {
                canvas.clipRect(0, 0, view.getLeft(), getHeight());
            } else if ((this.f6536s & 2) != 0) {
                canvas.clipRect(view.getRight(), 0, getRight(), getHeight());
            } else if ((this.f6536s & 8) != 0) {
                canvas.clipRect(view.getLeft(), view.getBottom(), getRight(), getHeight());
            }
            canvas.drawColor(i);
        }
        return drawChild;
    }

    public void computeScroll() {
        Object obj;
        this.f6532o = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - this.f6525h;
        ViewDragHelper viewDragHelper = this.f6524g;
        if (viewDragHelper.f6542a == 2) {
            boolean isFinished;
            boolean computeScrollOffset = viewDragHelper.f6554m.computeScrollOffset();
            int currX = viewDragHelper.f6554m.getCurrX();
            int currY = viewDragHelper.f6554m.getCurrY();
            int left = currX - viewDragHelper.f6556o.getLeft();
            int top = currY - viewDragHelper.f6556o.getTop();
            if (left != 0) {
                viewDragHelper.f6556o.offsetLeftAndRight(left);
            }
            if (top != 0) {
                viewDragHelper.f6556o.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                viewDragHelper.f6555n.m4017a(viewDragHelper.f6556o, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == viewDragHelper.f6554m.getFinalX() && currY == viewDragHelper.f6554m.getFinalY()) {
                viewDragHelper.f6554m.abortAnimation();
                isFinished = viewDragHelper.f6554m.isFinished();
            } else {
                isFinished = computeScrollOffset;
            }
            if (!isFinished) {
                viewDragHelper.f6558q.post(viewDragHelper.f6559r);
            }
        }
        if (viewDragHelper.f6542a == 2) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }
}
