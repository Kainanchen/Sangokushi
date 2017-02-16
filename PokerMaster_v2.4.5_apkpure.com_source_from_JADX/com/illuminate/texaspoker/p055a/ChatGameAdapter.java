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

/* renamed from: com.illuminate.texaspoker.a.f */
public final class ChatGameAdapter extends BaseAdapter {
    private Context f3065a;
    private List<GameRoom> f3066b;

    /* renamed from: com.illuminate.texaspoker.a.f.a */
    public final class ChatGameAdapter {
        public SimpleDraweeView f3053a;
        public TextView f3054b;
        public ImageView f3055c;
        public ImageView f3056d;
        public TextView f3057e;
        public TextView f3058f;
        public TextView f3059g;
        public TextView f3060h;
        public TextView f3061i;
        public TextView f3062j;
        public ImageView f3063k;
        final /* synthetic */ ChatGameAdapter f3064l;

        public ChatGameAdapter(ChatGameAdapter chatGameAdapter) {
            this.f3064l = chatGameAdapter;
        }
    }

    public ChatGameAdapter(Context context, List<GameRoom> list) {
        this.f3065a = context;
        this.f3066b = list;
    }

    public final int getCount() {
        return this.f3066b.size();
    }

    public final Object getItem(int i) {
        return this.f3066b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        ChatGameAdapter chatGameAdapter;
        CharSequence charSequence;
        Uri parse;
        if (view == null) {
            ChatGameAdapter chatGameAdapter2 = new ChatGameAdapter(this);
            view = LayoutInflater.from(this.f3065a).inflate(2130968763, null);
            chatGameAdapter2.f3053a = (SimpleDraweeView) view.findViewById(2131558674);
            chatGameAdapter2.f3055c = (ImageView) view.findViewById(2131559118);
            chatGameAdapter2.f3054b = (TextView) view.findViewById(2131558842);
            chatGameAdapter2.f3056d = (ImageView) view.findViewById(2131559119);
            chatGameAdapter2.f3057e = (TextView) view.findViewById(2131559121);
            chatGameAdapter2.f3058f = (TextView) view.findViewById(2131559122);
            chatGameAdapter2.f3059g = (TextView) view.findViewById(2131559123);
            chatGameAdapter2.f3060h = (TextView) view.findViewById(2131559124);
            chatGameAdapter2.f3061i = (TextView) view.findViewById(2131558843);
            chatGameAdapter2.f3062j = (TextView) view.findViewById(2131558844);
            chatGameAdapter2.f3063k = (ImageView) view.findViewById(2131559120);
            view.setTag(chatGameAdapter2);
            chatGameAdapter = chatGameAdapter2;
        } else {
            chatGameAdapter = (ChatGameAdapter) view.getTag();
        }
        GameRoom gameRoom = (GameRoom) this.f3066b.get(i);
        chatGameAdapter.f3054b.setText(gameRoom.f5864D);
        Drawable drawable;
        long longValue;
        if (gameRoom.f5887k.intValue() != 2) {
            if (gameRoom.f5887k.intValue() == 3 || gameRoom.f5887k.intValue() == 6) {
                chatGameAdapter.f3055c.setVisibility(0);
            } else {
                chatGameAdapter.f3055c.setVisibility(8);
            }
            if (gameRoom.f5881e == null || !gameRoom.f5881e.booleanValue()) {
                chatGameAdapter.f3056d.setImageResource(0);
            } else {
                chatGameAdapter.f3056d.setImageResource(2130903276);
            }
            drawable = ContextCompat.getDrawable(this.f3065a, 2130903263);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            chatGameAdapter.f3057e.setCompoundDrawables(drawable, null, null, null);
            charSequence = Utility.m4508i(gameRoom.f5898v.longValue()) + "/" + Utility.m4508i(gameRoom.f5894r.longValue());
            if (!(gameRoom.f5902z == null || gameRoom.f5902z.intValue() == 0)) {
                charSequence = charSequence + "(" + Utility.m4508i((long) gameRoom.f5902z.intValue()) + ")";
            }
            chatGameAdapter.f3057e.setText(charSequence);
            drawable = this.f3065a.getResources().getDrawable(2130903264);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            chatGameAdapter.f3058f.setCompoundDrawables(drawable, null, null, null);
            chatGameAdapter.f3058f.setText(gameRoom.f5892p + "/" + gameRoom.f5891o);
            drawable = this.f3065a.getResources().getDrawable(2130903266);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            chatGameAdapter.f3059g.setCompoundDrawables(drawable, null, null, null);
            StringBuilder stringBuilder = new StringBuilder();
            if (gameRoom.f5899w == null || gameRoom.f5899w.longValue() == 0) {
                longValue = gameRoom.f5896t.longValue() * 1000;
            } else {
                longValue = (gameRoom.f5899w.longValue() + (gameRoom.f5896t.longValue() * 1000)) - (System.currentTimeMillis() + RuntimeData.f6671b);
                if (longValue < 0) {
                    longValue = 0;
                }
            }
            chatGameAdapter.f3059g.setText(stringBuilder.append(Utility.m4471a(longValue / 1000)).append("/").append(Utility.m4471a(gameRoom.f5896t.longValue())).toString());
            chatGameAdapter.f3060h.setVisibility(8);
            if (gameRoom.f5887k.intValue() == 4) {
                chatGameAdapter.f3063k.setImageResource(2130903281);
            } else if (gameRoom.f5887k.intValue() == 5 || gameRoom.f5887k.intValue() == 6) {
                chatGameAdapter.f3063k.setImageResource(2130903271);
            } else {
                chatGameAdapter.f3063k.setImageResource(2130903269);
            }
        } else {
            chatGameAdapter.f3055c.setVisibility(8);
            if (gameRoom.f5880d == null || !gameRoom.f5880d.booleanValue()) {
                if (gameRoom.f5882f != null && gameRoom.f5882f.booleanValue()) {
                    chatGameAdapter.f3056d.setImageResource(2130903287);
                } else if (gameRoom.f5881e == null || !gameRoom.f5881e.booleanValue()) {
                    chatGameAdapter.f3056d.setImageResource(2130903274);
                } else {
                    chatGameAdapter.f3056d.setImageResource(2130903275);
                }
            } else if (gameRoom.f5881e.booleanValue()) {
                chatGameAdapter.f3056d.setImageResource(2130903276);
            } else {
                chatGameAdapter.f3056d.setImageResource(0);
            }
            drawable = this.f3065a.getResources().getDrawable(2130903264);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            chatGameAdapter.f3057e.setCompoundDrawables(drawable, null, null, null);
            chatGameAdapter.f3057e.setText(gameRoom.f5892p + "/" + gameRoom.f5891o);
            drawable = this.f3065a.getResources().getDrawable(2130903262);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            chatGameAdapter.f3058f.setCompoundDrawables(drawable, null, null, null);
            int intValue = gameRoom.f5890n.intValue() - 1;
            if (intValue < 0) {
                intValue = 0;
            }
            longValue = Utility.m4469a(intValue);
            chatGameAdapter.f3058f.setText(Utility.m4508i(longValue) + "+" + Utility.m4508i((long) (((double) longValue) * 0.1d)));
            Drawable drawable2 = this.f3065a.getResources().getDrawable(2130903263);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            chatGameAdapter.f3059g.setCompoundDrawables(drawable2, null, null, null);
            chatGameAdapter.f3059g.setText(Utility.m4508i(Utility.m4487c(intValue)));
            chatGameAdapter.f3060h.setVisibility(0);
            drawable2 = this.f3065a.getResources().getDrawable(2130903265);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            chatGameAdapter.f3060h.setCompoundDrawables(drawable2, null, null, null);
            longValue = (long) Utility.m4482b(intValue);
            chatGameAdapter.f3060h.setText(String.format(this.f3065a.getResources().getString(2131165682), new Object[]{Long.valueOf(longValue / 60)}));
            chatGameAdapter.f3063k.setImageResource(2130903284);
        }
        FriendUser a = gameRoom.m3736a();
        if (gameRoom.f5869I == null || gameRoom.f5869I.longValue() <= 0) {
            if (a == null || a.f5832k.intValue() != 1) {
                ((GenericDraweeHierarchy) chatGameAdapter.f3053a.getHierarchy()).m1407a(2130903193);
            } else {
                ((GenericDraweeHierarchy) chatGameAdapter.f3053a.getHierarchy()).m1407a(2130903198);
            }
            if (a != null) {
                parse = Uri.parse(a.f5836o);
            }
            parse = null;
        } else {
            ((GenericDraweeHierarchy) chatGameAdapter.f3053a.getHierarchy()).m1407a(2130903198);
            if (!StringUtils.m4462a(gameRoom.f5871K)) {
                parse = Uri.parse(gameRoom.f5871K);
            }
            parse = null;
        }
        chatGameAdapter.f3053a.setImageURI(parse);
        charSequence = gameRoom.f5861A;
        if (charSequence == null) {
            charSequence = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        if (gameRoom.f5886j != null) {
            CharSequence charSequence2;
            if (gameRoom.f5886j.intValue() == 1) {
                charSequence2 = a.f5838q;
            } else if (gameRoom.f5886j.intValue() != 2) {
                charSequence2 = a.f5838q;
                charSequence = StringUtils.m4461a(2131165567);
            } else if (gameRoom.f5869I == null || gameRoom.f5869I.longValue() <= 0) {
                charSequence2 = a.f5838q;
            } else {
                charSequence2 = gameRoom.f5872L;
            }
            chatGameAdapter.f3061i.setText(charSequence2);
            chatGameAdapter.f3062j.setText(charSequence);
        }
        chatGameAdapter.f3062j.setVisibility(8);
        return view;
    }
}
