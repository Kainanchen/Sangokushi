package com.texaspoker.moment;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNetOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.GameItemInfo;
import com.texaspoker.moment.TexasPokerCommon.GameItemInfoOrBuilder;
import java.util.List;

public interface TexasPoker$SCLoginRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    String getSAccessToken();

    ByteString getSAccessTokenBytes();

    String getSEncryptKey();

    ByteString getSEncryptKeyBytes();

    DefaultSettingInfoNet getStDefaultSettingInfo();

    DefaultSettingInfoNetOrBuilder getStDefaultSettingInfoOrBuilder();

    GameItemInfo getStGameItemInfo(int i);

    int getStGameItemInfoCount();

    List<GameItemInfo> getStGameItemInfoList();

    GameItemInfoOrBuilder getStGameItemInfoOrBuilder(int i);

    List<? extends GameItemInfoOrBuilder> getStGameItemInfoOrBuilderList();

    TexasPoker$UserGameInfoNet getStUserGameInfo();

    TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoOrBuilder();

    boolean hasEErrCode();

    boolean hasSAccessToken();

    boolean hasSEncryptKey();

    boolean hasStDefaultSettingInfo();

    boolean hasStUserGameInfo();
}
