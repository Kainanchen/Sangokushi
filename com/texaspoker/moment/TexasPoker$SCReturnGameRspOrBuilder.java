package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCReturnGameRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    long getLGameRoomID();

    boolean hasEErrCode();

    boolean hasLGameRoomID();
}
