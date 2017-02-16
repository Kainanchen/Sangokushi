package org.apache.mina.proxy.event;

import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.cocos2dx.lib.Cocos2dxHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IoSessionEvent {
    private static final Logger logger;
    private final NextFilter nextFilter;
    private final IoSession session;
    private IdleStatus status;
    private final IoSessionEventType type;

    /* renamed from: org.apache.mina.proxy.event.IoSessionEvent.1 */
    static /* synthetic */ class C04581 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$mina$proxy$event$IoSessionEventType;

        static {
            $SwitchMap$org$apache$mina$proxy$event$IoSessionEventType = new int[IoSessionEventType.values().length];
            try {
                $SwitchMap$org$apache$mina$proxy$event$IoSessionEventType[IoSessionEventType.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$apache$mina$proxy$event$IoSessionEventType[IoSessionEventType.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$org$apache$mina$proxy$event$IoSessionEventType[IoSessionEventType.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$org$apache$mina$proxy$event$IoSessionEventType[IoSessionEventType.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    static {
        logger = LoggerFactory.getLogger(IoSessionEvent.class);
    }

    public IoSessionEvent(NextFilter nextFilter, IoSession ioSession, IoSessionEventType ioSessionEventType) {
        this.nextFilter = nextFilter;
        this.session = ioSession;
        this.type = ioSessionEventType;
    }

    public IoSessionEvent(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus) {
        this(nextFilter, ioSession, IoSessionEventType.IDLE);
        this.status = idleStatus;
    }

    public void deliverEvent() {
        logger.debug("Delivering event {}", (Object) this);
        deliverEvent(this.nextFilter, this.session, this.type, this.status);
    }

    private static void deliverEvent(NextFilter nextFilter, IoSession ioSession, IoSessionEventType ioSessionEventType, IdleStatus idleStatus) {
        switch (C04581.$SwitchMap$org$apache$mina$proxy$event$IoSessionEventType[ioSessionEventType.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                nextFilter.sessionCreated(ioSession);
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                nextFilter.sessionOpened(ioSession);
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                nextFilter.sessionIdle(ioSession, idleStatus);
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                nextFilter.sessionClosed(ioSession);
            default:
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(IoSessionEvent.class.getSimpleName());
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(" - [ ").append(this.session);
        stringBuilder.append(", ").append(this.type);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public IdleStatus getStatus() {
        return this.status;
    }

    public NextFilter getNextFilter() {
        return this.nextFilter;
    }

    public IoSession getSession() {
        return this.session;
    }

    public IoSessionEventType getType() {
        return this.type;
    }
}
