package org.apache.mina.proxy.utils;

import com.texaspoker.moment.TexasPokerMiniGame.SCMiniGameIniRsp;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.security.sasl.AuthenticationException;
import javax.security.sasl.SaslException;
import net.sqlcipher.IBulkCursor;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.cocos2dx.lib.BuildConfig;
import org.slf4j.spi.LocationAwareLogger;

public class StringUtilities {
    public static String getDirectiveValue(HashMap<String, String> hashMap, String str, boolean z) {
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        if (!z) {
            return BuildConfig.FLAVOR;
        }
        throw new AuthenticationException("\"" + str + "\" mandatory directive is missing");
    }

    public static String copyDirective(HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str) {
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            hashMap2.put(str, str2);
        }
        return str2;
    }

    public static HashMap<String, String> parseDirectives(byte[] bArr) {
        HashMap<String, String> hashMap = new HashMap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(10);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(10);
        int skipLws = skipLws(bArr, 0);
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (skipLws < bArr.length) {
            byte b = bArr[skipLws];
            if (i3 != 0) {
                if (b == (byte) 44) {
                    if (byteArrayOutputStream.size() != 0) {
                        throw new SaslException("Directive key contains a ',':" + byteArrayOutputStream);
                    }
                    skipLws = skipLws(bArr, skipLws + 1);
                } else if (b == 61) {
                    if (byteArrayOutputStream.size() == 0) {
                        throw new SaslException("Empty directive key");
                    }
                    skipLws = skipLws(bArr, skipLws + 1);
                    if (skipLws >= bArr.length) {
                        throw new SaslException("Valueless directive found: " + byteArrayOutputStream.toString());
                    } else if (bArr[skipLws] == (byte) 34) {
                        skipLws++;
                        i2 = 1;
                        i3 = 0;
                    } else {
                        i3 = 0;
                    }
                } else if (isLws(b)) {
                    skipLws = skipLws(bArr, skipLws + 1);
                    if (skipLws >= bArr.length) {
                        throw new SaslException("'=' expected after key: " + byteArrayOutputStream.toString());
                    } else if (bArr[skipLws] != 61) {
                        throw new SaslException("'=' expected after key: " + byteArrayOutputStream.toString());
                    }
                } else {
                    byteArrayOutputStream.write(b);
                    skipLws++;
                }
            } else if (i2 != 0) {
                if (b == 92) {
                    skipLws++;
                    if (skipLws < bArr.length) {
                        byteArrayOutputStream2.write(bArr[skipLws]);
                        skipLws++;
                    } else {
                        throw new SaslException("Unmatched quote found for directive: " + byteArrayOutputStream.toString() + " with value: " + byteArrayOutputStream2.toString());
                    }
                } else if (b == (byte) 34) {
                    skipLws++;
                    i = 1;
                    i2 = 0;
                } else {
                    byteArrayOutputStream2.write(b);
                    skipLws++;
                }
            } else if (isLws(b) || b == (byte) 44) {
                extractDirective(hashMap, byteArrayOutputStream.toString(), byteArrayOutputStream2.toString());
                byteArrayOutputStream.reset();
                byteArrayOutputStream2.reset();
                skipLws = skipLws(bArr, skipLws + 1);
                i = 0;
                i2 = 0;
                i3 = 1;
            } else if (i != 0) {
                throw new SaslException("Expecting comma or linear whitespace after quoted string: \"" + byteArrayOutputStream2.toString() + "\"");
            } else {
                byteArrayOutputStream2.write(b);
                skipLws++;
            }
        }
        if (i2 != 0) {
            throw new SaslException("Unmatched quote found for directive: " + byteArrayOutputStream.toString() + " with value: " + byteArrayOutputStream2.toString());
        }
        if (byteArrayOutputStream.size() > 0) {
            extractDirective(hashMap, byteArrayOutputStream.toString(), byteArrayOutputStream2.toString());
        }
        return hashMap;
    }

    private static void extractDirective(HashMap<String, String> hashMap, String str, String str2) {
        if (hashMap.get(str) != null) {
            throw new SaslException("Peer sent more than one " + str + " directive");
        }
        hashMap.put(str, str2);
    }

    public static boolean isLws(byte b) {
        switch (b) {
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
            case LocationAwareLogger.DEBUG_INT /*10*/:
            case SCMiniGameIniRsp.VCMD_CHECK_CARDS_FIELD_NUMBER /*13*/:
            case NTLMConstants.FLAG_NEGOTIATE_SEAL /*32*/:
                return true;
            default:
                return false;
        }
    }

    private static int skipLws(byte[] bArr, int i) {
        while (i < bArr.length && isLws(bArr[i])) {
            i++;
        }
        return i;
    }

    public static String stringTo8859_1(String str) {
        if (str == null) {
            return BuildConfig.FLAVOR;
        }
        return new String(str.getBytes("UTF8"), "8859_1");
    }

    public static String getSingleValuedHeader(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null) {
            return null;
        }
        if (list.size() <= 1) {
            return (String) list.get(0);
        }
        throw new IllegalArgumentException("Header with key [\"" + str + "\"] isn't single valued !");
    }

    public static void addValueToHeader(Map<String, List<String>> map, String str, String str2, boolean z) {
        List list = (List) map.get(str);
        if (list == null) {
            list = new ArrayList(1);
            map.put(str, list);
        }
        if (z && list.size() == 1) {
            list.set(0, str2);
        } else {
            list.add(str2);
        }
    }
}
