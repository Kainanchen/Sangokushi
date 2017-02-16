package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

public final class ScrollerCompat {
    private final boolean mIsIcsOrNewer;
    OverScroller mScroller;

    public static ScrollerCompat create(Context context) {
        return create(context, null);
    }

    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        return new ScrollerCompat(VERSION.SDK_INT >= 14, context, interpolator);
    }

    ScrollerCompat(boolean z, Context context, Interpolator interpolator) {
        this.mIsIcsOrNewer = z;
        this.mScroller = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public final boolean isFinished() {
        return this.mScroller.isFinished();
    }

    public final int getCurrX() {
        return this.mScroller.getCurrX();
    }

    public final int getCurrY() {
        return this.mScroller.getCurrY();
    }

    public final int getFinalX() {
        return this.mScroller.getFinalX();
    }

    public final int getFinalY() {
        return this.mScroller.getFinalY();
    }

    public final float getCurrVelocity() {
        return this.mIsIcsOrNewer ? ScrollerCompatIcs.getCurrVelocity(this.mScroller) : 0.0f;
    }

    public final boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }

    public final void startScroll(int i, int i2, int i3, int i4) {
        this.mScroller.startScroll(i, i2, i3, i4);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mScroller.startScroll(i, i2, i3, i4, i5);
    }

    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    public final boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.mScroller.springBack(i, i2, i3, i4, i5, i6);
    }

    public final void abortAnimation() {
        this.mScroller.abortAnimation();
    }

    public final void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.mScroller.notifyHorizontalEdgeReached(i, i2, i3);
    }

    public final void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.mScroller.notifyVerticalEdgeReached(i, i2, i3);
    }

    public final boolean isOverScrolled() {
        return this.mScroller.isOverScrolled();
    }
}
