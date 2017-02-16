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
import java.util.List;

public final class TexasPoker$SCShowTableCardsRsp extends GeneratedMessage implements TexasPoker$SCShowTableCardsRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LGAMEHANDID_FIELD_NUMBER = 3;
    public static final int LGAMEROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCShowTableCardsRsp> PARSER = null;
    public static final int VTABLECARDS_FIELD_NUMBER = 4;
    private static final TexasPoker$SCShowTableCardsRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lGameHandID_;
    private long lGameRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<Long> vTableCards_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCShowTableCardsRsp.1 */
    class C00501 extends AbstractParser<TexasPoker$SCShowTableCardsRsp> {
        static {
            fixHelper.fixfunc(new int[]{13289, 13290});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00501();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCShowTableCardsRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCShowTableCardsRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lGameHandID_;
        private long lGameRoomID_;
        private List<Long> vTableCards_;

        static {
            fixHelper.fixfunc(new int[]{27337, 27338, 27339, 27340, 27341, 27342, 27343, 27344, 27345, 27346, 27347, 27348, 27349, 27350, 27351, 27352, 27353, 27354, 27355, 27356, 27357, 27358, 27359, 27360, 27361, 27362, 27363, 27364, 27365, 27366, 27367, 27368, 27369, 27370, 27371, 27372, 27373, 27374, 27375, 27376, 27377, 27378, 27379, 27380, 27381, 27382, 27383, 27384, 27385, 27386, 27387, 27388});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVTableCardsIsMutable();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVTableCards(Iterable<? extends Long> iterable);

        public final native Builder addVTableCards(long j);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2181build();

        public final native TexasPoker$SCShowTableCardsRsp m2182build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2183buildPartial();

        public final native TexasPoker$SCShowTableCardsRsp m2184buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2185clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2186clear();

        public final native Builder m2187clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLGameHandID();

        public final native Builder clearLGameRoomID();

        public final native Builder clearVTableCards();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2188clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2189clone();

        public final native Builder m2190clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2191getDefaultInstanceForType();

        public final native TexasPoker$SCShowTableCardsRsp m2192getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLGameHandID();

        public final native long getLGameRoomID();

        public final native long getVTableCards(int i);

        public final native int getVTableCardsCount();

        public final native List<Long> getVTableCardsList();

        public final native boolean hasEErrCode();

        public final native boolean hasLGameHandID();

        public final native boolean hasLGameRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2193mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2194mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2195mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2196mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2197mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCShowTableCardsRsp texasPoker$SCShowTableCardsRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLGameHandID(long j);

        public final native Builder setLGameRoomID(long j);

        public final native Builder setVTableCards(int i, long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.hd();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{30844, 30845, 30846, 30847, 30848, 30849, 30850, 30851, 30852, 30853, 30854, 30855, 30856, 30857, 30858, 30859, 30860, 30861, 30862, 30863, 30864, 30865, 30866, 30867, 30868, 30869, 30870, 30871, 30872, 30873, 30874, 30875, 30876});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCShowTableCardsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCShowTableCardsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCShowTableCardsRsp texasPoker$SCShowTableCardsRsp);

    private native TexasPoker$SCShowTableCardsRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCShowTableCardsRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCShowTableCardsRsp texasPoker$SCShowTableCardsRsp);

    private native TexasPoker$SCShowTableCardsRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2174getDefaultInstanceForType();

    public final native TexasPoker$SCShowTableCardsRsp m2175getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLGameHandID();

    public final native long getLGameRoomID();

    public final native Parser<TexasPoker$SCShowTableCardsRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native long getVTableCards(int i);

    public final native int getVTableCardsCount();

    public final native List<Long> getVTableCardsList();

    public final native boolean hasEErrCode();

    public final native boolean hasLGameHandID();

    public final native boolean hasLGameRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2176newBuilderForType();

    public final native Builder m2177newBuilderForType();

    protected final native Builder m2178newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2179toBuilder();

    public final native Builder m2180toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCShowTableCardsRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.hd();
    }

    static void __clinit__() {
        PARSER = new C00501();
        TexasPoker$SCShowTableCardsRsp texasPoker$SCShowTableCardsRsp = new TexasPoker$SCShowTableCardsRsp(true);
        defaultInstance = texasPoker$SCShowTableCardsRsp;
        texasPoker$SCShowTableCardsRsp.initFields();
    }

    public static TexasPoker$SCShowTableCardsRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCShowTableCardsRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCShowTableCardsRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShowTableCardsRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCShowTableCardsRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCShowTableCardsRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCShowTableCardsRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShowTableCardsRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCShowTableCardsRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCShowTableCardsRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCShowTableCardsRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShowTableCardsRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCShowTableCardsRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCShowTableCardsRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCShowTableCardsRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShowTableCardsRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCShowTableCardsRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCShowTableCardsRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCShowTableCardsRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCShowTableCardsRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCShowTableCardsRsp texasPoker$SCShowTableCardsRsp) {
        return newBuilder().mergeFrom(texasPoker$SCShowTableCardsRsp);
    }
}
