package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.illuminate.texaspoker.dao.ClubFundLogDao.Properties;
import com.illuminate.texaspoker.p055a.ClubFundListAdapter;
import com.illuminate.texaspoker.p057b.ClubFundLogDBManager;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ClubFundLog;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.Utility;
import java.util.ArrayList;
import java.util.List;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

public class ClubFundActivity extends BaseToolBarActivity {
    private static String f3943d;
    private long f3944e;
    private ChatRoom f3945f;
    private List<ClubFundLog> f3946g;
    private TextView f3947h;
    private ClubFundListAdapter f3948i;

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundActivity.1 */
    class C04431 implements OnClickListener {
        final /* synthetic */ ClubFundActivity f3939a;

        C04431(ClubFundActivity clubFundActivity) {
            this.f3939a = clubFundActivity;
        }

        public final void onClick(View view) {
            this.f3939a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundActivity.2 */
    class C04442 implements OnClickListener {
        final /* synthetic */ ClubFundActivity f3940a;

        C04442(ClubFundActivity clubFundActivity) {
            this.f3940a = clubFundActivity;
        }

        public final void onClick(View view) {
            ClubFundActivity.m2912a(this.f3940a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundActivity.3 */
    class C04453 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubFundActivity f3941a;

        C04453(ClubFundActivity clubFundActivity) {
            this.f3941a = clubFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f3941a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundActivity.4 */
    class C04464 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubFundActivity f3942a;

        C04464(ClubFundActivity clubFundActivity) {
            this.f3942a = clubFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f3942a.finish();
        }
    }

    static {
        f3943d = "ClubFundActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968616);
        this.f3944e = getIntent().getExtras().getLong("lClubId");
        this.f3946g = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C04431(this));
        ((Button) findViewById(2131558628)).setOnClickListener(new C04442(this));
        ListView listView = (ListView) findViewById(2131558629);
        listView.addFooterView(LayoutInflater.from(this).inflate(2130968750, null), null, false);
        this.f3948i = new ClubFundListAdapter(this, this.f3946g);
        listView.setAdapter(this.f3948i);
        this.f3947h = (TextView) findViewById(2131558627);
    }

    protected void onResume() {
        super.onResume();
        m2911a();
        NetworkUtil.m4073a();
        NetworkUtil.m4185p(this.f3944e);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689478, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559429) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f3945f.f5734U == null || !this.f3945f.f5734U.booleanValue()) {
            new Builder(this).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new C04453(this)).show();
        } else {
            Intent intent = new Intent(this, ClubFundUserActivity.class);
            intent.putExtra("lClubId", this.f3945f.f5741b);
            startActivity(intent);
        }
        return true;
    }

    private void m2911a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f3945f = DBManager.m3631a().f5565e.m3590a(this.f3944e, 2);
            this.f3946g.clear();
            List list = this.f3946g;
            ClubFundLogDBManager clubFundLogDBManager = DBManager.m3631a().f5576p;
            long j = this.f3944e;
            g a = g.a(clubFundLogDBManager.f5532a.f6429D);
            a.a(Properties.f6209d.a(Long.valueOf(j)), new i[0]);
            a.a(20);
            a.b(new f[]{Properties.f6210e});
            list.addAll(a.a().b());
            this.f3947h.setText(Utility.m4502g(this.f3945f.f5752m.longValue()));
            this.f3948i.notifyDataSetChanged();
        }
    }

    protected final void m2913a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            if (!DBManager.m3631a().m3632b()) {
                this.f3948i.notifyDataSetChanged();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHATROOM")) {
            m2911a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_FUND_LIST_SUCCESS")) {
            m2911a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_FUND_LIST_FAULT")) {
            m2911a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m2911a();
        }
    }

    static /* synthetic */ void m2912a(ClubFundActivity clubFundActivity) {
        if (clubFundActivity.f3945f.f5734U == null || !clubFundActivity.f3945f.f5734U.booleanValue()) {
            new Builder(clubFundActivity).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new C04464(clubFundActivity)).show();
            return;
        }
        Intent intent = new Intent(clubFundActivity, ClubChargeFundActivity.class);
        intent.putExtra("lClubId", clubFundActivity.f3945f.f5741b);
        clubFundActivity.startActivity(intent);
    }
}
