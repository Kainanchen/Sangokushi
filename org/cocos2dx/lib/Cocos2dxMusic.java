package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class Cocos2dxMusic {
    private static final String TAG = null;
    private MediaPlayer mBackgroundMediaPlayer;
    private final Context mContext;
    private String mCurrentPath;
    private boolean mIsLoop;
    private float mLeftVolume;
    private boolean mManualPaused;
    private boolean mPaused;
    private float mRightVolume;

    static {
        fixHelper.fixfunc(new int[]{30800, 30801, 30802, 30803, 30804, 30805, 30806, 30807, 30808, 30809, 30810, 30811, 30812, 30813, 30814});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxMusic(Context context);

    private native MediaPlayer createMediaplayer(String str);

    private native void initData();

    public native void end();

    public native float getBackgroundVolume();

    public native boolean isBackgroundMusicPlaying();

    public native void onEnterBackground();

    public native void onEnterForeground();

    public native void pauseBackgroundMusic();

    public native void playBackgroundMusic(String str, boolean z);

    public native void preloadBackgroundMusic(String str);

    public native void resumeBackgroundMusic();

    public native void rewindBackgroundMusic();

    public native void setBackgroundVolume(float f);

    public native void stopBackgroundMusic();

    static void __clinit__() {
        TAG = Cocos2dxMusic.class.getSimpleName();
    }
}
