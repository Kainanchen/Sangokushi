package com.illuminate.texaspoker.p055a;

import a.does.not.Exists2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import com.ali.fixHelper;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.BaseToolBarActivity;
import com.illuminate.texaspoker.p058c.BuyInControlMsg;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p059d.BuyinMsgGameInfo;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPoker.BUYIN_CONTROL_TYPE;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.e */
public final class BuyInMsgExpandableListAdapter extends BaseExpandableListAdapter {
    private Context f3051a;
    private List<BuyinMsgGameInfo> f3052b;

    /* renamed from: com.illuminate.texaspoker.a.e.1 */
    class BuyInMsgExpandableListAdapter implements OnClickListener {
        final /* synthetic */ BuyInControlMsg f3035a;
        final /* synthetic */ BuyInMsgExpandableListAdapter f3036b;

        static {
            fixHelper.fixfunc(new int[]{1308, 1309});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native BuyInMsgExpandableListAdapter(BuyInMsgExpandableListAdapter buyInMsgExpandableListAdapter, BuyInControlMsg buyInControlMsg);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.a.e.2 */
    class BuyInMsgExpandableListAdapter implements OnClickListener {
        final /* synthetic */ BuyInControlMsg f3037a;
        final /* synthetic */ BuyInMsgExpandableListAdapter f3038b;

        static {
            fixHelper.fixfunc(new int[]{1220, 1221});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native BuyInMsgExpandableListAdapter(BuyInMsgExpandableListAdapter buyInMsgExpandableListAdapter, BuyInControlMsg buyInControlMsg);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.a.e.a */
    public final class BuyInMsgExpandableListAdapter {
        public SimpleDraweeView f3039a;
        public TextView f3040b;
        public TextView f3041c;
        public TextView f3042d;
        public ImageButton f3043e;
        public ImageButton f3044f;
        public TextView f3045g;
        final /* synthetic */ BuyInMsgExpandableListAdapter f3046h;

        public BuyInMsgExpandableListAdapter(BuyInMsgExpandableListAdapter buyInMsgExpandableListAdapter) {
            this.f3046h = buyInMsgExpandableListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.e.b */
    public final class BuyInMsgExpandableListAdapter {
        public TextView f3047a;
        public TextView f3048b;
        public TextView f3049c;
        final /* synthetic */ BuyInMsgExpandableListAdapter f3050d;

        public BuyInMsgExpandableListAdapter(BuyInMsgExpandableListAdapter buyInMsgExpandableListAdapter) {
            this.f3050d = buyInMsgExpandableListAdapter;
        }
    }

    public BuyInMsgExpandableListAdapter(Context context, List<BuyinMsgGameInfo> list) {
        this.f3051a = context;
        this.f3052b = list;
    }

    public final int getGroupCount() {
        return this.f3052b.size();
    }

    public final int getChildrenCount(int i) {
        return ((BuyinMsgGameInfo) this.f3052b.get(i)).f6023f.size();
    }

    public final Object getGroup(int i) {
        return this.f3052b.get(i);
    }

    public final Object getChild(int i, int i2) {
        return ((BuyinMsgGameInfo) this.f3052b.get(i)).f6023f.get(i2);
    }

    public final long getGroupId(int i) {
        return (long) i;
    }

    public final long getChildId(int i, int i2) {
        return (long) i2;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        BuyInMsgExpandableListAdapter buyInMsgExpandableListAdapter;
        CharSequence charSequence;
        CharSequence a;
        Drawable drawable;
        if (view == null) {
            view = LayoutInflater.from(this.f3051a).inflate(2130968731, null);
            buyInMsgExpandableListAdapter = new BuyInMsgExpandableListAdapter(this);
            buyInMsgExpandableListAdapter.f3047a = (TextView) view.findViewById(2131558842);
            buyInMsgExpandableListAdapter.f3048b = (TextView) view.findViewById(2131558844);
            buyInMsgExpandableListAdapter.f3049c = (TextView) view.findViewById(2131558843);
            view.setTag(buyInMsgExpandableListAdapter);
        } else {
            buyInMsgExpandableListAdapter = (BuyInMsgExpandableListAdapter) view.getTag();
        }
        BuyinMsgGameInfo buyinMsgGameInfo = (BuyinMsgGameInfo) this.f3052b.get(i);
        String str = buyinMsgGameInfo.f6021d;
        if (str == null) {
            str = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (buyinMsgGameInfo.f6022e == 1) {
            charSequence = str + " \u2022 ";
            a = StringUtils.m4461a(2131165566);
        } else if (buyinMsgGameInfo.f6022e == 2) {
            charSequence = str + " \u2022 ";
            a = StringUtils.m4461a(2131165565);
        } else {
            charSequence = str + " \u2022 ";
            a = StringUtils.m4461a(2131165567);
        }
        buyInMsgExpandableListAdapter.f3049c.setText(charSequence);
        buyInMsgExpandableListAdapter.f3048b.setText(a);
        buyInMsgExpandableListAdapter.f3047a.setText(buyinMsgGameInfo.f6019b);
        if (buyinMsgGameInfo.f6020c == 1 || buyinMsgGameInfo.f6020c == 3) {
            drawable = this.f3051a.getResources().getDrawable(2130903269);
        } else if (buyinMsgGameInfo.f6020c == 4) {
            drawable = this.f3051a.getResources().getDrawable(2130903281);
        } else if (buyinMsgGameInfo.f6020c == 5 || buyinMsgGameInfo.f6020c == 6) {
            drawable = this.f3051a.getResources().getDrawable(2130903271);
        } else {
            drawable = this.f3051a.getResources().getDrawable(2130903284);
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        buyInMsgExpandableListAdapter.f3047a.setCompoundDrawables(null, null, drawable, null);
        buyInMsgExpandableListAdapter.f3047a.setCompoundDrawablePadding(10);
        return view;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        BuyInMsgExpandableListAdapter buyInMsgExpandableListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3051a).inflate(2130968732, null);
            BuyInMsgExpandableListAdapter buyInMsgExpandableListAdapter2 = new BuyInMsgExpandableListAdapter(this);
            buyInMsgExpandableListAdapter2.f3039a = (SimpleDraweeView) view.findViewById(2131558674);
            buyInMsgExpandableListAdapter2.f3040b = (TextView) view.findViewById(2131558840);
            buyInMsgExpandableListAdapter2.f3041c = (TextView) view.findViewById(2131559077);
            buyInMsgExpandableListAdapter2.f3042d = (TextView) view.findViewById(2131559078);
            buyInMsgExpandableListAdapter2.f3043e = (ImageButton) view.findViewById(2131559079);
            buyInMsgExpandableListAdapter2.f3044f = (ImageButton) view.findViewById(2131559080);
            buyInMsgExpandableListAdapter2.f3045g = (TextView) view.findViewById(2131559081);
            view.setTag(buyInMsgExpandableListAdapter2);
            buyInMsgExpandableListAdapter = buyInMsgExpandableListAdapter2;
        } else {
            buyInMsgExpandableListAdapter = (BuyInMsgExpandableListAdapter) view.getTag();
        }
        BuyInControlMsg buyInControlMsg = (BuyInControlMsg) ((BuyinMsgGameInfo) this.f3052b.get(i)).f6023f.get(i2);
        FriendUser a = buyInControlMsg.m3716a();
        if (a.f5832k.intValue() == 1) {
            ((GenericDraweeHierarchy) buyInMsgExpandableListAdapter.f3039a.getHierarchy()).m1407a(2130903198);
        } else {
            ((GenericDraweeHierarchy) buyInMsgExpandableListAdapter.f3039a.getHierarchy()).m1407a(2130903193);
        }
        buyInMsgExpandableListAdapter.f3039a.setImageURI(Uri.parse(a.f5836o));
        buyInMsgExpandableListAdapter.f3040b.setText(a.f5838q);
        if (buyInControlMsg.m3720b().f5887k.intValue() == 2) {
            buyInMsgExpandableListAdapter.f3041c.setText(2131165563);
            buyInMsgExpandableListAdapter.f3042d.setVisibility(4);
        } else {
            buyInMsgExpandableListAdapter.f3041c.setText(2131165562);
            buyInMsgExpandableListAdapter.f3042d.setVisibility(0);
            buyInMsgExpandableListAdapter.f3042d.setText(buyInControlMsg.f5672e);
        }
        buyInMsgExpandableListAdapter.f3043e.setOnClickListener(new BuyInMsgExpandableListAdapter(this, buyInControlMsg));
        buyInMsgExpandableListAdapter.f3044f.setOnClickListener(new BuyInMsgExpandableListAdapter(this, buyInControlMsg));
        String str;
        if (buyInControlMsg.f5674g.intValue() == 2) {
            buyInMsgExpandableListAdapter.f3043e.setVisibility(8);
            buyInMsgExpandableListAdapter.f3044f.setVisibility(8);
            buyInMsgExpandableListAdapter.f3045g.setVisibility(0);
            if (buyInControlMsg.f5677j == null) {
                str = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                str = buyInControlMsg.f5677j;
            }
            buyInMsgExpandableListAdapter.f3045g.setText(String.format(this.f3051a.getResources().getString(2131165245), new Object[]{str}));
        } else if (buyInControlMsg.f5674g.intValue() == 3) {
            buyInMsgExpandableListAdapter.f3043e.setVisibility(8);
            buyInMsgExpandableListAdapter.f3044f.setVisibility(8);
            buyInMsgExpandableListAdapter.f3045g.setVisibility(0);
            if (buyInControlMsg.f5677j == null) {
                str = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                str = buyInControlMsg.f5677j;
            }
            buyInMsgExpandableListAdapter.f3045g.setText(String.format(this.f3051a.getResources().getString(2131165247), new Object[]{str}));
        } else if (buyInControlMsg.f5674g.intValue() == 1) {
            buyInMsgExpandableListAdapter.f3043e.setVisibility(0);
            buyInMsgExpandableListAdapter.f3044f.setVisibility(0);
            buyInMsgExpandableListAdapter.f3045g.setVisibility(8);
        }
        return view;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    static /* synthetic */ void m2685a(BuyInMsgExpandableListAdapter buyInMsgExpandableListAdapter, BuyInControlMsg buyInControlMsg) {
        ((BaseToolBarActivity) buyInMsgExpandableListAdapter.f3051a).f3524b = new LoadingDialog(buyInMsgExpandableListAdapter.f3051a);
        ((BaseToolBarActivity) buyInMsgExpandableListAdapter.f3051a).f3524b.show();
        NetworkUtil.m4073a();
        NetworkUtil.m4086a(buyInControlMsg.f5671d.longValue(), buyInControlMsg.f5670c.longValue(), BUYIN_CONTROL_TYPE.BUYIN_CONTROL_TYPE_ACCEPT);
    }

    static /* synthetic */ void m2686b(BuyInMsgExpandableListAdapter buyInMsgExpandableListAdapter, BuyInControlMsg buyInControlMsg) {
        ((BaseToolBarActivity) buyInMsgExpandableListAdapter.f3051a).f3524b = new LoadingDialog(buyInMsgExpandableListAdapter.f3051a);
        ((BaseToolBarActivity) buyInMsgExpandableListAdapter.f3051a).f3524b.show();
        NetworkUtil.m4073a();
        NetworkUtil.m4086a(buyInControlMsg.f5671d.longValue(), buyInControlMsg.f5670c.longValue(), BUYIN_CONTROL_TYPE.BUYIN_CONTROL_TYPE_DENY);
    }
}
