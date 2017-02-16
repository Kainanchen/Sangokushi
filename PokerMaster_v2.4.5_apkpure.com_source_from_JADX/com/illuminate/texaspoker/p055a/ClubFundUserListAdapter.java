package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.ClubFundUserActivity;
import com.illuminate.texaspoker.activity.FriendInfoActivity;
import com.illuminate.texaspoker.activity.SendFundActivity;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.i */
public final class ClubFundUserListAdapter extends BaseAdapter {
    public ChatRoom f3297a;
    private List<ChatUser> f3298b;
    private Context f3299c;

    /* renamed from: com.illuminate.texaspoker.a.i.1 */
    class ClubFundUserListAdapter implements OnClickListener {
        final /* synthetic */ ChatUser f3286a;
        final /* synthetic */ ClubFundUserListAdapter f3287b;

        ClubFundUserListAdapter(ClubFundUserListAdapter clubFundUserListAdapter, ChatUser chatUser) {
            this.f3287b = clubFundUserListAdapter;
            this.f3286a = chatUser;
        }

        public final void onClick(View view) {
            ClubFundUserListAdapter.m2712a(this.f3287b, this.f3286a.f5771f.longValue());
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.i.2 */
    class ClubFundUserListAdapter implements OnClickListener {
        final /* synthetic */ ChatUser f3288a;
        final /* synthetic */ ClubFundUserListAdapter f3289b;

        ClubFundUserListAdapter(ClubFundUserListAdapter clubFundUserListAdapter, ChatUser chatUser) {
            this.f3289b = clubFundUserListAdapter;
            this.f3288a = chatUser;
        }

        public final void onClick(View view) {
            ClubFundUserListAdapter.m2713a(this.f3289b, this.f3288a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.i.3 */
    class ClubFundUserListAdapter implements DialogInterface.OnClickListener {
        final /* synthetic */ ClubFundUserListAdapter f3290a;

        ClubFundUserListAdapter(ClubFundUserListAdapter clubFundUserListAdapter) {
            this.f3290a = clubFundUserListAdapter;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((ClubFundUserActivity) this.f3290a.f3299c).finish();
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.i.a */
    public final class ClubFundUserListAdapter {
        public SimpleDraweeView f3291a;
        public ImageView f3292b;
        public Button f3293c;
        public TextView f3294d;
        public ImageButton f3295e;
        final /* synthetic */ ClubFundUserListAdapter f3296f;

        public ClubFundUserListAdapter(ClubFundUserListAdapter clubFundUserListAdapter) {
            this.f3296f = clubFundUserListAdapter;
        }
    }

    public ClubFundUserListAdapter(Context context, List<ChatUser> list) {
        this.f3299c = context;
        this.f3298b = list;
    }

    public final int getCount() {
        return this.f3298b.size();
    }

    public final Object getItem(int i) {
        return this.f3298b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        ClubFundUserListAdapter clubFundUserListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3299c).inflate(2130968752, null);
            ClubFundUserListAdapter clubFundUserListAdapter2 = new ClubFundUserListAdapter(this);
            clubFundUserListAdapter2.f3291a = (SimpleDraweeView) view.findViewById(2131558674);
            clubFundUserListAdapter2.f3292b = (ImageView) view.findViewById(2131559137);
            clubFundUserListAdapter2.f3293c = (Button) view.findViewById(2131558619);
            clubFundUserListAdapter2.f3294d = (TextView) view.findViewById(2131558840);
            clubFundUserListAdapter2.f3295e = (ImageButton) view.findViewById(2131559138);
            view.setTag(clubFundUserListAdapter2);
            clubFundUserListAdapter = clubFundUserListAdapter2;
        } else {
            clubFundUserListAdapter = (ClubFundUserListAdapter) view.getTag();
        }
        ChatUser chatUser = (ChatUser) this.f3298b.get(i);
        FriendUser a = chatUser.m3728a();
        if (a.f5832k.intValue() == 1) {
            ((GenericDraweeHierarchy) clubFundUserListAdapter.f3291a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) clubFundUserListAdapter.f3291a.getHierarchy()).m1407a(2130903193);
        }
        clubFundUserListAdapter.f3291a.setImageURI(Uri.parse(a.f5836o));
        if (chatUser.f5767b == null || chatUser.f5767b.intValue() == 2) {
            clubFundUserListAdapter.f3292b.setVisibility(8);
        } else if (chatUser.f5767b.intValue() == 1) {
            clubFundUserListAdapter.f3292b.setVisibility(0);
            clubFundUserListAdapter.f3292b.setImageResource(2130903163);
        } else {
            clubFundUserListAdapter.f3292b.setImageResource(2130903162);
            clubFundUserListAdapter.f3292b.setVisibility(0);
        }
        clubFundUserListAdapter.f3294d.setText(a.f5838q);
        clubFundUserListAdapter.f3293c.setOnClickListener(new ClubFundUserListAdapter(this, chatUser));
        clubFundUserListAdapter.f3295e.setOnClickListener(new ClubFundUserListAdapter(this, chatUser));
        return view;
    }

    static /* synthetic */ void m2712a(ClubFundUserListAdapter clubFundUserListAdapter, long j) {
        if (j != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(clubFundUserListAdapter.f3299c, FriendInfoActivity.class);
            intent.putExtra("friendUuid", j);
            clubFundUserListAdapter.f3299c.startActivity(intent);
        }
    }

    static /* synthetic */ void m2713a(ClubFundUserListAdapter clubFundUserListAdapter, ChatUser chatUser) {
        if (clubFundUserListAdapter.f3297a.f5734U == null || !clubFundUserListAdapter.f3297a.f5734U.booleanValue()) {
            new Builder(clubFundUserListAdapter.f3299c).setTitle(2131165514).setMessage(2131165609).setPositiveButton(2131165438, new ClubFundUserListAdapter(clubFundUserListAdapter)).show();
            return;
        }
        Intent intent = new Intent(clubFundUserListAdapter.f3299c, SendFundActivity.class);
        intent.putExtra("lClubId", clubFundUserListAdapter.f3297a.f5741b);
        intent.putExtra("uuid", chatUser.f5771f);
        clubFundUserListAdapter.f3299c.startActivity(intent);
    }
}
