package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNetOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCGetDefaultSettingRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    DefaultSettingInfoNet getStDefaultSettingInfo();

    DefaultSettingInfoNetOrBuilder getStDefaultSettingInfoOrBuilder();

    boolean hasEErrCode();

    boolean hasStDefaultSettingInfo();
}
