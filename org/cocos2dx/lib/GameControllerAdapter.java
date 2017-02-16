package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.ArrayList;

public class GameControllerAdapter {
    private static ArrayList<Runnable> sRunnableFrameStartList;

    /* renamed from: org.cocos2dx.lib.GameControllerAdapter.1 */
    static class C05211 implements Runnable {
        final /* synthetic */ int val$controller;
        final /* synthetic */ String val$vendorName;

        static {
            fixHelper.fixfunc(new int[]{27236, 27237});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05211(String str, int i);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.GameControllerAdapter.2 */
    static class C05222 implements Runnable {
        final /* synthetic */ int val$controller;
        final /* synthetic */ String val$vendorName;

        static {
            fixHelper.fixfunc(new int[]{24032, 24033});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05222(String str, int i);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.GameControllerAdapter.3 */
    static class C05233 implements Runnable {
        final /* synthetic */ int val$button;
        final /* synthetic */ int val$controller;
        final /* synthetic */ boolean val$isAnalog;
        final /* synthetic */ boolean val$isPressed;
        final /* synthetic */ float val$value;
        final /* synthetic */ String val$vendorName;

        static {
            fixHelper.fixfunc(new int[]{24223, 24224});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05233(String str, int i, int i2, boolean z, float f, boolean z2);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.GameControllerAdapter.4 */
    static class C05244 implements Runnable {
        final /* synthetic */ int val$axisID;
        final /* synthetic */ int val$controller;
        final /* synthetic */ boolean val$isAnalog;
        final /* synthetic */ float val$value;
        final /* synthetic */ String val$vendorName;

        static {
            fixHelper.fixfunc(new int[]{24489, 24490});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05244(String str, int i, int i2, float f, boolean z);

        public final native void run();
    }

    static {
        fixHelper.fixfunc(new int[]{32636, 1});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private static native void nativeControllerAxisEvent(String str, int i, int i2, float f, boolean z);

    private static native void nativeControllerButtonEvent(String str, int i, int i2, boolean z, float f, boolean z2);

    private static native void nativeControllerConnected(String str, int i);

    private static native void nativeControllerDisconnected(String str, int i);

    static void __clinit__() {
        sRunnableFrameStartList = null;
    }

    public static void addRunnableToFrameStartList(Runnable runnable) {
        if (sRunnableFrameStartList == null) {
            sRunnableFrameStartList = new ArrayList();
        }
        sRunnableFrameStartList.add(runnable);
    }

    public static void removeRunnableFromFrameStartList(Runnable runnable) {
        if (sRunnableFrameStartList != null) {
            sRunnableFrameStartList.remove(runnable);
        }
    }

    public static void onDrawFrameStart() {
        if (sRunnableFrameStartList != null) {
            int size = sRunnableFrameStartList.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) sRunnableFrameStartList.get(i)).run();
            }
        }
    }

    public static void onConnected(String str, int i) {
        Cocos2dxHelper.runOnGLThread(new C05211(str, i));
    }

    public static void onDisconnected(String str, int i) {
        Cocos2dxHelper.runOnGLThread(new C05222(str, i));
    }

    public static void onButtonEvent(String str, int i, int i2, boolean z, float f, boolean z2) {
        Cocos2dxHelper.runOnGLThread(new C05233(str, i, i2, z, f, z2));
    }

    public static void onAxisEvent(String str, int i, int i2, float f, boolean z) {
        Cocos2dxHelper.runOnGLThread(new C05244(str, i, i2, f, z));
    }
}
