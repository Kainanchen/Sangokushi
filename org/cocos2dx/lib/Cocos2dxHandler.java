package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import com.ali.fixHelper;
import java.lang.ref.WeakReference;

public class Cocos2dxHandler extends Handler {
    public static final int HANDLER_SHOW_DIALOG = 1;
    private WeakReference<Cocos2dxActivity> mActivity;

    /* renamed from: org.cocos2dx.lib.Cocos2dxHandler.1 */
    class C05011 implements OnClickListener {
        final /* synthetic */ Cocos2dxHandler this$0;

        static {
            fixHelper.fixfunc(new int[]{30392, 30393});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05011(Cocos2dxHandler cocos2dxHandler);

        public native void onClick(DialogInterface dialogInterface, int i);
    }

    public static class DialogMessage {
        public String message;
        public String titile;

        static {
            fixHelper.fixfunc(new int[]{30759, Cocos2dxHandler.HANDLER_SHOW_DIALOG});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native DialogMessage(String str, String str2);
    }

    static {
        fixHelper.fixfunc(new int[]{28817, 28818, 28819});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxHandler(Cocos2dxActivity cocos2dxActivity);

    private native void showDialog(Message message);

    public native void handleMessage(Message message);
}
