package com.illuminate.texaspoker.dao;

import a.does.not.Exists2;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.Bill;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class BillDao extends a<Bill, Long> {
    public static final String TABLENAME = "BILL";
    private DaoSession f6104a;

    public static class Properties {
        public static final f f6057A = null;
        public static final f f6058B = null;
        public static final f f6059C = null;
        public static final f f6060D = null;
        public static final f f6061E = null;
        public static final f f6062F = null;
        public static final f f6063G = null;
        public static final f f6064H = null;
        public static final f f6065I = null;
        public static final f f6066J = null;
        public static final f f6067K = null;
        public static final f f6068L = null;
        public static final f f6069M = null;
        public static final f f6070N = null;
        public static final f f6071O = null;
        public static final f f6072P = null;
        public static final f f6073Q = null;
        public static final f f6074R = null;
        public static final f f6075S = null;
        public static final f f6076T = null;
        public static final f f6077U = null;
        public static final f f6078a = null;
        public static final f f6079b = null;
        public static final f f6080c = null;
        public static final f f6081d = null;
        public static final f f6082e = null;
        public static final f f6083f = null;
        public static final f f6084g = null;
        public static final f f6085h = null;
        public static final f f6086i = null;
        public static final f f6087j = null;
        public static final f f6088k = null;
        public static final f f6089l = null;
        public static final f f6090m = null;
        public static final f f6091n = null;
        public static final f f6092o = null;
        public static final f f6093p = null;
        public static final f f6094q = null;
        public static final f f6095r = null;
        public static final f f6096s = null;
        public static final f f6097t = null;
        public static final f f6098u = null;
        public static final f f6099v = null;
        public static final f f6100w = null;
        public static final f f6101x = null;
        public static final f f6102y = null;
        public static final f f6103z = null;

        static {
            fixHelper.fixfunc(new int[]{1473, 1});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        static void __clinit__() {
            f6078a = new f(0, Long.class, "id", true, "_id");
            f6079b = new f(1, Long.class, "billId", false, "BILL_ID");
            f6080c = new f(2, Integer.class, "eGameRoomType", false, "E_GAME_ROOM_TYPE");
            f6081d = new f(3, Integer.class, "eCreateRoomType", false, "E_CREATE_ROOM_TYPE");
            f6082e = new f(4, Boolean.class, "bConfirm", false, "B_CONFIRM");
            f6083f = new f(5, Boolean.class, "bIsNew", false, "B_IS_NEW");
            f6084g = new f(6, Boolean.class, "bIsOffLine", false, "B_IS_OFF_LINE");
            f6085h = new f(7, Boolean.class, "fromShare", false, "FROM_SHARE");
            f6086i = new f(8, Boolean.class, "bOwnerDeleted", false, "B_OWNER_DELETED");
            f6087j = new f(9, Boolean.class, "bPrivateRoom", false, "B_PRIVATE_ROOM");
            f6088k = new f(10, Long.class, "lOriginalStacks", false, "L_ORIGINAL_STACKS");
            f6089l = new f(11, Integer.class, "iBlindInterval", false, "I_BLIND_INTERVAL");
            f6090m = new f(12, Integer.class, "iGameRoomUserMaxNums", false, "I_GAME_ROOM_USER_MAX_NUMS");
            f6091n = new f(13, Integer.class, "eSngRoomType", false, "E_SNG_ROOM_TYPE");
            f6092o = new f(14, Integer.class, "iAnte", false, "I_ANTE");
            f6093p = new f(15, Long.class, "lTotalWin", false, "L_TOTAL_WIN");
            f6094q = new f(16, Long.class, "lTotalJoinHand", false, "L_TOTAL_JOIN_HAND");
            f6095r = new f(17, Long.class, "lTotalHand", false, "L_TOTAL_HAND");
            f6096s = new f(18, Long.class, "lTotalGameNum", false, "L_TOTAL_GAME_NUM");
            f6097t = new f(19, Long.class, "lTotalBuyin", false, "L_TOTAL_BUYIN");
            f6098u = new f(20, Long.class, "lSmallBlind", false, "L_SMALL_BLIND");
            f6099v = new f(21, Long.class, "lBigBlind", false, "L_BIG_BLIND");
            f6100w = new f(22, Long.class, "lRemainBuyStacks", false, "L_REMAIN_BUY_STACKS");
            f6101x = new f(23, Long.class, "lMaxPot", false, "L_MAX_POT");
            f6102y = new f(24, Long.class, "lBuyin", false, "L_BUYIN");
            f6103z = new f(25, Long.class, "lClubId", false, "L_CLUB_ID");
            f6057A = new f(26, Long.class, "lCountJoinFlop", false, "L_COUNT_JOIN_FLOP");
            f6058B = new f(27, Long.class, "lCountJoinRiver", false, "L_COUNT_JOIN_RIVER");
            f6059C = new f(28, Long.class, "lCountJoinTurn", false, "L_COUNT_JOIN_TURN");
            f6060D = new f(29, Long.class, "lCountShowdownFlopWin", false, "L_COUNT_SHOWDOWN_FLOP_WIN");
            f6061E = new f(30, Long.class, "lCountShowdownRiverWin", false, "L_COUNT_SHOWDOWN_RIVER_WIN");
            f6062F = new f(31, Long.class, "lCountShowdownShow", false, "L_COUNT_SHOWDOWN_SHOW");
            f6063G = new f(32, Long.class, "lCountShowdownTurnWin", false, "L_COUNT_SHOWDOWN_TURN_WIN");
            f6064H = new f(33, Long.class, "lCountShowdownWinShow", false, "L_COUNT_SHOWDOWN_WIN_SHOW");
            f6065I = new f(34, Long.class, "lInsurancePot", false, "L_INSURANCE_POT");
            f6066J = new f(35, Long.class, "lCreateTime", false, "L_CREATE_TIME");
            f6067K = new f(36, Long.class, "lDuration", false, "L_DURATION");
            f6068L = new f(37, Long.class, "lEndTime", false, "L_END_TIME");
            f6069M = new f(38, String.class, "sPlayName", false, "S_PLAY_NAME");
            f6070N = new f(39, String.class, "sFromText", false, "S_FROM_TEXT");
            f6071O = new f(40, Long.class, "lCreateUserId", false, "L_CREATE_USER_ID");
            f6072P = new f(41, Long.class, "createUserId", false, "CREATE_USER_ID");
            f6073Q = new f(42, Boolean.class, "bClubManager", false, "B_CLUB_MANAGER");
            f6074R = new f(43, Long.class, "lLeagueID", false, "L_LEAGUE_ID");
            f6075S = new f(44, String.class, "sLeagueName", false, "S_LEAGUE_NAME");
            f6076T = new f(45, String.class, "sFromClubUrl", false, "S_FROM_CLUB_URL");
            f6077U = new f(46, String.class, "sFromClubCreatorName", false, "S_FROM_CLUB_CREATOR_NAME");
        }
    }

    protected final /* synthetic */ Object m3759a(Object obj, long j) {
        ((Bill) obj).f5642a = Long.valueOf(j);
        return Long.valueOf(j);
    }

    protected final /* synthetic */ void m3760a(SQLiteStatement sQLiteStatement, Object obj) {
        long j;
        long j2 = 1;
        Bill bill = (Bill) obj;
        sQLiteStatement.clearBindings();
        Long l = bill.f5642a;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        l = bill.f5643b;
        if (l != null) {
            sQLiteStatement.bindLong(2, l.longValue());
        }
        Integer num = bill.f5644c;
        if (num != null) {
            sQLiteStatement.bindLong(3, (long) num.intValue());
        }
        num = bill.f5645d;
        if (num != null) {
            sQLiteStatement.bindLong(4, (long) num.intValue());
        }
        Boolean bool = bill.f5646e;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(5, j);
        }
        bool = bill.f5647f;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(6, j);
        }
        bool = bill.f5648g;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(7, j);
        }
        bool = bill.f5649h;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(8, j);
        }
        bool = bill.f5650i;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(9, j);
        }
        bool = bill.f5651j;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(10, j);
        }
        l = bill.f5652k;
        if (l != null) {
            sQLiteStatement.bindLong(11, l.longValue());
        }
        num = bill.f5653l;
        if (num != null) {
            sQLiteStatement.bindLong(12, (long) num.intValue());
        }
        num = bill.f5654m;
        if (num != null) {
            sQLiteStatement.bindLong(13, (long) num.intValue());
        }
        num = bill.f5655n;
        if (num != null) {
            sQLiteStatement.bindLong(14, (long) num.intValue());
        }
        num = bill.f5656o;
        if (num != null) {
            sQLiteStatement.bindLong(15, (long) num.intValue());
        }
        l = bill.f5657p;
        if (l != null) {
            sQLiteStatement.bindLong(16, l.longValue());
        }
        l = bill.f5658q;
        if (l != null) {
            sQLiteStatement.bindLong(17, l.longValue());
        }
        l = bill.f5659r;
        if (l != null) {
            sQLiteStatement.bindLong(18, l.longValue());
        }
        l = bill.f5660s;
        if (l != null) {
            sQLiteStatement.bindLong(19, l.longValue());
        }
        l = bill.f5661t;
        if (l != null) {
            sQLiteStatement.bindLong(20, l.longValue());
        }
        l = bill.f5662u;
        if (l != null) {
            sQLiteStatement.bindLong(21, l.longValue());
        }
        l = bill.f5663v;
        if (l != null) {
            sQLiteStatement.bindLong(22, l.longValue());
        }
        l = bill.f5664w;
        if (l != null) {
            sQLiteStatement.bindLong(23, l.longValue());
        }
        l = bill.f5665x;
        if (l != null) {
            sQLiteStatement.bindLong(24, l.longValue());
        }
        l = bill.f5666y;
        if (l != null) {
            sQLiteStatement.bindLong(25, l.longValue());
        }
        l = bill.f5667z;
        if (l != null) {
            sQLiteStatement.bindLong(26, l.longValue());
        }
        l = bill.f5617A;
        if (l != null) {
            sQLiteStatement.bindLong(27, l.longValue());
        }
        l = bill.f5618B;
        if (l != null) {
            sQLiteStatement.bindLong(28, l.longValue());
        }
        l = bill.f5619C;
        if (l != null) {
            sQLiteStatement.bindLong(29, l.longValue());
        }
        l = bill.f5620D;
        if (l != null) {
            sQLiteStatement.bindLong(30, l.longValue());
        }
        l = bill.f5621E;
        if (l != null) {
            sQLiteStatement.bindLong(31, l.longValue());
        }
        l = bill.f5622F;
        if (l != null) {
            sQLiteStatement.bindLong(32, l.longValue());
        }
        l = bill.f5623G;
        if (l != null) {
            sQLiteStatement.bindLong(33, l.longValue());
        }
        l = bill.f5624H;
        if (l != null) {
            sQLiteStatement.bindLong(34, l.longValue());
        }
        l = bill.f5625I;
        if (l != null) {
            sQLiteStatement.bindLong(35, l.longValue());
        }
        l = bill.f5626J;
        if (l != null) {
            sQLiteStatement.bindLong(36, l.longValue());
        }
        l = bill.f5627K;
        if (l != null) {
            sQLiteStatement.bindLong(37, l.longValue());
        }
        l = bill.f5628L;
        if (l != null) {
            sQLiteStatement.bindLong(38, l.longValue());
        }
        String str = bill.f5629M;
        if (str != null) {
            sQLiteStatement.bindString(39, str);
        }
        str = bill.f5630N;
        if (str != null) {
            sQLiteStatement.bindString(40, str);
        }
        l = bill.f5631O;
        if (l != null) {
            sQLiteStatement.bindLong(41, l.longValue());
        }
        l = bill.f5632P;
        if (l != null) {
            sQLiteStatement.bindLong(42, l.longValue());
        }
        bool = bill.f5633Q;
        if (bool != null) {
            if (!bool.booleanValue()) {
                j2 = 0;
            }
            sQLiteStatement.bindLong(43, j2);
        }
        l = bill.f5634R;
        if (l != null) {
            sQLiteStatement.bindLong(44, l.longValue());
        }
        str = bill.f5635S;
        if (str != null) {
            sQLiteStatement.bindString(45, str);
        }
        str = bill.f5636T;
        if (str != null) {
            sQLiteStatement.bindString(46, str);
        }
        str = bill.f5637U;
        if (str != null) {
            sQLiteStatement.bindString(47, str);
        }
    }

    protected final /* synthetic */ void m3761a(c cVar, Object obj) {
        long j;
        long j2 = 1;
        Bill bill = (Bill) obj;
        cVar.c();
        Long l = bill.f5642a;
        if (l != null) {
            cVar.a(1, l.longValue());
        }
        l = bill.f5643b;
        if (l != null) {
            cVar.a(2, l.longValue());
        }
        Integer num = bill.f5644c;
        if (num != null) {
            cVar.a(3, (long) num.intValue());
        }
        num = bill.f5645d;
        if (num != null) {
            cVar.a(4, (long) num.intValue());
        }
        Boolean bool = bill.f5646e;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(5, j);
        }
        bool = bill.f5647f;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(6, j);
        }
        bool = bill.f5648g;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(7, j);
        }
        bool = bill.f5649h;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(8, j);
        }
        bool = bill.f5650i;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(9, j);
        }
        bool = bill.f5651j;
        if (bool != null) {
            if (bool.booleanValue()) {
                j = 1;
            } else {
                j = 0;
            }
            cVar.a(10, j);
        }
        l = bill.f5652k;
        if (l != null) {
            cVar.a(11, l.longValue());
        }
        num = bill.f5653l;
        if (num != null) {
            cVar.a(12, (long) num.intValue());
        }
        num = bill.f5654m;
        if (num != null) {
            cVar.a(13, (long) num.intValue());
        }
        num = bill.f5655n;
        if (num != null) {
            cVar.a(14, (long) num.intValue());
        }
        num = bill.f5656o;
        if (num != null) {
            cVar.a(15, (long) num.intValue());
        }
        l = bill.f5657p;
        if (l != null) {
            cVar.a(16, l.longValue());
        }
        l = bill.f5658q;
        if (l != null) {
            cVar.a(17, l.longValue());
        }
        l = bill.f5659r;
        if (l != null) {
            cVar.a(18, l.longValue());
        }
        l = bill.f5660s;
        if (l != null) {
            cVar.a(19, l.longValue());
        }
        l = bill.f5661t;
        if (l != null) {
            cVar.a(20, l.longValue());
        }
        l = bill.f5662u;
        if (l != null) {
            cVar.a(21, l.longValue());
        }
        l = bill.f5663v;
        if (l != null) {
            cVar.a(22, l.longValue());
        }
        l = bill.f5664w;
        if (l != null) {
            cVar.a(23, l.longValue());
        }
        l = bill.f5665x;
        if (l != null) {
            cVar.a(24, l.longValue());
        }
        l = bill.f5666y;
        if (l != null) {
            cVar.a(25, l.longValue());
        }
        l = bill.f5667z;
        if (l != null) {
            cVar.a(26, l.longValue());
        }
        l = bill.f5617A;
        if (l != null) {
            cVar.a(27, l.longValue());
        }
        l = bill.f5618B;
        if (l != null) {
            cVar.a(28, l.longValue());
        }
        l = bill.f5619C;
        if (l != null) {
            cVar.a(29, l.longValue());
        }
        l = bill.f5620D;
        if (l != null) {
            cVar.a(30, l.longValue());
        }
        l = bill.f5621E;
        if (l != null) {
            cVar.a(31, l.longValue());
        }
        l = bill.f5622F;
        if (l != null) {
            cVar.a(32, l.longValue());
        }
        l = bill.f5623G;
        if (l != null) {
            cVar.a(33, l.longValue());
        }
        l = bill.f5624H;
        if (l != null) {
            cVar.a(34, l.longValue());
        }
        l = bill.f5625I;
        if (l != null) {
            cVar.a(35, l.longValue());
        }
        l = bill.f5626J;
        if (l != null) {
            cVar.a(36, l.longValue());
        }
        l = bill.f5627K;
        if (l != null) {
            cVar.a(37, l.longValue());
        }
        l = bill.f5628L;
        if (l != null) {
            cVar.a(38, l.longValue());
        }
        String str = bill.f5629M;
        if (str != null) {
            cVar.a(39, str);
        }
        str = bill.f5630N;
        if (str != null) {
            cVar.a(40, str);
        }
        l = bill.f5631O;
        if (l != null) {
            cVar.a(41, l.longValue());
        }
        l = bill.f5632P;
        if (l != null) {
            cVar.a(42, l.longValue());
        }
        bool = bill.f5633Q;
        if (bool != null) {
            if (!bool.booleanValue()) {
                j2 = 0;
            }
            cVar.a(43, j2);
        }
        l = bill.f5634R;
        if (l != null) {
            cVar.a(44, l.longValue());
        }
        str = bill.f5635S;
        if (str != null) {
            cVar.a(45, str);
        }
        str = bill.f5636T;
        if (str != null) {
            cVar.a(46, str);
        }
        str = bill.f5637U;
        if (str != null) {
            cVar.a(47, str);
        }
    }

    protected final /* bridge */ /* synthetic */ void m3763b(Object obj) {
        BillDao billDao;
        Bill bill = (Bill) obj;
        super.b(bill);
        DaoSession daoSession = this.f6104a;
        bill.f5638V = daoSession;
        if (daoSession != null) {
            billDao = daoSession.f6467x;
        } else {
            billDao = null;
        }
        bill.f5639W = billDao;
    }

    public BillDao(org.a.a.c.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.f6104a = daoSession;
    }

    public static void m3756a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"BILL\" (\"_id\" INTEGER PRIMARY KEY ,\"BILL_ID\" INTEGER,\"E_GAME_ROOM_TYPE\" INTEGER,\"E_CREATE_ROOM_TYPE\" INTEGER,\"B_CONFIRM\" INTEGER,\"B_IS_NEW\" INTEGER,\"B_IS_OFF_LINE\" INTEGER,\"FROM_SHARE\" INTEGER,\"B_OWNER_DELETED\" INTEGER,\"B_PRIVATE_ROOM\" INTEGER,\"L_ORIGINAL_STACKS\" INTEGER,\"I_BLIND_INTERVAL\" INTEGER,\"I_GAME_ROOM_USER_MAX_NUMS\" INTEGER,\"E_SNG_ROOM_TYPE\" INTEGER,\"I_ANTE\" INTEGER,\"L_TOTAL_WIN\" INTEGER,\"L_TOTAL_JOIN_HAND\" INTEGER,\"L_TOTAL_HAND\" INTEGER,\"L_TOTAL_GAME_NUM\" INTEGER,\"L_TOTAL_BUYIN\" INTEGER,\"L_SMALL_BLIND\" INTEGER,\"L_BIG_BLIND\" INTEGER,\"L_REMAIN_BUY_STACKS\" INTEGER,\"L_MAX_POT\" INTEGER,\"L_BUYIN\" INTEGER,\"L_CLUB_ID\" INTEGER,\"L_COUNT_JOIN_FLOP\" INTEGER,\"L_COUNT_JOIN_RIVER\" INTEGER,\"L_COUNT_JOIN_TURN\" INTEGER,\"L_COUNT_SHOWDOWN_FLOP_WIN\" INTEGER,\"L_COUNT_SHOWDOWN_RIVER_WIN\" INTEGER," + "\"L_COUNT_SHOWDOWN_SHOW\" INTEGER,\"L_COUNT_SHOWDOWN_TURN_WIN\" INTEGER,\"L_COUNT_SHOWDOWN_WIN_SHOW\" INTEGER,\"L_INSURANCE_POT\" INTEGER,\"L_CREATE_TIME\" INTEGER,\"L_DURATION\" INTEGER,\"L_END_TIME\" INTEGER,\"S_PLAY_NAME\" TEXT,\"S_FROM_TEXT\" TEXT,\"L_CREATE_USER_ID\" INTEGER,\"CREATE_USER_ID\" INTEGER,\"B_CLUB_MANAGER\" INTEGER,\"L_LEAGUE_ID\" INTEGER,\"S_LEAGUE_NAME\" TEXT,\"S_FROM_CLUB_URL\" TEXT,\"S_FROM_CLUB_CREATOR_NAME\" TEXT);");
    }

    public final /* synthetic */ Object m3757a(Cursor cursor, int i) {
        return cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
    }

    public final /* synthetic */ Object m3762b(Cursor cursor, int i) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        String str;
        Long valueOf = cursor.isNull(i + 0) ? null : Long.valueOf(cursor.getLong(i + 0));
        Long valueOf2 = cursor.isNull(i + 1) ? null : Long.valueOf(cursor.getLong(i + 1));
        Integer valueOf3 = cursor.isNull(i + 2) ? null : Integer.valueOf(cursor.getInt(i + 2));
        Integer valueOf4 = cursor.isNull(i + 3) ? null : Integer.valueOf(cursor.getInt(i + 3));
        if (cursor.isNull(i + 4)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getShort(i + 4) != (short) 0);
        }
        if (cursor.isNull(i + 5)) {
            bool2 = null;
        } else {
            bool2 = Boolean.valueOf(cursor.getShort(i + 5) != (short) 0);
        }
        if (cursor.isNull(i + 6)) {
            bool3 = null;
        } else {
            bool3 = Boolean.valueOf(cursor.getShort(i + 6) != (short) 0);
        }
        if (cursor.isNull(i + 7)) {
            bool4 = null;
        } else {
            bool4 = Boolean.valueOf(cursor.getShort(i + 7) != (short) 0);
        }
        if (cursor.isNull(i + 8)) {
            bool5 = null;
        } else {
            bool5 = Boolean.valueOf(cursor.getShort(i + 8) != (short) 0);
        }
        if (cursor.isNull(i + 9)) {
            bool6 = null;
        } else {
            bool6 = Boolean.valueOf(cursor.getShort(i + 9) != (short) 0);
        }
        Long valueOf5 = cursor.isNull(i + 10) ? null : Long.valueOf(cursor.getLong(i + 10));
        Integer valueOf6 = cursor.isNull(i + 11) ? null : Integer.valueOf(cursor.getInt(i + 11));
        Integer valueOf7 = cursor.isNull(i + 12) ? null : Integer.valueOf(cursor.getInt(i + 12));
        Integer valueOf8 = cursor.isNull(i + 13) ? null : Integer.valueOf(cursor.getInt(i + 13));
        Integer valueOf9 = cursor.isNull(i + 14) ? null : Integer.valueOf(cursor.getInt(i + 14));
        Long valueOf10 = cursor.isNull(i + 15) ? null : Long.valueOf(cursor.getLong(i + 15));
        Long valueOf11 = cursor.isNull(i + 16) ? null : Long.valueOf(cursor.getLong(i + 16));
        Long valueOf12 = cursor.isNull(i + 17) ? null : Long.valueOf(cursor.getLong(i + 17));
        Long valueOf13 = cursor.isNull(i + 18) ? null : Long.valueOf(cursor.getLong(i + 18));
        Long valueOf14 = cursor.isNull(i + 19) ? null : Long.valueOf(cursor.getLong(i + 19));
        Long valueOf15 = cursor.isNull(i + 20) ? null : Long.valueOf(cursor.getLong(i + 20));
        Long valueOf16 = cursor.isNull(i + 21) ? null : Long.valueOf(cursor.getLong(i + 21));
        Long valueOf17 = cursor.isNull(i + 22) ? null : Long.valueOf(cursor.getLong(i + 22));
        Long valueOf18 = cursor.isNull(i + 23) ? null : Long.valueOf(cursor.getLong(i + 23));
        Long valueOf19 = cursor.isNull(i + 24) ? null : Long.valueOf(cursor.getLong(i + 24));
        Long valueOf20 = cursor.isNull(i + 25) ? null : Long.valueOf(cursor.getLong(i + 25));
        Long valueOf21 = cursor.isNull(i + 26) ? null : Long.valueOf(cursor.getLong(i + 26));
        Long valueOf22 = cursor.isNull(i + 27) ? null : Long.valueOf(cursor.getLong(i + 27));
        Long valueOf23 = cursor.isNull(i + 28) ? null : Long.valueOf(cursor.getLong(i + 28));
        Long valueOf24 = cursor.isNull(i + 29) ? null : Long.valueOf(cursor.getLong(i + 29));
        Long valueOf25 = cursor.isNull(i + 30) ? null : Long.valueOf(cursor.getLong(i + 30));
        Long valueOf26 = cursor.isNull(i + 31) ? null : Long.valueOf(cursor.getLong(i + 31));
        Long valueOf27 = cursor.isNull(i + 32) ? null : Long.valueOf(cursor.getLong(i + 32));
        Long valueOf28 = cursor.isNull(i + 33) ? null : Long.valueOf(cursor.getLong(i + 33));
        Long valueOf29 = cursor.isNull(i + 34) ? null : Long.valueOf(cursor.getLong(i + 34));
        Long valueOf30 = cursor.isNull(i + 35) ? null : Long.valueOf(cursor.getLong(i + 35));
        Long valueOf31 = cursor.isNull(i + 36) ? null : Long.valueOf(cursor.getLong(i + 36));
        Long valueOf32 = cursor.isNull(i + 37) ? null : Long.valueOf(cursor.getLong(i + 37));
        String string = cursor.isNull(i + 38) ? null : cursor.getString(i + 38);
        String string2 = cursor.isNull(i + 39) ? null : cursor.getString(i + 39);
        Long valueOf33 = cursor.isNull(i + 40) ? null : Long.valueOf(cursor.getLong(i + 40));
        Long valueOf34 = cursor.isNull(i + 41) ? null : Long.valueOf(cursor.getLong(i + 41));
        if (cursor.isNull(i + 42)) {
            bool7 = null;
        } else {
            bool7 = Boolean.valueOf(cursor.getShort(i + 42) != (short) 0);
        }
        Long valueOf35 = cursor.isNull(i + 43) ? null : Long.valueOf(cursor.getLong(i + 43));
        String string3 = cursor.isNull(i + 44) ? null : cursor.getString(i + 44);
        String string4 = cursor.isNull(i + 45) ? null : cursor.getString(i + 45);
        if (cursor.isNull(i + 46)) {
            str = null;
        } else {
            str = cursor.getString(i + 46);
        }
        return new Bill(valueOf, valueOf2, valueOf3, valueOf4, bool, bool2, bool3, bool4, bool5, bool6, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, string, string2, valueOf33, valueOf34, bool7, valueOf35, string3, string4, str);
    }
}
