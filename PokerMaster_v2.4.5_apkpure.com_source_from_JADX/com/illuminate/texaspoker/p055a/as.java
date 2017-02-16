package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.p058c.MessageMsg;
import com.illuminate.texaspoker.utils.Utility;
import com.texaspoker.moment.TexasPokerHttp.SystemMsgBaseInfo;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: SystemMsgAdapter */
/* renamed from: com.illuminate.texaspoker.a.as */
public final class as extends BaseAdapter {
    private Context f2973a;
    private List<Object> f2974b;

    /* renamed from: com.illuminate.texaspoker.a.as.a */
    public final class SystemMsgAdapter {
        public TextView f2960a;
        public TextView f2961b;
        public TextView f2962c;
        public SimpleDraweeView f2963d;
        final /* synthetic */ as f2964e;

        public SystemMsgAdapter(as asVar) {
            this.f2964e = asVar;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.as.b */
    public final class SystemMsgAdapter {
        public TextView f2965a;
        public TextView f2966b;
        public TextView f2967c;
        final /* synthetic */ as f2968d;

        public SystemMsgAdapter(as asVar) {
            this.f2968d = asVar;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.as.c */
    public final class SystemMsgAdapter {
        public TextView f2969a;
        public TextView f2970b;
        public TextView f2971c;
        final /* synthetic */ as f2972d;

        public SystemMsgAdapter(as asVar) {
            this.f2972d = asVar;
        }
    }

    public as(Context context, List<Object> list) {
        this.f2973a = context;
        this.f2974b = list;
    }

    public final int getCount() {
        return this.f2974b.size();
    }

    public final Object getItem(int i) {
        return this.f2974b.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final int getItemViewType(int i) {
        int intValue;
        Object obj = this.f2974b.get(i);
        if (obj instanceof MessageMsg) {
            intValue = ((MessageMsg) obj).f5944e.intValue();
        } else {
            intValue = ((SystemMsgBaseInfo) obj).getESystemMessageType().getNumber();
        }
        if (intValue == 1) {
            return 0;
        }
        if (intValue == 2) {
            return 1;
        }
        return 2;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object obj;
        MessageMsg messageMsg;
        CharSequence c;
        CharSequence charSequence;
        CharSequence charSequence2;
        SystemMsgBaseInfo systemMsgBaseInfo;
        switch (getItemViewType(i)) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                SystemMsgAdapter systemMsgAdapter;
                if (view == null) {
                    systemMsgAdapter = new SystemMsgAdapter(this);
                    view = LayoutInflater.from(this.f2973a).inflate(2130968792, null);
                    systemMsgAdapter.f2969a = (TextView) view.findViewById(2131559043);
                    systemMsgAdapter.f2970b = (TextView) view.findViewById(2131558875);
                    systemMsgAdapter.f2971c = (TextView) view.findViewById(2131558877);
                    view.setTag(systemMsgAdapter);
                } else {
                    systemMsgAdapter = (SystemMsgAdapter) view.getTag();
                }
                obj = this.f2974b.get(i);
                if (obj instanceof MessageMsg) {
                    messageMsg = (MessageMsg) obj;
                    c = Utility.m4489c(messageMsg.f5946g.longValue());
                    charSequence = messageMsg.f5949j;
                    charSequence2 = messageMsg.f5948i;
                } else {
                    systemMsgBaseInfo = (SystemMsgBaseInfo) obj;
                    c = Utility.m4489c(systemMsgBaseInfo.getLSystemSendTime());
                    charSequence = systemMsgBaseInfo.getSSystemMsgTitle();
                    charSequence2 = systemMsgBaseInfo.getSSystemMsgSummary();
                }
                systemMsgAdapter.f2969a.setText(c);
                systemMsgAdapter.f2970b.setText(charSequence);
                systemMsgAdapter.f2971c.setText(charSequence2);
                break;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                SystemMsgAdapter systemMsgAdapter2;
                CharSequence c2;
                String str;
                if (view == null) {
                    systemMsgAdapter2 = new SystemMsgAdapter(this);
                    view = LayoutInflater.from(this.f2973a).inflate(2130968790, null);
                    systemMsgAdapter2.f2960a = (TextView) view.findViewById(2131559043);
                    systemMsgAdapter2.f2961b = (TextView) view.findViewById(2131558875);
                    systemMsgAdapter2.f2962c = (TextView) view.findViewById(2131558877);
                    systemMsgAdapter2.f2963d = (SimpleDraweeView) view.findViewById(2131558876);
                    view.setTag(systemMsgAdapter2);
                } else {
                    systemMsgAdapter2 = (SystemMsgAdapter) view.getTag();
                }
                obj = this.f2974b.get(i);
                if (obj instanceof MessageMsg) {
                    messageMsg = (MessageMsg) obj;
                    c2 = Utility.m4489c(messageMsg.f5946g.longValue());
                    c = messageMsg.f5949j;
                    charSequence = messageMsg.f5948i;
                    str = messageMsg.f5947h;
                } else {
                    systemMsgBaseInfo = (SystemMsgBaseInfo) obj;
                    c2 = Utility.m4489c(systemMsgBaseInfo.getLSystemSendTime());
                    c = systemMsgBaseInfo.getSSystemMsgTitle();
                    charSequence = systemMsgBaseInfo.getSSystemMsgSummary();
                    str = systemMsgBaseInfo.getSSystemMsgImgUrl();
                }
                systemMsgAdapter2.f2960a.setText(c2);
                systemMsgAdapter2.f2961b.setText(c);
                systemMsgAdapter2.f2962c.setText(charSequence);
                systemMsgAdapter2.f2963d.setImageURI(Uri.parse(str));
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                SystemMsgAdapter systemMsgAdapter3;
                if (view == null) {
                    systemMsgAdapter3 = new SystemMsgAdapter(this);
                    view = LayoutInflater.from(this.f2973a).inflate(2130968791, null);
                    systemMsgAdapter3.f2965a = (TextView) view.findViewById(2131559043);
                    systemMsgAdapter3.f2966b = (TextView) view.findViewById(2131558875);
                    systemMsgAdapter3.f2967c = (TextView) view.findViewById(2131558877);
                    view.setTag(systemMsgAdapter3);
                } else {
                    systemMsgAdapter3 = (SystemMsgAdapter) view.getTag();
                }
                obj = this.f2974b.get(i);
                if (obj instanceof MessageMsg) {
                    messageMsg = (MessageMsg) obj;
                    c = Utility.m4489c(messageMsg.f5946g.longValue());
                    charSequence = messageMsg.f5949j;
                    charSequence2 = messageMsg.f5948i;
                } else {
                    systemMsgBaseInfo = (SystemMsgBaseInfo) obj;
                    c = Utility.m4489c(systemMsgBaseInfo.getLSystemSendTime());
                    charSequence = systemMsgBaseInfo.getSSystemMsgTitle();
                    charSequence2 = systemMsgBaseInfo.getSSystemMsgSummary();
                }
                systemMsgAdapter3.f2965a.setText(c);
                systemMsgAdapter3.f2966b.setText(charSequence);
                systemMsgAdapter3.f2967c.setText(charSequence2);
                break;
        }
        return view;
    }
}
