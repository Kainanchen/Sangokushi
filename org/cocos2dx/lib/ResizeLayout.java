package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ali.fixHelper;

/* compiled from: Cocos2dxActivity */
class ResizeLayout extends FrameLayout {
    private boolean mEnableForceDoLayout;

    /* renamed from: org.cocos2dx.lib.ResizeLayout.1 */
    class Cocos2dxActivity implements Runnable {
        final /* synthetic */ ResizeLayout this$0;

        static {
            fixHelper.fixfunc(new int[]{17308, 17309});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native Cocos2dxActivity(ResizeLayout resizeLayout);

        public native void run();
    }

    static {
        fixHelper.fixfunc(new int[]{13331, 13332, 13333, 13334});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native ResizeLayout(Context context);

    public native ResizeLayout(Context context, AttributeSet attributeSet);

    protected native void onLayout(boolean z, int i, int i2, int i3, int i4);

    public native void setEnableForceDoLayout(boolean z);
}
