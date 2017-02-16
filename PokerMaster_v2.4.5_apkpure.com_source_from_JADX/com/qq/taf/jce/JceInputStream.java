package com.qq.taf.jce;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.ali.fixHelper;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.sqlcipher.database.SQLiteDatabase;

public final class JceInputStream {
    private ByteBuffer bs;
    protected String sServerEncoding;

    public static class HeadData {
        public int tag;
        public byte type;

        static {
            fixHelper.fixfunc(new int[]{1236, 1237});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native void clear();
    }

    public JceInputStream() {
        this.sServerEncoding = "GBK";
    }

    public JceInputStream(ByteBuffer byteBuffer) {
        this.sServerEncoding = "GBK";
        this.bs = byteBuffer;
    }

    public JceInputStream(byte[] bArr) {
        this.sServerEncoding = "GBK";
        this.bs = ByteBuffer.wrap(bArr);
    }

    public JceInputStream(byte[] bArr, int i) {
        this.sServerEncoding = "GBK";
        this.bs = ByteBuffer.wrap(bArr);
        this.bs.position(i);
    }

    public final void warp(byte[] bArr) {
        wrap(bArr);
    }

    public final void wrap(byte[] bArr) {
        this.bs = ByteBuffer.wrap(bArr);
    }

    public static int readHead(HeadData headData, ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        headData.type = (byte) (b & 15);
        headData.tag = (b & 240) >> 4;
        if (headData.tag != 15) {
            return 1;
        }
        headData.tag = byteBuffer.get() & MotionEventCompat.ACTION_MASK;
        return 2;
    }

    public final void readHead(HeadData headData) {
        readHead(headData, this.bs);
    }

    private int peakHead(HeadData headData) {
        return readHead(headData, this.bs.duplicate());
    }

    private void skip(int i) {
        this.bs.position(this.bs.position() + i);
    }

    public final boolean skipToTag(int i) {
        try {
            HeadData headData = new HeadData();
            while (true) {
                int peakHead = peakHead(headData);
                if (headData.type == 11) {
                    return false;
                }
                if (i <= headData.tag) {
                    break;
                }
                skip(peakHead);
                skipField(headData.type);
            }
            if (i == headData.tag) {
                return true;
            }
            return false;
        } catch (JceDecodeException e) {
            return false;
        } catch (BufferUnderflowException e2) {
            return false;
        }
    }

    public final void skipToStructEnd() {
        HeadData headData = new HeadData();
        do {
            readHead(headData);
            skipField(headData.type);
        } while (headData.type != 11);
    }

    private void skipField() {
        HeadData headData = new HeadData();
        readHead(headData);
        skipField(headData.type);
    }

    private void skipField(byte b) {
        int i = 0;
        int read;
        switch (b) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                skip(1);
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                skip(2);
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                skip(4);
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                skip(8);
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                skip(4);
            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                skip(8);
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                i = this.bs.get();
                if (i < 0) {
                    i += AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                }
                skip(i);
            case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                skip(this.bs.getInt());
            case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                read = read(0, 0, true);
                while (i < read * 2) {
                    skipField();
                    i++;
                }
            case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                read = read(0, 0, true);
                while (i < read) {
                    skipField();
                    i++;
                }
            case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                skipToStructEnd();
            case PushMsg.VVOICEDATAS_FIELD_NUMBER /*11*/:
            case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
            case PushMsg.STPOKERPROCESSBASEINFO_FIELD_NUMBER /*13*/:
                HeadData headData = new HeadData();
                readHead(headData);
                if (headData.type != null) {
                    throw new JceDecodeException("skipField with invalid type, type value: " + b + ", " + headData.type);
                }
                skip(read(0, 0, true));
            default:
                throw new JceDecodeException("invalid type.");
        }
    }

    public final boolean read(boolean z, int i, boolean z2) {
        if (read((byte) 0, i, z2) != null) {
            return true;
        }
        return false;
    }

