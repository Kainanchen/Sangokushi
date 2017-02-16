package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.PushMsg;
import com.texaspoker.moment.TexasPoker.PushMsgOrBuilder;
import java.util.List;

public interface TexasPoker$SCPushMsgOrBuilder extends MessageOrBuilder {
    PushMsg getVMsgs(int i);

    int getVMsgsCount();

    List<PushMsg> getVMsgsList();

    PushMsgOrBuilder getVMsgsOrBuilder(int i);

    List<? extends PushMsgOrBuilder> getVMsgsOrBuilderList();
}
