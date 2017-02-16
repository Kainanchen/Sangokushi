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
import com.texaspoker.moment.TexasPoker.RecommendUserInfo;
import com.texaspoker.moment.TexasPoker.RecommendUserInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.BannerInfo;
import com.texaspoker.moment.TexasPokerCommon.BannerInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.io.InputStream;
import java.util.List;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

public final class TexasPoker$SCGetFrontPageInfoV2Rsp extends GeneratedMessage implements TexasPoker$SCGetFrontPageInfoV2RspOrBuilder {
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int IOFFSET_FIELD_NUMBER = 6;
    public static Parser<TexasPoker$SCGetFrontPageInfoV2Rsp> PARSER = null;
    public static final int VBANNERINFOS_FIELD_NUMBER = 2;
    public static final int VRECOMMENDCLUBBASEINFOS_FIELD_NUMBER = 4;
    public static final int VRECOMMENDUSERINFOS_FIELD_NUMBER = 3;
    public static final int VUSERBASEINFOS_FIELD_NUMBER = 5;
    private static final TexasPoker$SCGetFrontPageInfoV2Rsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ERROR_CODE_TYPE eErrCode_;
    private int iOffset_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;
    private List<BannerInfo> vBannerInfos_;
    private List<ClubBaseInfo> vRecommendClubBaseInfos_;
    private List<RecommendUserInfo> vRecommendUserInfos_;
    private List<UserBaseInfoNet> vUserBaseInfos_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetFrontPageInfoV2Rsp.1 */
    class C00051 extends AbstractParser<TexasPoker$SCGetFrontPageInfoV2Rsp> {
        static {
            fixHelper.fixfunc(new int[]{33792, 33793});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00051();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCGetFrontPageInfoV2Rsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCGetFrontPageInfoV2RspOrBuilder {
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iOffset_;
        private RepeatedFieldBuilder<BannerInfo, com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder, BannerInfoOrBuilder> vBannerInfosBuilder_;
        private List<BannerInfo> vBannerInfos_;
        private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vRecommendClubBaseInfosBuilder_;
        private List<ClubBaseInfo> vRecommendClubBaseInfos_;
        private RepeatedFieldBuilder<RecommendUserInfo, com.texaspoker.moment.TexasPoker.RecommendUserInfo.Builder, RecommendUserInfoOrBuilder> vRecommendUserInfosBuilder_;
        private List<RecommendUserInfo> vRecommendUserInfos_;
        private RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> vUserBaseInfosBuilder_;
        private List<UserBaseInfoNet> vUserBaseInfos_;

        static {
            fixHelper.fixfunc(new int[]{32744, 32745, 32746, 32747, 32748, 32749, 32750, 32751, 32752, 32753, 32754, 32755, 32756, 32757, 32758, 32759, 32760, 32761, 32762, 32763, 32764, 32765, 32766, 32767, NTLMConstants.FLAG_NEGOTIATE_ALWAYS_SIGN, 32769, 32770, 32771, 32772, 32773, 32774, 32775, 32776, 32777, 32778, 32779, 32780, 32781, 32782, 32783, 32784, 32785, 32786, 32787, 32788, 32789, 32790, 32791, 32792, 32793, 32794, 32795, 32796, 32797, 32798, 32799, 32800, 32801, 32802, 32803, 32804, 32805, 32806, 32807, 32808, 32809, 32810, 32811, 32812, 32813, 32814, 32815, 32816, 32817, 32818, 32819, 32820, 32821, 32822, 32823, 32824, 32825, 32826, 32827, 32828, 32829, 32830, 32831, 32832, 32833, 32834, 32835, 32836, 32837, 32838, 32839, 32840, 32841, 32842, 32843, 32844, 32845, 32846, 32847, 32848, 32849, 32850, 32851, 32852, 32853, 32854, 32855, 32856, 32857, 32858, 32859, 32860, 32861, 32862, 32863});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVBannerInfosIsMutable();

        private native void ensureVRecommendClubBaseInfosIsMutable();

        private native void ensureVRecommendUserInfosIsMutable();

        private native void ensureVUserBaseInfosIsMutable();

        private native RepeatedFieldBuilder<BannerInfo, com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder, BannerInfoOrBuilder> getVBannerInfosFieldBuilder();

        private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVRecommendClubBaseInfosFieldBuilder();

        private native RepeatedFieldBuilder<RecommendUserInfo, com.texaspoker.moment.TexasPoker.RecommendUserInfo.Builder, RecommendUserInfoOrBuilder> getVRecommendUserInfosFieldBuilder();

        private native RepeatedFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getVUserBaseInfosFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVBannerInfos(Iterable<? extends BannerInfo> iterable);

        public final native Builder addAllVRecommendClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

        public final native Builder addAllVRecommendUserInfos(Iterable<? extends RecommendUserInfo> iterable);

        public final native Builder addAllVUserBaseInfos(Iterable<? extends UserBaseInfoNet> iterable);

        public final native Builder addVBannerInfos(int i, com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder builder);

        public final native Builder addVBannerInfos(int i, BannerInfo bannerInfo);

        public final native Builder addVBannerInfos(com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder builder);

        public final native Builder addVBannerInfos(BannerInfo bannerInfo);

        public final native com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder addVBannerInfosBuilder();

        public final native com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder addVBannerInfosBuilder(int i);

        public final native Builder addVRecommendClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

        public final native Builder addVRecommendClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

        public final native Builder addVRecommendClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

        public final native Builder addVRecommendClubBaseInfos(ClubBaseInfo clubBaseInfo);

        public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVRecommendClubBaseInfosBuilder();

        public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVRecommendClubBaseInfosBuilder(int i);

        public final native Builder addVRecommendUserInfos(int i, com.texaspoker.moment.TexasPoker.RecommendUserInfo.Builder builder);

        public final native Builder addVRecommendUserInfos(int i, RecommendUserInfo recommendUserInfo);

        public final native Builder addVRecommendUserInfos(com.texaspoker.moment.TexasPoker.RecommendUserInfo.Builder builder);

        public final native Builder addVRecommendUserInfos(RecommendUserInfo recommendUserInfo);

        public final native com.texaspoker.moment.TexasPoker.RecommendUserInfo.Builder addVRecommendUserInfosBuilder();

        public final native com.texaspoker.moment.TexasPoker.RecommendUserInfo.Builder addVRecommendUserInfosBuilder(int i);

        public final native Builder addVUserBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

        public final native Builder addVUserBaseInfos(int i, UserBaseInfoNet userBaseInfoNet);

        public final native Builder addVUserBaseInfos(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

        public final native Builder addVUserBaseInfos(UserBaseInfoNet userBaseInfoNet);

        public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addVUserBaseInfosBuilder();

        public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder addVUserBaseInfosBuilder(int i);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m597build();

        public final native TexasPoker$SCGetFrontPageInfoV2Rsp m598build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m599buildPartial();

        public final native TexasPoker$SCGetFrontPageInfoV2Rsp m600buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m601clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m602clear();

        public final native Builder m603clear();

        public final native Builder clearEErrCode();

        public final native Builder clearIOffset();

        public final native Builder clearVBannerInfos();

        public final native Builder clearVRecommendClubBaseInfos();

        public final native Builder clearVRecommendUserInfos();

        public final native Builder clearVUserBaseInfos();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m604clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m605clone();

        public final native Builder m606clone();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m607getDefaultInstanceForType();

        public final native TexasPoker$SCGetFrontPageInfoV2Rsp m608getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIOffset();

        public final native BannerInfo getVBannerInfos(int i);

        public final native com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder getVBannerInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder> getVBannerInfosBuilderList();

        public final native int getVBannerInfosCount();

        public final native List<BannerInfo> getVBannerInfosList();

        public final native BannerInfoOrBuilder getVBannerInfosOrBuilder(int i);

        public final native List<? extends BannerInfoOrBuilder> getVBannerInfosOrBuilderList();

        public final native ClubBaseInfo getVRecommendClubBaseInfos(int i);

        public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVRecommendClubBaseInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVRecommendClubBaseInfosBuilderList();

        public final native int getVRecommendClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVRecommendClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVRecommendClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVRecommendClubBaseInfosOrBuilderList();

        public final native RecommendUserInfo getVRecommendUserInfos(int i);

        public final native com.texaspoker.moment.TexasPoker.RecommendUserInfo.Builder getVRecommendUserInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPoker.RecommendUserInfo.Builder> getVRecommendUserInfosBuilderList();

        public final native int getVRecommendUserInfosCount();

        public final native List<RecommendUserInfo> getVRecommendUserInfosList();

        public final native RecommendUserInfoOrBuilder getVRecommendUserInfosOrBuilder(int i);

        public final native List<? extends RecommendUserInfoOrBuilder> getVRecommendUserInfosOrBuilderList();

        public final native UserBaseInfoNet getVUserBaseInfos(int i);

        public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getVUserBaseInfosBuilder(int i);

        public final native List<com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder> getVUserBaseInfosBuilderList();

        public final native int getVUserBaseInfosCount();

        public final native List<UserBaseInfoNet> getVUserBaseInfosList();

        public final native UserBaseInfoNetOrBuilder getVUserBaseInfosOrBuilder(int i);

        public final native List<? extends UserBaseInfoNetOrBuilder> getVUserBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasIOffset();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m609mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m610mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m611mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m612mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m613mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCGetFrontPageInfoV2Rsp texasPoker$SCGetFrontPageInfoV2Rsp);

        public final native Builder removeVBannerInfos(int i);

        public final native Builder removeVRecommendClubBaseInfos(int i);

        public final native Builder removeVRecommendUserInfos(int i);

        public final native Builder removeVUserBaseInfos(int i);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setIOffset(int i);

        public final native Builder setVBannerInfos(int i, com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder builder);

        public final native Builder setVBannerInfos(int i, BannerInfo bannerInfo);

        public final native Builder setVRecommendClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

        public final native Builder setVRecommendClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

        public final native Builder setVRecommendUserInfos(int i, com.texaspoker.moment.TexasPoker.RecommendUserInfo.Builder builder);

        public final native Builder setVRecommendUserInfos(int i, RecommendUserInfo recommendUserInfo);

        public final native Builder setVUserBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

        public final native Builder setVUserBaseInfos(int i, UserBaseInfoNet userBaseInfoNet);

        public static final Descriptor getDescriptor() {
            return TexasPoker.fH();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{12433, 12434, 12435, 12436, 12437, 12438, 12439, 12440, 12441, 12442, 12443, 12444, 12445, 12446, 12447, 12448, 12449, 12450, 12451, 12452, 12453, 12454, 12455, 12456, 12457, 12458, 12459, 12460, 12461, 12462, 12463, 12464, 12465, 12466, 12467, 12468, 12469, 12470, 12471, 12472, 12473, 12474, 12475, 12476, 12477, 12478, 12479, 12480});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCGetFrontPageInfoV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCGetFrontPageInfoV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCGetFrontPageInfoV2Rsp texasPoker$SCGetFrontPageInfoV2Rsp);

    private native TexasPoker$SCGetFrontPageInfoV2Rsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCGetFrontPageInfoV2Rsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCGetFrontPageInfoV2Rsp texasPoker$SCGetFrontPageInfoV2Rsp);

    private native TexasPoker$SCGetFrontPageInfoV2Rsp(boolean z);

    private native void initFields();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m590getDefaultInstanceForType();

    public final native TexasPoker$SCGetFrontPageInfoV2Rsp m591getDefaultInstanceForType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native int getIOffset();

    public final native Parser<TexasPoker$SCGetFrontPageInfoV2Rsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native BannerInfo getVBannerInfos(int i);

    public final native int getVBannerInfosCount();

    public final native List<BannerInfo> getVBannerInfosList();

    public final native BannerInfoOrBuilder getVBannerInfosOrBuilder(int i);

    public final native List<? extends BannerInfoOrBuilder> getVBannerInfosOrBuilderList();

    public final native ClubBaseInfo getVRecommendClubBaseInfos(int i);

    public final native int getVRecommendClubBaseInfosCount();

    public final native List<ClubBaseInfo> getVRecommendClubBaseInfosList();

    public final native ClubBaseInfoOrBuilder getVRecommendClubBaseInfosOrBuilder(int i);

    public final native List<? extends ClubBaseInfoOrBuilder> getVRecommendClubBaseInfosOrBuilderList();

    public final native RecommendUserInfo getVRecommendUserInfos(int i);

    public final native int getVRecommendUserInfosCount();

    public final native List<RecommendUserInfo> getVRecommendUserInfosList();

    public final native RecommendUserInfoOrBuilder getVRecommendUserInfosOrBuilder(int i);

    public final native List<? extends RecommendUserInfoOrBuilder> getVRecommendUserInfosOrBuilderList();

    public final native UserBaseInfoNet getVUserBaseInfos(int i);

    public final native int getVUserBaseInfosCount();

    public final native List<UserBaseInfoNet> getVUserBaseInfosList();

    public final native UserBaseInfoNetOrBuilder getVUserBaseInfosOrBuilder(int i);

    public final native List<? extends UserBaseInfoNetOrBuilder> getVUserBaseInfosOrBuilderList();

    public final native boolean hasEErrCode();

    public final native boolean hasIOffset();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m592newBuilderForType();

    public final native Builder m593newBuilderForType();

    protected final native Builder m594newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m595toBuilder();

    public final native Builder m596toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCGetFrontPageInfoV2Rsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.fH();
    }

