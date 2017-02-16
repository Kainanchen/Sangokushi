package com.texaspoker.moment;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNetOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;

public interface TexasPoker$SCLoginThirdPartyRspOrBuilder extends MessageOrBuilder {
    int getBNewUser();

    ERROR_CODE_TYPE getEErrCode();

    String getSAccessToken();

    ByteString getSAccessTokenBytes();

    String getSEncryptKey();

    ByteString getSEncryptKeyBytes();

    DefaultSettingInfoNet getStDefaultSettingInfo();

    DefaultSettingInfoNetOrBuilder getStDefaultSettingInfoOrBuilder();

    UserBaseInfoNet getStUserBaseInfo();

    UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

    boolean hasBNewUser();

    boolean hasEErrCode();

    boolean hasSAccessToken();

    boolean hasSEncryptKey();

    boolean hasStDefaultSettingInfo();

    boolean hasStUserBaseInfo();
}
