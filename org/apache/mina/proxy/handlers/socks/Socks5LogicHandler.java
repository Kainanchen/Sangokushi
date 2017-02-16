package org.apache.mina.proxy.handlers.socks;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.proxy.utils.ByteUtilities;
import org.cocos2dx.lib.Cocos2dxHandler;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;

public class Socks5LogicHandler extends AbstractSocksLogicHandler {
    private static final String GSS_CONTEXT;
    private static final String GSS_TOKEN;
    private static final String HANDSHAKE_STEP;
    private static final Logger LOGGER;
    private static final String SELECTED_AUTH_METHOD;

    static {
        LOGGER = LoggerFactory.getLogger(Socks5LogicHandler.class);
        SELECTED_AUTH_METHOD = Socks5LogicHandler.class.getName() + ".SelectedAuthMethod";
        HANDSHAKE_STEP = Socks5LogicHandler.class.getName() + ".HandshakeStep";
        GSS_CONTEXT = Socks5LogicHandler.class.getName() + ".GSSContext";
        GSS_TOKEN = Socks5LogicHandler.class.getName() + ".GSSToken";
    }

    public Socks5LogicHandler(ProxyIoSession proxyIoSession) {
        super(proxyIoSession);
        getSession().setAttribute(HANDSHAKE_STEP, Integer.valueOf(0));
    }

    public synchronized void doHandshake(NextFilter nextFilter) {
        LOGGER.debug(" doHandshake()");
        writeRequest(nextFilter, this.request, ((Integer) getSession().getAttribute(HANDSHAKE_STEP)).intValue());
    }

    private IoBuffer encodeInitialGreetingPacket(SocksProxyRequest socksProxyRequest) {
        byte length = (byte) SocksProxyConstants.SUPPORTED_AUTH_METHODS.length;
        IoBuffer allocate = IoBuffer.allocate(length + 2);
        allocate.put(socksProxyRequest.getProtocolVersion());
        allocate.put(length);
        allocate.put(SocksProxyConstants.SUPPORTED_AUTH_METHODS);
        return allocate;
    }

    private IoBuffer encodeProxyRequestPacket(SocksProxyRequest socksProxyRequest) {
        int length;
        byte b;
        byte[] bArr = null;
        InetSocketAddress endpointAddress = socksProxyRequest.getEndpointAddress();
        if (endpointAddress == null || endpointAddress.isUnresolved()) {
            if (socksProxyRequest.getHost() != null) {
                bArr = socksProxyRequest.getHost().getBytes("ASCII");
            }
            if (bArr != null) {
                length = (bArr.length + 1) + 6;
                b = (byte) 3;
            } else {
                throw new IllegalArgumentException("SocksProxyRequest object has no suitable endpoint information");
            }
        } else if (endpointAddress.getAddress() instanceof Inet6Address) {
            length = 22;
            b = (byte) 4;
        } else if (endpointAddress.getAddress() instanceof Inet4Address) {
            length = 10;
            b = (byte) 1;
        } else {
            length = 6;
            b = (byte) 0;
        }
        IoBuffer allocate = IoBuffer.allocate(length);
        allocate.put(socksProxyRequest.getProtocolVersion());
        allocate.put(socksProxyRequest.getCommandCode());
        allocate.put((byte) 0);
        allocate.put(b);
        if (bArr == null) {
            allocate.put(socksProxyRequest.getIpAddress());
        } else {
            allocate.put((byte) bArr.length);
            allocate.put(bArr);
        }
        allocate.put(socksProxyRequest.getPort());
        return allocate;
    }

