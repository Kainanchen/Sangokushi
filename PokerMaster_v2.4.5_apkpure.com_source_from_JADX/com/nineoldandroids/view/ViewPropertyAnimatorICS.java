package com.nineoldandroids.view;

import a.does.not.Exists2;
import android.animation.Animator.AnimatorListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.ali.fixHelper;
import com.nineoldandroids.animation.Animator;
import java.lang.ref.WeakReference;

class ViewPropertyAnimatorICS extends ViewPropertyAnimator {
    private static final long RETURN_WHEN_NULL = -1;
    private final WeakReference<ViewPropertyAnimator> mNative;

    /* renamed from: com.nineoldandroids.view.ViewPropertyAnimatorICS.1 */
    class C09811 implements AnimatorListener {
        final /* synthetic */ Animator.AnimatorListener val$listener;

        C09811(Animator.AnimatorListener animatorListener) {
            this.val$listener = animatorListener;
        }

        public void onAnimationStart(android.animation.Animator animator) {
            this.val$listener.onAnimationStart(null);
        }

        public void onAnimationRepeat(android.animation.Animator animator) {
            this.val$listener.onAnimationRepeat(null);
        }

        public void onAnimationEnd(android.animation.Animator animator) {
            this.val$listener.onAnimationEnd(null);
        }

        public void onAnimationCancel(android.animation.Animator animator) {
            this.val$listener.onAnimationCancel(null);
        }
    }

    static {
        fixHelper.fixfunc(new int[]{1734, 1735, 1736, 1737, 1738, 1739, 1740, 1741, 1742, 1743, 1744, 1745, 1746, 1747, 1748, 1749, 1750, 1751, 1752, 1753, 1754, 1755, 1756, 1757, 1758, 1759, 1760, 1761, 1762});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    native ViewPropertyAnimatorICS(View view);

    public native ViewPropertyAnimator alpha(float f);

    public native ViewPropertyAnimator alphaBy(float f);

    public native void cancel();

    public native long getDuration();

    public native long getStartDelay();

    public native ViewPropertyAnimator rotation(float f);

    public native ViewPropertyAnimator rotationBy(float f);

    public native ViewPropertyAnimator rotationX(float f);

    public native ViewPropertyAnimator rotationXBy(float f);

    public native ViewPropertyAnimator rotationY(float f);

    public native ViewPropertyAnimator rotationYBy(float f);

    public native ViewPropertyAnimator scaleX(float f);

    public native ViewPropertyAnimator scaleXBy(float f);

    public native ViewPropertyAnimator scaleY(float f);

    public native ViewPropertyAnimator scaleYBy(float f);

    public native ViewPropertyAnimator setDuration(long j);

    public native ViewPropertyAnimator setInterpolator(Interpolator interpolator);

    public native ViewPropertyAnimator setListener(Animator.AnimatorListener animatorListener);

    public native ViewPropertyAnimator setStartDelay(long j);

    public native void start();

    public native ViewPropertyAnimator translationX(float f);

    public native ViewPropertyAnimator translationXBy(float f);

    public native ViewPropertyAnimator translationY(float f);

    public native ViewPropertyAnimator translationYBy(float f);

    public native ViewPropertyAnimator m4617x(float f);

    public native ViewPropertyAnimator xBy(float f);

    public native ViewPropertyAnimator m4618y(float f);

    public native ViewPropertyAnimator yBy(float f);
}
