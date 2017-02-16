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

public final class TexasPoker$SCGiveMoneyRsp extends GeneratedMessage implements TexasPoker$SCGiveMoneyRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LPOPULARITY_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCGiveMoneyRsp> PARSER;
    private static final TexasPoker$SCGiveMoneyRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lPopularity_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGiveMoneyRsp.1 */
    class C00151 extends AbstractParser<TexasPoker$SCGiveMoneyRsp> {
        static {
            fixHelper.fixfunc(new int[]{19933, 19934});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00151();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGiveMoneyRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGiveMoneyRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lPopularity_;

        static {
            fixHelper.fixfunc(new int[]{33800, 33801, 33802, 33803, 33804, 33805, 33806, 33807, 33808, 33809, 33810, 33811, 33812, 33813, 33814, 33815, 33816, 33817, 33818, 33819, 33820, 33821, 33822, 33823, 33824, 33825, 33826, 33827, 33828, 33829, 33830, 33831, 33832, 33833, 33834, 33835, 33836, 33837, 33838, 33839});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1365build();

        public final native TexasPoker$SCGiveMoneyRsp m1366build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1367buildPartial();

        public final native TexasPoker$SCGiveMoneyRsp m1368buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1369clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1370clear();

        public final native Builder m1371clear();

        public final native Builder clearEErrCode();

        public final native Builder clearLPopularity();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1372clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1373clone();

        public final native Builder m1374clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1375getDefaultInstanceForType();

        public final native TexasPoker$SCGiveMoneyRsp m1376getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLPopularity();

        public final native boolean hasEErrCode();

        public final native boolean hasLPopularity();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1377mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1378mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1379mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1380mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1381mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGiveMoneyRsp texasPoker$SCGiveMoneyRsp);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLPopularity(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.cr();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{11195, 11196, 11197, 11198, 11199, 11200, 11201, 11202, 11203, 11204, 11205, 11206, 11207, 11208, 11209, 11210, 11211, 11212, 11213, 11214, 11215, 11216, 11217, 11218, 11219, 11220, 11221, 11222});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGiveMoneyRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGiveMoneyRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGiveMoneyRsp texasPoker$SCGiveMoneyRsp);

    private native TexasPoker$SCGiveMoneyRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGiveMoneyRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGiveMoneyRsp texasPoker$SCGiveMoneyRsp);

    private native TexasPoker$SCGiveMoneyRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1358getDefaultInstanceForType();

    public final native TexasPoker$SCGiveMoneyRsp m1359getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLPopularity();

    public final native Parser<TexasPoker$SCGiveMoneyRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasLPopularity();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1360newBuilderForType();

    public final native Builder m1361newBuilderForType();

    protected final native Builder m1362newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1363toBuilder();

    public final native Builder m1364toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGiveMoneyRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.cr();
    }

    static void __clinit__() {
        PARSER = new C00151();
        TexasPoker$SCGiveMoneyRsp texasPoker$SCGiveMoneyRsp = new TexasPoker$SCGiveMoneyRsp(true);
        defaultInstance = texasPoker$SCGiveMoneyRsp;
        texasPoker$SCGiveMoneyRsp.initFields();
    }

    public static TexasPoker$SCGiveMoneyRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGiveMoneyRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGiveMoneyRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGiveMoneyRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGiveMoneyRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGiveMoneyRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGiveMoneyRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGiveMoneyRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGiveMoneyRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGiveMoneyRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGiveMoneyRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGiveMoneyRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGiveMoneyRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGiveMoneyRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGiveMoneyRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGiveMoneyRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGiveMoneyRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGiveMoneyRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGiveMoneyRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGiveMoneyRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGiveMoneyRsp texasPoker$SCGiveMoneyRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGiveMoneyRsp);
    }
}
