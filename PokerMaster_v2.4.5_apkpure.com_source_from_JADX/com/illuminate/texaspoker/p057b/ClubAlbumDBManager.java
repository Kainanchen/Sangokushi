package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.google.protobuf.ProtocolStringList;
import com.illuminate.texaspoker.dao.ClubAlbumDao;
import com.illuminate.texaspoker.dao.ClubAlbumDao.Properties;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.p058c.ClubAlbum;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.g */
public final class ClubAlbumDBManager {
    private a f5530a;
    private DaoSession f5531b;

    public ClubAlbumDBManager(a aVar, DaoSession daoSession) {
        this.f5530a = aVar;
        this.f5531b = daoSession;
    }

    public final List<ClubAlbum> m3618a(long j) {
        g a = g.a(this.f5531b.f6428C);
        a.a(Properties.f6203c.a(Long.valueOf(j)), new i[0]);
        a.a(new f[]{Properties.f6202b});
        return a.a().b();
    }

    public final void m3619a(long j, ProtocolStringList protocolStringList, ProtocolStringList protocolStringList2) {
        int size;
        ClubAlbumDao clubAlbumDao = this.f5531b.f6428C;
        for (ClubAlbum e : m3618a(j)) {
            clubAlbumDao.e(e);
        }
        if (protocolStringList.size() <= protocolStringList2.size()) {
            size = protocolStringList.size();
        } else {
            size = protocolStringList2.size();
        }
        for (int i = 0; i < size; i++) {
            ClubAlbum clubAlbum;
            String str = (String) protocolStringList.get(i);
            String str2 = (String) protocolStringList2.get(i);
            g a = g.a(this.f5531b.f6428C);
            a.a(Properties.f6203c.a(Long.valueOf(j)), new i[0]);
            a.a(Properties.f6202b.a(Integer.valueOf(i)), new i[0]);
            List b = a.a().b();
            if (b.size() > 0) {
                clubAlbum = (ClubAlbum) b.get(0);
            } else {
                clubAlbum = new ClubAlbum();
            }
            clubAlbum.f5780b = Integer.valueOf(i);
            clubAlbum.f5781c = Long.valueOf(j);
            clubAlbum.f5783e = str;
            clubAlbum.f5782d = str2;
            clubAlbumDao.d(clubAlbum);
        }
    }

    public final void m3620b(long j, ProtocolStringList protocolStringList, ProtocolStringList protocolStringList2) {
        this.f5530a.a();
        try {
            m3619a(j, protocolStringList, protocolStringList2);
            this.f5530a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("ClubAlbumDBManager", e.getMessage(), e);
        } finally {
            this.f5530a.b();
        }
    }
}
