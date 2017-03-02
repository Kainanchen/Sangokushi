package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: org.fmod.a */
final class C0748a implements Runnable {
    private final FMODAudioDevice f2367a;
    private final ByteBuffer f2368b;
    private final int f2369c;
    private final int f2370d;
    private final int f2371e;
    private volatile Thread f2372f;
    private volatile boolean f2373g;
    private AudioRecord f2374h;
    private boolean f2375i;

    C0748a(FMODAudioDevice fMODAudioDevice, int i, int i2) {
        this.f2367a = fMODAudioDevice;
        this.f2369c = i;
        this.f2370d = i2;
        this.f2371e = 2;
        this.f2368b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i, i2, 2));
    }

    private void m2642d() {
        if (this.f2374h != null) {
            if (this.f2374h.getState() == 1) {
                this.f2374h.stop();
            }
            this.f2374h.release();
            this.f2374h = null;
        }
        this.f2368b.position(0);
        this.f2375i = false;
    }

    public final int m2643a() {
        return this.f2368b.capacity();
    }

    public final void m2644b() {
        if (this.f2372f != null) {
            m2645c();
        }
        this.f2373g = true;
        this.f2372f = new Thread(this);
        this.f2372f.start();
    }

    public final void m2645c() {
        while (this.f2372f != null) {
            this.f2373g = false;
            try {
                this.f2372f.join();
                this.f2372f = null;
            } catch (InterruptedException e) {
            }
        }
    }

    public final void run() {
        int i = 3;
        while (this.f2373g) {
            int i2;
            if (!this.f2375i && i > 0) {
                m2642d();
                this.f2374h = new AudioRecord(1, this.f2369c, this.f2370d, this.f2371e, this.f2368b.capacity());
                this.f2375i = this.f2374h.getState() == 1;
                if (this.f2375i) {
                    this.f2368b.position(0);
                    this.f2374h.startRecording();
                    i2 = 3;
                    if (this.f2375i || this.f2374h.getRecordingState() != 3) {
                        i = i2;
                    } else {
                        this.f2367a.fmodProcessMicData(this.f2368b, this.f2374h.read(this.f2368b, this.f2368b.capacity()));
                        this.f2368b.position(0);
                        i = i2;
                    }
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.f2374h.getState() + ")");
                    i--;
                    m2642d();
                }
            }
            i2 = i;
            if (this.f2375i) {
            }
            i = i2;
        }
        m2642d();
    }
}
