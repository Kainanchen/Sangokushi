package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.illuminate.texaspoker.p055a.ae;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.MapList;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.view.SideBar;
import com.illuminate.texaspoker.view.SideBar.C0489a;
import java.util.ArrayList;
import java.util.List;

public class MyFriendActivity extends BaseToolBarActivity {
    private static String f4695d;
    private List<String> f4696e;
    private MapList<String, List<FriendUser>> f4697f;
    private ae f4698g;
    private ExpandableListView f4699h;
    private TextView f4700i;
    private ImageView f4701j;
    private TextView f4702k;
    private SideBar f4703l;
    private TextView f4704m;

    /* renamed from: com.illuminate.texaspoker.activity.MyFriendActivity.1 */
    class C06921 implements OnClickListener {
        final /* synthetic */ MyFriendActivity f4690a;

        C06921(MyFriendActivity myFriendActivity) {
            this.f4690a = myFriendActivity;
        }

        public final void onClick(View view) {
            this.f4690a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MyFriendActivity.2 */
    class C06932 implements OnGroupClickListener {
        final /* synthetic */ MyFriendActivity f4691a;

        C06932(MyFriendActivity myFriendActivity) {
            this.f4691a = myFriendActivity;
        }

        public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MyFriendActivity.3 */
    class C06943 implements OnItemClickListener {
        final /* synthetic */ MyFriendActivity f4692a;

        C06943(MyFriendActivity myFriendActivity) {
            this.f4692a = myFriendActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                DBManager.m3631a().f5564d.m3702b();
                this.f4692a.startActivity(new Intent(this.f4692a, NewFriendActivity.class));
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MyFriendActivity.4 */
    class C06954 implements OnChildClickListener {
        final /* synthetic */ MyFriendActivity f4693a;

        C06954(MyFriendActivity myFriendActivity) {
            this.f4693a = myFriendActivity;
        }

        public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            MyFriendActivity.m3225a(this.f4693a, i, i2);
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.MyFriendActivity.5 */
    class C06965 implements C0489a {
        final /* synthetic */ MyFriendActivity f4694a;

        C06965(MyFriendActivity myFriendActivity) {
            this.f4694a = myFriendActivity;
        }

        public final void m3222a(String str) {
            int positionForSection = this.f4694a.f4698g.getPositionForSection(str.charAt(0));
            if (positionForSection != -1) {
                this.f4694a.f4699h.setSelectedGroup(positionForSection);
            }
        }
    }

    static {
        f4695d = "MyFriendActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968651);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C06921(this));
        this.f4699h = (ExpandableListView) findViewById(2131558777);
        LayoutInflater from = LayoutInflater.from(this);
        View inflate = from.inflate(2130968799, null);
        this.f4699h.addHeaderView(inflate);
        View inflate2 = from.inflate(2130968798, null);
        this.f4699h.addFooterView(inflate2, null, false);
        this.f4700i = (TextView) inflate2.findViewById(2131559277);
        this.f4698g = new ae(this);
        this.f4698g.f2843a = new MapList();
        this.f4699h.setAdapter(this.f4698g);
        this.f4699h.setOnGroupClickListener(new C06932(this));
        this.f4699h.setOnItemClickListener(new C06943(this));
        this.f4699h.setOnChildClickListener(new C06954(this));
        this.f4701j = (ImageView) inflate.findViewById(2131558939);
        this.f4702k = (TextView) inflate.findViewById(2131558940);
        this.f4703l = (SideBar) findViewById(2131558667);
        this.f4704m = (TextView) findViewById(2131558666);
        this.f4703l.setTextView(this.f4704m);
        this.f4703l.setOnTouchingLetterChangedListener(new C06965(this));
    }

    private void m3224a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4697f = new MapList();
            this.f4696e = new ArrayList();
            for (FriendUser friendUser : DBManager.m3631a().f5563c.m3642a()) {
                List list = (List) this.f4697f.m4240a(friendUser.f5833l);
                if (list == null) {
                    list = new ArrayList();
                    this.f4697f.m4241a(friendUser.f5833l, list);
                    this.f4696e.add(friendUser.f5833l);
                }
                list.add(friendUser);
            }
            this.f4700i.setText(String.format(getResources().getString(2131165527), new Object[]{Integer.valueOf(r3.size())}));
            this.f4698g.f2843a = this.f4697f;
            this.f4698g.notifyDataSetChanged();
            int a = this.f4697f.m4238a();
            for (int i = 0; i < a; i++) {
                this.f4699h.expandGroup(i);
            }
            long a2 = DBManager.m3631a().f5564d.m3701a();
            if (a2 == 0) {
                this.f4701j.setVisibility(4);
                this.f4702k.setVisibility(4);
                return;
            }
            if (a2 > 99) {
                this.f4702k.setText("\u22c5\u22c5\u22c5");
            } else {
                this.f4702k.setText(String.valueOf(a2));
            }
            this.f4701j.setVisibility(0);
            this.f4702k.setVisibility(0);
        }
    }

    protected void onResume() {
        super.onResume();
        m3224a();
        NetworkUtil.m4073a();
        NetworkUtil.m4180n();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689472, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559423) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent(this, AddFriendActivity.class));
        return true;
    }

    protected final void m3227a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_NEW_FRIEND")) {
            m3224a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_FRIEND")) {
            m3224a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            this.f4698g.notifyDataSetChanged();
        }
    }

    static /* synthetic */ void m3225a(MyFriendActivity myFriendActivity, int i, int i2) {
        FriendUser friendUser = (FriendUser) ((List) myFriendActivity.f4697f.m4239a(i)).get(i2);
        Intent intent = new Intent(myFriendActivity, FriendInfoActivity.class);
        intent.putExtra("friendUuid", friendUser.f5842u);
        myFriendActivity.startActivity(intent);
    }
}
