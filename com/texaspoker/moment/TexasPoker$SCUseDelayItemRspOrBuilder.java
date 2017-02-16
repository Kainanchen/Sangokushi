package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCUseDelayItemRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    long getLBettingID();

    TexasPoker$UserGameInfoNet getStUserGameInfoNet();

    TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoNetOrBuilder();

    boolean hasEErrCode();

    boolean hasLBettingID();

    boolean hasStUserGameInfoNet();
}
