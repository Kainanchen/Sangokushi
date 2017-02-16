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
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfo;
import com.texaspoker.moment.TexasPoker.GameRoomBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPoker.QuickGameRoomInfo;
import com.texaspoker.moment.TexasPoker.QuickGameRoomInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SCGetFrontPageInfoV4Rsp extends GeneratedMessage implements TexasPoker$SCGetFrontPageInfoV4RspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int IOFFSET_FIELD_NUMBER = 5;
    public static Parser<TexasPoker$SCGetFrontPageInfoV4Rsp> PARSER = null;
    public static final int VGAMEROOMBASEINFOS_FIELD_NUMBER = 2;
    public static final int VQUICKGAMEROOMINFOS_FIELD_NUMBER = 4;
    public static final int VSNGGAMEROOMBASEINFOS_FIELD_NUMBER = 3;
    private static final TexasPoker$SCGetFrontPageInfoV4Rsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private int iOffset_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<GameRoomBaseInfo> vGameRoomBaseInfos_;
    private List<QuickGameRoomInfo> vQuickGameRoomInfos_;
    private List<TexasPoker$SNGGameRoomBaseInfo> vSNGGameRoomBaseInfos_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetFrontPageInfoV4Rsp.1 */
    class C00071 extends AbstractParser<TexasPoker$SCGetFrontPageInfoV4Rsp> {
        static {
            fixHelper.fixfunc(new int[]{32183, 32184});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00071();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetFrontPageInfoV4Rsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetFrontPageInfoV4RspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iOffset_;
        private RepeatedFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> vGameRoomBaseInfosBuilder_;
        private List<GameRoomBaseInfo> vGameRoomBaseInfos_;
        private RepeatedFieldBuilder<QuickGameRoomInfo, com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder, QuickGameRoomInfoOrBuilder> vQuickGameRoomInfosBuilder_;
        private List<QuickGameRoomInfo> vQuickGameRoomInfos_;
        private RepeatedFieldBuilder<TexasPoker$SNGGameRoomBaseInfo, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder, TexasPoker$SNGGameRoomBaseInfoOrBuilder> vSNGGameRoomBaseInfosBuilder_;
        private List<TexasPoker$SNGGameRoomBaseInfo> vSNGGameRoomBaseInfos_;

        static {
            fixHelper.fixfunc(new int[]{19829, 19830, 19831, 19832, 19833, 19834, 19835, 19836, 19837, 19838, 19839, 19840, 19841, 19842, 19843, 19844, 19845, 19846, 19847, 19848, 19849, 19850, 19851, 19852, 19853, 19854, 19855, 19856, 19857, 19858, 19859, 19860, 19861, 19862, 19863, 19864, 19865, 19866, 19867, 19868, 19869, 19870, 19871, 19872, 19873, 19874, 19875, 19876, 19877, 19878, 19879, 19880, 19881, 19882, 19883, 19884, 19885, 19886, 19887, 19888, 19889, 19890, 19891, 19892, 19893, 19894, 19895, 19896, 19897, 19898, 19899, 19900, 19901, 19902, 19903, 19904, 19905, 19906, 19907, 19908, 19909, 19910, 19911, 19912, 19913, 19914, 19915, 19916, 19917, 19918, 19919, 19920, 19921, 19922, 19923, 19924, 19925, 19926, 19927, 19928});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVGameRoomBaseInfosIsMutable();

        private native void ensureVQuickGameRoomInfosIsMutable();

        private native void ensureVSNGGameRoomBaseInfosIsMutable();

        private native RepeatedFieldBuilder<GameRoomBaseInfo, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder, GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosFieldBuilder();

        private native RepeatedFieldBuilder<QuickGameRoomInfo, com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder, QuickGameRoomInfoOrBuilder> getVQuickGameRoomInfosFieldBuilder();

        private native RepeatedFieldBuilder<TexasPoker$SNGGameRoomBaseInfo, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder, TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVGameRoomBaseInfos(Iterable<? extends GameRoomBaseInfo> iterable);

        public final native Builder addAllVQuickGameRoomInfos(Iterable<? extends QuickGameRoomInfo> iterable);

        public final native Builder addAllVSNGGameRoomBaseInfos(Iterable<? extends TexasPoker$SNGGameRoomBaseInfo> iterable);

        public final native Builder addVGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

        public final native Builder addVGameRoomBaseInfos(int i, GameRoomBaseInfo gameRoomBaseInfo);

        public final native Builder addVGameRoomBaseInfos(com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

        public final native Builder addVGameRoomBaseInfos(GameRoomBaseInfo gameRoomBaseInfo);

        public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder addVGameRoomBaseInfosBuilder();

        public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder addVGameRoomBaseInfosBuilder(int i);

        public final native Builder addVQuickGameRoomInfos(int i, com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder builder);

        public final native Builder addVQuickGameRoomInfos(int i, QuickGameRoomInfo quickGameRoomInfo);

        public final native Builder addVQuickGameRoomInfos(com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder builder);

        public final native Builder addVQuickGameRoomInfos(QuickGameRoomInfo quickGameRoomInfo);

        public final native com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder addVQuickGameRoomInfosBuilder();

        public final native com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder addVQuickGameRoomInfosBuilder(int i);

        public final native Builder addVSNGGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder builder);

        public final native Builder addVSNGGameRoomBaseInfos(int i, TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

        public final native Builder addVSNGGameRoomBaseInfos(com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder builder);

        public final native Builder addVSNGGameRoomBaseInfos(TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

        public final native com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder addVSNGGameRoomBaseInfosBuilder();

        public final native com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder addVSNGGameRoomBaseInfosBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m1197build();

        public final native TexasPoker$SCGetFrontPageInfoV4Rsp m1198build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m1199buildPartial();

        public final native TexasPoker$SCGetFrontPageInfoV4Rsp m1200buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1201clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1202clear();

        public final native Builder m1203clear();

        public final native Builder clearEErrCode();

        public final native Builder clearIOffset();

        public final native Builder clearVGameRoomBaseInfos();

        public final native Builder clearVQuickGameRoomInfos();

        public final native Builder clearVSNGGameRoomBaseInfos();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1204clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1205clone();

        public final native Builder m1206clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1207getDefaultInstanceForType();

        public final native TexasPoker$SCGetFrontPageInfoV4Rsp m1208getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIOffset();

        public final native GameRoomBaseInfo getVGameRoomBaseInfos(int i);

        public final native com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder getVGameRoomBaseInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder> getVGameRoomBaseInfosBuilderList();

        public final native int getVGameRoomBaseInfosCount();

        public final native List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

        public final native GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

        public final native List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

        public final native QuickGameRoomInfo getVQuickGameRoomInfos(int i);

        public final native com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder getVQuickGameRoomInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder> getVQuickGameRoomInfosBuilderList();

        public final native int getVQuickGameRoomInfosCount();

        public final native List<QuickGameRoomInfo> getVQuickGameRoomInfosList();

        public final native QuickGameRoomInfoOrBuilder getVQuickGameRoomInfosOrBuilder(int i);

        public final native List<? extends QuickGameRoomInfoOrBuilder> getVQuickGameRoomInfosOrBuilderList();

        public final native TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

        public final native com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder getVSNGGameRoomBaseInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder> getVSNGGameRoomBaseInfosBuilderList();

        public final native int getVSNGGameRoomBaseInfosCount();

        public final native List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

        public final native TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

        public final native List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasIOffset();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1209mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1210mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1211mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1212mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m1213mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetFrontPageInfoV4Rsp texasPoker$SCGetFrontPageInfoV4Rsp);

        public final native Builder removeVGameRoomBaseInfos(int i);

        public final native Builder removeVQuickGameRoomInfos(int i);

        public final native Builder removeVSNGGameRoomBaseInfos(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setIOffset(int i);

        public final native Builder setVGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker.GameRoomBaseInfo.Builder builder);

        public final native Builder setVGameRoomBaseInfos(int i, GameRoomBaseInfo gameRoomBaseInfo);

        public final native Builder setVQuickGameRoomInfos(int i, com.texaspoker.moment.TexasPoker.QuickGameRoomInfo.Builder builder);

        public final native Builder setVQuickGameRoomInfos(int i, QuickGameRoomInfo quickGameRoomInfo);

        public final native Builder setVSNGGameRoomBaseInfos(int i, com.texaspoker.moment.TexasPoker$SNGGameRoomBaseInfo.Builder builder);

        public final native Builder setVSNGGameRoomBaseInfos(int i, TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

        public static final Descriptor getDescriptor() {
            return TexasPoker.fP();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{32285, 32286, 32287, 32288, 32289, 32290, 32291, 32292, 32293, 32294, 32295, 32296, 32297, 32298, 32299, 32300, 32301, 32302, 32303, 32304, 32305, 32306, 32307, 32308, 32309, 32310, 32311, 32312, 32313, 32314, 32315, 32316, 32317, 32318, 32319, 32320, 32321, 32322, 32323, 32324, 32325, 32326, 32327});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetFrontPageInfoV4Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetFrontPageInfoV4Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetFrontPageInfoV4Rsp texasPoker$SCGetFrontPageInfoV4Rsp);

    private native TexasPoker$SCGetFrontPageInfoV4Rsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetFrontPageInfoV4Rsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetFrontPageInfoV4Rsp texasPoker$SCGetFrontPageInfoV4Rsp);

    private native TexasPoker$SCGetFrontPageInfoV4Rsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m1190getDefaultInstanceForType();

    public final native TexasPoker$SCGetFrontPageInfoV4Rsp m1191getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native int getIOffset();

    public final native Parser<TexasPoker$SCGetFrontPageInfoV4Rsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native GameRoomBaseInfo getVGameRoomBaseInfos(int i);

    public final native int getVGameRoomBaseInfosCount();

    public final native List<GameRoomBaseInfo> getVGameRoomBaseInfosList();

    public final native GameRoomBaseInfoOrBuilder getVGameRoomBaseInfosOrBuilder(int i);

    public final native List<? extends GameRoomBaseInfoOrBuilder> getVGameRoomBaseInfosOrBuilderList();

    public final native QuickGameRoomInfo getVQuickGameRoomInfos(int i);

    public final native int getVQuickGameRoomInfosCount();

    public final native List<QuickGameRoomInfo> getVQuickGameRoomInfosList();

    public final native QuickGameRoomInfoOrBuilder getVQuickGameRoomInfosOrBuilder(int i);

    public final native List<? extends QuickGameRoomInfoOrBuilder> getVQuickGameRoomInfosOrBuilderList();

    public final native TexasPoker$SNGGameRoomBaseInfo getVSNGGameRoomBaseInfos(int i);

    public final native int getVSNGGameRoomBaseInfosCount();

    public final native List<TexasPoker$SNGGameRoomBaseInfo> getVSNGGameRoomBaseInfosList();

    public final native TexasPoker$SNGGameRoomBaseInfoOrBuilder getVSNGGameRoomBaseInfosOrBuilder(int i);

    public final native List<? extends TexasPoker$SNGGameRoomBaseInfoOrBuilder> getVSNGGameRoomBaseInfosOrBuilderList();

    public final native boolean hasEErrCode();

    public final native boolean hasIOffset();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1192newBuilderForType();

    public final native Builder m1193newBuilderForType();

    protected final native Builder m1194newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1195toBuilder();

    public final native Builder m1196toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetFrontPageInfoV4Rsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.fP();
    }

    static void __clinit__() {
        PARSER = new C00071();
        TexasPoker$SCGetFrontPageInfoV4Rsp texasPoker$SCGetFrontPageInfoV4Rsp = new TexasPoker$SCGetFrontPageInfoV4Rsp(true);
        defaultInstance = texasPoker$SCGetFrontPageInfoV4Rsp;
        texasPoker$SCGetFrontPageInfoV4Rsp.initFields();
    }

    public static TexasPoker$SCGetFrontPageInfoV4Rsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetFrontPageInfoV4Rsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetFrontPageInfoV4Rsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoV4Rsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoV4Rsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetFrontPageInfoV4Rsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetFrontPageInfoV4Rsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoV4Rsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoV4Rsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetFrontPageInfoV4Rsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetFrontPageInfoV4Rsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoV4Rsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoV4Rsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetFrontPageInfoV4Rsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetFrontPageInfoV4Rsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoV4Rsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoV4Rsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetFrontPageInfoV4Rsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetFrontPageInfoV4Rsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoV4Rsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetFrontPageInfoV4Rsp texasPoker$SCGetFrontPageInfoV4Rsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetFrontPageInfoV4Rsp);
    }
}
