package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.illuminate.texaspoker.p055a.ClubFundUserListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClubFundUserActivity extends BaseToolBarActivity {
    private static String f3958d;
    private long f3959e;
    private ChatRoom f3960f;
    private String f3961g;
    private List<ChatUser> f3962h;
    private EditText f3963i;
    private ImageButton f3964j;
    private TextView f3965k;
    private ClubFundUserListAdapter f3966l;

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundUserActivity.1 */
    class C04471 implements OnClickListener {
        final /* synthetic */ ClubFundUserActivity f3949a;

        C04471(ClubFundUserActivity clubFundUserActivity) {
            this.f3949a = clubFundUserActivity;
        }

        public final void onClick(View view) {
            this.f3949a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundUserActivity.2 */
    class C04482 implements Comparator<ChatUser> {
        final /* synthetic */ ClubFundUserActivity f3950a;

        C04482(ClubFundUserActivity clubFundUserActivity) {
            this.f3950a = clubFundUserActivity;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ChatUser chatUser = (ChatUser) obj2;
            return ((ChatUser) obj).m3728a().f5833l.compareTo(chatUser.m3728a().f5833l);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundUserActivity.3 */
    class C04493 implements OnGlobalLayoutListener {
        final /* synthetic */ ClubFundUserActivity f3951a;

        C04493(ClubFundUserActivity clubFundUserActivity) {
            this.f3951a = clubFundUserActivity;
        }

        public final void onGlobalLayout() {
            this.f3951a.m2735c();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundUserActivity.4 */
    class C04504 implements OnClickListener {
        final /* synthetic */ ClubFundUserActivity f3952a;

        C04504(ClubFundUserActivity clubFundUserActivity) {
            this.f3952a = clubFundUserActivity;
        }

        public final void onClick(View view) {
            this.f3952a.m2734b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundUserActivity.5 */
    class C04515 implements TextWatcher {
        final /* synthetic */ ClubFundUserActivity f3953a;

        C04515(ClubFundUserActivity clubFundUserActivity) {
            this.f3953a = clubFundUserActivity;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String trim = this.f3953a.f3963i.getText().toString().trim();
            if (StringUtils.m4462a((CharSequence) trim)) {
                this.f3953a.f3964j.setVisibility(4);
            } else {
                this.f3953a.f3964j.setVisibility(0);
            }
            this.f3953a.f3961g = trim;
            this.f3953a.m2916a();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundUserActivity.6 */
    class C04526 implements OnKeyListener {
        final /* synthetic */ ClubFundUserActivity f3954a;

        C04526(ClubFundUserActivity clubFundUserActivity) {
            this.f3954a = clubFundUserActivity;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i == 66 && keyEvent.getAction() == 0) {
                ClubFundUserActivity.m2919d(this.f3954a);
            }
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundUserActivity.7 */
    class C04537 implements OnClickListener {
        final /* synthetic */ ClubFundUserActivity f3955a;

        C04537(ClubFundUserActivity clubFundUserActivity) {
            this.f3955a = clubFundUserActivity;
        }

        public final void onClick(View view) {
            ClubFundUserActivity.m2919d(this.f3955a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundUserActivity.8 */
    class C04548 implements OnClickListener {
        final /* synthetic */ ClubFundUserActivity f3956a;

        C04548(ClubFundUserActivity clubFundUserActivity) {
            this.f3956a = clubFundUserActivity;
        }

        public final void onClick(View view) {
            ClubFundUserActivity.m2920e(this.f3956a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubFundUserActivity.9 */
    class C04559 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubFundUserActivity f3957a;

        C04559(ClubFundUserActivity clubFundUserActivity) {
            this.f3957a = clubFundUserActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f3957a.finish();
        }
    }

    static {
        f3958d = "ClubFundActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968617);
        this.f3959e = getIntent().getExtras().getLong("lClubId");
        this.f3961g = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f3962h = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C04471(this));
        View findViewById = findViewById(2131558601);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C04493(this));
        findViewById.setOnClickListener(new C04504(this));
        this.f3963i = (EditText) findViewById(2131558513);
        this.f3963i.addTextChangedListener(new C04515(this));
        this.f3963i.setOnKeyListener(new C04526(this));
        this.f3964j = (ImageButton) findViewById(2131558512);
        this.f3964j.setOnClickListener(new C04537(this));
        ListView listView = (ListView) findViewById(2131558630);
        this.f3966l = new ClubFundUserListAdapter(this, this.f3962h);
        listView.setAdapter(this.f3966l);
        this.f3965k = (TextView) findViewById(2131558627);
        ((Button) findViewById(2131558628)).setOnClickListener(new C04548(this));
    }

    protected void onResume() {
        super.onResume();
        m2916a();
    }

    private void m2916a() {
        this.f3962h.clear();
        if (!DBManager.m3631a().m3632b()) {
            this.f3960f = DBManager.m3631a().f5565e.m3590a(this.f3959e, 2);
            Collection a = DBManager.m3631a().f5569i.m3611a(this.f3959e, this.f3961g);
            Collections.sort(a, new C04482(this));
            this.f3962h.addAll(a);
            this.f3966l.f3297a = this.f3960f;
            this.f3965k.setText(Utility.m4502g(this.f3960f.f5752m.longValue()));
            this.f3966l.notifyDataSetChanged();
        }
    }

    protected final void m2921a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            if (!DBManager.m3631a().m3632b()) {
                this.f3966l.notifyDataSetChanged();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHATROOM")) {
            m2916a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m2916a();
        }
    }

    static /* synthetic */ void m2919d(ClubFundUserActivity clubFundUserActivity) {
        CharSequence trim = clubFundUserActivity.f3963i.getText().toString().trim();
        if (!StringUtils.m4462a(trim)) {
            clubFundUserActivity.f3961g = trim;
            clubFundUserActivity.m2734b();
            clubFundUserActivity.m2916a();
        }
    }

    static /* synthetic */ void m2920e(ClubFundUserActivity clubFundUserActivity) {
        if (clubFundUserActivity.f3960f.f5734U == null || !clubFundUserActivity.f3960f.f5734U.booleanValue()) {
            new Builder(clubFundUserActivity).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new C04559(clubFundUserActivity)).show();
            return;
        }
        Intent intent = new Intent(clubFundUserActivity, ClubChargeFundActivity.class);
        intent.putExtra("lClubId", clubFundUserActivity.f3960f.f5741b);
        clubFundUserActivity.startActivity(intent);
    }
}
