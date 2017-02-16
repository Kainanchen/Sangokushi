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
import com.illuminate.texaspoker.activity.FriendInfoActivity;
import com.illuminate.texaspoker.activity.SendInviteActivity;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendshipChain;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import java.util.List;

/* compiled from: PhoneBookResultListAdapter */
/* renamed from: com.illuminate.texaspoker.a.ai */
public final class ai extends BaseAdapter {
    private List<FriendshipChain> f2888a;
    private Context f2889b;

    /* renamed from: com.illuminate.texaspoker.a.ai.1 */
    class PhoneBookResultListAdapter implements OnClickListener {
        final /* synthetic */ FriendshipChain f2874a;
        final /* synthetic */ ai f2875b;

        PhoneBookResultListAdapter(ai aiVar, FriendshipChain friendshipChain) {
            this.f2875b = aiVar;
            this.f2874a = friendshipChain;
        }

        public final void onClick(View view) {
            ai.m2673a(this.f2875b, this.f2874a.f5859l.longValue());
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.ai.2 */
    class PhoneBookResultListAdapter implements OnClickListener {
        final /* synthetic */ FriendshipChain f2876a;
        final /* synthetic */ ai f2877b;

        PhoneBookResultListAdapter(ai aiVar, FriendshipChain friendshipChain) {
            this.f2877b = aiVar;
            this.f2876a = friendshipChain;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f2877b.f2889b, SendInviteActivity.class);
            intent.putExtra("uuid", this.f2876a.f5859l);
            this.f2877b.f2889b.startActivity(intent);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.ai.3 */
    class PhoneBookResultListAdapter implements OnClickListener {
        final /* synthetic */ FriendshipChain f2878a;
        final /* synthetic */ ai f2879b;

        PhoneBookResultListAdapter(ai aiVar, FriendshipChain friendshipChain) {
            this.f2879b = aiVar;
            this.f2878a = friendshipChain;
        }

        public final void onClick(View view) {
            ai.m2674a(this.f2879b, this.f2878a.f5855h);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.ai.a */
    public final class PhoneBookResultListAdapter {
        public SimpleDraweeView f2880a;
        public ImageButton f2881b;
        public TextView f2882c;
        public TextView f2883d;
        public TextView f2884e;
        public Button f2885f;
        public Button f2886g;
        final /* synthetic */ ai f2887h;

        public PhoneBookResultListAdapter(ai aiVar) {
            this.f2887h = aiVar;
        }
    }

    public ai(Context context, List<FriendshipChain> list) {
        this.f2889b = context;
        this.f2888a = list;
    }

    public final int getCount() {
        return this.f2888a.size();
    }

    public final Object getItem(int i) {
        return this.f2888a.get(i);
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

    public final View getView(int i, View view, ViewGroup viewGroup) {
        PhoneBookResultListAdapter phoneBookResultListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2889b).inflate(2130968808, null);
            PhoneBookResultListAdapter phoneBookResultListAdapter2 = new PhoneBookResultListAdapter(this);
            phoneBookResultListAdapter2.f2880a = (SimpleDraweeView) view.findViewById(2131558674);
            phoneBookResultListAdapter2.f2881b = (ImageButton) view.findViewById(2131559163);
            phoneBookResultListAdapter2.f2882c = (TextView) view.findViewById(2131559326);
            phoneBookResultListAdapter2.f2883d = (TextView) view.findViewById(2131559165);
            phoneBookResultListAdapter2.f2884e = (TextView) view.findViewById(2131559166);
            phoneBookResultListAdapter2.f2885f = (Button) view.findViewById(2131559327);
            phoneBookResultListAdapter2.f2886g = (Button) view.findViewById(2131559167);
            view.setTag(phoneBookResultListAdapter2);
            phoneBookResultListAdapter = phoneBookResultListAdapter2;
        } else {
            phoneBookResultListAdapter = (PhoneBookResultListAdapter) view.getTag();
        }
        FriendshipChain friendshipChain = (FriendshipChain) this.f2888a.get(i);
        if (friendshipChain.f5859l.longValue() != 0) {
            phoneBookResultListAdapter.f2882c.setText(friendshipChain.f5854g);
            phoneBookResultListAdapter.f2883d.setText(String.format(this.f2889b.getResources().getString(2131165557), new Object[]{friendshipChain.f5856i}));
            phoneBookResultListAdapter.f2883d.setVisibility(0);
            if (friendshipChain.f5858k.intValue() == 1) {
                ((GenericDraweeHierarchy) phoneBookResultListAdapter.f2880a.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) phoneBookResultListAdapter.f2880a.getHierarchy()).m1407a(2130903193);
            }
            phoneBookResultListAdapter.f2880a.setImageURI(Uri.parse(friendshipChain.f5857j));
            phoneBookResultListAdapter.f2881b.setVisibility(4);
            phoneBookResultListAdapter.f2881b.setOnClickListener(new PhoneBookResultListAdapter(this, friendshipChain));
        } else {
            phoneBookResultListAdapter.f2880a.setImageURI(Uri.parse("res://com.illuminate.texaspoker/2130903198"));
            phoneBookResultListAdapter.f2882c.setText(friendshipChain.f5854g);
            phoneBookResultListAdapter.f2883d.setVisibility(8);
            phoneBookResultListAdapter.f2881b.setVisibility(8);
        }
        if (friendshipChain.f5850c.intValue() == DBManager.f5546I) {
            phoneBookResultListAdapter.f2886g.setVisibility(0);
            phoneBookResultListAdapter.f2885f.setVisibility(8);
            phoneBookResultListAdapter.f2884e.setVisibility(8);
            phoneBookResultListAdapter.f2886g.setOnClickListener(new PhoneBookResultListAdapter(this, friendshipChain));
        } else if (friendshipChain.f5850c.intValue() == DBManager.f5545H) {
            phoneBookResultListAdapter.f2886g.setVisibility(8);
            phoneBookResultListAdapter.f2885f.setVisibility(0);
            phoneBookResultListAdapter.f2884e.setVisibility(8);
            phoneBookResultListAdapter.f2885f.setOnClickListener(new PhoneBookResultListAdapter(this, friendshipChain));
        } else if (friendshipChain.f5850c.intValue() == DBManager.f5544G) {
            phoneBookResultListAdapter.f2886g.setVisibility(8);
            phoneBookResultListAdapter.f2885f.setVisibility(8);
            phoneBookResultListAdapter.f2884e.setVisibility(0);
        }
        return view;
    }

    static /* synthetic */ void m2673a(ai aiVar, long j) {
        if (j != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(aiVar.f2889b, FriendInfoActivity.class);
            intent.putExtra("friendUuid", j);
            aiVar.f2889b.startActivity(intent);
        }
    }

    static /* synthetic */ void m2674a(ai aiVar, String str) {
        String str2 = ((aiVar.f2889b.getResources().getString(2131165230) + " - " + aiVar.f2889b.getResources().getString(2131165504)) + aiVar.f2889b.getResources().getString(2131165494)) + " http://page.pokermate.net/download";
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", str2);
        aiVar.f2889b.startActivity(intent);
    }
}
