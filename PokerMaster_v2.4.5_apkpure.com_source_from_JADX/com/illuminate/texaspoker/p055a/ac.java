package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.dao.GameRoomDao.Properties;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p057b.GameRoomDBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.FriendUser;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import java.util.List;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;

/* compiled from: MomentsListAdapter */
/* renamed from: com.illuminate.texaspoker.a.ac */
public final class ac extends BaseAdapter {
    public List<ChatRoom> f2820a;
    private Context f2821b;

    /* renamed from: com.illuminate.texaspoker.a.ac.a */
    public final class MomentsListAdapter {
        public SimpleDraweeView f2808a;
        public ImageView f2809b;
        public TextView f2810c;
        public ImageView f2811d;
        public ImageView f2812e;
        public TextView f2813f;
        public ImageView f2814g;
        public TextView f2815h;
        public TextView f2816i;
        public ImageView f2817j;
        TextView f2818k;
        final /* synthetic */ ac f2819l;

        public MomentsListAdapter(ac acVar) {
            this.f2819l = acVar;
        }
    }

    public ac(Context context) {
        this.f2821b = context;
    }

    public final int getCount() {
        return this.f2820a.size();
    }

    public final Object getItem(int i) {
        return this.f2820a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        MomentsListAdapter momentsListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f2821b).inflate(2130968794, null);
            MomentsListAdapter momentsListAdapter2 = new MomentsListAdapter(this);
            momentsListAdapter2.f2808a = (SimpleDraweeView) view.findViewById(2131558674);
            momentsListAdapter2.f2809b = (ImageView) view.findViewById(2131559262);
            momentsListAdapter2.f2810c = (TextView) view.findViewById(2131559263);
            momentsListAdapter2.f2811d = (ImageView) view.findViewById(2131559264);
            momentsListAdapter2.f2812e = (ImageView) view.findViewById(2131558612);
            momentsListAdapter2.f2814g = (ImageView) view.findViewById(2131559269);
            momentsListAdapter2.f2815h = (TextView) view.findViewById(2131558709);
            momentsListAdapter2.f2816i = (TextView) view.findViewById(2131559265);
            momentsListAdapter2.f2813f = (TextView) view.findViewById(2131559266);
            momentsListAdapter2.f2817j = (ImageView) view.findViewById(2131559267);
            momentsListAdapter2.f2818k = (TextView) view.findViewById(2131559268);
            view.setTag(momentsListAdapter2);
            momentsListAdapter = momentsListAdapter2;
        } else {
            momentsListAdapter = (MomentsListAdapter) view.getTag();
        }
        ChatRoom chatRoom = (ChatRoom) this.f2820a.get(i);
        long j = 0;
        if (!DBManager.m3631a().m3632b()) {
            j = DBManager.m3631a().f5566f.m3565a(chatRoom.f5741b.longValue(), chatRoom.f5724K.intValue());
        }
        if (j == 0) {
            momentsListAdapter.f2809b.setVisibility(4);
            momentsListAdapter.f2810c.setVisibility(4);
        } else {
            if (j > 99) {
                momentsListAdapter.f2810c.setText("\u22c5\u22c5\u22c5");
            } else {
                momentsListAdapter.f2810c.setText(String.valueOf(j));
            }
            momentsListAdapter.f2809b.setVisibility(0);
            momentsListAdapter.f2810c.setVisibility(0);
        }
        boolean booleanValue;
        GameRoomDBManager gameRoomDBManager;
        g a;
        long b;
        if (!chatRoom.f5718E.booleanValue()) {
            momentsListAdapter.f2815h.setCompoundDrawables(null, null, null, null);
            momentsListAdapter.f2811d.setVisibility(4);
            momentsListAdapter.f2817j.setVisibility(8);
            momentsListAdapter.f2813f.setVisibility(0);
            if (chatRoom.f5745f.longValue() != 0) {
                momentsListAdapter.f2813f.setText(Utility.m4492d(chatRoom.f5745f.longValue()));
            }
            if (chatRoom.f5724K.intValue() == 1) {
                FriendUser a2 = chatRoom.m3726a();
                if (a2.f5832k.intValue() == 1) {
                    ((GenericDraweeHierarchy) momentsListAdapter.f2808a.getHierarchy()).m1407a(2130903198);
                } else {
                    ((GenericDraweeHierarchy) momentsListAdapter.f2808a.getHierarchy()).m1407a(2130903193);
                }
                momentsListAdapter.f2808a.setImageURI(Uri.parse(a2.f5836o));
                momentsListAdapter.f2812e.setVisibility(4);
                momentsListAdapter.f2815h.setText(chatRoom.m3726a().f5838q);
                booleanValue = chatRoom.m3726a().f5823b.booleanValue();
            } else {
                if (!StringUtils.m4462a(chatRoom.f5755p)) {
                    momentsListAdapter.f2815h.setText(chatRoom.f5755p);
                } else if (StringUtils.m4462a(chatRoom.f5757r)) {
                    momentsListAdapter.f2815h.setText(StringUtils.m4461a(2131165268));
                } else {
                    momentsListAdapter.f2815h.setText(chatRoom.f5757r);
                }
                if (chatRoom.f5715B.booleanValue()) {
                    momentsListAdapter.f2812e.setVisibility(0);
                    ((GenericDraweeHierarchy) momentsListAdapter.f2808a.getHierarchy()).m1407a(2130903183);
                    momentsListAdapter.f2808a.setImageURI(Uri.parse(chatRoom.f5760u));
                } else {
                    ((GenericDraweeHierarchy) momentsListAdapter.f2808a.getHierarchy()).m1407a(2130903195);
                    momentsListAdapter.f2808a.setImageURI(Uri.parse(chatRoom.f5760u));
                    momentsListAdapter.f2812e.setVisibility(4);
                }
                booleanValue = chatRoom.f5719F.booleanValue();
            }
            momentsListAdapter.f2816i.setText(chatRoom.f5759t);
            if (booleanValue) {
                momentsListAdapter.f2814g.setVisibility(4);
            } else {
                momentsListAdapter.f2814g.setVisibility(0);
            }
            if (chatRoom.f5718E.booleanValue()) {
                momentsListAdapter.f2818k.setVisibility(4);
            } else {
                gameRoomDBManager = DBManager.m3631a().f5572l;
                j = chatRoom.f5741b.longValue();
                a = g.a(gameRoomDBManager.f5595a.f6435J);
                a.a(Properties.f6315x.a(Long.valueOf(j)), new i[0]);
                a.b(new f[]{Properties.f6308q});
                b = a.b();
                momentsListAdapter.f2818k.setText(String.format(this.f2821b.getResources().getString(2131165451), new Object[]{Long.valueOf(b)}));
                momentsListAdapter.f2818k.setVisibility(0);
            }
        } else if (!DBManager.m3631a().m3632b()) {
            GameRoom a3 = DBManager.m3631a().f5572l.m3656a(chatRoom.f5750k.longValue(), chatRoom.f5741b.longValue());
            FriendUser a4 = chatRoom.m3726a();
            if (a4 == null || a4.f5832k.intValue() == 1) {
                ((GenericDraweeHierarchy) momentsListAdapter.f2808a.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) momentsListAdapter.f2808a.getHierarchy()).m1407a(2130903193);
            }
            momentsListAdapter.f2808a.setImageURI(Uri.parse(a4.f5836o));
            if (!StringUtils.m4462a(chatRoom.f5755p)) {
                momentsListAdapter.f2815h.setText(chatRoom.f5755p);
            } else if (StringUtils.m4462a(chatRoom.f5757r)) {
                momentsListAdapter.f2815h.setText(StringUtils.m4461a(2131165268));
            } else {
                momentsListAdapter.f2815h.setText(chatRoom.f5757r);
            }
            momentsListAdapter.f2812e.setVisibility(4);
            momentsListAdapter.f2811d.setVisibility(0);
            momentsListAdapter.f2817j.setVisibility(0);
            momentsListAdapter.f2813f.setVisibility(8);
            if (chatRoom.f5722I.intValue() != 2) {
                if (chatRoom.f5722I.intValue() == 1 || chatRoom.f5722I.intValue() == 3) {
                    momentsListAdapter.f2811d.setImageResource(2130903520);
                } else if (chatRoom.f5722I.intValue() == 4) {
                    momentsListAdapter.f2811d.setImageResource(2130903282);
                } else if (chatRoom.f5722I.intValue() == 5 || chatRoom.f5722I.intValue() == 6) {
                    momentsListAdapter.f2811d.setImageResource(2130903272);
                }
                if (chatRoom.f5723J.intValue() == 2) {
                    if (a3 == null || a3.f5881e == null || !a3.f5881e.booleanValue()) {
                        momentsListAdapter.f2817j.setImageResource(0);
                    } else {
                        momentsListAdapter.f2817j.setImageResource(2130903108);
                    }
                } else if (chatRoom.f5723J.intValue() == 3) {
                    momentsListAdapter.f2817j.setImageResource(2130903106);
                } else if (chatRoom.f5723J.intValue() == 1) {
                    momentsListAdapter.f2817j.setImageResource(2130903107);
                }
                if (chatRoom.f5722I.intValue() == 3 || chatRoom.f5722I.intValue() == 6) {
                    Drawable drawable = this.f2821b.getResources().getDrawable(2130903383);
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    momentsListAdapter.f2815h.setCompoundDrawables(null, null, drawable, null);
                } else {
                    momentsListAdapter.f2815h.setCompoundDrawables(null, null, null, null);
                }
            } else {
                momentsListAdapter.f2815h.setCompoundDrawables(null, null, null, null);
                momentsListAdapter.f2811d.setImageResource(2130903285);
                if (a3 == null) {
                    momentsListAdapter.f2817j.setImageResource(2130903117);
                } else if (a3.f5880d.booleanValue()) {
                    if (chatRoom.f5723J.intValue() == 2) {
                        momentsListAdapter.f2817j.setImageResource(2130903108);
                    } else if (chatRoom.f5723J.intValue() == 3) {
                        momentsListAdapter.f2817j.setImageResource(2130903106);
                    }
                } else if (a3.f5882f.booleanValue()) {
                    momentsListAdapter.f2817j.setImageResource(2130903126);
                } else if (a3.f5881e.booleanValue()) {
                    momentsListAdapter.f2817j.setImageResource(2130903119);
                } else {
                    momentsListAdapter.f2817j.setImageResource(2130903117);
                }
            }
            booleanValue = chatRoom.f5719F.booleanValue();
            momentsListAdapter.f2816i.setText(chatRoom.f5759t);
            if (booleanValue) {
                momentsListAdapter.f2814g.setVisibility(4);
            } else {
                momentsListAdapter.f2814g.setVisibility(0);
            }
            if (chatRoom.f5718E.booleanValue()) {
                momentsListAdapter.f2818k.setVisibility(4);
            } else {
                gameRoomDBManager = DBManager.m3631a().f5572l;
                j = chatRoom.f5741b.longValue();
                a = g.a(gameRoomDBManager.f5595a.f6435J);
                a.a(Properties.f6315x.a(Long.valueOf(j)), new i[0]);
                a.b(new f[]{Properties.f6308q});
                b = a.b();
                momentsListAdapter.f2818k.setText(String.format(this.f2821b.getResources().getString(2131165451), new Object[]{Long.valueOf(b)}));
                momentsListAdapter.f2818k.setVisibility(0);
            }
        }
        return view;
    }
}
