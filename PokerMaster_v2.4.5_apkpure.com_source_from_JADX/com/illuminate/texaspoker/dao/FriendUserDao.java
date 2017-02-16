package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class FriendUserDao extends a<FriendUser, Long> {
    public static final String TABLENAME = "FRIEND_USER";

    public static class Properties {
        public static final f f6238A;
        public static final f f6239B;
        public static final f f6240C;
        public static final f f6241a;
        public static final f f6242b;
        public static final f f6243c;
        public static final f f6244d;
        public static final f f6245e;
        public static final f f6246f;
        public static final f f6247g;
        public static final f f6248h;
        public static final f f6249i;
        public static final f f6250j;
        public static final f f6251k;
        public static final f f6252l;
        public static final f f6253m;
        public static final f f6254n;
        public static final f f6255o;
        public static final f f6256p;
        public static final f f6257q;
        public static final f f6258r;
        public static final f f6259s;
        public static final f f6260t;
        public static final f f6261u;
        public static final f f6262v;
        public static final f f6263w;
        public static final f f6264x;
        public static final f f6265y;
        public static final f f6266z;

        static {
            f6241a = new f(0, Long.class, "id", true, "_id");
            f6242b = new f(1, Boolean.class, "bNewAlert", false, "B_NEW_ALERT");
            f6243c = new f(2, Boolean.class, "bUploaded", false, "B_UPLOADED");
            f6244d = new f(3, Boolean.class, "isDelete", false, "IS_DELETE");
            f6245e = new f(4, Integer.class, "eFriendState", false, "E_FRIEND_STATE");
            f6246f = new f(5, Integer.class, "eOrderState", false, "E_ORDER_STATE");
            f6247g = new f(6, Integer.class, "eType", false, "E_TYPE");
            f6248h = new f(7, Integer.class, "eUserState", false, "E_USER_STATE");
            f6249i = new f(8, Integer.class, "eVipType", false, "E_VIP_TYPE");
            f6250j = new f(9, Integer.class, "fromType", false, "FROM_TYPE");
            f6251k = new f(10, Integer.class, "iGender", false, "I_GENDER");
            f6252l = new f(11, String.class, "firstLetter", false, "FIRST_LETTER");
            f6253m = new f(12, String.class, "lastMsg", false, "LAST_MSG");
            f6254n = new f(13, String.class, "strSign", false, "STR_SIGN");
            f6255o = new f(14, String.class, "strCover", false, "STR_COVER");
            f6256p = new f(15, String.class, "strCoverBig", false, "STR_COVER_BIG");
            f6257q = new f(16, String.class, "strNick", false, "STR_NICK");
            f6258r = new f(17, String.class, "sCountryCode", false, "S_COUNTRY_CODE");
            f6259s = new f(18, String.class, "strGameRoomName", false, "STR_GAME_ROOM_NAME");
            f6260t = new f(19, String.class, "strRemark", false, "STR_REMARK");
            f6261u = new f(20, Long.class, "uuid", false, "UUID");
            f6262v = new f(21, Long.class, "lastLogin", false, "LAST_LOGIN");
            f6263w = new f(22, Long.class, "lastMsgTime", false, "LAST_MSG_TIME");
            f6264x = new f(23, Long.class, "lTotalGames", false, "L_TOTAL_GAMES");
            f6265y = new f(24, Long.class, "lTotalHands", false, "L_TOTAL_HANDS");
            f6266z = new f(25, Long.class, "lVpipCount", false, "L_VPIP_COUNT");
            f6238A = new f(26, Long.class, "lWinCount", false, "L_WIN_COUNT");
            f6239B = new f(27, Long.class, "lPopularity", false, "L_POPULARITY");
            f6240C = new f(28, Long.class, "lRoomId", false, "L_ROOM_ID");
        }
    }

    protected final /* synthetic */ Object m3838a(Object obj, long j) {
        ((FriendUser) obj).f5822a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3839a(SQLiteStatement sQLiteStatement, Object obj) {
        long j;
        long j2 = 1;
        FriendUser friendUser = (FriendUser) obj;
        sQLiteStatement.clearBindings();
        Long l = friendUser.f5822a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Boolean bool = friendUser.f5823b;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(2, j);
        }
        bool = friendUser.f5824c;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(3, j);
        }
        bool = friendUser.f5825d;
        if (bool != null) {
            if (!bool.booleanValue()) {
                j2 = 0;
            }
            sQLiteStatement.bindLong(4, j2);
        }
        Integer num = friendUser.f5826e;
        if (num != null) {
            sQLiteStatement.bindLong(5, (long) num.intValue());
        }
        num = friendUser.f5827f;
        if (num != null) {
            sQLiteStatement.bindLong(6, (long) num.intValue());
        }
        num = friendUser.f5828g;
        if (num != null) {
            sQLiteStatement.bindLong(7, (long) num.intValue());
        }
        num = friendUser.f5829h;
        if (num != null) {
            sQLiteStatement.bindLong(8, (long) num.intValue());
        }
        num = friendUser.f5830i;
        if (num != null) {
            sQLiteStatement.bindLong(9, (long) num.intValue());
        }
        num = friendUser.f5831j;
        if (num != null) {
            sQLiteStatement.bindLong(10, (long) num.intValue());
        }
        num = friendUser.f5832k;
        if (num != null) {
            sQLiteStatement.bindLong(11, (long) num.intValue());
        }
        String str = friendUser.f5833l;
        if (str != null) {
            sQLiteStatement.bindString(12, str);
        }
        str = friendUser.f5834m;
        if (str != null) {
            sQLiteStatement.bindString(13, str);
        }
        str = friendUser.f5835n;
        if (str != null) {
            sQLiteStatement.bindString(14, str);
        }
        str = friendUser.f5836o;
        if (str != null) {
            sQLiteStatement.bindString(15, str);
        }
        str = friendUser.f5837p;
        if (str != null) {
            sQLiteStatement.bindString(16, str);
        }
        str = friendUser.f5838q;
        if (str != null) {
            sQLiteStatement.bindString(17, str);
        }
        str = friendUser.f5839r;
        if (str != null) {
            sQLiteStatement.bindString(18, str);
        }
        str = friendUser.f5840s;
        if (str != null) {
            sQLiteStatement.bindString(19, str);
        }
        str = friendUser.f5841t;
        if (str != null) {
            sQLiteStatement.bindString(20, str);
        }
        l = friendUser.f5842u;
        if (l != null) {
            sQLiteStatement.bindLong(21, l.longValue());
        }
        l = friendUser.f5843v;
        if (l != null) {
            sQLiteStatement.bindLong(22, l.longValue());
        }
        l = friendUser.f5844w;
        if (l != null) {
            sQLiteStatement.bindLong(23, l.longValue());
        }
        l = friendUser.f5845x;
        if (l != null) {
            sQLiteStatement.bindLong(24, l.longValue());
        }
        l = friendUser.f5846y;
        if (l != null) {
            sQLiteStatement.bindLong(25, l.longValue());
        }
        l = friendUser.f5847z;
        if (l != null) {
            sQLiteStatement.bindLong(26, l.longValue());
        }
        l = friendUser.f5819A;
        if (l != null) {
            sQLiteStatement.bindLong(27, l.longValue());
        }
        l = friendUser.f5820B;
        if (l != null) {
            sQLiteStatement.bindLong(28, l.longValue());
        }
        l = friendUser.f5821C;
        if (l != null) {
            sQLiteStatement.bindLong(29, l.longValue());
        }
    }

    protected final /* synthetic */ void m3840a(c cVar, Object obj) {
        long j;
        long j2 = 1;
        FriendUser friendUser = (FriendUser) obj;
        cVar.c();
        Long l = friendUser.f5822a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        Boolean bool = friendUser.f5823b;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(2, j);
        }
        bool = friendUser.f5824c;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(3, j);
        }
        bool = friendUser.f5825d;
        if (bool != null) {
            if (!bool.booleanValue()) {
                j2 = 0;
            }
            cVar.a(4, j2);
        }
        Integer num = friendUser.f5826e;
        if (num != null) {
            cVar.a(5, (long) num.intValue());
        }
        num = friendUser.f5827f;
        if (num != null) {
            cVar.a(6, (long) num.intValue());
        }
        num = friendUser.f5828g;
        if (num != null) {
            cVar.a(7, (long) num.intValue());
        }
        num = friendUser.f5829h;
        if (num != null) {
            cVar.a(8, (long) num.intValue());
        }
        num = friendUser.f5830i;
        if (num != null) {
            cVar.a(9, (long) num.intValue());
        }
        num = friendUser.f5831j;
        if (num != null) {
            cVar.a(10, (long) num.intValue());
        }
        num = friendUser.f5832k;
        if (num != null) {
            cVar.a(11, (long) num.intValue());
        }
        String str = friendUser.f5833l;
        if (str != null) {
            cVar.a(12, str);
        }
        str = friendUser.f5834m;
        if (str != null) {
            cVar.a(13, str);
        }
        str = friendUser.f5835n;
        if (str != null) {
            cVar.a(14, str);
        }
        str = friendUser.f5836o;
        if (str != null) {
            cVar.a(15, str);
        }
        str = friendUser.f5837p;
        if (str != null) {
            cVar.a(16, str);
        }
        str = friendUser.f5838q;
        if (str != null) {
            cVar.a(17, str);
        }
        str = friendUser.f5839r;
        if (str != null) {
            cVar.a(18, str);
        }
        str = friendUser.f5840s;
        if (str != null) {
            cVar.a(19, str);
        }
        str = friendUser.f5841t;
        if (str != null) {
            cVar.a(20, str);
        }
        l = friendUser.f5842u;
        if (l != null) {
            cVar.a(21, l.longValue());
        }
        l = friendUser.f5843v;
        if (l != null) {
            cVar.a(22, l.longValue());
        }
        l = friendUser.f5844w;
        if (l != null) {
            cVar.a(23, l.longValue());
        }
        l = friendUser.f5845x;
        if (l != null) {
            cVar.a(24, l.longValue());
        }
        l = friendUser.f5846y;
        if (l != null) {
            cVar.a(25, l.longValue());
        }
        l = friendUser.f5847z;
        if (l != null) {
            cVar.a(26, l.longValue());
        }
        l = friendUser.f5819A;
        if (l != null) {
            cVar.a(27, l.longValue());
        }
        l = friendUser.f5820B;
        if (l != null) {
            cVar.a(28, l.longValue());
        }
        l = friendUser.f5821C;
        if (l != null) {
            cVar.a(29, l.longValue());
        }
    }

    public FriendUserDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void m3835a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"FRIEND_USER\" (\"_id\" INTEGER PRIMARY KEY ,\"B_NEW_ALERT\" INTEGER,\"B_UPLOADED\" INTEGER,\"IS_DELETE\" INTEGER,\"E_FRIEND_STATE\" INTEGER,\"E_ORDER_STATE\" INTEGER,\"E_TYPE\" INTEGER,\"E_USER_STATE\" INTEGER,\"E_VIP_TYPE\" INTEGER,\"FROM_TYPE\" INTEGER,\"I_GENDER\" INTEGER,\"FIRST_LETTER\" TEXT,\"LAST_MSG\" TEXT,\"STR_SIGN\" TEXT,\"STR_COVER\" TEXT,\"STR_COVER_BIG\" TEXT,\"STR_NICK\" TEXT,\"S_COUNTRY_CODE\" TEXT,\"STR_GAME_ROOM_NAME\" TEXT,\"STR_REMARK\" TEXT,\"UUID\" INTEGER,\"LAST_LOGIN\" INTEGER,\"LAST_MSG_TIME\" INTEGER,\"L_TOTAL_GAMES\" INTEGER,\"L_TOTAL_HANDS\" INTEGER,\"L_VPIP_COUNT\" INTEGER,\"L_WIN_COUNT\" INTEGER,\"L_POPULARITY\" INTEGER,\"L_ROOM_ID\" INTEGER);");
    }

    public final /* synthetic */ Object m3836a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3841b(Cursor cursor, int i) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Long l;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        if (cursor.isNull(i + 1)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i + 1) != (short) 0);
        }
        if (cursor.isNull(i + 2)) {
            bool2 = null;
        } else {
            bool2 = Boolean.valueOf(cursor.getShort(i + 2) != (short) 0);
        }
        if (cursor.isNull(i + 3)) {
            bool3 = null;
        } else {
            bool3 = Boolean.valueOf(cursor.getShort(i + 3) != (short) 0);
        }
        Integer valueOf2 = cursor.isNull(i + 4) ? null : Integer.valueOf(cursor.getInt(i + 4));
        Integer valueOf3 = cursor.isNull(i + 5) ? null : Integer.valueOf(cursor.getInt(i + 5));
        Integer valueOf4 = cursor.isNull(i + 6) ? null : Integer.valueOf(cursor.getInt(i + 6));
        Integer valueOf5 = cursor.isNull(i + 7) ? null : Integer.valueOf(cursor.getInt(i + 7));
        Integer valueOf6 = cursor.isNull(i + 8) ? null : Integer.valueOf(cursor.getInt(i + 8));
        Integer valueOf7 = cursor.isNull(i + 9) ? null : Integer.valueOf(cursor.getInt(i + 9));
        Integer valueOf8 = cursor.isNull(i + 10) ? null : Integer.valueOf(cursor.getInt(i + 10));
        String string = cursor.isNull(i + 11) ? null : cursor.getString(i + 11);
        String string2 = cursor.isNull(i + 12) ? null : cursor.getString(i + 12);
        String string3 = cursor.isNull(i + 13) ? null : cursor.getString(i + 13);
        String string4 = cursor.isNull(i + 14) ? null : cursor.getString(i + 14);
        String string5 = cursor.isNull(i + 15) ? null : cursor.getString(i + 15);
        String string6 = cursor.isNull(i + 16) ? null : cursor.getString(i + 16);
        String string7 = cursor.isNull(i + 17) ? null : cursor.getString(i + 17);
        String string8 = cursor.isNull(i + 18) ? null : cursor.getString(i + 18);
        String string9 = cursor.isNull(i + 19) ? null : cursor.getString(i + 19);
        Long valueOf9 = cursor.isNull(i + 20) ? null : Long.valueOf(cursor.getLong(i + 20));
        Long valueOf10 = cursor.isNull(i + 21) ? null : Long.valueOf(cursor.getLong(i + 21));
        Long valueOf11 = cursor.isNull(i + 22) ? null : Long.valueOf(cursor.getLong(i + 22));
        Long valueOf12 = cursor.isNull(i + 23) ? null : Long.valueOf(cursor.getLong(i + 23));
        Long valueOf13 = cursor.isNull(i + 24) ? null : Long.valueOf(cursor.getLong(i + 24));
        Long valueOf14 = cursor.isNull(i + 25) ? null : Long.valueOf(cursor.getLong(i + 25));
        Long valueOf15 = cursor.isNull(i + 26) ? null : Long.valueOf(cursor.getLong(i + 26));
        Long valueOf16 = cursor.isNull(i + 27) ? null : Long.valueOf(cursor.getLong(i + 27));
        if (cursor.isNull(i + 28)) {
            l = null;
        } else {
            l = Long.valueOf(cursor.getLong(i + 28));
        }
        return new FriendUser(valueOf, bool, bool2, bool3, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, string, string2, string3, string4, string5, string6, string7, string8, string9, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, l);
    }
}
