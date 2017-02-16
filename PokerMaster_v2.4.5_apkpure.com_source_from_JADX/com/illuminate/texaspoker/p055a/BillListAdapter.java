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
import com.illuminate.texaspoker.p058c.Bill;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.illuminate.texaspoker.utils.StringUtils;
import com.illuminate.texaspoker.utils.Utility;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerHttpBill.BillInfoNet;
import com.texaspoker.moment.TexasPokerHttpBill.UserBillInfoNet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* renamed from: com.illuminate.texaspoker.a.d */
public final class BillListAdapter extends BaseAdapter {
    public List f3032a;
    private Context f3033b;
    private SimpleDateFormat f3034c;

    /* renamed from: com.illuminate.texaspoker.a.d.a */
    public final class BillListAdapter {
        public TextView f3018a;
        public TextView f3019b;
        public TextView f3020c;
        public TextView f3021d;
        public TextView f3022e;
        public ImageView f3023f;
        public ImageView f3024g;
        public SimpleDraweeView f3025h;
        public TextView f3026i;
        public TextView f3027j;
        public TextView f3028k;
        public TextView f3029l;
        public ImageView f3030m;
        final /* synthetic */ BillListAdapter f3031n;

        public BillListAdapter(BillListAdapter billListAdapter) {
            this.f3031n = billListAdapter;
        }
    }

    public BillListAdapter(Context context) {
        this.f3033b = context;
        this.f3034c = new SimpleDateFormat(context.getString(2131165243));
    }

    public final int getCount() {
        return this.f3032a.size();
    }

