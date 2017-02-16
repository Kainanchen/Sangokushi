package com.illuminate.texaspoker.view.refreshlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.PointerIconCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Scroller;
import android.widget.TextView;
import com.illuminate.texaspoker.R.R;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.illuminate.texaspoker.view.refreshlayout.e */
public class RefreshLayout extends ViewGroup {
    private static byte f7105e;
    private static byte f7106f;
    private static byte f7107g;
    private static byte f7108h;
    private static byte f7109i;
    private long f7110A;
    private boolean f7111B;
    private Runnable f7112C;
    protected View f7113a;
    RefreshUIHandlerHolder f7114b;
    RefreshIndicator f7115c;
    private byte f7116d;
    private int f7117j;
    private int f7118k;
    private int f7119l;
    private int f7120m;
    private boolean f7121n;
    private boolean f7122o;
    private View f7123p;
    private RefreshHandler f7124q;
    private RefreshLayout f7125r;
    private int f7126s;
    private int f7127t;
    private boolean f7128u;
    private int f7129v;
    private boolean f7130w;
    private MotionEvent f7131x;
    private RefreshUIHandlerHook f7132y;
    private int f7133z;

    /* renamed from: com.illuminate.texaspoker.view.refreshlayout.e.1 */
    class RefreshLayout implements Runnable {
        final /* synthetic */ RefreshLayout f7152a;

        RefreshLayout(RefreshLayout refreshLayout) {
            this.f7152a = refreshLayout;
        }

