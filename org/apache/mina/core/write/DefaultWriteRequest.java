package org.apache.mina.core.write;

import java.net.SocketAddress;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.IoSession;

public class DefaultWriteRequest implements WriteRequest {
    public static final byte[] EMPTY_MESSAGE;
    private static final WriteFuture UNUSED_FUTURE;
    private final SocketAddress destination;
    private final WriteFuture future;
    private final Object message;

    /* renamed from: org.apache.mina.core.write.DefaultWriteRequest.1 */
    static class C04261 implements WriteFuture {
        C04261() {
        }

        public final boolean isWritten() {
            return false;
        }

        public final void setWritten() {
        }

        public final IoSession getSession() {
            return null;
        }

        public final WriteFuture addListener(IoFutureListener<?> ioFutureListener) {
            throw new IllegalStateException("You can't add a listener to a dummy future.");
        }

        public final WriteFuture await() {
            return this;
        }

        public final boolean await(long j) {
            return true;
        }

        public final WriteFuture awaitUninterruptibly() {
            return this;
        }

        public final boolean awaitUninterruptibly(long j) {
            return true;
        }

        public final void setException(Throwable th) {
        }
    }

    static {
        EMPTY_MESSAGE = new byte[0];
        UNUSED_FUTURE = new C04261();
    }

    public DefaultWriteRequest(Object obj) {
        this(obj, null, null);
    }

    public DefaultWriteRequest(Object obj, WriteFuture writeFuture) {
        this(obj, writeFuture, null);
    }

    public DefaultWriteRequest(Object obj, WriteFuture writeFuture, SocketAddress socketAddress) {
        if (obj == null) {
            throw new IllegalArgumentException("message");
        }
        if (writeFuture == null) {
            writeFuture = UNUSED_FUTURE;
        }
        this.message = obj;
        this.future = writeFuture;
        this.destination = socketAddress;
    }

    public WriteFuture getFuture() {
        return this.future;
    }

    public Object getMessage() {
        return this.message;
    }

    public WriteRequest getOriginalRequest() {
        return this;
    }

    public SocketAddress getDestination() {
        return this.destination;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WriteRequest: ");
        if (this.message.getClass().getName().equals(Object.class.getName())) {
            stringBuilder.append("CLOSE_REQUEST");
        } else if (getDestination() == null) {
            stringBuilder.append(this.message);
        } else {
            stringBuilder.append(this.message);
            stringBuilder.append(" => ");
            stringBuilder.append(getDestination());
        }
        return stringBuilder.toString();
    }

    public boolean isEncoded() {
        return false;
    }
}
