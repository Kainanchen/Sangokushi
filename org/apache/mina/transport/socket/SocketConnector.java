package org.apache.mina.transport.socket;

import org.apache.mina.core.service.IoConnector;

public interface SocketConnector extends IoConnector {
    SocketSessionConfig getSessionConfig();
}
