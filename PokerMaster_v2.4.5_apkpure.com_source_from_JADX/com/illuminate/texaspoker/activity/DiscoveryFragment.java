package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AlertDialog.Builder;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.illuminate.texaspoker.activity.e.AnonymousClass15;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.ChatRoomDao;
import com.illuminate.texaspoker.dao.GameRoomDao.Properties;
import com.illuminate.texaspoker.p055a.BannerPagerAdapter;
import com.illuminate.texaspoker.p055a.DiscoveryAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p057b.GameRoomDBManager;
import com.illuminate.texaspoker.p058c.Banner;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.p060e.p062b.PushManager;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultHandler;
import com.illuminate.texaspoker.view.refreshlayout.RefreshDefaultLayout;
import com.illuminate.texaspoker.view.refreshlayout.RefreshHandler;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_SEARCH_TYPE;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.a.a.d.g;
import org.a.a.d.i;
import org.cocos2dx.lua.AppActivity;

/* renamed from: com.illuminate.texaspoker.activity.e */
public final class DiscoveryFragment extends BaseFragment {
    private int f5361c;
    private DiscoveryAdapter f5362d;
    private List<GameRoom> f5363e;
    private View f5364f;
    private RelativeLayout f5365g;
    private ViewPager f5366h;
    private BannerPagerAdapter f5367i;
    private ViewGroup f5368j;
    private List<Banner> f5369k;
    private List<ImageView> f5370l;
    private int f5371m;
    private View f5372n;
    private ListView f5373o;
    private RefreshDefaultLayout f5374p;
    private View f5375q;
    private View f5376r;
    private EditText f5377s;
    private LoadingDialog f5378t;
    private long f5379u;

    /* compiled from: DiscoveryFragment */
    /* renamed from: com.illuminate.texaspoker.activity.e.15 */
    class AnonymousClass15 implements TextWatcher {
        final /* synthetic */ ImageButton f5345a;
        final /* synthetic */ DiscoveryFragment f5346b;

