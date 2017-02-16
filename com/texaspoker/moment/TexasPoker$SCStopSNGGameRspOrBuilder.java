package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCStopSNGGameRspOrBuilder extends MessageOrBuilder {
    long getBStop();

    ERROR_CODE_TYPE getEErrCode();

    boolean hasBStop();

    boolean hasEErrCode();
}
