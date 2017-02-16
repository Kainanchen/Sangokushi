package com.illuminate.texaspoker.p057b;

import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.DaoMaster;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.tea.TEAUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import org.a.a.a.a;
import org.a.a.b.d;

/* renamed from: com.illuminate.texaspoker.b.k */
public final class DBManager {
    public static int f5538A;
    public static int f5539B;
    public static int f5540C;
    public static int f5541D;
    public static int f5542E;
    public static int f5543F;
    public static int f5544G;
    public static int f5545H;
    public static int f5546I;
    public static int f5547J;
    public static int f5548K;
    public static int f5549L;
    public static int f5550M;
    public static int f5551N;
    private static DBManager f5552O;
    public static long f5553w;
    public static int f5554x;
    public static int f5555y;
    public static int f5556z;
    private DBOpenHelper f5557P;
    private a f5558Q;
    private DaoMaster f5559R;
    private DaoSession f5560S;
    public FriendAlbumDBManager f5561a;
    public FriendshipChainDBManager f5562b;
    public FriendUserDBManager f5563c;
    public SocialMsgDBManager f5564d;
    public ChatRoomDBManager f5565e;
    public ChatMsgDBManager f5566f;
    public ClubAlbumDBManager f5567g;
    public BannerDBManager f5568h;
    public ChatUserDBManager f5569i;
    public BillDBManager f5570j;
    public UserBillDBManager f5571k;
    public GameRoomDBManager f5572l;
    public SellItemDBManager f5573m;
    public MessageMsgDBManager f5574n;
    public ClubMsgDBManager f5575o;
    public ClubFundLogDBManager f5576p;
    public ClubRecordDBManager f5577q;
    public PokerHistoryDBManager f5578r;
    public BuyInControlMsgDBManager f5579s;
    public LeagueDBManager f5580t;
    public LeagueClubDBManager f5581u;
    public LeagueMsgDBManager f5582v;

    static {
        f5553w = 120000;
        f5554x = -1;
        f5555y = -2;
        f5556z = 1;
        f5538A = 2;
        f5539B = 3;
        f5540C = 3;
        f5541D = 4;
        f5542E = 5;
        f5543F = 6;
        f5544G = 7;
        f5545H = 8;
        f5546I = 9;
        f5547J = 10;
        f5548K = 11;
        f5549L = 12;
        f5550M = 13;
        f5551N = 14;
    }

    public static DBManager m3631a() {
        if (f5552O == null) {
            f5552O = new DBManager();
        }
        if (f5552O.m3632b() && SharedPreferencesManager.m4308b() != -1) {
            DBManager dBManager = f5552O;
            long b = SharedPreferencesManager.m4308b();
            if (dBManager.f5557P == null) {
                dBManager.f5557P = new DBOpenHelper(BaseApplication.m3548a(), String.valueOf(b));
                dBManager.f5558Q = dBManager.f5557P.a(TEAUtil.m4068a().getDbKey());
                dBManager.f5559R = new DaoMaster(dBManager.f5558Q);
                DaoMaster daoMaster = dBManager.f5559R;
                dBManager.f5560S = new DaoSession(daoMaster.a, d.a, daoMaster.c);
                dBManager.f5561a = new FriendAlbumDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5562b = new FriendshipChainDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5563c = new FriendUserDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5564d = new SocialMsgDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5565e = new ChatRoomDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5566f = new ChatMsgDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5567g = new ClubAlbumDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5568h = new BannerDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5569i = new ChatUserDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5570j = new BillDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5571k = new UserBillDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5572l = new GameRoomDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5573m = new SellItemDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5574n = new MessageMsgDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5575o = new ClubMsgDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5576p = new ClubFundLogDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5577q = new ClubRecordDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5578r = new PokerHistoryDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5579s = new BuyInControlMsgDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5580t = new LeagueDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5581u = new LeagueClubDBManager(dBManager.f5558Q, dBManager.f5560S);
                dBManager.f5582v = new LeagueMsgDBManager(dBManager.f5558Q, dBManager.f5560S);
            }
        }
        return f5552O;
    }

    public final boolean m3632b() {
        if (this.f5560S == null) {
            return true;
        }
        return false;
    }

    public final void m3633c() {
        if (this.f5560S != null) {
            DaoSession daoSession = this.f5560S;
            daoSession.f6444a.b();
            daoSession.f6445b.b();
            daoSession.f6446c.b();
            daoSession.f6447d.b();
            daoSession.f6448e.b();
            daoSession.f6449f.b();
            daoSession.f6450g.b();
            daoSession.f6451h.b();
            daoSession.f6452i.b();
            daoSession.f6453j.b();
            daoSession.f6454k.b();
            daoSession.f6455l.b();
            daoSession.f6456m.b();
            daoSession.f6457n.b();
            daoSession.f6458o.b();
            daoSession.f6459p.b();
            daoSession.f6460q.b();
            daoSession.f6461r.b();
            daoSession.f6462s.b();
            daoSession.f6463t.b();
            daoSession.f6464u.b();
            daoSession.f6465v.b();
            this.f5558Q.e();
            this.f5557P.close();
            this.f5557P = null;
            this.f5558Q = null;
            this.f5559R = null;
            this.f5560S = null;
            this.f5561a = null;
            this.f5562b = null;
            this.f5563c = null;
            this.f5564d = null;
            this.f5565e = null;
            this.f5566f = null;
            this.f5567g = null;
            this.f5568h = null;
            this.f5569i = null;
            this.f5570j = null;
            this.f5571k = null;
            this.f5572l = null;
            this.f5573m = null;
            this.f5574n = null;
            this.f5575o = null;
            this.f5576p = null;
            this.f5577q = null;
            this.f5578r = null;
            this.f5579s = null;
            this.f5580t = null;
            this.f5581u = null;
            this.f5582v = null;
            f5552O = null;
        }
    }
}
