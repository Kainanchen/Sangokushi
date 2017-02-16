package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public class StaticLoggerBinder implements LoggerFactoryBinder {
    public static String REQUESTED_API_VERSION;
    private static final StaticLoggerBinder SINGLETON;
    private static final String loggerFactoryClassStr;
    private final ILoggerFactory loggerFactory;

    static {
        SINGLETON = new StaticLoggerBinder();
        REQUESTED_API_VERSION = "1.6.99";
        loggerFactoryClassStr = AndroidLoggerFactory.class.getName();
    }

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    private StaticLoggerBinder() {
        this.loggerFactory = new AndroidLoggerFactory();
    }

    public ILoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }

    public String getLoggerFactoryClassStr() {
        return loggerFactoryClassStr;
    }
}
