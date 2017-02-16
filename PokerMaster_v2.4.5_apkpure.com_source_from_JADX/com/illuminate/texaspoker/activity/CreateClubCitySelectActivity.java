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
import com.illuminate.texaspoker.p059d.City;
import com.illuminate.texaspoker.p059d.CountryRegion;
import com.illuminate.texaspoker.p059d.State;
import com.illuminate.texaspoker.utils.Utility;
import java.util.List;

public class CreateClubCitySelectActivity extends BaseToolBarActivity {
    private static String f4240d;
    private List f4241e;
    private aa f4242f;
    private ListView f4243g;
    private String f4244h;
    private String f4245i;

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubCitySelectActivity.1 */
    class C05351 implements OnClickListener {
        final /* synthetic */ CreateClubCitySelectActivity f4238a;

        C05351(CreateClubCitySelectActivity createClubCitySelectActivity) {
            this.f4238a = createClubCitySelectActivity;
        }

        public final void onClick(View view) {
            this.f4238a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubCitySelectActivity.2 */
    class C05362 implements OnItemClickListener {
        final /* synthetic */ CreateClubCitySelectActivity f4239a;

        C05362(CreateClubCitySelectActivity createClubCitySelectActivity) {
            this.f4239a = createClubCitySelectActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            City city = (City) this.f4239a.f4241e.get(i);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("countryCode", this.f4239a.f4244h);
            bundle.putString("stateCode", this.f4239a.f4245i);
            bundle.putString("cityCode", city.e);
            intent.putExtras(bundle);
            this.f4239a.setResult(-1, intent);
            this.f4239a.finish();
        }
    }

    static {
        f4240d = "ClubAreaSelectActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968613);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C05351(this));
        Bundle extras = getIntent().getExtras();
        this.f4244h = extras.getString("countryCode");
        this.f4245i = extras.getString("stateCode");
        this.f4241e = ((State) ((CountryRegion) Utility.m4503g().get(this.f4244h)).f6043b.get(this.f4245i)).f6051b;
        findViewById(2131558602).setVisibility(8);
        this.f4243g = (ListView) findViewById(2131558605);
        this.f4242f = new aa(this, this.f4241e, true);
        this.f4243g.setAdapter(this.f4242f);
        this.f4243g.setOnItemClickListener(new C05362(this));
        this.f4242f.notifyDataSetChanged();
    }

    protected void onResume() {
        super.onResume();
    }

    protected final void m3032a(String str, List<Object> list) {
    }
}
