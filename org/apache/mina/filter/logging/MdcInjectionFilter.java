package org.apache.mina.filter.logging;

import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.mina.core.filterchain.IoFilterEvent;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.util.CommonEventFilter;
import org.slf4j.MDC;

public class MdcInjectionFilter extends CommonEventFilter {
    private static final AttributeKey CONTEXT_KEY;
    private ThreadLocal<Integer> callDepth;
    private EnumSet<MdcKey> mdcKeys;

    /* renamed from: org.apache.mina.filter.logging.MdcInjectionFilter.1 */
    class C04461 extends ThreadLocal<Integer> {
        C04461() {
        }

        protected Integer initialValue() {
            return Integer.valueOf(0);
        }
    }

    public enum MdcKey {
        handlerClass,
        remoteAddress,
        localAddress,
        remoteIp,
        remotePort,
        localIp,
        localPort
    }

    static {
        CONTEXT_KEY = new AttributeKey(MdcInjectionFilter.class, "context");
    }

    public MdcInjectionFilter(EnumSet<MdcKey> enumSet) {
        this.callDepth = new C04461();
        this.mdcKeys = enumSet.clone();
    }

    public MdcInjectionFilter(MdcKey... mdcKeyArr) {
        this.callDepth = new C04461();
        this.mdcKeys = EnumSet.copyOf(new HashSet(Arrays.asList(mdcKeyArr)));
    }

    public MdcInjectionFilter() {
        this.callDepth = new C04461();
        this.mdcKeys = EnumSet.allOf(MdcKey.class);
    }

    protected void filter(IoFilterEvent ioFilterEvent) {
        int intValue = ((Integer) this.callDepth.get()).intValue();
        this.callDepth.set(Integer.valueOf(intValue + 1));
        Map andFillContext = getAndFillContext(ioFilterEvent.getSession());
        if (intValue == 0) {
            for (Entry entry : andFillContext.entrySet()) {
                MDC.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        try {
            ioFilterEvent.fire();
            if (intValue == 0) {
                for (String remove : andFillContext.keySet()) {
                    MDC.remove(remove);
                }
                this.callDepth.remove();
                return;
            }
            this.callDepth.set(Integer.valueOf(intValue));
        } catch (Throwable th) {
            if (intValue == 0) {
                for (String remove2 : andFillContext.keySet()) {
                    MDC.remove(remove2);
                }
                this.callDepth.remove();
            } else {
                this.callDepth.set(Integer.valueOf(intValue));
            }
        }
    }

    private Map<String, String> getAndFillContext(IoSession ioSession) {
        Map<String, String> context = getContext(ioSession);
        if (context.isEmpty()) {
            fillContext(ioSession, context);
        }
        return context;
    }

    private static Map<String, String> getContext(IoSession ioSession) {
        Map<String, String> map = (Map) ioSession.getAttribute(CONTEXT_KEY);
        if (map != null) {
            return map;
        }
        Map concurrentHashMap = new ConcurrentHashMap();
        ioSession.setAttribute(CONTEXT_KEY, concurrentHashMap);
        return concurrentHashMap;
    }

    protected void fillContext(IoSession ioSession, Map<String, String> map) {
        if (this.mdcKeys.contains(MdcKey.handlerClass)) {
            map.put(MdcKey.handlerClass.name(), ioSession.getHandler().getClass().getName());
        }
        if (this.mdcKeys.contains(MdcKey.remoteAddress)) {
            map.put(MdcKey.remoteAddress.name(), ioSession.getRemoteAddress().toString());
        }
        if (this.mdcKeys.contains(MdcKey.localAddress)) {
            map.put(MdcKey.localAddress.name(), ioSession.getLocalAddress().toString());
        }
        if (ioSession.getTransportMetadata().getAddressType() == InetSocketAddress.class) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) ioSession.getRemoteAddress();
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) ioSession.getLocalAddress();
            if (this.mdcKeys.contains(MdcKey.remoteIp)) {
                map.put(MdcKey.remoteIp.name(), inetSocketAddress.getAddress().getHostAddress());
            }
            if (this.mdcKeys.contains(MdcKey.remotePort)) {
                map.put(MdcKey.remotePort.name(), String.valueOf(inetSocketAddress.getPort()));
            }
            if (this.mdcKeys.contains(MdcKey.localIp)) {
                map.put(MdcKey.localIp.name(), inetSocketAddress2.getAddress().getHostAddress());
            }
            if (this.mdcKeys.contains(MdcKey.localPort)) {
                map.put(MdcKey.localPort.name(), String.valueOf(inetSocketAddress2.getPort()));
            }
        }
    }

    public static String getProperty(IoSession ioSession, String str) {
        if (str == null) {
            throw new IllegalArgumentException("key should not be null");
        }
        String str2 = (String) getContext(ioSession).get(str);
        return str2 != null ? str2 : MDC.get(str);
    }

    public static void setProperty(IoSession ioSession, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("key should not be null");
        }
        if (str2 == null) {
            removeProperty(ioSession, str);
        }
        getContext(ioSession).put(str, str2);
        MDC.put(str, str2);
    }

    public static void removeProperty(IoSession ioSession, String str) {
        if (str == null) {
            throw new IllegalArgumentException("key should not be null");
        }
        getContext(ioSession).remove(str);
        MDC.remove(str);
    }
}
