package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.illuminate.texaspoker.dao.BillDao.Properties;
import com.illuminate.texaspoker.p055a.BillListAdapter;
import com.illuminate.texaspoker.p057b.BillDBManager;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultHandler;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultLayout;
import com.illuminate.texaspoker.view.refreshlayout.RefreshHandler;
import com.illuminate.texaspoker.view.refreshlayout.RefreshListView;
import com.illuminate.texaspoker.view.refreshlayout.RefreshListView.C0372a;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.SCGetBillInfosV2Rsp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

public class ClubBillActivity extends BaseToolBarActivity {
    private static String f3897d;
    private SimpleDateFormat f3898e;
    private boolean f3899f;
    private long f3900g;
    private long f3901h;
    private List<Object> f3902i;
    private Map<String, String> f3903j;
    private View f3904k;
    private RefreshListView f3905l;
    private RefreshDefaultLayout f3906m;
    private BillListAdapter f3907n;
    private View f3908o;
    private TextView f3909p;

    /* renamed from: com.illuminate.texaspoker.activity.ClubBillActivity.1 */
    class C04221 implements OnClickListener {
        final /* synthetic */ ClubBillActivity f3886a;

        C04221(ClubBillActivity clubBillActivity) {
            this.f3886a = clubBillActivity;
        }

