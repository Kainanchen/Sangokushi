package org.apache.mina.proxy.handlers.http;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.proxy.ProxyAuthException;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.proxy.utils.StringUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpSmartProxyHandler extends AbstractHttpLogicHandler {
    private static final Logger logger;
    private AbstractAuthLogicHandler authHandler;
    private boolean requestSent;

    static {
        logger = LoggerFactory.getLogger(HttpSmartProxyHandler.class);
    }

    public HttpSmartProxyHandler(ProxyIoSession proxyIoSession) {
        super(proxyIoSession);
        this.requestSent = false;
    }

    public void doHandshake(NextFilter nextFilter) {
        logger.debug(" doHandshake()");
        if (this.authHandler != null) {
            this.authHandler.doHandshake(nextFilter);
        } else if (this.requestSent) {
            throw new ProxyAuthException("Authentication request already sent");
        } else {
            logger.debug("  sending HTTP request");
            HttpProxyRequest httpProxyRequest = (HttpProxyRequest) getProxyIoSession().getRequest();
            Map headers = httpProxyRequest.getHeaders() != null ? httpProxyRequest.getHeaders() : new HashMap();
            AbstractAuthLogicHandler.addKeepAliveHeaders(headers);
            httpProxyRequest.setHeaders(headers);
            writeRequest(nextFilter, httpProxyRequest);
            this.requestSent = true;
        }
    }

    private void autoSelectAuthHandler(HttpProxyResponse httpProxyResponse) {
        List<String> list = (List) httpProxyResponse.getHeaders().get("Proxy-Authenticate");
        ProxyIoSession proxyIoSession = getProxyIoSession();
        if (list == null || list.size() == 0) {
            this.authHandler = HttpAuthenticationMethods.NO_AUTH.getNewHandler(proxyIoSession);
        } else if (getProxyIoSession().getPreferedOrder() == null) {
            int i = -1;
            for (String toLowerCase : list) {
                String toLowerCase2 = toLowerCase2.toLowerCase();
                if (toLowerCase2.contains("ntlm")) {
                    i = HttpAuthenticationMethods.NTLM.getId();
                    break;
                } else if (!toLowerCase2.contains("digest") || i == HttpAuthenticationMethods.NTLM.getId()) {
                    int id;
                    if (toLowerCase2.contains("basic") && i == -1) {
                        id = HttpAuthenticationMethods.BASIC.getId();
                    } else {
                        id = i;
                    }
                    i = id;
                } else {
                    i = HttpAuthenticationMethods.DIGEST.getId();
                }
            }
            if (i != -1) {
                try {
                    this.authHandler = HttpAuthenticationMethods.getNewHandler(i, proxyIoSession);
                } catch (Throwable e) {
                    logger.debug("Following exception occured:", e);
                }
            }
            if (this.authHandler == null) {
                this.authHandler = HttpAuthenticationMethods.NO_AUTH.getNewHandler(proxyIoSession);
            }
        } else {
            for (HttpAuthenticationMethods httpAuthenticationMethods : proxyIoSession.getPreferedOrder()) {
                if (this.authHandler != null) {
                    break;
                } else if (httpAuthenticationMethods == HttpAuthenticationMethods.NO_AUTH) {
                    this.authHandler = HttpAuthenticationMethods.NO_AUTH.getNewHandler(proxyIoSession);
                    break;
                } else {
                    for (String toLowerCase3 : list) {
                        String toLowerCase32 = toLowerCase32.toLowerCase();
                        try {
                            if (!toLowerCase32.contains("basic") || httpAuthenticationMethods != HttpAuthenticationMethods.BASIC) {
                                if (!toLowerCase32.contains("digest") || httpAuthenticationMethods != HttpAuthenticationMethods.DIGEST) {
                                    if (toLowerCase32.contains("ntlm") && httpAuthenticationMethods == HttpAuthenticationMethods.NTLM) {
                                        this.authHandler = HttpAuthenticationMethods.NTLM.getNewHandler(proxyIoSession);
                                        break;
                                    }
                                }
                                this.authHandler = HttpAuthenticationMethods.DIGEST.getNewHandler(proxyIoSession);
                                break;
                            }
                            this.authHandler = HttpAuthenticationMethods.BASIC.getNewHandler(proxyIoSession);
                            break;
                        } catch (Throwable e2) {
                            logger.debug("Following exception occured:", e2);
                        }
                    }
                }
            }
        }
        if (this.authHandler == null) {
            throw new ProxyAuthException("Unknown authentication mechanism(s): " + list);
        }
    }

    public void handleResponse(HttpProxyResponse httpProxyResponse) {
        if (!isHandshakeComplete() && ("close".equalsIgnoreCase(StringUtilities.getSingleValuedHeader(httpProxyResponse.getHeaders(), "Proxy-Connection")) || "close".equalsIgnoreCase(StringUtilities.getSingleValuedHeader(httpProxyResponse.getHeaders(), "Connection")))) {
            getProxyIoSession().setReconnectionNeeded(true);
        }
        if (httpProxyResponse.getStatusCode() == 407) {
            if (this.authHandler == null) {
                autoSelectAuthHandler(httpProxyResponse);
            }
            this.authHandler.handleResponse(httpProxyResponse);
            return;
        }
        throw new ProxyAuthException("Error: unexpected response code " + httpProxyResponse.getStatusLine() + " received from proxy.");
    }
}
