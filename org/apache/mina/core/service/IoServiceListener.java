package org.apache.mina.core.service;

import java.util.EventListener;
import org.apache.mina.core.session.IoSession;

public interface IoServiceListener extends EventListener {
    void serviceActivated(IoService ioService);

    void serviceDeactivated(IoService ioService);

    void sessionCreated(IoSession ioSession);

    void sessionDestroyed(IoSession ioSession);
}
