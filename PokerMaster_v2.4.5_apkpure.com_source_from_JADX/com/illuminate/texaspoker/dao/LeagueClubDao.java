package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.LeagueClub;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class LeagueClubDao extends a<LeagueClub, Long> {
    public static final String TABLENAME = "LEAGUE_CLUB";
    private DaoSession f6328a;

    public static class Properties {
        public static final f f6319a;
        public static final f f6320b;
        public static final f f6321c;
        public static final f f6322d;
        public static final f f6323e;
        public static final f f6324f;
        public static final f f6325g;
        public static final f f6326h;
        public static final f f6327i;

        static {
            f6319a = new f(0, Long.class, "id", true, "_id");
            f6320b = new f(1, Long.class, "lLeagueID", false, "L_LEAGUE_ID");
            f6321c = new f(2, Long.class, "lClubID", false, "L_CLUB_ID");
            f6322d = new f(3, String.class, "strRoomName", false, "STR_ROOM_NAME");
            f6323e = new f(4, String.class, "strCreateUserName", false, "STR_CREATE_USER_NAME");
            f6324f = new f(5, Integer.class, "iMembersCount", false, "I_MEMBERS_COUNT");
            f6325g = new f(6, Integer.class, "iMaxMembers", false, "I_MAX_MEMBERS");
            f6326h = new f(7, Long.class, "leagueID", false, "LEAGUE_ID");
            f6327i = new f(8, String.class, "strCover", false, "STR_COVER");
        }
    }

    protected final /* synthetic */ Object m3860a(Object obj, long j) {
        ((LeagueClub) obj).f5913a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3861a(SQLiteStatement sQLiteStatement, Object obj) {
        LeagueClub leagueClub = (LeagueClub) obj;
        sQLiteStatement.clearBindings();
        Long l = leagueClub.f5913a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        l = leagueClub.f5914b;
        if (l != null) {
            sQLiteStatement.bindLong(2, l.longValue());
        }
        l = leagueClub.f5915c;
        if (l != null) {
            sQLiteStatement.bindLong(3, l.longValue());
        }
        String str = leagueClub.f5916d;
        if (str != null) {
            sQLiteStatement.bindString(4, str);
        }
        str = leagueClub.f5917e;
        if (str != null) {
            sQLiteStatement.bindString(5, str);
        }
        Integer num = leagueClub.f5918f;
        if (num != null) {
            sQLiteStatement.bindLong(6, (long) num.intValue());
        }
        num = leagueClub.f5919g;
        if (num != null) {
            sQLiteStatement.bindLong(7, (long) num.intValue());
        }
        l = leagueClub.f5920h;
        if (l != null) {
            sQLiteStatement.bindLong(8, l.longValue());
        }
        str = leagueClub.f5921i;
        if (str != null) {
            sQLiteStatement.bindString(9, str);
        }
    }

    protected final /* synthetic */ void m3862a(c cVar, Object obj) {
        LeagueClub leagueClub = (LeagueClub) obj;
        cVar.c();
        Long l = leagueClub.f5913a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        l = leagueClub.f5914b;
        if (l != null) {
            cVar.a(2, l.longValue());
        }
        l = leagueClub.f5915c;
        if (l != null) {
            cVar.a(3, l.longValue());
        }
        String str = leagueClub.f5916d;
        if (str != null) {
            cVar.a(4, str);
        }
        str = leagueClub.f5917e;
        if (str != null) {
            cVar.a(5, str);
        }
        Integer num = leagueClub.f5918f;
        if (num != null) {
            cVar.a(6, (long) num.intValue());
        }
        num = leagueClub.f5919g;
        if (num != null) {
            cVar.a(7, (long) num.intValue());
        }
        l = leagueClub.f5920h;
        if (l != null) {
            cVar.a(8, l.longValue());
        }
        str = leagueClub.f5921i;
        if (str != null) {
            cVar.a(9, str);
        }
    }

    protected final /* bridge */ /* synthetic */ void m3864b(Object obj) {
        LeagueClubDao leagueClubDao;
        LeagueClub leagueClub = (LeagueClub) obj;
        super.b(leagueClub);
        DaoSession daoSession = this.f6328a;
        leagueClub.f5923k = daoSession;
        if (daoSession != null) {
            leagueClubDao = daoSession.f6437L;
        } else {
            leagueClubDao = null;
        }
        leagueClub.f5924l = leagueClubDao;
    }

    public LeagueClubDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.f6328a = daoSession;
    }

    public static void m3857a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"LEAGUE_CLUB\" (\"_id\" INTEGER PRIMARY KEY ,\"L_LEAGUE_ID\" INTEGER,\"L_CLUB_ID\" INTEGER,\"STR_ROOM_NAME\" TEXT,\"STR_CREATE_USER_NAME\" TEXT,\"I_MEMBERS_COUNT\" INTEGER,\"I_MAX_MEMBERS\" INTEGER,\"LEAGUE_ID\" INTEGER,\"STR_COVER\" TEXT);");
    }

    public final /* synthetic */ Object m3858a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3863b(Cursor cursor, int i) {
        String str = null;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        Long valueOf2 = cursor.isNull(i + 1) ? null : Long.valueOf(cursor.getLong(i + 1));
        Long valueOf3 = cursor.isNull(i + 2) ? null : Long.valueOf(cursor.getLong(i + 2));
        String string = cursor.isNull(i + 3) ? null : cursor.getString(i + 3);
        String string2 = cursor.isNull(i + 4) ? null : cursor.getString(i + 4);
        Integer valueOf4 = cursor.isNull(i + 5) ? null : Integer.valueOf(cursor.getInt(i + 5));
        Integer valueOf5 = cursor.isNull(i + 6) ? null : Integer.valueOf(cursor.getInt(i + 6));
        Long valueOf6 = cursor.isNull(i + 7) ? null : Long.valueOf(cursor.getLong(i + 7));
        if (!cursor.isNull(i + 8)) {
            str = cursor.getString(i + 8);
        }
        return new LeagueClub(valueOf, valueOf2, valueOf3, string, string2, valueOf4, valueOf5, valueOf6, str);
    }
}
