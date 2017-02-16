package com.nineoldandroids.view;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import com.ali.fixHelper;
import com.android.volley.DefaultRetryPolicy;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.Animator.AnimatorListener;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.nineoldandroids.view.animation.AnimatorProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

class ViewPropertyAnimatorPreHC extends ViewPropertyAnimator {
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
    private static final int f7170X = 128;
    private static final int f7171Y = 256;
    private Runnable mAnimationStarter;
    private AnimatorEventListener mAnimatorEventListener;
    private HashMap<Animator, PropertyBundle> mAnimatorMap;
    private long mDuration;
    private boolean mDurationSet;
    private Interpolator mInterpolator;
    private boolean mInterpolatorSet;
    private AnimatorListener mListener;
    ArrayList<NameValuesHolder> mPendingAnimations;
    private final AnimatorProxy mProxy;
    private long mStartDelay;
    private boolean mStartDelaySet;
    private final WeakReference<View> mView;

    /* renamed from: com.nineoldandroids.view.ViewPropertyAnimatorPreHC.1 */
    class C09821 implements Runnable {
        C09821() {
        }

        public void run() {
            ViewPropertyAnimatorPreHC.this.startAnimation();
        }
    }

    private class AnimatorEventListener implements AnimatorListener, AnimatorUpdateListener {
        final /* synthetic */ ViewPropertyAnimatorPreHC this$0;

        static {
            fixHelper.fixfunc(new int[]{3032, 3033, 3034, 3035, 3036, 3037, 3038});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        private native AnimatorEventListener(ViewPropertyAnimatorPreHC viewPropertyAnimatorPreHC);

        native /* synthetic */ AnimatorEventListener(ViewPropertyAnimatorPreHC viewPropertyAnimatorPreHC, C09821 c09821);

        public native void onAnimationCancel(Animator animator);

        public native void onAnimationEnd(Animator animator);

        public native void onAnimationRepeat(Animator animator);

        public native void onAnimationStart(Animator animator);

        public native void onAnimationUpdate(ValueAnimator valueAnimator);
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
            fixHelper.fixfunc(new int[]{1765, 1766});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native PropertyBundle(int i, ArrayList<NameValuesHolder> arrayList);

        native boolean cancel(int i);
    }

    ViewPropertyAnimatorPreHC(View view) {
        this.mDurationSet = false;
        this.mStartDelay = 0;
        this.mStartDelaySet = false;
        this.mInterpolatorSet = false;
        this.mListener = null;
        this.mAnimatorEventListener = new AnimatorEventListener();
        this.mPendingAnimations = new ArrayList();
        this.mAnimationStarter = new C09821();
        this.mAnimatorMap = new HashMap();
        this.mView = new WeakReference(view);
        this.mProxy = AnimatorProxy.wrap(view);
    }

    public ViewPropertyAnimator setDuration(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.mDurationSet = true;
        this.mDuration = j;
        return this;
    }

    public long getDuration() {
        if (this.mDurationSet) {
            return this.mDuration;
        }
        return new ValueAnimator().getDuration();
    }

    public long getStartDelay() {
        if (this.mStartDelaySet) {
            return this.mStartDelay;
        }
        return 0;
    }

    public ViewPropertyAnimator setStartDelay(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
        }
        this.mStartDelaySet = true;
        this.mStartDelay = j;
        return this;
    }

    public ViewPropertyAnimator setInterpolator(Interpolator interpolator) {
        this.mInterpolatorSet = true;
        this.mInterpolator = interpolator;
        return this;
    }

    public ViewPropertyAnimator setListener(AnimatorListener animatorListener) {
        this.mListener = animatorListener;
        return this;
    }

    public void start() {
        startAnimation();
    }

    public void cancel() {
        if (this.mAnimatorMap.size() > 0) {
            for (Animator cancel : ((HashMap) this.mAnimatorMap.clone()).keySet()) {
                cancel.cancel();
            }
        }
        this.mPendingAnimations.clear();
        View view = (View) this.mView.get();
        if (view != null) {
            view.removeCallbacks(this.mAnimationStarter);
        }
    }

    public ViewPropertyAnimator m4619x(float f) {
        animateProperty(f7170X, f);
        return this;
    }

    public ViewPropertyAnimator xBy(float f) {
        animatePropertyBy(f7170X, f);
        return this;
    }

    public ViewPropertyAnimator m4620y(float f) {
        animateProperty(f7171Y, f);
        return this;
    }

    public ViewPropertyAnimator yBy(float f) {
        animatePropertyBy(f7171Y, f);
        return this;
    }

    public ViewPropertyAnimator rotation(float f) {
        animateProperty(ROTATION, f);
        return this;
    }

    public ViewPropertyAnimator rotationBy(float f) {
        animatePropertyBy(ROTATION, f);
        return this;
    }

    public ViewPropertyAnimator rotationX(float f) {
        animateProperty(ROTATION_X, f);
        return this;
    }

    public ViewPropertyAnimator rotationXBy(float f) {
        animatePropertyBy(ROTATION_X, f);
        return this;
    }

    public ViewPropertyAnimator rotationY(float f) {
        animateProperty(ROTATION_Y, f);
        return this;
    }

