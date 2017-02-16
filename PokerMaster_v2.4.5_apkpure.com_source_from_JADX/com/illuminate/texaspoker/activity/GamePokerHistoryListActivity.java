package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.GamePokerHistoryListAdapter;
import com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo;
import java.util.List;

public class GamePokerHistoryListActivity extends BaseToolBarActivity {
    private static String f4495d;
    private long f4496e;
    private List<Integer> f4497f;
    private List<BravoPokerHistoryInfo> f4498g;
    private List<PokerHistoryInfo> f4499h;
    private View f4500i;
    private GamePokerHistoryListAdapter f4501j;
    private ExpandableListView f4502k;

    /* renamed from: com.illuminate.texaspoker.activity.GamePokerHistoryListActivity.1 */
    class C06291 implements OnClickListener {
        final /* synthetic */ GamePokerHistoryListActivity f4492a;

        static {
            fixHelper.fixfunc(new int[]{3446, 3447});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06291(GamePokerHistoryListActivity gamePokerHistoryListActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.GamePokerHistoryListActivity.2 */
    class C06302 implements OnGroupClickListener {
        final /* synthetic */ GamePokerHistoryListActivity f4493a;

        static {
            fixHelper.fixfunc(new int[]{3427, 3428});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06302(GamePokerHistoryListActivity gamePokerHistoryListActivity);

        public final native boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j);
    }

    /* renamed from: com.illuminate.texaspoker.activity.GamePokerHistoryListActivity.3 */
    class C06313 implements OnChildClickListener {
        final /* synthetic */ GamePokerHistoryListActivity f4494a;

        static {
            fixHelper.fixfunc(new int[]{3414, 3415});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06313(GamePokerHistoryListActivity gamePokerHistoryListActivity);

        public final native boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j);
    }

    static {
        fixHelper.fixfunc(new int[]{2273, 2274, 2275, 2276, 2277, 2278});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native void m3129a();

    protected final native void m3134a(String str, List<Object> list);

    protected native void onCreate(Bundle bundle);

    protected native void onResume();

    protected native void onStop();

    static void __clinit__() {
        f4495d = "GamePokerHistoryListActivity";
    }

    static /* synthetic */ void m3130a(GamePokerHistoryListActivity gamePokerHistoryListActivity, BravoPokerHistoryInfo bravoPokerHistoryInfo) {
        Intent intent = new Intent(gamePokerHistoryListActivity, PlayPokerHistoryActivity.class);
        intent.putExtra("from", PlayPokerHistoryActivity.f4813d);
        intent.putExtra("pokerHistoryShareUrl", bravoPokerHistoryInfo.getSPokerHistoryShareUrl());
        intent.putExtra("pokerHistoryUrl", bravoPokerHistoryInfo.getSPokerHistoryUrl());
        intent.putExtra("lSaveUuid", bravoPokerHistoryInfo.getLSaveUuid());
        intent.putExtra("lRoomId", bravoPokerHistoryInfo.getLRoomID());
        intent.putExtra("lHandId", bravoPokerHistoryInfo.getLHandID());
        if (bravoPokerHistoryInfo.getVHandCardsCount() == 4) {
            intent.putExtra("isOmaha", true);
            if (bravoPokerHistoryInfo.getVHandCards(2) < 0 || bravoPokerHistoryInfo.getVHandCards(2) > 51) {
                intent.putExtra("iPoker3", -1);
            } else {
                intent.putExtra("iPoker3", bravoPokerHistoryInfo.getVHandCards(2));
            }
            if (bravoPokerHistoryInfo.getVHandCards(3) < 0 || bravoPokerHistoryInfo.getVHandCards(3) > 51) {
                intent.putExtra("iPoker4", -1);
            } else {
                intent.putExtra("iPoker4", bravoPokerHistoryInfo.getVHandCards(3));
            }
        } else {
            intent.putExtra("isOmaha", false);
        }
        if (bravoPokerHistoryInfo.getVHandCards(0) < 0 || bravoPokerHistoryInfo.getVHandCards(0) > 51) {
            intent.putExtra("iPoker1", -1);
        } else {
            intent.putExtra("iPoker1", bravoPokerHistoryInfo.getVHandCards(0));
        }
        if (bravoPokerHistoryInfo.getVHandCards(1) < 0 || bravoPokerHistoryInfo.getVHandCards(1) > 51) {
            intent.putExtra("iPoker2", -1);
        } else {
            intent.putExtra("iPoker2", bravoPokerHistoryInfo.getVHandCards(1));
        }
        gamePokerHistoryListActivity.startActivity(intent);
    }

    static /* synthetic */ void m3131a(GamePokerHistoryListActivity gamePokerHistoryListActivity, PokerHistoryInfo pokerHistoryInfo) {
        Intent intent = new Intent(gamePokerHistoryListActivity, PlayPokerHistoryActivity.class);
        intent.putExtra("from", PlayPokerHistoryActivity.f4813d);
        intent.putExtra("pokerHistoryShareUrl", pokerHistoryInfo.getSPokerHistoryShareUrl());
        intent.putExtra("pokerHistoryUrl", pokerHistoryInfo.getSPokerHistoryUrl());
        intent.putExtra("lSaveUuid", pokerHistoryInfo.getLSaveUuid());
        intent.putExtra("lRoomId", pokerHistoryInfo.getLRoomID());
        intent.putExtra("lHandId", pokerHistoryInfo.getLHandID());
        if (pokerHistoryInfo.getVHandCardsCount() == 4) {
            intent.putExtra("isOmaha", true);
            if (pokerHistoryInfo.getVHandCards(2) < 0 || pokerHistoryInfo.getVHandCards(2) > 51) {
                intent.putExtra("iPoker3", -1);
            } else {
                intent.putExtra("iPoker3", pokerHistoryInfo.getVHandCards(2));
            }
            if (pokerHistoryInfo.getVHandCards(3) < 0 || pokerHistoryInfo.getVHandCards(3) > 51) {
                intent.putExtra("iPoker4", -1);
            } else {
                intent.putExtra("iPoker4", pokerHistoryInfo.getVHandCards(3));
            }
        } else {
            intent.putExtra("isOmaha", false);
        }
        if (pokerHistoryInfo.getVHandCards(0) < 0 || pokerHistoryInfo.getVHandCards(0) > 51) {
            intent.putExtra("iPoker1", -1);
        } else {
            intent.putExtra("iPoker1", pokerHistoryInfo.getVHandCards(0));
        }
        if (pokerHistoryInfo.getVHandCards(1) < 0 || pokerHistoryInfo.getVHandCards(1) > 51) {
            intent.putExtra("iPoker2", -1);
        } else {
            intent.putExtra("iPoker2", pokerHistoryInfo.getVHandCards(1));
        }
        gamePokerHistoryListActivity.startActivity(intent);
    }
}
