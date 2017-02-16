package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.BaseToolBarActivity;
import com.illuminate.texaspoker.activity.FriendInfoActivity;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ChatUser;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.texaspoker.moment.TexasPokerHttpClub.CLUB_USER_LEVEL;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.n */
public final class ClubUserListAdapter extends BaseAdapter {
    public ChatRoom f3355a;
    private List<ChatUser> f3356b;
    private Context f3357c;

    /* renamed from: com.illuminate.texaspoker.a.n.1 */
    class ClubUserListAdapter implements OnClickListener {
        final /* synthetic */ FriendUser f3344a;
        final /* synthetic */ ClubUserListAdapter f3345b;

        ClubUserListAdapter(ClubUserListAdapter clubUserListAdapter, FriendUser friendUser) {
            this.f3345b = clubUserListAdapter;
            this.f3344a = friendUser;
        }

        public final void onClick(View view) {
            ClubUserListAdapter.m2718a(this.f3345b, this.f3344a.f5842u.longValue());
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.n.2 */
    class ClubUserListAdapter implements OnClickListener {
        final /* synthetic */ ChatUser f3346a;
        final /* synthetic */ ClubUserListAdapter f3347b;

        ClubUserListAdapter(ClubUserListAdapter clubUserListAdapter, ChatUser chatUser) {
            this.f3347b = clubUserListAdapter;
            this.f3346a = chatUser;
        }

        public final void onClick(View view) {
            ClubUserListAdapter.m2719a(this.f3347b, this.f3346a);
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.n.a */
    public final class ClubUserListAdapter {
        public SimpleDraweeView f3348a;
        public ImageView f3349b;
        public Button f3350c;
        public TextView f3351d;
        public CheckBox f3352e;
        public TextView f3353f;
        final /* synthetic */ ClubUserListAdapter f3354g;

        public ClubUserListAdapter(ClubUserListAdapter clubUserListAdapter) {
            this.f3354g = clubUserListAdapter;
        }
    }

    public ClubUserListAdapter(Context context, List<ChatUser> list) {
        this.f3357c = context;
        this.f3356b = list;
    }

    public final int getCount() {
        return this.f3356b.size();
    }

    public final Object getItem(int i) {
        return this.f3356b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
        r9 = this;
        r8 = 8;
        r6 = 0;
        r5 = 1;
        if (r11 != 0) goto L_0x00e4;
    L_0x0006:
        r0 = r9.f3357c;
        r0 = android.view.LayoutInflater.from(r0);
        r1 = 2130968759; // 0x7f0400b7 float:1.754618E38 double:1.052838456E-314;
        r2 = 0;
        r11 = r0.inflate(r1, r2);
        r1 = new com.illuminate.texaspoker.a.n$a;
        r1.<init>(r9);
        r0 = 2131558674; // 0x7f0d0112 float:1.874267E38 double:1.053129913E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.facebook.drawee.view.SimpleDraweeView) r0;
        r1.f3348a = r0;
        r0 = 2131559137; // 0x7f0d02e1 float:1.874361E38 double:1.0531301417E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1.f3349b = r0;
        r0 = 2131558619; // 0x7f0d00db float:1.8742559E38 double:1.0531298857E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1.f3350c = r0;
        r0 = 2131558840; // 0x7f0d01b8 float:1.8743007E38 double:1.053129995E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1.f3351d = r0;
        r0 = 2131559154; // 0x7f0d02f2 float:1.8743644E38 double:1.05313015E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r1.f3352e = r0;
        r0 = 2131559153; // 0x7f0d02f1 float:1.8743642E38 double:1.0531301496E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1.f3353f = r0;
        r11.setTag(r1);
        r2 = r1;
    L_0x005f:
        r0 = r9.f3356b;
        r0 = r0.get(r10);
        r0 = (com.illuminate.texaspoker.p058c.ChatUser) r0;
        r3 = r0.m3728a();
        r1 = r3.f5832k;
        r1 = r1.intValue();
        if (r1 != r5) goto L_0x00ed;
    L_0x0073:
        r1 = r2.f3348a;
        r1 = r1.getHierarchy();
        r1 = (com.facebook.drawee.p031e.GenericDraweeHierarchy) r1;
        r4 = 2130903198; // 0x7f03009e float:1.7413207E38 double:1.0528060647E-314;
        r1.m1407a(r4);
    L_0x0081:
        r1 = r3.f5836o;
        r1 = android.net.Uri.parse(r1);
        r4 = r2.f3348a;
        r4.setImageURI(r1);
        r1 = r0.f5767b;
        if (r1 == 0) goto L_0x0099;
    L_0x0090:
        r1 = r0.f5767b;
        r1 = r1.intValue();
        r4 = 2;
        if (r1 != r4) goto L_0x00fc;
    L_0x0099:
        r1 = r2.f3349b;
        r1.setVisibility(r8);
        r1 = r2.f3352e;
        r1.setChecked(r6);
        r1 = r2.f3352e;
        r1.setEnabled(r5);
        r1 = r9.f3355a;
        r1 = r1.f5748i;
        r4 = r1.longValue();
        r6 = com.illuminate.texaspoker.utils.SharedPreferencesManager.m4308b();
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 == 0) goto L_0x00b8;
    L_0x00b8:
        r1 = r2.f3352e;
        r1.setVisibility(r8);
        r1 = r3.f5843v;
        if (r1 != 0) goto L_0x0155;
    L_0x00c1:
        r1 = "";
    L_0x00c3:
        r4 = r2.f3353f;
        r4.setText(r1);
        r1 = r2.f3351d;
        r4 = r3.f5838q;
        r1.setText(r4);
        r1 = r2.f3350c;
        r4 = new com.illuminate.texaspoker.a.n$1;
        r4.<init>(r9, r3);
        r1.setOnClickListener(r4);
        r1 = r2.f3352e;
        r2 = new com.illuminate.texaspoker.a.n$2;
        r2.<init>(r9, r0);
        r1.setOnClickListener(r2);
        return r11;
    L_0x00e4:
        r0 = r11.getTag();
        r0 = (com.illuminate.texaspoker.p055a.ClubUserListAdapter.ClubUserListAdapter) r0;
        r2 = r0;
        goto L_0x005f;
    L_0x00ed:
        r1 = r2.f3348a;
        r1 = r1.getHierarchy();
        r1 = (com.facebook.drawee.p031e.GenericDraweeHierarchy) r1;
        r4 = 2130903193; // 0x7f030099 float:1.7413197E38 double:1.0528060623E-314;
        r1.m1407a(r4);
        goto L_0x0081;
    L_0x00fc:
        r1 = r0.f5767b;
        r1 = r1.intValue();
        if (r1 != r5) goto L_0x012c;
    L_0x0104:
        r1 = r2.f3349b;
        r1.setVisibility(r6);
        r1 = r2.f3352e;
        r1.setChecked(r5);
        r1 = r2.f3352e;
        r1.setEnabled(r5);
        r1 = r2.f3349b;
        r4 = 2130903163; // 0x7f03007b float:1.7413136E38 double:1.0528060475E-314;
        r1.setImageResource(r4);
        r1 = r9.f3355a;
        r1 = r1.f5748i;
        r4 = r1.longValue();
        r6 = com.illuminate.texaspoker.utils.SharedPreferencesManager.m4308b();
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 == 0) goto L_0x00b8;
    L_0x012b:
        goto L_0x00b8;
    L_0x012c:
        r1 = r2.f3349b;
        r4 = 2130903162; // 0x7f03007a float:1.7413134E38 double:1.052806047E-314;
        r1.setImageResource(r4);
        r1 = r2.f3349b;
        r1.setVisibility(r6);
        r1 = r2.f3352e;
        r1.setChecked(r5);
        r1 = r2.f3352e;
        r1.setEnabled(r5);
        r1 = r2.f3352e;
        r4 = 4;
        r1.setVisibility(r4);
        r1 = r9.f3355a;
        r1 = r1.f5748i;
        r1.longValue();
        com.illuminate.texaspoker.utils.SharedPreferencesManager.m4308b();
        goto L_0x00b8;
    L_0x0155:
        r1 = r3.f5843v;
        r4 = r1.longValue();
        r1 = com.illuminate.texaspoker.utils.Utility.m4496e(r4);
        goto L_0x00c3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.illuminate.texaspoker.a.n.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    static /* synthetic */ void m2718a(ClubUserListAdapter clubUserListAdapter, long j) {
        if (j != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(clubUserListAdapter.f3357c, FriendInfoActivity.class);
            intent.putExtra("friendUuid", j);
            clubUserListAdapter.f3357c.startActivity(intent);
        }
    }

    static /* synthetic */ void m2719a(ClubUserListAdapter clubUserListAdapter, ChatUser chatUser) {
        ((BaseToolBarActivity) clubUserListAdapter.f3357c).f3524b = new LoadingDialog(clubUserListAdapter.f3357c);
        ((BaseToolBarActivity) clubUserListAdapter.f3357c).f3524b.show();
        if (chatUser.f5767b == null || chatUser.f5767b.intValue() == 2) {
            NetworkUtil.m4073a();
            NetworkUtil.m4088a(clubUserListAdapter.f3355a.f5741b.longValue(), chatUser.f5771f.longValue(), CLUB_USER_LEVEL.CLUB_USER_SENIOR);
        } else if (chatUser.f5767b.intValue() == 1) {
            NetworkUtil.m4073a();
            NetworkUtil.m4088a(clubUserListAdapter.f3355a.f5741b.longValue(), chatUser.f5771f.longValue(), CLUB_USER_LEVEL.CLUB_USER_IUNIOR);
        }
    }
}
