package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCSetChatInfoSettingRspOrBuilder extends MessageOrBuilder {
    long getChatUuid();

    CHAT_TYPE getEChatType();

    ERROR_CODE_TYPE getEErrCode();

    int getIMute();

    int getIVibrate();

    long getLRoomID();

    boolean hasChatUuid();

    boolean hasEChatType();

    boolean hasEErrCode();

    boolean hasIMute();

    boolean hasIVibrate();

    boolean hasLRoomID();
}
