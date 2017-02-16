package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCKickUserGameRoomRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    long getLKickOffUuid();

    long getLRoomID();

    boolean hasEErrCode();

    boolean hasLKickOffUuid();

    boolean hasLRoomID();
}
