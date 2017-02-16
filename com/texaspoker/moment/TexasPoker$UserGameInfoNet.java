package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.BuilderParent;
import com.google.protobuf.GeneratedMessage.FieldAccessorTable;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$UserGameInfoNet extends GeneratedMessage implements TexasPoker$UserGameInfoNetOrBuilder {
    public static final int BBUYIN_FIELD_NUMBER = 6;
    public static final int BDELEGATE_FIELD_NUMBER = 22;
    public static final int BGAMEDEALER_FIELD_NUMBER = 9;
    public static final int BJUSTSIT_FIELD_NUMBER = 24;
    public static final int BKICKEDINGAME_FIELD_NUMBER = 27;
    public static final int BSHOWCARDFOUR_FIELD_NUMBER = 26;
    public static final int BSHOWCARDONE_FIELD_NUMBER = 15;
    public static final int BSHOWCARDTHREE_FIELD_NUMBER = 25;
    public static final int BSHOWCARDTWO_FIELD_NUMBER = 16;
    public static final int BWAITBB_FIELD_NUMBER = 23;
    public static final int BWAITINGBUYINCONFIRMATION_FIELD_NUMBER = 19;
    public static final int EGAMEROLE_FIELD_NUMBER = 3;
    public static final int EGAMESTATE_FIELD_NUMBER = 2;
    public static final int IDELAYCOST_FIELD_NUMBER = 13;
    public static final int IDELAYLONG_FIELD_NUMBER = 12;
    public static final int IDELAYSINGLETIME_FIELD_NUMBER = 14;
    public static final int IDELAYTOTALTIMES_FIELD_NUMBER = 10;
    public static final int ISNGRANK_FIELD_NUMBER = 21;
    public static final int LACTTIME_FIELD_NUMBER = 11;
    public static final int LBETSTACKS_FIELD_NUMBER = 7;
    public static final int LBETTINGID_FIELD_NUMBER = 17;
    public static final int LBUYINCLUBID_FIELD_NUMBER = 28;
    public static final int LBUYINSTACKS_FIELD_NUMBER = 18;
    public static final int LBUYINTIME_FIELD_NUMBER = 20;
    public static final int LREMAINSTACKS_FIELD_NUMBER = 5;
    public static final int LROOMID_FIELD_NUMBER = 4;
    public static Parser<TexasPoker$UserGameInfoNet> PARSER = null;
    public static final int STUSERINFO_FIELD_NUMBER = 1;
    public static final int VCURRENTHANDS_FIELD_NUMBER = 8;
    private static final TexasPoker$UserGameInfoNet defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bBuyin_;
    private int bDelegate_;
    private int bGameDealer_;
    private int bJustSit_;
    private int bKickedInGame_;
    private int bShowCardFour_;
    private int bShowCardOne_;
    private int bShowCardThree_;
    private int bShowCardTwo_;
    private int bWaitBB_;
    private int bWaitingBuyinConfirmation_;
    private int bitField0_;
    private TexasPoker$USER_GAME_ROLE eGameRole_;
    private TexasPoker$USER_GAME_STATE eGameState_;
    private int iDelayCost_;
    private long iDelayLong_;
    private int iDelaySingleTime_;
    private int iDelayTotalTimes_;
    private int iSNGRank_;
    private long lActTime_;
    private long lBetStacks_;
    private long lBettingID_;
    private long lBuyinClubID_;
    private int lBuyinStacks_;
    private long lBuyinTime_;
    private long lRemainStacks_;
    private long lRoomId_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private UserBaseInfoNet stUserInfo_;
    private final UnknownFieldSet unknownFields;
    private List<Integer> vCurrentHands_;

    /* renamed from: com.texaspoker.moment.TexasPoker.UserGameInfoNet.1 */
    class C00801 extends AbstractParser<TexasPoker$UserGameInfoNet> {
        static {
            fixHelper.fixfunc(new int[]{17772, 17773});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00801();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.UserGameInfoNet.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$UserGameInfoNetOrBuilder {
        private int bBuyin_;
        private int bDelegate_;
        private int bGameDealer_;
        private int bJustSit_;
        private int bKickedInGame_;
        private int bShowCardFour_;
        private int bShowCardOne_;
        private int bShowCardThree_;
        private int bShowCardTwo_;
        private int bWaitBB_;
        private int bWaitingBuyinConfirmation_;
        private int bitField0_;
        private TexasPoker$USER_GAME_ROLE eGameRole_;
        private TexasPoker$USER_GAME_STATE eGameState_;
        private int iDelayCost_;
        private long iDelayLong_;
        private int iDelaySingleTime_;
        private int iDelayTotalTimes_;
        private int iSNGRank_;
        private long lActTime_;
        private long lBetStacks_;
        private long lBettingID_;
        private long lBuyinClubID_;
        private int lBuyinStacks_;
        private long lBuyinTime_;
        private long lRemainStacks_;
        private long lRoomId_;
        private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stUserInfoBuilder_;
        private UserBaseInfoNet stUserInfo_;
        private List<Integer> vCurrentHands_;

        static {
            fixHelper.fixfunc(new int[]{10507, 10508, 10509, 10510, 10511, 10512, 10513, 10514, 10515, 10516, 10517, 10518, 10519, 10520, 10521, 10522, 10523, 10524, 10525, 10526, 10527, 10528, 10529, 10530, 10531, 10532, 10533, 10534, 10535, 10536, 10537, 10538, 10539, 10540, 10541, 10542, 10543, 10544, 10545, 10546, 10547, 10548, 10549, 10550, 10551, 10552, 10553, 10554, 10555, 10556, 10557, 10558, 10559, 10560, 10561, 10562, 10563, 10564, 10565, 10566, 10567, 10568, 10569, 10570, 10571, 10572, 10573, 10574, 10575, 10576, 10577, 10578, 10579, 10580, 10581, 10582, 10583, 10584, 10585, 10586, 10587, 10588, 10589, 10590, 10591, 10592, 10593, 10594, 10595, 10596, 10597, 10598, 10599, 10600, 10601, 10602, 10603, 10604, 10605, 10606, 10607, 10608, 10609, 10610, 10611, 10612, 10613, 10614, 10615, 10616, 10617, 10618, 10619, 10620, 10621, 10622, 10623, 10624, 10625, 10626, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10649, 10650, 10651, 10652, 10653, 10654, 10655, 10656, 10657, 10658, 10659});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVCurrentHandsIsMutable();

        private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStUserInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVCurrentHands(Iterable<? extends Integer> iterable);

        public final native Builder addVCurrentHands(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1389build();

        public final native TexasPoker$UserGameInfoNet m1390build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1391buildPartial();

        public final native TexasPoker$UserGameInfoNet m1392buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1393clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1394clear();

        public final native Builder m1395clear();

        public final native Builder clearBBuyin();

        public final native Builder clearBDelegate();

        public final native Builder clearBGameDealer();

        public final native Builder clearBJustSit();

        public final native Builder clearBKickedInGame();

        public final native Builder clearBShowCardFour();

        public final native Builder clearBShowCardOne();

        public final native Builder clearBShowCardThree();

        public final native Builder clearBShowCardTwo();

        public final native Builder clearBWaitBB();

        public final native Builder clearBWaitingBuyinConfirmation();

        public final native Builder clearEGameRole();

        public final native Builder clearEGameState();

        public final native Builder clearIDelayCost();

        public final native Builder clearIDelayLong();

        public final native Builder clearIDelaySingleTime();

        public final native Builder clearIDelayTotalTimes();

        public final native Builder clearISNGRank();

        public final native Builder clearLActTime();

        public final native Builder clearLBetStacks();

        public final native Builder clearLBettingID();

        public final native Builder clearLBuyinClubID();

        public final native Builder clearLBuyinStacks();

        public final native Builder clearLBuyinTime();

        public final native Builder clearLRemainStacks();

        public final native Builder clearLRoomId();

        public final native Builder clearStUserInfo();

        public final native Builder clearVCurrentHands();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1396clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1397clone();

        public final native Builder m1398clone();

        public final native int getBBuyin();

        public final native int getBDelegate();

        public final native int getBGameDealer();

        public final native int getBJustSit();

        public final native int getBKickedInGame();

        public final native int getBShowCardFour();

        public final native int getBShowCardOne();

        public final native int getBShowCardThree();

        public final native int getBShowCardTwo();

        public final native int getBWaitBB();

        public final native int getBWaitingBuyinConfirmation();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1399getDefaultInstanceForType();

        public final native TexasPoker$UserGameInfoNet m1400getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native TexasPoker$USER_GAME_ROLE getEGameRole();

        public final native TexasPoker$USER_GAME_STATE getEGameState();

        public final native int getIDelayCost();

        public final native long getIDelayLong();

        public final native int getIDelaySingleTime();

        public final native int getIDelayTotalTimes();

        public final native int getISNGRank();

        public final native long getLActTime();

        public final native long getLBetStacks();

        public final native long getLBettingID();

        public final native long getLBuyinClubID();

        public final native int getLBuyinStacks();

        public final native long getLBuyinTime();

        public final native long getLRemainStacks();

        public final native long getLRoomId();

        public final native UserBaseInfoNet getStUserInfo();

        public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStUserInfoBuilder();

        public final native UserBaseInfoNetOrBuilder getStUserInfoOrBuilder();

        public final native int getVCurrentHands(int i);

        public final native int getVCurrentHandsCount();

        public final native List<Integer> getVCurrentHandsList();

        public final native boolean hasBBuyin();

        public final native boolean hasBDelegate();

        public final native boolean hasBGameDealer();

        public final native boolean hasBJustSit();

        public final native boolean hasBKickedInGame();

        public final native boolean hasBShowCardFour();

        public final native boolean hasBShowCardOne();

        public final native boolean hasBShowCardThree();

        public final native boolean hasBShowCardTwo();

        public final native boolean hasBWaitBB();

        public final native boolean hasBWaitingBuyinConfirmation();

        public final native boolean hasEGameRole();

        public final native boolean hasEGameState();

        public final native boolean hasIDelayCost();

        public final native boolean hasIDelayLong();

        public final native boolean hasIDelaySingleTime();

        public final native boolean hasIDelayTotalTimes();

        public final native boolean hasISNGRank();

        public final native boolean hasLActTime();

        public final native boolean hasLBetStacks();

        public final native boolean hasLBettingID();

        public final native boolean hasLBuyinClubID();

        public final native boolean hasLBuyinStacks();

        public final native boolean hasLBuyinTime();

        public final native boolean hasLRemainStacks();

        public final native boolean hasLRoomId();

        public final native boolean hasStUserInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1401mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1402mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1403mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1404mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1405mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public final native Builder mergeStUserInfo(UserBaseInfoNet userBaseInfoNet);

        public final native Builder setBBuyin(int i);

        public final native Builder setBDelegate(int i);

        public final native Builder setBGameDealer(int i);

        public final native Builder setBJustSit(int i);

        public final native Builder setBKickedInGame(int i);

        public final native Builder setBShowCardFour(int i);

        public final native Builder setBShowCardOne(int i);

        public final native Builder setBShowCardThree(int i);

        public final native Builder setBShowCardTwo(int i);

        public final native Builder setBWaitBB(int i);

        public final native Builder setBWaitingBuyinConfirmation(int i);

        public final native Builder setEGameRole(TexasPoker$USER_GAME_ROLE texasPoker$USER_GAME_ROLE);

        public final native Builder setEGameState(TexasPoker$USER_GAME_STATE texasPoker$USER_GAME_STATE);

        public final native Builder setIDelayCost(int i);

        public final native Builder setIDelayLong(long j);

        public final native Builder setIDelaySingleTime(int i);

        public final native Builder setIDelayTotalTimes(int i);

        public final native Builder setISNGRank(int i);

        public final native Builder setLActTime(long j);

        public final native Builder setLBetStacks(long j);

        public final native Builder setLBettingID(long j);

        public final native Builder setLBuyinClubID(long j);

        public final native Builder setLBuyinStacks(int i);

        public final native Builder setLBuyinTime(long j);

        public final native Builder setLRemainStacks(long j);

        public final native Builder setLRoomId(long j);

        public final native Builder setStUserInfo(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

        public final native Builder setStUserInfo(UserBaseInfoNet userBaseInfoNet);

        public final native Builder setVCurrentHands(int i, int i2);

        public static final Descriptor getDescriptor() {
            return TexasPoker.b();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{3786, 3787, 3788, 3789, 3790, 3791, 3792, 3793, 3794, 3795, 3796, 3797, 3798, 3799, 3800, 3801, 3802, 3803, 3804, 3805, 3806, 3807, 3808, 3809, 3810, 3811, 3812, 3813, 3814, 3815, 3816, 3817, 3818, 3819, 3820, 3821, 3822, 3823, 3824, 3825, 3826, 3827, 3828, 3829, 3830, 3831, 3832, 3833, 3834, 3835, 3836, 3837, 3838, 3839, 3840, 3841, 3842, 3843, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3859, 3860, 3861, 3862, 3863, 3864, 3865, 3866, 3867});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$UserGameInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$UserGameInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

    private native TexasPoker$UserGameInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$UserGameInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

    private native TexasPoker$UserGameInfoNet(boolean z);

    private native void initFields();

    public final native int getBBuyin();

    public final native int getBDelegate();

    public final native int getBGameDealer();

    public final native int getBJustSit();

    public final native int getBKickedInGame();

    public final native int getBShowCardFour();

    public final native int getBShowCardOne();

    public final native int getBShowCardThree();

    public final native int getBShowCardTwo();

    public final native int getBWaitBB();

    public final native int getBWaitingBuyinConfirmation();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1382getDefaultInstanceForType();

    public final native TexasPoker$UserGameInfoNet m1383getDefaultInstanceForType();

    public final native TexasPoker$USER_GAME_ROLE getEGameRole();

    public final native TexasPoker$USER_GAME_STATE getEGameState();

    public final native int getIDelayCost();

    public final native long getIDelayLong();

    public final native int getIDelaySingleTime();

    public final native int getIDelayTotalTimes();

    public final native int getISNGRank();

    public final native long getLActTime();

    public final native long getLBetStacks();

    public final native long getLBettingID();

    public final native long getLBuyinClubID();

    public final native int getLBuyinStacks();

    public final native long getLBuyinTime();

    public final native long getLRemainStacks();

    public final native long getLRoomId();

    public final native Parser<TexasPoker$UserGameInfoNet> getParserForType();

    public final native int getSerializedSize();

    public final native UserBaseInfoNet getStUserInfo();

    public final native UserBaseInfoNetOrBuilder getStUserInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native int getVCurrentHands(int i);

    public final native int getVCurrentHandsCount();

    public final native List<Integer> getVCurrentHandsList();

    public final native boolean hasBBuyin();

    public final native boolean hasBDelegate();

    public final native boolean hasBGameDealer();

    public final native boolean hasBJustSit();

    public final native boolean hasBKickedInGame();

    public final native boolean hasBShowCardFour();

    public final native boolean hasBShowCardOne();

    public final native boolean hasBShowCardThree();

    public final native boolean hasBShowCardTwo();

    public final native boolean hasBWaitBB();

    public final native boolean hasBWaitingBuyinConfirmation();

    public final native boolean hasEGameRole();

    public final native boolean hasEGameState();

    public final native boolean hasIDelayCost();

    public final native boolean hasIDelayLong();

    public final native boolean hasIDelaySingleTime();

    public final native boolean hasIDelayTotalTimes();

    public final native boolean hasISNGRank();

    public final native boolean hasLActTime();

    public final native boolean hasLBetStacks();

    public final native boolean hasLBettingID();

    public final native boolean hasLBuyinClubID();

    public final native boolean hasLBuyinStacks();

    public final native boolean hasLBuyinTime();

    public final native boolean hasLRemainStacks();

    public final native boolean hasLRoomId();

    public final native boolean hasStUserInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1384newBuilderForType();

    public final native Builder m1385newBuilderForType();

    protected final native Builder m1386newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1387toBuilder();

    public final native Builder m1388toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$UserGameInfoNet getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.b();
    }

    static void __clinit__() {
        PARSER = new C00801();
        TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet = new TexasPoker$UserGameInfoNet(true);
        defaultInstance = texasPoker$UserGameInfoNet;
        texasPoker$UserGameInfoNet.initFields();
    }

    public static TexasPoker$UserGameInfoNet parseFrom(ByteString byteString) {
        return (TexasPoker$UserGameInfoNet) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$UserGameInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$UserGameInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$UserGameInfoNet parseFrom(byte[] bArr) {
        return (TexasPoker$UserGameInfoNet) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$UserGameInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$UserGameInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$UserGameInfoNet parseFrom(InputStream inputStream) {
        return (TexasPoker$UserGameInfoNet) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$UserGameInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$UserGameInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$UserGameInfoNet parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$UserGameInfoNet) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$UserGameInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$UserGameInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$UserGameInfoNet parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$UserGameInfoNet) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$UserGameInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$UserGameInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet) {
        return newBuilder().mergeFrom(texasPoker$UserGameInfoNet);
    }
}
