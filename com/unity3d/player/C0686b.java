package com.unity3d.player;

import android.app.Activity;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

/* renamed from: com.unity3d.player.b */
abstract class C0686b implements Callback {
    private final Activity f2237a;
    private final int f2238b;
    private SurfaceView f2239c;

    /* renamed from: com.unity3d.player.b.1 */
    class C06891 implements Runnable {
        final /* synthetic */ C0686b f2253a;

        C06891(C0686b c0686b) {
            this.f2253a = c0686b;
        }

        public final void run() {
            if (this.f2253a.f2239c == null) {
                this.f2253a.f2239c = new SurfaceView(C0720t.f2319a.m2622a());
                this.f2253a.f2239c.getHolder().setType(this.f2253a.f2238b);
                this.f2253a.f2239c.getHolder().addCallback(this.f2253a);
                C0720t.f2319a.m2623a(this.f2253a.f2239c);
                this.f2253a.f2239c.setVisibility(0);
            }
        }
    }

    /* renamed from: com.unity3d.player.b.2 */
    class C06902 implements Runnable {
        final /* synthetic */ C0686b f2254a;

        C06902(C0686b c0686b) {
            this.f2254a = c0686b;
        }

        public final void run() {
            if (this.f2254a.f2239c != null) {
                C0720t.f2319a.m2624b(this.f2254a.f2239c);
            }
            this.f2254a.f2239c = null;
        }
    }

    C0686b(int i) {
        this.f2237a = (Activity) C0720t.f2319a.m2622a();
        this.f2238b = 3;
    }

    final void m2540a() {
        this.f2237a.runOnUiThread(new C06891(this));
    }

    final void m2541b() {
        this.f2237a.runOnUiThread(new C06902(this));
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