    private IoBuffer encodeAuthenticationPacket(SocksProxyRequest socksProxyRequest) {
        switch (((Byte) getSession().getAttribute(SELECTED_AUTH_METHOD)).byteValue()) {
            case LocationAwareLogger.TRACE_INT /*0*/:
                getSession().setAttribute(HANDSHAKE_STEP, Integer.valueOf(2));
                break;
            case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                return encodeGSSAPIAuthenticationPacket(socksProxyRequest);
            case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                byte[] bytes = socksProxyRequest.getUserName().getBytes("ASCII");
                byte[] bytes2 = socksProxyRequest.getPassword().getBytes("ASCII");
                IoBuffer allocate = IoBuffer.allocate((bytes.length + 3) + bytes2.length);
                allocate.put((byte) 1);
                allocate.put((byte) bytes.length);
                allocate.put(bytes);
                allocate.put((byte) bytes2.length);
                allocate.put(bytes2);
                return allocate;
        }
        return null;
    }

    private IoBuffer encodeGSSAPIAuthenticationPacket(SocksProxyRequest socksProxyRequest) {
        GSSContext gSSContext = (GSSContext) getSession().getAttribute(GSS_CONTEXT);
        if (gSSContext == null) {
            GSSManager instance = GSSManager.getInstance();
            GSSName createName = instance.createName(socksProxyRequest.getServiceKerberosName(), null);
            Oid oid = new Oid(SocksProxyConstants.KERBEROS_V5_OID);
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Available mechs:");
                for (Object obj : instance.getMechs()) {
                    if (obj.equals(oid)) {
                        LOGGER.debug("Found Kerberos V OID available");
                    }
                    LOGGER.debug("{} with oid = {}", instance.getNamesForMech(obj), obj);
                }
            }
            gSSContext = instance.createContext(createName, oid, null, 0);
            gSSContext.requestMutualAuth(true);
            gSSContext.requestConf(false);
            gSSContext.requestInteg(false);
            getSession().setAttribute(GSS_CONTEXT, gSSContext);
        }
        GSSContext gSSContext2 = gSSContext;
        byte[] bArr = (byte[]) getSession().getAttribute(GSS_TOKEN);
        if (bArr != null) {
            LOGGER.debug("  Received Token[{}] = {}", Integer.valueOf(bArr.length), ByteUtilities.asHex(bArr));
        }
        if (!gSSContext2.isEstablished()) {
            if (bArr == null) {
                bArr = new byte[32];
            }
            byte[] initSecContext = gSSContext2.initSecContext(bArr, 0, bArr.length);
            if (initSecContext != null) {
                LOGGER.debug("  Sending Token[{}] = {}", Integer.valueOf(initSecContext.length), ByteUtilities.asHex(initSecContext));
                getSession().setAttribute(GSS_TOKEN, initSecContext);
                IoBuffer allocate = IoBuffer.allocate(initSecContext.length + 4);
                allocate.put(new byte[]{(byte) 1, (byte) 1});
                allocate.put(ByteUtilities.intToNetworkByteOrder(initSecContext.length, 2));
                allocate.put(initSecContext);
                return allocate;
            }
        }
        return null;
    }

    private void writeRequest(NextFilter nextFilter, SocksProxyRequest socksProxyRequest, int i) {
        IoBuffer ioBuffer = null;
        if (i == 0) {
            try {
                ioBuffer = encodeInitialGreetingPacket(socksProxyRequest);
            } catch (Throwable e) {
                closeSession("Unable to send Socks request: ", e);
                return;
            }
        } else if (i == 1) {
            ioBuffer = encodeAuthenticationPacket(socksProxyRequest);
            if (ioBuffer == null) {
                i = 2;
            }
        }
        if (i == 2) {
            ioBuffer = encodeProxyRequestPacket(socksProxyRequest);
        }
        ioBuffer.flip();
        writeData(nextFilter, ioBuffer);
    }

    public synchronized void messageReceived(NextFilter nextFilter, IoBuffer ioBuffer) {
        try {
            int intValue = ((Integer) getSession().getAttribute(HANDSHAKE_STEP)).intValue();
            if (intValue != 0 || ioBuffer.get(0) == (byte) 5) {
                if (intValue == 0 || intValue == 1) {
                    if (ioBuffer.remaining() >= 2) {
                        handleResponse(nextFilter, ioBuffer, intValue);
                    }
                }
                if (intValue == 2) {
                    if (ioBuffer.remaining() >= 5) {
                        handleResponse(nextFilter, ioBuffer, intValue);
                    }
                }
            } else {
                throw new IllegalStateException("Wrong socks version running on server");
            }
        } catch (Throwable e) {
            closeSession("Proxy handshake failed: ", e);
        }
    }

    protected void handleResponse(NextFilter nextFilter, IoBuffer ioBuffer, int i) {
        int i2;
        byte b;
        if (i == 0) {
            b = ioBuffer.get(1);
            if (b == -1) {
                throw new IllegalStateException("No acceptable authentication method to use with the socks proxy server");
            }
            getSession().setAttribute(SELECTED_AUTH_METHOD, Byte.valueOf(b));
            i2 = 2;
        } else if (i == 1) {
            if (((Byte) getSession().getAttribute(SELECTED_AUTH_METHOD)).byteValue() == (byte) 1) {
                i2 = ioBuffer.position();
                if (ioBuffer.get(0) != (byte) 1) {
                    throw new IllegalStateException("Authentication failed");
                } else if ((ioBuffer.get(1) & 255) == 255) {
                    throw new IllegalStateException("Authentication failed: GSS API Security Context Failure");
                } else if (ioBuffer.remaining() >= 2) {
                    byte[] bArr = new byte[2];
                    ioBuffer.get(bArr);
                    i2 = ByteUtilities.makeIntFromByte2(bArr);
                    if (ioBuffer.remaining() >= i2) {
                        bArr = new byte[i2];
                        ioBuffer.get(bArr);
                        getSession().setAttribute(GSS_TOKEN, bArr);
                        i2 = 0;
                    } else {
                        return;
                    }
                } else {
                    ioBuffer.position(i2);
                    return;
                }
            } else if (ioBuffer.get(1) != null) {
                throw new IllegalStateException("Authentication failed");
            } else {
                i2 = 2;
            }
        } else if (i == 2) {
            b = ioBuffer.get(3);
            if (b == (byte) 4) {
                i2 = 22;
            } else if (b == (byte) 1) {
                i2 = 10;
            } else if (b == (byte) 3) {
                i2 = (ioBuffer.get(4) + 1) + 6;
            } else {
                throw new IllegalStateException("Unknwon address type");
            }
            if (ioBuffer.remaining() >= i2) {
                byte b2 = ioBuffer.get(1);
                LOGGER.debug("  response status: {}", SocksProxyConstants.getReplyCodeAsString(b2));
                if (b2 == null) {
                    ioBuffer.position(i2 + ioBuffer.position());
                    setHandshakeComplete();
                    return;
                }
                throw new Exception("Proxy handshake failed - Code: 0x" + ByteUtilities.asHex(new byte[]{b2}));
            }
            return;
        } else {
            i2 = 2;
        }
        if (i2 > 0) {
            ioBuffer.position(ioBuffer.position() + 2);
        }
        if (i == 1 && ((Byte) getSession().getAttribute(SELECTED_AUTH_METHOD)).byteValue() == (byte) 1) {
            GSSContext gSSContext = (GSSContext) getSession().getAttribute(GSS_CONTEXT);
            if (gSSContext == null || !gSSContext.isEstablished()) {
                i2 = 1;
                if (i2 == 0) {
                    getSession().setAttribute(HANDSHAKE_STEP, Integer.valueOf(i + 1));
                }
                doHandshake(nextFilter);
            }
        }
        i2 = 0;
        if (i2 == 0) {
            getSession().setAttribute(HANDSHAKE_STEP, Integer.valueOf(i + 1));
        }
        doHandshake(nextFilter);
    }

    protected void closeSession(String str) {
        GSSContext gSSContext = (GSSContext) getSession().getAttribute(GSS_CONTEXT);
        if (gSSContext != null) {
            try {
                gSSContext.dispose();
            } catch (GSSException e) {
                e.printStackTrace();
                super.closeSession(str, e);
                return;
            }
        }
        super.closeSession(str);
    }
}
