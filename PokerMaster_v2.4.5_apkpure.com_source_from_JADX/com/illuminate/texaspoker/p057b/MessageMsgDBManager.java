package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.MessageMsgDao;
import com.illuminate.texaspoker.dao.MessageMsgDao.Properties;
import com.illuminate.texaspoker.p058c.MessageMsg;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerHttp.SystemMsgBaseInfo;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;

/* renamed from: com.illuminate.texaspoker.b.t */
public final class MessageMsgDBManager {
    public DaoSession f5603a;
    private a f5604b;

    public MessageMsgDBManager(a aVar, DaoSession daoSession) {
        this.f5604b = aVar;
        this.f5603a = daoSession;
    }

    public final MessageMsg m3686a(long j) {
        g a = g.a(this.f5603a.f6439N);
        a.a(Properties.f6357f.a(Long.valueOf(j)), new i[0]);
        return (MessageMsg) a.a().c();
    }

    public final void m3687a() {
        MessageMsgDao messageMsgDao = this.f5603a.f6439N;
        this.f5604b.a();
        try {
            g a = g.a(messageMsgDao);
            a.a(Properties.f6353b.a(Boolean.valueOf(false)), new i[0]);
            for (MessageMsg messageMsg : a.a().b()) {
                messageMsg.f5941b = Boolean.valueOf(true);
                messageMsgDao.d(messageMsg);
            }
            this.f5604b.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("MessageMsgDBManager", e.getMessage(), e);
        } finally {
            this.f5604b.b();
        }
    }

    public final void m3688a(List<SystemMsgBaseInfo> list, boolean z) {
        MessageMsgDao messageMsgDao = this.f5603a.f6439N;
        this.f5604b.a();
        try {
            for (SystemMsgBaseInfo systemMsgBaseInfo : list) {
                MessageMsg a = m3686a(systemMsgBaseInfo.getLSystemMsgID());
                if (a == null) {
                    a = new MessageMsg();
                    a.f5941b = Boolean.valueOf(z);
                }
                a.f5945f = Long.valueOf(systemMsgBaseInfo.getLSystemMsgID());
                a.f5944e = Integer.valueOf(systemMsgBaseInfo.getESystemMessageType().getNumber());
                a.f5949j = systemMsgBaseInfo.getSSystemMsgTitle();
                a.f5948i = systemMsgBaseInfo.getSSystemMsgSummary();
                a.f5943d = Integer.valueOf(systemMsgBaseInfo.getESystemMessageContentType().getNumber());
                a.f5950k = systemMsgBaseInfo.getSSystemMsgUrl();
                a.f5947h = systemMsgBaseInfo.getSSystemMsgImgUrl();
                a.f5946g = Long.valueOf(systemMsgBaseInfo.getLSystemSendTime());
                a.f5942c = Boolean.valueOf(false);
                a.f5951l = LetterIndexBar.SEARCH_ICON_LETTER;
                messageMsgDao.d(a);
            }
            this.f5604b.c();
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("MessageMsgDBManager", e.getMessage(), e);
        } finally {
            this.f5604b.b();
        }
    }

    public final void m3689b(long j) {
        MessageMsgDao messageMsgDao = this.f5603a.f6439N;
        MessageMsg a = m3686a(j);
        if (a != null) {
            a.f5942c = Boolean.valueOf(true);
            messageMsgDao.d(a);
        }
    }
}