        public final void onClick(View view) {
            this.f3886a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubBillActivity.2 */
    class C04252 implements RefreshHandler {
        final /* synthetic */ ClubBillActivity f3889a;

        /* renamed from: com.illuminate.texaspoker.activity.ClubBillActivity.2.1 */
        class C04231 implements Runnable {
            final /* synthetic */ C04252 f3887a;

            C04231(C04252 c04252) {
                this.f3887a = c04252;
            }

            public final void run() {
                ClubBillActivity.m2894a(this.f3887a.f3889a);
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.ClubBillActivity.2.2 */
        class C04242 implements Runnable {
            final /* synthetic */ C04252 f3888a;

            C04242(C04252 c04252) {
                this.f3888a = c04252;
            }

            public final void run() {
                if (this.f3888a.f3889a.f3906m.m4589a()) {
                    this.f3888a.f3889a.f3906m.m4590b();
                }
            }
        }

        C04252(ClubBillActivity clubBillActivity) {
            this.f3889a = clubBillActivity;
        }

        public final void m2890a() {
            new Handler().post(new C04231(this));
            new Handler().postDelayed(new C04242(this), 20000);
        }

        public final boolean m2891a(View view) {
            return RefreshDefaultHandler.m4596b(view);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubBillActivity.3 */
    class C04283 implements C0372a {
        final /* synthetic */ ClubBillActivity f3892a;

        /* renamed from: com.illuminate.texaspoker.activity.ClubBillActivity.3.1 */
        class C04261 implements Runnable {
            final /* synthetic */ C04283 f3890a;

            C04261(C04283 c04283) {
                this.f3890a = c04283;
            }

            public final void run() {
                ClubBillActivity.m2899c(this.f3890a.f3892a);
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.ClubBillActivity.3.2 */
        class C04272 implements Runnable {
            final /* synthetic */ C04283 f3891a;

            C04272(C04283 c04283) {
                this.f3891a = c04283;
            }

            public final void run() {
                if (this.f3891a.f3892a.f3905l.f7135a) {
                    this.f3891a.f3892a.f3905l.m4595a();
                }
            }
        }

        C04283(ClubBillActivity clubBillActivity) {
            this.f3892a = clubBillActivity;
        }

        public final void m2892a() {
            new Handler().post(new C04261(this));
            new Handler().postDelayed(new C04272(this), 20000);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubBillActivity.4 */
    class C04294 implements OnItemClickListener {
        final /* synthetic */ ClubBillActivity f3893a;

        C04294(ClubBillActivity clubBillActivity) {
            this.f3893a = clubBillActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object obj = ((Object[]) this.f3893a.f3902i.get(i - 1))[2];
            if (obj instanceof Bill) {
                Bill bill = (Bill) obj;
                ClubBillActivity.m2895a(this.f3893a, bill.f5643b.longValue(), bill.f5644c.intValue());
                return;
            }
            ClubBillActivity.m2896a(this.f3893a, (BillInfoNet) obj);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubBillActivity.5 */
    class C04305 implements Runnable {
        final /* synthetic */ SCGetBillInfosV2Rsp f3894a;
        final /* synthetic */ ClubBillActivity f3895b;

        C04305(ClubBillActivity clubBillActivity, SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp) {
            this.f3895b = clubBillActivity;
            this.f3894a = sCGetBillInfosV2Rsp;
        }

        public final void run() {
            ClubBillActivity.m2897a(this.f3895b, this.f3894a);
            this.f3895b.f3905l.m4595a();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubBillActivity.6 */
    class C04316 implements Runnable {
        final /* synthetic */ ClubBillActivity f3896a;

        C04316(ClubBillActivity clubBillActivity) {
            this.f3896a = clubBillActivity;
        }

        public final void run() {
            this.f3896a.m2893a();
            this.f3896a.f3906m.m4590b();
        }
    }

    static /* synthetic */ void m2895a(ClubBillActivity clubBillActivity, long j, int i) {
        if (i == 2) {
            Intent intent = new Intent(clubBillActivity, BillSngActivity.class);
            intent.putExtra("billId", j);
            intent.putExtra("fromShare", false);
            clubBillActivity.startActivityForResult(intent, 0);
            return;
        }
        intent = new Intent(clubBillActivity, BillActivity.class);
        intent.putExtra("billId", j);
        intent.putExtra("fromShare", false);
        clubBillActivity.startActivityForResult(intent, 0);
    }

    static {
        f3897d = "ClubBillActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968615);
        this.f3899f = false;
        this.f3900g = getIntent().getExtras().getLong("lClubId");
        this.f3898e = new SimpleDateFormat(getString(2131165244));
        this.f3902i = new ArrayList();
        this.f3903j = new HashMap();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C04221(this));
        setTitle(DBManager.m3631a().f5565e.m3590a(this.f3900g, 2).f5755p);
        this.f3908o = findViewById(2131558540);
        this.f3904k = findViewById(2131558543);
        this.f3905l = (RefreshListView) findViewById(2131558545);
        this.f3907n = new BillListAdapter(this);
        this.f3907n.f3032a = this.f3902i;
        this.f3905l.setAdapter(this.f3907n);
        this.f3906m = (RefreshDefaultLayout) findViewById(2131558544);
        this.f3906m.setPtrHandler(new C04252(this));
        this.f3905l.setOnLoadMoreListener(new C04283(this));
        this.f3905l.setOnItemClickListener(new C04294(this));
        View inflate = View.inflate(this, 2130968727, null);
        this.f3909p = (TextView) inflate.findViewById(2131559018);
        this.f3905l.addHeaderView(inflate, null, false);
    }

    protected void onResume() {
        super.onResume();
        if (!this.f3899f) {
            m2893a();
            NetworkUtil.m4073a();
            NetworkUtil.m4134b(0, this.f3900g);
        }
        this.f3899f = false;
    }

    private void m2893a() {
        if (!DBManager.m3631a().m3632b()) {
            long j;
            ChatRoom a = DBManager.m3631a().f5565e.m3590a(this.f3900g, 2);
            if (a.f5754o == null) {
                j = 0;
            } else {
                j = a.f5754o.longValue();
            }
            CharSequence g = Utility.m4502g(j);
            if (j == 0) {
                this.f3909p.setText(g);
                this.f3909p.setTextColor(-6316386);
            } else if (j > 0) {
                this.f3909p.setText("+" + g);
                this.f3909p.setTextColor(-2543568);
            } else {
                this.f3909p.setText(g);
                this.f3909p.setTextColor(-14519546);
            }
            this.f3902i.clear();
            this.f3903j.clear();
            BillDBManager billDBManager = DBManager.m3631a().f5570j;
            long j2 = this.f3900g;
            g a2 = g.a(billDBManager.f5518b.f6467x);
            a2.a(Properties.f6085h.a(Boolean.valueOf(false)), new i[0]);
            a2.a(Properties.f6103z.a(Long.valueOf(j2)), new i[0]);
            a2.a(10);
            a2.b(new f[]{Properties.f6066J});
            for (Bill bill : a2.a().b()) {
                String f = Utility.m4499f(bill.f5626J.longValue());
                if (this.f3903j.containsKey(f)) {
                    this.f3902i.add(new Object[]{LetterIndexBar.SEARCH_ICON_LETTER, LetterIndexBar.SEARCH_ICON_LETTER, bill});
                } else {
                    this.f3903j.put(f, f);
                    if (f.equals(getResources().getString(2131165511)) || f.equals(getResources().getString(2131165509))) {
                        this.f3902i.add(new Object[]{f, LetterIndexBar.SEARCH_ICON_LETTER, bill});
                    } else {
                        String format = this.f3898e.format(new Date(bill.f5626J.longValue()));
                        this.f3902i.add(new Object[]{f, format, bill});
                    }
                }
                this.f3901h = bill.f5643b.longValue();
            }
            if (this.f3902i.size() > 0) {
                this.f3904k.setVisibility(0);
                this.f3908o.setVisibility(4);
            } else {
                this.f3904k.setVisibility(4);
                this.f3908o.setVisibility(0);
            }
            this.f3907n.notifyDataSetChanged();
        }
    }

    protected final void m2903a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            if (!DBManager.m3631a().m3632b()) {
                this.f3907n.notifyDataSetChanged();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_LOAD_BILL")) {
            new Handler().postDelayed(new C04305(this, (SCGetBillInfosV2Rsp) list.get(0)), 500);
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_BILL")) {
            new Handler().postDelayed(new C04316(this), 500);
        }
    }

    static /* synthetic */ void m2894a(ClubBillActivity clubBillActivity) {
        NetworkUtil.m4073a();
        NetworkUtil.m4134b(0, clubBillActivity.f3900g);
    }

    static /* synthetic */ void m2899c(ClubBillActivity clubBillActivity) {
        NetworkUtil.m4073a();
        NetworkUtil.m4134b(clubBillActivity.f3901h, clubBillActivity.f3900g);
    }

    static /* synthetic */ void m2896a(ClubBillActivity clubBillActivity, BillInfoNet billInfoNet) {
        if (billInfoNet.getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
            Intent intent = new Intent(clubBillActivity, BillSngActivity.class);
            intent.putExtra("billInfoNet", billInfoNet);
            clubBillActivity.startActivityForResult(intent, 0);
            return;
        }
        intent = new Intent(clubBillActivity, BillActivity.class);
        intent.putExtra("billInfoNet", billInfoNet);
        clubBillActivity.startActivityForResult(intent, 0);
    }

    static /* synthetic */ void m2897a(ClubBillActivity clubBillActivity, SCGetBillInfosV2Rsp sCGetBillInfosV2Rsp) {
        for (BillInfoNet billInfoNet : sCGetBillInfosV2Rsp.getStBillInfoNetList()) {
            long lCreateTime;
            long lBillID;
            if (billInfoNet.getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                lCreateTime = billInfoNet.getStSNGBillInfoNet().getLCreateTime();
                lBillID = billInfoNet.getStSNGBillInfoNet().getLBillID();
            } else {
                lCreateTime = billInfoNet.getStNormalBillInfoNet().getLCreateTime();
                lBillID = billInfoNet.getStNormalBillInfoNet().getLBillID();
            }
            String f = Utility.m4499f(lCreateTime);
            if (clubBillActivity.f3903j.containsKey(f)) {
                clubBillActivity.f3902i.add(new Object[]{LetterIndexBar.SEARCH_ICON_LETTER, LetterIndexBar.SEARCH_ICON_LETTER, billInfoNet});
            } else {
                clubBillActivity.f3903j.put(f, f);
                if (f.equals(clubBillActivity.getResources().getString(2131165511)) || f.equals(clubBillActivity.getResources().getString(2131165509))) {
                    clubBillActivity.f3902i.add(new Object[]{f, LetterIndexBar.SEARCH_ICON_LETTER, billInfoNet});
                } else {
                    String format = clubBillActivity.f3898e.format(new Date(lCreateTime));
                    clubBillActivity.f3902i.add(new Object[]{f, format, billInfoNet});
                }
            }
            clubBillActivity.f3901h = lBillID;
            clubBillActivity.f3907n.notifyDataSetChanged();
        }
    }
}
