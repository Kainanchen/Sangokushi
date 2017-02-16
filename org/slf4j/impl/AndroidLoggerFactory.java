package org.slf4j.impl;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.Marker;

class AndroidLoggerFactory implements ILoggerFactory {
    static final String ANONYMOUS_TAG = "null";
    static final int TAG_MAX_LENGTH = 23;
    private final ConcurrentMap<String, Logger> loggerMap;

    AndroidLoggerFactory() {
        this.loggerMap = new ConcurrentHashMap();
    }

    public Logger getLogger(String str) {
        String loggerNameToTag = loggerNameToTag(str);
        Logger logger = (Logger) this.loggerMap.get(loggerNameToTag);
        if (logger != null) {
            return logger;
        }
        AndroidLoggerAdapter androidLoggerAdapter = new AndroidLoggerAdapter(loggerNameToTag);
        logger = (Logger) this.loggerMap.putIfAbsent(loggerNameToTag, androidLoggerAdapter);
        if (logger == null) {
            return androidLoggerAdapter;
        }
        return logger;
    }

    static String loggerNameToTag(String str) {
        int i = 0;
        if (str == null) {
            return ANONYMOUS_TAG;
        }
        int length = str.length();
        if (length <= TAG_MAX_LENGTH) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder(26);
        int i2 = 0;
        do {
            int indexOf = str.indexOf(46, i);
            if (indexOf != -1) {
                stringBuilder.append(str.charAt(i));
                if (indexOf - i > 1) {
                    stringBuilder.append('*');
                }
                stringBuilder.append('.');
                i = indexOf + 1;
                i2 = stringBuilder.length();
            } else {
                indexOf = length - i;
                if (i2 == 0 || i2 + indexOf > TAG_MAX_LENGTH) {
                    return getSimpleName(str);
                }
                stringBuilder.append(str, i, length);
                return stringBuilder.toString();
            }
        } while (i2 <= TAG_MAX_LENGTH);
        return getSimpleName(str);
    }

    private static String getSimpleName(String str) {
        int length = str.length();
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf == -1 || length - (lastIndexOf + 1) > TAG_MAX_LENGTH) ? new StringBuilder(Marker.ANY_MARKER).append(str.substring((length - 23) + 1)).toString() : str.substring(lastIndexOf + 1);
    }
}
