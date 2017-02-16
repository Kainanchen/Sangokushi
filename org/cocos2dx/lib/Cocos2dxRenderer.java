package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class Cocos2dxRenderer implements Renderer {
    private static final long NANOSECONDSPERMICROSECOND = 1000000;
    private static final long NANOSECONDSPERSECOND = 1000000000;
    private static long sAnimationInterval;
    private long mLastTickInNanoSeconds;
    private boolean mNativeInitCompleted;
    private int mScreenHeight;
    private int mScreenWidth;

    static {
        fixHelper.fixfunc(new int[]{12714, 12715, 12716, 12717, 12718, 12719, 12720, 12721, 12722, 12723, 12724, 12725, 12726, 12727, 12728, 12729});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private static native void nativeDeleteBackward();

    private static native String nativeGetContentText();

    private static native void nativeInit(int i, int i2);

    private static native void nativeInsertText(String str);

    private static native boolean nativeKeyEvent(int i, boolean z);

    private static native void nativeOnPause();

    private static native void nativeOnResume();

    private static native void nativeOnSurfaceChanged(int i, int i2);

    private static native void nativeRender();

    private static native void nativeTouchesBegin(int i, float f, float f2);

    private static native void nativeTouchesCancel(int[] iArr, float[] fArr, float[] fArr2);

    private static native void nativeTouchesEnd(int i, float f, float f2);

    private static native void nativeTouchesMove(int[] iArr, float[] fArr, float[] fArr2);

    public native String getContentText();

    public native void handleActionCancel(int[] iArr, float[] fArr, float[] fArr2);

    public native void handleActionDown(int i, float f, float f2);

    public native void handleActionMove(int[] iArr, float[] fArr, float[] fArr2);

    public native void handleActionUp(int i, float f, float f2);

    public native void handleDeleteBackward();

    public native void handleInsertText(String str);

    public native void handleKeyDown(int i);

    public native void handleKeyUp(int i);

    public native void handleOnPause();

    public native void handleOnResume();

    public native void onDrawFrame(GL10 gl10);

    public native void onSurfaceChanged(GL10 gl10, int i, int i2);

    public native void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);

    public native void setScreenWidthAndHeight(int i, int i2);

    static void __clinit__() {
        sAnimationInterval = 16666666;
    }

    public static void setAnimationInterval(float f) {
        sAnimationInterval = (long) (1.0E9f * f);
    }
}
