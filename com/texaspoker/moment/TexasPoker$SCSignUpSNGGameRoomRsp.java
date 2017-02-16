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
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.io.InputStream;

public final class TexasPoker$SCSignUpSNGGameRoomRsp extends GeneratedMessage implements TexasPoker$SCSignUpSNGGameRoomRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCSignUpSNGGameRoomRsp> PARSER = null;
    public static final int STGAMEROOMINFO_FIELD_NUMBER = 2;
    public static final int STUSERBASEINFONET_FIELD_NUMBER = 3;
    private static final TexasPoker$SCSignUpSNGGameRoomRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private GameRoomInfo stGameRoomInfo_;
    private UserBaseInfoNet stUserBaseInfoNet_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSignUpSNGGameRoomRsp.1 */
    class C00511 extends AbstractParser<TexasPoker$SCSignUpSNGGameRoomRsp> {
        static {
            fixHelper.fixfunc(new int[]{30425, 30426});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00511();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSignUpSNGGameRoomRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSignUpSNGGameRoomRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> stGameRoomInfoBuilder_;
        private GameRoomInfo stGameRoomInfo_;
        private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stUserBaseInfoNetBuilder_;
        private UserBaseInfoNet stUserBaseInfoNet_;

        static {
            fixHelper.fixfunc(new int[]{9554, 9555, 9556, 9557, 9558, 9559, 9560, 9561, 9562, 9563, 9564, 9565, 9566, 9567, 9568, 9569, 9570, 9571, 9572, 9573, 9574, 9575, 9576, 9577, 9578, 9579, 9580, 9581, 9582, 9583, 9584, 9585, 9586, 9587, 9588, 9589, 9590, 9591, 9592, 9593, 9594, 9595, 9596, 9597, 9598, 9599, 9600, 9601, 9602, 9603, 9604, 9605, 9606, 9607});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> getStGameRoomInfoFieldBuilder();

        private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStUserBaseInfoNetFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2205build();

        public final native TexasPoker$SCSignUpSNGGameRoomRsp m2206build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2207buildPartial();

        public final native TexasPoker$SCSignUpSNGGameRoomRsp m2208buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2209clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2210clear();

        public final native Builder m2211clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStGameRoomInfo();

        public final native Builder clearStUserBaseInfoNet();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2212clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2213clone();

        public final native Builder m2214clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2215getDefaultInstanceForType();

        public final native TexasPoker$SCSignUpSNGGameRoomRsp m2216getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native GameRoomInfo getStGameRoomInfo();

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder getStGameRoomInfoBuilder();

        public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

        public final native UserBaseInfoNet getStUserBaseInfoNet();

        public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStUserBaseInfoNetBuilder();

        public final native UserBaseInfoNetOrBuilder getStUserBaseInfoNetOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasStGameRoomInfo();

        public final native boolean hasStUserBaseInfoNet();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2217mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2218mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2219mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2220mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2221mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSignUpSNGGameRoomRsp texasPoker$SCSignUpSNGGameRoomRsp);

        public final native Builder mergeStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public final native Builder mergeStUserBaseInfoNet(UserBaseInfoNet userBaseInfoNet);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStGameRoomInfo(com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder setStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public final native Builder setStUserBaseInfoNet(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

        public final native Builder setStUserBaseInfoNet(UserBaseInfoNet userBaseInfoNet);

        public static final Descriptor getDescriptor() {
            return TexasPoker.cb();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{14254, 14255, 14256, 14257, 14258, 14259, 14260, 14261, 14262, 14263, 14264, 14265, 14266, 14267, 14268, 14269, 14270, 14271, 14272, 14273, 14274, 14275, 14276, 14277, 14278, 14279, 14280, 14281, 14282, 14283, 14284, 14285});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSignUpSNGGameRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSignUpSNGGameRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSignUpSNGGameRoomRsp texasPoker$SCSignUpSNGGameRoomRsp);

    private native TexasPoker$SCSignUpSNGGameRoomRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSignUpSNGGameRoomRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSignUpSNGGameRoomRsp texasPoker$SCSignUpSNGGameRoomRsp);

    private native TexasPoker$SCSignUpSNGGameRoomRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2198getDefaultInstanceForType();

    public final native TexasPoker$SCSignUpSNGGameRoomRsp m2199getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCSignUpSNGGameRoomRsp> getParserForType();

    public final native int getSerializedSize();

    public final native GameRoomInfo getStGameRoomInfo();

    public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

    public final native UserBaseInfoNet getStUserBaseInfoNet();

    public final native UserBaseInfoNetOrBuilder getStUserBaseInfoNetOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasStGameRoomInfo();

    public final native boolean hasStUserBaseInfoNet();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2200newBuilderForType();

    public final native Builder m2201newBuilderForType();

    protected final native Builder m2202newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2203toBuilder();

    public final native Builder m2204toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSignUpSNGGameRoomRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.cb();
    }

    static void __clinit__() {
        PARSER = new C00511();
        TexasPoker$SCSignUpSNGGameRoomRsp texasPoker$SCSignUpSNGGameRoomRsp = new TexasPoker$SCSignUpSNGGameRoomRsp(true);
        defaultInstance = texasPoker$SCSignUpSNGGameRoomRsp;
        texasPoker$SCSignUpSNGGameRoomRsp.initFields();
    }

    public static TexasPoker$SCSignUpSNGGameRoomRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCSignUpSNGGameRoomRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSignUpSNGGameRoomRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSignUpSNGGameRoomRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSignUpSNGGameRoomRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCSignUpSNGGameRoomRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSignUpSNGGameRoomRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSignUpSNGGameRoomRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSignUpSNGGameRoomRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSignUpSNGGameRoomRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSignUpSNGGameRoomRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSignUpSNGGameRoomRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSignUpSNGGameRoomRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSignUpSNGGameRoomRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSignUpSNGGameRoomRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSignUpSNGGameRoomRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSignUpSNGGameRoomRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSignUpSNGGameRoomRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSignUpSNGGameRoomRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSignUpSNGGameRoomRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSignUpSNGGameRoomRsp texasPoker$SCSignUpSNGGameRoomRsp) {
        return newBuilder().mergeFrom(texasPoker$SCSignUpSNGGameRoomRsp);
    }
}
