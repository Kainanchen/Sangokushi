package com.texaspoker.moment;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCUseItemRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    long getLCoin();

    int getLItemID();

    long getLMsgID();

    long getLPopularity();

    long getLRoomID();

    String getSExtra();

    ByteString getSExtraBytes();

    long getTouuid();

    boolean hasEErrCode();

    boolean hasLCoin();

    boolean hasLItemID();

    boolean hasLMsgID();

    boolean hasLPopularity();

    boolean hasLRoomID();

    boolean hasSExtra();

    boolean hasTouuid();
}
