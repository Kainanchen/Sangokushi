package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.util.List;

public interface TexasPoker$SCShowTableCardsRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    long getLGameHandID();

    long getLGameRoomID();

    long getVTableCards(int i);

    int getVTableCardsCount();

    List<Long> getVTableCardsList();

    boolean hasEErrCode();

    boolean hasLGameHandID();

    boolean hasLGameRoomID();
}
