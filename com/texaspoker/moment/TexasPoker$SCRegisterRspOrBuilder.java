package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCRegisterRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    boolean hasEErrCode();
}
