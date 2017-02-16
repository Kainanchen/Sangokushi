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
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet;
import com.texaspoker.moment.TexasPoker.DefaultSettingInfoNetOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.io.InputStream;

public final class TexasPoker$SCLoginThirdPartyRsp extends GeneratedMessage implements TexasPoker$SCLoginThirdPartyRspOrBuilder {
    public static final int BNEWUSER_FIELD_NUMBER = 4;
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCLoginThirdPartyRsp> PARSER = null;
    public static final int SACCESSTOKEN_FIELD_NUMBER = 5;
    public static final int SENCRYPTKEY_FIELD_NUMBER = 6;
    public static final int STDEFAULTSETTINGINFO_FIELD_NUMBER = 3;
    public static final int STUSERBASEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCLoginThirdPartyRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bNewUser_;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private Object sAccessToken_;
    private Object sEncryptKey_;
    private DefaultSettingInfoNet stDefaultSettingInfo_;
    private UserBaseInfoNet stUserBaseInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCLoginThirdPartyRsp.1 */
    class C00241 extends AbstractParser<TexasPoker$SCLoginThirdPartyRsp> {
        static {
            fixHelper.fixfunc(new int[]{32181, 32182});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00241();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCLoginThirdPartyRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCLoginThirdPartyRspOrBuilder {
        private int bNewUser_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private Object sAccessToken_;
        private Object sEncryptKey_;
        private SingleFieldBuilder<DefaultSettingInfoNet, com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder, DefaultSettingInfoNetOrBuilder> stDefaultSettingInfoBuilder_;
        private DefaultSettingInfoNet stDefaultSettingInfo_;
        private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stUserBaseInfoBuilder_;
        private UserBaseInfoNet stUserBaseInfo_;

        static {
            fixHelper.fixfunc(new int[]{7130, 7131, 7132, 7133, 7134, 7135, 7136, 7137, 7138, 7139, 7140, 7141, 7142, 7143, 7144, 7145, 7146, 7147, 7148, 7149, 7150, 7151, 7152, 7153, 7154, 7155, 7156, 7157, 7158, 7159, 7160, 7161, 7162, 7163, 7164, 7165, 7166, 7167, 7168, 7169, 7170, 7171, 7172, 7173, 7174, 7175, 7176, 7177, 7178, 7179, 7180, 7181, 7182, 7183, 7184, 7185, 7186, 7187, 7188, 7189, 7190, 7191, 7192, 7193, 7194, 7195, 7196, 7197, 7198, 7199});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<DefaultSettingInfoNet, com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder, DefaultSettingInfoNetOrBuilder> getStDefaultSettingInfoFieldBuilder();

        private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStUserBaseInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1557build();

        public final native TexasPoker$SCLoginThirdPartyRsp m1558build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1559buildPartial();

        public final native TexasPoker$SCLoginThirdPartyRsp m1560buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1561clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1562clear();

        public final native Builder m1563clear();

        public final native Builder clearBNewUser();

        public final native Builder clearEErrCode();

        public final native Builder clearSAccessToken();

        public final native Builder clearSEncryptKey();

        public final native Builder clearStDefaultSettingInfo();

        public final native Builder clearStUserBaseInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1564clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1565clone();

        public final native Builder m1566clone();

        public final native int getBNewUser();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1567getDefaultInstanceForType();

        public final native TexasPoker$SCLoginThirdPartyRsp m1568getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native String getSAccessToken();

        public final native ByteString getSAccessTokenBytes();

        public final native String getSEncryptKey();

        public final native ByteString getSEncryptKeyBytes();

        public final native DefaultSettingInfoNet getStDefaultSettingInfo();

        public final native com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder getStDefaultSettingInfoBuilder();

        public final native DefaultSettingInfoNetOrBuilder getStDefaultSettingInfoOrBuilder();

        public final native UserBaseInfoNet getStUserBaseInfo();

        public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStUserBaseInfoBuilder();

        public final native UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

        public final native boolean hasBNewUser();

        public final native boolean hasEErrCode();

        public final native boolean hasSAccessToken();

        public final native boolean hasSEncryptKey();

        public final native boolean hasStDefaultSettingInfo();

        public final native boolean hasStUserBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1569mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1570mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1571mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1572mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1573mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCLoginThirdPartyRsp texasPoker$SCLoginThirdPartyRsp);

        public final native Builder mergeStDefaultSettingInfo(DefaultSettingInfoNet defaultSettingInfoNet);

        public final native Builder mergeStUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

        public final native Builder setBNewUser(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setSAccessToken(String str);

        public final native Builder setSAccessTokenBytes(ByteString byteString);

        public final native Builder setSEncryptKey(String str);

        public final native Builder setSEncryptKeyBytes(ByteString byteString);

        public final native Builder setStDefaultSettingInfo(com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder builder);

        public final native Builder setStDefaultSettingInfo(DefaultSettingInfoNet defaultSettingInfoNet);

        public final native Builder setStUserBaseInfo(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

        public final native Builder setStUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

        public static final Descriptor getDescriptor() {
            return TexasPoker.J();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{30278, 30279, 30280, 30281, 30282, 30283, 30284, 30285, 30286, 30287, 30288, 30289, 30290, 30291, 30292, 30293, 30294, 30295, 30296, 30297, 30298, 30299, 30300, 30301, 30302, 30303, 30304, 30305, 30306, 30307, 30308, 30309, 30310, 30311, 30312, 30313, 30314, 30315, 30316, 30317});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCLoginThirdPartyRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCLoginThirdPartyRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCLoginThirdPartyRsp texasPoker$SCLoginThirdPartyRsp);

    private native TexasPoker$SCLoginThirdPartyRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCLoginThirdPartyRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCLoginThirdPartyRsp texasPoker$SCLoginThirdPartyRsp);

    private native TexasPoker$SCLoginThirdPartyRsp(boolean z);

    private native void initFields();

    public final native int getBNewUser();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1550getDefaultInstanceForType();

    public final native TexasPoker$SCLoginThirdPartyRsp m1551getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCLoginThirdPartyRsp> getParserForType();

    public final native String getSAccessToken();

    public final native ByteString getSAccessTokenBytes();

    public final native String getSEncryptKey();

    public final native ByteString getSEncryptKeyBytes();

    public final native int getSerializedSize();

    public final native DefaultSettingInfoNet getStDefaultSettingInfo();

    public final native DefaultSettingInfoNetOrBuilder getStDefaultSettingInfoOrBuilder();

    public final native UserBaseInfoNet getStUserBaseInfo();

    public final native UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasBNewUser();

    public final native boolean hasEErrCode();

    public final native boolean hasSAccessToken();

    public final native boolean hasSEncryptKey();

    public final native boolean hasStDefaultSettingInfo();

    public final native boolean hasStUserBaseInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1552newBuilderForType();

    public final native Builder m1553newBuilderForType();

    protected final native Builder m1554newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1555toBuilder();

    public final native Builder m1556toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCLoginThirdPartyRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.J();
    }

    static void __clinit__() {
        PARSER = new C00241();
        TexasPoker$SCLoginThirdPartyRsp texasPoker$SCLoginThirdPartyRsp = new TexasPoker$SCLoginThirdPartyRsp(true);
        defaultInstance = texasPoker$SCLoginThirdPartyRsp;
        texasPoker$SCLoginThirdPartyRsp.initFields();
    }

    public static TexasPoker$SCLoginThirdPartyRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCLoginThirdPartyRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCLoginThirdPartyRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLoginThirdPartyRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCLoginThirdPartyRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCLoginThirdPartyRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCLoginThirdPartyRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLoginThirdPartyRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCLoginThirdPartyRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCLoginThirdPartyRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCLoginThirdPartyRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLoginThirdPartyRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCLoginThirdPartyRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCLoginThirdPartyRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCLoginThirdPartyRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLoginThirdPartyRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCLoginThirdPartyRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCLoginThirdPartyRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCLoginThirdPartyRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCLoginThirdPartyRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCLoginThirdPartyRsp texasPoker$SCLoginThirdPartyRsp) {
        return newBuilder().mergeFrom(texasPoker$SCLoginThirdPartyRsp);
    }
}
