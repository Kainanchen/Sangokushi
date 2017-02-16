package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.SendInviteActivity;
import com.illuminate.texaspoker.utils.StringUtils;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerHttpUser.USER_FRIEND_STATE;
import com.texaspoker.moment.TexasPokerHttpUser.UserFriendInfoNet;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.s */
public final class FriendSearchResultListAdapter extends BaseAdapter {
    private List<UserFriendInfoNet> f3406a;
    private Context f3407b;

    /* renamed from: com.illuminate.texaspoker.a.s.1 */
    class FriendSearchResultListAdapter implements OnClickListener {
        final /* synthetic */ UserBaseInfoNet f3397a;
        final /* synthetic */ FriendSearchResultListAdapter f3398b;

        FriendSearchResultListAdapter(FriendSearchResultListAdapter friendSearchResultListAdapter, UserBaseInfoNet userBaseInfoNet) {
            this.f3398b = friendSearchResultListAdapter;
            this.f3397a = userBaseInfoNet;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f3398b.f3407b, SendInviteActivity.class);
            intent.putExtra("uuid", this.f3397a.getUuid());
            this.f3398b.f3407b.startActivity(intent);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.s.a */
    public final class FriendSearchResultListAdapter {
        public SimpleDraweeView f3399a;
        public ImageButton f3400b;
        public TextView f3401c;
        public TextView f3402d;
        public TextView f3403e;
        public Button f3404f;
        final /* synthetic */ FriendSearchResultListAdapter f3405g;

        public FriendSearchResultListAdapter(FriendSearchResultListAdapter friendSearchResultListAdapter) {
            this.f3405g = friendSearchResultListAdapter;
        }
    }

    public FriendSearchResultListAdapter(Context context, List<UserFriendInfoNet> list) {
        this.f3407b = context;
        this.f3406a = list;
    }

    public final int getCount() {
        return this.f3406a.size();
    }

    public final Object getItem(int i) {
        return this.f3406a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        FriendSearchResultListAdapter friendSearchResultListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3407b).inflate(2130968770, null);
            FriendSearchResultListAdapter friendSearchResultListAdapter2 = new FriendSearchResultListAdapter(this);
            friendSearchResultListAdapter2.f3399a = (SimpleDraweeView) view.findViewById(2131558674);
            friendSearchResultListAdapter2.f3400b = (ImageButton) view.findViewById(2131559163);
            friendSearchResultListAdapter2.f3401c = (TextView) view.findViewById(2131558840);
            friendSearchResultListAdapter2.f3402d = (TextView) view.findViewById(2131559180);
            friendSearchResultListAdapter2.f3403e = (TextView) view.findViewById(2131559166);
            friendSearchResultListAdapter2.f3404f = (Button) view.findViewById(2131559167);
            view.setTag(friendSearchResultListAdapter2);
            friendSearchResultListAdapter = friendSearchResultListAdapter2;
        } else {
            friendSearchResultListAdapter = (FriendSearchResultListAdapter) view.getTag();
        }
        UserFriendInfoNet userFriendInfoNet = (UserFriendInfoNet) this.f3406a.get(i);
        UserBaseInfoNet stUserBaseInfo = userFriendInfoNet.getStUserBaseInfo();
        if (stUserBaseInfo.getIGender() == 1) {
            ((GenericDraweeHierarchy) friendSearchResultListAdapter.f3399a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) friendSearchResultListAdapter.f3399a.getHierarchy()).m1407a(2130903193);
        }
        friendSearchResultListAdapter.f3399a.setImageURI(Uri.parse(stUserBaseInfo.getStrSmallCover()));
        friendSearchResultListAdapter.f3401c.setText(stUserBaseInfo.getStrNick());
        if (StringUtils.m4462a(stUserBaseInfo.getStrDesc())) {
            friendSearchResultListAdapter.f3402d.setVisibility(8);
        } else {
            friendSearchResultListAdapter.f3402d.setVisibility(0);
            friendSearchResultListAdapter.f3402d.setText(stUserBaseInfo.getStrDesc());
        }
        if (userFriendInfoNet.getEFriendState() == USER_FRIEND_STATE.USER_FRIEND_STATE_FRIEND) {
            friendSearchResultListAdapter.f3404f.setVisibility(4);
            friendSearchResultListAdapter.f3403e.setVisibility(0);
        } else {
            friendSearchResultListAdapter.f3404f.setVisibility(0);
            friendSearchResultListAdapter.f3403e.setVisibility(4);
            friendSearchResultListAdapter.f3404f.setOnClickListener(new FriendSearchResultListAdapter(this, stUserBaseInfo));
        }
        return view;
    }
}
