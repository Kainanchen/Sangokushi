package com.ta.utdid2.core.persistent;

import android.support.v4.view.MotionEventCompat;
import android.util.Xml;
import com.alipay.sdk.cons.C0167c;
import com.tencent.connect.common.Constants;
import com.zkunity.app.ResourceIDs;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

class XmlUtils {
    XmlUtils() {
    }

    public static void skipCurrentTag(XmlPullParser parser) throws XmlPullParserException, IOException {
        int outerDepth = parser.getDepth();
        while (true) {
            int type = parser.next();
            if (type == 1) {
                return;
            }
            if (type == 3 && parser.getDepth() <= outerDepth) {
                return;
            }
        }
    }

    public static final int convertValueToList(CharSequence value, String[] options, int defaultValue) {
        if (value != null) {
            for (int i = 0; i < options.length; i++) {
                if (value.equals(options[i])) {
                    return i;
                }
            }
        }
        return defaultValue;
    }

    public static final boolean convertValueToBoolean(CharSequence value, boolean defaultValue) {
        boolean result = false;
        if (value == null) {
            return defaultValue;
        }
        if (value.equals(Constants.VIA_TO_TYPE_QQ_GROUP) || value.equals("true") || value.equals("TRUE")) {
            result = true;
        }
        return result;
    }

    public static final int convertValueToInt(CharSequence charSeq, int defaultValue) {
        if (charSeq == null) {
            return defaultValue;
        }
        String nm = charSeq.toString();
        int sign = 1;
        int index = 0;
        int len = nm.length();
        int base = 10;
        if ('-' == nm.charAt(0)) {
            sign = -1;
            index = 0 + 1;
        }
        if ('0' == nm.charAt(index)) {
            if (index == len - 1) {
                return 0;
            }
            char c = nm.charAt(index + 1);
            if ('x' == c || 'X' == c) {
                index += 2;
                base = 16;
            } else {
                index++;
                base = 8;
            }
        } else if ('#' == nm.charAt(index)) {
            index++;
            base = 16;
        }
        return Integer.parseInt(nm.substring(index), base) * sign;
    }

    public static final int convertValueToUnsignedInt(String value, int defaultValue) {
        return value == null ? defaultValue : parseUnsignedIntAttribute(value);
    }

    public static final int parseUnsignedIntAttribute(CharSequence charSeq) {
        String value = charSeq.toString();
        int index = 0;
        int len = value.length();
        int base = 10;
        if ('0' == value.charAt(0)) {
            if (0 == len - 1) {
                return 0;
            }
            char c = value.charAt(1);
            if ('x' == c || 'X' == c) {
                index = 0 + 2;
                base = 16;
            } else {
                index = 0 + 1;
                base = 8;
            }
        } else if ('#' == value.charAt(0)) {
            index = 0 + 1;
            base = 16;
        }
        return (int) Long.parseLong(value.substring(index), base);
    }

    public static final void writeMapXml(Map val, OutputStream out) throws XmlPullParserException, IOException {
        XmlSerializer serializer = new FastXmlSerializer();
        serializer.setOutput(out, "utf-8");
        serializer.startDocument(null, Boolean.valueOf(true));
        serializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeMapXml(val, null, serializer);
        serializer.endDocument();
    }

    public static final void writeListXml(List val, OutputStream out) throws XmlPullParserException, IOException {
        XmlSerializer serializer = Xml.newSerializer();
        serializer.setOutput(out, "utf-8");
        serializer.startDocument(null, Boolean.valueOf(true));
        serializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeListXml(val, null, serializer);
        serializer.endDocument();
    }

    public static final void writeMapXml(Map val, String name, XmlSerializer out) throws XmlPullParserException, IOException {
        if (val == null) {
            out.startTag(null, "null");
            out.endTag(null, "null");
            return;
        }
        out.startTag(null, "map");
        if (name != null) {
            out.attribute(null, C0167c.f364e, name);
        }
        for (Entry e : val.entrySet()) {
            writeValueXml(e.getValue(), (String) e.getKey(), out);
        }
        out.endTag(null, "map");
    }

    public static final void writeListXml(List val, String name, XmlSerializer out) throws XmlPullParserException, IOException {
        if (val == null) {
            out.startTag(null, "null");
            out.endTag(null, "null");
            return;
        }
        out.startTag(null, "list");
        if (name != null) {
            out.attribute(null, C0167c.f364e, name);
        }
        int N = val.size();
        for (int i = 0; i < N; i++) {
            writeValueXml(val.get(i), null, out);
        }
        out.endTag(null, "list");
    }

