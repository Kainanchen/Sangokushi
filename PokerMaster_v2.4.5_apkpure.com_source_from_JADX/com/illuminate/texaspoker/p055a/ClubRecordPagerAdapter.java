package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.PagerAdapter;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.activity.ClubBillActivity;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.p058c.ChatRoom;
import com.illuminate.texaspoker.p058c.ClubRecord;
import com.illuminate.texaspoker.utils.Utility;
import com.illuminate.texaspoker.view.RecordWinProgress;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.l */
public final class ClubRecordPagerAdapter extends PagerAdapter {
    private List<ChatRoom> f3332a;
    private Context f3333b;
    private int f3334c;

    /* renamed from: com.illuminate.texaspoker.a.l.1 */
    class ClubRecordPagerAdapter implements OnClickListener {
        final /* synthetic */ ChatRoom f3330a;
        final /* synthetic */ ClubRecordPagerAdapter f3331b;

        ClubRecordPagerAdapter(ClubRecordPagerAdapter clubRecordPagerAdapter, ChatRoom chatRoom) {
            this.f3331b = clubRecordPagerAdapter;
            this.f3330a = chatRoom;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f3331b.f3333b, ClubBillActivity.class);
            intent.putExtra("lClubId", this.f3330a.f5741b);
            this.f3331b.f3333b.startActivity(intent);
        }
    }

    public ClubRecordPagerAdapter(Context context, List<ChatRoom> list) {
        this.f3333b = context;
        this.f3332a = list;
    }

    public final int getCount() {
        return this.f3332a.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f3333b).inflate(2130968758, null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(2131558610);
        TextView textView = (TextView) inflate.findViewById(2131558613);
        TextView textView2 = (TextView) inflate.findViewById(2131559151);
        TextView textView3 = (TextView) inflate.findViewById(2131558616);
        Button button = (Button) inflate.findViewById(2131558993);
        TextView textView4 = (TextView) inflate.findViewById(2131558732);
        TextView textView5 = (TextView) inflate.findViewById(2131558524);
        RecordWinProgress recordWinProgress = (RecordWinProgress) inflate.findViewById(2131558525);
        TextView textView6 = (TextView) inflate.findViewById(2131558526);
        TextView textView7 = (TextView) inflate.findViewById(2131558527);
        viewGroup.addView(inflate);
        if (DBManager.m3631a().m3632b()) {
            return inflate;
        }
        long j;
        long j2;
        long j3;
        long j4;
        double d;
        double d2;
        String str;
        ChatRoom chatRoom = (ChatRoom) this.f3332a.get(i);
        ClubRecord a = DBManager.m3631a().f5577q.m3630a(chatRoom.f5741b.longValue());
        simpleDraweeView.setImageURI(Uri.parse(chatRoom.f5760u));
        textView.setText(chatRoom.f5755p);
        textView2.setText(chatRoom.f5729P + "/" + chatRoom.f5731R);
        textView3.setText(Utility.m4506h(chatRoom.f5765z));
        if (a == null) {
            j = 0;
            j2 = 0;
            j3 = 0;
            j4 = 0;
        } else {
            j = a.f5810c.longValue();
            j2 = a.f5811d.longValue();
            j3 = a.f5812e.longValue();
            j4 = a.f5813f.longValue();
        }
        String g = Utility.m4502g(j2);
        String format = String.format(this.f3333b.getResources().getString(2131165899), new Object[]{g});
        int indexOf = format.indexOf(g);
        CharSequence spannableString = new SpannableString(format);
        spannableString.setSpan(new ForegroundColorSpan(-6316386), 0, format.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(-73826), indexOf, g.length() + indexOf, 33);
        spannableString.setSpan(new RelativeSizeSpan(2.57f), indexOf, g.length() + indexOf, 33);
        textView4.setText(spannableString);
        double d3 = 0.0d;
        if (j3 != 0) {
            d3 = ((double) j) / ((double) j3);
            if (d3 >= 1.0d) {
                d = 1.0d;
                if (j == 0) {
                    d2 = ((double) j4) / ((double) j);
                    if (d2 >= 1.0d) {
                        d2 = 1.0d;
                    }
                } else {
                    d2 = 0.0d;
                }
                str = "%";
                textView5.setText(((int) (100.0d * d)) + g);
                textView6.setText(((int) (100.0d * d2)) + "%");
                textView7.setText(String.valueOf(j3));
                recordWinProgress.m4560a((float) d, (float) (d2 * d));
                button.setOnClickListener(new ClubRecordPagerAdapter(this, chatRoom));
                return inflate;
            }
        }
        d = d3;
        if (j == 0) {
            d2 = 0.0d;
        } else {
            d2 = ((double) j4) / ((double) j);
            if (d2 >= 1.0d) {
                d2 = 1.0d;
            }
        }
        str = "%";
        textView5.setText(((int) (100.0d * d)) + g);
        textView6.setText(((int) (100.0d * d2)) + "%");
        textView7.setText(String.valueOf(j3));
        recordWinProgress.m4560a((float) d, (float) (d2 * d));
        button.setOnClickListener(new ClubRecordPagerAdapter(this, chatRoom));
        return inflate;
    }

    public final void notifyDataSetChanged() {
        this.f3334c = getCount();
        super.notifyDataSetChanged();
    }

    public final int getItemPosition(Object obj) {
        if (this.f3334c <= 0) {
            return super.getItemPosition(obj);
        }
        this.f3334c--;
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
