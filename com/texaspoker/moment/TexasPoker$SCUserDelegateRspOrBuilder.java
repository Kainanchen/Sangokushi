package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCUserDelegateRspOrBuilder extends MessageOrBuilder {
    int getBDelegate();

    ERROR_CODE_TYPE getEErrCode();

    long getLGameRoomID();

    boolean hasBDelegate();

    boolean hasEErrCode();

    boolean hasLGameRoomID();
}
