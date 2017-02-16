package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.ali.fixHelper;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;

public class Cocos2dxEditBoxHelper {
    private static final String TAG = null;
    private static Cocos2dxActivity mCocos2dxActivity;
    private static SparseArray<Cocos2dxEditBox> mEditBoxArray;
    private static ResizeLayout mFrameLayout;
    private static int mViewTag;

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.10 */
    static class AnonymousClass10 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$returnType;

        static {
            fixHelper.fixfunc(new int[]{25103, 25104});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass10(int i, int i2);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.11 */
    static class AnonymousClass11 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$inputMode;

        static {
            fixHelper.fixfunc(new int[]{24773, 24774});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass11(int i, int i2);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.12 */
    static class AnonymousClass12 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$inputFlag;

        static {
            fixHelper.fixfunc(new int[]{24878, 24879});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass12(int i, int i2);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.13 */
    static class AnonymousClass13 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$left;
        final /* synthetic */ int val$maxHeight;
        final /* synthetic */ int val$maxWidth;
        final /* synthetic */ int val$top;

        static {
            fixHelper.fixfunc(new int[]{24487, 24488});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native AnonymousClass13(int i, int i2, int i3, int i4, int i5);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.1 */
    static class C04831 implements Runnable {
        final /* synthetic */ int val$height;
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$left;
        final /* synthetic */ float val$scaleX;
        final /* synthetic */ int val$top;
        final /* synthetic */ int val$width;

        /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.1 */
        class C04771 implements TextWatcher {
            final /* synthetic */ C04831 this$0;

            /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.1.1 */
            class C04761 implements Runnable {
                final /* synthetic */ C04771 this$1;
                final /* synthetic */ CharSequence val$s;

                static {
                    fixHelper.fixfunc(new int[]{19091, 19092});
                    if (VERSION.SDK_INT <= 0) {
                        Exists0.class.toString();
                    }
                }

                native C04761(C04771 c04771, CharSequence charSequence);

                public native void run();
            }

            static {
                fixHelper.fixfunc(new int[]{13743, 13744, 13745, 13746});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C04771(C04831 c04831);

            public native void afterTextChanged(Editable editable);

            public native void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

            public native void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
        }

        /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.2 */
        class C04802 implements OnFocusChangeListener {
            final /* synthetic */ C04831 this$0;
            final /* synthetic */ Cocos2dxEditBox val$editBox;

            /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.2.1 */
            class C04781 implements Runnable {
                final /* synthetic */ C04802 this$1;

                static {
                    fixHelper.fixfunc(new int[]{19368, 19369});
                    if (VERSION.SDK_INT <= 0) {
                        Exists0.class.toString();
                    }
                }

                native C04781(C04802 c04802);

                public native void run();
            }

            /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.2.2 */
            class C04792 implements Runnable {
                final /* synthetic */ C04802 this$1;

                static {
                    fixHelper.fixfunc(new int[]{TEXAS_CMD.Cmd_SCMiniGameExitRsp_VALUE, TEXAS_CMD.Cmd_SCMiniGameIniRsp_VALUE});
                    if (VERSION.SDK_INT <= 0) {
                        Exists0.class.toString();
                    }
                }

                native C04792(C04802 c04802);

                public native void run();
            }

            static {
                fixHelper.fixfunc(new int[]{11831, 11832});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C04802(C04831 c04831, Cocos2dxEditBox cocos2dxEditBox);

            public native void onFocusChange(View view, boolean z);
        }

        /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.3 */
        class C04813 implements OnKeyListener {
            final /* synthetic */ C04831 this$0;
            final /* synthetic */ Cocos2dxEditBox val$editBox;

            static {
                fixHelper.fixfunc(new int[]{11963, 11964});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C04813(C04831 c04831, Cocos2dxEditBox cocos2dxEditBox);

            public native boolean onKey(View view, int i, KeyEvent keyEvent);
        }

        /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.1.4 */
        class C04824 implements OnEditorActionListener {
            final /* synthetic */ C04831 this$0;

            static {
                fixHelper.fixfunc(new int[]{12163, 12164});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C04824(C04831 c04831);

            public native boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent);
        }

        static {
            fixHelper.fixfunc(new int[]{32214, 32215});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04831(float f, int i, int i2, int i3, int i4, int i5);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.2 */
    static class C04842 implements Runnable {
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{33223, 33224});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04842(int i);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.3 */
    static class C04853 implements Runnable {
        final /* synthetic */ String val$fontName;
        final /* synthetic */ float val$fontSize;
        final /* synthetic */ int val$index;

        static {
            fixHelper.fixfunc(new int[]{33216, 33217});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04853(int i, String str, float f);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.4 */
    static class C04864 implements Runnable {
        final /* synthetic */ int val$alpha;
        final /* synthetic */ int val$blue;
        final /* synthetic */ int val$green;
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$red;

        static {
            fixHelper.fixfunc(new int[]{33235, 33236});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04864(int i, int i2, int i3, int i4, int i5);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.5 */
    static class C04875 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ String val$text;

        static {
            fixHelper.fixfunc(new int[]{32864, 32865});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04875(int i, String str);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.6 */
    static class C04886 implements Runnable {
        final /* synthetic */ int val$alpha;
        final /* synthetic */ int val$blue;
        final /* synthetic */ int val$green;
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$red;

        static {
            fixHelper.fixfunc(new int[]{33023, 33024});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04886(int i, int i2, int i3, int i4, int i5);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.7 */
    static class C04897 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ int val$maxLength;

        static {
            fixHelper.fixfunc(new int[]{33796, 33797});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04897(int i, int i2);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.8 */
    static class C04908 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ boolean val$visible;

        static {
            fixHelper.fixfunc(new int[]{34003, 34004});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04908(int i, boolean z);

        public final native void run();
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxEditBoxHelper.9 */
    static class C04919 implements Runnable {
        final /* synthetic */ int val$index;
        final /* synthetic */ String val$text;

        static {
            fixHelper.fixfunc(new int[]{33394, 33395});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C04919(int i, String str);

        public final native void run();
    }

    static {
        fixHelper.fixfunc(new int[]{9553, 1});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxEditBoxHelper(ResizeLayout resizeLayout);

    private static native void editBoxEditingChanged(int i, String str);

    private static native void editBoxEditingDidBegin(int i);

    private static native void editBoxEditingDidEnd(int i, String str);

    static void __clinit__() {
        TAG = Cocos2dxEditBoxHelper.class.getSimpleName();
        mViewTag = 0;
    }

    public static void __editBoxEditingDidBegin(int i) {
        editBoxEditingDidBegin(i);
    }

    public static void __editBoxEditingChanged(int i, String str) {
        editBoxEditingChanged(i, str);
    }

    public static void __editBoxEditingDidEnd(int i, String str) {
        editBoxEditingDidEnd(i, str);
    }

    public static int convertToSP(float f) {
        return (int) TypedValue.applyDimension(2, f, mCocos2dxActivity.getResources().getDisplayMetrics());
    }

    public static int createEditBox(int i, int i2, int i3, int i4, float f) {
        mCocos2dxActivity.runOnUiThread(new C04831(f, i4, i, i2, i3, mViewTag));
        int i5 = mViewTag;
        mViewTag = i5 + 1;
        return i5;
    }

    public static void removeEditBox(int i) {
        mCocos2dxActivity.runOnUiThread(new C04842(i));
    }

    public static void setFont(int i, String str, float f) {
        mCocos2dxActivity.runOnUiThread(new C04853(i, str, f));
    }

    public static void setFontColor(int i, int i2, int i3, int i4, int i5) {
        mCocos2dxActivity.runOnUiThread(new C04864(i, i5, i2, i3, i4));
    }

    public static void setPlaceHolderText(int i, String str) {
        mCocos2dxActivity.runOnUiThread(new C04875(i, str));
    }

    public static void setPlaceHolderTextColor(int i, int i2, int i3, int i4, int i5) {
        mCocos2dxActivity.runOnUiThread(new C04886(i, i5, i2, i3, i4));
    }

    public static void setMaxLength(int i, int i2) {
        mCocos2dxActivity.runOnUiThread(new C04897(i, i2));
    }

    public static void setVisible(int i, boolean z) {
        mCocos2dxActivity.runOnUiThread(new C04908(i, z));
    }

    public static void setText(int i, String str) {
        mCocos2dxActivity.runOnUiThread(new C04919(i, str));
    }

    public static void setReturnType(int i, int i2) {
        mCocos2dxActivity.runOnUiThread(new AnonymousClass10(i, i2));
    }

    public static void setInputMode(int i, int i2) {
        mCocos2dxActivity.runOnUiThread(new AnonymousClass11(i, i2));
    }

    public static void setInputFlag(int i, int i2) {
        mCocos2dxActivity.runOnUiThread(new AnonymousClass12(i, i2));
    }

    public static void setEditBoxViewRect(int i, int i2, int i3, int i4, int i5) {
        mCocos2dxActivity.runOnUiThread(new AnonymousClass13(i, i2, i3, i4, i5));
    }

    public static void openKeyboard(int i) {
        InputMethodManager inputMethodManager = (InputMethodManager) Cocos2dxActivity.getContext().getSystemService("input_method");
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) mEditBoxArray.get(i);
        if (cocos2dxEditBox != null) {
            inputMethodManager.showSoftInput(cocos2dxEditBox, 0);
            mCocos2dxActivity.getGLSurfaceView().setSoftKeyboardShown(true);
        }
    }

    public static void closeKeyboard(int i) {
        InputMethodManager inputMethodManager = (InputMethodManager) Cocos2dxActivity.getContext().getSystemService("input_method");
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) mEditBoxArray.get(i);
        if (cocos2dxEditBox != null) {
            inputMethodManager.hideSoftInputFromWindow(cocos2dxEditBox.getWindowToken(), 0);
            mCocos2dxActivity.getGLSurfaceView().setSoftKeyboardShown(false);
        }
    }
}