    public final Object getItem(int i) {
        return this.f3032a.get(i);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        BillListAdapter billListAdapter;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        CharSequence charSequence;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        String str5;
        String str6;
        int i7;
        long j2;
        long j3;
        CharSequence charSequence2;
        if (view == null) {
            view = LayoutInflater.from(this.f3033b).inflate(2130968729, null);
            BillListAdapter billListAdapter2 = new BillListAdapter(this);
            billListAdapter2.f3018a = (TextView) view.findViewById(2131559040);
            billListAdapter2.f3019b = (TextView) view.findViewById(2131559041);
            billListAdapter2.f3020c = (TextView) view.findViewById(2131559043);
            billListAdapter2.f3021d = (TextView) view.findViewById(2131559044);
            billListAdapter2.f3022e = (TextView) view.findViewById(2131559045);
            billListAdapter2.f3023f = (ImageView) view.findViewById(2131559047);
            billListAdapter2.f3024g = (ImageView) view.findViewById(2131559048);
            billListAdapter2.f3025h = (SimpleDraweeView) view.findViewById(2131558674);
            billListAdapter2.f3026i = (TextView) view.findViewById(2131558842);
            billListAdapter2.f3027j = (TextView) view.findViewById(2131559051);
            billListAdapter2.f3028k = (TextView) view.findViewById(2131559052);
            billListAdapter2.f3029l = (TextView) view.findViewById(2131559050);
            billListAdapter2.f3030m = (ImageView) view.findViewById(2131559049);
            view.setTag(billListAdapter2);
            billListAdapter = billListAdapter2;
        } else {
            billListAdapter = (BillListAdapter) view.getTag();
        }
        Object[] objArr = (Object[]) this.f3032a.get(i);
        Object obj = objArr[2];
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        long longValue;
        int intValue;
        String str7;
        String str8;
        long j8;
        long j9;
        long j10;
        if (obj instanceof Bill) {
            String str9;
            Bill bill = (Bill) obj;
            int intValue2 = bill.f5644c.intValue();
            longValue = bill.f5626J.longValue();
            bill.f5631O.longValue();
            str = bill.m3715i().f5836o;
            String str10 = bill.m3715i().f5838q;
            intValue = bill.m3715i().f5832k.intValue();
            str7 = bill.f5629M;
            if (StringUtils.m4462a(bill.f5630N)) {
                str8 = LetterIndexBar.SEARCH_ICON_LETTER;
            } else {
                str8 = bill.f5630N;
            }
            int intValue3 = bill.f5645d.intValue();
            long longValue2 = bill.f5664w.longValue();
            str2 = bill.m3715i().f5838q;
            if (bill.f5644c.intValue() != 2) {
                j4 = bill.f5662u.longValue();
                j5 = bill.f5663v.longValue();
                j6 = bill.f5627K.longValue();
                if (bill.f5656o != null) {
                    i8 = bill.f5656o.intValue();
                } else {
                    i8 = 0;
                }
            } else {
                i9 = bill.f5654m.intValue();
                i10 = bill.f5655n.intValue();
            }
            if (bill.f5634R == null) {
                j8 = 0;
            } else {
                j8 = bill.f5634R.longValue();
            }
            if (j8 > 0) {
                String str11 = bill.f5636T;
                str9 = bill.f5637U;
                str3 = str11;
            } else {
                str3 = null;
                str9 = str10;
            }
            j9 = j8;
            i2 = intValue2;
            str4 = str2;
            j7 = j4;
            str2 = str8;
            j4 = j6;
            charSequence = str3;
            i3 = i10;
            i4 = i9;
            j = j9;
            j10 = longValue2;
            i5 = i8;
            i6 = intValue3;
            str5 = str7;
            long j11 = j5;
            j5 = j10;
            long j12 = longValue;
            str6 = str9;
            i7 = intValue;
            j2 = j12;
            j3 = j11;
        } else {
            int number;
            String str12;
            BillInfoNet billInfoNet = (BillInfoNet) obj;
            i5 = billInfoNet.getEGameRoomType().getNumber();
            String strSmallCover;
            String strNick;
            int iGender;
            if (billInfoNet.getEGameRoomType() == GAME_ROOM_TYPE.GAME_ROOM_SNG) {
                longValue = billInfoNet.getStSNGBillInfoNet().getLCreateTime();
                billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getUuid();
                strSmallCover = billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getStrSmallCover();
                strNick = billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getStrNick();
                iGender = billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getIGender();
                str7 = billInfoNet.getStSNGBillInfoNet().getSPlayName();
                number = billInfoNet.getStSNGBillInfoNet().getECreateRoomType().getNumber();
                int iGameRoomUserMaxNums = billInfoNet.getStSNGBillInfoNet().getIGameRoomUserMaxNums();
                i2 = billInfoNet.getStSNGBillInfoNet().getESNGRoomType().getNumber();
                String strNick2 = billInfoNet.getStSNGBillInfoNet().getStCreateUserBaseInfo().getStrNick();
                for (UserBillInfoNet userBillInfoNet : billInfoNet.getStSNGBillInfoNet().getVUserBillInfosList()) {
                    if (SharedPreferencesManager.m4308b() == userBillInfoNet.getUuid()) {
                        j = userBillInfoNet.getLRemainBuyStacks() - userBillInfoNet.getLTotalBuyStacks();
                        break;
                    }
                }
                j = 0;
                j7 = billInfoNet.getStSNGBillInfoNet().getLLeagueID();
                billInfoNet.getStSNGBillInfoNet().getSLeagueName();
                String str13;
                if (j7 <= 0) {
                    str5 = billInfoNet.getStNormalBillInfoNet().getSFromText();
                    str8 = strNick;
                    intValue = iGender;
                    str = strSmallCover;
                    j9 = j;
                    j = j7;
                    j7 = 0;
                    j5 = j9;
                    j4 = 0;
                    i3 = i2;
                    i4 = iGameRoomUserMaxNums;
                    j8 = 0;
                    str13 = strNick2;
                    i6 = 0;
                    str12 = str13;
                } else if (StringUtils.m4462a(billInfoNet.getSFromClubName())) {
                    str5 = LetterIndexBar.SEARCH_ICON_LETTER;
                    str8 = strNick;
                    intValue = iGender;
                    str = strSmallCover;
                    j9 = j;
                    j = j7;
                    j7 = 0;
                    j5 = j9;
                    j4 = 0;
                    i3 = i2;
                    i4 = iGameRoomUserMaxNums;
                    j8 = 0;
                    str13 = strNick2;
                    i6 = 0;
                    str12 = str13;
                } else {
                    str5 = billInfoNet.getSFromClubName();
                    str8 = strNick;
                    intValue = iGender;
                    str = strSmallCover;
                    j9 = j;
                    j = j7;
                    j7 = 0;
                    j5 = j9;
                    j4 = 0;
                    i3 = i2;
                    i4 = iGameRoomUserMaxNums;
                    j8 = 0;
                    str13 = strNick2;
                    i6 = 0;
                    str12 = str13;
                }
            } else {
                longValue = billInfoNet.getStNormalBillInfoNet().getLCreateTime();
                billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getUuid();
                strSmallCover = billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrSmallCover();
                strNick = billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrNick();
                iGender = billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getIGender();
                str7 = billInfoNet.getStNormalBillInfoNet().getSPlayName();
                number = billInfoNet.getStNormalBillInfoNet().getECreateRoomType().getNumber();
                j8 = billInfoNet.getStNormalBillInfoNet().getLSmallBlind();
                j5 = billInfoNet.getStNormalBillInfoNet().getLBigBlind();
                j4 = billInfoNet.getStNormalBillInfoNet().getLDuration();
                str12 = billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrNick();
                i6 = billInfoNet.getStNormalBillInfoNet().getIAnte();
                for (UserBillInfoNet userBillInfoNet2 : billInfoNet.getStNormalBillInfoNet().getVUserBillInfosList()) {
                    if (SharedPreferencesManager.m4308b() == userBillInfoNet2.getUuid()) {
                        j7 = userBillInfoNet2.getLRemainBuyStacks() - userBillInfoNet2.getLTotalBuyStacks();
                        break;
                    }
                }
                j6 = billInfoNet.getStNormalBillInfoNet().getLLeagueID();
                billInfoNet.getStNormalBillInfoNet().getSLeagueName();
                if (j6 <= 0) {
                    str5 = billInfoNet.getStNormalBillInfoNet().getSFromText();
                    str8 = strNick;
                    intValue = iGender;
                    str = strSmallCover;
                    j9 = j7;
                    j7 = j5;
                    j5 = j9;
                    j10 = j6;
                    i3 = 0;
                    i4 = 0;
                    j = j10;
                } else if (StringUtils.m4462a(billInfoNet.getSFromClubName())) {
                    str5 = billInfoNet.getStNormalBillInfoNet().getSFromText();
                    str8 = strNick;
                    intValue = iGender;
                    str = strSmallCover;
                    j9 = j7;
                    j7 = j5;
                    j5 = j9;
                    j10 = j6;
                    i3 = 0;
                    i4 = 0;
                    j = j10;
                } else {
                    str5 = billInfoNet.getSFromClubName();
                    str8 = strNick;
                    intValue = iGender;
                    str = strSmallCover;
                    j9 = j7;
                    j7 = j5;
                    j5 = j9;
                    j10 = j6;
                    i3 = 0;
                    i4 = 0;
                    j = j10;
                }
            }
            if (j > 0) {
                charSequence = billInfoNet.getSFromClubUrl();
                CharSequence sFromClubCreatorName = billInfoNet.getSFromClubCreatorName();
                if (StringUtils.m4462a(charSequence)) {
                    charSequence = billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrSmallCover();
                }
                if (StringUtils.m4462a(sFromClubCreatorName)) {
                    j9 = j7;
                    j7 = j8;
                    i2 = i5;
                    str4 = str12;
                    i5 = i6;
                    i6 = number;
                    str2 = str5;
                    str5 = str7;
                    j10 = longValue;
                    str6 = billInfoNet.getStNormalBillInfoNet().getStCreateUserBaseInfo().getStrNick();
                    i7 = intValue;
                    j2 = j10;
                    j3 = j9;
                } else {
                    j9 = j7;
                    j7 = j8;
                    i2 = i5;
                    str4 = str12;
                    i5 = i6;
                    i6 = number;
                    str2 = str5;
                    str5 = str7;
                    j10 = longValue;
                    CharSequence charSequence3 = sFromClubCreatorName;
                    i7 = intValue;
                    j2 = j10;
                    j3 = j9;
                }
            } else {
                long j13 = j7;
                j7 = j8;
                i2 = i5;
                str4 = str12;
                j3 = j13;
                i5 = i6;
                i6 = number;
                str2 = str5;
                str5 = str7;
                long j14 = longValue;
                str6 = str8;
                i7 = intValue;
                j2 = j14;
                charSequence = null;
            }
        }
        str3 = (String) objArr[0];
        billListAdapter.f3018a.setText(str3);
        billListAdapter.f3019b.setText((String) objArr[1]);
        billListAdapter.f3020c.setText(this.f3034c.format(new Date(j2)));
        if (i6 == 1) {
            billListAdapter.f3021d.setText(str6 + " \u2022 ");
            billListAdapter.f3022e.setText(str2);
        } else if (i6 != 2) {
            billListAdapter.f3022e.setText(2131165567);
            billListAdapter.f3021d.setText(str4 + " \u2022 ");
        } else if (j > 0) {
            billListAdapter.f3021d.setText(str6 + " \u2022 ");
            billListAdapter.f3022e.setText(str2);
        } else {
            billListAdapter.f3021d.setText(str6 + " \u2022 ");
            billListAdapter.f3022e.setText(str2);
        }
        Uri uri = null;
        if (j <= 0) {
            if (i7 == 1) {
                ((GenericDraweeHierarchy) billListAdapter.f3025h.getHierarchy()).m1407a(2130903198);
            } else {
                ((GenericDraweeHierarchy) billListAdapter.f3025h.getHierarchy()).m1407a(2130903193);
            }
            uri = Uri.parse(str);
        } else if (!StringUtils.m4462a(charSequence)) {
            uri = Uri.parse(charSequence);
        }
        billListAdapter.f3025h.setImageURI(uri);
        billListAdapter.f3026i.setText(str5);
        Drawable drawable;
        if (i2 != 2) {
            if (i2 == 3 || i2 == 6) {
                billListAdapter.f3023f.setVisibility(0);
            } else {
                billListAdapter.f3023f.setVisibility(8);
            }
            if (i2 == 4) {
                billListAdapter.f3024g.setImageResource(2130903046);
                billListAdapter.f3024g.setVisibility(0);
            } else if (i2 == 5 || i2 == 6) {
                billListAdapter.f3024g.setImageResource(2130903045);
                billListAdapter.f3024g.setVisibility(0);
            } else {
                billListAdapter.f3024g.setVisibility(8);
            }
            drawable = this.f3033b.getResources().getDrawable(2130903258);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            billListAdapter.f3027j.setCompoundDrawables(drawable, null, null, null);
            drawable = this.f3033b.getResources().getDrawable(2130903286);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            billListAdapter.f3028k.setCompoundDrawables(drawable, null, null, null);
            charSequence2 = Utility.m4508i(j7) + "/" + Utility.m4508i(j3);
            if (i5 != 0) {
                charSequence2 = charSequence2 + "(" + Utility.m4508i((long) i5) + ")";
            }
            billListAdapter.f3027j.setText(charSequence2);
            if (j4 >= 3600) {
                String a = Utility.m4474a("#.#", ((double) (j4 / 60)) / 60.0d);
                charSequence2 = String.format(this.f3033b.getResources().getString(2131165236), new Object[]{a});
            } else {
                charSequence2 = String.format(this.f3033b.getResources().getString(2131165237), new Object[]{Long.valueOf(j4 / 60)});
            }
        } else {
            billListAdapter.f3023f.setVisibility(8);
            billListAdapter.f3024g.setImageResource(2130903050);
            billListAdapter.f3024g.setVisibility(0);
            drawable = this.f3033b.getResources().getDrawable(2130903268);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            billListAdapter.f3027j.setCompoundDrawables(drawable, null, null, null);
            drawable = this.f3033b.getResources().getDrawable(2130903261);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            billListAdapter.f3028k.setCompoundDrawables(drawable, null, null, null);
            billListAdapter.f3027j.setText(String.format(this.f3033b.getString(2131165274), new Object[]{Integer.valueOf(i4)}));
            charSequence2 = LetterIndexBar.SEARCH_ICON_LETTER;
            if (i3 == 1) {
                charSequence2 = this.f3033b.getString(2131165698);
            } else if (i3 == 2) {
                charSequence2 = this.f3033b.getString(2131165695);
            } else if (i3 == 3) {
                charSequence2 = this.f3033b.getString(2131165691);
            } else if (i3 == 4) {
                charSequence2 = this.f3033b.getString(2131165684);
            }
        }
        billListAdapter.f3028k.setText(charSequence2);
        if (j5 > 0) {
            charSequence2 = "+" + Utility.m4502g(j5);
            billListAdapter.f3030m.setImageResource(2130903554);
        } else if (j5 < 0) {
            charSequence2 = Utility.m4502g(j5);
            billListAdapter.f3030m.setImageResource(2130903548);
        } else {
            charSequence2 = Utility.m4502g(j5);
            billListAdapter.f3030m.setImageResource(2130903547);
        }
        billListAdapter.f3029l.setText(charSequence2);
        return view;
    }
}
