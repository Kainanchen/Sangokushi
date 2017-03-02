package com.android.volley.toolbox;

import com.alipay.sdk.util.C0201h;
import java.util.Map;
import org.apache.http.entity.mime.MIME;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class HttpHeaderParser {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.android.volley.Cache.Entry parseCacheHeaders(com.android.volley.NetworkResponse r22) {
        /*
        r10 = java.lang.System.currentTimeMillis();
        r0 = r22;
        r5 = r0.headers;
        r12 = 0;
        r14 = 0;
        r16 = 0;
        r8 = 0;
        r3 = 0;
        r7 = 0;
        r20 = "Date";
        r0 = r20;
        r4 = r5.get(r0);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x0022;
    L_0x001e:
        r12 = parseDateAsEpoch(r4);
    L_0x0022:
        r20 = "Cache-Control";
        r0 = r20;
        r4 = r5.get(r0);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x0041;
    L_0x002e:
        r3 = 1;
        r20 = ",";
        r0 = r20;
        r19 = r4.split(r0);
        r6 = 0;
    L_0x0038:
        r0 = r19;
        r0 = r0.length;
        r20 = r0;
        r0 = r20;
        if (r6 < r0) goto L_0x0085;
    L_0x0041:
        r20 = "Expires";
        r0 = r20;
        r4 = r5.get(r0);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x0051;
    L_0x004d:
        r14 = parseDateAsEpoch(r4);
    L_0x0051:
        r20 = "ETag";
        r0 = r20;
        r7 = r5.get(r0);
        r7 = (java.lang.String) r7;
        if (r3 == 0) goto L_0x00de;
    L_0x005d:
        r20 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r20 = r20 * r8;
        r16 = r10 + r20;
    L_0x0063:
        r2 = new com.android.volley.Cache$Entry;
        r2.<init>();
        r0 = r22;
        r0 = r0.data;
        r20 = r0;
        r0 = r20;
        r2.data = r0;
        r2.etag = r7;
        r0 = r16;
        r2.softTtl = r0;
        r0 = r2.softTtl;
        r20 = r0;
        r0 = r20;
        r2.ttl = r0;
        r2.serverDate = r12;
        r2.responseHeaders = r5;
    L_0x0084:
        return r2;
    L_0x0085:
        r20 = r19[r6];
        r18 = r20.trim();
        r20 = "no-cache";
        r0 = r18;
        r1 = r20;
        r20 = r0.equals(r1);
        if (r20 != 0) goto L_0x00a3;
    L_0x0097:
        r20 = "no-store";
        r0 = r18;
        r1 = r20;
        r20 = r0.equals(r1);
        if (r20 == 0) goto L_0x00a5;
    L_0x00a3:
        r2 = 0;
        goto L_0x0084;
    L_0x00a5:
        r20 = "max-age=";
        r0 = r18;
        r1 = r20;
        r20 = r0.startsWith(r1);
        if (r20 == 0) goto L_0x00c3;
    L_0x00b1:
        r20 = 8;
        r0 = r18;
        r1 = r20;
        r20 = r0.substring(r1);	 Catch:{ Exception -> 0x00ee }
        r8 = java.lang.Long.parseLong(r20);	 Catch:{ Exception -> 0x00ee }
    L_0x00bf:
        r6 = r6 + 1;
        goto L_0x0038;
    L_0x00c3:
        r20 = "must-revalidate";
        r0 = r18;
        r1 = r20;
        r20 = r0.equals(r1);
        if (r20 != 0) goto L_0x00db;
    L_0x00cf:
        r20 = "proxy-revalidate";
        r0 = r18;
        r1 = r20;
        r20 = r0.equals(r1);
        if (r20 == 0) goto L_0x00bf;
    L_0x00db:
        r8 = 0;
        goto L_0x00bf;
    L_0x00de:
        r20 = 0;
        r20 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1));
        if (r20 <= 0) goto L_0x0063;
    L_0x00e4:
        r20 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r20 < 0) goto L_0x0063;
    L_0x00e8:
        r20 = r14 - r12;
        r16 = r10 + r20;
        goto L_0x0063;
    L_0x00ee:
        r20 = move-exception;
        goto L_0x00bf;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.HttpHeaderParser.parseCacheHeaders(com.android.volley.NetworkResponse):com.android.volley.Cache$Entry");
    }

    public static long parseDateAsEpoch(String dateStr) {
        try {
            return DateUtils.parseDate(dateStr).getTime();
        } catch (DateParseException e) {
            return 0;
        }
    }

    public static String parseCharset(Map<String, String> headers) {
        String contentType = (String) headers.get(MIME.CONTENT_TYPE);
        if (contentType != null) {
            String[] params = contentType.split(C0201h.f510b);
            for (int i = 1; i < params.length; i++) {
                String[] pair = params[i].trim().split("=");
                if (pair.length == 2 && pair[0].equals("charset")) {
                    return pair[1];
                }
            }
        }
        return "ISO-8859-1";
    }
}
