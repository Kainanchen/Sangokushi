package com.illuminate.texaspoker.swipback;

import a.does.not.Exists2;
import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.swipback.SwipeBackLayout.C0911a;
import java.lang.reflect.Method;

/* renamed from: com.illuminate.texaspoker.swipback.b */
public final class SwipeBackActivityHelper {
    Activity f6538a;
    SwipeBackLayout f6539b;

    /* renamed from: com.illuminate.texaspoker.swipback.b.1 */
    class SwipeBackActivityHelper implements C0911a {
        final /* synthetic */ SwipeBackActivityHelper f6537a;

        SwipeBackActivityHelper(SwipeBackActivityHelper swipeBackActivityHelper) {
            this.f6537a = swipeBackActivityHelper;
        }

        public final void m4047a() {
            Class cls = null;
            Activity activity = this.f6537a.f6538a;
            int i;
            Class cls2;
            if (VERSION.SDK_INT >= 21) {
                try {
                    Method declaredMethod = Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]);
                    declaredMethod.setAccessible(true);
                    Object invoke = declaredMethod.invoke(activity, new Object[0]);
                    Class[] declaredClasses = Activity.class.getDeclaredClasses();
                    int length = declaredClasses.length;
                    i = 0;
                    while (i < length) {
                        cls2 = declaredClasses[i];
                        if (!cls2.getSimpleName().contains("TranslucentConversionListener")) {
                            cls2 = cls;
                        }
                        i++;
                        cls = cls2;
                    }
                    Method declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[]{cls, ActivityOptions.class});
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(activity, new Object[]{null, invoke});
                    return;
                } catch (Throwable th) {
                    return;
                }
            }
            try {
                Class[] declaredClasses2 = Activity.class.getDeclaredClasses();
                int length2 = declaredClasses2.length;
                i = 0;
                while (i < length2) {
                    cls2 = declaredClasses2[i];
                    if (!cls2.getSimpleName().contains("TranslucentConversionListener")) {
                        cls2 = cls;
                    }
                    i++;
                    cls = cls2;
                }
                declaredMethod2 = Activity.class.getDeclaredMethod("convertToTranslucent", new Class[]{cls});
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(activity, new Object[]{null});
            } catch (Throwable th2) {
            }
        }
    }

    static {
        fixHelper.fixfunc(new int[]{479, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native SwipeBackActivityHelper(Activity activity);
}
