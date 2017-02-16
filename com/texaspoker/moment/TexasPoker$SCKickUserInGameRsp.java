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

public final class TexasPoker$SCKickUserInGameRsp extends GeneratedMessage implements TexasPoker$SCKickUserInGameRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LGAMEROOMID_FIELD_NUMBER = 2;
    public static final int LKICKUSERUUID_FIELD_NUMBER = 3;
    public static Parser<TexasPoker$SCKickUserInGameRsp> PARSER;
    private static final TexasPoker$SCKickUserInGameRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lGameRoomID_;
    private int lKickUserUuid_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCKickUserInGameRsp.1 */
    class C00191 extends AbstractParser<TexasPoker$SCKickUserInGameRsp> {
        static {
            fixHelper.fixfunc(new int[]{33025, 33026});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00191();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCKickUserInGameRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCKickUserInGameRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lGameRoomID_;
        private int lKickUserUuid_;

        static {
            fixHelper.fixfunc(new int[]{26440, 26441, 26442, 26443, 26444, 26445, 26446, 26447, 26448, 26449, 26450, 26451, 26452, 26453, 26454, 26455, 26456, 26457, 26458, 26459, 26460, 26461, 26462, 26463, 26464, 26465, 26466, 26467, 26468, 26469, 26470, 26471, 26472, 26473, 26474, 26475, 26476, 26477, 26478, 26479, 26480, 26481, 26482, 26483});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1461build();

        public final native TexasPoker$SCKickUserInGameRsp m1462build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1463buildPartial();

        public final native TexasPoker$SCKickUserInGameRsp m1464buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1465clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1466clear();

        public final native Builder m1467clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLGameRoomID();

        public final native Builder clearLKickUserUuid();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1468clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1469clone();

        public final native Builder m1470clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1471getDefaultInstanceForType();

        public final native TexasPoker$SCKickUserInGameRsp m1472getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLGameRoomID();

        public final native int getLKickUserUuid();

        public final native boolean hasEErrCode();

        public final native boolean hasLGameRoomID();

        public final native boolean hasLKickUserUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1473mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1474mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1475mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1476mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1477mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCKickUserInGameRsp texasPoker$SCKickUserInGameRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLGameRoomID(long j);

        public final native Builder setLKickUserUuid(int i);

        public static final Descriptor getDescriptor() {
            return TexasPoker.gR();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{5934, 5935, 5936, 5937, 5938, 5939, 5940, 5941, 5942, 5943, 5944, 5945, 5946, 5947, 5948, 5949, 5950, 5951, 5952, 5953, 5954, 5955, 5956, 5957, 5958, 5959, 5960, 5961, 5962, 5963});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCKickUserInGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCKickUserInGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCKickUserInGameRsp texasPoker$SCKickUserInGameRsp);

    private native TexasPoker$SCKickUserInGameRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCKickUserInGameRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCKickUserInGameRsp texasPoker$SCKickUserInGameRsp);

    private native TexasPoker$SCKickUserInGameRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1454getDefaultInstanceForType();

    public final native TexasPoker$SCKickUserInGameRsp m1455getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLGameRoomID();

    public final native int getLKickUserUuid();

    public final native Parser<TexasPoker$SCKickUserInGameRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLGameRoomID();

    public final native boolean hasLKickUserUuid();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1456newBuilderForType();

    public final native Builder m1457newBuilderForType();

    protected final native Builder m1458newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1459toBuilder();

    public final native Builder m1460toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCKickUserInGameRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.gR();
    }

    static void __clinit__() {
        PARSER = new C00191();
        TexasPoker$SCKickUserInGameRsp texasPoker$SCKickUserInGameRsp = new TexasPoker$SCKickUserInGameRsp(true);
        defaultInstance = texasPoker$SCKickUserInGameRsp;
        texasPoker$SCKickUserInGameRsp.initFields();
    }

    public static TexasPoker$SCKickUserInGameRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCKickUserInGameRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCKickUserInGameRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCKickUserInGameRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCKickUserInGameRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCKickUserInGameRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCKickUserInGameRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCKickUserInGameRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCKickUserInGameRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCKickUserInGameRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCKickUserInGameRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCKickUserInGameRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCKickUserInGameRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCKickUserInGameRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCKickUserInGameRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCKickUserInGameRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCKickUserInGameRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCKickUserInGameRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCKickUserInGameRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCKickUserInGameRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCKickUserInGameRsp texasPoker$SCKickUserInGameRsp) {
        return newBuilder().mergeFrom(texasPoker$SCKickUserInGameRsp);
    }
}
