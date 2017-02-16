package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.ali.fixHelper;

public class Cocos2dxTextInputWraper implements TextWatcher, OnEditorActionListener {
    private static final String TAG = null;
    private final Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
    private String mOriginText;
    private String mText;

    static {
        fixHelper.fixfunc(new int[]{8216, 8217, 8218, 8219, 8220, 8221, 8222});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxTextInputWraper(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView);

    private native boolean isFullScreenEdit();

    public native void afterTextChanged(Editable editable);

    public native void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

    public native boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent);

    public native void onTextChanged(CharSequence charSequence, int i, int i2, int i3);

    public native void setOriginText(String str);

    static void __clinit__() {
        TAG = Cocos2dxTextInputWraper.class.getSimpleName();
    }
}
