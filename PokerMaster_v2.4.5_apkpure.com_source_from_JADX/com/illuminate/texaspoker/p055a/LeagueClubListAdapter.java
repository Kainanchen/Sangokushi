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
import android.widget.Button;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.LeagueInfoActivity;
import com.illuminate.texaspoker.p058c.LeagueClub;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.texaspoker.moment.TexasPokerHttpLeague.LEAGUE_ACT;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.y */
public final class LeagueClubListAdapter extends BaseAdapter {
    private Context f3483a;
    private List<LeagueClub> f3484b;
    private long f3485c;

    /* renamed from: com.illuminate.texaspoker.a.y.1 */
    class LeagueClubListAdapter implements OnClickListener {
        final /* synthetic */ LeagueClub f3471a;
        final /* synthetic */ LeagueClubListAdapter f3472b;

        /* renamed from: com.illuminate.texaspoker.a.y.1.1 */
        class LeagueClubListAdapter implements DialogInterface.OnClickListener {
            final /* synthetic */ LeagueClubListAdapter f3469a;

            LeagueClubListAdapter(LeagueClubListAdapter leagueClubListAdapter) {
                this.f3469a = leagueClubListAdapter;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: com.illuminate.texaspoker.a.y.1.2 */
        class LeagueClubListAdapter implements DialogInterface.OnClickListener {
            final /* synthetic */ LeagueClubListAdapter f3470a;

            LeagueClubListAdapter(LeagueClubListAdapter leagueClubListAdapter) {
                this.f3470a = leagueClubListAdapter;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ((LeagueInfoActivity) this.f3470a.f3472b.f3483a).b = new LoadingDialog(this.f3470a.f3472b.f3483a);
                ((LeagueInfoActivity) this.f3470a.f3472b.f3483a).b.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4085a(this.f3470a.f3471a.f5914b.longValue(), this.f3470a.f3472b.f3485c, this.f3470a.f3471a.f5915c.longValue(), LEAGUE_ACT.LEAGUE_REMOVE_INVITE);
            }
        }

        LeagueClubListAdapter(LeagueClubListAdapter leagueClubListAdapter, LeagueClub leagueClub) {
            this.f3472b = leagueClubListAdapter;
            this.f3471a = leagueClub;
        }

        public final void onClick(View view) {
            new Builder(this.f3472b.f3483a).setTitle(2131165514).setMessage(String.format(this.f3472b.f3483a.getResources().getString(2131165386), new Object[]{this.f3471a.f5916d})).setPositiveButton(2131165438, new LeagueClubListAdapter(this)).setNegativeButton(2131165432, new LeagueClubListAdapter(this)).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.y.2 */
    class LeagueClubListAdapter implements OnClickListener {
        final /* synthetic */ LeagueClub f3475a;
        final /* synthetic */ LeagueClubListAdapter f3476b;

        /* renamed from: com.illuminate.texaspoker.a.y.2.1 */
        class LeagueClubListAdapter implements DialogInterface.OnClickListener {
            final /* synthetic */ LeagueClubListAdapter f3473a;

            static {
                fixHelper.fixfunc(new int[]{1814, 1815});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native LeagueClubListAdapter(LeagueClubListAdapter leagueClubListAdapter);

            public final native void onClick(DialogInterface dialogInterface, int i);
        }

        /* renamed from: com.illuminate.texaspoker.a.y.2.2 */
        class LeagueClubListAdapter implements DialogInterface.OnClickListener {
            final /* synthetic */ LeagueClubListAdapter f3474a;

            static {
                fixHelper.fixfunc(new int[]{1537, 1538});
                if (VERSION.SDK_INT <= 0) {
                    Exists2.class.toString();
                }
            }

            native LeagueClubListAdapter(LeagueClubListAdapter leagueClubListAdapter);

            public final native void onClick(DialogInterface dialogInterface, int i);
        }

        LeagueClubListAdapter(LeagueClubListAdapter leagueClubListAdapter, LeagueClub leagueClub) {
            this.f3476b = leagueClubListAdapter;
            this.f3475a = leagueClub;
        }

        public final void onClick(View view) {
            new Builder(this.f3476b.f3483a).setTitle(2131165514).setMessage(String.format(this.f3476b.f3483a.getResources().getString(2131165384), new Object[]{this.f3475a.m3738a().f5906d})).setPositiveButton(2131165438, new LeagueClubListAdapter(this)).setNegativeButton(2131165432, new LeagueClubListAdapter(this)).show();
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.y.a */
    public final class LeagueClubListAdapter {
        public SimpleDraweeView f3477a;
        public TextView f3478b;
        public TextView f3479c;
        public TextView f3480d;
        public Button f3481e;
        final /* synthetic */ LeagueClubListAdapter f3482f;

        static {
            fixHelper.fixfunc(new int[]{2623, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native LeagueClubListAdapter(LeagueClubListAdapter leagueClubListAdapter);
    }

    public LeagueClubListAdapter(Context context, List<LeagueClub> list, long j) {
        this.f3483a = context;
        this.f3484b = list;
        this.f3485c = j;
    }

    public final int getCount() {
        return this.f3484b.size();
    }

    public final Object getItem(int i) {
        return this.f3484b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        LeagueClubListAdapter leagueClubListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3483a).inflate(2130968787, null);
            leagueClubListAdapter = new LeagueClubListAdapter(this);
            leagueClubListAdapter.f3477a = (SimpleDraweeView) view.findViewById(2131558674);
            leagueClubListAdapter.f3478b = (TextView) view.findViewById(2131558705);
            leagueClubListAdapter.f3479c = (TextView) view.findViewById(2131559247);
            leagueClubListAdapter.f3480d = (TextView) view.findViewById(2131559248);
            leagueClubListAdapter.f3481e = (Button) view.findViewById(2131559250);
            view.setTag(leagueClubListAdapter);
        } else {
            leagueClubListAdapter = (LeagueClubListAdapter) view.getTag();
        }
        LeagueClub leagueClub = (LeagueClub) this.f3484b.get(i);
        leagueClubListAdapter.f3477a.setImageURI(Uri.parse(leagueClub.f5921i));
        leagueClubListAdapter.f3478b.setText(leagueClub.f5916d);
        leagueClubListAdapter.f3479c.setText(leagueClub.f5917e);
        leagueClubListAdapter.f3480d.setText(leagueClub.f5918f + "/" + leagueClub.f5919g);
        if (this.f3485c == leagueClub.m3738a().f5905c.longValue()) {
            if (leagueClub.m3738a().f5905c.longValue() != leagueClub.f5915c.longValue()) {
                leagueClubListAdapter.f3481e.setText(2131165385);
                leagueClubListAdapter.f3481e.setOnClickListener(new LeagueClubListAdapter(this, leagueClub));
                leagueClubListAdapter.f3481e.setVisibility(0);
            }
            leagueClubListAdapter.f3481e.setVisibility(8);
        } else {
            if (this.f3485c == leagueClub.f5915c.longValue()) {
                leagueClubListAdapter.f3481e.setText(2131165383);
                leagueClubListAdapter.f3481e.setOnClickListener(new LeagueClubListAdapter(this, leagueClub));
                leagueClubListAdapter.f3481e.setVisibility(0);
            }
            leagueClubListAdapter.f3481e.setVisibility(8);
        }
        return view;
    }
}
