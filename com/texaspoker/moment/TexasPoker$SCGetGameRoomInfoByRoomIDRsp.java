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
import com.texaspoker.moment.TexasPoker.GameRoomInfo;
import com.texaspoker.moment.TexasPoker.GameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCGetGameRoomInfoByRoomIDRsp extends GeneratedMessage implements TexasPoker$SCGetGameRoomInfoByRoomIDRspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static Parser<TexasPoker$SCGetGameRoomInfoByRoomIDRsp> PARSER = null;
    public static final int STGAMEROOMINFO_FIELD_NUMBER = 2;
    private static final TexasPoker$SCGetGameRoomInfoByRoomIDRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private GameRoomInfo stGameRoomInfo_;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetGameRoomInfoByRoomIDRsp.1 */
    class C00081 extends AbstractParser<TexasPoker$SCGetGameRoomInfoByRoomIDRsp> {
        static {
            fixHelper.fixfunc(new int[]{30354, 30355});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00081();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetGameRoomInfoByRoomIDRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetGameRoomInfoByRoomIDRspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private SingleFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> stGameRoomInfoBuilder_;
        private GameRoomInfo stGameRoomInfo_;

        static {
            fixHelper.fixfunc(new int[]{5154, 5155, 5156, 5157, 5158, 5159, 5160, 5161, 5162, 5163, 5164, 5165, 5166, 5167, 5168, 5169, 5170, 5171, 5172, 5173, 5174, 5175, 5176, 5177, 5178, 5179, 5180, 5181, 5182, 5183, 5184, 5185, 5186, 5187, 5188, 5189, 5190, 5191, 5192, 5193, 5194, 5195, 5196, 5197, 5198});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native SingleFieldBuilder<GameRoomInfo, com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder, GameRoomInfoOrBuilder> getStGameRoomInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1269build();

        public final native TexasPoker$SCGetGameRoomInfoByRoomIDRsp m1270build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1271buildPartial();

        public final native TexasPoker$SCGetGameRoomInfoByRoomIDRsp m1272buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1273clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1274clear();

        public final native Builder m1275clear();

        public final native Builder clearEErrCode();

        public final native Builder clearStGameRoomInfo();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1276clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1277clone();

        public final native Builder m1278clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1279getDefaultInstanceForType();

        public final native TexasPoker$SCGetGameRoomInfoByRoomIDRsp m1280getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native GameRoomInfo getStGameRoomInfo();

        public final native com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder getStGameRoomInfoBuilder();

        public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

        public final native boolean hasEErrCode();

        public final native boolean hasStGameRoomInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1281mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1282mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1283mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1284mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1285mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetGameRoomInfoByRoomIDRsp texasPoker$SCGetGameRoomInfoByRoomIDRsp);

        public final native Builder mergeStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setStGameRoomInfo(com.texaspoker.moment.TexasPoker.GameRoomInfo.Builder builder);

        public final native Builder setStGameRoomInfo(GameRoomInfo gameRoomInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.fX();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{24849, 24850, 24851, 24852, 24853, 24854, 24855, 24856, 24857, 24858, 24859, 24860, 24861, 24862, 24863, 24864, 24865, 24866, 24867, 24868, 24869, 24870, 24871, 24872, 24873, 24874, 24875, 24876, 24877});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetGameRoomInfoByRoomIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetGameRoomInfoByRoomIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetGameRoomInfoByRoomIDRsp texasPoker$SCGetGameRoomInfoByRoomIDRsp);

    private native TexasPoker$SCGetGameRoomInfoByRoomIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetGameRoomInfoByRoomIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetGameRoomInfoByRoomIDRsp texasPoker$SCGetGameRoomInfoByRoomIDRsp);

    private native TexasPoker$SCGetGameRoomInfoByRoomIDRsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1262getDefaultInstanceForType();

    public final native TexasPoker$SCGetGameRoomInfoByRoomIDRsp m1263getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native Parser<TexasPoker$SCGetGameRoomInfoByRoomIDRsp> getParserForType();

    public final native int getSerializedSize();

    public final native GameRoomInfo getStGameRoomInfo();

    public final native GameRoomInfoOrBuilder getStGameRoomInfoOrBuilder();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasEErrCode();

    public final native boolean hasStGameRoomInfo();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1264newBuilderForType();

    public final native Builder m1265newBuilderForType();

    protected final native Builder m1266newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1267toBuilder();

    public final native Builder m1268toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.fX();
    }

    static void __clinit__() {
        PARSER = new C00081();
        TexasPoker$SCGetGameRoomInfoByRoomIDRsp texasPoker$SCGetGameRoomInfoByRoomIDRsp = new TexasPoker$SCGetGameRoomInfoByRoomIDRsp(true);
        defaultInstance = texasPoker$SCGetGameRoomInfoByRoomIDRsp;
        texasPoker$SCGetGameRoomInfoByRoomIDRsp.initFields();
    }

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetGameRoomInfoByRoomIDRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomInfoByRoomIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetGameRoomInfoByRoomIDRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomInfoByRoomIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetGameRoomInfoByRoomIDRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomInfoByRoomIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetGameRoomInfoByRoomIDRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomInfoByRoomIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetGameRoomInfoByRoomIDRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetGameRoomInfoByRoomIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetGameRoomInfoByRoomIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetGameRoomInfoByRoomIDRsp texasPoker$SCGetGameRoomInfoByRoomIDRsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetGameRoomInfoByRoomIDRsp);
    }
}
