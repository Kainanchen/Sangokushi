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

public final class TexasPoker$SCGetGameSettingRsp extends GeneratedMessage implements TexasPoker$SCGetGameSettingRspOrBuilder {
    public static final int BNOTBUYINSURANCE_FIELD_NUMBER = 3;
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int LGAMEROOMID_FIELD_NUMBER = 2;
    public static Parser<TexasPoker$SCGetGameSettingRsp> PARSER;
    private static final TexasPoker$SCGetGameSettingRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bNotBuyInsurance_;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private long lGameRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetGameSettingRsp.1 */
    class C00111 extends AbstractParser<TexasPoker$SCGetGameSettingRsp> {
        static {
            fixHelper.fixfunc(new int[]{31200, 31201});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00111();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetGameSettingRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetGameSettingRspOrBuilder {
        private int bNotBuyInsurance_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lGameRoomID_;

        static {
            fixHelper.fixfunc(new int[]{21561, 21562, 21563, 21564, 21565, 21566, 21567, 21568, 21569, 21570, 21571, 21572, 21573, 21574, 21575, 21576, 21577, 21578, 21579, 21580, 21581, 21582, 21583, 21584, 21585, 21586, 21587, 21588, 21589, 21590, 21591, 21592, 21593, 21594, 21595, 21596, 21597, 21598, 21599, 21600, 21601, 21602, 21603, 21604});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1245build();

        public final native TexasPoker$SCGetGameSettingRsp m1246build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1247buildPartial();

        public final native TexasPoker$SCGetGameSettingRsp m1248buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1249clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1250clear();

        public final native Builder m1251clear();

        public final native Builder clearBNotBuyInsurance();

        public final native Builder clearEErrCode();

        public final native Builder clearLGameRoomID();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1252clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1253clone();

        public final native Builder m1254clone();

        public final native int getBNotBuyInsurance();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1255getDefaultInstanceForType();

        public final native TexasPoker$SCGetGameSettingRsp m1256getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLGameRoomID();

        public final native boolean hasBNotBuyInsurance();

        public final native boolean hasEErrCode();

        public final native boolean hasLGameRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1257mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1258mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1259mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1260mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1261mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetGameSettingRsp texasPoker$SCGetGameSettingRsp);

        public final native Builder setBNotBuyInsurance(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setLGameRoomID(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.gJ();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{19422, 19423, 19424, 19425, 19426, 19427, 19428, 19429, 19430, 19431, 19432, 19433, 19434, 19435, 19436, 19437, 19438, 19439, 19440, 19441, 19442, 19443, 19444, 19445, 19446, 19447, 19448, 19449, 19450, 19451});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetGameSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetGameSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetGameSettingRsp texasPoker$SCGetGameSettingRsp);

    private native TexasPoker$SCGetGameSettingRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetGameSettingRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetGameSettingRsp texasPoker$SCGetGameSettingRsp);

    private native TexasPoker$SCGetGameSettingRsp(boolean z);

    private native void initFields();

    public final native int getBNotBuyInsurance();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1238getDefaultInstanceForType();

    public final native TexasPoker$SCGetGameSettingRsp m1239getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native long getLGameRoomID();

    public final native Parser<TexasPoker$SCGetGameSettingRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasBNotBuyInsurance();

    public final native boolean hasEErrCode();

    public final native boolean hasLGameRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1240newBuilderForType();

    public final native Builder m1241newBuilderForType();

    protected final native Builder m1242newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1243toBuilder();

    public final native Builder m1244toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetGameSettingRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.gJ();
    }

    static void __clinit__() {
        PARSER = new C00111();
        TexasPoker$SCGetGameSettingRsp texasPoker$SCGetGameSettingRsp = new TexasPoker$SCGetGameSettingRsp(true);
        defaultInstance = texasPoker$SCGetGameSettingRsp;
        texasPoker$SCGetGameSettingRsp.initFields();
    }

    public static TexasPoker$SCGetGameSettingRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetGameSettingRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetGameSettingRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameSettingRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameSettingRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetGameSettingRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetGameSettingRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameSettingRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameSettingRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetGameSettingRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetGameSettingRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameSettingRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameSettingRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetGameSettingRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetGameSettingRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameSettingRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameSettingRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetGameSettingRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetGameSettingRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameSettingRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetGameSettingRsp texasPoker$SCGetGameSettingRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetGameSettingRsp);
    }
}
