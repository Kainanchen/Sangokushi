package com.texaspoker.moment;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCResetPwdVerifyCodeRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    String getSNewPassword();

    ByteString getSNewPasswordBytes();

    boolean hasEErrCode();

    boolean hasSNewPassword();
}
