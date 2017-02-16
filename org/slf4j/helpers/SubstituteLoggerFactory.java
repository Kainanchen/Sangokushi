package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.event.SubstituteLoggingEvent;

public class SubstituteLoggerFactory implements ILoggerFactory {
    final LinkedBlockingQueue<SubstituteLoggingEvent> eventQueue;
    final Map<String, SubstituteLogger> loggers;
    boolean postInitialization;

    public SubstituteLoggerFactory() {
        this.postInitialization = false;
        this.loggers = new HashMap();
        this.eventQueue = new LinkedBlockingQueue();
    }

    public synchronized Logger getLogger(String str) {
        Logger logger;
        logger = (SubstituteLogger) this.loggers.get(str);
        if (logger == null) {
            logger = new SubstituteLogger(str, this.eventQueue, this.postInitialization);
            this.loggers.put(str, logger);
        }
        return logger;
    }

    public List<String> getLoggerNames() {
        return new ArrayList(this.loggers.keySet());
    }

    public List<SubstituteLogger> getLoggers() {
        return new ArrayList(this.loggers.values());
    }

    public LinkedBlockingQueue<SubstituteLoggingEvent> getEventQueue() {
        return this.eventQueue;
    }

    public void postInitialization() {
        this.postInitialization = true;
    }

    public void clear() {
        this.loggers.clear();
        this.eventQueue.clear();
    }
}