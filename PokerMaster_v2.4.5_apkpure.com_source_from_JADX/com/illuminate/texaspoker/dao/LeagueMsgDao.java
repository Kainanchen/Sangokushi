package com.illuminate.texaspoker.dao;

import a.does.not.Exists2;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.LeagueMsg;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class LeagueMsgDao extends a<LeagueMsg, Long> {
    public static final String TABLENAME = "LEAGUE_MSG";
    private DaoSession f6351a;

    public static class Properties {
        public static final f f6339a;
        public static final f f6340b;
        public static final f f6341c;
        public static final f f6342d;
        public static final f f6343e;
        public static final f f6344f;
        public static final f f6345g;
        public static final f f6346h;
        public static final f f6347i;
        public static final f f6348j;
        public static final f f6349k;
        public static final f f6350l;

        static {
            f6339a = new f(0, Long.class, "id", true, "_id");
            f6340b = new f(1, Long.class, "lClubId", false, "L_CLUB_ID");
            f6341c = new f(2, Long.class, "lCreateTime", false, "L_CREATE_TIME");
            f6342d = new f(3, Long.class, "lMsgID", false, "L_MSG_ID");
            f6343e = new f(4, Integer.class, "eLeagueMessageType", false, "E_LEAGUE_MESSAGE_TYPE");
            f6344f = new f(5, Integer.class, "iStatus", false, "I_STATUS");
            f6345g = new f(6, Long.class, "lLeagueID", false, "L_LEAGUE_ID");
            f6346h = new f(7, Long.class, "fromClubId", false, "FROM_CLUB_ID");
            f6347i = new f(8, String.class, "fromClubName", false, "FROM_CLUB_NAME");
            f6348j = new f(9, String.class, "fromClubStrCover", false, "FROM_CLUB_STR_COVER");
            f6349k = new f(10, String.class, "sFromNick", false, "S_FROM_NICK");
            f6350l = new f(11, String.class, "sMsg", false, "S_MSG");
        }
    }

    static {
        fixHelper.fixfunc(new int[]{2951, 2952, 2953, 2954, 2955, 2956, 2957, 2958});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native LeagueMsgDao(org.a.a.c.a aVar, DaoSession daoSession);

    public final native /* synthetic */ Object m3873a(Cursor cursor, int i);

    public final native /* bridge */ /* synthetic */ Object m3874a(Object obj);

    protected final native /* synthetic */ Object m3875a(Object obj, long j);

    protected final native /* synthetic */ void m3876a(SQLiteStatement sQLiteStatement, Object obj);

    protected final native /* synthetic */ void m3877a(c cVar, Object obj);

    public final native /* synthetic */ Object m3878b(Cursor cursor, int i);

    protected final native /* bridge */ /* synthetic */ void m3879b(Object obj);

    public static void m3872a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"LEAGUE_MSG\" (\"_id\" INTEGER PRIMARY KEY ,\"L_CLUB_ID\" INTEGER,\"L_CREATE_TIME\" INTEGER,\"L_MSG_ID\" INTEGER,\"E_LEAGUE_MESSAGE_TYPE\" INTEGER,\"I_STATUS\" INTEGER,\"L_LEAGUE_ID\" INTEGER,\"FROM_CLUB_ID\" INTEGER,\"FROM_CLUB_NAME\" TEXT,\"FROM_CLUB_STR_COVER\" TEXT,\"S_FROM_NICK\" TEXT,\"S_MSG\" TEXT);");
    }
}
