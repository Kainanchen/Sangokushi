package com.unity3d.player;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.unity3d.player.w */
public final class C0724w extends FrameLayout implements OnBufferingUpdateListener, OnCompletionListener, OnPreparedListener, OnVideoSizeChangedListener, Callback, MediaPlayerControl {
    private static boolean f2331a;
    private final UnityPlayer f2332b;
    private final Context f2333c;
    private final SurfaceView f2334d;
    private final SurfaceHolder f2335e;
    private final String f2336f;
    private final int f2337g;
    private final int f2338h;
    private final boolean f2339i;
    private final long f2340j;
    private final long f2341k;
    private final FrameLayout f2342l;
    private final Display f2343m;
    private int f2344n;
    private int f2345o;
    private int f2346p;
    private int f2347q;
    private MediaPlayer f2348r;
    private MediaController f2349s;
    private boolean f2350t;
    private boolean f2351u;
    private int f2352v;
    private boolean f2353w;
    private int f2354x;
    private boolean f2355y;

    /* renamed from: com.unity3d.player.w.1 */
    class C07231 implements Runnable {
        final /* synthetic */ C0724w f2330a;

        C07231(C0724w c0724w) {
            this.f2330a = c0724w;
        }

        public final void run() {
            this.f2330a.f2332b.hideVideoPlayer();
        }
    }

    static {
        f2331a = false;
    }

    protected C0724w(UnityPlayer unityPlayer, Context context, String str, int i, int i2, int i3, boolean z, long j, long j2) {
        super(context);
        this.f2350t = false;
        this.f2351u = false;
        this.f2352v = 0;
        this.f2353w = false;
        this.f2354x = 0;
        this.f2332b = unityPlayer;
        this.f2333c = context;
        this.f2342l = this;
        this.f2334d = new SurfaceView(context);
        this.f2335e = this.f2334d.getHolder();
        this.f2335e.addCallback(this);
        this.f2335e.setType(3);
        this.f2342l.setBackgroundColor(i);
        this.f2342l.addView(this.f2334d);
        this.f2343m = ((WindowManager) this.f2333c.getSystemService("window")).getDefaultDisplay();
        this.f2336f = str;
        this.f2337g = i2;
        this.f2338h = i3;
        this.f2339i = z;
        this.f2340j = j;
        this.f2341k = j2;
        if (f2331a) {
            C0724w.m2640a("fileName: " + this.f2336f);
        }
        if (f2331a) {
            C0724w.m2640a("backgroundColor: " + i);
        }
        if (f2331a) {
            C0724w.m2640a("controlMode: " + this.f2337g);
        }
        if (f2331a) {
            C0724w.m2640a("scalingMode: " + this.f2338h);
        }
        if (f2331a) {
            C0724w.m2640a("isURL: " + this.f2339i);
        }
        if (f2331a) {
            C0724w.m2640a("videoOffset: " + this.f2340j);
        }
        if (f2331a) {
            C0724w.m2640a("videoLength: " + this.f2341k);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f2355y = true;
    }

    private void m2639a() {
        doCleanUp();
        try {
            this.f2348r = new MediaPlayer();
            if (this.f2339i) {
                this.f2348r.setDataSource(this.f2333c, Uri.parse(this.f2336f));
            } else if (this.f2341k != 0) {
                FileInputStream fileInputStream = new FileInputStream(this.f2336f);
                this.f2348r.setDataSource(fileInputStream.getFD(), this.f2340j, this.f2341k);
                fileInputStream.close();
            } else {
                try {
                    AssetFileDescriptor openFd = getResources().getAssets().openFd(this.f2336f);
                    this.f2348r.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                    openFd.close();
                } catch (IOException e) {
                    FileInputStream fileInputStream2 = new FileInputStream(this.f2336f);
                    this.f2348r.setDataSource(fileInputStream2.getFD());
                    fileInputStream2.close();
                }
            }
            this.f2348r.setDisplay(this.f2335e);
            this.f2348r.setScreenOnWhilePlaying(true);
            this.f2348r.setOnBufferingUpdateListener(this);
            this.f2348r.setOnCompletionListener(this);
            this.f2348r.setOnPreparedListener(this);
            this.f2348r.setOnVideoSizeChangedListener(this);
            this.f2348r.setAudioStreamType(3);
            this.f2348r.prepare();
            if (this.f2337g == 0 || this.f2337g == 1) {
                this.f2349s = new MediaController(this.f2333c);
                this.f2349s.setMediaPlayer(this);
                this.f2349s.setAnchorView(this);
                this.f2349s.setEnabled(true);
                this.f2349s.show();
            }
        } catch (Exception e2) {
            if (f2331a) {
                C0724w.m2640a("error: " + e2.getMessage() + e2);
            }
            onDestroy();
        }
    }

    private static void m2640a(String str) {
        Log.v("Video", "VideoPlayer: " + str);
    }

    private void m2641b() {
        if (!isPlaying()) {
            if (f2331a) {
                C0724w.m2640a("startVideoPlayback");
            }
            updateVideoLayout();
            if (!this.f2353w) {
                start();
            }
        }
    }

    public final boolean canPause() {
        return true;
    }

    public final boolean canSeekBackward() {
        return true;
    }

    public final boolean canSeekForward() {
        return true;
    }

    protected final void doCleanUp() {
        if (this.f2348r != null) {
            this.f2348r.release();
            this.f2348r = null;
        }
        this.f2346p = 0;
        this.f2347q = 0;
        this.f2351u = false;
        this.f2350t = false;
    }

    public final int getBufferPercentage() {
        return this.f2339i ? this.f2352v : 100;
    }

    public final int getCurrentPosition() {
        return this.f2348r == null ? 0 : this.f2348r.getCurrentPosition();
    }

    public final int getDuration() {
        return this.f2348r == null ? 0 : this.f2348r.getDuration();
    }

    public final boolean isPlaying() {
        boolean z = this.f2351u && this.f2350t;
        return this.f2348r == null ? !z : this.f2348r.isPlaying() || !z;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (f2331a) {
            C0724w.m2640a("onBufferingUpdate percent:" + i);
        }
        this.f2352v = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (f2331a) {
            C0724w.m2640a("onCompletion called");
        }
        onDestroy();
    }

    public final void onControllerHide() {
    }

    protected final void onDestroy() {
        onPause();
        doCleanUp();
        UnityPlayer.m2505a(new C07231(this));
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 && (this.f2337g != 2 || i == 0 || keyEvent.isSystem())) {
            return this.f2349s != null ? this.f2349s.onKeyDown(i, keyEvent) : super.onKeyDown(i, keyEvent);
        } else {
            onDestroy();
            return true;
        }
    }

