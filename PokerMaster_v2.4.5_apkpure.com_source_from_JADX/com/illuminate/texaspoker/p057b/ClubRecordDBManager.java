package com.illuminate.texaspoker.p057b;

import com.illuminate.texaspoker.dao.ClubRecordDao.Properties;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.p058c.ClubRecord;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;

/* renamed from: com.illuminate.texaspoker.b.j */
public final class ClubRecordDBManager {
    public a f5536a;
    public DaoSession f5537b;

    public ClubRecordDBManager(a aVar, DaoSession daoSession) {
        this.f5536a = aVar;
        this.f5537b = daoSession;
    }

    public final ClubRecord m3630a(long j) {
        g a = g.a(this.f5537b.f6431F);
        a.a(Properties.f6228b.a(Long.valueOf(j)), new i[0]);
        return (ClubRecord) a.a().c();
    }
}
