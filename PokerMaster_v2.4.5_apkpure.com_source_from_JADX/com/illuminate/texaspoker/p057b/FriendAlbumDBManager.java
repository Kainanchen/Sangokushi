package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.google.protobuf.ProtocolStringList;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.FriendAlbumDao;
import com.illuminate.texaspoker.dao.FriendAlbumDao.Properties;
import com.illuminate.texaspoker.p058c.FriendAlbum;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.m */
public final class FriendAlbumDBManager {
    private a f5583a;
    private DaoSession f5584b;

    public FriendAlbumDBManager(a aVar, DaoSession daoSession) {
        this.f5583a = aVar;
        this.f5584b = daoSession;
    }

    public final List<FriendAlbum> m3636a(long j) {
        g a = g.a(this.f5584b.f6432G);
        a.a(Properties.f6235c.a(Long.valueOf(j)), new i[0]);
        a.a(new f[]{Properties.f6234b});
        return a.a().b();
    }

    public final void m3637a(long j, ProtocolStringList protocolStringList, ProtocolStringList protocolStringList2) {
        int size;
        FriendAlbumDao friendAlbumDao = this.f5584b.f6432G;
        for (FriendAlbum e : m3636a(j)) {
            friendAlbumDao.e(e);
        }
        if (protocolStringList.size() <= protocolStringList2.size()) {
            size = protocolStringList.size();
        } else {
            size = protocolStringList2.size();
        }
        for (int i = 0; i < size; i++) {
            FriendAlbum friendAlbum;
            String str = (String) protocolStringList.get(i);
            String str2 = (String) protocolStringList2.get(i);
            g a = g.a(this.f5584b.f6432G);
            a.a(Properties.f6235c.a(Long.valueOf(j)), new i[0]);
            a.a(Properties.f6234b.a(Integer.valueOf(i)), new i[0]);
            List b = a.a().b();
            if (b.size() > 0) {
                friendAlbum = (FriendAlbum) b.get(0);
            } else {
                friendAlbum = new FriendAlbum();
            }
            friendAlbum.f5815b = Integer.valueOf(i);
            friendAlbum.f5816c = Long.valueOf(j);
            friendAlbum.f5818e = str;
            friendAlbum.f5817d = str2;
            friendAlbumDao.d(friendAlbum);
        }
    }

    public final void m3638b(long j, ProtocolStringList protocolStringList, ProtocolStringList protocolStringList2) {
        this.f5583a.a();
        try {
            m3637a(j, protocolStringList, protocolStringList2);
            this.f5583a.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("FriendAlbumDBManager", e.getMessage(), e);
        } finally {
            this.f5583a.b();
        }
    }
}
