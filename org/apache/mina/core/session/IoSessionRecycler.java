package org.apache.mina.core.session;

import java.net.SocketAddress;

public interface IoSessionRecycler {
    public static final IoSessionRecycler NOOP;

    /* renamed from: org.apache.mina.core.session.IoSessionRecycler.1 */
    static class C04251 implements IoSessionRecycler {
        C04251() {
        }

        public final void put(IoSession ioSession) {
        }

        public final IoSession recycle(SocketAddress socketAddress) {
            return null;
        }

        public final void remove(IoSession ioSession) {
        }
    }

    void put(IoSession ioSession);

    IoSession recycle(SocketAddress socketAddress);

    void remove(IoSession ioSession);

    static {
        NOOP = new C04251();
    }
}
