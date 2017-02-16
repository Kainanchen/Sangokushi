package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCShowCardRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    long getLGameID();

    GameRoomInfo getStGameRoomInfo();

    GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

    boolean hasEErrCode();

    boolean hasLGameID();

    boolean hasStGameRoomInfo();
}
