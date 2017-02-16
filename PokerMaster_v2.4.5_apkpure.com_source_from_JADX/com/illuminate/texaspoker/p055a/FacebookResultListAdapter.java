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

/* renamed from: com.illuminate.texaspoker.a.q */
public final class FacebookResultListAdapter extends BaseAdapter {
    private List<FriendshipChain> f3386a;
    private Context f3387b;

    /* renamed from: com.illuminate.texaspoker.a.q.1 */
    class FacebookResultListAdapter implements OnClickListener {
        final /* synthetic */ FriendshipChain f3375a;
        final /* synthetic */ FacebookResultListAdapter f3376b;

        FacebookResultListAdapter(FacebookResultListAdapter facebookResultListAdapter, FriendshipChain friendshipChain) {
            this.f3376b = facebookResultListAdapter;
            this.f3375a = friendshipChain;
        }

        public final void onClick(View view) {
            FacebookResultListAdapter.m2721a(this.f3376b, this.f3375a.f5859l.longValue());
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.q.2 */
    class FacebookResultListAdapter implements OnClickListener {
        final /* synthetic */ FriendshipChain f3377a;
        final /* synthetic */ FacebookResultListAdapter f3378b;

        FacebookResultListAdapter(FacebookResultListAdapter facebookResultListAdapter, FriendshipChain friendshipChain) {
            this.f3378b = facebookResultListAdapter;
            this.f3377a = friendshipChain;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f3378b.f3387b, SendInviteActivity.class);
            intent.putExtra("uuid", this.f3377a.f5859l);
            this.f3378b.f3387b.startActivity(intent);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.q.a */
    public final class FacebookResultListAdapter {
        public SimpleDraweeView f3379a;
        public ImageButton f3380b;
        public TextView f3381c;
        public TextView f3382d;
        public TextView f3383e;
        public Button f3384f;
        final /* synthetic */ FacebookResultListAdapter f3385g;

        public FacebookResultListAdapter(FacebookResultListAdapter facebookResultListAdapter) {
            this.f3385g = facebookResultListAdapter;
        }
    }

    public FacebookResultListAdapter(Context context, List<FriendshipChain> list) {
        this.f3387b = context;
        this.f3386a = list;
    }

    public final int getCount() {
        return this.f3386a.size();
    }

    public final Object getItem(int i) {
        return this.f3386a.get(i);
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
        FacebookResultListAdapter facebookResultListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3387b).inflate(2130968765, null);
            FacebookResultListAdapter facebookResultListAdapter2 = new FacebookResultListAdapter(this);
            facebookResultListAdapter2.f3379a = (SimpleDraweeView) view.findViewById(2131558674);
            facebookResultListAdapter2.f3380b = (ImageButton) view.findViewById(2131559163);
            facebookResultListAdapter2.f3381c = (TextView) view.findViewById(2131559164);
            facebookResultListAdapter2.f3382d = (TextView) view.findViewById(2131559165);
            facebookResultListAdapter2.f3383e = (TextView) view.findViewById(2131559166);
            facebookResultListAdapter2.f3384f = (Button) view.findViewById(2131559167);
            view.setTag(facebookResultListAdapter2);
            facebookResultListAdapter = facebookResultListAdapter2;
        } else {
            facebookResultListAdapter = (FacebookResultListAdapter) view.getTag();
        }
        FriendshipChain friendshipChain = (FriendshipChain) this.f3386a.get(i);
        if (friendshipChain.f5859l.longValue() != 0) {
            facebookResultListAdapter.f3381c.setText(friendshipChain.f5854g);
            facebookResultListAdapter.f3382d.setText(String.format(this.f3387b.getResources().getString(2131165557), new Object[]{friendshipChain.f5856i}));
            facebookResultListAdapter.f3382d.setVisibility(0);
            if (friendshipChain.f5858k.intValue() == 1) {
                ((GenericDraweeHierarchy) facebookResultListAdapter.f3379a.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) facebookResultListAdapter.f3379a.getHierarchy()).m1407a(2130903193);
            }
            facebookResultListAdapter.f3379a.setImageURI(Uri.parse(friendshipChain.f5857j));
            facebookResultListAdapter.f3380b.setVisibility(4);
            facebookResultListAdapter.f3380b.setOnClickListener(new FacebookResultListAdapter(this, friendshipChain));
        } else {
            facebookResultListAdapter.f3379a.setImageURI(Uri.parse("res://com.illuminate.texaspoker/2130903198"));
            facebookResultListAdapter.f3381c.setText(friendshipChain.f5854g);
            facebookResultListAdapter.f3382d.setVisibility(8);
            facebookResultListAdapter.f3380b.setVisibility(8);
        }
        if (friendshipChain.f5850c.intValue() == DBManager.f5546I) {
            facebookResultListAdapter.f3384f.setVisibility(0);
            facebookResultListAdapter.f3383e.setVisibility(8);
            facebookResultListAdapter.f3384f.setOnClickListener(new FacebookResultListAdapter(this, friendshipChain));
        } else if (friendshipChain.f5850c.intValue() == DBManager.f5544G) {
            facebookResultListAdapter.f3384f.setVisibility(8);
            facebookResultListAdapter.f3383e.setVisibility(0);
        }
        return view;
    }

    static /* synthetic */ void m2721a(FacebookResultListAdapter facebookResultListAdapter, long j) {
        if (j != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(facebookResultListAdapter.f3387b, FriendInfoActivity.class);
            intent.putExtra("friendUuid", j);
            facebookResultListAdapter.f3387b.startActivity(intent);
        }
    }
}
