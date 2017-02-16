package com.illuminate.texaspoker.activity;

import a.does.not.Exists2;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.ali.fixHelper;
import com.illuminate.texaspoker.p055a.FriendSearchResultListAdapter;
import com.illuminate.texaspoker.p057b.DBManager;
import com.illuminate.texaspoker.utils.SharedPreferencesManager;
import com.texaspoker.moment.TexasPokerHttpUser.FRIEND_MESSAGE_TYPE;
import com.texaspoker.moment.TexasPokerHttpUser.FriendPushMsg;
import com.texaspoker.moment.TexasPokerHttpUser.UserFriendInfoNet;
import java.util.ArrayList;
import java.util.List;

public class FriendSearchResultActivity extends BaseToolBarActivity {
    private static String f4489d;
    private List<UserFriendInfoNet> f4490e;
    private FriendSearchResultListAdapter f4491f;

    /* renamed from: com.illuminate.texaspoker.activity.FriendSearchResultActivity.1 */
    class C06271 implements OnClickListener {
        final /* synthetic */ FriendSearchResultActivity f4487a;

        static {
            fixHelper.fixfunc(new int[]{2971, 2972});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06271(FriendSearchResultActivity friendSearchResultActivity);

        public final native void onClick(View view);
    }

    /* renamed from: com.illuminate.texaspoker.activity.FriendSearchResultActivity.2 */
    class C06282 implements OnItemClickListener {
        final /* synthetic */ FriendSearchResultActivity f4488a;

        static {
            fixHelper.fixfunc(new int[]{2939, 2940});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native C06282(FriendSearchResultActivity friendSearchResultActivity);

        public final native void onItemClick(AdapterView<?> adapterView, View view, int i, long j);
    }

    static {
        f4489d = "FriendSearchResultActivity";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130968640);
        Toolbar toolbar = (Toolbar) findViewById(2131558769);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextAppearance(this, 2131296567);
            toolbar.setNavigationIcon(2130837591);
            toolbar.setNavigationOnClickListener(new C06271(this));
        }
        this.f4490e = new ArrayList((List) getIntent().getSerializableExtra("search_result"));
        ListView listView = (ListView) findViewById(2131558733);
        this.f4491f = new FriendSearchResultListAdapter(this, this.f4490e);
        if (listView != null) {
            listView.setAdapter(this.f4491f);
            listView.setOnItemClickListener(new C06282(this));
        }
        this.f4491f.notifyDataSetChanged();
    }

    protected void onResume() {
        super.onResume();
        m3125a();
    }

    private void m3125a() {
        if (!DBManager.m3631a().m3632b()) {
            this.f4491f.notifyDataSetChanged();
        }
    }

    protected final void m3127a(String str, List<Object> list) {
        if (str.equalsIgnoreCase("NOTIFY_REFRESH_NEW_FRIEND")) {
            for (FriendPushMsg friendPushMsg : (List) list.get(0)) {
                for (UserFriendInfoNet userFriendInfoNet : this.f4490e) {
                    if (friendPushMsg.getEFriendMessageType() == FRIEND_MESSAGE_TYPE.FRIEND_MESSAGE_ACCEPT_FRIEND) {
                        if (userFriendInfoNet.getStUserBaseInfo().getUuid() == friendPushMsg.getStFromUser().getUuid()) {
                            this.f4490e.remove(userFriendInfoNet);
                            break;
                        }
                    }
                    break;
                }
            }
            m3125a();
        }
    }

    static /* synthetic */ void m3126a(FriendSearchResultActivity friendSearchResultActivity, long j) {
        if (j != SharedPreferencesManager.m4308b()) {
            Intent intent = new Intent(friendSearchResultActivity, FriendInfoActivity.class);
            intent.putExtra("friendUuid", j);
            friendSearchResultActivity.startActivity(intent);
        }
    }
}
