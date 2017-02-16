package com.illuminate.texaspoker.utils;

import android.support.v4.view.PointerIconCompat;
import android.widget.Toast;
import com.google.protobuf.ByteString;
import com.illuminate.texaspoker.application.BaseApplication;
import com.illuminate.texaspoker.tea.TEAUtil;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import com.texaspoker.moment.TexasPokerCommon.Header;
import com.texaspoker.moment.TexasPokerCommon.ID_TYPE;
import com.texaspoker.moment.TexasPokerCommon.Package;
import com.texaspoker.moment.TexasPokerCommon.Package.Builder;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import java.io.UnsupportedEncodingException;
import java.util.Random;

/* renamed from: com.illuminate.texaspoker.utils.l */
public final class TCPUtil {
    public static Package m4465a(long j, ByteString byteString, TEXAS_CMD texas_cmd, long j2) {
        Builder newBuilder = Package.newBuilder();
        long currentTimeMillis = System.currentTimeMillis();
        long nextInt = (currentTimeMillis / 1000) + ((long) new Random().nextInt(PointerIconCompat.TYPE_DEFAULT));
        NetworkUtil.f6566a = currentTimeMillis;
        RuntimeData.f6679j.put(Long.valueOf(j2), Long.valueOf(currentTimeMillis));
        newBuilder.setUuid(j);
        newBuilder.setISeqNo(j2);
        newBuilder.setECmd(texas_cmd);
        newBuilder.setCEncodeType(0);
        newBuilder.setHead(TCPUtil.m4464a().toByteString());
        newBuilder.setVersion(240500);
        if (texas_cmd != TEXAS_CMD.Cmd_CSUpdate) {
            String str;
            byte[] f;
            Toast makeText;
            if (texas_cmd == TEXAS_CMD.Cmd_CSLogin || texas_cmd == TEXAS_CMD.Cmd_CSLoginThirdParty || texas_cmd == TEXAS_CMD.Cmd_CSRegister || texas_cmd == TEXAS_CMD.Cmd_CSUploadVerifyCode || texas_cmd == TEXAS_CMD.Cmd_CSRegetVerifyCode || texas_cmd == TEXAS_CMD.Cmd_CSResetPwdUploadPhonenumber || texas_cmd == TEXAS_CMD.Cmd_CSResetPwdVerifyCode || texas_cmd == TEXAS_CMD.Cmd_CSHello || texas_cmd == TEXAS_CMD.Cmd_CSHelloGame || texas_cmd == TEXAS_CMD.Cmd_CSReconnect || texas_cmd == TEXAS_CMD.Cmd_CSGetFlashPageInfos || texas_cmd == TEXAS_CMD.Cmd_CSGetFestivalMode) {
                str = null;
            } else {
                f = Utility.m4501f(SharedPreferencesManager.m4295Z());
                if (f != null) {
                    try {
                        str = new String(TEAUtil.m4068a().decode(null, f, BaseApplication.m3548a()), GameManager.DEFAULT_CHARSET);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                        str = null;
                    }
                } else {
                    makeText = Toast.makeText(BaseApplication.m3548a(), 2131165453, 1);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                    return null;
                }
            }
            f = TEAUtil.m4068a().encode(str, byteString.toByteArray(), BaseApplication.m3548a());
            if (f == null) {
                makeText = Toast.makeText(BaseApplication.m3548a(), 2131165453, 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
                return null;
            }
            newBuilder.setBody(ByteString.copyFrom(f));
        } else {
            newBuilder.setBody(ByteString.copyFrom(byteString.toByteArray()));
        }
        newBuilder.setLMisSystemTime(nextInt);
        Package build = newBuilder.build();
        newBuilder.clear();
        return build;
    }

    private static Header m4464a() {
        Header.Builder newBuilder = Header.newBuilder();
        newBuilder.setShVer(240500);
        newBuilder.setLCurrTime(System.currentTimeMillis());
        UserBaseInfoNet.Builder newBuilder2 = UserBaseInfoNet.newBuilder();
        newBuilder2.setUuid(SharedPreferencesManager.m4308b());
        if (SharedPreferencesManager.m4389m() == 0) {
            newBuilder2.setEType(ID_TYPE.ID_TYPE_NA);
        } else {
            newBuilder2.setEType(ID_TYPE.valueOf(SharedPreferencesManager.m4389m()));
        }
        newBuilder2.setStrID(LetterIndexBar.SEARCH_ICON_LETTER);
        newBuilder2.setStrCover(LetterIndexBar.SEARCH_ICON_LETTER);
        UserBaseInfoNet build = newBuilder2.build();
        newBuilder2.clear();
        newBuilder.setStUserInfo(build);
        if (!StringUtils.m4462a(SharedPreferencesManager.aa())) {
            byte[] f = Utility.m4501f(SharedPreferencesManager.aa());
            if (f != null) {
                try {
                    newBuilder.setSAccessToken(new String(TEAUtil.m4068a().decode(null, f, BaseApplication.m3548a()), GameManager.DEFAULT_CHARSET));
                } catch (Exception e) {
                    e.printStackTrace();
                    newBuilder.setSAccessToken(LetterIndexBar.SEARCH_ICON_LETTER);
                }
            } else {
                newBuilder.setSAccessToken(LetterIndexBar.SEARCH_ICON_LETTER);
            }
        }
        Header build2 = newBuilder.build();
        newBuilder.clear();
        return build2;
    }
}
