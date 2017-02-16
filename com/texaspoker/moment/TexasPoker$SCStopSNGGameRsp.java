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

public final class TexasPoker$SCStopSNGGameRsp extends GeneratedMessage implements TexasPoker$SCStopSNGGameRspOrBuilder {
    public static final int BSTOP_FIELD_NUMBER = 2;
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCStopSNGGameRsp> PARSER;
    private static final TexasPoker$SCStopSNGGameRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private long bStop_;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCStopSNGGameRsp.1 */
    class C00561 extends AbstractParser<TexasPoker$SCStopSNGGameRsp> {
        static {
            fixHelper.fixfunc(new int[]{19572, 19573});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00561();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCStopSNGGameRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCStopSNGGameRspOrBuilder {
        private long bStop_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;

        static {
            fixHelper.fixfunc(new int[]{5033, 5034, 5035, 5036, 5037, 5038, 5039, 5040, 5041, 5042, 5043, 5044, 5045, 5046, 5047, 5048, 5049, 5050, 5051, 5052, 5053, 5054, 5055, 5056, 5057, 5058, 5059, 5060, 5061, 5062, 5063, 5064, 5065, 5066, 5067, 5068, 5069, 5070, 5071, 5072});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2301build();

        public final native TexasPoker$SCStopSNGGameRsp m2302build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2303buildPartial();

        public final native TexasPoker$SCStopSNGGameRsp m2304buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2305clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2306clear();

        public final native Builder m2307clear();

        public final native Builder clearBStop();

        public final native Builder clearEErrCode();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2308clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2309clone();

        public final native Builder m2310clone();

        public final native long getBStop();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2311getDefaultInstanceForType();

        public final native TexasPoker$SCStopSNGGameRsp m2312getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native boolean hasBStop();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2313mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2314mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2315mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2316mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2317mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCStopSNGGameRsp texasPoker$SCStopSNGGameRsp);

        public final native Builder setBStop(long j);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public static final Descriptor getDescriptor() {
            return TexasPoker.gd();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{12217, 12218, 12219, 12220, 12221, 12222, 12223, 12224, 12225, 12226, 12227, 12228, 12229, 12230, 12231, 12232, 12233, 12234, 12235, 12236, 12237, 12238, 12239, 12240, 12241, 12242, 12243, 12244});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCStopSNGGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCStopSNGGameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCStopSNGGameRsp texasPoker$SCStopSNGGameRsp);

    private native TexasPoker$SCStopSNGGameRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCStopSNGGameRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCStopSNGGameRsp texasPoker$SCStopSNGGameRsp);

    private native TexasPoker$SCStopSNGGameRsp(boolean z);

    private native void initFields();

    public final native long getBStop();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2294getDefaultInstanceForType();

    public final native TexasPoker$SCStopSNGGameRsp m2295getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCStopSNGGameRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasBStop();

    public final native boolean hasEErrCode();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2296newBuilderForType();

    public final native Builder m2297newBuilderForType();

    protected final native Builder m2298newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2299toBuilder();

    public final native Builder m2300toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCStopSNGGameRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.gd();
    }

    static void __clinit__() {
        PARSER = new C00561();
        TexasPoker$SCStopSNGGameRsp texasPoker$SCStopSNGGameRsp = new TexasPoker$SCStopSNGGameRsp(true);
        defaultInstance = texasPoker$SCStopSNGGameRsp;
        texasPoker$SCStopSNGGameRsp.initFields();
    }

    public static TexasPoker$SCStopSNGGameRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCStopSNGGameRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCStopSNGGameRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStopSNGGameRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCStopSNGGameRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCStopSNGGameRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCStopSNGGameRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStopSNGGameRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCStopSNGGameRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCStopSNGGameRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCStopSNGGameRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStopSNGGameRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCStopSNGGameRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCStopSNGGameRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCStopSNGGameRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStopSNGGameRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCStopSNGGameRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCStopSNGGameRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCStopSNGGameRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCStopSNGGameRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCStopSNGGameRsp texasPoker$SCStopSNGGameRsp) {
        return newBuilder().mergeFrom(texasPoker$SCStopSNGGameRsp);
    }
}
