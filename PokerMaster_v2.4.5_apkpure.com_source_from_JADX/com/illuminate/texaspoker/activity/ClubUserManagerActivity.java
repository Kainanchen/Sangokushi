package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.ClubUserListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_ACT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClubUserManagerActivity extends BaseToolBarActivity {
    private static String f4186d;
    private boolean f4187e;
    private boolean f4188f;
    private boolean f4189g;
    private long f4190h;
    private String f4191i;
    private ChatRoom f4192j;
    private List<ChatUser> f4193k;
    private EditText f4194l;
    private ImageButton f4195m;
    private ImageButton f4196n;
    private ImageButton f4197o;
    private TextView f4198p;
    private TextView f4199q;
    private ImageView f4200r;
    private ImageView f4201s;
    private ClubUserListAdapter f4202t;

    /* renamed from: com.illuminate.texaspoker.activity.ClubUserManagerActivity.1 */
    class C05161 implements OnClickListener {
        final /* synthetic */ ClubUserManagerActivity f4175a;

        C05161(ClubUserManagerActivity clubUserManagerActivity) {
            this.f4175a = clubUserManagerActivity;
        }

        public final void onClick(View view) {
            this.f4175a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubUserManagerActivity.2 */
    class C05172 implements Comparator<ChatUser> {
        final /* synthetic */ ClubUserManagerActivity f4176a;

        C05172(ClubUserManagerActivity clubUserManagerActivity) {
            this.f4176a = clubUserManagerActivity;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ChatUser chatUser = (ChatUser) obj2;
            return ((ChatUser) obj).m3728a().f5833l.compareTo(chatUser.m3728a().f5833l);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubUserManagerActivity.3 */
    class C05183 implements Comparator<ChatUser> {
        final /* synthetic */ ClubUserManagerActivity f4177a;

        C05183(ClubUserManagerActivity clubUserManagerActivity) {
            this.f4177a = clubUserManagerActivity;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((ChatUser) obj2).m3728a().f5833l.compareTo(((ChatUser) obj).m3728a().f5833l);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubUserManagerActivity.4 */
    class C05194 implements Comparator<ChatUser> {
        final /* synthetic */ ClubUserManagerActivity f4178a;

        C05194(ClubUserManagerActivity clubUserManagerActivity) {
            this.f4178a = clubUserManagerActivity;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ChatUser chatUser = (ChatUser) obj2;
            FriendUser a = ((ChatUser) obj).m3728a();
            FriendUser a2 = chatUser.m3728a();
            if (a2.f5843v == null && a.f5843v == null) {
                return 0;
            }
            if (a2.f5843v == null) {
                return -1;
            }
            if (a.f5843v == null) {
                return 1;
            }
            return a2.f5843v.compareTo(a.f5843v);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubUserManagerActivity.5 */
    class C05205 implements Comparator<ChatUser> {
        final /* synthetic */ ClubUserManagerActivity f4179a;

        C05205(ClubUserManagerActivity clubUserManagerActivity) {
            this.f4179a = clubUserManagerActivity;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ChatUser chatUser = (ChatUser) obj2;
            FriendUser a = ((ChatUser) obj).m3728a();
            FriendUser a2 = chatUser.m3728a();
            if (a2.f5843v == null && a.f5843v == null) {
                return 0;
            }
            if (a2.f5843v == null) {
                return 1;
            }
            if (a.f5843v == null) {
                return -1;
            }
            return a.f5843v.compareTo(a2.f5843v);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubUserManagerActivity.6 */
    class C05216 implements DialogInterface.OnClickListener {
        final /* synthetic */ ChatUser f4180a;
        final /* synthetic */ ClubUserManagerActivity f4181b;

        C05216(ClubUserManagerActivity clubUserManagerActivity, ChatUser chatUser) {
            this.f4181b = clubUserManagerActivity;
            this.f4180a = chatUser;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f4181b.b = new LoadingDialog(this.f4181b);
                this.f4181b.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4087a(this.f4181b.f4190h, this.f4180a.m3728a().f5842u.longValue(), CLUB_ACT.CLUB_REMOVE_INVITE);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubUserManagerActivity.7 */
    class C05227 implements DialogInterface.OnClickListener {
        final /* synthetic */ ChatUser f4182a;
        final /* synthetic */ ClubUserManagerActivity f4183b;

        C05227(ClubUserManagerActivity clubUserManagerActivity, ChatUser chatUser) {
            this.f4183b = clubUserManagerActivity;
            this.f4182a = chatUser;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f4183b.b = new LoadingDialog(this.f4183b);
                this.f4183b.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4087a(this.f4183b.f4190h, this.f4182a.m3728a().f5842u.longValue(), CLUB_ACT.CLUB_REMOVE_INVITE);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubUserManagerActivity.8 */
    class C05238 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubUserManagerActivity f4184a;

        C05238(ClubUserManagerActivity clubUserManagerActivity) {
            this.f4184a = clubUserManagerActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubUserManagerActivity.9 */
    class C05249 implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubUserManagerActivity f4185a;

        static {
            fixHelper.fixfunc(new int[]{3619, 3620});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C05249(ClubUserManagerActivity clubUserManagerActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    public ClubUserManagerActivity() {
        this.f4187e = true;
        this.f4188f = true;
        this.f4189g = true;
    }

    static /* synthetic */ void m2996a(ClubUserManagerActivity clubUserManagerActivity, int i) {
        ChatUser chatUser;
        if (clubUserManagerActivity.f4192j.f5748i.longValue() == SharedPreferencesManager.m4308b()) {
            chatUser = (ChatUser) clubUserManagerActivity.f4193k.get(i);
            if (chatUser.f5767b.intValue() != 3) {
                new Builder(clubUserManagerActivity).setItems(2131492865, new C05216(clubUserManagerActivity, chatUser)).show();
            }
        } else if (clubUserManagerActivity.f4192j.f5734U != null && clubUserManagerActivity.f4192j.f5734U.booleanValue()) {
            chatUser = (ChatUser) clubUserManagerActivity.f4193k.get(i);
            if (chatUser.f5767b.intValue() != 1) {
                new Builder(clubUserManagerActivity).setItems(2131492865, new C05227(clubUserManagerActivity, chatUser)).show();
            }
        }
    }

    static {
        f4186d = "ClubUserManagerActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968625);
        this.f4190h = getIntent().getExtras().getLong("lClubId");
        this.f4191i = LetterIndexBar.SEARCH_ICON_LETTER;
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C05161(this));
        View findViewById = findViewById(2131558601);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            final /* synthetic */ ClubUserManagerActivity f4167a;

            {
                this.f4167a = r1;
            }

            public final void onGlobalLayout() {
                this.f4167a.m2735c();
            }
        });
        findViewById.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubUserManagerActivity f4168a;

            {
                this.f4168a = r1;
            }

            public final void onClick(View view) {
                this.f4168a.m2734b();
            }
        });
        this.f4194l = (EditText) findViewById(2131558513);
        this.f4194l.addTextChangedListener(new TextWatcher() {
            final /* synthetic */ ClubUserManagerActivity f4169a;

            {
                this.f4169a = r1;
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                String trim = this.f4169a.f4194l.getText().toString().trim();
                if (StringUtils.m4462a((CharSequence) trim)) {
                    this.f4169a.f4195m.setVisibility(4);
                } else {
                    this.f4169a.f4195m.setVisibility(0);
                }
                this.f4169a.f4191i = trim;
                this.f4169a.m2995a();
            }
        });
        this.f4194l.setOnKeyListener(new OnKeyListener() {
            final /* synthetic */ ClubUserManagerActivity f4170a;

            {
                this.f4170a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i == 66 && keyEvent.getAction() == 0) {
                    ClubUserManagerActivity.m3003d(this.f4170a);
                }
                return false;
            }
        });
        this.f4195m = (ImageButton) findViewById(2131558512);
        this.f4195m.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubUserManagerActivity f4171a;

            {
                this.f4171a = r1;
            }

            public final void onClick(View view) {
                ClubUserManagerActivity.m3003d(this.f4171a);
            }
        });
        this.f4196n = (ImageButton) findViewById(2131559140);
        this.f4196n.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubUserManagerActivity f4172a;

            {
                this.f4172a = r1;
            }

            public final void onClick(View view) {
                boolean z = true;
                if (this.f4172a.f4189g) {
                    ClubUserManagerActivity clubUserManagerActivity = this.f4172a;
                    if (this.f4172a.f4187e) {
                        z = false;
                    }
                    clubUserManagerActivity.f4187e = z;
                } else {
                    this.f4172a.f4189g = true;
                }
                this.f4172a.m3002d();
            }
        });
        this.f4197o = (ImageButton) findViewById(2131559143);
        this.f4197o.setOnClickListener(new OnClickListener() {
            final /* synthetic */ ClubUserManagerActivity f4173a;

            {
                this.f4173a = r1;
            }

            public final void onClick(View view) {
                boolean z = false;
                if (this.f4173a.f4189g) {
                    this.f4173a.f4189g = false;
                } else {
                    ClubUserManagerActivity clubUserManagerActivity = this.f4173a;
                    if (!this.f4173a.f4188f) {
                        z = true;
                    }
                    clubUserManagerActivity.f4188f = z;
                }
                this.f4173a.m3002d();
            }
        });
        this.f4198p = (TextView) findViewById(2131559141);
        this.f4199q = (TextView) findViewById(2131559144);
        this.f4200r = (ImageView) findViewById(2131559142);
        this.f4201s = (ImageView) findViewById(2131559145);
        this.f4193k = new ArrayList();
        ListView listView = (ListView) findViewById(2131558630);
        this.f4202t = new ClubUserListAdapter(this, this.f4193k);
        listView.setAdapter(this.f4202t);
        listView.setOnItemLongClickListener(new OnItemLongClickListener() {
            final /* synthetic */ ClubUserManagerActivity f4174a;

            {
                this.f4174a = r1;
            }

            public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                ClubUserManagerActivity.m2996a(this.f4174a, i);
                return true;
            }
        });
    }

    private void m2995a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4192j = DBManager.m3631a().f5565e.m3590a(this.f4190h, 2);
            this.f4202t.f3355a = this.f4192j;
            m3002d();
            invalidateOptionsMenu();
            setTitle(String.format(getResources().getString(2131165419), new Object[]{this.f4192j.f5729P, this.f4192j.f5731R}));
        }
    }

    protected void onResume() {
        super.onResume();
        m2995a();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        if (this.f4192j.f5734U != null && this.f4192j.f5734U.booleanValue()) {
            getMenuInflater().inflate(2131689482, menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559435) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent(this, ClubAddLimitActivity.class);
        intent.putExtra("lClubId", this.f4190h);
        startActivity(intent);
        return true;
    }

    private void m3002d() {
        List a = DBManager.m3631a().f5569i.m3611a(this.f4190h, this.f4191i);
        if (this.f4189g) {
            if (this.f4187e) {
                Collections.sort(a, new C05172(this));
                this.f4200r.setImageResource(2130903203);
            } else {
                Collections.sort(a, new C05183(this));
                this.f4200r.setImageResource(2130903204);
            }
            this.f4198p.setTextColor(-1);
            this.f4199q.setTextColor(-10855846);
            this.f4201s.setImageResource(2130903205);
        } else {
            if (this.f4188f) {
                Collections.sort(a, new C05194(this));
                this.f4201s.setImageResource(2130903203);
            } else {
                Collections.sort(a, new C05205(this));
                this.f4201s.setImageResource(2130903204);
            }
            this.f4199q.setTextColor(-10855846);
            this.f4198p.setTextColor(-1);
            this.f4200r.setImageResource(2130903205);
        }
        this.f4193k.clear();
        this.f4193k.addAll(a);
        this.f4202t.notifyDataSetChanged();
    }

    protected final void m3009a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            this.f4202t.notifyDataSetChanged();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_CLUB_USER_LEVEL_SUCCESS")) {
            this.b.dismiss();
            m2995a();
        } else if (str.equalsIgnoreCase("NOTIFY_SET_CLUB_USER_LEVEL_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C05249(this)).show();
            m2995a();
        } else if (str.equalsIgnoreCase("NOTIFY_REMOVE_CLUB_USER_SUCCESS")) {
            this.b.dismiss();
            m2995a();
        } else if (str.equalsIgnoreCase("NOTIFY_REMOVE_CLUB_USER_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C05238(this)).show();
            m2995a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m2995a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SETTING")) {
            m2995a();
        }
    }

    static /* synthetic */ void m3003d(ClubUserManagerActivity clubUserManagerActivity) {
        CharSequence trim = clubUserManagerActivity.f4194l.getText().toString().trim();
        if (!StringUtils.m4462a(trim)) {
            clubUserManagerActivity.f4191i = trim;
            clubUserManagerActivity.m2734b();
            clubUserManagerActivity.m2995a();
        }
    }
}
