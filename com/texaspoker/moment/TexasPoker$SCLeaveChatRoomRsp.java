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
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCLeaveChatRoomRsp extends GeneratedMessage implements TexasPoker$SCLeaveChatRoomRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCLeaveChatRoomRsp> PARSER;
    private static final TexasPoker$SCLeaveChatRoomRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCLeaveChatRoomRsp.1 */
    class C00201 extends AbstractParser<TexasPoker$SCLeaveChatRoomRsp> {
        static {
            fixHelper.fixfunc(new int[]{32667, 32668});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00201();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCLeaveChatRoomRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCLeaveChatRoomRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lRoomID_;

        static {
            fixHelper.fixfunc(new int[]{31202, 31203, 31204, 31205, 31206, 31207, 31208, 31209, 31210, 31211, 31212, 31213, 31214, 31215, 31216, 31217, 31218, 31219, 31220, 31221, 31222, 31223, 31224, 31225, 31226, 31227, 31228, 31229, 31230, 31231, 31232, 31233, 31234, 31235, 31236, 31237, 31238, 31239, 31240, 31241});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1485build();

        public final native TexasPoker$SCLeaveChatRoomRsp m1486build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1487buildPartial();

        public final native TexasPoker$SCLeaveChatRoomRsp m1488buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1489clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1490clear();

        public final native Builder m1491clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLRoomID();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1492clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1493clone();

        public final native Builder m1494clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1495getDefaultInstanceForType();

        public final native TexasPoker$SCLeaveChatRoomRsp m1496getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLRoomID();

        public final native boolean hasEErrCode();

        public final native boolean hasLRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1497mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1498mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1499mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1500mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1501mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCLeaveChatRoomRsp texasPoker$SCLeaveChatRoomRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLRoomID(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.br();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{18678, 18679, 18680, 18681, 18682, 18683, 18684, 18685, 18686, 18687, 18688, 18689, 18690, 18691, 18692, 18693, 18694, 18695, 18696, 18697, 18698, 18699, 18700, 18701, 18702, 18703, 18704, 18705});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCLeaveChatRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCLeaveChatRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCLeaveChatRoomRsp texasPoker$SCLeaveChatRoomRsp);

    private native TexasPoker$SCLeaveChatRoomRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCLeaveChatRoomRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCLeaveChatRoomRsp texasPoker$SCLeaveChatRoomRsp);

    private native TexasPoker$SCLeaveChatRoomRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1478getDefaultInstanceForType();

    public final native TexasPoker$SCLeaveChatRoomRsp m1479getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLRoomID();

    public final native Parser<TexasPoker$SCLeaveChatRoomRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1480newBuilderForType();

    public final native Builder m1481newBuilderForType();

    protected final native Builder m1482newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1483toBuilder();

    public final native Builder m1484toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCLeaveChatRoomRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.br();
    }

    static void __clinit__() {
        PARSER = new C00201();
        TexasPoker$SCLeaveChatRoomRsp texasPoker$SCLeaveChatRoomRsp = new TexasPoker$SCLeaveChatRoomRsp(true);
        defaultInstance = texasPoker$SCLeaveChatRoomRsp;
        texasPoker$SCLeaveChatRoomRsp.initFields();
    }

    public static TexasPoker$SCLeaveChatRoomRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCLeaveChatRoomRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCLeaveChatRoomRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLeaveChatRoomRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCLeaveChatRoomRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCLeaveChatRoomRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCLeaveChatRoomRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLeaveChatRoomRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCLeaveChatRoomRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCLeaveChatRoomRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCLeaveChatRoomRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLeaveChatRoomRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCLeaveChatRoomRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCLeaveChatRoomRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCLeaveChatRoomRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLeaveChatRoomRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCLeaveChatRoomRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCLeaveChatRoomRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCLeaveChatRoomRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLeaveChatRoomRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCLeaveChatRoomRsp texasPoker$SCLeaveChatRoomRsp) {
        return newBuilder().mergeFrom(texasPoker$SCLeaveChatRoomRsp);
    }
}
