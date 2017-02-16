package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.util.List;

public interface TexasPoker$UserGameInfoNetOrBuilder extends MessageOrBuilder {
    int getBBuyin();

    int getBDelegate();

    int getBGameDealer();

    int getBJustSit();

    int getBKickedInGame();

    int getBShowCardFour();

    int getBShowCardOne();

    int getBShowCardThree();

    int getBShowCardTwo();

    int getBWaitBB();

    int getBWaitingBuyinConfirmation();

    TexasPoker$USER_GAME_ROLE getEGameRole();

    TexasPoker$USER_GAME_STATE getEGameState();

    int getIDelayCost();

    long getIDelayLong();

    int getIDelaySingleTime();

    int getIDelayTotalTimes();

    int getISNGRank();

    long getLActTime();

    long getLBetStacks();

    long getLBettingID();

    long getLBuyinClubID();

    int getLBuyinStacks();

    long getLBuyinTime();

    long getLRemainStacks();

    long getLRoomId();

    UserBaseInfoNet getStUserInfo();

    UserBaseInfoNetOrBuilder getStUserInfoOrBuilder();

    int getVCurrentHands(int i);

    int getVCurrentHandsCount();

    List<Integer> getVCurrentHandsList();

    boolean hasBBuyin();

    boolean hasBDelegate();

    boolean hasBGameDealer();

    boolean hasBJustSit();

    boolean hasBKickedInGame();

    boolean hasBShowCardFour();

    boolean hasBShowCardOne();

    boolean hasBShowCardThree();

    boolean hasBShowCardTwo();

    boolean hasBWaitBB();

    boolean hasBWaitingBuyinConfirmation();

    boolean hasEGameRole();

    boolean hasEGameState();

    boolean hasIDelayCost();

    boolean hasIDelayLong();

    boolean hasIDelaySingleTime();

    boolean hasIDelayTotalTimes();

    boolean hasISNGRank();

    boolean hasLActTime();

    boolean hasLBetStacks();

    boolean hasLBettingID();

    boolean hasLBuyinClubID();

    boolean hasLBuyinStacks();

    boolean hasLBuyinTime();

    boolean hasLRemainStacks();

    boolean hasLRoomId();

    boolean hasStUserInfo();
}
