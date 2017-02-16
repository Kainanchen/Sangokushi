package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.widget.EditText;
import com.ali.fixHelper;

public class Cocos2dxEditBox extends EditText {
    private final int kEditBoxInputFlagInitialCapsAllCharacters;
    private final int kEditBoxInputFlagInitialCapsSentence;
    private final int kEditBoxInputFlagInitialCapsWord;
    private final int kEditBoxInputFlagPassword;
    private final int kEditBoxInputFlagSensitive;
    private final int kEditBoxInputModeAny;
    private final int kEditBoxInputModeDecimal;
    private final int kEditBoxInputModeEmailAddr;
    private final int kEditBoxInputModeNumeric;
    private final int kEditBoxInputModePhoneNumber;
    private final int kEditBoxInputModeSingleLine;
    private final int kEditBoxInputModeUrl;
    private final int kKeyboardReturnTypeDefault;
    private final int kKeyboardReturnTypeDone;
    private final int kKeyboardReturnTypeGo;
    private final int kKeyboardReturnTypeSearch;
    private final int kKeyboardReturnTypeSend;
    private int mInputFlagConstraints;
    private int mInputModeContraints;
    private int mMaxLength;
    private float mScaleX;

    static {
        fixHelper.fixfunc(new int[]{10735, 10736, 10737, 10738, 10739, 10740, 10741, 10742, 10743, 10744, 10745});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxEditBox(Context context);

    public native float getOpenGLViewScaleX();

    public native boolean onKeyDown(int i, KeyEvent keyEvent);

    public native boolean onKeyPreIme(int i, KeyEvent keyEvent);

    public native void setEditBoxViewRect(int i, int i2, int i3, int i4);

    public native void setInputFlag(int i);

    public native void setInputMode(int i);

    public native void setMaxLength(int i);

    public native void setMultilineEnabled(boolean z);

    public native void setOpenGLViewScaleX(float f);

    public native void setReturnType(int i);
}
