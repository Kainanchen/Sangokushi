package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p055a.AlbumPagerAdapter;
import com.illuminate.texaspoker.p055a.FriendClubSmallListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendAlbum;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FriendInfoActivity extends BaseToolBarActivity {
    private static String f4443d;
    private TextView f4444A;
    private TextView f4445B;
    private ImageButton f4446C;
    private ImageView f4447D;
    private TextView f4448E;
    private List f4449F;
    private List<String> f4450G;
    private List<String> f4451H;
    private AlbumPagerAdapter f4452I;
    private List<ImageView> f4453J;
    private int f4454K;
    private ViewGroup f4455L;
    private boolean f4456e;
    private long f4457f;
    private FriendUser f4458g;
    private List<ChatUser> f4459h;
    private LayoutInflater f4460i;
    private View f4461j;
    private ImageButton f4462k;
    private ImageView f4463l;
    private ListView f4464m;
    private FriendClubSmallListAdapter f4465n;
    private ViewPager f4466o;
    private SimpleDraweeView f4467p;
    private TextView f4468q;
    private TextView f4469r;
    private View f4470s;
    private ImageView f4471t;
    private TextView f4472u;
    private TextView f4473v;
    private ImageButton f4474w;
    private TextView f4475x;
    private TextView f4476y;
    private TextView f4477z;

    /* renamed from: com.illuminate.texaspoker.activity.FriendInfoActivity.1 */
    class C06171 implements OnClickListener {
        final /* synthetic */ FriendInfoActivity f4434a;

        static {
            fixHelper.fixfunc(new int[]{962, 963});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06171(FriendInfoActivity friendInfoActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendInfoActivity.2 */
    class C06182 implements DialogInterface.OnClickListener {
        final /* synthetic */ FriendInfoActivity f4435a;

        static {
            fixHelper.fixfunc(new int[]{1060, 1061});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06182(FriendInfoActivity friendInfoActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendInfoActivity.3 */
    class C06193 implements DialogInterface.OnClickListener {
        final /* synthetic */ FriendInfoActivity f4436a;

        static {
            fixHelper.fixfunc(new int[]{1112, 1113});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06193(FriendInfoActivity friendInfoActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendInfoActivity.4 */
    class C06204 implements DialogInterface.OnClickListener {
        final /* synthetic */ FriendInfoActivity f4437a;

        static {
            fixHelper.fixfunc(new int[]{1137, 1138});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06204(FriendInfoActivity friendInfoActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendInfoActivity.5 */
    class C06215 implements DialogInterface.OnClickListener {
        final /* synthetic */ FriendInfoActivity f4438a;

        static {
            fixHelper.fixfunc(new int[]{1216, 1217});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06215(FriendInfoActivity friendInfoActivity);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendInfoActivity.6 */
    class C06226 implements Comparator<ChatUser> {
        final /* synthetic */ FriendInfoActivity f4439a;

        static {
            fixHelper.fixfunc(new int[]{1302, 1303});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06226(FriendInfoActivity friendInfoActivity);

        public final native /* synthetic */ int compare(Object obj, Object obj2);
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendInfoActivity.7 */
    class C06237 implements OnClickListener {
        final /* synthetic */ FriendInfoActivity f4440a;

        static {
            fixHelper.fixfunc(new int[]{1468, 1469});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06237(FriendInfoActivity friendInfoActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendInfoActivity.8 */
    class C06248 implements OnItemClickListener {
        final /* synthetic */ FriendInfoActivity f4441a;

        static {
            fixHelper.fixfunc(new int[]{1352, 1353});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06248(FriendInfoActivity friendInfoActivity);

        public final native void onItemClick(AdapterView<?> adapterView, View view, int i, long j);
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendInfoActivity.9 */
    class C06259 implements OnClickListener {
        final /* synthetic */ FriendInfoActivity f4442a;

        static {
            fixHelper.fixfunc(new int[]{1523, 1524});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06259(FriendInfoActivity friendInfoActivity);

        public final native void onClick(View view);
    }

    static {
        f4443d = "FriendInfoActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968637);
        this.f4457f = getIntent().getExtras().getLong("friendUuid");
        this.f4460i = LayoutInflater.from(this);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837591);
            toolbar.setNavigationOnClickListener(new C06171(this));
        }
        this.f4456e = false;
        this.f4459h = new ArrayList();
        this.f4454K = 0;
        this.f4449F = new ArrayList();
        this.f4453J = new ArrayList();
        this.f4450G = new ArrayList();
        this.f4451H = new ArrayList();
        this.f4464m = (ListView) findViewById(2131558729);
        View inflate = this.f4460i.inflate(2130968768, null);
        this.f4464m.addHeaderView(inflate);
        this.f4466o = (ViewPager) inflate.findViewById(2131559170);
        LayoutParams layoutParams = (LayoutParams) this.f4466o.getLayoutParams();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        layoutParams.height = (i * 3) / 4;
        layoutParams.width = i;
        this.f4466o.setLayoutParams(layoutParams);
        this.f4452I = new AlbumPagerAdapter(this, i, this.f4450G, this.f4451H, BigImageActivity.f3542d, this.f4457f);
        this.f4466o.setAdapter(this.f4452I);
        this.f4466o.addOnPageChangeListener(new OnPageChangeListener() {
            final /* synthetic */ FriendInfoActivity f4430a;

            {
                this.f4430a = r1;
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                this.f4430a.m3114a(i);
            }

            public final void onPageScrollStateChanged(int i) {
            }
        });
        this.f4455L = (ViewGroup) inflate.findViewById(2131558609);
        this.f4467p = (SimpleDraweeView) inflate.findViewById(2131558838);
        ((Button) inflate.findViewById(2131558611)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ FriendInfoActivity f4431a;

            {
                this.f4431a = r1;
            }

            public final void onClick(View view) {
                Intent intent = new Intent(this.f4431a, BigImageActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt(BigImageActivity.f3546h, BigImageActivity.f3541c);
                bundle.putString(BigImageActivity.f3547i, this.f4431a.f4458g.f5836o);
                bundle.putString(BigImageActivity.f3548j, this.f4431a.f4458g.f5837p);
                bundle.putLong(BigImageActivity.f3550l, this.f4431a.f4457f);
                bundle.putInt(BigImageActivity.f3551m, this.f4431a.f4458g.f5832k.intValue());
                intent.putExtras(bundle);
                this.f4431a.startActivity(intent);
                this.f4431a.overridePendingTransition(17432576, 17432577);
            }
        });
        this.f4468q = (TextView) inflate.findViewById(2131558840);
        this.f4469r = (TextView) inflate.findViewById(2131558926);
        this.f4471t = (ImageView) inflate.findViewById(2131558928);
        this.f4472u = (TextView) inflate.findViewById(2131558645);
        this.f4473v = (TextView) inflate.findViewById(2131558622);
        this.f4470s = inflate.findViewById(2131559171);
        this.f4474w = (ImageButton) inflate.findViewById(2131559172);
        this.f4474w.setOnClickListener(new OnClickListener() {
            final /* synthetic */ FriendInfoActivity f4432a;

            {
                this.f4432a = r1;
            }

            public final void onClick(View view) {
                String str;
                Intent intent = new Intent(this.f4432a, EditRemarkActivity.class);
                Bundle bundle = new Bundle();
                bundle.putLong("friendUuid", this.f4432a.f4457f);
                if (StringUtils.m4462a(this.f4432a.f4458g.f5841t)) {
                    str = LetterIndexBar.SEARCH_ICON_LETTER;
                } else {
                    str = this.f4432a.f4458g.f5841t;
                }
                bundle.putString("remarkStr", str);
                intent.putExtras(bundle);
                this.f4432a.startActivity(intent);
                System.out.println();
            }
        });
        this.f4475x = (TextView) inflate.findViewById(2131559174);
        this.f4476y = (TextView) inflate.findViewById(2131559175);
        this.f4477z = (TextView) inflate.findViewById(2131559176);
        this.f4444A = (TextView) inflate.findViewById(2131558524);
        this.f4445B = (TextView) inflate.findViewById(2131558526);
        this.f4461j = this.f4460i.inflate(2130968767, null);
        this.f4464m.addHeaderView(this.f4461j);
        this.f4462k = (ImageButton) this.f4461j.findViewById(2131559168);
        this.f4462k.setOnClickListener(new C06237(this));
        this.f4463l = (ImageView) this.f4461j.findViewById(2131559169);
        this.f4464m.addFooterView(this.f4460i.inflate(2130968798, null), null, false);
        this.f4465n = new FriendClubSmallListAdapter(this, this.f4459h, this.f4457f);
        this.f4464m.setAdapter(this.f4465n);
        this.f4464m.setOnItemClickListener(new C06248(this));
        this.f4446C = (ImageButton) findViewById(2131558624);
        this.f4446C.setOnClickListener(new C06259(this));
        this.f4447D = (ImageView) findViewById(2131558730);
        this.f4448E = (TextView) findViewById(2131558731);
    }

    protected void onResume() {
        super.onResume();
        m3113a();
        NetworkUtil.m4073a();
        NetworkUtil.m4187q(this.f4457f);
        NetworkUtil.m4073a();
        NetworkUtil.m4137b(this.f4457f, true);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        if (this.f4458g != null && this.f4458g.f5826e.intValue() == 3) {
            getMenuInflater().inflate(2131689488, menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131559440) {
            return super.onOptionsItemSelected(menuItem);
        }
        new Builder(this).setTitle(2131165514).setMessage(String.format(getResources().getString(2131165528), new Object[]{this.f4458g.f5838q})).setPositiveButton(2131165438, new C06182(this)).setNegativeButton(2131165432, new DialogInterface.OnClickListener() {
            final /* synthetic */ FriendInfoActivity f4433a;

            {
                this.f4433a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }).show();
        return true;
    }

    private void m3113a() {
        if (!DBManager.m3631a().m3632b()) {
            long longValue;
            long longValue2;
            long longValue3;
            long longValue4;
            this.f4449F.clear();
            this.f4450G.clear();
            this.f4451H.clear();
            this.f4449F.addAll(DBManager.m3631a().f5561a.m3636a(this.f4457f));
            if (this.f4449F.size() == 0) {
                this.f4449F.add(LetterIndexBar.SEARCH_ICON_LETTER);
            }
            this.f4453J.clear();
            this.f4455L.removeAllViews();
            for (int i = 0; i < this.f4449F.size(); i++) {
                Object obj = this.f4449F.get(i);
                if (obj instanceof String) {
                    this.f4450G.add(LetterIndexBar.SEARCH_ICON_LETTER);
                    this.f4451H.add(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    FriendAlbum friendAlbum = (FriendAlbum) obj;
                    this.f4450G.add(friendAlbum.f5818e);
                    this.f4451H.add(friendAlbum.f5817d);
                }
                View inflate = LayoutInflater.from(this).inflate(2130968722, null);
                ImageView imageView = (ImageView) inflate.findViewById(2131559014);
                imageView.setEnabled(false);
                imageView.setTag(Integer.valueOf(i));
                this.f4453J.add(imageView);
                this.f4455L.addView(inflate);
            }
            this.f4452I.notifyDataSetChanged();
            if (this.f4449F.size() - 1 < this.f4454K) {
                this.f4454K = this.f4449F.size() - 1;
                this.f4466o.setCurrentItem(this.f4454K);
            }
            m3114a(this.f4454K);
            this.f4458g = DBManager.m3631a().f5563c.m3639a(this.f4457f);
            if (this.f4458g.f5832k == null || this.f4458g.f5832k.intValue() == 1) {
                ((GenericDraweeHierarchy) this.f4467p.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f4467p.getHierarchy()).m1407a(2130903193);
            }
            this.f4467p.setImageURI(Uri.parse(this.f4458g.f5836o));
            this.f4468q.setText(this.f4458g.f5838q);
            Drawable drawable;
            if (this.f4458g.f5832k.intValue() == 1) {
                drawable = ContextCompat.getDrawable(this, 2130903430);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f4468q.setCompoundDrawables(null, null, drawable, null);
            } else {
                drawable = ContextCompat.getDrawable(this, 2130903424);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f4468q.setCompoundDrawables(null, null, drawable, null);
            }
            this.f4469r.setText(Utility.m4502g(this.f4458g.f5820B.longValue()));
            if (this.f4458g.f5830i.intValue() == 1) {
                this.f4471t.setVisibility(8);
                this.f4470s.setVisibility(8);
                this.f4472u.setVisibility(8);
            } else if (this.f4458g.f5830i.intValue() == 2) {
                this.f4471t.setVisibility(0);
                this.f4470s.setVisibility(0);
                this.f4471t.setImageResource(2130903426);
                this.f4472u.setText(2131165802);
            } else if (this.f4458g.f5830i.intValue() == 3) {
                this.f4471t.setVisibility(0);
                this.f4470s.setVisibility(0);
                this.f4471t.setImageResource(2130903432);
                this.f4472u.setText(2131165803);
            }
            this.f4473v.setText(this.f4458g.f5835n);
            List<ChatUser> b = DBManager.m3631a().f5569i.m3615b(this.f4457f);
            Collection arrayList = new ArrayList();
            for (ChatUser chatUser : b) {
                if (!(chatUser.m3731b() == null || chatUser.m3731b().f5715B == null || !chatUser.m3731b().f5715B.booleanValue())) {
                    arrayList.add(chatUser);
                }
            }
            Collections.sort(arrayList, new C06226(this));
            this.f4459h.clear();
            if (arrayList.size() > 3) {
                this.f4459h.addAll(arrayList.subList(0, 3));
                this.f4465n.f3393a = true;
                this.f4456e = true;
                this.f4463l.setVisibility(0);
                this.f4462k.setEnabled(true);
                this.f4461j.setVisibility(0);
            } else if (arrayList.size() == 0) {
                this.f4461j.setVisibility(8);
            } else {
                this.f4459h.addAll(arrayList);
                this.f4465n.f3393a = false;
                this.f4456e = false;
                this.f4463l.setVisibility(8);
                this.f4462k.setEnabled(false);
                this.f4461j.setVisibility(0);
            }
            if (StringUtils.m4462a(this.f4458g.f5841t)) {
                this.f4475x.setVisibility(8);
            } else {
                this.f4475x.setText(this.f4458g.f5841t);
                this.f4475x.setVisibility(0);
            }
            if (this.f4458g.f5845x != null) {
                longValue = this.f4458g.f5845x.longValue();
            } else {
                longValue = 0;
            }
            if (this.f4458g.f5847z != null) {
                longValue2 = this.f4458g.f5847z.longValue();
            } else {
                longValue2 = 0;
            }
            if (this.f4458g.f5846y != null) {
                longValue3 = this.f4458g.f5846y.longValue();
            } else {
                longValue3 = 0;
            }
            if (this.f4458g.f5819A != null) {
                longValue4 = this.f4458g.f5819A.longValue();
            } else {
                longValue4 = 0;
            }
            this.f4476y.setText(Utility.m4505h(longValue));
            this.f4477z.setText(Utility.m4505h(longValue3));
            double d = 0.0d;
            if (longValue3 != 0) {
                d = ((double) longValue2) / ((double) longValue3);
                if (d >= 1.0d) {
                    d = 1.0d;
                }
            }
            this.f4444A.setText(((int) (d * 100.0d)));
            d = 0.0d;
            if (longValue2 != 0) {
                d = ((double) longValue4) / ((double) longValue2);
                if (d >= 1.0d) {
                    d = 1.0d;
                }
            }
            this.f4445B.setText(((int) (d * 100.0d)));
            this.f4465n.notifyDataSetChanged();
            if (this.f4458g.f5826e.intValue() == 3) {
                this.f4446C.setBackgroundResource(2130837657);
                this.f4447D.setVisibility(8);
                this.f4448E.setText(2131165558);
            } else {
                this.f4446C.setBackgroundResource(2130837652);
                this.f4447D.setVisibility(0);
                this.f4448E.setText(2131165552);
            }
            invalidateOptionsMenu();
        }
    }

    private void m3114a(int i) {
        if (i >= 0 && i <= this.f4453J.size() - 1) {
            ((ImageView) this.f4453J.get(this.f4454K)).setEnabled(false);
            ((ImageView) this.f4453J.get(i)).setEnabled(true);
            this.f4454K = i;
        }
    }

    protected final void m3121a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m3113a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_FRIEND")) {
            m3113a();
        } else if (str.equalsIgnoreCase("NOTIFY_REMOVE_FRIEND_SUCCESS")) {
            this.b.dismiss();
            m3113a();
            finish();
        } else if (str.equalsIgnoreCase("NOTIFY_REMOVE_FRIEND_FAULT")) {
            int intValue = ((Integer) list.get(0)).intValue();
            this.b.dismiss();
            new Builder(this).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new C06215(this)).show();
        }
    }

    static /* synthetic */ void m3115a(FriendInfoActivity friendInfoActivity, int i) {
        ChatRoom b = ((ChatUser) friendInfoActivity.f4459h.get(i)).m3731b();
        Intent intent = new Intent(friendInfoActivity, ClubBaseInfoActivity.class);
        intent.putExtra("clubId", b.f5741b);
        friendInfoActivity.startActivity(intent);
    }

    static /* synthetic */ void m3116b(FriendInfoActivity friendInfoActivity) {
        if (friendInfoActivity.f4458g.f5826e.intValue() == 3) {
            Intent intent = new Intent(friendInfoActivity, ChatRoomActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("eTalkType", 1);
            bundle.putLong("lChatRoomId", friendInfoActivity.f4457f);
            intent.putExtras(bundle);
            friendInfoActivity.startActivity(intent);
            return;
        }
        new Builder(friendInfoActivity).setTitle(2131165554).setMessage(2131165553).setPositiveButton(2131165438, new C06204(friendInfoActivity)).setNegativeButton(2131165432, new C06193(friendInfoActivity)).show();
    }

    static /* synthetic */ void m3119d(FriendInfoActivity friendInfoActivity) {
        friendInfoActivity.b = new LoadingDialog(friendInfoActivity);
        friendInfoActivity.b.show();
        NetworkUtil.m4073a();
        NetworkUtil.m4189r(friendInfoActivity.f4457f);
    }

    static /* synthetic */ void m3120e(FriendInfoActivity friendInfoActivity) {
        Intent intent = new Intent(friendInfoActivity, SendInviteActivity.class);
        intent.putExtra("uuid", friendInfoActivity.f4457f);
        friendInfoActivity.startActivity(intent);
    }
}
