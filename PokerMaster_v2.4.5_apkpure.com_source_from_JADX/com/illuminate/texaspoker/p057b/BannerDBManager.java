package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.illuminate.texaspoker.dao.BannerDao;
import com.illuminate.texaspoker.dao.BannerDao.Properties;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.p058c.Banner;
import com.texaspoker.moment.TexasPokerCommon.BannerInfo;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.a */
public final class BannerDBManager {
    private a f5515a;
    private DaoSession f5516b;

    public BannerDBManager(a aVar, DaoSession daoSession) {
        this.f5515a = aVar;
        this.f5516b = daoSession;
    }

    public final List<Banner> m3552a() {
        g a = g.a(this.f5516b.f6466w);
        a.a(new f[]{Properties.f6054b});
        return a.a().b();
    }

    public final void m3553a(List<BannerInfo> list) {
        BannerDao bannerDao = this.f5516b.f6466w;
        this.f5515a.a();
        try {
            List a = m3552a();
            int size = list.size();
            int size2 = a.size();
            int i;
            int i2;
            if (size >= size2) {
                i = 0;
                i2 = 0;
                while (i < size) {
                    BannerInfo bannerInfo = (BannerInfo) list.get(i);
                    Banner banner;
                    if (i < size2) {
                        banner = (Banner) a.get(i);
                        banner.f5614b = Integer.valueOf(i2);
                        banner.f5615c = bannerInfo.getSImageUrl();
                        banner.f5616d = bannerInfo.getSTargetUrl();
                        bannerDao.d(banner);
                    } else {
                        banner = new Banner();
                        banner.f5614b = Integer.valueOf(i2);
                        banner.f5615c = bannerInfo.getSImageUrl();
                        banner.f5616d = bannerInfo.getSTargetUrl();
                        bannerDao.d(banner);
                    }
                    i++;
                    i2++;
                }
            } else {
                i2 = 0;
                i = 0;
                while (i2 < size2) {
                    int i3;
                    Banner banner2 = (Banner) a.get(i2);
                    if (i2 < size) {
                        BannerInfo bannerInfo2 = (BannerInfo) list.get(i2);
                        banner2.f5614b = Integer.valueOf(i);
                        banner2.f5615c = bannerInfo2.getSImageUrl();
                        banner2.f5616d = bannerInfo2.getSTargetUrl();
                        bannerDao.d(banner2);
                        i3 = i + 1;
                    } else {
                        bannerDao.e(banner2);
                        i3 = i;
                    }
                    i2++;
                    i = i3;
                }
            }
            this.f5515a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("BannerDBManager", e.getMessage(), e);
        } finally {
            this.f5515a.b();
        }
    }
}
