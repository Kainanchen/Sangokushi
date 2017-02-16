package com.illuminate.texaspoker.p055a;

import a.does.not.Exists2;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v7.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.BaseToolBarActivity;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ClubMsg;
import com.illuminate.texaspoker.p058c.LeagueMsg;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_ACT;
import com.texaspoker.moment.TexasPokerHttpLeague.LEAGUE_ACT;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.k */
public final class ClubMsgListAdapter extends BaseAdapter {
    public ChatRoom f3327a;
    private List<Object> f3328b;
    private Context f3329c;

    /* renamed from: com.illuminate.texaspoker.a.k.1 */
    class ClubMsgListAdapter implements OnClickListener {
        final /* synthetic */ int f3309a;
        final /* synthetic */ ClubMsgListAdapter f3310b;

        static {
            fixHelper.fixfunc(new int[]{3, 4});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native ClubMsgListAdapter(ClubMsgListAdapter clubMsgListAdapter, int i);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.a.k.2 */
    class ClubMsgListAdapter implements OnClickListener {
        final /* synthetic */ int f3311a;
        final /* synthetic */ ClubMsgListAdapter f3312b;

        static {
            fixHelper.fixfunc(new int[]{51, 52});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native ClubMsgListAdapter(ClubMsgListAdapter clubMsgListAdapter, int i);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.a.k.3 */
    class ClubMsgListAdapter implements OnClickListener {
        final /* synthetic */ int f3313a;
        final /* synthetic */ ClubMsgListAdapter f3314b;

        static {
            fixHelper.fixfunc(new int[]{99, 100});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native ClubMsgListAdapter(ClubMsgListAdapter clubMsgListAdapter, int i);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.a.k.4 */
    class ClubMsgListAdapter implements OnClickListener {
        final /* synthetic */ int f3315a;
        final /* synthetic */ ClubMsgListAdapter f3316b;

        static {
            fixHelper.fixfunc(new int[]{307, 308});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native ClubMsgListAdapter(ClubMsgListAdapter clubMsgListAdapter, int i);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.a.k.5 */
    class ClubMsgListAdapter implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubMsgListAdapter f3317a;

        static {
            fixHelper.fixfunc(new int[]{1127, 1128});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native ClubMsgListAdapter(ClubMsgListAdapter clubMsgListAdapter);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.a.k.6 */
    class ClubMsgListAdapter implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubMsgListAdapter f3318a;

        static {
            fixHelper.fixfunc(new int[]{1145, 1146});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native ClubMsgListAdapter(ClubMsgListAdapter clubMsgListAdapter);

        public final native void onClick(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.illuminate.texaspoker.a.k.a */
    public final class ClubMsgListAdapter {
        public SimpleDraweeView f3319a;
        public TextView f3320b;
        public TextView f3321c;
        public ImageButton f3322d;
        public ImageButton f3323e;
        public TextView f3324f;
        public TextView f3325g;
        final /* synthetic */ ClubMsgListAdapter f3326h;

        public ClubMsgListAdapter(ClubMsgListAdapter clubMsgListAdapter) {
            this.f3326h = clubMsgListAdapter;
        }
    }

    public ClubMsgListAdapter(Context context, List<Object> list) {
        this.f3329c = context;
        this.f3328b = list;
    }

    public final int getCount() {
        return this.f3328b.size();
    }

    public final Object getItem(int i) {
        return this.f3328b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        ClubMsgListAdapter clubMsgListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3329c).inflate(2130968757, null);
            ClubMsgListAdapter clubMsgListAdapter2 = new ClubMsgListAdapter(this);
            clubMsgListAdapter2.f3319a = (SimpleDraweeView) view.findViewById(2131558674);
            clubMsgListAdapter2.f3320b = (TextView) view.findViewById(2131558840);
            clubMsgListAdapter2.f3321c = (TextView) view.findViewById(2131559146);
            clubMsgListAdapter2.f3322d = (ImageButton) view.findViewById(2131559147);
            clubMsgListAdapter2.f3323e = (ImageButton) view.findViewById(2131559148);
            clubMsgListAdapter2.f3324f = (TextView) view.findViewById(2131559149);
            clubMsgListAdapter2.f3325g = (TextView) view.findViewById(2131559150);
            view.setTag(clubMsgListAdapter2);
            clubMsgListAdapter = clubMsgListAdapter2;
        } else {
            clubMsgListAdapter = (ClubMsgListAdapter) view.getTag();
        }
        Object obj = this.f3328b.get(i);
        CharSequence format;
        CharSequence charSequence;
        if (obj instanceof ClubMsg) {
            ClubMsg clubMsg = (ClubMsg) obj;
            if (clubMsg.m3732a().f5832k.intValue() == 1) {
                ((GenericDraweeHierarchy) clubMsgListAdapter.f3319a.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) clubMsgListAdapter.f3319a.getHierarchy()).m1407a(2130903193);
            }
            clubMsgListAdapter.f3319a.setImageURI(Uri.parse(clubMsg.m3732a().f5836o));
            clubMsgListAdapter.f3320b.setText(clubMsg.m3732a().f5838q);
            clubMsgListAdapter.f3321c.setText(clubMsg.f5802j);
            clubMsgListAdapter.f3322d.setOnClickListener(new ClubMsgListAdapter(this, i));
            clubMsgListAdapter.f3323e.setOnClickListener(new ClubMsgListAdapter(this, i));
            if (clubMsg.f5794b.intValue() == 1) {
                clubMsgListAdapter.f3322d.setVisibility(0);
                clubMsgListAdapter.f3323e.setVisibility(0);
                clubMsgListAdapter.f3324f.setVisibility(8);
            } else if (clubMsg.f5794b.intValue() == 2) {
                clubMsgListAdapter.f3322d.setVisibility(8);
                clubMsgListAdapter.f3323e.setVisibility(8);
                clubMsgListAdapter.f3324f.setVisibility(0);
                if (StringUtils.m4462a(clubMsg.f5803k)) {
                    format = String.format(this.f3329c.getResources().getString(2131165394), new Object[]{LetterIndexBar.SEARCH_ICON_LETTER});
                } else {
                    format = String.format(this.f3329c.getResources().getString(2131165394), new Object[]{clubMsg.f5803k});
                }
                clubMsgListAdapter.f3324f.setText(format);
            } else if (clubMsg.f5794b.intValue() == 3) {
                clubMsgListAdapter.f3322d.setVisibility(8);
                clubMsgListAdapter.f3323e.setVisibility(8);
                clubMsgListAdapter.f3324f.setVisibility(0);
                if (StringUtils.m4462a(clubMsg.f5803k)) {
                    format = String.format(this.f3329c.getResources().getString(2131165395), new Object[]{LetterIndexBar.SEARCH_ICON_LETTER});
                } else {
                    format = String.format(this.f3329c.getResources().getString(2131165395), new Object[]{clubMsg.f5803k});
                }
                clubMsgListAdapter.f3324f.setText(format);
            }
            if (clubMsg.f5799g == null) {
                charSequence = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                charSequence = Utility.m4496e(clubMsg.f5799g.longValue());
            }
            clubMsgListAdapter.f3325g.setText(charSequence);
        } else {
            LeagueMsg leagueMsg = (LeagueMsg) obj;
            clubMsgListAdapter.f3319a.setImageURI(Uri.parse(leagueMsg.f5935j));
            clubMsgListAdapter.f3320b.setText(leagueMsg.f5934i);
            clubMsgListAdapter.f3321c.setText(leagueMsg.f5937l);
            clubMsgListAdapter.f3322d.setOnClickListener(new ClubMsgListAdapter(this, i));
            clubMsgListAdapter.f3323e.setOnClickListener(new ClubMsgListAdapter(this, i));
            if (leagueMsg.f5930e.intValue() == 1) {
                clubMsgListAdapter.f3322d.setVisibility(0);
                clubMsgListAdapter.f3323e.setVisibility(0);
                clubMsgListAdapter.f3324f.setVisibility(8);
            } else if (leagueMsg.f5930e.intValue() == 2) {
                clubMsgListAdapter.f3322d.setVisibility(8);
                clubMsgListAdapter.f3323e.setVisibility(8);
                clubMsgListAdapter.f3324f.setVisibility(0);
                if (StringUtils.m4462a(leagueMsg.f5936k)) {
                    format = String.format(this.f3329c.getResources().getString(2131165378), new Object[]{LetterIndexBar.SEARCH_ICON_LETTER});
                } else {
                    format = String.format(this.f3329c.getResources().getString(2131165378), new Object[]{leagueMsg.f5936k});
                }
                clubMsgListAdapter.f3324f.setText(format);
            } else if (leagueMsg.f5930e.intValue() == 3) {
                clubMsgListAdapter.f3322d.setVisibility(8);
                clubMsgListAdapter.f3323e.setVisibility(8);
                clubMsgListAdapter.f3324f.setVisibility(0);
                if (StringUtils.m4462a(leagueMsg.f5936k)) {
                    format = String.format(this.f3329c.getResources().getString(2131165379), new Object[]{LetterIndexBar.SEARCH_ICON_LETTER});
                } else {
                    format = String.format(this.f3329c.getResources().getString(2131165379), new Object[]{leagueMsg.f5936k});
                }
                clubMsgListAdapter.f3324f.setText(format);
            }
            if (leagueMsg.f5928c == null) {
                charSequence = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                charSequence = Utility.m4496e(leagueMsg.f5928c.longValue());
            }
            clubMsgListAdapter.f3325g.setText(charSequence);
        }
        return view;
    }

    static /* synthetic */ void m2715a(ClubMsgListAdapter clubMsgListAdapter, int i) {
        if (clubMsgListAdapter.f3327a.f5734U == null || !clubMsgListAdapter.f3327a.f5734U.booleanValue()) {
            new Builder(clubMsgListAdapter.f3329c).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new ClubMsgListAdapter(clubMsgListAdapter)).show();
            return;
        }
        ((BaseToolBarActivity) clubMsgListAdapter.f3329c).f3524b = new LoadingDialog(clubMsgListAdapter.f3329c);
        ((BaseToolBarActivity) clubMsgListAdapter.f3329c).f3524b.show();
        Object obj = clubMsgListAdapter.f3328b.get(i);
        if (obj instanceof ClubMsg) {
            ClubMsg clubMsg = (ClubMsg) obj;
            NetworkUtil.m4073a();
            NetworkUtil.m4087a(clubMsg.f5798f.longValue(), clubMsg.f5796d.longValue(), CLUB_ACT.CLUB_ACCEPT_INVITE);
            return;
        }
        LeagueMsg leagueMsg = (LeagueMsg) obj;
        NetworkUtil.m4073a();
        NetworkUtil.m4085a(leagueMsg.f5932g.longValue(), leagueMsg.f5927b.longValue(), leagueMsg.f5933h.longValue(), LEAGUE_ACT.LEAGUE_ACCEPT_INVITE);
    }

    static /* synthetic */ void m2716b(ClubMsgListAdapter clubMsgListAdapter, int i) {
        if (clubMsgListAdapter.f3327a.f5734U == null || !clubMsgListAdapter.f3327a.f5734U.booleanValue()) {
            new Builder(clubMsgListAdapter.f3329c).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new ClubMsgListAdapter(clubMsgListAdapter)).show();
            return;
        }
        ((BaseToolBarActivity) clubMsgListAdapter.f3329c).f3524b = new LoadingDialog(clubMsgListAdapter.f3329c);
        ((BaseToolBarActivity) clubMsgListAdapter.f3329c).f3524b.show();
        Object obj = clubMsgListAdapter.f3328b.get(i);
        if (obj instanceof ClubMsg) {
            ClubMsg clubMsg = (ClubMsg) obj;
            NetworkUtil.m4073a();
            NetworkUtil.m4087a(clubMsg.f5798f.longValue(), clubMsg.f5796d.longValue(), CLUB_ACT.CLUB_DENY_INVITE);
            return;
        }
        LeagueMsg leagueMsg = (LeagueMsg) obj;
        NetworkUtil.m4073a();
        NetworkUtil.m4085a(leagueMsg.f5932g.longValue(), leagueMsg.f5927b.longValue(), leagueMsg.f5933h.longValue(), LEAGUE_ACT.LEAGUE_DENY_INVITE);
    }
}
