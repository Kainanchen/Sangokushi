package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.support.annotation.RequiresApi;
import android.view.View;

@TargetApi(16)
@RequiresApi(16)
class ViewPropertyAnimatorCompatJB {

    /* renamed from: android.support.v4.view.ViewPropertyAnimatorCompatJB.1 */
    static class C01231 extends AnimatorListenerAdapter {
        final /* synthetic */ ViewPropertyAnimatorListener val$listener;
        final /* synthetic */ View val$view;

        C01231(ViewPropertyAnimatorListener viewPropertyAnimatorListener, View view) {
            this.val$listener = viewPropertyAnimatorListener;
            this.val$view = view;
        }

        public final void onAnimationCancel(Animator animator) {
            this.val$listener.onAnimationCancel(this.val$view);
        }

        public final void onAnimationEnd(Animator animator) {
            this.val$listener.onAnimationEnd(this.val$view);
        }

        public final void onAnimationStart(Animator animator) {
            this.val$listener.onAnimationStart(this.val$view);
        }
    }

    ViewPropertyAnimatorCompatJB() {
    }

    public static void withStartAction(View view, Runnable runnable) {
        view.animate().withStartAction(runnable);
    }

    public static void withEndAction(View view, Runnable runnable) {
        view.animate().withEndAction(runnable);
    }

    public static void withLayer(View view) {
        view.animate().withLayer();
    }

    public static void setListener(View view, ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new C01231(viewPropertyAnimatorListener, view));
        } else {
            view.animate().setListener(null);
        }
    }
}
