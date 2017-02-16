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

public final class TexasPoker$SCPushKickOff extends GeneratedMessage implements TexasPoker$SCPushKickOffOrBuilder {
    public static final int LTIME_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCPushKickOff> PARSER;
    private static final TexasPoker$SCPushKickOff defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private long lTime_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCPushKickOff.1 */
    class C00271 extends AbstractParser<TexasPoker$SCPushKickOff> {
        static {
            fixHelper.fixfunc(new int[]{18293, 18294});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00271();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCPushKickOff.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCPushKickOffOrBuilder {
        private int bitField0_;
        private long lTime_;

        static {
            fixHelper.fixfunc(new int[]{7031, 7032, 7033, 7034, 7035, 7036, 7037, 7038, 7039, 7040, 7041, 7042, 7043, 7044, 7045, 7046, 7047, 7048, 7049, 7050, 7051, 7052, 7053, 7054, 7055, 7056, 7057, 7058, 7059, 7060, 7061, 7062, 7063, 7064, 7065, 7066});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1629build();

        public final native TexasPoker$SCPushKickOff m1630build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1631buildPartial();

        public final native TexasPoker$SCPushKickOff m1632buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1633clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1634clear();

        public final native Builder m1635clear();

        public final native Builder clearLTime();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1636clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1637clone();

        public final native Builder m1638clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1639getDefaultInstanceForType();

        public final native TexasPoker$SCPushKickOff m1640getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native long getLTime();

        public final native boolean hasLTime();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1641mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1642mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1643mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1644mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1645mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCPushKickOff texasPoker$SCPushKickOff);

        public final native Builder setLTime(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.ar();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{15068, 15069, 15070, 15071, 15072, 15073, 15074, 15075, 15076, 15077, 15078, 15079, 15080, 15081, 15082, 15083, 15084, 15085, 15086, 15087, 15088, 15089, 15090, 15091, 15092, 15093});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCPushKickOff(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCPushKickOff(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCPushKickOff texasPoker$SCPushKickOff);

    private native TexasPoker$SCPushKickOff(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCPushKickOff(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCPushKickOff texasPoker$SCPushKickOff);

    private native TexasPoker$SCPushKickOff(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1622getDefaultInstanceForType();

    public final native TexasPoker$SCPushKickOff m1623getDefaultInstanceForType();

    public final native long getLTime();

    public final native Parser<TexasPoker$SCPushKickOff> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasLTime();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1624newBuilderForType();

    public final native Builder m1625newBuilderForType();

    protected final native Builder m1626newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1627toBuilder();

    public final native Builder m1628toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCPushKickOff getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.ar();
    }

    static void __clinit__() {
        PARSER = new C00271();
        TexasPoker$SCPushKickOff texasPoker$SCPushKickOff = new TexasPoker$SCPushKickOff(true);
        defaultInstance = texasPoker$SCPushKickOff;
        texasPoker$SCPushKickOff.initFields();
    }

    public static TexasPoker$SCPushKickOff parseFrom(ByteString byteString) {
        return (TexasPoker$SCPushKickOff) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCPushKickOff parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPushKickOff) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCPushKickOff parseFrom(byte[] bArr) {
        return (TexasPoker$SCPushKickOff) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCPushKickOff parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPushKickOff) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCPushKickOff parseFrom(InputStream inputStream) {
        return (TexasPoker$SCPushKickOff) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCPushKickOff parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPushKickOff) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCPushKickOff parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCPushKickOff) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCPushKickOff parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPushKickOff) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCPushKickOff parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCPushKickOff) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCPushKickOff parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCPushKickOff) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCPushKickOff texasPoker$SCPushKickOff) {
        return newBuilder().mergeFrom(texasPoker$SCPushKickOff);
    }
}