    static void __clinit__() {
        PARSER = new C00051();
        TexasPoker$SCGetFrontPageInfoV2Rsp texasPoker$SCGetFrontPageInfoV2Rsp = new TexasPoker$SCGetFrontPageInfoV2Rsp(true);
        defaultInstance = texasPoker$SCGetFrontPageInfoV2Rsp;
        texasPoker$SCGetFrontPageInfoV2Rsp.initFields();
    }

    public static TexasPoker$SCGetFrontPageInfoV2Rsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCGetFrontPageInfoV2Rsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCGetFrontPageInfoV2Rsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoV2Rsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoV2Rsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCGetFrontPageInfoV2Rsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCGetFrontPageInfoV2Rsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoV2Rsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoV2Rsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCGetFrontPageInfoV2Rsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCGetFrontPageInfoV2Rsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoV2Rsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoV2Rsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCGetFrontPageInfoV2Rsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCGetFrontPageInfoV2Rsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoV2Rsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCGetFrontPageInfoV2Rsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCGetFrontPageInfoV2Rsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCGetFrontPageInfoV2Rsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCGetFrontPageInfoV2Rsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCGetFrontPageInfoV2Rsp texasPoker$SCGetFrontPageInfoV2Rsp) {
        return newBuilder().mergeFrom(texasPoker$SCGetFrontPageInfoV2Rsp);
    }
}
