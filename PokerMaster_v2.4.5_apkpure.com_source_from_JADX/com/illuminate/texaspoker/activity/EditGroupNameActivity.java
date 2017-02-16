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

public class EditGroupNameActivity extends BaseToolBarActivity {
    private static String f4315d;
    private long f4316e;
    private boolean f4317f;
    private ChatRoom f4318g;
    private Menu f4319h;
    private EditText f4320i;

    /* renamed from: com.illuminate.texaspoker.activity.EditGroupNameActivity.1 */
    class C05621 implements OnClickListener {
        final /* synthetic */ EditGroupNameActivity f4309a;

        C05621(EditGroupNameActivity editGroupNameActivity) {
            this.f4309a = editGroupNameActivity;
        }

        public final void onClick(View view) {
            this.f4309a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditGroupNameActivity.2 */
    class C05632 implements OnClickListener {
        final /* synthetic */ EditGroupNameActivity f4310a;

        C05632(EditGroupNameActivity editGroupNameActivity) {
            this.f4310a = editGroupNameActivity;
        }

        public final void onClick(View view) {
            this.f4310a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditGroupNameActivity.3 */
    class C05643 implements OnGlobalLayoutListener {
        final /* synthetic */ EditGroupNameActivity f4311a;

        C05643(EditGroupNameActivity editGroupNameActivity) {
            this.f4311a = editGroupNameActivity;
        }

        public final void onGlobalLayout() {
            this.f4311a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditGroupNameActivity.4 */
    class C05654 implements TextWatcher {
        final /* synthetic */ EditGroupNameActivity f4312a;

        C05654(EditGroupNameActivity editGroupNameActivity) {
            this.f4312a = editGroupNameActivity;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (this.f4312a.f4319h == null) {
                return;
            }
            if (StringUtils.m4462a(editable.toString())) {
                this.f4312a.f4319h.getItem(0).setEnabled(false);
            } else {
                this.f4312a.f4319h.getItem(0).setEnabled(true);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditGroupNameActivity.5 */
    class C05665 implements DialogInterface.OnClickListener {
        final /* synthetic */ EditGroupNameActivity f4313a;

        C05665(EditGroupNameActivity editGroupNameActivity) {
            this.f4313a = editGroupNameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.EditGroupNameActivity.6 */
    class C05676 implements DialogInterface.OnClickListener {
        final /* synthetic */ EditGroupNameActivity f4314a;

        C05676(EditGroupNameActivity editGroupNameActivity) {
            this.f4314a = editGroupNameActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static {
        f4315d = "EditGroupNameActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968629);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C05621(this));
        this.f4316e = getIntent().getExtras().getLong("lChatRoomId");
        this.f4317f = false;
        View findViewById = findViewById(2131558601);
        findViewById.setOnClickListener(new C05632(this));
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C05643(this));
        this.f4318g = DBManager.m3631a().f5565e.m3590a(this.f4316e, 2);
        this.f4320i = (EditText) findViewById(2131558706);
        this.f4320i.addTextChangedListener(new C05654(this));
    }

    protected void onResume() {
        super.onResume();
        m3062a();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689489, menu);
        this.f4319h = menu;
        if (StringUtils.m4462a(this.f4318g.f5755p)) {
            this.f4319h.getItem(0).setEnabled(false);
        } else {
            this.f4319h.getItem(0).setEnabled(true);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559441) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f4317f) {
            m2734b();
            if (this.f4317f) {
                String trim = this.f4320i.getText().toString().trim();
                if (StringUtils.m4462a((CharSequence) trim)) {
                    return true;
                }
                if (trim.equals(this.f4318g.f5755p)) {
                    finish();
                    return true;
                } else if (StringUtils.m4460a(trim) > 16) {
                    new Builder(this).setTitle(2131165514).setMessage(2131165284).setPositiveButton(2131165438, new C05676(this)).show();
                    return true;
                } else {
                    this.b = new LoadingDialog(this);
                    this.b.show();
                    NetworkUtil.m4073a();
                    NetworkUtil.m4114a(trim, this.f4316e, -1, -1);
                    return true;
                }
            }
            finish();
            return true;
        }
        m2732a(2130903246, 2131165291, 1);
        return true;
    }

    private void m3062a() {
        this.f4317f = false;
        if (!DBManager.m3631a().m3632b()) {
            this.f4318g = DBManager.m3631a().f5565e.m3590a(this.f4316e, 2);
            if (this.f4318g.f5717D == null) {
                this.f4317f = false;
            } else {
                this.f4317f = this.f4318g.f5717D.booleanValue();
            }
            this.f4320i.setText(this.f4318g.f5755p);
            this.f4320i.setSelection(this.f4318g.f5755p.length());
            if (this.f4319h == null) {
                return;
            }
            if (StringUtils.m4462a(this.f4320i.getText().toString())) {
                this.f4319h.getItem(0).setEnabled(false);
            } else {
                this.f4319h.getItem(0).setEnabled(true);
            }
        }
    }

    protected final void m3063a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_SET_CHATROOM_SUCCESS")) {
            this.b.dismiss();
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SETTING")) {
            m3062a();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_CHATROOM_FAULT")) {
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(((Integer) list.get(0)).intValue()).setPositiveButton(2131165438, new C05665(this)).show();
        }
    }
}
