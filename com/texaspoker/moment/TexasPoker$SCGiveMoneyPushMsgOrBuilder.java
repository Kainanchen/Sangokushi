package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.GiveMoneyPushMsg;
import com.texaspoker.moment.TexasPoker.GiveMoneyPushMsgOrBuilder;
import java.util.List;

public interface TexasPoker$SCGiveMoneyPushMsgOrBuilder extends MessageOrBuilder {
    GiveMoneyPushMsg getVMsgs(int i);

    int getVMsgsCount();

    List<GiveMoneyPushMsg> getVMsgsList();

    GiveMoneyPushMsgOrBuilder getVMsgsOrBuilder(int i);

    List<? extends GiveMoneyPushMsgOrBuilder> getVMsgsOrBuilderList();
}
