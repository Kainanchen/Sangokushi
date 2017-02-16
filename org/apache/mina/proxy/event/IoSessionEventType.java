package org.apache.mina.proxy.event;

import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.cocos2dx.lib.Cocos2dxHandler;

public enum IoSessionEventType {
    CREATED(1),
    OPENED(2),
    IDLE(3),
    CLOSED(4);
    
    private final int id;

    /* renamed from: org.apache.mina.proxy.event.IoSessionEventType.1 */
    static /* synthetic */ class C04591 {
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

    private IoSessionEventType(int i) {
        this.id = i;
    }

    public final int getId() {
        return this.id;
    }

    public final String toString() {
        switch (C04591.$SwitchMap$org$apache$mina$proxy$event$IoSessionEventType[ordinal()]) {
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                return "- CREATED event -";
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                return "- OPENED event -";
            case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                return "- IDLE event -";
            case NTLMConstants.FLAG_REQUEST_SERVER_AUTH_REALM /*4*/:
                return "- CLOSED event -";
            default:
                return "- Event Id=" + this.id + " -";
        }
    }
}
