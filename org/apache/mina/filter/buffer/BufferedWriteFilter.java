package org.apache.mina.filter.buffer;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.DefaultWriteRequest;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.util.LazyInitializedCacheMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BufferedWriteFilter extends IoFilterAdapter {
    public static final int DEFAULT_BUFFER_SIZE = 8192;
    private int bufferSize;
    private final LazyInitializedCacheMap<IoSession, IoBuffer> buffersMap;
    private final Logger logger;

    public BufferedWriteFilter() {
        this(DEFAULT_BUFFER_SIZE, null);
    }

    public BufferedWriteFilter(int i) {
        this(i, null);
    }

    public BufferedWriteFilter(int i, LazyInitializedCacheMap<IoSession, IoBuffer> lazyInitializedCacheMap) {
        this.logger = LoggerFactory.getLogger(BufferedWriteFilter.class);
        this.bufferSize = DEFAULT_BUFFER_SIZE;
        this.bufferSize = i;
        if (lazyInitializedCacheMap == null) {
            this.buffersMap = new LazyInitializedCacheMap();
        } else {
            this.buffersMap = lazyInitializedCacheMap;
        }
    }

    public final int getBufferSize() {
        return this.bufferSize;
    }

    public final void setBufferSize(int i) {
        this.bufferSize = i;
    }

    public final void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        Object message = writeRequest.getMessage();
        if (message instanceof IoBuffer) {
            write(ioSession, (IoBuffer) message);
            return;
        }
        throw new IllegalArgumentException("This filter should only buffer IoBuffer objects");
    }

    private void write(IoSession ioSession, IoBuffer ioBuffer) {
        write(ioSession, ioBuffer, (IoBuffer) this.buffersMap.putIfAbsent(ioSession, new IoBufferLazyInitializer(this.bufferSize)));
    }

    private void write(IoSession ioSession, IoBuffer ioBuffer, IoBuffer ioBuffer2) {
        try {
            int remaining = ioBuffer.remaining();
            if (remaining >= ioBuffer2.capacity()) {
                NextFilter nextFilter = ioSession.getFilterChain().getNextFilter((IoFilter) this);
                internalFlush(nextFilter, ioSession, ioBuffer2);
                nextFilter.filterWrite(ioSession, new DefaultWriteRequest(ioBuffer));
                return;
            }
            if (remaining > ioBuffer2.limit() - ioBuffer2.position()) {
                internalFlush(ioSession.getFilterChain().getNextFilter((IoFilter) this), ioSession, ioBuffer2);
            }
            synchronized (ioBuffer2) {
                ioBuffer2.put(ioBuffer);
            }
        } catch (Throwable e) {
            ioSession.getFilterChain().fireExceptionCaught(e);
        }
    }

    private void internalFlush(NextFilter nextFilter, IoSession ioSession, IoBuffer ioBuffer) {
        Object duplicate;
        synchronized (ioBuffer) {
            ioBuffer.flip();
            duplicate = ioBuffer.duplicate();
            ioBuffer.clear();
        }
        this.logger.debug("Flushing buffer: {}", duplicate);
        nextFilter.filterWrite(ioSession, new DefaultWriteRequest(duplicate));
    }

    public final void flush(IoSession ioSession) {
        try {
            internalFlush(ioSession.getFilterChain().getNextFilter((IoFilter) this), ioSession, (IoBuffer) this.buffersMap.get(ioSession));
        } catch (Throwable e) {
            ioSession.getFilterChain().fireExceptionCaught(e);
        }
    }

    private void free(IoSession ioSession) {
        IoBuffer ioBuffer = (IoBuffer) this.buffersMap.remove(ioSession);
        if (ioBuffer != null) {
            ioBuffer.free();
        }
    }

    public final void exceptionCaught(NextFilter nextFilter, IoSession ioSession, Throwable th) {
        free(ioSession);
        nextFilter.exceptionCaught(ioSession, th);
    }

    public final void sessionClosed(NextFilter nextFilter, IoSession ioSession) {
        free(ioSession);
        nextFilter.sessionClosed(ioSession);
    }
}
