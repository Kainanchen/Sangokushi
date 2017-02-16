package org.apache.mina.handler.stream;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.IoSession;

class IoSessionOutputStream extends OutputStream {
    private WriteFuture lastWriteFuture;
    private final IoSession session;

    public IoSessionOutputStream(IoSession ioSession) {
        this.session = ioSession;
    }

    public void close() {
        try {
            flush();
        } finally {
            this.session.closeNow().awaitUninterruptibly();
        }
    }

    private void checkClosed() {
        if (!this.session.isConnected()) {
            throw new IOException("The session has been closed.");
        }
    }

    private synchronized void write(IoBuffer ioBuffer) {
        checkClosed();
        this.lastWriteFuture = this.session.write(ioBuffer);
    }

    public void write(byte[] bArr, int i, int i2) {
        write(IoBuffer.wrap((byte[]) bArr.clone(), i, i2));
    }

    public void write(int i) {
        IoBuffer allocate = IoBuffer.allocate(1);
        allocate.put((byte) i);
        allocate.flip();
        write(allocate);
    }

    public synchronized void flush() {
        if (this.lastWriteFuture != null) {
            this.lastWriteFuture.awaitUninterruptibly();
            if (!this.lastWriteFuture.isWritten()) {
                throw new IOException("The bytes could not be written to the session");
            }
        }
    }
}
