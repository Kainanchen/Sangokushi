package org.apache.mina.core.session;

import java.io.Serializable;

public final class AttributeKey implements Serializable {
    private static final long serialVersionUID = -583377473376683096L;
    private final String name;

    public AttributeKey(Class<?> cls, String str) {
        this.name = cls.getName() + '.' + str + '@' + Integer.toHexString(hashCode());
    }

    public final String toString() {
        return this.name;
    }

    public final int hashCode() {
        return (this.name == null ? 0 : this.name.hashCode()) + 629;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributeKey)) {
            return false;
        }
        return this.name.equals(((AttributeKey) obj).name);
    }
}
