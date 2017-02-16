package org.apache.mina.core.filterchain;

import net.sqlcipher.IBulkCursor;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoEvent;
import org.apache.mina.core.session.IoEventType;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.cocos2dx.lib.Cocos2dxHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IoFilterEvent extends IoEvent {
    private static final boolean DEBUG;
    private static final Logger LOGGER;
    private final NextFilter nextFilter;

    /* renamed from: org.apache.mina.core.filterchain.IoFilterEvent.1 */
    static /* synthetic */ class C04051 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$mina$core$session$IoEventType;

        static {
            $SwitchMap$org$apache$mina$core$session$IoEventType = new int[IoEventType.values().length];
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.MESSAGE_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.MESSAGE_SENT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.WRITE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.CLOSE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.EXCEPTION_CAUGHT.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.SESSION_IDLE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.SESSION_OPENED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.SESSION_CREATED.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$IoEventType[IoEventType.SESSION_CLOSED.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    static {
        Logger logger = LoggerFactory.getLogger(IoFilterEvent.class);
        LOGGER = logger;
        DEBUG = logger.isDebugEnabled();
    }

    public IoFilterEvent(NextFilter nextFilter, IoEventType ioEventType, IoSession ioSession, Object obj) {
        super(ioEventType, ioSession, obj);
        if (nextFilter == null) {
            throw new IllegalArgumentException("nextFilter must not be null");
        }
        this.nextFilter = nextFilter;
    }

    public NextFilter getNextFilter() {
        return this.nextFilter;
    }

    public void fire() {
        IoSession session = getSession();
        NextFilter nextFilter = getNextFilter();
        Object type = getType();
        if (DEBUG) {
            LOGGER.debug("Firing a {} event for session {}", type, Long.valueOf(session.getId()));
        }
        switch (C04051.$SwitchMap$org$apache$mina$core$session$IoEventType[type.ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                nextFilter.messageReceived(session, getParameter());
                break;
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                nextFilter.messageSent(session, (WriteRequest) getParameter());
                break;
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                nextFilter.filterWrite(session, (WriteRequest) getParameter());
                break;
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                nextFilter.filterClose(session);
                break;
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                nextFilter.exceptionCaught(session, (Throwable) getParameter());
                break;
            case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                nextFilter.sessionIdle(session, (IdleStatus) getParameter());
                break;
            case IBulkCursor.REQUERY_TRANSACTION /*7*/:
                nextFilter.sessionOpened(session);
                break;
            case SocksProxyConstants.SOCKS_4_RESPONSE_SIZE /*8*/:
                nextFilter.sessionCreated(session);
                break;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                nextFilter.sessionClosed(session);
                break;
            default:
                throw new IllegalArgumentException("Unknown event type: " + type);
        }
        if (DEBUG) {
            LOGGER.debug("Event {} has been fired for session {}", type, Long.valueOf(session.getId()));
        }
    }
}
