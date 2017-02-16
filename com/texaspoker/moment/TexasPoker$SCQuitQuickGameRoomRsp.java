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

public final class TexasPoker$SCQuitQuickGameRoomRsp extends GeneratedMessage implements TexasPoker$SCQuitQuickGameRoomRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCQuitQuickGameRoomRsp> PARSER;
    private static final TexasPoker$SCQuitQuickGameRoomRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCQuitQuickGameRoomRsp.1 */
    class C00301 extends AbstractParser<TexasPoker$SCQuitQuickGameRoomRsp> {
        static {
            fixHelper.fixfunc(new int[]{29413, 29414});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00301();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCQuitQuickGameRoomRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCQuitQuickGameRoomRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lRoomID_;

        static {
            fixHelper.fixfunc(new int[]{23901, 23902, 23903, 23904, 23905, 23906, 23907, 23908, 23909, 23910, 23911, 23912, 23913, 23914, 23915, 23916, 23917, 23918, 23919, 23920, 23921, 23922, 23923, 23924, 23925, 23926, 23927, 23928, 23929, 23930, 23931, 23932, 23933, 23934, 23935, 23936, 23937, 23938, 23939, 23940});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1701build();

        public final native TexasPoker$SCQuitQuickGameRoomRsp m1702build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1703buildPartial();

        public final native TexasPoker$SCQuitQuickGameRoomRsp m1704buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1705clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1706clear();

        public final native Builder m1707clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLRoomID();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1708clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1709clone();

        public final native Builder m1710clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1711getDefaultInstanceForType();

        public final native TexasPoker$SCQuitQuickGameRoomRsp m1712getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLRoomID();

        public final native boolean hasEErrCode();

        public final native boolean hasLRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1713mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1714mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1715mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1716mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1717mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCQuitQuickGameRoomRsp texasPoker$SCQuitQuickGameRoomRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLRoomID(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.en();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{30945, 30946, 30947, 30948, 30949, 30950, 30951, 30952, 30953, 30954, 30955, 30956, 30957, 30958, 30959, 30960, 30961, 30962, 30963, 30964, 30965, 30966, 30967, 30968, 30969, 30970, 30971, 30972});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCQuitQuickGameRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCQuitQuickGameRoomRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCQuitQuickGameRoomRsp texasPoker$SCQuitQuickGameRoomRsp);

    private native TexasPoker$SCQuitQuickGameRoomRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCQuitQuickGameRoomRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCQuitQuickGameRoomRsp texasPoker$SCQuitQuickGameRoomRsp);

    private native TexasPoker$SCQuitQuickGameRoomRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1694getDefaultInstanceForType();

    public final native TexasPoker$SCQuitQuickGameRoomRsp m1695getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLRoomID();

    public final native Parser<TexasPoker$SCQuitQuickGameRoomRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1696newBuilderForType();

    public final native Builder m1697newBuilderForType();

    protected final native Builder m1698newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1699toBuilder();

    public final native Builder m1700toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCQuitQuickGameRoomRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.en();
    }

    static void __clinit__() {
        PARSER = new C00301();
        TexasPoker$SCQuitQuickGameRoomRsp texasPoker$SCQuitQuickGameRoomRsp = new TexasPoker$SCQuitQuickGameRoomRsp(true);
        defaultInstance = texasPoker$SCQuitQuickGameRoomRsp;
        texasPoker$SCQuitQuickGameRoomRsp.initFields();
    }

    public static TexasPoker$SCQuitQuickGameRoomRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCQuitQuickGameRoomRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCQuitQuickGameRoomRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCQuitQuickGameRoomRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCQuitQuickGameRoomRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCQuitQuickGameRoomRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCQuitQuickGameRoomRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCQuitQuickGameRoomRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCQuitQuickGameRoomRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCQuitQuickGameRoomRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCQuitQuickGameRoomRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCQuitQuickGameRoomRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCQuitQuickGameRoomRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCQuitQuickGameRoomRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCQuitQuickGameRoomRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCQuitQuickGameRoomRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCQuitQuickGameRoomRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCQuitQuickGameRoomRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCQuitQuickGameRoomRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCQuitQuickGameRoomRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCQuitQuickGameRoomRsp texasPoker$SCQuitQuickGameRoomRsp) {
        return newBuilder().mergeFrom(texasPoker$SCQuitQuickGameRoomRsp);
    }
}
