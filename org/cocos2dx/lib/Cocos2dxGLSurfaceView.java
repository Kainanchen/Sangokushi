package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.ali.fixHelper;

public class Cocos2dxGLSurfaceView extends GLSurfaceView {
    private static final int HANDLER_CLOSE_IME_KEYBOARD = 3;
    private static final int HANDLER_OPEN_IME_KEYBOARD = 2;
    private static final String TAG = null;
    private static Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
    private static Cocos2dxTextInputWraper sCocos2dxTextInputWraper;
    private static Handler sHandler;
    private Cocos2dxEditBox mCocos2dxEditText;
    private Cocos2dxRenderer mCocos2dxRenderer;
    private boolean mSoftKeyboardShown;

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.10 */
    class AnonymousClass10 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;
        final /* synthetic */ int[] val$ids;
        final /* synthetic */ float[] val$xs;
        final /* synthetic */ float[] val$ys;

        static {
            fixHelper.fixfunc(new int[]{31890, 31891});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass10(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int[] iArr, float[] fArr, float[] fArr2);

        public native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.11 */
    class AnonymousClass11 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;
        final /* synthetic */ int val$pKeyCode;

        static {
            fixHelper.fixfunc(new int[]{32712, 32713});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass11(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i);

        public native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.12 */
    class AnonymousClass12 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;
        final /* synthetic */ int val$keyCode;

        static {
            fixHelper.fixfunc(new int[]{32429, 32430});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass12(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i);

        public native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.13 */
    class AnonymousClass13 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;
        final /* synthetic */ String val$pText;

        static {
            fixHelper.fixfunc(new int[]{22784, 22785});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass13(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, String str);

        public native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.1 */
    class C04921 extends Handler {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;

        static {
            fixHelper.fixfunc(new int[]{11191, 11192});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04921(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView);

        public native void handleMessage(Message message);
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.2 */
    static class C04932 implements Runnable {
        final /* synthetic */ long val$timestamp;
        final /* synthetic */ float val$x;
        final /* synthetic */ float val$y;
        final /* synthetic */ float val$z;

        static {
            fixHelper.fixfunc(new int[]{11380, 11381});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04932(float f, float f2, float f3, long j);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.3 */
    class C04943 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;

        static {
            fixHelper.fixfunc(new int[]{11653, 11654});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04943(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView);

        public native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.4 */
    class C04954 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;

        static {
            fixHelper.fixfunc(new int[]{29411, 29412});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04954(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView);

        public native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.5 */
    class C04965 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;
        final /* synthetic */ int val$idPointerDown;
        final /* synthetic */ float val$xPointerDown;
        final /* synthetic */ float val$yPointerDown;

        static {
            fixHelper.fixfunc(new int[]{29409, 29410});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04965(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i, float f, float f2);

        public native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.6 */
    class C04976 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;
        final /* synthetic */ int val$idDown;
        final /* synthetic */ float val$xDown;
        final /* synthetic */ float val$yDown;

        static {
            fixHelper.fixfunc(new int[]{29254, 29255});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04976(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i, float f, float f2);

        public native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.7 */
    class C04987 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;
        final /* synthetic */ int[] val$ids;
        final /* synthetic */ float[] val$xs;
        final /* synthetic */ float[] val$ys;

        static {
            fixHelper.fixfunc(new int[]{29122, 29123});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04987(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int[] iArr, float[] fArr, float[] fArr2);

        public native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.8 */
    class C04998 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;
        final /* synthetic */ int val$idPointerUp;
        final /* synthetic */ float val$xPointerUp;
        final /* synthetic */ float val$yPointerUp;

        static {
            fixHelper.fixfunc(new int[]{28883, 28884});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04998(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i, float f, float f2);

        public native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxGLSurfaceView.9 */
    class C05009 implements Runnable {
        final /* synthetic */ Cocos2dxGLSurfaceView this$0;
        final /* synthetic */ int val$idUp;
        final /* synthetic */ float val$xUp;
        final /* synthetic */ float val$yUp;

        static {
            fixHelper.fixfunc(new int[]{28587, 28588});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05009(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i, float f, float f2);

        public native void run();
    }

    static {
        fixHelper.fixfunc(new int[]{10660, 10661, 10662, 10663, 10664, 10665, 10666, 10667, 10668, 10669, 10670, 10671, 10672, 10673, 10674, 10675, 10676});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxGLSurfaceView(Context context);

    public native Cocos2dxGLSurfaceView(Context context, AttributeSet attributeSet);

    private native String getContentText();

    public native void deleteBackward();

    public native Cocos2dxEditBox getCocos2dxEditText();

    protected native void initView();

    public native void insertText(String str);

    public native boolean isSoftKeyboardShown();

    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    public native boolean onKeyUp(int i, KeyEvent keyEvent);

    public native void onPause();

    public native void onResume();

    protected native void onSizeChanged(int i, int i2, int i3, int i4);

    public native boolean onTouchEvent(MotionEvent motionEvent);

    public native void setCocos2dxEditText(Cocos2dxEditBox cocos2dxEditBox);

    public native void setCocos2dxRenderer(Cocos2dxRenderer cocos2dxRenderer);

    public native void setSoftKeyboardShown(boolean z);

    static void __clinit__() {
        TAG = Cocos2dxGLSurfaceView.class.getSimpleName();
    }

    public static Cocos2dxGLSurfaceView getInstance() {
        return mCocos2dxGLSurfaceView;
    }

    public static void queueAccelerometer(float f, float f2, float f3, long j) {
        mCocos2dxGLSurfaceView.queueEvent(new C04932(f, f2, f3, j));
    }

    public static void openIMEKeyboard() {
        Message message = new Message();
        message.what = HANDLER_OPEN_IME_KEYBOARD;
        message.obj = mCocos2dxGLSurfaceView.getContentText();
        sHandler.sendMessage(message);
    }

    public static void closeIMEKeyboard() {
        Message message = new Message();
        message.what = HANDLER_CLOSE_IME_KEYBOARD;
        sHandler.sendMessage(message);
    }

    private static void dumpMotionEvent(MotionEvent motionEvent) {
        int i = 0;
        String[] strArr = new String[]{"DOWN", "UP", "MOVE", "CANCEL", "OUTSIDE", "POINTER_DOWN", "POINTER_UP", "7?", "8?", "9?"};
        StringBuilder stringBuilder = new StringBuilder();
        int action = motionEvent.getAction();
        int i2 = action & 255;
        stringBuilder.append("event ACTION_").append(strArr[i2]);
        if (i2 == 5 || i2 == 6) {
            stringBuilder.append("(pid ").append(action >> 8);
            stringBuilder.append(")");
        }
        stringBuilder.append("[");
        while (i < motionEvent.getPointerCount()) {
            stringBuilder.append("#").append(i);
            stringBuilder.append("(pid ").append(motionEvent.getPointerId(i));
            stringBuilder.append(")=").append((int) motionEvent.getX(i));
            stringBuilder.append(",").append((int) motionEvent.getY(i));
            if (i + 1 < motionEvent.getPointerCount()) {
                stringBuilder.append(";");
            }
            i++;
        }
        stringBuilder.append("]");
    }
}
