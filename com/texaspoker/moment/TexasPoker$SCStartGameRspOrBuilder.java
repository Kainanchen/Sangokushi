package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCStartGameRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    long getLRoomID();

    long getLStartTime();

    boolean hasEErrCode();

    boolean hasLRoomID();

    boolean hasLStartTime();
}
