package org.json.alipay;

import com.p054p.ImageActivity;
import com.tencent.connect.common.Constants;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.wxop.stat.StatAccount;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;

/* renamed from: org.json.alipay.c */
public final class C0752c {
    private int f2379a;
    private Reader f2380b;
    private char f2381c;
    private boolean f2382d;

    private C0752c(Reader reader) {
        if (!reader.markSupported()) {
            reader = new BufferedReader(reader);
        }
        this.f2380b = reader;
        this.f2382d = false;
        this.f2379a = 0;
    }

    public C0752c(String str) {
        this(new StringReader(str));
    }

    private String m2655a(int i) {
        int i2 = 0;
        if (i == 0) {
            return Constants.STR_EMPTY;
        }
        char[] cArr = new char[i];
        if (this.f2382d) {
            this.f2382d = false;
            cArr[0] = this.f2381c;
            i2 = 1;
        }
        while (i2 < i) {
            try {
                int read = this.f2380b.read(cArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            } catch (Throwable e) {
                throw new JSONException(e);
            }
        }
        this.f2379a += i2;
        if (i2 < i) {
            throw m2656a("Substring bounds error");
        }
        this.f2381c = cArr[i - 1];
        return new String(cArr);
    }

    public final JSONException m2656a(String str) {
        return new JSONException(str + toString());
    }

    public final void m2657a() {
        if (this.f2382d || this.f2379a <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.f2379a--;
        this.f2382d = true;
    }

    public final char m2658b() {
        if (this.f2382d) {
            this.f2382d = false;
            if (this.f2381c != '\u0000') {
                this.f2379a++;
            }
            return this.f2381c;
        }
        try {
            int read = this.f2380b.read();
            if (read <= 0) {
                this.f2381c = '\u0000';
                return '\u0000';
            }
            this.f2379a++;
            this.f2381c = (char) read;
            return this.f2381c;
        } catch (Throwable e) {
            throw new JSONException(e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final char m2659c() {
        /*
        r5 = this;
        r4 = 13;
        r3 = 10;
        r0 = 47;
    L_0x0006:
        r1 = r5.m2658b();
        if (r1 != r0) goto L_0x003c;
    L_0x000c:
        r1 = r5.m2658b();
        switch(r1) {
            case 42: goto L_0x002f;
            case 47: goto L_0x0017;
            default: goto L_0x0013;
        };
    L_0x0013:
        r5.m2657a();
    L_0x0016:
        return r0;
    L_0x0017:
        r1 = r5.m2658b();
        if (r1 == r3) goto L_0x0006;
    L_0x001d:
        if (r1 == r4) goto L_0x0006;
    L_0x001f:
        if (r1 != 0) goto L_0x0017;
    L_0x0021:
        goto L_0x0006;
    L_0x0022:
        r2 = 42;
        if (r1 != r2) goto L_0x002f;
    L_0x0026:
        r1 = r5.m2658b();
        if (r1 == r0) goto L_0x0006;
    L_0x002c:
        r5.m2657a();
    L_0x002f:
        r1 = r5.m2658b();
        if (r1 != 0) goto L_0x0022;
    L_0x0035:
        r0 = "Unclosed comment";
        r0 = r5.m2656a(r0);
        throw r0;
    L_0x003c:
        r2 = 35;
        if (r1 != r2) goto L_0x004b;
    L_0x0040:
        r1 = r5.m2658b();
        if (r1 == r3) goto L_0x0006;
    L_0x0046:
        if (r1 == r4) goto L_0x0006;
    L_0x0048:
        if (r1 != 0) goto L_0x0040;
    L_0x004a:
        goto L_0x0006;
    L_0x004b:
        if (r1 == 0) goto L_0x0051;
    L_0x004d:
        r2 = 32;
        if (r1 <= r2) goto L_0x0006;
    L_0x0051:
        r0 = r1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.c.c():char");
    }

    public final Object m2660d() {
        char c = m2659c();
        switch (c) {
            case '\"':
            case '\'':
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    char b = m2658b();
                    switch (b) {
                        case StatAccount.DEFAULT_TYPE /*0*/:
                        case IMediaObject.TYPE_PRODUCT /*10*/:
                        case IMediaObject.TYPE_MALL_PRODUCT /*13*/:
                            throw m2656a("Unterminated string");
                        case '\\':
                            b = m2658b();
                            switch (b) {
                                case 'b':
                                    stringBuffer.append('\b');
                                    break;
                                case 'f':
                                    stringBuffer.append('\f');
                                    break;
                                case 'n':
                                    stringBuffer.append('\n');
                                    break;
                                case 'r':
                                    stringBuffer.append('\r');
                                    break;
                                case 't':
                                    stringBuffer.append('\t');
                                    break;
                                case 'u':
                                    stringBuffer.append((char) Integer.parseInt(m2655a(4), 16));
                                    break;
                                case 'x':
                                    stringBuffer.append((char) Integer.parseInt(m2655a(2), 16));
                                    break;
                                default:
                                    stringBuffer.append(b);
                                    break;
                            }
                        default:
                            if (b != c) {
                                stringBuffer.append(b);
                                break;
                            }
                            return stringBuffer.toString();
                    }
                }
            case ImageActivity.SET_ALBUM_PICTURE_KITKAT /*40*/:
            case '[':
                m2657a();
                return new C0749a(this);
            case '{':
                m2657a();
                return new C0751b(this);
            default:
                StringBuffer stringBuffer2 = new StringBuffer();
                char c2 = c;
                while (c2 >= ' ' && ",:]}/\\\"[{;=#".indexOf(c2) < 0) {
                    stringBuffer2.append(c2);
                    c2 = m2658b();
                }
                m2657a();
                String trim = stringBuffer2.toString().trim();
                if (trim.equals(Constants.STR_EMPTY)) {
                    throw m2656a("Missing value");
                } else if (trim.equalsIgnoreCase("true")) {
                    return Boolean.TRUE;
                } else {
                    if (trim.equalsIgnoreCase("false")) {
                        return Boolean.FALSE;
                    }
                    if (trim.equalsIgnoreCase("null")) {
                        return C0751b.f2377a;
                    }
                    if ((c < '0' || c > '9') && c != '.' && c != '-' && c != '+') {
                        return trim;
                    }
                    if (c == '0') {
                        if (trim.length() <= 2 || !(trim.charAt(1) == 'x' || trim.charAt(1) == 'X')) {
                            try {
                                return new Integer(Integer.parseInt(trim, 8));
                            } catch (Exception e) {
                            }
                        } else {
                            try {
                                return new Integer(Integer.parseInt(trim.substring(2), 16));
                            } catch (Exception e2) {
                            }
                        }
                    }
                    try {
                        return new Integer(trim);
                    } catch (Exception e3) {
                        try {
                            return new Long(trim);
                        } catch (Exception e4) {
                            try {
                                return new Double(trim);
                            } catch (Exception e5) {
                                return trim;
                            }
                        }
                    }
                }
        }
    }

    public final String toString() {
        return " at character " + this.f2379a;
    }
}
