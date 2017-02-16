package com.tencent.android.tpush.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* compiled from: ProGuard */
public class StorageEntity implements Parcelable {
    public static final Creator CREATOR;
    public String f7412a;
    public int f7413b;
    public boolean f7414c;
    public String f7415d;
    public int f7416e;
    public float f7417f;
    public long f7418g;

    public StorageEntity() {
        this.f7412a = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7413b = -1;
    }

    public StorageEntity(Parcel parcel) {
        this.f7412a = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f7413b = -1;
        m4846a(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7412a);
        parcel.writeInt(this.f7413b);
        parcel.writeByte(this.f7414c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f7415d);
        parcel.writeInt(this.f7416e);
        parcel.writeFloat(this.f7417f);
        parcel.writeLong(this.f7418g);
    }

    private void m4846a(Parcel parcel) {
        boolean z = true;
        this.f7412a = parcel.readString();
        this.f7413b = parcel.readInt();
        if (parcel.readByte() != (byte) 1) {
            z = false;
        }
        this.f7414c = z;
        this.f7415d = parcel.readString();
        this.f7416e = parcel.readInt();
        this.f7417f = parcel.readFloat();
        this.f7418g = parcel.readLong();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StorageEntity[key:").append(this.f7412a).append(",type:").append(this.f7413b).append(",strValue:").append(this.f7415d).append(",boolValue:").append(this.f7414c).append(",intValue").append(this.f7416e).append(",floatValue:").append(this.f7417f).append(",longValue:").append(this.f7418g).append("]");
        return stringBuilder.toString();
    }

    static {
        CREATOR = new ProGuard();
    }
}
