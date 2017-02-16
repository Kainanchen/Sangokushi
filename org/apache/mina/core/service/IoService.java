package org.apache.mina.core.service;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.filterchain.IoFilterChainBuilder;
import org.apache.mina.core.session.IoSessionConfig;
import org.apache.mina.core.session.IoSessionDataStructureFactory;

public interface IoService {
    void dispose();

    DefaultIoFilterChainBuilder getFilterChain();

    IoFilterChainBuilder getFilterChainBuilder();

    IoHandler getHandler();

    IoSessionConfig getSessionConfig();

    IoSessionDataStructureFactory getSessionDataStructureFactory();

    TransportMetadata getTransportMetadata();

    void setHandler(IoHandler ioHandler);
}
