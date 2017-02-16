package org.apache.mina.handler.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class StreamIoHandler extends IoHandlerAdapter {
    private static final AttributeKey KEY_IN;
    private static final AttributeKey KEY_OUT;
    private static final Logger LOGGER;
    private int readTimeout;
    private int writeTimeout;

    private static class StreamIoException extends RuntimeException {
        private static final long serialVersionUID = 3976736960742503222L;

        public StreamIoException(IOException iOException) {
            super(iOException);
        }
    }

    protected abstract void processStreamIo(IoSession ioSession, InputStream inputStream, OutputStream outputStream);

    static {
        LOGGER = LoggerFactory.getLogger(StreamIoHandler.class);
        KEY_IN = new AttributeKey(StreamIoHandler.class, "in");
        KEY_OUT = new AttributeKey(StreamIoHandler.class, "out");
    }

    protected StreamIoHandler() {
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public void setReadTimeout(int i) {
        this.readTimeout = i;
    }

    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    public void setWriteTimeout(int i) {
        this.writeTimeout = i;
    }

    public void sessionOpened(IoSession ioSession) {
        ioSession.getConfig().setWriteTimeout(this.writeTimeout);
        ioSession.getConfig().setIdleTime(IdleStatus.READER_IDLE, this.readTimeout);
        InputStream ioSessionInputStream = new IoSessionInputStream();
        OutputStream ioSessionOutputStream = new IoSessionOutputStream(ioSession);
        ioSession.setAttribute(KEY_IN, ioSessionInputStream);
        ioSession.setAttribute(KEY_OUT, ioSessionOutputStream);
        processStreamIo(ioSession, ioSessionInputStream, ioSessionOutputStream);
    }

    public void sessionClosed(IoSession ioSession) {
        OutputStream outputStream = (OutputStream) ioSession.getAttribute(KEY_OUT);
        try {
            ((InputStream) ioSession.getAttribute(KEY_IN)).close();
        } finally {
            outputStream.close();
        }
    }

    public void messageReceived(IoSession ioSession, Object obj) {
        ((IoSessionInputStream) ioSession.getAttribute(KEY_IN)).write((IoBuffer) obj);
    }

    public void exceptionCaught(IoSession ioSession, Throwable th) {
        IoSessionInputStream ioSessionInputStream = (IoSessionInputStream) ioSession.getAttribute(KEY_IN);
        IOException iOException = null;
        if (th instanceof StreamIoException) {
            iOException = (IOException) th.getCause();
        } else if (th instanceof IOException) {
            iOException = (IOException) th;
        }
        if (iOException == null || ioSessionInputStream == null) {
            LOGGER.warn("Unexpected exception.", th);
            ioSession.closeNow();
            return;
        }
        ioSessionInputStream.throwException(iOException);
    }

    public void sessionIdle(IoSession ioSession, IdleStatus idleStatus) {
        if (idleStatus == IdleStatus.READER_IDLE) {
            throw new StreamIoException(new SocketTimeoutException("Read timeout"));
        }
    }
}
