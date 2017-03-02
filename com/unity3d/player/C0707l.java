package com.unity3d.player;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.unity3d.player.l */
public final class C0707l implements C0698h {
    private Choreographer f2275a;
    private long f2276b;
    private FrameCallback f2277c;
    private boolean f2278d;
    private boolean f2279e;
    private Lock f2280f;

    /* renamed from: com.unity3d.player.l.1 */
    class C07061 implements FrameCallback {
        final /* synthetic */ UnityPlayer f2273a;
        final /* synthetic */ C0707l f2274b;

        C07061(C0707l c0707l, UnityPlayer unityPlayer) {
            this.f2274b = c0707l;
            this.f2273a = unityPlayer;
        }

        public final void doFrame(long j) {
            UnityPlayer.lockNativeAccess();
            if (C0722v.m2630c()) {
                this.f2273a.nativeAddVSyncTime(j);
            }
            UnityPlayer.unlockNativeAccess();
            this.f2274b.f2280f.lock();
            if (this.f2274b.f2275a == null || this.f2274b.f2278d) {
                this.f2274b.f2279e = false;
            } else {
                this.f2274b.f2275a.postFrameCallback(this.f2274b.f2277c);
                this.f2274b.f2279e = true;
            }
            this.f2274b.f2280f.unlock();
        }
    }

    public C0707l() {
        this.f2275a = null;
        this.f2276b = 0;
        this.f2278d = false;
        this.f2279e = false;
        this.f2280f = new ReentrantLock();
    }

    public final void m2587a() {
        this.f2280f.lock();
        if (this.f2275a != null) {
            this.f2275a.removeFrameCallback(this.f2277c);
        }
        this.f2279e = false;
        this.f2275a = null;
        this.f2280f.unlock();
    }

    public final void m2588a(UnityPlayer unityPlayer) {
        this.f2280f.lock();
        if (this.f2275a == null) {
            this.f2275a = Choreographer.getInstance();
            if (this.f2275a != null) {
                C0708m.Log(4, "Choreographer available: Enabling VSYNC timing");
                this.f2277c = new C07061(this, unityPlayer);
                this.f2275a.postFrameCallback(this.f2277c);
                this.f2279e = true;
            }
        }
        this.f2280f.unlock();
    }

    public final void m2589b() {
        this.f2280f.lock();
        this.f2278d = true;
        this.f2280f.unlock();
    }

    public final void m2590c() {
        this.f2280f.lock();
        if (this.f2278d) {
            if (!(this.f2275a == null || this.f2277c == null || this.f2279e)) {
                this.f2275a.postFrameCallback(this.f2277c);
                this.f2279e = true;
            }
            this.f2278d = false;
        }
        this.f2280f.unlock();
    }
}