    public ViewPropertyAnimator rotationYBy(float f) {
        animatePropertyBy(ROTATION_Y, f);
        return this;
    }

    public ViewPropertyAnimator translationX(float f) {
        animateProperty(TRANSLATION_X, f);
        return this;
    }

    public ViewPropertyAnimator translationXBy(float f) {
        animatePropertyBy(TRANSLATION_X, f);
        return this;
    }

    public ViewPropertyAnimator translationY(float f) {
        animateProperty(TRANSLATION_Y, f);
        return this;
    }

    public ViewPropertyAnimator translationYBy(float f) {
        animatePropertyBy(TRANSLATION_Y, f);
        return this;
    }

    public ViewPropertyAnimator scaleX(float f) {
        animateProperty(SCALE_X, f);
        return this;
    }

    public ViewPropertyAnimator scaleXBy(float f) {
        animatePropertyBy(SCALE_X, f);
        return this;
    }

    public ViewPropertyAnimator scaleY(float f) {
        animateProperty(SCALE_Y, f);
        return this;
    }

    public ViewPropertyAnimator scaleYBy(float f) {
        animatePropertyBy(SCALE_Y, f);
        return this;
    }

    public ViewPropertyAnimator alpha(float f) {
        animateProperty(ALPHA, f);
        return this;
    }

    public ViewPropertyAnimator alphaBy(float f) {
        animatePropertyBy(ALPHA, f);
        return this;
    }

    private void startAnimation() {
        float[] fArr = new float[TRANSLATION_X];
        fArr[NONE] = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ArrayList arrayList = (ArrayList) this.mPendingAnimations.clone();
        this.mPendingAnimations.clear();
        int i = NONE;
        for (int i2 = NONE; i2 < arrayList.size(); i2 += TRANSLATION_X) {
            i |= ((NameValuesHolder) arrayList.get(i2)).mNameConstant;
        }
        this.mAnimatorMap.put(ofFloat, new PropertyBundle(i, arrayList));
        ofFloat.addUpdateListener(this.mAnimatorEventListener);
        ofFloat.addListener(this.mAnimatorEventListener);
        if (this.mStartDelaySet) {
            ofFloat.setStartDelay(this.mStartDelay);
        }
        if (this.mDurationSet) {
            ofFloat.setDuration(this.mDuration);
        }
        if (this.mInterpolatorSet) {
            ofFloat.setInterpolator(this.mInterpolator);
        }
        ofFloat.start();
    }

    private void animateProperty(int i, float f) {
        float value = getValue(i);
        animatePropertyBy(i, value, f - value);
    }

    private void animatePropertyBy(int i, float f) {
        animatePropertyBy(i, getValue(i), f);
    }

    private void animatePropertyBy(int i, float f, float f2) {
        if (this.mAnimatorMap.size() > 0) {
            for (Animator animator : this.mAnimatorMap.keySet()) {
                PropertyBundle propertyBundle = (PropertyBundle) this.mAnimatorMap.get(animator);
                if (propertyBundle.cancel(i) && propertyBundle.mPropertyMask == 0) {
                    break;
                }
            }
            Animator animator2 = null;
            if (animator2 != null) {
                animator2.cancel();
            }
        }
        this.mPendingAnimations.add(new NameValuesHolder(i, f, f2));
        View view = (View) this.mView.get();
        if (view != null) {
            view.removeCallbacks(this.mAnimationStarter);
            view.post(this.mAnimationStarter);
        }
    }

    private void setValue(int i, float f) {
        switch (i) {
            case TRANSLATION_X /*1*/:
                this.mProxy.setTranslationX(f);
            case TRANSLATION_Y /*2*/:
                this.mProxy.setTranslationY(f);
            case SCALE_X /*4*/:
                this.mProxy.setScaleX(f);
            case SCALE_Y /*8*/:
                this.mProxy.setScaleY(f);
            case ROTATION /*16*/:
                this.mProxy.setRotation(f);
            case ROTATION_X /*32*/:
                this.mProxy.setRotationX(f);
            case ROTATION_Y /*64*/:
                this.mProxy.setRotationY(f);
            case f7170X /*128*/:
                this.mProxy.setX(f);
            case f7171Y /*256*/:
                this.mProxy.setY(f);
            case ALPHA /*512*/:
                this.mProxy.setAlpha(f);
            default:
        }
    }

    private float getValue(int i) {
        switch (i) {
            case TRANSLATION_X /*1*/:
                return this.mProxy.getTranslationX();
            case TRANSLATION_Y /*2*/:
                return this.mProxy.getTranslationY();
            case SCALE_X /*4*/:
                return this.mProxy.getScaleX();
            case SCALE_Y /*8*/:
                return this.mProxy.getScaleY();
            case ROTATION /*16*/:
                return this.mProxy.getRotation();
            case ROTATION_X /*32*/:
                return this.mProxy.getRotationX();
            case ROTATION_Y /*64*/:
                return this.mProxy.getRotationY();
            case f7170X /*128*/:
                return this.mProxy.getX();
            case f7171Y /*256*/:
                return this.mProxy.getY();
            case ALPHA /*512*/:
                return this.mProxy.getAlpha();
            default:
                return 0.0f;
        }
    }
}