    public final byte read(byte b, int i, boolean z) {
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    return this.bs.get();
                case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                    return (byte) 0;
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return b;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final short read(short s, int i, boolean z) {
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    return (short) this.bs.get();
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    return this.bs.getShort();
                case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                    return (short) 0;
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return s;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final int read(int i, int i2, boolean z) {
        if (skipToTag(i2)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    return this.bs.get();
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    return this.bs.getShort();
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    return this.bs.getInt();
                case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                    return 0;
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return i;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final long read(long j, int i, boolean z) {
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    return (long) this.bs.get();
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    return (long) this.bs.getShort();
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    return (long) this.bs.getInt();
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                    return this.bs.getLong();
                case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                    return 0;
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return j;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final float read(float f, int i, boolean z) {
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                    return this.bs.getFloat();
                case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                    return 0.0f;
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return f;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final double read(double d, int i, boolean z) {
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                    return (double) this.bs.getFloat();
                case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                    return this.bs.getDouble();
                case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                    return 0.0d;
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return d;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final String readByteString(String str, int i, boolean z) {
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            int i2;
            byte[] bArr;
            switch (headData.type) {
                case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                    i2 = this.bs.get();
                    if (i2 < 0) {
                        i2 += AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                    }
                    bArr = new byte[i2];
                    this.bs.get(bArr);
                    return HexUtil.bytes2HexStr(bArr);
                case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                    i2 = this.bs.getInt();
                    if (i2 > JceStruct.JCE_MAX_STRING_LENGTH || i2 < 0) {
                        throw new JceDecodeException("String too long: " + i2);
                    }
                    bArr = new byte[i2];
                    this.bs.get(bArr);
                    return HexUtil.bytes2HexStr(bArr);
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return str;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final String read(String str, int i, boolean z) {
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            int i2;
            byte[] bArr;
            switch (headData.type) {
                case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                    i2 = this.bs.get();
                    if (i2 < 0) {
                        i2 += AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                    }
                    bArr = new byte[i2];
                    this.bs.get(bArr);
                    try {
                        return new String(bArr, this.sServerEncoding);
                    } catch (UnsupportedEncodingException e) {
                        return new String(bArr);
                    }
                case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                    i2 = this.bs.getInt();
                    if (i2 > JceStruct.JCE_MAX_STRING_LENGTH || i2 < 0) {
                        throw new JceDecodeException("String too long: " + i2);
                    }
                    bArr = new byte[i2];
                    this.bs.get(bArr);
                    try {
                        return new String(bArr, this.sServerEncoding);
                    } catch (UnsupportedEncodingException e2) {
                        return new String(bArr);
                    }
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return str;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final String readString(int i, boolean z) {
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            int i2;
            byte[] bArr;
            switch (headData.type) {
                case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                    i2 = this.bs.get();
                    if (i2 < 0) {
                        i2 += AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                    }
                    bArr = new byte[i2];
                    this.bs.get(bArr);
                    try {
                        return new String(bArr, this.sServerEncoding);
                    } catch (UnsupportedEncodingException e) {
                        return new String(bArr);
                    }
                case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                    i2 = this.bs.getInt();
                    if (i2 > JceStruct.JCE_MAX_STRING_LENGTH || i2 < 0) {
                        throw new JceDecodeException("String too long: " + i2);
                    }
                    bArr = new byte[i2];
                    this.bs.get(bArr);
                    try {
                        return new String(bArr, this.sServerEncoding);
                    } catch (UnsupportedEncodingException e2) {
                        return new String(bArr);
                    }
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return null;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final String[] read(String[] strArr, int i, boolean z) {
        return (String[]) readArray((Object[]) strArr, i, z);
    }

    public final Map<String, String> readStringMap(int i, boolean z) {
        Map hashMap = new HashMap();
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                    int read = read(0, 0, true);
                    if (read >= 0) {
                        for (int i2 = 0; i2 < read; i2++) {
                            hashMap.put(readString(0, true), readString(1, true));
                        }
                        break;
                    }
                    throw new JceDecodeException("size invalid: " + read);
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (z) {
            throw new JceDecodeException("require field not exist.");
        }
        return hashMap;
    }

    public final <K, V> HashMap<K, V> readMap(Map<K, V> map, int i, boolean z) {
        return (HashMap) readMap(new HashMap(), map, i, z);
    }

    private <K, V> Map<K, V> readMap(Map<K, V> map, Map<K, V> map2, int i, boolean z) {
        if (map2 == null || map2.isEmpty()) {
            return new HashMap();
        }
        Entry entry = (Entry) map2.entrySet().iterator().next();
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                    int read = read(0, 0, true);
                    if (read < 0) {
                        throw new JceDecodeException("size invalid: " + read);
                    }
                    for (int i2 = 0; i2 < read; i2++) {
                        map.put(read(key, 0, true), read(value, 1, true));
                    }
                    return map;
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return map;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final List readList(int i, boolean z) {
        List arrayList = new ArrayList();
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                    int read = read(0, 0, true);
                    if (read >= 0) {
                        for (int i2 = 0; i2 < read; i2++) {
                            headData = new HeadData();
                            readHead(headData);
                            switch (headData.type) {
                                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                                    skip(1);
                                    break;
                                case SQLiteDatabase.OPEN_READONLY /*1*/:
                                    skip(2);
                                    break;
                                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                                    skip(4);
                                    break;
                                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                                    skip(8);
                                    break;
                                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                                    skip(4);
                                    break;
                                case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                                    skip(8);
                                    break;
                                case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                                    int i3 = this.bs.get();
                                    if (i3 < 0) {
                                        i3 += AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                                    }
                                    skip(i3);
                                    break;
                                case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                                    skip(this.bs.getInt());
                                    break;
                                case QuickGameRoomPushMsg.VUSERS_FIELD_NUMBER /*8*/:
                                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                                    break;
                                case PushMsg.SMSG_FIELD_NUMBER /*10*/:
                                    try {
                                        JceStruct jceStruct = (JceStruct) Class.forName(JceStruct.class.getName()).getConstructor(new Class[0]).newInstance(new Object[0]);
                                        jceStruct.readFrom(this);
                                        skipToStructEnd();
                                        arrayList.add(jceStruct);
                                        break;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        throw new JceDecodeException("type mismatch." + e);
                                    }
                                case PushMsg.STSHAREBILLINFO_FIELD_NUMBER /*12*/:
                                    arrayList.add(new Integer(0));
                                    break;
                                default:
                                    throw new JceDecodeException("type mismatch.");
                            }
                        }
                        break;
                    }
                    throw new JceDecodeException("size invalid: " + read);
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (z) {
            throw new JceDecodeException("require field not exist.");
        }
        return arrayList;
    }

    public final boolean[] read(boolean[] zArr, int i, boolean z) {
        boolean[] zArr2 = null;
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                    int read = read(0, 0, true);
                    if (read >= 0) {
                        zArr2 = new boolean[read];
                        for (int i2 = 0; i2 < read; i2++) {
                            zArr2[i2] = read(zArr2[0], 0, true);
                        }
                        break;
                    }
                    throw new JceDecodeException("size invalid: " + read);
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (z) {
            throw new JceDecodeException("require field not exist.");
        }
        return zArr2;
    }

    public final byte[] read(byte[] bArr, int i, boolean z) {
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            byte[] bArr2;
            switch (headData.type) {
                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                    int read = read(0, 0, true);
                    if (read < 0) {
                        throw new JceDecodeException("size invalid: " + read);
                    }
                    bArr2 = new byte[read];
                    for (int i2 = 0; i2 < read; i2++) {
                        bArr2[i2] = read(bArr2[0], 0, true);
                    }
                    return bArr2;
                case PushMsg.STPOKERPROCESSBASEINFO_FIELD_NUMBER /*13*/:
                    HeadData headData2 = new HeadData();
                    readHead(headData2);
                    if (headData2.type != null) {
                        throw new JceDecodeException("type mismatch, tag: " + i + ", type: " + headData.type + ", " + headData2.type);
                    }
                    int read2 = read(0, 0, true);
                    if (read2 < 0) {
                        throw new JceDecodeException("invalid size, tag: " + i + ", type: " + headData.type + ", " + headData2.type + ", size: " + read2);
                    }
                    bArr2 = new byte[read2];
                    this.bs.get(bArr2);
                    return bArr2;
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return null;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final short[] read(short[] sArr, int i, boolean z) {
        short[] sArr2 = null;
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                    int read = read(0, 0, true);
                    if (read >= 0) {
                        sArr2 = new short[read];
                        for (int i2 = 0; i2 < read; i2++) {
                            sArr2[i2] = read(sArr2[0], 0, true);
                        }
                        break;
                    }
                    throw new JceDecodeException("size invalid: " + read);
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (z) {
            throw new JceDecodeException("require field not exist.");
        }
        return sArr2;
    }

    public final int[] read(int[] iArr, int i, boolean z) {
        int[] iArr2 = null;
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                    int read = read(0, 0, true);
                    if (read >= 0) {
                        iArr2 = new int[read];
                        for (int i2 = 0; i2 < read; i2++) {
                            iArr2[i2] = read(iArr2[0], 0, true);
                        }
                        break;
                    }
                    throw new JceDecodeException("size invalid: " + read);
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (z) {
            throw new JceDecodeException("require field not exist.");
        }
        return iArr2;
    }

    public final long[] read(long[] jArr, int i, boolean z) {
        long[] jArr2 = null;
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                    int read = read(0, 0, true);
                    if (read >= 0) {
                        jArr2 = new long[read];
                        for (int i2 = 0; i2 < read; i2++) {
                            jArr2[i2] = read(jArr2[0], 0, true);
                        }
                        break;
                    }
                    throw new JceDecodeException("size invalid: " + read);
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (z) {
            throw new JceDecodeException("require field not exist.");
        }
        return jArr2;
    }

    public final float[] read(float[] fArr, int i, boolean z) {
        float[] fArr2 = null;
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                    int read = read(0, 0, true);
                    if (read >= 0) {
                        fArr2 = new float[read];
                        for (int i2 = 0; i2 < read; i2++) {
                            fArr2[i2] = read(fArr2[0], 0, true);
                        }
                        break;
                    }
                    throw new JceDecodeException("size invalid: " + read);
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (z) {
            throw new JceDecodeException("require field not exist.");
        }
        return fArr2;
    }

    public final double[] read(double[] dArr, int i, boolean z) {
        double[] dArr2 = null;
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                    int read = read(0, 0, true);
                    if (read >= 0) {
                        dArr2 = new double[read];
                        for (int i2 = 0; i2 < read; i2++) {
                            dArr2[i2] = read(dArr2[0], 0, true);
                        }
                        break;
                    }
                    throw new JceDecodeException("size invalid: " + read);
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (z) {
            throw new JceDecodeException("require field not exist.");
        }
        return dArr2;
    }

    public final <T> T[] readArray(T[] tArr, int i, boolean z) {
        if (tArr != null && tArr.length != 0) {
            return readArrayImpl(tArr[0], i, z);
        }
        throw new JceDecodeException("unable to get type of key and value.");
    }

    public final <T> List<T> readArray(List<T> list, int i, boolean z) {
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        Object[] readArrayImpl = readArrayImpl(list.get(0), i, z);
        if (readArrayImpl == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < readArrayImpl.length) {
            arrayList.add(readArrayImpl[i2]);
            i2++;
        }
        return arrayList;
    }

    private <T> T[] readArrayImpl(T t, int i, boolean z) {
        if (skipToTag(i)) {
            HeadData headData = new HeadData();
            readHead(headData);
            switch (headData.type) {
                case PushMsg.STCLUBASEBINFO_FIELD_NUMBER /*9*/:
                    int read = read(0, 0, true);
                    if (read < 0) {
                        throw new JceDecodeException("size invalid: " + read);
                    }
                    Object[] objArr = (Object[]) Array.newInstance(t.getClass(), read);
                    for (int i2 = 0; i2 < read; i2++) {
                        objArr[i2] = read((Object) t, 0, true);
                    }
                    return objArr;
                default:
                    throw new JceDecodeException("type mismatch.");
            }
        } else if (!z) {
            return null;
        } else {
            throw new JceDecodeException("require field not exist.");
        }
    }

    public final JceStruct directRead(JceStruct jceStruct, int i, boolean z) {
        JceStruct jceStruct2 = null;
        if (skipToTag(i)) {
            try {
                jceStruct2 = jceStruct.newInit();
                HeadData headData = new HeadData();
                readHead(headData);
                if (headData.type != 10) {
                    throw new JceDecodeException("type mismatch.");
                }
                jceStruct2.readFrom(this);
                skipToStructEnd();
            } catch (Exception e) {
                throw new JceDecodeException(e.getMessage());
            }
        } else if (z) {
            throw new JceDecodeException("require field not exist.");
        }
        return jceStruct2;
    }

    public final JceStruct read(JceStruct jceStruct, int i, boolean z) {
        JceStruct jceStruct2 = null;
        if (skipToTag(i)) {
            try {
                jceStruct2 = (JceStruct) jceStruct.getClass().newInstance();
                HeadData headData = new HeadData();
                readHead(headData);
                if (headData.type != 10) {
                    throw new JceDecodeException("type mismatch.");
                }
                jceStruct2.readFrom(this);
                skipToStructEnd();
            } catch (Exception e) {
                throw new JceDecodeException(e.getMessage());
            }
        } else if (z) {
            throw new JceDecodeException("require field not exist.");
        }
        return jceStruct2;
    }

    public final JceStruct[] read(JceStruct[] jceStructArr, int i, boolean z) {
        return (JceStruct[]) readArray((Object[]) jceStructArr, i, z);
    }

    public final <T> Object read(T t, int i, boolean z) {
        if (t instanceof Byte) {
            return Byte.valueOf(read((byte) 0, i, z));
        }
        if (t instanceof Boolean) {
            return Boolean.valueOf(read(false, i, z));
        }
        if (t instanceof Short) {
            return Short.valueOf(read((short) 0, i, z));
        }
        if (t instanceof Integer) {
            return Integer.valueOf(read(0, i, z));
        }
        if (t instanceof Long) {
            return Long.valueOf(read(0, i, z));
        }
        if (t instanceof Float) {
            return Float.valueOf(read(0.0f, i, z));
        }
        if (t instanceof Double) {
            return Double.valueOf(read(0.0d, i, z));
        }
        if (t instanceof String) {
            return readString(i, z);
        }
        if (t instanceof Map) {
            return readMap((Map) t, i, z);
        }
        if (t instanceof List) {
            return readArray((List) t, i, z);
        }
        if (t instanceof JceStruct) {
            return read((JceStruct) t, i, z);
        }
        if (!t.getClass().isArray()) {
            throw new JceDecodeException("read object error: unsupport type.");
        } else if ((t instanceof byte[]) || (t instanceof Byte[])) {
            return read(null, i, z);
        } else {
            if (t instanceof boolean[]) {
                return read(null, i, z);
            }
            if (t instanceof short[]) {
                return read(null, i, z);
            }
            if (t instanceof int[]) {
                return read(null, i, z);
            }
            if (t instanceof long[]) {
                return read(null, i, z);
            }
            if (t instanceof float[]) {
                return read(null, i, z);
            }
            if (t instanceof double[]) {
                return read(null, i, z);
            }
            return readArray((Object[]) t, i, z);
        }
    }

    public final int setServerEncoding(String str) {
        this.sServerEncoding = str;
        return 0;
    }

    public static void main(String[] strArr) {
    }

    public final ByteBuffer getBs() {
        return this.bs;
    }
}
