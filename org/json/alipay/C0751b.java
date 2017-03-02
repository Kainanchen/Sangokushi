package org.json.alipay;

import com.tencent.connect.common.Constants;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.wxop.stat.StatAccount;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: org.json.alipay.b */
public class C0751b {
    public static final Object f2377a;
    private Map f2378b;

    /* renamed from: org.json.alipay.b.a */
    private static final class C0750a {
        private C0750a() {
        }

        protected final Object clone() {
            return this;
        }

        public final boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public final String toString() {
            return "null";
        }
    }

    static {
        f2377a = new C0750a();
    }

    public C0751b() {
        this.f2378b = new HashMap();
    }

    public C0751b(String str) {
        this(new C0752c(str));
    }

    public C0751b(Map map) {
        if (map == null) {
            map = new HashMap();
        }
        this.f2378b = map;
    }

    public C0751b(C0752c c0752c) {
        this();
        if (c0752c.m2659c() != '{') {
            throw c0752c.m2656a("A JSONObject text must begin with '{'");
        }
        while (true) {
            switch (c0752c.m2659c()) {
                case StatAccount.DEFAULT_TYPE /*0*/:
                    throw c0752c.m2656a("A JSONObject text must end with '}'");
                case '}':
                    return;
                default:
                    c0752c.m2657a();
                    String obj = c0752c.m2660d().toString();
                    char c = c0752c.m2659c();
                    if (c == '=') {
                        if (c0752c.m2658b() != '>') {
                            c0752c.m2657a();
                        }
                    } else if (c != ':') {
                        throw c0752c.m2656a("Expected a ':' after a key");
                    }
                    Object d = c0752c.m2660d();
                    if (obj == null) {
                        throw new JSONException("Null key.");
                    }
                    if (d != null) {
                        C0751b.m2650b(d);
                        this.f2378b.put(obj, d);
                    } else {
                        this.f2378b.remove(obj);
                    }
                    switch (c0752c.m2659c()) {
                        case ',':
                        case ';':
                            if (c0752c.m2659c() != '}') {
                                c0752c.m2657a();
                            } else {
                                return;
                            }
                        case '}':
                            return;
                        default:
                            throw c0752c.m2656a("Expected a ',' or '}'");
                    }
            }
        }
    }

    static String m2649a(Object obj) {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (!(obj instanceof Number)) {
            return ((obj instanceof Boolean) || (obj instanceof C0751b) || (obj instanceof C0749a)) ? obj.toString() : obj instanceof Map ? new C0751b((Map) obj).toString() : obj instanceof Collection ? new C0749a((Collection) obj).toString() : obj.getClass().isArray() ? new C0749a(obj).toString() : C0751b.m2651c(obj.toString());
        } else {
            obj = (Number) obj;
            if (obj == null) {
                throw new JSONException("Null pointer");
            }
            C0751b.m2650b(obj);
            String obj2 = obj.toString();
            if (obj2.indexOf(46) <= 0 || obj2.indexOf(101) >= 0 || obj2.indexOf(69) >= 0) {
                return obj2;
            }
            while (obj2.endsWith(Constants.VIA_RESULT_SUCCESS)) {
                obj2 = obj2.substring(0, obj2.length() - 1);
            }
            return obj2.endsWith(".") ? obj2.substring(0, obj2.length() - 1) : obj2;
        }
    }

    private static void m2650b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Double) {
            if (((Double) obj).isInfinite() || ((Double) obj).isNaN()) {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        } else if (!(obj instanceof Float)) {
        } else {
            if (((Float) obj).isInfinite() || ((Float) obj).isNaN()) {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        }
    }

    public static String m2651c(String str) {
        int i = 0;
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append('\"');
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case IMediaObject.TYPE_EMOJI /*8*/:
                    stringBuffer.append("\\b");
                    break;
                case ConstantsAPI.COMMAND_ADD_CARD_TO_EX_CARD_PACKAGE /*9*/:
                    stringBuffer.append("\\t");
                    break;
                case IMediaObject.TYPE_PRODUCT /*10*/:
                    stringBuffer.append("\\n");
                    break;
                case IMediaObject.TYPE_DEVICE_ACCESS /*12*/:
                    stringBuffer.append("\\f");
                    break;
                case IMediaObject.TYPE_MALL_PRODUCT /*13*/:
                    stringBuffer.append("\\r");
                    break;
                case '\"':
                case '\\':
                    stringBuffer.append('\\');
                    stringBuffer.append(charAt);
                    break;
                case '/':
                    if (i2 == 60) {
                        stringBuffer.append('\\');
                    }
                    stringBuffer.append(charAt);
                    break;
                default:
                    if (charAt >= ' ' && ((charAt < '\u0080' || charAt >= '\u00a0') && (charAt < '\u2000' || charAt >= '\u2100'))) {
                        stringBuffer.append(charAt);
                        break;
                    }
                    String str2 = "000" + Integer.toHexString(charAt);
                    stringBuffer.append("\\u" + str2.substring(str2.length() - 4));
                    break;
                    break;
            }
            i++;
            char c = charAt;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    public final Object m2652a(String str) {
        Object obj = str == null ? null : this.f2378b.get(str);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONObject[" + C0751b.m2651c(str) + "] not found.");
    }

    public final Iterator m2653a() {
        return this.f2378b.keySet().iterator();
    }

    public final boolean m2654b(String str) {
        return this.f2378b.containsKey(str);
    }

    public String toString() {
        try {
            Iterator a = m2653a();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (a.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = a.next();
                stringBuffer.append(C0751b.m2651c(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(C0751b.m2649a(this.f2378b.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
