package com.facebook.imagepipeline.p046g;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.p011d.Closeables;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Throwables;
import com.facebook.common.p021l.StreamUtil;
import com.facebook.imagepipeline.memory.ByteArrayPool;
import com.facebook.imagepipeline.memory.PooledByteArrayBufferedInputStream;
import com.facebook.imagepipeline.p047h.EncodedImage;
import java.io.IOException;
import java.io.InputStream;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.facebook.imagepipeline.g.c */
public final class ProgressiveJpegParser {
    public int f2130a;
    public int f2131b;
    private int f2132c;
    private int f2133d;
    private int f2134e;
    private int f2135f;
    private final ByteArrayPool f2136g;

    public ProgressiveJpegParser(ByteArrayPool byteArrayPool) {
        this.f2136g = (ByteArrayPool) Preconditions.m1030a((Object) byteArrayPool);
        this.f2134e = 0;
        this.f2133d = 0;
        this.f2135f = 0;
        this.f2131b = 0;
        this.f2130a = 0;
        this.f2132c = 0;
    }

    public final boolean m2012a(EncodedImage encodedImage) {
        boolean a;
        if (this.f2132c == 6) {
            return false;
        }
        if (encodedImage.m2033b() <= this.f2134e) {
            return false;
        }
        InputStream pooledByteArrayBufferedInputStream = new PooledByteArrayBufferedInputStream(encodedImage.m2032a(), (byte[]) this.f2136g.m2344a((int) AccessibilityNodeInfoCompat.ACTION_COPY), this.f2136g);
        try {
            StreamUtil.m1119a(pooledByteArrayBufferedInputStream, (long) this.f2134e);
            a = m2011a(pooledByteArrayBufferedInputStream);
            return a;
        } catch (IOException e) {
            a = e;
            Throwables.m1039b(a);
            return false;
        } finally {
            Closeables.m1022a(pooledByteArrayBufferedInputStream);
        }
    }

    private boolean m2011a(InputStream inputStream) {
        int i = this.f2130a;
        while (this.f2132c != 6) {
            int read = inputStream.read();
            if (read != -1) {
                this.f2134e++;
                int i2;
                switch (this.f2132c) {
                    case SQLiteDatabase.OPEN_READWRITE /*0*/:
                        if (read != MotionEventCompat.ACTION_MASK) {
                            this.f2132c = 6;
                            break;
                        }
                        try {
                            this.f2132c = 1;
                            break;
                        } catch (Throwable e) {
                            Throwables.m1039b(e);
                            break;
                        }
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        if (read != 216) {
                            this.f2132c = 6;
                            break;
                        }
                        this.f2132c = 2;
                        break;
                    case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                        if (read == MotionEventCompat.ACTION_MASK) {
                            this.f2132c = 3;
                            break;
                        }
                        break;
                    case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                        if (read != MotionEventCompat.ACTION_MASK) {
                            if (read != 0) {
                                boolean z;
                                if (read == 218 || read == 217) {
                                    i2 = this.f2134e - 2;
                                    if (this.f2135f > 0) {
                                        this.f2131b = i2;
                                    }
                                    i2 = this.f2135f;
                                    this.f2135f = i2 + 1;
                                    this.f2130a = i2;
                                }
                                if (read == 1 || ((read >= 208 && read <= 215) || read == 217 || read == 216)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                    this.f2132c = 2;
                                    break;
                                }
                                this.f2132c = 4;
                                break;
                            }
                            this.f2132c = 2;
                            break;
                        }
                        this.f2132c = 3;
                        break;
                        break;
                    case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                        this.f2132c = 5;
                        break;
                    case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                        i2 = ((this.f2133d << 8) + read) - 2;
                        StreamUtil.m1119a(inputStream, (long) i2);
                        this.f2134e = i2 + this.f2134e;
                        this.f2132c = 2;
                        break;
                    default:
                        Preconditions.m1035b(false);
                        break;
                }
                this.f2133d = read;
            } else if (this.f2132c != 6 || this.f2130a == i) {
                return false;
            } else {
                return true;
            }
        }
        if (this.f2132c != 6) {
        }
        return false;
    }
}
