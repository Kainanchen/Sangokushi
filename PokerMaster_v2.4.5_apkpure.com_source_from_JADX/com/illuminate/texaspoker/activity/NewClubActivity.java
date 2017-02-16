package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p059d.City;
import com.illuminate.texaspoker.p059d.CountryRegion;
import com.illuminate.texaspoker.p059d.State;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.List;

public class NewClubActivity extends BaseToolBarActivity {
    public static int f4722d;
    public static int f4723e;
    private static String f4724f;
    private Menu f4725g;
    private long f4726h;
    private String f4727i;
    private View f4728j;
    private View f4729k;
    private TextView f4730l;
    private EditText f4731m;
    private ImageButton f4732n;
    private TextView f4733o;
    private Button f4734p;

    /* renamed from: com.illuminate.texaspoker.activity.NewClubActivity.1 */
    class C06991 implements OnClickListener {
        final /* synthetic */ NewClubActivity f4713a;

        C06991(NewClubActivity newClubActivity) {
            this.f4713a = newClubActivity;
        }

        public final void onClick(View view) {
            this.f4713a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewClubActivity.2 */
    class C07002 implements OnClickListener {
        final /* synthetic */ NewClubActivity f4714a;

        C07002(NewClubActivity newClubActivity) {
            this.f4714a = newClubActivity;
        }

        public final void onClick(View view) {
            this.f4714a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewClubActivity.3 */
    class C07013 implements OnGlobalLayoutListener {
        final /* synthetic */ NewClubActivity f4715a;

        C07013(NewClubActivity newClubActivity) {
            this.f4715a = newClubActivity;
        }

        public final void onGlobalLayout() {
            this.f4715a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewClubActivity.4 */
    class C07024 implements OnClickListener {
        final /* synthetic */ NewClubActivity f4716a;

        C07024(NewClubActivity newClubActivity) {
            this.f4716a = newClubActivity;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f4716a, CreateClubCountrySelectActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("countryCode", LetterIndexBar.SEARCH_ICON_LETTER);
            bundle.putString("stateCode", LetterIndexBar.SEARCH_ICON_LETTER);
            intent.putExtras(bundle);
            this.f4716a.startActivityForResult(intent, NewClubActivity.f4722d);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewClubActivity.5 */
    class C07035 implements OnClickListener {
        final /* synthetic */ NewClubActivity f4717a;

        C07035(NewClubActivity newClubActivity) {
            this.f4717a = newClubActivity;
        }

        public final void onClick(View view) {
            this.f4717a.startActivity(new Intent(this.f4717a, StoreActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewClubActivity.6 */
    class C07046 implements DialogInterface.OnClickListener {
        final /* synthetic */ NewClubActivity f4718a;

        C07046(NewClubActivity newClubActivity) {
            this.f4718a = newClubActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewClubActivity.7 */
    class C07057 implements DialogInterface.OnClickListener {
        final /* synthetic */ NewClubActivity f4719a;

        C07057(NewClubActivity newClubActivity) {
            this.f4719a = newClubActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewClubActivity.8 */
    class C07068 implements DialogInterface.OnClickListener {
        final /* synthetic */ NewClubActivity f4720a;

        C07068(NewClubActivity newClubActivity) {
            this.f4720a = newClubActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewClubActivity.9 */
    class C07079 implements DialogInterface.OnClickListener {
        final /* synthetic */ NewClubActivity f4721a;

        C07079(NewClubActivity newClubActivity) {
            this.f4721a = newClubActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f4724f = "NewClubActivity";
        f4722d = 1;
        f4723e = 1;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968653);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C06991(this));
        View findViewById = findViewById(2131558781);
        findViewById.setOnClickListener(new C07002(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C07013(this));
        this.f4728j = findViewById(2131558785);
        this.f4729k = findViewById(2131558790);
        this.f4730l = (TextView) findViewById(2131558784);
        this.f4731m = (EditText) findViewById(2131558678);
        this.f4732n = (ImageButton) findViewById(2131558788);
        this.f4732n.setOnClickListener(new C07024(this));
        this.f4733o = (TextView) findViewById(2131558789);
        this.f4734p = (Button) findViewById(2131558792);
        this.f4734p.setOnClickListener(new C07035(this));
    }

    protected void onResume() {
        super.onResume();
        if (!DBManager.m3631a().m3632b()) {
            this.f4726h = DBManager.m3631a().f5565e.m3601b();
            this.f4730l.setText(String.format(getResources().getString(2131165336), new Object[]{Long.valueOf(this.f4726h), Integer.valueOf(SharedPreferencesManager.m4436y())}));
            if (this.f4726h < ((long) SharedPreferencesManager.m4436y())) {
                this.f4728j.setVisibility(0);
                this.f4729k.setVisibility(4);
            } else {
                this.f4728j.setVisibility(4);
                this.f4729k.setVisibility(0);
                if (SharedPreferencesManager.m4396n() == 3) {
                    this.f4734p.setVisibility(4);
                } else {
                    this.f4734p.setVisibility(0);
                }
            }
            if (StringUtils.m4462a(this.f4727i)) {
                this.f4733o.setText(LetterIndexBar.SEARCH_ICON_LETTER);
            } else {
                this.f4733o.setText(Utility.m4506h(this.f4727i));
            }
            invalidateOptionsMenu();
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        this.f4726h = DBManager.m3631a().f5565e.m3601b();
        if (this.f4726h < ((long) SharedPreferencesManager.m4436y())) {
            getMenuInflater().inflate(2131689495, menu);
        }
        this.f4725g = menu;
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559448) {
            return super.onOptionsItemSelected(menuItem);
        }
        m2734b();
        String trim = this.f4731m.getText().toString().trim();
        int a = StringUtils.m4460a(trim);
        if (a > 20) {
            new Builder(this).setTitle(2131165514).setMessage(2131165399).setPositiveButton(2131165438, new C07057(this)).show();
        } else if (a == 0) {
            new Builder(this).setTitle(2131165514).setMessage(2131165398).setPositiveButton(2131165438, new C07068(this)).show();
        } else if (StringUtils.m4462a(this.f4727i)) {
            new Builder(this).setTitle(2131165514).setMessage(2131165389).setPositiveButton(2131165438, new C07079(this)).show();
        } else {
            this.b = new LoadingDialog(this);
            this.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4152c(trim, this.f4727i);
        }
        return true;
    }

    protected final void m3232a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_CREATE_CLUB_SUCCESS")) {
            long longValue = ((Long) list.get(0)).longValue();
            this.b.dismiss();
            Intent intent = new Intent(this, ChatRoomActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("eTalkType", 2);
            bundle.putLong("lChatRoomId", longValue);
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (str.equalsIgnoreCase("NOTIFY_CREATE_CLUB_FALUT")) {
            int intValue = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C07046(this)).show();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == f4722d && i2 == -1) {
            CharSequence charSequence;
            Bundle extras = intent.getExtras();
            String string = extras.getString("countryCode");
            String string2 = extras.getString("stateCode");
            String string3 = extras.getString("cityCode");
            this.f4727i = string + "-" + string2 + "-" + string3;
            CountryRegion countryRegion = (CountryRegion) Utility.m4503g().get(string);
            string = countryRegion.d;
            State state = (State) countryRegion.f6043b.get(string2);
            if (state != null) {
                string = string + " " + state.d;
                City city = (City) state.f6052c.get(string3);
                if (city != null) {
                    charSequence = string + " " + city.d;
                    if (StringUtils.m4462a(charSequence)) {
                        this.f4733o.setText(charSequence);
                    } else {
                        this.f4733o.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                    }
                }
            }
            Object obj = string;
            if (StringUtils.m4462a(charSequence)) {
                this.f4733o.setText(LetterIndexBar.SEARCH_ICON_LETTER);
            } else {
                this.f4733o.setText(charSequence);
            }
        }
    }
}
