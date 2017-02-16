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

public final class TexasPoker$SCLoginRsp extends GeneratedMessage implements TexasPoker$SCLoginRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCLoginRsp> PARSER = null;
    public static final int SACCESSTOKEN_FIELD_NUMBER = 5;
    public static final int SENCRYPTKEY_FIELD_NUMBER = 6;
    public static final int STDEFAULTSETTINGINFO_FIELD_NUMBER = 4;
    public static final int STGAMEITEMINFO_FIELD_NUMBER = 3;
    public static final int STUSERGAMEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCLoginRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private Object sAccessToken_;
    private Object sEncryptKey_;
    private DefaultSettingInfoNet stDefaultSettingInfo_;
    private List<GameItemInfo> stGameItemInfo_;
    private TexasPoker$UserGameInfoNet stUserGameInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCLoginRsp.1 */
    class C00231 extends AbstractParser<TexasPoker$SCLoginRsp> {
        static {
            fixHelper.fixfunc(new int[]{21446, 21447});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00231();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCLoginRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCLoginRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private Object sAccessToken_;
        private Object sEncryptKey_;
        private SingleFieldBuilder<DefaultSettingInfoNet, com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder, DefaultSettingInfoNetOrBuilder> stDefaultSettingInfoBuilder_;
        private DefaultSettingInfoNet stDefaultSettingInfo_;
        private RepeatedFieldBuilder<GameItemInfo, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder, GameItemInfoOrBuilder> stGameItemInfoBuilder_;
        private List<GameItemInfo> stGameItemInfo_;
        private SingleFieldBuilder<TexasPoker$UserGameInfoNet, com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder, TexasPoker$UserGameInfoNetOrBuilder> stUserGameInfoBuilder_;
        private TexasPoker$UserGameInfoNet stUserGameInfo_;

        static {
            fixHelper.fixfunc(new int[]{18365, 18366, 18367, 18368, 18369, 18370, 18371, 18372, 18373, 18374, 18375, 18376, 18377, 18378, 18379, 18380, 18381, 18382, 18383, 18384, 18385, 18386, 18387, 18388, 18389, 18390, 18391, 18392, 18393, 18394, 18395, 18396, 18397, 18398, 18399, 18400, 18401, 18402, 18403, 18404, 18405, 18406, 18407, 18408, 18409, 18410, 18411, 18412, 18413, 18414, 18415, 18416, 18417, 18418, 18419, 18420, 18421, 18422, 18423, 18424, 18425, 18426, 18427, 18428, 18429, 18430, 18431, 18432, 18433, 18434, 18435, 18436, 18437, 18438, 18439, 18440, 18441, 18442, 18443, 18444, 18445, 18446, 18447, 18448, 18449, 18450});
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

        public final native /* bridge */ /* synthetic */ MessageLite m2013build();

        public final native TexasPoker$SCLoginRsp m2014build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2015buildPartial();

        public final native TexasPoker$SCLoginRsp m2016buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2017clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2018clear();

        public final native Builder m2019clear();

        public final native Builder clearEErrCode();

        public final native Builder clearSAccessToken();

        public final native Builder clearSEncryptKey();

        public final native Builder clearStDefaultSettingInfo();

        public final native Builder clearStGameItemInfo();

        public final native Builder clearStUserGameInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2020clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2021clone();

        public final native Builder m2022clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2023getDefaultInstanceForType();

        public final native TexasPoker$SCLoginRsp m2025getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native String getSAccessToken();

        public final native ByteString getSAccessTokenBytes();

        public final native String getSEncryptKey();

        public final native ByteString getSEncryptKeyBytes();

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

        public final native boolean hasSAccessToken();

        public final native boolean hasSEncryptKey();

        public final native boolean hasStDefaultSettingInfo();

        public final native boolean hasStUserGameInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2027mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2030mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2032mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2034mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2036mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCLoginRsp texasPoker$SCLoginRsp);

        public final native Builder mergeStDefaultSettingInfo(DefaultSettingInfoNet defaultSettingInfoNet);

        public final native Builder mergeStUserGameInfo(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public final native Builder removeStGameItemInfo(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setSAccessToken(String str);

        public final native Builder setSAccessTokenBytes(ByteString byteString);

        public final native Builder setSEncryptKey(String str);

        public final native Builder setSEncryptKeyBytes(ByteString byteString);

        public final native Builder setStDefaultSettingInfo(com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder builder);

        public final native Builder setStDefaultSettingInfo(DefaultSettingInfoNet defaultSettingInfoNet);

        public final native Builder setStGameItemInfo(int i, com.texaspoker.moment.TexasPokerCommon.GameItemInfo.Builder builder);

        public final native Builder setStGameItemInfo(int i, GameItemInfo gameItemInfo);

        public final native Builder setStUserGameInfo(com.texaspoker.moment.TexasPoker$UserGameInfoNet.Builder builder);

        public final native Builder setStUserGameInfo(TexasPoker$UserGameInfoNet texasPoker$UserGameInfoNet);

        public static final Descriptor getDescriptor() {
            return TexasPoker.F();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{14101, 14102, 14103, 14104, 14105, 14106, 14107, 14108, 14109, 14110, 14111, 14112, 14113, 14114, 14115, 14116, 14117, 14118, 14119, 14120, 14121, 14122, 14123, 14124, 14125, 14126, 14127, 14128, 14129, 14130, 14131, 14132, 14133, 14134, 14135, 14136, 14137, 14138, 14139, 14140, 14141, 14142, 14143});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCLoginRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCLoginRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCLoginRsp texasPoker$SCLoginRsp);

    private native TexasPoker$SCLoginRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCLoginRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCLoginRsp texasPoker$SCLoginRsp);

    private native TexasPoker$SCLoginRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2006getDefaultInstanceForType();

    public final native TexasPoker$SCLoginRsp m2007getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCLoginRsp> getParserForType();

    public final native String getSAccessToken();

    public final native ByteString getSAccessTokenBytes();

    public final native String getSEncryptKey();

    public final native ByteString getSEncryptKeyBytes();

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

    public final native boolean hasSAccessToken();

    public final native boolean hasSEncryptKey();

    public final native boolean hasStDefaultSettingInfo();

    public final native boolean hasStUserGameInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2008newBuilderForType();

    public final native Builder m2009newBuilderForType();

    protected final native Builder m2010newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2011toBuilder();

    public final native Builder m2012toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCLoginRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.F();
    }

    static void __clinit__() {
        PARSER = new C00231();
        TexasPoker$SCLoginRsp texasPoker$SCLoginRsp = new TexasPoker$SCLoginRsp(true);
        defaultInstance = texasPoker$SCLoginRsp;
        texasPoker$SCLoginRsp.initFields();
    }

    public static TexasPoker$SCLoginRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCLoginRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCLoginRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLoginRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCLoginRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCLoginRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCLoginRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLoginRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCLoginRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCLoginRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCLoginRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLoginRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCLoginRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCLoginRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCLoginRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLoginRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCLoginRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCLoginRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCLoginRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLoginRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCLoginRsp texasPoker$SCLoginRsp) {
        return newBuilder().mergeFrom(texasPoker$SCLoginRsp);
    }
}
