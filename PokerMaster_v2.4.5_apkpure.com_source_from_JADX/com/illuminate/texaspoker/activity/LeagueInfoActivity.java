package com.illuminate.texaspoker.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import com.illuminate.texaspoker.dao.LeagueClubDao.Properties;
import com.illuminate.texaspoker.p055a.LeagueClubListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p057b.LeagueClubDBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.League;
import com.illuminate.texaspoker.p058c.LeagueClub;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.a.a.d.g;
import org.a.a.d.i;

public class LeagueInfoActivity extends BaseToolBarActivity {
    private static String f4599d;
    private long f4600e;
    private long f4601f;
    private ChatRoom f4602g;
    private List<LeagueClub> f4603h;
    private boolean f4604i;
    private ListView f4605j;
    private LeagueClubListAdapter f4606k;
    private TextView f4607l;
    private TextView f4608m;
    private TextView f4609n;
    private Button f4610o;
    private TextView f4611p;
    private Button f4612q;
    private Switch f4613r;
    private View f4614s;

    /* renamed from: com.illuminate.texaspoker.activity.LeagueInfoActivity.1 */
    class C06621 implements OnClickListener {
        final /* synthetic */ LeagueInfoActivity f4592a;

        C06621(LeagueInfoActivity leagueInfoActivity) {
            this.f4592a = leagueInfoActivity;
        }

