package org.cocos2dx.lib;

import a.does.not.Exists0;
import android.content.Context;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Cocos2dxSound {
    private static final int INVALID_SOUND_ID = -1;
    private static final int INVALID_STREAM_ID = -1;
    private static int LOAD_TIME_OUT = 0;
    private static final int MAX_SIMULTANEOUS_STREAMS_DEFAULT = 5;
    private static final int MAX_SIMULTANEOUS_STREAMS_I9100 = 3;
    private static final int SOUND_PRIORITY = 1;
    private static final int SOUND_QUALITY = 5;
    private static final float SOUND_RATE = 1.0f;
    private static final String TAG = "Cocos2dxSound";
    private final Context mContext;
    private float mLeftVolume;
    private final HashMap<String, Integer> mPathSoundIDMap;
    private final HashMap<String, ArrayList<Integer>> mPathStreamIDsMap;
    private ConcurrentHashMap<Integer, SoundInfoForLoadedCompleted> mPlayWhenLoadedEffects;
    private float mRightVolume;
    private SoundPool mSoundPool;

    public class OnLoadCompletedListener implements OnLoadCompleteListener {
        final /* synthetic */ Cocos2dxSound this$0;

        static {
            fixHelper.fixfunc(new int[]{12603, 12604});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native OnLoadCompletedListener(Cocos2dxSound cocos2dxSound);

        public native void onLoadComplete(SoundPool soundPool, int i, int i2);
    }

    public class SoundInfoForLoadedCompleted {
        public int effectID;
        public float gain;
        public boolean isLoop;
        public float pan;
        public String path;
        public float pitch;
        final /* synthetic */ Cocos2dxSound this$0;

        static {
            fixHelper.fixfunc(new int[]{18059, Cocos2dxSound.SOUND_PRIORITY});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        public native SoundInfoForLoadedCompleted(Cocos2dxSound cocos2dxSound, String str, boolean z, float f, float f2, float f3);
    }

    static {
        fixHelper.fixfunc(new int[]{28706, 28707, 28708, 28709, 28710, 28711, 28712, 28713, 28714, 28715, 28716, 28717, 28718, 28719, 28720, 28721, 28722, 28723, 28724});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native Cocos2dxSound(Context context);

    private native float clamp(float f, float f2, float f3);

    private native int doPlayEffect(String str, int i, boolean z, float f, float f2, float f3);

    private native void initData();

    public native int createSoundIDFromAsset(String str);

    public native void end();

    public native float getEffectsVolume();

    public native void onEnterBackground();

    public native void onEnterForeground();

    public native void pauseAllEffects();

    public native void pauseEffect(int i);

    public native int playEffect(String str, boolean z, float f, float f2, float f3);

    public native int preloadEffect(String str);

    public native void resumeAllEffects();

    public native void resumeEffect(int i);

    public native void setEffectsVolume(float f);

    public native void stopAllEffects();

    public native void stopEffect(int i);

    public native void unloadEffect(String str);

    static void __clinit__() {
        LOAD_TIME_OUT = 500;
    }
}
