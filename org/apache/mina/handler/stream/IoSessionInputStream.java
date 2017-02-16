package org.apache.mina.handler.stream;

import java.io.IOException;
import java.io.InputStream;
import org.apache.mina.core.buffer.IoBuffer;

class IoSessionInputStream extends InputStream {
    private final IoBuffer buf;
    private volatile boolean closed;
    private IOException exception;
    private final Object mutex;
    private volatile boolean released;

    public IoSessionInputStream() {
        this.mutex = new Object();
        this.buf = IoBuffer.allocate(16);
        this.buf.setAutoExpand(true);
        this.buf.limit(0);
    }

    public int available() {
        if (this.released) {
            return 0;
        }
        int remaining;
        synchronized (this.mutex) {
            remaining = this.buf.remaining();
        }
        return remaining;
    }

    public void close() {
        if (!this.closed) {
            synchronized (this.mutex) {
                this.closed = true;
                releaseBuffer();
                this.mutex.notifyAll();
            }
        }
    }

    public int read() {
        int i;
        synchronized (this.mutex) {
            if (waitForData()) {
                i = this.buf.get() & 255;
            } else {
                i = -1;
            }
        }
        return i;
    }

    public int read(byte[] bArr, int i, int i2) {
        int remaining;
        synchronized (this.mutex) {
            if (waitForData()) {
                if (i2 > this.buf.remaining()) {
                    remaining = this.buf.remaining();
                } else {
                    remaining = i2;
                }
                this.buf.get(bArr, i, remaining);
            } else {
                remaining = -1;
            }
        }
        return remaining;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean waitForData() {
        /*
        r4 = this;
        r0 = 0;
        r1 = r4.released;
        if (r1 == 0) goto L_0x0006;
    L_0x0005:
        return r0;
    L_0x0006:
        r1 = r4.mutex;
        monitor-enter(r1);
    L_0x0009:
        r2 = r4.released;	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x002e;
    L_0x000d:
        r2 = r4.buf;	 Catch:{ all -> 0x002b }
        r2 = r2.remaining();	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x002e;
    L_0x0015:
        r2 = r4.exception;	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x002e;
    L_0x0019:
        r2 = r4.mutex;	 Catch:{ InterruptedException -> 0x001f }
        r2.wait();	 Catch:{ InterruptedException -> 0x001f }
        goto L_0x0009;
    L_0x001f:
        r0 = move-exception;
        r2 = new java.io.IOException;	 Catch:{ all -> 0x002b }
        r3 = "Interrupted while waiting for more data";
        r2.<init>(r3);	 Catch:{ all -> 0x002b }
        r2.initCause(r0);	 Catch:{ all -> 0x002b }
        throw r2;	 Catch:{ all -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        throw r0;
    L_0x002e:
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        r1 = r4.exception;
        if (r1 == 0) goto L_0x0039;
    L_0x0033:
        r4.releaseBuffer();
        r0 = r4.exception;
        throw r0;
    L_0x0039:
        r1 = r4.closed;
        if (r1 == 0) goto L_0x0049;
    L_0x003d:
        r1 = r4.buf;
        r1 = r1.remaining();
        if (r1 != 0) goto L_0x0049;
    L_0x0045:
        r4.releaseBuffer();
        goto L_0x0005;
    L_0x0049:
        r0 = 1;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.handler.stream.IoSessionInputStream.waitForData():boolean");
    }

    private void releaseBuffer() {
        if (!this.released) {
            this.released = true;
        }
    }

    public void write(IoBuffer ioBuffer) {
        synchronized (this.mutex) {
            if (this.closed) {
                return;
            }
            if (this.buf.hasRemaining()) {
                this.buf.compact();
                this.buf.put(ioBuffer);
                this.buf.flip();
            } else {
                this.buf.clear();
                this.buf.put(ioBuffer);
                this.buf.flip();
                this.mutex.notifyAll();
            }
        }
    }

    public void throwException(IOException iOException) {
        synchronized (this.mutex) {
            if (this.exception == null) {
                this.exception = iOException;
                this.mutex.notifyAll();
            }
        }
    }
}
