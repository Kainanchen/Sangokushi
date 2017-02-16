package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;

public interface TexasPoker$SCSendMsgRspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    CHAT_TYPE getETalkType();

    int getLCurrentSeq();

    long getLMsgId();

    long getLPicMsgId();

    long getLTalkwith();

    boolean hasEErrCode();

    boolean hasETalkType();

    boolean hasLCurrentSeq();

    boolean hasLMsgId();

    boolean hasLPicMsgId();

    boolean hasLTalkwith();
}