    public static final void writeByteArrayXml(byte[] val, String name, XmlSerializer out) throws XmlPullParserException, IOException {
        if (val == null) {
            out.startTag(null, "null");
            out.endTag(null, "null");
            return;
        }
        out.startTag(null, "byte-array");
        if (name != null) {
            out.attribute(null, C0167c.f364e, name);
        }
        out.attribute(null, "num", Integer.toString(N));
        StringBuilder sb = new StringBuilder(val.length * 2);
        for (int b : val) {
            int i;
            int h = b >> 4;
            sb.append(h >= 10 ? (h + 97) - 10 : h + 48);
            h = b & MotionEventCompat.ACTION_MASK;
            if (h >= 10) {
                i = (h + 97) - 10;
            } else {
                i = h + 48;
            }
            sb.append(i);
        }
        out.text(sb.toString());
        out.endTag(null, "byte-array");
    }

    public static final void writeIntArrayXml(int[] val, String name, XmlSerializer out) throws XmlPullParserException, IOException {
        if (val == null) {
            out.startTag(null, "null");
            out.endTag(null, "null");
            return;
        }
        out.startTag(null, "int-array");
        if (name != null) {
            out.attribute(null, C0167c.f364e, name);
        }
        out.attribute(null, "num", Integer.toString(N));
        for (int num : val) {
            out.startTag(null, "item");
            out.attribute(null, "value", Integer.toString(num));
            out.endTag(null, "item");
        }
        out.endTag(null, "int-array");
    }

    public static final void writeValueXml(Object v, String name, XmlSerializer out) throws XmlPullParserException, IOException {
        if (v == null) {
            out.startTag(null, "null");
            if (name != null) {
                out.attribute(null, C0167c.f364e, name);
            }
            out.endTag(null, "null");
        } else if (v instanceof String) {
            out.startTag(null, ResourceIDs.STRING_ID);
            if (name != null) {
                out.attribute(null, C0167c.f364e, name);
            }
            out.text(v.toString());
            out.endTag(null, ResourceIDs.STRING_ID);
        } else {
            String typeStr;
            if (v instanceof Integer) {
                typeStr = "int";
            } else if (v instanceof Long) {
                typeStr = "long";
            } else if (v instanceof Float) {
                typeStr = "float";
            } else if (v instanceof Double) {
                typeStr = "double";
            } else if (v instanceof Boolean) {
                typeStr = "boolean";
            } else if (v instanceof byte[]) {
                writeByteArrayXml((byte[]) v, name, out);
                return;
            } else if (v instanceof int[]) {
                writeIntArrayXml((int[]) v, name, out);
                return;
            } else if (v instanceof Map) {
                writeMapXml((Map) v, name, out);
                return;
            } else if (v instanceof List) {
                writeListXml((List) v, name, out);
                return;
            } else if (v instanceof CharSequence) {
                out.startTag(null, ResourceIDs.STRING_ID);
                if (name != null) {
                    out.attribute(null, C0167c.f364e, name);
                }
                out.text(v.toString());
                out.endTag(null, ResourceIDs.STRING_ID);
                return;
            } else {
                throw new RuntimeException("writeValueXml: unable to write value " + v);
            }
            out.startTag(null, typeStr);
            if (name != null) {
                out.attribute(null, C0167c.f364e, name);
            }
            out.attribute(null, "value", v.toString());
            out.endTag(null, typeStr);
        }
    }

    public static final HashMap readMapXml(InputStream in) throws XmlPullParserException, IOException {
        XmlPullParser parser = Xml.newPullParser();
        parser.setInput(in, null);
        return (HashMap) readValueXml(parser, new String[1]);
    }

    public static final ArrayList readListXml(InputStream in) throws XmlPullParserException, IOException {
        XmlPullParser parser = Xml.newPullParser();
        parser.setInput(in, null);
        return (ArrayList) readValueXml(parser, new String[1]);
    }

