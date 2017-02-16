package com.illuminate.texaspoker.dao;

import a.does.not.Exists2;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p058c.UserBill;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.a.a.a;
import org.a.a.a.c;
import org.a.a.f;

public class UserBillDao extends a<UserBill, Long> {
    public static final String TABLENAME = "USER_BILL";
    private DaoSession f6425a;

    public static class Properties {
        public static final f f6413a;
        public static final f f6414b;
        public static final f f6415c;
        public static final f f6416d;
        public static final f f6417e;
        public static final f f6418f;
        public static final f f6419g;
        public static final f f6420h;
        public static final f f6421i;
        public static final f f6422j;
        public static final f f6423k;
        public static final f f6424l;

        static {
            f6413a = new f(0, Long.class, "id", true, "_id");
            f6414b = new f(1, Long.class, "billId", false, "BILL_ID");
            f6415c = new f(2, Long.class, "lRemainBuyStacks", false, "L_REMAIN_BUY_STACKS");
            f6416d = new f(3, Long.class, "lTotalBuyStacks", false, "L_TOTAL_BUY_STACKS");
            f6417e = new f(4, Long.class, "friendUserId", false, "FRIEND_USER_ID");
            f6418f = new f(5, Long.class, "uuid", false, "UUID");
            f6419g = new f(6, Long.class, "iSngRank", false, "I_SNG_RANK");
            f6420h = new f(7, Long.class, "lInsuranceGetStacks", false, "L_INSURANCE_GET_STACKS");
            f6421i = new f(8, Long.class, "lInsuranceBuyin", false, "L_INSURANCE_BUYIN");
            f6422j = new f(9, Boolean.class, "fromShare", false, "FROM_SHARE");
            f6423k = new f(10, Long.class, "lClubID", false, "L_CLUB_ID");
            f6424l = new f(11, String.class, "sClubName", false, "S_CLUB_NAME");
        }
    }

    static {
        fixHelper.fixfunc(new int[]{1826, 1827, 1828, 1829, 1830, 1831, 1832, 1833});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native UserBillDao(org.a.a.c.a aVar, DaoSession daoSession);

    public final native /* synthetic */ Object m3910a(Cursor cursor, int i);

    public final native /* bridge */ /* synthetic */ Object m3911a(Object obj);

    protected final native /* synthetic */ Object m3912a(Object obj, long j);

    protected final native /* synthetic */ void m3913a(SQLiteStatement sQLiteStatement, Object obj);

    protected final native /* synthetic */ void m3914a(c cVar, Object obj);

    public final native /* synthetic */ Object m3915b(Cursor cursor, int i);

    protected final native /* bridge */ /* synthetic */ void m3916b(Object obj);

    public static void m3909a(org.a.a.a.a aVar) {
        aVar.a("CREATE TABLE " + LetterIndexBar.SEARCH_ICON_LETTER + "\"USER_BILL\" (\"_id\" INTEGER PRIMARY KEY ,\"BILL_ID\" INTEGER,\"L_REMAIN_BUY_STACKS\" INTEGER,\"L_TOTAL_BUY_STACKS\" INTEGER,\"FRIEND_USER_ID\" INTEGER,\"UUID\" INTEGER,\"I_SNG_RANK\" INTEGER,\"L_INSURANCE_GET_STACKS\" INTEGER,\"L_INSURANCE_BUYIN\" INTEGER,\"FROM_SHARE\" INTEGER,\"L_CLUB_ID\" INTEGER,\"S_CLUB_NAME\" TEXT);");
    }
}
