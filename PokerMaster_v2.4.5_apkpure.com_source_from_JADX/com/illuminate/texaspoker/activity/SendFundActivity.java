package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.TextView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.List;

public class SendFundActivity extends BaseToolBarActivity {
    private static String f5121d;
    private long f5122e;
    private long f5123f;
    private FriendUser f5124g;
    private ChatRoom f5125h;
    private boolean f5126i;
    private TextView f5127j;
    private EditText f5128k;
    private TextView f5129l;

    /* renamed from: com.illuminate.texaspoker.activity.SendFundActivity.1 */
    class C08131 implements OnClickListener {
        final /* synthetic */ SendFundActivity f5113a;

        C08131(SendFundActivity sendFundActivity) {
            this.f5113a = sendFundActivity;
        }

        public final void onClick(View view) {
            this.f5113a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendFundActivity.2 */
    class C08142 implements OnClickListener {
        final /* synthetic */ SendFundActivity f5114a;

        C08142(SendFundActivity sendFundActivity) {
            this.f5114a = sendFundActivity;
        }

        public final void onClick(View view) {
            this.f5114a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendFundActivity.3 */
    class C08153 implements OnGlobalLayoutListener {
        final /* synthetic */ SendFundActivity f5115a;

        C08153(SendFundActivity sendFundActivity) {
            this.f5115a = sendFundActivity;
        }

        public final void onGlobalLayout() {
            this.f5115a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendFundActivity.4 */
    class C08164 implements DialogInterface.OnClickListener {
        final /* synthetic */ SendFundActivity f5116a;

        C08164(SendFundActivity sendFundActivity) {
            this.f5116a = sendFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendFundActivity.5 */
    class C08175 implements DialogInterface.OnClickListener {
        final /* synthetic */ SendFundActivity f5117a;

        C08175(SendFundActivity sendFundActivity) {
            this.f5117a = sendFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f5117a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendFundActivity.6 */
    class C08186 implements DialogInterface.OnClickListener {
        final /* synthetic */ SendFundActivity f5118a;

        C08186(SendFundActivity sendFundActivity) {
            this.f5118a = sendFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendFundActivity.7 */
    class C08197 implements DialogInterface.OnClickListener {
        final /* synthetic */ SendFundActivity f5119a;

        C08197(SendFundActivity sendFundActivity) {
            this.f5119a = sendFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SendFundActivity.8 */
    class C08208 implements DialogInterface.OnClickListener {
        final /* synthetic */ SendFundActivity f5120a;

        C08208(SendFundActivity sendFundActivity) {
            this.f5120a = sendFundActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f5121d = "SendFundActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968663);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C08131(this));
        this.f5126i = false;
        Bundle extras = getIntent().getExtras();
        this.f5122e = extras.getLong("uuid");
        this.f5123f = extras.getLong("lClubId");
        View findViewById = findViewById(2131558822);
        findViewById.setOnClickListener(new C08142(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C08153(this));
        this.f5127j = (TextView) findViewById(2131558823);
        this.f5128k = (EditText) findViewById(2131558824);
        this.f5129l = (TextView) findViewById(2131558826);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689480, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559433) {
            return super.onOptionsItemSelected(menuItem);
        }
        m2734b();
        if (this.f5125h.f5734U == null || !this.f5125h.f5734U.booleanValue()) {
            new Builder(this).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new C08175(this)).show();
        } else {
            long parseLong;
            CharSequence trim = this.f5128k.getText().toString().trim();
            try {
                parseLong = Long.parseLong(trim);
            } catch (Exception e) {
                e.getMessage();
                parseLong = 0;
            }
            if (StringUtils.m4462a(trim) || parseLong == 0) {
                new Builder(this).setTitle(2131165514).setMessage(2131165345).setPositiveButton(2131165438, new C08186(this)).show();
            } else if (!StringUtils.m4462a(trim)) {
                if (parseLong > this.f5125h.f5752m.longValue()) {
                    new Builder(this).setTitle(2131165514).setMessage(2131165320).setPositiveButton(2131165438, new C08197(this)).show();
                } else if (this.f5126i) {
                    this.b = new LoadingDialog(this);
                    this.b.show();
                    NetworkUtil.m4073a();
                    NetworkUtil.m4082a(this.f5123f, this.f5122e, parseLong);
                } else {
                    new Builder(this).setTitle(2131165514).setMessage(2131165420).setPositiveButton(2131165438, new C08208(this)).show();
                }
            }
        }
        return true;
    }

    protected void onResume() {
        super.onResume();
        m3403a();
    }

    private void m3403a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f5124g = DBManager.m3631a().f5563c.m3639a(this.f5122e);
            this.f5125h = DBManager.m3631a().f5565e.m3590a(this.f5123f, 2);
            List<ChatUser> a = DBManager.m3631a().f5569i.m3610a(this.f5123f);
            this.f5126i = false;
            for (ChatUser chatUser : a) {
                if (chatUser.f5771f.longValue() == this.f5122e) {
                    this.f5126i = true;
                    break;
                }
            }
            this.f5127j.setText(String.format(getResources().getString(2131165407), new Object[]{this.f5124g.f5838q}));
            this.f5129l.setText(Utility.m4502g(this.f5125h.f5752m.longValue()));
        }
    }

    protected final void m3404a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_GIVE_OUT_SUCCESS")) {
            this.b.dismiss();
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_GIVE_OUT_FAULT")) {
            int intValue = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C08164(this)).show();
            m3403a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHATROOM")) {
            m3403a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m3403a();
        }
    }
}
