package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.illuminate.texaspoker.dao.BuyInControlMsgDao;
import com.illuminate.texaspoker.dao.BuyInControlMsgDao.Properties;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.p058c.BuyInControlMsg;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.texaspoker.moment.TexasPoker.BuyinControl;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.c */
public final class BuyInControlMsgDBManager {
    public a f5519a;
    public DaoSession f5520b;

    public BuyInControlMsgDBManager(a aVar, DaoSession daoSession) {
        this.f5519a = aVar;
        this.f5520b = daoSession;
    }

    public final BuyInControlMsg m3560a(long j, long j2) {
        g a = g.a(this.f5520b.f6468y);
        a.a(Properties.f6107c.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6108d.a(Long.valueOf(j2)), new i[0]);
        return (BuyInControlMsg) a.a().c();
    }

    public final long m3559a() {
        return g.a(this.f5520b.f6468y).b();
    }

    private BuyInControlMsg m3558a(BuyinControl buyinControl) {
        long lGameRoomID = buyinControl.getLGameRoomID();
        GameRoom a = DBManager.m3631a().f5572l.m3656a(lGameRoomID, buyinControl.getLClubID());
        BuyInControlMsg buyInControlMsg = null;
        if (a != null && a.m3736a().f5842u.longValue() == SharedPreferencesManager.m4308b()) {
            buyInControlMsg = m3560a(lGameRoomID, buyinControl.getStUserBaseInfo().getUuid());
            if (buyInControlMsg == null) {
                buyInControlMsg = new BuyInControlMsg();
                buyInControlMsg.f5673f = Boolean.valueOf(false);
                buyInControlMsg.f5674g = Integer.valueOf(1);
            }
            buyInControlMsg.f5669b = Long.valueOf(buyinControl.getLBuyinCreateTime());
            buyInControlMsg.m3718a(a);
            buyInControlMsg.f5679l = buyinControl.getLClubID();
            buyInControlMsg.f5680m = buyinControl.getSClubName();
            buyInControlMsg.f5670c = Long.valueOf(lGameRoomID);
            FriendUser a2 = DBManager.m3631a().f5563c.m3641a(buyinControl.getStUserBaseInfo(), false);
            buyInControlMsg.m3717a(a2);
            buyInControlMsg.f5671d = a2.f5842u;
            buyInControlMsg.f5672e = Long.valueOf(buyinControl.getLStacks());
            this.f5520b.f6468y.d(buyInControlMsg);
        }
        return buyInControlMsg;
    }

    public final void m3561a(long j) {
        g a = g.a(this.f5520b.f6468y);
        a.a(Properties.f6107c.a(Long.valueOf(j)), new i[0]);
        if (0 != 0) {
            a.a(Properties.f6116l.a(Long.valueOf(0)), new i[0]);
        }
        a.a(new f[]{Properties.f6106b});
        List<BuyInControlMsg> b = a.a().b();
        BuyInControlMsgDao buyInControlMsgDao = this.f5520b.f6468y;
        this.f5519a.a();
        try {
            for (BuyInControlMsg e : b) {
                buyInControlMsgDao.e(e);
            }
            this.f5519a.c();
        } catch (Throwable e2) {
            e2.printStackTrace();
            Log.e("MessageMsgDBManager", e2.getMessage(), e2);
        } finally {
            this.f5519a.b();
        }
    }

    public final void m3562a(List<BuyinControl> list) {
        this.f5519a.a();
        try {
            for (BuyinControl a : list) {
                m3558a(a);
            }
            this.f5519a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("MessageMsgDBManager", e.getMessage(), e);
        } finally {
            this.f5519a.b();
        }
    }
}
