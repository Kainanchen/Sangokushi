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
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCSendMsgRsp extends GeneratedMessage implements TexasPoker$SCSendMsgRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int ETALKTYPE_FIELD_NUMBER = 3;
    public static final int LCURRENTSEQ_FIELD_NUMBER = 6;
    public static final int LMSGID_FIELD_NUMBER = 4;
    public static final int LPICMSGID_FIELD_NUMBER = 5;
    public static final int LTALKWITH_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCSendMsgRsp> PARSER;
    private static final TexasPoker$SCSendMsgRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private CHAT_TYPE eTalkType_;
    private int lCurrentSeq_;
    private long lMsgId_;
    private long lPicMsgId_;
    private long lTalkwith_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSendMsgRsp.1 */
    class C00401 extends AbstractParser<TexasPoker$SCSendMsgRsp> {
        static {
            fixHelper.fixfunc(new int[]{26775, 26776});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00401();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSendMsgRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSendMsgRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private CHAT_TYPE eTalkType_;
        private int lCurrentSeq_;
        private long lMsgId_;
        private long lPicMsgId_;
        private long lTalkwith_;

        static {
            fixHelper.fixfunc(new int[]{6275, 6276, 6277, 6278, 6279, 6280, 6281, 6282, 6283, 6284, 6285, 6286, 6287, 6288, 6289, 6290, 6291, 6292, 6293, 6294, 6295, 6296, 6297, 6298, 6299, 6300, 6301, 6302, 6303, 6304, 6305, 6306, 6307, 6308, 6309, 6310, 6311, 6312, 6313, 6314, 6315, 6316, 6317, 6318, 6319, 6320, 6321, 6322, 6323, 6324, 6325, 6326, 6327, 6328, 6329, 6330});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1917build();

        public final native TexasPoker$SCSendMsgRsp m1918build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1919buildPartial();

        public final native TexasPoker$SCSendMsgRsp m1920buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1921clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1922clear();

        public final native Builder m1923clear();

        public final native Builder clearEErrCode();

        public final native Builder clearETalkType();

        public final native Builder clearLCurrentSeq();

        public final native Builder clearLMsgId();

        public final native Builder clearLPicMsgId();

        public final native Builder clearLTalkwith();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1924clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1925clone();

        public final native Builder m1926clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1927getDefaultInstanceForType();

        public final native TexasPoker$SCSendMsgRsp m1928getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native CHAT_TYPE getETalkType();

        public final native int getLCurrentSeq();

        public final native long getLMsgId();

        public final native long getLPicMsgId();

        public final native long getLTalkwith();

        public final native boolean hasEErrCode();

        public final native boolean hasETalkType();

        public final native boolean hasLCurrentSeq();

        public final native boolean hasLMsgId();

        public final native boolean hasLPicMsgId();

        public final native boolean hasLTalkwith();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1929mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1930mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1931mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1932mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1933mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSendMsgRsp texasPoker$SCSendMsgRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setETalkType(CHAT_TYPE chat_type);

        public final native Builder setLCurrentSeq(int i);

        public final native Builder setLMsgId(long j);

        public final native Builder setLPicMsgId(long j);

        public final native Builder setLTalkwith(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.eT();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{24451, 24452, 24453, 24454, 24455, 24456, 24457, 24458, 24459, 24460, 24461, 24462, 24463, 24464, 24465, 24466, 24467, 24468, 24469, 24470, 24471, 24472, 24473, 24474, 24475, 24476, 24477, 24478, 24479, 24480, 24481, 24482, 24483, 24484, 24485, 24486});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSendMsgRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSendMsgRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSendMsgRsp texasPoker$SCSendMsgRsp);

    private native TexasPoker$SCSendMsgRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSendMsgRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSendMsgRsp texasPoker$SCSendMsgRsp);

    private native TexasPoker$SCSendMsgRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1910getDefaultInstanceForType();

    public final native TexasPoker$SCSendMsgRsp m1911getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native CHAT_TYPE getETalkType();

    public final native int getLCurrentSeq();

    public final native long getLMsgId();

    public final native long getLPicMsgId();

    public final native long getLTalkwith();

    public final native Parser<TexasPoker$SCSendMsgRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasETalkType();

    public final native boolean hasLCurrentSeq();

    public final native boolean hasLMsgId();

    public final native boolean hasLPicMsgId();

    public final native boolean hasLTalkwith();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1912newBuilderForType();

    public final native Builder m1913newBuilderForType();

    protected final native Builder m1914newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1915toBuilder();

    public final native Builder m1916toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSendMsgRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.eT();
    }

    static void __clinit__() {
        PARSER = new C00401();
        TexasPoker$SCSendMsgRsp texasPoker$SCSendMsgRsp = new TexasPoker$SCSendMsgRsp(true);
        defaultInstance = texasPoker$SCSendMsgRsp;
        texasPoker$SCSendMsgRsp.initFields();
    }

    public static TexasPoker$SCSendMsgRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCSendMsgRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSendMsgRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSendMsgRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSendMsgRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCSendMsgRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSendMsgRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSendMsgRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSendMsgRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSendMsgRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSendMsgRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSendMsgRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSendMsgRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSendMsgRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSendMsgRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSendMsgRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSendMsgRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSendMsgRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSendMsgRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSendMsgRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSendMsgRsp texasPoker$SCSendMsgRsp) {
        return newBuilder().mergeFrom(texasPoker$SCSendMsgRsp);
    }
}
