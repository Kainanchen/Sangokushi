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
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.FriendInfoActivity;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.UserBill;
import com.illuminate.texaspoker.p059d.ClubIncome;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: UserBillListAdapter */
/* renamed from: com.illuminate.texaspoker.a.at */
public final class at extends BaseAdapter {
    public int f2995a;
    public boolean f2996b;
    private List<Object> f2997c;
    private Context f2998d;
    private int f2999e;

    /* renamed from: com.illuminate.texaspoker.a.at.1 */
    class UserBillListAdapter implements OnClickListener {
        final /* synthetic */ FriendUser f2975a;
        final /* synthetic */ long f2976b;
        final /* synthetic */ at f2977c;

        UserBillListAdapter(at atVar, FriendUser friendUser, long j) {
            this.f2977c = atVar;
            this.f2975a = friendUser;
            this.f2976b = j;
        }

        public final void onClick(View view) {
            if (this.f2975a != null) {
                at.m2675a(this.f2977c, this.f2976b);
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.at.a */
    public final class UserBillListAdapter {
        public View f2978a;
        public View f2979b;
        public View f2980c;
        public TextView f2981d;
        public SimpleDraweeView f2982e;
        public Button f2983f;
        public TextView f2984g;
        public TextView f2985h;
        public TextView f2986i;
        public TextView f2987j;
        final /* synthetic */ at f2988k;

        public UserBillListAdapter(at atVar) {
            this.f2988k = atVar;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.at.b */
    public final class UserBillListAdapter {
        public TextView f2989a;
        public ImageView f2990b;
        final /* synthetic */ at f2991c;

        public UserBillListAdapter(at atVar) {
            this.f2991c = atVar;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.at.c */
    public final class UserBillListAdapter {
        public TextView f2992a;
        public TextView f2993b;
        final /* synthetic */ at f2994c;

        public UserBillListAdapter(at atVar) {
            this.f2994c = atVar;
        }
    }

    public at(Context context, List<Object> list, int i) {
        this.f2995a = 0;
        this.f2996b = false;
        this.f2998d = context;
        this.f2997c = list;
        this.f2999e = i;
    }

    public final int getCount() {
        return this.f2997c.size();
    }

    public final Object getItem(int i) {
        return this.f2997c.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final int getItemViewType(int i) {
        Object obj = this.f2997c.get(i);
        if ((obj instanceof UserBill) || (obj instanceof UserBillInfoNet)) {
            return 0;
        }
        if (obj instanceof ClubIncome) {
            return 2;
        }
        return 1;
    }

    public final boolean isEnabled(int i) {
        Object obj = this.f2997c.get(i);
        if ((obj instanceof UserBill) || (obj instanceof UserBillInfoNet) || (obj instanceof ClubIncome) || !this.f2996b || this.f2999e != 3) {
            return false;
        }
        return true;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        long longValue;
        CharSequence charSequence;
        switch (getItemViewType(i)) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                UserBillListAdapter userBillListAdapter;
                long longValue2;
                long longValue3;
                CharSequence charSequence2;
                FriendUser friendUser;
                String str;
                int i2;
                CharSequence charSequence3;
                if (view == null) {
                    view = LayoutInflater.from(this.f2998d).inflate(2130968836, null);
                    userBillListAdapter = new UserBillListAdapter(this);
                    userBillListAdapter.f2978a = view.findViewById(2131558847);
                    userBillListAdapter.f2979b = view.findViewById(2131559349);
                    userBillListAdapter.f2980c = view.findViewById(2131559420);
                    userBillListAdapter.f2981d = (TextView) view.findViewById(2131559388);
                    userBillListAdapter.f2982e = (SimpleDraweeView) view.findViewById(2131559242);
                    userBillListAdapter.f2983f = (Button) view.findViewById(2131559421);
                    userBillListAdapter.f2984g = (TextView) view.findViewById(2131559243);
                    userBillListAdapter.f2985h = (TextView) view.findViewById(2131559289);
                    userBillListAdapter.f2986i = (TextView) view.findViewById(2131559050);
                    userBillListAdapter.f2987j = (TextView) view.findViewById(2131559422);
                    view.setTag(userBillListAdapter);
                } else {
                    userBillListAdapter = (UserBillListAdapter) view.getTag();
                }
                Object obj = this.f2997c.get(i);
                if (obj instanceof UserBill) {
                    UserBill userBill = (UserBill) obj;
                    longValue2 = userBill.f6009f.longValue();
                    longValue3 = userBill.f6007d.longValue();
                    longValue = userBill.f6006c.longValue();
                    charSequence2 = userBill.f6015l;
                } else {
                    UserBillInfoNet userBillInfoNet = (UserBillInfoNet) obj;
                    longValue2 = userBillInfoNet.getUuid();
                    longValue3 = userBillInfoNet.getLTotalBuyStacks();
                    longValue = userBillInfoNet.getLRemainBuyStacks();
                    Object sClubName = userBillInfoNet.getSClubName();
                }
                if (DBManager.m3631a().m3632b()) {
                    friendUser = null;
                } else {
                    friendUser = DBManager.m3631a().f5563c.m3639a(longValue2);
                }
                if (friendUser != null) {
                    str = friendUser.f5836o;
                    int intValue = friendUser.f5832k.intValue();
                    i2 = intValue;
                    charSequence3 = friendUser.f5838q;
                } else {
                    str = LetterIndexBar.SEARCH_ICON_LETTER;
                    String str2 = LetterIndexBar.SEARCH_ICON_LETTER;
                    NetworkUtil.m4073a();
                    NetworkUtil.m4097a(longValue2, true);
                    String str3 = str2;
                    i2 = 1;
                    Object obj2 = str3;
                }
                if (longValue2 != SharedPreferencesManager.m4308b()) {
                    userBillListAdapter.f2980c.setBackgroundColor(-14145496);
                } else {
                    userBillListAdapter.f2980c.setBackgroundColor(-13553359);
                }
                if (this.f2999e == 3 || this.f2999e == 6) {
                    userBillListAdapter.f2981d.setText((i - this.f2995a));
                    if (i == 1) {
                        userBillListAdapter.f2978a.setVisibility(4);
                        userBillListAdapter.f2979b.setVisibility(0);
                    } else {
                        userBillListAdapter.f2978a.setVisibility(0);
                    }
                } else {
                    userBillListAdapter.f2981d.setText(((i + 1) - this.f2995a));
                    if (i == 0) {
                        userBillListAdapter.f2978a.setVisibility(4);
                        userBillListAdapter.f2979b.setVisibility(0);
                    } else {
                        userBillListAdapter.f2978a.setVisibility(0);
                        userBillListAdapter.f2979b.setVisibility(4);
                    }
                }
                if (this.f2999e == 2) {
                    userBillListAdapter.f2985h.setVisibility(8);
                } else {
                    userBillListAdapter.f2985h.setVisibility(0);
                }
                if (i2 == 1) {
                    ((GenericDraweeHierarchy) userBillListAdapter.f2982e.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) userBillListAdapter.f2982e.getHierarchy()).m1407a(2130903193);
                }
                userBillListAdapter.f2982e.setImageURI(Uri.parse(str));
                userBillListAdapter.f2983f.setOnClickListener(new UserBillListAdapter(this, friendUser, longValue2));
                userBillListAdapter.f2984g.setText(charSequence3);
                userBillListAdapter.f2985h.setText(String.format(this.f2998d.getResources().getString(2131165856), new Object[]{Utility.m4502g(longValue3)}));
                if (this.f2999e != 2) {
                    longValue -= longValue3;
                }
                if (longValue > 0) {
                    charSequence = "+" + Utility.m4502g(longValue);
                    userBillListAdapter.f2986i.setTextColor(-2543568);
                } else if (longValue < 0) {
                    charSequence = Utility.m4502g(longValue);
                    userBillListAdapter.f2986i.setTextColor(-14519546);
                } else {
                    charSequence = Utility.m4502g(longValue);
                    userBillListAdapter.f2986i.setTextColor(-9474450);
                }
                userBillListAdapter.f2986i.setText(charSequence);
                if (!this.f2996b) {
                    userBillListAdapter.f2987j.setVisibility(8);
                    break;
                }
                userBillListAdapter.f2987j.setVisibility(0);
                userBillListAdapter.f2987j.setText(charSequence2);
                break;
                break;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                UserBillListAdapter userBillListAdapter2;
                if (view == null) {
                    view = LayoutInflater.from(this.f2998d).inflate(2130968835, null);
                    userBillListAdapter2 = new UserBillListAdapter(this);
                    userBillListAdapter2.f2989a = (TextView) view.findViewById(2131559050);
                    userBillListAdapter2.f2990b = (ImageView) view.findViewById(2131559419);
                    view.setTag(userBillListAdapter2);
                } else {
                    userBillListAdapter2 = (UserBillListAdapter) view.getTag();
                }
                longValue = ((Long) this.f2997c.get(i)).longValue();
                if (longValue > 0) {
                    charSequence = "+" + Utility.m4502g(longValue);
                    userBillListAdapter2.f2989a.setTextColor(-2543568);
                } else if (longValue < 0) {
                    charSequence = Utility.m4502g(longValue);
                    userBillListAdapter2.f2989a.setTextColor(-14519546);
                } else {
                    charSequence = "\u2014\u2014";
                    userBillListAdapter2.f2989a.setTextColor(-9474450);
                }
                if (this.f2996b && this.f2999e == 3) {
                    userBillListAdapter2.f2990b.setVisibility(0);
                } else {
                    userBillListAdapter2.f2990b.setVisibility(8);
                }
                userBillListAdapter2.f2989a.setText(charSequence);
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                UserBillListAdapter userBillListAdapter3;
                if (view == null) {
                    view = LayoutInflater.from(this.f2998d).inflate(2130968834, null);
                    userBillListAdapter3 = new UserBillListAdapter(this);
                    userBillListAdapter3.f2992a = (TextView) view.findViewById(2131558613);
                    userBillListAdapter3.f2993b = (TextView) view.findViewById(2131559417);
                    view.setTag(userBillListAdapter3);
                } else {
                    userBillListAdapter3 = (UserBillListAdapter) view.getTag();
                }
                ClubIncome clubIncome = (ClubIncome) this.f2997c.get(i);
                userBillListAdapter3.f2992a.setText(clubIncome.f6029b);
                if (clubIncome.f6030c.longValue() > 0) {
                    charSequence = "+" + Utility.m4502g(clubIncome.f6030c.longValue());
                    userBillListAdapter3.f2993b.setTextColor(-2543568);
                } else if (clubIncome.f6030c.longValue() < 0) {
                    charSequence = Utility.m4502g(clubIncome.f6030c.longValue());
                    userBillListAdapter3.f2993b.setTextColor(-14519546);
                } else {
                    charSequence = Utility.m4502g(clubIncome.f6030c.longValue());
                    userBillListAdapter3.f2993b.setTextColor(-9474450);
                }
                userBillListAdapter3.f2993b.setText(charSequence);
                break;
        }
        return view;
    }

    static /* synthetic */ void m2675a(at atVar, long j) {
        if (j != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(atVar.f2998d, FriendInfoActivity.class);
            intent.putExtra("friendUuid", j);
            atVar.f2998d.startActivity(intent);
        }
    }
}
