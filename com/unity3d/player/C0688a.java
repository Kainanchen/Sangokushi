package com.unity3d.player;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.SurfaceHolder;
import com.igexin.sdk.PushBuildConfig;
import com.ut.device.AidConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.player.a */
final class C0688a {
    Camera f2242a;
    Parameters f2243b;
    Size f2244c;
    int f2245d;
    int[] f2246e;
    C0686b f2247f;
    private final Object[] f2248g;
    private final int f2249h;
    private final int f2250i;
    private final int f2251j;
    private final int f2252k;

    /* renamed from: com.unity3d.player.a.a */
    interface C0684a {
        void onCameraFrame(C0688a c0688a, byte[] bArr);
    }

    /* renamed from: com.unity3d.player.a.1 */
    class C06851 implements PreviewCallback {
        long f2234a;
        final /* synthetic */ C0684a f2235b;
        final /* synthetic */ C0688a f2236c;

        C06851(C0688a c0688a, C0684a c0684a) {
            this.f2236c = c0688a;
            this.f2235b = c0684a;
            this.f2234a = 0;
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            if (this.f2236c.f2242a == camera) {
                this.f2235b.onCameraFrame(this.f2236c, bArr);
            }
        }
    }

    /* renamed from: com.unity3d.player.a.2 */
    class C06872 extends C0686b {
        Camera f2240a;
        final /* synthetic */ C0688a f2241b;

        C06872(C0688a c0688a) {
            this.f2241b = c0688a;
            super(3);
            this.f2240a = this.f2241b.f2242a;
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            synchronized (this.f2241b.f2248g) {
                if (this.f2241b.f2242a != this.f2240a) {
                    return;
                }
                try {
                    this.f2241b.f2242a.setPreviewDisplay(surfaceHolder);
                    this.f2241b.f2242a.startPreview();
                } catch (Exception e) {
                    C0708m.Log(6, "Unable to initialize webcam data stream: " + e.getMessage());
                }
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            synchronized (this.f2241b.f2248g) {
                if (this.f2241b.f2242a != this.f2240a) {
                    return;
                }
                this.f2241b.f2242a.stopPreview();
            }
        }
    }

    public C0688a(int i, int i2, int i3, int i4) {
        this.f2248g = new Object[0];
        this.f2249h = i;
        this.f2250i = C0688a.m2542a(i2, 640);
        this.f2251j = C0688a.m2542a(i3, 480);
        this.f2252k = C0688a.m2542a(i4, 24);
    }

    private static final int m2542a(int i, int i2) {
        return i != 0 ? i : i2;
    }

    private static void m2543a(Parameters parameters) {
        if (parameters.getSupportedColorEffects() != null) {
            parameters.setColorEffect(PushBuildConfig.sdk_conf_debug_level);
        }
        if (parameters.getSupportedFocusModes().contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
    }

    private void m2545b(C0684a c0684a) {
        synchronized (this.f2248g) {
            this.f2242a = Camera.open(this.f2249h);
            this.f2243b = this.f2242a.getParameters();
            this.f2244c = m2548f();
            this.f2246e = m2547e();
            this.f2245d = m2546d();
            C0688a.m2543a(this.f2243b);
            this.f2243b.setPreviewSize(this.f2244c.width, this.f2244c.height);
            this.f2243b.setPreviewFpsRange(this.f2246e[0], this.f2246e[1]);
            this.f2242a.setParameters(this.f2243b);
            PreviewCallback c06851 = new C06851(this, c0684a);
            int i = (((this.f2244c.width * this.f2244c.height) * this.f2245d) / 8) + AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD;
            this.f2242a.addCallbackBuffer(new byte[i]);
            this.f2242a.addCallbackBuffer(new byte[i]);
            this.f2242a.setPreviewCallbackWithBuffer(c06851);
        }
    }

    private final int m2546d() {
        this.f2243b.setPreviewFormat(17);
        return ImageFormat.getBitsPerPixel(17);
    }

    private final int[] m2547e() {
        double d = (double) (this.f2252k * AidConstants.EVENT_REQUEST_STARTED);
        List supportedPreviewFpsRange = this.f2243b.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange == null) {
            supportedPreviewFpsRange = new ArrayList();
        }
        int[] iArr = new int[]{this.f2252k * AidConstants.EVENT_REQUEST_STARTED, this.f2252k * AidConstants.EVENT_REQUEST_STARTED};
        double d2 = Double.MAX_VALUE;
        for (int[] iArr2 : r0) {
            int[] iArr3;
            double d3;
            double abs = Math.abs(Math.log(d / ((double) iArr2[0]))) + Math.abs(Math.log(d / ((double) iArr2[1])));
            if (abs < d2) {
                iArr3 = iArr2;
                d3 = abs;
            } else {
                double d4 = d2;
                iArr3 = iArr;
                d3 = d4;
            }
            iArr = iArr3;
            d2 = d3;
        }
        return iArr;
    }

    private final Size m2548f() {
        double d = (double) this.f2250i;
        double d2 = (double) this.f2251j;
        Size size = null;
        double d3 = Double.MAX_VALUE;
        for (Size size2 : this.f2243b.getSupportedPreviewSizes()) {
            Size size3;
            double d4;
            double abs = Math.abs(Math.log(d / ((double) size2.width))) + Math.abs(Math.log(d2 / ((double) size2.height)));
            if (abs < d3) {
                double d5 = abs;
                size3 = size2;
                d4 = d5;
            } else {
                size3 = size;
                d4 = d3;
            }
            d3 = d4;
            size = size3;
        }
        return size;
    }

    public final int m2549a() {
        return this.f2249h;
    }

    public final void m2550a(C0684a c0684a) {
        synchronized (this.f2248g) {
            if (this.f2242a == null) {
                m2545b(c0684a);
            }
            if (C0714q.f2291a && C0714q.f2299i.m2558a(this.f2242a)) {
                this.f2242a.startPreview();
                return;
            }
            if (this.f2247f == null) {
                this.f2247f = new C06872(this);
                this.f2247f.m2540a();
            }
        }
    }

    public final void m2551a(byte[] bArr) {
        synchronized (this.f2248g) {
            if (this.f2242a != null) {
                this.f2242a.addCallbackBuffer(bArr);
            }
        }
    }

    public final Size m2552b() {
        return this.f2244c;
    }

    public final void m2553c() {
        synchronized (this.f2248g) {
            if (this.f2242a != null) {
                this.f2242a.setPreviewCallbackWithBuffer(null);
                this.f2242a.stopPreview();
                this.f2242a.release();
                this.f2242a = null;
            }
            if (this.f2247f != null) {
                this.f2247f.m2541b();
                this.f2247f = null;
            }
        }
    }
}
