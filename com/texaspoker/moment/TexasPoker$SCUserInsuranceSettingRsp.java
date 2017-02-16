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

public final class TexasPoker$SCUserInsuranceSettingRsp extends GeneratedMessage implements TexasPoker$SCUserInsuranceSettingRspOrBuilder {
    public static final int BDEFAULTINSURANCE_FIELD_NUMBER = 3;
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LGAMEROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCUserInsuranceSettingRsp> PARSER;
    private static final TexasPoker$SCUserInsuranceSettingRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bDefaultInsurance_;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lGameRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUserInsuranceSettingRsp.1 */
    class C00701 extends AbstractParser<TexasPoker$SCUserInsuranceSettingRsp> {
        static {
            fixHelper.fixfunc(new int[]{13947, 13948});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00701();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUserInsuranceSettingRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCUserInsuranceSettingRspOrBuilder {
        private int bDefaultInsurance_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lGameRoomID_;

        static {
            fixHelper.fixfunc(new int[]{8034, 8035, 8036, 8037, 8038, 8039, 8040, 8041, 8042, 8043, 8044, 8045, 8046, 8047, 8048, 8049, 8050, 8051, 8052, 8053, 8054, 8055, 8056, 8057, 8058, 8059, 8060, 8061, 8062, 8063, 8064, 8065, 8066, 8067, 8068, 8069, 8070, 8071, 8072, 8073, 8074, 8075, 8076, 8077});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2781build();

        public final native TexasPoker$SCUserInsuranceSettingRsp m2782build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2783buildPartial();

        public final native TexasPoker$SCUserInsuranceSettingRsp m2784buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2785clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2786clear();

        public final native Builder m2787clear();

        public final native Builder clearBDefaultInsurance();

        public final native Builder clearEErrCode();

        public final native Builder clearLGameRoomID();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2788clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2789clone();

        public final native Builder m2790clone();

        public final native int getBDefaultInsurance();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2791getDefaultInstanceForType();

        public final native TexasPoker$SCUserInsuranceSettingRsp m2792getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLGameRoomID();

        public final native boolean hasBDefaultInsurance();

        public final native boolean hasEErrCode();

        public final native boolean hasLGameRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2793mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2794mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2795mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2796mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2797mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCUserInsuranceSettingRsp texasPoker$SCUserInsuranceSettingRsp);

        public final native Builder setBDefaultInsurance(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLGameRoomID(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.gx();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{7938, 7939, 7940, 7941, 7942, 7943, 7944, 7945, 7946, 7947, 7948, 7949, 7950, 7951, 7952, 7953, 7954, 7955, 7956, 7957, 7958, 7959, 7960, 7961, 7962, 7963, 7964, 7965, 7966, 7967});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCUserInsuranceSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCUserInsuranceSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCUserInsuranceSettingRsp texasPoker$SCUserInsuranceSettingRsp);

    private native TexasPoker$SCUserInsuranceSettingRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCUserInsuranceSettingRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCUserInsuranceSettingRsp texasPoker$SCUserInsuranceSettingRsp);

    private native TexasPoker$SCUserInsuranceSettingRsp(boolean z);

    private native void initFields();

    public final native int getBDefaultInsurance();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2774getDefaultInstanceForType();

    public final native TexasPoker$SCUserInsuranceSettingRsp m2775getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLGameRoomID();

    public final native Parser<TexasPoker$SCUserInsuranceSettingRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasBDefaultInsurance();

    public final native boolean hasEErrCode();

    public final native boolean hasLGameRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2776newBuilderForType();

    public final native Builder m2777newBuilderForType();

    protected final native Builder m2778newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2779toBuilder();

    public final native Builder m2780toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCUserInsuranceSettingRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.gx();
    }

    static void __clinit__() {
        PARSER = new C00701();
        TexasPoker$SCUserInsuranceSettingRsp texasPoker$SCUserInsuranceSettingRsp = new TexasPoker$SCUserInsuranceSettingRsp(true);
        defaultInstance = texasPoker$SCUserInsuranceSettingRsp;
        texasPoker$SCUserInsuranceSettingRsp.initFields();
    }

    public static TexasPoker$SCUserInsuranceSettingRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCUserInsuranceSettingRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCUserInsuranceSettingRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUserInsuranceSettingRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCUserInsuranceSettingRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCUserInsuranceSettingRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCUserInsuranceSettingRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUserInsuranceSettingRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCUserInsuranceSettingRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCUserInsuranceSettingRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCUserInsuranceSettingRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUserInsuranceSettingRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUserInsuranceSettingRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCUserInsuranceSettingRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCUserInsuranceSettingRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUserInsuranceSettingRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUserInsuranceSettingRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCUserInsuranceSettingRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCUserInsuranceSettingRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUserInsuranceSettingRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCUserInsuranceSettingRsp texasPoker$SCUserInsuranceSettingRsp) {
        return newBuilder().mergeFrom(texasPoker$SCUserInsuranceSettingRsp);
    }
}
