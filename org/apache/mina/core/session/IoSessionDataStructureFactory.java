package org.apache.mina.core.session;

import org.apache.mina.core.write.WriteRequestQueue;

public interface IoSessionDataStructureFactory {
    IoSessionAttributeMap getAttributeMap(IoSession ioSession);

    WriteRequestQueue getWriteRequestQueue(IoSession ioSession);
}
