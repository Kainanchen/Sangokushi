package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.SendInviteActivity;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.SocialMsg;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerHttpUser.FRIEND_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPokerHttpUser.MSG_ACT;
import java.util.List;

/* compiled from: NewFriendListAdapter */
/* renamed from: com.illuminate.texaspoker.a.ag */
public final class ag extends BaseAdapter {
    public List f2861a;
    public LoadingDialog f2862b;
    private Context f2863c;

    /* renamed from: com.illuminate.texaspoker.a.ag.1 */
    class NewFriendListAdapter implements OnClickListener {
        final /* synthetic */ FriendUser f2850a;
        final /* synthetic */ ag f2851b;

        NewFriendListAdapter(ag agVar, FriendUser friendUser) {
            this.f2851b = agVar;
            this.f2850a = friendUser;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f2851b.f2863c, SendInviteActivity.class);
            intent.putExtra("uuid", this.f2850a.f5842u);
            this.f2851b.f2863c.startActivity(intent);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.ag.2 */
    class NewFriendListAdapter implements OnClickListener {
        final /* synthetic */ FriendUser f2852a;
        final /* synthetic */ ag f2853b;

        NewFriendListAdapter(ag agVar, FriendUser friendUser) {
            this.f2853b = agVar;
            this.f2852a = friendUser;
        }

        public final void onClick(View view) {
            this.f2853b.f2862b = new LoadingDialog(this.f2853b.f2863c);
            this.f2853b.f2862b.show();
            NetworkUtil.m4073a();
            NetworkUtil.m4093a(this.f2852a.f5842u.longValue(), MSG_ACT.ACT_ACCEPT_INVITE, LetterIndexBar.SEARCH_ICON_LETTER);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.ag.a */
    public final class NewFriendListAdapter {
        public View f2854a;
        public SimpleDraweeView f2855b;
        public TextView f2856c;
        public TextView f2857d;
        public ImageButton f2858e;
        public TextView f2859f;
        final /* synthetic */ ag f2860g;

        public NewFriendListAdapter(ag agVar) {
            this.f2860g = agVar;
        }
    }

    public ag(Context context) {
        this.f2863c = context;
    }

    public final int getCount() {
        return this.f2861a.size();
    }

    public final Object getItem(int i) {
        return this.f2861a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        NewFriendListAdapter newFriendListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2863c).inflate(2130968769, null);
            NewFriendListAdapter newFriendListAdapter2 = new NewFriendListAdapter(this);
            newFriendListAdapter2.f2854a = view.findViewById(2131559177);
            newFriendListAdapter2.f2855b = (SimpleDraweeView) view.findViewById(2131558674);
            newFriendListAdapter2.f2856c = (TextView) view.findViewById(2131558840);
            newFriendListAdapter2.f2857d = (TextView) view.findViewById(2131559178);
            newFriendListAdapter2.f2858e = (ImageButton) view.findViewById(2131559179);
            newFriendListAdapter2.f2859f = (TextView) view.findViewById(2131559166);
            view.setTag(newFriendListAdapter2);
            newFriendListAdapter = newFriendListAdapter2;
        } else {
            newFriendListAdapter = (NewFriendListAdapter) view.getTag();
        }
        Object[] objArr = (Object[]) this.f2861a.get(i);
        SocialMsg socialMsg = (SocialMsg) objArr[0];
        FriendUser a = socialMsg.m3748a();
        if (a.f5832k.intValue() == 1) {
            ((GenericDraweeHierarchy) newFriendListAdapter.f2855b.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) newFriendListAdapter.f2855b.getHierarchy()).m1407a(2130903193);
        }
        newFriendListAdapter.f2855b.setImageURI(Uri.parse(a.f5836o));
        newFriendListAdapter.f2856c.setText(a.f5838q);
        newFriendListAdapter.f2857d.setVisibility(0);
        if (socialMsg.f5993b.intValue() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_ACCEPT_FRIEND.getNumber()) {
            newFriendListAdapter.f2854a.setBackgroundColor(-9276814);
            newFriendListAdapter.f2858e.setVisibility(4);
            newFriendListAdapter.f2859f.setVisibility(0);
            if (StringUtils.m4462a(socialMsg.f5999h)) {
                newFriendListAdapter.f2857d.setText(this.f2863c.getResources().getString(2131165542));
            } else {
                newFriendListAdapter.f2857d.setText(socialMsg.f5999h);
            }
        } else if (socialMsg.f5993b.intValue() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_RECOMMAND_FRIEND.getNumber()) {
            newFriendListAdapter.f2854a.setBackgroundColor(-139361);
            newFriendListAdapter.f2858e.setImageResource(2130837678);
            newFriendListAdapter.f2858e.setVisibility(0);
            newFriendListAdapter.f2859f.setVisibility(4);
            newFriendListAdapter.f2858e.setOnClickListener(new NewFriendListAdapter(this, a));
            if (StringUtils.m4462a(socialMsg.f5999h)) {
                CharSequence charSequence = (String) objArr[1];
                if (StringUtils.m4462a(charSequence)) {
                    newFriendListAdapter.f2857d.setText(2131165536);
                } else {
                    newFriendListAdapter.f2857d.setText(this.f2863c.getResources().getString(2131165538) + ":" + charSequence);
                }
            }
        } else if (socialMsg.f5993b.intValue() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_INVITED.getNumber()) {
            newFriendListAdapter.f2854a.setBackgroundColor(-10955123);
            newFriendListAdapter.f2858e.setImageResource(2130837677);
            newFriendListAdapter.f2858e.setVisibility(0);
            newFriendListAdapter.f2859f.setVisibility(4);
            newFriendListAdapter.f2858e.setOnClickListener(new NewFriendListAdapter(this, a));
            if (StringUtils.m4462a(socialMsg.f5999h)) {
                newFriendListAdapter.f2857d.setText(this.f2863c.getResources().getString(2131165542));
            } else {
                newFriendListAdapter.f2857d.setText(socialMsg.f5999h);
            }
        }
        return view;
    }
}
