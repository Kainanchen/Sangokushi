package com.illuminate.texaspoker.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.TextView;
import com.illuminate.texaspoker.p055a.InsuranceDetailExpandableListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.UserBill;
import com.illuminate.texaspoker.p059d.ClubInsurance;
import com.illuminate.texaspoker.p059d.InsuranceDetail;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class InsuranceDetailActivity extends BaseToolBarActivity {
    private static String f4571d;
    private BillInfoNet f4572e;
    private long f4573f;
    private InsuranceDetailExpandableListAdapter f4574g;
    private ExpandableListView f4575h;
    private List<ClubInsurance> f4576i;
    private TextView f4577j;

    /* renamed from: com.illuminate.texaspoker.activity.InsuranceDetailActivity.1 */
    class C06511 implements OnClickListener {
        final /* synthetic */ InsuranceDetailActivity f4568a;

        C06511(InsuranceDetailActivity insuranceDetailActivity) {
            this.f4568a = insuranceDetailActivity;
        }

        public final void onClick(View view) {
            this.f4568a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.InsuranceDetailActivity.2 */
    class C06522 implements Comparator<InsuranceDetail> {
        final /* synthetic */ InsuranceDetailActivity f4569a;

        C06522(InsuranceDetailActivity insuranceDetailActivity) {
            this.f4569a = insuranceDetailActivity;
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            if (((InsuranceDetail) obj).f6049b > ((InsuranceDetail) obj2).f6049b) {
                return -1;
            }
            return 1;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.InsuranceDetailActivity.3 */
    class C06533 implements OnGroupClickListener {
        final /* synthetic */ InsuranceDetailActivity f4570a;

        C06533(InsuranceDetailActivity insuranceDetailActivity) {
            this.f4570a = insuranceDetailActivity;
        }

        public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    static {
        f4571d = "InsuranceDetailActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968645);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C06511(this));
        Bundle extras = getIntent().getExtras();
        this.f4572e = (BillInfoNet) extras.getSerializable("billInfoNet");
        if (this.f4572e == null) {
            this.f4573f = extras.getLong("billId");
        }
        this.f4576i = new ArrayList();
        this.f4575h = (ExpandableListView) findViewById(2131558751);
        this.f4574g = new InsuranceDetailExpandableListAdapter(this, this.f4576i);
        this.f4575h.setAdapter(this.f4574g);
        View inflate = LayoutInflater.from(this).inflate(2130968782, null);
        this.f4575h.addHeaderView(inflate);
        this.f4577j = (TextView) inflate.findViewById(2131559241);
        this.f4575h.setOnGroupClickListener(new C06533(this));
    }

    private void m3165a() {
        if (!DBManager.m3631a().m3632b()) {
            long longValue;
            this.f4576i.clear();
            Map hashMap = new HashMap();
            long longValue2;
            ClubInsurance clubInsurance;
            InsuranceDetail insuranceDetail;
            if (this.f4572e == null) {
                for (UserBill userBill : DBManager.m3631a().f5571k.m3705a(this.f4573f, false)) {
                    longValue2 = userBill.f6014k.longValue();
                    clubInsurance = (ClubInsurance) hashMap.get(Long.valueOf(longValue2));
                    if (clubInsurance == null) {
                        clubInsurance = new ClubInsurance();
                        clubInsurance.f6031a = Long.valueOf(longValue2);
                        clubInsurance.f6032b = userBill.f6015l;
                        hashMap.put(Long.valueOf(longValue2), clubInsurance);
                    }
                    insuranceDetail = new InsuranceDetail();
                    insuranceDetail.f6048a = userBill.f6009f.longValue();
                    insuranceDetail.f6049b = userBill.f6011h.longValue() - userBill.f6012i.longValue();
                    clubInsurance.f6033c.add(insuranceDetail);
                }
                longValue = DBManager.m3631a().f5570j.m3554a(this.f4573f, false).f5626J.longValue();
            } else {
                for (UserBillInfoNet userBillInfoNet : this.f4572e.getStNormalBillInfoNet().getVUserBillInfosList()) {
                    if (userBillInfoNet.getUuid() != 1000) {
                        longValue2 = userBillInfoNet.getLClubID();
                        clubInsurance = (ClubInsurance) hashMap.get(Long.valueOf(longValue2));
                        if (clubInsurance == null) {
                            clubInsurance = new ClubInsurance();
                            clubInsurance.f6031a = Long.valueOf(longValue2);
                            clubInsurance.f6032b = userBillInfoNet.getSClubName();
                            hashMap.put(Long.valueOf(longValue2), clubInsurance);
                        }
                        insuranceDetail = new InsuranceDetail();
                        insuranceDetail.f6048a = userBillInfoNet.getUuid();
                        insuranceDetail.f6049b = userBillInfoNet.getLInsuranceGetStacks() - userBillInfoNet.getLInsuranceBuyin();
                        clubInsurance.f6033c.add(insuranceDetail);
                    }
                }
                longValue = this.f4572e.getStNormalBillInfoNet().getLCreateTime();
            }
            Collection arrayList = new ArrayList();
            for (Entry value : hashMap.entrySet()) {
                ClubInsurance clubInsurance2 = (ClubInsurance) value.getValue();
                Collections.sort(clubInsurance2.f6033c, new C06522(this));
                arrayList.add(clubInsurance2);
            }
            this.f4576i.addAll(arrayList);
            this.f4577j.setText(new SimpleDateFormat(getString(2131165232)).format(new Date(longValue)));
            this.f4574g.notifyDataSetChanged();
            int size = this.f4576i.size();
            for (int i = 0; i < size; i++) {
                this.f4575h.expandGroup(i);
            }
        }
    }

    protected void onResume() {
        super.onResume();
        m3165a();
    }

    protected final void m3166a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_FRIEND")) {
            m3165a();
        }
    }
}
