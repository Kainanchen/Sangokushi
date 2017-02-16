package com.illuminate.texaspoker.p055a;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.p031e.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.illuminate.texaspoker.utils.Utility;
import com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.illuminate.texaspoker.a.t */
public final class GamePokerHistoryListAdapter extends BaseExpandableListAdapter {
    private List<Integer> f3437a;
    private List<BravoPokerHistoryInfo> f3438b;
    private List<PokerHistoryInfo> f3439c;
    private Context f3440d;

    /* renamed from: com.illuminate.texaspoker.a.t.a */
    public final class GamePokerHistoryListAdapter {
        public ImageView f3408a;
        public TextView f3409b;
        public TextView f3410c;
        final /* synthetic */ GamePokerHistoryListAdapter f3411d;

        public GamePokerHistoryListAdapter(GamePokerHistoryListAdapter gamePokerHistoryListAdapter) {
            this.f3411d = gamePokerHistoryListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.t.b */
    public final class GamePokerHistoryListAdapter {
        public TextView f3412a;
        public TextView f3413b;
        public TextView f3414c;
        public SimpleDraweeView f3415d;
        public TextView f3416e;
        public TextView f3417f;
        final /* synthetic */ GamePokerHistoryListAdapter f3418g;

        public GamePokerHistoryListAdapter(GamePokerHistoryListAdapter gamePokerHistoryListAdapter) {
            this.f3418g = gamePokerHistoryListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.t.c */
    public final class GamePokerHistoryListAdapter {
        public ImageView f3419a;
        public ImageView f3420b;
        public TextView f3421c;
        public TextView f3422d;
        public TextView f3423e;
        public TextView f3424f;
        public TextView f3425g;
        final /* synthetic */ GamePokerHistoryListAdapter f3426h;

        public GamePokerHistoryListAdapter(GamePokerHistoryListAdapter gamePokerHistoryListAdapter) {
            this.f3426h = gamePokerHistoryListAdapter;
        }
    }

    /* renamed from: com.illuminate.texaspoker.a.t.d */
    public final class GamePokerHistoryListAdapter {
        public ImageView f3427a;
        public ImageView f3428b;
        public ImageView f3429c;
        public ImageView f3430d;
        public TextView f3431e;
        public TextView f3432f;
        public TextView f3433g;
        public TextView f3434h;
        public TextView f3435i;
        final /* synthetic */ GamePokerHistoryListAdapter f3436j;

        public GamePokerHistoryListAdapter(GamePokerHistoryListAdapter gamePokerHistoryListAdapter) {
            this.f3436j = gamePokerHistoryListAdapter;
        }
    }

    public GamePokerHistoryListAdapter(Context context, List<Integer> list, List<BravoPokerHistoryInfo> list2, List<PokerHistoryInfo> list3) {
        this.f3440d = context;
        this.f3437a = list;
        this.f3439c = list3;
        this.f3438b = list2;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public final int getGroupCount() {
        return this.f3437a.size();
    }

    public final int getChildrenCount(int i) {
        if (((Integer) this.f3437a.get(i)).intValue() == 0) {
            return this.f3438b.size();
        }
        return this.f3439c.size();
    }

    public final Object getGroup(int i) {
        if (((Integer) this.f3437a.get(i)).intValue() == 0) {
            return this.f3438b;
        }
        return this.f3439c;
    }

    public final Object getChild(int i, int i2) {
        if (((Integer) this.f3437a.get(i)).intValue() == 0) {
            return this.f3438b.get(i2);
        }
        return this.f3439c.get(i2);
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

    public final int getChildTypeCount() {
        return 3;
    }

    public final int getChildType(int i, int i2) {
        if (((Integer) this.f3437a.get(i)).intValue() == 0) {
            return 2;
        }
        if (((PokerHistoryInfo) this.f3439c.get(i2)).getVHandCardsCount() == 4) {
            return 1;
        }
        return 0;
    }

    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        GamePokerHistoryListAdapter gamePokerHistoryListAdapter;
        if (view == null) {
            view = LayoutInflater.from(this.f3440d).inflate(2130968814, null);
            gamePokerHistoryListAdapter = new GamePokerHistoryListAdapter(this);
            gamePokerHistoryListAdapter.f3408a = (ImageView) view.findViewById(2131559339);
            gamePokerHistoryListAdapter.f3409b = (TextView) view.findViewById(2131559340);
            gamePokerHistoryListAdapter.f3410c = (TextView) view.findViewById(2131559341);
            view.setTag(gamePokerHistoryListAdapter);
        } else {
            gamePokerHistoryListAdapter = (GamePokerHistoryListAdapter) view.getTag();
        }
        if (((Integer) this.f3437a.get(i)).intValue() == 0) {
            gamePokerHistoryListAdapter.f3408a.setImageResource(2130903496);
            gamePokerHistoryListAdapter.f3409b.setText(2131165816);
            gamePokerHistoryListAdapter.f3410c.setVisibility(8);
        } else {
            gamePokerHistoryListAdapter.f3408a.setImageResource(2130903501);
            gamePokerHistoryListAdapter.f3409b.setText(2131165829);
            gamePokerHistoryListAdapter.f3410c.setText(String.format(this.f3440d.getResources().getString(2131165835), new Object[]{Integer.valueOf(this.f3439c.size())}));
            gamePokerHistoryListAdapter.f3410c.setVisibility(0);
        }
        return view;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        PokerHistoryInfo pokerHistoryInfo;
        int i3;
        String i4;
        String i5;
        switch (getChildType(i, i2)) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                GamePokerHistoryListAdapter gamePokerHistoryListAdapter;
                if (view == null) {
                    view = LayoutInflater.from(this.f3440d).inflate(2130968812, null);
                    gamePokerHistoryListAdapter = new GamePokerHistoryListAdapter(this);
                    gamePokerHistoryListAdapter.f3419a = (ImageView) view.findViewById(2131559216);
                    gamePokerHistoryListAdapter.f3420b = (ImageView) view.findViewById(2131559217);
                    gamePokerHistoryListAdapter.f3421c = (TextView) view.findViewById(2131559218);
                    gamePokerHistoryListAdapter.f3423e = (TextView) view.findViewById(2131559219);
                    gamePokerHistoryListAdapter.f3422d = (TextView) view.findViewById(2131559096);
                    gamePokerHistoryListAdapter.f3424f = (TextView) view.findViewById(2131559337);
                    gamePokerHistoryListAdapter.f3425g = (TextView) view.findViewById(2131559338);
                    view.setTag(gamePokerHistoryListAdapter);
                } else {
                    gamePokerHistoryListAdapter = (GamePokerHistoryListAdapter) view.getTag();
                }
                pokerHistoryInfo = (PokerHistoryInfo) this.f3439c.get(i2);
                if (pokerHistoryInfo.getVHandCards(0) < 0 || pokerHistoryInfo.getVHandCards(0) > 51) {
                    i3 = 2130903493;
                } else {
                    i3 = Utility.m4468a(this.f3440d, "poker_" + pokerHistoryInfo.getVHandCards(0));
                }
                gamePokerHistoryListAdapter.f3419a.setImageResource(i3);
                if (pokerHistoryInfo.getVHandCards(1) < 0 || pokerHistoryInfo.getVHandCards(1) > 51) {
                    i3 = 2130903493;
                } else {
                    i3 = Utility.m4468a(this.f3440d, "poker_" + pokerHistoryInfo.getVHandCards(1));
                }
                gamePokerHistoryListAdapter.f3420b.setImageResource(i3);
                gamePokerHistoryListAdapter.f3421c.setText(Html.fromHtml(pokerHistoryInfo.getSPokerDesc()));
                if (pokerHistoryInfo.getLGetPopularity() > 0) {
                    gamePokerHistoryListAdapter.f3422d.setTextColor(-2543568);
                    gamePokerHistoryListAdapter.f3422d.setText("+" + Utility.m4502g(pokerHistoryInfo.getLGetPopularity()));
                } else if (pokerHistoryInfo.getLGetPopularity() == 0) {
                    gamePokerHistoryListAdapter.f3422d.setTextColor(-5395027);
                    gamePokerHistoryListAdapter.f3422d.setText(Utility.m4502g(pokerHistoryInfo.getLGetPopularity()));
                } else {
                    gamePokerHistoryListAdapter.f3422d.setTextColor(-14519546);
                    gamePokerHistoryListAdapter.f3422d.setText(Utility.m4502g(pokerHistoryInfo.getLGetPopularity()));
                }
                i4 = Utility.m4508i(pokerHistoryInfo.getLSmallBlind());
                i5 = Utility.m4508i(pokerHistoryInfo.getLBigBlind());
                if (pokerHistoryInfo.getIAnte() != 0) {
                    gamePokerHistoryListAdapter.f3423e.setText(i4 + "/" + i5 + "(" + pokerHistoryInfo.getIAnte() + ")");
                } else {
                    gamePokerHistoryListAdapter.f3423e.setText(i4 + "/" + i5);
                }
                gamePokerHistoryListAdapter.f3424f.setText(String.format(this.f3440d.getResources().getString(2131165830), new Object[]{Utility.m4502g(pokerHistoryInfo.getLMaxPot())}));
                gamePokerHistoryListAdapter.f3425g.setText(String.format(this.f3440d.getResources().getString(2131165826), new Object[]{Long.valueOf(pokerHistoryInfo.getLHandID())}));
                break;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                GamePokerHistoryListAdapter gamePokerHistoryListAdapter2;
                if (view == null) {
                    view = LayoutInflater.from(this.f3440d).inflate(2130968813, null);
                    gamePokerHistoryListAdapter2 = new GamePokerHistoryListAdapter(this);
                    gamePokerHistoryListAdapter2.f3427a = (ImageView) view.findViewById(2131559216);
                    gamePokerHistoryListAdapter2.f3428b = (ImageView) view.findViewById(2131559217);
                    gamePokerHistoryListAdapter2.f3429c = (ImageView) view.findViewById(2131559223);
                    gamePokerHistoryListAdapter2.f3430d = (ImageView) view.findViewById(2131559224);
                    gamePokerHistoryListAdapter2.f3431e = (TextView) view.findViewById(2131559218);
                    gamePokerHistoryListAdapter2.f3433g = (TextView) view.findViewById(2131559219);
                    gamePokerHistoryListAdapter2.f3432f = (TextView) view.findViewById(2131559096);
                    gamePokerHistoryListAdapter2.f3434h = (TextView) view.findViewById(2131559337);
                    gamePokerHistoryListAdapter2.f3435i = (TextView) view.findViewById(2131559338);
                    view.setTag(gamePokerHistoryListAdapter2);
                } else {
                    gamePokerHistoryListAdapter2 = (GamePokerHistoryListAdapter) view.getTag();
                }
                pokerHistoryInfo = (PokerHistoryInfo) this.f3439c.get(i2);
                if (pokerHistoryInfo.getVHandCards(0) < 0 || pokerHistoryInfo.getVHandCards(0) > 51) {
                    i3 = 2130903493;
                } else {
                    i3 = Utility.m4468a(this.f3440d, "poker_" + pokerHistoryInfo.getVHandCards(0));
                }
                gamePokerHistoryListAdapter2.f3427a.setImageResource(i3);
                if (pokerHistoryInfo.getVHandCards(1) < 0 || pokerHistoryInfo.getVHandCards(1) > 51) {
                    i3 = 2130903493;
                } else {
                    i3 = Utility.m4468a(this.f3440d, "poker_" + pokerHistoryInfo.getVHandCards(1));
                }
                gamePokerHistoryListAdapter2.f3428b.setImageResource(i3);
                if (pokerHistoryInfo.getVHandCards(2) < 0 || pokerHistoryInfo.getVHandCards(2) > 51) {
                    i3 = 2130903493;
                } else {
                    i3 = Utility.m4468a(this.f3440d, "poker_" + pokerHistoryInfo.getVHandCards(2));
                }
                gamePokerHistoryListAdapter2.f3429c.setImageResource(i3);
                if (pokerHistoryInfo.getVHandCards(3) < 0 || pokerHistoryInfo.getVHandCards(3) > 51) {
                    i3 = 2130903493;
                } else {
                    i3 = Utility.m4468a(this.f3440d, "poker_" + pokerHistoryInfo.getVHandCards(3));
                }
                gamePokerHistoryListAdapter2.f3430d.setImageResource(i3);
                gamePokerHistoryListAdapter2.f3431e.setText(Html.fromHtml(pokerHistoryInfo.getSPokerDesc()));
                if (pokerHistoryInfo.getLGetPopularity() > 0) {
                    gamePokerHistoryListAdapter2.f3432f.setText("+" + Utility.m4502g(pokerHistoryInfo.getLGetPopularity()));
                    gamePokerHistoryListAdapter2.f3432f.setTextColor(-2543568);
                } else if (pokerHistoryInfo.getLGetPopularity() < 0) {
                    gamePokerHistoryListAdapter2.f3432f.setText(Utility.m4502g(pokerHistoryInfo.getLGetPopularity()));
                    gamePokerHistoryListAdapter2.f3432f.setTextColor(-5395027);
                } else {
                    gamePokerHistoryListAdapter2.f3432f.setText(Utility.m4502g(pokerHistoryInfo.getLGetPopularity()));
                    gamePokerHistoryListAdapter2.f3432f.setTextColor(-14519546);
                }
                i4 = Utility.m4508i(pokerHistoryInfo.getLSmallBlind());
                i5 = Utility.m4508i(pokerHistoryInfo.getLBigBlind());
                if (pokerHistoryInfo.getIAnte() != 0) {
                    gamePokerHistoryListAdapter2.f3433g.setText(i4 + "/" + i5 + "(" + pokerHistoryInfo.getIAnte() + ")");
                } else {
                    gamePokerHistoryListAdapter2.f3433g.setText(i4 + "/" + i5);
                }
                gamePokerHistoryListAdapter2.f3434h.setText(String.format(this.f3440d.getResources().getString(2131165830), new Object[]{Utility.m4502g(pokerHistoryInfo.getLMaxPot())}));
                gamePokerHistoryListAdapter2.f3435i.setText(String.format(this.f3440d.getResources().getString(2131165826), new Object[]{Long.valueOf(pokerHistoryInfo.getLHandID())}));
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                GamePokerHistoryListAdapter gamePokerHistoryListAdapter3;
                if (view == null) {
                    view = LayoutInflater.from(this.f3440d).inflate(2130968809, null);
                    GamePokerHistoryListAdapter gamePokerHistoryListAdapter4 = new GamePokerHistoryListAdapter(this);
                    gamePokerHistoryListAdapter4.f3412a = (TextView) view.findViewById(2131559328);
                    gamePokerHistoryListAdapter4.f3413b = (TextView) view.findViewById(2131559329);
                    gamePokerHistoryListAdapter4.f3414c = (TextView) view.findViewById(2131559330);
                    gamePokerHistoryListAdapter4.f3415d = (SimpleDraweeView) view.findViewById(2131558674);
                    gamePokerHistoryListAdapter4.f3417f = (TextView) view.findViewById(2131559332);
                    gamePokerHistoryListAdapter4.f3416e = (TextView) view.findViewById(2131559331);
                    view.setTag(gamePokerHistoryListAdapter4);
                    gamePokerHistoryListAdapter3 = gamePokerHistoryListAdapter4;
                } else {
                    gamePokerHistoryListAdapter3 = (GamePokerHistoryListAdapter) view.getTag();
                }
                BravoPokerHistoryInfo bravoPokerHistoryInfo = (BravoPokerHistoryInfo) this.f3438b.get(i2);
                switch (bravoPokerHistoryInfo.getIType()) {
                    case SQLiteDatabase.OPEN_READONLY /*1*/:
                        gamePokerHistoryListAdapter3.f3412a.setText(2131165815);
                        break;
                    case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                        gamePokerHistoryListAdapter3.f3412a.setText(2131165812);
                        break;
                    case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                        gamePokerHistoryListAdapter3.f3412a.setText(2131165813);
                        break;
                    case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                        gamePokerHistoryListAdapter3.f3412a.setText(2131165814);
                        break;
                }
                gamePokerHistoryListAdapter3.f3413b.setText(String.format(this.f3440d.getResources().getString(2131165830), new Object[]{Utility.m4502g(bravoPokerHistoryInfo.getLMaxPot())}));
                gamePokerHistoryListAdapter3.f3414c.setText(String.format(this.f3440d.getResources().getString(2131165826), new Object[]{Long.valueOf(bravoPokerHistoryInfo.getLHandID())}));
                ((GenericDraweeHierarchy) gamePokerHistoryListAdapter3.f3415d.getHierarchy()).m1407a(2130903198);
                gamePokerHistoryListAdapter3.f3415d.setImageURI(Uri.parse(bravoPokerHistoryInfo.getSSmallIcon()));
                gamePokerHistoryListAdapter3.f3416e.setText(bravoPokerHistoryInfo.getSNickName());
                gamePokerHistoryListAdapter3.f3417f.setText(bravoPokerHistoryInfo.getSDesc());
                break;
        }
        return view;
    }
}
