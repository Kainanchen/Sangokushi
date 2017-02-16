package com.texaspoker.moment;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCReconnectRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    int getIUploadLog();

    long getLCurrentSystemTime();

    String getSAccessToken();

    ByteString getSAccessTokenBytes();

    GameRoomInfo getStGameRoomInfo();

    GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

    TexasPoker$UserGameInfoNet getStUserGameInfo();

    TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoOrBuilder();

    boolean hasEErrCode();

    boolean hasIUploadLog();

    boolean hasLCurrentSystemTime();

    boolean hasSAccessToken();

    boolean hasStGameRoomInfo();

    boolean hasStUserGameInfo();
}
