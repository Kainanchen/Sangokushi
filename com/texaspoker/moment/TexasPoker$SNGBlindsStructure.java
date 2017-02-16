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
import java.io.InputStream;

public final class TexasPoker$SNGBlindsStructure extends GeneratedMessage implements TexasPoker$SNGBlindsStructureOrBuilder {
    public static final int LSNGANTE_FIELD_NUMBER = 3;
    public static final int LSNGBIGBLINDS_FIELD_NUMBER = 2;
    public static final int LSNGSMALLBLINDS_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SNGBlindsStructure> PARSER;
    private static final TexasPoker$SNGBlindsStructure defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private long lSNGAnte_;
    private long lSNGBigBlinds_;
    private long lSNGSmallBlinds_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SNGBlindsStructure.1 */
    class C00721 extends AbstractParser<TexasPoker$SNGBlindsStructure> {
        static {
            fixHelper.fixfunc(new int[]{31462, 31463});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00721();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SNGBlindsStructure.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SNGBlindsStructureOrBuilder {
        private int bitField0_;
        private long lSNGAnte_;
        private long lSNGBigBlinds_;
        private long lSNGSmallBlinds_;

        static {
            fixHelper.fixfunc(new int[]{22365, 22366, 22367, 22368, 22369, 22370, 22371, 22372, 22373, 22374, 22375, 22376, 22377, 22378, 22379, 22380, 22381, 22382, 22383, 22384, 22385, 22386, 22387, 22388, 22389, 22390, 22391, 22392, 22393, 22394, 22395, 22396, 22397, 22398, 22399, 22400, 22401, 22402, 22403, 22404, 22405, 22406, 22407, 22408});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2805build();

        public final native TexasPoker$SNGBlindsStructure m2806build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2807buildPartial();

        public final native TexasPoker$SNGBlindsStructure m2808buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2809clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2810clear();

        public final native Builder m2811clear();

        public final native Builder clearLSNGAnte();

        public final native Builder clearLSNGBigBlinds();

        public final native Builder clearLSNGSmallBlinds();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2812clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2813clone();

        public final native Builder m2814clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2815getDefaultInstanceForType();

        public final native TexasPoker$SNGBlindsStructure m2816getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native long getLSNGAnte();

        public final native long getLSNGBigBlinds();

        public final native long getLSNGSmallBlinds();

        public final native boolean hasLSNGAnte();

        public final native boolean hasLSNGBigBlinds();

        public final native boolean hasLSNGSmallBlinds();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2817mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2818mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2819mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2820mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2821mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SNGBlindsStructure texasPoker$SNGBlindsStructure);

        public final native Builder setLSNGAnte(long j);

        public final native Builder setLSNGBigBlinds(long j);

        public final native Builder setLSNGSmallBlinds(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.h();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{25995, 25996, 25997, 25998, 25999, 26000, 26001, 26002, 26003, 26004, 26005, 26006, 26007, 26008, 26009, 26010, 26011, 26012, 26013, 26014, 26015, 26016, 26017, 26018, 26019, 26020, 26021, 26022, 26023, 26024});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SNGBlindsStructure(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SNGBlindsStructure(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SNGBlindsStructure texasPoker$SNGBlindsStructure);

    private native TexasPoker$SNGBlindsStructure(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SNGBlindsStructure(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SNGBlindsStructure texasPoker$SNGBlindsStructure);

    private native TexasPoker$SNGBlindsStructure(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2798getDefaultInstanceForType();

    public final native TexasPoker$SNGBlindsStructure m2799getDefaultInstanceForType();

    public final native long getLSNGAnte();

    public final native long getLSNGBigBlinds();

    public final native long getLSNGSmallBlinds();

    public final native Parser<TexasPoker$SNGBlindsStructure> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasLSNGAnte();

    public final native boolean hasLSNGBigBlinds();

    public final native boolean hasLSNGSmallBlinds();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2800newBuilderForType();

    public final native Builder m2801newBuilderForType();

    protected final native Builder m2802newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2803toBuilder();

    public final native Builder m2804toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SNGBlindsStructure getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.h();
    }

    static void __clinit__() {
        PARSER = new C00721();
        TexasPoker$SNGBlindsStructure texasPoker$SNGBlindsStructure = new TexasPoker$SNGBlindsStructure(true);
        defaultInstance = texasPoker$SNGBlindsStructure;
        texasPoker$SNGBlindsStructure.initFields();
    }

    public static TexasPoker$SNGBlindsStructure parseFrom(ByteString byteString) {
        return (TexasPoker$SNGBlindsStructure) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SNGBlindsStructure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SNGBlindsStructure) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SNGBlindsStructure parseFrom(byte[] bArr) {
        return (TexasPoker$SNGBlindsStructure) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SNGBlindsStructure parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SNGBlindsStructure) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SNGBlindsStructure parseFrom(InputStream inputStream) {
        return (TexasPoker$SNGBlindsStructure) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SNGBlindsStructure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SNGBlindsStructure) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SNGBlindsStructure parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SNGBlindsStructure) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SNGBlindsStructure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SNGBlindsStructure) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SNGBlindsStructure parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SNGBlindsStructure) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SNGBlindsStructure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SNGBlindsStructure) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SNGBlindsStructure texasPoker$SNGBlindsStructure) {
        return newBuilder().mergeFrom(texasPoker$SNGBlindsStructure);
    }
}
