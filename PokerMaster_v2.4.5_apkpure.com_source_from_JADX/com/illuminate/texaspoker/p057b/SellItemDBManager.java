package com.illuminate.texaspoker.p057b;

import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.SellItemDao;
import com.illuminate.texaspoker.dao.SellItemDao.Properties;
import com.illuminate.texaspoker.p058c.SellItem;
import com.texaspoker.moment.TexasPokerHttpTransaction.SellingItemInfo;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.v */
public final class SellItemDBManager {
    private a f5607a;
    private DaoSession f5608b;

    public SellItemDBManager(a aVar, DaoSession daoSession) {
        this.f5607a = aVar;
        this.f5608b = daoSession;
    }

    public final List<SellItem> m3698a() {
        g a = g.a(this.f5608b.f6441P);
        a.a(new f[]{Properties.f6397e});
        return a.a().b();
    }

    public final void m3699a(List<SellingItemInfo> list) {
        int i = 1;
        SellItemDao sellItemDao = this.f5608b.f6441P;
        this.f5607a.a();
        try {
            SellItem sellItem;
            List a = m3698a();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sellItem = (SellItem) a.get(i2);
                for (SellingItemInfo iSellingItemID : list) {
                    if (sellItem.f5987g.longValue() == ((long) iSellingItemID.getISellingItemID())) {
                        break;
                    }
                    sellItemDao.e(sellItem);
                }
            }
            for (SellingItemInfo iSellingItemID2 : list) {
                int iSellingItemID3 = iSellingItemID2.getISellingItemID();
                g a2 = g.a(this.f5608b.f6441P);
                a2.a(Properties.f6399g.a(Integer.valueOf(iSellingItemID3)), new i[0]);
                a2.a(new f[]{Properties.f6397e});
                sellItem = (SellItem) a2.a().c();
                if (sellItem == null) {
                    sellItem = new SellItem();
                    sellItem.f5982b = Boolean.valueOf(false);
                } else if (sellItem.f5986f.intValue() != iSellingItemID2.getISellingItemCost()) {
                    sellItem.f5982b = Boolean.valueOf(true);
                }
                sellItem.f5987g = Integer.valueOf(iSellingItemID2.getISellingItemID());
                sellItem.f5991k = iSellingItemID2.getSSellingItemName();
                sellItem.f5989i = iSellingItemID2.getSSellingItemIcon();
                sellItem.f5983c = Integer.valueOf(iSellingItemID2.getESellingItemType().getNumber());
                sellItem.f5986f = Integer.valueOf(iSellingItemID2.getISellingItemCost());
                sellItem.f5988h = iSellingItemID2.getSSellingItemDescription();
                sellItem.f5984d = Integer.valueOf(iSellingItemID2.getESellingStoreUnitType().getNumber());
                sellItem.f5990j = iSellingItemID2.getSSellingItemDetailDescription();
                sellItem.f5985e = Integer.valueOf(i);
                sellItemDao.d(sellItem);
                i++;
            }
            this.f5607a.c();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f5607a.b();
        }
    }
}
