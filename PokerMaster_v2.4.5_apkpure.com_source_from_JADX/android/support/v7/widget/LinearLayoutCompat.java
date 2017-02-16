package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.C0184R;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.illuminate.texaspoker.R.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import net.sqlcipher.database.SQLiteDatabase;

public class LinearLayoutCompat extends ViewGroup {
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public static class LayoutParams extends MarginLayoutParams {
        public int gravity;
        public float weight;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0184R.styleable.LinearLayoutCompat_Layout);
            this.weight = obtainStyledAttributes.getFloat(C0184R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.gravity = obtainStyledAttributes.getInt(C0184R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = -1;
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2);
            this.gravity = -1;
            this.weight = f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = -1;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
            this.weight = layoutParams.weight;
            this.gravity = layoutParams.gravity;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, SHOW_DIVIDER_NONE);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = SHOW_DIVIDER_NONE;
        this.mGravity = 8388659;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0184R.styleable.LinearLayoutCompat, i, SHOW_DIVIDER_NONE);
        int i2 = obtainStyledAttributes.getInt(C0184R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        i2 = obtainStyledAttributes.getInt(C0184R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(C0184R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(C0184R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(C0184R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(C0184R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(C0184R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(C0184R.styleable.LinearLayoutCompat_showDividers, SHOW_DIVIDER_NONE);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(C0184R.styleable.LinearLayoutCompat_dividerPadding, SHOW_DIVIDER_NONE);
        obtainStyledAttributes.recycle();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = SHOW_DIVIDER_NONE;
                this.mDividerHeight = SHOW_DIVIDER_NONE;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    protected void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == VERTICAL) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = SHOW_DIVIDER_NONE;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
            i += VERTICAL;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            int height;
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                height = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt2.getLayoutParams();
                height = layoutParams.bottomMargin + virtualChildAt2.getBottom();
            }
            drawHorizontalDivider(canvas, height);
        }
    }

    void drawDividersHorizontal(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i = SHOW_DIVIDER_NONE;
        while (i < virtualChildCount) {
            LayoutParams layoutParams;
            int right;
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (isLayoutRtl) {
                    right = layoutParams.rightMargin + virtualChildAt.getRight();
                } else {
                    right = (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, right);
            }
            i += VERTICAL;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                layoutParams = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (isLayoutRtl) {
                    right = (virtualChildAt2.getLeft() - layoutParams.leftMargin) - this.mDividerWidth;
                } else {
                    right = layoutParams.rightMargin + virtualChildAt2.getRight();
                }
            } else if (isLayoutRtl) {
                right = getPaddingLeft();
            } else {
                right = (getWidth() - getPaddingRight()) - this.mDividerWidth;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public int getBaseline() {
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.mBaselineAlignedChildIndex) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.mBaselineAlignedChildIndex);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i;
            int i2 = this.mBaselineChildTop;
            if (this.mOrientation == VERTICAL) {
                i = this.mGravity & R.AppCompatTheme_spinnerStyle;
                if (i != 48) {
                    switch (i) {
                        case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                            i = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / SHOW_DIVIDER_MIDDLE);
                            break;
                        case R.AppCompatTheme_panelMenuListWidth /*80*/:
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                            break;
                    }
                }
            }
            i = i2;
            return (((LayoutParams) childAt.getLayoutParams()).topMargin + i) + baseline;
        } else if (this.mBaselineAlignedChildIndex == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    protected void onMeasure(int i, int i2) {
        if (this.mOrientation == VERTICAL) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            if ((this.mShowDividers & VERTICAL) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.mShowDividers & VERTICAL_GRAVITY_COUNT) == 0) {
                return false;
            }
            return true;
        } else if ((this.mShowDividers & SHOW_DIVIDER_MIDDLE) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    void measureVertical(int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        int i7;
        View virtualChildAt;
        this.mTotalLength = SHOW_DIVIDER_NONE;
        int i8 = SHOW_DIVIDER_NONE;
        int i9 = SHOW_DIVIDER_NONE;
        int i10 = SHOW_DIVIDER_NONE;
        int i11 = SHOW_DIVIDER_NONE;
        Object obj2 = VERTICAL;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj3 = null;
        Object obj4 = null;
        int i12 = this.mBaselineAlignedChildIndex;
        boolean z = this.mUseLargestChild;
        int i13 = RtlSpacingHelper.UNDEFINED;
        int i14 = SHOW_DIVIDER_NONE;
        while (i14 < virtualChildCount) {
            int i15;
            int measuredWidth;
            View virtualChildAt2 = getVirtualChildAt(i14);
            if (virtualChildAt2 == null) {
                this.mTotalLength += measureNullChild(i14);
            } else {
                Object obj5;
                float f2;
                if (virtualChildAt2.getVisibility() != 8) {
                    if (hasDividerBeforeChildAt(i14)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt2.getLayoutParams();
                    float f3 = f + layoutParams.weight;
                    if (mode2 == 1073741824 && layoutParams.height == 0 && layoutParams.weight > 0.0f) {
                        i3 = this.mTotalLength;
                        this.mTotalLength = Math.max(i3, (layoutParams.topMargin + i3) + layoutParams.bottomMargin);
                        obj4 = VERTICAL;
                    } else {
                        i3 = RtlSpacingHelper.UNDEFINED;
                        if (layoutParams.height == 0 && layoutParams.weight > 0.0f) {
                            i3 = SHOW_DIVIDER_NONE;
                            layoutParams.height = -2;
                        }
                        i4 = i3;
                        measureChildBeforeLayout(virtualChildAt2, i14, i, SHOW_DIVIDER_NONE, i2, f3 == 0.0f ? this.mTotalLength : SHOW_DIVIDER_NONE);
                        if (i4 != Integer.MIN_VALUE) {
                            layoutParams.height = i4;
                        }
                        i3 = virtualChildAt2.getMeasuredHeight();
                        int i16 = this.mTotalLength;
                        this.mTotalLength = Math.max(i16, (((i16 + i3) + layoutParams.topMargin) + layoutParams.bottomMargin) + getNextLocationOffset(virtualChildAt2));
                        if (z) {
                            i13 = Math.max(i3, i13);
                        }
                    }
                    if (i12 >= 0 && i12 == i14 + VERTICAL) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (i14 >= i12 || layoutParams.weight <= 0.0f) {
                        Object obj6 = null;
                        if (mode == 1073741824 || layoutParams.width != -1) {
                            obj5 = obj3;
                        } else {
                            obj5 = VERTICAL;
                            obj6 = VERTICAL;
                        }
                        i15 = layoutParams.rightMargin + layoutParams.leftMargin;
                        measuredWidth = virtualChildAt2.getMeasuredWidth() + i15;
                        i8 = Math.max(i8, measuredWidth);
                        int combineMeasuredStates = ViewUtils.combineMeasuredStates(i9, ViewCompat.getMeasuredState(virtualChildAt2));
                        Object obj7 = (obj2 == null || layoutParams.width != -1) ? null : VERTICAL;
                        if (layoutParams.weight > 0.0f) {
                            if (obj6 != null) {
                                i3 = i15;
                            } else {
                                i3 = measuredWidth;
                            }
                            obj = obj7;
                            measuredWidth = Math.max(i11, i3);
                            i5 = i10;
                            f2 = f3;
                            i3 = i13;
                            i13 = combineMeasuredStates;
                            obj3 = obj5;
                            obj5 = obj4;
                            i6 = i8;
                        } else {
                            if (obj6 == null) {
                                i15 = measuredWidth;
                            }
                            i3 = Math.max(i10, i15);
                            obj = obj7;
                            measuredWidth = i11;
                            i5 = i3;
                            f2 = f3;
                            i3 = i13;
                            i13 = combineMeasuredStates;
                            obj3 = obj5;
                            obj5 = obj4;
                            i6 = i8;
                        }
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                }
                i3 = i13;
                f2 = f;
                obj = obj2;
                measuredWidth = i11;
                i5 = i10;
                obj5 = obj4;
                i13 = i9;
                i6 = i8;
                i14 += getChildrenSkipCount(virtualChildAt2, i14);
                obj2 = obj;
                i11 = measuredWidth;
                i10 = i5;
                i9 = i13;
                i8 = i6;
                i13 = i3;
                obj4 = obj5;
                f = f2;
            }
            i14 += VERTICAL;
        }
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerHeight;
        }
        if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.mTotalLength = SHOW_DIVIDER_NONE;
            i7 = SHOW_DIVIDER_NONE;
            while (i7 < virtualChildCount) {
                virtualChildAt = getVirtualChildAt(i7);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i7);
                    i3 = i7;
                } else if (virtualChildAt.getVisibility() == 8) {
                    i3 = getChildrenSkipCount(virtualChildAt, i7) + i7;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i17 = this.mTotalLength;
                    this.mTotalLength = Math.max(i17, (layoutParams2.bottomMargin + ((i17 + i13) + layoutParams2.topMargin)) + getNextLocationOffset(virtualChildAt));
                    i3 = i7;
                }
                i7 = i3 + VERTICAL;
            }
        }
        this.mTotalLength += getPaddingTop() + getPaddingBottom();
        i4 = ViewCompat.resolveSizeAndState(Math.max(this.mTotalLength, getSuggestedMinimumHeight()), i2, SHOW_DIVIDER_NONE);
        i14 = (ViewCompat.MEASURED_SIZE_MASK & i4) - this.mTotalLength;
        if (obj4 != null || (i14 != 0 && f > 0.0f)) {
            if (this.mWeightSum > 0.0f) {
                f = this.mWeightSum;
            }
            this.mTotalLength = SHOW_DIVIDER_NONE;
            Object obj8 = obj2;
            i6 = i10;
            i5 = i9;
            int i18 = i8;
            int i19 = SHOW_DIVIDER_NONE;
            int i20 = i14;
            float f4 = f;
            i16 = i20;
            while (i19 < virtualChildCount) {
                float f5;
                View virtualChildAt3 = getVirtualChildAt(i19);
                if (virtualChildAt3.getVisibility() != 8) {
                    layoutParams2 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f6 = layoutParams2.weight;
                    if (f6 > 0.0f) {
                        View view;
                        i7 = (int) ((((float) i16) * f6) / f4);
                        f6 = f4 - f6;
                        measuredWidth = i16 - i7;
                        i14 = getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + layoutParams2.leftMargin) + layoutParams2.rightMargin, layoutParams2.width);
                        if (layoutParams2.height != 0 || mode2 != 1073741824) {
                            i7 += virtualChildAt3.getMeasuredHeight();
                            if (i7 < 0) {
                                i7 = SHOW_DIVIDER_NONE;
                            }
                            view = virtualChildAt3;
                        } else if (i7 > 0) {
                            view = virtualChildAt3;
                        } else {
                            i7 = SHOW_DIVIDER_NONE;
                            view = virtualChildAt3;
                        }
                        view.measure(i14, MeasureSpec.makeMeasureSpec(i7, 1073741824));
                        i14 = measuredWidth;
                        i16 = ViewUtils.combineMeasuredStates(i5, ViewCompat.getMeasuredState(virtualChildAt3) & InputDeviceCompat.SOURCE_ANY);
                        f5 = f6;
                    } else {
                        f5 = f4;
                        i14 = i16;
                        i16 = i5;
                    }
                    i15 = layoutParams2.leftMargin + layoutParams2.rightMargin;
                    measuredWidth = virtualChildAt3.getMeasuredWidth() + i15;
                    i5 = Math.max(i18, measuredWidth);
                    Object obj9 = (mode == 1073741824 || layoutParams2.width != -1) ? null : VERTICAL;
                    if (obj9 == null) {
                        i15 = measuredWidth;
                    }
                    measuredWidth = Math.max(i6, i15);
                    obj = (obj8 == null || layoutParams2.width != -1) ? null : VERTICAL;
                    i13 = this.mTotalLength;
                    this.mTotalLength = Math.max(i13, (layoutParams2.bottomMargin + ((virtualChildAt3.getMeasuredHeight() + i13) + layoutParams2.topMargin)) + getNextLocationOffset(virtualChildAt3));
                    i3 = measuredWidth;
                    i17 = i5;
                } else {
                    f5 = f4;
                    obj = obj8;
                    i3 = i6;
                    i17 = i18;
                    i14 = i16;
                    i16 = i5;
                }
                i19 += VERTICAL;
                obj8 = obj;
                i6 = i3;
                i5 = i16;
                i18 = i17;
                i16 = i14;
                f4 = f5;
            }
            this.mTotalLength += getPaddingTop() + getPaddingBottom();
            obj2 = obj8;
            i3 = i6;
            i9 = i5;
            i7 = i18;
        } else {
            i6 = Math.max(i10, i11);
            if (z && mode2 != 1073741824) {
                for (i7 = SHOW_DIVIDER_NONE; i7 < virtualChildCount; i7 += VERTICAL) {
                    virtualChildAt = getVirtualChildAt(i7);
                    if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || ((LayoutParams) virtualChildAt.getLayoutParams()).weight <= 0.0f)) {
                        virtualChildAt.measure(MeasureSpec.makeMeasureSpec(virtualChildAt.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i13, 1073741824));
                    }
                }
            }
            i3 = i6;
            i7 = i8;
        }
        if (obj2 != null || mode == 1073741824) {
            i3 = i7;
        }
        setMeasuredDimension(ViewCompat.resolveSizeAndState(Math.max(i3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i9), i4);
        if (obj3 != null) {
            forceUniformWidth(virtualChildCount, i2);
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = SHOW_DIVIDER_NONE; i3 < i; i3 += VERTICAL) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, SHOW_DIVIDER_NONE, i2, SHOW_DIVIDER_NONE);
                    layoutParams.height = i4;
                }
            }
        }
    }

    void measureHorizontal(int i, int i2) {
        Object obj;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View virtualChildAt;
        LayoutParams layoutParams;
        this.mTotalLength = SHOW_DIVIDER_NONE;
        int i8 = SHOW_DIVIDER_NONE;
        int i9 = SHOW_DIVIDER_NONE;
        int i10 = SHOW_DIVIDER_NONE;
        int i11 = SHOW_DIVIDER_NONE;
        Object obj2 = VERTICAL;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj3 = null;
        Object obj4 = null;
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[VERTICAL_GRAVITY_COUNT];
            this.mMaxDescent = new int[VERTICAL_GRAVITY_COUNT];
        }
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        iArr[INDEX_FILL] = -1;
        iArr[SHOW_DIVIDER_MIDDLE] = -1;
        iArr[VERTICAL] = -1;
        iArr[SHOW_DIVIDER_NONE] = -1;
        iArr2[INDEX_FILL] = -1;
        iArr2[SHOW_DIVIDER_MIDDLE] = -1;
        iArr2[VERTICAL] = -1;
        iArr2[SHOW_DIVIDER_NONE] = -1;
        boolean z = this.mBaselineAligned;
        boolean z2 = this.mUseLargestChild;
        if (mode == 1073741824) {
            obj = VERTICAL;
        } else {
            obj = SHOW_DIVIDER_NONE;
        }
        int i12 = RtlSpacingHelper.UNDEFINED;
        int i13 = SHOW_DIVIDER_NONE;
        while (i13 < virtualChildCount) {
            int i14;
            int measuredHeight;
            View virtualChildAt2 = getVirtualChildAt(i13);
            if (virtualChildAt2 == null) {
                this.mTotalLength += measureNullChild(i13);
            } else {
                Object obj5;
                Object obj6;
                int i15;
                float f2;
                if (virtualChildAt2.getVisibility() != 8) {
                    if (hasDividerBeforeChildAt(i13)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                    float f3 = f + layoutParams2.weight;
                    if (mode == 1073741824 && layoutParams2.width == 0 && layoutParams2.weight > 0.0f) {
                        if (obj != null) {
                            this.mTotalLength += layoutParams2.leftMargin + layoutParams2.rightMargin;
                        } else {
                            i3 = this.mTotalLength;
                            this.mTotalLength = Math.max(i3, (layoutParams2.leftMargin + i3) + layoutParams2.rightMargin);
                        }
                        if (z) {
                            i3 = MeasureSpec.makeMeasureSpec(SHOW_DIVIDER_NONE, SHOW_DIVIDER_NONE);
                            virtualChildAt2.measure(i3, i3);
                        } else {
                            obj4 = VERTICAL;
                        }
                    } else {
                        i3 = RtlSpacingHelper.UNDEFINED;
                        if (layoutParams2.width == 0 && layoutParams2.weight > 0.0f) {
                            i3 = SHOW_DIVIDER_NONE;
                            layoutParams2.width = -2;
                        }
                        int i16 = i3;
                        measureChildBeforeLayout(virtualChildAt2, i13, i, f3 == 0.0f ? this.mTotalLength : SHOW_DIVIDER_NONE, i2, SHOW_DIVIDER_NONE);
                        if (i16 != Integer.MIN_VALUE) {
                            layoutParams2.width = i16;
                        }
                        i3 = virtualChildAt2.getMeasuredWidth();
                        if (obj != null) {
                            this.mTotalLength += ((layoutParams2.leftMargin + i3) + layoutParams2.rightMargin) + getNextLocationOffset(virtualChildAt2);
                        } else {
                            int i17 = this.mTotalLength;
                            this.mTotalLength = Math.max(i17, (((i17 + i3) + layoutParams2.leftMargin) + layoutParams2.rightMargin) + getNextLocationOffset(virtualChildAt2));
                        }
                        if (z2) {
                            i12 = Math.max(i3, i12);
                        }
                    }
                    Object obj7 = null;
                    if (mode2 == 1073741824 || layoutParams2.height != -1) {
                        obj5 = obj3;
                    } else {
                        obj5 = VERTICAL;
                        obj7 = VERTICAL;
                    }
                    i14 = layoutParams2.bottomMargin + layoutParams2.topMargin;
                    measuredHeight = virtualChildAt2.getMeasuredHeight() + i14;
                    int combineMeasuredStates = ViewUtils.combineMeasuredStates(i9, ViewCompat.getMeasuredState(virtualChildAt2));
                    if (z) {
                        i9 = virtualChildAt2.getBaseline();
                        if (i9 != -1) {
                            i4 = ((((layoutParams2.gravity < 0 ? this.mGravity : layoutParams2.gravity) & R.AppCompatTheme_spinnerStyle) >> VERTICAL_GRAVITY_COUNT) & -2) >> VERTICAL;
                            iArr[i4] = Math.max(iArr[i4], i9);
                            iArr2[i4] = Math.max(iArr2[i4], measuredHeight - i9);
                        }
                    }
                    i9 = Math.max(i8, measuredHeight);
                    Object obj8 = (obj2 == null || layoutParams2.height != -1) ? null : VERTICAL;
                    if (layoutParams2.weight > 0.0f) {
                        if (obj7 != null) {
                            i3 = i14;
                        } else {
                            i3 = measuredHeight;
                        }
                        obj6 = obj8;
                        measuredHeight = Math.max(i11, i3);
                        i15 = i10;
                        f2 = f3;
                        i3 = i12;
                        i12 = combineMeasuredStates;
                        obj3 = obj5;
                        obj5 = obj4;
                        i5 = i9;
                    } else {
                        if (obj7 == null) {
                            i14 = measuredHeight;
                        }
                        i3 = Math.max(i10, i14);
                        obj6 = obj8;
                        measuredHeight = i11;
                        i15 = i3;
                        f2 = f3;
                        i3 = i12;
                        i12 = combineMeasuredStates;
                        obj3 = obj5;
                        obj5 = obj4;
                        i5 = i9;
                    }
                } else {
                    i3 = i12;
                    f2 = f;
                    obj6 = obj2;
                    measuredHeight = i11;
                    i15 = i10;
                    obj5 = obj4;
                    i12 = i9;
                    i5 = i8;
                }
                i13 += getChildrenSkipCount(virtualChildAt2, i13);
                obj2 = obj6;
                i11 = measuredHeight;
                i10 = i15;
                i9 = i12;
                i8 = i5;
                i12 = i3;
                obj4 = obj5;
                f = f2;
            }
            i13 += VERTICAL;
        }
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        if (iArr[VERTICAL] == -1 && iArr[SHOW_DIVIDER_NONE] == -1 && iArr[SHOW_DIVIDER_MIDDLE] == -1 && iArr[INDEX_FILL] == -1) {
            i6 = i8;
        } else {
            i6 = Math.max(i8, Math.max(iArr[INDEX_FILL], Math.max(iArr[SHOW_DIVIDER_NONE], Math.max(iArr[VERTICAL], iArr[SHOW_DIVIDER_MIDDLE]))) + Math.max(iArr2[INDEX_FILL], Math.max(iArr2[SHOW_DIVIDER_NONE], Math.max(iArr2[VERTICAL], iArr2[SHOW_DIVIDER_MIDDLE]))));
        }
        if (z2 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = SHOW_DIVIDER_NONE;
            i7 = SHOW_DIVIDER_NONE;
            while (i7 < virtualChildCount) {
                virtualChildAt = getVirtualChildAt(i7);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i7);
                    i3 = i7;
                } else if (virtualChildAt.getVisibility() == 8) {
                    i3 = getChildrenSkipCount(virtualChildAt, i7) + i7;
                } else {
                    layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    if (obj != null) {
                        this.mTotalLength = ((layoutParams.rightMargin + (layoutParams.leftMargin + i12)) + getNextLocationOffset(virtualChildAt)) + this.mTotalLength;
                        i3 = i7;
                    } else {
                        i4 = this.mTotalLength;
                        this.mTotalLength = Math.max(i4, (layoutParams.rightMargin + ((i4 + i12) + layoutParams.leftMargin)) + getNextLocationOffset(virtualChildAt));
                        i3 = i7;
                    }
                }
                i7 = i3 + VERTICAL;
            }
        }
        this.mTotalLength += getPaddingLeft() + getPaddingRight();
        i8 = ViewCompat.resolveSizeAndState(Math.max(this.mTotalLength, getSuggestedMinimumWidth()), i, SHOW_DIVIDER_NONE);
        i4 = (ViewCompat.MEASURED_SIZE_MASK & i8) - this.mTotalLength;
        View virtualChildAt3;
        if (obj4 != null || (i4 != 0 && f > 0.0f)) {
            if (this.mWeightSum > 0.0f) {
                f = this.mWeightSum;
            }
            iArr[INDEX_FILL] = -1;
            iArr[SHOW_DIVIDER_MIDDLE] = -1;
            iArr[VERTICAL] = -1;
            iArr[SHOW_DIVIDER_NONE] = -1;
            iArr2[INDEX_FILL] = -1;
            iArr2[SHOW_DIVIDER_MIDDLE] = -1;
            iArr2[VERTICAL] = -1;
            iArr2[SHOW_DIVIDER_NONE] = -1;
            i6 = -1;
            this.mTotalLength = SHOW_DIVIDER_NONE;
            float f4 = f;
            Object obj9 = obj2;
            i12 = i10;
            i14 = i9;
            int i18 = SHOW_DIVIDER_NONE;
            while (i18 < virtualChildCount) {
                float f5;
                Object obj10;
                virtualChildAt3 = getVirtualChildAt(i18);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    f5 = f4;
                    i7 = i4;
                    i17 = i12;
                    obj10 = obj9;
                    i4 = i14;
                    i14 = i6;
                } else {
                    float f6;
                    layoutParams = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f7 = layoutParams.weight;
                    if (f7 > 0.0f) {
                        i7 = (int) ((((float) i4) * f7) / f4);
                        f7 = f4 - f7;
                        i4 -= i7;
                        i5 = getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin, layoutParams.height);
                        if (layoutParams.width != 0 || mode != 1073741824) {
                            i7 += virtualChildAt3.getMeasuredWidth();
                            if (i7 < 0) {
                                i7 = SHOW_DIVIDER_NONE;
                            }
                            virtualChildAt = virtualChildAt3;
                        } else if (i7 > 0) {
                            virtualChildAt = virtualChildAt3;
                        } else {
                            i7 = SHOW_DIVIDER_NONE;
                            virtualChildAt = virtualChildAt3;
                        }
                        virtualChildAt.measure(MeasureSpec.makeMeasureSpec(i7, 1073741824), i5);
                        i5 = ViewUtils.combineMeasuredStates(i14, ViewCompat.getMeasuredState(virtualChildAt3) & ViewCompat.MEASURED_STATE_MASK);
                        f6 = f7;
                        measuredHeight = i4;
                    } else {
                        measuredHeight = i4;
                        i5 = i14;
                        f6 = f4;
                    }
                    if (obj != null) {
                        this.mTotalLength += ((virtualChildAt3.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin) + getNextLocationOffset(virtualChildAt3);
                    } else {
                        i7 = this.mTotalLength;
                        this.mTotalLength = Math.max(i7, (((virtualChildAt3.getMeasuredWidth() + i7) + layoutParams.leftMargin) + layoutParams.rightMargin) + getNextLocationOffset(virtualChildAt3));
                    }
                    Object obj11 = (mode2 == 1073741824 || layoutParams.height != -1) ? null : VERTICAL;
                    i13 = layoutParams.topMargin + layoutParams.bottomMargin;
                    i4 = virtualChildAt3.getMeasuredHeight() + i13;
                    i6 = Math.max(i6, i4);
                    if (obj11 != null) {
                        i7 = i13;
                    } else {
                        i7 = i4;
                    }
                    i13 = Math.max(i12, i7);
                    obj11 = (obj9 == null || layoutParams.height != -1) ? null : VERTICAL;
                    if (z) {
                        i17 = virtualChildAt3.getBaseline();
                        if (i17 != -1) {
                            i3 = ((((layoutParams.gravity < 0 ? this.mGravity : layoutParams.gravity) & R.AppCompatTheme_spinnerStyle) >> VERTICAL_GRAVITY_COUNT) & -2) >> VERTICAL;
                            iArr[i3] = Math.max(iArr[i3], i17);
                            iArr2[i3] = Math.max(iArr2[i3], i4 - i17);
                        }
                    }
                    f5 = f6;
                    i17 = i13;
                    i4 = i5;
                    obj10 = obj11;
                    i14 = i6;
                    i7 = measuredHeight;
                }
                i18 += VERTICAL;
                obj9 = obj10;
                i12 = i17;
                i6 = i14;
                i14 = i4;
                f4 = f5;
                i4 = i7;
            }
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            if (!(iArr[VERTICAL] == -1 && iArr[SHOW_DIVIDER_NONE] == -1 && iArr[SHOW_DIVIDER_MIDDLE] == -1 && iArr[INDEX_FILL] == -1)) {
                i6 = Math.max(i6, Math.max(iArr[INDEX_FILL], Math.max(iArr[SHOW_DIVIDER_NONE], Math.max(iArr[VERTICAL], iArr[SHOW_DIVIDER_MIDDLE]))) + Math.max(iArr2[INDEX_FILL], Math.max(iArr2[SHOW_DIVIDER_NONE], Math.max(iArr2[VERTICAL], iArr2[SHOW_DIVIDER_MIDDLE]))));
            }
            obj2 = obj9;
            i3 = i12;
            i9 = i14;
            i7 = i6;
        } else {
            i7 = Math.max(i10, i11);
            if (z2 && mode != 1073741824) {
                for (i13 = SHOW_DIVIDER_NONE; i13 < virtualChildCount; i13 += VERTICAL) {
                    virtualChildAt3 = getVirtualChildAt(i13);
                    if (!(virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8 || ((LayoutParams) virtualChildAt3.getLayoutParams()).weight <= 0.0f)) {
                        virtualChildAt3.measure(MeasureSpec.makeMeasureSpec(i12, 1073741824), MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = i7;
            i7 = i6;
        }
        if (obj2 != null || mode2 == 1073741824) {
            i3 = i7;
        }
        setMeasuredDimension((ViewCompat.MEASURED_STATE_MASK & i9) | i8, ViewCompat.resolveSizeAndState(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i9 << 16));
        if (obj3 != null) {
            forceUniformHeight(virtualChildCount, i);
        }
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = SHOW_DIVIDER_NONE; i3 < i; i3 += VERTICAL) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, SHOW_DIVIDER_NONE, makeMeasureSpec, SHOW_DIVIDER_NONE);
                    layoutParams.width = i4;
                }
            }
        }
    }

    int getChildrenSkipCount(View view, int i) {
        return SHOW_DIVIDER_NONE;
    }

    int measureNullChild(int i) {
        return SHOW_DIVIDER_NONE;
    }

    void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    int getLocationOffset(View view) {
        return SHOW_DIVIDER_NONE;
    }

    int getNextLocationOffset(View view) {
        return SHOW_DIVIDER_NONE;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == VERTICAL) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i6 = this.mGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        switch (this.mGravity & R.AppCompatTheme_spinnerStyle) {
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                i5 = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / SHOW_DIVIDER_MIDDLE);
                break;
            case R.AppCompatTheme_panelMenuListWidth /*80*/:
                i5 = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        int i7 = SHOW_DIVIDER_NONE;
        int i8 = i5;
        while (i7 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i7);
            if (virtualChildAt == null) {
                i8 += measureNullChild(i7);
                i5 = i7;
            } else if (virtualChildAt.getVisibility() != 8) {
                int i9;
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                i5 = layoutParams.gravity;
                if (i5 < 0) {
                    i5 = i6;
                }
                switch (GravityCompat.getAbsoluteGravity(i5, ViewCompat.getLayoutDirection(this)) & 7) {
                    case VERTICAL /*1*/:
                        i9 = ((((paddingRight2 - measuredWidth) / SHOW_DIVIDER_MIDDLE) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                        break;
                    case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                        i9 = (paddingRight - measuredWidth) - layoutParams.rightMargin;
                        break;
                    default:
                        i9 = paddingLeft + layoutParams.leftMargin;
                        break;
                }
                if (hasDividerBeforeChildAt(i7)) {
                    i5 = this.mDividerHeight + i8;
                } else {
                    i5 = i8;
                }
                int i10 = i5 + layoutParams.topMargin;
                setChildFrame(virtualChildAt, i9, i10 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                i8 = i10 + ((layoutParams.bottomMargin + measuredHeight) + getNextLocationOffset(virtualChildAt));
                i5 = getChildrenSkipCount(virtualChildAt, i7) + i7;
            } else {
                i5 = i7;
            }
            i7 = i5 + VERTICAL;
        }
    }

    void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = i7 - getPaddingBottom();
        int paddingBottom2 = (i7 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        i7 = this.mGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i8 = this.mGravity & R.AppCompatTheme_spinnerStyle;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        switch (GravityCompat.getAbsoluteGravity(i7, ViewCompat.getLayoutDirection(this))) {
            case VERTICAL /*1*/:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.mTotalLength) / SHOW_DIVIDER_MIDDLE);
                break;
            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.mTotalLength;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (isLayoutRtl) {
            i5 = -1;
            i6 = virtualChildCount - 1;
        } else {
            i5 = VERTICAL;
            i6 = SHOW_DIVIDER_NONE;
        }
        int i9 = SHOW_DIVIDER_NONE;
        while (i9 < virtualChildCount) {
            int i10 = i6 + (i5 * i9);
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i10);
                i7 = i9;
            } else if (virtualChildAt.getVisibility() != 8) {
                int i11;
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (!z || layoutParams.height == -1) {
                    i7 = -1;
                } else {
                    i7 = virtualChildAt.getBaseline();
                }
                int i12 = layoutParams.gravity;
                if (i12 < 0) {
                    i12 = i8;
                }
                switch (i12 & R.AppCompatTheme_spinnerStyle) {
                    case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                        i11 = ((((paddingBottom2 - measuredHeight) / SHOW_DIVIDER_MIDDLE) + paddingTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        break;
                    case R.AppCompatTheme_spinnerDropDownItemStyle /*48*/:
                        i11 = paddingTop + layoutParams.topMargin;
                        if (i7 != -1) {
                            i11 += iArr[VERTICAL] - i7;
                            break;
                        }
                        break;
                    case R.AppCompatTheme_panelMenuListWidth /*80*/:
                        i11 = (paddingBottom - measuredHeight) - layoutParams.bottomMargin;
                        if (i7 != -1) {
                            i11 -= iArr2[SHOW_DIVIDER_MIDDLE] - (virtualChildAt.getMeasuredHeight() - i7);
                            break;
                        }
                        break;
                    default:
                        i11 = paddingTop;
                        break;
                }
                if (hasDividerBeforeChildAt(i10)) {
                    i7 = this.mDividerWidth + paddingLeft;
                } else {
                    i7 = paddingLeft;
                }
                paddingLeft = i7 + layoutParams.leftMargin;
                setChildFrame(virtualChildAt, paddingLeft + getLocationOffset(virtualChildAt), i11, measuredWidth, measuredHeight);
                paddingLeft += (layoutParams.rightMargin + measuredWidth) + getNextLocationOffset(virtualChildAt);
                i7 = getChildrenSkipCount(virtualChildAt, i10) + i9;
            } else {
                i7 = i9;
            }
            i9 = i7 + VERTICAL;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            int i2;
            if ((GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK & i) == 0) {
                i2 = GravityCompat.START | i;
            } else {
                i2 = i;
            }
            if ((i2 & R.AppCompatTheme_spinnerStyle) == 0) {
                i2 |= 48;
            }
            this.mGravity = i2;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if ((this.mGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) != i2) {
            this.mGravity = i2 | (this.mGravity & -8388616);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & R.AppCompatTheme_spinnerStyle;
        if ((this.mGravity & R.AppCompatTheme_spinnerStyle) != i2) {
            this.mGravity = i2 | (this.mGravity & -113);
            requestLayout();
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new LayoutParams(-2, -2);
        }
        if (this.mOrientation == VERTICAL) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
        }
    }
}
