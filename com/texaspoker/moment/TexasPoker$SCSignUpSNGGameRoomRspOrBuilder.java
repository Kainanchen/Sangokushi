package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;

public interface TexasPoker$SCSignUpSNGGameRoomRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    GameRoomInfo getStGameRoomInfo();

    GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

    UserBaseInfoNet getStUserBaseInfoNet();

    UserBaseInfoNetOrBuilder getStUserBaseInfoNetOrBuilder();

    boolean hasEErrCode();

    boolean hasStGameRoomInfo();

    boolean hasStUserBaseInfoNet();
}
