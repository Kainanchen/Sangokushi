package com.illuminate.texaspoker.p055a;

import a.does.not.Exists2;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.BaseToolBarActivity;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.view.LoadingDialog;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.u */
public final class GroupMemberAdapter extends BaseAdapter {
    public boolean f3448a;
    public long f3449b;
    private Context f3450c;
    private long f3451d;
    private List f3452e;

    /* renamed from: com.illuminate.texaspoker.a.u.1 */
    class GroupMemberAdapter implements OnClickListener {
        final /* synthetic */ ChatUser f3441a;
        final /* synthetic */ GroupMemberAdapter f3442b;

        static {
            fixHelper.fixfunc(new int[]{1143, 1144});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native GroupMemberAdapter(GroupMemberAdapter groupMemberAdapter, ChatUser chatUser);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.a.u.a */
    public final class GroupMemberAdapter {
        public SimpleDraweeView f3443a;
        public ImageView f3444b;
        public ImageButton f3445c;
        public TextView f3446d;
        final /* synthetic */ GroupMemberAdapter f3447e;

        public GroupMemberAdapter(GroupMemberAdapter groupMemberAdapter) {
            this.f3447e = groupMemberAdapter;
        }
    }

    public GroupMemberAdapter(Context context, List list, long j) {
        this.f3450c = context;
        this.f3452e = list;
        this.f3451d = j;
        this.f3448a = false;
    }

    public final int getCount() {
        return this.f3452e.size();
    }

    public final Object getItem(int i) {
        return this.f3452e.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        GroupMemberAdapter groupMemberAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3450c).inflate(2130968779, null);
            GroupMemberAdapter groupMemberAdapter2 = new GroupMemberAdapter(this);
            groupMemberAdapter2.f3443a = (SimpleDraweeView) view.findViewById(2131559135);
            groupMemberAdapter2.f3444b = (ImageView) view.findViewById(2131559236);
            groupMemberAdapter2.f3445c = (ImageButton) view.findViewById(2131559237);
            groupMemberAdapter2.f3446d = (TextView) view.findViewById(2131559238);
            view.setTag(groupMemberAdapter2);
            groupMemberAdapter = groupMemberAdapter2;
        } else {
            groupMemberAdapter = (GroupMemberAdapter) view.getTag();
        }
        Object obj = this.f3452e.get(i);
        if (obj instanceof ChatUser) {
            ChatUser chatUser = (ChatUser) obj;
            FriendUser a = chatUser.m3728a();
            if (a.f5832k.intValue() == 1) {
                ((GenericDraweeHierarchy) groupMemberAdapter.f3443a.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) groupMemberAdapter.f3443a.getHierarchy()).m1407a(2130903193);
            }
            groupMemberAdapter.f3443a.setImageURI(Uri.parse(a.f5836o));
            groupMemberAdapter.f3443a.setVisibility(0);
            groupMemberAdapter.f3446d.setText(a.f5838q);
            groupMemberAdapter.f3446d.setVisibility(0);
            if (!this.f3448a) {
                groupMemberAdapter.f3445c.setVisibility(8);
            } else if (a.f5842u.longValue() != this.f3449b) {
                groupMemberAdapter.f3445c.setVisibility(0);
            }
            groupMemberAdapter.f3445c.setOnClickListener(new GroupMemberAdapter(this, chatUser));
            groupMemberAdapter.f3444b.setVisibility(8);
        } else if (obj instanceof String) {
            String str = (String) obj;
            groupMemberAdapter.f3443a.setVisibility(8);
            groupMemberAdapter.f3446d.setVisibility(4);
            groupMemberAdapter.f3445c.setVisibility(8);
            if (str.equalsIgnoreCase("add_btn")) {
                groupMemberAdapter.f3444b.setImageResource(2130837599);
            } else {
                groupMemberAdapter.f3444b.setImageResource(2130837600);
            }
            groupMemberAdapter.f3444b.setVisibility(0);
        }
        return view;
    }

    static /* synthetic */ void m2723a(GroupMemberAdapter groupMemberAdapter, ChatUser chatUser) {
        ((BaseToolBarActivity) groupMemberAdapter.f3450c).f3524b = new LoadingDialog(groupMemberAdapter.f3450c);
        ((BaseToolBarActivity) groupMemberAdapter.f3450c).f3524b.show();
        NetworkUtil.m4073a();
        NetworkUtil.m4100a(chatUser.m3728a(), groupMemberAdapter.f3451d);
    }
}
