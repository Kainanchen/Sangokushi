package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.illuminate.texaspoker.p055a.ad;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.utils.MapList;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.Utility;
import java.util.ArrayList;
import java.util.List;

public class MyClubActivity extends BaseToolBarActivity {
    private static String f4683d;
    private MapList<String, List<ChatRoom>> f4684e;
    private List<String> f4685f;
    private View f4686g;
    private View f4687h;
    private ad f4688i;
    private ExpandableListView f4689j;

    /* renamed from: com.illuminate.texaspoker.activity.MyClubActivity.1 */
    class C06871 implements OnClickListener {
        final /* synthetic */ MyClubActivity f4678a;

        C06871(MyClubActivity myClubActivity) {
            this.f4678a = myClubActivity;
        }

        public final void onClick(View view) {
            this.f4678a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MyClubActivity.2 */
    class C06882 implements OnGroupClickListener {
        final /* synthetic */ MyClubActivity f4679a;

        C06882(MyClubActivity myClubActivity) {
            this.f4679a = myClubActivity;
        }

        public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MyClubActivity.3 */
    class C06893 implements OnChildClickListener {
        final /* synthetic */ MyClubActivity f4680a;

        C06893(MyClubActivity myClubActivity) {
            this.f4680a = myClubActivity;
        }

        public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            MyClubActivity.m3216a(this.f4680a, ((ChatRoom) ((List) this.f4680a.f4684e.m4239a(i)).get(i2)).f5741b.longValue());
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MyClubActivity.4 */
    class C06904 implements OnClickListener {
        final /* synthetic */ MyClubActivity f4681a;

        C06904(MyClubActivity myClubActivity) {
            this.f4681a = myClubActivity;
        }

        public final void onClick(View view) {
            this.f4681a.m3219d();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MyClubActivity.5 */
    class C06915 implements OnClickListener {
        final /* synthetic */ MyClubActivity f4682a;

        C06915(MyClubActivity myClubActivity) {
            this.f4682a = myClubActivity;
        }

        public final void onClick(View view) {
            this.f4682a.m3220e();
        }
    }

    static {
        f4683d = "MyClubActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968650);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C06871(this));
        this.f4684e = new MapList();
        this.f4685f = new ArrayList();
        this.f4686g = findViewById(2131558750);
        this.f4687h = findViewById(2131558774);
        this.f4689j = (ExpandableListView) findViewById(2131558773);
        this.f4688i = new ad(this, this.f4684e, this.f4685f);
        this.f4689j.setAdapter(this.f4688i);
        this.f4689j.setOnGroupClickListener(new C06882(this));
        this.f4689j.setOnChildClickListener(new C06893(this));
        ((Button) findViewById(2131558775)).setOnClickListener(new C06904(this));
        ((Button) findViewById(2131558776)).setOnClickListener(new C06915(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689493, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131559445) {
            m3219d();
            return true;
        } else if (itemId != 2131559446) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            m3220e();
            return true;
        }
    }

    private void m3215a() {
        if (!DBManager.m3631a().m3632b()) {
            List<ChatRoom> c = DBManager.m3631a().f5565e.m3605c();
            if (c.size() > 0) {
                this.f4687h.setVisibility(8);
                this.f4686g.setVisibility(0);
            } else {
                this.f4687h.setVisibility(0);
                this.f4686g.setVisibility(4);
            }
            this.f4684e.m4243b();
            this.f4685f.clear();
            for (ChatRoom chatRoom : c) {
                List list = (List) this.f4684e.m4240a(chatRoom.f5765z);
                if (list == null) {
                    list = new ArrayList();
                    this.f4684e.m4244b(chatRoom.f5765z, list);
                    this.f4685f.add(0, Utility.m4506h(chatRoom.f5765z));
                }
                list.add(chatRoom);
            }
            this.f4688i.notifyDataSetChanged();
            int a = this.f4684e.m4238a();
            for (int i = 0; i < a; i++) {
                this.f4689j.expandGroup(i);
            }
        }
    }

    protected void onResume() {
        super.onResume();
        m3215a();
        NetworkUtil.m4073a();
        NetworkUtil.m4192t();
    }

    private void m3219d() {
        startActivity(new Intent(this, NewClubActivity.class));
    }

    private void m3220e() {
        startActivity(new Intent(this, ClubSearchActivity.class));
    }

    protected final void m3221a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_MY_CLUB")) {
            m3215a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_MOMENTS")) {
            m3215a();
        }
    }

    static /* synthetic */ void m3216a(MyClubActivity myClubActivity, long j) {
        Intent intent = new Intent(myClubActivity, ChatRoomActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("eTalkType", 2);
        bundle.putLong("lChatRoomId", j);
        intent.putExtras(bundle);
        myClubActivity.startActivity(intent);
    }
}
