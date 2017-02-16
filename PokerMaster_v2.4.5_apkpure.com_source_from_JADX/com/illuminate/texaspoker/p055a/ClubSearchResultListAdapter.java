package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.utils.Utility;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.m */
public final class ClubSearchResultListAdapter extends BaseAdapter {
    private List<ClubBaseInfo> f3342a;
    private Context f3343b;

    /* renamed from: com.illuminate.texaspoker.a.m.a */
    public final class ClubSearchResultListAdapter {
        public SimpleDraweeView f3335a;
        public TextView f3336b;
        public TextView f3337c;
        public TextView f3338d;
        public TextView f3339e;
        public ImageButton f3340f;
        final /* synthetic */ ClubSearchResultListAdapter f3341g;

        public ClubSearchResultListAdapter(ClubSearchResultListAdapter clubSearchResultListAdapter) {
            this.f3341g = clubSearchResultListAdapter;
        }
    }

    public ClubSearchResultListAdapter(Context context, List<ClubBaseInfo> list) {
        this.f3343b = context;
        this.f3342a = list;
    }

    public final int getCount() {
        return this.f3342a.size();
    }

    public final Object getItem(int i) {
        return this.f3342a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        ClubSearchResultListAdapter clubSearchResultListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3343b).inflate(2130968796, null);
            clubSearchResultListAdapter = new ClubSearchResultListAdapter(this);
            clubSearchResultListAdapter.f3335a = (SimpleDraweeView) view.findViewById(2131558674);
            clubSearchResultListAdapter.f3336b = (TextView) view.findViewById(2131558613);
            clubSearchResultListAdapter.f3337c = (TextView) view.findViewById(2131558615);
            clubSearchResultListAdapter.f3338d = (TextView) view.findViewById(2131558616);
            clubSearchResultListAdapter.f3339e = (TextView) view.findViewById(2131559275);
            clubSearchResultListAdapter.f3340f = (ImageButton) view.findViewById(2131558631);
            view.setTag(clubSearchResultListAdapter);
        } else {
            clubSearchResultListAdapter = (ClubSearchResultListAdapter) view.getTag();
        }
        ClubBaseInfo clubBaseInfo = (ClubBaseInfo) this.f3342a.get(i);
        clubSearchResultListAdapter.f3335a.setImageURI(Uri.parse(clubBaseInfo.getSSmallIcon()));
        clubSearchResultListAdapter.f3336b.setText(clubBaseInfo.getSClubName());
        clubSearchResultListAdapter.f3337c.setText(clubBaseInfo.getICurMembers() + "/" + clubBaseInfo.getIMaxMembers());
        clubSearchResultListAdapter.f3338d.setText(Utility.m4506h(clubBaseInfo.getSClubLocation()));
        clubSearchResultListAdapter.f3339e.setText(clubBaseInfo.getSDesc());
        clubSearchResultListAdapter.f3340f.setVisibility(8);
        return view;
    }
}
