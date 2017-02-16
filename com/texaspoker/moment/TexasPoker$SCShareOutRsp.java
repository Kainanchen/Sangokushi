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

public final class TexasPoker$SCShareOutRsp extends GeneratedMessage implements TexasPoker$SCShareOutRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LPOPULARITY_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCShareOutRsp> PARSER;
    private static final TexasPoker$SCShareOutRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lPopularity_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCShareOutRsp.1 */
    class C00481 extends AbstractParser<TexasPoker$SCShareOutRsp> {
        static {
            fixHelper.fixfunc(new int[]{30165, 30166});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00481();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCShareOutRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCShareOutRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lPopularity_;

        static {
            fixHelper.fixfunc(new int[]{11255, 11256, 11257, 11258, 11259, 11260, 11261, 11262, 11263, 11264, 11265, 11266, 11267, 11268, 11269, 11270, 11271, 11272, 11273, 11274, 11275, 11276, 11277, 11278, 11279, 11280, 11281, 11282, 11283, 11284, 11285, 11286, 11287, 11288, 11289, 11290, 11291, 11292, 11293, 11294});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2133build();

        public final native TexasPoker$SCShareOutRsp m2134build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2135buildPartial();

        public final native TexasPoker$SCShareOutRsp m2136buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2137clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2138clear();

        public final native Builder m2139clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLPopularity();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2140clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2141clone();

        public final native Builder m2142clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2143getDefaultInstanceForType();

        public final native TexasPoker$SCShareOutRsp m2144getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLPopularity();

        public final native boolean hasEErrCode();

        public final native boolean hasLPopularity();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2145mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2146mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2147mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2148mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2149mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCShareOutRsp texasPoker$SCShareOutRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLPopularity(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.ap();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{27391, 27392, 27393, 27394, 27395, 27396, 27397, 27398, 27399, 27400, 27401, 27402, 27403, 27404, 27405, 27406, 27407, 27408, 27409, 27410, 27411, 27412, 27413, 27414, 27415, 27416, 27417, 27418});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCShareOutRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCShareOutRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCShareOutRsp texasPoker$SCShareOutRsp);

    private native TexasPoker$SCShareOutRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCShareOutRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCShareOutRsp texasPoker$SCShareOutRsp);

    private native TexasPoker$SCShareOutRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2126getDefaultInstanceForType();

    public final native TexasPoker$SCShareOutRsp m2127getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLPopularity();

    public final native Parser<TexasPoker$SCShareOutRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLPopularity();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2128newBuilderForType();

    public final native Builder m2129newBuilderForType();

    protected final native Builder m2130newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2131toBuilder();

    public final native Builder m2132toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCShareOutRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.ap();
    }

    static void __clinit__() {
        PARSER = new C00481();
        TexasPoker$SCShareOutRsp texasPoker$SCShareOutRsp = new TexasPoker$SCShareOutRsp(true);
        defaultInstance = texasPoker$SCShareOutRsp;
        texasPoker$SCShareOutRsp.initFields();
    }

    public static TexasPoker$SCShareOutRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCShareOutRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCShareOutRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShareOutRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCShareOutRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCShareOutRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCShareOutRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShareOutRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCShareOutRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCShareOutRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCShareOutRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShareOutRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCShareOutRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCShareOutRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCShareOutRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShareOutRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCShareOutRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCShareOutRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCShareOutRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShareOutRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCShareOutRsp texasPoker$SCShareOutRsp) {
        return newBuilder().mergeFrom(texasPoker$SCShareOutRsp);
    }
}
