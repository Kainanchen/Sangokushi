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
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCGetGameRoomInfoRsp extends GeneratedMessage implements TexasPoker$SCGetGameRoomInfoRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCGetGameRoomInfoRsp> PARSER = null;
    public static final int STGAMEROOMINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCGetGameRoomInfoRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<GameRoomInfo> stGameRoomInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetGameRoomInfoRsp.1 */
    class C00091 extends AbstractParser<TexasPoker$SCGetGameRoomInfoRsp> {
        static {
            fixHelper.fixfunc(new int[]{21605, 21606});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00091();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetGameRoomInfoRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetGameRoomInfoRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private RepeatedFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> stGameRoomInfoBuilder_;
        private List<GameRoomInfo> stGameRoomInfo_;

        static {
            fixHelper.fixfunc(new int[]{9130, 9131, 9132, 9133, 9134, 9135, 9136, 9137, 9138, 9139, 9140, 9141, 9142, 9143, 9144, 9145, 9146, 9147, 9148, 9149, 9150, 9151, 9152, 9153, 9154, 9155, 9156, 9157, 9158, 9159, 9160, 9161, 9162, 9163, 9164, 9165, 9166, 9167, 9168, 9169, 9170, 9171, 9172, 9173, 9174, 9175, 9176, 9177, 9178, 9179, 9180, 9181, 9182, 9183, 9184, 9185});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureStGameRoomInfoIsMutable();

        private native RepeatedFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> getStGameRoomInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllStGameRoomInfo(Iterable<? extends GameRoomInfo> iterable);

        public final native Builder addStGameRoomInfo(int i, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder addStGameRoomInfo(int i, GameRoomInfo gameRoomInfo);

        public final native Builder addStGameRoomInfo(com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder addStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder addStGameRoomInfoBuilder();

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder addStGameRoomInfoBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1173build();

        public final native TexasPoker$SCGetGameRoomInfoRsp m1174build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1175buildPartial();

        public final native TexasPoker$SCGetGameRoomInfoRsp m1176buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1177clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1178clear();

        public final native Builder m1179clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStGameRoomInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1180clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1181clone();

        public final native Builder m1182clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1183getDefaultInstanceForType();

        public final native TexasPoker$SCGetGameRoomInfoRsp m1184getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native GameRoomInfo getStGameRoomInfo(int i);

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder getStGameRoomInfoBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder> getStGameRoomInfoBuilderList();

        public final native int getStGameRoomInfoCount();

        public final native List<GameRoomInfo> getStGameRoomInfoList();

        public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder(int i);

        public final native List<? extends GameRoomInfoOrBuilder> getStGameRoomInfoOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1185mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1186mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1187mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1188mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1189mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetGameRoomInfoRsp texasPoker$SCGetGameRoomInfoRsp);

        public final native Builder removeStGameRoomInfo(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStGameRoomInfo(int i, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder setStGameRoomInfo(int i, GameRoomInfo gameRoomInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.bP();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{21906, 21907, 21908, 21909, 21910, 21911, 21912, 21913, 21914, 21915, 21916, 21917, 21918, 21919, 21920, 21921, 21922, 21923, 21924, 21925, 21926, 21927, 21928, 21929, 21930, 21931, 21932, 21933, 21934, 21935, 21936});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetGameRoomInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetGameRoomInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetGameRoomInfoRsp texasPoker$SCGetGameRoomInfoRsp);

    private native TexasPoker$SCGetGameRoomInfoRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetGameRoomInfoRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetGameRoomInfoRsp texasPoker$SCGetGameRoomInfoRsp);

    private native TexasPoker$SCGetGameRoomInfoRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1166getDefaultInstanceForType();

    public final native TexasPoker$SCGetGameRoomInfoRsp m1167getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCGetGameRoomInfoRsp> getParserForType();

    public final native int getSerializedSize();

    public final native GameRoomInfo getStGameRoomInfo(int i);

    public final native int getStGameRoomInfoCount();

    public final native List<GameRoomInfo> getStGameRoomInfoList();

    public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder(int i);

    public final native List<? extends GameRoomInfoOrBuilder> getStGameRoomInfoOrBuilderList();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1168newBuilderForType();

    public final native Builder m1169newBuilderForType();

    protected final native Builder m1170newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1171toBuilder();

    public final native Builder m1172toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetGameRoomInfoRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.bP();
    }

    static void __clinit__() {
        PARSER = new C00091();
        TexasPoker$SCGetGameRoomInfoRsp texasPoker$SCGetGameRoomInfoRsp = new TexasPoker$SCGetGameRoomInfoRsp(true);
        defaultInstance = texasPoker$SCGetGameRoomInfoRsp;
        texasPoker$SCGetGameRoomInfoRsp.initFields();
    }

    public static TexasPoker$SCGetGameRoomInfoRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetGameRoomInfoRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetGameRoomInfoRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomInfoRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomInfoRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetGameRoomInfoRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetGameRoomInfoRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomInfoRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomInfoRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetGameRoomInfoRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetGameRoomInfoRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomInfoRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomInfoRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetGameRoomInfoRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetGameRoomInfoRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomInfoRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomInfoRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetGameRoomInfoRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetGameRoomInfoRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomInfoRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetGameRoomInfoRsp texasPoker$SCGetGameRoomInfoRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetGameRoomInfoRsp);
    }
}
