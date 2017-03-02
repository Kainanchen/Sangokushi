package com.unity3d.player;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import com.ut.device.AidConstants;

/* renamed from: com.unity3d.player.d */
public final class C0696d implements C0695f {
    private static final SurfaceTexture f2259a;
    private static final int f2260b;
    private volatile boolean f2261c;

    /* renamed from: com.unity3d.player.d.1 */
    class C06931 implements OnSystemUiVisibilityChangeListener {
        final /* synthetic */ View f2255a;
        final /* synthetic */ C0696d f2256b;

        C06931(C0696d c0696d, View view) {
            this.f2256b = c0696d;
            this.f2255a = view;
        }

        public final void onSystemUiVisibilityChange(int i) {
            this.f2256b.m2560a(this.f2255a, (int) AidConstants.EVENT_REQUEST_STARTED);
        }
    }

    /* renamed from: com.unity3d.player.d.2 */
    class C06942 implements Runnable {
        final /* synthetic */ View f2257a;
        final /* synthetic */ C0696d f2258b;

        C06942(C0696d c0696d, View view) {
            this.f2258b = c0696d;
            this.f2257a = view;
        }

        public final void run() {
            this.f2258b.m2564a(this.f2257a, this.f2258b.f2261c);
        }
    }

    static {
        f2259a = new SurfaceTexture(-1);
        f2260b = C0714q.f2296f ? 5894 : 1;
    }

    private void m2560a(View view, int i) {
        Handler handler = view.getHandler();
        if (handler == null) {
            m2564a(view, this.f2261c);
        } else {
            handler.postDelayed(new C06942(this, view), 1000);
        }
    }

    public final void m2563a(View view) {
        if (!C0714q.f2297g) {
            view.setOnSystemUiVisibilityChangeListener(new C06931(this, view));
        }
    }

    public final void m2564a(View view, boolean z) {
        this.f2261c = z;
        view.setSystemUiVisibility(this.f2261c ? view.getSystemUiVisibility() | f2260b : view.getSystemUiVisibility() & (f2260b ^ -1));
    }

    public final boolean m2565a(Camera camera) {
        try {
            camera.setPreviewTexture(f2259a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public final void m2566b(View view) {
        if (!C0714q.f2296f && this.f2261c) {
            m2564a(view, false);
            this.f2261c = true;
        }
        m2560a(view, (int) AidConstants.EVENT_REQUEST_STARTED);
    }
}
