package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface TexasPoker$SCSystemMsgOrBuilder extends MessageOrBuilder {
    TexasPoker$SystemPushMsg getVMsgs(int i);

    int getVMsgsCount();

    List<TexasPoker$SystemPushMsg> getVMsgsList();

    TexasPoker$SystemPushMsgOrBuilder getVMsgsOrBuilder(int i);

    List<? extends TexasPoker$SystemPushMsgOrBuilder> getVMsgsOrBuilderList();
}
