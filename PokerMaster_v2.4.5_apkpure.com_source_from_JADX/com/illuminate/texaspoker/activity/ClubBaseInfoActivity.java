package com.illuminate.texaspoker.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p055a.AlbumPagerAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ClubAlbum;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClubBaseInfoActivity extends BaseToolBarActivity {
    private static String f3860d;
    private TextView f3861A;
    private TextView f3862B;
    private Button f3863C;
    private long f3864e;
    private boolean f3865f;
    private boolean f3866g;
    private ChatRoom f3867h;
    private ClubBaseInfo f3868i;
    private SimpleDateFormat f3869j;
    private List f3870k;
    private List<String> f3871l;
    private List<String> f3872m;
    private int f3873n;
    private int f3874o;
    private AlbumPagerAdapter f3875p;
    private List<ImageView> f3876q;
    private int f3877r;
    private ViewPager f3878s;
    private ViewGroup f3879t;
    private SimpleDraweeView f3880u;
    private TextView f3881v;
    private TextView f3882w;
    private TextView f3883x;
    private SimpleDraweeView f3884y;
    private TextView f3885z;

    /* renamed from: com.illuminate.texaspoker.activity.ClubBaseInfoActivity.1 */
    class C04181 implements OnClickListener {
        final /* synthetic */ ClubBaseInfoActivity f3856a;

        C04181(ClubBaseInfoActivity clubBaseInfoActivity) {
            this.f3856a = clubBaseInfoActivity;
        }

        public final void onClick(View view) {
            this.f3856a.finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubBaseInfoActivity.2 */
    class C04192 implements OnClickListener {
        final /* synthetic */ ClubBaseInfoActivity f3857a;

        C04192(ClubBaseInfoActivity clubBaseInfoActivity) {
            this.f3857a = clubBaseInfoActivity;
        }

        public final void onClick(View view) {
            ClubBaseInfoActivity.m2886a(this.f3857a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubBaseInfoActivity.3 */
    class C04203 implements OnClickListener {
        final /* synthetic */ ClubBaseInfoActivity f3858a;

        C04203(ClubBaseInfoActivity clubBaseInfoActivity) {
            this.f3858a = clubBaseInfoActivity;
        }

        public final void onClick(View view) {
            ClubBaseInfoActivity.m2888b(this.f3858a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.ClubBaseInfoActivity.4 */
    class C04214 implements OnPageChangeListener {
        final /* synthetic */ ClubBaseInfoActivity f3859a;

        C04214(ClubBaseInfoActivity clubBaseInfoActivity) {
            this.f3859a = clubBaseInfoActivity;
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            this.f3859a.m2885a(i);
        }

        public final void onPageScrollStateChanged(int i) {
        }
    }

    static {
        f3860d = "ClubBaseInfoActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968614);
        Bundle extras = getIntent().getExtras();
        this.f3864e = extras.getLong("clubId");
        this.f3868i = (ClubBaseInfo) extras.getSerializable("clubBaseInfo");
        if (this.f3864e == -1 && this.f3868i != null) {
            this.f3864e = this.f3868i.getLClubID();
        }
        this.f3869j = new SimpleDateFormat(getString(2131165520));
        this.f3877r = 0;
        this.f3870k = new ArrayList();
        this.f3876q = new ArrayList();
        this.f3871l = new ArrayList();
        this.f3872m = new ArrayList();
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextAppearance(this, 2131296567);
        toolbar.setNavigationIcon(2130837591);
        toolbar.setNavigationOnClickListener(new C04181(this));
        this.f3878s = (ViewPager) findViewById(2131558607);
        LayoutParams layoutParams = (LayoutParams) this.f3878s.getLayoutParams();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        this.f3874o = (i * 3) / 4;
        this.f3873n = i;
        layoutParams.height = this.f3874o;
        layoutParams.width = this.f3873n;
        this.f3878s.setLayoutParams(layoutParams);
        this.f3875p = new AlbumPagerAdapter(this, this.f3873n, this.f3871l, this.f3872m, BigImageActivity.f3543e, this.f3864e);
        this.f3878s.setAdapter(this.f3875p);
        this.f3878s.addOnPageChangeListener(new C04214(this));
        this.f3879t = (ViewGroup) findViewById(2131558609);
        this.f3880u = (SimpleDraweeView) findViewById(2131558610);
        ((Button) findViewById(2131558611)).setOnClickListener(new C04192(this));
        this.f3881v = (TextView) findViewById(2131558613);
        this.f3882w = (TextView) findViewById(2131558615);
        this.f3883x = (TextView) findViewById(2131558616);
        this.f3884y = (SimpleDraweeView) findViewById(2131558618);
        this.f3885z = (TextView) findViewById(2131558620);
        this.f3861A = (TextView) findViewById(2131558622);
        this.f3862B = (TextView) findViewById(2131558623);
        this.f3863C = (Button) findViewById(2131558624);
        this.f3863C.setOnClickListener(new C04203(this));
    }

    protected void onResume() {
        super.onResume();
        m2884a();
        NetworkUtil.m4073a();
        NetworkUtil.m4179m(this.f3864e);
    }

    private void m2884a() {
        if (!DBManager.m3631a().m3632b()) {
            String str;
            int intValue;
            String str2;
            CharSequence charSequence;
            int i;
            String str3;
            int i2;
            CharSequence charSequence2;
            long j;
            CharSequence charSequence3;
            Object sSmallAlbums;
            this.f3870k.clear();
            this.f3871l.clear();
            this.f3872m.clear();
            String str4;
            int intValue2;
            String str5;
            int intValue3;
            String str6;
            String str7;
            long longValue;
            String str8;
            Object obj;
            Object obj2;
            Object obj3;
            if (this.f3868i == null) {
                this.f3867h = DBManager.m3631a().f5565e.m3590a(this.f3864e, 2);
                this.f3870k.addAll(DBManager.m3631a().f5567g.m3618a(this.f3864e));
                if (this.f3870k.size() == 0) {
                    this.f3870k.add(LetterIndexBar.SEARCH_ICON_LETTER);
                }
                str = this.f3867h.f5755p;
                str4 = this.f3867h.f5760u;
                this.f3867h.f5727N.intValue();
                intValue = this.f3867h.f5729P.intValue();
                intValue2 = this.f3867h.f5731R.intValue();
                str2 = this.f3867h.f5765z;
                this.f3867h.f5748i.longValue();
                str5 = this.f3867h.m3726a().f5836o;
                intValue3 = this.f3867h.m3726a().f5832k.intValue();
                str6 = this.f3867h.m3726a().f5838q;
                str7 = this.f3867h.f5764y;
                longValue = this.f3867h.f5746g.longValue();
                if (this.f3867h.f5717D == null) {
                    this.f3865f = false;
                } else {
                    this.f3865f = this.f3867h.f5717D.booleanValue();
                }
                if (this.f3865f) {
                    this.f3866g = true;
                    charSequence = str;
                    str = str4;
                    i = intValue;
                    intValue = intValue2;
                    str3 = str2;
                    str2 = str5;
                    i2 = intValue3;
                    charSequence2 = str6;
                    str8 = str7;
                    j = longValue;
                    charSequence3 = str8;
                } else {
                    this.f3866g = false;
                    obj = str;
                    str = str4;
                    i = intValue;
                    intValue = intValue2;
                    str3 = str2;
                    str2 = str5;
                    i2 = intValue3;
                    obj2 = str6;
                    str8 = str7;
                    j = longValue;
                    obj3 = str8;
                }
            } else {
                this.f3867h = DBManager.m3631a().f5565e.m3590a(this.f3864e, 2);
                if (this.f3867h == null) {
                    j = (long) this.f3868i.getSSmallAlbumsList().size();
                    for (int i3 = 0; ((long) i3) < j; i3++) {
                        sSmallAlbums = this.f3868i.getSSmallAlbums(i3);
                        if (sSmallAlbums == null) {
                            sSmallAlbums = LetterIndexBar.SEARCH_ICON_LETTER;
                        }
                        this.f3871l.add(sSmallAlbums);
                        sSmallAlbums = this.f3868i.getSBigAlbums(i3);
                        if (sSmallAlbums == null) {
                            sSmallAlbums = LetterIndexBar.SEARCH_ICON_LETTER;
                        }
                        this.f3872m.add(sSmallAlbums);
                    }
                    if (j == 0) {
                        this.f3871l.add(LetterIndexBar.SEARCH_ICON_LETTER);
                        this.f3872m.add(LetterIndexBar.SEARCH_ICON_LETTER);
                    }
                    DBManager.m3631a().f5567g.m3618a(this.f3864e);
                    str = this.f3868i.getSClubName();
                    str4 = this.f3868i.getSSmallIcon();
                    this.f3868i.getIClubLevel();
                    intValue = this.f3868i.getICurMembers();
                    intValue2 = this.f3868i.getIMaxMembers();
                    str2 = this.f3868i.getSClubLocation();
                    this.f3868i.getStCreateUserBaseInfo().getUuid();
                    str5 = this.f3868i.getStCreateUserBaseInfo().getStrCover();
                    intValue3 = this.f3868i.getStCreateUserBaseInfo().getIGender();
                    str6 = this.f3868i.getStCreateUserBaseInfo().getStrNick();
                    str7 = this.f3868i.getSDesc();
                    longValue = this.f3868i.getLCreateTime();
                    this.f3865f = false;
                } else {
                    this.f3870k.addAll(DBManager.m3631a().f5567g.m3618a(this.f3864e));
                    if (this.f3870k.size() == 0) {
                        this.f3870k.add(LetterIndexBar.SEARCH_ICON_LETTER);
                    }
                    str = this.f3867h.f5755p;
                    str4 = this.f3867h.f5760u;
                    this.f3867h.f5727N.intValue();
                    intValue = this.f3867h.f5729P.intValue();
                    intValue2 = this.f3867h.f5731R.intValue();
                    str2 = this.f3867h.f5765z;
                    this.f3867h.f5748i.longValue();
                    str5 = this.f3867h.m3726a().f5836o;
                    intValue3 = this.f3867h.m3726a().f5832k.intValue();
                    str6 = this.f3867h.m3726a().f5838q;
                    str7 = this.f3867h.f5764y;
                    longValue = this.f3867h.f5746g.longValue();
                    if (this.f3867h.f5717D == null) {
                        this.f3865f = false;
                    } else {
                        this.f3865f = this.f3867h.f5717D.booleanValue();
                    }
                    if (this.f3865f) {
                        this.f3866g = true;
                        obj = str;
                        str = str4;
                        i = intValue;
                        intValue = intValue2;
                        str3 = str2;
                        str2 = str5;
                        i2 = intValue3;
                        obj2 = str6;
                        str8 = str7;
                        j = longValue;
                        obj3 = str8;
                    }
                }
                this.f3866g = false;
                obj = str;
                str = str4;
                i = intValue;
                intValue = intValue2;
                str3 = str2;
                str2 = str5;
                i2 = intValue3;
                obj2 = str6;
                str8 = str7;
                j = longValue;
                obj3 = str8;
            }
            setTitle(charSequence);
            this.f3876q.clear();
            this.f3879t.removeAllViews();
            int i4;
            View inflate;
            ImageView imageView;
            if (this.f3870k.size() != 0) {
                for (i4 = 0; i4 < this.f3870k.size(); i4++) {
                    sSmallAlbums = this.f3870k.get(i4);
                    if (sSmallAlbums instanceof String) {
                        this.f3871l.add(LetterIndexBar.SEARCH_ICON_LETTER);
                        this.f3872m.add(LetterIndexBar.SEARCH_ICON_LETTER);
                    } else {
                        ClubAlbum clubAlbum = (ClubAlbum) sSmallAlbums;
                        this.f3871l.add(clubAlbum.f5783e);
                        this.f3872m.add(clubAlbum.f5782d);
                    }
                    inflate = LayoutInflater.from(this).inflate(2130968722, null);
                    imageView = (ImageView) inflate.findViewById(2131559014);
                    imageView.setEnabled(false);
                    imageView.setTag(Integer.valueOf(i4));
                    this.f3876q.add(imageView);
                    this.f3879t.addView(inflate);
                }
            } else {
                for (i4 = 0; i4 < this.f3871l.size(); i4++) {
                    this.f3871l.get(i4);
                    inflate = LayoutInflater.from(this).inflate(2130968722, null);
                    imageView = (ImageView) inflate.findViewById(2131559014);
                    imageView.setEnabled(false);
                    imageView.setTag(Integer.valueOf(i4));
                    this.f3876q.add(imageView);
                    this.f3879t.addView(inflate);
                }
            }
            this.f3875p.notifyDataSetChanged();
            if (this.f3870k.size() - 1 < this.f3877r) {
                this.f3877r = this.f3870k.size() - 1;
                this.f3878s.setCurrentItem(this.f3877r);
            }
            m2885a(this.f3877r);
            this.f3880u.setImageURI(Uri.parse(str));
            this.f3881v.setText(charSequence);
            this.f3882w.setText(i + "/" + intValue);
            this.f3883x.setText(Utility.m4506h(str3));
            if (i2 == 1) {
                ((GenericDraweeHierarchy) this.f3884y.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f3884y.getHierarchy()).m1407a(2130903193);
            }
            this.f3884y.setImageURI(Uri.parse(str2));
            this.f3885z.setText(charSequence2);
            this.f3861A.setText(charSequence3);
            String format = this.f3869j.format(new Date(j));
            this.f3862B.setText(String.format(getResources().getString(2131165338), new Object[]{format}));
            if (this.f3866g) {
                this.f3863C.setText(2131165347);
            } else {
                this.f3863C.setText(2131165318);
            }
        }
    }

    private void m2885a(int i) {
        if (i >= 0 && i <= this.f3876q.size() - 1) {
            ((ImageView) this.f3876q.get(this.f3877r)).setEnabled(false);
            ((ImageView) this.f3876q.get(i)).setEnabled(true);
            this.f3877r = i;
        }
    }

    protected final void m2889a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
            m2884a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_CHATROOM")) {
            m2884a();
        } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYS_MSG")) {
            m2884a();
        }
    }

    static /* synthetic */ void m2886a(ClubBaseInfoActivity clubBaseInfoActivity) {
        Intent intent = new Intent(clubBaseInfoActivity, BigImageActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt(BigImageActivity.f3546h, BigImageActivity.f3544f);
        bundle.putString(BigImageActivity.f3547i, clubBaseInfoActivity.f3867h.f5760u);
        bundle.putString(BigImageActivity.f3548j, clubBaseInfoActivity.f3867h.f5761v);
        bundle.putLong(BigImageActivity.f3550l, clubBaseInfoActivity.f3867h.f5741b.longValue());
        intent.putExtras(bundle);
        clubBaseInfoActivity.startActivity(intent);
        clubBaseInfoActivity.overridePendingTransition(17432576, 17432577);
    }

    static /* synthetic */ void m2888b(ClubBaseInfoActivity clubBaseInfoActivity) {
        if (clubBaseInfoActivity.f3866g) {
            Intent intent = new Intent(clubBaseInfoActivity, ChatRoomActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("eTalkType", 2);
            bundle.putLong("lChatRoomId", clubBaseInfoActivity.f3864e);
            intent.putExtras(bundle);
            clubBaseInfoActivity.startActivity(intent);
            return;
        }
        intent = new Intent(clubBaseInfoActivity, SendEnterClubActivity.class);
        intent.putExtra("lClubId", clubBaseInfoActivity.f3864e);
        clubBaseInfoActivity.startActivity(intent);
    }
}
