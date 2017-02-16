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

public final class TexasPoker$SCKickUserGameRoomRsp extends GeneratedMessage implements TexasPoker$SCKickUserGameRoomRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LKICKOFFUUID_FIELD_NUMBER = 3;
    public static final int LROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCKickUserGameRoomRsp> PARSER;
    private static final TexasPoker$SCKickUserGameRoomRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lKickOffUuid_;
    private long lRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCKickUserGameRoomRsp.1 */
    class C00181 extends AbstractParser<TexasPoker$SCKickUserGameRoomRsp> {
        static {
            fixHelper.fixfunc(new int[]{26025, 26026});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00181();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCKickUserGameRoomRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCKickUserGameRoomRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lKickOffUuid_;
        private long lRoomID_;

        static {
            fixHelper.fixfunc(new int[]{20338, 20339, 20340, 20341, 20342, 20343, 20344, 20345, 20346, 20347, 20348, 20349, 20350, 20351, 20352, 20353, 20354, 20355, 20356, 20357, 20358, 20359, 20360, 20361, 20362, 20363, 20364, 20365, 20366, 20367, 20368, 20369, 20370, 20371, 20372, 20373, 20374, 20375, 20376, 20377, 20378, 20379, 20380, 20381});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1653build();

        public final native TexasPoker$SCKickUserGameRoomRsp m1654build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1655buildPartial();

        public final native TexasPoker$SCKickUserGameRoomRsp m1656buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1657clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1658clear();

        public final native Builder m1659clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLKickOffUuid();

        public final native Builder clearLRoomID();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1660clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1661clone();

        public final native Builder m1662clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1663getDefaultInstanceForType();

        public final native TexasPoker$SCKickUserGameRoomRsp m1664getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLKickOffUuid();

        public final native long getLRoomID();

        public final native boolean hasEErrCode();

        public final native boolean hasLKickOffUuid();

        public final native boolean hasLRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1665mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1666mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1667mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1668mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1669mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCKickUserGameRoomRsp texasPoker$SCKickUserGameRoomRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLKickOffUuid(long j);

        public final native Builder setLRoomID(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.dF();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{12247, 12248, 12249, 12250, 12251, 12252, 12253, 12254, 12255, 12256, 12257, 12258, 12259, 12260, 12261, 12262, 12263, 12264, 12265, 12266, 12267, 12268, 12269, 12270, 12271, 12272, 12273, 12274, 12275, 12276});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCKickUserGameRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCKickUserGameRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCKickUserGameRoomRsp texasPoker$SCKickUserGameRoomRsp);

    private native TexasPoker$SCKickUserGameRoomRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCKickUserGameRoomRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCKickUserGameRoomRsp texasPoker$SCKickUserGameRoomRsp);

    private native TexasPoker$SCKickUserGameRoomRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1646getDefaultInstanceForType();

    public final native TexasPoker$SCKickUserGameRoomRsp m1647getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLKickOffUuid();

    public final native long getLRoomID();

    public final native Parser<TexasPoker$SCKickUserGameRoomRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLKickOffUuid();

    public final native boolean hasLRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1648newBuilderForType();

    public final native Builder m1649newBuilderForType();

    protected final native Builder m1650newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1651toBuilder();

    public final native Builder m1652toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCKickUserGameRoomRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.dF();
    }

    static void __clinit__() {
        PARSER = new C00181();
        TexasPoker$SCKickUserGameRoomRsp texasPoker$SCKickUserGameRoomRsp = new TexasPoker$SCKickUserGameRoomRsp(true);
        defaultInstance = texasPoker$SCKickUserGameRoomRsp;
        texasPoker$SCKickUserGameRoomRsp.initFields();
    }

    public static TexasPoker$SCKickUserGameRoomRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCKickUserGameRoomRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCKickUserGameRoomRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCKickUserGameRoomRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCKickUserGameRoomRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCKickUserGameRoomRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCKickUserGameRoomRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCKickUserGameRoomRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCKickUserGameRoomRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCKickUserGameRoomRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCKickUserGameRoomRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCKickUserGameRoomRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCKickUserGameRoomRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCKickUserGameRoomRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCKickUserGameRoomRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCKickUserGameRoomRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCKickUserGameRoomRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCKickUserGameRoomRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCKickUserGameRoomRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCKickUserGameRoomRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCKickUserGameRoomRsp texasPoker$SCKickUserGameRoomRsp) {
        return newBuilder().mergeFrom(texasPoker$SCKickUserGameRoomRsp);
    }
}
