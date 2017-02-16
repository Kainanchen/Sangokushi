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

public final class TexasPoker$SCRemoveChatRoomRsp extends GeneratedMessage implements TexasPoker$SCRemoveChatRoomRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCRemoveChatRoomRsp> PARSER;
    private static final TexasPoker$SCRemoveChatRoomRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCRemoveChatRoomRsp.1 */
    class C00341 extends AbstractParser<TexasPoker$SCRemoveChatRoomRsp> {
        static {
            fixHelper.fixfunc(new int[]{28104, 28105});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00341();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCRemoveChatRoomRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCRemoveChatRoomRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lRoomID_;

        static {
            fixHelper.fixfunc(new int[]{4614, 4615, 4616, 4617, 4618, 4619, 4620, 4621, 4622, 4623, 4624, 4625, 4626, 4627, 4628, 4629, 4630, 4631, 4632, 4633, 4634, 4635, 4636, 4637, 4638, 4639, 4640, 4641, 4642, 4643, 4644, 4645, 4646, 4647, 4648, 4649, 4650, 4651, 4652, 4653});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1797build();

        public final native TexasPoker$SCRemoveChatRoomRsp m1798build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1799buildPartial();

        public final native TexasPoker$SCRemoveChatRoomRsp m1800buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1801clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1802clear();

        public final native Builder m1803clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLRoomID();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1804clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1805clone();

        public final native Builder m1806clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1807getDefaultInstanceForType();

        public final native TexasPoker$SCRemoveChatRoomRsp m1808getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLRoomID();

        public final native boolean hasEErrCode();

        public final native boolean hasLRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1809mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1811mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1813mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1814mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1815mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCRemoveChatRoomRsp texasPoker$SCRemoveChatRoomRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLRoomID(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.bv();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{28234, 28235, 28236, 28237, 28238, 28239, 28240, 28241, 28242, 28243, 28244, 28245, 28246, 28247, 28248, 28249, 28250, 28251, 28252, 28253, 28254, 28255, 28256, 28257, 28258, 28259, 28260, 28261});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCRemoveChatRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCRemoveChatRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCRemoveChatRoomRsp texasPoker$SCRemoveChatRoomRsp);

    private native TexasPoker$SCRemoveChatRoomRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCRemoveChatRoomRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCRemoveChatRoomRsp texasPoker$SCRemoveChatRoomRsp);

    private native TexasPoker$SCRemoveChatRoomRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1790getDefaultInstanceForType();

    public final native TexasPoker$SCRemoveChatRoomRsp m1791getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLRoomID();

    public final native Parser<TexasPoker$SCRemoveChatRoomRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1792newBuilderForType();

    public final native Builder m1793newBuilderForType();

    protected final native Builder m1794newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1795toBuilder();

    public final native Builder m1796toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCRemoveChatRoomRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.bv();
    }

    static void __clinit__() {
        PARSER = new C00341();
        TexasPoker$SCRemoveChatRoomRsp texasPoker$SCRemoveChatRoomRsp = new TexasPoker$SCRemoveChatRoomRsp(true);
        defaultInstance = texasPoker$SCRemoveChatRoomRsp;
        texasPoker$SCRemoveChatRoomRsp.initFields();
    }

    public static TexasPoker$SCRemoveChatRoomRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCRemoveChatRoomRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCRemoveChatRoomRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRemoveChatRoomRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCRemoveChatRoomRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCRemoveChatRoomRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCRemoveChatRoomRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRemoveChatRoomRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCRemoveChatRoomRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCRemoveChatRoomRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCRemoveChatRoomRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRemoveChatRoomRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCRemoveChatRoomRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCRemoveChatRoomRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCRemoveChatRoomRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRemoveChatRoomRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCRemoveChatRoomRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCRemoveChatRoomRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCRemoveChatRoomRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCRemoveChatRoomRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCRemoveChatRoomRsp texasPoker$SCRemoveChatRoomRsp) {
        return newBuilder().mergeFrom(texasPoker$SCRemoveChatRoomRsp);
    }
}
