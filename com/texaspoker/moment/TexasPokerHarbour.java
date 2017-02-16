package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.BuilderParent;
import com.google.protobuf.GeneratedMessage.FieldAccessorTable;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPokerHarbour {
    private static final Descriptor f36a;
    private static FieldAccessorTable f37b;
    private static final Descriptor f38c;
    private static FieldAccessorTable f39d;
    private static FileDescriptor f40e;

    /* renamed from: com.texaspoker.moment.TexasPokerHarbour.1 */
    class C01091 implements InternalDescriptorAssigner {
        static {
            fixHelper.fixfunc(new int[]{24524, 24525});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C01091();

        public final native ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
    }

    public interface CSReportLocationInfoOrBuilder extends MessageOrBuilder {
        long getLLat();

        long getLLon();

        long getUuid();

        boolean hasLLat();

        boolean hasLLon();

        boolean hasUuid();
    }

    public static final class CSReportLocationInfo extends GeneratedMessage implements CSReportLocationInfoOrBuilder {
        public static final int LLAT_FIELD_NUMBER = 2;
        public static final int LLON_FIELD_NUMBER = 3;
        public static Parser<CSReportLocationInfo> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSReportLocationInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lLat_;
        private long lLon_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHarbour.CSReportLocationInfo.1 */
        class C01101 extends AbstractParser<CSReportLocationInfo> {
            static {
                fixHelper.fixfunc(new int[]{30159, 30160});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01101();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSReportLocationInfoOrBuilder {
            private int bitField0_;
            private long lLat_;
            private long lLon_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{32088, 32089, 32090, 32091, 32092, 32093, 32094, 32095, 32096, 32097, 32098, 32099, 32100, 32101, 32102, 32103, 32104, 32105, 32106, 32107, 32108, 32109, 32110, 32111, 32112, 32113, 32114, 32115, 32116, 32117, 32118, 32119, 32120, 32121, 32122, 32123, 32124, 32125, 32126, 32127, 32128, 32129, 32130, 32131});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m2829build();

            public final native CSReportLocationInfo m2830build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m2831buildPartial();

            public final native CSReportLocationInfo m2832buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2833clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2834clear();

            public final native Builder m2835clear();

            public final native Builder clearLLat();

            public final native Builder clearLLon();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2836clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2837clone();

            public final native Builder m2838clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m2839getDefaultInstanceForType();

            public final native CSReportLocationInfo m2840getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLLat();

            public final native long getLLon();

            public final native long getUuid();

            public final native boolean hasLLat();

            public final native boolean hasLLon();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2841mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2842mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2843mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2844mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2845mergeFrom(Message message);

            public final native Builder mergeFrom(CSReportLocationInfo cSReportLocationInfo);

            public final native Builder setLLat(long j);

            public final native Builder setLLon(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHarbour.f36a;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31398, 31399, 31400, 31401, 31402, 31403, 31404, 31405, 31406, 31407, 31408, 31409, 31410, 31411, 31412, 31413, 31414, 31415, 31416, 31417, 31418, 31419, 31420, 31421, 31422, 31423, 31424, 31425, 31426, 31427});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSReportLocationInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSReportLocationInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSReportLocationInfo cSReportLocationInfo);

        private native CSReportLocationInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSReportLocationInfo(com.google.protobuf.GeneratedMessage.Builder builder, CSReportLocationInfo cSReportLocationInfo);

        private native CSReportLocationInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2822getDefaultInstanceForType();

        public final native CSReportLocationInfo m2823getDefaultInstanceForType();

        public final native long getLLat();

        public final native long getLLon();

        public final native Parser<CSReportLocationInfo> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLLat();

        public final native boolean hasLLon();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2824newBuilderForType();

        public final native Builder m2825newBuilderForType();

        protected final native Builder m2826newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2827toBuilder();

        public final native Builder m2828toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSReportLocationInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHarbour.f36a;
        }

        static void __clinit__() {
            PARSER = new C01101();
            CSReportLocationInfo cSReportLocationInfo = new CSReportLocationInfo(true);
            defaultInstance = cSReportLocationInfo;
            cSReportLocationInfo.initFields();
        }

        public static CSReportLocationInfo parseFrom(ByteString byteString) {
            return (CSReportLocationInfo) PARSER.parseFrom(byteString);
        }

        public static CSReportLocationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSReportLocationInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSReportLocationInfo parseFrom(byte[] bArr) {
            return (CSReportLocationInfo) PARSER.parseFrom(bArr);
        }

        public static CSReportLocationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSReportLocationInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSReportLocationInfo parseFrom(InputStream inputStream) {
            return (CSReportLocationInfo) PARSER.parseFrom(inputStream);
        }

        public static CSReportLocationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSReportLocationInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSReportLocationInfo parseDelimitedFrom(InputStream inputStream) {
            return (CSReportLocationInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSReportLocationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSReportLocationInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSReportLocationInfo parseFrom(CodedInputStream codedInputStream) {
            return (CSReportLocationInfo) PARSER.parseFrom(codedInputStream);
        }

        public static CSReportLocationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSReportLocationInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSReportLocationInfo cSReportLocationInfo) {
            return newBuilder().mergeFrom(cSReportLocationInfo);
        }
    }

    public interface SCReportLocationInfoRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getUuid();

        boolean hasEErrCode();

        boolean hasUuid();
    }

    public static final class SCReportLocationInfoRsp extends GeneratedMessage implements SCReportLocationInfoRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCReportLocationInfoRsp> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 2;
        private static final SCReportLocationInfoRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHarbour.SCReportLocationInfoRsp.1 */
        class C01111 extends AbstractParser<SCReportLocationInfoRsp> {
            static {
                fixHelper.fixfunc(new int[]{4447, 4448});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01111();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCReportLocationInfoRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{11921, 11922, 11923, 11924, 11925, 11926, 11927, 11928, 11929, 11930, 11931, 11932, 11933, 11934, 11935, 11936, 11937, 11938, 11939, 11940, 11941, 11942, 11943, 11944, 11945, 11946, 11947, 11948, 11949, 11950, 11951, 11952, 11953, 11954, 11955, 11956, 11957, 11958, 11959, 11960});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m2853build();

            public final native SCReportLocationInfoRsp m2854build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m2855buildPartial();

            public final native SCReportLocationInfoRsp m2856buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2857clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2858clear();

            public final native Builder m2859clear();

            public final native Builder clearEErrCode();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2860clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2861clone();

            public final native Builder m2862clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m2863getDefaultInstanceForType();

            public final native SCReportLocationInfoRsp m2864getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getUuid();

            public final native boolean hasEErrCode();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2865mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2866mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2867mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2868mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m2869mergeFrom(Message message);

            public final native Builder mergeFrom(SCReportLocationInfoRsp sCReportLocationInfoRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHarbour.f38c;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7250, 7251, 7252, 7253, 7254, 7255, 7256, 7257, 7258, 7259, 7260, 7261, 7262, 7263, 7264, 7265, 7266, 7267, 7268, 7269, 7270, 7271, 7272, 7273, 7274, 7275, 7276, 7277});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCReportLocationInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCReportLocationInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCReportLocationInfoRsp sCReportLocationInfoRsp);

        private native SCReportLocationInfoRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCReportLocationInfoRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCReportLocationInfoRsp sCReportLocationInfoRsp);

        private native SCReportLocationInfoRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2846getDefaultInstanceForType();

        public final native SCReportLocationInfoRsp m2847getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCReportLocationInfoRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEErrCode();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2848newBuilderForType();

        public final native Builder m2849newBuilderForType();

        protected final native Builder m2850newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2851toBuilder();

        public final native Builder m2852toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCReportLocationInfoRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHarbour.f38c;
        }

        static void __clinit__() {
            PARSER = new C01111();
            SCReportLocationInfoRsp sCReportLocationInfoRsp = new SCReportLocationInfoRsp(true);
            defaultInstance = sCReportLocationInfoRsp;
            sCReportLocationInfoRsp.initFields();
        }

        public static SCReportLocationInfoRsp parseFrom(ByteString byteString) {
            return (SCReportLocationInfoRsp) PARSER.parseFrom(byteString);
        }

        public static SCReportLocationInfoRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCReportLocationInfoRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCReportLocationInfoRsp parseFrom(byte[] bArr) {
            return (SCReportLocationInfoRsp) PARSER.parseFrom(bArr);
        }

        public static SCReportLocationInfoRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCReportLocationInfoRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCReportLocationInfoRsp parseFrom(InputStream inputStream) {
            return (SCReportLocationInfoRsp) PARSER.parseFrom(inputStream);
        }

        public static SCReportLocationInfoRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCReportLocationInfoRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCReportLocationInfoRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCReportLocationInfoRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCReportLocationInfoRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCReportLocationInfoRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCReportLocationInfoRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCReportLocationInfoRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCReportLocationInfoRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCReportLocationInfoRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCReportLocationInfoRsp sCReportLocationInfoRsp) {
            return newBuilder().mergeFrom(sCReportLocationInfoRsp);
        }
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TexasPokerCommon.m11a()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017TexasPokerHarbour.proto\u0012\ntexaspoker\u001a\u0016TexasPokerCommon.proto\"@\n\u0014CSReportLocationInfo\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004lLat\u0018\u0002 \u0002(\u0003\u0012\f\n\u0004lLon\u0018\u0003 \u0002(\u0003\"V\n\u0017SCReportLocationInfoRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\f\n\u0004uuid\u0018\u0002 \u0002(\u0003B*\n\u0015com.texaspoker.momentB\u0011TexasPokerHarbour"}, fileDescriptorArr, new C01091());
        f36a = (Descriptor) f40e.getMessageTypes().get(0);
        f37b = new FieldAccessorTable(f36a, new String[]{"Uuid", "LLat", "LLon"});
        f38c = (Descriptor) f40e.getMessageTypes().get(1);
        f39d = new FieldAccessorTable(f38c, new String[]{"EErrCode", "Uuid"});
        TexasPokerCommon.m11a();
    }
}
