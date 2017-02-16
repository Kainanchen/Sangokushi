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
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNetOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.GameItemInfo;
import com.texaspoker.moment.TexasPokerCommon.GameItemInfoOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCQuickLoginRsp extends GeneratedMessage implements TexasPoker$SCQuickLoginRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCQuickLoginRsp> PARSER = null;
    public static final int STDEFAULTSETTINGINFO_FIELD_NUMBER = 4;
    public static final int STGAMEITEMINFO_FIELD_NUMBER = 3;
    public static final int STUSERGAMEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCQuickLoginRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private DefaultSettingInfoNet stDefaultSettingInfo_;
    private List<GameItemInfo> stGameItemInfo_;
    private TexasPoker$UserGameInfoNet stUserGameInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCQuickLoginRsp.1 */
    class C00291 extends AbstractParser<TexasPoker$SCQuickLoginRsp> {
        static {
            fixHelper.fixfunc(new int[]{29080, 29081});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00291();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCQuickLoginRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCQuickLoginRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<DefaultSettingInfoNet, com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder, DefaultSettingInfoNetOrBuilder> stDefaultSettingInfoBuilder_;
        private DefaultSettingInfoNet stDefaultSettingInfo_;
        private RepeatedFieldBuilder<GameItemInfo, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder, GameItemInfoOrBuilder> stGameItemInfoBuilder_;
        private List<GameItemInfo> stGameItemInfo_;
        private SingleFieldBuilder<TexasPoker$UserGameInfoNet, com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder, TexasPoker$UserGameInfoNetOrBuilder> stUserGameInfoBuilder_;
        private TexasPoker$UserGameInfoNet stUserGameInfo_;

        static {
            fixHelper.fixfunc(new int[]{21143, 21144, 21145, 21146, 21147, 21148, 21149, 21150, 21151, 21152, 21153, 21154, 21155, 21156, 21157, 21158, 21159, 21160, 21161, 21162, 21163, 21164, 21165, 21166, 21167, 21168, 21169, 21170, 21171, 21172, 21173, 21174, 21175, 21176, 21177, 21178, 21179, 21180, 21181, 21182, 21183, 21184, 21185, 21186, 21187, 21188, 21189, 21190, 21191, 21192, 21193, 21194, 21195, 21196, 21197, 21198, 21199, 21200, 21201, 21202, 21203, 21204, 21205, 21206, 21207, 21208, 21209, 21210, 21211, 21212, 21213, 21214, 21215, 21216});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureStGameItemInfoIsMutable();

        private native SingleFieldBuilder<DefaultSettingInfoNet, com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder, DefaultSettingInfoNetOrBuilder> getStDefaultSettingInfoFieldBuilder();

        private native RepeatedFieldBuilder<GameItemInfo, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder, GameItemInfoOrBuilder> getStGameItemInfoFieldBuilder();

        private native SingleFieldBuilder<TexasPoker$UserGameInfoNet, com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder, TexasPoker$UserGameInfoNetOrBuilder> getStUserGameInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllStGameItemInfo(Iterable<? extends GameItemInfo> iterable);

        public final native Builder addStGameItemInfo(int i, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder builder);

        public final native Builder addStGameItemInfo(int i, GameItemInfo gameItemInfo);

        public final native Builder addStGameItemInfo(com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder builder);

        public final native Builder addStGameItemInfo(GameItemInfo gameItemInfo);

        public final native com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder addStGameItemInfoBuilder();

        public final native com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder addStGameItemInfoBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1725build();

        public final native TexasPoker$SCQuickLoginRsp m1726build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1727buildPartial();

        public final native TexasPoker$SCQuickLoginRsp m1728buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1729clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1730clear();

        public final native Builder m1731clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStDefaultSettingInfo();

        public final native Builder clearStGameItemInfo();

        public final native Builder clearStUserGameInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1732clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1733clone();

        public final native Builder m1734clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1735getDefaultInstanceForType();

        public final native TexasPoker$SCQuickLoginRsp m1736getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native DefaultSettingInfoNet getStDefaultSettingInfo();

        public final native com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder getStDefaultSettingInfoBuilder();

        public final native DefaultSettingInfoNetOrBuilder getStDefaultSettingInfoOrBuilder();

        public final native GameItemInfo getStGameItemInfo(int i);

        public final native com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder getStGameItemInfoBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder> getStGameItemInfoBuilderList();

        public final native int getStGameItemInfoCount();

        public final native List<GameItemInfo> getStGameItemInfoList();

        public final native GameItemInfoOrBuilder getStGameItemInfoOrBuilder(int i);

        public final native List<? extends GameItemInfoOrBuilder> getStGameItemInfoOrBuilderList();

        public final native TexasPoker$UserGameInfoNet getStUserGameInfo();

        public final native com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder getStUserGameInfoBuilder();

        public final native TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasStDefaultSettingInfo();

        public final native boolean hasStUserGameInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1737mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1738mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1739mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1740mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1741mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCQuickLoginRsp texasPoker$SCQuickLoginRsp);

        public final native Builder mergeStDefaultSettingInfo(DefaultSettingInfoNet defaultSettingInfoNet);

        public final native Builder mergeStUserGameInfo(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public final native Builder removeStGameItemInfo(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStDefaultSettingInfo(com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder builder);

        public final native Builder setStDefaultSettingInfo(DefaultSettingInfoNet defaultSettingInfoNet);

        public final native Builder setStGameItemInfo(int i, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder builder);

        public final native Builder setStGameItemInfo(int i, GameItemInfo gameItemInfo);

        public final native Builder setStUserGameInfo(com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder builder);

        public final native Builder setStUserGameInfo(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public static final Descriptor getDescriptor() {
            return TexasPoker.N();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{11616, 11617, 11618, 11619, 11620, 11621, 11622, 11623, 11624, 11625, 11626, 11627, 11628, 11629, 11630, 11631, 11632, 11633, 11634, 11635, 11636, 11637, 11638, 11639, 11640, 11641, 11642, 11643, 11644, 11645, 11646, 11647, 11648, 11649, 11650, 11651, 11652});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCQuickLoginRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCQuickLoginRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCQuickLoginRsp texasPoker$SCQuickLoginRsp);

    private native TexasPoker$SCQuickLoginRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCQuickLoginRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCQuickLoginRsp texasPoker$SCQuickLoginRsp);

    private native TexasPoker$SCQuickLoginRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1718getDefaultInstanceForType();

    public final native TexasPoker$SCQuickLoginRsp m1719getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCQuickLoginRsp> getParserForType();

    public final native int getSerializedSize();

    public final native DefaultSettingInfoNet getStDefaultSettingInfo();

    public final native DefaultSettingInfoNetOrBuilder getStDefaultSettingInfoOrBuilder();

    public final native GameItemInfo getStGameItemInfo(int i);

    public final native int getStGameItemInfoCount();

    public final native List<GameItemInfo> getStGameItemInfoList();

    public final native GameItemInfoOrBuilder getStGameItemInfoOrBuilder(int i);

    public final native List<? extends GameItemInfoOrBuilder> getStGameItemInfoOrBuilderList();

    public final native TexasPoker$UserGameInfoNet getStUserGameInfo();

    public final native TexasPoker$UserGameInfoNetOrBuilder getStUserGameInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasStDefaultSettingInfo();

    public final native boolean hasStUserGameInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1720newBuilderForType();

    public final native Builder m1721newBuilderForType();

    protected final native Builder m1722newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1723toBuilder();

    public final native Builder m1724toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCQuickLoginRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.N();
    }

    static void __clinit__() {
        PARSER = new C00291();
        TexasPoker$SCQuickLoginRsp texasPoker$SCQuickLoginRsp = new TexasPoker$SCQuickLoginRsp(true);
        defaultInstance = texasPoker$SCQuickLoginRsp;
        texasPoker$SCQuickLoginRsp.initFields();
    }

    public static TexasPoker$SCQuickLoginRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCQuickLoginRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCQuickLoginRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCQuickLoginRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCQuickLoginRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCQuickLoginRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCQuickLoginRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCQuickLoginRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCQuickLoginRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCQuickLoginRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCQuickLoginRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCQuickLoginRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCQuickLoginRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCQuickLoginRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCQuickLoginRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCQuickLoginRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCQuickLoginRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCQuickLoginRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCQuickLoginRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCQuickLoginRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCQuickLoginRsp texasPoker$SCQuickLoginRsp) {
        return newBuilder().mergeFrom(texasPoker$SCQuickLoginRsp);
    }
}
