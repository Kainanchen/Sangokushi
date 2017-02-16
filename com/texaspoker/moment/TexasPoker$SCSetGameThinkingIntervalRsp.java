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
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCSetGameThinkingIntervalRsp extends GeneratedMessage implements TexasPoker$SCSetGameThinkingIntervalRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCSetGameThinkingIntervalRsp> PARSER = null;
    public static final int STGAMEROOMBASEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCSetGameThinkingIntervalRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private GameRoomBaseInfo stGameRoomBaseInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetGameThinkingIntervalRsp.1 */
    class C00461 extends AbstractParser<TexasPoker$SCSetGameThinkingIntervalRsp> {
        static {
            fixHelper.fixfunc(new int[]{30384, 30385});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00461();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetGameThinkingIntervalRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSetGameThinkingIntervalRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> stGameRoomBaseInfoBuilder_;
        private GameRoomBaseInfo stGameRoomBaseInfo_;

        static {
            fixHelper.fixfunc(new int[]{19187, 19188, 19189, 19190, 19191, 19192, 19193, 19194, 19195, 19196, 19197, 19198, 19199, 19200, 19201, 19202, 19203, 19204, 19205, 19206, 19207, 19208, 19209, 19210, 19211, 19212, 19213, 19214, 19215, 19216, 19217, 19218, 19219, 19220, 19221, 19222, 19223, 19224, 19225, 19226, 19227, 19228, 19229, 19230, 19231});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> getStGameRoomBaseInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2373build();

        public final native TexasPoker$SCSetGameThinkingIntervalRsp m2374build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2375buildPartial();

        public final native TexasPoker$SCSetGameThinkingIntervalRsp m2376buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2377clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2378clear();

        public final native Builder m2379clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStGameRoomBaseInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2380clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2381clone();

        public final native Builder m2382clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2383getDefaultInstanceForType();

        public final native TexasPoker$SCSetGameThinkingIntervalRsp m2384getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native GameRoomBaseInfo getStGameRoomBaseInfo();

        public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder getStGameRoomBaseInfoBuilder();

        public final native GameRoomBaseInfoOrBuilder getStGameRoomBaseInfoOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasStGameRoomBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2385mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2386mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2387mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2388mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2389mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSetGameThinkingIntervalRsp texasPoker$SCSetGameThinkingIntervalRsp);

        public final native Builder mergeStGameRoomBaseInfo(GameRoomBaseInfo gameRoomBaseInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStGameRoomBaseInfo(com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

        public final native Builder setStGameRoomBaseInfo(GameRoomBaseInfo gameRoomBaseInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.hl();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{12574, 12575, 12576, 12577, 12578, 12579, 12580, 12581, 12582, 12583, 12584, 12585, 12586, 12587, 12588, 12589, 12590, 12591, 12592, 12593, 12594, 12595, 12596, 12597, 12598, 12599, 12600, 12601, 12602});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSetGameThinkingIntervalRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSetGameThinkingIntervalRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSetGameThinkingIntervalRsp texasPoker$SCSetGameThinkingIntervalRsp);

    private native TexasPoker$SCSetGameThinkingIntervalRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSetGameThinkingIntervalRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSetGameThinkingIntervalRsp texasPoker$SCSetGameThinkingIntervalRsp);

    private native TexasPoker$SCSetGameThinkingIntervalRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2366getDefaultInstanceForType();

    public final native TexasPoker$SCSetGameThinkingIntervalRsp m2367getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCSetGameThinkingIntervalRsp> getParserForType();

    public final native int getSerializedSize();

    public final native GameRoomBaseInfo getStGameRoomBaseInfo();

    public final native GameRoomBaseInfoOrBuilder getStGameRoomBaseInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasStGameRoomBaseInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2368newBuilderForType();

    public final native Builder m2369newBuilderForType();

    protected final native Builder m2370newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2371toBuilder();

    public final native Builder m2372toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSetGameThinkingIntervalRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.hl();
    }

    static void __clinit__() {
        PARSER = new C00461();
        TexasPoker$SCSetGameThinkingIntervalRsp texasPoker$SCSetGameThinkingIntervalRsp = new TexasPoker$SCSetGameThinkingIntervalRsp(true);
        defaultInstance = texasPoker$SCSetGameThinkingIntervalRsp;
        texasPoker$SCSetGameThinkingIntervalRsp.initFields();
    }

    public static TexasPoker$SCSetGameThinkingIntervalRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCSetGameThinkingIntervalRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSetGameThinkingIntervalRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetGameThinkingIntervalRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSetGameThinkingIntervalRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCSetGameThinkingIntervalRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSetGameThinkingIntervalRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetGameThinkingIntervalRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSetGameThinkingIntervalRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSetGameThinkingIntervalRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSetGameThinkingIntervalRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetGameThinkingIntervalRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetGameThinkingIntervalRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSetGameThinkingIntervalRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSetGameThinkingIntervalRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetGameThinkingIntervalRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetGameThinkingIntervalRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSetGameThinkingIntervalRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSetGameThinkingIntervalRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetGameThinkingIntervalRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSetGameThinkingIntervalRsp texasPoker$SCSetGameThinkingIntervalRsp) {
        return newBuilder().mergeFrom(texasPoker$SCSetGameThinkingIntervalRsp);
    }
}
