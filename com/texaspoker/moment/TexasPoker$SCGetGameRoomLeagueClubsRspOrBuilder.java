package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.util.List;

public interface TexasPoker$SCGetGameRoomLeagueClubsRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    long getLGameRoomID();

    ClubBaseInfo getVClubBaseInfos(int i);

    int getVClubBaseInfosCount();

    List<ClubBaseInfo> getVClubBaseInfosList();

    ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

    List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

    boolean hasEErrCode();

    boolean hasLGameRoomID();
}
