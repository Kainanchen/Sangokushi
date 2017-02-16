package org.apache.mina.core.service;

import java.net.SocketAddress;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSessionInitializer;

public interface IoConnector extends IoService {
    ConnectFuture connect(SocketAddress socketAddress, IoSessionInitializer<? extends ConnectFuture> ioSessionInitializer);
}
