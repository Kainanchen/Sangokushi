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

public final class TexasPoker$SCUploadVerifyCodeRsp extends GeneratedMessage implements TexasPoker$SCUploadVerifyCodeRspOrBuilder {
    public static final int BREGISTER_FIELD_NUMBER = 6;
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCUploadVerifyCodeRsp> PARSER = null;
    public static final int SACCESSTOKEN_FIELD_NUMBER = 4;
    public static final int SENCRYPTKEY_FIELD_NUMBER = 5;
    public static final int STDEFAULTSETTINGINFO_FIELD_NUMBER = 3;
    public static final int STUSERBASEINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCUploadVerifyCodeRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bRegister_;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private Object sAccessToken_;
    private Object sEncryptKey_;
    private DefaultSettingInfoNet stDefaultSettingInfo_;
    private UserBaseInfoNet stUserBaseInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUploadVerifyCodeRsp.1 */
    class C00651 extends AbstractParser<TexasPoker$SCUploadVerifyCodeRsp> {
        static {
            fixHelper.fixfunc(new int[]{28589, 28590});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00651();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCUploadVerifyCodeRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCUploadVerifyCodeRspOrBuilder {
        private int bRegister_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private Object sAccessToken_;
        private Object sEncryptKey_;
        private SingleFieldBuilder<DefaultSettingInfoNet, com.texaspoker.moment.TexasPoker.DefaultSettingInfoNet.Builder, DefaultSettingInfoNetOrBuilder> stDefaultSettingInfoBuilder_;
        private DefaultSettingInfoNet stDefaultSettingInfo_;
        private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stUserBaseInfoBuilder_;
        private UserBaseInfoNet stUserBaseInfo_;

        static {
            fixHelper.fixfunc(new int[]{20910, 20911, 20912, 20913, 20914, 20915, 20916, 20917, 20918, 20919, 20920, 20921, 20922, 20923, 20924, 20925, 20926, 20927, 20928, 20929, 20930, 20931, 20932, 20933, 20934, 20935, 20936, 20937, 20938, 20939, 20940, 20941, 20942, 20943, 20944, 20945, 20946, 20947, 20948, 20949, 20950, 20951, 20952, 20953, 20954, 20955, 20956, 20957, 20958, 20959, 20960, 20961, 20962, 20963, 20964, 20965, 20966, 20967, 20968, 20969, 20970, 20971, 20972, 20973, 20974, 20975, 20976, 20977, 20978, 20979});
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

        public final native /* bridge */ /* synthetic */ MessageLite m2757build();

        public final native TexasPoker$SCUploadVerifyCodeRsp m2758build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2759buildPartial();

        public final native TexasPoker$SCUploadVerifyCodeRsp m2760buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2761clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2762clear();

        public final native Builder m2763clear();

        public final native Builder clearBRegister();

        public final native Builder clearEErrCode();

        public final native Builder clearSAccessToken();

        public final native Builder clearSEncryptKey();

        public final native Builder clearStDefaultSettingInfo();

        public final native Builder clearStUserBaseInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2764clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2765clone();

        public final native Builder m2766clone();

        public final native int getBRegister();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2767getDefaultInstanceForType();

        public final native TexasPoker$SCUploadVerifyCodeRsp m2768getDefaultInstanceForType();

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

        public final native boolean hasBRegister();

        public final native boolean hasEErrCode();

        public final native boolean hasSAccessToken();

        public final native boolean hasSEncryptKey();

        public final native boolean hasStDefaultSettingInfo();

        public final native boolean hasStUserBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2769mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2770mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2771mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2772mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2773mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCUploadVerifyCodeRsp texasPoker$SCUploadVerifyCodeRsp);

        public final native Builder mergeStDefaultSettingInfo(DefaultSettingInfoNet defaultSettingInfoNet);

        public final native Builder mergeStUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

        public final native Builder setBRegister(int i);

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
            return TexasPoker.x();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{15094, 15095, 15096, 15097, 15098, 15099, 15100, 15101, 15102, 15103, 15104, 15105, 15106, 15107, 15108, 15109, 15110, 15111, 15112, 15113, 15114, 15115, 15116, 15117, 15118, 15119, 15120, 15121, 15122, 15123, 15124, 15125, 15126, 15127, 15128, 15129, 15130, 15131, 15132, 15133});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCUploadVerifyCodeRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCUploadVerifyCodeRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCUploadVerifyCodeRsp texasPoker$SCUploadVerifyCodeRsp);

    private native TexasPoker$SCUploadVerifyCodeRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCUploadVerifyCodeRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCUploadVerifyCodeRsp texasPoker$SCUploadVerifyCodeRsp);

    private native TexasPoker$SCUploadVerifyCodeRsp(boolean z);

    private native void initFields();

    public final native int getBRegister();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2750getDefaultInstanceForType();

    public final native TexasPoker$SCUploadVerifyCodeRsp m2751getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCUploadVerifyCodeRsp> getParserForType();

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

    public final native boolean hasBRegister();

    public final native boolean hasEErrCode();

    public final native boolean hasSAccessToken();

    public final native boolean hasSEncryptKey();

    public final native boolean hasStDefaultSettingInfo();

    public final native boolean hasStUserBaseInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2752newBuilderForType();

    public final native Builder m2753newBuilderForType();

    protected final native Builder m2754newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2755toBuilder();

    public final native Builder m2756toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCUploadVerifyCodeRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.x();
    }

    static void __clinit__() {
        PARSER = new C00651();
        TexasPoker$SCUploadVerifyCodeRsp texasPoker$SCUploadVerifyCodeRsp = new TexasPoker$SCUploadVerifyCodeRsp(true);
        defaultInstance = texasPoker$SCUploadVerifyCodeRsp;
        texasPoker$SCUploadVerifyCodeRsp.initFields();
    }

    public static TexasPoker$SCUploadVerifyCodeRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCUploadVerifyCodeRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCUploadVerifyCodeRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadVerifyCodeRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadVerifyCodeRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCUploadVerifyCodeRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCUploadVerifyCodeRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadVerifyCodeRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadVerifyCodeRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCUploadVerifyCodeRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCUploadVerifyCodeRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadVerifyCodeRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadVerifyCodeRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCUploadVerifyCodeRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCUploadVerifyCodeRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadVerifyCodeRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCUploadVerifyCodeRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCUploadVerifyCodeRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCUploadVerifyCodeRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCUploadVerifyCodeRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCUploadVerifyCodeRsp texasPoker$SCUploadVerifyCodeRsp) {
        return newBuilder().mergeFrom(texasPoker$SCUploadVerifyCodeRsp);
    }
}
