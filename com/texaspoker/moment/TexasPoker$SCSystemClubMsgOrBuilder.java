package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.ClubPushMsg;
import com.texaspoker.moment.TexasPoker.ClubPushMsgOrBuilder;
import java.util.List;

public interface TexasPoker$SCSystemClubMsgOrBuilder extends MessageOrBuilder {
    ClubPushMsg getVMsgs(int i);

    int getVMsgsCount();

    List<ClubPushMsg> getVMsgsList();

    ClubPushMsgOrBuilder getVMsgsOrBuilder(int i);

    List<? extends ClubPushMsgOrBuilder> getVMsgsOrBuilderList();
}
