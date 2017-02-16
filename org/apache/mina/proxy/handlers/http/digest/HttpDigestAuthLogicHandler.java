package org.apache.mina.proxy.handlers.http.digest;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
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

public class HttpDigestAuthLogicHandler extends AbstractAuthLogicHandler {
    private static final Logger logger;
    private static SecureRandom rnd;
    private HashMap<String, String> directives;
    private HttpProxyResponse response;

    static {
        logger = LoggerFactory.getLogger(HttpDigestAuthLogicHandler.class);
        try {
            rnd = SecureRandom.getInstance("SHA1PRNG");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public HttpDigestAuthLogicHandler(ProxyIoSession proxyIoSession) {
        super(proxyIoSession);
        this.directives = null;
        ((HttpProxyRequest) this.request).checkRequiredProperties(HttpProxyConstants.USER_PROPERTY, HttpProxyConstants.PWD_PROPERTY);
    }

    public void doHandshake(NextFilter nextFilter) {
        logger.debug(" doHandshake()");
        if (this.step <= 0 || this.directives != null) {
            Map headers;
            HttpProxyRequest httpProxyRequest = (HttpProxyRequest) this.request;
            if (httpProxyRequest.getHeaders() != null) {
                headers = httpProxyRequest.getHeaders();
            } else {
                Object hashMap = new HashMap();
            }
            if (this.step > 0) {
                logger.debug("  sending DIGEST challenge response");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("username", httpProxyRequest.getProperties().get(HttpProxyConstants.USER_PROPERTY));
                StringUtilities.copyDirective(this.directives, hashMap2, "realm");
                StringUtilities.copyDirective(this.directives, hashMap2, "uri");
                StringUtilities.copyDirective(this.directives, hashMap2, "opaque");
                StringUtilities.copyDirective(this.directives, hashMap2, "nonce");
                String copyDirective = StringUtilities.copyDirective(this.directives, hashMap2, "algorithm");
                if (copyDirective == null || "md5".equalsIgnoreCase(copyDirective) || "md5-sess".equalsIgnoreCase(copyDirective)) {
                    copyDirective = (String) this.directives.get("qop");
                    if (copyDirective != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(copyDirective, ",");
                        String str = null;
                        while (stringTokenizer.hasMoreTokens()) {
                            copyDirective = stringTokenizer.nextToken();
                            if ("auth".equalsIgnoreCase(str)) {
                                break;
                            }
                            if (Arrays.binarySearch(DigestUtilities.SUPPORTED_QOPS, copyDirective) < 0) {
                                copyDirective = str;
                            }
                            str = copyDirective;
                        }
                        if (str != null) {
                            hashMap2.put("qop", str);
                            byte[] bArr = new byte[8];
                            rnd.nextBytes(bArr);
                            try {
                                hashMap2.put("cnonce", new String(Base64.encodeBase64(bArr), this.proxyIoSession.getCharsetName()));
                            } catch (Throwable e) {
                                throw new ProxyAuthException("Unable to encode cnonce", e);
                            }
                        }
                        throw new ProxyAuthException("No supported qop option available");
                    }
                    hashMap2.put("nc", "00000001");
                    hashMap2.put("uri", httpProxyRequest.getHttpURI());
                    try {
                        hashMap2.put("response", DigestUtilities.computeResponseValue(this.proxyIoSession.getSession(), hashMap2, httpProxyRequest.getHttpVerb().toUpperCase(), (String) httpProxyRequest.getProperties().get(HttpProxyConstants.PWD_PROPERTY), this.proxyIoSession.getCharsetName(), this.response.getBody()));
                        StringBuilder stringBuilder = new StringBuilder("Digest ");
                        boolean z = false;
                        for (Entry entry : hashMap2.entrySet()) {
                            boolean z2;
                            String str2 = (String) entry.getKey();
                            if (z) {
                                stringBuilder.append(", ");
                            } else {
                                z = true;
                            }
                            if ("qop".equals(str2) || "nc".equals(str2)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            stringBuilder.append(str2);
                            if (z2) {
                                stringBuilder.append("=\"").append((String) entry.getValue()).append('\"');
                            } else {
                                stringBuilder.append('=').append((String) entry.getValue());
                            }
                        }
                        StringUtilities.addValueToHeader(headers, "Proxy-Authorization", stringBuilder.toString(), true);
                    } catch (Throwable e2) {
                        throw new ProxyAuthException("Digest response computing failed", e2);
                    }
                }
                throw new ProxyAuthException("Unknown algorithm required by server");
            }
            AbstractAuthLogicHandler.addKeepAliveHeaders(headers);
            httpProxyRequest.setHeaders(headers);
            writeRequest(nextFilter, httpProxyRequest);
            this.step++;
            return;
        }
        throw new ProxyAuthException("Authentication challenge not received");
    }

    public void handleResponse(HttpProxyResponse httpProxyResponse) {
        this.response = httpProxyResponse;
        if (this.step != 0) {
            throw new ProxyAuthException("Received unexpected response code (" + httpProxyResponse.getStatusLine() + ").");
        } else if (httpProxyResponse.getStatusCode() == 401 || httpProxyResponse.getStatusCode() == 407) {
            for (String str : (List) httpProxyResponse.getHeaders().get("Proxy-Authenticate")) {
                if (str.startsWith("Digest")) {
                    break;
                }
            }
            String str2 = null;
            if (str2 == null) {
                throw new ProxyAuthException("Server doesn't support digest authentication method !");
            }
            try {
                this.directives = StringUtilities.parseDirectives(str2.substring(7).getBytes(this.proxyIoSession.getCharsetName()));
                this.step = 1;
            } catch (Throwable e) {
                throw new ProxyAuthException("Parsing of server digest directives failed", e);
            }
        } else {
            throw new ProxyAuthException("Received unexpected response code (" + httpProxyResponse.getStatusLine() + ").");
        }
    }
}
