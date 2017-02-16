package org.apache.mina.transport.socket.nio;

import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;
import java.nio.channels.SelectionKey;
import org.apache.mina.core.filterchain.DefaultIoFilterChain;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.service.IoService;
import org.apache.mina.core.session.AbstractIoSession;

public abstract class NioSession extends AbstractIoSession {
    protected final Channel channel;
    private final IoFilterChain filterChain;
    private SelectionKey key;
    protected final IoProcessor<NioSession> processor;

    abstract ByteChannel getChannel();

    protected NioSession(IoProcessor<NioSession> ioProcessor, IoService ioService, Channel channel) {
        super(ioService);
        this.channel = channel;
        this.processor = ioProcessor;
        this.filterChain = new DefaultIoFilterChain(this);
    }

    public IoFilterChain getFilterChain() {
        return this.filterChain;
    }

    SelectionKey getSelectionKey() {
        return this.key;
    }

    void setSelectionKey(SelectionKey selectionKey) {
        this.key = selectionKey;
    }

    public IoProcessor<NioSession> getProcessor() {
        return this.processor;
    }

    public final boolean isActive() {
        return this.key.isValid();
    }
}
