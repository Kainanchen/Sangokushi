package com.illuminate.texaspoker.swipback;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.widget.ScrollerCompat;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.ali.fixHelper;
import com.android.volley.DefaultRetryPolicy;

/* renamed from: com.illuminate.texaspoker.swipback.c */
public final class ViewDragHelper {
    private static final Interpolator f6541w = null;
    int f6542a;
    int f6543b;
    float[] f6544c;
    float[] f6545d;
    float[] f6546e;
    float[] f6547f;
    int[] f6548g;
    VelocityTracker f6549h;
    float f6550i;
    float f6551j;
    int f6552k;
    int f6553l;
    ScrollerCompat f6554m;
    final ViewDragHelper f6555n;
    View f6556o;
    boolean f6557p;
    final ViewGroup f6558q;
    final Runnable f6559r;
    private int f6560s;
    private int[] f6561t;
    private int[] f6562u;
    private int f6563v;

    /* renamed from: com.illuminate.texaspoker.swipback.c.a */
    public static abstract class ViewDragHelper {
        public abstract boolean m4018a(int i);

        public void m4021b(int i) {
        }

        public void m4017a(View view, int i, int i2, int i3, int i4) {
        }

        public void m4016a(View view, float f, float f2) {
        }

        public int m4014a() {
            return 0;
        }

        public int m4019b() {
            return 0;
        }

        public int m4015a(View view, int i) {
            return 0;
        }

        public int m4020b(View view, int i) {
            return 0;
        }
    }

    /* renamed from: com.illuminate.texaspoker.swipback.c.1 */
    static class ViewDragHelper implements Interpolator {
        ViewDragHelper() {
        }

        public final float getInterpolation(float f) {
            float f2 = f - DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
            return (f2 * (((f2 * f2) * f2) * f2)) + DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
        }
    }

    /* renamed from: com.illuminate.texaspoker.swipback.c.2 */
    class ViewDragHelper implements Runnable {
        final /* synthetic */ ViewDragHelper f6540a;

        ViewDragHelper(ViewDragHelper viewDragHelper) {
            this.f6540a = viewDragHelper;
        }

        public final void run() {
            this.f6540a.m4065b(0);
        }
    }

    static {
        fixHelper.fixfunc(new int[]{428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444});
        ViewDragHelper.__clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native ViewDragHelper(Context context, ViewGroup viewGroup, ViewDragHelper viewDragHelper);

    private native boolean m4050a(float f, float f2, int i, int i2);

    private native boolean m4053c(int i);

    final native int m4054a(int i, int i2, int i3);

    public final native void m4055a();

    final native void m4056a(float f, float f2);

    final native void m4057a(float f, float f2, int i);

    final native void m4058a(int i);

    final native void m4059a(MotionEvent motionEvent);

    public final native boolean m4060a(int i, int i2);

    final native boolean m4061a(View view, float f, float f2);

    final native boolean m4062a(View view, int i);

    final native void m4063b();

    final native void m4064b(float f, float f2, int i);

    final native void m4065b(int i);

    public final native boolean m4066b(int i, int i2);

    public final native View m4067c(int i, int i2);

    static void __clinit__() {
        f6541w = new ViewDragHelper();
    }

    public static ViewDragHelper m4049a(ViewGroup viewGroup, ViewDragHelper viewDragHelper) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, viewDragHelper);
    }

    static int m4052b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            return -i3;
        }
        return i3;
    }

    private static float m4048a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            return -f3;
        }
        return f3;
    }

    public static boolean m4051a(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }
}
