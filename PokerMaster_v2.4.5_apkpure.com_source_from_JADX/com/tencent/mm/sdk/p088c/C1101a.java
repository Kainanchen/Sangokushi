package com.tencent.mm.sdk.p088c;

import android.net.Uri;
import android.provider.BaseColumns;
import com.tencent.mm.sdk.p087b.C1090b;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.tencent.mm.sdk.c.a */
public final class C1101a {

    /* renamed from: com.tencent.mm.sdk.c.a.a */
    public static final class C1099a {
        public static Object m5891a(int i, String str) {
            switch (i) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    return Integer.valueOf(str);
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    return Long.valueOf(str);
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                    return str;
                case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                    return Boolean.valueOf(str);
                case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                    return Float.valueOf(str);
                case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                    return Double.valueOf(str);
                default:
                    try {
                        C1090b.m5874b("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.sdk.c.a.b */
    public static final class C1100b implements BaseColumns {
        public static final Uri CONTENT_URI;

        static {
            CONTENT_URI = Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
        }
    }
}
