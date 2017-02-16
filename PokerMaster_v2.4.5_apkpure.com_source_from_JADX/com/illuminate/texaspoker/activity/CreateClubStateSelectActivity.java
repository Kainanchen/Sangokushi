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

public class CreateClubStateSelectActivity extends BaseToolBarActivity {
    private static String f4263d;
    private List f4264e;
    private aa f4265f;
    private ListView f4266g;
    private String f4267h;
    private String f4268i;

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubStateSelectActivity.1 */
    class C05441 implements OnClickListener {
        final /* synthetic */ CreateClubStateSelectActivity f4261a;

        C05441(CreateClubStateSelectActivity createClubStateSelectActivity) {
            this.f4261a = createClubStateSelectActivity;
        }

        public final void onClick(View view) {
            this.f4261a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateClubStateSelectActivity.2 */
    class C05452 implements OnItemClickListener {
        final /* synthetic */ CreateClubStateSelectActivity f4262a;

        C05452(CreateClubStateSelectActivity createClubStateSelectActivity) {
            this.f4262a = createClubStateSelectActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            State state = (State) this.f4262a.f4264e.get(i);
            if (state.f6051b.size() == 0) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("countryCode", this.f4262a.f4267h);
                bundle.putString("stateCode", state.e);
                bundle.putString("cityCode", "#");
                intent.putExtras(bundle);
                this.f4262a.setResult(NewClubActivity.f4723e, intent);
                this.f4262a.finish();
                return;
            }
            intent = new Intent(this.f4262a, CreateClubCitySelectActivity.class);
            bundle = new Bundle();
            bundle.putString("countryCode", this.f4262a.f4267h);
            bundle.putString("stateCode", state.e);
            intent.putExtras(bundle);
            this.f4262a.startActivityForResult(intent, NewClubActivity.f4722d);
        }
    }

    static {
        f4263d = "ClubAreaSelectActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968613);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C05441(this));
        Bundle extras = getIntent().getExtras();
        this.f4267h = extras.getString("countryCode");
        this.f4268i = extras.getString("stateCode");
        this.f4264e = ((CountryRegion) Utility.m4503g().get(this.f4267h)).f6042a;
        findViewById(2131558602).setVisibility(8);
        this.f4266g = (ListView) findViewById(2131558605);
        this.f4265f = new aa(this, this.f4264e, true);
        this.f4266g.setAdapter(this.f4265f);
        this.f4266g.setOnItemClickListener(new C05452(this));
        this.f4265f.notifyDataSetChanged();
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == NewClubActivity.f4722d && i2 == -1) {
            Bundle extras = intent.getExtras();
            String string = extras.getString("countryCode");
            String string2 = extras.getString("stateCode");
            String string3 = extras.getString("cityCode");
            Intent intent2 = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("countryCode", string);
            bundle.putString("stateCode", string2);
            bundle.putString("cityCode", string3);
            intent2.putExtras(bundle);
            setResult(-1, intent2);
            finish();
        }
    }

    protected final void m3040a(String str, List<Object> list) {
    }
}