        AnonymousClass15(DiscoveryFragment discoveryFragment, ImageButton imageButton) {
            this.f5346b = discoveryFragment;
            this.f5345a = imageButton;
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (StringUtils.m4462a(editable.toString())) {
                this.f5345a.setEnabled(false);
            } else {
                this.f5345a.setEnabled(true);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.e.1 */
    class DiscoveryFragment implements OnGlobalLayoutListener {
        final /* synthetic */ DiscoveryFragment f5348a;

        DiscoveryFragment(DiscoveryFragment discoveryFragment) {
            this.f5348a = discoveryFragment;
        }

        public final void onGlobalLayout() {
            this.f5348a.m3480a();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.e.2 */
    class DiscoveryFragment implements OnPageChangeListener {
        final /* synthetic */ DiscoveryFragment f5349a;

        DiscoveryFragment(DiscoveryFragment discoveryFragment) {
            this.f5349a = discoveryFragment;
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            if (this.f5349a.f5369k.size() <= 1) {
                this.f5349a.m3486a(i);
            } else if (i == this.f5349a.f5369k.size() + 1) {
                this.f5349a.m3486a(0);
            } else if (i == 0) {
                this.f5349a.m3486a(this.f5349a.f5369k.size());
            } else {
                this.f5349a.m3486a(i - 1);
            }
        }

        public final void onPageScrollStateChanged(int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.e.3 */
    class DiscoveryFragment implements OnClickListener {
        final /* synthetic */ DiscoveryFragment f5350a;

        DiscoveryFragment(DiscoveryFragment discoveryFragment) {
            this.f5350a = discoveryFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.e.4 */
    class DiscoveryFragment implements Runnable {
        final /* synthetic */ DiscoveryFragment f5351a;

        DiscoveryFragment(DiscoveryFragment discoveryFragment) {
            this.f5351a = discoveryFragment;
        }

        public final void run() {
            GameRoomDBManager gameRoomDBManager = DBManager.m3631a().f5572l;
            long g = this.f5351a.f5379u;
            g a = g.a(gameRoomDBManager.f5595a.f6435J);
            a.a(Properties.f6312u.c(Integer.valueOf(0)), new i[0]);
            a.a(Properties.f6308q.c(Long.valueOf(g)), new i[0]);
            long b = a.b();
            if (this.f5351a.f5374p.m4589a()) {
                String format;
                if (b > 0) {
                    format = String.format(this.f5351a.getResources().getString(2131165570), new Object[]{Long.valueOf(b)});
                } else {
                    format = this.f5351a.getResources().getString(2131165569);
                }
                this.f5351a.m3481a(format);
            }
            this.f5351a.m3491c();
            this.f5351a.f5374p.m4590b();
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.e.5 */
    class DiscoveryFragment implements OnClickListener {
        final /* synthetic */ DiscoveryFragment f5352a;

        DiscoveryFragment(DiscoveryFragment discoveryFragment) {
            this.f5352a = discoveryFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.e.6 */
    class DiscoveryFragment implements OnClickListener {
        final /* synthetic */ DiscoveryFragment f5353a;

        DiscoveryFragment(DiscoveryFragment discoveryFragment) {
            this.f5353a = discoveryFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.e.7 */
    class DiscoveryFragment implements OnClickListener {
        final /* synthetic */ DiscoveryFragment f5354a;

        DiscoveryFragment(DiscoveryFragment discoveryFragment) {
            this.f5354a = discoveryFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.e.8 */
    class DiscoveryFragment implements OnClickListener {
        final /* synthetic */ DiscoveryFragment f5355a;

        DiscoveryFragment(DiscoveryFragment discoveryFragment) {
            this.f5355a = discoveryFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.e.9 */
    class DiscoveryFragment implements RefreshHandler {
        final /* synthetic */ DiscoveryFragment f5360a;

        /* renamed from: com.illuminate.texaspoker.activity.e.9.1 */
        class DiscoveryFragment implements Runnable {
            final /* synthetic */ DiscoveryFragment f5356a;

            DiscoveryFragment(DiscoveryFragment discoveryFragment) {
                this.f5356a = discoveryFragment;
            }

            public final void run() {
                DiscoveryFragment.m3490b();
            }
        }

        /* renamed from: com.illuminate.texaspoker.activity.e.9.2 */
        class DiscoveryFragment implements Runnable {
            final /* synthetic */ DiscoveryFragment f5359a;

            /* renamed from: com.illuminate.texaspoker.activity.e.9.2.1 */
            class DiscoveryFragment implements OnClickListener {
                final /* synthetic */ DiscoveryFragment f5357a;

                DiscoveryFragment(DiscoveryFragment discoveryFragment) {
                    this.f5357a = discoveryFragment;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }

            /* renamed from: com.illuminate.texaspoker.activity.e.9.2.2 */
            class DiscoveryFragment implements OnClickListener {
                final /* synthetic */ DiscoveryFragment f5358a;

                DiscoveryFragment(DiscoveryFragment discoveryFragment) {
                    this.f5358a = discoveryFragment;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f5358a.f5359a.f5360a.f5374p.m4591c();
                }
            }

            DiscoveryFragment(DiscoveryFragment discoveryFragment) {
                this.f5359a = discoveryFragment;
            }

            public final void run() {
                if (this.f5359a.f5360a.f5374p.m4589a()) {
                    this.f5359a.f5360a.f5374p.m4590b();
                    new Builder(this.f5359a.f5360a.getContext()).setTitle(2131165514).setMessage(2131165425).setPositiveButton(2131165481, new DiscoveryFragment(this)).setNegativeButton(2131165432, new DiscoveryFragment(this)).show();
                }
            }
        }

        DiscoveryFragment(DiscoveryFragment discoveryFragment) {
            this.f5360a = discoveryFragment;
        }

        public final void m3483a() {
            new Handler().post(new DiscoveryFragment(this));
            new Handler().postDelayed(new DiscoveryFragment(this), 20000);
        }

        public final boolean m3484a(View view) {
            return RefreshDefaultHandler.m4596b(view);
        }
    }

    public DiscoveryFragment() {
        this.f5379u = 0;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5372n = layoutInflater.inflate(2130968683, null);
        this.f5372n.getViewTreeObserver().addOnGlobalLayoutListener(new DiscoveryFragment(this));
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f5361c = (displayMetrics.widthPixels * 346) / 1242;
        this.f5363e = new ArrayList();
        this.f5369k = new ArrayList();
        this.f5364f = this.f5372n.findViewById(2131558906);
        this.f5373o = (ListView) this.f5372n.findViewById(2131558911);
        this.f5362d = new DiscoveryAdapter(getActivity(), this.f5363e);
        this.f5373o.setAdapter(this.f5362d);
        this.f5374p = (RefreshDefaultLayout) this.f5372n.findViewById(2131558544);
        this.f5374p.setPtrHandler(new DiscoveryFragment(this));
        this.f5373o.setOnItemClickListener(new OnItemClickListener() {
            final /* synthetic */ DiscoveryFragment f5340a;

            {
                this.f5340a = r1;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                DiscoveryFragment.m3488a(this.f5340a, (GameRoom) this.f5340a.f5363e.get(i));
            }
        });
        this.f5370l = new ArrayList();
        this.f5365g = (RelativeLayout) this.f5372n.findViewById(2131558907);
        this.f5365g.getLayoutParams().height = this.f5361c;
        this.f5366h = (ViewPager) this.f5372n.findViewById(2131558908);
        this.f5367i = new BannerPagerAdapter(getContext(), this.f5369k, this.f5366h);
        this.f5366h.setAdapter(this.f5367i);
        this.f5366h.addOnPageChangeListener(this.f5367i);
        if (this.f5369k.size() > 1) {
            this.f5366h.setCurrentItem(1);
        }
        this.f5368j = (ViewGroup) this.f5372n.findViewById(2131558909);
        this.f5366h.addOnPageChangeListener(new DiscoveryFragment(this));
        this.f5375q = this.f5372n.findViewById(2131558575);
        this.f5376r = View.inflate(getContext(), 2130968804, null);
        this.f5376r.setOnClickListener(new View.OnClickListener() {
            final /* synthetic */ DiscoveryFragment f5341a;

            {
                this.f5341a = r1;
            }

            public final void onClick(View view) {
                this.f5341a.m3493d();
            }
        });
        ((Button) this.f5376r.findViewById(2131558659)).setOnClickListener(new View.OnClickListener() {
            final /* synthetic */ DiscoveryFragment f5342a;

            {
                this.f5342a = r1;
            }

            public final void onClick(View view) {
                this.f5342a.startActivity(new Intent(this.f5342a.getContext(), NewClubActivity.class));
            }
        });
        ((ImageButton) this.f5376r.findViewById(2131558660)).setOnClickListener(new View.OnClickListener() {
            final /* synthetic */ DiscoveryFragment f5343a;

            {
                this.f5343a = r1;
            }

            public final void onClick(View view) {
                this.f5343a.startActivity(new Intent(this.f5342a.getContext(), NewClubActivity.class));
            }
        });
        ImageButton imageButton = (ImageButton) this.f5376r.findViewById(2131558661);
        imageButton.setEnabled(false);
        imageButton.setOnClickListener(new View.OnClickListener() {
            final /* synthetic */ DiscoveryFragment f5344a;

            {
                this.f5344a = r1;
            }

            public final void onClick(View view) {
                DiscoveryFragment.m3495e(this.f5344a);
            }
        });
        this.f5377s = (EditText) this.f5376r.findViewById(2131559286);
        this.f5377s.addTextChangedListener(new AnonymousClass15(this, imageButton));
        this.f5377s.setOnEditorActionListener(new OnEditorActionListener() {
            final /* synthetic */ DiscoveryFragment f5347a;

            {
                this.f5347a = r1;
            }

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return false;
                }
                DiscoveryFragment.m3495e(this.f5347a);
                return true;
            }
        });
        return this.f5372n;
    }

    public final void onResume() {
        super.onResume();
        m3491c();
        NetworkUtil.m4073a();
        NetworkUtil.m4176l();
        NetworkUtil.m4073a();
        NetworkUtil.m4170i();
        if (PushManager.m3930a().m3934d()) {
            this.f5364f.setVisibility(8);
        } else {
            this.f5364f.setVisibility(0);
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && this.b) {
            m3491c();
            NetworkUtil.m4073a();
            NetworkUtil.m4176l();
            NetworkUtil.m4073a();
            NetworkUtil.m4170i();
            if (PushManager.m3930a().m3934d()) {
                this.f5364f.setVisibility(8);
            } else {
                this.f5364f.setVisibility(0);
            }
        }
    }

    private void m3486a(int i) {
        if (i >= 0 && i <= this.f5370l.size() - 1) {
            ((ImageView) this.f5370l.get(this.f5371m)).setEnabled(false);
            ((ImageView) this.f5370l.get(i)).setEnabled(true);
            this.f5371m = i;
        }
    }

    private void m3491c() {
        try {
            if (!DBManager.m3631a().m3632b() && this.f5373o != null) {
                this.f5369k.clear();
                this.f5369k.addAll(DBManager.m3631a().f5568h.m3552a());
                if (this.f5369k.size() == 0) {
                    this.f5365g.setVisibility(8);
                } else {
                    this.f5365g.setVisibility(0);
                }
                this.f5363e.clear();
                Collection a = DBManager.m3631a().f5572l.m3661a();
                long a2 = DBManager.m3631a().f5565e.m3588a();
                g a3 = g.a(DBManager.m3631a().f5565e.f5527b.f6426A);
                a3.a(ChatRoomDao.Properties.f6144B.a(Boolean.valueOf(true)), new i[0]);
                a3.a(ChatRoomDao.Properties.f6146D.a(Boolean.valueOf(true)), new i[0]);
                a2 += a3.b();
                if (this.f5376r != null) {
                    this.f5373o.removeHeaderView(this.f5376r);
                }
                if (a.size() != 0) {
                    this.f5379u = ((GameRoom) a.get(0)).f5893q.longValue();
                    this.f5363e.addAll(a);
                    this.f5375q.setVisibility(4);
                } else if (a2 != 0) {
                    this.f5375q.setVisibility(0);
                } else {
                    this.f5375q.setVisibility(4);
                    this.f5373o.addHeaderView(this.f5376r, null, false);
                }
                this.f5362d.notifyDataSetChanged();
                if (this.f5367i != null) {
                    this.f5367i.notifyDataSetChanged();
                    this.f5368j.removeAllViews();
                    this.f5370l.clear();
                    for (int i = 0; i < this.f5369k.size(); i++) {
                        View inflate = View.inflate(getContext(), 2130968722, null);
                        ImageView imageView = (ImageView) inflate.findViewById(2131559014);
                        imageView.setEnabled(false);
                        imageView.setTag(Integer.valueOf(i));
                        this.f5370l.add(imageView);
                        this.f5368j.addView(inflate);
                    }
                    if (this.f5369k.size() <= 1) {
                        this.f5371m = 0;
                        this.f5366h.setCurrentItem(0, false);
                        m3486a(this.f5371m);
                    } else if (this.f5369k.size() - 1 < this.f5371m) {
                        this.f5371m = this.f5369k.size() - 1;
                        this.f5366h.setCurrentItem(this.f5371m + 1, false);
                    }
                    m3486a(this.f5371m);
                }
            }
        } catch (Throwable e) {
            Log.e("DiscoveryFragment", e.getMessage(), e);
        }
    }

    private void m3493d() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(this.f5372n.getApplicationWindowToken(), 0);
        }
    }

    public final void m3499a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_DISCOVERY")) {
            new Handler().postDelayed(new DiscoveryFragment(this), 500);
        } else if (str.equalsIgnoreCase("NOTIFY_SEARCH_CLUB_RESULT")) {
            List list2 = (List) list.get(0);
            this.f5378t.dismiss();
            if (list2.size() > 0) {
                String trim = this.f5377s.getText().toString().trim();
                Serializable arrayList = new ArrayList(list2);
                Intent intent = new Intent(getContext(), ClubSearchResultActivity.class);
                intent.putExtra("searchKey", trim);
                intent.putExtra("fromSearch", true);
                intent.putExtra("search_result", arrayList);
                startActivity(intent);
                return;
            }
            new Builder(getContext()).setTitle(2131165412).setMessage(2131165411).setPositiveButton(2131165438, new DiscoveryFragment(this)).show();
        } else if (str.equalsIgnoreCase("NOTIFY_ENTER_GAME_ROOM_SUCCESS")) {
            if (BaseApplication.f5509b.f4666c == 0) {
                r2 = ((Long) list.get(0)).longValue();
                r0 = (byte[]) list.get(1);
                ((Long) list.get(2)).longValue();
                this.f5378t.dismiss();
                RuntimeData.f6674e = r2;
                g a = g.a(DBManager.m3631a().f5572l.f5595a.f6435J);
                a.a(Properties.f6312u.a(Long.valueOf(r2)), new i[0]);
                List b = a.a().b();
                r1 = null;
                if (!b.isEmpty()) {
                    r1 = (GameRoom) b.get(0);
                }
                if (r1 == null || StringUtils.m4462a(r1.f5863C)) {
                    RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
                } else {
                    RuntimeData.f6672c = r1.f5863C;
                }
                r1 = new Intent(getContext(), AppActivity.class);
                r1.putExtra("gameType", AppActivity.k);
                r1.putExtra("responseData", r0);
                r1.putExtra("CMD", "NOTIFY_CC_ENTER_GAME_ROOM_SUCCESS");
                r1.putExtra("lGameRoomId", r2);
                r1.putExtra("returnTo", AppActivity.g);
                r1.setFlags(67108864);
                r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                startActivity(r1);
                getActivity().finish();
                getActivity().overridePendingTransition(0, 0);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_ENTER_GAME_ROOM_FAULT")) {
            if (BaseApplication.f5509b.f4666c == 0) {
                r0 = ((Integer) list.get(0)).intValue();
                this.f5378t.dismiss();
                new Builder(getContext()).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new DiscoveryFragment(this)).show();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM_SUCCESS")) {
            if (BaseApplication.f5509b.f4666c == 0) {
                r2 = ((Long) list.get(0)).longValue();
                r0 = (byte[]) list.get(1);
                r1 = DBManager.m3631a().f5572l.m3656a(r2, ((Long) list.get(2)).longValue());
                if (StringUtils.m4462a(r1.f5863C)) {
                    RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
                } else {
                    RuntimeData.f6672c = r1.f5863C;
                }
                RuntimeData.f6674e = r2;
                r1 = new Intent(getContext(), AppActivity.class);
                r1.putExtra("gameType", AppActivity.k);
                r1.putExtra("responseData", r0);
                r1.putExtra("CMD", "NOTIFY_CC_SIGN_UP_SNG_GAME_ROOM_SUCCESS");
                r1.putExtra("lGameRoomId", r2);
                r1.setFlags(67108864);
                r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                r1.putExtra("returnTo", AppActivity.g);
                startActivity(r1);
                this.f5378t.dismiss();
                getActivity().finish();
                getActivity().overridePendingTransition(0, 0);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM__FAULT")) {
            if (BaseApplication.f5509b.f4666c == 0) {
                r0 = ((Integer) list.get(0)).intValue();
                m3491c();
                this.f5378t.dismiss();
                new Builder(getContext()).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new DiscoveryFragment(this)).show();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_SUCCESS")) {
            if (BaseApplication.f5509b.f4666c == 0) {
                r2 = ((Long) list.get(0)).longValue();
                r0 = (byte[]) list.get(1);
                r1 = DBManager.m3631a().f5572l.m3656a(r2, ((Long) list.get(2)).longValue());
                if (StringUtils.m4462a(r1.f5863C)) {
                    RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
                } else {
                    RuntimeData.f6672c = r1.f5863C;
                }
                RuntimeData.f6674e = r2;
                r1 = new Intent(getContext(), AppActivity.class);
                r1.putExtra("gameType", AppActivity.k);
                r1.putExtra("responseData", r0);
                r1.putExtra("CMD", "NOTIFY_CC_WATCH_SNG_GAME_ROOM_SUCCESS");
                r1.putExtra("lGameRoomId", r2);
                r1.putExtra("lGameRoomId", r2);
                r1.putExtra("returnTo", AppActivity.g);
                startActivity(r1);
                if (this.f5378t != null) {
                    this.f5378t.dismiss();
                }
                getActivity().finish();
                getActivity().overridePendingTransition(0, 0);
            }
        } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_FAULT")) {
            if (BaseApplication.f5509b.f4666c == 0) {
                r0 = ((Integer) list.get(0)).intValue();
                m3491c();
                this.f5378t.dismiss();
                new Builder(getContext()).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new DiscoveryFragment(this)).show();
            }
        } else if (str.equalsIgnoreCase("NOTIFY_TO_REFRESH_VIEW_AFTER_DENNY")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4170i();
        } else if (str.equalsIgnoreCase("NOTIFY_SIGN_UP_SNG_GAME_ROOM_INVITE_WAITTING")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4170i();
            this.f5378t.dismiss();
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getContext()).inflate(2130968833, null);
            ((ImageView) relativeLayout.findViewById(2131559415)).setImageResource(2130903589);
            ((TextView) relativeLayout.findViewById(2131559416)).setText(2131165306);
            Toast toast = new Toast(getContext());
            toast.setGravity(17, 0, 0);
            toast.setDuration(1);
            toast.setView(relativeLayout);
            toast.show();
        } else if (str.equalsIgnoreCase("NOTIFY_RECONNECT_SUCCESS")) {
            NetworkUtil.m4073a();
            NetworkUtil.m4174k();
            this.f5364f.setVisibility(8);
        } else if (str.equalsIgnoreCase("NOTIFY_NO_CONNECT")) {
            this.f5364f.setVisibility(0);
        }
    }

    static /* synthetic */ void m3490b() {
        NetworkUtil.m4073a();
        NetworkUtil.m4170i();
    }

    static /* synthetic */ void m3488a(DiscoveryFragment discoveryFragment, GameRoom gameRoom) {
        if (gameRoom.f5887k.intValue() != 2) {
            discoveryFragment.f5378t = new LoadingDialog(discoveryFragment.getContext());
            discoveryFragment.f5378t.show();
            if (StringUtils.m4462a(gameRoom.f5863C)) {
                RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                RuntimeData.f6672c = gameRoom.f5863C;
            }
            NetworkUtil.m4073a();
            NetworkUtil.m4169h(gameRoom.f5897u.longValue());
        } else if (gameRoom.f5880d.booleanValue()) {
            discoveryFragment.f5378t = new LoadingDialog(discoveryFragment.getContext());
            discoveryFragment.f5378t.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4171i(gameRoom.f5897u.longValue());
        } else if (gameRoom.f5882f.booleanValue()) {
            r0 = new Intent(discoveryFragment.getContext(), SngDetailActivity.class);
            r1 = new Bundle();
            r1.putLong("lGameRoomId", gameRoom.f5897u.longValue());
            r1.putBoolean("fromQuickChat", false);
            r1.putLong("lChatRoomId", gameRoom.f5900x.longValue());
            r0.putExtras(r1);
            discoveryFragment.startActivity(r0);
        } else if (gameRoom.f5881e.booleanValue()) {
            discoveryFragment.f5378t = new LoadingDialog(discoveryFragment.getContext());
            discoveryFragment.f5378t.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4171i(gameRoom.f5897u.longValue());
        } else {
            r0 = new Intent(discoveryFragment.getContext(), SngDetailActivity.class);
            r1 = new Bundle();
            r1.putLong("lGameRoomId", gameRoom.f5897u.longValue());
            r1.putBoolean("fromQuickChat", false);
            r1.putLong("lChatRoomId", gameRoom.f5900x.longValue());
            r0.putExtras(r1);
            discoveryFragment.startActivity(r0);
        }
    }

    static /* synthetic */ void m3495e(DiscoveryFragment discoveryFragment) {
        String trim = discoveryFragment.f5377s.getText().toString().trim();
        if (!StringUtils.m4462a((CharSequence) trim)) {
            if (trim.length() > 10) {
                new Builder(discoveryFragment.getContext()).setTitle(2131165514).setMessage(2131165355).setPositiveButton(2131165438, new DiscoveryFragment(discoveryFragment)).show();
                return;
            }
            discoveryFragment.m3493d();
            discoveryFragment.f5378t = new LoadingDialog(discoveryFragment.getContext());
            discoveryFragment.f5378t.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4112a(trim, 0, CLUB_SEARCH_TYPE.CLUB_ID_SEARCH);
        }
    }
}