    public static final HashMap readThisMapXml(XmlPullParser parser, String endTag, String[] name) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        int eventType = parser.getEventType();
        do {
            if (eventType == 2) {
                Object val = readThisValueXml(parser, name);
                if (name[0] != null) {
                    map.put(name[0], val);
                } else {
                    throw new XmlPullParserException("Map value without name attribute: " + parser.getName());
                }
            } else if (eventType == 3) {
                if (parser.getName().equals(endTag)) {
                    return map;
                }
                throw new XmlPullParserException("Expected " + endTag + " end tag at: " + parser.getName());
            }
            eventType = parser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + endTag + " end tag");
    }

    public static final ArrayList readThisListXml(XmlPullParser parser, String endTag, String[] name) throws XmlPullParserException, IOException {
        ArrayList list = new ArrayList();
        int eventType = parser.getEventType();
        do {
            if (eventType == 2) {
                list.add(readThisValueXml(parser, name));
            } else if (eventType == 3) {
                if (parser.getName().equals(endTag)) {
                    return list;
                }
                throw new XmlPullParserException("Expected " + endTag + " end tag at: " + parser.getName());
            }
            eventType = parser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + endTag + " end tag");
    }

    public static final int[] readThisIntArrayXml(XmlPullParser parser, String endTag, String[] name) throws XmlPullParserException, IOException {
        try {
            int[] array = new int[Integer.parseInt(parser.getAttributeValue(null, "num"))];
            int i = 0;
            int eventType = parser.getEventType();
            do {
                if (eventType == 2) {
                    if (parser.getName().equals("item")) {
                        try {
                            array[i] = Integer.parseInt(parser.getAttributeValue(null, "value"));
                        } catch (NullPointerException e) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException e2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    }
                    throw new XmlPullParserException("Expected item tag at: " + parser.getName());
                } else if (eventType == 3) {
                    if (parser.getName().equals(endTag)) {
                        return array;
                    }
                    if (parser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + endTag + " end tag at: " + parser.getName());
                    }
                }
                eventType = parser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + endTag + " end tag");
        } catch (NullPointerException e3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException e4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static final Object readValueXml(XmlPullParser parser, String[] name) throws XmlPullParserException, IOException {
        int eventType = parser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + parser.getName());
            } else if (eventType == 4) {
                throw new XmlPullParserException("Unexpected text: " + parser.getText());
            } else {
                try {
                    eventType = parser.next();
                    if (eventType == 1) {
                        throw new XmlPullParserException("Unexpected end of document");
                    }
                } catch (Exception e) {
                    throw new XmlPullParserException("Unexpected call next(): " + parser.getName());
                }
            }
        }
        return readThisValueXml(parser, name);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.Object readThisValueXml(org.xmlpull.v1.XmlPullParser r11, java.lang.String[] r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        r10 = 3;
        r9 = 2;
        r8 = 1;
        r7 = 0;
        r6 = 0;
        r5 = "name";
        r4 = r11.getAttributeValue(r6, r5);
        r2 = r11.getName();
        r5 = "null";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x0039;
    L_0x0017:
        r1 = 0;
    L_0x0018:
        r0 = r11.next();
        if (r0 != r8) goto L_0x016e;
    L_0x001e:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r7 = "Unexpected end of document in <";
        r6.<init>(r7);
        r6 = r6.append(r2);
        r7 = ">";
        r6 = r6.append(r7);
        r6 = r6.toString();
        r5.<init>(r6);
        throw r5;
    L_0x0039:
        r5 = "string";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00b0;
    L_0x0041:
        r3 = "";
    L_0x0043:
        r0 = r11.next();
        if (r0 != r8) goto L_0x0051;
    L_0x0049:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = "Unexpected end of document in <string>";
        r5.<init>(r6);
        throw r5;
    L_0x0051:
        if (r0 != r10) goto L_0x007c;
    L_0x0053:
        r5 = r11.getName();
        r6 = "string";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0063;
    L_0x005f:
        r12[r7] = r4;
        r1 = r3;
    L_0x0062:
        return r1;
    L_0x0063:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r7 = "Unexpected end tag in <string>: ";
        r6.<init>(r7);
        r7 = r11.getName();
        r6 = r6.append(r7);
        r6 = r6.toString();
        r5.<init>(r6);
        throw r5;
    L_0x007c:
        r5 = 4;
        if (r0 != r5) goto L_0x0095;
    L_0x007f:
        r5 = new java.lang.StringBuilder;
        r6 = java.lang.String.valueOf(r3);
        r5.<init>(r6);
        r6 = r11.getText();
        r5 = r5.append(r6);
        r3 = r5.toString();
        goto L_0x0043;
    L_0x0095:
        if (r0 != r9) goto L_0x0043;
    L_0x0097:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r7 = "Unexpected start tag in <string>: ";
        r6.<init>(r7);
        r7 = r11.getName();
        r6 = r6.append(r7);
        r6 = r6.toString();
        r5.<init>(r6);
        throw r5;
    L_0x00b0:
        r5 = "int";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00c8;
    L_0x00b8:
        r5 = "value";
        r5 = r11.getAttributeValue(r6, r5);
        r5 = java.lang.Integer.parseInt(r5);
        r1 = java.lang.Integer.valueOf(r5);
        goto L_0x0018;
    L_0x00c8:
        r5 = "long";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00dc;
    L_0x00d0:
        r5 = "value";
        r5 = r11.getAttributeValue(r6, r5);
        r1 = java.lang.Long.valueOf(r5);
        goto L_0x0018;
    L_0x00dc:
        r5 = "float";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x00f1;
    L_0x00e4:
        r1 = new java.lang.Float;
        r5 = "value";
        r5 = r11.getAttributeValue(r6, r5);
        r1.<init>(r5);
        goto L_0x0018;
    L_0x00f1:
        r5 = "double";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x0106;
    L_0x00f9:
        r1 = new java.lang.Double;
        r5 = "value";
        r5 = r11.getAttributeValue(r6, r5);
        r1.<init>(r5);
        goto L_0x0018;
    L_0x0106:
        r5 = "boolean";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x011a;
    L_0x010e:
        r5 = "value";
        r5 = r11.getAttributeValue(r6, r5);
        r1 = java.lang.Boolean.valueOf(r5);
        goto L_0x0018;
    L_0x011a:
        r5 = "int-array";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x012f;
    L_0x0122:
        r11.next();
        r5 = "int-array";
        r1 = readThisIntArrayXml(r11, r5, r12);
        r12[r7] = r4;
        goto L_0x0062;
    L_0x012f:
        r5 = "map";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x0144;
    L_0x0137:
        r11.next();
        r5 = "map";
        r1 = readThisMapXml(r11, r5, r12);
        r12[r7] = r4;
        goto L_0x0062;
    L_0x0144:
        r5 = "list";
        r5 = r2.equals(r5);
        if (r5 == 0) goto L_0x0159;
    L_0x014c:
        r11.next();
        r5 = "list";
        r1 = readThisListXml(r11, r5, r12);
        r12[r7] = r4;
        goto L_0x0062;
    L_0x0159:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r7 = "Unknown tag: ";
        r6.<init>(r7);
        r6 = r6.append(r2);
        r6 = r6.toString();
        r5.<init>(r6);
        throw r5;
    L_0x016e:
        if (r0 != r10) goto L_0x01a1;
    L_0x0170:
        r5 = r11.getName();
        r5 = r5.equals(r2);
        if (r5 == 0) goto L_0x017e;
    L_0x017a:
        r12[r7] = r4;
        goto L_0x0062;
    L_0x017e:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r7 = "Unexpected end tag in <";
        r6.<init>(r7);
        r6 = r6.append(r2);
        r7 = ">: ";
        r6 = r6.append(r7);
        r7 = r11.getName();
        r6 = r6.append(r7);
        r6 = r6.toString();
        r5.<init>(r6);
        throw r5;
    L_0x01a1:
        r5 = 4;
        if (r0 != r5) goto L_0x01c7;
    L_0x01a4:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r7 = "Unexpected text in <";
        r6.<init>(r7);
        r6 = r6.append(r2);
        r7 = ">: ";
        r6 = r6.append(r7);
        r7 = r11.getName();
        r6 = r6.append(r7);
        r6 = r6.toString();
        r5.<init>(r6);
        throw r5;
    L_0x01c7:
        if (r0 != r9) goto L_0x0018;
    L_0x01c9:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r7 = "Unexpected start tag in <";
        r6.<init>(r7);
        r6 = r6.append(r2);
        r7 = ">: ";
        r6 = r6.append(r7);
        r7 = r11.getName();
        r6 = r6.append(r7);
        r6 = r6.toString();
        r5.<init>(r6);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.core.persistent.XmlUtils.readThisValueXml(org.xmlpull.v1.XmlPullParser, java.lang.String[]):java.lang.Object");
    }

    public static final void beginDocument(XmlPullParser parser, String firstElementName) throws XmlPullParserException, IOException {
        int type;
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type != 2) {
            throw new XmlPullParserException("No start tag found");
        } else if (!parser.getName().equals(firstElementName)) {
            throw new XmlPullParserException("Unexpected start tag: found " + parser.getName() + ", expected " + firstElementName);
        }
    }

    public static final void nextElement(XmlPullParser parser) throws XmlPullParserException, IOException {
        int type;
        do {
            type = parser.next();
            if (type == 2) {
                return;
            }
        } while (type != 1);
    }
}
