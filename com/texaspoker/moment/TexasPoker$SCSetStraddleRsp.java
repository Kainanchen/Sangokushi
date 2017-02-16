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

public final class TexasPoker$SCSetStraddleRsp extends GeneratedMessage implements TexasPoker$SCSetStraddleRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCSetStraddleRsp> PARSER = null;
    public static final int STGAMEROOMBASEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCSetStraddleRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private GameRoomBaseInfo stGameRoomBaseInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetStraddleRsp.1 */
    class C00471 extends AbstractParser<TexasPoker$SCSetStraddleRsp> {
        static {
            fixHelper.fixfunc(new int[]{24028, 24029});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00471();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetStraddleRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSetStraddleRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> stGameRoomBaseInfoBuilder_;
        private GameRoomBaseInfo stGameRoomBaseInfo_;

        static {
            fixHelper.fixfunc(new int[]{22662, 22663, 22664, 22665, 22666, 22667, 22668, 22669, 22670, 22671, 22672, 22673, 22674, 22675, 22676, 22677, 22678, 22679, 22680, 22681, 22682, 22683, 22684, 22685, 22686, 22687, 22688, 22689, 22690, 22691, 22692, 22693, 22694, 22695, 22696, 22697, 22698, 22699, 22700, 22701, 22702, 22703, 22704, 22705, 22706});
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

        public final native /* bridge */ /* synthetic */ MessageLite m2109build();

        public final native TexasPoker$SCSetStraddleRsp m2110build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2111buildPartial();

        public final native TexasPoker$SCSetStraddleRsp m2112buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2113clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2114clear();

        public final native Builder m2115clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStGameRoomBaseInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2116clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2117clone();

        public final native Builder m2118clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2119getDefaultInstanceForType();

        public final native TexasPoker$SCSetStraddleRsp m2120getDefaultInstanceForType();

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

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2121mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2122mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2123mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2124mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2125mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSetStraddleRsp texasPoker$SCSetStraddleRsp);

        public final native Builder mergeStGameRoomBaseInfo(GameRoomBaseInfo gameRoomBaseInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStGameRoomBaseInfo(com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

        public final native Builder setStGameRoomBaseInfo(GameRoomBaseInfo gameRoomBaseInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.ht();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{3898, 3899, 3900, 3901, 3902, 3903, 3904, 3905, 3906, 3907, 3908, 3909, 3910, 3911, 3912, 3913, 3914, 3915, 3916, 3917, 3918, 3919, 3920, 3921, 3922, 3923, 3924, 3925, 3926});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSetStraddleRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSetStraddleRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSetStraddleRsp texasPoker$SCSetStraddleRsp);

    private native TexasPoker$SCSetStraddleRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSetStraddleRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSetStraddleRsp texasPoker$SCSetStraddleRsp);

    private native TexasPoker$SCSetStraddleRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2102getDefaultInstanceForType();

    public final native TexasPoker$SCSetStraddleRsp m2103getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCSetStraddleRsp> getParserForType();

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

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2104newBuilderForType();

    public final native Builder m2105newBuilderForType();

    protected final native Builder m2106newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2107toBuilder();

    public final native Builder m2108toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSetStraddleRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.ht();
    }

    static void __clinit__() {
        PARSER = new C00471();
        TexasPoker$SCSetStraddleRsp texasPoker$SCSetStraddleRsp = new TexasPoker$SCSetStraddleRsp(true);
        defaultInstance = texasPoker$SCSetStraddleRsp;
        texasPoker$SCSetStraddleRsp.initFields();
    }

    public static TexasPoker$SCSetStraddleRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCSetStraddleRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSetStraddleRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetStraddleRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSetStraddleRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCSetStraddleRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSetStraddleRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetStraddleRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSetStraddleRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSetStraddleRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSetStraddleRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetStraddleRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetStraddleRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSetStraddleRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSetStraddleRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetStraddleRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetStraddleRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSetStraddleRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSetStraddleRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetStraddleRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSetStraddleRsp texasPoker$SCSetStraddleRsp) {
        return newBuilder().mergeFrom(texasPoker$SCSetStraddleRsp);
    }
}
