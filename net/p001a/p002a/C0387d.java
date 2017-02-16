package net.p001a.p002a;

import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import net.p001a.p002a.C0383a.C0377a;
import net.p001a.p002a.p003a.C0379a;
import net.p001a.p002a.p003a.C0380b;
import net.p001a.p002a.p003a.C0381c;
import net.p001a.p002a.p003a.C0382d;
import net.p001a.p002a.p003a.p004a.C0378a;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: net.a.a.d */
public final class C0387d {
    public static String[] m358a(char c, C0380b c0380b) {
        String[] a = C0387d.m357a(c);
        if (a == null) {
            return null;
        }
        for (int i = 0; i < a.length; i++) {
            String str = a[i];
            if (C0381c.f356c == c0380b.f353c && (C0382d.f359b == c0380b.f351a || C0382d.f358a == c0380b.f351a)) {
                throw new C0378a("tone marks cannot be added to v or u:");
            }
            if (C0381c.f355b == c0380b.f353c) {
                str = str.replaceAll("[1-5]", BuildConfig.FLAVOR);
            } else if (C0381c.f356c == c0380b.f353c) {
                str = str.replaceAll("u:", "v").toLowerCase();
                if (str.matches("[a-z]*[1-5]?")) {
                    if (str.matches("[a-z]*[1-5]")) {
                        char charAt;
                        int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
                        int indexOf = str.indexOf(97);
                        int indexOf2 = str.indexOf(TEXAS_CMD.Cmd_CSSetClubFund_VALUE);
                        int indexOf3 = str.indexOf("ou");
                        if (-1 != indexOf) {
                            indexOf2 = 97;
                        } else if (-1 != indexOf2) {
                            indexOf = indexOf2;
                            indexOf2 = TEXAS_CMD.Cmd_CSSetClubFund_VALUE;
                        } else if (-1 != indexOf3) {
                            charAt = "ou".charAt(0);
                            indexOf = indexOf3;
                        } else {
                            indexOf = str.length() - 1;
                            while (indexOf >= 0) {
                                if (String.valueOf(str.charAt(indexOf)).matches("[aeiouv]")) {
                                    indexOf2 = str.charAt(indexOf);
                                    break;
                                }
                                indexOf--;
                            }
                            indexOf = -1;
                            indexOf2 = 36;
                        }
                        if (!(36 == indexOf2 || -1 == indexOf)) {
                            charAt = "\u0101\u00e1\u0103\u00e0a\u0113\u00e9\u0115\u00e8e\u012b\u00ed\u012d\u00eci\u014d\u00f3\u014f\u00f2o\u016b\u00fa\u016d\u00f9u\u01d6\u01d8\u01da\u01dc\u00fc".charAt(("aeiouv".indexOf(indexOf2) * 5) + (numericValue - 1));
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append(str.substring(0, indexOf).replaceAll("v", "\u00fc"));
                            stringBuffer.append(charAt);
                            stringBuffer.append(str.substring(indexOf + 1, str.length() - 1).replaceAll("v", "\u00fc"));
                            str = stringBuffer.toString();
                        }
                    } else {
                        str = str.replaceAll("v", "\u00fc");
                    }
                }
            }
            if (C0382d.f359b == c0380b.f351a) {
                str = str.replaceAll("u:", "v");
            } else if (C0382d.f360c == c0380b.f351a) {
                str = str.replaceAll("u:", "\u00fc");
            }
            if (C0379a.f348a == c0380b.f352b) {
                str = str.toUpperCase();
            }
            a[i] = str;
        }
        return a;
    }

    public static String[] m359a(char c, C0391g c0391g) {
        String[] a = C0387d.m357a(c);
        if (a == null) {
            return null;
        }
        String[] strArr = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            strArr[i] = C0390f.m360a(a[i], C0391g.f368a, c0391g);
        }
        return strArr;
    }

    public static String[] m357a(char c) {
        Object obj;
        C0383a c0383a = C0377a.f347a;
        String property = c0383a.f362a.getProperty(Integer.toHexString(c).toUpperCase());
        if (property == null || property.equals("(none0)") || !property.startsWith("(") || !property.endsWith(")")) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null) {
            property = null;
        }
        if (property == null) {
            return null;
        }
        return property.substring(property.indexOf("(") + 1, property.lastIndexOf(")")).split(",");
    }
}
