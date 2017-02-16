package org.apache.mina.core.service;

import java.net.SocketAddress;
import java.util.Collections;
import java.util.Set;
import org.apache.mina.core.session.IoSessionConfig;
import org.apache.mina.util.IdentityHashSet;

public class DefaultTransportMetadata implements TransportMetadata {
    private final Class<? extends SocketAddress> addressType;
    private final boolean connectionless;
    private final Set<Class<? extends Object>> envelopeTypes;
    private final boolean fragmentation;
    private final String name;
    private final String providerName;
    private final Class<? extends IoSessionConfig> sessionConfigType;

    public DefaultTransportMetadata(String str, String str2, boolean z, boolean z2, Class<? extends SocketAddress> cls, Class<? extends IoSessionConfig> cls2, Class<?>... clsArr) {
        if (str == null) {
            throw new IllegalArgumentException("providerName");
        } else if (str2 == null) {
            throw new IllegalArgumentException("name");
        } else {
            String toLowerCase = str.trim().toLowerCase();
            if (toLowerCase.length() == 0) {
                throw new IllegalArgumentException("providerName is empty.");
            }
            String toLowerCase2 = str2.trim().toLowerCase();
            if (toLowerCase2.length() == 0) {
                throw new IllegalArgumentException("name is empty.");
            } else if (cls == null) {
                throw new IllegalArgumentException("addressType");
            } else if (clsArr == null) {
                throw new IllegalArgumentException("envelopeTypes");
            } else if (clsArr.length == 0) {
                throw new IllegalArgumentException("envelopeTypes is empty.");
            } else if (cls2 == null) {
                throw new IllegalArgumentException("sessionConfigType");
            } else {
                this.providerName = toLowerCase;
                this.name = toLowerCase2;
                this.connectionless = z;
                this.fragmentation = z2;
                this.addressType = cls;
                this.sessionConfigType = cls2;
                Set identityHashSet = new IdentityHashSet();
                for (Object add : clsArr) {
                    identityHashSet.add(add);
                }
                this.envelopeTypes = Collections.unmodifiableSet(identityHashSet);
            }
        }
    }

    public Class<? extends SocketAddress> getAddressType() {
        return this.addressType;
    }

    public Set<Class<? extends Object>> getEnvelopeTypes() {
        return this.envelopeTypes;
    }

    public Class<? extends IoSessionConfig> getSessionConfigType() {
        return this.sessionConfigType;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public String getName() {
        return this.name;
    }

    public boolean isConnectionless() {
        return this.connectionless;
    }

    public boolean hasFragmentation() {
        return this.fragmentation;
    }

    public String toString() {
        return this.name;
    }
}
