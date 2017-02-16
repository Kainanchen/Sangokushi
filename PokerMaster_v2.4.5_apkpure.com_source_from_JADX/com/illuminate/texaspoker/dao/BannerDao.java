package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.Banner;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class BannerDao extends a<Banner, Long> {
    public static final String TABLENAME = "BANNER";

    public static class Properties {
        public static final f f6053a;
        public static final f f6054b;
        public static final f f6055c;
        public static final f f6056d;

        static {
            f6053a = new f(0, Long.class, "id", true, "_id");
            f6054b = new f(1, Integer.class, "iPos", false, "I_POS");
            f6055c = new f(2, String.class, "sImageUrl", false, "S_IMAGE_URL");
            f6056d = new f(3, String.class, "sTargetUrl", false, "S_TARGET_URL");
        }
    }

    protected final /* synthetic */ Object m3752a(Object obj, long j) {
        ((Banner) obj).f5613a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3753a(SQLiteStatement sQLiteStatement, Object obj) {
        Banner banner = (Banner) obj;
        sQLiteStatement.clearBindings();
        Long l = banner.f5613a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Integer num = banner.f5614b;
        if (num != null) {
            sQLiteStatement.bindLong(2, (long) num.intValue());
        }
        String str = banner.f5615c;
        if (str != null) {
            sQLiteStatement.bindString(3, str);
        }
        str = banner.f5616d;
        if (str != null) {
            sQLiteStatement.bindString(4, str);
        }
    }

    protected final /* synthetic */ void m3754a(c cVar, Object obj) {
        Banner banner = (Banner) obj;
        cVar.c();
        Long l = banner.f5613a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        Integer num = banner.f5614b;
        if (num != null) {
            cVar.a(2, (long) num.intValue());
        }
        String str = banner.f5615c;
        if (str != null) {
            cVar.a(3, str);
        }
        str = banner.f5616d;
        if (str != null) {
            cVar.a(4, str);
        }
    }

    public BannerDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void m3749a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"BANNER\" (\"_id\" INTEGER PRIMARY KEY ,\"I_POS\" INTEGER,\"S_IMAGE_URL\" TEXT,\"S_TARGET_URL\" TEXT);");
    }

    public final /* synthetic */ Object m3750a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3755b(Cursor cursor, int i) {
        String str = null;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        Integer valueOf2 = cursor.isNull(i + 1) ? null : Integer.valueOf(cursor.getInt(i + 1));
        String string = cursor.isNull(i + 2) ? null : cursor.getString(i + 2);
        if (!cursor.isNull(i + 3)) {
            str = cursor.getString(i + 3);
        }
        return new Banner(valueOf, valueOf2, string, str);
    }
}
