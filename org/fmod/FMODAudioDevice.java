package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

public class FMODAudioDevice implements Runnable {
    private static int f2356h;
    private static int f2357i;
    private static int f2358j;
    private static int f2359k;
    private volatile Thread f2360a;
    private volatile boolean f2361b;
    private AudioTrack f2362c;
    private boolean f2363d;
    private ByteBuffer f2364e;
    private byte[] f2365f;
    private volatile C0748a f2366g;

    static {
        f2356h = 0;
        f2357i = 1;
        f2358j = 2;
        f2359k = 3;
    }

    public FMODAudioDevice() {
        this.f2360a = null;
        this.f2361b = false;
        this.f2362c = null;
        this.f2363d = false;
        this.f2364e = null;
        this.f2365f = null;
    }

    private native int fmodGetInfo(int i);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        if (this.f2362c != null) {
            if (this.f2362c.getState() == 1) {
                this.f2362c.stop();
            }
            this.f2362c.release();
            this.f2362c = null;
        }
        this.f2364e = null;
        this.f2365f = null;
        this.f2363d = false;
    }

    public synchronized void close() {
        stop();
    }

    native int fmodProcessMicData(ByteBuffer byteBuffer, int i);

    public boolean isRunning() {
        return this.f2360a != null && this.f2360a.isAlive();
    }

    public void run() {
        int i = 3;
        while (this.f2361b) {
            int i2;
            if (this.f2363d || i <= 0) {
                i2 = i;
            } else {
                releaseAudioTrack();
                int fmodGetInfo = fmodGetInfo(f2356h);
                int round = Math.round(((float) AudioTrack.getMinBufferSize(fmodGetInfo, 3, 2)) * 1.1f) & -4;
                int fmodGetInfo2 = fmodGetInfo(f2357i);
                i2 = fmodGetInfo(f2358j);
                if ((fmodGetInfo2 * i2) * 4 > round) {
                    round = (i2 * fmodGetInfo2) * 4;
                }
                this.f2362c = new AudioTrack(3, fmodGetInfo, 3, 2, round, 1);
                this.f2363d = this.f2362c.getState() == 1;
                if (this.f2363d) {
                    this.f2364e = ByteBuffer.allocateDirect((fmodGetInfo2 * 2) * 2);
                    this.f2365f = new byte[this.f2364e.capacity()];
                    this.f2362c.play();
                    i2 = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f2362c.getState() + ")");
                    releaseAudioTrack();
                    i2 = i - 1;
                }
            }
            if (!this.f2363d) {
                i = i2;
            } else if (fmodGetInfo(f2359k) == 1) {
                fmodProcess(this.f2364e);
                this.f2364e.get(this.f2365f, 0, this.f2364e.capacity());
                this.f2362c.write(this.f2365f, 0, this.f2364e.capacity());
                this.f2364e.position(0);
                i = i2;
            } else {
                releaseAudioTrack();
                i = i2;
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f2360a != null) {
            stop();
        }
        this.f2360a = new Thread(this, "FMODAudioDevice");
        this.f2360a.setPriority(10);
        this.f2361b = true;
        this.f2360a.start();
        if (this.f2366g != null) {
            this.f2366g.m2644b();
        }
    }

    public synchronized int startAudioRecord(int i, int i2, int i3) {
        if (this.f2366g == null) {
            this.f2366g = new C0748a(this, i, i2);
            this.f2366g.m2644b();
        }
        return this.f2366g.m2643a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stop() {
        /*
        r1 = this;
        monitor-enter(r1);
    L_0x0001:
        r0 = r1.f2360a;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x0013;
    L_0x0005:
        r0 = 0;
        r1.f2361b = r0;	 Catch:{ all -> 0x001e }
        r0 = r1.f2360a;	 Catch:{ InterruptedException -> 0x0011 }
        r0.join();	 Catch:{ InterruptedException -> 0x0011 }
        r0 = 0;
        r1.f2360a = r0;	 Catch:{ InterruptedException -> 0x0011 }
        goto L_0x0001;
    L_0x0011:
        r0 = move-exception;
        goto L_0x0001;
    L_0x0013:
        r0 = r1.f2366g;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x001c;
    L_0x0017:
        r0 = r1.f2366g;	 Catch:{ all -> 0x001e }
        r0.m2645c();	 Catch:{ all -> 0x001e }
    L_0x001c:
        monitor-exit(r1);
        return;
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fmod.FMODAudioDevice.stop():void");
    }

    public synchronized void stopAudioRecord() {
        if (this.f2366g != null) {
            this.f2366g.m2645c();
            this.f2366g = null;
        }
    }
}
