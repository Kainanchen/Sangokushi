package com.amap.p003a;

import android.support.v4.media.TransportMediator;
import android.text.TextUtils;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.zip.CRC32;

/* compiled from: Req */
/* renamed from: com.amap.a.bm */
public final class bm {
    public String f403A;
    public String f404B;
    public String f405C;
    public String f406D;
    public String f407E;
    public String f408F;
    public byte[] f409G;
    public String f410a;
    public short f411b;
    public String f412c;
    public String f413d;
    public String f414e;
    public String f415f;
    public String f416g;
    public String f417h;
    public String f418i;
    public String f419j;
    public String f420k;
    public String f421l;
    public String f422m;
    public String f423n;
    public String f424o;
    public String f425p;
    public String f426q;
    public String f427r;
    public String f428s;
    public String f429t;
    public String f430u;
    public String f431v;
    public String f432w;
    public String f433x;
    public String f434y;
    public String f435z;

    public bm() {
        this.f410a = "1";
        this.f411b = (short) 0;
        this.f412c = null;
        this.f413d = null;
        this.f414e = null;
        this.f415f = null;
        this.f416g = null;
        this.f417h = null;
        this.f418i = null;
        this.f419j = null;
        this.f420k = null;
        this.f421l = null;
        this.f422m = null;
        this.f423n = null;
        this.f424o = null;
        this.f425p = null;
        this.f426q = null;
        this.f427r = null;
        this.f428s = null;
        this.f429t = null;
        this.f430u = null;
        this.f431v = null;
        this.f432w = null;
        this.f433x = null;
        this.f434y = null;
        this.f435z = null;
        this.f403A = null;
        this.f404B = null;
        this.f405C = null;
        this.f406D = null;
        this.f407E = null;
        this.f408F = null;
        this.f409G = null;
    }

