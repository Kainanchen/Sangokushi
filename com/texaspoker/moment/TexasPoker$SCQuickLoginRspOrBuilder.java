package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNetOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.GameItemInfo;
import com.texaspoker.moment.TexasPokerCommon.GameItemInfoOrBuilder;
import java.util.List;

public interface TexasPoker$SCQuickLoginRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

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

    boolean hasStDefaultSettingInfo();

    boolean hasStUserGameInfo();
}
