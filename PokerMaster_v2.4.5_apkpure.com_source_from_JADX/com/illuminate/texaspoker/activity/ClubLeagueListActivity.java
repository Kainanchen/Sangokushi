package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.illuminate.texaspoker.p055a.ClubLeagueExpandableListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.LeagueClub;
import com.illuminate.texaspoker.utils.NetworkUtil;
import java.util.ArrayList;
import java.util.List;

public class ClubLeagueListActivity extends BaseToolBarActivity {
    private static String f4042d;
    private long f4043e;
    private boolean f4044f;
    private boolean f4045g;
    private ChatRoom f4046h;
    private List<Integer> f4047i;
    private List<LeagueClub> f4048j;
    private List<LeagueClub> f4049k;
    private View f4050l;
    private ExpandableListView f4051m;
    private ClubLeagueExpandableListAdapter f4052n;

    /* renamed from: com.illuminate.texaspoker.activity.ClubLeagueListActivity.1 */
    class C04651 implements OnClickListener {
        final /* synthetic */ ClubLeagueListActivity f4039a;

        C04651(ClubLeagueListActivity clubLeagueListActivity) {
            this.f4039a = clubLeagueListActivity;
        }

        public final void onClick(View view) {
            this.f4039a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubLeagueListActivity.2 */
    class C04662 implements OnGroupClickListener {
        final /* synthetic */ ClubLeagueListActivity f4040a;

        C04662(ClubLeagueListActivity clubLeagueListActivity) {
            this.f4040a = clubLeagueListActivity;
        }

        public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubLeagueListActivity.3 */
    class C04673 implements OnChildClickListener {
        final /* synthetic */ ClubLeagueListActivity f4041a;

        C04673(ClubLeagueListActivity clubLeagueListActivity) {
            this.f4041a = clubLeagueListActivity;
        }

        public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            LeagueClub leagueClub;
            if (((Integer) this.f4041a.f4047i.get(i)).intValue() == 0) {
                leagueClub = (LeagueClub) this.f4041a.f4048j.get(i2);
            } else {
                leagueClub = (LeagueClub) this.f4041a.f4049k.get(i2);
            }
            Intent intent = new Intent(this.f4041a, LeagueInfoActivity.class);
            intent.putExtra("lClubId", this.f4041a.f4043e);
            intent.putExtra("lLeagueID", leagueClub.f5914b);
            this.f4041a.startActivity(intent);
            return false;
        }
    }

    static {
        f4042d = "ClubLeagueListActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968619);
        this.f4043e = getIntent().getExtras().getLong("lClubId");
        this.f4047i = new ArrayList();
        this.f4048j = new ArrayList();
        this.f4049k = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C04651(this));
        this.f4050l = findViewById(2131558653);
        this.f4051m = (ExpandableListView) findViewById(2131558654);
        this.f4052n = new ClubLeagueExpandableListAdapter(this, this.f4047i, this.f4048j, this.f4049k);
        this.f4051m.setAdapter(this.f4052n);
        this.f4051m.setOnGroupClickListener(new C04662(this));
        this.f4051m.setOnChildClickListener(new C04673(this));
    }

    protected void onResume() {
        super.onResume();
        m2940a();
        NetworkUtil.m4073a();
        NetworkUtil.m4195u(this.f4043e);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        ChatRoom a = DBManager.m3631a().f5565e.m3590a(this.f4043e, 2);
        if (a != null && a.f5734U.booleanValue()) {
            getMenuInflater().inflate(2131689479, menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        Intent intent;
        if (itemId == 2131559431) {
            intent = new Intent(this, CreateLeagueActivity.class);
            intent.putExtra("lClubId", this.f4043e);
            startActivity(intent);
            return true;
        } else if (itemId != 2131559432) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            intent = new Intent(this, JoinLeagueActivity.class);
            intent.putExtra("lClubId", this.f4043e);
            startActivity(intent);
            return true;
        }
    }

    private void m2940a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4046h = DBManager.m3631a().f5565e.m3590a(this.f4043e, 2);
            this.f4045g = false;
            if (this.f4046h.f5717D == null) {
                this.f4044f = false;
            } else {
                this.f4044f = this.f4046h.f5717D.booleanValue();
            }
            if (this.f4044f) {
                this.f4045g = true;
            } else {
                this.f4045g = false;
            }
            this.f4047i.clear();
            this.f4048j.clear();
            this.f4049k.clear();
            List<LeagueClub> a = DBManager.m3631a().f5581u.m3671a(this.f4043e);
            for (LeagueClub leagueClub : a) {
                leagueClub.m3738a();
                System.out.println();
                if (leagueClub.m3738a().f5905c.longValue() == this.f4043e) {
                    this.f4048j.add(leagueClub);
                } else {
                    this.f4049k.add(leagueClub);
                }
            }
            DBManager.m3631a().f5580t.m3675a(3222129);
            if (!this.f4048j.isEmpty()) {
                this.f4047i.add(Integer.valueOf(0));
            }
            if (!this.f4049k.isEmpty()) {
                this.f4047i.add(Integer.valueOf(1));
            }
            if (a.isEmpty()) {
                this.f4050l.setVisibility(0);
                this.f4051m.setVisibility(4);
            } else {
                this.f4050l.setVisibility(8);
                this.f4051m.setVisibility(0);
            }
            this.f4052n.notifyDataSetChanged();
            int size = this.f4047i.size();
            for (int i = 0; i < size; i++) {
                this.f4051m.expandGroup(i);
            }
            invalidateOptionsMenu();
        }
    }

    protected final void m2944a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m2940a();
            NetworkUtil.m4073a();
            NetworkUtil.m4195u(this.f4043e);
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHATROOM")) {
            m2940a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SETTING")) {
            m2940a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_LEAGUE_LIST_SUCCESS")) {
            m2940a();
        }
    }
}
