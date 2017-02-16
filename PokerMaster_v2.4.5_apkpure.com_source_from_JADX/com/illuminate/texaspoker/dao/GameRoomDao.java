package com.illuminate.texaspoker.dao;

import a.does.not.Exists2;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class GameRoomDao extends a<GameRoom, Long> {
    public static final String TABLENAME = "GAME_ROOM";
    private DaoSession f6318a;

    public static class Properties {
        public static final f f6280A;
        public static final f f6281B;
        public static final f f6282C;
        public static final f f6283D;
        public static final f f6284E;
        public static final f f6285F;
        public static final f f6286G;
        public static final f f6287H;
        public static final f f6288I;
        public static final f f6289J;
        public static final f f6290K;
        public static final f f6291L;
        public static final f f6292a;
        public static final f f6293b;
        public static final f f6294c;
        public static final f f6295d;
        public static final f f6296e;
        public static final f f6297f;
        public static final f f6298g;
        public static final f f6299h;
        public static final f f6300i;
        public static final f f6301j;
        public static final f f6302k;
        public static final f f6303l;
        public static final f f6304m;
        public static final f f6305n;
        public static final f f6306o;
        public static final f f6307p;
        public static final f f6308q;
        public static final f f6309r;
        public static final f f6310s;
        public static final f f6311t;
        public static final f f6312u;
        public static final f f6313v;
        public static final f f6314w;
        public static final f f6315x;
        public static final f f6316y;
        public static final f f6317z;

        static {
            f6292a = new f(0, Long.class, "id", true, "_id");
            f6293b = new f(1, Boolean.class, "bIsNew", false, "B_IS_NEW");
            f6294c = new f(2, Boolean.class, "bIsQuick", false, "B_IS_QUICK");
            f6295d = new f(3, Boolean.class, "bStarted", false, "B_STARTED");
            f6296e = new f(4, Boolean.class, "bInGame", false, "B_IN_GAME");
            f6297f = new f(5, Boolean.class, "bSignupInviting", false, "B_SIGNUP_INVITING");
            f6298g = new f(6, Boolean.class, "bBuyinControl", false, "B_BUYIN_CONTROL");
            f6299h = new f(7, Boolean.class, "bReBuyin", false, "B_RE_BUYIN");
            f6300i = new f(8, Integer.class, "bPrivateRoom", false, "B_PRIVATE_ROOM");
            f6301j = new f(9, Integer.class, "eCreateRoomType", false, "E_CREATE_ROOM_TYPE");
            f6302k = new f(10, Integer.class, "eGameRoomType", false, "E_GAME_ROOM_TYPE");
            f6303l = new f(11, Integer.class, "eVipType", false, "E_VIP_TYPE");
            f6304m = new f(12, Integer.class, "eGameRoomSeniorType", false, "E_GAME_ROOM_SENIOR_TYPE");
            f6305n = new f(13, Integer.class, "eSNGRoomtype", false, "E_SNGROOMTYPE");
            f6306o = new f(14, Integer.class, "iGameRoomUserMaxNums", false, "I_GAME_ROOM_USER_MAX_NUMS");
            f6307p = new f(15, Integer.class, "iGameRoomUserNums", false, "I_GAME_ROOM_USER_NUMS");
            f6308q = new f(16, Long.class, "lCreateTime", false, "L_CREATE_TIME");
            f6309r = new f(17, Long.class, "lBigBlinds", false, "L_BIG_BLINDS");
            f6310s = new f(18, Long.class, "lBuyIn", false, "L_BUY_IN");
            f6311t = new f(19, Long.class, "lDuration", false, "L_DURATION");
            f6312u = new f(20, Long.class, "lGameRoomId", false, "L_GAME_ROOM_ID");
            f6313v = new f(21, Long.class, "lSmallBlinds", false, "L_SMALL_BLINDS");
            f6314w = new f(22, Long.class, "lStartTime", false, "L_START_TIME");
            f6315x = new f(23, Long.class, "lChatRoomId", false, "L_CHAT_ROOM_ID");
            f6316y = new f(24, Integer.class, "lCancelWaitInterval", false, "L_CANCEL_WAIT_INTERVAL");
            f6317z = new f(25, Integer.class, "iAnte", false, "I_ANTE");
            f6280A = new f(26, String.class, "sFromMsg", false, "S_FROM_MSG");
            f6281B = new f(27, String.class, "strOwnerName", false, "STR_OWNER_NAME");
            f6282C = new f(28, String.class, "strRoomCode", false, "STR_ROOM_CODE");
            f6283D = new f(29, String.class, "strRoomName", false, "STR_ROOM_NAME");
            f6284E = new f(30, Long.class, "lCreateUserUuid", false, "L_CREATE_USER_UUID");
            f6285F = new f(31, Long.class, "createUserId", false, "CREATE_USER_ID");
            f6286G = new f(32, Boolean.class, "bIPLimit", false, "B_IPLIMIT");
            f6287H = new f(33, Boolean.class, "bGPSLimit", false, "B_GPSLIMIT");
            f6288I = new f(34, Long.class, "lLeagueID", false, "L_LEAGUE_ID");
            f6289J = new f(35, String.class, "sLeagueName", false, "S_LEAGUE_NAME");
            f6290K = new f(36, String.class, "sFromClubUrl", false, "S_FROM_CLUB_URL");
            f6291L = new f(37, String.class, "sFromClubCreatorName", false, "S_FROM_CLUB_CREATOR_NAME");
        }
    }

    static {
        fixHelper.fixfunc(new int[]{2615, 2616, 2617, 2618, 2619, 2620, 2621, 2622});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native GameRoomDao(org.a.a.c.a aVar, DaoSession daoSession);

    public final native /* synthetic */ Object m3850a(Cursor cursor, int i);

    public final native /* bridge */ /* synthetic */ Object m3851a(Object obj);

    protected final native /* synthetic */ Object m3852a(Object obj, long j);

    protected final native /* synthetic */ void m3853a(SQLiteStatement sQLiteStatement, Object obj);

    protected final native /* synthetic */ void m3854a(c cVar, Object obj);

    public final native /* synthetic */ Object m3855b(Cursor cursor, int i);

    protected final native /* bridge */ /* synthetic */ void m3856b(Object obj);

    public static void m3849a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"GAME_ROOM\" (\"_id\" INTEGER PRIMARY KEY ,\"B_IS_NEW\" INTEGER,\"B_IS_QUICK\" INTEGER,\"B_STARTED\" INTEGER,\"B_IN_GAME\" INTEGER,\"B_SIGNUP_INVITING\" INTEGER,\"B_BUYIN_CONTROL\" INTEGER,\"B_RE_BUYIN\" INTEGER,\"B_PRIVATE_ROOM\" INTEGER,\"E_CREATE_ROOM_TYPE\" INTEGER,\"E_GAME_ROOM_TYPE\" INTEGER,\"E_VIP_TYPE\" INTEGER,\"E_GAME_ROOM_SENIOR_TYPE\" INTEGER,\"E_SNGROOMTYPE\" INTEGER,\"I_GAME_ROOM_USER_MAX_NUMS\" INTEGER,\"I_GAME_ROOM_USER_NUMS\" INTEGER,\"L_CREATE_TIME\" INTEGER,\"L_BIG_BLINDS\" INTEGER,\"L_BUY_IN\" INTEGER,\"L_DURATION\" INTEGER,\"L_GAME_ROOM_ID\" INTEGER,\"L_SMALL_BLINDS\" INTEGER,\"L_START_TIME\" INTEGER,\"L_CHAT_ROOM_ID\" INTEGER,\"L_CANCEL_WAIT_INTERVAL\" INTEGER,\"I_ANTE\" INTEGER,\"S_FROM_MSG\" TEXT,\"STR_OWNER_NAME\" TEXT,\"STR_ROOM_CODE\" TEXT,\"STR_ROOM_NAME\" TEXT,\"L_CREATE_USER_UUID\" INTEGER," + "\"CREATE_USER_ID\" INTEGER,\"B_IPLIMIT\" INTEGER,\"B_GPSLIMIT\" INTEGER,\"L_LEAGUE_ID\" INTEGER,\"S_LEAGUE_NAME\" TEXT,\"S_FROM_CLUB_URL\" TEXT,\"S_FROM_CLUB_CREATOR_NAME\" TEXT);");
    }
}
