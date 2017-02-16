package org.apache.mina.handler.chain;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class ChainedIoHandler extends IoHandlerAdapter {
    private final IoHandlerChain chain;

    public ChainedIoHandler() {
        this.chain = new IoHandlerChain();
    }

    public ChainedIoHandler(IoHandlerChain ioHandlerChain) {
        if (ioHandlerChain == null) {
            throw new IllegalArgumentException("chain");
        }
        this.chain = ioHandlerChain;
    }

    public IoHandlerChain getChain() {
        return this.chain;
    }

    public void messageReceived(IoSession ioSession, Object obj) {
        this.chain.execute(null, ioSession, obj);
    }
}
