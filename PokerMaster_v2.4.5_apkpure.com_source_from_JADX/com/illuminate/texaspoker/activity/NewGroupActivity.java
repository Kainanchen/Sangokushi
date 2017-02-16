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
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.TextView;
import com.illuminate.texaspoker.p055a.ah;
import com.illuminate.texaspoker.p055a.ao;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.MapList;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.HorizontalListView;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.SideBar;
import com.illuminate.texaspoker.view.SideBar.C0489a;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.ArrayList;
import java.util.List;

public class NewGroupActivity extends BaseToolBarActivity {
    private static String f4752d;
    private boolean f4753e;
    private boolean f4754f;
    private long f4755g;
    private long f4756h;
    private MapList<Long, FriendUser> f4757i;
    private MapList<Long, FriendUser> f4758j;
    private List<String> f4759k;
    private MapList<String, List<FriendUser>> f4760l;
    private View f4761m;
    private View f4762n;
    private ah f4763o;
    private ExpandableListView f4764p;
    private Menu f4765q;
    private HorizontalListView f4766r;
    private ao f4767s;

    /* renamed from: com.illuminate.texaspoker.activity.NewGroupActivity.1 */
    class C07131 implements OnClickListener {
        final /* synthetic */ NewGroupActivity f4745a;

        C07131(NewGroupActivity newGroupActivity) {
            this.f4745a = newGroupActivity;
        }

