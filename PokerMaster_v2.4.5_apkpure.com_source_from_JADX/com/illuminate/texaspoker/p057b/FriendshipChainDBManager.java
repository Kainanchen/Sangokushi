package com.illuminate.texaspoker.p057b;

import android.util.Log;
import com.illuminate.texaspoker.dao.DaoSession;
import com.illuminate.texaspoker.dao.FriendshipChainDao;
import com.illuminate.texaspoker.dao.FriendshipChainDao.Properties;
import com.illuminate.texaspoker.p058c.FriendshipChain;
import com.illuminate.texaspoker.p059d.ContactUser;
import com.illuminate.texaspoker.utils.MapList;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.texaspoker.moment.TexasPokerHttpUser.USER_FRIEND_STATE;
import com.texaspoker.moment.TexasPokerHttpUser.UserFriendInfoNet;
import java.util.ArrayList;
import java.util.List;
import org.a.a.a.a;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* renamed from: com.illuminate.texaspoker.b.o */
public final class FriendshipChainDBManager {
    private a f5593a;
    private DaoSession f5594b;

    public FriendshipChainDBManager(a aVar, DaoSession daoSession) {
        this.f5593a = aVar;
        this.f5594b = daoSession;
    }

    private FriendshipChain m3649a(String str, int i) {
        g a = g.a(this.f5594b.f6433H);
        a.a(Properties.f6279m.a(Integer.valueOf(i)), new i[0]);
        a.a(Properties.f6272f.a(str), new i[0]);
        return (FriendshipChain) a.a().c();
    }

    public final FriendshipChain m3650a(Long l) {
        g a = g.a(this.f5594b.f6433H);
        a.a(Properties.f6278l.a(l), new i[0]);
        return (FriendshipChain) a.a().c();
    }

    public final List<FriendshipChain> m3651a(int i) {
        g a = g.a(this.f5594b.f6433H);
        a.a(Properties.f6279m.a(Integer.valueOf(i)), new i[0]);
        a.b(new f[]{Properties.f6269c});
        a.a(new f[]{Properties.f6270d});
        return a.a().b();
    }

    public final List<ContactUser> m3653a(MapList<String, ContactUser> mapList, int i) {
        FriendshipChain a;
        List<ContactUser> arrayList = new ArrayList();
        FriendshipChainDao friendshipChainDao = this.f5594b.f6433H;
        this.f5593a.a();
        List<FriendshipChain> a2 = m3651a(i);
        if (a2.size() > 0) {
            for (FriendshipChain a3 : a2) {
                if (((ContactUser) mapList.m4240a(a3.f5852e)) == null) {
                    friendshipChainDao.e(a3);
                }
            }
        }
        try {
            for (String str : mapList.f6665a) {
                ContactUser contactUser = (ContactUser) mapList.m4240a((Object) str);
                a3 = m3649a(Utility.m4484b(str), i);
                if (a3 == null) {
                    a3 = new FriendshipChain();
                    a3.f5859l = Long.valueOf(0);
                    a3.f5849b = Boolean.valueOf(false);
                    a3.f5850c = Integer.valueOf(DBManager.f5545H);
                }
                if (StringUtils.m4462a(contactUser.f6034a)) {
                    a3.f5851d = "#";
                } else {
                    a3.f5851d = StringUtils.m4463b(contactUser.f6034a).toUpperCase();
                }
                a3.f5860m = Integer.valueOf(i);
                a3.f5852e = contactUser.f6035b;
                a3.f5853f = Utility.m4484b(contactUser.f6035b);
                a3.f5854g = contactUser.f6034a;
                a3.f5855h = contactUser.f6038e;
                arrayList.add(contactUser);
                friendshipChainDao.d(a3);
            }
            this.f5593a.c();
            this.f5593a.b();
            return arrayList;
        } catch (Throwable e) {
            e.printStackTrace();
            Log.e("FriendshipChainDB", e.getMessage(), e);
        } catch (Throwable th) {
            this.f5593a.b();
        }
    }

    public final void m3655a(List<UserFriendInfoNet> list, int i) {
        FriendshipChainDao friendshipChainDao = this.f5594b.f6433H;
        this.f5593a.a();
        try {
            for (UserFriendInfoNet userFriendInfoNet : list) {
                FriendshipChain a = m3649a(userFriendInfoNet.getStUserBaseInfo().getStrID(), i);
                if (a != null) {
                    if (userFriendInfoNet.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_USER) {
                        a.f5850c = Integer.valueOf(DBManager.f5545H);
                    } else if (userFriendInfoNet.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_FRIEND || userFriendInfoNet.getEFriendState() != USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND) {
                        a.f5850c = Integer.valueOf(DBManager.f5546I);
                    } else {
                        a.f5850c = Integer.valueOf(DBManager.f5544G);
                    }
                    DBManager.m3631a().f5563c.m3641a(userFriendInfoNet.getStUserBaseInfo(), false);
                    a.f5859l = Long.valueOf(userFriendInfoNet.getStUserBaseInfo().getUuid());
                    a.f5856i = userFriendInfoNet.getStUserBaseInfo().getStrNick();
                    a.f5857j = userFriendInfoNet.getStUserBaseInfo().getStrCover();
                    a.f5858k = Integer.valueOf(userFriendInfoNet.getStUserBaseInfo().getIGender());
                    friendshipChainDao.d(a);
                }
            }
            this.f5593a.c();
        } finally {
            this.f5593a.b();
        }
    }

