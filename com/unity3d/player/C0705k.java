package com.unity3d.player;

import android.app.Presentation;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Bundle;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;

/* renamed from: com.unity3d.player.k */
public final class C0705k implements C0697g {
    private Object f2270a;
    private Presentation f2271b;
    private DisplayListener f2272c;

    /* renamed from: com.unity3d.player.k.1 */
    class C07011 implements DisplayListener {
        final /* synthetic */ UnityPlayer f2262a;
        final /* synthetic */ C0705k f2263b;

        C07011(C0705k c0705k, UnityPlayer unityPlayer) {
            this.f2263b = c0705k;
            this.f2262a = unityPlayer;
        }

        public final void onDisplayAdded(int i) {
            this.f2262a.displayChanged(-1, null);
        }

        public final void onDisplayChanged(int i) {
            this.f2262a.displayChanged(-1, null);
        }

        public final void onDisplayRemoved(int i) {
            this.f2262a.displayChanged(-1, null);
        }
    }

    /* renamed from: com.unity3d.player.k.2 */
    class C07042 implements Runnable {
        final /* synthetic */ Context f2266a;
        final /* synthetic */ Display f2267b;
        final /* synthetic */ UnityPlayer f2268c;
        final /* synthetic */ C0705k f2269d;

        /* renamed from: com.unity3d.player.k.2.1 */
        class C07031 extends Presentation {
            final /* synthetic */ C07042 f2265a;

            /* renamed from: com.unity3d.player.k.2.1.1 */
            class C07021 implements Callback {
                final /* synthetic */ C07031 f2264a;

                C07021(C07031 c07031) {
                    this.f2264a = c07031;
                }

                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    this.f2264a.f2265a.f2268c.displayChanged(1, surfaceHolder.getSurface());
                }

                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    this.f2264a.f2265a.f2268c.displayChanged(1, surfaceHolder.getSurface());
                }

                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    this.f2264a.f2265a.f2268c.displayChanged(1, null);
                }
            }

            C07031(C07042 c07042, Context context, Display display) {
                this.f2265a = c07042;
                super(context, display);
            }

            protected final void onCreate(Bundle bundle) {
                View surfaceView = new SurfaceView(this.f2265a.f2266a);
                surfaceView.getHolder().addCallback(new C07021(this));
                setContentView(surfaceView);
            }

            public final void onDisplayRemoved() {
                dismiss();
                synchronized (this.f2265a.f2269d.f2270a) {
                    this.f2265a.f2269d.f2271b = null;
                }
            }
        }

        C07042(C0705k c0705k, Context context, Display display, UnityPlayer unityPlayer) {
            this.f2269d = c0705k;
            this.f2266a = context;
            this.f2267b = display;
            this.f2268c = unityPlayer;
        }

        public final void run() {
            synchronized (this.f2269d.f2270a) {
                if (this.f2269d.f2271b != null) {
                    this.f2269d.f2271b.dismiss();
                }
                this.f2269d.f2271b = new C07031(this, this.f2266a, this.f2267b);
                this.f2269d.f2271b.show();
            }
        }
    }

    public C0705k() {
        this.f2270a = new Object[0];
    }

    public final void m2579a(Context context) {
        if (this.f2272c != null) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                displayManager.unregisterDisplayListener(this.f2272c);
            }
        }
    }

    public final void m2580a(UnityPlayer unityPlayer, Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            displayManager.registerDisplayListener(new C07011(this, unityPlayer), null);
        }
    }

    public final boolean m2581a(UnityPlayer unityPlayer, Context context, int i) {
        synchronized (this.f2270a) {
            Display display;
            if (this.f2271b != null && this.f2271b.isShowing()) {
                display = this.f2271b.getDisplay();
                if (display != null && display.getDisplayId() == i) {
                    return true;
                }
            }
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null) {
                return false;
            }
            display = displayManager.getDisplay(i);
            if (display == null) {
                return false;
            }
            unityPlayer.m2536b(new C07042(this, context, display, unityPlayer));
            return true;
        }
    }
}