    protected final void onPause() {
        if (f2331a) {
            C0724w.m2640a("onPause called");
        }
        if (!this.f2353w) {
            pause();
            this.f2353w = false;
        }
        if (this.f2348r != null) {
            this.f2354x = this.f2348r.getCurrentPosition();
        }
        this.f2355y = false;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (f2331a) {
            C0724w.m2640a("onPrepared called");
        }
        this.f2351u = true;
        if (this.f2351u && this.f2350t) {
            m2641b();
        }
    }

    protected final void onResume() {
        if (f2331a) {
            C0724w.m2640a("onResume called");
        }
        if (!(this.f2355y || this.f2353w)) {
            start();
        }
        this.f2355y = true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & MotionEventCompat.ACTION_MASK;
        if (this.f2337g != 2 || action != 0) {
            return this.f2349s != null ? this.f2349s.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
        } else {
            onDestroy();
            return true;
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (f2331a) {
            C0724w.m2640a("onVideoSizeChanged called " + i + "x" + i2);
        }
        if (i != 0 && i2 != 0) {
            this.f2350t = true;
            this.f2346p = i;
            this.f2347q = i2;
            if (this.f2351u && this.f2350t) {
                m2641b();
            }
        } else if (f2331a) {
            C0724w.m2640a("invalid video width(" + i + ") or height(" + i2 + ")");
        }
    }

    public final void pause() {
        if (this.f2348r != null) {
            this.f2348r.pause();
            this.f2353w = true;
        }
    }

    public final void seekTo(int i) {
        if (this.f2348r != null) {
            this.f2348r.seekTo(i);
        }
    }

    public final void start() {
        if (this.f2348r != null) {
            this.f2348r.start();
            this.f2353w = false;
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (f2331a) {
            C0724w.m2640a("surfaceChanged called " + i + " " + i2 + "x" + i3);
        }
        if (this.f2344n != i2 || this.f2345o != i3) {
            this.f2344n = i2;
            this.f2345o = i3;
            updateVideoLayout();
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (f2331a) {
            C0724w.m2640a("surfaceCreated called");
        }
        m2639a();
        seekTo(this.f2354x);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (f2331a) {
            C0724w.m2640a("surfaceDestroyed called");
        }
        doCleanUp();
    }

    protected final void updateVideoLayout() {
        if (f2331a) {
            C0724w.m2640a("updateVideoLayout");
        }
        if (this.f2344n == 0 || this.f2345o == 0) {
            WindowManager windowManager = (WindowManager) this.f2333c.getSystemService("window");
            this.f2344n = windowManager.getDefaultDisplay().getWidth();
            this.f2345o = windowManager.getDefaultDisplay().getHeight();
        }
        int i = this.f2344n;
        int i2 = this.f2345o;
        float f = ((float) this.f2346p) / ((float) this.f2347q);
        float f2 = ((float) this.f2344n) / ((float) this.f2345o);
        if (this.f2338h == 1) {
            if (f2 <= f) {
                i2 = (int) (((float) this.f2344n) / f);
            } else {
                i = (int) (((float) this.f2345o) * f);
            }
        } else if (this.f2338h == 2) {
            if (f2 >= f) {
                i2 = (int) (((float) this.f2344n) / f);
            } else {
                i = (int) (((float) this.f2345o) * f);
            }
        } else if (this.f2338h == 0) {
            i = this.f2346p;
            i2 = this.f2347q;
        }
        if (f2331a) {
            C0724w.m2640a("frameWidth = " + i + "; frameHeight = " + i2);
        }
        this.f2342l.updateViewLayout(this.f2334d, new LayoutParams(i, i2, 17));
    }
}
