package com.nineoldandroids.animation;

import android.view.View;
import com.nineoldandroids.util.FloatProperty;
import com.nineoldandroids.util.IntProperty;
import com.nineoldandroids.util.Property;
import com.nineoldandroids.view.animation.AnimatorProxy;

final class PreHoneycombCompat {
    static Property<View, Float> ALPHA;
    static Property<View, Float> PIVOT_X;
    static Property<View, Float> PIVOT_Y;
    static Property<View, Float> ROTATION;
    static Property<View, Float> ROTATION_X;
    static Property<View, Float> ROTATION_Y;
    static Property<View, Float> SCALE_X;
    static Property<View, Float> SCALE_Y;
    static Property<View, Integer> SCROLL_X;
    static Property<View, Integer> SCROLL_Y;
    static Property<View, Float> TRANSLATION_X;
    static Property<View, Float> TRANSLATION_Y;
    static Property<View, Float> f7166X;
    static Property<View, Float> f7167Y;

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.10 */
    static class AnonymousClass10 extends FloatProperty<View> {
        AnonymousClass10(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setScaleY(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getScaleY());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.11 */
    static class AnonymousClass11 extends IntProperty<View> {
        AnonymousClass11(String str) {
            super(str);
        }

        public final void setValue(View view, int i) {
            AnimatorProxy.wrap(view).setScrollX(i);
        }

        public final Integer get(View view) {
            return Integer.valueOf(AnimatorProxy.wrap(view).getScrollX());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.12 */
    static class AnonymousClass12 extends IntProperty<View> {
        AnonymousClass12(String str) {
            super(str);
        }

        public final void setValue(View view, int i) {
            AnimatorProxy.wrap(view).setScrollY(i);
        }

        public final Integer get(View view) {
            return Integer.valueOf(AnimatorProxy.wrap(view).getScrollY());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.13 */
    static class AnonymousClass13 extends FloatProperty<View> {
        AnonymousClass13(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setX(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getX());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.14 */
    static class AnonymousClass14 extends FloatProperty<View> {
        AnonymousClass14(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setY(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getY());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.1 */
    static class C09651 extends FloatProperty<View> {
        C09651(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setAlpha(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getAlpha());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.2 */
    static class C09662 extends FloatProperty<View> {
        C09662(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setPivotX(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getPivotX());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.3 */
    static class C09673 extends FloatProperty<View> {
        C09673(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setPivotY(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getPivotY());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.4 */
    static class C09684 extends FloatProperty<View> {
        C09684(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setTranslationX(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getTranslationX());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.5 */
    static class C09695 extends FloatProperty<View> {
        C09695(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setTranslationY(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getTranslationY());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.6 */
    static class C09706 extends FloatProperty<View> {
        C09706(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setRotation(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotation());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.7 */
    static class C09717 extends FloatProperty<View> {
        C09717(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setRotationX(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotationX());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.8 */
    static class C09728 extends FloatProperty<View> {
        C09728(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setRotationY(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getRotationY());
        }
    }

    /* renamed from: com.nineoldandroids.animation.PreHoneycombCompat.9 */
    static class C09739 extends FloatProperty<View> {
        C09739(String str) {
            super(str);
        }

        public final void setValue(View view, float f) {
            AnimatorProxy.wrap(view).setScaleX(f);
        }

        public final Float get(View view) {
            return Float.valueOf(AnimatorProxy.wrap(view).getScaleX());
        }
    }

    static {
        ALPHA = new C09651("alpha");
        PIVOT_X = new C09662("pivotX");
        PIVOT_Y = new C09673("pivotY");
        TRANSLATION_X = new C09684("translationX");
        TRANSLATION_Y = new C09695("translationY");
        ROTATION = new C09706("rotation");
        ROTATION_X = new C09717("rotationX");
        ROTATION_Y = new C09728("rotationY");
        SCALE_X = new C09739("scaleX");
        SCALE_Y = new AnonymousClass10("scaleY");
        SCROLL_X = new AnonymousClass11("scrollX");
        SCROLL_Y = new AnonymousClass12("scrollY");
        f7166X = new AnonymousClass13("x");
        f7167Y = new AnonymousClass14("y");
    }

    private PreHoneycombCompat() {
    }
}
