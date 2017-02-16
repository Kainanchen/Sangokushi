package org.apache.mina.util;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import org.apache.mina.proxy.handlers.http.HttpProxyConstants;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.cocos2dx.lib.BuildConfig;
import org.slf4j.MDC;

public class Log4jXmlFormatter extends Formatter {
    private final int DEFAULT_SIZE;
    private final int UPPER_LIMIT;
    private StringBuffer buf;
    private boolean locationInfo;
    private boolean properties;

    public Log4jXmlFormatter() {
        this.DEFAULT_SIZE = NTLMConstants.FLAG_UNIDENTIFIED_2;
        this.UPPER_LIMIT = NTLMConstants.FLAG_NEGOTIATE_ANONYMOUS;
        this.buf = new StringBuffer(NTLMConstants.FLAG_UNIDENTIFIED_2);
        this.locationInfo = false;
        this.properties = false;
    }

    public void setLocationInfo(boolean z) {
        this.locationInfo = z;
    }

    public boolean getLocationInfo() {
        return this.locationInfo;
    }

    public void setProperties(boolean z) {
        this.properties = z;
    }

    public boolean getProperties() {
        return this.properties;
    }

    public String format(LogRecord logRecord) {
        if (this.buf.capacity() > NTLMConstants.FLAG_NEGOTIATE_ANONYMOUS) {
            this.buf = new StringBuffer(NTLMConstants.FLAG_UNIDENTIFIED_2);
        } else {
            this.buf.setLength(0);
        }
        this.buf.append("<log4j:event logger=\"");
        this.buf.append(Transform.escapeTags(logRecord.getLoggerName()));
        this.buf.append("\" timestamp=\"");
        this.buf.append(logRecord.getMillis());
        this.buf.append("\" level=\"");
        this.buf.append(Transform.escapeTags(logRecord.getLevel().getName()));
        this.buf.append("\" thread=\"");
        this.buf.append(String.valueOf(logRecord.getThreadID()));
        this.buf.append("\">\r\n");
        this.buf.append("<log4j:message><![CDATA[");
        Transform.appendEscapingCDATA(this.buf, logRecord.getMessage());
        this.buf.append("]]></log4j:message>\r\n");
        if (logRecord.getThrown() != null) {
            String[] throwableStrRep = Transform.getThrowableStrRep(logRecord.getThrown());
            if (throwableStrRep != null) {
                this.buf.append("<log4j:throwable><![CDATA[");
                for (String appendEscapingCDATA : throwableStrRep) {
                    Transform.appendEscapingCDATA(this.buf, appendEscapingCDATA);
                    this.buf.append(HttpProxyConstants.CRLF);
                }
                this.buf.append("]]></log4j:throwable>\r\n");
            }
        }
        if (this.locationInfo) {
            this.buf.append("<log4j:locationInfo class=\"");
            this.buf.append(Transform.escapeTags(logRecord.getSourceClassName()));
            this.buf.append("\" method=\"");
            this.buf.append(Transform.escapeTags(logRecord.getSourceMethodName()));
            this.buf.append("\" file=\"?\" line=\"?\"/>\r\n");
        }
        if (this.properties) {
            Map copyOfContextMap = MDC.getCopyOfContextMap();
            if (copyOfContextMap != null) {
                Set keySet = copyOfContextMap.keySet();
                if (keySet != null && keySet.size() > 0) {
                    this.buf.append("<log4j:properties>\r\n");
                    Object[] toArray = keySet.toArray();
                    Arrays.sort(toArray);
                    for (Object obj : toArray) {
                        String obj2 = obj == null ? BuildConfig.FLAVOR : obj.toString();
                        Object obj3 = copyOfContextMap.get(obj2);
                        if (obj3 != null) {
                            this.buf.append("<log4j:data name=\"");
                            this.buf.append(Transform.escapeTags(obj2));
                            this.buf.append("\" value=\"");
                            this.buf.append(Transform.escapeTags(String.valueOf(obj3)));
                            this.buf.append("\"/>\r\n");
                        }
                    }
                    this.buf.append("</log4j:properties>\r\n");
                }
            }
        }
        this.buf.append("</log4j:event>\r\n\r\n");
        return this.buf.toString();
    }
}
