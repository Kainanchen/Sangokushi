package com.texaspoker.moment;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.SNG_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.util.List;

public interface TexasPoker$SNGGameRoomBaseInfoOrBuilder extends MessageOrBuilder {
    int getBBuyinControl();

    int getBGPSLimit();

    int getBIPLimit();

    int getBInGame();

    int getBLevelChanged();

    int getBPrivateRoom();

    int getBSignupInviting();

    int getBStarted();

    CREATE_ROOM_TYPE getECreateRoomType();

    SNG_ROOM_TYPE getESNGRoomtype();

    int getIAnte();

    int getIBlindInterval();

    int getICurrentLevel();

    int getIGameRoomUserMaxNums();

    int getIGameRoomUserNums();

    int getIMaxiLevel();

    int getIThinkingInterval();

    long getLBigBlinds();

    int getLCancelWaitInterval();

    long getLCreateTime();

    long getLFromRoomID();

    long getLGameRoomId();

    long getLLeagueID();

    long getLOriginalStacks();

    long getLPrepareTime();

    long getLSmallBlinds();

    long getLStartTime();

    String getSFromMsg();

    ByteString getSFromMsgBytes();

    String getSLeagueName();

    ByteString getSLeagueNameBytes();

    UserBaseInfoNet getStCreateUserBaseInfo();

    UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

    String getStrRoomName();

    ByteString getStrRoomNameBytes();

    long getVWinLadder(int i);

    int getVWinLadderCount();

    List<Long> getVWinLadderList();

    boolean hasBBuyinControl();

    boolean hasBGPSLimit();

    boolean hasBIPLimit();

    boolean hasBInGame();

    boolean hasBLevelChanged();

    boolean hasBPrivateRoom();

    boolean hasBSignupInviting();

    boolean hasBStarted();

    boolean hasECreateRoomType();

    boolean hasESNGRoomtype();

    boolean hasIAnte();

    boolean hasIBlindInterval();

    boolean hasICurrentLevel();

    boolean hasIGameRoomUserMaxNums();

    boolean hasIGameRoomUserNums();

    boolean hasIMaxiLevel();

    boolean hasIThinkingInterval();

    boolean hasLBigBlinds();

    boolean hasLCancelWaitInterval();

    boolean hasLCreateTime();

    boolean hasLFromRoomID();

    boolean hasLGameRoomId();

    boolean hasLLeagueID();

    boolean hasLOriginalStacks();

    boolean hasLPrepareTime();

    boolean hasLSmallBlinds();

    boolean hasLStartTime();

    boolean hasSFromMsg();

    boolean hasSLeagueName();

    boolean hasStCreateUserBaseInfo();

    boolean hasStrRoomName();
}
