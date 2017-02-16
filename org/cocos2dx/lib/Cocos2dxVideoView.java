package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.MediaController.MediaPlayerControl;
import com.ali.fixHelper;
import java.util.Map;

public class Cocos2dxVideoView extends SurfaceView implements MediaPlayerControl {
    private static final String AssetResourceRoot = "assets/";
    private static final int EVENT_COMPLETED = 3;
    private static final int EVENT_PAUSED = 1;
    private static final int EVENT_PLAYING = 0;
    private static final int EVENT_STOPPED = 2;
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private String TAG;
    private OnBufferingUpdateListener mBufferingUpdateListener;
    protected Cocos2dxActivity mCocos2dxActivity;
    private OnCompletionListener mCompletionListener;
    private int mCurrentBufferPercentage;
    private int mCurrentState;
    private int mDuration;
    private OnErrorListener mErrorListener;
    protected boolean mFullScreenEnabled;
    protected int mFullScreenHeight;
    protected int mFullScreenWidth;
    private boolean mIsAssetRouse;
    private boolean mKeepRatio;
    private MediaPlayer mMediaPlayer;
    private boolean mNeedResume;
    private OnErrorListener mOnErrorListener;
    private OnPreparedListener mOnPreparedListener;
    private OnVideoEventListener mOnVideoEventListener;
    OnPreparedListener mPreparedListener;
    Callback mSHCallback;
    private int mSeekWhenPrepared;
    protected OnVideoSizeChangedListener mSizeChangedListener;
    private SurfaceHolder mSurfaceHolder;
    private int mTargetState;
    private String mVideoFilePath;
    private int mVideoHeight;
    private Uri mVideoUri;
    private int mVideoWidth;
    protected int mViewHeight;
    protected int mViewLeft;
    private int mViewTag;
    protected int mViewTop;
    protected int mViewWidth;
    protected int mVisibleHeight;
    protected int mVisibleLeft;
    protected int mVisibleTop;
    protected int mVisibleWidth;

    public interface OnVideoEventListener {
        void onVideoEvent(int i, int i2);
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxVideoView.1 */
    class C05051 implements OnVideoSizeChangedListener {
        final /* synthetic */ Cocos2dxVideoView this$0;

        static {
            fixHelper.fixfunc(new int[]{8214, 8215});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05051(Cocos2dxVideoView cocos2dxVideoView);

        public native void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2);
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxVideoView.2 */
    class C05062 implements OnPreparedListener {
        final /* synthetic */ Cocos2dxVideoView this$0;

        static {
            fixHelper.fixfunc(new int[]{11376, 11377});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05062(Cocos2dxVideoView cocos2dxVideoView);

        public native void onPrepared(MediaPlayer mediaPlayer);
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxVideoView.3 */
    class C05073 implements OnCompletionListener {
        final /* synthetic */ Cocos2dxVideoView this$0;

        static {
            fixHelper.fixfunc(new int[]{11655, 11656});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05073(Cocos2dxVideoView cocos2dxVideoView);

        public native void onCompletion(MediaPlayer mediaPlayer);
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxVideoView.4 */
    class C05094 implements OnErrorListener {
        final /* synthetic */ Cocos2dxVideoView this$0;

        /* renamed from: org.cocos2dx.lib.Cocos2dxVideoView.4.1 */
        class C05081 implements OnClickListener {
            final /* synthetic */ C05094 this$1;

            static {
                fixHelper.fixfunc(new int[]{29074, 29075});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C05081(C05094 c05094);

            public native void onClick(DialogInterface dialogInterface, int i);
        }

        static {
            fixHelper.fixfunc(new int[]{10938, 10939});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05094(Cocos2dxVideoView cocos2dxVideoView);

        public native boolean onError(MediaPlayer mediaPlayer, int i, int i2);
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxVideoView.5 */
    class C05105 implements OnBufferingUpdateListener {
        final /* synthetic */ Cocos2dxVideoView this$0;

        static {
            fixHelper.fixfunc(new int[]{11193, 11194});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05105(Cocos2dxVideoView cocos2dxVideoView);

        public native void onBufferingUpdate(MediaPlayer mediaPlayer, int i);
    }

    /* renamed from: org.cocos2dx.lib.Cocos2dxVideoView.6 */
    class C05116 implements Callback {
        final /* synthetic */ Cocos2dxVideoView this$0;

        static {
            fixHelper.fixfunc(new int[]{10327, 10328, 10329, 10330});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C05116(Cocos2dxVideoView cocos2dxVideoView);

        public native void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3);

        public native void surfaceCreated(SurfaceHolder surfaceHolder);

        public native void surfaceDestroyed(SurfaceHolder surfaceHolder);
    }

    static {
        fixHelper.fixfunc(new int[]{32465, 32466, 32467, 32468, 32469, 32470, 32471, 32472, 32473, 32474, 32475, 32476, 32477, 32478, 32479, 32480, 32481, 32482, 32483, 32484, 32485, 32486, 32487, 32488, 32489, 32490, 32491, 32492, 32493, 32494, 32495, 32496, 32497, 32498, 32499, 32500});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxVideoView(Cocos2dxActivity cocos2dxActivity, int i);

    private native void initVideoView();

    private native void openVideo();

    private native void release(boolean z);

    private native void setVideoURI(Uri uri, Map<String, String> map);

    public native boolean canPause();

    public native boolean canSeekBackward();

    public native boolean canSeekForward();

    public native void fixSize();

    public native void fixSize(int i, int i2, int i3, int i4);

    public native int getAudioSessionId();

    public native int getBufferPercentage();

    public native int getCurrentPosition();

    public native int getDuration();

    public native boolean isInPlaybackState();

    public native boolean isPlaying();

    protected native void onMeasure(int i, int i2);

    public native boolean onTouchEvent(MotionEvent motionEvent);

    public native void pause();

    public native int resolveAdjustedSize(int i, int i2);

    public native void restart();

    public native void resume();

    public native void seekTo(int i);

    public native void setFullScreenEnabled(boolean z, int i, int i2);

    public native void setKeepRatio(boolean z);

    public native void setOnCompletionListener(OnVideoEventListener onVideoEventListener);

    public native void setOnErrorListener(OnErrorListener onErrorListener);

    public native void setOnPreparedListener(OnPreparedListener onPreparedListener);

    public native void setVideoFileName(String str);

    public native void setVideoRect(int i, int i2, int i3, int i4);

    public native void setVideoURL(String str);

    public native void setVisibility(int i);

    public native void start();

    public native void stop();

    public native void stopPlayback();

    public native void suspend();
}
