package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.illuminate.texaspoker.dao.SocialMsgDao;
import com.illuminate.texaspoker.dao.SocialMsgDao.Properties;
import com.illuminate.texaspoker.p055a.ag;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p057b.SocialMsgDBManager;
import com.illuminate.texaspoker.p058c.FriendshipChain;
import com.illuminate.texaspoker.p058c.SocialMsg;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerHttpUser.FRIEND_MESSAGE_TYPE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

public class NewFriendActivity extends BaseToolBarActivity {
    private static String f4741d;
    private ArrayList f4742e;
    private ag f4743f;
    private ListView f4744g;

    /* renamed from: com.illuminate.texaspoker.activity.NewFriendActivity.1 */
    class C07081 implements OnClickListener {
        final /* synthetic */ NewFriendActivity f4735a;

        C07081(NewFriendActivity newFriendActivity) {
            this.f4735a = newFriendActivity;
        }

        public final void onClick(View view) {
            this.f4735a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewFriendActivity.2 */
    class C07092 implements OnItemClickListener {
        final /* synthetic */ NewFriendActivity f4736a;

        C07092(NewFriendActivity newFriendActivity) {
            this.f4736a = newFriendActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SocialMsg socialMsg = (SocialMsg) ((Object[]) this.f4736a.f4742e.get(i))[0];
            Intent intent = new Intent(this.f4736a, FriendInfoActivity.class);
            intent.putExtra("friendUuid", socialMsg.m3748a().f5842u);
            this.f4736a.startActivity(intent);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewFriendActivity.3 */
    class C07113 implements OnItemLongClickListener {
        final /* synthetic */ NewFriendActivity f4739a;

        /* renamed from: com.illuminate.texaspoker.activity.NewFriendActivity.3.1 */
        class C07101 implements DialogInterface.OnClickListener {
            final /* synthetic */ int f4737a;
            final /* synthetic */ C07113 f4738b;

            C07101(C07113 c07113, int i) {
                this.f4738b = c07113;
                this.f4737a = i;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    SocialMsg socialMsg = (SocialMsg) ((Object[]) this.f4738b.f4739a.f4742e.get(this.f4737a))[0];
                    SocialMsgDBManager socialMsgDBManager = DBManager.m3631a().f5564d;
                    long longValue = socialMsg.f5996e.longValue();
                    SocialMsgDao socialMsgDao = socialMsgDBManager.f5609a.f6442Q;
                    g a = g.a(socialMsgDao);
                    a.a(Properties.f6408e.a(Long.valueOf(longValue)), new i[0]);
                    socialMsgDao.e((SocialMsg) a.a().c());
                    this.f4738b.f4739a.m3234a();
                }
            }
        }

        C07113(NewFriendActivity newFriendActivity) {
            this.f4739a = newFriendActivity;
        }

        public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            new Builder(this.f4739a).setItems(2131492865, new C07101(this, i)).show();
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewFriendActivity.4 */
    class C07124 implements DialogInterface.OnClickListener {
        final /* synthetic */ NewFriendActivity f4740a;

        C07124(NewFriendActivity newFriendActivity) {
            this.f4740a = newFriendActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f4741d = "NewFriendActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968654);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C07081(this));
        this.f4744g = (ListView) findViewById(2131558794);
        this.f4743f = new ag(this);
        this.f4743f.f2861a = new ArrayList();
        this.f4744g.setAdapter(this.f4743f);
        this.f4744g.setOnItemClickListener(new C07092(this));
        this.f4744g.setOnItemLongClickListener(new C07113(this));
    }

    protected void onResume() {
        super.onResume();
        m3234a();
    }

    protected void onStop() {
        super.onStop();
        if (!DBManager.m3631a().m3632b()) {
            DBManager.m3631a().f5564d.m3702b();
        }
    }

    private void m3234a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4742e = new ArrayList();
            Map hashMap = new HashMap();
            List<FriendshipChain> a = DBManager.m3631a().f5562b.m3651a(DBManager.f5556z);
            if (a != null) {
                for (FriendshipChain friendshipChain : a) {
                    hashMap.put(friendshipChain.f5859l, friendshipChain.f5854g);
                }
            }
            g a2 = g.a(DBManager.m3631a().f5564d.f5609a.f6442Q);
            a2.a(Properties.f6408e.b(Integer.valueOf(100)), new i[0]);
            a2.b(new f[]{Properties.f6409f});
            for (SocialMsg socialMsg : a2.a().b()) {
                String str = null;
                if (socialMsg.f5993b.intValue() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_RECOMMAND_FRIEND.getNumber()) {
                    str = (String) hashMap.get(Long.valueOf(socialMsg.m3748a().f5842u.longValue()));
                }
                if (str == null) {
                    str = LetterIndexBar.SEARCH_ICON_LETTER;
                }
                this.f4742e.add(new Object[]{socialMsg, str});
            }
            this.f4743f.f2861a = this.f4742e;
            this.f4743f.notifyDataSetChanged();
        }
    }

    protected final void m3236a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            this.f4743f.notifyDataSetChanged();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_NEW_FRIEND")) {
            m3234a();
        } else if (str.equalsIgnoreCase("INVITE_FRIEND_SUCCESS")) {
            this.f4743f.f2862b.dismiss();
            m3234a();
        } else if (str.equalsIgnoreCase("INVITE_FRIEND_FAULT")) {
            int intValue = ((Integer) list.get(0)).intValue();
            this.f4743f.f2862b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C07124(this)).show();
            m3234a();
        }
    }
}
