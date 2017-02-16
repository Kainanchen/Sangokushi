package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.o */
public final class DiscoveryAdapter extends BaseAdapter {
    private Context f3370a;
    private List<GameRoom> f3371b;

    /* renamed from: com.illuminate.texaspoker.a.o.a */
    public final class DiscoveryAdapter {
        public SimpleDraweeView f3358a;
        public TextView f3359b;
        public ImageView f3360c;
        public ImageView f3361d;
        public TextView f3362e;
        public TextView f3363f;
        public TextView f3364g;
        public TextView f3365h;
        public TextView f3366i;
        public TextView f3367j;
        public ImageView f3368k;
        final /* synthetic */ DiscoveryAdapter f3369l;

        public DiscoveryAdapter(DiscoveryAdapter discoveryAdapter) {
            this.f3369l = discoveryAdapter;
        }
    }

    public DiscoveryAdapter(Context context, List<GameRoom> list) {
        this.f3370a = context;
        this.f3371b = list;
    }

    public final int getCount() {
        return this.f3371b.size();
    }

    public final Object getItem(int i) {
        return this.f3371b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        DiscoveryAdapter discoveryAdapter;
        CharSequence charSequence;
        Uri parse;
        if (view == null) {
            DiscoveryAdapter discoveryAdapter2 = new DiscoveryAdapter(this);
            view = LayoutInflater.from(this.f3370a).inflate(2130968763, null);
            discoveryAdapter2.f3358a = (SimpleDraweeView) view.findViewById(2131558674);
            discoveryAdapter2.f3360c = (ImageView) view.findViewById(2131559118);
            discoveryAdapter2.f3359b = (TextView) view.findViewById(2131558842);
            discoveryAdapter2.f3361d = (ImageView) view.findViewById(2131559119);
            discoveryAdapter2.f3362e = (TextView) view.findViewById(2131559121);
            discoveryAdapter2.f3363f = (TextView) view.findViewById(2131559122);
            discoveryAdapter2.f3364g = (TextView) view.findViewById(2131559123);
            discoveryAdapter2.f3365h = (TextView) view.findViewById(2131559124);
            discoveryAdapter2.f3366i = (TextView) view.findViewById(2131558843);
            discoveryAdapter2.f3367j = (TextView) view.findViewById(2131558844);
            discoveryAdapter2.f3368k = (ImageView) view.findViewById(2131559120);
            view.setTag(discoveryAdapter2);
            discoveryAdapter = discoveryAdapter2;
        } else {
            discoveryAdapter = (DiscoveryAdapter) view.getTag();
        }
        GameRoom gameRoom = (GameRoom) this.f3371b.get(i);
        discoveryAdapter.f3359b.setText(gameRoom.f5864D);
        Drawable drawable;
        long longValue;
        if (gameRoom.f5887k.intValue() != 2) {
            if (gameRoom.f5887k.intValue() == 3 || gameRoom.f5887k.intValue() == 6) {
                discoveryAdapter.f3360c.setVisibility(0);
            } else {
                discoveryAdapter.f3360c.setVisibility(8);
            }
            if (gameRoom.f5881e == null || !gameRoom.f5881e.booleanValue()) {
                discoveryAdapter.f3361d.setImageResource(0);
            } else {
                discoveryAdapter.f3361d.setImageResource(2130903276);
            }
            drawable = ContextCompat.getDrawable(this.f3370a, 2130903263);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            discoveryAdapter.f3362e.setCompoundDrawables(drawable, null, null, null);
            charSequence = Utility.m4508i(gameRoom.f5898v.longValue()) + "/" + Utility.m4508i(gameRoom.f5894r.longValue());
            if (!(gameRoom.f5902z == null || gameRoom.f5902z.intValue() == 0)) {
                charSequence = charSequence + "(" + Utility.m4508i((long) gameRoom.f5902z.intValue()) + ")";
            }
            discoveryAdapter.f3362e.setText(charSequence);
            drawable = this.f3370a.getResources().getDrawable(2130903264);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            discoveryAdapter.f3363f.setCompoundDrawables(drawable, null, null, null);
            discoveryAdapter.f3363f.setText(gameRoom.f5892p + "/" + gameRoom.f5891o);
            drawable = this.f3370a.getResources().getDrawable(2130903266);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            discoveryAdapter.f3364g.setCompoundDrawables(drawable, null, null, null);
            StringBuilder stringBuilder = new StringBuilder();
            if (gameRoom.f5899w == null || gameRoom.f5899w.longValue() == 0) {
                longValue = gameRoom.f5896t.longValue() * 1000;
            } else {
                longValue = (gameRoom.f5899w.longValue() + (gameRoom.f5896t.longValue() * 1000)) - (System.currentTimeMillis() + RuntimeData.f6671b);
                if (longValue < 0) {
                    longValue = 0;
                }
            }
            discoveryAdapter.f3364g.setText(stringBuilder.append(Utility.m4471a(longValue / 1000)).append("/").append(Utility.m4471a(gameRoom.f5896t.longValue())).toString());
            discoveryAdapter.f3365h.setVisibility(8);
            if (gameRoom.f5887k.intValue() == 4) {
                discoveryAdapter.f3368k.setImageResource(2130903281);
            } else if (gameRoom.f5887k.intValue() == 5 || gameRoom.f5887k.intValue() == 6) {
                discoveryAdapter.f3368k.setImageResource(2130903271);
            } else {
                discoveryAdapter.f3368k.setImageResource(2130903269);
            }
        } else {
            discoveryAdapter.f3360c.setVisibility(8);
            if (gameRoom.f5880d == null || !gameRoom.f5880d.booleanValue()) {
                if (gameRoom.f5882f != null && gameRoom.f5882f.booleanValue()) {
                    discoveryAdapter.f3361d.setImageResource(2130903287);
                } else if (gameRoom.f5881e == null || !gameRoom.f5881e.booleanValue()) {
                    discoveryAdapter.f3361d.setImageResource(2130903274);
                } else {
                    discoveryAdapter.f3361d.setImageResource(2130903275);
                }
            } else if (gameRoom.f5881e.booleanValue()) {
                discoveryAdapter.f3361d.setImageResource(2130903276);
            } else {
                discoveryAdapter.f3361d.setImageResource(0);
            }
            drawable = this.f3370a.getResources().getDrawable(2130903264);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            discoveryAdapter.f3362e.setCompoundDrawables(drawable, null, null, null);
            discoveryAdapter.f3362e.setText(gameRoom.f5892p + "/" + gameRoom.f5891o);
            drawable = this.f3370a.getResources().getDrawable(2130903262);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            discoveryAdapter.f3363f.setCompoundDrawables(drawable, null, null, null);
            int intValue = gameRoom.f5890n.intValue() - 1;
            if (intValue < 0) {
                intValue = 0;
            }
            longValue = Utility.m4469a(intValue);
            discoveryAdapter.f3363f.setText(Utility.m4508i(longValue) + "+" + Utility.m4508i((long) (((double) longValue) * 0.1d)));
            Drawable drawable2 = this.f3370a.getResources().getDrawable(2130903263);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            discoveryAdapter.f3364g.setCompoundDrawables(drawable2, null, null, null);
            discoveryAdapter.f3364g.setText(Utility.m4508i(Utility.m4487c(intValue)));
            discoveryAdapter.f3365h.setVisibility(0);
            drawable2 = this.f3370a.getResources().getDrawable(2130903265);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            discoveryAdapter.f3365h.setCompoundDrawables(drawable2, null, null, null);
            longValue = (long) Utility.m4482b(intValue);
            discoveryAdapter.f3365h.setText(String.format(this.f3370a.getResources().getString(2131165682), new Object[]{Long.valueOf(longValue / 60)}));
            discoveryAdapter.f3368k.setImageResource(2130903284);
        }
        FriendUser a = gameRoom.m3736a();
        if (gameRoom.f5869I == null || gameRoom.f5869I.longValue() <= 0) {
            if (a == null || a.f5832k.intValue() != 1) {
                ((GenericDraweeHierarchy) discoveryAdapter.f3358a.getHierarchy()).m1407a(2130903193);
            } else {
                ((GenericDraweeHierarchy) discoveryAdapter.f3358a.getHierarchy()).m1407a(2130903198);
            }
            if (a != null) {
                parse = Uri.parse(a.f5836o);
            }
            parse = null;
        } else {
            ((GenericDraweeHierarchy) discoveryAdapter.f3358a.getHierarchy()).m1407a(2130903198);
            if (!StringUtils.m4462a(gameRoom.f5871K)) {
                parse = Uri.parse(gameRoom.f5871K);
            }
            parse = null;
        }
        discoveryAdapter.f3358a.setImageURI(parse);
        charSequence = gameRoom.f5861A;
        if (charSequence == null) {
            charSequence = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (gameRoom.f5886j != null) {
            CharSequence charSequence2;
            if (gameRoom.f5886j.intValue() == 1) {
                charSequence2 = a.f5838q + " \u2022 ";
            } else if (gameRoom.f5886j.intValue() != 2) {
                charSequence2 = a.f5838q + " \u2022 ";
                charSequence = StringUtils.m4461a(2131165567);
            } else if (gameRoom.f5869I == null || gameRoom.f5869I.longValue() <= 0) {
                charSequence2 = a.f5838q + " \u2022 ";
            } else {
                charSequence2 = gameRoom.f5872L + " \u2022 ";
            }
            discoveryAdapter.f3366i.setText(charSequence2);
            discoveryAdapter.f3367j.setText(charSequence);
        }
        return view;
    }
}
