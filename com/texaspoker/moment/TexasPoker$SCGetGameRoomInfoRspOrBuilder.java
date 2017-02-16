package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.util.List;

public interface TexasPoker$SCGetGameRoomInfoRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    GameRoomInfo getStGameRoomInfo(int i);

    int getStGameRoomInfoCount();

    List<GameRoomInfo> getStGameRoomInfoList();

    GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder(int i);

    List<? extends GameRoomInfoOrBuilder> getStGameRoomInfoOrBuilderList();

    boolean hasEErrCode();
}
