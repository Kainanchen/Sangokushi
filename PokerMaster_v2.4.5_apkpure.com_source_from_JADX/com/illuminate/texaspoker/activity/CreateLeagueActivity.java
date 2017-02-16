package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.List;

public class CreateLeagueActivity extends BaseToolBarActivity {
    private static String f4304d;
    private long f4305e;
    private boolean f4306f;
    private Menu f4307g;
    private EditText f4308h;

    /* renamed from: com.illuminate.texaspoker.activity.CreateLeagueActivity.1 */
    class C05561 implements OnClickListener {
        final /* synthetic */ CreateLeagueActivity f4298a;

        C05561(CreateLeagueActivity createLeagueActivity) {
            this.f4298a = createLeagueActivity;
        }

        public final void onClick(View view) {
            this.f4298a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateLeagueActivity.2 */
    class C05572 implements OnClickListener {
        final /* synthetic */ CreateLeagueActivity f4299a;

        C05572(CreateLeagueActivity createLeagueActivity) {
            this.f4299a = createLeagueActivity;
        }

        public final void onClick(View view) {
            this.f4299a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateLeagueActivity.3 */
    class C05583 implements OnGlobalLayoutListener {
        final /* synthetic */ CreateLeagueActivity f4300a;

        C05583(CreateLeagueActivity createLeagueActivity) {
            this.f4300a = createLeagueActivity;
        }

        public final void onGlobalLayout() {
            this.f4300a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateLeagueActivity.4 */
    class C05594 implements TextWatcher {
        final /* synthetic */ CreateLeagueActivity f4301a;

        C05594(CreateLeagueActivity createLeagueActivity) {
            this.f4301a = createLeagueActivity;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (this.f4301a.f4307g == null) {
                return;
            }
            if (!this.f4301a.f4306f || StringUtils.m4462a(editable.toString())) {
                this.f4301a.f4307g.getItem(0).setEnabled(false);
            } else {
                this.f4301a.f4307g.getItem(0).setEnabled(true);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateLeagueActivity.5 */
    class C05605 implements DialogInterface.OnClickListener {
        final /* synthetic */ CreateLeagueActivity f4302a;

        C05605(CreateLeagueActivity createLeagueActivity) {
            this.f4302a = createLeagueActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.CreateLeagueActivity.6 */
    class C05616 implements DialogInterface.OnClickListener {
        final /* synthetic */ CreateLeagueActivity f4303a;

        C05616(CreateLeagueActivity createLeagueActivity) {
            this.f4303a = createLeagueActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f4304d = "CreateLeagueActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968628);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C05561(this));
        this.f4305e = getIntent().getExtras().getLong("lClubId");
        this.f4306f = false;
        View findViewById = findViewById(2131558601);
        findViewById.setOnClickListener(new C05572(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C05583(this));
        this.f4308h = (EditText) findViewById(2131558705);
        this.f4308h.addTextChangedListener(new C05594(this));
    }

    protected void onResume() {
        super.onResume();
        m3058a();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689484, menu);
        this.f4307g = menu;
        this.f4307g.getItem(0).setEnabled(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559437) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f4306f) {
            m2734b();
            if (this.f4306f) {
                String trim = this.f4308h.getText().toString().trim();
                if (StringUtils.m4462a((CharSequence) trim)) {
                    return true;
                }
                if (StringUtils.m4460a(trim) > 20) {
                    new Builder(this).setTitle(2131165514).setMessage(2131165381).setPositiveButton(2131165438, new C05616(this)).show();
                    return true;
                }
                this.b = new LoadingDialog(this);
                this.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4149c(this.f4305e, trim);
                return true;
            }
            finish();
            return true;
        }
        m2732a(2130903246, 2131165595, 1);
        return true;
    }

    private void m3058a() {
        this.f4306f = false;
        if (!DBManager.m3631a().m3632b()) {
            ChatRoom a = DBManager.m3631a().f5565e.m3590a(this.f4305e, 2);
            if (a.f5734U == null || !a.f5734U.booleanValue()) {
                this.f4306f = false;
            } else {
                this.f4306f = true;
            }
            if (this.f4307g == null) {
                return;
            }
            if (!this.f4306f || StringUtils.m4462a(this.f4308h.getText().toString())) {
                this.f4307g.getItem(0).setEnabled(false);
            } else {
                this.f4307g.getItem(0).setEnabled(true);
            }
        }
    }

    protected final void m3060a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m3058a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHATROOM")) {
            m3058a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SETTING")) {
            m3058a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_LEAGUE_LIST_SUCCESS")) {
            m3058a();
        } else if (str.equalsIgnoreCase("NOTIFY_CREATE_LEAGUE_SUCCESS")) {
            this.b.dismiss();
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_CREATE_LEAGUE_FAULT")) {
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(((Integer) list.get(0)).intValue()).setPositiveButton(2131165438, new C05605(this)).show();
        }
    }
}
