package org.apache.mina.core.service;

import java.net.SocketAddress;

public interface IoAcceptor extends IoService {
    SocketAddress getLocalAddress();

    boolean isCloseOnDeactivation();
}
