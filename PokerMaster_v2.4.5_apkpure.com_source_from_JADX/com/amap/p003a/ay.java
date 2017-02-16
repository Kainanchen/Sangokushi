package com.amap.p003a;

import android.support.v4.os.EnvironmentCompat;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.Locale;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: Cgi */
/* renamed from: com.amap.a.ay */
public final class ay {
    public String f304a;
    public String f305b;
    public int f306c;
    public int f307d;
    public int f308e;
    public int f309f;
    public int f310g;
    public int f311h;
    public int f312i;
    public int f313j;
    public int f314k;

    protected ay(int i) {
        this.f304a = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f305b = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f306c = 0;
        this.f307d = 0;
        this.f308e = 0;
        this.f309f = 0;
        this.f310g = 0;
        this.f311h = 0;
        this.f312i = 0;
        this.f313j = -113;
        this.f314k = 9;
        this.f314k = i;
    }

    public final String toString() {
        String str = EnvironmentCompat.MEDIA_UNKNOWN;
        switch (this.f314k) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return String.format(Locale.US, "GSM lac=%d, cid=%d, mnc=%s", new Object[]{Integer.valueOf(this.f306c), Integer.valueOf(this.f307d), this.f305b});
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return String.format(Locale.US, "CDMA bid=%d, nid=%d, sid=%d", new Object[]{Integer.valueOf(this.f312i), Integer.valueOf(this.f311h), Integer.valueOf(this.f310g)});
            default:
                return str;
        }
    }
}
