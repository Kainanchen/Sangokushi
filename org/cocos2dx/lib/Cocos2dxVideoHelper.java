package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.ali.fixHelper;
import java.lang.ref.WeakReference;
import org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener;

public class Cocos2dxVideoHelper {
    static final int KeyEventBack = 1000;
    private static final int VideoTaskCreate = 0;
    private static final int VideoTaskFullScreen = 12;
    private static final int VideoTaskKeepRatio = 11;
    private static final int VideoTaskPause = 5;
    private static final int VideoTaskRemove = 1;
    private static final int VideoTaskRestart = 10;
    private static final int VideoTaskResume = 6;
    private static final int VideoTaskSeek = 8;
    private static final int VideoTaskSetRect = 3;
    private static final int VideoTaskSetSource = 2;
    private static final int VideoTaskSetVisible = 9;
    private static final int VideoTaskStart = 4;
    private static final int VideoTaskStop = 7;
    static VideoHandler mVideoHandler;
    private static int videoTag;
    private Cocos2dxActivity mActivity;
    private FrameLayout mLayout;
    private SparseArray<Cocos2dxVideoView> sVideoViews;
    OnVideoEventListener videoEventListener;

    /* renamed from: org.cocos2dx.lib.Cocos2dxVideoHelper.1 */
    class C05041 implements OnVideoEventListener {
        final /* synthetic */ Cocos2dxVideoHelper this$0;

        static {
            fixHelper.fixfunc(new int[]{8355, 8356});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05041(Cocos2dxVideoHelper cocos2dxVideoHelper);

        public native void onVideoEvent(int i, int i2);
    }

    private class VideoEventRunnable implements Runnable {
        private int mVideoEvent;
        private int mVideoTag;
        final /* synthetic */ Cocos2dxVideoHelper this$0;

        static {
            fixHelper.fixfunc(new int[]{32086, 32087});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native VideoEventRunnable(Cocos2dxVideoHelper cocos2dxVideoHelper, int i, int i2);

        public native void run();
    }

    static class VideoHandler extends Handler {
        WeakReference<Cocos2dxVideoHelper> mReference;

        static {
            fixHelper.fixfunc(new int[]{4219, 4220});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native VideoHandler(Cocos2dxVideoHelper cocos2dxVideoHelper);

        public native void handleMessage(Message message);
    }

    static {
        fixHelper.fixfunc(new int[]{9776, 9777, 9778, 9779, 9780, 9781, 9782, 9783, 9784, 9785, 9786, 9787, 9788, 9789, 9790});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    native Cocos2dxVideoHelper(Cocos2dxActivity cocos2dxActivity, FrameLayout frameLayout);

    private native void _createVideoView(int i);

    private native void _pauseVideo(int i);

    private native void _removeVideoView(int i);

    private native void _restartVideo(int i);

    private native void _resumeVideo(int i);

    private native void _seekVideoTo(int i, int i2);

    private native void _setFullScreenEnabled(int i, boolean z, int i2, int i3);

    private native void _setVideoKeepRatio(int i, boolean z);

    private native void _setVideoRect(int i, int i2, int i3, int i4, int i5);

    private native void _setVideoURL(int i, int i2, String str);

    private native void _setVideoVisible(int i, boolean z);

    private native void _startVideo(int i);

    private native void _stopVideo(int i);

    public static native void nativeExecuteVideoCallback(int i, int i2);

    private native void onBackKeyEvent();

    static void __clinit__() {
        mVideoHandler = null;
        videoTag = VideoTaskCreate;
    }

    public static int createVideoWidget() {
        Message message = new Message();
        message.what = VideoTaskCreate;
        message.arg1 = videoTag;
        mVideoHandler.sendMessage(message);
        int i = videoTag;
        videoTag = i + VideoTaskRemove;
        return i;
    }

    public static void removeVideoWidget(int i) {
        Message message = new Message();
        message.what = VideoTaskRemove;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoUrl(int i, int i2, String str) {
        Message message = new Message();
        message.what = VideoTaskSetSource;
        message.arg1 = i;
        message.arg2 = i2;
        message.obj = str;
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoRect(int i, int i2, int i3, int i4, int i5) {
        Message message = new Message();
        message.what = VideoTaskSetRect;
        message.arg1 = i;
        message.obj = new Rect(i2, i3, i4, i5);
        mVideoHandler.sendMessage(message);
    }

    public static void setFullScreenEnabled(int i, boolean z, int i2, int i3) {
        Message message = new Message();
        message.what = VideoTaskFullScreen;
        message.arg1 = i;
        if (z) {
            message.arg2 = VideoTaskRemove;
        } else {
            message.arg2 = VideoTaskCreate;
        }
        message.obj = new Rect(VideoTaskCreate, VideoTaskCreate, i2, i3);
        mVideoHandler.sendMessage(message);
    }

    public static void startVideo(int i) {
        Message message = new Message();
        message.what = VideoTaskStart;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void pauseVideo(int i) {
        Message message = new Message();
        message.what = VideoTaskPause;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void resumeVideo(int i) {
        Message message = new Message();
        message.what = VideoTaskResume;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void stopVideo(int i) {
        Message message = new Message();
        message.what = VideoTaskStop;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void restartVideo(int i) {
        Message message = new Message();
        message.what = VideoTaskRestart;
        message.arg1 = i;
        mVideoHandler.sendMessage(message);
    }

    public static void seekVideoTo(int i, int i2) {
        Message message = new Message();
        message.what = VideoTaskSeek;
        message.arg1 = i;
        message.arg2 = i2;
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoVisible(int i, boolean z) {
        Message message = new Message();
        message.what = VideoTaskSetVisible;
        message.arg1 = i;
        if (z) {
            message.arg2 = VideoTaskRemove;
        } else {
            message.arg2 = VideoTaskCreate;
        }
        mVideoHandler.sendMessage(message);
    }

    public static void setVideoKeepRatioEnabled(int i, boolean z) {
        Message message = new Message();
        message.what = VideoTaskKeepRatio;
        message.arg1 = i;
        if (z) {
            message.arg2 = VideoTaskRemove;
        } else {
            message.arg2 = VideoTaskCreate;
        }
        mVideoHandler.sendMessage(message);
    }
}
