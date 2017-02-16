package com.texaspoker.moment;

import com.google.protobuf.MessageOrBuilder;
import com.texaspoker.moment.TexasPoker.RecommendUserInfo;
import com.texaspoker.moment.TexasPoker.RecommendUserInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.BannerInfo;
import com.texaspoker.moment.TexasPokerCommon.BannerInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.util.List;

public interface TexasPoker$SCGetFrontPageInfoV2RspOrBuilder extends MessageOrBuilder {
    ERROR_CODE_TYPE getEErrCode();

    int getIOffset();

    BannerInfo getVBannerInfos(int i);

    int getVBannerInfosCount();

    List<BannerInfo> getVBannerInfosList();

    BannerInfoOrBuilder getVBannerInfosOrBuilder(int i);

    List<? extends BannerInfoOrBuilder> getVBannerInfosOrBuilderList();

    ClubBaseInfo getVRecommendClubBaseInfos(int i);

    int getVRecommendClubBaseInfosCount();

    List<ClubBaseInfo> getVRecommendClubBaseInfosList();

    ClubBaseInfoOrBuilder getVRecommendClubBaseInfosOrBuilder(int i);

    List<? extends ClubBaseInfoOrBuilder> getVRecommendClubBaseInfosOrBuilderList();

    RecommendUserInfo getVRecommendUserInfos(int i);

    int getVRecommendUserInfosCount();

    List<RecommendUserInfo> getVRecommendUserInfosList();

    RecommendUserInfoOrBuilder getVRecommendUserInfosOrBuilder(int i);

    List<? extends RecommendUserInfoOrBuilder> getVRecommendUserInfosOrBuilderList();

    UserBaseInfoNet getVUserBaseInfos(int i);

    int getVUserBaseInfosCount();

    List<UserBaseInfoNet> getVUserBaseInfosList();

    UserBaseInfoNetOrBuilder getVUserBaseInfosOrBuilder(int i);

    List<? extends UserBaseInfoNetOrBuilder> getVUserBaseInfosOrBuilderList();

    boolean hasEErrCode();

    boolean hasIOffset();
}
