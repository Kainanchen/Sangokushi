package org.apache.mina.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultExceptionMonitor extends ExceptionMonitor {
    private static final Logger LOGGER;

    static {
        LOGGER = LoggerFactory.getLogger(DefaultExceptionMonitor.class);
    }

    public void exceptionCaught(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        LOGGER.warn("Unexpected exception.", th);
    }
}
