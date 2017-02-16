package com.illuminate.texaspoker.dao;

import a.does.not.Exists2;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.ClubAlbum;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class ClubAlbumDao extends a<ClubAlbum, Long> {
    public static final String TABLENAME = "CLUB_ALBUM";

    public static class Properties {
        public static final f f6201a = null;
        public static final f f6202b = null;
        public static final f f6203c = null;
        public static final f f6204d = null;
        public static final f f6205e = null;

        static {
            fixHelper.fixfunc(new int[]{2839, 1});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        static void __clinit__() {
            f6201a = new f(0, Long.class, "id", true, "_id");
            f6202b = new f(1, Integer.class, "iSeq", false, "I_SEQ");
            f6203c = new f(2, Long.class, "lClubId", false, "L_CLUB_ID");
            f6204d = new f(3, String.class, "strBigUrl", false, "STR_BIG_URL");
            f6205e = new f(4, String.class, "strSmallUrl", false, "STR_SMALL_URL");
        }
    }

    static {
        fixHelper.fixfunc(new int[]{905, 906, 907, 908, 909, 910, 911});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native ClubAlbumDao(org.a.a.c.a aVar, DaoSession daoSession);

    public final native /* synthetic */ Object m3800a(Cursor cursor, int i);

    public final native /* bridge */ /* synthetic */ Object m3801a(Object obj);

    protected final native /* synthetic */ Object m3802a(Object obj, long j);

    protected final native /* synthetic */ void m3803a(SQLiteStatement sQLiteStatement, Object obj);

    protected final native /* synthetic */ void m3804a(c cVar, Object obj);

    public final native /* synthetic */ Object m3805b(Cursor cursor, int i);

    public static void m3799a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"CLUB_ALBUM\" (\"_id\" INTEGER PRIMARY KEY ,\"I_SEQ\" INTEGER,\"L_CLUB_ID\" INTEGER,\"STR_BIG_URL\" TEXT,\"STR_SMALL_URL\" TEXT);");
    }
}
