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
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCGetGameRoomLeagueClubsRsp extends GeneratedMessage implements TexasPoker$SCGetGameRoomLeagueClubsRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LGAMEROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCGetGameRoomLeagueClubsRsp> PARSER = null;
    public static final int VCLUBBASEINFOS_FIELD_NUMBER = 3;
    private static final TexasPoker$SCGetGameRoomLeagueClubsRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lGameRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<ClubBaseInfo> vClubBaseInfos_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetGameRoomLeagueClubsRsp.1 */
    class C00101 extends AbstractParser<TexasPoker$SCGetGameRoomLeagueClubsRsp> {
        static {
            fixHelper.fixfunc(new int[]{25023, 25024});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00101();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetGameRoomLeagueClubsRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetGameRoomLeagueClubsRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lGameRoomID_;
        private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vClubBaseInfosBuilder_;
        private List<ClubBaseInfo> vClubBaseInfos_;

        static {
            fixHelper.fixfunc(new int[]{TEXAS_CMD.Cmd_SCCreateQuickSNGGameRoomRsp_VALUE, TEXAS_CMD.Cmd_SCPreBuyCoinAndroidRsp_VALUE, TEXAS_CMD.Cmd_SCBuyCoinAndroidRsp_VALUE, TEXAS_CMD.Cmd_SCReturnGameRsp_VALUE, TEXAS_CMD.Cmd_SCStopSNGGameRsp_VALUE, TEXAS_CMD.Cmd_SCLoginThirdPartyRsp_VALUE, TEXAS_CMD.Cmd_SCHelloGameRsp_VALUE, TEXAS_CMD.Cmd_SCBuyInsuranceRsp_VALUE, TEXAS_CMD.Cmd_SCCreatorInsuranceSettingRsp_VALUE, TEXAS_CMD.Cmd_SCUserInsuranceSettingRsp_VALUE, TEXAS_CMD.Cmd_SCBuyInsuranceDelayRsp_VALUE, TEXAS_CMD.Cmd_SCForceBBRsp_VALUE, TEXAS_CMD.Cmd_SCGetGameSettingRsp_VALUE, TEXAS_CMD.Cmd_SCSetUserInfoNewRsp_VALUE, TEXAS_CMD.Cmd_SCRemarkUserNickNameRsp_VALUE, TEXAS_CMD.Cmd_SCGetPokerHandResultByHandIDRsp_VALUE, TEXAS_CMD.Cmd_SCShareFavoriteRsp_VALUE, TEXAS_CMD.Cmd_SCUserDelegateRsp_VALUE, TEXAS_CMD.Cmd_SCKickUserInGameRsp_VALUE, TEXAS_CMD.Cmd_SCUploadAPNTokenRsp_VALUE, TEXAS_CMD.Cmd_SCCancelGameRsp_VALUE, TEXAS_CMD.Cmd_SCShowTableCardsRsp_VALUE, TEXAS_CMD.Cmd_SCReportLocationInfoRsp_VALUE, TEXAS_CMD.Cmd_SCCreateLeagueRsp_VALUE, TEXAS_CMD.Cmd_SCEnterLeagueRsp_VALUE, TEXAS_CMD.Cmd_SCLeagueActionRsp_VALUE, TEXAS_CMD.Cmd_SCSearchLeagueRsp_VALUE, TEXAS_CMD.Cmd_SCSetLeagueSettingRsp_VALUE, TEXAS_CMD.Cmd_SCQuitLeagueRsp_VALUE, TEXAS_CMD.Cmd_SCGetLeagueBaseInfoByLeagueIDRsp_VALUE, TEXAS_CMD.Cmd_SCGetLeagueByLeagueIDRsp_VALUE, TEXAS_CMD.Cmd_SCGetLeagueInfoByClubIDRsp_VALUE, TEXAS_CMD.Cmd_SCAddLeagueMaxMemberRsp_VALUE, TEXAS_CMD.Cmd_CSSystemLeagueMsgRsp_VALUE, TEXAS_CMD.Cmd_SCGetMyClubsV2Rsp_VALUE, TEXAS_CMD.Cmd_SCGetGameRoomLeagueClubsRsp_VALUE, TEXAS_CMD.Cmd_SCBuyBuyInV2Rsp_VALUE, TEXAS_CMD.Cmd_SCGetFlashPageInfosRsp_VALUE, TEXAS_CMD.Cmd_SCGetFrontPageInfoV4Rsp_VALUE, TEXAS_CMD.Cmd_SCGetBillInfosV2Rsp_VALUE, TEXAS_CMD.Cmd_SCSetGameThinkingIntervalRsp_VALUE, TEXAS_CMD.Cmd_SCForceStandupRsp_VALUE, TEXAS_CMD.Cmd_SCSetStraddleRsp_VALUE, TEXAS_CMD.Cmd_SCGetFestivalModeRsp_VALUE, 10212, 10213, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10224, 10225, 10226, 10227});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVClubBaseInfosIsMutable();

        private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVClubBaseInfosFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

        public final native Builder addVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

        public final native Builder addVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

        public final native Builder addVClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

        public final native Builder addVClubBaseInfos(ClubBaseInfo clubBaseInfo);

        public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder();

        public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1221build();

        public final native TexasPoker$SCGetGameRoomLeagueClubsRsp m1222build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1223buildPartial();

        public final native TexasPoker$SCGetGameRoomLeagueClubsRsp m1224buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1225clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1226clear();

        public final native Builder m1227clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLGameRoomID();

        public final native Builder clearVClubBaseInfos();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1228clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1229clone();

        public final native Builder m1230clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1231getDefaultInstanceForType();

        public final native TexasPoker$SCGetGameRoomLeagueClubsRsp m1232getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLGameRoomID();

        public final native ClubBaseInfo getVClubBaseInfos(int i);

        public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVClubBaseInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVClubBaseInfosBuilderList();

        public final native int getVClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasLGameRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1233mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1234mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1235mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1236mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1237mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetGameRoomLeagueClubsRsp texasPoker$SCGetGameRoomLeagueClubsRsp);

        public final native Builder removeVClubBaseInfos(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLGameRoomID(long j);

        public final native Builder setVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

        public final native Builder setVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.hh();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{31549, 31550, 31551, 31552, 31553, 31554, 31555, 31556, 31557, 31558, 31559, 31560, 31561, 31562, 31563, 31564, 31565, 31566, 31567, 31568, 31569, 31570, 31571, 31572, 31573, 31574, 31575, 31576, 31577, 31578, 31579, 31580, 31581});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetGameRoomLeagueClubsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetGameRoomLeagueClubsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetGameRoomLeagueClubsRsp texasPoker$SCGetGameRoomLeagueClubsRsp);

    private native TexasPoker$SCGetGameRoomLeagueClubsRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetGameRoomLeagueClubsRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetGameRoomLeagueClubsRsp texasPoker$SCGetGameRoomLeagueClubsRsp);

    private native TexasPoker$SCGetGameRoomLeagueClubsRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1214getDefaultInstanceForType();

    public final native TexasPoker$SCGetGameRoomLeagueClubsRsp m1215getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLGameRoomID();

    public final native Parser<TexasPoker$SCGetGameRoomLeagueClubsRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native ClubBaseInfo getVClubBaseInfos(int i);

    public final native int getVClubBaseInfosCount();

    public final native List<ClubBaseInfo> getVClubBaseInfosList();

    public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

    public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

    public final native boolean hasEErrCode();

    public final native boolean hasLGameRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1216newBuilderForType();

    public final native Builder m1217newBuilderForType();

    protected final native Builder m1218newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1219toBuilder();

    public final native Builder m1220toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.hh();
    }

    static void __clinit__() {
        PARSER = new C00101();
        TexasPoker$SCGetGameRoomLeagueClubsRsp texasPoker$SCGetGameRoomLeagueClubsRsp = new TexasPoker$SCGetGameRoomLeagueClubsRsp(true);
        defaultInstance = texasPoker$SCGetGameRoomLeagueClubsRsp;
        texasPoker$SCGetGameRoomLeagueClubsRsp.initFields();
    }

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetGameRoomLeagueClubsRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomLeagueClubsRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetGameRoomLeagueClubsRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomLeagueClubsRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetGameRoomLeagueClubsRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomLeagueClubsRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetGameRoomLeagueClubsRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomLeagueClubsRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetGameRoomLeagueClubsRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetGameRoomLeagueClubsRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomLeagueClubsRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetGameRoomLeagueClubsRsp texasPoker$SCGetGameRoomLeagueClubsRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetGameRoomLeagueClubsRsp);
    }
}
