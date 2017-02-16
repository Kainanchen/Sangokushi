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

public final class TexasPoker$SCUploadAPNTokenRsp extends GeneratedMessage implements TexasPoker$SCUploadAPNTokenRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCUploadAPNTokenRsp> PARSER;
    private static final TexasPoker$SCUploadAPNTokenRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUploadAPNTokenRsp.1 */
    class C00621 extends AbstractParser<TexasPoker$SCUploadAPNTokenRsp> {
        static {
            fixHelper.fixfunc(new int[]{10803, 10804});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00621();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUploadAPNTokenRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCUploadAPNTokenRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;

        static {
            fixHelper.fixfunc(new int[]{11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11823, 11824, 11825, 11826, 11827, 11828});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2469build();

        public final native TexasPoker$SCUploadAPNTokenRsp m2470build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2471buildPartial();

        public final native TexasPoker$SCUploadAPNTokenRsp m2472buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2473clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2474clear();

        public final native Builder m2475clear();

        public final native Builder clearEErrCode();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2476clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2477clone();

        public final native Builder m2478clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2479getDefaultInstanceForType();

        public final native TexasPoker$SCUploadAPNTokenRsp m2480getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2481mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2482mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2483mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2484mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2485mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCUploadAPNTokenRsp texasPoker$SCUploadAPNTokenRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public static final Descriptor getDescriptor() {
            return TexasPoker.gV();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{24347, 24348, 24349, 24350, 24351, 24352, 24353, 24354, 24355, 24356, 24357, 24358, 24359, 24360, 24361, 24362, 24363, 24364, 24365, 24366, 24367, 24368, 24369, 24370, 24371, 24372});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCUploadAPNTokenRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCUploadAPNTokenRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCUploadAPNTokenRsp texasPoker$SCUploadAPNTokenRsp);

    private native TexasPoker$SCUploadAPNTokenRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCUploadAPNTokenRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCUploadAPNTokenRsp texasPoker$SCUploadAPNTokenRsp);

    private native TexasPoker$SCUploadAPNTokenRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2462getDefaultInstanceForType();

    public final native TexasPoker$SCUploadAPNTokenRsp m2463getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCUploadAPNTokenRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2464newBuilderForType();

    public final native Builder m2465newBuilderForType();

    protected final native Builder m2466newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2467toBuilder();

    public final native Builder m2468toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCUploadAPNTokenRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.gV();
    }

    static void __clinit__() {
        PARSER = new C00621();
        TexasPoker$SCUploadAPNTokenRsp texasPoker$SCUploadAPNTokenRsp = new TexasPoker$SCUploadAPNTokenRsp(true);
        defaultInstance = texasPoker$SCUploadAPNTokenRsp;
        texasPoker$SCUploadAPNTokenRsp.initFields();
    }

    public static TexasPoker$SCUploadAPNTokenRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCUploadAPNTokenRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCUploadAPNTokenRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadAPNTokenRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadAPNTokenRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCUploadAPNTokenRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCUploadAPNTokenRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadAPNTokenRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadAPNTokenRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCUploadAPNTokenRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCUploadAPNTokenRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadAPNTokenRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadAPNTokenRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCUploadAPNTokenRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCUploadAPNTokenRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadAPNTokenRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadAPNTokenRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCUploadAPNTokenRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCUploadAPNTokenRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadAPNTokenRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCUploadAPNTokenRsp texasPoker$SCUploadAPNTokenRsp) {
        return newBuilder().mergeFrom(texasPoker$SCUploadAPNTokenRsp);
    }
}
