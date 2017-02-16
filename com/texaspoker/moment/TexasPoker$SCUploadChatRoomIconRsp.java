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
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

public final class TexasPoker$SCUploadChatRoomIconRsp extends GeneratedMessage implements TexasPoker$SCUploadChatRoomIconRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LROOMID_FIELD_NUMBER = 3;
    public static Parser<TexasPoker$SCUploadChatRoomIconRsp> PARSER = null;
    public static final int SICONURL_FIELD_NUMBER = 2;
    public static final int SSMALLICONURL_FIELD_NUMBER = 4;
    private static final TexasPoker$SCUploadChatRoomIconRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private Object sIconUrl_;
    private Object sSmallIconUrl_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUploadChatRoomIconRsp.1 */
    class C00631 extends AbstractParser<TexasPoker$SCUploadChatRoomIconRsp> {
        static {
            fixHelper.fixfunc(new int[]{26516, 26517});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00631();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUploadChatRoomIconRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCUploadChatRoomIconRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lRoomID_;
        private Object sIconUrl_;
        private Object sSmallIconUrl_;

        static {
            fixHelper.fixfunc(new int[]{8162, 8163, 8164, 8165, 8166, 8167, 8168, 8169, 8170, 8171, 8172, 8173, 8174, 8175, 8176, 8177, 8178, 8179, 8180, 8181, 8182, 8183, 8184, 8185, 8186, 8187, 8188, 8189, 8190, 8191, NTLMConstants.FLAG_NEGOTIATE_WORKSTATION_SUPPLIED, 8193, 8194, 8195, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8203, 8204, 8205, 8206, 8207, 8208, 8209, 8210, 8211, 8212, 8213});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2517build();

        public final native TexasPoker$SCUploadChatRoomIconRsp m2518build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2519buildPartial();

        public final native TexasPoker$SCUploadChatRoomIconRsp m2520buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2521clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2522clear();

        public final native Builder m2523clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLRoomID();

        public final native Builder clearSIconUrl();

        public final native Builder clearSSmallIconUrl();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2524clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2525clone();

        public final native Builder m2526clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2527getDefaultInstanceForType();

        public final native TexasPoker$SCUploadChatRoomIconRsp m2528getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLRoomID();

        public final native String getSIconUrl();

        public final native ByteString getSIconUrlBytes();

        public final native String getSSmallIconUrl();

        public final native ByteString getSSmallIconUrlBytes();

        public final native boolean hasEErrCode();

        public final native boolean hasLRoomID();

        public final native boolean hasSIconUrl();

        public final native boolean hasSSmallIconUrl();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2529mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2530mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2531mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2532mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2533mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCUploadChatRoomIconRsp texasPoker$SCUploadChatRoomIconRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLRoomID(long j);

        public final native Builder setSIconUrl(String str);

        public final native Builder setSIconUrlBytes(ByteString byteString);

        public final native Builder setSSmallIconUrl(String str);

        public final native Builder setSSmallIconUrlBytes(ByteString byteString);

        public static final Descriptor getDescriptor() {
            return TexasPoker.aD();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{21217, 21218, 21219, 21220, 21221, 21222, 21223, 21224, 21225, 21226, 21227, 21228, 21229, 21230, 21231, 21232, 21233, 21234, 21235, 21236, 21237, 21238, 21239, 21240, 21241, 21242, 21243, 21244, 21245, 21246, 21247, 21248, 21249, 21250});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCUploadChatRoomIconRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCUploadChatRoomIconRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCUploadChatRoomIconRsp texasPoker$SCUploadChatRoomIconRsp);

    private native TexasPoker$SCUploadChatRoomIconRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCUploadChatRoomIconRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCUploadChatRoomIconRsp texasPoker$SCUploadChatRoomIconRsp);

    private native TexasPoker$SCUploadChatRoomIconRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2510getDefaultInstanceForType();

    public final native TexasPoker$SCUploadChatRoomIconRsp m2511getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLRoomID();

    public final native Parser<TexasPoker$SCUploadChatRoomIconRsp> getParserForType();

    public final native String getSIconUrl();

    public final native ByteString getSIconUrlBytes();

    public final native String getSSmallIconUrl();

    public final native ByteString getSSmallIconUrlBytes();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLRoomID();

    public final native boolean hasSIconUrl();

    public final native boolean hasSSmallIconUrl();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2512newBuilderForType();

    public final native Builder m2513newBuilderForType();

    protected final native Builder m2514newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2515toBuilder();

    public final native Builder m2516toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCUploadChatRoomIconRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.aD();
    }

    static void __clinit__() {
        PARSER = new C00631();
        TexasPoker$SCUploadChatRoomIconRsp texasPoker$SCUploadChatRoomIconRsp = new TexasPoker$SCUploadChatRoomIconRsp(true);
        defaultInstance = texasPoker$SCUploadChatRoomIconRsp;
        texasPoker$SCUploadChatRoomIconRsp.initFields();
    }

    public static TexasPoker$SCUploadChatRoomIconRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCUploadChatRoomIconRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCUploadChatRoomIconRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadChatRoomIconRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadChatRoomIconRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCUploadChatRoomIconRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCUploadChatRoomIconRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadChatRoomIconRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadChatRoomIconRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCUploadChatRoomIconRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCUploadChatRoomIconRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadChatRoomIconRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadChatRoomIconRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCUploadChatRoomIconRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCUploadChatRoomIconRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadChatRoomIconRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadChatRoomIconRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCUploadChatRoomIconRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCUploadChatRoomIconRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadChatRoomIconRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCUploadChatRoomIconRsp texasPoker$SCUploadChatRoomIconRsp) {
        return newBuilder().mergeFrom(texasPoker$SCUploadChatRoomIconRsp);
    }
}