        public final void onClick(View view) {
            this.f4745a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewGroupActivity.2 */
    class C07142 implements OnClickListener {
        final /* synthetic */ NewGroupActivity f4746a;

        C07142(NewGroupActivity newGroupActivity) {
            this.f4746a = newGroupActivity;
        }

        public final void onClick(View view) {
            this.f4746a.startActivity(new Intent(this.f4746a, AddFriendActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewGroupActivity.3 */
    class C07153 implements OnGroupClickListener {
        final /* synthetic */ NewGroupActivity f4747a;

        C07153(NewGroupActivity newGroupActivity) {
            this.f4747a = newGroupActivity;
        }

        public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewGroupActivity.4 */
    class C07164 implements OnChildClickListener {
        final /* synthetic */ NewGroupActivity f4748a;

        C07164(NewGroupActivity newGroupActivity) {
            this.f4748a = newGroupActivity;
        }

        public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            NewGroupActivity.m3240a(this.f4748a, i, i2);
            return false;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewGroupActivity.5 */
    class C07175 implements C0489a {
        final /* synthetic */ NewGroupActivity f4749a;

        C07175(NewGroupActivity newGroupActivity) {
            this.f4749a = newGroupActivity;
        }

        public final void m3237a(String str) {
            int positionForSection = this.f4749a.f4763o.getPositionForSection(str.charAt(0));
            if (positionForSection != -1) {
                this.f4749a.f4764p.setSelectedGroup(positionForSection);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewGroupActivity.6 */
    class C07186 implements DialogInterface.OnClickListener {
        final /* synthetic */ NewGroupActivity f4750a;

        C07186(NewGroupActivity newGroupActivity) {
            this.f4750a = newGroupActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.NewGroupActivity.7 */
    class C07197 implements DialogInterface.OnClickListener {
        final /* synthetic */ NewGroupActivity f4751a;

        C07197(NewGroupActivity newGroupActivity) {
            this.f4751a = newGroupActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static /* synthetic */ void m3240a(NewGroupActivity newGroupActivity, int i, int i2) {
        FriendUser friendUser = (FriendUser) ((List) newGroupActivity.f4760l.m4239a(i)).get(i2);
        if (newGroupActivity.f4757i.m4240a(friendUser.f5842u) == null) {
            if (newGroupActivity.f4758j.m4240a(friendUser.f5842u) != null) {
                newGroupActivity.f4758j.m4245c(friendUser.f5842u);
            } else {
                newGroupActivity.f4758j.m4241a(friendUser.f5842u, friendUser);
            }
            newGroupActivity.f4763o.notifyDataSetChanged();
            newGroupActivity.f4767s.notifyDataSetChanged();
            newGroupActivity.f4766r.m4541a(newGroupActivity.f4766r.getRight());
            if (newGroupActivity.f4753e) {
                if (newGroupActivity.f4758j.m4238a() < 2) {
                    newGroupActivity.f4765q.getItem(0).setEnabled(false);
                } else {
                    newGroupActivity.f4765q.getItem(0).setEnabled(true);
                }
            } else if (newGroupActivity.f4758j.m4238a() <= 0) {
                newGroupActivity.f4765q.getItem(0).setEnabled(false);
            } else {
                newGroupActivity.f4765q.getItem(0).setEnabled(true);
            }
        }
    }

    static {
        f4752d = "NewGroupActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        this.f4753e = extras.getBoolean("fromSingle");
        if (this.f4753e) {
            this.f4755g = extras.getLong("uuid");
            this.f4756h = -1;
        } else {
            this.f4756h = extras.getLong("lChatRoomId");
            this.f4755g = -1;
        }
        this.f4754f = false;
        this.f4758j = new MapList();
        this.f4757i = new MapList();
        setContentView(2130968655);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C07131(this));
        if (this.f4756h == -1) {
            setTitle(2131165757);
            toolbar.setTitle(2131165757);
        } else {
            setTitle(2131165263);
            toolbar.setTitle(2131165263);
        }
        this.f4760l = new MapList();
        this.f4759k = new ArrayList();
        ((Button) findViewById(2131558799)).setOnClickListener(new C07142(this));
        this.f4761m = findViewById(2131558795);
        this.f4762n = findViewById(2131558798);
        this.f4764p = (ExpandableListView) findViewById(2131558777);
        this.f4763o = new ah(this, this.f4760l, this.f4757i, this.f4758j);
        this.f4764p.setAdapter(this.f4763o);
        this.f4764p.setOnGroupClickListener(new C07153(this));
        this.f4764p.setOnChildClickListener(new C07164(this));
        this.f4766r = (HorizontalListView) findViewById(2131558797);
        this.f4767s = new ao(this, this.f4758j);
        this.f4766r.setAdapter(this.f4767s);
        SideBar sideBar = (SideBar) findViewById(2131558667);
        sideBar.setTextView((TextView) findViewById(2131558666));
        sideBar.setOnTouchingLetterChangedListener(new C07175(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689496, menu);
        this.f4765q = menu;
        if (this.f4753e) {
            if (this.f4758j.m4238a() < 2) {
                this.f4765q.getItem(0).setEnabled(false);
            } else {
                this.f4765q.getItem(0).setEnabled(true);
            }
        } else if (this.f4758j.m4238a() <= 0) {
            this.f4765q.getItem(0).setEnabled(false);
        } else {
            this.f4765q.getItem(0).setEnabled(true);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559449) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f4753e) {
            if (this.f4758j.m4238a() >= 2) {
                this.b = new LoadingDialog(this);
                this.b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4101a(this.f4758j);
            }
        } else if (this.f4757i == null || this.f4757i.m4238a() == 0) {
            this.b = new LoadingDialog(this);
            this.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4101a(this.f4758j);
        } else if (this.f4754f) {
            this.b = new LoadingDialog(this);
            this.b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4102a(this.f4758j, this.f4756h);
        } else {
            finish();
        }
        return true;
    }

    private void m3238a() {
        if (!DBManager.m3631a().m3632b()) {
            FriendUser a;
            List<FriendUser> a2;
            boolean z;
            List list;
            int a3;
            int i;
            this.f4757i.m4243b();
            if (this.f4753e) {
                a = DBManager.m3631a().f5563c.m3639a(this.f4755g);
                this.f4757i.m4241a(a.f5842u, a);
                this.f4758j.m4241a(a.f5842u, a);
            } else if (this.f4756h != -1) {
                this.f4754f = false;
                ChatRoom a4 = DBManager.m3631a().f5565e.m3590a(this.f4756h, 2);
                for (ChatUser a5 : DBManager.m3631a().f5569i.m3610a(this.f4756h)) {
                    a = a5.m3728a();
                    this.f4757i.m4241a(a.f5842u, a);
                }
                if (a4.f5717D.booleanValue()) {
                    this.f4754f = true;
                }
                this.f4760l.m4243b();
                this.f4759k.clear();
                a2 = DBManager.m3631a().f5563c.m3642a();
                for (Object a6 : this.f4758j.f6665a) {
                    a = (FriendUser) this.f4758j.m4240a(a6);
                    for (FriendUser friendUser : a2) {
                        if (a.f5842u.longValue() == friendUser.f5842u.longValue()) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    if (!z) {
                        this.f4758j.m4245c(a.f5842u);
                    }
                }
                for (FriendUser a7 : a2) {
                    list = (List) this.f4760l.m4240a(a7.f5833l);
                    if (list == null) {
                        list = new ArrayList();
                        this.f4760l.m4241a(a7.f5833l, list);
                        this.f4759k.add(a7.f5833l);
                    }
                    list.add(a7);
                }
                a3 = this.f4760l.m4238a();
                for (i = 0; i < a3; i++) {
                    this.f4764p.expandGroup(i);
                }
                if (a2.size() <= 0) {
                    this.f4762n.setVisibility(4);
                    this.f4761m.setVisibility(0);
                } else {
                    this.f4762n.setVisibility(0);
                    this.f4761m.setVisibility(4);
                }
                this.f4763o.notifyDataSetChanged();
                if (this.f4765q != null) {
                    if (this.f4753e) {
                        if (this.f4758j.m4238a() > 0) {
                            this.f4765q.getItem(0).setEnabled(false);
                        } else {
                            this.f4765q.getItem(0).setEnabled(true);
                        }
                    } else if (this.f4758j.m4238a() >= 2) {
                        this.f4765q.getItem(0).setEnabled(false);
                    } else {
                        this.f4765q.getItem(0).setEnabled(true);
                    }
                }
                this.f4767s.notifyDataSetChanged();
            }
            this.f4754f = true;
            this.f4760l.m4243b();
            this.f4759k.clear();
            a2 = DBManager.m3631a().f5563c.m3642a();
            while (r5.hasNext()) {
                a7 = (FriendUser) this.f4758j.m4240a(a6);
                while (r6.hasNext()) {
                    if (a7.f5842u.longValue() == friendUser.f5842u.longValue()) {
                        z = false;
                        break;
                        if (!z) {
                            this.f4758j.m4245c(a7.f5842u);
                        }
                    }
                }
                z = true;
                if (!z) {
                    this.f4758j.m4245c(a7.f5842u);
                }
            }
            for (FriendUser a72 : a2) {
                list = (List) this.f4760l.m4240a(a72.f5833l);
                if (list == null) {
                    list = new ArrayList();
                    this.f4760l.m4241a(a72.f5833l, list);
                    this.f4759k.add(a72.f5833l);
                }
                list.add(a72);
            }
            a3 = this.f4760l.m4238a();
            for (i = 0; i < a3; i++) {
                this.f4764p.expandGroup(i);
            }
            if (a2.size() <= 0) {
                this.f4762n.setVisibility(0);
                this.f4761m.setVisibility(4);
            } else {
                this.f4762n.setVisibility(4);
                this.f4761m.setVisibility(0);
            }
            this.f4763o.notifyDataSetChanged();
            if (this.f4765q != null) {
                if (this.f4753e) {
                    if (this.f4758j.m4238a() > 0) {
                        this.f4765q.getItem(0).setEnabled(true);
                    } else {
                        this.f4765q.getItem(0).setEnabled(false);
                    }
                } else if (this.f4758j.m4238a() >= 2) {
                    this.f4765q.getItem(0).setEnabled(true);
                } else {
                    this.f4765q.getItem(0).setEnabled(false);
                }
            }
            this.f4767s.notifyDataSetChanged();
        }
    }

    protected void onResume() {
        super.onResume();
        m3238a();
    }

    protected final void m3243a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_FRIEND")) {
            m3238a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            this.f4763o.notifyDataSetChanged();
            this.f4767s.notifyDataSetChanged();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SETTING")) {
            m3238a();
        } else if (str.equalsIgnoreCase("NOTIFY_CREAT_CHAT_ROOM_SUCCESS")) {
            long longValue = ((Long) list.get(0)).longValue();
            this.b.dismiss();
            if (this.f4756h == -1 || this.f4753e) {
                long currentTimeMillis = RuntimeData.f6671b + System.currentTimeMillis();
                String str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                int i = 0;
                for (Long longValue2 : this.f4758j.f6665a) {
                    FriendUser friendUser = (FriendUser) this.f4758j.m4240a(Long.valueOf(longValue2.longValue()));
                    if (i != 0) {
                        if (Utility.m4480a() || Utility.m4485b()) {
                            str2 = str2 + "\u3001";
                        } else {
                            str2 = str2 + ", ";
                        }
                    }
                    str2 = str2 + friendUser.f5838q;
                    i++;
                }
                DBManager.m3631a().f5566f.m3569a(longValue, currentTimeMillis, 2, DBManager.f5555y, String.format(getResources().getString(2131165710), new Object[]{getResources().getString(2131165946), str2}), 0, DBManager.f5540C);
                Intent intent = new Intent(this, ChatRoomActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("eTalkType", 2);
                bundle.putLong("lChatRoomId", longValue);
                intent.putExtras(bundle);
                startActivity(intent);
                return;
            }
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_CREAT_CHAT_ROOM_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C07186(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_ADD_CHATROOM_USER_SUCCESS")) {
            this.b.dismiss();
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_ADD_CHATROOM_USER_FAULT")) {
            r0 = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new C07197(this)).show();
        }
    }
}
