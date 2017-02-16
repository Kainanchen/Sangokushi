package org.apache.mina.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NamePreservingRunnable implements Runnable {
    private static final Logger LOGGER;
    private final String newName;
    private final Runnable runnable;

    static {
        LOGGER = LoggerFactory.getLogger(NamePreservingRunnable.class);
    }

    public NamePreservingRunnable(Runnable runnable, String str) {
        this.runnable = runnable;
        this.newName = str;
    }

    public void run() {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        if (this.newName != null) {
            setName(currentThread, this.newName);
        }
        try {
            this.runnable.run();
        } finally {
            setName(currentThread, name);
        }
    }

    private void setName(Thread thread, String str) {
        try {
            thread.setName(str);
        } catch (Throwable e) {
            if (LOGGER.isWarnEnabled()) {
                LOGGER.warn("Failed to set the thread name.", e);
            }
        }
    }
}
