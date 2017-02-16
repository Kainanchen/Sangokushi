package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCUserInsuranceSettingRspOrBuilder extends MessageOrBuilder {
    int getBDefaultInsurance();

    ERROR_CODE_TYPE getEErrCode();

    long getLGameRoomID();

    boolean hasBDefaultInsurance();

    boolean hasEErrCode();

    boolean hasLGameRoomID();
}