        public final void run() {
            this.f7152a.m4585i();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.refreshlayout.e.2 */
    class RefreshLayout implements Runnable {
        final /* synthetic */ RefreshLayout f7153a;

        RefreshLayout(RefreshLayout refreshLayout) {
            this.f7153a = refreshLayout;
        }

        public final void run() {
            this.f7153a.m4579b(true);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.refreshlayout.e.a */
    public static class RefreshLayout extends MarginLayoutParams {
        public RefreshLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public RefreshLayout(int i) {
            super(-1, i);
        }

        public RefreshLayout(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.refreshlayout.e.b */
    class RefreshLayout implements Runnable {
        Scroller f7154a;
        boolean f7155b;
        final /* synthetic */ RefreshLayout f7156c;
        private int f7157d;
        private int f7158e;
        private int f7159f;

        public RefreshLayout(RefreshLayout refreshLayout) {
            this.f7156c = refreshLayout;
            this.f7155b = false;
            this.f7154a = new Scroller(refreshLayout.getContext());
        }

        public final void run() {
            boolean z = !this.f7154a.computeScrollOffset() || this.f7154a.isFinished();
            int currY = this.f7154a.getCurrY();
            int i = currY - this.f7157d;
            if (z) {
                m4610a();
                RefreshLayout refreshLayout = this.f7156c;
                if (refreshLayout.f7115c.m4601b() && refreshLayout.m4592d()) {
                    refreshLayout.m4588a(true);
                    return;
                }
                return;
            }
            this.f7157d = currY;
            this.f7156c.m4575a((float) i);
            this.f7156c.post(this);
        }

        final void m4610a() {
            this.f7155b = false;
            this.f7157d = 0;
            this.f7156c.removeCallbacks(this);
        }

        public final void m4611a(int i, int i2) {
            boolean z;
            if (this.f7156c.f7115c.f7143e == i) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f7158e = this.f7156c.f7115c.f7143e;
                this.f7159f = i;
                int i3 = i - this.f7158e;
                this.f7156c.removeCallbacks(this);
                this.f7157d = 0;
                if (!this.f7154a.isFinished()) {
                    this.f7154a.forceFinished(true);
                }
                this.f7154a.startScroll(0, 0, 0, i3, i2);
                this.f7156c.post(this);
                this.f7155b = true;
            }
        }

        static /* synthetic */ void m4608a(RefreshLayout refreshLayout) {
            refreshLayout.m4610a();
            if (!refreshLayout.f7154a.isFinished()) {
                refreshLayout.f7154a.forceFinished(true);
            }
        }
    }

    static {
        f7105e = (byte) 1;
        f7106f = (byte) 2;
        f7107g = (byte) 4;
        f7108h = (byte) 8;
        f7109i = (byte) 3;
    }

    public RefreshLayout(Context context) {
        this(context, null);
    }

    public RefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7116d = (byte) 1;
        this.f7117j = 0;
        this.f7118k = 0;
        this.f7119l = 200;
        this.f7120m = PointerIconCompat.TYPE_DEFAULT;
        this.f7121n = true;
        this.f7122o = false;
        this.f7114b = new RefreshUIHandlerHolder();
        this.f7128u = false;
        this.f7129v = 0;
        this.f7130w = false;
        this.f7133z = 500;
        this.f7110A = 0;
        this.f7111B = false;
        this.f7112C = new RefreshLayout(this);
        this.f7115c = new RefreshIndicator();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.RefreshLayout, 0, 0);
        if (obtainStyledAttributes != null) {
            this.f7117j = obtainStyledAttributes.getResourceId(0, this.f7117j);
            this.f7118k = obtainStyledAttributes.getResourceId(1, this.f7118k);
            this.f7115c.f7148j = obtainStyledAttributes.getFloat(2, this.f7115c.f7148j);
            this.f7119l = obtainStyledAttributes.getInt(4, this.f7119l);
            this.f7120m = obtainStyledAttributes.getInt(5, this.f7120m);
            this.f7115c.m4598a(obtainStyledAttributes.getFloat(3, this.f7115c.f7147i));
            this.f7121n = obtainStyledAttributes.getBoolean(7, this.f7121n);
            this.f7122o = obtainStyledAttributes.getBoolean(6, this.f7122o);
            obtainStyledAttributes.recycle();
        }
        this.f7125r = new RefreshLayout(this);
        this.f7126s = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2;
    }

    protected void onFinishInflate() {
        int childCount = getChildCount();
        if (childCount > 2) {
            throw new IllegalStateException("PtrFrameLayout only can host 2 elements");
        }
        View childAt;
        if (childCount == 2) {
            if (this.f7117j != 0 && this.f7123p == null) {
                this.f7123p = findViewById(this.f7117j);
            }
            if (this.f7118k != 0 && this.f7113a == null) {
                this.f7113a = findViewById(this.f7118k);
            }
            if (this.f7113a == null || this.f7123p == null) {
                RefreshLayout refreshLayout;
                View childAt2 = getChildAt(0);
                childAt = getChildAt(1);
                if (childAt2 instanceof RefreshUIHandler) {
                    this.f7123p = childAt2;
                    refreshLayout = this;
                } else {
                    RefreshLayout refreshLayout2;
                    if (childAt instanceof RefreshUIHandler) {
                        this.f7123p = childAt;
                        refreshLayout2 = this;
                    } else if (this.f7113a == null && this.f7123p == null) {
                        this.f7123p = childAt2;
                        refreshLayout = this;
                    } else if (this.f7123p == null) {
                        if (this.f7113a != childAt2) {
                            childAt = childAt2;
                        }
                        this.f7123p = childAt;
                    } else if (this.f7123p == childAt2) {
                        refreshLayout = this;
                    } else {
                        refreshLayout2 = this;
                    }
                    View view = childAt2;
                    refreshLayout = refreshLayout2;
                    childAt = view;
                }
                refreshLayout.f7113a = childAt;
            }
        } else if (childCount == 1) {
            this.f7113a = getChildAt(0);
        } else {
            childAt = new TextView(getContext());
            childAt.setClickable(true);
            childAt.setTextColor(-39424);
            childAt.setGravity(17);
            childAt.setTextSize(20.0f);
            childAt.setText("The content view in PtrFrameLayout is empty. Do you forget to specify its id in xml layout file?");
            this.f7113a = childAt;
            addView(this.f7113a);
        }
        if (this.f7123p != null) {
            this.f7123p.bringToFront();
        }
        super.onFinishInflate();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7125r != null) {
            RefreshLayout.m4608a(this.f7125r);
        }
        if (this.f7112C != null) {
            removeCallbacks(this.f7112C);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f7123p != null) {
            measureChildWithMargins(this.f7123p, i, 0, i2, 0);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f7123p.getLayoutParams();
            this.f7127t = marginLayoutParams.bottomMargin + (this.f7123p.getMeasuredHeight() + marginLayoutParams.topMargin);
            this.f7115c.m4600b(this.f7127t);
        }
        if (this.f7113a != null) {
            View view = this.f7113a;
            marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            view.measure(RefreshLayout.getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin, marginLayoutParams.width), RefreshLayout.getChildMeasureSpec(i2, (getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin, marginLayoutParams.height));
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!isEnabled() || this.f7113a == null || this.f7123p == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        RefreshIndicator refreshIndicator;
        float x;
        float y;
        switch (motionEvent.getAction()) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                this.f7111B = false;
                refreshIndicator = this.f7115c;
                x = motionEvent.getX();
                y = motionEvent.getY();
                refreshIndicator.f7149k = true;
                refreshIndicator.f7146h = refreshIndicator.f7143e;
                refreshIndicator.f7140b.set(x, y);
                RefreshLayout refreshLayout = this.f7125r;
                if (refreshLayout.f7155b) {
                    if (!refreshLayout.f7154a.isFinished()) {
                        refreshLayout.f7154a.forceFinished(true);
                    }
                    RefreshLayout refreshLayout2 = refreshLayout.f7156c;
                    if (refreshLayout2.f7115c.m4601b() && refreshLayout2.m4592d()) {
                        refreshLayout2.m4588a(true);
                    }
                    refreshLayout.m4610a();
                }
                this.f7130w = false;
                super.dispatchTouchEvent(motionEvent);
                return true;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                this.f7115c.f7149k = false;
                if (!this.f7115c.m4601b()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                m4588a(false);
                if (!this.f7115c.m4603d()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                m4587k();
                return true;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                this.f7131x = motionEvent;
                refreshIndicator = this.f7115c;
                x = motionEvent.getX();
                y = motionEvent.getY();
                float f = (y - refreshIndicator.f7140b.y) / refreshIndicator.f7148j;
                refreshIndicator.f7141c = x - refreshIndicator.f7140b.x;
                refreshIndicator.f7142d = f;
                refreshIndicator.f7140b.set(x, y);
                float f2 = this.f7115c.f7141c;
                x = this.f7115c.f7142d;
                if (this.f7128u && !this.f7130w && Math.abs(f2) > ((float) this.f7126s) && Math.abs(f2) > Math.abs(x) && this.f7115c.m4604e()) {
                    this.f7130w = true;
                }
                if (this.f7130w) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                boolean z2 = x > 0.0f;
                if (!z2) {
                    z = true;
                }
                boolean b = this.f7115c.m4601b();
                if (z2 && this.f7124q != null && !this.f7124q.m2767a(this.f7113a)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((z && b) || z2) {
                    m4575a(x);
                    return true;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4575a(float r13) {
        /*
        r12 = this;
        r11 = 2;
        r8 = 1;
        r4 = 0;
        r0 = 0;
        r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0011;
    L_0x0008:
        r0 = r12.f7115c;
        r0 = r0.m4604e();
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r0 = r12.f7115c;
        r0 = r0.f7143e;
        r1 = (int) r13;
        r0 = r0 + r1;
        if (r0 >= 0) goto L_0x00f4;
    L_0x0019:
        r1 = r8;
    L_0x001a:
        if (r1 == 0) goto L_0x001d;
    L_0x001c:
        r0 = r4;
    L_0x001d:
        r1 = r12.f7115c;
        r2 = r1.f7143e;
        r1.f7144f = r2;
        r1.f7143e = r0;
        r1 = r12.f7115c;
        r1 = r1.f7144f;
        r9 = r0 - r1;
        if (r9 == 0) goto L_0x0010;
    L_0x002d:
        r0 = r12.f7115c;
        r10 = r0.f7149k;
        if (r10 == 0) goto L_0x0044;
    L_0x0033:
        r0 = r12.f7111B;
        if (r0 != 0) goto L_0x0044;
    L_0x0037:
        r0 = r12.f7115c;
        r0 = r0.m4603d();
        if (r0 == 0) goto L_0x0044;
    L_0x003f:
        r12.f7111B = r8;
        r12.m4587k();
    L_0x0044:
        r0 = r12.f7115c;
        r1 = r0.f7144f;
        if (r1 != 0) goto L_0x00f7;
    L_0x004a:
        r0 = r0.m4601b();
        if (r0 == 0) goto L_0x00f7;
    L_0x0050:
        r0 = r8;
    L_0x0051:
        if (r0 == 0) goto L_0x0057;
    L_0x0053:
        r0 = r12.f7116d;
        if (r0 == r8) goto L_0x0071;
    L_0x0057:
        r0 = r12.f7115c;
        r1 = r0.f7143e;
        r0 = r0.f7151m;
        if (r1 < r0) goto L_0x00fa;
    L_0x005f:
        r0 = r8;
    L_0x0060:
        if (r0 == 0) goto L_0x0073;
    L_0x0062:
        r0 = r12.f7116d;
        r1 = 4;
        if (r0 != r1) goto L_0x0073;
    L_0x0067:
        r0 = r12.f7129v;
        r1 = f7107g;
        r0 = r0 & r1;
        if (r0 <= 0) goto L_0x00fd;
    L_0x006e:
        r0 = r8;
    L_0x006f:
        if (r0 == 0) goto L_0x0073;
    L_0x0071:
        r12.f7116d = r11;
    L_0x0073:
        r0 = r12.f7115c;
        r1 = r0.f7144f;
        if (r1 == 0) goto L_0x0100;
    L_0x0079:
        r0 = r0.m4604e();
        if (r0 == 0) goto L_0x0100;
    L_0x007f:
        r0 = r8;
    L_0x0080:
        if (r0 == 0) goto L_0x00a4;
    L_0x0082:
        r12.m4584h();
        if (r10 == 0) goto L_0x00a4;
    L_0x0087:
        r7 = r12.f7131x;
        r0 = r7.getDownTime();
        r2 = r7.getEventTime();
        r5 = r7.getX();
        r6 = r7.getY();
        r7 = r7.getMetaState();
        r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7);
        super.dispatchTouchEvent(r0);
    L_0x00a4:
        r0 = r12.f7116d;
        if (r0 != r11) goto L_0x00df;
    L_0x00a8:
        if (r10 == 0) goto L_0x00bf;
    L_0x00aa:
        r0 = r12.m4592d();
        if (r0 != 0) goto L_0x00bf;
    L_0x00b0:
        r0 = r12.f7122o;
        if (r0 == 0) goto L_0x00bf;
    L_0x00b4:
        r0 = r12.f7115c;
        r0 = r0.m4605f();
        if (r0 == 0) goto L_0x00bf;
    L_0x00bc:
        r12.m4582f();
    L_0x00bf:
        r0 = r12.f7129v;
        r1 = f7109i;
        r0 = r0 & r1;
        r1 = f7106f;
        if (r0 != r1) goto L_0x0103;
    L_0x00c8:
        r0 = r8;
    L_0x00c9:
        if (r0 == 0) goto L_0x00df;
    L_0x00cb:
        r0 = r12.f7115c;
        r1 = r0.f7144f;
        r2 = r0.f7145g;
        if (r1 >= r2) goto L_0x00da;
    L_0x00d3:
        r1 = r0.f7143e;
        r0 = r0.f7145g;
        if (r1 < r0) goto L_0x00da;
    L_0x00d9:
        r4 = r8;
    L_0x00da:
        if (r4 == 0) goto L_0x00df;
    L_0x00dc:
        r12.m4582f();
    L_0x00df:
        r0 = r12.f7123p;
        r0.offsetTopAndBottom(r9);
        r0 = r12.m4586j();
        if (r0 != 0) goto L_0x00ef;
    L_0x00ea:
        r0 = r12.f7113a;
        r0.offsetTopAndBottom(r9);
    L_0x00ef:
        r12.invalidate();
        goto L_0x0010;
    L_0x00f4:
        r1 = r4;
        goto L_0x001a;
    L_0x00f7:
        r0 = r4;
        goto L_0x0051;
    L_0x00fa:
        r0 = r4;
        goto L_0x0060;
    L_0x00fd:
        r0 = r4;
        goto L_0x006f;
    L_0x0100:
        r0 = r4;
        goto L_0x0080;
    L_0x0103:
        r0 = r4;
        goto L_0x00c9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.illuminate.texaspoker.view.refreshlayout.e.a(float):void");
    }

    public int getHeaderHeight() {
        return this.f7127t;
    }

    final void m4588a(boolean z) {
        m4582f();
        if (this.f7116d == 3) {
            if (!this.f7121n) {
                m4581e();
            } else if (this.f7115c.m4606g() && !z) {
                this.f7125r.m4611a(this.f7115c.m4607h(), this.f7119l);
            }
        } else if (this.f7116d == 4) {
            m4579b(false);
        } else {
            m4581e();
        }
    }

    public void setRefreshCompleteHook(RefreshUIHandlerHook refreshUIHandlerHook) {
        this.f7132y = refreshUIHandlerHook;
        refreshUIHandlerHook.f7162a = new RefreshLayout(this);
    }

    private void m4581e() {
        if (!this.f7115c.f7149k) {
            this.f7125r.m4611a(0, this.f7120m);
        }
    }

    private boolean m4582f() {
        if (this.f7116d == 2 && ((this.f7115c.m4606g() && m4592d()) || this.f7115c.m4602c())) {
            this.f7116d = (byte) 3;
            m4583g();
        }
        return false;
    }

    private void m4583g() {
        this.f7110A = System.currentTimeMillis();
        if (this.f7124q != null) {
            this.f7124q.m2766a();
        }
    }

    private boolean m4584h() {
        if ((this.f7116d != 4 && this.f7116d != 2) || !this.f7115c.m4604e()) {
            return false;
        }
        this.f7116d = (byte) 1;
        this.f7129v &= f7109i ^ -1;
        return true;
    }

    public final boolean m4589a() {
        return this.f7116d == 3;
    }

    public final void m4590b() {
        if (this.f7132y != null) {
            this.f7132y.f7163b = (byte) 0;
        }
        int currentTimeMillis = (int) (((long) this.f7133z) - (System.currentTimeMillis() - this.f7110A));
        if (currentTimeMillis <= 0) {
            m4585i();
        } else {
            postDelayed(this.f7112C, (long) currentTimeMillis);
        }
    }

    private void m4585i() {
        this.f7116d = (byte) 4;
        if (!this.f7125r.f7155b || !m4592d()) {
            m4579b(false);
        }
    }

    private void m4579b(boolean z) {
        if (!this.f7115c.m4601b() || z || this.f7132y == null) {
            RefreshIndicator refreshIndicator = this.f7115c;
            refreshIndicator.f7151m = refreshIndicator.f7143e;
            m4581e();
            m4584h();
            return;
        }
        RefreshUIHandlerHook refreshUIHandlerHook = this.f7132y;
        switch (refreshUIHandlerHook.f7163b) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                refreshUIHandlerHook.f7163b = (byte) 1;
                refreshUIHandlerHook.run();
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                if (refreshUIHandlerHook.f7162a != null) {
                    refreshUIHandlerHook.f7162a.run();
                }
                refreshUIHandlerHook.f7163b = (byte) 2;
            default:
        }
    }

    public final void m4591c() {
        int i = this.f7120m;
        if (this.f7116d == 1) {
            this.f7129v |= f7105e;
            this.f7116d = (byte) 2;
            this.f7125r.m4611a(this.f7115c.m4597a(), i);
            this.f7116d = (byte) 3;
            m4583g();
        }
    }

    public final boolean m4592d() {
        return (this.f7129v & f7109i) > 0;
    }

    public void setEnabledNextPtrAtOnce(boolean z) {
        if (z) {
            this.f7129v |= f7107g;
        } else {
            this.f7129v &= f7107g ^ -1;
        }
    }

    private boolean m4586j() {
        return (this.f7129v & f7108h) > 0;
    }

    public void setPinContent(boolean z) {
        if (z) {
            this.f7129v |= f7108h;
        } else {
            this.f7129v &= f7108h ^ -1;
        }
    }

    public void setLoadingMinTime(int i) {
        this.f7133z = i;
    }

    @Deprecated
    public void setInterceptEventWhileWorking(boolean z) {
    }

    public View getContentView() {
        return this.f7113a;
    }

    public void setPtrHandler(RefreshHandler refreshHandler) {
        this.f7124q = refreshHandler;
    }

    public void setPtrIndicator(RefreshIndicator refreshIndicator) {
        if (!(this.f7115c == null || this.f7115c == refreshIndicator)) {
            RefreshIndicator refreshIndicator2 = this.f7115c;
            refreshIndicator.f7143e = refreshIndicator2.f7143e;
            refreshIndicator.f7144f = refreshIndicator2.f7144f;
            refreshIndicator.f7145g = refreshIndicator2.f7145g;
        }
        this.f7115c = refreshIndicator;
    }

    public float getResistance() {
        return this.f7115c.f7148j;
    }

    public void setResistance(float f) {
        this.f7115c.f7148j = f;
    }

    public float getDurationToClose() {
        return (float) this.f7119l;
    }

    public void setDurationToClose(int i) {
        this.f7119l = i;
    }

    public long getDurationToCloseHeader() {
        return (long) this.f7120m;
    }

    public void setDurationToCloseHeader(int i) {
        this.f7120m = i;
    }

    public void setRatioOfHeaderHeightToRefresh(float f) {
        this.f7115c.m4598a(f);
    }

    public int getOffsetToRefresh() {
        return this.f7115c.m4597a();
    }

    public void setOffsetToRefresh(int i) {
        this.f7115c.m4599a(i);
    }

    public float getRatioOfHeaderToHeightRefresh() {
        return this.f7115c.f7147i;
    }

    public int getOffsetToKeepHeaderWhileLoading() {
        return this.f7115c.m4607h();
    }

    public void setOffsetToKeepHeaderWhileLoading(int i) {
        this.f7115c.f7150l = i;
    }

    public void setKeepHeaderWhenRefresh(boolean z) {
        this.f7121n = z;
    }

    public void setPullToRefresh(boolean z) {
        this.f7122o = z;
    }

    public View getHeaderView() {
        return this.f7123p;
    }

    public void setHeaderView(View view) {
        if (!(this.f7123p == null || view == null || this.f7123p == view)) {
            removeView(this.f7123p);
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new RefreshLayout(-2));
        }
        this.f7123p = view;
        addView(view);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof RefreshLayout);
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new RefreshLayout(-1);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new RefreshLayout(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new RefreshLayout(getContext(), attributeSet);
    }

    private void m4587k() {
        if (this.f7131x != null) {
            MotionEvent motionEvent = this.f7131x;
            super.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime() + ((long) ViewConfiguration.getLongPressTimeout()), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.f7115c.f7143e;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (this.f7123p != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f7123p.getLayoutParams();
            int i6 = marginLayoutParams.leftMargin + paddingLeft;
            int i7 = ((marginLayoutParams.topMargin + paddingTop) + i5) - this.f7127t;
            this.f7123p.layout(i6, i7, this.f7123p.getMeasuredWidth() + i6, this.f7123p.getMeasuredHeight() + i7);
        }
        if (this.f7113a != null) {
            if (m4586j()) {
                i5 = 0;
            }
            marginLayoutParams = (MarginLayoutParams) this.f7113a.getLayoutParams();
            paddingLeft += marginLayoutParams.leftMargin;
            i7 = (marginLayoutParams.topMargin + paddingTop) + i5;
            this.f7113a.layout(paddingLeft, i7, this.f7113a.getMeasuredWidth() + paddingLeft, this.f7113a.getMeasuredHeight() + i7);
        }
    }
}
