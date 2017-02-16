package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.illuminate.texaspoker.p055a.ClubSearchResultListAdapter;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.view.refreshlayout.RefreshListView;
import com.illuminate.texaspoker.view.refreshlayout.RefreshListView.C0372a;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_SEARCH_TYPE;
import java.util.ArrayList;
import java.util.List;

public class ClubSearchResultActivity extends BaseToolBarActivity {
    private static String f4114d;
    private boolean f4115e;
    private String f4116f;
    private int f4117g;
    private List<ClubBaseInfo> f4118h;
    private ClubSearchResultListAdapter f4119i;
    private RefreshListView f4120j;

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchResultActivity.1 */
    class C04921 implements OnClickListener {
        final /* synthetic */ ClubSearchResultActivity f4104a;

        C04921(ClubSearchResultActivity clubSearchResultActivity) {
            this.f4104a = clubSearchResultActivity;
        }

        public final void onClick(View view) {
            this.f4104a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchResultActivity.2 */
    class C04932 implements OnItemClickListener {
        final /* synthetic */ ClubSearchResultActivity f4105a;

        C04932(ClubSearchResultActivity clubSearchResultActivity) {
            this.f4105a = clubSearchResultActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            new StringBuilder("position:").append(i - 1);
            ClubSearchResultActivity.m2972a(this.f4105a, (ClubBaseInfo) this.f4105a.f4118h.get(i));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchResultActivity.3 */
    class C04973 implements C0372a {
        final /* synthetic */ ClubSearchResultActivity f4109a;

        /* renamed from: com.illuminate.texaspoker.activity.ClubSearchResultActivity.3.1 */
        class C04951 implements Runnable {
            final /* synthetic */ C04973 f4107a;

            /* renamed from: com.illuminate.texaspoker.activity.ClubSearchResultActivity.3.1.1 */
            class C04941 implements Runnable {
                final /* synthetic */ C04951 f4106a;

                C04941(C04951 c04951) {
                    this.f4106a = c04951;
                }

                public final void run() {
                    ClubSearchResultActivity.m2975c(this.f4106a.f4107a.f4109a);
                }
            }

            C04951(C04973 c04973) {
                this.f4107a = c04973;
            }

            public final void run() {
                if (this.f4107a.f4109a.f4118h.size() < 20) {
                    this.f4107a.f4109a.f4120j.m4595a();
                } else {
                    new Handler().postDelayed(new C04941(this), 500);
                }
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.ClubSearchResultActivity.3.2 */
        class C04962 implements Runnable {
            final /* synthetic */ C04973 f4108a;

            C04962(C04973 c04973) {
                this.f4108a = c04973;
            }

            public final void run() {
                if (this.f4108a.f4109a.f4120j.f7135a) {
                    this.f4108a.f4109a.f4120j.m4595a();
                }
            }
        }

        C04973(ClubSearchResultActivity clubSearchResultActivity) {
            this.f4109a = clubSearchResultActivity;
        }

        public final void m2970a() {
            new Handler().post(new C04951(this));
            new Handler().postDelayed(new C04962(this), 20000);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchResultActivity.4 */
    class C04984 implements Runnable {
        final /* synthetic */ List f4110a;
        final /* synthetic */ ClubSearchResultActivity f4111b;

        C04984(ClubSearchResultActivity clubSearchResultActivity, List list) {
            this.f4111b = clubSearchResultActivity;
            this.f4110a = list;
        }

        public final void run() {
            ClubSearchResultActivity.m2973a(this.f4111b, this.f4110a);
            this.f4111b.f4120j.m4595a();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubSearchResultActivity.5 */
    class C04995 implements Runnable {
        final /* synthetic */ List f4112a;
        final /* synthetic */ ClubSearchResultActivity f4113b;

        C04995(ClubSearchResultActivity clubSearchResultActivity, List list) {
            this.f4113b = clubSearchResultActivity;
            this.f4112a = list;
        }

        public final void run() {
            ClubSearchResultActivity.m2973a(this.f4113b, this.f4112a);
            this.f4113b.f4120j.m4595a();
        }
    }

    static {
        f4114d = "ClubSearchResultActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968623);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C04921(this));
        Bundle extras = getIntent().getExtras();
        List list = (List) getIntent().getSerializableExtra("search_result");
        this.f4118h = new ArrayList(list);
        this.f4115e = extras.getBoolean("fromSearch");
        this.f4116f = extras.getString("searchKey");
        this.f4117g = list.size();
        this.f4120j = (RefreshListView) findViewById(2131558668);
        this.f4119i = new ClubSearchResultListAdapter(this, this.f4118h);
        this.f4120j.setAdapter(this.f4119i);
        this.f4120j.setOnItemClickListener(new C04932(this));
        this.f4120j.setOnLoadMoreListener(new C04973(this));
        this.f4119i.notifyDataSetChanged();
    }

    protected void onResume() {
        super.onResume();
    }

    protected final void m2976a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            this.f4119i.notifyDataSetChanged();
        } else if (str.equalsIgnoreCase("NOTIFY_SEARCH_CLUB_RESULT")) {
            new Handler().postDelayed(new C04984(this, (List) list.get(0)), 500);
        } else if (str.equalsIgnoreCase("NOTIFY_GET_CLUB_BY_LOCATION_RESULT")) {
            new Handler().postDelayed(new C04995(this, (List) list.get(0)), 500);
        }
    }

    static /* synthetic */ void m2972a(ClubSearchResultActivity clubSearchResultActivity, ClubBaseInfo clubBaseInfo) {
        Intent intent = new Intent(clubSearchResultActivity, ClubBaseInfoActivity.class);
        intent.putExtra("clubId", -1);
        intent.putExtra("clubBaseInfo", clubBaseInfo);
        clubSearchResultActivity.startActivity(intent);
    }

    static /* synthetic */ void m2975c(ClubSearchResultActivity clubSearchResultActivity) {
        if (clubSearchResultActivity.f4115e) {
            NetworkUtil.m4073a();
            NetworkUtil.m4112a(clubSearchResultActivity.f4116f, clubSearchResultActivity.f4117g, CLUB_SEARCH_TYPE.CLUB_OTHER_SEARCH);
            return;
        }
        NetworkUtil.m4073a();
        NetworkUtil.m4139b(clubSearchResultActivity.f4116f, clubSearchResultActivity.f4117g);
    }

    static /* synthetic */ void m2973a(ClubSearchResultActivity clubSearchResultActivity, List list) {
        if (list.size() != 0) {
            clubSearchResultActivity.f4117g += list.size();
            clubSearchResultActivity.f4118h.addAll(list);
            clubSearchResultActivity.f4119i.notifyDataSetChanged();
        }
    }
}
