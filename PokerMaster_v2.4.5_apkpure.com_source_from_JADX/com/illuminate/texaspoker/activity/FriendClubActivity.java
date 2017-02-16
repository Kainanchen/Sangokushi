package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.illuminate.texaspoker.p055a.FriendClubSmallListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.NetworkUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FriendClubActivity extends BaseToolBarActivity {
    private static String f4424d;
    private long f4425e;
    private FriendUser f4426f;
    private List<ChatUser> f4427g;
    private ListView f4428h;
    private FriendClubSmallListAdapter f4429i;

    /* renamed from: com.illuminate.texaspoker.activity.FriendClubActivity.1 */
    class C06141 implements OnClickListener {
        final /* synthetic */ FriendClubActivity f4421a;

        C06141(FriendClubActivity friendClubActivity) {
            this.f4421a = friendClubActivity;
        }

        public final void onClick(View view) {
            this.f4421a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendClubActivity.2 */
    class C06152 implements Comparator<ChatUser> {
        final /* synthetic */ FriendClubActivity f4422a;

        C06152(FriendClubActivity friendClubActivity) {
            this.f4422a = friendClubActivity;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ChatUser chatUser = (ChatUser) obj2;
            ChatRoom b = ((ChatUser) obj).m3731b();
            ChatRoom b2 = chatUser.m3731b();
            if (b.f5752m.longValue() > b2.f5752m.longValue()) {
                return -1;
            }
            if (b.f5752m.longValue() < b2.f5752m.longValue()) {
                return 1;
            }
            if (b.f5729P.intValue() > b2.f5729P.intValue()) {
                return -1;
            }
            if (b.f5729P.intValue() < b2.f5729P.intValue()) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendClubActivity.3 */
    class C06163 implements OnItemClickListener {
        final /* synthetic */ FriendClubActivity f4423a;

        C06163(FriendClubActivity friendClubActivity) {
            this.f4423a = friendClubActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            FriendClubActivity.m3110a(this.f4423a, i);
        }
    }

    static {
        f4424d = "FriendClubActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968636);
        this.f4425e = getIntent().getExtras().getLong("friendUuid");
        this.f4427g = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C06141(this));
        this.f4428h = (ListView) findViewById(2131558729);
        this.f4429i = new FriendClubSmallListAdapter(this, this.f4427g, this.f4425e);
        this.f4428h.setAdapter(this.f4429i);
        this.f4428h.setOnItemClickListener(new C06163(this));
    }

    protected void onResume() {
        super.onResume();
        m3109a();
        NetworkUtil.m4073a();
        NetworkUtil.m4187q(this.f4425e);
    }

    private void m3109a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4426f = DBManager.m3631a().f5563c.m3639a(this.f4425e);
            Collection b = DBManager.m3631a().f5569i.m3615b(this.f4425e);
            Collections.sort(b, new C06152(this));
            this.f4427g.clear();
            this.f4427g.addAll(b);
            this.f4429i.notifyDataSetChanged();
            setTitle(this.f4426f.f5838q);
        }
    }

    protected final void m3111a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m3109a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_FRIEND")) {
            m3109a();
        }
    }

    static /* synthetic */ void m3110a(FriendClubActivity friendClubActivity, int i) {
        ChatRoom b = ((ChatUser) friendClubActivity.f4427g.get(i)).m3731b();
        Intent intent = new Intent(friendClubActivity, ClubBaseInfoActivity.class);
        intent.putExtra("clubId", b.f5741b);
        friendClubActivity.startActivity(intent);
    }
}
