package org.apache.mina.proxy.handlers.http.digest;

import java.security.MessageDigest;
import java.util.HashMap;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.proxy.utils.ByteUtilities;
import org.apache.mina.proxy.utils.StringUtilities;

public class DigestUtilities {
    public static final String SESSION_HA1;
    public static final String[] SUPPORTED_QOPS;
    private static MessageDigest md5;

    static {
        SESSION_HA1 = DigestUtilities.class + ".SessionHA1";
        try {
            md5 = MessageDigest.getInstance("MD5");
            SUPPORTED_QOPS = new String[]{"auth", "auth-int"};
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static String computeResponseValue(IoSession ioSession, HashMap<String, String> hashMap, String str, String str2, String str3, String str4) {
        byte[] digest;
        Object digest2;
        byte[] bArr;
        boolean equalsIgnoreCase = "md5-sess".equalsIgnoreCase(StringUtilities.getDirectiveValue(hashMap, "algorithm", false));
        if (!equalsIgnoreCase || ioSession.getAttribute(SESSION_HA1) == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(StringUtilities.stringTo8859_1(StringUtilities.getDirectiveValue(hashMap, "username", true))).append(':');
            String stringTo8859_1 = StringUtilities.stringTo8859_1(StringUtilities.getDirectiveValue(hashMap, "realm", false));
            if (stringTo8859_1 != null) {
                stringBuilder.append(stringTo8859_1);
            }
            stringBuilder.append(':').append(str2);
            if (equalsIgnoreCase) {
                synchronized (md5) {
                    md5.reset();
                    digest = md5.digest(stringBuilder.toString().getBytes(str3));
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(ByteUtilities.asHex(digest));
                stringBuilder.append(':').append(StringUtilities.stringTo8859_1(StringUtilities.getDirectiveValue(hashMap, "nonce", true)));
                stringBuilder.append(':').append(StringUtilities.stringTo8859_1(StringUtilities.getDirectiveValue(hashMap, "cnonce", true)));
                synchronized (md5) {
                    md5.reset();
                    digest2 = md5.digest(stringBuilder.toString().getBytes(str3));
                }
                ioSession.setAttribute(SESSION_HA1, digest2);
                bArr = digest2;
            } else {
                synchronized (md5) {
                    md5.reset();
                    digest = md5.digest(stringBuilder.toString().getBytes(str3));
                }
                bArr = digest;
            }
        } else {
            bArr = (byte[]) ioSession.getAttribute(SESSION_HA1);
        }
        StringBuilder stringBuilder2 = new StringBuilder(str);
        stringBuilder2.append(':');
        stringBuilder2.append(StringUtilities.getDirectiveValue(hashMap, "uri", false));
        String directiveValue = StringUtilities.getDirectiveValue(hashMap, "qop", false);
        if ("auth-int".equalsIgnoreCase(directiveValue)) {
            ProxyIoSession proxyIoSession = (ProxyIoSession) ioSession.getAttribute(ProxyIoSession.PROXY_SESSION);
            synchronized (md5) {
                md5.reset();
                digest2 = md5.digest(str4.getBytes(proxyIoSession.getCharsetName()));
            }
            stringBuilder2.append(':').append(digest2);
        }
        synchronized (md5) {
            md5.reset();
            digest = md5.digest(stringBuilder2.toString().getBytes(str3));
        }
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(ByteUtilities.asHex(bArr));
        stringBuilder2.append(':').append(StringUtilities.getDirectiveValue(hashMap, "nonce", true));
        stringBuilder2.append(":00000001:");
        stringBuilder2.append(StringUtilities.getDirectiveValue(hashMap, "cnonce", true));
        stringBuilder2.append(':').append(directiveValue).append(':');
        stringBuilder2.append(ByteUtilities.asHex(digest));
        synchronized (md5) {
            md5.reset();
            digest = md5.digest(stringBuilder2.toString().getBytes(str3));
        }
        return ByteUtilities.asHex(digest);
    }
}
