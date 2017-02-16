package org.apache.mina.proxy.handlers.http;

import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import java.util.HashMap;
import java.util.Map;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.IoSessionInitializer;
import org.apache.mina.proxy.AbstractProxyLogicHandler;
import org.apache.mina.proxy.ProxyAuthException;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.proxy.utils.IoBufferDecoder;
import org.apache.mina.proxy.utils.StringUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractHttpLogicHandler extends AbstractProxyLogicHandler {
    private static final byte[] CRLF_DELIMITER;
    private static final String DECODER;
    private static final byte[] HTTP_DELIMITER;
    private static final Logger LOGGER;
    private int contentLength;
    private int entityBodyLimitPosition;
    private int entityBodyStartPosition;
    private boolean hasChunkedData;
    private HttpProxyResponse parsedResponse;
    private IoBuffer responseData;
    private boolean waitingChunkedData;
    private boolean waitingFooters;

    /* renamed from: org.apache.mina.proxy.handlers.http.AbstractHttpLogicHandler.1 */
    class C04611 implements IoSessionInitializer<ConnectFuture> {
        final /* synthetic */ NextFilter val$nextFilter;
        final /* synthetic */ ProxyIoSession val$proxyIoSession;
        final /* synthetic */ HttpProxyRequest val$request;

        /* renamed from: org.apache.mina.proxy.handlers.http.AbstractHttpLogicHandler.1.1 */
        class C04601 implements IoFutureListener<ConnectFuture> {
            C04601() {
            }

            public void operationComplete(ConnectFuture connectFuture) {
                C04611.this.val$proxyIoSession.setReconnectionNeeded(false);
                AbstractHttpLogicHandler.this.writeRequest0(C04611.this.val$nextFilter, C04611.this.val$request);
            }
        }

        C04611(ProxyIoSession proxyIoSession, NextFilter nextFilter, HttpProxyRequest httpProxyRequest) {
            this.val$proxyIoSession = proxyIoSession;
            this.val$nextFilter = nextFilter;
            this.val$request = httpProxyRequest;
        }

        public void initializeSession(IoSession ioSession, ConnectFuture connectFuture) {
            AbstractHttpLogicHandler.LOGGER.debug("Initializing new session: {}", (Object) ioSession);
            ioSession.setAttribute(ProxyIoSession.PROXY_SESSION, this.val$proxyIoSession);
            this.val$proxyIoSession.setSession(ioSession);
            AbstractHttpLogicHandler.LOGGER.debug("  setting up proxyIoSession: {}", this.val$proxyIoSession);
            connectFuture.addListener(new C04601());
        }
    }

    public abstract void handleResponse(HttpProxyResponse httpProxyResponse);

    static {
        LOGGER = LoggerFactory.getLogger(AbstractHttpLogicHandler.class);
        DECODER = AbstractHttpLogicHandler.class.getName() + ".Decoder";
        HTTP_DELIMITER = new byte[]{(byte) 13, (byte) 10, (byte) 13, (byte) 10};
        CRLF_DELIMITER = new byte[]{(byte) 13, (byte) 10};
    }

    public AbstractHttpLogicHandler(ProxyIoSession proxyIoSession) {
        super(proxyIoSession);
        this.responseData = null;
        this.parsedResponse = null;
        this.contentLength = -1;
    }

    public synchronized void messageReceived(NextFilter nextFilter, IoBuffer ioBuffer) {
        IoBufferDecoder ioBufferDecoder;
        LOGGER.debug(" messageReceived()");
        IoBufferDecoder ioBufferDecoder2 = (IoBufferDecoder) getSession().getAttribute(DECODER);
        if (ioBufferDecoder2 == null) {
            ioBufferDecoder2 = new IoBufferDecoder(HTTP_DELIMITER);
            getSession().setAttribute(DECODER, ioBufferDecoder2);
            ioBufferDecoder = ioBufferDecoder2;
        } else {
            ioBufferDecoder = ioBufferDecoder2;
        }
        try {
            String string;
            IoBuffer decodeFully;
            if (this.parsedResponse == null) {
                this.responseData = ioBufferDecoder.decodeFully(ioBuffer);
                if (this.responseData != null) {
                    string = this.responseData.getString(getProxyIoSession().getCharset().newDecoder());
                    this.entityBodyStartPosition = this.responseData.position();
                    LOGGER.debug("  response header received:\n{}", string.replace("\r", "\\r").replace("\n", "\\n\n"));
                    this.parsedResponse = decodeResponse(string);
                    if (this.parsedResponse.getStatusCode() == TEXAS_CMD.Cmd_CSAddLeagueMaxMember_VALUE || (this.parsedResponse.getStatusCode() >= 300 && this.parsedResponse.getStatusCode() <= 307)) {
                        ioBuffer.position(0);
                        setHandshakeComplete();
                    } else {
                        string = StringUtilities.getSingleValuedHeader(this.parsedResponse.getHeaders(), "Content-Length");
                        if (string == null) {
                            this.contentLength = 0;
                        } else {
                            this.contentLength = Integer.parseInt(string.trim());
                            ioBufferDecoder.setContentLength(this.contentLength, true);
                        }
                    }
                }
            }
            if (!this.hasChunkedData) {
                if (this.contentLength > 0) {
                    decodeFully = ioBufferDecoder.decodeFully(ioBuffer);
                    if (decodeFully != null) {
                        this.responseData.setAutoExpand(true);
                        this.responseData.put(decodeFully);
                        this.contentLength = 0;
                    }
                }
                if ("chunked".equalsIgnoreCase(StringUtilities.getSingleValuedHeader(this.parsedResponse.getHeaders(), "Transfer-Encoding"))) {
                    LOGGER.debug("Retrieving additional http response chunks");
                    this.hasChunkedData = true;
                    this.waitingChunkedData = true;
                }
            }
            if (this.hasChunkedData) {
                while (this.waitingChunkedData) {
                    if (this.contentLength == 0) {
                        ioBufferDecoder.setDelimiter(CRLF_DELIMITER, false);
                        decodeFully = ioBufferDecoder.decodeFully(ioBuffer);
                        if (decodeFully == null) {
                            break;
                        }
                        string = decodeFully.getString(getProxyIoSession().getCharset().newDecoder());
                        int indexOf = string.indexOf(59);
                        if (indexOf >= 0) {
                            string = string.substring(0, indexOf);
                        } else {
                            string = string.substring(0, string.length() - 2);
                        }
                        this.contentLength = Integer.decode("0x" + string).intValue();
                        if (this.contentLength > 0) {
                            this.contentLength += 2;
                            ioBufferDecoder.setContentLength(this.contentLength, true);
                        }
                    }
                    if (this.contentLength != 0) {
                        decodeFully = ioBufferDecoder.decodeFully(ioBuffer);
                        if (decodeFully == null) {
                            break;
                        }
                        this.contentLength = 0;
                        this.responseData.put(decodeFully);
                        ioBuffer.position(ioBuffer.position());
                    } else {
                        this.waitingChunkedData = false;
                        this.waitingFooters = true;
                        this.entityBodyLimitPosition = this.responseData.position();
                        break;
                    }
                }
                while (this.waitingFooters) {
                    ioBufferDecoder.setDelimiter(CRLF_DELIMITER, false);
                    decodeFully = ioBufferDecoder.decodeFully(ioBuffer);
                    if (decodeFully == null) {
                        break;
                    } else if (decodeFully.remaining() == 2) {
                        this.waitingFooters = false;
                        break;
                    } else {
                        String[] split = decodeFully.getString(getProxyIoSession().getCharset().newDecoder()).split(":\\s?", 2);
                        StringUtilities.addValueToHeader(this.parsedResponse.getHeaders(), split[0], split[1], false);
                        this.responseData.put(decodeFully);
                        this.responseData.put(CRLF_DELIMITER);
                    }
                }
            }
            this.responseData.flip();
            LOGGER.debug("  end of response received:\n{}", this.responseData.getString(getProxyIoSession().getCharset().newDecoder()));
            this.responseData.position(this.entityBodyStartPosition);
            this.responseData.limit(this.entityBodyLimitPosition);
            this.parsedResponse.setBody(this.responseData.getString(getProxyIoSession().getCharset().newDecoder()));
            this.responseData.free();
            this.responseData = null;
            handleResponse(this.parsedResponse);
            this.parsedResponse = null;
            this.hasChunkedData = false;
            this.contentLength = -1;
            ioBufferDecoder.setDelimiter(HTTP_DELIMITER, true);
            if (!isHandshakeComplete()) {
                doHandshake(nextFilter);
            }
        } catch (Throwable e) {
            if (e instanceof ProxyAuthException) {
                throw ((ProxyAuthException) e);
            }
            throw new ProxyAuthException("Handshake failed", e);
        }
    }

    public void writeRequest(NextFilter nextFilter, HttpProxyRequest httpProxyRequest) {
        if (getProxyIoSession().isReconnectionNeeded()) {
            reconnect(nextFilter, httpProxyRequest);
        } else {
            writeRequest0(nextFilter, httpProxyRequest);
        }
    }

    private void writeRequest0(NextFilter nextFilter, HttpProxyRequest httpProxyRequest) {
        try {
            String toHttpString = httpProxyRequest.toHttpString();
            IoBuffer wrap = IoBuffer.wrap(toHttpString.getBytes(getProxyIoSession().getCharsetName()));
            LOGGER.debug("   write:\n{}", toHttpString.replace("\r", "\\r").replace("\n", "\\n\n"));
            writeData(nextFilter, wrap);
        } catch (Throwable e) {
            closeSession("Unable to send HTTP request: ", e);
        }
    }

    private void reconnect(NextFilter nextFilter, HttpProxyRequest httpProxyRequest) {
        LOGGER.debug("Reconnecting to proxy ...");
        ProxyIoSession proxyIoSession = getProxyIoSession();
        proxyIoSession.getConnector().connect(new C04611(proxyIoSession, nextFilter, httpProxyRequest));
    }

    protected HttpProxyResponse decodeResponse(String str) {
        LOGGER.debug("  parseResponse()");
        String[] split = str.split(HttpProxyConstants.CRLF);
        Object split2 = split[0].trim().split(" ", 2);
        if (split2.length < 2) {
            throw new Exception("Invalid response status line (" + split2 + "). Response: " + str);
        } else if (split2[1].matches("^\\d\\d\\d")) {
            Map hashMap = new HashMap();
            for (int i = 1; i < split.length; i++) {
                String[] split3 = split[i].split(":\\s?", 2);
                StringUtilities.addValueToHeader(hashMap, split3[0], split3[1], false);
            }
            return new HttpProxyResponse(split2[0], split2[1], hashMap);
        } else {
            throw new Exception("Invalid response code (" + split2[1] + "). Response: " + str);
        }
    }
}
