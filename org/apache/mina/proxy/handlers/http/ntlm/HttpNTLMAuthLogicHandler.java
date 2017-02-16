package org.apache.mina.proxy.handlers.http.ntlm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.proxy.ProxyAuthException;
import org.apache.mina.proxy.handlers.http.AbstractAuthLogicHandler;
import org.apache.mina.proxy.handlers.http.HttpProxyConstants;
import org.apache.mina.proxy.handlers.http.HttpProxyRequest;
import org.apache.mina.proxy.handlers.http.HttpProxyResponse;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.proxy.utils.StringUtilities;
import org.apache.mina.util.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpNTLMAuthLogicHandler extends AbstractAuthLogicHandler {
    private static final Logger LOGGER;
    private byte[] challengePacket;

    static {
        LOGGER = LoggerFactory.getLogger(HttpNTLMAuthLogicHandler.class);
    }

    public HttpNTLMAuthLogicHandler(ProxyIoSession proxyIoSession) {
        super(proxyIoSession);
        this.challengePacket = null;
        ((HttpProxyRequest) this.request).checkRequiredProperties(HttpProxyConstants.USER_PROPERTY, HttpProxyConstants.PWD_PROPERTY, HttpProxyConstants.DOMAIN_PROPERTY, HttpProxyConstants.WORKSTATION_PROPERTY);
    }

    public void doHandshake(NextFilter nextFilter) {
        LOGGER.debug(" doHandshake()");
        if (this.step <= 0 || this.challengePacket != null) {
            Map headers;
            HttpProxyRequest httpProxyRequest = (HttpProxyRequest) this.request;
            if (httpProxyRequest.getHeaders() != null) {
                headers = httpProxyRequest.getHeaders();
            } else {
                Object hashMap = new HashMap();
            }
            String str = (String) httpProxyRequest.getProperties().get(HttpProxyConstants.DOMAIN_PROPERTY);
            String str2 = (String) httpProxyRequest.getProperties().get(HttpProxyConstants.WORKSTATION_PROPERTY);
            if (this.step > 0) {
                LOGGER.debug("  sending NTLM challenge response");
                StringUtilities.addValueToHeader(headers, "Proxy-Authorization", "NTLM " + new String(Base64.encodeBase64(NTLMUtilities.createType3Message((String) httpProxyRequest.getProperties().get(HttpProxyConstants.USER_PROPERTY), (String) httpProxyRequest.getProperties().get(HttpProxyConstants.PWD_PROPERTY), NTLMUtilities.extractChallengeFromType2Message(this.challengePacket), str, str2, Integer.valueOf(NTLMUtilities.extractFlagsFromType2Message(this.challengePacket)), null))), true);
            } else {
                LOGGER.debug("  sending NTLM negotiation packet");
                StringUtilities.addValueToHeader(headers, "Proxy-Authorization", "NTLM " + new String(Base64.encodeBase64(NTLMUtilities.createType1Message(str2, str, null, null))), true);
            }
            AbstractAuthLogicHandler.addKeepAliveHeaders(headers);
            httpProxyRequest.setHeaders(headers);
            writeRequest(nextFilter, httpProxyRequest);
            this.step++;
            return;
        }
        throw new IllegalStateException("NTLM Challenge packet not received");
    }

    private String getNTLMHeader(HttpProxyResponse httpProxyResponse) {
        for (String str : (List) httpProxyResponse.getHeaders().get("Proxy-Authenticate")) {
            if (str.startsWith("NTLM")) {
                return str;
            }
        }
        return null;
    }

    public void handleResponse(HttpProxyResponse httpProxyResponse) {
        String nTLMHeader;
        if (this.step == 0) {
            nTLMHeader = getNTLMHeader(httpProxyResponse);
            this.step = 1;
            if (nTLMHeader == null || nTLMHeader.length() < 5) {
                return;
            }
        }
        if (this.step == 1) {
            nTLMHeader = getNTLMHeader(httpProxyResponse);
            if (nTLMHeader == null || nTLMHeader.length() < 5) {
                throw new ProxyAuthException("Unexpected error while reading server challenge !");
            }
            try {
                this.challengePacket = Base64.decodeBase64(nTLMHeader.substring(5).getBytes(this.proxyIoSession.getCharsetName()));
                this.step = 2;
                return;
            } catch (Throwable e) {
                throw new ProxyAuthException("Unable to decode the base64 encoded NTLM challenge", e);
            }
        }
        throw new ProxyAuthException("Received unexpected response code (" + httpProxyResponse.getStatusLine() + ").");
    }
}
