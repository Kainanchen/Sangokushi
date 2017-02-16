package org.apache.mina.core.filterchain;

public interface IoFilterChainBuilder {
    public static final IoFilterChainBuilder NOOP;

    /* renamed from: org.apache.mina.core.filterchain.IoFilterChainBuilder.1 */
    static class C04041 implements IoFilterChainBuilder {
        C04041() {
        }

        public final void buildFilterChain(IoFilterChain ioFilterChain) {
        }

        public final String toString() {
            return "NOOP";
        }
    }

    void buildFilterChain(IoFilterChain ioFilterChain);

    static {
        NOOP = new C04041();
    }
}
