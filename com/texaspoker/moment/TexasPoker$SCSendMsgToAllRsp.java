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

public final class TexasPoker$SCSendMsgToAllRsp extends GeneratedMessage implements TexasPoker$SCSendMsgToAllRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LMSGID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCSendMsgToAllRsp> PARSER;
    private static final TexasPoker$SCSendMsgToAllRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lMsgId_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSendMsgToAllRsp.1 */
    class C00411 extends AbstractParser<TexasPoker$SCSendMsgToAllRsp> {
        static {
            fixHelper.fixfunc(new int[]{19715, 19716});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00411();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSendMsgToAllRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSendMsgToAllRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lMsgId_;

        static {
            fixHelper.fixfunc(new int[]{29517, 29518, 29519, 29520, 29521, 29522, 29523, 29524, 29525, 29526, 29527, 29528, 29529, 29530, 29531, 29532, 29533, 29534, 29535, 29536, 29537, 29538, 29539, 29540, 29541, 29542, 29543, 29544, 29545, 29546, 29547, 29548, 29549, 29550, 29551, 29552, 29553, 29554, 29555, 29556});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1941build();

        public final native TexasPoker$SCSendMsgToAllRsp m1942build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1943buildPartial();

        public final native TexasPoker$SCSendMsgToAllRsp m1944buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1945clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1946clear();

        public final native Builder m1947clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLMsgId();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1948clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1949clone();

        public final native Builder m1950clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1951getDefaultInstanceForType();

        public final native TexasPoker$SCSendMsgToAllRsp m1952getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLMsgId();

        public final native boolean hasEErrCode();

        public final native boolean hasLMsgId();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1953mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1954mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1955mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1956mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1957mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSendMsgToAllRsp texasPoker$SCSendMsgToAllRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLMsgId(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.ft();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{27419, 27420, 27421, 27422, 27423, 27424, 27425, 27426, 27427, 27428, 27429, 27430, 27431, 27432, 27433, 27434, 27435, 27436, 27437, 27438, 27439, 27440, 27441, 27442, 27443, 27444, 27445, 27446});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSendMsgToAllRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSendMsgToAllRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSendMsgToAllRsp texasPoker$SCSendMsgToAllRsp);

    private native TexasPoker$SCSendMsgToAllRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSendMsgToAllRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSendMsgToAllRsp texasPoker$SCSendMsgToAllRsp);

    private native TexasPoker$SCSendMsgToAllRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1934getDefaultInstanceForType();

    public final native TexasPoker$SCSendMsgToAllRsp m1935getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLMsgId();

    public final native Parser<TexasPoker$SCSendMsgToAllRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLMsgId();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1936newBuilderForType();

    public final native Builder m1937newBuilderForType();

    protected final native Builder m1938newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1939toBuilder();

    public final native Builder m1940toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSendMsgToAllRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.ft();
    }

    static void __clinit__() {
        PARSER = new C00411();
        TexasPoker$SCSendMsgToAllRsp texasPoker$SCSendMsgToAllRsp = new TexasPoker$SCSendMsgToAllRsp(true);
        defaultInstance = texasPoker$SCSendMsgToAllRsp;
        texasPoker$SCSendMsgToAllRsp.initFields();
    }

    public static TexasPoker$SCSendMsgToAllRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCSendMsgToAllRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSendMsgToAllRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSendMsgToAllRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSendMsgToAllRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCSendMsgToAllRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSendMsgToAllRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSendMsgToAllRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSendMsgToAllRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSendMsgToAllRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSendMsgToAllRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSendMsgToAllRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSendMsgToAllRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSendMsgToAllRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSendMsgToAllRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSendMsgToAllRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSendMsgToAllRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSendMsgToAllRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSendMsgToAllRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSendMsgToAllRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSendMsgToAllRsp texasPoker$SCSendMsgToAllRsp) {
        return newBuilder().mergeFrom(texasPoker$SCSendMsgToAllRsp);
    }
}
