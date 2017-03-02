package com.unity3d.player;

import android.app.Activity;
import android.content.ContextWrapper;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.View;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.common.StatConstants;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.unity3d.player.p */
public final class C0713p implements C0700j {
    private final Queue f2288a;
    private final Activity f2289b;
    private Runnable f2290c;

    /* renamed from: com.unity3d.player.p.1 */
    class C07121 implements Runnable {
        final /* synthetic */ C0713p f2287a;

        C07121(C0713p c0713p) {
            this.f2287a = c0713p;
        }

        private static void m2595a(View view, MotionEvent motionEvent) {
            if (C0714q.f2292b) {
                C0714q.f2300j.m2554a(view, motionEvent);
            }
        }

        public final void run() {
            while (true) {
                MotionEvent motionEvent = (MotionEvent) this.f2287a.f2288a.poll();
                if (motionEvent != null) {
                    View decorView = this.f2287a.f2289b.getWindow().getDecorView();
                    int source = motionEvent.getSource();
                    if ((source & 2) != 0) {
                        switch (motionEvent.getAction() & MotionEventCompat.ACTION_MASK) {
                            case StatAccount.DEFAULT_TYPE /*0*/:
                            case StatConstants.XG_PRO_VERSION /*1*/:
                            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                            case StatConstants.STAT_DB_VERSION /*3*/:
                            case StatAccount.WECHAT_OPENID_TYPE /*4*/:
                            case StatAccount.PHONE_NUM_TYPE /*5*/:
                            case StatAccount.EMAIL_TYPE /*6*/:
                                decorView.dispatchTouchEvent(motionEvent);
                                break;
                            default:
                                C07121.m2595a(decorView, motionEvent);
                                break;
                        }
                    } else if ((source & 4) != 0) {
                        decorView.dispatchTrackballEvent(motionEvent);
                    } else {
                        C07121.m2595a(decorView, motionEvent);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C0713p(ContextWrapper contextWrapper) {
        this.f2288a = new ConcurrentLinkedQueue();
        this.f2290c = new C07121(this);
        this.f2289b = (Activity) contextWrapper;
    }

    private static int m2596a(PointerCoords[] pointerCoordsArr, float[] fArr, int i) {
        for (int i2 = 0; i2 < pointerCoordsArr.length; i2++) {
            PointerCoords pointerCoords = new PointerCoords();
            pointerCoordsArr[i2] = pointerCoords;
            int i3 = i + 1;
            pointerCoords.orientation = fArr[i];
            int i4 = i3 + 1;
            pointerCoords.pressure = fArr[i3];
            i3 = i4 + 1;
            pointerCoords.size = fArr[i4];
            i4 = i3 + 1;
            pointerCoords.toolMajor = fArr[i3];
            i3 = i4 + 1;
            pointerCoords.toolMinor = fArr[i4];
            i4 = i3 + 1;
            pointerCoords.touchMajor = fArr[i3];
            i3 = i4 + 1;
            pointerCoords.touchMinor = fArr[i4];
            i4 = i3 + 1;
            pointerCoords.x = fArr[i3];
            i = i4 + 1;
            pointerCoords.y = fArr[i4];
        }
        return i;
    }

    private static PointerCoords[] m2598a(int i, float[] fArr) {
        PointerCoords[] pointerCoordsArr = new PointerCoords[i];
        C0713p.m2596a(pointerCoordsArr, fArr, 0);
        return pointerCoordsArr;
    }

    public final void m2600a(long j, long j2, int i, int i2, int[] iArr, float[] fArr, int i3, float f, float f2, int i4, int i5, int i6, int i7, int i8, long[] jArr, float[] fArr2) {
        if (this.f2289b != null) {
            MotionEvent obtain = MotionEvent.obtain(j, j2, i, i2, iArr, C0713p.m2598a(i2, fArr), i3, f, f2, i4, i5, i6, i7);
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                PointerCoords[] pointerCoordsArr = new PointerCoords[i2];
                i9 = C0713p.m2596a(pointerCoordsArr, fArr2, i9);
                obtain.addBatch(jArr[i10], pointerCoordsArr, i3);
            }
            this.f2288a.add(obtain);
            this.f2289b.runOnUiThread(this.f2290c);
        }
    }
}
