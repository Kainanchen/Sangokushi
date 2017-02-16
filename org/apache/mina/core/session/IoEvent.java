package org.apache.mina.core.session;

import net.sqlcipher.IBulkCursor;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.cocos2dx.lib.Cocos2dxHandler;

public class IoEvent implements Runnable {
    private final Object parameter;
    private final IoSession session;
    private final IoEventType type;

    /* renamed from: org.apache.mina.core.session.IoEvent.1 */
    static /* synthetic */ class C04241 {
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

    public IoEvent(IoEventType ioEventType, IoSession ioSession, Object obj) {
        if (ioEventType == null) {
            throw new IllegalArgumentException("type");
        } else if (ioSession == null) {
            throw new IllegalArgumentException("session");
        } else {
            this.type = ioEventType;
            this.session = ioSession;
            this.parameter = obj;
        }
    }

    public IoEventType getType() {
        return this.type;
    }

    public IoSession getSession() {
        return this.session;
    }

    public Object getParameter() {
        return this.parameter;
    }

    public void run() {
        fire();
    }

    public void fire() {
        switch (C04241.$SwitchMap$org$apache$mina$core$session$IoEventType[getType().ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                getSession().getFilterChain().fireMessageReceived(getParameter());
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                getSession().getFilterChain().fireMessageSent((WriteRequest) getParameter());
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                getSession().getFilterChain().fireFilterWrite((WriteRequest) getParameter());
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                getSession().getFilterChain().fireFilterClose();
            case IBulkCursor.DELETE_ROW_TRANSACTION /*5*/:
                getSession().getFilterChain().fireExceptionCaught((Throwable) getParameter());
            case IBulkCursor.DEACTIVATE_TRANSACTION /*6*/:
                getSession().getFilterChain().fireSessionIdle((IdleStatus) getParameter());
            case IBulkCursor.REQUERY_TRANSACTION /*7*/:
                getSession().getFilterChain().fireSessionOpened();
            case SocksProxyConstants.SOCKS_4_RESPONSE_SIZE /*8*/:
                getSession().getFilterChain().fireSessionCreated();
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                getSession().getFilterChain().fireSessionClosed();
            default:
                throw new IllegalArgumentException("Unknown event type: " + getType());
        }
    }

    public String toString() {
        if (getParameter() == null) {
            return "[" + getSession() + "] " + getType().name();
        }
        return "[" + getSession() + "] " + getType().name() + ": " + getParameter();
    }
}
