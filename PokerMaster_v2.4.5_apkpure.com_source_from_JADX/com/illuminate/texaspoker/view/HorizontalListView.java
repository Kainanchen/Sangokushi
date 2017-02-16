package com.illuminate.texaspoker.view;

import a.does.not.Exists2;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.ali.fixHelper;
import com.android.volley.DefaultRetryPolicy;
import com.illuminate.texaspoker.R.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HorizontalListView extends AdapterView<ListAdapter> {
    private boolean f6794A;
    private boolean f6795B;
    private OnClickListener f6796C;
    private DataSetObserver f6797D;
    private Runnable f6798E;
    protected Scroller f6799a;
    protected ListAdapter f6800b;
    protected int f6801c;
    protected int f6802d;
    private final C0921a f6803e;
    private GestureDetector f6804f;
    private int f6805g;
    private List<Queue<View>> f6806h;
    private boolean f6807i;
    private Rect f6808j;
    private View f6809k;
    private int f6810l;
    private Drawable f6811m;
    private Integer f6812n;
    private int f6813o;
    private int f6814p;
    private int f6815q;
    private int f6816r;
    private C0926e f6817s;
    private int f6818t;
    private boolean f6819u;
    private C0925d f6820v;
    private int f6821w;
    private EdgeEffectCompat f6822x;
    private EdgeEffectCompat f6823y;
    private int f6824z;

    /* renamed from: com.illuminate.texaspoker.view.HorizontalListView.1 */
    class C09181 implements OnTouchListener {
        final /* synthetic */ HorizontalListView f6786a;

        C09181(HorizontalListView horizontalListView) {
            this.f6786a = horizontalListView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f6786a.f6804f.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.HorizontalListView.2 */
    class C09192 extends DataSetObserver {
        final /* synthetic */ HorizontalListView f6787a;

        C09192(HorizontalListView horizontalListView) {
            this.f6787a = horizontalListView;
        }

        public final void onChanged() {
            this.f6787a.f6807i = true;
            this.f6787a.f6819u = false;
            this.f6787a.m4532d();
            this.f6787a.invalidate();
            this.f6787a.requestLayout();
        }

        public final void onInvalidated() {
            this.f6787a.f6819u = false;
            this.f6787a.m4532d();
            this.f6787a.m4526b();
            this.f6787a.invalidate();
            this.f6787a.requestLayout();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.HorizontalListView.3 */
    class C09203 implements Runnable {
        final /* synthetic */ HorizontalListView f6788a;

        C09203(HorizontalListView horizontalListView) {
            this.f6788a = horizontalListView;
        }

        public final void run() {
            this.f6788a.requestLayout();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.HorizontalListView.a */
    private class C0921a extends SimpleOnGestureListener {
        final /* synthetic */ HorizontalListView f6789a;

        static {
            fixHelper.fixfunc(new int[]{225, 226, 227, 228, 229, 230, 231});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        private native C0921a(HorizontalListView horizontalListView);

        native /* synthetic */ C0921a(HorizontalListView horizontalListView, byte b);

        public final native boolean onDown(MotionEvent motionEvent);

        public final native boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        public final native void onLongPress(MotionEvent motionEvent);

        public final native boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        public final native boolean onSingleTapConfirmed(MotionEvent motionEvent);
    }

    @TargetApi(11)
    /* renamed from: com.illuminate.texaspoker.view.HorizontalListView.b */
    private static final class C0922b {
        static {
            if (VERSION.SDK_INT < 11) {
                throw new RuntimeException("Should not get to HoneycombPlus class unless sdk is >= 11!");
            }
        }

        public static void m4512a(Scroller scroller) {
            if (scroller != null) {
                scroller.setFriction(0.009f);
            }
        }
    }

    @TargetApi(14)
    /* renamed from: com.illuminate.texaspoker.view.HorizontalListView.c */
    private static final class C0923c {
        static {
            if (VERSION.SDK_INT < 14) {
                throw new RuntimeException("Should not get to IceCreamSandwichPlus class unless sdk is >= 14!");
            }
        }

        public static float m4513a(Scroller scroller) {
            return scroller.getCurrVelocity();
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.HorizontalListView.d */
    public interface C0925d {

        /* renamed from: com.illuminate.texaspoker.view.HorizontalListView.d.a */
        public enum C0924a {
            ;

            static {
                f6790a = 1;
                f6791b = 2;
                f6792c = 3;
                f6793d = new int[]{f6790a, f6791b, f6792c};
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.view.HorizontalListView.e */
    public interface C0926e {
    }

    public HorizontalListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6799a = new Scroller(getContext());
        this.f6803e = new C0921a();
        this.f6806h = new ArrayList();
        this.f6807i = false;
        this.f6808j = new Rect();
        this.f6809k = null;
        this.f6810l = 0;
        this.f6811m = null;
        this.f6812n = null;
        this.f6813o = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f6817s = null;
        this.f6818t = 0;
        this.f6819u = false;
        this.f6820v = null;
        this.f6821w = C0924a.f6790a;
        this.f6794A = false;
        this.f6795B = false;
        this.f6797D = new C09192(this);
        this.f6798E = new C09203(this);
        this.f6822x = new EdgeEffectCompat(context);
        this.f6823y = new EdgeEffectCompat(context);
        this.f6804f = new GestureDetector(context, this.f6803e);
        setOnTouchListener(new C09181(this));
        m4518a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.HorizontalListView);
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (drawable != null) {
                setDivider(drawable);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            if (dimensionPixelSize != 0) {
                setDividerWidth(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
        }
        setWillNotDraw(false);
        if (VERSION.SDK_INT >= 11) {
            C0922b.m4512a(this.f6799a);
        }
    }

    private void m4524a(Boolean bool) {
        if (this.f6795B != bool.booleanValue()) {
            View view = this;
            while (view.getParent() instanceof View) {
                if ((view.getParent() instanceof ListView) || (view.getParent() instanceof ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.f6795B = bool.booleanValue();
                    return;
                }
                view = (View) view.getParent();
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
        bundle.putInt("BUNDLE_ID_CURRENT_X", this.f6801c);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f6812n = Integer.valueOf(bundle.getInt("BUNDLE_ID_CURRENT_X"));
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_ID_PARENT_STATE"));
        }
    }

    public void setDivider(Drawable drawable) {
        this.f6811m = drawable;
        if (drawable != null) {
            setDividerWidth(drawable.getIntrinsicWidth());
        } else {
            setDividerWidth(0);
        }
    }

    public void setDividerWidth(int i) {
        this.f6810l = i;
        requestLayout();
        invalidate();
    }

    private void m4518a() {
        this.f6814p = -1;
        this.f6815q = -1;
        this.f6805g = 0;
        this.f6801c = 0;
        this.f6802d = 0;
        this.f6813o = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        setCurrentScrollState$4d7dff8c(C0924a.f6790a);
    }

    private void m4526b() {
        m4518a();
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setSelection(int i) {
        this.f6816r = i;
    }

    public View getSelectedView() {
        int i = this.f6816r;
        if (i < this.f6814p || i > this.f6815q) {
            return null;
        }
        return getChildAt(i - this.f6814p);
    }

    public void setAdapter(ListAdapter listAdapter) {
        int i = 0;
        if (this.f6800b != null) {
            this.f6800b.unregisterDataSetObserver(this.f6797D);
        }
        if (listAdapter != null) {
            this.f6819u = false;
            this.f6800b = listAdapter;
            this.f6800b.registerDataSetObserver(this.f6797D);
        }
        int viewTypeCount = this.f6800b.getViewTypeCount();
        this.f6806h.clear();
        while (i < viewTypeCount) {
            this.f6806h.add(new LinkedList());
            i++;
        }
        m4526b();
    }

    public ListAdapter getAdapter() {
        return this.f6800b;
    }

    private View m4525b(int i) {
        int itemViewType = this.f6800b.getItemViewType(i);
        if (m4530c(itemViewType)) {
            return (View) ((Queue) this.f6806h.get(itemViewType)).poll();
        }
        return null;
    }

    private void m4519a(int i, View view) {
        int itemViewType = this.f6800b.getItemViewType(i);
        if (m4530c(itemViewType)) {
            ((Queue) this.f6806h.get(itemViewType)).offer(view);
        }
    }

    private boolean m4530c(int i) {
        return i < this.f6806h.size();
    }

    private void m4521a(View view, int i) {
        int makeMeasureSpec;
        addViewInLayout(view, i, m4517a(view), true);
        LayoutParams a = m4517a(view);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6824z, getPaddingTop() + getPaddingBottom(), a.height);
        if (a.width > 0) {
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(a.width, 1073741824);
        } else {
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(makeMeasureSpec, childMeasureSpec);
    }

    private static LayoutParams m4517a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return new LayoutParams(-2, -1);
        }
        return layoutParams;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"WrongCall"})
    protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
        r10 = this;
        r3 = 1;
        r1 = 0;
        super.onLayout(r11, r12, r13, r14, r15);
        r0 = r10.f6800b;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r10.invalidate();
        r0 = r10.f6807i;
        if (r0 == 0) goto L_0x001d;
    L_0x0011:
        r0 = r10.f6801c;
        r10.m4518a();
        r10.removeAllViewsInLayout();
        r10.f6802d = r0;
        r10.f6807i = r1;
    L_0x001d:
        r0 = r10.f6812n;
        if (r0 == 0) goto L_0x002c;
    L_0x0021:
        r0 = r10.f6812n;
        r0 = r0.intValue();
        r10.f6802d = r0;
        r0 = 0;
        r10.f6812n = r0;
    L_0x002c:
        r0 = r10.f6799a;
        r0 = r0.computeScrollOffset();
        if (r0 == 0) goto L_0x003c;
    L_0x0034:
        r0 = r10.f6799a;
        r0 = r0.getCurrX();
        r10.f6802d = r0;
    L_0x003c:
        r0 = r10.f6802d;
        if (r0 >= 0) goto L_0x0097;
    L_0x0040:
        r10.f6802d = r1;
        r0 = r10.f6822x;
        r0 = r0.isFinished();
        if (r0 == 0) goto L_0x0054;
    L_0x004a:
        r0 = r10.f6822x;
        r2 = r10.m4529c();
        r2 = (int) r2;
        r0.onAbsorb(r2);
    L_0x0054:
        r0 = r10.f6799a;
        r0.forceFinished(r3);
        r0 = com.illuminate.texaspoker.view.HorizontalListView.C0925d.C0924a.f6790a;
        r10.setCurrentScrollState$4d7dff8c(r0);
    L_0x005e:
        r0 = r10.f6801c;
        r2 = r10.f6802d;
        r4 = r0 - r2;
        r0 = r10.getLeftmostChild();
        r2 = r0;
    L_0x0069:
        if (r2 == 0) goto L_0x00c6;
    L_0x006b:
        r0 = r2.getRight();
        r0 = r0 + r4;
        if (r0 > 0) goto L_0x00c6;
    L_0x0072:
        r5 = r10.f6805g;
        r0 = r10.f6814p;
        r0 = r10.m4534d(r0);
        if (r0 == 0) goto L_0x00be;
    L_0x007c:
        r0 = r2.getMeasuredWidth();
    L_0x0080:
        r0 = r0 + r5;
        r10.f6805g = r0;
        r0 = r10.f6814p;
        r10.m4519a(r0, r2);
        r10.removeViewInLayout(r2);
        r0 = r10.f6814p;
        r0 = r0 + 1;
        r10.f6814p = r0;
        r0 = r10.getLeftmostChild();
        r2 = r0;
        goto L_0x0069;
    L_0x0097:
        r0 = r10.f6802d;
        r2 = r10.f6813o;
        if (r0 <= r2) goto L_0x005e;
    L_0x009d:
        r0 = r10.f6813o;
        r10.f6802d = r0;
        r0 = r10.f6823y;
        r0 = r0.isFinished();
        if (r0 == 0) goto L_0x00b3;
    L_0x00a9:
        r0 = r10.f6823y;
        r2 = r10.m4529c();
        r2 = (int) r2;
        r0.onAbsorb(r2);
    L_0x00b3:
        r0 = r10.f6799a;
        r0.forceFinished(r3);
        r0 = com.illuminate.texaspoker.view.HorizontalListView.C0925d.C0924a.f6790a;
        r10.setCurrentScrollState$4d7dff8c(r0);
        goto L_0x005e;
    L_0x00be:
        r0 = r10.f6810l;
        r6 = r2.getMeasuredWidth();
        r0 = r0 + r6;
        goto L_0x0080;
    L_0x00c6:
        r0 = r10.getRightmostChild();
        if (r0 == 0) goto L_0x00e6;
    L_0x00cc:
        r2 = r0.getLeft();
        r2 = r2 + r4;
        r5 = r10.getWidth();
        if (r2 < r5) goto L_0x00e6;
    L_0x00d7:
        r2 = r10.f6815q;
        r10.m4519a(r2, r0);
        r10.removeViewInLayout(r0);
        r0 = r10.f6815q;
        r0 = r0 + -1;
        r10.f6815q = r0;
        goto L_0x00c6;
    L_0x00e6:
        r0 = r10.getRightmostChild();
        if (r0 == 0) goto L_0x0235;
    L_0x00ec:
        r0 = r0.getRight();
    L_0x00f0:
        r2 = r0 + r4;
        r5 = r10.f6810l;
        r2 = r2 + r5;
        r5 = r10.getWidth();
        if (r2 >= r5) goto L_0x0153;
    L_0x00fb:
        r2 = r10.f6815q;
        r2 = r2 + 1;
        r5 = r10.f6800b;
        r5 = r5.getCount();
        if (r2 >= r5) goto L_0x0153;
    L_0x0107:
        r2 = r10.f6815q;
        r2 = r2 + 1;
        r10.f6815q = r2;
        r2 = r10.f6814p;
        if (r2 >= 0) goto L_0x0115;
    L_0x0111:
        r2 = r10.f6815q;
        r10.f6814p = r2;
    L_0x0115:
        r2 = r10.f6800b;
        r5 = r10.f6815q;
        r6 = r10.f6815q;
        r6 = r10.m4525b(r6);
        r5 = r2.getView(r5, r6, r10);
        r2 = -1;
        r10.m4521a(r5, r2);
        r2 = r10.f6815q;
        if (r2 != 0) goto L_0x0150;
    L_0x012b:
        r2 = r1;
    L_0x012c:
        r5 = r5.getMeasuredWidth();
        r2 = r2 + r5;
        r0 = r0 + r2;
        r2 = r10.f6817s;
        if (r2 == 0) goto L_0x00f0;
    L_0x0136:
        r2 = r10.f6800b;
        if (r2 == 0) goto L_0x00f0;
    L_0x013a:
        r2 = r10.f6800b;
        r2 = r2.getCount();
        r5 = r10.f6815q;
        r5 = r5 + 1;
        r2 = r2 - r5;
        r5 = r10.f6818t;
        if (r2 >= r5) goto L_0x00f0;
    L_0x0149:
        r2 = r10.f6819u;
        if (r2 != 0) goto L_0x00f0;
    L_0x014d:
        r10.f6819u = r3;
        goto L_0x00f0;
    L_0x0150:
        r2 = r10.f6810l;
        goto L_0x012c;
    L_0x0153:
        r0 = r10.getLeftmostChild();
        if (r0 == 0) goto L_0x0232;
    L_0x0159:
        r0 = r0.getLeft();
    L_0x015d:
        r2 = r0 + r4;
        r5 = r10.f6810l;
        r2 = r2 - r5;
        if (r2 <= 0) goto L_0x01a7;
    L_0x0164:
        r2 = r10.f6814p;
        if (r2 <= 0) goto L_0x01a7;
    L_0x0168:
        r2 = r10.f6814p;
        r2 = r2 + -1;
        r10.f6814p = r2;
        r2 = r10.f6800b;
        r5 = r10.f6814p;
        r6 = r10.f6814p;
        r6 = r10.m4525b(r6);
        r5 = r2.getView(r5, r6, r10);
        r10.m4521a(r5, r1);
        r2 = r10.f6814p;
        if (r2 != 0) goto L_0x0197;
    L_0x0183:
        r2 = r5.getMeasuredWidth();
    L_0x0187:
        r0 = r0 - r2;
        r6 = r10.f6805g;
        r2 = r0 + r4;
        if (r2 != 0) goto L_0x019f;
    L_0x018e:
        r2 = r5.getMeasuredWidth();
    L_0x0192:
        r2 = r6 - r2;
        r10.f6805g = r2;
        goto L_0x015d;
    L_0x0197:
        r2 = r10.f6810l;
        r6 = r5.getMeasuredWidth();
        r2 = r2 + r6;
        goto L_0x0187;
    L_0x019f:
        r2 = r10.f6810l;
        r5 = r5.getMeasuredWidth();
        r2 = r2 + r5;
        goto L_0x0192;
    L_0x01a7:
        r5 = r10.getChildCount();
        if (r5 <= 0) goto L_0x01dd;
    L_0x01ad:
        r0 = r10.f6805g;
        r0 = r0 + r4;
        r10.f6805g = r0;
        r0 = r10.f6805g;
        r2 = r0;
        r0 = r1;
    L_0x01b6:
        if (r0 >= r5) goto L_0x01dd;
    L_0x01b8:
        r4 = r10.getChildAt(r0);
        r6 = r10.getPaddingLeft();
        r6 = r6 + r2;
        r7 = r10.getPaddingTop();
        r8 = r4.getMeasuredWidth();
        r8 = r8 + r6;
        r9 = r4.getMeasuredHeight();
        r9 = r9 + r7;
        r4.layout(r6, r7, r8, r9);
        r4 = r4.getMeasuredWidth();
        r6 = r10.f6810l;
        r4 = r4 + r6;
        r2 = r2 + r4;
        r0 = r0 + 1;
        goto L_0x01b6;
    L_0x01dd:
        r0 = r10.f6802d;
        r10.f6801c = r0;
        r0 = r10.f6815q;
        r0 = r10.m4534d(r0);
        if (r0 == 0) goto L_0x020f;
    L_0x01e9:
        r0 = r10.getRightmostChild();
        if (r0 == 0) goto L_0x020f;
    L_0x01ef:
        r2 = r10.f6813o;
        r4 = r10.f6801c;
        r0 = r0.getRight();
        r5 = r10.getPaddingLeft();
        r0 = r0 - r5;
        r0 = r0 + r4;
        r4 = r10.getRenderWidth();
        r0 = r0 - r4;
        r10.f6813o = r0;
        r0 = r10.f6813o;
        if (r0 >= 0) goto L_0x020a;
    L_0x0208:
        r10.f6813o = r1;
    L_0x020a:
        r0 = r10.f6813o;
        if (r0 == r2) goto L_0x020f;
    L_0x020e:
        r1 = r3;
    L_0x020f:
        if (r1 == 0) goto L_0x0216;
    L_0x0211:
        r10.onLayout(r11, r12, r13, r14, r15);
        goto L_0x0009;
    L_0x0216:
        r0 = r10.f6799a;
        r0 = r0.isFinished();
        if (r0 == 0) goto L_0x022b;
    L_0x021e:
        r0 = r10.f6821w;
        r1 = com.illuminate.texaspoker.view.HorizontalListView.C0925d.C0924a.f6792c;
        if (r0 != r1) goto L_0x0009;
    L_0x0224:
        r0 = com.illuminate.texaspoker.view.HorizontalListView.C0925d.C0924a.f6790a;
        r10.setCurrentScrollState$4d7dff8c(r0);
        goto L_0x0009;
    L_0x022b:
        r0 = r10.f6798E;
        android.support.v4.view.ViewCompat.postOnAnimation(r10, r0);
        goto L_0x0009;
    L_0x0232:
        r0 = r1;
        goto L_0x015d;
    L_0x0235:
        r0 = r1;
        goto L_0x00f0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.illuminate.texaspoker.view.HorizontalListView.onLayout(boolean, int, int, int, int):void");
    }

    protected float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (this.f6801c == 0) {
            return 0.0f;
        }
        if (this.f6801c < horizontalFadingEdgeLength) {
            return ((float) this.f6801c) / ((float) horizontalFadingEdgeLength);
        }
        return DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
    }

    protected float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (this.f6801c == this.f6813o) {
            return 0.0f;
        }
        if (this.f6813o - this.f6801c < horizontalFadingEdgeLength) {
            return ((float) (this.f6813o - this.f6801c)) / ((float) horizontalFadingEdgeLength);
        }
        return DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
    }

    private float m4529c() {
        if (VERSION.SDK_INT >= 14) {
            return C0923c.m4513a(this.f6799a);
        }
        return 30.0f;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f6824z = i2;
    }

    private View getLeftmostChild() {
        return getChildAt(0);
    }

    private View getRightmostChild() {
        return getChildAt(getChildCount() - 1);
    }

    private int m4514a(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getHitRect(this.f6808j);
            if (this.f6808j.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    private boolean m4534d(int i) {
        return i == this.f6800b.getCount() + -1;
    }

    private int getRenderHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getRenderWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final void m4541a(int i) {
        this.f6799a.startScroll(this.f6802d, 0, i - this.f6802d, 0);
        setCurrentScrollState$4d7dff8c(C0924a.f6792c);
        requestLayout();
    }

    public int getFirstVisiblePosition() {
        return this.f6814p;
    }

    public int getLastVisiblePosition() {
        return this.f6815q;
    }

    private void m4520a(Canvas canvas, Rect rect) {
        if (this.f6811m != null) {
            this.f6811m.setBounds(rect);
            this.f6811m.draw(canvas);
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int childCount = getChildCount();
        Rect rect = this.f6808j;
        this.f6808j.top = getPaddingTop();
        this.f6808j.bottom = this.f6808j.top + getRenderHeight();
        for (int i = 0; i < childCount; i++) {
            if (i != childCount - 1 || !m4534d(this.f6815q)) {
                View childAt = getChildAt(i);
                rect.left = childAt.getRight();
                rect.right = childAt.getRight() + this.f6810l;
                if (rect.left < getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                }
                if (rect.right > getWidth() - getPaddingRight()) {
                    rect.right = getWidth() - getPaddingRight();
                }
                m4520a(canvas, rect);
                if (i == 0 && childAt.getLeft() > getPaddingLeft()) {
                    rect.left = getPaddingLeft();
                    rect.right = childAt.getLeft();
                    m4520a(canvas, rect);
                }
            }
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int save;
        int height;
        if (this.f6822x != null && !this.f6822x.isFinished() && m4537f()) {
            save = canvas.save();
            height = getHeight();
            canvas.rotate(-90.0f, 0.0f, 0.0f);
            canvas.translate((float) ((-height) + getPaddingBottom()), 0.0f);
            this.f6822x.setSize(getRenderHeight(), getRenderWidth());
            if (this.f6822x.draw(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(save);
        } else if (this.f6823y != null && !this.f6823y.isFinished() && m4537f()) {
            save = canvas.save();
            height = getWidth();
            canvas.rotate(90.0f, 0.0f, 0.0f);
            canvas.translate((float) getPaddingTop(), (float) (-height));
            this.f6823y.setSize(getRenderHeight(), getRenderWidth());
            if (this.f6823y.draw(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(save);
        }
    }

    protected void dispatchSetPressed(boolean z) {
    }

    protected final boolean m4542a(float f) {
        this.f6799a.fling(this.f6802d, 0, (int) (-f), 0, 0, this.f6813o, 0, 0);
        setCurrentScrollState$4d7dff8c(C0924a.f6792c);
        requestLayout();
        return true;
    }

    protected final boolean m4543a(MotionEvent motionEvent) {
        this.f6794A = !this.f6799a.isFinished();
        this.f6799a.forceFinished(true);
        setCurrentScrollState$4d7dff8c(C0924a.f6790a);
        m4532d();
        if (!this.f6794A) {
            int a = m4514a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a >= 0) {
                this.f6809k = getChildAt(a);
                if (this.f6809k != null) {
                    this.f6809k.setPressed(true);
                    refreshDrawableState();
                }
            }
        }
        return true;
    }

    private void m4532d() {
        if (this.f6809k != null) {
            this.f6809k.setPressed(false);
            refreshDrawableState();
            this.f6809k = null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f6799a == null || this.f6799a.isFinished()) {
                setCurrentScrollState$4d7dff8c(C0924a.f6790a);
            }
            m4524a(Boolean.valueOf(false));
            m4535e();
        } else if (motionEvent.getAction() == 3) {
            m4532d();
            m4535e();
            m4524a(Boolean.valueOf(false));
        }
        return super.onTouchEvent(motionEvent);
    }

    private void m4535e() {
        if (this.f6822x != null) {
            this.f6822x.onRelease();
        }
        if (this.f6823y != null) {
            this.f6823y.onRelease();
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f6796C = onClickListener;
    }

    public void setOnScrollStateChangedListener(C0925d c0925d) {
        this.f6820v = c0925d;
    }

    private void setCurrentScrollState$4d7dff8c(int i) {
        this.f6821w = i;
    }

    private boolean m4537f() {
        if (this.f6800b == null || this.f6800b.isEmpty() || this.f6813o <= 0) {
            return false;
        }
        return true;
    }

    static /* synthetic */ void m4527b(HorizontalListView horizontalListView, int i) {
        if (horizontalListView.f6822x != null && horizontalListView.f6823y != null) {
            int i2 = horizontalListView.f6801c + i;
            if (horizontalListView.f6799a != null && !horizontalListView.f6799a.isFinished()) {
                return;
            }
            if (i2 < 0) {
                horizontalListView.f6822x.onPull(((float) Math.abs(i)) / ((float) horizontalListView.getRenderWidth()));
                if (!horizontalListView.f6823y.isFinished()) {
                    horizontalListView.f6823y.onRelease();
                }
            } else if (i2 > horizontalListView.f6813o) {
                horizontalListView.f6823y.onPull(((float) Math.abs(i)) / ((float) horizontalListView.getRenderWidth()));
                if (!horizontalListView.f6822x.isFinished()) {
                    horizontalListView.f6822x.onRelease();
                }
            }
        }
    }
}