        public final void onClick(View view) {
            this.f4592a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LeagueInfoActivity.2 */
    class C06632 implements OnClickListener {
        final /* synthetic */ LeagueInfoActivity f4593a;

        C06632(LeagueInfoActivity leagueInfoActivity) {
            this.f4593a = leagueInfoActivity;
        }

        public final void onClick(View view) {
            LeagueInfoActivity.m3174a(this.f4593a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LeagueInfoActivity.3 */
    class C06643 implements OnClickListener {
        final /* synthetic */ LeagueInfoActivity f4594a;

        C06643(LeagueInfoActivity leagueInfoActivity) {
            this.f4594a = leagueInfoActivity;
        }

        public final void onClick(View view) {
            ((ClipboardManager) this.f4594a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("lLeagueID", this.f4594a.f4601f));
            this.f4594a.m2732a(2130903589, 2131165440, 1);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LeagueInfoActivity.4 */
    class C06654 implements OnClickListener {
        final /* synthetic */ LeagueInfoActivity f4595a;

        C06654(LeagueInfoActivity leagueInfoActivity) {
            this.f4595a = leagueInfoActivity;
        }

        public final void onClick(View view) {
            NetworkUtil.m4073a();
            NetworkUtil.m4150c(this.f4595a.f4601f, this.f4595a.f4613r.isChecked());
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LeagueInfoActivity.5 */
    class C06665 implements DialogInterface.OnClickListener {
        final /* synthetic */ LeagueInfoActivity f4596a;

        C06665(LeagueInfoActivity leagueInfoActivity) {
            this.f4596a = leagueInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LeagueInfoActivity.6 */
    class C06676 implements DialogInterface.OnClickListener {
        final /* synthetic */ LeagueInfoActivity f4597a;

        C06676(LeagueInfoActivity leagueInfoActivity) {
            this.f4597a = leagueInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.LeagueInfoActivity.7 */
    class C06687 implements DialogInterface.OnClickListener {
        final /* synthetic */ LeagueInfoActivity f4598a;

        C06687(LeagueInfoActivity leagueInfoActivity) {
            this.f4598a = leagueInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f4599d = "LeagueInfoActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968647);
        this.f4603h = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C06621(this));
        Bundle extras = getIntent().getExtras();
        this.f4600e = extras.getLong("lClubId");
        this.f4601f = extras.getLong("lLeagueID");
        this.f4604i = false;
        this.f4605j = (ListView) findViewById(2131558753);
        this.f4606k = new LeagueClubListAdapter(this, this.f4603h, this.f4600e);
        this.f4605j.setAdapter(this.f4606k);
        LayoutInflater from = LayoutInflater.from(this);
        View inflate = from.inflate(2130968786, null);
        this.f4605j.addHeaderView(inflate, null, false);
        this.f4607l = (TextView) inflate.findViewById(2131558705);
        this.f4608m = (TextView) inflate.findViewById(2131559247);
        this.f4609n = (TextView) inflate.findViewById(2131559248);
        this.f4610o = (Button) inflate.findViewById(2131559249);
        this.f4610o.setOnClickListener(new C06632(this));
        View inflate2 = from.inflate(2130968785, null);
        this.f4605j.addFooterView(inflate2, null, false);
        this.f4611p = (TextView) inflate2.findViewById(2131558752);
        this.f4612q = (Button) inflate2.findViewById(2131559244);
        this.f4612q.setOnClickListener(new C06643(this));
        this.f4613r = (Switch) inflate2.findViewById(2131559246);
        this.f4613r.setOnClickListener(new C06654(this));
        this.f4614s = inflate2.findViewById(2131559245);
    }

    protected void onResume() {
        super.onResume();
        m3173a();
        NetworkUtil.m4073a();
        NetworkUtil.m4197v(this.f4601f);
    }

    private void m3173a() {
        this.f4604i = false;
        if (!DBManager.m3631a().m3632b()) {
            this.f4602g = DBManager.m3631a().f5565e.m3590a(this.f4600e, 2);
            if (this.f4602g.f5734U == null || !this.f4602g.f5734U.booleanValue()) {
                this.f4604i = false;
            } else {
                this.f4604i = true;
            }
            League a = DBManager.m3631a().f5580t.m3675a(this.f4601f);
            if (a.f5905c.longValue() != this.f4600e) {
                this.f4604i = false;
            }
            setTitle(a.f5906d);
            this.f4607l.setText(a.f5906d);
            this.f4608m.setText(a.f5912j);
            this.f4609n.setText(a.f5910h + "/" + a.f5911i);
            if (this.f4604i) {
                this.f4610o.setVisibility(0);
                this.f4613r.setEnabled(true);
                this.f4614s.setVisibility(0);
            } else {
                this.f4610o.setVisibility(8);
                this.f4613r.setEnabled(false);
                this.f4614s.setVisibility(8);
            }
            this.f4611p.setText(a.f5904b);
            Collection b = DBManager.m3631a().f5581u.m3672b(this.f4601f);
            this.f4603h.clear();
            this.f4603h.addAll(b);
            this.f4606k.notifyDataSetChanged();
            if (a.f5907e.booleanValue()) {
                this.f4613r.setChecked(true);
            } else {
                this.f4613r.setChecked(false);
            }
        }
    }

    protected final void m3177a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m3173a();
            NetworkUtil.m4073a();
            NetworkUtil.m4197v(this.f4601f);
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHATROOM")) {
            m3173a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SETTING")) {
            m3173a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_LEAGUE_LIST_SUCCESS")) {
            m3173a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_LEAGUE_SUCCESS")) {
            m3173a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m3173a();
        } else if (str.equalsIgnoreCase("NOTIFY_REMOVE_LEAGUE_SUCCESS")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            m3173a();
        } else if (str.equalsIgnoreCase("NOTIFY_REMOVE_LEAGUE_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            if (this.b != null) {
                this.b.dismiss();
            }
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C06676(this)).show();
            m3173a();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_LEAGUE_SUCCESS")) {
            m3173a();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_LEAGUE_FAULT")) {
            m3173a();
        } else if (str.equalsIgnoreCase("NOTIFY_LEAVE_LEAGUE_SUCCESS")) {
            if (this.b != null) {
                this.b.dismiss();
            }
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_LEAVE_LEAGUE_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C06687(this)).show();
        }
    }

    static /* synthetic */ void m3174a(LeagueInfoActivity leagueInfoActivity) {
        LeagueClubDBManager leagueClubDBManager = DBManager.m3631a().f5581u;
        long j = leagueInfoActivity.f4601f;
        g a = g.a(leagueClubDBManager.f5597a.f6437L);
        a.a(Properties.f6320b.a(Long.valueOf(j)), new i[0]);
        if (a.b() > 1) {
            new Builder(leagueInfoActivity).setTitle(2131165514).setMessage(2131165372).setPositiveButton(2131165438, new C06665(leagueInfoActivity)).show();
            return;
        }
        leagueInfoActivity.b = new LoadingDialog(leagueInfoActivity);
        leagueInfoActivity.b.show();
        NetworkUtil.m4073a();
        NetworkUtil.m4163e(leagueInfoActivity.f4601f, leagueInfoActivity.f4600e);
    }
}
