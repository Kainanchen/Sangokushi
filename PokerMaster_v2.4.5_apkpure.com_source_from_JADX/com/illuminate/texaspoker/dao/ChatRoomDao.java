package com.illuminate.texaspoker.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class ChatRoomDao extends a<ChatRoom, Long> {
    public static final String TABLENAME = "CHAT_ROOM";
    private DaoSession f6191a;

    public static class Properties {
        public static final f f6143A;
        public static final f f6144B;
        public static final f f6145C;
        public static final f f6146D;
        public static final f f6147E;
        public static final f f6148F;
        public static final f f6149G;
        public static final f f6150H;
        public static final f f6151I;
        public static final f f6152J;
        public static final f f6153K;
        public static final f f6154L;
        public static final f f6155M;
        public static final f f6156N;
        public static final f f6157O;
        public static final f f6158P;
        public static final f f6159Q;
        public static final f f6160R;
        public static final f f6161S;
        public static final f f6162T;
        public static final f f6163U;
        public static final f f6164V;
        public static final f f6165a;
        public static final f f6166b;
        public static final f f6167c;
        public static final f f6168d;
        public static final f f6169e;
        public static final f f6170f;
        public static final f f6171g;
        public static final f f6172h;
        public static final f f6173i;
        public static final f f6174j;
        public static final f f6175k;
        public static final f f6176l;
        public static final f f6177m;
        public static final f f6178n;
        public static final f f6179o;
        public static final f f6180p;
        public static final f f6181q;
        public static final f f6182r;
        public static final f f6183s;
        public static final f f6184t;
        public static final f f6185u;
        public static final f f6186v;
        public static final f f6187w;
        public static final f f6188x;
        public static final f f6189y;
        public static final f f6190z;

        static {
            f6165a = new f(0, Long.class, "id", true, "_id");
            f6166b = new f(1, Long.class, "lChatRoomId", false, "L_CHAT_ROOM_ID");
            f6167c = new f(2, Long.class, "lClubId", false, "L_CLUB_ID");
            f6168d = new f(3, Long.class, "lSmallBlinds", false, "L_SMALL_BLINDS");
            f6169e = new f(4, Long.class, "lBigBlinds", false, "L_BIG_BLINDS");
            f6170f = new f(5, Long.class, "lLastMsgTime", false, "L_LAST_MSG_TIME");
            f6171g = new f(6, Long.class, "lCreateTime", false, "L_CREATE_TIME");
            f6172h = new f(7, Long.class, "createUserId", false, "CREATE_USER_ID");
            f6173i = new f(8, Long.class, "lCreateUser", false, "L_CREATE_USER");
            f6174j = new f(9, Long.class, "lBillId", false, "L_BILL_ID");
            f6175k = new f(10, Long.class, "lQuickGameId", false, "L_QUICK_GAME_ID");
            f6176l = new f(11, Long.class, "localUserId", false, "LOCAL_USER_ID");
            f6177m = new f(12, Long.class, "lFundCoin", false, "L_FUND_COIN");
            f6178n = new f(13, Long.class, "lDuration", false, "L_DURATION");
            f6179o = new f(14, Long.class, "lTotalGain", false, "L_TOTAL_GAIN");
            f6180p = new f(15, String.class, "strRoomName", false, "STR_ROOM_NAME");
            f6181q = new f(16, String.class, "strTempLastMsg", false, "STR_TEMP_LAST_MSG");
            f6182r = new f(17, String.class, "strTempName", false, "STR_TEMP_NAME");
            f6183s = new f(18, String.class, "strRoomCode", false, "STR_ROOM_CODE");
            f6184t = new f(19, String.class, "strLastMsg", false, "STR_LAST_MSG");
            f6185u = new f(20, String.class, "strCover", false, "STR_COVER");
            f6186v = new f(21, String.class, "strCoverBig", false, "STR_COVER_BIG");
            f6187w = new f(22, String.class, "sCryptCode", false, "S_CRYPT_CODE");
            f6188x = new f(23, String.class, "strClubCard", false, "STR_CLUB_CARD");
            f6189y = new f(24, String.class, "strClubDesc", false, "STR_CLUB_DESC");
            f6190z = new f(25, String.class, "strClubLocation", false, "STR_CLUB_LOCATION");
            f6143A = new f(26, Boolean.class, "isDelete", false, "IS_DELETE");
            f6144B = new f(27, Boolean.class, "bIsClub", false, "B_IS_CLUB");
            f6145C = new f(28, Boolean.class, "bIsHot", false, "B_IS_HOT");
            f6146D = new f(29, Boolean.class, "bIsMine", false, "B_IS_MINE");
            f6147E = new f(30, Boolean.class, "bIsQuick", false, "B_IS_QUICK");
            f6148F = new f(31, Boolean.class, "bNewMsgAlert", false, "B_NEW_MSG_ALERT");
            f6149G = new f(32, Boolean.class, "bTop", false, "B_TOP");
            f6150H = new f(33, Boolean.class, "bVerify", false, "B_VERIFY");
            f6151I = new f(34, Integer.class, "eGameRoomType", false, "E_GAME_ROOM_TYPE");
            f6152J = new f(35, Integer.class, "eQuickGameRoomStatus", false, "E_QUICK_GAME_ROOM_STATUS");
            f6153K = new f(36, Integer.class, "eTalkType", false, "E_TALK_TYPE");
            f6154L = new f(37, Integer.class, "iAnte", false, "I_ANTE");
            f6155M = new f(38, Integer.class, "iClubExperience", false, "I_CLUB_EXPERIENCE");
            f6156N = new f(39, Integer.class, "iClubLevel", false, "I_CLUB_LEVEL");
            f6157O = new f(40, Integer.class, "iHotPos", false, "I_HOT_POS");
            f6158P = new f(41, Integer.class, "iMembersCount", false, "I_MEMBERS_COUNT");
            f6159Q = new f(42, Integer.class, "iRoomType", false, "I_ROOM_TYPE");
            f6160R = new f(43, Integer.class, "nMaxMembers", false, "N_MAX_MEMBERS");
            f6161S = new f(44, Integer.class, "nOwnerCreate", false, "N_OWNER_CREATE");
            f6162T = new f(45, Integer.class, "nOwnerInvite", false, "N_OWNER_INVITE");
            f6163U = new f(46, Boolean.class, "bManager", false, "B_MANAGER");
            f6164V = new f(47, Boolean.class, "iManagerCreate", false, "I_MANAGER_CREATE");
        }
    }

    protected final /* synthetic */ Object m3783a(Object obj, long j) {
        ((ChatRoom) obj).f5740a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3784a(SQLiteStatement sQLiteStatement, Object obj) {
        long j;
        long j2 = 1;
        ChatRoom chatRoom = (ChatRoom) obj;
        sQLiteStatement.clearBindings();
        Long l = chatRoom.f5740a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        l = chatRoom.f5741b;
        if (l != null) {
            sQLiteStatement.bindLong(2, l.longValue());
        }
        l = chatRoom.f5742c;
        if (l != null) {
            sQLiteStatement.bindLong(3, l.longValue());
        }
        l = chatRoom.f5743d;
        if (l != null) {
            sQLiteStatement.bindLong(4, l.longValue());
        }
        l = chatRoom.f5744e;
        if (l != null) {
            sQLiteStatement.bindLong(5, l.longValue());
        }
        l = chatRoom.f5745f;
        if (l != null) {
            sQLiteStatement.bindLong(6, l.longValue());
        }
        l = chatRoom.f5746g;
        if (l != null) {
            sQLiteStatement.bindLong(7, l.longValue());
        }
        l = chatRoom.f5747h;
        if (l != null) {
            sQLiteStatement.bindLong(8, l.longValue());
        }
        l = chatRoom.f5748i;
        if (l != null) {
            sQLiteStatement.bindLong(9, l.longValue());
        }
        l = chatRoom.f5749j;
        if (l != null) {
            sQLiteStatement.bindLong(10, l.longValue());
        }
        l = chatRoom.f5750k;
        if (l != null) {
            sQLiteStatement.bindLong(11, l.longValue());
        }
        l = chatRoom.f5751l;
        if (l != null) {
            sQLiteStatement.bindLong(12, l.longValue());
        }
        l = chatRoom.f5752m;
        if (l != null) {
            sQLiteStatement.bindLong(13, l.longValue());
        }
        l = chatRoom.f5753n;
        if (l != null) {
            sQLiteStatement.bindLong(14, l.longValue());
        }
        l = chatRoom.f5754o;
        if (l != null) {
            sQLiteStatement.bindLong(15, l.longValue());
        }
        String str = chatRoom.f5755p;
        if (str != null) {
            sQLiteStatement.bindString(16, str);
        }
        str = chatRoom.f5756q;
        if (str != null) {
            sQLiteStatement.bindString(17, str);
        }
        str = chatRoom.f5757r;
        if (str != null) {
            sQLiteStatement.bindString(18, str);
        }
        str = chatRoom.f5758s;
        if (str != null) {
            sQLiteStatement.bindString(19, str);
        }
        str = chatRoom.f5759t;
        if (str != null) {
            sQLiteStatement.bindString(20, str);
        }
        str = chatRoom.f5760u;
        if (str != null) {
            sQLiteStatement.bindString(21, str);
        }
        str = chatRoom.f5761v;
        if (str != null) {
            sQLiteStatement.bindString(22, str);
        }
        str = chatRoom.f5762w;
        if (str != null) {
            sQLiteStatement.bindString(23, str);
        }
        str = chatRoom.f5763x;
        if (str != null) {
            sQLiteStatement.bindString(24, str);
        }
        str = chatRoom.f5764y;
        if (str != null) {
            sQLiteStatement.bindString(25, str);
        }
        str = chatRoom.f5765z;
        if (str != null) {
            sQLiteStatement.bindString(26, str);
        }
        Boolean bool = chatRoom.f5714A;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(27, j);
        }
        bool = chatRoom.f5715B;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(28, j);
        }
        bool = chatRoom.f5716C;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(29, j);
        }
        bool = chatRoom.f5717D;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(30, j);
        }
        bool = chatRoom.f5718E;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(31, j);
        }
        bool = chatRoom.f5719F;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(32, j);
        }
        bool = chatRoom.f5720G;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(33, j);
        }
        bool = chatRoom.f5721H;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(34, j);
        }
        Integer num = chatRoom.f5722I;
        if (num != null) {
            sQLiteStatement.bindLong(35, (long) num.intValue());
        }
        num = chatRoom.f5723J;
        if (num != null) {
            sQLiteStatement.bindLong(36, (long) num.intValue());
        }
        num = chatRoom.f5724K;
        if (num != null) {
            sQLiteStatement.bindLong(37, (long) num.intValue());
        }
        num = chatRoom.f5725L;
        if (num != null) {
            sQLiteStatement.bindLong(38, (long) num.intValue());
        }
        num = chatRoom.f5726M;
        if (num != null) {
            sQLiteStatement.bindLong(39, (long) num.intValue());
        }
        num = chatRoom.f5727N;
        if (num != null) {
            sQLiteStatement.bindLong(40, (long) num.intValue());
        }
        num = chatRoom.f5728O;
        if (num != null) {
            sQLiteStatement.bindLong(41, (long) num.intValue());
        }
        num = chatRoom.f5729P;
        if (num != null) {
            sQLiteStatement.bindLong(42, (long) num.intValue());
        }
        num = chatRoom.f5730Q;
        if (num != null) {
            sQLiteStatement.bindLong(43, (long) num.intValue());
        }
        num = chatRoom.f5731R;
        if (num != null) {
            sQLiteStatement.bindLong(44, (long) num.intValue());
        }
        num = chatRoom.f5732S;
        if (num != null) {
            sQLiteStatement.bindLong(45, (long) num.intValue());
        }
        num = chatRoom.f5733T;
        if (num != null) {
            sQLiteStatement.bindLong(46, (long) num.intValue());
        }
        bool = chatRoom.f5734U;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(47, j);
        }
        bool = chatRoom.f5735V;
        if (bool != null) {
            if (!bool.booleanValue()) {
                j2 = 0;
            }
            sQLiteStatement.bindLong(48, j2);
        }
    }

    protected final /* synthetic */ void m3785a(c cVar, Object obj) {
        long j;
        long j2 = 1;
        ChatRoom chatRoom = (ChatRoom) obj;
        cVar.c();
        Long l = chatRoom.f5740a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        l = chatRoom.f5741b;
        if (l != null) {
            cVar.a(2, l.longValue());
        }
        l = chatRoom.f5742c;
        if (l != null) {
            cVar.a(3, l.longValue());
        }
        l = chatRoom.f5743d;
        if (l != null) {
            cVar.a(4, l.longValue());
        }
        l = chatRoom.f5744e;
        if (l != null) {
            cVar.a(5, l.longValue());
        }
        l = chatRoom.f5745f;
        if (l != null) {
            cVar.a(6, l.longValue());
        }
        l = chatRoom.f5746g;
        if (l != null) {
            cVar.a(7, l.longValue());
        }
        l = chatRoom.f5747h;
        if (l != null) {
            cVar.a(8, l.longValue());
        }
        l = chatRoom.f5748i;
        if (l != null) {
            cVar.a(9, l.longValue());
        }
        l = chatRoom.f5749j;
        if (l != null) {
            cVar.a(10, l.longValue());
        }
        l = chatRoom.f5750k;
        if (l != null) {
            cVar.a(11, l.longValue());
        }
        l = chatRoom.f5751l;
        if (l != null) {
            cVar.a(12, l.longValue());
        }
        l = chatRoom.f5752m;
        if (l != null) {
            cVar.a(13, l.longValue());
        }
        l = chatRoom.f5753n;
        if (l != null) {
            cVar.a(14, l.longValue());
        }
        l = chatRoom.f5754o;
        if (l != null) {
            cVar.a(15, l.longValue());
        }
        String str = chatRoom.f5755p;
        if (str != null) {
            cVar.a(16, str);
        }
        str = chatRoom.f5756q;
        if (str != null) {
            cVar.a(17, str);
        }
        str = chatRoom.f5757r;
        if (str != null) {
            cVar.a(18, str);
        }
        str = chatRoom.f5758s;
        if (str != null) {
            cVar.a(19, str);
        }
        str = chatRoom.f5759t;
        if (str != null) {
            cVar.a(20, str);
        }
        str = chatRoom.f5760u;
        if (str != null) {
            cVar.a(21, str);
        }
        str = chatRoom.f5761v;
        if (str != null) {
            cVar.a(22, str);
        }
        str = chatRoom.f5762w;
        if (str != null) {
            cVar.a(23, str);
        }
        str = chatRoom.f5763x;
        if (str != null) {
            cVar.a(24, str);
        }
        str = chatRoom.f5764y;
        if (str != null) {
            cVar.a(25, str);
        }
        str = chatRoom.f5765z;
        if (str != null) {
            cVar.a(26, str);
        }
        Boolean bool = chatRoom.f5714A;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(27, j);
        }
        bool = chatRoom.f5715B;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(28, j);
        }
        bool = chatRoom.f5716C;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(29, j);
        }
        bool = chatRoom.f5717D;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(30, j);
        }
        bool = chatRoom.f5718E;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(31, j);
        }
        bool = chatRoom.f5719F;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(32, j);
        }
        bool = chatRoom.f5720G;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(33, j);
        }
        bool = chatRoom.f5721H;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(34, j);
        }
        Integer num = chatRoom.f5722I;
        if (num != null) {
            cVar.a(35, (long) num.intValue());
        }
        num = chatRoom.f5723J;
        if (num != null) {
            cVar.a(36, (long) num.intValue());
        }
        num = chatRoom.f5724K;
        if (num != null) {
            cVar.a(37, (long) num.intValue());
        }
        num = chatRoom.f5725L;
        if (num != null) {
            cVar.a(38, (long) num.intValue());
        }
        num = chatRoom.f5726M;
        if (num != null) {
            cVar.a(39, (long) num.intValue());
        }
        num = chatRoom.f5727N;
        if (num != null) {
            cVar.a(40, (long) num.intValue());
        }
        num = chatRoom.f5728O;
        if (num != null) {
            cVar.a(41, (long) num.intValue());
        }
        num = chatRoom.f5729P;
        if (num != null) {
            cVar.a(42, (long) num.intValue());
        }
        num = chatRoom.f5730Q;
        if (num != null) {
            cVar.a(43, (long) num.intValue());
        }
        num = chatRoom.f5731R;
        if (num != null) {
            cVar.a(44, (long) num.intValue());
        }
        num = chatRoom.f5732S;
        if (num != null) {
            cVar.a(45, (long) num.intValue());
        }
        num = chatRoom.f5733T;
        if (num != null) {
            cVar.a(46, (long) num.intValue());
        }
        bool = chatRoom.f5734U;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(47, j);
        }
        bool = chatRoom.f5735V;
        if (bool != null) {
            if (!bool.booleanValue()) {
                j2 = 0;
            }
            cVar.a(48, j2);
        }
    }

    protected final /* bridge */ /* synthetic */ void m3787b(Object obj) {
        ChatRoomDao chatRoomDao;
        ChatRoom chatRoom = (ChatRoom) obj;
        super.b(chatRoom);
        DaoSession daoSession = this.f6191a;
        chatRoom.f5736W = daoSession;
        if (daoSession != null) {
            chatRoomDao = daoSession.f6426A;
        } else {
            chatRoomDao = null;
        }
        chatRoom.f5737X = chatRoomDao;
    }

    public ChatRoomDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.f6191a = daoSession;
    }

    public static void m3780a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"CHAT_ROOM\" (\"_id\" INTEGER PRIMARY KEY ,\"L_CHAT_ROOM_ID\" INTEGER,\"L_CLUB_ID\" INTEGER,\"L_SMALL_BLINDS\" INTEGER,\"L_BIG_BLINDS\" INTEGER,\"L_LAST_MSG_TIME\" INTEGER,\"L_CREATE_TIME\" INTEGER,\"CREATE_USER_ID\" INTEGER,\"L_CREATE_USER\" INTEGER,\"L_BILL_ID\" INTEGER,\"L_QUICK_GAME_ID\" INTEGER,\"LOCAL_USER_ID\" INTEGER,\"L_FUND_COIN\" INTEGER,\"L_DURATION\" INTEGER,\"L_TOTAL_GAIN\" INTEGER,\"STR_ROOM_NAME\" TEXT,\"STR_TEMP_LAST_MSG\" TEXT,\"STR_TEMP_NAME\" TEXT,\"STR_ROOM_CODE\" TEXT,\"STR_LAST_MSG\" TEXT,\"STR_COVER\" TEXT,\"STR_COVER_BIG\" TEXT,\"S_CRYPT_CODE\" TEXT,\"STR_CLUB_CARD\" TEXT,\"STR_CLUB_DESC\" TEXT,\"STR_CLUB_LOCATION\" TEXT,\"IS_DELETE\" INTEGER,\"B_IS_CLUB\" INTEGER,\"B_IS_HOT\" INTEGER,\"B_IS_MINE\" INTEGER,\"B_IS_QUICK\" INTEGER," + "\"B_NEW_MSG_ALERT\" INTEGER,\"B_TOP\" INTEGER,\"B_VERIFY\" INTEGER,\"E_GAME_ROOM_TYPE\" INTEGER,\"E_QUICK_GAME_ROOM_STATUS\" INTEGER,\"E_TALK_TYPE\" INTEGER,\"I_ANTE\" INTEGER,\"I_CLUB_EXPERIENCE\" INTEGER,\"I_CLUB_LEVEL\" INTEGER,\"I_HOT_POS\" INTEGER,\"I_MEMBERS_COUNT\" INTEGER,\"I_ROOM_TYPE\" INTEGER,\"N_MAX_MEMBERS\" INTEGER,\"N_OWNER_CREATE\" INTEGER,\"N_OWNER_INVITE\" INTEGER,\"B_MANAGER\" INTEGER,\"I_MANAGER_CREATE\" INTEGER);");
    }

    public final /* synthetic */ Object m3781a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3786b(Cursor cursor, int i) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        Long valueOf2 = cursor.isNull(i + 1) ? null : Long.valueOf(cursor.getLong(i + 1));
        Long valueOf3 = cursor.isNull(i + 2) ? null : Long.valueOf(cursor.getLong(i + 2));
        Long valueOf4 = cursor.isNull(i + 3) ? null : Long.valueOf(cursor.getLong(i + 3));
        Long valueOf5 = cursor.isNull(i + 4) ? null : Long.valueOf(cursor.getLong(i + 4));
        Long valueOf6 = cursor.isNull(i + 5) ? null : Long.valueOf(cursor.getLong(i + 5));
        Long valueOf7 = cursor.isNull(i + 6) ? null : Long.valueOf(cursor.getLong(i + 6));
        Long valueOf8 = cursor.isNull(i + 7) ? null : Long.valueOf(cursor.getLong(i + 7));
        Long valueOf9 = cursor.isNull(i + 8) ? null : Long.valueOf(cursor.getLong(i + 8));
        Long valueOf10 = cursor.isNull(i + 9) ? null : Long.valueOf(cursor.getLong(i + 9));
        Long valueOf11 = cursor.isNull(i + 10) ? null : Long.valueOf(cursor.getLong(i + 10));
        Long valueOf12 = cursor.isNull(i + 11) ? null : Long.valueOf(cursor.getLong(i + 11));
        Long valueOf13 = cursor.isNull(i + 12) ? null : Long.valueOf(cursor.getLong(i + 12));
        Long valueOf14 = cursor.isNull(i + 13) ? null : Long.valueOf(cursor.getLong(i + 13));
        Long valueOf15 = cursor.isNull(i + 14) ? null : Long.valueOf(cursor.getLong(i + 14));
        String string = cursor.isNull(i + 15) ? null : cursor.getString(i + 15);
        String string2 = cursor.isNull(i + 16) ? null : cursor.getString(i + 16);
        String string3 = cursor.isNull(i + 17) ? null : cursor.getString(i + 17);
        String string4 = cursor.isNull(i + 18) ? null : cursor.getString(i + 18);
        String string5 = cursor.isNull(i + 19) ? null : cursor.getString(i + 19);
        String string6 = cursor.isNull(i + 20) ? null : cursor.getString(i + 20);
        String string7 = cursor.isNull(i + 21) ? null : cursor.getString(i + 21);
        String string8 = cursor.isNull(i + 22) ? null : cursor.getString(i + 22);
        String string9 = cursor.isNull(i + 23) ? null : cursor.getString(i + 23);
        String string10 = cursor.isNull(i + 24) ? null : cursor.getString(i + 24);
        String string11 = cursor.isNull(i + 25) ? null : cursor.getString(i + 25);
        if (cursor.isNull(i + 26)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i + 26) != (short) 0);
        }
        if (cursor.isNull(i + 27)) {
            bool2 = null;
        } else {
            bool2 = Boolean.valueOf(cursor.getShort(i + 27) != (short) 0);
        }
        if (cursor.isNull(i + 28)) {
            bool3 = null;
        } else {
            bool3 = Boolean.valueOf(cursor.getShort(i + 28) != (short) 0);
        }
        if (cursor.isNull(i + 29)) {
            bool4 = null;
        } else {
            bool4 = Boolean.valueOf(cursor.getShort(i + 29) != (short) 0);
        }
        if (cursor.isNull(i + 30)) {
            bool5 = null;
        } else {
            bool5 = Boolean.valueOf(cursor.getShort(i + 30) != (short) 0);
        }
        if (cursor.isNull(i + 31)) {
            bool6 = null;
        } else {
            bool6 = Boolean.valueOf(cursor.getShort(i + 31) != (short) 0);
        }
        if (cursor.isNull(i + 32)) {
            bool7 = null;
        } else {
            bool7 = Boolean.valueOf(cursor.getShort(i + 32) != (short) 0);
        }
        if (cursor.isNull(i + 33)) {
            bool8 = null;
        } else {
            bool8 = Boolean.valueOf(cursor.getShort(i + 33) != (short) 0);
        }
        Integer valueOf16 = cursor.isNull(i + 34) ? null : Integer.valueOf(cursor.getInt(i + 34));
        Integer valueOf17 = cursor.isNull(i + 35) ? null : Integer.valueOf(cursor.getInt(i + 35));
        Integer valueOf18 = cursor.isNull(i + 36) ? null : Integer.valueOf(cursor.getInt(i + 36));
        Integer valueOf19 = cursor.isNull(i + 37) ? null : Integer.valueOf(cursor.getInt(i + 37));
        Integer valueOf20 = cursor.isNull(i + 38) ? null : Integer.valueOf(cursor.getInt(i + 38));
        Integer valueOf21 = cursor.isNull(i + 39) ? null : Integer.valueOf(cursor.getInt(i + 39));
        Integer valueOf22 = cursor.isNull(i + 40) ? null : Integer.valueOf(cursor.getInt(i + 40));
        Integer valueOf23 = cursor.isNull(i + 41) ? null : Integer.valueOf(cursor.getInt(i + 41));
        Integer valueOf24 = cursor.isNull(i + 42) ? null : Integer.valueOf(cursor.getInt(i + 42));
        Integer valueOf25 = cursor.isNull(i + 43) ? null : Integer.valueOf(cursor.getInt(i + 43));
        Integer valueOf26 = cursor.isNull(i + 44) ? null : Integer.valueOf(cursor.getInt(i + 44));
        Integer valueOf27 = cursor.isNull(i + 45) ? null : Integer.valueOf(cursor.getInt(i + 45));
        if (cursor.isNull(i + 46)) {
            bool9 = null;
        } else {
            bool9 = Boolean.valueOf(cursor.getShort(i + 46) != (short) 0);
        }
        if (cursor.isNull(i + 47)) {
            bool10 = null;
        } else {
            bool10 = Boolean.valueOf(cursor.getShort(i + 47) != (short) 0);
        }
        return new ChatRoom(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, bool9, bool10);
    }
}
