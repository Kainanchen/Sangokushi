package net.p001a.p002a;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.hp.hpl.sparta.Document;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;

/* renamed from: net.a.a.e */
final class C0389e {
    Document f367a;

    /* renamed from: net.a.a.e.a */
    private static class C0388a {
        static final C0389e f366a;

        static {
            f366a = new C0389e((byte) 0);
        }
    }

    static {
        fixHelper.fixfunc(new int[]{TEXAS_CMD.Cmd_SCWatchSNGGameRoomRsp_VALUE, TEXAS_CMD.Cmd_SCLeaveSNGGameRoomRsp_VALUE});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native C0389e();

    native C0389e(byte b);
}
