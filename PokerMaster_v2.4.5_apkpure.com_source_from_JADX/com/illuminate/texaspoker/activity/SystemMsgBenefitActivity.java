package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.MessageMsg;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.List;

public class SystemMsgBenefitActivity extends BaseToolBarActivity {
    private static String f5286d;
    private long f5287e;
    private TextView f5288f;
    private SimpleDraweeView f5289g;
    private TextView f5290h;
    private Button f5291i;

    /* renamed from: com.illuminate.texaspoker.activity.SystemMsgBenefitActivity.1 */
    class C08831 implements OnClickListener {
        final /* synthetic */ SystemMsgBenefitActivity f5282a;

        C08831(SystemMsgBenefitActivity systemMsgBenefitActivity) {
            this.f5282a = systemMsgBenefitActivity;
        }

        public final void onClick(View view) {
            this.f5282a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SystemMsgBenefitActivity.2 */
    class C08842 implements OnClickListener {
        final /* synthetic */ SystemMsgBenefitActivity f5283a;

        C08842(SystemMsgBenefitActivity systemMsgBenefitActivity) {
            this.f5283a = systemMsgBenefitActivity;
        }

        public final void onClick(View view) {
            SystemMsgBenefitActivity.m3467a(this.f5283a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SystemMsgBenefitActivity.3 */
    class C08853 implements DialogInterface.OnClickListener {
        final /* synthetic */ SystemMsgBenefitActivity f5284a;

        C08853(SystemMsgBenefitActivity systemMsgBenefitActivity) {
            this.f5284a = systemMsgBenefitActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.SystemMsgBenefitActivity.4 */
    class C08864 implements DialogInterface.OnClickListener {
        final /* synthetic */ SystemMsgBenefitActivity f5285a;

        C08864(SystemMsgBenefitActivity systemMsgBenefitActivity) {
            this.f5285a = systemMsgBenefitActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f5286d = "SystemMsgBenefitActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968672);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C08831(this));
        this.f5287e = getIntent().getExtras().getLong("systemMsgId");
        this.f5288f = (TextView) findViewById(2131558875);
        this.f5289g = (SimpleDraweeView) findViewById(2131558876);
        this.f5290h = (TextView) findViewById(2131558877);
        this.f5291i = (Button) findViewById(2131558878);
        this.f5291i.setOnClickListener(new C08842(this));
    }

    protected void onResume() {
        super.onResume();
        m3466a();
        NetworkUtil.m4073a();
        NetworkUtil.m4191s(this.f5287e);
    }

    private void m3466a() {
        if (!DBManager.m3631a().m3632b()) {
            MessageMsg a = DBManager.m3631a().f5574n.m3686a(this.f5287e);
            this.f5288f.setText(a.f5949j);
            if (StringUtils.m4462a(a.f5947h)) {
                this.f5289g.setVisibility(8);
            } else {
                this.f5289g.setImageURI(Uri.parse(a.f5947h));
            }
            this.f5290h.setText(a.f5951l);
            if (a.f5944e.intValue() == 1) {
                this.f5291i.setVisibility(8);
                setTitle(2131165936);
                return;
            }
            setTitle(2131165932);
            if (a.f5942c.booleanValue()) {
                this.f5291i.setEnabled(false);
                this.f5291i.setText(2131165934);
            } else {
                this.f5291i.setEnabled(true);
                this.f5291i.setText(2131165933);
            }
            this.f5291i.setVisibility(0);
        }
    }

    protected final void m3468a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYSTEM_MESSAGE_BYID")) {
            m3466a();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_BENEFITS_SUCCESS")) {
            this.f5291i.setEnabled(false);
            this.f5291i.setText(2131165934);
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(2131165935).setPositiveButton(2131165438, new C08853(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_GET_BENEFITS_FAILED")) {
            int intValue = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C08864(this)).show();
        }
    }

    static /* synthetic */ void m3467a(SystemMsgBenefitActivity systemMsgBenefitActivity) {
        systemMsgBenefitActivity.b = new LoadingDialog(systemMsgBenefitActivity);
        systemMsgBenefitActivity.b.show();
        NetworkUtil.m4073a();
        NetworkUtil.m4193t(systemMsgBenefitActivity.f5287e);
    }
}
