package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCGetGameSettingRspOrBuilder extends MessageOrBuilder {
    int getBNotBuyInsurance();

    ERROR_CODE_TYPE getEErrCode();

    long getLGameRoomID();

    boolean hasBNotBuyInsurance();

    boolean hasEErrCode();

    boolean hasLGameRoomID();
}
