package org.apache.mina.util;

public abstract class ExceptionMonitor {
    private static ExceptionMonitor instance;

    public abstract void exceptionCaught(Throwable th);

    static {
        instance = new DefaultExceptionMonitor();
    }

    public static ExceptionMonitor getInstance() {
        return instance;
    }

    public static void setInstance(ExceptionMonitor exceptionMonitor) {
        if (exceptionMonitor == null) {
            exceptionMonitor = new DefaultExceptionMonitor();
        }
        instance = exceptionMonitor;
    }
}
