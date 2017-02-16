package com.nineoldandroids.view;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import com.ali.fixHelper;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.Animator.AnimatorListener;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

class ViewPropertyAnimatorHC extends ViewPropertyAnimator {
    private static final int ALPHA = 512;
    private static final int NONE = 0;
    private static final int ROTATION = 16;
    private static final int ROTATION_X = 32;
    private static final int ROTATION_Y = 64;
    private static final int SCALE_X = 4;
    private static final int SCALE_Y = 8;
    private static final int TRANSFORM_MASK = 511;
    private static final int TRANSLATION_X = 1;
    private static final int TRANSLATION_Y = 2;
    private static final int f7168X = 128;
    private static final int f7169Y = 256;
    private Runnable mAnimationStarter;
    private AnimatorEventListener mAnimatorEventListener;
    private HashMap<Animator, PropertyBundle> mAnimatorMap;
    private long mDuration;
    private boolean mDurationSet;
    private Interpolator mInterpolator;
    private boolean mInterpolatorSet;
    private AnimatorListener mListener;
    ArrayList<NameValuesHolder> mPendingAnimations;
    private long mStartDelay;
    private boolean mStartDelaySet;
    private final WeakReference<View> mView;

    /* renamed from: com.nineoldandroids.view.ViewPropertyAnimatorHC.1 */
    class C09801 implements Runnable {
        C09801() {
        }

        public void run() {
            ViewPropertyAnimatorHC.this.startAnimation();
        }
    }

    private class AnimatorEventListener implements AnimatorListener, AnimatorUpdateListener {
        private AnimatorEventListener() {
        }

        public void onAnimationStart(Animator animator) {
            if (ViewPropertyAnimatorHC.this.mListener != null) {
                ViewPropertyAnimatorHC.this.mListener.onAnimationStart(animator);
            }
        }

        public void onAnimationCancel(Animator animator) {
            if (ViewPropertyAnimatorHC.this.mListener != null) {
                ViewPropertyAnimatorHC.this.mListener.onAnimationCancel(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            if (ViewPropertyAnimatorHC.this.mListener != null) {
                ViewPropertyAnimatorHC.this.mListener.onAnimationRepeat(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            if (ViewPropertyAnimatorHC.this.mListener != null) {
                ViewPropertyAnimatorHC.this.mListener.onAnimationEnd(animator);
            }
            ViewPropertyAnimatorHC.this.mAnimatorMap.remove(animator);
            if (ViewPropertyAnimatorHC.this.mAnimatorMap.isEmpty()) {
                ViewPropertyAnimatorHC.this.mListener = null;
            }
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            PropertyBundle propertyBundle = (PropertyBundle) ViewPropertyAnimatorHC.this.mAnimatorMap.get(valueAnimator);
            if ((propertyBundle.mPropertyMask & ViewPropertyAnimatorHC.TRANSFORM_MASK) != 0) {
                View view = (View) ViewPropertyAnimatorHC.this.mView.get();
                if (view != null) {
                    view.invalidate();
                }
            }
            ArrayList arrayList = propertyBundle.mNameValuesHolder;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = ViewPropertyAnimatorHC.NONE; i < size; i += ViewPropertyAnimatorHC.TRANSLATION_X) {
                    NameValuesHolder nameValuesHolder = (NameValuesHolder) arrayList.get(i);
                    ViewPropertyAnimatorHC.this.setValue(nameValuesHolder.mNameConstant, nameValuesHolder.mFromValue + (nameValuesHolder.mDeltaValue * animatedFraction));
                }
            }
            View view2 = (View) ViewPropertyAnimatorHC.this.mView.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }

    private static class NameValuesHolder {
        float mDeltaValue;
        float mFromValue;
        int mNameConstant;

        NameValuesHolder(int i, float f, float f2) {
            this.mNameConstant = i;
            this.mFromValue = f;
            this.mDeltaValue = f2;
        }
    }

    private static class PropertyBundle {
        ArrayList<NameValuesHolder> mNameValuesHolder;
        int mPropertyMask;

        static {
            fixHelper.fixfunc(new int[]{2959, 2960});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native PropertyBundle(int i, ArrayList<NameValuesHolder> arrayList);

        native boolean cancel(int i);
    }

    static {
        fixHelper.fixfunc(new int[]{1545, 1546, 1547, 1548, 1549, 1550, 1551, 1552, 1553, 1554, 1555, 1556, 1557, 1558, 1559, 1560, 1561, 1562, 1563, 1564, 1565, 1566, 1567, 1568, 1569, 1570, 1571, 1572, 1573, 1574, 1575, 1576, 1577, 1578, 1579});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    native ViewPropertyAnimatorHC(View view);

    private native void animateProperty(int i, float f);

    private native void animatePropertyBy(int i, float f);

    private native void animatePropertyBy(int i, float f, float f2);

    private native float getValue(int i);

    private native void setValue(int i, float f);

    private native void startAnimation();

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

    public native ViewPropertyAnimator setListener(AnimatorListener animatorListener);

    public native ViewPropertyAnimator setStartDelay(long j);

    public native void start();

    public native ViewPropertyAnimator translationX(float f);

    public native ViewPropertyAnimator translationXBy(float f);

    public native ViewPropertyAnimator translationY(float f);

    public native ViewPropertyAnimator translationYBy(float f);

    public native ViewPropertyAnimator m4615x(float f);

    public native ViewPropertyAnimator xBy(float f);

    public native ViewPropertyAnimator m4616y(float f);

    public native ViewPropertyAnimator yBy(float f);
}
