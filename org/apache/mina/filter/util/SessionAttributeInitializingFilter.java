package org.apache.mina.filter.util;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;

public class SessionAttributeInitializingFilter extends IoFilterAdapter {
    private final Map<String, Object> attributes;

    public SessionAttributeInitializingFilter() {
        this.attributes = new ConcurrentHashMap();
    }

    public SessionAttributeInitializingFilter(Map<String, ? extends Object> map) {
        this.attributes = new ConcurrentHashMap();
        setAttributes(map);
    }

    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    public Object setAttribute(String str, Object obj) {
        if (obj == null) {
            return removeAttribute(str);
        }
        return this.attributes.put(str, obj);
    }

    public Object setAttribute(String str) {
        return this.attributes.put(str, Boolean.TRUE);
    }

    public Object removeAttribute(String str) {
        return this.attributes.remove(str);
    }

    boolean containsAttribute(String str) {
        return this.attributes.containsKey(str);
    }

    public Set<String> getAttributeKeys() {
        return this.attributes.keySet();
    }

    public void setAttributes(Map<String, ? extends Object> map) {
        if (map == null) {
            map = new ConcurrentHashMap();
        }
        this.attributes.clear();
        this.attributes.putAll(map);
    }

    public void sessionCreated(NextFilter nextFilter, IoSession ioSession) {
        for (Entry entry : this.attributes.entrySet()) {
            ioSession.setAttribute(entry.getKey(), entry.getValue());
        }
        nextFilter.sessionCreated(ioSession);
    }
}
