package com.illuminate.texaspoker.p057b;

import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.UserBillDao;
import com.illuminate.texaspoker.dao.UserBillDao.Properties;
import com.illuminate.texaspoker.p058c.UserBill;
import com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;

/* renamed from: com.illuminate.texaspoker.b.x */
public final class UserBillDBManager {
    public DaoSession f5611a;
    private a f5612b;

    public UserBillDBManager(a aVar, DaoSession daoSession) {
        this.f5612b = aVar;
        this.f5611a = daoSession;
    }

    public final UserBill m3703a(long j, long j2, boolean z) {
        g a = g.a(this.f5611a.f6443R);
        a.a(Properties.f6414b.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6418f.a(Long.valueOf(j2)), new i[0]);
        a.a(Properties.f6422j.a(Boolean.valueOf(z)), new i[0]);
        return (UserBill) a.a().c();
    }

    public final List<UserBill> m3705a(long j, boolean z) {
        g a = g.a(this.f5611a.f6443R);
        a.a(Properties.f6414b.a(Long.valueOf(j)), new i[0]);
        a.a(Properties.f6422j.a(Boolean.valueOf(z)), new i[0]);
        a.a(Properties.f6416d.b(Integer.valueOf(0)), new i[0]);
        return a.a().b();
    }

    public final UserBill m3704a(UserBillInfoNet userBillInfoNet, long j, boolean z) {
        UserBillDao userBillDao = this.f5611a.f6443R;
        UserBill a = m3703a(j, userBillInfoNet.getUuid(), z);
        if (a == null) {
            a = new UserBill();
        }
        a.f6005b = Long.valueOf(j);
        a.f6009f = Long.valueOf(userBillInfoNet.getUuid());
        a.f6007d = Long.valueOf(userBillInfoNet.getLTotalBuyStacks());
        a.f6006c = Long.valueOf(userBillInfoNet.getLRemainBuyStacks());
        a.f6013j = Boolean.valueOf(z);
        a.f6010g = Long.valueOf(userBillInfoNet.getISngRank());
        a.f6011h = Long.valueOf(userBillInfoNet.getLInsuranceGetStacks());
        a.f6012i = Long.valueOf(userBillInfoNet.getLInsuranceBuyin());
        a.f6015l = userBillInfoNet.getSClubName();
        a.f6014k = Long.valueOf(userBillInfoNet.getLClubID());
        userBillDao.d(a);
        return a;
    }
}
