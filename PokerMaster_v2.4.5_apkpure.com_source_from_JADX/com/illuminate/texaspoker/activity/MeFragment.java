package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AlertDialog.Builder;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p055a.AlbumPagerAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendAlbum;
import com.illuminate.texaspoker.utils.Config;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerCommon.VIP_TYPE;
import java.util.ArrayList;
import java.util.List;
import org.cocos2dx.lua.AppActivity;

/* renamed from: com.illuminate.texaspoker.activity.f */
public final class MeFragment extends BaseFragment {
    private TextView f5393A;
    private ImageButton f5394B;
    private ImageView f5395C;
    private TextView f5396D;
    private ImageView f5397E;
    private LoadingDialog f5398c;
    private int f5399d;
    private List f5400e;
    private List<String> f5401f;
    private List<String> f5402g;
    private List<ImageView> f5403h;
    private AlbumPagerAdapter f5404i;
    private View f5405j;
    private ViewPager f5406k;
    private ViewGroup f5407l;
    private SimpleDraweeView f5408m;
    private TextView f5409n;
    private ImageView f5410o;
    private TextView f5411p;
    private View f5412q;
    private TextView f5413r;
    private View f5414s;
    private TextView f5415t;
    private ImageView f5416u;
    private TextView f5417v;
    private TextView f5418w;
    private ImageView f5419x;
    private TextView f5420y;
    private ImageView f5421z;

    /* renamed from: com.illuminate.texaspoker.activity.f.1 */
    class MeFragment implements OnPageChangeListener {
        final /* synthetic */ MeFragment f5384a;

        MeFragment(MeFragment meFragment) {
            this.f5384a = meFragment;
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            this.f5384a.m3502a(i);
        }

