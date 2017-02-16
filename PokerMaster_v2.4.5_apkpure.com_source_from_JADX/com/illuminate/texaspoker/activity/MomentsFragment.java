package com.illuminate.texaspoker.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.dao.BuyInControlMsgDao;
import com.illuminate.texaspoker.dao.ChatMsgDao;
import com.illuminate.texaspoker.dao.ChatRoomDao.Properties;
import com.illuminate.texaspoker.dao.MessageMsgDao;
import com.illuminate.texaspoker.p055a.ac;
import com.illuminate.texaspoker.p057b.ChatMsgDBManager;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.BuyInControlMsg;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.GameRoom;
import com.illuminate.texaspoker.p058c.MessageMsg;
import com.illuminate.texaspoker.utils.NetworkUtil;
import com.illuminate.texaspoker.utils.RuntimeData;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.LoadingDialog;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;
import org.a.a.d.g;
import org.a.a.d.i;
import org.a.a.f;
import org.cocos2dx.lua.AppActivity;

/* renamed from: com.illuminate.texaspoker.activity.g */
public final class MomentsFragment extends BaseFragment {
    private List<ChatRoom> f5428c;
    private View f5429d;
    private LoadingDialog f5430e;
    private View f5431f;
    private ImageView f5432g;
    private TextView f5433h;
    private ImageView f5434i;
    private TextView f5435j;
    private TextView f5436k;
    private TextView f5437l;
    private View f5438m;
    private ImageView f5439n;
    private TextView f5440o;
    private TextView f5441p;
    private TextView f5442q;
    private ac f5443r;
    private ListView f5444s;
    private long f5445t;

    /* renamed from: com.illuminate.texaspoker.activity.g.1 */
    class MomentsFragment implements OnClickListener {
        final /* synthetic */ ChatRoom f5422a;
        final /* synthetic */ MomentsFragment f5423b;

