package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.illuminate.texaspoker.p055a.LanguageListAdapter;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.ArrayList;
import java.util.List;

public class SwitchLanguageActivity extends BaseToolBarActivity {
    private static String f5260d;
    private List<String> f5261e;
    private String f5262f;
    private LanguageListAdapter f5263g;
    private ListView f5264h;

    /* renamed from: com.illuminate.texaspoker.activity.SwitchLanguageActivity.1 */
    class C08711 implements OnClickListener {
        final /* synthetic */ SwitchLanguageActivity f5258a;

        C08711(SwitchLanguageActivity switchLanguageActivity) {
            this.f5258a = switchLanguageActivity;
        }

        public final void onClick(View view) {
            this.f5258a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SwitchLanguageActivity.2 */
    class C08722 implements OnItemClickListener {
        final /* synthetic */ SwitchLanguageActivity f5259a;

        C08722(SwitchLanguageActivity switchLanguageActivity) {
            this.f5259a = switchLanguageActivity;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.f5259a.f5262f = (String) this.f5259a.f5261e.get(i);
            this.f5259a.f5263g.f3466a = this.f5259a.f5262f;
            this.f5259a.f5263g.notifyDataSetChanged();
        }
    }

    static {
        f5260d = "PokerHistoryListActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968670);
        this.f5261e = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C08711(this));
        this.f5261e.add("auto");
        this.f5261e.add("zh_CN");
        this.f5261e.add("zh_TW");
        this.f5261e.add("en");
        this.f5262f = SharedPreferencesManager.ac();
        if (StringUtils.m4462a(this.f5262f)) {
            this.f5262f = "auto";
        }
        this.f5264h = (ListView) findViewById(2131558873);
        this.f5263g = new LanguageListAdapter(this, this.f5261e, this.f5262f);
        this.f5264h.setAdapter(this.f5263g);
        this.f5264h.setOnItemClickListener(new C08722(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689502, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559454) {
            return super.onOptionsItemSelected(menuItem);
        }
        Utility.m4493d(this.f5262f);
        if (this.f5262f.equalsIgnoreCase("auto")) {
            SharedPreferencesManager.m4379k(LetterIndexBar.SEARCH_ICON_LETTER);
        } else {
            SharedPreferencesManager.m4379k(this.f5262f);
        }
        Intent intent = new Intent(this, SplashActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
        overridePendingTransition(0, 0);
        Process.killProcess(Process.myPid());
        return true;
    }

    protected final void m3453a(String str, List<Object> list) {
    }
}
