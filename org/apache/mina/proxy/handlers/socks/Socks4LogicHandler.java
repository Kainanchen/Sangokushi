package org.apache.mina.proxy.handlers.socks;

import java.util.Arrays;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.proxy.utils.ByteUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Socks4LogicHandler extends AbstractSocksLogicHandler {
    private static final Logger logger;

    static {
        logger = LoggerFactory.getLogger(Socks4LogicHandler.class);
    }

    public Socks4LogicHandler(ProxyIoSession proxyIoSession) {
        super(proxyIoSession);
    }

    public void doHandshake(NextFilter nextFilter) {
        logger.debug(" doHandshake()");
        writeRequest(nextFilter, this.request);
    }

    protected void writeRequest(NextFilter nextFilter, SocksProxyRequest socksProxyRequest) {
        try {
            byte[] bytes;
            boolean equals = Arrays.equals(socksProxyRequest.getIpAddress(), SocksProxyConstants.FAKE_IP);
            byte[] bytes2 = socksProxyRequest.getUserName().getBytes("ASCII");
            if (equals) {
                bytes = socksProxyRequest.getHost().getBytes("ASCII");
            } else {
                bytes = null;
            }
            int length = bytes2.length + 9;
            if (equals) {
                length += bytes.length + 1;
            }
            IoBuffer allocate = IoBuffer.allocate(length);
            allocate.put(socksProxyRequest.getProtocolVersion());
            allocate.put(socksProxyRequest.getCommandCode());
            allocate.put(socksProxyRequest.getPort());
            allocate.put(socksProxyRequest.getIpAddress());
            allocate.put(bytes2);
            allocate.put((byte) 0);
            if (equals) {
                allocate.put(bytes);
                allocate.put((byte) 0);
            }
            if (equals) {
                logger.debug("  sending SOCKS4a request");
            } else {
                logger.debug("  sending SOCKS4 request");
            }
            allocate.flip();
            writeData(nextFilter, allocate);
        } catch (Throwable e) {
            closeSession("Unable to send Socks request: ", e);
        }
    }

    public void messageReceived(NextFilter nextFilter, IoBuffer ioBuffer) {
        try {
            if (ioBuffer.remaining() >= 8) {
                handleResponse(ioBuffer);
            }
        } catch (Throwable e) {
            closeSession("Proxy handshake failed: ", e);
        }
    }

    protected void handleResponse(IoBuffer ioBuffer) {
        if (ioBuffer.get(0) != null) {
            throw new Exception("Socks response seems to be malformed");
        }
        byte b = ioBuffer.get(1);
        ioBuffer.position(ioBuffer.position() + 8);
        if (b == 90) {
            setHandshakeComplete();
            return;
        }
        throw new Exception("Proxy handshake failed - Code: 0x" + ByteUtilities.asHex(new byte[]{b}) + " (" + SocksProxyConstants.getReplyCodeAsString(b) + ")");
    }
}