        MomentsFragment(MomentsFragment momentsFragment, ChatRoom chatRoom) {
            this.f5423b = momentsFragment;
            this.f5422a = chatRoom;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                DBManager.m3631a().f5566f.m3574a(this.f5422a.f5741b.longValue(), this.f5422a.f5724K.intValue(), true);
                ((MainActivity) this.f5423b.getActivity()).m3211c();
                this.f5423b.m3511b();
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.g.2 */
    class MomentsFragment implements OnItemClickListener {
        final /* synthetic */ MomentsFragment f5424a;

        MomentsFragment(MomentsFragment momentsFragment) {
            this.f5424a = momentsFragment;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f5424a.f5445t > 1000) {
                this.f5424a.f5445t = currentTimeMillis;
                MomentsFragment momentsFragment;
                if (i == 0) {
                    momentsFragment = this.f5424a;
                    momentsFragment.startActivity(new Intent(momentsFragment.getContext(), SystemMsgActivity.class));
                } else if (i == 1) {
                    momentsFragment = this.f5424a;
                    momentsFragment.startActivity(new Intent(momentsFragment.getContext(), BuyInMsgActivity.class));
                } else {
                    this.f5424a.m3516a((ChatRoom) this.f5424a.f5428c.get(i - 2));
                }
            }
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.g.3 */
    class MomentsFragment implements OnItemLongClickListener {
        final /* synthetic */ MomentsFragment f5425a;

        MomentsFragment(MomentsFragment momentsFragment) {
            this.f5425a = momentsFragment;
        }

        public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            MomentsFragment.m3509a(this.f5425a, i);
            return true;
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.g.4 */
    class MomentsFragment implements OnClickListener {
        final /* synthetic */ MomentsFragment f5426a;

        MomentsFragment(MomentsFragment momentsFragment) {
            this.f5426a = momentsFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.illuminate.texaspoker.activity.g.5 */
    class MomentsFragment implements OnClickListener {
        final /* synthetic */ MomentsFragment f5427a;

        MomentsFragment(MomentsFragment momentsFragment) {
            this.f5427a = momentsFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public MomentsFragment() {
        this.f5445t = 0;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5429d = layoutInflater.inflate(2130968685, null);
        this.f5444s = (ListView) this.f5429d.findViewById(2131558959);
        LayoutInflater from = LayoutInflater.from(getActivity());
        View inflate = from.inflate(2130968795, null);
        this.f5444s.addHeaderView(inflate);
        this.f5431f = inflate.findViewById(2131559270);
        this.f5432g = (ImageView) inflate.findViewById(2131559272);
        this.f5433h = (TextView) inflate.findViewById(2131559273);
        this.f5434i = (ImageView) inflate.findViewById(2131559262);
        this.f5435j = (TextView) inflate.findViewById(2131559263);
        this.f5436k = (TextView) inflate.findViewById(2131559265);
        this.f5437l = (TextView) inflate.findViewById(2131559266);
        View inflate2 = from.inflate(2130968793, null);
        this.f5444s.addHeaderView(inflate2);
        this.f5438m = inflate2.findViewById(2131559254);
        this.f5439n = (ImageView) inflate2.findViewById(2131559256);
        this.f5440o = (TextView) inflate2.findViewById(2131559257);
        this.f5441p = (TextView) inflate2.findViewById(2131559260);
        this.f5442q = (TextView) inflate2.findViewById(2131559258);
        this.f5443r = new ac(getContext());
        this.f5443r.f2820a = new ArrayList();
        this.f5444s.setAdapter(this.f5443r);
        this.f5444s.setOnItemClickListener(new MomentsFragment(this));
        this.f5444s.setOnItemLongClickListener(new MomentsFragment(this));
        return this.f5429d;
    }

    public final void m3517a(String str, List<Object> list) {
        try {
            if (str.equalsIgnoreCase("NOTIFY_REFRESH_IMAGE")) {
                if (!DBManager.m3631a().m3632b()) {
                    this.f5443r.notifyDataSetChanged();
                }
            } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScbuyinControlMsg")) {
                m3515e();
            } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_MOMENTS")) {
                m3513c();
            } else if (str.equalsIgnoreCase("NOTIFY_REFRESH_SYSTEM_MESSAGE")) {
                m3514d();
            } else if (str.equalsIgnoreCase("NOTIFY_ENTER_GAME_ROOM_SUCCESS")) {
                if (BaseApplication.f5509b.f4666c == 1) {
                    r2 = ((Long) list.get(0)).longValue();
                    r0 = (byte[]) list.get(1);
                    if (this.f5430e != null) {
                        this.f5430e.dismiss();
                    }
                    RuntimeData.f6674e = r2;
                    r1 = new Intent(getContext(), AppActivity.class);
                    r1.putExtra("gameType", AppActivity.k);
                    r1.putExtra("responseData", r0);
                    r1.putExtra("CMD", "NOTIFY_CC_ENTER_GAME_ROOM_SUCCESS");
                    r1.putExtra("lGameRoomId", r2);
                    r1.setFlags(67108864);
                    r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                    r1.putExtra("returnTo", AppActivity.h);
                    startActivity(r1);
                    getActivity().finish();
                    getActivity().overridePendingTransition(0, 0);
                }
            } else if (str.equalsIgnoreCase("NOTIFY_ENTER_GAME_ROOM_FAULT")) {
                if (BaseApplication.f5509b.f4666c == 1) {
                    r0 = ((Integer) list.get(0)).intValue();
                    if (this.f5430e != null) {
                        this.f5430e.dismiss();
                    }
                    new Builder(getContext()).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new MomentsFragment(this)).show();
                }
            } else if (str.equalsIgnoreCase("NOTIFY_GAME_ROOM_ScgetallbuyinControl_SUCCESS")) {
                m3515e();
            } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_SUCCESS")) {
                if (BaseApplication.f5509b.f4666c == 1) {
                    r2 = ((Long) list.get(0)).longValue();
                    r0 = (byte[]) list.get(1);
                    GameRoom a = DBManager.m3631a().f5572l.m3656a(r2, ((Long) list.get(2)).longValue());
                    if (StringUtils.m4462a(a.f5863C)) {
                        RuntimeData.f6672c = LetterIndexBar.SEARCH_ICON_LETTER;
                    } else {
                        RuntimeData.f6672c = a.f5863C;
                    }
                    RuntimeData.f6674e = r2;
                    r1 = new Intent(getContext(), AppActivity.class);
                    r1.putExtra("gameType", AppActivity.k);
                    r1.putExtra("responseData", r0);
                    r1.putExtra("CMD", "NOTIFY_CC_WATCH_SNG_GAME_ROOM_SUCCESS");
                    r1.putExtra("lGameRoomId", r2);
                    r1.setFlags(67108864);
                    r1.setFlags(WXMediaMessage.THUMB_LENGTH_LIMIT);
                    r1.putExtra("returnTo", AppActivity.h);
                    startActivity(r1);
                    if (this.f5430e != null) {
                        this.f5430e.dismiss();
                    }
                    getActivity().finish();
                    getActivity().overridePendingTransition(0, 0);
                }
            } else if (str.equalsIgnoreCase("NOTIFY_WATCH_SNG_GAME_ROOM_FAULT") && BaseApplication.f5509b.f4666c == 1) {
                r0 = ((Integer) list.get(0)).intValue();
                m3513c();
                if (this.f5430e != null) {
                    this.f5430e.dismiss();
                }
                new Builder(getContext()).setTitle(2131165514).setMessage(r0).setPositiveButton(2131165438, new MomentsFragment(this)).show();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && this.b) {
            try {
                NetworkUtil.m4073a();
                NetworkUtil.m4168h();
                NetworkUtil.m4073a();
                NetworkUtil.m4145c(0);
                NetworkUtil.m4073a();
                NetworkUtil.m4174k();
                m3513c();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public final void onResume() {
        super.onResume();
        try {
            NetworkUtil.m4073a();
            NetworkUtil.m4168h();
            NetworkUtil.m4073a();
            NetworkUtil.m4145c(0);
            NetworkUtil.m4073a();
            NetworkUtil.m4174k();
            m3513c();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void m3511b() {
        if (!DBManager.m3631a().m3632b()) {
            this.f5428c = new ArrayList();
            g a = g.a(DBManager.m3631a().f5565e.f5527b.f6426A);
            a.b(new f[]{Properties.f6170f});
            for (ChatRoom chatRoom : a.a().b()) {
                ChatMsgDBManager chatMsgDBManager = DBManager.m3631a().f5566f;
                long longValue = chatRoom.f5741b.longValue();
                int intValue = chatRoom.f5724K.intValue();
                g a2 = g.a(chatMsgDBManager.f5523a.f6469z);
                a2.a(ChatMsgDao.Properties.f6130l.a(Long.valueOf(longValue)), new i[0]);
                a2.a(ChatMsgDao.Properties.f6136r.a(Integer.valueOf(intValue)), new i[0]);
                if (a2.b() > 0 || !chatRoom.f5714A.booleanValue() || chatRoom.f5718E.booleanValue()) {
                    this.f5428c.add(chatRoom);
                }
            }
            if (this.f5443r != null) {
                this.f5443r.f2820a = this.f5428c;
                this.f5443r.notifyDataSetChanged();
            }
        }
    }

    private void m3513c() {
        if (!DBManager.m3631a().m3632b()) {
            m3511b();
            m3514d();
            m3515e();
        }
    }

    private void m3514d() {
        if (!DBManager.m3631a().m3632b() && this.f5431f != null) {
            g a = g.a(DBManager.m3631a().f5574n.f5603a.f6439N);
            a.a(MessageMsgDao.Properties.f6357f.e(Integer.valueOf(0)), new i[0]);
            a.b(new f[]{MessageMsgDao.Properties.f6357f});
            a.a(1);
            List b = a.a().b();
            MessageMsg messageMsg = null;
            if (b.size() > 0) {
                messageMsg = (MessageMsg) b.get(0);
            }
            if (messageMsg == null) {
                this.f5431f.setVisibility(8);
                return;
            }
            this.f5431f.setVisibility(0);
            switch (messageMsg.f5944e.intValue()) {
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    this.f5432g.setImageResource(2130903592);
                    this.f5433h.setText(2131165936);
                    break;
                case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                    this.f5432g.setImageResource(2130903591);
                    this.f5433h.setText(2131165931);
                    break;
                case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                    this.f5432g.setImageResource(2130903593);
                    this.f5433h.setText(2131165932);
                    break;
                default:
                    this.f5432g.setImageResource(2130903592);
                    this.f5433h.setText(2131165936);
                    break;
            }
            g a2 = g.a(DBManager.m3631a().f5574n.f5603a.f6439N);
            a2.a(MessageMsgDao.Properties.f6353b.a(Boolean.valueOf(false)), new i[0]);
            long b2 = a2.b();
            if (b2 > 0) {
                if (b2 > 99) {
                    this.f5435j.setText("\u22c5\u22c5\u22c5");
                } else {
                    this.f5435j.setText(String.valueOf(b2));
                }
                this.f5434i.setVisibility(0);
                this.f5435j.setVisibility(0);
            } else {
                this.f5434i.setVisibility(4);
                this.f5435j.setVisibility(4);
            }
            this.f5436k.setText(messageMsg.f5949j);
            this.f5437l.setText(Utility.m4492d(messageMsg.f5946g.longValue()));
        }
    }

    private void m3515e() {
        if (!DBManager.m3631a().m3632b() && this.f5438m != null) {
            BuyInControlMsg buyInControlMsg;
            g a = g.a(DBManager.m3631a().f5579s.f5520b.f6468y);
            a.a(BuyInControlMsgDao.Properties.f6106b.e(Integer.valueOf(0)), new i[0]);
            a.b(new f[]{BuyInControlMsgDao.Properties.f6106b});
            a.a(1);
            List b = a.a().b();
            if (b.size() > 0) {
                buyInControlMsg = (BuyInControlMsg) b.get(0);
            } else {
                buyInControlMsg = null;
            }
            if (buyInControlMsg == null) {
                this.f5438m.setVisibility(8);
                return;
            }
            CharSequence format;
            this.f5438m.setVisibility(0);
            a = g.a(DBManager.m3631a().f5579s.f5520b.f6468y);
            a.a(BuyInControlMsgDao.Properties.f6106b.e(Integer.valueOf(0)), new i[0]);
            a.a(BuyInControlMsgDao.Properties.f6110f.a(Boolean.valueOf(false)), new i[0]);
            long b2 = a.b();
            if (b2 > 0) {
                if (b2 > 99) {
                    this.f5440o.setText("\u22c5\u22c5\u22c5");
                } else {
                    this.f5440o.setText(String.valueOf(b2));
                }
                this.f5439n.setVisibility(0);
                this.f5440o.setVisibility(0);
            } else {
                this.f5439n.setVisibility(4);
                this.f5440o.setVisibility(4);
            }
            if (buyInControlMsg.m3720b().f5887k.intValue() != 2) {
                format = String.format(getResources().getString(2131165246), new Object[]{buyInControlMsg.m3716a().f5838q});
            } else {
                format = String.format(getResources().getString(2131165248), new Object[]{buyInControlMsg.m3716a().f5838q});
            }
            this.f5441p.setText(format);
            this.f5442q.setText(Utility.m4492d(buyInControlMsg.f5669b.longValue()));
        }
    }

    public final void m3516a(ChatRoom chatRoom) {
        if (chatRoom.f5718E == null || !chatRoom.f5718E.booleanValue()) {
            Intent intent = new Intent(getContext(), ChatRoomActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("eTalkType", chatRoom.f5724K.intValue());
            bundle.putLong("lChatRoomId", chatRoom.f5741b.longValue());
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        DBManager.m3631a().f5566f.m3580c(chatRoom.f5741b.longValue(), chatRoom.f5724K.intValue());
        RuntimeData.f6672c = chatRoom.f5762w;
        if (chatRoom.f5722I.intValue() == 2) {
            GameRoom a = DBManager.m3631a().f5572l.m3656a(chatRoom.f5750k.longValue(), chatRoom.f5741b.longValue());
            if (a == null) {
                return;
            }
            if (a.f5880d.booleanValue()) {
                this.f5430e = new LoadingDialog(getContext());
                this.f5430e.show();
                NetworkUtil.m4073a();
                NetworkUtil.m4171i(a.f5897u.longValue());
                return;
            }
            intent = new Intent(getContext(), QuickChatRoomActivity.class);
            bundle = new Bundle();
            bundle.putInt("eTalkType", chatRoom.f5724K.intValue());
            bundle.putLong("lChatRoomId", chatRoom.f5741b.longValue());
            bundle.putInt("eGameRoomType", 2);
            intent.putExtras(bundle);
            startActivity(intent);
        } else if (chatRoom.f5723J.intValue() == 2) {
            this.f5430e = new LoadingDialog(getContext());
            this.f5430e.show();
            RuntimeData.f6674e = chatRoom.f5750k.longValue();
            NetworkUtil.m4073a();
            NetworkUtil.m4169h(chatRoom.f5750k.longValue());
        } else {
            intent = new Intent(getContext(), QuickChatRoomActivity.class);
            bundle = new Bundle();
            bundle.putInt("eTalkType", chatRoom.f5724K.intValue());
            bundle.putLong("lChatRoomId", chatRoom.f5741b.longValue());
            bundle.putInt("eGameRoomType", chatRoom.f5722I.intValue());
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

    static /* synthetic */ void m3509a(MomentsFragment momentsFragment, int i) {
        if (i != 0 && i != 1) {
            ChatRoom chatRoom = (ChatRoom) momentsFragment.f5428c.get(i - 2);
            if (!chatRoom.f5718E.booleanValue()) {
                new Builder(momentsFragment.getContext()).setItems(2131492864, new MomentsFragment(momentsFragment, chatRoom)).show();
            }
        }
    }
}