    private String m381a(String str, int i) {
        String[] split = this.f404B.split("\\*")[i].split(",");
        return str.equals("lac") ? split[0] : str.equals("cellid") ? split[1] : str.equals("signal") ? split[2] : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m382a(java.lang.String r8) {
        /*
        r7 = this;
        r6 = 2;
        r2 = 0;
        r5 = 6;
        r0 = ":";
        r0 = r8.split(r0);
        r1 = new byte[r5];
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r3 = r0.length;	 Catch:{ Throwable -> 0x0042 }
        if (r3 == r5) goto L_0x001d;
    L_0x0010:
        r0 = 6;
        r0 = new java.lang.String[r0];	 Catch:{ Throwable -> 0x0042 }
        r3 = r2;
    L_0x0014:
        if (r3 >= r5) goto L_0x001d;
    L_0x0016:
        r4 = "0";
        r0[r3] = r4;	 Catch:{ Throwable -> 0x0042 }
        r3 = r3 + 1;
        goto L_0x0014;
    L_0x001d:
        r3 = r0.length;	 Catch:{ Throwable -> 0x0042 }
        if (r2 >= r3) goto L_0x0040;
    L_0x0020:
        r3 = r0[r2];	 Catch:{ Throwable -> 0x0042 }
        r3 = r3.length();	 Catch:{ Throwable -> 0x0042 }
        if (r3 <= r6) goto L_0x0032;
    L_0x0028:
        r3 = r0[r2];	 Catch:{ Throwable -> 0x0042 }
        r4 = 0;
        r5 = 2;
        r3 = r3.substring(r4, r5);	 Catch:{ Throwable -> 0x0042 }
        r0[r2] = r3;	 Catch:{ Throwable -> 0x0042 }
    L_0x0032:
        r3 = r0[r2];	 Catch:{ Throwable -> 0x0042 }
        r4 = 16;
        r3 = java.lang.Integer.parseInt(r3, r4);	 Catch:{ Throwable -> 0x0042 }
        r3 = (byte) r3;	 Catch:{ Throwable -> 0x0042 }
        r1[r2] = r3;	 Catch:{ Throwable -> 0x0042 }
        r2 = r2 + 1;
        goto L_0x001d;
    L_0x0040:
        r0 = r1;
    L_0x0041:
        return r0;
    L_0x0042:
        r0 = move-exception;
        r1 = "Req";
        r2 = new java.lang.StringBuilder;
        r3 = "getMacBa ";
        r2.<init>(r3);
        r2 = r2.append(r8);
        r2 = r2.toString();
        com.amap.p003a.bc.m330a(r0, r1, r2);
        r0 = "00:00:00:00:00:00";
        r0 = r7.m382a(r0);
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.bm.a(java.lang.String):byte[]");
    }

    private String m383b(String str) {
        if (!this.f403A.contains(str + ">")) {
            return "0";
        }
        int indexOf = this.f403A.indexOf(str + ">");
        return this.f403A.substring((indexOf + str.length()) + 1, this.f403A.indexOf("</" + str));
    }

    public final byte[] m384a() {
        Object bytes;
        Throwable th;
        Object d;
        int length;
        Object d2;
        int i;
        String[] split;
        String[] split2;
        CRC32 crc32;
        Object a;
        if (TextUtils.isEmpty(this.f410a)) {
            this.f410a = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f412c)) {
            this.f412c = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f413d)) {
            this.f413d = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f414e)) {
            this.f414e = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f415f)) {
            this.f415f = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f416g)) {
            this.f416g = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f417h)) {
            this.f417h = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f418i)) {
            this.f418i = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f419j)) {
            this.f419j = "0";
        } else if (!(this.f419j.equals("1") || this.f419j.equals("2"))) {
            this.f419j = "0";
        }
        if (TextUtils.isEmpty(this.f420k)) {
            this.f420k = "0";
        } else if (!(this.f420k.equals("0") || this.f420k.equals("1"))) {
            this.f420k = "0";
        }
        if (TextUtils.isEmpty(this.f421l)) {
            this.f421l = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f422m)) {
            this.f422m = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f423n)) {
            this.f423n = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f424o)) {
            this.f424o = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f425p)) {
            this.f425p = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f426q)) {
            this.f426q = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f427r)) {
            this.f427r = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f428s)) {
            this.f428s = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f429t)) {
            this.f429t = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f430u)) {
            this.f430u = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f431v)) {
            this.f431v = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f432w)) {
            this.f432w = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f433x)) {
            this.f433x = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f434y)) {
            this.f434y = "0";
        } else if (!(this.f434y.equals("1") || this.f434y.equals("2"))) {
            this.f434y = "0";
        }
        if (TextUtils.isEmpty(this.f435z)) {
            this.f435z = "0";
        } else if (!(this.f435z.equals("1") || this.f435z.equals("2"))) {
            this.f435z = "0";
        }
        if (TextUtils.isEmpty(this.f403A)) {
            this.f403A = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f404B)) {
            this.f404B = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f405C)) {
            this.f405C = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f406D)) {
            this.f406D = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f407E)) {
            this.f407E = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (TextUtils.isEmpty(this.f408F)) {
            this.f408F = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (this.f409G == null) {
            this.f409G = new byte[0];
        }
        int i2 = 3072;
        if (this.f409G != null) {
            i2 = (this.f409G.length + 1) + 3072;
        }
        Object obj = new byte[i2];
        obj[0] = Byte.parseByte(this.f410a);
        System.arraycopy(bu.m484b(this.f411b), 0, obj, 1, 2);
        int i3 = 3;
        try {
            bytes = this.f412c.getBytes("GBK");
            obj[3] = (byte) bytes.length;
            try {
                System.arraycopy(bytes, 0, obj, 4, bytes.length);
                i3 = bytes.length + 4;
            } catch (Throwable th2) {
                th = th2;
                i3 = 4;
                bc.m330a(th, "Req", "buildV4Dot2");
                obj[i3] = null;
                i3++;
                bytes = this.f413d.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = this.f424o.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = this.f414e.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = this.f415f.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = this.f416g.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = this.f430u.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = this.f417h.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = this.f425p.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = this.f426q.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                if (TextUtils.isEmpty(this.f429t)) {
                    obj[i3] = (byte) 0;
                    i3++;
                } else {
                    bytes = m382a(this.f429t);
                    obj[i3] = (byte) bytes.length;
                    i3++;
                    System.arraycopy(bytes, 0, obj, i3, bytes.length);
                    i3 += bytes.length;
                }
                bytes = this.f431v.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = this.f432w.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = this.f433x.getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i2 = bytes.length + i3;
                obj[i2] = Byte.parseByte(this.f434y);
                i2++;
                obj[i2] = Byte.parseByte(this.f419j);
                i2++;
                obj[i2] = Byte.parseByte(this.f435z);
                i2++;
                if (!this.f435z.equals("1")) {
                    d = bu.m493d(m383b("mcc"));
                    System.arraycopy(d, 0, obj, i2, d.length);
                    i2 += d.length;
                    d = bu.m493d(m383b("mnc"));
                    System.arraycopy(d, 0, obj, i2, d.length);
                    i2 += d.length;
                    d = bu.m493d(m383b("lac"));
                    System.arraycopy(d, 0, obj, i2, d.length);
                    i2 += d.length;
                    System.arraycopy(bu.m496e(m383b("cellid")), 0, obj, i2, 4);
                    i3 = i2 + 4;
                    i2 = Integer.parseInt(m383b("signal"));
                    if (i2 > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                        i2 = 0;
                    }
                    obj[i3] = (byte) i2;
                    i2 = i3 + 1;
                    if (this.f404B.length() == 0) {
                        obj[i2] = null;
                        i2++;
                    } else {
                        length = this.f404B.split("\\*").length;
                        obj[i2] = (byte) length;
                        i2++;
                        i3 = 0;
                        while (i3 < length) {
                            d2 = bu.m493d(m381a("lac", i3));
                            System.arraycopy(d2, 0, obj, i2, d2.length);
                            i2 += d2.length;
                            System.arraycopy(bu.m496e(m381a("cellid", i3)), 0, obj, i2, 4);
                            i = i2 + 4;
                            i2 = Integer.parseInt(m381a("signal", i3));
                            if (i2 <= TransportMediator.KEYCODE_MEDIA_PAUSE) {
                                i2 = 0;
                            }
                            obj[i] = (byte) i2;
                            i3++;
                            i2 = i + 1;
                        }
                    }
                } else if (this.f435z.equals("2")) {
                    d = bu.m493d(m383b("mcc"));
                    System.arraycopy(d, 0, obj, i2, d.length);
                    i2 += d.length;
                    d = bu.m493d(m383b("sid"));
                    System.arraycopy(d, 0, obj, i2, d.length);
                    i2 += d.length;
                    d = bu.m493d(m383b("nid"));
                    System.arraycopy(d, 0, obj, i2, d.length);
                    i2 += d.length;
                    d = bu.m493d(m383b("bid"));
                    System.arraycopy(d, 0, obj, i2, d.length);
                    i2 += d.length;
                    System.arraycopy(bu.m496e(m383b("lon")), 0, obj, i2, 4);
                    i2 += 4;
                    System.arraycopy(bu.m496e(m383b("lat")), 0, obj, i2, 4);
                    i3 = i2 + 4;
                    i2 = Integer.parseInt(m383b("signal"));
                    if (i2 > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                        i2 = 0;
                    }
                    obj[i3] = (byte) i2;
                    i2 = i3 + 1;
                    obj[i2] = null;
                    i2++;
                }
                if (this.f405C.length() == 0) {
                    obj[i2] = null;
                    i2++;
                } else {
                    obj[i2] = 1;
                    i3 = i2 + 1;
                    try {
                        split = this.f405C.split(",");
                        bytes = m382a(split[0]);
                        System.arraycopy(bytes, 0, obj, i3, bytes.length);
                        i3 += bytes.length;
                        bytes = split[2].getBytes("GBK");
                        obj[i3] = (byte) bytes.length;
                        i3++;
                        System.arraycopy(bytes, 0, obj, i3, bytes.length);
                        i3 += bytes.length;
                    } catch (Throwable th3) {
                        bc.m330a(th3, "Req", "buildV4Dot216");
                        bytes = m382a("00:00:00:00:00:00");
                        System.arraycopy(bytes, 0, obj, i3, bytes.length);
                        i2 = bytes.length + i3;
                        obj[i2] = null;
                        i2++;
                        obj[i2] = Byte.parseByte("0");
                        i2++;
                    }
                    i2 = Integer.parseInt(split[1]);
                    if (i2 > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                        i2 = 0;
                    }
                    obj[i3] = Byte.parseByte(String.valueOf(i2));
                    i2 = i3 + 1;
                }
                split2 = this.f406D.split("\\*");
                if (!TextUtils.isEmpty(this.f406D)) {
                }
                obj[i2] = null;
                i3 = i2 + 1;
                bytes = this.f408F.getBytes("GBK");
                if (bytes.length > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                    bytes = null;
                }
                if (bytes == null) {
                    obj[i3] = (byte) 0;
                    i2 = i3 + 1;
                } else {
                    obj[i3] = (byte) bytes.length;
                    i3++;
                    System.arraycopy(bytes, 0, obj, i3, bytes.length);
                    i2 = bytes.length + i3;
                }
                i3 = this.f409G != null ? this.f409G.length : 0;
                System.arraycopy(bu.m484b(i3), 0, obj, i2, 2);
                i2 += 2;
                if (i3 > 0) {
                    System.arraycopy(this.f409G, 0, obj, i2, this.f409G.length);
                    i2 += this.f409G.length;
                }
                d = new byte[i2];
                System.arraycopy(obj, 0, d, 0, i2);
                crc32 = new CRC32();
                crc32.update(d);
                a = bu.m474a(crc32.getValue());
                d2 = new byte[(i2 + 8)];
                System.arraycopy(d, 0, d2, 0, i2);
                System.arraycopy(a, 0, d2, i2, 8);
                return d2;
            }
        } catch (Throwable th4) {
            th3 = th4;
            bc.m330a(th3, "Req", "buildV4Dot2");
            obj[i3] = null;
            i3++;
            bytes = this.f413d.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = this.f424o.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = this.f414e.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = this.f415f.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = this.f416g.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = this.f430u.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = this.f417h.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = this.f425p.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = this.f426q.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            if (TextUtils.isEmpty(this.f429t)) {
                bytes = m382a(this.f429t);
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
            } else {
                obj[i3] = (byte) 0;
                i3++;
            }
            bytes = this.f431v.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = this.f432w.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = this.f433x.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i2 = bytes.length + i3;
            obj[i2] = Byte.parseByte(this.f434y);
            i2++;
            obj[i2] = Byte.parseByte(this.f419j);
            i2++;
            obj[i2] = Byte.parseByte(this.f435z);
            i2++;
            if (!this.f435z.equals("1")) {
                d = bu.m493d(m383b("mcc"));
                System.arraycopy(d, 0, obj, i2, d.length);
                i2 += d.length;
                d = bu.m493d(m383b("mnc"));
                System.arraycopy(d, 0, obj, i2, d.length);
                i2 += d.length;
                d = bu.m493d(m383b("lac"));
                System.arraycopy(d, 0, obj, i2, d.length);
                i2 += d.length;
                System.arraycopy(bu.m496e(m383b("cellid")), 0, obj, i2, 4);
                i3 = i2 + 4;
                i2 = Integer.parseInt(m383b("signal"));
                if (i2 > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                    i2 = 0;
                }
                obj[i3] = (byte) i2;
                i2 = i3 + 1;
                if (this.f404B.length() == 0) {
                    length = this.f404B.split("\\*").length;
                    obj[i2] = (byte) length;
                    i2++;
                    i3 = 0;
                    while (i3 < length) {
                        d2 = bu.m493d(m381a("lac", i3));
                        System.arraycopy(d2, 0, obj, i2, d2.length);
                        i2 += d2.length;
                        System.arraycopy(bu.m496e(m381a("cellid", i3)), 0, obj, i2, 4);
                        i = i2 + 4;
                        i2 = Integer.parseInt(m381a("signal", i3));
                        if (i2 <= TransportMediator.KEYCODE_MEDIA_PAUSE) {
                            i2 = 0;
                        }
                        obj[i] = (byte) i2;
                        i3++;
                        i2 = i + 1;
                    }
                } else {
                    obj[i2] = null;
                    i2++;
                }
            } else if (this.f435z.equals("2")) {
                d = bu.m493d(m383b("mcc"));
                System.arraycopy(d, 0, obj, i2, d.length);
                i2 += d.length;
                d = bu.m493d(m383b("sid"));
                System.arraycopy(d, 0, obj, i2, d.length);
                i2 += d.length;
                d = bu.m493d(m383b("nid"));
                System.arraycopy(d, 0, obj, i2, d.length);
                i2 += d.length;
                d = bu.m493d(m383b("bid"));
                System.arraycopy(d, 0, obj, i2, d.length);
                i2 += d.length;
                System.arraycopy(bu.m496e(m383b("lon")), 0, obj, i2, 4);
                i2 += 4;
                System.arraycopy(bu.m496e(m383b("lat")), 0, obj, i2, 4);
                i3 = i2 + 4;
                i2 = Integer.parseInt(m383b("signal"));
                if (i2 > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                    i2 = 0;
                }
                obj[i3] = (byte) i2;
                i2 = i3 + 1;
                obj[i2] = null;
                i2++;
            }
            if (this.f405C.length() == 0) {
                obj[i2] = 1;
                i3 = i2 + 1;
                split = this.f405C.split(",");
                bytes = m382a(split[0]);
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                bytes = split[2].getBytes("GBK");
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
                i2 = Integer.parseInt(split[1]);
                if (i2 > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                    i2 = 0;
                }
                obj[i3] = Byte.parseByte(String.valueOf(i2));
                i2 = i3 + 1;
            } else {
                obj[i2] = null;
                i2++;
            }
            split2 = this.f406D.split("\\*");
            if (TextUtils.isEmpty(this.f406D)) {
            }
            obj[i2] = null;
            i3 = i2 + 1;
            bytes = this.f408F.getBytes("GBK");
            if (bytes.length > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                bytes = null;
            }
            if (bytes == null) {
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i2 = bytes.length + i3;
            } else {
                obj[i3] = (byte) 0;
                i2 = i3 + 1;
            }
            if (this.f409G != null) {
            }
            System.arraycopy(bu.m484b(i3), 0, obj, i2, 2);
            i2 += 2;
            if (i3 > 0) {
                System.arraycopy(this.f409G, 0, obj, i2, this.f409G.length);
                i2 += this.f409G.length;
            }
            d = new byte[i2];
            System.arraycopy(obj, 0, d, 0, i2);
            crc32 = new CRC32();
            crc32.update(d);
            a = bu.m474a(crc32.getValue());
            d2 = new byte[(i2 + 8)];
            System.arraycopy(d, 0, d2, 0, i2);
            System.arraycopy(a, 0, d2, i2, 8);
            return d2;
        }
        try {
            bytes = this.f413d.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th32) {
            bc.m330a(th32, "Req", "buildV4Dot21");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f424o.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th322) {
            bc.m330a(th322, "Req", "buildV4Dot22");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f414e.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th3222) {
            bc.m330a(th3222, "Req", "buildV4Dot23");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f415f.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th32222) {
            bc.m330a(th32222, "Req", "buildV4Dot24");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f416g.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th322222) {
            bc.m330a(th322222, "Req", "buildV4Dot25");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f430u.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th3222222) {
            bc.m330a(th3222222, "Req", "buildV4Dot26");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f417h.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th32222222) {
            bc.m330a(th32222222, "Req", "buildV4Dot27");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f425p.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th322222222) {
            bc.m330a(th322222222, "Req", "buildV4Dot28");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f426q.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th3222222222) {
            bc.m330a(th3222222222, "Req", "buildV4Dot29");
            obj[i3] = null;
            i3++;
        }
        try {
            if (TextUtils.isEmpty(this.f429t)) {
                obj[i3] = (byte) 0;
                i3++;
            } else {
                bytes = m382a(this.f429t);
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i3 += bytes.length;
            }
        } catch (Throwable th32222222222) {
            bc.m330a(th32222222222, "Req", "buildV4Dot219");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f431v.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th322222222222) {
            bc.m330a(th322222222222, "Req", "buildV4Dot211");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f432w.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
        } catch (Throwable th3222222222222) {
            bc.m330a(th3222222222222, "Req", "buildV4Dot212");
            obj[i3] = null;
            i3++;
        }
        try {
            bytes = this.f433x.getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i2 = bytes.length + i3;
        } catch (Throwable th32222222222222) {
            bc.m330a(th32222222222222, "Req", "buildV4Dot213");
            obj[i3] = null;
            i2 = i3 + 1;
        }
        obj[i2] = Byte.parseByte(this.f434y);
        i2++;
        obj[i2] = Byte.parseByte(this.f419j);
        i2++;
        obj[i2] = Byte.parseByte(this.f435z);
        i2++;
        if (!this.f435z.equals("1")) {
            d = bu.m493d(m383b("mcc"));
            System.arraycopy(d, 0, obj, i2, d.length);
            i2 += d.length;
            d = bu.m493d(m383b("mnc"));
            System.arraycopy(d, 0, obj, i2, d.length);
            i2 += d.length;
            d = bu.m493d(m383b("lac"));
            System.arraycopy(d, 0, obj, i2, d.length);
            i2 += d.length;
            System.arraycopy(bu.m496e(m383b("cellid")), 0, obj, i2, 4);
            i3 = i2 + 4;
            i2 = Integer.parseInt(m383b("signal"));
            if (i2 > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                i2 = 0;
            }
            obj[i3] = (byte) i2;
            i2 = i3 + 1;
            if (this.f404B.length() == 0) {
                obj[i2] = null;
                i2++;
            } else {
                length = this.f404B.split("\\*").length;
                obj[i2] = (byte) length;
                i2++;
                i3 = 0;
                while (i3 < length) {
                    d2 = bu.m493d(m381a("lac", i3));
                    System.arraycopy(d2, 0, obj, i2, d2.length);
                    i2 += d2.length;
                    System.arraycopy(bu.m496e(m381a("cellid", i3)), 0, obj, i2, 4);
                    i = i2 + 4;
                    i2 = Integer.parseInt(m381a("signal", i3));
                    if (i2 <= TransportMediator.KEYCODE_MEDIA_PAUSE) {
                        i2 = 0;
                    }
                    obj[i] = (byte) i2;
                    i3++;
                    i2 = i + 1;
                }
            }
        } else if (this.f435z.equals("2")) {
            d = bu.m493d(m383b("mcc"));
            System.arraycopy(d, 0, obj, i2, d.length);
            i2 += d.length;
            d = bu.m493d(m383b("sid"));
            System.arraycopy(d, 0, obj, i2, d.length);
            i2 += d.length;
            d = bu.m493d(m383b("nid"));
            System.arraycopy(d, 0, obj, i2, d.length);
            i2 += d.length;
            d = bu.m493d(m383b("bid"));
            System.arraycopy(d, 0, obj, i2, d.length);
            i2 += d.length;
            System.arraycopy(bu.m496e(m383b("lon")), 0, obj, i2, 4);
            i2 += 4;
            System.arraycopy(bu.m496e(m383b("lat")), 0, obj, i2, 4);
            i3 = i2 + 4;
            i2 = Integer.parseInt(m383b("signal"));
            if (i2 > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                i2 = 0;
            }
            obj[i3] = (byte) i2;
            i2 = i3 + 1;
            obj[i2] = null;
            i2++;
        }
        if (this.f405C.length() == 0) {
            obj[i2] = null;
            i2++;
        } else {
            obj[i2] = 1;
            i3 = i2 + 1;
            split = this.f405C.split(",");
            bytes = m382a(split[0]);
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            bytes = split[2].getBytes("GBK");
            obj[i3] = (byte) bytes.length;
            i3++;
            System.arraycopy(bytes, 0, obj, i3, bytes.length);
            i3 += bytes.length;
            i2 = Integer.parseInt(split[1]);
            if (i2 > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                i2 = 0;
            }
            obj[i3] = Byte.parseByte(String.valueOf(i2));
            i2 = i3 + 1;
        }
        split2 = this.f406D.split("\\*");
        if (TextUtils.isEmpty(this.f406D) || split2.length == 0) {
            obj[i2] = null;
            i3 = i2 + 1;
        } else {
            obj[i2] = (byte) split2.length;
            i3 = i2 + 1;
            for (String split3 : split2) {
                String[] split4 = split3.split(",");
                try {
                    a = m382a(split4[0]);
                } catch (Throwable th5) {
                    bc.m330a(th5, "Req", "buildV4Dot2110");
                    a = m382a("00:00:00:00:00:00");
                }
                System.arraycopy(a, 0, obj, i3, a.length);
                int length2 = a.length + i3;
                try {
                    d = split4[2].getBytes("GBK");
                    obj[length2] = (byte) d.length;
                    length2++;
                    System.arraycopy(d, 0, obj, length2, d.length);
                    i3 = d.length + length2;
                } catch (Throwable th6) {
                    bc.m330a(th6, "Req", "buildV4Dot217");
                    obj[length2] = null;
                    i3 = length2 + 1;
                }
                length2 = Integer.parseInt(split4[1]);
                if (length2 > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                    length2 = 0;
                }
                obj[i3] = Byte.parseByte(String.valueOf(length2));
                i3++;
            }
            System.arraycopy(bu.m484b(Integer.parseInt(this.f407E)), 0, obj, i3, 2);
            i3 += 2;
        }
        try {
            bytes = this.f408F.getBytes("GBK");
            if (bytes.length > TransportMediator.KEYCODE_MEDIA_PAUSE) {
                bytes = null;
            }
            if (bytes == null) {
                obj[i3] = (byte) 0;
                i2 = i3 + 1;
            } else {
                obj[i3] = (byte) bytes.length;
                i3++;
                System.arraycopy(bytes, 0, obj, i3, bytes.length);
                i2 = bytes.length + i3;
            }
        } catch (Throwable th322222222222222) {
            bc.m330a(th322222222222222, "Req", "buildV4Dot218");
            obj[i3] = null;
            i2 = i3 + 1;
        }
        if (this.f409G != null) {
        }
        System.arraycopy(bu.m484b(i3), 0, obj, i2, 2);
        i2 += 2;
        if (i3 > 0) {
            System.arraycopy(this.f409G, 0, obj, i2, this.f409G.length);
            i2 += this.f409G.length;
        }
        d = new byte[i2];
        System.arraycopy(obj, 0, d, 0, i2);
        crc32 = new CRC32();
        crc32.update(d);
        a = bu.m474a(crc32.getValue());
        d2 = new byte[(i2 + 8)];
        System.arraycopy(d, 0, d2, 0, i2);
        System.arraycopy(a, 0, d2, i2, 8);
        return d2;
    }
}
