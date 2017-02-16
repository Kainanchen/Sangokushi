package com.illuminate.texaspoker.dao;

import a.does.not.Exists2;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.FriendAlbum;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class FriendAlbumDao extends a<FriendAlbum, Long> {
    public static final String TABLENAME = "FRIEND_ALBUM";

    public static class Properties {
        public static final f f6233a;
        public static final f f6234b;
        public static final f f6235c;
        public static final f f6236d;
        public static final f f6237e;

        static {
            f6233a = new f(0, Long.class, "id", true, "_id");
            f6234b = new f(1, Integer.class, "iSeq", false, "I_SEQ");
            f6235c = new f(2, Long.class, "uuid", false, "UUID");
            f6236d = new f(3, String.class, "strBigUrl", false, "STR_BIG_URL");
            f6237e = new f(4, String.class, "strSmallUrl", false, "STR_SMALL_URL");
        }
    }

    static {
        fixHelper.fixfunc(new int[]{1105, 1106, 1107, 1108, 1109, 1110, 1111});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native FriendAlbumDao(org.a.a.c.a aVar, DaoSession daoSession);

    public final native /* synthetic */ Object m3829a(Cursor cursor, int i);

    public final native /* bridge */ /* synthetic */ Object m3830a(Object obj);

    protected final native /* synthetic */ Object m3831a(Object obj, long j);

    protected final native /* synthetic */ void m3832a(SQLiteStatement sQLiteStatement, Object obj);

    protected final native /* synthetic */ void m3833a(c cVar, Object obj);

    public final native /* synthetic */ Object m3834b(Cursor cursor, int i);

    public static void m3828a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"FRIEND_ALBUM\" (\"_id\" INTEGER PRIMARY KEY ,\"I_SEQ\" INTEGER,\"UUID\" INTEGER,\"STR_BIG_URL\" TEXT,\"STR_SMALL_URL\" TEXT);");
    }
}