    public final List<ContactUser> m3652a(MapList<String, ContactUser> mapList) {
        List<ContactUser> arrayList = new ArrayList();
        FriendshipChainDao friendshipChainDao = this.f5594b.f6433H;
        List<FriendshipChain> a = m3651a(DBManager.f5539B);
        this.f5593a.a();
        try {
            FriendshipChain friendshipChain;
            for (FriendshipChain friendshipChain2 : a) {
                if (((ContactUser) mapList.m4240a(friendshipChain2.f5852e)) == null) {
                    friendshipChainDao.e(friendshipChain2);
                }
            }
            for (Object obj : mapList.f6665a) {
                ContactUser contactUser = (ContactUser) mapList.m4240a(obj);
                int i = DBManager.f5539B;
                g a2 = g.a(this.f5594b.f6433H);
                a2.a(Properties.f6279m.a(Integer.valueOf(i)), new i[0]);
                a2.a(Properties.f6271e.a(obj), new i[0]);
                friendshipChain2 = (FriendshipChain) a2.a().c();
                if (friendshipChain2 == null) {
                    friendshipChain2 = new FriendshipChain();
                    friendshipChain2.f5859l = Long.valueOf(0);
                    friendshipChain2.f5849b = Boolean.valueOf(false);
                    friendshipChain2.f5850c = Integer.valueOf(DBManager.f5545H);
                }
                if (StringUtils.m4462a(contactUser.f6034a)) {
                    friendshipChain2.f5851d = "#";
                } else {
                    friendshipChain2.f5851d = StringUtils.m4463b(contactUser.f6034a).toUpperCase();
                }
                friendshipChain2.f5860m = Integer.valueOf(DBManager.f5539B);
                friendshipChain2.f5852e = contactUser.f6035b;
                friendshipChain2.f5853f = Utility.m4484b(contactUser.f6035b);
                friendshipChain2.f5854g = contactUser.f6034a;
                friendshipChain2.f5857j = contactUser.f6037d;
                arrayList.add(contactUser);
                friendshipChainDao.d(friendshipChain2);
            }
            this.f5593a.c();
            return arrayList;
        } finally {
            this.f5593a.b();
        }
    }

    public final void m3654a(List<UserFriendInfoNet> list) {
        FriendshipChainDao friendshipChainDao = this.f5594b.f6433H;
        this.f5593a.a();
        try {
            for (FriendshipChain friendshipChain : m3651a(DBManager.f5539B)) {
                Object obj;
                for (UserFriendInfoNet stUserBaseInfo : list) {
                    if (stUserBaseInfo.getStUserBaseInfo().getStrID().equalsIgnoreCase(friendshipChain.f5853f)) {
                        obj = null;
                        break;
                    }
                }
                int i = 1;
                if (obj != null) {
                    friendshipChainDao.e(friendshipChain);
                }
            }
            for (UserFriendInfoNet userFriendInfoNet : list) {
                FriendshipChain a = m3649a(userFriendInfoNet.getStUserBaseInfo().getStrID(), DBManager.f5539B);
                if (a != null) {
                    if (userFriendInfoNet.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_USER) {
                        a.f5850c = Integer.valueOf(DBManager.f5545H);
                    } else if (userFriendInfoNet.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_NOT_FRIEND || userFriendInfoNet.getEFriendState() != USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND) {
                        a.f5850c = Integer.valueOf(DBManager.f5546I);
                    } else {
                        a.f5850c = Integer.valueOf(DBManager.f5544G);
                    }
                    DBManager.m3631a().f5563c.m3641a(userFriendInfoNet.getStUserBaseInfo(), false);
                    a.f5859l = Long.valueOf(userFriendInfoNet.getStUserBaseInfo().getUuid());
                    a.f5856i = userFriendInfoNet.getStUserBaseInfo().getStrNick();
                    a.f5857j = userFriendInfoNet.getStUserBaseInfo().getStrCover();
                    a.f5858k = Integer.valueOf(userFriendInfoNet.getStUserBaseInfo().getIGender());
                    friendshipChainDao.d(a);
                }
            }
            this.f5593a.c();
        } finally {
            this.f5593a.b();
        }
    }
}