        public final void onPageScrollStateChanged(int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.f.2 */
    class MeFragment implements OnClickListener {
        final /* synthetic */ MeFragment f5385a;

        MeFragment(MeFragment meFragment) {
            this.f5385a = meFragment;
        }

        public final void onClick(View view) {
            this.f5385a.f5398c = new LoadingDialog(this.f5385a.getContext());
            this.f5385a.f5398c.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4188r();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.f.3 */
    class MeFragment implements OnClickListener {
        final /* synthetic */ MeFragment f5386a;

        MeFragment(MeFragment meFragment) {
            this.f5386a = meFragment;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f5386a.getContext(), AppActivity.class);
            intent.putExtra("gameType", AppActivity.l);
            intent.putExtra("CMD", "NOTIFY_CC_ENTER_MINI_GAME_SUCCESS");
            intent.putExtra("returnTo", AppActivity.j);
            this.f5386a.startActivity(intent);
            this.f5386a.getActivity().finish();
            this.f5386a.getActivity().overridePendingTransition(0, 0);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.f.4 */
    class MeFragment implements OnClickListener {
        final /* synthetic */ MeFragment f5387a;

        MeFragment(MeFragment meFragment) {
            this.f5387a = meFragment;
        }

        public final void onClick(View view) {
            this.f5387a.startActivity(new Intent(this.f5387a.getActivity(), SettingsActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.f.5 */
    class MeFragment implements DialogInterface.OnClickListener {
        final /* synthetic */ MeFragment f5388a;

        MeFragment(MeFragment meFragment) {
            this.f5388a = meFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.f.6 */
    class MeFragment implements OnClickListener {
        final /* synthetic */ MeFragment f5389a;

        MeFragment(MeFragment meFragment) {
            this.f5389a = meFragment;
        }

        public final void onClick(View view) {
            this.f5389a.startActivity(new Intent(this.f5389a.getActivity(), EditMeActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.f.7 */
    class MeFragment implements OnClickListener {
        final /* synthetic */ MeFragment f5390a;

        MeFragment(MeFragment meFragment) {
            this.f5390a = meFragment;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f5390a.getContext(), BigImageActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt(BigImageActivity.f3546h, BigImageActivity.f3541c);
            bundle.putString(BigImageActivity.f3547i, SharedPreferencesManager.m4375k());
            bundle.putString(BigImageActivity.f3548j, SharedPreferencesManager.m4383l());
            bundle.putLong(BigImageActivity.f3550l, SharedPreferencesManager.m4308b());
            bundle.putInt(BigImageActivity.f3551m, SharedPreferencesManager.m4408p());
            intent.putExtras(bundle);
            this.f5390a.startActivity(intent);
            this.f5390a.getActivity().overridePendingTransition(17432576, 17432577);
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.f.8 */
    class MeFragment implements OnClickListener {
        final /* synthetic */ MeFragment f5391a;

        MeFragment(MeFragment meFragment) {
            this.f5391a = meFragment;
        }

        public final void onClick(View view) {
            this.f5391a.startActivity(new Intent(this.f5391a.getActivity(), StoreActivity.class));
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.f.9 */
    class MeFragment implements OnClickListener {
        final /* synthetic */ MeFragment f5392a;

        MeFragment(MeFragment meFragment) {
            this.f5392a = meFragment;
        }

        public final void onClick(View view) {
            this.f5392a.startActivity(new Intent(this.f5392a.getActivity(), AddFriendActivity.class));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5399d = 0;
        this.f5400e = new ArrayList();
        this.f5401f = new ArrayList();
        this.f5402g = new ArrayList();
        this.f5405j = layoutInflater.inflate(2130968684, null);
        this.f5405j.findViewById(2131558912);
        this.f5406k = (ViewPager) this.f5405j.findViewById(2131558913);
        LayoutParams layoutParams = (LayoutParams) this.f5406k.getLayoutParams();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        layoutParams.height = (i * 3) / 4;
        layoutParams.width = i;
        this.f5406k.setLayoutParams(layoutParams);
        this.f5404i = new AlbumPagerAdapter(getContext(), i, this.f5401f, this.f5402g, BigImageActivity.f3542d, SharedPreferencesManager.m4308b());
        this.f5406k.setAdapter(this.f5404i);
        this.f5406k.addOnPageChangeListener(new MeFragment(this));
        this.f5407l = (ViewGroup) this.f5405j.findViewById(2131558609);
        ((ImageButton) this.f5405j.findViewById(2131558914)).setOnClickListener(new MeFragment(this));
        this.f5408m = (SimpleDraweeView) this.f5405j.findViewById(2131558674);
        ((Button) this.f5405j.findViewById(2131558675)).setOnClickListener(new MeFragment(this));
        this.f5409n = (TextView) this.f5405j.findViewById(2131558917);
        this.f5410o = (ImageView) this.f5405j.findViewById(2131558918);
        this.f5411p = (TextView) this.f5405j.findViewById(2131558919);
        this.f5412q = this.f5405j.findViewById(2131558927);
        ((ImageButton) this.f5405j.findViewById(2131558920)).setOnClickListener(new MeFragment(this));
        this.f5413r = (TextView) this.f5405j.findViewById(2131558924);
        this.f5415t = (TextView) this.f5405j.findViewById(2131558926);
        this.f5416u = (ImageView) this.f5405j.findViewById(2131558928);
        this.f5417v = (TextView) this.f5405j.findViewById(2131558645);
        ((ImageButton) this.f5405j.findViewById(2131558930)).setOnClickListener(new MeFragment(this));
        ((ImageButton) this.f5405j.findViewById(2131558933)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ MeFragment f5380a;

            {
                this.f5380a = r1;
            }

            public final void onClick(View view) {
                this.f5380a.startActivity(new Intent(this.f5380a.getContext(), PokerHistoryListActivity.class));
            }
        });
        this.f5418w = (TextView) this.f5405j.findViewById(2131558935);
        ((ImageButton) this.f5405j.findViewById(2131558936)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ MeFragment f5381a;

            {
                this.f5381a = r1;
            }

            public final void onClick(View view) {
                this.f5381a.startActivity(new Intent(this.f5381a.getActivity(), MyFriendActivity.class));
            }
        });
        this.f5419x = (ImageView) this.f5405j.findViewById(2131558939);
        this.f5420y = (TextView) this.f5405j.findViewById(2131558940);
        ((ImageButton) this.f5405j.findViewById(2131558941)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ MeFragment f5382a;

            {
                this.f5382a = r1;
            }

            public final void onClick(View view) {
                this.f5382a.startActivity(new Intent(this.f5382a.getActivity(), MyClubActivity.class));
            }
        });
        this.f5421z = (ImageView) this.f5405j.findViewById(2131558944);
        this.f5393A = (TextView) this.f5405j.findViewById(2131558945);
        this.f5414s = this.f5405j.findViewById(2131558946);
        ((ImageButton) this.f5405j.findViewById(2131558947)).setOnClickListener(new OnClickListener() {
            final /* synthetic */ MeFragment f5383a;

            {
                this.f5383a = r1;
            }

            public final void onClick(View view) {
                this.f5383a.startActivity(new Intent(this.f5383a.getActivity(), MyGroupActivity.class));
            }
        });
        this.f5394B = (ImageButton) this.f5405j.findViewById(2131558949);
        this.f5394B.setOnClickListener(new MeFragment(this));
        this.f5395C = (ImageView) this.f5405j.findViewById(2131558953);
        this.f5396D = (TextView) this.f5405j.findViewById(2131558951);
        this.f5397E = (ImageView) this.f5405j.findViewById(2131558952);
        ((ImageButton) this.f5405j.findViewById(2131558954)).setOnClickListener(new MeFragment(this));
        ((ImageButton) this.f5405j.findViewById(2131558957)).setOnClickListener(new MeFragment(this));
        return this.f5405j;
    }

    public final void m3506a(String str, List<Object> list) {
        try {
            if (str.equalsIgnoreCase("NOTIFY_REFRESH_TAB_MY_INFO")) {
                m3504b();
            } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
                m3504b();
            } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_NEW_FRIEND")) {
                m3505c();
            } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_MSG")) {
                m3505c();
            } else if (str.equalsIgnoreCase("NOTIFY_GET_LOGIN_REWARD_SUCCESS")) {
                if (!DBManager.m3631a().m3632b()) {
                    if (this.f5398c != null) {
                        this.f5398c.dismiss();
                    }
                    if (Utility.m4486b(SharedPreferencesManager.m4281L())) {
                        this.f5395C.setVisibility(4);
                        this.f5397E.setVisibility(4);
                        this.f5396D.setVisibility(0);
                        this.f5394B.setEnabled(false);
                    } else {
                        this.f5395C.setVisibility(0);
                        this.f5397E.setVisibility(0);
                        this.f5396D.setVisibility(4);
                        this.f5394B.setEnabled(true);
                    }
                    long longValue = ((Long) list.get(0)).longValue();
                    m3481a(String.format(getResources().getString(2131165767), new Object[]{Long.valueOf(longValue)}));
                }
            } else if (str.equalsIgnoreCase("NOTIFY_GET_LOGIN_REWARD_FAULT") && !DBManager.m3631a().m3632b()) {
                int intValue = ((Integer) list.get(0)).intValue();
                if (this.f5398c != null) {
                    this.f5398c.dismiss();
                }
                if (Utility.m4486b(SharedPreferencesManager.m4281L())) {
                    this.f5395C.setVisibility(4);
                    this.f5397E.setVisibility(4);
                    this.f5396D.setVisibility(0);
                    this.f5394B.setEnabled(false);
                } else {
                    this.f5395C.setVisibility(0);
                    this.f5397E.setVisibility(0);
                    this.f5396D.setVisibility(4);
                    this.f5394B.setEnabled(true);
                }
                new Builder(getContext()).setTitle(2131165514).setMessage(intValue).setPositiveButton(2131165438, new MeFragment(this)).show();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public final void onResume() {
        super.onResume();
        try {
            NetworkUtil.m4073a();
            NetworkUtil.m4137b(SharedPreferencesManager.m4308b(), false);
            m3504b();
            m3505c();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && this.b) {
            try {
                NetworkUtil.m4073a();
                NetworkUtil.m4137b(SharedPreferencesManager.m4308b(), false);
                m3504b();
                m3505c();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    private void m3504b() {
        if (!DBManager.m3631a().m3632b() && this.f5400e != null) {
            this.f5400e.clear();
            this.f5401f.clear();
            this.f5402g.clear();
            this.f5400e.addAll(DBManager.m3631a().f5561a.m3636a(SharedPreferencesManager.m4308b()));
            if (this.f5400e.size() == 0) {
                this.f5400e.add(LetterIndexBar.SEARCH_ICON_LETTER);
            }
            this.f5403h = new ArrayList();
            this.f5407l.removeAllViews();
            for (int i = 0; i < this.f5400e.size(); i++) {
                Object obj = this.f5400e.get(i);
                if (obj instanceof String) {
                    this.f5401f.add(LetterIndexBar.SEARCH_ICON_LETTER);
                    this.f5402g.add(LetterIndexBar.SEARCH_ICON_LETTER);
                } else {
                    FriendAlbum friendAlbum = (FriendAlbum) obj;
                    this.f5401f.add(friendAlbum.f5818e);
                    this.f5402g.add(friendAlbum.f5817d);
                }
                View inflate = LayoutInflater.from(getContext()).inflate(2130968722, null);
                ImageView imageView = (ImageView) inflate.findViewById(2131559014);
                imageView.setEnabled(false);
                imageView.setTag(Integer.valueOf(i));
                this.f5403h.add(imageView);
                this.f5407l.addView(inflate);
            }
            this.f5404i.notifyDataSetChanged();
            if (this.f5400e.size() - 1 < this.f5399d) {
                this.f5399d = this.f5400e.size() - 1;
                this.f5406k.setCurrentItem(this.f5399d);
            }
            m3502a(this.f5399d);
            if (SharedPreferencesManager.m4408p() == 1) {
                ((GenericDraweeHierarchy) this.f5408m.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) this.f5408m.getHierarchy()).m1407a(2130903193);
            }
            this.f5408m.setImageURI(Uri.parse(SharedPreferencesManager.m4375k()));
            if (Config.f6659d == Config.f6656a) {
                this.f5409n.setText(SharedPreferencesManager.m4308b() + "_" + SharedPreferencesManager.m4361i());
            } else {
                this.f5409n.setText(SharedPreferencesManager.m4361i());
            }
            if (SharedPreferencesManager.m4408p() == 1) {
                this.f5410o.setImageResource(2130903430);
            } else {
                this.f5410o.setImageResource(2130903424);
            }
            this.f5411p.setText(SharedPreferencesManager.m4420s());
            this.f5413r.setText(Utility.m4502g(SharedPreferencesManager.m4413q()));
            this.f5415t.setText(Utility.m4502g(SharedPreferencesManager.m4417r()));
            if (SharedPreferencesManager.m4396n() == VIP_TYPE.BLUE_CARD.getNumber()) {
                this.f5412q.setVisibility(0);
                this.f5416u.setImageResource(2130903419);
                this.f5417v.setText(2131165447);
            } else if (SharedPreferencesManager.m4396n() == VIP_TYPE.GOLD_CARD.getNumber()) {
                this.f5412q.setVisibility(0);
                this.f5416u.setImageResource(2130903426);
                this.f5417v.setText(Utility.m4472a(SharedPreferencesManager.m4265A(), "yy/MM/dd"));
            } else if (SharedPreferencesManager.m4396n() == VIP_TYPE.PLATINUM_CARD.getNumber()) {
                this.f5412q.setVisibility(0);
                this.f5416u.setImageResource(2130903432);
                this.f5417v.setText(Utility.m4472a(SharedPreferencesManager.m4265A(), "yy/MM/dd"));
            }
            long a = DBManager.m3631a().f5578r.m3691a();
            this.f5418w.setText(String.format(getResources().getString(2131165778), new Object[]{Long.valueOf(a)}));
            if (DBManager.m3631a().f5565e.m3588a() == 0) {
                this.f5414s.setVisibility(8);
            } else {
                this.f5414s.setVisibility(0);
            }
        }
    }

    private void m3502a(int i) {
        if (i >= 0 && i <= this.f5403h.size() - 1) {
            ((ImageView) this.f5403h.get(this.f5399d)).setEnabled(false);
            ((ImageView) this.f5403h.get(i)).setEnabled(true);
            this.f5399d = i;
        }
    }

    private void m3505c() {
        if (!DBManager.m3631a().m3632b() && this.f5420y != null) {
            long a = DBManager.m3631a().f5564d.m3701a();
            if (a > 0) {
                if (a > 99) {
                    this.f5420y.setText("\u22c5\u22c5\u22c5");
                } else {
                    this.f5420y.setText(String.valueOf(a));
                }
                this.f5419x.setVisibility(0);
                this.f5420y.setVisibility(0);
            } else {
                this.f5420y.setText(LetterIndexBar.SEARCH_ICON_LETTER);
                this.f5419x.setVisibility(4);
                this.f5420y.setVisibility(4);
            }
            if (Utility.m4486b(SharedPreferencesManager.m4281L())) {
                this.f5395C.setVisibility(4);
                this.f5397E.setVisibility(4);
                this.f5396D.setVisibility(0);
                this.f5394B.setEnabled(false);
            } else {
                this.f5395C.setVisibility(0);
                this.f5397E.setVisibility(0);
                this.f5396D.setVisibility(4);
                this.f5394B.setEnabled(true);
            }
            a = DBManager.m3631a().f5575o.m3623a() + DBManager.m3631a().f5582v.m3679a();
            if (a > 0) {
                if (a > 99) {
                    this.f5393A.setText("\u22c5\u22c5\u22c5");
                } else {
                    this.f5393A.setText(String.valueOf(a));
                }
                this.f5393A.setVisibility(0);
                this.f5421z.setVisibility(0);
                return;
            }
            this.f5393A.setText(LetterIndexBar.SEARCH_ICON_LETTER);
            this.f5393A.setVisibility(4);
            this.f5421z.setVisibility(4);
        }
    }
}
