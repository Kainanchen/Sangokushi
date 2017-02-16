package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.illuminate.texaspoker.p055a.aa;
import com.illuminate.texaspoker.p059d.CountryRegion;
import com.illuminate.texaspoker.p059d.State;
import com.illuminate.texaspoker.utils.Utility;
import java.util.List;

public class ClubStateSelectActivity extends BaseToolBarActivity {
    private static String f4162d;
    private List f4163e;
    private aa f4164f;
    private ListView f4165g;
    private String f4166h;

    /* renamed from: com.illuminate.texaspoker.activity.ClubStateSelectActivity.1 */
    class C05141 implements OnClickListener {
        final /* synthetic */ ClubStateSelectActivity f4160a;

        C05141(ClubStateSelectActivity clubStateSelectActivity) {
            this.f4160a = clubStateSelectActivity;
        }

        public final void onClick(View view) {
            this.f4160a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubStateSelectActivity.2 */
    class C05152 implements OnItemClickListener {
        final /* synthetic */ ClubStateSelectActivity f4161a;

        C05152(ClubStateSelectActivity clubStateSelectActivity) {
            this.f4161a = clubStateSelectActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            State state = (State) this.f4161a.f4163e.get(i);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("countryCode", this.f4161a.f4166h);
            bundle.putString("stateCode", state.e);
            intent.putExtras(bundle);
            this.f4161a.setResult(-1, intent);
            this.f4161a.finish();
        }
    }

    static {
        f4162d = "ClubStateSelectActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968613);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C05141(this));
        this.f4166h = getIntent().getExtras().getString("countryCode");
        this.f4163e = ((CountryRegion) Utility.m4503g().get(this.f4166h)).f6042a;
        findViewById(2131558602).setVisibility(8);
        this.f4165g = (ListView) findViewById(2131558605);
        this.f4164f = new aa(this, this.f4163e, false);
        this.f4165g.setAdapter(this.f4164f);
        this.f4165g.setOnItemClickListener(new C05152(this));
        this.f4164f.notifyDataSetChanged();
    }

    protected void onResume() {
        super.onResume();
    }

    protected final void m2992a(String str, List<Object> list) {
    }
}
