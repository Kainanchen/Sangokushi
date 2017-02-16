package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.ali.fixHelper;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener;

public abstract class Cocos2dxActivity extends Activity implements Cocos2dxHelperListener {
    private static final String TAG = null;
    private static Cocos2dxActivity sContext;
    private boolean hasFocus;
    private Cocos2dxEditBoxHelper mEditBoxHelper;
    protected ResizeLayout mFrameLayout;
    private int[] mGLContextAttrs;
    private Cocos2dxGLSurfaceView mGLSurfaceView;
    private Cocos2dxHandler mHandler;
    private Cocos2dxVideoHelper mVideoHelper;
    private Cocos2dxWebViewHelper mWebViewHelper;

    /* renamed from: org.cocos2dx.lib.Cocos2dxActivity.1 */
    class C04751 implements Runnable {
        final /* synthetic */ Cocos2dxActivity this$0;
        final /* synthetic */ boolean val$newValue;

        static {
            fixHelper.fixfunc(new int[]{5499, 5500});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04751(Cocos2dxActivity cocos2dxActivity, boolean z);

        public native void run();
    }

    public class Cocos2dxEGLConfigChooser implements EGLConfigChooser {
        protected int[] configAttribs;
        final /* synthetic */ Cocos2dxActivity this$0;

        class ConfigValue implements Comparable<ConfigValue> {
            public EGLConfig config;
            public int[] configAttribs;
            final /* synthetic */ Cocos2dxEGLConfigChooser this$1;
            public int value;

            static {
                fixHelper.fixfunc(new int[]{5726, 5727, 5728, 5729, 5730, 5731});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            public native ConfigValue(Cocos2dxEGLConfigChooser cocos2dxEGLConfigChooser, EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

            public native ConfigValue(Cocos2dxEGLConfigChooser cocos2dxEGLConfigChooser, int[] iArr);

            private native void calcValue();

            public native /* bridge */ /* synthetic */ int compareTo(Object obj);

            public native int compareTo(ConfigValue configValue);

            public native String toString();
        }

        static {
            fixHelper.fixfunc(new int[]{9655, 9656, 9657, 9658});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native Cocos2dxEGLConfigChooser(Cocos2dxActivity cocos2dxActivity, int i, int i2, int i3, int i4, int i5, int i6);

        public native Cocos2dxEGLConfigChooser(Cocos2dxActivity cocos2dxActivity, int[] iArr);

        private native int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2);

        public native EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    static {
        fixHelper.fixfunc(new int[]{5484, 5485, 5486, 5487, 5488, 5489, 5490, 5491, 5492, 5493, 5494, 5495, 5496, 5497, 5498});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private static native int[] getGLContextAttrs();

    private native void resumeIfHasFocus();

    public native Cocos2dxGLSurfaceView getGLSurfaceView();

    public native void init();

    protected native void onActivityResult(int i, int i2, Intent intent);

    public native void onCreate(Bundle bundle);

    public native Cocos2dxGLSurfaceView onCreateView();

    public native void onDestroy();

    protected native void onPause();

    public native void onResume();

    public native void onWindowFocusChanged(boolean z);

    public native void resumeFromShare();

    public native void runOnGLThread(Runnable runnable);

    public native void setKeepScreenOn(boolean z);

    public native void showDialog(String str, String str2);

    static void __clinit__() {
        TAG = Cocos2dxActivity.class.getSimpleName();
        sContext = null;
    }

    public static Context getContext() {
        return sContext;
    }

    private static final boolean isAndroidEmulator() {
        String str = Build.MODEL;
        str = Build.PRODUCT;
        if (str == null) {
            return false;
        }
        if (str.equals("sdk") || str.contains("_sdk") || str.contains("sdk_")) {
            return true;
        }
        return false;
    }
}
