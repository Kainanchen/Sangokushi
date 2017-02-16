package com.amap.api.fence;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.amap.p003a.bu;

public class Fence implements Parcelable {
    public static final Creator<Fence> CREATOR;
    public PendingIntent f733a;
    public String f734b;
    public double f735c;
    public double f736d;
    public float f737e;
    public int f738f;
    public long f739g;
    private long f740h;
    private long f741i;
    private int f742j;

    /* renamed from: com.amap.api.fence.Fence.1 */
    static class C02571 implements Creator<Fence> {
        C02571() {
        }

        public final Fence m754a(Parcel parcel) {
            return new Fence(null);
        }

        public final Fence[] m755a(int i) {
            return new Fence[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m754a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m755a(i);
        }
    }

    static {
        CREATOR = new C02571();
    }

    public Fence() {
        this.f733a = null;
        this.f734b = null;
        this.f735c = 0.0d;
        this.f736d = 0.0d;
        this.f737e = 0.0f;
        this.f740h = -1;
        this.f741i = -1;
        this.f742j = 3;
        this.f738f = -1;
        this.f739g = -1;
    }

    private Fence(Parcel parcel) {
        this.f733a = null;
        this.f734b = null;
        this.f735c = 0.0d;
        this.f736d = 0.0d;
        this.f737e = 0.0f;
        this.f740h = -1;
        this.f741i = -1;
        this.f742j = 3;
        this.f738f = -1;
        this.f739g = -1;
        if (parcel != null) {
            this.f734b = parcel.readString();
            this.f735c = parcel.readDouble();
            this.f736d = parcel.readDouble();
            this.f737e = parcel.readFloat();
            this.f740h = parcel.readLong();
            this.f741i = parcel.readLong();
            this.f742j = parcel.readInt();
            this.f738f = parcel.readInt();
            this.f739g = parcel.readLong();
        }
    }

    public int m756a() {
        return this.f742j;
    }

    public void m757a(long j) {
        if (j < 0) {
            this.f740h = -1;
        } else {
            this.f740h = bu.m477b() + j;
        }
    }

    public long m758b() {
        return this.f740h;
    }

    public long m759c() {
        return this.f741i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f734b);
        parcel.writeDouble(this.f735c);
        parcel.writeDouble(this.f736d);
        parcel.writeFloat(this.f737e);
        parcel.writeLong(this.f740h);
        parcel.writeLong(this.f741i);
        parcel.writeInt(this.f742j);
        parcel.writeInt(this.f738f);
        parcel.writeLong(this.f739g);
    }
}
