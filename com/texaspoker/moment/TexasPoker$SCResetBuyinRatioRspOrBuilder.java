package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCResetBuyinRatioRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    GameRoomBaseInfo getStGameRoomBaseInfo();

    GameRoomBaseInfoOrBuilder getStGameRoomBaseInfoOrBuilder();

    boolean hasEErrCode();

    boolean hasStGameRoomBaseInfo();
}
