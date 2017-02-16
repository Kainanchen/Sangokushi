package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessage.BuilderParent;
import com.google.protobuf.GeneratedMessage.FieldAccessorTable;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import java.io.InputStream;
import java.util.List;

public final class TexasPokerCommon {
    private static final Descriptor f1A;
    private static FieldAccessorTable f2B;
    private static final Descriptor f3C;
    private static FieldAccessorTable f4D;
    private static final Descriptor f5E;
    private static FieldAccessorTable f6F;
    private static final Descriptor f7G;
    private static FieldAccessorTable f8H;
    private static FileDescriptor f9I;
    private static final Descriptor f10a;
    private static FieldAccessorTable f11b;
    private static final Descriptor f12c;
    private static FieldAccessorTable f13d;
    private static final Descriptor f14e;
    private static FieldAccessorTable f15f;
    private static final Descriptor f16g;
    private static FieldAccessorTable f17h;
    private static final Descriptor f18i;
    private static FieldAccessorTable f19j;
    private static final Descriptor f20k;
    private static FieldAccessorTable f21l;
    private static final Descriptor f22m;
    private static FieldAccessorTable f23n;
    private static final Descriptor f24o;
    private static FieldAccessorTable f25p;
    private static final Descriptor f26q;
    private static FieldAccessorTable f27r;
    private static final Descriptor f28s;
    private static FieldAccessorTable f29t;
    private static final Descriptor f30u;
    private static FieldAccessorTable f31v;
    private static final Descriptor f32w;
    private static FieldAccessorTable f33x;
    private static final Descriptor f34y;
    private static FieldAccessorTable f35z;

    /* renamed from: com.texaspoker.moment.TexasPokerCommon.1 */
    class C00831 implements InternalDescriptorAssigner {
        static {
            fixHelper.fixfunc(new int[]{28308, 28309});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00831();

        public final native ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
    }

    public interface BannerInfoOrBuilder extends MessageOrBuilder {
        long getLBannerID();

        String getSImageUrl();

        ByteString getSImageUrlBytes();

        String getSTargetUrl();

        ByteString getSTargetUrlBytes();

        boolean hasLBannerID();

        boolean hasSImageUrl();

        boolean hasSTargetUrl();
    }

    public static final class BannerInfo extends GeneratedMessage implements BannerInfoOrBuilder {
        public static final int LBANNERID_FIELD_NUMBER = 3;
        public static Parser<BannerInfo> PARSER = null;
        public static final int SIMAGEURL_FIELD_NUMBER = 1;
        public static final int STARGETURL_FIELD_NUMBER = 2;
        private static final BannerInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lBannerID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sImageUrl_;
        private Object sTargetUrl_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.BannerInfo.1 */
        class C00841 extends AbstractParser<BannerInfo> {
            static {
                fixHelper.fixfunc(new int[]{4217, 4218});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00841();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements BannerInfoOrBuilder {
            private int bitField0_;
            private long lBannerID_;
            private Object sImageUrl_;
            private Object sTargetUrl_;

            static {
                fixHelper.fixfunc(new int[]{26811, 26812, 26813, 26814, 26815, 26816, 26817, 26818, 26819, 26820, 26821, 26822, 26823, 26824, 26825, 26826, 26827, 26828, 26829, 26830, 26831, 26832, 26833, 26834, 26835, 26836, 26837, 26838, 26839, 26840, 26841, 26842, 26843, 26844, 26845, 26846, 26847, 26848, 26849, 26850, 26851, 26852, 26853, 26854, 26855, 26856, 26857, 26858});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m765build();

            public final native BannerInfo m766build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m767buildPartial();

            public final native BannerInfo m768buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m769clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m770clear();

            public final native Builder m771clear();

            public final native Builder clearLBannerID();

            public final native Builder clearSImageUrl();

            public final native Builder clearSTargetUrl();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m772clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m773clone();

            public final native Builder m774clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m775getDefaultInstanceForType();

            public final native BannerInfo m776getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLBannerID();

            public final native String getSImageUrl();

            public final native ByteString getSImageUrlBytes();

            public final native String getSTargetUrl();

            public final native ByteString getSTargetUrlBytes();

            public final native boolean hasLBannerID();

            public final native boolean hasSImageUrl();

            public final native boolean hasSTargetUrl();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m777mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m778mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m779mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m780mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m781mergeFrom(Message message);

            public final native Builder mergeFrom(BannerInfo bannerInfo);

            public final native Builder setLBannerID(long j);

            public final native Builder setSImageUrl(String str);

            public final native Builder setSImageUrlBytes(ByteString byteString);

            public final native Builder setSTargetUrl(String str);

            public final native Builder setSTargetUrlBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f10a;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{28065, 28066, 28067, 28068, 28069, 28070, 28071, 28072, 28073, 28074, 28075, 28076, 28077, 28078, 28079, 28080, 28081, 28082, 28083, 28084, 28085, 28086, 28087, 28088, 28089, 28090, 28091, 28092, 28093, 28094, 28095, 28096});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native BannerInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ BannerInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, BannerInfo bannerInfo);

        private native BannerInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ BannerInfo(com.google.protobuf.GeneratedMessage.Builder builder, BannerInfo bannerInfo);

        private native BannerInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m758getDefaultInstanceForType();

        public final native BannerInfo m759getDefaultInstanceForType();

        public final native long getLBannerID();

        public final native Parser<BannerInfo> getParserForType();

        public final native String getSImageUrl();

        public final native ByteString getSImageUrlBytes();

        public final native String getSTargetUrl();

        public final native ByteString getSTargetUrlBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasLBannerID();

        public final native boolean hasSImageUrl();

        public final native boolean hasSTargetUrl();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m760newBuilderForType();

        public final native Builder m761newBuilderForType();

        protected final native Builder m762newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m763toBuilder();

        public final native Builder m764toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static BannerInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f10a;
        }

        static void __clinit__() {
            PARSER = new C00841();
            BannerInfo bannerInfo = new BannerInfo(true);
            defaultInstance = bannerInfo;
            bannerInfo.initFields();
        }

        public static BannerInfo parseFrom(ByteString byteString) {
            return (BannerInfo) PARSER.parseFrom(byteString);
        }

        public static BannerInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BannerInfo parseFrom(byte[] bArr) {
            return (BannerInfo) PARSER.parseFrom(bArr);
        }

        public static BannerInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static BannerInfo parseFrom(InputStream inputStream) {
            return (BannerInfo) PARSER.parseFrom(inputStream);
        }

        public static BannerInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static BannerInfo parseDelimitedFrom(InputStream inputStream) {
            return (BannerInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static BannerInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static BannerInfo parseFrom(CodedInputStream codedInputStream) {
            return (BannerInfo) PARSER.parseFrom(codedInputStream);
        }

        public static BannerInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BannerInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(BannerInfo bannerInfo) {
            return newBuilder().mergeFrom(bannerInfo);
        }
    }

    public interface BravoPokerHistoryInfoOrBuilder extends MessageOrBuilder {
        int getIType();

        long getLHandID();

        long getLMaxPot();

        long getLRoomID();

        long getLSaveUuid();

        long getLWinUuid();

        String getSDesc();

        ByteString getSDescBytes();

        String getSNickName();

        ByteString getSNickNameBytes();

        String getSPokerDesc();

        ByteString getSPokerDescBytes();

        String getSPokerHistoryName();

        ByteString getSPokerHistoryNameBytes();

        String getSPokerHistoryShareUrl();

        ByteString getSPokerHistoryShareUrlBytes();

        String getSPokerHistoryUrl();

        ByteString getSPokerHistoryUrlBytes();

        String getSSmallIcon();

        ByteString getSSmallIconBytes();

        int getVHandCards(int i);

        int getVHandCardsCount();

        List<Integer> getVHandCardsList();

        boolean hasIType();

        boolean hasLHandID();

        boolean hasLMaxPot();

        boolean hasLRoomID();

        boolean hasLSaveUuid();

        boolean hasLWinUuid();

        boolean hasSDesc();

        boolean hasSNickName();

        boolean hasSPokerDesc();

        boolean hasSPokerHistoryName();

        boolean hasSPokerHistoryShareUrl();

        boolean hasSPokerHistoryUrl();

        boolean hasSSmallIcon();
    }

    public static final class BravoPokerHistoryInfo extends GeneratedMessage implements BravoPokerHistoryInfoOrBuilder {
        public static final int ITYPE_FIELD_NUMBER = 3;
        public static final int LHANDID_FIELD_NUMBER = 2;
        public static final int LMAXPOT_FIELD_NUMBER = 8;
        public static final int LROOMID_FIELD_NUMBER = 1;
        public static final int LSAVEUUID_FIELD_NUMBER = 14;
        public static final int LWINUUID_FIELD_NUMBER = 4;
        public static Parser<BravoPokerHistoryInfo> PARSER = null;
        public static final int SDESC_FIELD_NUMBER = 7;
        public static final int SNICKNAME_FIELD_NUMBER = 5;
        public static final int SPOKERDESC_FIELD_NUMBER = 13;
        public static final int SPOKERHISTORYNAME_FIELD_NUMBER = 12;
        public static final int SPOKERHISTORYSHAREURL_FIELD_NUMBER = 10;
        public static final int SPOKERHISTORYURL_FIELD_NUMBER = 9;
        public static final int SSMALLICON_FIELD_NUMBER = 6;
        public static final int VHANDCARDS_FIELD_NUMBER = 11;
        private static final BravoPokerHistoryInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iType_;
        private long lHandID_;
        private long lMaxPot_;
        private long lRoomID_;
        private long lSaveUuid_;
        private long lWinUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sDesc_;
        private Object sNickName_;
        private Object sPokerDesc_;
        private Object sPokerHistoryName_;
        private Object sPokerHistoryShareUrl_;
        private Object sPokerHistoryUrl_;
        private Object sSmallIcon_;
        private final UnknownFieldSet unknownFields;
        private List<Integer> vHandCards_;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo.1 */
        class C00851 extends AbstractParser<BravoPokerHistoryInfo> {
            static {
                fixHelper.fixfunc(new int[]{17806, 17807});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00851();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements BravoPokerHistoryInfoOrBuilder {
            private int bitField0_;
            private int iType_;
            private long lHandID_;
            private long lMaxPot_;
            private long lRoomID_;
            private long lSaveUuid_;
            private long lWinUuid_;
            private Object sDesc_;
            private Object sNickName_;
            private Object sPokerDesc_;
            private Object sPokerHistoryName_;
            private Object sPokerHistoryShareUrl_;
            private Object sPokerHistoryUrl_;
            private Object sSmallIcon_;
            private List<Integer> vHandCards_;

            static {
                fixHelper.fixfunc(new int[]{26665, 26666, 26667, 26668, 26669, 26670, 26671, 26672, 26673, 26674, 26675, 26676, 26677, 26678, 26679, 26680, 26681, 26682, 26683, 26684, 26685, 26686, 26687, 26688, 26689, 26690, 26691, 26692, 26693, 26694, 26695, 26696, 26697, 26698, 26699, 26700, 26701, 26702, 26703, 26704, 26705, 26706, 26707, 26708, 26709, 26710, 26711, 26712, 26713, 26714, 26715, 26716, 26717, 26718, 26719, 26720, 26721, 26722, 26723, 26724, 26725, 26726, 26727, 26728, 26729, 26730, 26731, 26732, 26733, 26734, 26735, 26736, 26737, 26738, 26739, 26740, 26741, 26742, 26743, 26744, 26745, 26746, 26747, 26748, 26749, 26750, 26751, 26752, 26753, 26754, 26755, 26756, 26757, 26758, 26759, 26760, 26761, 26762, 26763, 26764, 26765, 26766, 26767, 26768, 26769, 26770});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVHandCardsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVHandCards(Iterable<? extends Integer> iterable);

            public final native Builder addVHandCards(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m789build();

            public final native BravoPokerHistoryInfo m790build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m791buildPartial();

            public final native BravoPokerHistoryInfo m792buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m793clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m794clear();

            public final native Builder m795clear();

            public final native Builder clearIType();

            public final native Builder clearLHandID();

            public final native Builder clearLMaxPot();

            public final native Builder clearLRoomID();

            public final native Builder clearLSaveUuid();

            public final native Builder clearLWinUuid();

            public final native Builder clearSDesc();

            public final native Builder clearSNickName();

            public final native Builder clearSPokerDesc();

            public final native Builder clearSPokerHistoryName();

            public final native Builder clearSPokerHistoryShareUrl();

            public final native Builder clearSPokerHistoryUrl();

            public final native Builder clearSSmallIcon();

            public final native Builder clearVHandCards();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m796clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m797clone();

            public final native Builder m798clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m799getDefaultInstanceForType();

            public final native BravoPokerHistoryInfo m800getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIType();

            public final native long getLHandID();

            public final native long getLMaxPot();

            public final native long getLRoomID();

            public final native long getLSaveUuid();

            public final native long getLWinUuid();

            public final native String getSDesc();

            public final native ByteString getSDescBytes();

            public final native String getSNickName();

            public final native ByteString getSNickNameBytes();

            public final native String getSPokerDesc();

            public final native ByteString getSPokerDescBytes();

            public final native String getSPokerHistoryName();

            public final native ByteString getSPokerHistoryNameBytes();

            public final native String getSPokerHistoryShareUrl();

            public final native ByteString getSPokerHistoryShareUrlBytes();

            public final native String getSPokerHistoryUrl();

            public final native ByteString getSPokerHistoryUrlBytes();

            public final native String getSSmallIcon();

            public final native ByteString getSSmallIconBytes();

            public final native int getVHandCards(int i);

            public final native int getVHandCardsCount();

            public final native List<Integer> getVHandCardsList();

            public final native boolean hasIType();

            public final native boolean hasLHandID();

            public final native boolean hasLMaxPot();

            public final native boolean hasLRoomID();

            public final native boolean hasLSaveUuid();

            public final native boolean hasLWinUuid();

            public final native boolean hasSDesc();

            public final native boolean hasSNickName();

            public final native boolean hasSPokerDesc();

            public final native boolean hasSPokerHistoryName();

            public final native boolean hasSPokerHistoryShareUrl();

            public final native boolean hasSPokerHistoryUrl();

            public final native boolean hasSSmallIcon();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m801mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m802mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m803mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m804mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m805mergeFrom(Message message);

            public final native Builder mergeFrom(BravoPokerHistoryInfo bravoPokerHistoryInfo);

            public final native Builder setIType(int i);

            public final native Builder setLHandID(long j);

            public final native Builder setLMaxPot(long j);

            public final native Builder setLRoomID(long j);

            public final native Builder setLSaveUuid(long j);

            public final native Builder setLWinUuid(long j);

            public final native Builder setSDesc(String str);

            public final native Builder setSDescBytes(ByteString byteString);

            public final native Builder setSNickName(String str);

            public final native Builder setSNickNameBytes(ByteString byteString);

            public final native Builder setSPokerDesc(String str);

            public final native Builder setSPokerDescBytes(ByteString byteString);

            public final native Builder setSPokerHistoryName(String str);

            public final native Builder setSPokerHistoryNameBytes(ByteString byteString);

            public final native Builder setSPokerHistoryShareUrl(String str);

            public final native Builder setSPokerHistoryShareUrlBytes(ByteString byteString);

            public final native Builder setSPokerHistoryUrl(String str);

            public final native Builder setSPokerHistoryUrlBytes(ByteString byteString);

            public final native Builder setSSmallIcon(String str);

            public final native Builder setSSmallIconBytes(ByteString byteString);

            public final native Builder setVHandCards(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f24o;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14559, 14560, 14561, 14562, 14563, 14564, 14565, 14566, 14567, 14568, 14569, 14570, 14571, 14572, 14573, 14574, 14575, 14576, 14577, 14578, 14579, 14580, 14581, 14582, 14583, 14584, 14585, 14586, 14587, 14588, 14589, 14590, 14591, 14592, 14593, 14594, 14595, 14596, 14597, 14598, 14599, 14600, 14601, 14602, 14603, 14604, 14605, 14606, 14607, 14608, 14609, 14610, 14611, 14612, 14613, 14614, 14615, 14616, 14617, 14618});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native BravoPokerHistoryInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ BravoPokerHistoryInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, BravoPokerHistoryInfo bravoPokerHistoryInfo);

        private native BravoPokerHistoryInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ BravoPokerHistoryInfo(com.google.protobuf.GeneratedMessage.Builder builder, BravoPokerHistoryInfo bravoPokerHistoryInfo);

        private native BravoPokerHistoryInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m782getDefaultInstanceForType();

        public final native BravoPokerHistoryInfo m783getDefaultInstanceForType();

        public final native int getIType();

        public final native long getLHandID();

        public final native long getLMaxPot();

        public final native long getLRoomID();

        public final native long getLSaveUuid();

        public final native long getLWinUuid();

        public final native Parser<BravoPokerHistoryInfo> getParserForType();

        public final native String getSDesc();

        public final native ByteString getSDescBytes();

        public final native String getSNickName();

        public final native ByteString getSNickNameBytes();

        public final native String getSPokerDesc();

        public final native ByteString getSPokerDescBytes();

        public final native String getSPokerHistoryName();

        public final native ByteString getSPokerHistoryNameBytes();

        public final native String getSPokerHistoryShareUrl();

        public final native ByteString getSPokerHistoryShareUrlBytes();

        public final native String getSPokerHistoryUrl();

        public final native ByteString getSPokerHistoryUrlBytes();

        public final native String getSSmallIcon();

        public final native ByteString getSSmallIconBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native int getVHandCards(int i);

        public final native int getVHandCardsCount();

        public final native List<Integer> getVHandCardsList();

        public final native boolean hasIType();

        public final native boolean hasLHandID();

        public final native boolean hasLMaxPot();

        public final native boolean hasLRoomID();

        public final native boolean hasLSaveUuid();

        public final native boolean hasLWinUuid();

        public final native boolean hasSDesc();

        public final native boolean hasSNickName();

        public final native boolean hasSPokerDesc();

        public final native boolean hasSPokerHistoryName();

        public final native boolean hasSPokerHistoryShareUrl();

        public final native boolean hasSPokerHistoryUrl();

        public final native boolean hasSSmallIcon();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m784newBuilderForType();

        public final native Builder m785newBuilderForType();

        protected final native Builder m786newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m787toBuilder();

        public final native Builder m788toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static BravoPokerHistoryInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f24o;
        }

        static void __clinit__() {
            PARSER = new C00851();
            BravoPokerHistoryInfo bravoPokerHistoryInfo = new BravoPokerHistoryInfo(true);
            defaultInstance = bravoPokerHistoryInfo;
            bravoPokerHistoryInfo.initFields();
        }

        public static BravoPokerHistoryInfo parseFrom(ByteString byteString) {
            return (BravoPokerHistoryInfo) PARSER.parseFrom(byteString);
        }

        public static BravoPokerHistoryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BravoPokerHistoryInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static BravoPokerHistoryInfo parseFrom(byte[] bArr) {
            return (BravoPokerHistoryInfo) PARSER.parseFrom(bArr);
        }

        public static BravoPokerHistoryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BravoPokerHistoryInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static BravoPokerHistoryInfo parseFrom(InputStream inputStream) {
            return (BravoPokerHistoryInfo) PARSER.parseFrom(inputStream);
        }

        public static BravoPokerHistoryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BravoPokerHistoryInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static BravoPokerHistoryInfo parseDelimitedFrom(InputStream inputStream) {
            return (BravoPokerHistoryInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static BravoPokerHistoryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BravoPokerHistoryInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static BravoPokerHistoryInfo parseFrom(CodedInputStream codedInputStream) {
            return (BravoPokerHistoryInfo) PARSER.parseFrom(codedInputStream);
        }

        public static BravoPokerHistoryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BravoPokerHistoryInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(BravoPokerHistoryInfo bravoPokerHistoryInfo) {
            return newBuilder().mergeFrom(bravoPokerHistoryInfo);
        }
    }

    public enum CREATE_ROOM_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int CAHT_ROOM_VALUE = 1;
        public static final int CLUB_ROOM_VALUE = 2;
        public static final int QUICK_GAME_ROOM_VALUE = 3;
        private static final CREATE_ROOM_TYPE[] VALUES = null;
        private static EnumLiteMap<CREATE_ROOM_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE.1 */
        class C00861 implements EnumLiteMap<CREATE_ROOM_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{30394, 30395});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00861();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{17172, 17173, 17174, 17175});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CREATE_ROOM_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            CAHT_ROOM = new CREATE_ROOM_TYPE("CAHT_ROOM", 0, 0, CAHT_ROOM_VALUE);
            CLUB_ROOM = new CREATE_ROOM_TYPE("CLUB_ROOM", CAHT_ROOM_VALUE, CAHT_ROOM_VALUE, CLUB_ROOM_VALUE);
            QUICK_GAME_ROOM = new CREATE_ROOM_TYPE("QUICK_GAME_ROOM", CLUB_ROOM_VALUE, CLUB_ROOM_VALUE, QUICK_GAME_ROOM_VALUE);
            CREATE_ROOM_TYPE[] create_room_typeArr = new CREATE_ROOM_TYPE[QUICK_GAME_ROOM_VALUE];
            create_room_typeArr[0] = CAHT_ROOM;
            create_room_typeArr[CAHT_ROOM_VALUE] = CLUB_ROOM;
            create_room_typeArr[CLUB_ROOM_VALUE] = QUICK_GAME_ROOM;
            ENUM$VALUES = create_room_typeArr;
            internalValueMap = new C00861();
            VALUES = values();
        }

        public static CREATE_ROOM_TYPE valueOf(int i) {
            switch (i) {
                case CAHT_ROOM_VALUE:
                    return CAHT_ROOM;
                case CLUB_ROOM_VALUE:
                    return CLUB_ROOM;
                case QUICK_GAME_ROOM_VALUE:
                    return QUICK_GAME_ROOM;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<CREATE_ROOM_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerCommon.m11a().getEnumTypes().get(5);
        }

        public static CREATE_ROOM_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface ClubBaseInfoOrBuilder extends MessageOrBuilder {
        int getBClubMsgMute();

        int getBClubMsgVibrate();

        int getBVerify();

        int getIClubExperience();

        int getIClubLevel();

        int getICurMembers();

        int getIManagerCreate();

        int getIMaxMembers();

        long getLClubID();

        long getLClubScore();

        long getLCreateTime();

        long getLFund();

        String getSBigAlbums(int i);

        ByteString getSBigAlbumsBytes(int i);

        int getSBigAlbumsCount();

        ProtocolStringList getSBigAlbumsList();

        String getSBigIcon();

        ByteString getSBigIconBytes();

        String getSClubLocation();

        ByteString getSClubLocationBytes();

        String getSClubName();

        ByteString getSClubNameBytes();

        String getSDesc();

        ByteString getSDescBytes();

        String getSSmallAlbums(int i);

        ByteString getSSmallAlbumsBytes(int i);

        int getSSmallAlbumsCount();

        ProtocolStringList getSSmallAlbumsList();

        String getSSmallIcon();

        ByteString getSSmallIconBytes();

        UserBaseInfoNet getStCreateUserBaseInfo();

        UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

        boolean hasBClubMsgMute();

        boolean hasBClubMsgVibrate();

        boolean hasBVerify();

        boolean hasIClubExperience();

        boolean hasIClubLevel();

        boolean hasICurMembers();

        boolean hasIManagerCreate();

        boolean hasIMaxMembers();

        boolean hasLClubID();

        boolean hasLClubScore();

        boolean hasLCreateTime();

        boolean hasLFund();

        boolean hasSBigIcon();

        boolean hasSClubLocation();

        boolean hasSClubName();

        boolean hasSDesc();

        boolean hasSSmallIcon();

        boolean hasStCreateUserBaseInfo();
    }

    public static final class ClubBaseInfo extends GeneratedMessage implements ClubBaseInfoOrBuilder {
        public static final int BCLUBMSGMUTE_FIELD_NUMBER = 11;
        public static final int BCLUBMSGVIBRATE_FIELD_NUMBER = 12;
        public static final int BVERIFY_FIELD_NUMBER = 13;
        public static final int ICLUBEXPERIENCE_FIELD_NUMBER = 15;
        public static final int ICLUBLEVEL_FIELD_NUMBER = 14;
        public static final int ICURMEMBERS_FIELD_NUMBER = 18;
        public static final int IMANAGERCREATE_FIELD_NUMBER = 20;
        public static final int IMAXMEMBERS_FIELD_NUMBER = 17;
        public static final int LCLUBID_FIELD_NUMBER = 1;
        public static final int LCLUBSCORE_FIELD_NUMBER = 19;
        public static final int LCREATETIME_FIELD_NUMBER = 16;
        public static final int LFUND_FIELD_NUMBER = 7;
        public static Parser<ClubBaseInfo> PARSER = null;
        public static final int SBIGALBUMS_FIELD_NUMBER = 6;
        public static final int SBIGICON_FIELD_NUMBER = 9;
        public static final int SCLUBLOCATION_FIELD_NUMBER = 4;
        public static final int SCLUBNAME_FIELD_NUMBER = 3;
        public static final int SDESC_FIELD_NUMBER = 10;
        public static final int SSMALLALBUMS_FIELD_NUMBER = 5;
        public static final int SSMALLICON_FIELD_NUMBER = 8;
        public static final int STCREATEUSERBASEINFO_FIELD_NUMBER = 2;
        private static final ClubBaseInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bClubMsgMute_;
        private int bClubMsgVibrate_;
        private int bVerify_;
        private int bitField0_;
        private int iClubExperience_;
        private int iClubLevel_;
        private int iCurMembers_;
        private int iManagerCreate_;
        private int iMaxMembers_;
        private long lClubID_;
        private long lClubScore_;
        private long lCreateTime_;
        private long lFund_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LazyStringList sBigAlbums_;
        private Object sBigIcon_;
        private Object sClubLocation_;
        private Object sClubName_;
        private Object sDesc_;
        private LazyStringList sSmallAlbums_;
        private Object sSmallIcon_;
        private UserBaseInfoNet stCreateUserBaseInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.1 */
        class C00871 extends AbstractParser<ClubBaseInfo> {
            static {
                fixHelper.fixfunc(new int[]{30219, 30220});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00871();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements ClubBaseInfoOrBuilder {
            private int bClubMsgMute_;
            private int bClubMsgVibrate_;
            private int bVerify_;
            private int bitField0_;
            private int iClubExperience_;
            private int iClubLevel_;
            private int iCurMembers_;
            private int iManagerCreate_;
            private int iMaxMembers_;
            private long lClubID_;
            private long lClubScore_;
            private long lCreateTime_;
            private long lFund_;
            private LazyStringList sBigAlbums_;
            private Object sBigIcon_;
            private Object sClubLocation_;
            private Object sClubName_;
            private Object sDesc_;
            private LazyStringList sSmallAlbums_;
            private Object sSmallIcon_;
            private SingleFieldBuilder<UserBaseInfoNet, Builder, UserBaseInfoNetOrBuilder> stCreateUserBaseInfoBuilder_;
            private UserBaseInfoNet stCreateUserBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{13523, 13524, 13525, 13526, 13527, 13528, 13529, 13530, 13531, 13532, 13533, 13534, 13535, 13536, 13537, 13538, 13539, 13540, 13541, 13542, 13543, 13544, 13545, 13546, 13547, 13548, 13549, 13550, 13551, 13552, 13553, 13554, 13555, 13556, 13557, 13558, 13559, 13560, 13561, 13562, 13563, 13564, 13565, 13566, 13567, 13568, 13569, 13570, 13571, 13572, 13573, 13574, 13575, 13576, 13577, 13578, 13579, 13580, 13581, 13582, 13583, 13584, 13585, 13586, 13587, 13588, 13589, 13590, 13591, 13592, 13593, 13594, 13595, 13596, 13597, 13598, 13599, 13600, 13601, 13602, 13603, 13604, 13605, 13606, 13607, 13608, 13609, 13610, 13611, 13612, 13613, 13614, 13615, 13616, 13617, 13618, 13619, 13620, 13621, 13622, 13623, 13624, 13625, 13626, 13627, 13628, 13629, 13630, 13631, 13632, 13633, 13634, 13635, 13636, 13637, 13638, 13639, 13640, 13641, 13642, 13643, 13644, 13645, 13646, 13647, 13648, 13649, 13650, 13651, 13652, 13653, 13654, 13655, 13656, 13657, 13658, 13659, 13660, 13661});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureSBigAlbumsIsMutable();

            private native void ensureSSmallAlbumsIsMutable();

            private native SingleFieldBuilder<UserBaseInfoNet, Builder, UserBaseInfoNetOrBuilder> getStCreateUserBaseInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllSBigAlbums(Iterable<String> iterable);

            public final native Builder addAllSSmallAlbums(Iterable<String> iterable);

            public final native Builder addSBigAlbums(String str);

            public final native Builder addSBigAlbumsBytes(ByteString byteString);

            public final native Builder addSSmallAlbums(String str);

            public final native Builder addSSmallAlbumsBytes(ByteString byteString);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m813build();

            public final native ClubBaseInfo m814build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m815buildPartial();

            public final native ClubBaseInfo m816buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m817clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m818clear();

            public final native Builder m819clear();

            public final native Builder clearBClubMsgMute();

            public final native Builder clearBClubMsgVibrate();

            public final native Builder clearBVerify();

            public final native Builder clearIClubExperience();

            public final native Builder clearIClubLevel();

            public final native Builder clearICurMembers();

            public final native Builder clearIManagerCreate();

            public final native Builder clearIMaxMembers();

            public final native Builder clearLClubID();

            public final native Builder clearLClubScore();

            public final native Builder clearLCreateTime();

            public final native Builder clearLFund();

            public final native Builder clearSBigAlbums();

            public final native Builder clearSBigIcon();

            public final native Builder clearSClubLocation();

            public final native Builder clearSClubName();

            public final native Builder clearSDesc();

            public final native Builder clearSSmallAlbums();

            public final native Builder clearSSmallIcon();

            public final native Builder clearStCreateUserBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m820clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m821clone();

            public final native Builder m822clone();

            public final native int getBClubMsgMute();

            public final native int getBClubMsgVibrate();

            public final native int getBVerify();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m823getDefaultInstanceForType();

            public final native ClubBaseInfo m824getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIClubExperience();

            public final native int getIClubLevel();

            public final native int getICurMembers();

            public final native int getIManagerCreate();

            public final native int getIMaxMembers();

            public final native long getLClubID();

            public final native long getLClubScore();

            public final native long getLCreateTime();

            public final native long getLFund();

            public final native String getSBigAlbums(int i);

            public final native ByteString getSBigAlbumsBytes(int i);

            public final native int getSBigAlbumsCount();

            public final native ProtocolStringList getSBigAlbumsList();

            public final native String getSBigIcon();

            public final native ByteString getSBigIconBytes();

            public final native String getSClubLocation();

            public final native ByteString getSClubLocationBytes();

            public final native String getSClubName();

            public final native ByteString getSClubNameBytes();

            public final native String getSDesc();

            public final native ByteString getSDescBytes();

            public final native String getSSmallAlbums(int i);

            public final native ByteString getSSmallAlbumsBytes(int i);

            public final native int getSSmallAlbumsCount();

            public final native ProtocolStringList getSSmallAlbumsList();

            public final native String getSSmallIcon();

            public final native ByteString getSSmallIconBytes();

            public final native UserBaseInfoNet getStCreateUserBaseInfo();

            public final native Builder getStCreateUserBaseInfoBuilder();

            public final native UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

            public final native boolean hasBClubMsgMute();

            public final native boolean hasBClubMsgVibrate();

            public final native boolean hasBVerify();

            public final native boolean hasIClubExperience();

            public final native boolean hasIClubLevel();

            public final native boolean hasICurMembers();

            public final native boolean hasIManagerCreate();

            public final native boolean hasIMaxMembers();

            public final native boolean hasLClubID();

            public final native boolean hasLClubScore();

            public final native boolean hasLCreateTime();

            public final native boolean hasLFund();

            public final native boolean hasSBigIcon();

            public final native boolean hasSClubLocation();

            public final native boolean hasSClubName();

            public final native boolean hasSDesc();

            public final native boolean hasSSmallIcon();

            public final native boolean hasStCreateUserBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m825mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m826mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m827mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m828mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m829mergeFrom(Message message);

            public final native Builder mergeFrom(ClubBaseInfo clubBaseInfo);

            public final native Builder mergeStCreateUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setBClubMsgMute(int i);

            public final native Builder setBClubMsgVibrate(int i);

            public final native Builder setBVerify(int i);

            public final native Builder setIClubExperience(int i);

            public final native Builder setIClubLevel(int i);

            public final native Builder setICurMembers(int i);

            public final native Builder setIManagerCreate(int i);

            public final native Builder setIMaxMembers(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setLClubScore(long j);

            public final native Builder setLCreateTime(long j);

            public final native Builder setLFund(long j);

            public final native Builder setSBigAlbums(int i, String str);

            public final native Builder setSBigIcon(String str);

            public final native Builder setSBigIconBytes(ByteString byteString);

            public final native Builder setSClubLocation(String str);

            public final native Builder setSClubLocationBytes(ByteString byteString);

            public final native Builder setSClubName(String str);

            public final native Builder setSClubNameBytes(ByteString byteString);

            public final native Builder setSDesc(String str);

            public final native Builder setSDescBytes(ByteString byteString);

            public final native Builder setSSmallAlbums(int i, String str);

            public final native Builder setSSmallIcon(String str);

            public final native Builder setSSmallIconBytes(ByteString byteString);

            public final native Builder setStCreateUserBaseInfo(Builder builder);

            public final native Builder setStCreateUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f7G;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14288, 14289, 14290, 14291, 14292, 14293, 14294, 14295, 14296, 14297, 14298, 14299, 14300, 14301, 14302, 14303, 14304, 14305, 14306, 14307, 14308, 14309, 14310, 14311, 14312, 14313, 14314, 14315, 14316, 14317, 14318, 14319, 14320, 14321, 14322, 14323, 14324, 14325, 14326, 14327, 14328, 14329, 14330, 14331, 14332, 14333, 14334, 14335, 14336, 14337, 14338, 14339, 14340, 14341, 14342, 14343, 14344, 14345, 14346, 14347, 14348, 14349, 14350, 14351, 14352, 14353, 14354, 14355, 14356, 14357, 14358, 14359, 14360, 14361});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native ClubBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ ClubBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, ClubBaseInfo clubBaseInfo);

        private native ClubBaseInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ ClubBaseInfo(com.google.protobuf.GeneratedMessage.Builder builder, ClubBaseInfo clubBaseInfo);

        private native ClubBaseInfo(boolean z);

        private native void initFields();

        public final native int getBClubMsgMute();

        public final native int getBClubMsgVibrate();

        public final native int getBVerify();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m806getDefaultInstanceForType();

        public final native ClubBaseInfo m807getDefaultInstanceForType();

        public final native int getIClubExperience();

        public final native int getIClubLevel();

        public final native int getICurMembers();

        public final native int getIManagerCreate();

        public final native int getIMaxMembers();

        public final native long getLClubID();

        public final native long getLClubScore();

        public final native long getLCreateTime();

        public final native long getLFund();

        public final native Parser<ClubBaseInfo> getParserForType();

        public final native String getSBigAlbums(int i);

        public final native ByteString getSBigAlbumsBytes(int i);

        public final native int getSBigAlbumsCount();

        public final native ProtocolStringList getSBigAlbumsList();

        public final native String getSBigIcon();

        public final native ByteString getSBigIconBytes();

        public final native String getSClubLocation();

        public final native ByteString getSClubLocationBytes();

        public final native String getSClubName();

        public final native ByteString getSClubNameBytes();

        public final native String getSDesc();

        public final native ByteString getSDescBytes();

        public final native String getSSmallAlbums(int i);

        public final native ByteString getSSmallAlbumsBytes(int i);

        public final native int getSSmallAlbumsCount();

        public final native ProtocolStringList getSSmallAlbumsList();

        public final native String getSSmallIcon();

        public final native ByteString getSSmallIconBytes();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStCreateUserBaseInfo();

        public final native UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBClubMsgMute();

        public final native boolean hasBClubMsgVibrate();

        public final native boolean hasBVerify();

        public final native boolean hasIClubExperience();

        public final native boolean hasIClubLevel();

        public final native boolean hasICurMembers();

        public final native boolean hasIManagerCreate();

        public final native boolean hasIMaxMembers();

        public final native boolean hasLClubID();

        public final native boolean hasLClubScore();

        public final native boolean hasLCreateTime();

        public final native boolean hasLFund();

        public final native boolean hasSBigIcon();

        public final native boolean hasSClubLocation();

        public final native boolean hasSClubName();

        public final native boolean hasSDesc();

        public final native boolean hasSSmallIcon();

        public final native boolean hasStCreateUserBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m808newBuilderForType();

        public final native Builder m809newBuilderForType();

        protected final native Builder m810newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m811toBuilder();

        public final native Builder m812toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static ClubBaseInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f7G;
        }

        static void __clinit__() {
            PARSER = new C00871();
            ClubBaseInfo clubBaseInfo = new ClubBaseInfo(true);
            defaultInstance = clubBaseInfo;
            clubBaseInfo.initFields();
        }

        public static ClubBaseInfo parseFrom(ByteString byteString) {
            return (ClubBaseInfo) PARSER.parseFrom(byteString);
        }

        public static ClubBaseInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubBaseInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClubBaseInfo parseFrom(byte[] bArr) {
            return (ClubBaseInfo) PARSER.parseFrom(bArr);
        }

        public static ClubBaseInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubBaseInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ClubBaseInfo parseFrom(InputStream inputStream) {
            return (ClubBaseInfo) PARSER.parseFrom(inputStream);
        }

        public static ClubBaseInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubBaseInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static ClubBaseInfo parseDelimitedFrom(InputStream inputStream) {
            return (ClubBaseInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static ClubBaseInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubBaseInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static ClubBaseInfo parseFrom(CodedInputStream codedInputStream) {
            return (ClubBaseInfo) PARSER.parseFrom(codedInputStream);
        }

        public static ClubBaseInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClubBaseInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(ClubBaseInfo clubBaseInfo) {
            return newBuilder().mergeFrom(clubBaseInfo);
        }
    }

    public interface CmdResultOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        int getICmdId();

        int getISubErrCode();

        String getStrErrDesc();

        ByteString getStrErrDescBytes();

        boolean hasEErrCode();

        boolean hasICmdId();

        boolean hasISubErrCode();

        boolean hasStrErrDesc();
    }

    public static final class CmdResult extends GeneratedMessage implements CmdResultOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 2;
        public static final int ICMDID_FIELD_NUMBER = 1;
        public static final int ISUBERRCODE_FIELD_NUMBER = 4;
        public static Parser<CmdResult> PARSER = null;
        public static final int STRERRDESC_FIELD_NUMBER = 3;
        private static final CmdResult defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iCmdId_;
        private int iSubErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object strErrDesc_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.CmdResult.1 */
        class C00881 extends AbstractParser<CmdResult> {
            static {
                fixHelper.fixfunc(new int[]{19565, 19566});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00881();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CmdResultOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iCmdId_;
            private int iSubErrCode_;
            private Object strErrDesc_;

            static {
                fixHelper.fixfunc(new int[]{18843, 18844, 18845, 18846, 18847, 18848, 18849, 18850, 18851, 18852, 18853, 18854, 18855, 18856, 18857, 18858, 18859, 18860, 18861, 18862, 18863, 18864, 18865, 18866, 18867, 18868, 18869, 18870, 18871, 18872, 18873, 18874, 18875, 18876, 18877, 18878, 18879, 18880, 18881, 18882, 18883, 18884, 18885, 18886, 18887, 18888, 18889, 18890, 18891, 18892});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m837build();

            public final native CmdResult m838build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m839buildPartial();

            public final native CmdResult m840buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m841clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m842clear();

            public final native Builder m843clear();

            public final native Builder clearEErrCode();

            public final native Builder clearICmdId();

            public final native Builder clearISubErrCode();

            public final native Builder clearStrErrDesc();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m844clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m845clone();

            public final native Builder m846clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m847getDefaultInstanceForType();

            public final native CmdResult m848getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getICmdId();

            public final native int getISubErrCode();

            public final native String getStrErrDesc();

            public final native ByteString getStrErrDescBytes();

            public final native boolean hasEErrCode();

            public final native boolean hasICmdId();

            public final native boolean hasISubErrCode();

            public final native boolean hasStrErrDesc();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m849mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m850mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m851mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m852mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m853mergeFrom(Message message);

            public final native Builder mergeFrom(CmdResult cmdResult);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setICmdId(int i);

            public final native Builder setISubErrCode(int i);

            public final native Builder setStrErrDesc(String str);

            public final native Builder setStrErrDescBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f3C;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7591, 7592, 7593, 7594, 7595, 7596, 7597, 7598, 7599, 7600, 7601, 7602, 7603, 7604, 7605, 7606, 7607, 7608, 7609, 7610, 7611, 7612, 7613, 7614, 7615, 7616, 7617, 7618, 7619, 7620, 7621, 7622, 7623});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CmdResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CmdResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CmdResult cmdResult);

        private native CmdResult(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CmdResult(com.google.protobuf.GeneratedMessage.Builder builder, CmdResult cmdResult);

        private native CmdResult(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m830getDefaultInstanceForType();

        public final native CmdResult m831getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getICmdId();

        public final native int getISubErrCode();

        public final native Parser<CmdResult> getParserForType();

        public final native int getSerializedSize();

        public final native String getStrErrDesc();

        public final native ByteString getStrErrDescBytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasICmdId();

        public final native boolean hasISubErrCode();

        public final native boolean hasStrErrDesc();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m832newBuilderForType();

        public final native Builder m833newBuilderForType();

        protected final native Builder m834newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m835toBuilder();

        public final native Builder m836toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CmdResult getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f3C;
        }

        static void __clinit__() {
            PARSER = new C00881();
            CmdResult cmdResult = new CmdResult(true);
            defaultInstance = cmdResult;
            cmdResult.initFields();
        }

        public static CmdResult parseFrom(ByteString byteString) {
            return (CmdResult) PARSER.parseFrom(byteString);
        }

        public static CmdResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CmdResult) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CmdResult parseFrom(byte[] bArr) {
            return (CmdResult) PARSER.parseFrom(bArr);
        }

        public static CmdResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CmdResult) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CmdResult parseFrom(InputStream inputStream) {
            return (CmdResult) PARSER.parseFrom(inputStream);
        }

        public static CmdResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CmdResult) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CmdResult parseDelimitedFrom(InputStream inputStream) {
            return (CmdResult) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CmdResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CmdResult) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CmdResult parseFrom(CodedInputStream codedInputStream) {
            return (CmdResult) PARSER.parseFrom(codedInputStream);
        }

        public static CmdResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CmdResult) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CmdResult cmdResult) {
            return newBuilder().mergeFrom(cmdResult);
        }
    }

    public enum DEVICE_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int DEVICE_TYPE_ANDROID_VALUE = 2;
        public static final int DEVICE_TYPE_IOS_VALUE = 1;
        private static final DEVICE_TYPE[] VALUES = null;
        private static EnumLiteMap<DEVICE_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.DEVICE_TYPE.1 */
        class C00891 implements EnumLiteMap<DEVICE_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{17506, 17507});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00891();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{17684, 17685, 17686, 17687});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native DEVICE_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            DEVICE_TYPE_IOS = new DEVICE_TYPE("DEVICE_TYPE_IOS", 0, 0, DEVICE_TYPE_IOS_VALUE);
            DEVICE_TYPE_ANDROID = new DEVICE_TYPE("DEVICE_TYPE_ANDROID", DEVICE_TYPE_IOS_VALUE, DEVICE_TYPE_IOS_VALUE, DEVICE_TYPE_ANDROID_VALUE);
            DEVICE_TYPE[] device_typeArr = new DEVICE_TYPE[DEVICE_TYPE_ANDROID_VALUE];
            device_typeArr[0] = DEVICE_TYPE_IOS;
            device_typeArr[DEVICE_TYPE_IOS_VALUE] = DEVICE_TYPE_ANDROID;
            ENUM$VALUES = device_typeArr;
            internalValueMap = new C00891();
            VALUES = values();
        }

        public static DEVICE_TYPE valueOf(int i) {
            switch (i) {
                case DEVICE_TYPE_IOS_VALUE:
                    return DEVICE_TYPE_IOS;
                case DEVICE_TYPE_ANDROID_VALUE:
                    return DEVICE_TYPE_ANDROID;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<DEVICE_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerCommon.m11a().getEnumTypes().get(DEVICE_TYPE_ANDROID_VALUE);
        }

        public static DEVICE_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum ERROR_CODE_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN_VALUE = 57;
        public static final int ERROR_CODE_TYPE_BLACKED_VALUE = 74;
        public static final int ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY_VALUE = 69;
        public static final int ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR_VALUE = 80;
        public static final int ERROR_CODE_TYPE_BUYIN_MAX_STACKS_VALUE = 46;
        public static final int ERROR_CODE_TYPE_BUY_LOW_VIP_VALUE = 30;
        public static final int ERROR_CODE_TYPE_CHATROOM_OVERFLOW_VALUE = 8;
        public static final int ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW_VALUE = 95;
        public static final int ERROR_CODE_TYPE_CLUB_MANAGER_FULL_VALUE = 94;
        public static final int ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT_VALUE = 48;
        public static final int ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE_VALUE = 97;
        public static final int ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE_VALUE = 49;
        public static final int ERROR_CODE_TYPE_CLUB_NO_MORE_MAX_VALUE = 50;
        public static final int ERROR_CODE_TYPE_CLUB_NO_USER_VALUE = 37;
        public static final int ERROR_CODE_TYPE_CLUB_OVERFLOW_VALUE = 34;
        public static final int ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW_VALUE = 83;
        public static final int ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY_VALUE = 38;
        public static final int ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND_VALUE = 62;
        public static final int ERROR_CODE_TYPE_FAVORITE_DATA_ERROR_VALUE = 19;
        public static final int ERROR_CODE_TYPE_FAVORITE_OVERFLOW_VALUE = 66;
        public static final int ERROR_CODE_TYPE_FRIEND_ALREADY_VALUE = 32;
        public static final int ERROR_CODE_TYPE_FRIEND_NOT_EXIST_VALUE = 6;
        public static final int ERROR_CODE_TYPE_GAMEROOM_OVERFLOW_VALUE = 9;
        public static final int ERROR_CODE_TYPE_GAME_ROOM_FULL_VALUE = 12;
        public static final int ERROR_CODE_TYPE_GET_BENFIT_ALREADY_VALUE = 47;
        public static final int ERROR_CODE_TYPE_GPS_CHECK_ERROR_VALUE = 76;
        public static final int ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY_VALUE = 78;
        public static final int ERROR_CODE_TYPE_ID_PWD_ERROR_VALUE = 5;
        public static final int ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY_VALUE = 92;
        public static final int ERROR_CODE_TYPE_INVITE_FRIEND_MUTE_VALUE = 96;
        public static final int ERROR_CODE_TYPE_IN_LEAGUE_ALREADY_VALUE = 90;
        public static final int ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW_VALUE = 84;
        public static final int ERROR_CODE_TYPE_IP_CHECK_ERROR_VALUE = 75;
        public static final int ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY_VALUE = 77;
        public static final int ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB_VALUE = 88;
        public static final int ERROR_CODE_TYPE_LEAGUE_MUTE_VALUE = 89;
        public static final int ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST_VALUE = 98;
        public static final int ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE_VALUE = 85;
        public static final int ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET_VALUE = 87;
        public static final int ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE_VALUE = 82;
        public static final int ERROR_CODE_TYPE_LEAGUE_OVERFLOW_VALUE = 81;
        public static final int ERROR_CODE_TYPE_LEAGUE_SAME_NAME_VALUE = 93;
        public static final int ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR_VALUE = 27;
        public static final int ERROR_CODE_TYPE_MINI_GAME_INVALID_CMD_VALUE = 9003;
        public static final int ERROR_CODE_TYPE_MINI_GAME_INVALID_USER_VALUE = 9001;
        public static final int ERROR_CODE_TYPE_MINI_GAME_NO_MONEY_VALUE = 9002;
        public static final int ERROR_CODE_TYPE_MINI_GAME_TIMEOUT_VALUE = 9004;
        public static final int ERROR_CODE_TYPE_MORE_REWARDED_VALUE = 16;
        public static final int ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE_VALUE = 51;
        public static final int ERROR_CODE_TYPE_NOT_ALLOW_STANDUP_VALUE = 72;
        public static final int ERROR_CODE_TYPE_NOT_ENOUGH_COIN_VALUE = 21;
        public static final int ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY_VALUE = 13;
        public static final int ERROR_CODE_TYPE_NOT_FRIEND_VALUE = 14;
        public static final int ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER_VALUE = 53;
        public static final int ERROR_CODE_TYPE_NOT_INVITED_VALUE = 7;
        public static final int ERROR_CODE_TYPE_NOT_IN_LEAGUE_VALUE = 91;
        public static final int ERROR_CODE_TYPE_NOT_OWNER_VALUE = 64;
        public static final int ERROR_CODE_TYPE_NOT_SITTED_VALUE = 79;
        public static final int ERROR_CODE_TYPE_NOT_START_VALUE = 63;
        public static final int ERROR_CODE_TYPE_NO_AUTH_BUYINACTION_VALUE = 60;
        public static final int ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER_VALUE = 25;
        public static final int ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_VALUE = 24;
        public static final int ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER_VALUE = 23;
        public static final int ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_VALUE = 22;
        public static final int ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM_VALUE = 31;
        public static final int ERROR_CODE_TYPE_NO_BEFORE_GAME_VALUE = 55;
        public static final int ERROR_CODE_TYPE_NO_BILL_VALUE = 17;
        public static final int ERROR_CODE_TYPE_NO_CHATROOM_VALUE = 2;
        public static final int ERROR_CODE_TYPE_NO_CLUB_AUTH_VALUE = 36;
        public static final int ERROR_CODE_TYPE_NO_CLUB_VALUE = 35;
        public static final int ERROR_CODE_TYPE_NO_FAVORITE_VALUE = 18;
        public static final int ERROR_CODE_TYPE_NO_GAME_ROOM_VALUE = 11;
        public static final int ERROR_CODE_TYPE_NO_HANDRESULT_VALUE = 54;
        public static final int ERROR_CODE_TYPE_NO_INVITE_BUYIN_VALUE = 59;
        public static final int ERROR_CODE_TYPE_NO_LEAGUE_VALUE = 86;
        public static final int ERROR_CODE_TYPE_NO_POKERHISTORY_VALUE = 56;
        public static final int ERROR_CODE_TYPE_NO_QUICK_GAMEROOM_VALUE = 39;
        public static final int ERROR_CODE_TYPE_NO_SELLING_ITEM_VALUE = 20;
        public static final int ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM_VALUE = 52;
        public static final int ERROR_CODE_TYPE_NO_TRANSACTIONID_VALUE = 43;
        public static final int ERROR_CODE_TYPE_NO_USER_GET_MONEY_VALUE = 41;
        public static final int ERROR_CODE_TYPE_NO_USER_INPOS_VALUE = 29;
        public static final int ERROR_CODE_TYPE_NO_USER_IN_CHATROOM_VALUE = 26;
        public static final int ERROR_CODE_TYPE_NO_USER_IN_GAME_VALUE = 58;
        public static final int ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM_VALUE = 42;
        public static final int ERROR_CODE_TYPE_NO_USER_VALUE = 1;
        public static final int ERROR_CODE_TYPE_OFFLINE_GAME_OVERED_VALUE = 33;
        public static final int ERROR_CODE_TYPE_PAUSED_VALUE = 61;
        public static final int ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START_VALUE = 40;
        public static final int ERROR_CODE_TYPE_REGISTER_USER_EXIST_VALUE = 3;
        public static final int ERROR_CODE_TYPE_SERVER_ERROR_VALUE = 10;
        public static final int ERROR_CODE_TYPE_SERVER_MAINTENANCEING_VALUE = 70;
        public static final int ERROR_CODE_TYPE_SET_INSURANCE_VALUE = 71;
        public static final int ERROR_CODE_TYPE_SHARE_ENOUGH_VALUE = 15;
        public static final int ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT_VALUE = 68;
        public static final int ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START_VALUE = 67;
        public static final int ERROR_CODE_TYPE_SUCCESS_VALUE = 0;
        public static final int ERROR_CODE_TYPE_TOKEN_EXPIRED_VALUE = 73;
        public static final int ERROR_CODE_TYPE_TRANSACTIONID_ERROR_VALUE = 45;
        public static final int ERROR_CODE_TYPE_TRANSACTIONID_REPEAT_VALUE = 44;
        public static final int ERROR_CODE_TYPE_UNKNOWN_VALUE = 28;
        public static final int ERROR_CODE_TYPE_USER_ALREADY_IN_VALUE = 65;
        public static final int ERROR_CODE_TYPE_VERIFY_CODE_ERROR_VALUE = 4;
        private static final ERROR_CODE_TYPE[] VALUES = null;
        private static EnumLiteMap<ERROR_CODE_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE.1 */
        class C00901 implements EnumLiteMap<ERROR_CODE_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{6509, 6510});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00901();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{32866, 32867, 32868, 32869});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native ERROR_CODE_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            ERROR_CODE_TYPE_SUCCESS = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_SUCCESS", ERROR_CODE_TYPE_SUCCESS_VALUE, ERROR_CODE_TYPE_SUCCESS_VALUE, ERROR_CODE_TYPE_SUCCESS_VALUE);
            ERROR_CODE_TYPE_NO_USER = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_USER", ERROR_CODE_TYPE_NO_USER_VALUE, ERROR_CODE_TYPE_NO_USER_VALUE, ERROR_CODE_TYPE_NO_USER_VALUE);
            ERROR_CODE_TYPE_NO_CHATROOM = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_CHATROOM", ERROR_CODE_TYPE_NO_CHATROOM_VALUE, ERROR_CODE_TYPE_NO_CHATROOM_VALUE, ERROR_CODE_TYPE_NO_CHATROOM_VALUE);
            ERROR_CODE_TYPE_REGISTER_USER_EXIST = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_REGISTER_USER_EXIST", ERROR_CODE_TYPE_REGISTER_USER_EXIST_VALUE, ERROR_CODE_TYPE_REGISTER_USER_EXIST_VALUE, ERROR_CODE_TYPE_REGISTER_USER_EXIST_VALUE);
            ERROR_CODE_TYPE_VERIFY_CODE_ERROR = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_VERIFY_CODE_ERROR", ERROR_CODE_TYPE_VERIFY_CODE_ERROR_VALUE, ERROR_CODE_TYPE_VERIFY_CODE_ERROR_VALUE, ERROR_CODE_TYPE_VERIFY_CODE_ERROR_VALUE);
            ERROR_CODE_TYPE_ID_PWD_ERROR = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_ID_PWD_ERROR", ERROR_CODE_TYPE_ID_PWD_ERROR_VALUE, ERROR_CODE_TYPE_ID_PWD_ERROR_VALUE, ERROR_CODE_TYPE_ID_PWD_ERROR_VALUE);
            ERROR_CODE_TYPE_FRIEND_NOT_EXIST = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_FRIEND_NOT_EXIST", ERROR_CODE_TYPE_FRIEND_NOT_EXIST_VALUE, ERROR_CODE_TYPE_FRIEND_NOT_EXIST_VALUE, ERROR_CODE_TYPE_FRIEND_NOT_EXIST_VALUE);
            ERROR_CODE_TYPE_NOT_INVITED = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NOT_INVITED", ERROR_CODE_TYPE_NOT_INVITED_VALUE, ERROR_CODE_TYPE_NOT_INVITED_VALUE, ERROR_CODE_TYPE_NOT_INVITED_VALUE);
            ERROR_CODE_TYPE_CHATROOM_OVERFLOW = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CHATROOM_OVERFLOW", ERROR_CODE_TYPE_CHATROOM_OVERFLOW_VALUE, ERROR_CODE_TYPE_CHATROOM_OVERFLOW_VALUE, ERROR_CODE_TYPE_CHATROOM_OVERFLOW_VALUE);
            ERROR_CODE_TYPE_GAMEROOM_OVERFLOW = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_GAMEROOM_OVERFLOW", ERROR_CODE_TYPE_GAMEROOM_OVERFLOW_VALUE, ERROR_CODE_TYPE_GAMEROOM_OVERFLOW_VALUE, ERROR_CODE_TYPE_GAMEROOM_OVERFLOW_VALUE);
            ERROR_CODE_TYPE_SERVER_ERROR = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_SERVER_ERROR", ERROR_CODE_TYPE_SERVER_ERROR_VALUE, ERROR_CODE_TYPE_SERVER_ERROR_VALUE, ERROR_CODE_TYPE_SERVER_ERROR_VALUE);
            ERROR_CODE_TYPE_NO_GAME_ROOM = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_GAME_ROOM", ERROR_CODE_TYPE_NO_GAME_ROOM_VALUE, ERROR_CODE_TYPE_NO_GAME_ROOM_VALUE, ERROR_CODE_TYPE_NO_GAME_ROOM_VALUE);
            ERROR_CODE_TYPE_GAME_ROOM_FULL = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_GAME_ROOM_FULL", ERROR_CODE_TYPE_GAME_ROOM_FULL_VALUE, ERROR_CODE_TYPE_GAME_ROOM_FULL_VALUE, ERROR_CODE_TYPE_GAME_ROOM_FULL_VALUE);
            ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY", ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY_VALUE, ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY_VALUE, ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY_VALUE);
            ERROR_CODE_TYPE_NOT_FRIEND = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NOT_FRIEND", ERROR_CODE_TYPE_NOT_FRIEND_VALUE, ERROR_CODE_TYPE_NOT_FRIEND_VALUE, ERROR_CODE_TYPE_NOT_FRIEND_VALUE);
            ERROR_CODE_TYPE_SHARE_ENOUGH = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_SHARE_ENOUGH", ERROR_CODE_TYPE_SHARE_ENOUGH_VALUE, ERROR_CODE_TYPE_SHARE_ENOUGH_VALUE, ERROR_CODE_TYPE_SHARE_ENOUGH_VALUE);
            ERROR_CODE_TYPE_MORE_REWARDED = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_MORE_REWARDED", ERROR_CODE_TYPE_MORE_REWARDED_VALUE, ERROR_CODE_TYPE_MORE_REWARDED_VALUE, ERROR_CODE_TYPE_MORE_REWARDED_VALUE);
            ERROR_CODE_TYPE_NO_BILL = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_BILL", ERROR_CODE_TYPE_NO_BILL_VALUE, ERROR_CODE_TYPE_NO_BILL_VALUE, ERROR_CODE_TYPE_NO_BILL_VALUE);
            ERROR_CODE_TYPE_NO_FAVORITE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_FAVORITE", ERROR_CODE_TYPE_NO_FAVORITE_VALUE, ERROR_CODE_TYPE_NO_FAVORITE_VALUE, ERROR_CODE_TYPE_NO_FAVORITE_VALUE);
            ERROR_CODE_TYPE_FAVORITE_DATA_ERROR = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_FAVORITE_DATA_ERROR", ERROR_CODE_TYPE_FAVORITE_DATA_ERROR_VALUE, ERROR_CODE_TYPE_FAVORITE_DATA_ERROR_VALUE, ERROR_CODE_TYPE_FAVORITE_DATA_ERROR_VALUE);
            ERROR_CODE_TYPE_NO_SELLING_ITEM = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_SELLING_ITEM", ERROR_CODE_TYPE_NO_SELLING_ITEM_VALUE, ERROR_CODE_TYPE_NO_SELLING_ITEM_VALUE, ERROR_CODE_TYPE_NO_SELLING_ITEM_VALUE);
            ERROR_CODE_TYPE_NOT_ENOUGH_COIN = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NOT_ENOUGH_COIN", ERROR_CODE_TYPE_NOT_ENOUGH_COIN_VALUE, ERROR_CODE_TYPE_NOT_ENOUGH_COIN_VALUE, ERROR_CODE_TYPE_NOT_ENOUGH_COIN_VALUE);
            ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM", ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_VALUE, ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_VALUE, ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_VALUE);
            ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER", ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER_VALUE, ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER_VALUE, ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER_VALUE);
            ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM", ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_VALUE, ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_VALUE, ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_VALUE);
            ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER", ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER_VALUE, ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER_VALUE, ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER_VALUE);
            ERROR_CODE_TYPE_NO_USER_IN_CHATROOM = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_USER_IN_CHATROOM", ERROR_CODE_TYPE_NO_USER_IN_CHATROOM_VALUE, ERROR_CODE_TYPE_NO_USER_IN_CHATROOM_VALUE, ERROR_CODE_TYPE_NO_USER_IN_CHATROOM_VALUE);
            ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR", ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR_VALUE, ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR_VALUE, ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR_VALUE);
            ERROR_CODE_TYPE_UNKNOWN = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_UNKNOWN", ERROR_CODE_TYPE_UNKNOWN_VALUE, ERROR_CODE_TYPE_UNKNOWN_VALUE, ERROR_CODE_TYPE_UNKNOWN_VALUE);
            ERROR_CODE_TYPE_NO_USER_INPOS = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_USER_INPOS", ERROR_CODE_TYPE_NO_USER_INPOS_VALUE, ERROR_CODE_TYPE_NO_USER_INPOS_VALUE, ERROR_CODE_TYPE_NO_USER_INPOS_VALUE);
            ERROR_CODE_TYPE_BUY_LOW_VIP = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_BUY_LOW_VIP", ERROR_CODE_TYPE_BUY_LOW_VIP_VALUE, ERROR_CODE_TYPE_BUY_LOW_VIP_VALUE, ERROR_CODE_TYPE_BUY_LOW_VIP_VALUE);
            ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM", ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM_VALUE, ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM_VALUE, ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM_VALUE);
            ERROR_CODE_TYPE_FRIEND_ALREADY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_FRIEND_ALREADY", ERROR_CODE_TYPE_FRIEND_ALREADY_VALUE, ERROR_CODE_TYPE_FRIEND_ALREADY_VALUE, ERROR_CODE_TYPE_FRIEND_ALREADY_VALUE);
            ERROR_CODE_TYPE_OFFLINE_GAME_OVERED = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_OFFLINE_GAME_OVERED", ERROR_CODE_TYPE_OFFLINE_GAME_OVERED_VALUE, ERROR_CODE_TYPE_OFFLINE_GAME_OVERED_VALUE, ERROR_CODE_TYPE_OFFLINE_GAME_OVERED_VALUE);
            ERROR_CODE_TYPE_CLUB_OVERFLOW = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CLUB_OVERFLOW", ERROR_CODE_TYPE_CLUB_OVERFLOW_VALUE, ERROR_CODE_TYPE_CLUB_OVERFLOW_VALUE, ERROR_CODE_TYPE_CLUB_OVERFLOW_VALUE);
            ERROR_CODE_TYPE_NO_CLUB = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_CLUB", ERROR_CODE_TYPE_NO_CLUB_VALUE, ERROR_CODE_TYPE_NO_CLUB_VALUE, ERROR_CODE_TYPE_NO_CLUB_VALUE);
            ERROR_CODE_TYPE_NO_CLUB_AUTH = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_CLUB_AUTH", ERROR_CODE_TYPE_NO_CLUB_AUTH_VALUE, ERROR_CODE_TYPE_NO_CLUB_AUTH_VALUE, ERROR_CODE_TYPE_NO_CLUB_AUTH_VALUE);
            ERROR_CODE_TYPE_CLUB_NO_USER = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CLUB_NO_USER", ERROR_CODE_TYPE_CLUB_NO_USER_VALUE, ERROR_CODE_TYPE_CLUB_NO_USER_VALUE, ERROR_CODE_TYPE_CLUB_NO_USER_VALUE);
            ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY", ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY_VALUE, ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY_VALUE, ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY_VALUE);
            ERROR_CODE_TYPE_NO_QUICK_GAMEROOM = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_QUICK_GAMEROOM", ERROR_CODE_TYPE_NO_QUICK_GAMEROOM_VALUE, ERROR_CODE_TYPE_NO_QUICK_GAMEROOM_VALUE, ERROR_CODE_TYPE_NO_QUICK_GAMEROOM_VALUE);
            ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START", ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START_VALUE, ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START_VALUE, ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START_VALUE);
            ERROR_CODE_TYPE_NO_USER_GET_MONEY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_USER_GET_MONEY", ERROR_CODE_TYPE_NO_USER_GET_MONEY_VALUE, ERROR_CODE_TYPE_NO_USER_GET_MONEY_VALUE, ERROR_CODE_TYPE_NO_USER_GET_MONEY_VALUE);
            ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM", ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM_VALUE, ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM_VALUE, ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM_VALUE);
            ERROR_CODE_TYPE_NO_TRANSACTIONID = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_TRANSACTIONID", ERROR_CODE_TYPE_NO_TRANSACTIONID_VALUE, ERROR_CODE_TYPE_NO_TRANSACTIONID_VALUE, ERROR_CODE_TYPE_NO_TRANSACTIONID_VALUE);
            ERROR_CODE_TYPE_TRANSACTIONID_REPEAT = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_TRANSACTIONID_REPEAT", ERROR_CODE_TYPE_TRANSACTIONID_REPEAT_VALUE, ERROR_CODE_TYPE_TRANSACTIONID_REPEAT_VALUE, ERROR_CODE_TYPE_TRANSACTIONID_REPEAT_VALUE);
            ERROR_CODE_TYPE_TRANSACTIONID_ERROR = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_TRANSACTIONID_ERROR", ERROR_CODE_TYPE_TRANSACTIONID_ERROR_VALUE, ERROR_CODE_TYPE_TRANSACTIONID_ERROR_VALUE, ERROR_CODE_TYPE_TRANSACTIONID_ERROR_VALUE);
            ERROR_CODE_TYPE_BUYIN_MAX_STACKS = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_BUYIN_MAX_STACKS", ERROR_CODE_TYPE_BUYIN_MAX_STACKS_VALUE, ERROR_CODE_TYPE_BUYIN_MAX_STACKS_VALUE, ERROR_CODE_TYPE_BUYIN_MAX_STACKS_VALUE);
            ERROR_CODE_TYPE_GET_BENFIT_ALREADY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_GET_BENFIT_ALREADY", ERROR_CODE_TYPE_GET_BENFIT_ALREADY_VALUE, ERROR_CODE_TYPE_GET_BENFIT_ALREADY_VALUE, ERROR_CODE_TYPE_GET_BENFIT_ALREADY_VALUE);
            ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT", ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT_VALUE, ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT_VALUE, ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT_VALUE);
            ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE", ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE_VALUE, ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE_VALUE, ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE_VALUE);
            ERROR_CODE_TYPE_CLUB_NO_MORE_MAX = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CLUB_NO_MORE_MAX", ERROR_CODE_TYPE_CLUB_NO_MORE_MAX_VALUE, ERROR_CODE_TYPE_CLUB_NO_MORE_MAX_VALUE, ERROR_CODE_TYPE_CLUB_NO_MORE_MAX_VALUE);
            ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE", ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE_VALUE, ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE_VALUE, ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE_VALUE);
            ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM", ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM_VALUE, ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM_VALUE, ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM_VALUE);
            ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER", ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER_VALUE, ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER_VALUE, ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER_VALUE);
            ERROR_CODE_TYPE_NO_HANDRESULT = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_HANDRESULT", ERROR_CODE_TYPE_NO_HANDRESULT_VALUE, ERROR_CODE_TYPE_NO_HANDRESULT_VALUE, ERROR_CODE_TYPE_NO_HANDRESULT_VALUE);
            ERROR_CODE_TYPE_NO_BEFORE_GAME = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_BEFORE_GAME", ERROR_CODE_TYPE_NO_BEFORE_GAME_VALUE, ERROR_CODE_TYPE_NO_BEFORE_GAME_VALUE, ERROR_CODE_TYPE_NO_BEFORE_GAME_VALUE);
            ERROR_CODE_TYPE_NO_POKERHISTORY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_POKERHISTORY", ERROR_CODE_TYPE_NO_POKERHISTORY_VALUE, ERROR_CODE_TYPE_NO_POKERHISTORY_VALUE, ERROR_CODE_TYPE_NO_POKERHISTORY_VALUE);
            ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN", ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN_VALUE, ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN_VALUE, ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN_VALUE);
            ERROR_CODE_TYPE_NO_USER_IN_GAME = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_USER_IN_GAME", ERROR_CODE_TYPE_NO_USER_IN_GAME_VALUE, ERROR_CODE_TYPE_NO_USER_IN_GAME_VALUE, ERROR_CODE_TYPE_NO_USER_IN_GAME_VALUE);
            ERROR_CODE_TYPE_NO_INVITE_BUYIN = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_INVITE_BUYIN", ERROR_CODE_TYPE_NO_INVITE_BUYIN_VALUE, ERROR_CODE_TYPE_NO_INVITE_BUYIN_VALUE, ERROR_CODE_TYPE_NO_INVITE_BUYIN_VALUE);
            ERROR_CODE_TYPE_NO_AUTH_BUYINACTION = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_AUTH_BUYINACTION", ERROR_CODE_TYPE_NO_AUTH_BUYINACTION_VALUE, ERROR_CODE_TYPE_NO_AUTH_BUYINACTION_VALUE, ERROR_CODE_TYPE_NO_AUTH_BUYINACTION_VALUE);
            ERROR_CODE_TYPE_PAUSED = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_PAUSED", ERROR_CODE_TYPE_PAUSED_VALUE, ERROR_CODE_TYPE_PAUSED_VALUE, ERROR_CODE_TYPE_PAUSED_VALUE);
            ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND", ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND_VALUE, ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND_VALUE, ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND_VALUE);
            ERROR_CODE_TYPE_NOT_START = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NOT_START", ERROR_CODE_TYPE_NOT_START_VALUE, ERROR_CODE_TYPE_NOT_START_VALUE, ERROR_CODE_TYPE_NOT_START_VALUE);
            ERROR_CODE_TYPE_NOT_OWNER = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NOT_OWNER", ERROR_CODE_TYPE_NOT_OWNER_VALUE, ERROR_CODE_TYPE_NOT_OWNER_VALUE, ERROR_CODE_TYPE_NOT_OWNER_VALUE);
            ERROR_CODE_TYPE_USER_ALREADY_IN = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_USER_ALREADY_IN", ERROR_CODE_TYPE_USER_ALREADY_IN_VALUE, ERROR_CODE_TYPE_USER_ALREADY_IN_VALUE, ERROR_CODE_TYPE_USER_ALREADY_IN_VALUE);
            ERROR_CODE_TYPE_FAVORITE_OVERFLOW = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_FAVORITE_OVERFLOW", ERROR_CODE_TYPE_FAVORITE_OVERFLOW_VALUE, ERROR_CODE_TYPE_FAVORITE_OVERFLOW_VALUE, ERROR_CODE_TYPE_FAVORITE_OVERFLOW_VALUE);
            ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START", ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START_VALUE, ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START_VALUE, ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START_VALUE);
            ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT", ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT_VALUE, ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT_VALUE, ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT_VALUE);
            ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY", ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY_VALUE, ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY_VALUE, ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY_VALUE);
            ERROR_CODE_TYPE_SERVER_MAINTENANCEING = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_SERVER_MAINTENANCEING", ERROR_CODE_TYPE_SERVER_MAINTENANCEING_VALUE, ERROR_CODE_TYPE_SERVER_MAINTENANCEING_VALUE, ERROR_CODE_TYPE_SERVER_MAINTENANCEING_VALUE);
            ERROR_CODE_TYPE_SET_INSURANCE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_SET_INSURANCE", ERROR_CODE_TYPE_SET_INSURANCE_VALUE, ERROR_CODE_TYPE_SET_INSURANCE_VALUE, ERROR_CODE_TYPE_SET_INSURANCE_VALUE);
            ERROR_CODE_TYPE_NOT_ALLOW_STANDUP = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NOT_ALLOW_STANDUP", ERROR_CODE_TYPE_NOT_ALLOW_STANDUP_VALUE, ERROR_CODE_TYPE_NOT_ALLOW_STANDUP_VALUE, ERROR_CODE_TYPE_NOT_ALLOW_STANDUP_VALUE);
            ERROR_CODE_TYPE_TOKEN_EXPIRED = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_TOKEN_EXPIRED", ERROR_CODE_TYPE_TOKEN_EXPIRED_VALUE, ERROR_CODE_TYPE_TOKEN_EXPIRED_VALUE, ERROR_CODE_TYPE_TOKEN_EXPIRED_VALUE);
            ERROR_CODE_TYPE_BLACKED = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_BLACKED", ERROR_CODE_TYPE_BLACKED_VALUE, ERROR_CODE_TYPE_BLACKED_VALUE, ERROR_CODE_TYPE_BLACKED_VALUE);
            ERROR_CODE_TYPE_IP_CHECK_ERROR = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_IP_CHECK_ERROR", ERROR_CODE_TYPE_IP_CHECK_ERROR_VALUE, ERROR_CODE_TYPE_IP_CHECK_ERROR_VALUE, ERROR_CODE_TYPE_IP_CHECK_ERROR_VALUE);
            ERROR_CODE_TYPE_GPS_CHECK_ERROR = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_GPS_CHECK_ERROR", ERROR_CODE_TYPE_GPS_CHECK_ERROR_VALUE, ERROR_CODE_TYPE_GPS_CHECK_ERROR_VALUE, ERROR_CODE_TYPE_GPS_CHECK_ERROR_VALUE);
            ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY", ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY_VALUE, ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY_VALUE, ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY_VALUE);
            ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY", ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY_VALUE, ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY_VALUE, ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY_VALUE);
            ERROR_CODE_TYPE_NOT_SITTED = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NOT_SITTED", ERROR_CODE_TYPE_NOT_SITTED_VALUE, ERROR_CODE_TYPE_NOT_SITTED_VALUE, ERROR_CODE_TYPE_NOT_SITTED_VALUE);
            ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR", ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR_VALUE, ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR_VALUE, ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR_VALUE);
            ERROR_CODE_TYPE_LEAGUE_OVERFLOW = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_LEAGUE_OVERFLOW", ERROR_CODE_TYPE_LEAGUE_OVERFLOW_VALUE, ERROR_CODE_TYPE_LEAGUE_OVERFLOW_VALUE, ERROR_CODE_TYPE_LEAGUE_OVERFLOW_VALUE);
            ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE", ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE_VALUE, ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE_VALUE, ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE_VALUE);
            ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW", ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW_VALUE, ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW_VALUE, ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW_VALUE);
            ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW", ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW_VALUE, ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW_VALUE, ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW_VALUE);
            ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE", ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE_VALUE, ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE_VALUE, ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE_VALUE);
            ERROR_CODE_TYPE_NO_LEAGUE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NO_LEAGUE", ERROR_CODE_TYPE_NO_LEAGUE_VALUE, ERROR_CODE_TYPE_NO_LEAGUE_VALUE, ERROR_CODE_TYPE_NO_LEAGUE_VALUE);
            ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET", ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET_VALUE, ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET_VALUE, ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET_VALUE);
            ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB", ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB_VALUE, ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB_VALUE, ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB_VALUE);
            ERROR_CODE_TYPE_LEAGUE_MUTE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_LEAGUE_MUTE", ERROR_CODE_TYPE_LEAGUE_MUTE_VALUE, ERROR_CODE_TYPE_LEAGUE_MUTE_VALUE, ERROR_CODE_TYPE_LEAGUE_MUTE_VALUE);
            ERROR_CODE_TYPE_IN_LEAGUE_ALREADY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_IN_LEAGUE_ALREADY", ERROR_CODE_TYPE_IN_LEAGUE_ALREADY_VALUE, ERROR_CODE_TYPE_IN_LEAGUE_ALREADY_VALUE, ERROR_CODE_TYPE_IN_LEAGUE_ALREADY_VALUE);
            ERROR_CODE_TYPE_NOT_IN_LEAGUE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_NOT_IN_LEAGUE", ERROR_CODE_TYPE_NOT_IN_LEAGUE_VALUE, ERROR_CODE_TYPE_NOT_IN_LEAGUE_VALUE, ERROR_CODE_TYPE_NOT_IN_LEAGUE_VALUE);
            ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY", ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY_VALUE, ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY_VALUE, ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY_VALUE);
            ERROR_CODE_TYPE_LEAGUE_SAME_NAME = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_LEAGUE_SAME_NAME", ERROR_CODE_TYPE_LEAGUE_SAME_NAME_VALUE, ERROR_CODE_TYPE_LEAGUE_SAME_NAME_VALUE, ERROR_CODE_TYPE_LEAGUE_SAME_NAME_VALUE);
            ERROR_CODE_TYPE_CLUB_MANAGER_FULL = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CLUB_MANAGER_FULL", ERROR_CODE_TYPE_CLUB_MANAGER_FULL_VALUE, ERROR_CODE_TYPE_CLUB_MANAGER_FULL_VALUE, ERROR_CODE_TYPE_CLUB_MANAGER_FULL_VALUE);
            ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW", ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW_VALUE, ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW_VALUE, ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW_VALUE);
            ERROR_CODE_TYPE_INVITE_FRIEND_MUTE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_INVITE_FRIEND_MUTE", ERROR_CODE_TYPE_INVITE_FRIEND_MUTE_VALUE, ERROR_CODE_TYPE_INVITE_FRIEND_MUTE_VALUE, ERROR_CODE_TYPE_INVITE_FRIEND_MUTE_VALUE);
            ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE", ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE_VALUE, ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE_VALUE, ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE_VALUE);
            ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST", ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST_VALUE, ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST_VALUE, ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST_VALUE);
            ERROR_CODE_TYPE_MINI_GAME_INVALID_USER = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_MINI_GAME_INVALID_USER", 99, 99, ERROR_CODE_TYPE_MINI_GAME_INVALID_USER_VALUE);
            ERROR_CODE_TYPE_MINI_GAME_NO_MONEY = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_MINI_GAME_NO_MONEY", 100, 100, ERROR_CODE_TYPE_MINI_GAME_NO_MONEY_VALUE);
            ERROR_CODE_TYPE_MINI_GAME_INVALID_CMD = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_MINI_GAME_INVALID_CMD", TEXAS_CMD.Cmd_CSSetClubFund_VALUE, TEXAS_CMD.Cmd_CSSetClubFund_VALUE, ERROR_CODE_TYPE_MINI_GAME_INVALID_CMD_VALUE);
            ERROR_CODE_TYPE_MINI_GAME_TIMEOUT = new ERROR_CODE_TYPE("ERROR_CODE_TYPE_MINI_GAME_TIMEOUT", TEXAS_CMD.Cmd_CSGetClubByClubID_VALUE, TEXAS_CMD.Cmd_CSGetClubByClubID_VALUE, ERROR_CODE_TYPE_MINI_GAME_TIMEOUT_VALUE);
            ERROR_CODE_TYPE[] error_code_typeArr = new ERROR_CODE_TYPE[TEXAS_CMD.Cmd_CSGetFundBillInfos_VALUE];
            error_code_typeArr[ERROR_CODE_TYPE_SUCCESS_VALUE] = ERROR_CODE_TYPE_SUCCESS;
            error_code_typeArr[ERROR_CODE_TYPE_NO_USER_VALUE] = ERROR_CODE_TYPE_NO_USER;
            error_code_typeArr[ERROR_CODE_TYPE_NO_CHATROOM_VALUE] = ERROR_CODE_TYPE_NO_CHATROOM;
            error_code_typeArr[ERROR_CODE_TYPE_REGISTER_USER_EXIST_VALUE] = ERROR_CODE_TYPE_REGISTER_USER_EXIST;
            error_code_typeArr[ERROR_CODE_TYPE_VERIFY_CODE_ERROR_VALUE] = ERROR_CODE_TYPE_VERIFY_CODE_ERROR;
            error_code_typeArr[ERROR_CODE_TYPE_ID_PWD_ERROR_VALUE] = ERROR_CODE_TYPE_ID_PWD_ERROR;
            error_code_typeArr[ERROR_CODE_TYPE_FRIEND_NOT_EXIST_VALUE] = ERROR_CODE_TYPE_FRIEND_NOT_EXIST;
            error_code_typeArr[ERROR_CODE_TYPE_NOT_INVITED_VALUE] = ERROR_CODE_TYPE_NOT_INVITED;
            error_code_typeArr[ERROR_CODE_TYPE_CHATROOM_OVERFLOW_VALUE] = ERROR_CODE_TYPE_CHATROOM_OVERFLOW;
            error_code_typeArr[ERROR_CODE_TYPE_GAMEROOM_OVERFLOW_VALUE] = ERROR_CODE_TYPE_GAMEROOM_OVERFLOW;
            error_code_typeArr[ERROR_CODE_TYPE_SERVER_ERROR_VALUE] = ERROR_CODE_TYPE_SERVER_ERROR;
            error_code_typeArr[ERROR_CODE_TYPE_NO_GAME_ROOM_VALUE] = ERROR_CODE_TYPE_NO_GAME_ROOM;
            error_code_typeArr[ERROR_CODE_TYPE_GAME_ROOM_FULL_VALUE] = ERROR_CODE_TYPE_GAME_ROOM_FULL;
            error_code_typeArr[ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY_VALUE] = ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY;
            error_code_typeArr[ERROR_CODE_TYPE_NOT_FRIEND_VALUE] = ERROR_CODE_TYPE_NOT_FRIEND;
            error_code_typeArr[ERROR_CODE_TYPE_SHARE_ENOUGH_VALUE] = ERROR_CODE_TYPE_SHARE_ENOUGH;
            error_code_typeArr[ERROR_CODE_TYPE_MORE_REWARDED_VALUE] = ERROR_CODE_TYPE_MORE_REWARDED;
            error_code_typeArr[ERROR_CODE_TYPE_NO_BILL_VALUE] = ERROR_CODE_TYPE_NO_BILL;
            error_code_typeArr[ERROR_CODE_TYPE_NO_FAVORITE_VALUE] = ERROR_CODE_TYPE_NO_FAVORITE;
            error_code_typeArr[ERROR_CODE_TYPE_FAVORITE_DATA_ERROR_VALUE] = ERROR_CODE_TYPE_FAVORITE_DATA_ERROR;
            error_code_typeArr[ERROR_CODE_TYPE_NO_SELLING_ITEM_VALUE] = ERROR_CODE_TYPE_NO_SELLING_ITEM;
            error_code_typeArr[ERROR_CODE_TYPE_NOT_ENOUGH_COIN_VALUE] = ERROR_CODE_TYPE_NOT_ENOUGH_COIN;
            error_code_typeArr[ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_VALUE] = ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM;
            error_code_typeArr[ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER_VALUE] = ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER;
            error_code_typeArr[ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_VALUE] = ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM;
            error_code_typeArr[ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER_VALUE] = ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER;
            error_code_typeArr[ERROR_CODE_TYPE_NO_USER_IN_CHATROOM_VALUE] = ERROR_CODE_TYPE_NO_USER_IN_CHATROOM;
            error_code_typeArr[ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR_VALUE] = ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR;
            error_code_typeArr[ERROR_CODE_TYPE_UNKNOWN_VALUE] = ERROR_CODE_TYPE_UNKNOWN;
            error_code_typeArr[ERROR_CODE_TYPE_NO_USER_INPOS_VALUE] = ERROR_CODE_TYPE_NO_USER_INPOS;
            error_code_typeArr[ERROR_CODE_TYPE_BUY_LOW_VIP_VALUE] = ERROR_CODE_TYPE_BUY_LOW_VIP;
            error_code_typeArr[ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM_VALUE] = ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM;
            error_code_typeArr[ERROR_CODE_TYPE_FRIEND_ALREADY_VALUE] = ERROR_CODE_TYPE_FRIEND_ALREADY;
            error_code_typeArr[ERROR_CODE_TYPE_OFFLINE_GAME_OVERED_VALUE] = ERROR_CODE_TYPE_OFFLINE_GAME_OVERED;
            error_code_typeArr[ERROR_CODE_TYPE_CLUB_OVERFLOW_VALUE] = ERROR_CODE_TYPE_CLUB_OVERFLOW;
            error_code_typeArr[ERROR_CODE_TYPE_NO_CLUB_VALUE] = ERROR_CODE_TYPE_NO_CLUB;
            error_code_typeArr[ERROR_CODE_TYPE_NO_CLUB_AUTH_VALUE] = ERROR_CODE_TYPE_NO_CLUB_AUTH;
            error_code_typeArr[ERROR_CODE_TYPE_CLUB_NO_USER_VALUE] = ERROR_CODE_TYPE_CLUB_NO_USER;
            error_code_typeArr[ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY_VALUE] = ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY;
            error_code_typeArr[ERROR_CODE_TYPE_NO_QUICK_GAMEROOM_VALUE] = ERROR_CODE_TYPE_NO_QUICK_GAMEROOM;
            error_code_typeArr[ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START_VALUE] = ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START;
            error_code_typeArr[ERROR_CODE_TYPE_NO_USER_GET_MONEY_VALUE] = ERROR_CODE_TYPE_NO_USER_GET_MONEY;
            error_code_typeArr[ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM_VALUE] = ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM;
            error_code_typeArr[ERROR_CODE_TYPE_NO_TRANSACTIONID_VALUE] = ERROR_CODE_TYPE_NO_TRANSACTIONID;
            error_code_typeArr[ERROR_CODE_TYPE_TRANSACTIONID_REPEAT_VALUE] = ERROR_CODE_TYPE_TRANSACTIONID_REPEAT;
            error_code_typeArr[ERROR_CODE_TYPE_TRANSACTIONID_ERROR_VALUE] = ERROR_CODE_TYPE_TRANSACTIONID_ERROR;
            error_code_typeArr[ERROR_CODE_TYPE_BUYIN_MAX_STACKS_VALUE] = ERROR_CODE_TYPE_BUYIN_MAX_STACKS;
            error_code_typeArr[ERROR_CODE_TYPE_GET_BENFIT_ALREADY_VALUE] = ERROR_CODE_TYPE_GET_BENFIT_ALREADY;
            error_code_typeArr[ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT_VALUE] = ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT;
            error_code_typeArr[ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE_VALUE] = ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE;
            error_code_typeArr[ERROR_CODE_TYPE_CLUB_NO_MORE_MAX_VALUE] = ERROR_CODE_TYPE_CLUB_NO_MORE_MAX;
            error_code_typeArr[ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE_VALUE] = ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE;
            error_code_typeArr[ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM_VALUE] = ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM;
            error_code_typeArr[ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER_VALUE] = ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER;
            error_code_typeArr[ERROR_CODE_TYPE_NO_HANDRESULT_VALUE] = ERROR_CODE_TYPE_NO_HANDRESULT;
            error_code_typeArr[ERROR_CODE_TYPE_NO_BEFORE_GAME_VALUE] = ERROR_CODE_TYPE_NO_BEFORE_GAME;
            error_code_typeArr[ERROR_CODE_TYPE_NO_POKERHISTORY_VALUE] = ERROR_CODE_TYPE_NO_POKERHISTORY;
            error_code_typeArr[ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN_VALUE] = ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN;
            error_code_typeArr[ERROR_CODE_TYPE_NO_USER_IN_GAME_VALUE] = ERROR_CODE_TYPE_NO_USER_IN_GAME;
            error_code_typeArr[ERROR_CODE_TYPE_NO_INVITE_BUYIN_VALUE] = ERROR_CODE_TYPE_NO_INVITE_BUYIN;
            error_code_typeArr[ERROR_CODE_TYPE_NO_AUTH_BUYINACTION_VALUE] = ERROR_CODE_TYPE_NO_AUTH_BUYINACTION;
            error_code_typeArr[ERROR_CODE_TYPE_PAUSED_VALUE] = ERROR_CODE_TYPE_PAUSED;
            error_code_typeArr[ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND_VALUE] = ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND;
            error_code_typeArr[ERROR_CODE_TYPE_NOT_START_VALUE] = ERROR_CODE_TYPE_NOT_START;
            error_code_typeArr[ERROR_CODE_TYPE_NOT_OWNER_VALUE] = ERROR_CODE_TYPE_NOT_OWNER;
            error_code_typeArr[ERROR_CODE_TYPE_USER_ALREADY_IN_VALUE] = ERROR_CODE_TYPE_USER_ALREADY_IN;
            error_code_typeArr[ERROR_CODE_TYPE_FAVORITE_OVERFLOW_VALUE] = ERROR_CODE_TYPE_FAVORITE_OVERFLOW;
            error_code_typeArr[ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START_VALUE] = ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START;
            error_code_typeArr[ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT_VALUE] = ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT;
            error_code_typeArr[ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY_VALUE] = ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY;
            error_code_typeArr[ERROR_CODE_TYPE_SERVER_MAINTENANCEING_VALUE] = ERROR_CODE_TYPE_SERVER_MAINTENANCEING;
            error_code_typeArr[ERROR_CODE_TYPE_SET_INSURANCE_VALUE] = ERROR_CODE_TYPE_SET_INSURANCE;
            error_code_typeArr[ERROR_CODE_TYPE_NOT_ALLOW_STANDUP_VALUE] = ERROR_CODE_TYPE_NOT_ALLOW_STANDUP;
            error_code_typeArr[ERROR_CODE_TYPE_TOKEN_EXPIRED_VALUE] = ERROR_CODE_TYPE_TOKEN_EXPIRED;
            error_code_typeArr[ERROR_CODE_TYPE_BLACKED_VALUE] = ERROR_CODE_TYPE_BLACKED;
            error_code_typeArr[ERROR_CODE_TYPE_IP_CHECK_ERROR_VALUE] = ERROR_CODE_TYPE_IP_CHECK_ERROR;
            error_code_typeArr[ERROR_CODE_TYPE_GPS_CHECK_ERROR_VALUE] = ERROR_CODE_TYPE_GPS_CHECK_ERROR;
            error_code_typeArr[ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY_VALUE] = ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY;
            error_code_typeArr[ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY_VALUE] = ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY;
            error_code_typeArr[ERROR_CODE_TYPE_NOT_SITTED_VALUE] = ERROR_CODE_TYPE_NOT_SITTED;
            error_code_typeArr[ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR_VALUE] = ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR;
            error_code_typeArr[ERROR_CODE_TYPE_LEAGUE_OVERFLOW_VALUE] = ERROR_CODE_TYPE_LEAGUE_OVERFLOW;
            error_code_typeArr[ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE_VALUE] = ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE;
            error_code_typeArr[ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW_VALUE] = ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW;
            error_code_typeArr[ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW_VALUE] = ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW;
            error_code_typeArr[ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE_VALUE] = ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE;
            error_code_typeArr[ERROR_CODE_TYPE_NO_LEAGUE_VALUE] = ERROR_CODE_TYPE_NO_LEAGUE;
            error_code_typeArr[ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET_VALUE] = ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET;
            error_code_typeArr[ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB_VALUE] = ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB;
            error_code_typeArr[ERROR_CODE_TYPE_LEAGUE_MUTE_VALUE] = ERROR_CODE_TYPE_LEAGUE_MUTE;
            error_code_typeArr[ERROR_CODE_TYPE_IN_LEAGUE_ALREADY_VALUE] = ERROR_CODE_TYPE_IN_LEAGUE_ALREADY;
            error_code_typeArr[ERROR_CODE_TYPE_NOT_IN_LEAGUE_VALUE] = ERROR_CODE_TYPE_NOT_IN_LEAGUE;
            error_code_typeArr[ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY_VALUE] = ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY;
            error_code_typeArr[ERROR_CODE_TYPE_LEAGUE_SAME_NAME_VALUE] = ERROR_CODE_TYPE_LEAGUE_SAME_NAME;
            error_code_typeArr[ERROR_CODE_TYPE_CLUB_MANAGER_FULL_VALUE] = ERROR_CODE_TYPE_CLUB_MANAGER_FULL;
            error_code_typeArr[ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW_VALUE] = ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW;
            error_code_typeArr[ERROR_CODE_TYPE_INVITE_FRIEND_MUTE_VALUE] = ERROR_CODE_TYPE_INVITE_FRIEND_MUTE;
            error_code_typeArr[ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE_VALUE] = ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE;
            error_code_typeArr[ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST_VALUE] = ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST;
            error_code_typeArr[99] = ERROR_CODE_TYPE_MINI_GAME_INVALID_USER;
            error_code_typeArr[100] = ERROR_CODE_TYPE_MINI_GAME_NO_MONEY;
            error_code_typeArr[TEXAS_CMD.Cmd_CSSetClubFund_VALUE] = ERROR_CODE_TYPE_MINI_GAME_INVALID_CMD;
            error_code_typeArr[TEXAS_CMD.Cmd_CSGetClubByClubID_VALUE] = ERROR_CODE_TYPE_MINI_GAME_TIMEOUT;
            ENUM$VALUES = error_code_typeArr;
            internalValueMap = new C00901();
            VALUES = values();
        }

        public static ERROR_CODE_TYPE valueOf(int i) {
            switch (i) {
                case ERROR_CODE_TYPE_SUCCESS_VALUE:
                    return ERROR_CODE_TYPE_SUCCESS;
                case ERROR_CODE_TYPE_NO_USER_VALUE:
                    return ERROR_CODE_TYPE_NO_USER;
                case ERROR_CODE_TYPE_NO_CHATROOM_VALUE:
                    return ERROR_CODE_TYPE_NO_CHATROOM;
                case ERROR_CODE_TYPE_REGISTER_USER_EXIST_VALUE:
                    return ERROR_CODE_TYPE_REGISTER_USER_EXIST;
                case ERROR_CODE_TYPE_VERIFY_CODE_ERROR_VALUE:
                    return ERROR_CODE_TYPE_VERIFY_CODE_ERROR;
                case ERROR_CODE_TYPE_ID_PWD_ERROR_VALUE:
                    return ERROR_CODE_TYPE_ID_PWD_ERROR;
                case ERROR_CODE_TYPE_FRIEND_NOT_EXIST_VALUE:
                    return ERROR_CODE_TYPE_FRIEND_NOT_EXIST;
                case ERROR_CODE_TYPE_NOT_INVITED_VALUE:
                    return ERROR_CODE_TYPE_NOT_INVITED;
                case ERROR_CODE_TYPE_CHATROOM_OVERFLOW_VALUE:
                    return ERROR_CODE_TYPE_CHATROOM_OVERFLOW;
                case ERROR_CODE_TYPE_GAMEROOM_OVERFLOW_VALUE:
                    return ERROR_CODE_TYPE_GAMEROOM_OVERFLOW;
                case ERROR_CODE_TYPE_SERVER_ERROR_VALUE:
                    return ERROR_CODE_TYPE_SERVER_ERROR;
                case ERROR_CODE_TYPE_NO_GAME_ROOM_VALUE:
                    return ERROR_CODE_TYPE_NO_GAME_ROOM;
                case ERROR_CODE_TYPE_GAME_ROOM_FULL_VALUE:
                    return ERROR_CODE_TYPE_GAME_ROOM_FULL;
                case ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY_VALUE:
                    return ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY;
                case ERROR_CODE_TYPE_NOT_FRIEND_VALUE:
                    return ERROR_CODE_TYPE_NOT_FRIEND;
                case ERROR_CODE_TYPE_SHARE_ENOUGH_VALUE:
                    return ERROR_CODE_TYPE_SHARE_ENOUGH;
                case ERROR_CODE_TYPE_MORE_REWARDED_VALUE:
                    return ERROR_CODE_TYPE_MORE_REWARDED;
                case ERROR_CODE_TYPE_NO_BILL_VALUE:
                    return ERROR_CODE_TYPE_NO_BILL;
                case ERROR_CODE_TYPE_NO_FAVORITE_VALUE:
                    return ERROR_CODE_TYPE_NO_FAVORITE;
                case ERROR_CODE_TYPE_FAVORITE_DATA_ERROR_VALUE:
                    return ERROR_CODE_TYPE_FAVORITE_DATA_ERROR;
                case ERROR_CODE_TYPE_NO_SELLING_ITEM_VALUE:
                    return ERROR_CODE_TYPE_NO_SELLING_ITEM;
                case ERROR_CODE_TYPE_NOT_ENOUGH_COIN_VALUE:
                    return ERROR_CODE_TYPE_NOT_ENOUGH_COIN;
                case ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_VALUE:
                    return ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM;
                case ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER_VALUE:
                    return ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER;
                case ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_VALUE:
                    return ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM;
                case ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER_VALUE:
                    return ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM_USER;
                case ERROR_CODE_TYPE_NO_USER_IN_CHATROOM_VALUE:
                    return ERROR_CODE_TYPE_NO_USER_IN_CHATROOM;
                case ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR_VALUE:
                    return ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR;
                case ERROR_CODE_TYPE_UNKNOWN_VALUE:
                    return ERROR_CODE_TYPE_UNKNOWN;
                case ERROR_CODE_TYPE_NO_USER_INPOS_VALUE:
                    return ERROR_CODE_TYPE_NO_USER_INPOS;
                case ERROR_CODE_TYPE_BUY_LOW_VIP_VALUE:
                    return ERROR_CODE_TYPE_BUY_LOW_VIP;
                case ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM_VALUE:
                    return ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM;
                case ERROR_CODE_TYPE_FRIEND_ALREADY_VALUE:
                    return ERROR_CODE_TYPE_FRIEND_ALREADY;
                case ERROR_CODE_TYPE_OFFLINE_GAME_OVERED_VALUE:
                    return ERROR_CODE_TYPE_OFFLINE_GAME_OVERED;
                case ERROR_CODE_TYPE_CLUB_OVERFLOW_VALUE:
                    return ERROR_CODE_TYPE_CLUB_OVERFLOW;
                case ERROR_CODE_TYPE_NO_CLUB_VALUE:
                    return ERROR_CODE_TYPE_NO_CLUB;
                case ERROR_CODE_TYPE_NO_CLUB_AUTH_VALUE:
                    return ERROR_CODE_TYPE_NO_CLUB_AUTH;
                case ERROR_CODE_TYPE_CLUB_NO_USER_VALUE:
                    return ERROR_CODE_TYPE_CLUB_NO_USER;
                case ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY_VALUE:
                    return ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY;
                case ERROR_CODE_TYPE_NO_QUICK_GAMEROOM_VALUE:
                    return ERROR_CODE_TYPE_NO_QUICK_GAMEROOM;
                case ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START_VALUE:
                    return ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START;
                case ERROR_CODE_TYPE_NO_USER_GET_MONEY_VALUE:
                    return ERROR_CODE_TYPE_NO_USER_GET_MONEY;
                case ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM_VALUE:
                    return ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM;
                case ERROR_CODE_TYPE_NO_TRANSACTIONID_VALUE:
                    return ERROR_CODE_TYPE_NO_TRANSACTIONID;
                case ERROR_CODE_TYPE_TRANSACTIONID_REPEAT_VALUE:
                    return ERROR_CODE_TYPE_TRANSACTIONID_REPEAT;
                case ERROR_CODE_TYPE_TRANSACTIONID_ERROR_VALUE:
                    return ERROR_CODE_TYPE_TRANSACTIONID_ERROR;
                case ERROR_CODE_TYPE_BUYIN_MAX_STACKS_VALUE:
                    return ERROR_CODE_TYPE_BUYIN_MAX_STACKS;
                case ERROR_CODE_TYPE_GET_BENFIT_ALREADY_VALUE:
                    return ERROR_CODE_TYPE_GET_BENFIT_ALREADY;
                case ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT_VALUE:
                    return ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT;
                case ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE_VALUE:
                    return ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE;
                case ERROR_CODE_TYPE_CLUB_NO_MORE_MAX_VALUE:
                    return ERROR_CODE_TYPE_CLUB_NO_MORE_MAX;
                case ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE_VALUE:
                    return ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE;
                case ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM_VALUE:
                    return ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM;
                case ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER_VALUE:
                    return ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER;
                case ERROR_CODE_TYPE_NO_HANDRESULT_VALUE:
                    return ERROR_CODE_TYPE_NO_HANDRESULT;
                case ERROR_CODE_TYPE_NO_BEFORE_GAME_VALUE:
                    return ERROR_CODE_TYPE_NO_BEFORE_GAME;
                case ERROR_CODE_TYPE_NO_POKERHISTORY_VALUE:
                    return ERROR_CODE_TYPE_NO_POKERHISTORY;
                case ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN_VALUE:
                    return ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN;
                case ERROR_CODE_TYPE_NO_USER_IN_GAME_VALUE:
                    return ERROR_CODE_TYPE_NO_USER_IN_GAME;
                case ERROR_CODE_TYPE_NO_INVITE_BUYIN_VALUE:
                    return ERROR_CODE_TYPE_NO_INVITE_BUYIN;
                case ERROR_CODE_TYPE_NO_AUTH_BUYINACTION_VALUE:
                    return ERROR_CODE_TYPE_NO_AUTH_BUYINACTION;
                case ERROR_CODE_TYPE_PAUSED_VALUE:
                    return ERROR_CODE_TYPE_PAUSED;
                case ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND_VALUE:
                    return ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND;
                case ERROR_CODE_TYPE_NOT_START_VALUE:
                    return ERROR_CODE_TYPE_NOT_START;
                case ERROR_CODE_TYPE_NOT_OWNER_VALUE:
                    return ERROR_CODE_TYPE_NOT_OWNER;
                case ERROR_CODE_TYPE_USER_ALREADY_IN_VALUE:
                    return ERROR_CODE_TYPE_USER_ALREADY_IN;
                case ERROR_CODE_TYPE_FAVORITE_OVERFLOW_VALUE:
                    return ERROR_CODE_TYPE_FAVORITE_OVERFLOW;
                case ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START_VALUE:
                    return ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START;
                case ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT_VALUE:
                    return ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT;
                case ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY_VALUE:
                    return ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY;
                case ERROR_CODE_TYPE_SERVER_MAINTENANCEING_VALUE:
                    return ERROR_CODE_TYPE_SERVER_MAINTENANCEING;
                case ERROR_CODE_TYPE_SET_INSURANCE_VALUE:
                    return ERROR_CODE_TYPE_SET_INSURANCE;
                case ERROR_CODE_TYPE_NOT_ALLOW_STANDUP_VALUE:
                    return ERROR_CODE_TYPE_NOT_ALLOW_STANDUP;
                case ERROR_CODE_TYPE_TOKEN_EXPIRED_VALUE:
                    return ERROR_CODE_TYPE_TOKEN_EXPIRED;
                case ERROR_CODE_TYPE_BLACKED_VALUE:
                    return ERROR_CODE_TYPE_BLACKED;
                case ERROR_CODE_TYPE_IP_CHECK_ERROR_VALUE:
                    return ERROR_CODE_TYPE_IP_CHECK_ERROR;
                case ERROR_CODE_TYPE_GPS_CHECK_ERROR_VALUE:
                    return ERROR_CODE_TYPE_GPS_CHECK_ERROR;
                case ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY_VALUE:
                    return ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY;
                case ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY_VALUE:
                    return ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY;
                case ERROR_CODE_TYPE_NOT_SITTED_VALUE:
                    return ERROR_CODE_TYPE_NOT_SITTED;
                case ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR_VALUE:
                    return ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR;
                case ERROR_CODE_TYPE_LEAGUE_OVERFLOW_VALUE:
                    return ERROR_CODE_TYPE_LEAGUE_OVERFLOW;
                case ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE_VALUE:
                    return ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE;
                case ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW_VALUE:
                    return ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW;
                case ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW_VALUE:
                    return ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW;
                case ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE_VALUE:
                    return ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE;
                case ERROR_CODE_TYPE_NO_LEAGUE_VALUE:
                    return ERROR_CODE_TYPE_NO_LEAGUE;
                case ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET_VALUE:
                    return ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET;
                case ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB_VALUE:
                    return ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB;
                case ERROR_CODE_TYPE_LEAGUE_MUTE_VALUE:
                    return ERROR_CODE_TYPE_LEAGUE_MUTE;
                case ERROR_CODE_TYPE_IN_LEAGUE_ALREADY_VALUE:
                    return ERROR_CODE_TYPE_IN_LEAGUE_ALREADY;
                case ERROR_CODE_TYPE_NOT_IN_LEAGUE_VALUE:
                    return ERROR_CODE_TYPE_NOT_IN_LEAGUE;
                case ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY_VALUE:
                    return ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY;
                case ERROR_CODE_TYPE_LEAGUE_SAME_NAME_VALUE:
                    return ERROR_CODE_TYPE_LEAGUE_SAME_NAME;
                case ERROR_CODE_TYPE_CLUB_MANAGER_FULL_VALUE:
                    return ERROR_CODE_TYPE_CLUB_MANAGER_FULL;
                case ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW_VALUE:
                    return ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW;
                case ERROR_CODE_TYPE_INVITE_FRIEND_MUTE_VALUE:
                    return ERROR_CODE_TYPE_INVITE_FRIEND_MUTE;
                case ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE_VALUE:
                    return ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE;
                case ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST_VALUE:
                    return ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST;
                case ERROR_CODE_TYPE_MINI_GAME_INVALID_USER_VALUE:
                    return ERROR_CODE_TYPE_MINI_GAME_INVALID_USER;
                case ERROR_CODE_TYPE_MINI_GAME_NO_MONEY_VALUE:
                    return ERROR_CODE_TYPE_MINI_GAME_NO_MONEY;
                case ERROR_CODE_TYPE_MINI_GAME_INVALID_CMD_VALUE:
                    return ERROR_CODE_TYPE_MINI_GAME_INVALID_CMD;
                case ERROR_CODE_TYPE_MINI_GAME_TIMEOUT_VALUE:
                    return ERROR_CODE_TYPE_MINI_GAME_TIMEOUT;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<ERROR_CODE_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerCommon.m11a().getEnumTypes().get(ERROR_CODE_TYPE_VERIFY_CODE_ERROR_VALUE);
        }

        public static ERROR_CODE_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface FavoritePokerHistoryInfoOrBuilder extends MessageOrBuilder {
        long getLFavoriteSaveTime();

        long getLFavoriteUuid();

        String getSFavoriteName();

        ByteString getSFavoriteNameBytes();

        PokerHistoryInfo getStPokerHistoryInfo();

        PokerHistoryInfoOrBuilder getStPokerHistoryInfoOrBuilder();

        boolean hasLFavoriteSaveTime();

        boolean hasLFavoriteUuid();

        boolean hasSFavoriteName();

        boolean hasStPokerHistoryInfo();
    }

    public static final class FavoritePokerHistoryInfo extends GeneratedMessage implements FavoritePokerHistoryInfoOrBuilder {
        public static final int LFAVORITESAVETIME_FIELD_NUMBER = 4;
        public static final int LFAVORITEUUID_FIELD_NUMBER = 1;
        public static Parser<FavoritePokerHistoryInfo> PARSER = null;
        public static final int SFAVORITENAME_FIELD_NUMBER = 2;
        public static final int STPOKERHISTORYINFO_FIELD_NUMBER = 3;
        private static final FavoritePokerHistoryInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lFavoriteSaveTime_;
        private long lFavoriteUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sFavoriteName_;
        private PokerHistoryInfo stPokerHistoryInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.1 */
        class C00911 extends AbstractParser<FavoritePokerHistoryInfo> {
            static {
                fixHelper.fixfunc(new int[]{4610, 4611});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00911();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements FavoritePokerHistoryInfoOrBuilder {
            private int bitField0_;
            private long lFavoriteSaveTime_;
            private long lFavoriteUuid_;
            private Object sFavoriteName_;
            private SingleFieldBuilder<PokerHistoryInfo, Builder, PokerHistoryInfoOrBuilder> stPokerHistoryInfoBuilder_;
            private PokerHistoryInfo stPokerHistoryInfo_;

            static {
                fixHelper.fixfunc(new int[]{22138, 22139, 22140, 22141, 22142, 22143, 22144, 22145, 22146, 22147, 22148, 22149, 22150, 22151, 22152, 22153, 22154, 22155, 22156, 22157, 22158, 22159, 22160, 22161, 22162, 22163, 22164, 22165, 22166, 22167, 22168, 22169, 22170, 22171, 22172, 22173, 22174, 22175, 22176, 22177, 22178, 22179, 22180, 22181, 22182, 22183, 22184, 22185, 22186, 22187, 22188, 22189, 22190, 22191, 22192});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<PokerHistoryInfo, Builder, PokerHistoryInfoOrBuilder> getStPokerHistoryInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m861build();

            public final native FavoritePokerHistoryInfo m862build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m863buildPartial();

            public final native FavoritePokerHistoryInfo m864buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m865clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m866clear();

            public final native Builder m867clear();

            public final native Builder clearLFavoriteSaveTime();

            public final native Builder clearLFavoriteUuid();

            public final native Builder clearSFavoriteName();

            public final native Builder clearStPokerHistoryInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m868clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m869clone();

            public final native Builder m870clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m871getDefaultInstanceForType();

            public final native FavoritePokerHistoryInfo m872getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLFavoriteSaveTime();

            public final native long getLFavoriteUuid();

            public final native String getSFavoriteName();

            public final native ByteString getSFavoriteNameBytes();

            public final native PokerHistoryInfo getStPokerHistoryInfo();

            public final native Builder getStPokerHistoryInfoBuilder();

            public final native PokerHistoryInfoOrBuilder getStPokerHistoryInfoOrBuilder();

            public final native boolean hasLFavoriteSaveTime();

            public final native boolean hasLFavoriteUuid();

            public final native boolean hasSFavoriteName();

            public final native boolean hasStPokerHistoryInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m873mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m874mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m875mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m876mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m877mergeFrom(Message message);

            public final native Builder mergeFrom(FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public final native Builder mergeStPokerHistoryInfo(PokerHistoryInfo pokerHistoryInfo);

            public final native Builder setLFavoriteSaveTime(long j);

            public final native Builder setLFavoriteUuid(long j);

            public final native Builder setSFavoriteName(String str);

            public final native Builder setSFavoriteNameBytes(ByteString byteString);

            public final native Builder setStPokerHistoryInfo(Builder builder);

            public final native Builder setStPokerHistoryInfo(PokerHistoryInfo pokerHistoryInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f22m;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{32431, 32432, 32433, 32434, 32435, 32436, 32437, 32438, 32439, 32440, 32441, 32442, 32443, 32444, 32445, 32446, 32447, 32448, 32449, 32450, 32451, 32452, 32453, 32454, 32455, 32456, 32457, 32458, 32459, 32460, 32461, 32462, 32463, 32464});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native FavoritePokerHistoryInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ FavoritePokerHistoryInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FavoritePokerHistoryInfo favoritePokerHistoryInfo);

        private native FavoritePokerHistoryInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ FavoritePokerHistoryInfo(com.google.protobuf.GeneratedMessage.Builder builder, FavoritePokerHistoryInfo favoritePokerHistoryInfo);

        private native FavoritePokerHistoryInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m854getDefaultInstanceForType();

        public final native FavoritePokerHistoryInfo m855getDefaultInstanceForType();

        public final native long getLFavoriteSaveTime();

        public final native long getLFavoriteUuid();

        public final native Parser<FavoritePokerHistoryInfo> getParserForType();

        public final native String getSFavoriteName();

        public final native ByteString getSFavoriteNameBytes();

        public final native int getSerializedSize();

        public final native PokerHistoryInfo getStPokerHistoryInfo();

        public final native PokerHistoryInfoOrBuilder getStPokerHistoryInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasLFavoriteSaveTime();

        public final native boolean hasLFavoriteUuid();

        public final native boolean hasSFavoriteName();

        public final native boolean hasStPokerHistoryInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m856newBuilderForType();

        public final native Builder m857newBuilderForType();

        protected final native Builder m858newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m859toBuilder();

        public final native Builder m860toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static FavoritePokerHistoryInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f22m;
        }

        static void __clinit__() {
            PARSER = new C00911();
            FavoritePokerHistoryInfo favoritePokerHistoryInfo = new FavoritePokerHistoryInfo(true);
            defaultInstance = favoritePokerHistoryInfo;
            favoritePokerHistoryInfo.initFields();
        }

        public static FavoritePokerHistoryInfo parseFrom(ByteString byteString) {
            return (FavoritePokerHistoryInfo) PARSER.parseFrom(byteString);
        }

        public static FavoritePokerHistoryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoritePokerHistoryInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FavoritePokerHistoryInfo parseFrom(byte[] bArr) {
            return (FavoritePokerHistoryInfo) PARSER.parseFrom(bArr);
        }

        public static FavoritePokerHistoryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoritePokerHistoryInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FavoritePokerHistoryInfo parseFrom(InputStream inputStream) {
            return (FavoritePokerHistoryInfo) PARSER.parseFrom(inputStream);
        }

        public static FavoritePokerHistoryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoritePokerHistoryInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static FavoritePokerHistoryInfo parseDelimitedFrom(InputStream inputStream) {
            return (FavoritePokerHistoryInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static FavoritePokerHistoryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoritePokerHistoryInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static FavoritePokerHistoryInfo parseFrom(CodedInputStream codedInputStream) {
            return (FavoritePokerHistoryInfo) PARSER.parseFrom(codedInputStream);
        }

        public static FavoritePokerHistoryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoritePokerHistoryInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(FavoritePokerHistoryInfo favoritePokerHistoryInfo) {
            return newBuilder().mergeFrom(favoritePokerHistoryInfo);
        }
    }

    public enum GAME_ROOM_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int GAME_ROOM_NORMAL_INSURANCE_VALUE = 3;
        public static final int GAME_ROOM_NORMAL_VALUE = 1;
        public static final int GAME_ROOM_OMAHA_INSURANCE_VALUE = 6;
        public static final int GAME_ROOM_OMAHA_VALUE = 5;
        public static final int GAME_ROOM_SIX_VALUE = 4;
        public static final int GAME_ROOM_SNG_VALUE = 2;
        private static final GAME_ROOM_TYPE[] VALUES = null;
        private static EnumLiteMap<GAME_ROOM_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.GAME_ROOM_TYPE.1 */
        class C00921 implements EnumLiteMap<GAME_ROOM_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{19576, 19577});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00921();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{31899, 31900, 31901, 31902});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native GAME_ROOM_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            GAME_ROOM_NORMAL = new GAME_ROOM_TYPE("GAME_ROOM_NORMAL", 0, 0, GAME_ROOM_NORMAL_VALUE);
            GAME_ROOM_SNG = new GAME_ROOM_TYPE("GAME_ROOM_SNG", GAME_ROOM_NORMAL_VALUE, GAME_ROOM_NORMAL_VALUE, GAME_ROOM_SNG_VALUE);
            GAME_ROOM_NORMAL_INSURANCE = new GAME_ROOM_TYPE("GAME_ROOM_NORMAL_INSURANCE", GAME_ROOM_SNG_VALUE, GAME_ROOM_SNG_VALUE, GAME_ROOM_NORMAL_INSURANCE_VALUE);
            GAME_ROOM_SIX = new GAME_ROOM_TYPE("GAME_ROOM_SIX", GAME_ROOM_NORMAL_INSURANCE_VALUE, GAME_ROOM_NORMAL_INSURANCE_VALUE, GAME_ROOM_SIX_VALUE);
            GAME_ROOM_OMAHA = new GAME_ROOM_TYPE("GAME_ROOM_OMAHA", GAME_ROOM_SIX_VALUE, GAME_ROOM_SIX_VALUE, GAME_ROOM_OMAHA_VALUE);
            GAME_ROOM_OMAHA_INSURANCE = new GAME_ROOM_TYPE("GAME_ROOM_OMAHA_INSURANCE", GAME_ROOM_OMAHA_VALUE, GAME_ROOM_OMAHA_VALUE, GAME_ROOM_OMAHA_INSURANCE_VALUE);
            GAME_ROOM_TYPE[] game_room_typeArr = new GAME_ROOM_TYPE[GAME_ROOM_OMAHA_INSURANCE_VALUE];
            game_room_typeArr[0] = GAME_ROOM_NORMAL;
            game_room_typeArr[GAME_ROOM_NORMAL_VALUE] = GAME_ROOM_SNG;
            game_room_typeArr[GAME_ROOM_SNG_VALUE] = GAME_ROOM_NORMAL_INSURANCE;
            game_room_typeArr[GAME_ROOM_NORMAL_INSURANCE_VALUE] = GAME_ROOM_SIX;
            game_room_typeArr[GAME_ROOM_SIX_VALUE] = GAME_ROOM_OMAHA;
            game_room_typeArr[GAME_ROOM_OMAHA_VALUE] = GAME_ROOM_OMAHA_INSURANCE;
            ENUM$VALUES = game_room_typeArr;
            internalValueMap = new C00921();
            VALUES = values();
        }

        public static GAME_ROOM_TYPE valueOf(int i) {
            switch (i) {
                case GAME_ROOM_NORMAL_VALUE:
                    return GAME_ROOM_NORMAL;
                case GAME_ROOM_SNG_VALUE:
                    return GAME_ROOM_SNG;
                case GAME_ROOM_NORMAL_INSURANCE_VALUE:
                    return GAME_ROOM_NORMAL_INSURANCE;
                case GAME_ROOM_SIX_VALUE:
                    return GAME_ROOM_SIX;
                case GAME_ROOM_OMAHA_VALUE:
                    return GAME_ROOM_OMAHA;
                case GAME_ROOM_OMAHA_INSURANCE_VALUE:
                    return GAME_ROOM_OMAHA_INSURANCE;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<GAME_ROOM_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerCommon.m11a().getEnumTypes().get(GAME_ROOM_OMAHA_INSURANCE_VALUE);
        }

        public static GAME_ROOM_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface GameItemInfoOrBuilder extends MessageOrBuilder {
        int getIItemID();

        int getIItemNum();

        int getIItemType();

        String getSItemDescription();

        ByteString getSItemDescriptionBytes();

        String getSItemIcon();

        ByteString getSItemIconBytes();

        String getSItemName();

        ByteString getSItemNameBytes();

        boolean hasIItemID();

        boolean hasIItemNum();

        boolean hasIItemType();

        boolean hasSItemDescription();

        boolean hasSItemIcon();

        boolean hasSItemName();
    }

    public static final class GameItemInfo extends GeneratedMessage implements GameItemInfoOrBuilder {
        public static final int IITEMID_FIELD_NUMBER = 1;
        public static final int IITEMNUM_FIELD_NUMBER = 5;
        public static final int IITEMTYPE_FIELD_NUMBER = 4;
        public static Parser<GameItemInfo> PARSER = null;
        public static final int SITEMDESCRIPTION_FIELD_NUMBER = 6;
        public static final int SITEMICON_FIELD_NUMBER = 3;
        public static final int SITEMNAME_FIELD_NUMBER = 2;
        private static final GameItemInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iItemID_;
        private int iItemNum_;
        private int iItemType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sItemDescription_;
        private Object sItemIcon_;
        private Object sItemName_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.GameItemInfo.1 */
        class C00931 extends AbstractParser<GameItemInfo> {
            static {
                fixHelper.fixfunc(new int[]{24845, 24846});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00931();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements GameItemInfoOrBuilder {
            private int bitField0_;
            private int iItemID_;
            private int iItemNum_;
            private int iItemType_;
            private Object sItemDescription_;
            private Object sItemIcon_;
            private Object sItemName_;

            static {
                fixHelper.fixfunc(new int[]{6815, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6823, 6824, 6825, 6826, 6827, 6828, 6829, 6830, 6831, 6832, 6833, 6834, 6835, 6836, 6837, 6838, 6839, 6840, 6841, 6842, 6843, 6844, 6845, 6846, 6847, 6848, 6849, 6850, 6851, 6852, 6853, 6854, 6855, 6856, 6857, 6858, 6859, 6860, 6861, 6862, 6863, 6864, 6865, 6866, 6867, 6868, 6869, 6870, 6871, 6872, 6873, 6874, 6875, 6876});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m885build();

            public final native GameItemInfo m886build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m887buildPartial();

            public final native GameItemInfo m888buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m889clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m890clear();

            public final native Builder m891clear();

            public final native Builder clearIItemID();

            public final native Builder clearIItemNum();

            public final native Builder clearIItemType();

            public final native Builder clearSItemDescription();

            public final native Builder clearSItemIcon();

            public final native Builder clearSItemName();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m892clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m893clone();

            public final native Builder m894clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m895getDefaultInstanceForType();

            public final native GameItemInfo m896getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIItemID();

            public final native int getIItemNum();

            public final native int getIItemType();

            public final native String getSItemDescription();

            public final native ByteString getSItemDescriptionBytes();

            public final native String getSItemIcon();

            public final native ByteString getSItemIconBytes();

            public final native String getSItemName();

            public final native ByteString getSItemNameBytes();

            public final native boolean hasIItemID();

            public final native boolean hasIItemNum();

            public final native boolean hasIItemType();

            public final native boolean hasSItemDescription();

            public final native boolean hasSItemIcon();

            public final native boolean hasSItemName();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m897mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m898mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m899mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m900mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m901mergeFrom(Message message);

            public final native Builder mergeFrom(GameItemInfo gameItemInfo);

            public final native Builder setIItemID(int i);

            public final native Builder setIItemNum(int i);

            public final native Builder setIItemType(int i);

            public final native Builder setSItemDescription(String str);

            public final native Builder setSItemDescriptionBytes(ByteString byteString);

            public final native Builder setSItemIcon(String str);

            public final native Builder setSItemIconBytes(ByteString byteString);

            public final native Builder setSItemName(String str);

            public final native Builder setSItemNameBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f16g;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{10230, 10231, 10232, 10233, 10234, 10235, 10236, 10237, 10238, 10239, 10240, 10241, 10242, 10243, 10244, 10245, 10246, 10247, 10248, 10249, 10250, 10251, 10252, 10253, 10254, 10255, 10256, 10257, 10258, 10259, 10260, 10261, 10262, 10263, 10264, 10265, 10266, 10267, 10268});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native GameItemInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ GameItemInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, GameItemInfo gameItemInfo);

        private native GameItemInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ GameItemInfo(com.google.protobuf.GeneratedMessage.Builder builder, GameItemInfo gameItemInfo);

        private native GameItemInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m878getDefaultInstanceForType();

        public final native GameItemInfo m879getDefaultInstanceForType();

        public final native int getIItemID();

        public final native int getIItemNum();

        public final native int getIItemType();

        public final native Parser<GameItemInfo> getParserForType();

        public final native String getSItemDescription();

        public final native ByteString getSItemDescriptionBytes();

        public final native String getSItemIcon();

        public final native ByteString getSItemIconBytes();

        public final native String getSItemName();

        public final native ByteString getSItemNameBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasIItemID();

        public final native boolean hasIItemNum();

        public final native boolean hasIItemType();

        public final native boolean hasSItemDescription();

        public final native boolean hasSItemIcon();

        public final native boolean hasSItemName();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m880newBuilderForType();

        public final native Builder m881newBuilderForType();

        protected final native Builder m882newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m883toBuilder();

        public final native Builder m884toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static GameItemInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f16g;
        }

        static void __clinit__() {
            PARSER = new C00931();
            GameItemInfo gameItemInfo = new GameItemInfo(true);
            defaultInstance = gameItemInfo;
            gameItemInfo.initFields();
        }

        public static GameItemInfo parseFrom(ByteString byteString) {
            return (GameItemInfo) PARSER.parseFrom(byteString);
        }

        public static GameItemInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (GameItemInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GameItemInfo parseFrom(byte[] bArr) {
            return (GameItemInfo) PARSER.parseFrom(bArr);
        }

        public static GameItemInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (GameItemInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GameItemInfo parseFrom(InputStream inputStream) {
            return (GameItemInfo) PARSER.parseFrom(inputStream);
        }

        public static GameItemInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GameItemInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static GameItemInfo parseDelimitedFrom(InputStream inputStream) {
            return (GameItemInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static GameItemInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GameItemInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static GameItemInfo parseFrom(CodedInputStream codedInputStream) {
            return (GameItemInfo) PARSER.parseFrom(codedInputStream);
        }

        public static GameItemInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GameItemInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(GameItemInfo gameItemInfo) {
            return newBuilder().mergeFrom(gameItemInfo);
        }
    }

    public interface HeaderOrBuilder extends MessageOrBuilder {
        long getLCurrTime();

        String getSAccessToken();

        ByteString getSAccessTokenBytes();

        int getShVer();

        CmdResult getStResult();

        CmdResultOrBuilder getStResultOrBuilder();

        UserBaseInfoNet getStUserInfo();

        UserBaseInfoNetOrBuilder getStUserInfoOrBuilder();

        boolean hasLCurrTime();

        boolean hasSAccessToken();

        boolean hasShVer();

        boolean hasStResult();

        boolean hasStUserInfo();
    }

    public static final class Header extends GeneratedMessage implements HeaderOrBuilder {
        public static final int LCURRTIME_FIELD_NUMBER = 2;
        public static Parser<Header> PARSER = null;
        public static final int SACCESSTOKEN_FIELD_NUMBER = 5;
        public static final int SHVER_FIELD_NUMBER = 1;
        public static final int STRESULT_FIELD_NUMBER = 4;
        public static final int STUSERINFO_FIELD_NUMBER = 3;
        private static final Header defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lCurrTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sAccessToken_;
        private int shVer_;
        private CmdResult stResult_;
        private UserBaseInfoNet stUserInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.Header.1 */
        class C00941 extends AbstractParser<Header> {
            static {
                fixHelper.fixfunc(new int[]{5247, 5248});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00941();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements HeaderOrBuilder {
            private int bitField0_;
            private long lCurrTime_;
            private Object sAccessToken_;
            private int shVer_;
            private SingleFieldBuilder<CmdResult, Builder, CmdResultOrBuilder> stResultBuilder_;
            private CmdResult stResult_;
            private SingleFieldBuilder<UserBaseInfoNet, Builder, UserBaseInfoNetOrBuilder> stUserInfoBuilder_;
            private UserBaseInfoNet stUserInfo_;

            static {
                fixHelper.fixfunc(new int[]{13021, 13022, 13023, 13024, 13025, 13026, 13027, 13028, 13029, 13030, 13031, 13032, 13033, 13034, 13035, 13036, 13037, 13038, 13039, 13040, 13041, 13042, 13043, 13044, 13045, 13046, 13047, 13048, 13049, 13050, 13051, 13052, 13053, 13054, 13055, 13056, 13057, 13058, 13059, 13060, 13061, 13062, 13063, 13064, 13065, 13066, 13067, 13068, 13069, 13070, 13071, 13072, 13073, 13074, 13075, 13076, 13077, 13078, 13079, 13080, 13081, 13082, 13083, 13084});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<CmdResult, Builder, CmdResultOrBuilder> getStResultFieldBuilder();

            private native SingleFieldBuilder<UserBaseInfoNet, Builder, UserBaseInfoNetOrBuilder> getStUserInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m909build();

            public final native Header m910build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m911buildPartial();

            public final native Header m912buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m913clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m914clear();

            public final native Builder m915clear();

            public final native Builder clearLCurrTime();

            public final native Builder clearSAccessToken();

            public final native Builder clearShVer();

            public final native Builder clearStResult();

            public final native Builder clearStUserInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m916clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m917clone();

            public final native Builder m918clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m919getDefaultInstanceForType();

            public final native Header m920getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLCurrTime();

            public final native String getSAccessToken();

            public final native ByteString getSAccessTokenBytes();

            public final native int getShVer();

            public final native CmdResult getStResult();

            public final native Builder getStResultBuilder();

            public final native CmdResultOrBuilder getStResultOrBuilder();

            public final native UserBaseInfoNet getStUserInfo();

            public final native Builder getStUserInfoBuilder();

            public final native UserBaseInfoNetOrBuilder getStUserInfoOrBuilder();

            public final native boolean hasLCurrTime();

            public final native boolean hasSAccessToken();

            public final native boolean hasShVer();

            public final native boolean hasStResult();

            public final native boolean hasStUserInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m921mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m922mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m923mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m924mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m925mergeFrom(Message message);

            public final native Builder mergeFrom(Header header);

            public final native Builder mergeStResult(CmdResult cmdResult);

            public final native Builder mergeStUserInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setLCurrTime(long j);

            public final native Builder setSAccessToken(String str);

            public final native Builder setSAccessTokenBytes(ByteString byteString);

            public final native Builder setShVer(int i);

            public final native Builder setStResult(Builder builder);

            public final native Builder setStResult(CmdResult cmdResult);

            public final native Builder setStUserInfo(Builder builder);

            public final native Builder setStUserInfo(UserBaseInfoNet userBaseInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f5E;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16611, 16612, 16613, 16614, 16615, 16616, 16617, 16618, 16619, 16620, 16621, 16622, 16623, 16624, 16625, 16626, 16627, 16628, 16629, 16630, 16631, 16632, 16633, 16634, 16635, 16636, 16637, 16638, 16639, 16640, 16641, 16642, 16643, 16644, 16645, 16646, 16647});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Header(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ Header(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Header header);

        private native Header(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ Header(com.google.protobuf.GeneratedMessage.Builder builder, Header header);

        private native Header(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m902getDefaultInstanceForType();

        public final native Header m903getDefaultInstanceForType();

        public final native long getLCurrTime();

        public final native Parser<Header> getParserForType();

        public final native String getSAccessToken();

        public final native ByteString getSAccessTokenBytes();

        public final native int getSerializedSize();

        public final native int getShVer();

        public final native CmdResult getStResult();

        public final native CmdResultOrBuilder getStResultOrBuilder();

        public final native UserBaseInfoNet getStUserInfo();

        public final native UserBaseInfoNetOrBuilder getStUserInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasLCurrTime();

        public final native boolean hasSAccessToken();

        public final native boolean hasShVer();

        public final native boolean hasStResult();

        public final native boolean hasStUserInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m904newBuilderForType();

        public final native Builder m905newBuilderForType();

        protected final native Builder m906newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m907toBuilder();

        public final native Builder m908toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static Header getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f5E;
        }

        static void __clinit__() {
            PARSER = new C00941();
            Header header = new Header(true);
            defaultInstance = header;
            header.initFields();
        }

        public static Header parseFrom(ByteString byteString) {
            return (Header) PARSER.parseFrom(byteString);
        }

        public static Header parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Header) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Header parseFrom(byte[] bArr) {
            return (Header) PARSER.parseFrom(bArr);
        }

        public static Header parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Header) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Header parseFrom(InputStream inputStream) {
            return (Header) PARSER.parseFrom(inputStream);
        }

        public static Header parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Header) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static Header parseDelimitedFrom(InputStream inputStream) {
            return (Header) PARSER.parseDelimitedFrom(inputStream);
        }

        public static Header parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Header) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static Header parseFrom(CodedInputStream codedInputStream) {
            return (Header) PARSER.parseFrom(codedInputStream);
        }

        public static Header parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Header) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(Header header) {
            return newBuilder().mergeFrom(header);
        }
    }

    public enum ID_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int ID_TYPE_FACEBOOK_VALUE = 6;
        public static final int ID_TYPE_NA_VALUE = 5;
        public static final int ID_TYPE_PHONE_VALUE = 4;
        public static final int ID_TYPE_QQWEIBO_VALUE = 2;
        public static final int ID_TYPE_RENREN_VALUE = 3;
        public static final int ID_TYPE_SINAWEIBO_VALUE = 1;
        private static final ID_TYPE[] VALUES = null;
        private static EnumLiteMap<ID_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.ID_TYPE.1 */
        class C00951 implements EnumLiteMap<ID_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{25217, 25218});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00951();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{14527, 14528, 14529, 14530});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native ID_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            ID_TYPE_SINAWEIBO = new ID_TYPE("ID_TYPE_SINAWEIBO", 0, 0, ID_TYPE_SINAWEIBO_VALUE);
            ID_TYPE_QQWEIBO = new ID_TYPE("ID_TYPE_QQWEIBO", ID_TYPE_SINAWEIBO_VALUE, ID_TYPE_SINAWEIBO_VALUE, ID_TYPE_QQWEIBO_VALUE);
            ID_TYPE_RENREN = new ID_TYPE("ID_TYPE_RENREN", ID_TYPE_QQWEIBO_VALUE, ID_TYPE_QQWEIBO_VALUE, ID_TYPE_RENREN_VALUE);
            ID_TYPE_PHONE = new ID_TYPE("ID_TYPE_PHONE", ID_TYPE_RENREN_VALUE, ID_TYPE_RENREN_VALUE, ID_TYPE_PHONE_VALUE);
            ID_TYPE_NA = new ID_TYPE("ID_TYPE_NA", ID_TYPE_PHONE_VALUE, ID_TYPE_PHONE_VALUE, ID_TYPE_NA_VALUE);
            ID_TYPE_FACEBOOK = new ID_TYPE("ID_TYPE_FACEBOOK", ID_TYPE_NA_VALUE, ID_TYPE_NA_VALUE, ID_TYPE_FACEBOOK_VALUE);
            ID_TYPE[] id_typeArr = new ID_TYPE[ID_TYPE_FACEBOOK_VALUE];
            id_typeArr[0] = ID_TYPE_SINAWEIBO;
            id_typeArr[ID_TYPE_SINAWEIBO_VALUE] = ID_TYPE_QQWEIBO;
            id_typeArr[ID_TYPE_QQWEIBO_VALUE] = ID_TYPE_RENREN;
            id_typeArr[ID_TYPE_RENREN_VALUE] = ID_TYPE_PHONE;
            id_typeArr[ID_TYPE_PHONE_VALUE] = ID_TYPE_NA;
            id_typeArr[ID_TYPE_NA_VALUE] = ID_TYPE_FACEBOOK;
            ENUM$VALUES = id_typeArr;
            internalValueMap = new C00951();
            VALUES = values();
        }

        public static ID_TYPE valueOf(int i) {
            switch (i) {
                case ID_TYPE_SINAWEIBO_VALUE:
                    return ID_TYPE_SINAWEIBO;
                case ID_TYPE_QQWEIBO_VALUE:
                    return ID_TYPE_QQWEIBO;
                case ID_TYPE_RENREN_VALUE:
                    return ID_TYPE_RENREN;
                case ID_TYPE_PHONE_VALUE:
                    return ID_TYPE_PHONE;
                case ID_TYPE_NA_VALUE:
                    return ID_TYPE_NA;
                case ID_TYPE_FACEBOOK_VALUE:
                    return ID_TYPE_FACEBOOK;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<ID_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerCommon.m11a().getEnumTypes().get(0);
        }

        public static ID_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum LANGUAGE_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int LANGUAGE_TYPE_ENGLISH_VALUE = 2;
        public static final int LANGUAGE_TYPE_SIMPLIFIED_CHINESE_VALUE = 1;
        public static final int LANGUAGE_TYPE_TRADITIONAL_CHINESE_VALUE = 3;
        private static final LANGUAGE_TYPE[] VALUES = null;
        private static EnumLiteMap<LANGUAGE_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.LANGUAGE_TYPE.1 */
        class C00961 implements EnumLiteMap<LANGUAGE_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{28676, 28677});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00961();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{9549, 9550, 9551, 9552});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native LANGUAGE_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            LANGUAGE_TYPE_SIMPLIFIED_CHINESE = new LANGUAGE_TYPE("LANGUAGE_TYPE_SIMPLIFIED_CHINESE", 0, 0, LANGUAGE_TYPE_SIMPLIFIED_CHINESE_VALUE);
            LANGUAGE_TYPE_ENGLISH = new LANGUAGE_TYPE("LANGUAGE_TYPE_ENGLISH", LANGUAGE_TYPE_SIMPLIFIED_CHINESE_VALUE, LANGUAGE_TYPE_SIMPLIFIED_CHINESE_VALUE, LANGUAGE_TYPE_ENGLISH_VALUE);
            LANGUAGE_TYPE_TRADITIONAL_CHINESE = new LANGUAGE_TYPE("LANGUAGE_TYPE_TRADITIONAL_CHINESE", LANGUAGE_TYPE_ENGLISH_VALUE, LANGUAGE_TYPE_ENGLISH_VALUE, LANGUAGE_TYPE_TRADITIONAL_CHINESE_VALUE);
            LANGUAGE_TYPE[] language_typeArr = new LANGUAGE_TYPE[LANGUAGE_TYPE_TRADITIONAL_CHINESE_VALUE];
            language_typeArr[0] = LANGUAGE_TYPE_SIMPLIFIED_CHINESE;
            language_typeArr[LANGUAGE_TYPE_SIMPLIFIED_CHINESE_VALUE] = LANGUAGE_TYPE_ENGLISH;
            language_typeArr[LANGUAGE_TYPE_ENGLISH_VALUE] = LANGUAGE_TYPE_TRADITIONAL_CHINESE;
            ENUM$VALUES = language_typeArr;
            internalValueMap = new C00961();
            VALUES = values();
        }

        public static LANGUAGE_TYPE valueOf(int i) {
            switch (i) {
                case LANGUAGE_TYPE_SIMPLIFIED_CHINESE_VALUE:
                    return LANGUAGE_TYPE_SIMPLIFIED_CHINESE;
                case LANGUAGE_TYPE_ENGLISH_VALUE:
                    return LANGUAGE_TYPE_ENGLISH;
                case LANGUAGE_TYPE_TRADITIONAL_CHINESE_VALUE:
                    return LANGUAGE_TYPE_TRADITIONAL_CHINESE;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<LANGUAGE_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerCommon.m11a().getEnumTypes().get(LANGUAGE_TYPE_TRADITIONAL_CHINESE_VALUE);
        }

        public static LANGUAGE_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface PackageOrBuilder extends MessageOrBuilder {
        ByteString getBody();

        int getCEncodeType();

        TEXAS_CMD getECmd();

        ByteString getHead();

        long getISeqNo();

        long getLCurrentSystemTime();

        long getLMisSystemTime();

        long getUuid();

        int getVersion();

        boolean hasBody();

        boolean hasCEncodeType();

        boolean hasECmd();

        boolean hasHead();

        boolean hasISeqNo();

        boolean hasLCurrentSystemTime();

        boolean hasLMisSystemTime();

        boolean hasUuid();

        boolean hasVersion();
    }

    public static final class Package extends GeneratedMessage implements PackageOrBuilder {
        public static final int BODY_FIELD_NUMBER = 4;
        public static final int CENCODETYPE_FIELD_NUMBER = 8;
        public static final int ECMD_FIELD_NUMBER = 7;
        public static final int HEAD_FIELD_NUMBER = 2;
        public static final int ISEQNO_FIELD_NUMBER = 6;
        public static final int LCURRENTSYSTEMTIME_FIELD_NUMBER = 5;
        public static final int LMISSYSTEMTIME_FIELD_NUMBER = 3;
        public static Parser<Package> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 9;
        private static final Package defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString body_;
        private int cEncodeType_;
        private TEXAS_CMD eCmd_;
        private ByteString head_;
        private long iSeqNo_;
        private long lCurrentSystemTime_;
        private long lMisSystemTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private int version_;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.Package.1 */
        class C00971 extends AbstractParser<Package> {
            static {
                fixHelper.fixfunc(new int[]{4654, 4655});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00971();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements PackageOrBuilder {
            private int bitField0_;
            private ByteString body_;
            private int cEncodeType_;
            private TEXAS_CMD eCmd_;
            private ByteString head_;
            private long iSeqNo_;
            private long lCurrentSystemTime_;
            private long lMisSystemTime_;
            private long uuid_;
            private int version_;

            static {
                fixHelper.fixfunc(new int[]{28885, 28886, 28887, 28888, 28889, 28890, 28891, 28892, 28893, 28894, 28895, 28896, 28897, 28898, 28899, 28900, 28901, 28902, 28903, 28904, 28905, 28906, 28907, 28908, 28909, 28910, 28911, 28912, 28913, 28914, 28915, 28916, 28917, 28918, 28919, 28920, 28921, 28922, 28923, 28924, 28925, 28926, 28927, 28928, 28929, 28930, 28931, 28932, 28933, 28934, 28935, 28936, 28937, 28938, 28939, 28940, 28941, 28942, 28943, 28944, 28945, 28946, 28947, 28948, 28949, 28950, 28951, 28952});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m933build();

            public final native Package m934build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m935buildPartial();

            public final native Package m936buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m937clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m938clear();

            public final native Builder m939clear();

            public final native Builder clearBody();

            public final native Builder clearCEncodeType();

            public final native Builder clearECmd();

            public final native Builder clearHead();

            public final native Builder clearISeqNo();

            public final native Builder clearLCurrentSystemTime();

            public final native Builder clearLMisSystemTime();

            public final native Builder clearUuid();

            public final native Builder clearVersion();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m940clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m941clone();

            public final native Builder m942clone();

            public final native ByteString getBody();

            public final native int getCEncodeType();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m943getDefaultInstanceForType();

            public final native Package m944getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native TEXAS_CMD getECmd();

            public final native ByteString getHead();

            public final native long getISeqNo();

            public final native long getLCurrentSystemTime();

            public final native long getLMisSystemTime();

            public final native long getUuid();

            public final native int getVersion();

            public final native boolean hasBody();

            public final native boolean hasCEncodeType();

            public final native boolean hasECmd();

            public final native boolean hasHead();

            public final native boolean hasISeqNo();

            public final native boolean hasLCurrentSystemTime();

            public final native boolean hasLMisSystemTime();

            public final native boolean hasUuid();

            public final native boolean hasVersion();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m945mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m946mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m947mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m948mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m949mergeFrom(Message message);

            public final native Builder mergeFrom(Package packageR);

            public final native Builder setBody(ByteString byteString);

            public final native Builder setCEncodeType(int i);

            public final native Builder setECmd(TEXAS_CMD texas_cmd);

            public final native Builder setHead(ByteString byteString);

            public final native Builder setISeqNo(long j);

            public final native Builder setLCurrentSystemTime(long j);

            public final native Builder setLMisSystemTime(long j);

            public final native Builder setUuid(long j);

            public final native Builder setVersion(int i);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f1A;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{8359, 8360, 8361, 8362, 8363, 8364, 8365, 8366, 8367, 8368, 8369, 8370, 8371, 8372, 8373, 8374, 8375, 8376, 8377, 8378, 8379, 8380, 8381, 8382, 8383, 8384, 8385, 8386, 8387, 8388, 8389, 8390, 8391, 8392, 8393, 8394, 8395, 8396, 8397, 8398, 8399, 8400});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, Package packageR);

        private native Package(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ Package(com.google.protobuf.GeneratedMessage.Builder builder, Package packageR);

        private native Package(boolean z);

        private native void initFields();

        public final native ByteString getBody();

        public final native int getCEncodeType();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m926getDefaultInstanceForType();

        public final native Package m927getDefaultInstanceForType();

        public final native TEXAS_CMD getECmd();

        public final native ByteString getHead();

        public final native long getISeqNo();

        public final native long getLCurrentSystemTime();

        public final native long getLMisSystemTime();

        public final native Parser<Package> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native int getVersion();

        public final native boolean hasBody();

        public final native boolean hasCEncodeType();

        public final native boolean hasECmd();

        public final native boolean hasHead();

        public final native boolean hasISeqNo();

        public final native boolean hasLCurrentSystemTime();

        public final native boolean hasLMisSystemTime();

        public final native boolean hasUuid();

        public final native boolean hasVersion();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m928newBuilderForType();

        public final native Builder m929newBuilderForType();

        protected final native Builder m930newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m931toBuilder();

        public final native Builder m932toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static Package getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f1A;
        }

        static void __clinit__() {
            PARSER = new C00971();
            Package packageR = new Package(true);
            defaultInstance = packageR;
            packageR.initFields();
        }

        public static Package parseFrom(ByteString byteString) {
            return (Package) PARSER.parseFrom(byteString);
        }

        public static Package parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Package) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Package parseFrom(byte[] bArr) {
            return (Package) PARSER.parseFrom(bArr);
        }

        public static Package parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Package) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Package parseFrom(InputStream inputStream) {
            return (Package) PARSER.parseFrom(inputStream);
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Package) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static Package parseDelimitedFrom(InputStream inputStream) {
            return (Package) PARSER.parseDelimitedFrom(inputStream);
        }

        public static Package parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Package) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static Package parseFrom(CodedInputStream codedInputStream) {
            return (Package) PARSER.parseFrom(codedInputStream);
        }

        public static Package parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Package) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(Package packageR) {
            return newBuilder().mergeFrom(packageR);
        }
    }

    public interface PokerHandAliasInfoOrBuilder extends MessageOrBuilder {
        String getAlias();

        ByteString getAliasBytes();

        long getLUuid();

        boolean hasAlias();

        boolean hasLUuid();
    }

    public static final class PokerHandAliasInfo extends GeneratedMessage implements PokerHandAliasInfoOrBuilder {
        public static final int ALIAS_FIELD_NUMBER = 2;
        public static final int LUUID_FIELD_NUMBER = 1;
        public static Parser<PokerHandAliasInfo> PARSER;
        private static final PokerHandAliasInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private Object alias_;
        private int bitField0_;
        private long lUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.PokerHandAliasInfo.1 */
        class C00981 extends AbstractParser<PokerHandAliasInfo> {
            static {
                fixHelper.fixfunc(new int[]{5245, 5246});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00981();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements PokerHandAliasInfoOrBuilder {
            private Object alias_;
            private int bitField0_;
            private long lUuid_;

            static {
                fixHelper.fixfunc(new int[]{6331, 6332, 6333, 6334, 6335, 6336, 6337, 6338, 6339, 6340, 6341, 6342, 6343, 6344, 6345, 6346, 6347, 6348, 6349, 6350, 6351, 6352, 6353, 6354, 6355, 6356, 6357, 6358, 6359, 6360, 6361, 6362, 6363, 6364, 6365, 6366, 6367, 6368, 6369, 6370, 6371, 6372});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m957build();

            public final native PokerHandAliasInfo m958build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m959buildPartial();

            public final native PokerHandAliasInfo m960buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m961clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m962clear();

            public final native Builder m963clear();

            public final native Builder clearAlias();

            public final native Builder clearLUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m964clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m965clone();

            public final native Builder m966clone();

            public final native String getAlias();

            public final native ByteString getAliasBytes();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m967getDefaultInstanceForType();

            public final native PokerHandAliasInfo m968getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLUuid();

            public final native boolean hasAlias();

            public final native boolean hasLUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m969mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m970mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m971mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m972mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m973mergeFrom(Message message);

            public final native Builder mergeFrom(PokerHandAliasInfo pokerHandAliasInfo);

            public final native Builder setAlias(String str);

            public final native Builder setAliasBytes(ByteString byteString);

            public final native Builder setLUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f34y;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{28370, 28371, 28372, 28373, 28374, 28375, 28376, 28377, 28378, 28379, 28380, 28381, 28382, 28383, 28384, 28385, 28386, 28387, 28388, 28389, 28390, 28391, 28392, 28393, 28394, 28395, 28396, 28397, 28398});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native PokerHandAliasInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ PokerHandAliasInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, PokerHandAliasInfo pokerHandAliasInfo);

        private native PokerHandAliasInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ PokerHandAliasInfo(com.google.protobuf.GeneratedMessage.Builder builder, PokerHandAliasInfo pokerHandAliasInfo);

        private native PokerHandAliasInfo(boolean z);

        private native void initFields();

        public final native String getAlias();

        public final native ByteString getAliasBytes();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m950getDefaultInstanceForType();

        public final native PokerHandAliasInfo m951getDefaultInstanceForType();

        public final native long getLUuid();

        public final native Parser<PokerHandAliasInfo> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasAlias();

        public final native boolean hasLUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m952newBuilderForType();

        public final native Builder m953newBuilderForType();

        protected final native Builder m954newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m955toBuilder();

        public final native Builder m956toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static PokerHandAliasInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f34y;
        }

        static void __clinit__() {
            PARSER = new C00981();
            PokerHandAliasInfo pokerHandAliasInfo = new PokerHandAliasInfo(true);
            defaultInstance = pokerHandAliasInfo;
            pokerHandAliasInfo.initFields();
        }

        public static PokerHandAliasInfo parseFrom(ByteString byteString) {
            return (PokerHandAliasInfo) PARSER.parseFrom(byteString);
        }

        public static PokerHandAliasInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandAliasInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PokerHandAliasInfo parseFrom(byte[] bArr) {
            return (PokerHandAliasInfo) PARSER.parseFrom(bArr);
        }

        public static PokerHandAliasInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandAliasInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PokerHandAliasInfo parseFrom(InputStream inputStream) {
            return (PokerHandAliasInfo) PARSER.parseFrom(inputStream);
        }

        public static PokerHandAliasInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandAliasInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static PokerHandAliasInfo parseDelimitedFrom(InputStream inputStream) {
            return (PokerHandAliasInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static PokerHandAliasInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandAliasInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static PokerHandAliasInfo parseFrom(CodedInputStream codedInputStream) {
            return (PokerHandAliasInfo) PARSER.parseFrom(codedInputStream);
        }

        public static PokerHandAliasInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandAliasInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(PokerHandAliasInfo pokerHandAliasInfo) {
            return newBuilder().mergeFrom(pokerHandAliasInfo);
        }
    }

    public interface PokerHandResultOrBuilder extends MessageOrBuilder {
        long getLHandID();

        long getLRoomID();

        int getVCommunityCards(int i);

        int getVCommunityCardsCount();

        List<Integer> getVCommunityCardsList();

        PokerResultUserInfo getVPokerResultUserInfovs(int i);

        int getVPokerResultUserInfovsCount();

        List<PokerResultUserInfo> getVPokerResultUserInfovsList();

        PokerResultUserInfoOrBuilder getVPokerResultUserInfovsOrBuilder(int i);

        List<? extends PokerResultUserInfoOrBuilder> getVPokerResultUserInfovsOrBuilderList();

        boolean hasLHandID();

        boolean hasLRoomID();
    }

    public static final class PokerHandResult extends GeneratedMessage implements PokerHandResultOrBuilder {
        public static final int LHANDID_FIELD_NUMBER = 2;
        public static final int LROOMID_FIELD_NUMBER = 1;
        public static Parser<PokerHandResult> PARSER = null;
        public static final int VCOMMUNITYCARDS_FIELD_NUMBER = 3;
        public static final int VPOKERRESULTUSERINFOVS_FIELD_NUMBER = 4;
        private static final PokerHandResult defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lHandID_;
        private long lRoomID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<Integer> vCommunityCards_;
        private List<PokerResultUserInfo> vPokerResultUserInfovs_;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.PokerHandResult.1 */
        class C00991 extends AbstractParser<PokerHandResult> {
            static {
                fixHelper.fixfunc(new int[]{21109, 21110});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C00991();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements PokerHandResultOrBuilder {
            private int bitField0_;
            private long lHandID_;
            private long lRoomID_;
            private List<Integer> vCommunityCards_;
            private RepeatedFieldBuilder<PokerResultUserInfo, Builder, PokerResultUserInfoOrBuilder> vPokerResultUserInfovsBuilder_;
            private List<PokerResultUserInfo> vPokerResultUserInfovs_;

            static {
                fixHelper.fixfunc(new int[]{19497, 19498, 19499, 19500, 19501, 19502, 19503, 19504, 19505, 19506, 19507, 19508, 19509, 19510, 19511, 19512, 19513, 19514, 19515, 19516, 19517, 19518, 19519, 19520, 19521, 19522, 19523, 19524, 19525, 19526, 19527, 19528, 19529, 19530, 19531, 19532, 19533, 19534, 19535, 19536, 19537, 19538, 19539, 19540, 19541, 19542, 19543, 19544, 19545, 19546, 19547, 19548, 19549, 19550, 19551, 19552, 19553, 19554, 19555, 19556, 19557, 19558, 19559, 19560, 19561, 19562, 19563, 19564});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVCommunityCardsIsMutable();

            private native void ensureVPokerResultUserInfovsIsMutable();

            private native RepeatedFieldBuilder<PokerResultUserInfo, Builder, PokerResultUserInfoOrBuilder> getVPokerResultUserInfovsFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVCommunityCards(Iterable<? extends Integer> iterable);

            public final native Builder addAllVPokerResultUserInfovs(Iterable<? extends PokerResultUserInfo> iterable);

            public final native Builder addVCommunityCards(int i);

            public final native Builder addVPokerResultUserInfovs(int i, Builder builder);

            public final native Builder addVPokerResultUserInfovs(int i, PokerResultUserInfo pokerResultUserInfo);

            public final native Builder addVPokerResultUserInfovs(Builder builder);

            public final native Builder addVPokerResultUserInfovs(PokerResultUserInfo pokerResultUserInfo);

            public final native Builder addVPokerResultUserInfovsBuilder();

            public final native Builder addVPokerResultUserInfovsBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m981build();

            public final native PokerHandResult m982build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m983buildPartial();

            public final native PokerHandResult m984buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m985clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m986clear();

            public final native Builder m987clear();

            public final native Builder clearLHandID();

            public final native Builder clearLRoomID();

            public final native Builder clearVCommunityCards();

            public final native Builder clearVPokerResultUserInfovs();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m988clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m989clone();

            public final native Builder m990clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m991getDefaultInstanceForType();

            public final native PokerHandResult m992getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLHandID();

            public final native long getLRoomID();

            public final native int getVCommunityCards(int i);

            public final native int getVCommunityCardsCount();

            public final native List<Integer> getVCommunityCardsList();

            public final native PokerResultUserInfo getVPokerResultUserInfovs(int i);

            public final native Builder getVPokerResultUserInfovsBuilder(int i);

            public final native List<Builder> getVPokerResultUserInfovsBuilderList();

            public final native int getVPokerResultUserInfovsCount();

            public final native List<PokerResultUserInfo> getVPokerResultUserInfovsList();

            public final native PokerResultUserInfoOrBuilder getVPokerResultUserInfovsOrBuilder(int i);

            public final native List<? extends PokerResultUserInfoOrBuilder> getVPokerResultUserInfovsOrBuilderList();

            public final native boolean hasLHandID();

            public final native boolean hasLRoomID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m993mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m994mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m995mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m996mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m997mergeFrom(Message message);

            public final native Builder mergeFrom(PokerHandResult pokerHandResult);

            public final native Builder removeVPokerResultUserInfovs(int i);

            public final native Builder setLHandID(long j);

            public final native Builder setLRoomID(long j);

            public final native Builder setVCommunityCards(int i, int i2);

            public final native Builder setVPokerResultUserInfovs(int i, Builder builder);

            public final native Builder setVPokerResultUserInfovs(int i, PokerResultUserInfo pokerResultUserInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f30u;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{4742, 4743, 4744, 4745, 4746, 4747, 4748, 4749, 4750, 4751, 4752, 4753, 4754, 4755, 4756, 4757, 4758, 4759, 4760, 4761, 4762, 4763, 4764, 4765, 4766, 4767, 4768, 4769, 4770, 4771, 4772, 4773, 4774, 4775, 4776, 4777});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native PokerHandResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ PokerHandResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, PokerHandResult pokerHandResult);

        private native PokerHandResult(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ PokerHandResult(com.google.protobuf.GeneratedMessage.Builder builder, PokerHandResult pokerHandResult);

        private native PokerHandResult(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m974getDefaultInstanceForType();

        public final native PokerHandResult m975getDefaultInstanceForType();

        public final native long getLHandID();

        public final native long getLRoomID();

        public final native Parser<PokerHandResult> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native int getVCommunityCards(int i);

        public final native int getVCommunityCardsCount();

        public final native List<Integer> getVCommunityCardsList();

        public final native PokerResultUserInfo getVPokerResultUserInfovs(int i);

        public final native int getVPokerResultUserInfovsCount();

        public final native List<PokerResultUserInfo> getVPokerResultUserInfovsList();

        public final native PokerResultUserInfoOrBuilder getVPokerResultUserInfovsOrBuilder(int i);

        public final native List<? extends PokerResultUserInfoOrBuilder> getVPokerResultUserInfovsOrBuilderList();

        public final native boolean hasLHandID();

        public final native boolean hasLRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m976newBuilderForType();

        public final native Builder m977newBuilderForType();

        protected final native Builder m978newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m979toBuilder();

        public final native Builder m980toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static PokerHandResult getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f30u;
        }

        static void __clinit__() {
            PARSER = new C00991();
            PokerHandResult pokerHandResult = new PokerHandResult(true);
            defaultInstance = pokerHandResult;
            pokerHandResult.initFields();
        }

        public static PokerHandResult parseFrom(ByteString byteString) {
            return (PokerHandResult) PARSER.parseFrom(byteString);
        }

        public static PokerHandResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandResult) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PokerHandResult parseFrom(byte[] bArr) {
            return (PokerHandResult) PARSER.parseFrom(bArr);
        }

        public static PokerHandResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandResult) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PokerHandResult parseFrom(InputStream inputStream) {
            return (PokerHandResult) PARSER.parseFrom(inputStream);
        }

        public static PokerHandResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandResult) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static PokerHandResult parseDelimitedFrom(InputStream inputStream) {
            return (PokerHandResult) PARSER.parseDelimitedFrom(inputStream);
        }

        public static PokerHandResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandResult) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static PokerHandResult parseFrom(CodedInputStream codedInputStream) {
            return (PokerHandResult) PARSER.parseFrom(codedInputStream);
        }

        public static PokerHandResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandResult) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(PokerHandResult pokerHandResult) {
            return newBuilder().mergeFrom(pokerHandResult);
        }
    }

    public interface PokerHandSaveInfoOrBuilder extends MessageOrBuilder {
        PokerHandAliasInfo getAliases(int i);

        int getAliasesCount();

        List<PokerHandAliasInfo> getAliasesList();

        PokerHandAliasInfoOrBuilder getAliasesOrBuilder(int i);

        List<? extends PokerHandAliasInfoOrBuilder> getAliasesOrBuilderList();

        PokerHistoryInfo getBaseInfo();

        PokerHistoryInfoOrBuilder getBaseInfoOrBuilder();

        PokerHandResult getHandResult();

        PokerHandResultOrBuilder getHandResultOrBuilder();

        String getLogs(int i);

        ByteString getLogsBytes(int i);

        int getLogsCount();

        ProtocolStringList getLogsList();

        boolean hasBaseInfo();

        boolean hasHandResult();
    }

    public static final class PokerHandSaveInfo extends GeneratedMessage implements PokerHandSaveInfoOrBuilder {
        public static final int ALIASES_FIELD_NUMBER = 4;
        public static final int BASEINFO_FIELD_NUMBER = 1;
        public static final int HANDRESULT_FIELD_NUMBER = 2;
        public static final int LOGS_FIELD_NUMBER = 3;
        public static Parser<PokerHandSaveInfo> PARSER;
        private static final PokerHandSaveInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private List<PokerHandAliasInfo> aliases_;
        private PokerHistoryInfo baseInfo_;
        private int bitField0_;
        private PokerHandResult handResult_;
        private LazyStringList logs_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.PokerHandSaveInfo.1 */
        class C01001 extends AbstractParser<PokerHandSaveInfo> {
            static {
                fixHelper.fixfunc(new int[]{5285, 5286});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01001();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements PokerHandSaveInfoOrBuilder {
            private RepeatedFieldBuilder<PokerHandAliasInfo, Builder, PokerHandAliasInfoOrBuilder> aliasesBuilder_;
            private List<PokerHandAliasInfo> aliases_;
            private SingleFieldBuilder<PokerHistoryInfo, Builder, PokerHistoryInfoOrBuilder> baseInfoBuilder_;
            private PokerHistoryInfo baseInfo_;
            private int bitField0_;
            private SingleFieldBuilder<PokerHandResult, Builder, PokerHandResultOrBuilder> handResultBuilder_;
            private PokerHandResult handResult_;
            private LazyStringList logs_;

            static {
                fixHelper.fixfunc(new int[]{15402, 15403, 15404, 15405, 15406, 15407, 15408, 15409, 15410, 15411, 15412, 15413, 15414, 15415, 15416, 15417, 15418, 15419, 15420, 15421, 15422, 15423, 15424, 15425, 15426, 15427, 15428, 15429, 15430, 15431, 15432, 15433, 15434, 15435, 15436, 15437, 15438, 15439, 15440, 15441, 15442, 15443, 15444, 15445, 15446, 15447, 15448, 15449, 15450, 15451, 15452, 15453, 15454, 15455, 15456, 15457, 15458, 15459, 15460, 15461, 15462, 15463, 15464, 15465, 15466, 15467, 15468, 15469, 15470, 15471, 15472, 15473, 15474, 15475, 15476, 15477, 15478, 15479, 15480, 15481});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureAliasesIsMutable();

            private native void ensureLogsIsMutable();

            private native RepeatedFieldBuilder<PokerHandAliasInfo, Builder, PokerHandAliasInfoOrBuilder> getAliasesFieldBuilder();

            private native SingleFieldBuilder<PokerHistoryInfo, Builder, PokerHistoryInfoOrBuilder> getBaseInfoFieldBuilder();

            private native SingleFieldBuilder<PokerHandResult, Builder, PokerHandResultOrBuilder> getHandResultFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAliases(int i, Builder builder);

            public final native Builder addAliases(int i, PokerHandAliasInfo pokerHandAliasInfo);

            public final native Builder addAliases(Builder builder);

            public final native Builder addAliases(PokerHandAliasInfo pokerHandAliasInfo);

            public final native Builder addAliasesBuilder();

            public final native Builder addAliasesBuilder(int i);

            public final native Builder addAllAliases(Iterable<? extends PokerHandAliasInfo> iterable);

            public final native Builder addAllLogs(Iterable<String> iterable);

            public final native Builder addLogs(String str);

            public final native Builder addLogsBytes(ByteString byteString);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m1005build();

            public final native PokerHandSaveInfo m1006build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m1007buildPartial();

            public final native PokerHandSaveInfo m1008buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1009clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1010clear();

            public final native Builder m1011clear();

            public final native Builder clearAliases();

            public final native Builder clearBaseInfo();

            public final native Builder clearHandResult();

            public final native Builder clearLogs();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1012clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1013clone();

            public final native Builder m1014clone();

            public final native PokerHandAliasInfo getAliases(int i);

            public final native Builder getAliasesBuilder(int i);

            public final native List<Builder> getAliasesBuilderList();

            public final native int getAliasesCount();

            public final native List<PokerHandAliasInfo> getAliasesList();

            public final native PokerHandAliasInfoOrBuilder getAliasesOrBuilder(int i);

            public final native List<? extends PokerHandAliasInfoOrBuilder> getAliasesOrBuilderList();

            public final native PokerHistoryInfo getBaseInfo();

            public final native Builder getBaseInfoBuilder();

            public final native PokerHistoryInfoOrBuilder getBaseInfoOrBuilder();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m1015getDefaultInstanceForType();

            public final native PokerHandSaveInfo m1016getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native PokerHandResult getHandResult();

            public final native Builder getHandResultBuilder();

            public final native PokerHandResultOrBuilder getHandResultOrBuilder();

            public final native String getLogs(int i);

            public final native ByteString getLogsBytes(int i);

            public final native int getLogsCount();

            public final native ProtocolStringList getLogsList();

            public final native boolean hasBaseInfo();

            public final native boolean hasHandResult();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native Builder mergeBaseInfo(PokerHistoryInfo pokerHistoryInfo);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1017mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1018mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1019mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1020mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1021mergeFrom(Message message);

            public final native Builder mergeFrom(PokerHandSaveInfo pokerHandSaveInfo);

            public final native Builder mergeHandResult(PokerHandResult pokerHandResult);

            public final native Builder removeAliases(int i);

            public final native Builder setAliases(int i, Builder builder);

            public final native Builder setAliases(int i, PokerHandAliasInfo pokerHandAliasInfo);

            public final native Builder setBaseInfo(Builder builder);

            public final native Builder setBaseInfo(PokerHistoryInfo pokerHistoryInfo);

            public final native Builder setHandResult(Builder builder);

            public final native Builder setHandResult(PokerHandResult pokerHandResult);

            public final native Builder setLogs(int i, String str);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f32w;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17808, 17809, 17810, 17811, 17812, 17813, 17814, 17815, 17816, 17817, 17818, 17819, 17820, 17821, 17822, 17823, 17824, 17825, 17826, 17827, 17828, 17829, 17830, 17831, 17832, 17833, 17834, 17835, 17836, 17837, 17838, 17839, 17840, 17841, 17842, 17843, 17844, 17845, 17846});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native PokerHandSaveInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ PokerHandSaveInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, PokerHandSaveInfo pokerHandSaveInfo);

        private native PokerHandSaveInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ PokerHandSaveInfo(com.google.protobuf.GeneratedMessage.Builder builder, PokerHandSaveInfo pokerHandSaveInfo);

        private native PokerHandSaveInfo(boolean z);

        private native void initFields();

        public final native PokerHandAliasInfo getAliases(int i);

        public final native int getAliasesCount();

        public final native List<PokerHandAliasInfo> getAliasesList();

        public final native PokerHandAliasInfoOrBuilder getAliasesOrBuilder(int i);

        public final native List<? extends PokerHandAliasInfoOrBuilder> getAliasesOrBuilderList();

        public final native PokerHistoryInfo getBaseInfo();

        public final native PokerHistoryInfoOrBuilder getBaseInfoOrBuilder();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m998getDefaultInstanceForType();

        public final native PokerHandSaveInfo m999getDefaultInstanceForType();

        public final native PokerHandResult getHandResult();

        public final native PokerHandResultOrBuilder getHandResultOrBuilder();

        public final native String getLogs(int i);

        public final native ByteString getLogsBytes(int i);

        public final native int getLogsCount();

        public final native ProtocolStringList getLogsList();

        public final native Parser<PokerHandSaveInfo> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBaseInfo();

        public final native boolean hasHandResult();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1000newBuilderForType();

        public final native Builder m1001newBuilderForType();

        protected final native Builder m1002newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1003toBuilder();

        public final native Builder m1004toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static PokerHandSaveInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f32w;
        }

        static void __clinit__() {
            PARSER = new C01001();
            PokerHandSaveInfo pokerHandSaveInfo = new PokerHandSaveInfo(true);
            defaultInstance = pokerHandSaveInfo;
            pokerHandSaveInfo.initFields();
        }

        public static PokerHandSaveInfo parseFrom(ByteString byteString) {
            return (PokerHandSaveInfo) PARSER.parseFrom(byteString);
        }

        public static PokerHandSaveInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandSaveInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PokerHandSaveInfo parseFrom(byte[] bArr) {
            return (PokerHandSaveInfo) PARSER.parseFrom(bArr);
        }

        public static PokerHandSaveInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandSaveInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PokerHandSaveInfo parseFrom(InputStream inputStream) {
            return (PokerHandSaveInfo) PARSER.parseFrom(inputStream);
        }

        public static PokerHandSaveInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandSaveInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static PokerHandSaveInfo parseDelimitedFrom(InputStream inputStream) {
            return (PokerHandSaveInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static PokerHandSaveInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandSaveInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static PokerHandSaveInfo parseFrom(CodedInputStream codedInputStream) {
            return (PokerHandSaveInfo) PARSER.parseFrom(codedInputStream);
        }

        public static PokerHandSaveInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHandSaveInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(PokerHandSaveInfo pokerHandSaveInfo) {
            return newBuilder().mergeFrom(pokerHandSaveInfo);
        }
    }

    public interface PokerHistoryInfoOrBuilder extends MessageOrBuilder {
        int getBInGame();

        int getIAnte();

        int getIGameType();

        int getIType();

        long getLBigBlind();

        long getLGetPopularity();

        long getLGroupId();

        long getLHandID();

        long getLMaxPot();

        long getLRoomID();

        long getLSaveUuid();

        long getLSmallBlind();

        long getLTime();

        long getLWinUuid();

        String getSPokerDesc();

        ByteString getSPokerDescBytes();

        String getSPokerHistoryName();

        ByteString getSPokerHistoryNameBytes();

        String getSPokerHistoryRoomName();

        ByteString getSPokerHistoryRoomNameBytes();

        String getSPokerHistoryShareUrl();

        ByteString getSPokerHistoryShareUrlBytes();

        String getSPokerHistoryUrl();

        ByteString getSPokerHistoryUrlBytes();

        int getVHandCards(int i);

        int getVHandCardsCount();

        List<Integer> getVHandCardsList();

        boolean hasBInGame();

        boolean hasIAnte();

        boolean hasIGameType();

        boolean hasIType();

        boolean hasLBigBlind();

        boolean hasLGetPopularity();

        boolean hasLGroupId();

        boolean hasLHandID();

        boolean hasLMaxPot();

        boolean hasLRoomID();

        boolean hasLSaveUuid();

        boolean hasLSmallBlind();

        boolean hasLTime();

        boolean hasLWinUuid();

        boolean hasSPokerDesc();

        boolean hasSPokerHistoryName();

        boolean hasSPokerHistoryRoomName();

        boolean hasSPokerHistoryShareUrl();

        boolean hasSPokerHistoryUrl();
    }

    public static final class PokerHistoryInfo extends GeneratedMessage implements PokerHistoryInfoOrBuilder {
        public static final int BINGAME_FIELD_NUMBER = 8;
        public static final int IANTE_FIELD_NUMBER = 16;
        public static final int IGAMETYPE_FIELD_NUMBER = 12;
        public static final int ITYPE_FIELD_NUMBER = 19;
        public static final int LBIGBLIND_FIELD_NUMBER = 7;
        public static final int LGETPOPULARITY_FIELD_NUMBER = 9;
        public static final int LGROUPID_FIELD_NUMBER = 13;
        public static final int LHANDID_FIELD_NUMBER = 3;
        public static final int LMAXPOT_FIELD_NUMBER = 17;
        public static final int LROOMID_FIELD_NUMBER = 2;
        public static final int LSAVEUUID_FIELD_NUMBER = 1;
        public static final int LSMALLBLIND_FIELD_NUMBER = 6;
        public static final int LTIME_FIELD_NUMBER = 5;
        public static final int LWINUUID_FIELD_NUMBER = 20;
        public static Parser<PokerHistoryInfo> PARSER = null;
        public static final int SPOKERDESC_FIELD_NUMBER = 18;
        public static final int SPOKERHISTORYNAME_FIELD_NUMBER = 4;
        public static final int SPOKERHISTORYROOMNAME_FIELD_NUMBER = 11;
        public static final int SPOKERHISTORYSHAREURL_FIELD_NUMBER = 15;
        public static final int SPOKERHISTORYURL_FIELD_NUMBER = 10;
        public static final int VHANDCARDS_FIELD_NUMBER = 14;
        private static final PokerHistoryInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bInGame_;
        private int bitField0_;
        private int iAnte_;
        private int iGameType_;
        private int iType_;
        private long lBigBlind_;
        private long lGetPopularity_;
        private long lGroupId_;
        private long lHandID_;
        private long lMaxPot_;
        private long lRoomID_;
        private long lSaveUuid_;
        private long lSmallBlind_;
        private long lTime_;
        private long lWinUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sPokerDesc_;
        private Object sPokerHistoryName_;
        private Object sPokerHistoryRoomName_;
        private Object sPokerHistoryShareUrl_;
        private Object sPokerHistoryUrl_;
        private final UnknownFieldSet unknownFields;
        private List<Integer> vHandCards_;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo.1 */
        class C01011 extends AbstractParser<PokerHistoryInfo> {
            static {
                fixHelper.fixfunc(new int[]{5732, 5733});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01011();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements PokerHistoryInfoOrBuilder {
            private int bInGame_;
            private int bitField0_;
            private int iAnte_;
            private int iGameType_;
            private int iType_;
            private long lBigBlind_;
            private long lGetPopularity_;
            private long lGroupId_;
            private long lHandID_;
            private long lMaxPot_;
            private long lRoomID_;
            private long lSaveUuid_;
            private long lSmallBlind_;
            private long lTime_;
            private long lWinUuid_;
            private Object sPokerDesc_;
            private Object sPokerHistoryName_;
            private Object sPokerHistoryRoomName_;
            private Object sPokerHistoryShareUrl_;
            private Object sPokerHistoryUrl_;
            private List<Integer> vHandCards_;

            static {
                fixHelper.fixfunc(new int[]{8516, 8517, 8518, 8519, 8520, 8521, 8522, 8523, 8524, 8525, 8526, 8527, 8528, 8529, 8530, 8531, 8532, 8533, 8534, 8535, 8536, 8537, 8538, 8539, 8540, 8541, 8542, 8543, 8544, 8545, 8546, 8547, 8548, 8549, 8550, 8551, 8552, 8553, 8554, 8555, 8556, 8557, 8558, 8559, 8560, 8561, 8562, 8563, 8564, 8565, 8566, 8567, 8568, 8569, 8570, 8571, 8572, 8573, 8574, 8575, 8576, 8577, 8578, 8579, 8580, 8581, 8582, 8583, 8584, 8585, 8586, 8587, 8588, 8589, 8590, 8591, 8592, 8593, 8594, 8595, 8596, 8597, 8598, 8599, 8600, 8601, 8602, 8603, 8604, 8605, 8606, 8607, 8608, 8609, 8610, 8611, 8612, 8613, 8614, 8615, 8616, 8617, 8618, 8619, 8620, 8621, 8622, 8623, 8624, 8625, 8626, 8627, 8628, 8629, 8630, 8631, 8632, 8633, 8634, 8635, 8636, 8637, 8638, 8639, 8640, 8641});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVHandCardsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVHandCards(Iterable<? extends Integer> iterable);

            public final native Builder addVHandCards(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m1029build();

            public final native PokerHistoryInfo m1030build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m1031buildPartial();

            public final native PokerHistoryInfo m1032buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1033clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1034clear();

            public final native Builder m1035clear();

            public final native Builder clearBInGame();

            public final native Builder clearIAnte();

            public final native Builder clearIGameType();

            public final native Builder clearIType();

            public final native Builder clearLBigBlind();

            public final native Builder clearLGetPopularity();

            public final native Builder clearLGroupId();

            public final native Builder clearLHandID();

            public final native Builder clearLMaxPot();

            public final native Builder clearLRoomID();

            public final native Builder clearLSaveUuid();

            public final native Builder clearLSmallBlind();

            public final native Builder clearLTime();

            public final native Builder clearLWinUuid();

            public final native Builder clearSPokerDesc();

            public final native Builder clearSPokerHistoryName();

            public final native Builder clearSPokerHistoryRoomName();

            public final native Builder clearSPokerHistoryShareUrl();

            public final native Builder clearSPokerHistoryUrl();

            public final native Builder clearVHandCards();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1036clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1037clone();

            public final native Builder m1038clone();

            public final native int getBInGame();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m1039getDefaultInstanceForType();

            public final native PokerHistoryInfo m1040getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIAnte();

            public final native int getIGameType();

            public final native int getIType();

            public final native long getLBigBlind();

            public final native long getLGetPopularity();

            public final native long getLGroupId();

            public final native long getLHandID();

            public final native long getLMaxPot();

            public final native long getLRoomID();

            public final native long getLSaveUuid();

            public final native long getLSmallBlind();

            public final native long getLTime();

            public final native long getLWinUuid();

            public final native String getSPokerDesc();

            public final native ByteString getSPokerDescBytes();

            public final native String getSPokerHistoryName();

            public final native ByteString getSPokerHistoryNameBytes();

            public final native String getSPokerHistoryRoomName();

            public final native ByteString getSPokerHistoryRoomNameBytes();

            public final native String getSPokerHistoryShareUrl();

            public final native ByteString getSPokerHistoryShareUrlBytes();

            public final native String getSPokerHistoryUrl();

            public final native ByteString getSPokerHistoryUrlBytes();

            public final native int getVHandCards(int i);

            public final native int getVHandCardsCount();

            public final native List<Integer> getVHandCardsList();

            public final native boolean hasBInGame();

            public final native boolean hasIAnte();

            public final native boolean hasIGameType();

            public final native boolean hasIType();

            public final native boolean hasLBigBlind();

            public final native boolean hasLGetPopularity();

            public final native boolean hasLGroupId();

            public final native boolean hasLHandID();

            public final native boolean hasLMaxPot();

            public final native boolean hasLRoomID();

            public final native boolean hasLSaveUuid();

            public final native boolean hasLSmallBlind();

            public final native boolean hasLTime();

            public final native boolean hasLWinUuid();

            public final native boolean hasSPokerDesc();

            public final native boolean hasSPokerHistoryName();

            public final native boolean hasSPokerHistoryRoomName();

            public final native boolean hasSPokerHistoryShareUrl();

            public final native boolean hasSPokerHistoryUrl();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1041mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1042mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1043mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1044mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1045mergeFrom(Message message);

            public final native Builder mergeFrom(PokerHistoryInfo pokerHistoryInfo);

            public final native Builder setBInGame(int i);

            public final native Builder setIAnte(int i);

            public final native Builder setIGameType(int i);

            public final native Builder setIType(int i);

            public final native Builder setLBigBlind(long j);

            public final native Builder setLGetPopularity(long j);

            public final native Builder setLGroupId(long j);

            public final native Builder setLHandID(long j);

            public final native Builder setLMaxPot(long j);

            public final native Builder setLRoomID(long j);

            public final native Builder setLSaveUuid(long j);

            public final native Builder setLSmallBlind(long j);

            public final native Builder setLTime(long j);

            public final native Builder setLWinUuid(long j);

            public final native Builder setSPokerDesc(String str);

            public final native Builder setSPokerDescBytes(ByteString byteString);

            public final native Builder setSPokerHistoryName(String str);

            public final native Builder setSPokerHistoryNameBytes(ByteString byteString);

            public final native Builder setSPokerHistoryRoomName(String str);

            public final native Builder setSPokerHistoryRoomNameBytes(ByteString byteString);

            public final native Builder setSPokerHistoryShareUrl(String str);

            public final native Builder setSPokerHistoryShareUrlBytes(ByteString byteString);

            public final native Builder setSPokerHistoryUrl(String str);

            public final native Builder setSPokerHistoryUrlBytes(ByteString byteString);

            public final native Builder setVHandCards(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f20k;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17353, 17354, 17355, 17356, 17357, 17358, 17359, 17360, 17361, 17362, 17363, 17364, 17365, 17366, 17367, 17368, 17369, 17370, 17371, 17372, 17373, 17374, 17375, 17376, 17377, 17378, 17379, 17380, 17381, 17382, 17383, 17384, 17385, 17386, 17387, 17388, 17389, 17390, 17391, 17392, 17393, 17394, 17395, 17396, 17397, 17398, 17399, 17400, 17401, 17402, 17403, 17404, 17405, 17406, 17407, 17408, 17409, 17410, 17411, 17412, 17413, 17414, 17415, 17416, 17417, 17418, 17419, 17420, 17421, 17422});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native PokerHistoryInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ PokerHistoryInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, PokerHistoryInfo pokerHistoryInfo);

        private native PokerHistoryInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ PokerHistoryInfo(com.google.protobuf.GeneratedMessage.Builder builder, PokerHistoryInfo pokerHistoryInfo);

        private native PokerHistoryInfo(boolean z);

        private native void initFields();

        public final native int getBInGame();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1022getDefaultInstanceForType();

        public final native PokerHistoryInfo m1023getDefaultInstanceForType();

        public final native int getIAnte();

        public final native int getIGameType();

        public final native int getIType();

        public final native long getLBigBlind();

        public final native long getLGetPopularity();

        public final native long getLGroupId();

        public final native long getLHandID();

        public final native long getLMaxPot();

        public final native long getLRoomID();

        public final native long getLSaveUuid();

        public final native long getLSmallBlind();

        public final native long getLTime();

        public final native long getLWinUuid();

        public final native Parser<PokerHistoryInfo> getParserForType();

        public final native String getSPokerDesc();

        public final native ByteString getSPokerDescBytes();

        public final native String getSPokerHistoryName();

        public final native ByteString getSPokerHistoryNameBytes();

        public final native String getSPokerHistoryRoomName();

        public final native ByteString getSPokerHistoryRoomNameBytes();

        public final native String getSPokerHistoryShareUrl();

        public final native ByteString getSPokerHistoryShareUrlBytes();

        public final native String getSPokerHistoryUrl();

        public final native ByteString getSPokerHistoryUrlBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native int getVHandCards(int i);

        public final native int getVHandCardsCount();

        public final native List<Integer> getVHandCardsList();

        public final native boolean hasBInGame();

        public final native boolean hasIAnte();

        public final native boolean hasIGameType();

        public final native boolean hasIType();

        public final native boolean hasLBigBlind();

        public final native boolean hasLGetPopularity();

        public final native boolean hasLGroupId();

        public final native boolean hasLHandID();

        public final native boolean hasLMaxPot();

        public final native boolean hasLRoomID();

        public final native boolean hasLSaveUuid();

        public final native boolean hasLSmallBlind();

        public final native boolean hasLTime();

        public final native boolean hasLWinUuid();

        public final native boolean hasSPokerDesc();

        public final native boolean hasSPokerHistoryName();

        public final native boolean hasSPokerHistoryRoomName();

        public final native boolean hasSPokerHistoryShareUrl();

        public final native boolean hasSPokerHistoryUrl();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1024newBuilderForType();

        public final native Builder m1025newBuilderForType();

        protected final native Builder m1026newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1027toBuilder();

        public final native Builder m1028toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static PokerHistoryInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f20k;
        }

        static void __clinit__() {
            PARSER = new C01011();
            PokerHistoryInfo pokerHistoryInfo = new PokerHistoryInfo(true);
            defaultInstance = pokerHistoryInfo;
            pokerHistoryInfo.initFields();
        }

        public static PokerHistoryInfo parseFrom(ByteString byteString) {
            return (PokerHistoryInfo) PARSER.parseFrom(byteString);
        }

        public static PokerHistoryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHistoryInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PokerHistoryInfo parseFrom(byte[] bArr) {
            return (PokerHistoryInfo) PARSER.parseFrom(bArr);
        }

        public static PokerHistoryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHistoryInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PokerHistoryInfo parseFrom(InputStream inputStream) {
            return (PokerHistoryInfo) PARSER.parseFrom(inputStream);
        }

        public static PokerHistoryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHistoryInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static PokerHistoryInfo parseDelimitedFrom(InputStream inputStream) {
            return (PokerHistoryInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static PokerHistoryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHistoryInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static PokerHistoryInfo parseFrom(CodedInputStream codedInputStream) {
            return (PokerHistoryInfo) PARSER.parseFrom(codedInputStream);
        }

        public static PokerHistoryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerHistoryInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(PokerHistoryInfo pokerHistoryInfo) {
            return newBuilder().mergeFrom(pokerHistoryInfo);
        }
    }

    public interface PokerProcessInfoOrBuilder extends MessageOrBuilder {
        int getIAnte();

        long getLBigBlind();

        long getLPokerProcessID();

        long getLSaveTime();

        long getLSmallBlind();

        long getLWinStacks();

        UserBaseInfoNet getStSaveUserBaseInfo();

        UserBaseInfoNetOrBuilder getStSaveUserBaseInfoOrBuilder();

        UserBaseInfoNet getStShareUser();

        UserBaseInfoNetOrBuilder getStShareUserOrBuilder();

        String getStrPokerProcessUrl();

        ByteString getStrPokerProcessUrlBytes();

        String getStrRoomName();

        ByteString getStrRoomNameBytes();

        int getVHandCards(int i);

        int getVHandCardsCount();

        List<Integer> getVHandCardsList();

        boolean hasIAnte();

        boolean hasLBigBlind();

        boolean hasLPokerProcessID();

        boolean hasLSaveTime();

        boolean hasLSmallBlind();

        boolean hasLWinStacks();

        boolean hasStSaveUserBaseInfo();

        boolean hasStShareUser();

        boolean hasStrPokerProcessUrl();

        boolean hasStrRoomName();
    }

    public static final class PokerProcessInfo extends GeneratedMessage implements PokerProcessInfoOrBuilder {
        public static final int IANTE_FIELD_NUMBER = 11;
        public static final int LBIGBLIND_FIELD_NUMBER = 5;
        public static final int LPOKERPROCESSID_FIELD_NUMBER = 1;
        public static final int LSAVETIME_FIELD_NUMBER = 10;
        public static final int LSMALLBLIND_FIELD_NUMBER = 6;
        public static final int LWINSTACKS_FIELD_NUMBER = 7;
        public static Parser<PokerProcessInfo> PARSER = null;
        public static final int STRPOKERPROCESSURL_FIELD_NUMBER = 2;
        public static final int STRROOMNAME_FIELD_NUMBER = 4;
        public static final int STSAVEUSERBASEINFO_FIELD_NUMBER = 3;
        public static final int STSHAREUSER_FIELD_NUMBER = 8;
        public static final int VHANDCARDS_FIELD_NUMBER = 9;
        private static final PokerProcessInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iAnte_;
        private long lBigBlind_;
        private long lPokerProcessID_;
        private long lSaveTime_;
        private long lSmallBlind_;
        private long lWinStacks_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private UserBaseInfoNet stSaveUserBaseInfo_;
        private UserBaseInfoNet stShareUser_;
        private Object strPokerProcessUrl_;
        private Object strRoomName_;
        private final UnknownFieldSet unknownFields;
        private List<Integer> vHandCards_;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.1 */
        class C01021 extends AbstractParser<PokerProcessInfo> {
            static {
                fixHelper.fixfunc(new int[]{18740, 18741});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01021();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements PokerProcessInfoOrBuilder {
            private int bitField0_;
            private int iAnte_;
            private long lBigBlind_;
            private long lPokerProcessID_;
            private long lSaveTime_;
            private long lSmallBlind_;
            private long lWinStacks_;
            private SingleFieldBuilder<UserBaseInfoNet, Builder, UserBaseInfoNetOrBuilder> stSaveUserBaseInfoBuilder_;
            private UserBaseInfoNet stSaveUserBaseInfo_;
            private SingleFieldBuilder<UserBaseInfoNet, Builder, UserBaseInfoNetOrBuilder> stShareUserBuilder_;
            private UserBaseInfoNet stShareUser_;
            private Object strPokerProcessUrl_;
            private Object strRoomName_;
            private List<Integer> vHandCards_;

            static {
                fixHelper.fixfunc(new int[]{8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8232, 8233, 8234, 8235, 8236, 8237, 8238, 8239, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8260, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8274, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8287, 8288, 8289, 8290, 8291, 8292, 8293, 8294, 8295, 8296, 8297, 8298, 8299, 8300, 8301, 8302, 8303, 8304, 8305, 8306, 8307, 8308, 8309, 8310, 8311, 8312, 8313, 8314, 8315, 8316});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVHandCardsIsMutable();

            private native SingleFieldBuilder<UserBaseInfoNet, Builder, UserBaseInfoNetOrBuilder> getStSaveUserBaseInfoFieldBuilder();

            private native SingleFieldBuilder<UserBaseInfoNet, Builder, UserBaseInfoNetOrBuilder> getStShareUserFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVHandCards(Iterable<? extends Integer> iterable);

            public final native Builder addVHandCards(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m1053build();

            public final native PokerProcessInfo m1054build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m1055buildPartial();

            public final native PokerProcessInfo m1056buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1057clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1058clear();

            public final native Builder m1059clear();

            public final native Builder clearIAnte();

            public final native Builder clearLBigBlind();

            public final native Builder clearLPokerProcessID();

            public final native Builder clearLSaveTime();

            public final native Builder clearLSmallBlind();

            public final native Builder clearLWinStacks();

            public final native Builder clearStSaveUserBaseInfo();

            public final native Builder clearStShareUser();

            public final native Builder clearStrPokerProcessUrl();

            public final native Builder clearStrRoomName();

            public final native Builder clearVHandCards();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1060clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1061clone();

            public final native Builder m1062clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m1063getDefaultInstanceForType();

            public final native PokerProcessInfo m1064getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIAnte();

            public final native long getLBigBlind();

            public final native long getLPokerProcessID();

            public final native long getLSaveTime();

            public final native long getLSmallBlind();

            public final native long getLWinStacks();

            public final native UserBaseInfoNet getStSaveUserBaseInfo();

            public final native Builder getStSaveUserBaseInfoBuilder();

            public final native UserBaseInfoNetOrBuilder getStSaveUserBaseInfoOrBuilder();

            public final native UserBaseInfoNet getStShareUser();

            public final native Builder getStShareUserBuilder();

            public final native UserBaseInfoNetOrBuilder getStShareUserOrBuilder();

            public final native String getStrPokerProcessUrl();

            public final native ByteString getStrPokerProcessUrlBytes();

            public final native String getStrRoomName();

            public final native ByteString getStrRoomNameBytes();

            public final native int getVHandCards(int i);

            public final native int getVHandCardsCount();

            public final native List<Integer> getVHandCardsList();

            public final native boolean hasIAnte();

            public final native boolean hasLBigBlind();

            public final native boolean hasLPokerProcessID();

            public final native boolean hasLSaveTime();

            public final native boolean hasLSmallBlind();

            public final native boolean hasLWinStacks();

            public final native boolean hasStSaveUserBaseInfo();

            public final native boolean hasStShareUser();

            public final native boolean hasStrPokerProcessUrl();

            public final native boolean hasStrRoomName();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1065mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1066mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1067mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1068mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1069mergeFrom(Message message);

            public final native Builder mergeFrom(PokerProcessInfo pokerProcessInfo);

            public final native Builder mergeStSaveUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder mergeStShareUser(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setIAnte(int i);

            public final native Builder setLBigBlind(long j);

            public final native Builder setLPokerProcessID(long j);

            public final native Builder setLSaveTime(long j);

            public final native Builder setLSmallBlind(long j);

            public final native Builder setLWinStacks(long j);

            public final native Builder setStSaveUserBaseInfo(Builder builder);

            public final native Builder setStSaveUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setStShareUser(Builder builder);

            public final native Builder setStShareUser(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setStrPokerProcessUrl(String str);

            public final native Builder setStrPokerProcessUrlBytes(ByteString byteString);

            public final native Builder setStrRoomName(String str);

            public final native Builder setStrRoomNameBytes(ByteString byteString);

            public final native Builder setVHandCards(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f18i;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{9360, 9361, 9362, 9363, 9364, 9365, 9366, 9367, 9368, 9369, 9370, 9371, 9372, 9373, 9374, 9375, 9376, 9377, 9378, 9379, 9380, 9381, 9382, 9383, 9384, 9385, 9386, 9387, 9388, 9389, 9390, 9391, 9392, 9393, 9394, 9395, 9396, 9397, 9398, 9399, 9400, 9401, 9402, 9403, 9404, 9405, 9406, 9407, 9408, 9409, 9410});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native PokerProcessInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ PokerProcessInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, PokerProcessInfo pokerProcessInfo);

        private native PokerProcessInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ PokerProcessInfo(com.google.protobuf.GeneratedMessage.Builder builder, PokerProcessInfo pokerProcessInfo);

        private native PokerProcessInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1046getDefaultInstanceForType();

        public final native PokerProcessInfo m1047getDefaultInstanceForType();

        public final native int getIAnte();

        public final native long getLBigBlind();

        public final native long getLPokerProcessID();

        public final native long getLSaveTime();

        public final native long getLSmallBlind();

        public final native long getLWinStacks();

        public final native Parser<PokerProcessInfo> getParserForType();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStSaveUserBaseInfo();

        public final native UserBaseInfoNetOrBuilder getStSaveUserBaseInfoOrBuilder();

        public final native UserBaseInfoNet getStShareUser();

        public final native UserBaseInfoNetOrBuilder getStShareUserOrBuilder();

        public final native String getStrPokerProcessUrl();

        public final native ByteString getStrPokerProcessUrlBytes();

        public final native String getStrRoomName();

        public final native ByteString getStrRoomNameBytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native int getVHandCards(int i);

        public final native int getVHandCardsCount();

        public final native List<Integer> getVHandCardsList();

        public final native boolean hasIAnte();

        public final native boolean hasLBigBlind();

        public final native boolean hasLPokerProcessID();

        public final native boolean hasLSaveTime();

        public final native boolean hasLSmallBlind();

        public final native boolean hasLWinStacks();

        public final native boolean hasStSaveUserBaseInfo();

        public final native boolean hasStShareUser();

        public final native boolean hasStrPokerProcessUrl();

        public final native boolean hasStrRoomName();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1048newBuilderForType();

        public final native Builder m1049newBuilderForType();

        protected final native Builder m1050newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1051toBuilder();

        public final native Builder m1052toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static PokerProcessInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f18i;
        }

        static void __clinit__() {
            PARSER = new C01021();
            PokerProcessInfo pokerProcessInfo = new PokerProcessInfo(true);
            defaultInstance = pokerProcessInfo;
            pokerProcessInfo.initFields();
        }

        public static PokerProcessInfo parseFrom(ByteString byteString) {
            return (PokerProcessInfo) PARSER.parseFrom(byteString);
        }

        public static PokerProcessInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerProcessInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PokerProcessInfo parseFrom(byte[] bArr) {
            return (PokerProcessInfo) PARSER.parseFrom(bArr);
        }

        public static PokerProcessInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerProcessInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PokerProcessInfo parseFrom(InputStream inputStream) {
            return (PokerProcessInfo) PARSER.parseFrom(inputStream);
        }

        public static PokerProcessInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerProcessInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static PokerProcessInfo parseDelimitedFrom(InputStream inputStream) {
            return (PokerProcessInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static PokerProcessInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerProcessInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static PokerProcessInfo parseFrom(CodedInputStream codedInputStream) {
            return (PokerProcessInfo) PARSER.parseFrom(codedInputStream);
        }

        public static PokerProcessInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerProcessInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(PokerProcessInfo pokerProcessInfo) {
            return newBuilder().mergeFrom(pokerProcessInfo);
        }
    }

    public interface PokerResultUserInfoOrBuilder extends MessageOrBuilder {
        int getBFlod();

        int getBShowCard(int i);

        int getBShowCardCount();

        List<Integer> getBShowCardList();

        long getLBuyGetStacks();

        long getLBuyInsuranceStacks();

        long getLWinStacks();

        long getUuid();

        int getVGivenHands(int i);

        int getVGivenHandsCount();

        List<Integer> getVGivenHandsList();

        boolean hasBFlod();

        boolean hasLBuyGetStacks();

        boolean hasLBuyInsuranceStacks();

        boolean hasLWinStacks();

        boolean hasUuid();
    }

    public static final class PokerResultUserInfo extends GeneratedMessage implements PokerResultUserInfoOrBuilder {
        public static final int BFLOD_FIELD_NUMBER = 3;
        public static final int BSHOWCARD_FIELD_NUMBER = 5;
        public static final int LBUYGETSTACKS_FIELD_NUMBER = 7;
        public static final int LBUYINSURANCESTACKS_FIELD_NUMBER = 6;
        public static final int LWINSTACKS_FIELD_NUMBER = 2;
        public static Parser<PokerResultUserInfo> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VGIVENHANDS_FIELD_NUMBER = 4;
        private static final PokerResultUserInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bFlod_;
        private List<Integer> bShowCard_;
        private int bitField0_;
        private long lBuyGetStacks_;
        private long lBuyInsuranceStacks_;
        private long lWinStacks_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private List<Integer> vGivenHands_;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.PokerResultUserInfo.1 */
        class C01031 extends AbstractParser<PokerResultUserInfo> {
            static {
                fixHelper.fixfunc(new int[]{19093, 19094});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01031();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements PokerResultUserInfoOrBuilder {
            private int bFlod_;
            private List<Integer> bShowCard_;
            private int bitField0_;
            private long lBuyGetStacks_;
            private long lBuyInsuranceStacks_;
            private long lWinStacks_;
            private long uuid_;
            private List<Integer> vGivenHands_;

            static {
                fixHelper.fixfunc(new int[]{27168, 27169, 27170, 27171, 27172, 27173, 27174, 27175, 27176, 27177, 27178, 27179, 27180, 27181, 27182, 27183, 27184, 27185, 27186, 27187, 27188, 27189, 27190, 27191, 27192, 27193, 27194, 27195, 27196, 27197, 27198, 27199, 27200, 27201, 27202, 27203, 27204, 27205, 27206, 27207, 27208, 27209, 27210, 27211, 27212, 27213, 27214, 27215, 27216, 27217, 27218, 27219, 27220, 27221, 27222, 27223, 27224, 27225, 27226, 27227, 27228, 27229, 27230, 27231, 27232, 27233, 27234, 27235});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureBShowCardIsMutable();

            private native void ensureVGivenHandsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllBShowCard(Iterable<? extends Integer> iterable);

            public final native Builder addAllVGivenHands(Iterable<? extends Integer> iterable);

            public final native Builder addBShowCard(int i);

            public final native Builder addVGivenHands(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m1077build();

            public final native PokerResultUserInfo m1078build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m1079buildPartial();

            public final native PokerResultUserInfo m1080buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1081clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1082clear();

            public final native Builder m1083clear();

            public final native Builder clearBFlod();

            public final native Builder clearBShowCard();

            public final native Builder clearLBuyGetStacks();

            public final native Builder clearLBuyInsuranceStacks();

            public final native Builder clearLWinStacks();

            public final native Builder clearUuid();

            public final native Builder clearVGivenHands();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1084clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1085clone();

            public final native Builder m1086clone();

            public final native int getBFlod();

            public final native int getBShowCard(int i);

            public final native int getBShowCardCount();

            public final native List<Integer> getBShowCardList();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m1087getDefaultInstanceForType();

            public final native PokerResultUserInfo m1088getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLBuyGetStacks();

            public final native long getLBuyInsuranceStacks();

            public final native long getLWinStacks();

            public final native long getUuid();

            public final native int getVGivenHands(int i);

            public final native int getVGivenHandsCount();

            public final native List<Integer> getVGivenHandsList();

            public final native boolean hasBFlod();

            public final native boolean hasLBuyGetStacks();

            public final native boolean hasLBuyInsuranceStacks();

            public final native boolean hasLWinStacks();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1089mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1090mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1091mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1092mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1093mergeFrom(Message message);

            public final native Builder mergeFrom(PokerResultUserInfo pokerResultUserInfo);

            public final native Builder setBFlod(int i);

            public final native Builder setBShowCard(int i, int i2);

            public final native Builder setLBuyGetStacks(long j);

            public final native Builder setLBuyInsuranceStacks(long j);

            public final native Builder setLWinStacks(long j);

            public final native Builder setUuid(long j);

            public final native Builder setVGivenHands(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f28s;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{13951, 13952, 13953, 13954, 13955, 13956, 13957, 13958, 13959, 13960, 13961, 13962, 13963, 13964, 13965, 13966, 13967, 13968, 13969, 13970, 13971, 13972, 13973, 13974, 13975, 13976, 13977, 13978, 13979, 13980, 13981, 13982, 13983, 13984, 13985, 13986, 13987, 13988, 13989, 13990});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native PokerResultUserInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ PokerResultUserInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, PokerResultUserInfo pokerResultUserInfo);

        private native PokerResultUserInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ PokerResultUserInfo(com.google.protobuf.GeneratedMessage.Builder builder, PokerResultUserInfo pokerResultUserInfo);

        private native PokerResultUserInfo(boolean z);

        private native void initFields();

        public final native int getBFlod();

        public final native int getBShowCard(int i);

        public final native int getBShowCardCount();

        public final native List<Integer> getBShowCardList();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1070getDefaultInstanceForType();

        public final native PokerResultUserInfo m1071getDefaultInstanceForType();

        public final native long getLBuyGetStacks();

        public final native long getLBuyInsuranceStacks();

        public final native long getLWinStacks();

        public final native Parser<PokerResultUserInfo> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native int getVGivenHands(int i);

        public final native int getVGivenHandsCount();

        public final native List<Integer> getVGivenHandsList();

        public final native boolean hasBFlod();

        public final native boolean hasLBuyGetStacks();

        public final native boolean hasLBuyInsuranceStacks();

        public final native boolean hasLWinStacks();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1072newBuilderForType();

        public final native Builder m1073newBuilderForType();

        protected final native Builder m1074newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1075toBuilder();

        public final native Builder m1076toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static PokerResultUserInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f28s;
        }

        static void __clinit__() {
            PARSER = new C01031();
            PokerResultUserInfo pokerResultUserInfo = new PokerResultUserInfo(true);
            defaultInstance = pokerResultUserInfo;
            pokerResultUserInfo.initFields();
        }

        public static PokerResultUserInfo parseFrom(ByteString byteString) {
            return (PokerResultUserInfo) PARSER.parseFrom(byteString);
        }

        public static PokerResultUserInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerResultUserInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PokerResultUserInfo parseFrom(byte[] bArr) {
            return (PokerResultUserInfo) PARSER.parseFrom(bArr);
        }

        public static PokerResultUserInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerResultUserInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PokerResultUserInfo parseFrom(InputStream inputStream) {
            return (PokerResultUserInfo) PARSER.parseFrom(inputStream);
        }

        public static PokerResultUserInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerResultUserInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static PokerResultUserInfo parseDelimitedFrom(InputStream inputStream) {
            return (PokerResultUserInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static PokerResultUserInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerResultUserInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static PokerResultUserInfo parseFrom(CodedInputStream codedInputStream) {
            return (PokerResultUserInfo) PARSER.parseFrom(codedInputStream);
        }

        public static PokerResultUserInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PokerResultUserInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(PokerResultUserInfo pokerResultUserInfo) {
            return newBuilder().mergeFrom(pokerResultUserInfo);
        }
    }

    public enum SNG_ROOM_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int DEEP_SNG_VALUE = 4;
        public static final int LONG_SNG_VALUE = 3;
        public static final int NORMAL_SNG_VALUE = 2;
        public static final int QUICK_SNG_VALUE = 1;
        private static final SNG_ROOM_TYPE[] VALUES = null;
        private static EnumLiteMap<SNG_ROOM_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.SNG_ROOM_TYPE.1 */
        class C01041 implements EnumLiteMap<SNG_ROOM_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{25993, 25994});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01041();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{16360, 16361, 16362, 16363});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SNG_ROOM_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            QUICK_SNG = new SNG_ROOM_TYPE("QUICK_SNG", 0, 0, QUICK_SNG_VALUE);
            NORMAL_SNG = new SNG_ROOM_TYPE("NORMAL_SNG", QUICK_SNG_VALUE, QUICK_SNG_VALUE, NORMAL_SNG_VALUE);
            LONG_SNG = new SNG_ROOM_TYPE("LONG_SNG", NORMAL_SNG_VALUE, NORMAL_SNG_VALUE, LONG_SNG_VALUE);
            DEEP_SNG = new SNG_ROOM_TYPE("DEEP_SNG", LONG_SNG_VALUE, LONG_SNG_VALUE, DEEP_SNG_VALUE);
            SNG_ROOM_TYPE[] sng_room_typeArr = new SNG_ROOM_TYPE[DEEP_SNG_VALUE];
            sng_room_typeArr[0] = QUICK_SNG;
            sng_room_typeArr[QUICK_SNG_VALUE] = NORMAL_SNG;
            sng_room_typeArr[NORMAL_SNG_VALUE] = LONG_SNG;
            sng_room_typeArr[LONG_SNG_VALUE] = DEEP_SNG;
            ENUM$VALUES = sng_room_typeArr;
            internalValueMap = new C01041();
            VALUES = values();
        }

        public static SNG_ROOM_TYPE valueOf(int i) {
            switch (i) {
                case QUICK_SNG_VALUE:
                    return QUICK_SNG;
                case NORMAL_SNG_VALUE:
                    return NORMAL_SNG;
                case LONG_SNG_VALUE:
                    return LONG_SNG;
                case DEEP_SNG_VALUE:
                    return DEEP_SNG;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<SNG_ROOM_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerCommon.m11a().getEnumTypes().get(7);
        }

        public static SNG_ROOM_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface SharePokerHistoryInfoOrBuilder extends MessageOrBuilder {
        long getLShareUuid();

        FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

        FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

        boolean hasLShareUuid();

        boolean hasStFavoritePokerHistoryInfo();
    }

    public static final class SharePokerHistoryInfo extends GeneratedMessage implements SharePokerHistoryInfoOrBuilder {
        public static final int LSHAREUUID_FIELD_NUMBER = 1;
        public static Parser<SharePokerHistoryInfo> PARSER = null;
        public static final int STFAVORITEPOKERHISTORYINFO_FIELD_NUMBER = 2;
        private static final SharePokerHistoryInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lShareUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private FavoritePokerHistoryInfo stFavoritePokerHistoryInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.SharePokerHistoryInfo.1 */
        class C01051 extends AbstractParser<SharePokerHistoryInfo> {
            static {
                fixHelper.fixfunc(new int[]{33726, 33727});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01051();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SharePokerHistoryInfoOrBuilder {
            private int bitField0_;
            private long lShareUuid_;
            private SingleFieldBuilder<FavoritePokerHistoryInfo, Builder, FavoritePokerHistoryInfoOrBuilder> stFavoritePokerHistoryInfoBuilder_;
            private FavoritePokerHistoryInfo stFavoritePokerHistoryInfo_;

            static {
                fixHelper.fixfunc(new int[]{9993, 9994, 9995, 9996, 9997, 9998, 9999, 10000, 10001, 10002, 10003, 10004, 10005, 10006, 10007, 10008, 10009, 10010, 10011, 10012, 10013, 10014, 10015, 10016, 10017, 10018, 10019, 10020, 10021, 10022, 10023, 10024, 10025, 10026, 10027, 10028, 10029, 10030, 10031, 10032, 10033, 10034, 10035, 10036, 10037});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<FavoritePokerHistoryInfo, Builder, FavoritePokerHistoryInfoOrBuilder> getStFavoritePokerHistoryInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m1101build();

            public final native SharePokerHistoryInfo m1102build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m1103buildPartial();

            public final native SharePokerHistoryInfo m1104buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1105clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1106clear();

            public final native Builder m1107clear();

            public final native Builder clearLShareUuid();

            public final native Builder clearStFavoritePokerHistoryInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1108clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1109clone();

            public final native Builder m1110clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m1111getDefaultInstanceForType();

            public final native SharePokerHistoryInfo m1112getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLShareUuid();

            public final native FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

            public final native Builder getStFavoritePokerHistoryInfoBuilder();

            public final native FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

            public final native boolean hasLShareUuid();

            public final native boolean hasStFavoritePokerHistoryInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1113mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1114mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1115mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1116mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1117mergeFrom(Message message);

            public final native Builder mergeFrom(SharePokerHistoryInfo sharePokerHistoryInfo);

            public final native Builder mergeStFavoritePokerHistoryInfo(FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public final native Builder setLShareUuid(long j);

            public final native Builder setStFavoritePokerHistoryInfo(Builder builder);

            public final native Builder setStFavoritePokerHistoryInfo(FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f26q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{23769, 23770, 23771, 23772, 23773, 23774, 23775, 23776, 23777, 23778, 23779, 23780, 23781, 23782, 23783, 23784, 23785, 23786, 23787, 23788, 23789, 23790, 23791, 23792, 23793, 23794, 23795, 23796, 23797});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SharePokerHistoryInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SharePokerHistoryInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SharePokerHistoryInfo sharePokerHistoryInfo);

        private native SharePokerHistoryInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SharePokerHistoryInfo(com.google.protobuf.GeneratedMessage.Builder builder, SharePokerHistoryInfo sharePokerHistoryInfo);

        private native SharePokerHistoryInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1094getDefaultInstanceForType();

        public final native SharePokerHistoryInfo m1095getDefaultInstanceForType();

        public final native long getLShareUuid();

        public final native Parser<SharePokerHistoryInfo> getParserForType();

        public final native int getSerializedSize();

        public final native FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

        public final native FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasLShareUuid();

        public final native boolean hasStFavoritePokerHistoryInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1096newBuilderForType();

        public final native Builder m1097newBuilderForType();

        protected final native Builder m1098newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1099toBuilder();

        public final native Builder m1100toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SharePokerHistoryInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f26q;
        }

        static void __clinit__() {
            PARSER = new C01051();
            SharePokerHistoryInfo sharePokerHistoryInfo = new SharePokerHistoryInfo(true);
            defaultInstance = sharePokerHistoryInfo;
            sharePokerHistoryInfo.initFields();
        }

        public static SharePokerHistoryInfo parseFrom(ByteString byteString) {
            return (SharePokerHistoryInfo) PARSER.parseFrom(byteString);
        }

        public static SharePokerHistoryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SharePokerHistoryInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SharePokerHistoryInfo parseFrom(byte[] bArr) {
            return (SharePokerHistoryInfo) PARSER.parseFrom(bArr);
        }

        public static SharePokerHistoryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SharePokerHistoryInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SharePokerHistoryInfo parseFrom(InputStream inputStream) {
            return (SharePokerHistoryInfo) PARSER.parseFrom(inputStream);
        }

        public static SharePokerHistoryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SharePokerHistoryInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SharePokerHistoryInfo parseDelimitedFrom(InputStream inputStream) {
            return (SharePokerHistoryInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SharePokerHistoryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SharePokerHistoryInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SharePokerHistoryInfo parseFrom(CodedInputStream codedInputStream) {
            return (SharePokerHistoryInfo) PARSER.parseFrom(codedInputStream);
        }

        public static SharePokerHistoryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SharePokerHistoryInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SharePokerHistoryInfo sharePokerHistoryInfo) {
            return newBuilder().mergeFrom(sharePokerHistoryInfo);
        }
    }

    public interface UserBaseInfoNetOrBuilder extends MessageOrBuilder {
        DEVICE_TYPE getEDeviceType();

        LANGUAGE_TYPE getELanguageType();

        ID_TYPE getEType();

        VIP_TYPE getEVipType();

        int getIExperience();

        int getIFriendInviteMute();

        int getIGender();

        int getILevel();

        int getIMute();

        int getIVibrate();

        long getLAndroidCoin();

        long getLAndroidPopularity();

        long getLCoin();

        long getLLoginTime();

        long getLPopularity();

        long getLVIPLimitTime();

        String getSBigAlbums(int i);

        ByteString getSBigAlbumsBytes(int i);

        int getSBigAlbumsCount();

        ProtocolStringList getSBigAlbumsList();

        String getSCountryCode();

        ByteString getSCountryCodeBytes();

        String getSRemark();

        ByteString getSRemarkBytes();

        String getSSmallAlbums(int i);

        ByteString getSSmallAlbumsBytes(int i);

        int getSSmallAlbumsCount();

        ProtocolStringList getSSmallAlbumsList();

        String getStrCover();

        ByteString getStrCoverBytes();

        String getStrDesc();

        ByteString getStrDescBytes();

        String getStrID();

        ByteString getStrIDBytes();

        String getStrNick();

        ByteString getStrNickBytes();

        String getStrPhoneNumber();

        ByteString getStrPhoneNumberBytes();

        String getStrSmallCover();

        ByteString getStrSmallCoverBytes();

        long getUuid();

        boolean hasEDeviceType();

        boolean hasELanguageType();

        boolean hasEType();

        boolean hasEVipType();

        boolean hasIExperience();

        boolean hasIFriendInviteMute();

        boolean hasIGender();

        boolean hasILevel();

        boolean hasIMute();

        boolean hasIVibrate();

        boolean hasLAndroidCoin();

        boolean hasLAndroidPopularity();

        boolean hasLCoin();

        boolean hasLLoginTime();

        boolean hasLPopularity();

        boolean hasLVIPLimitTime();

        boolean hasSCountryCode();

        boolean hasSRemark();

        boolean hasStrCover();

        boolean hasStrDesc();

        boolean hasStrID();

        boolean hasStrNick();

        boolean hasStrPhoneNumber();

        boolean hasStrSmallCover();

        boolean hasUuid();
    }

    public static final class UserBaseInfoNet extends GeneratedMessage implements UserBaseInfoNetOrBuilder {
        public static final int EDEVICETYPE_FIELD_NUMBER = 23;
        public static final int ELANGUAGETYPE_FIELD_NUMBER = 24;
        public static final int ETYPE_FIELD_NUMBER = 2;
        public static final int EVIPTYPE_FIELD_NUMBER = 7;
        public static final int IEXPERIENCE_FIELD_NUMBER = 14;
        public static final int IFRIENDINVITEMUTE_FIELD_NUMBER = 27;
        public static final int IGENDER_FIELD_NUMBER = 8;
        public static final int ILEVEL_FIELD_NUMBER = 13;
        public static final int IMUTE_FIELD_NUMBER = 16;
        public static final int IVIBRATE_FIELD_NUMBER = 17;
        public static final int LANDROIDCOIN_FIELD_NUMBER = 21;
        public static final int LANDROIDPOPULARITY_FIELD_NUMBER = 22;
        public static final int LCOIN_FIELD_NUMBER = 11;
        public static final int LLOGINTIME_FIELD_NUMBER = 9;
        public static final int LPOPULARITY_FIELD_NUMBER = 12;
        public static final int LVIPLIMITTIME_FIELD_NUMBER = 15;
        public static Parser<UserBaseInfoNet> PARSER = null;
        public static final int SBIGALBUMS_FIELD_NUMBER = 20;
        public static final int SCOUNTRYCODE_FIELD_NUMBER = 25;
        public static final int SREMARK_FIELD_NUMBER = 26;
        public static final int SSMALLALBUMS_FIELD_NUMBER = 19;
        public static final int STRCOVER_FIELD_NUMBER = 4;
        public static final int STRDESC_FIELD_NUMBER = 10;
        public static final int STRID_FIELD_NUMBER = 3;
        public static final int STRNICK_FIELD_NUMBER = 5;
        public static final int STRPHONENUMBER_FIELD_NUMBER = 6;
        public static final int STRSMALLCOVER_FIELD_NUMBER = 18;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final UserBaseInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DEVICE_TYPE eDeviceType_;
        private LANGUAGE_TYPE eLanguageType_;
        private ID_TYPE eType_;
        private VIP_TYPE eVipType_;
        private int iExperience_;
        private int iFriendInviteMute_;
        private int iGender_;
        private int iLevel_;
        private int iMute_;
        private int iVibrate_;
        private long lAndroidCoin_;
        private long lAndroidPopularity_;
        private long lCoin_;
        private long lLoginTime_;
        private long lPopularity_;
        private long lVIPLimitTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LazyStringList sBigAlbums_;
        private Object sCountryCode_;
        private Object sRemark_;
        private LazyStringList sSmallAlbums_;
        private Object strCover_;
        private Object strDesc_;
        private Object strID_;
        private Object strNick_;
        private Object strPhoneNumber_;
        private Object strSmallCover_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.1 */
        class C01061 extends AbstractParser<UserBaseInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{10271, 10272});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01061();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UserBaseInfoNetOrBuilder {
            private int bitField0_;
            private DEVICE_TYPE eDeviceType_;
            private LANGUAGE_TYPE eLanguageType_;
            private ID_TYPE eType_;
            private VIP_TYPE eVipType_;
            private int iExperience_;
            private int iFriendInviteMute_;
            private int iGender_;
            private int iLevel_;
            private int iMute_;
            private int iVibrate_;
            private long lAndroidCoin_;
            private long lAndroidPopularity_;
            private long lCoin_;
            private long lLoginTime_;
            private long lPopularity_;
            private long lVIPLimitTime_;
            private LazyStringList sBigAlbums_;
            private Object sCountryCode_;
            private Object sRemark_;
            private LazyStringList sSmallAlbums_;
            private Object strCover_;
            private Object strDesc_;
            private Object strID_;
            private Object strNick_;
            private Object strPhoneNumber_;
            private Object strSmallCover_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{22478, 22479, 22480, 22481, 22482, 22483, 22484, 22485, 22486, 22487, 22488, 22489, 22490, 22491, 22492, 22493, 22494, 22495, 22496, 22497, 22498, 22499, 22500, 22501, 22502, 22503, 22504, 22505, 22506, 22507, 22508, 22509, 22510, 22511, 22512, 22513, 22514, 22515, 22516, 22517, 22518, 22519, 22520, 22521, 22522, 22523, 22524, 22525, 22526, 22527, 22528, 22529, 22530, 22531, 22532, 22533, 22534, 22535, 22536, 22537, 22538, 22539, 22540, 22541, 22542, 22543, 22544, 22545, 22546, 22547, 22548, 22549, 22550, 22551, 22552, 22553, 22554, 22555, 22556, 22557, 22558, 22559, 22560, 22561, 22562, 22563, 22564, 22565, 22566, 22567, 22568, 22569, 22570, 22571, 22572, 22573, 22574, 22575, 22576, 22577, 22578, 22579, 22580, 22581, 22582, 22583, 22584, 22585, 22586, 22587, 22588, 22589, 22590, 22591, 22592, 22593, 22594, 22595, 22596, 22597, 22598, 22599, 22600, 22601, 22602, 22603, 22604, 22605, 22606, 22607, 22608, 22609, 22610, 22611, 22612, 22613, 22614, 22615, 22616, 22617, 22618, 22619, 22620, 22621, 22622, 22623, 22624, 22625, 22626, 22627, 22628, 22629, 22630, 22631, 22632, 22633, 22634, 22635, 22636, 22637, 22638, 22639, 22640, 22641, 22642, 22643, 22644, 22645});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureSBigAlbumsIsMutable();

            private native void ensureSSmallAlbumsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllSBigAlbums(Iterable<String> iterable);

            public final native Builder addAllSSmallAlbums(Iterable<String> iterable);

            public final native Builder addSBigAlbums(String str);

            public final native Builder addSBigAlbumsBytes(ByteString byteString);

            public final native Builder addSSmallAlbums(String str);

            public final native Builder addSSmallAlbumsBytes(ByteString byteString);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m1125build();

            public final native UserBaseInfoNet m1126build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m1127buildPartial();

            public final native UserBaseInfoNet m1128buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1129clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1130clear();

            public final native Builder m1131clear();

            public final native Builder clearEDeviceType();

            public final native Builder clearELanguageType();

            public final native Builder clearEType();

            public final native Builder clearEVipType();

            public final native Builder clearIExperience();

            public final native Builder clearIFriendInviteMute();

            public final native Builder clearIGender();

            public final native Builder clearILevel();

            public final native Builder clearIMute();

            public final native Builder clearIVibrate();

            public final native Builder clearLAndroidCoin();

            public final native Builder clearLAndroidPopularity();

            public final native Builder clearLCoin();

            public final native Builder clearLLoginTime();

            public final native Builder clearLPopularity();

            public final native Builder clearLVIPLimitTime();

            public final native Builder clearSBigAlbums();

            public final native Builder clearSCountryCode();

            public final native Builder clearSRemark();

            public final native Builder clearSSmallAlbums();

            public final native Builder clearStrCover();

            public final native Builder clearStrDesc();

            public final native Builder clearStrID();

            public final native Builder clearStrNick();

            public final native Builder clearStrPhoneNumber();

            public final native Builder clearStrSmallCover();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1132clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1133clone();

            public final native Builder m1134clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m1135getDefaultInstanceForType();

            public final native UserBaseInfoNet m1136getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native DEVICE_TYPE getEDeviceType();

            public final native LANGUAGE_TYPE getELanguageType();

            public final native ID_TYPE getEType();

            public final native VIP_TYPE getEVipType();

            public final native int getIExperience();

            public final native int getIFriendInviteMute();

            public final native int getIGender();

            public final native int getILevel();

            public final native int getIMute();

            public final native int getIVibrate();

            public final native long getLAndroidCoin();

            public final native long getLAndroidPopularity();

            public final native long getLCoin();

            public final native long getLLoginTime();

            public final native long getLPopularity();

            public final native long getLVIPLimitTime();

            public final native String getSBigAlbums(int i);

            public final native ByteString getSBigAlbumsBytes(int i);

            public final native int getSBigAlbumsCount();

            public final native ProtocolStringList getSBigAlbumsList();

            public final native String getSCountryCode();

            public final native ByteString getSCountryCodeBytes();

            public final native String getSRemark();

            public final native ByteString getSRemarkBytes();

            public final native String getSSmallAlbums(int i);

            public final native ByteString getSSmallAlbumsBytes(int i);

            public final native int getSSmallAlbumsCount();

            public final native ProtocolStringList getSSmallAlbumsList();

            public final native String getStrCover();

            public final native ByteString getStrCoverBytes();

            public final native String getStrDesc();

            public final native ByteString getStrDescBytes();

            public final native String getStrID();

            public final native ByteString getStrIDBytes();

            public final native String getStrNick();

            public final native ByteString getStrNickBytes();

            public final native String getStrPhoneNumber();

            public final native ByteString getStrPhoneNumberBytes();

            public final native String getStrSmallCover();

            public final native ByteString getStrSmallCoverBytes();

            public final native long getUuid();

            public final native boolean hasEDeviceType();

            public final native boolean hasELanguageType();

            public final native boolean hasEType();

            public final native boolean hasEVipType();

            public final native boolean hasIExperience();

            public final native boolean hasIFriendInviteMute();

            public final native boolean hasIGender();

            public final native boolean hasILevel();

            public final native boolean hasIMute();

            public final native boolean hasIVibrate();

            public final native boolean hasLAndroidCoin();

            public final native boolean hasLAndroidPopularity();

            public final native boolean hasLCoin();

            public final native boolean hasLLoginTime();

            public final native boolean hasLPopularity();

            public final native boolean hasLVIPLimitTime();

            public final native boolean hasSCountryCode();

            public final native boolean hasSRemark();

            public final native boolean hasStrCover();

            public final native boolean hasStrDesc();

            public final native boolean hasStrID();

            public final native boolean hasStrNick();

            public final native boolean hasStrPhoneNumber();

            public final native boolean hasStrSmallCover();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1137mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1138mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1139mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1140mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1141mergeFrom(Message message);

            public final native Builder mergeFrom(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setEDeviceType(DEVICE_TYPE device_type);

            public final native Builder setELanguageType(LANGUAGE_TYPE language_type);

            public final native Builder setEType(ID_TYPE id_type);

            public final native Builder setEVipType(VIP_TYPE vip_type);

            public final native Builder setIExperience(int i);

            public final native Builder setIFriendInviteMute(int i);

            public final native Builder setIGender(int i);

            public final native Builder setILevel(int i);

            public final native Builder setIMute(int i);

            public final native Builder setIVibrate(int i);

            public final native Builder setLAndroidCoin(long j);

            public final native Builder setLAndroidPopularity(long j);

            public final native Builder setLCoin(long j);

            public final native Builder setLLoginTime(long j);

            public final native Builder setLPopularity(long j);

            public final native Builder setLVIPLimitTime(long j);

            public final native Builder setSBigAlbums(int i, String str);

            public final native Builder setSCountryCode(String str);

            public final native Builder setSCountryCodeBytes(ByteString byteString);

            public final native Builder setSRemark(String str);

            public final native Builder setSRemarkBytes(ByteString byteString);

            public final native Builder setSSmallAlbums(int i, String str);

            public final native Builder setStrCover(String str);

            public final native Builder setStrCoverBytes(ByteString byteString);

            public final native Builder setStrDesc(String str);

            public final native Builder setStrDescBytes(ByteString byteString);

            public final native Builder setStrID(String str);

            public final native Builder setStrIDBytes(ByteString byteString);

            public final native Builder setStrNick(String str);

            public final native Builder setStrNickBytes(ByteString byteString);

            public final native Builder setStrPhoneNumber(String str);

            public final native Builder setStrPhoneNumberBytes(ByteString byteString);

            public final native Builder setStrSmallCover(String str);

            public final native Builder setStrSmallCoverBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f12c;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31592, 31593, 31594, 31595, 31596, 31597, 31598, 31599, 31600, 31601, 31602, 31603, 31604, 31605, 31606, 31607, 31608, 31609, 31610, 31611, 31612, 31613, 31614, 31615, 31616, 31617, 31618, 31619, 31620, 31621, 31622, 31623, 31624, 31625, 31626, 31627, 31628, 31629, 31630, 31631, 31632, 31633, 31634, 31635, 31636, 31637, 31638, 31639, 31640, 31641, 31642, 31643, 31644, 31645, 31646, 31647, 31648, 31649, 31650, 31651, 31652, 31653, 31654, 31655, 31656, 31657, 31658, 31659, 31660, 31661, 31662, 31663, 31664, 31665, 31666, 31667, 31668, 31669, 31670, 31671, 31672, 31673, 31674, 31675, 31676, 31677, 31678, 31679, 31680, 31681});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UserBaseInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UserBaseInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UserBaseInfoNet userBaseInfoNet);

        private native UserBaseInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UserBaseInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, UserBaseInfoNet userBaseInfoNet);

        private native UserBaseInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1118getDefaultInstanceForType();

        public final native UserBaseInfoNet m1119getDefaultInstanceForType();

        public final native DEVICE_TYPE getEDeviceType();

        public final native LANGUAGE_TYPE getELanguageType();

        public final native ID_TYPE getEType();

        public final native VIP_TYPE getEVipType();

        public final native int getIExperience();

        public final native int getIFriendInviteMute();

        public final native int getIGender();

        public final native int getILevel();

        public final native int getIMute();

        public final native int getIVibrate();

        public final native long getLAndroidCoin();

        public final native long getLAndroidPopularity();

        public final native long getLCoin();

        public final native long getLLoginTime();

        public final native long getLPopularity();

        public final native long getLVIPLimitTime();

        public final native Parser<UserBaseInfoNet> getParserForType();

        public final native String getSBigAlbums(int i);

        public final native ByteString getSBigAlbumsBytes(int i);

        public final native int getSBigAlbumsCount();

        public final native ProtocolStringList getSBigAlbumsList();

        public final native String getSCountryCode();

        public final native ByteString getSCountryCodeBytes();

        public final native String getSRemark();

        public final native ByteString getSRemarkBytes();

        public final native String getSSmallAlbums(int i);

        public final native ByteString getSSmallAlbumsBytes(int i);

        public final native int getSSmallAlbumsCount();

        public final native ProtocolStringList getSSmallAlbumsList();

        public final native int getSerializedSize();

        public final native String getStrCover();

        public final native ByteString getStrCoverBytes();

        public final native String getStrDesc();

        public final native ByteString getStrDescBytes();

        public final native String getStrID();

        public final native ByteString getStrIDBytes();

        public final native String getStrNick();

        public final native ByteString getStrNickBytes();

        public final native String getStrPhoneNumber();

        public final native ByteString getStrPhoneNumberBytes();

        public final native String getStrSmallCover();

        public final native ByteString getStrSmallCoverBytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEDeviceType();

        public final native boolean hasELanguageType();

        public final native boolean hasEType();

        public final native boolean hasEVipType();

        public final native boolean hasIExperience();

        public final native boolean hasIFriendInviteMute();

        public final native boolean hasIGender();

        public final native boolean hasILevel();

        public final native boolean hasIMute();

        public final native boolean hasIVibrate();

        public final native boolean hasLAndroidCoin();

        public final native boolean hasLAndroidPopularity();

        public final native boolean hasLCoin();

        public final native boolean hasLLoginTime();

        public final native boolean hasLPopularity();

        public final native boolean hasLVIPLimitTime();

        public final native boolean hasSCountryCode();

        public final native boolean hasSRemark();

        public final native boolean hasStrCover();

        public final native boolean hasStrDesc();

        public final native boolean hasStrID();

        public final native boolean hasStrNick();

        public final native boolean hasStrPhoneNumber();

        public final native boolean hasStrSmallCover();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1120newBuilderForType();

        public final native Builder m1121newBuilderForType();

        protected final native Builder m1122newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1123toBuilder();

        public final native Builder m1124toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UserBaseInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f12c;
        }

        static void __clinit__() {
            PARSER = new C01061();
            UserBaseInfoNet userBaseInfoNet = new UserBaseInfoNet(true);
            defaultInstance = userBaseInfoNet;
            userBaseInfoNet.initFields();
        }

        public static UserBaseInfoNet parseFrom(ByteString byteString) {
            return (UserBaseInfoNet) PARSER.parseFrom(byteString);
        }

        public static UserBaseInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UserBaseInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserBaseInfoNet parseFrom(byte[] bArr) {
            return (UserBaseInfoNet) PARSER.parseFrom(bArr);
        }

        public static UserBaseInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UserBaseInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserBaseInfoNet parseFrom(InputStream inputStream) {
            return (UserBaseInfoNet) PARSER.parseFrom(inputStream);
        }

        public static UserBaseInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserBaseInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UserBaseInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (UserBaseInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UserBaseInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserBaseInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UserBaseInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (UserBaseInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static UserBaseInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserBaseInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UserBaseInfoNet userBaseInfoNet) {
            return newBuilder().mergeFrom(userBaseInfoNet);
        }
    }

    public interface UserTokenInfoNetOrBuilder extends MessageOrBuilder {
        String getStrAPNToken();

        ByteString getStrAPNTokenBytes();

        String getStrAndroidFCMAPNToken();

        ByteString getStrAndroidFCMAPNTokenBytes();

        String getStrAndroidXingeAPNToken();

        ByteString getStrAndroidXingeAPNTokenBytes();

        String getStrSSOToken();

        ByteString getStrSSOTokenBytes();

        long getUuid();

        boolean hasStrAPNToken();

        boolean hasStrAndroidFCMAPNToken();

        boolean hasStrAndroidXingeAPNToken();

        boolean hasStrSSOToken();

        boolean hasUuid();
    }

    public static final class UserTokenInfoNet extends GeneratedMessage implements UserTokenInfoNetOrBuilder {
        public static Parser<UserTokenInfoNet> PARSER = null;
        public static final int STRANDROIDFCMAPNTOKEN_FIELD_NUMBER = 5;
        public static final int STRANDROIDXINGEAPNTOKEN_FIELD_NUMBER = 4;
        public static final int STRAPNTOKEN_FIELD_NUMBER = 2;
        public static final int STRSSOTOKEN_FIELD_NUMBER = 3;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final UserTokenInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object strAPNToken_;
        private Object strAndroidFCMAPNToken_;
        private Object strAndroidXingeAPNToken_;
        private Object strSSOToken_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.UserTokenInfoNet.1 */
        class C01071 extends AbstractParser<UserTokenInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{5243, 5244});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01071();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UserTokenInfoNetOrBuilder {
            private int bitField0_;
            private Object strAPNToken_;
            private Object strAndroidFCMAPNToken_;
            private Object strAndroidXingeAPNToken_;
            private Object strSSOToken_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{4971, 4972, 4973, 4974, 4975, 4976, 4977, 4978, 4979, 4980, 4981, 4982, 4983, 4984, 4985, 4986, 4987, 4988, 4989, 4990, 4991, 4992, 4993, 4994, 4995, 4996, 4997, 4998, 4999, 5000, 5001, 5002, 5003, 5004, 5005, 5006, 5007, 5008, 5009, 5010, 5011, 5012, 5013, 5014, 5015, 5016, 5017, 5018, 5019, 5020, 5021, 5022, 5023, 5024, 5025, 5026, 5027, 5028, 5029, 5030});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m1149build();

            public final native UserTokenInfoNet m1150build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m1151buildPartial();

            public final native UserTokenInfoNet m1152buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1153clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1154clear();

            public final native Builder m1155clear();

            public final native Builder clearStrAPNToken();

            public final native Builder clearStrAndroidFCMAPNToken();

            public final native Builder clearStrAndroidXingeAPNToken();

            public final native Builder clearStrSSOToken();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1156clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1157clone();

            public final native Builder m1158clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m1159getDefaultInstanceForType();

            public final native UserTokenInfoNet m1160getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native String getStrAPNToken();

            public final native ByteString getStrAPNTokenBytes();

            public final native String getStrAndroidFCMAPNToken();

            public final native ByteString getStrAndroidFCMAPNTokenBytes();

            public final native String getStrAndroidXingeAPNToken();

            public final native ByteString getStrAndroidXingeAPNTokenBytes();

            public final native String getStrSSOToken();

            public final native ByteString getStrSSOTokenBytes();

            public final native long getUuid();

            public final native boolean hasStrAPNToken();

            public final native boolean hasStrAndroidFCMAPNToken();

            public final native boolean hasStrAndroidXingeAPNToken();

            public final native boolean hasStrSSOToken();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1161mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m1162mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1163mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1164mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m1165mergeFrom(Message message);

            public final native Builder mergeFrom(UserTokenInfoNet userTokenInfoNet);

            public final native Builder setStrAPNToken(String str);

            public final native Builder setStrAPNTokenBytes(ByteString byteString);

            public final native Builder setStrAndroidFCMAPNToken(String str);

            public final native Builder setStrAndroidFCMAPNTokenBytes(ByteString byteString);

            public final native Builder setStrAndroidXingeAPNToken(String str);

            public final native Builder setStrAndroidXingeAPNTokenBytes(ByteString byteString);

            public final native Builder setStrSSOToken(String str);

            public final native Builder setStrSSOTokenBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerCommon.f14e;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{8401, 8402, 8403, 8404, 8405, 8406, 8407, 8408, 8409, 8410, 8411, 8412, 8413, 8414, 8415, 8416, 8417, 8418, 8419, 8420, 8421, 8422, 8423, 8424, 8425, 8426, 8427, 8428, 8429, 8430, 8431, 8432, 8433, 8434, 8435, 8436, 8437, 8438});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UserTokenInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UserTokenInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UserTokenInfoNet userTokenInfoNet);

        private native UserTokenInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UserTokenInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, UserTokenInfoNet userTokenInfoNet);

        private native UserTokenInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m1142getDefaultInstanceForType();

        public final native UserTokenInfoNet m1143getDefaultInstanceForType();

        public final native Parser<UserTokenInfoNet> getParserForType();

        public final native int getSerializedSize();

        public final native String getStrAPNToken();

        public final native ByteString getStrAPNTokenBytes();

        public final native String getStrAndroidFCMAPNToken();

        public final native ByteString getStrAndroidFCMAPNTokenBytes();

        public final native String getStrAndroidXingeAPNToken();

        public final native ByteString getStrAndroidXingeAPNTokenBytes();

        public final native String getStrSSOToken();

        public final native ByteString getStrSSOTokenBytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasStrAPNToken();

        public final native boolean hasStrAndroidFCMAPNToken();

        public final native boolean hasStrAndroidXingeAPNToken();

        public final native boolean hasStrSSOToken();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1144newBuilderForType();

        public final native Builder m1145newBuilderForType();

        protected final native Builder m1146newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m1147toBuilder();

        public final native Builder m1148toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UserTokenInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerCommon.f14e;
        }

        static void __clinit__() {
            PARSER = new C01071();
            UserTokenInfoNet userTokenInfoNet = new UserTokenInfoNet(true);
            defaultInstance = userTokenInfoNet;
            userTokenInfoNet.initFields();
        }

        public static UserTokenInfoNet parseFrom(ByteString byteString) {
            return (UserTokenInfoNet) PARSER.parseFrom(byteString);
        }

        public static UserTokenInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UserTokenInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserTokenInfoNet parseFrom(byte[] bArr) {
            return (UserTokenInfoNet) PARSER.parseFrom(bArr);
        }

        public static UserTokenInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UserTokenInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserTokenInfoNet parseFrom(InputStream inputStream) {
            return (UserTokenInfoNet) PARSER.parseFrom(inputStream);
        }

        public static UserTokenInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserTokenInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UserTokenInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (UserTokenInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UserTokenInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserTokenInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UserTokenInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (UserTokenInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static UserTokenInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserTokenInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UserTokenInfoNet userTokenInfoNet) {
            return newBuilder().mergeFrom(userTokenInfoNet);
        }
    }

    public enum VIP_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int BLACK_CARD_VALUE = 4;
        public static final int BLUE_CARD_VALUE = 1;
        public static final int GOLD_CARD_VALUE = 2;
        public static final int PLATINUM_CARD_VALUE = 3;
        private static final VIP_TYPE[] VALUES = null;
        private static EnumLiteMap<VIP_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerCommon.VIP_TYPE.1 */
        class C01081 implements EnumLiteMap<VIP_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{4710, 4711});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01081();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{15549, 15550, 15551, 15552});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native VIP_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            BLUE_CARD = new VIP_TYPE("BLUE_CARD", 0, 0, BLUE_CARD_VALUE);
            GOLD_CARD = new VIP_TYPE("GOLD_CARD", BLUE_CARD_VALUE, BLUE_CARD_VALUE, GOLD_CARD_VALUE);
            PLATINUM_CARD = new VIP_TYPE("PLATINUM_CARD", GOLD_CARD_VALUE, GOLD_CARD_VALUE, PLATINUM_CARD_VALUE);
            BLACK_CARD = new VIP_TYPE("BLACK_CARD", PLATINUM_CARD_VALUE, PLATINUM_CARD_VALUE, BLACK_CARD_VALUE);
            VIP_TYPE[] vip_typeArr = new VIP_TYPE[BLACK_CARD_VALUE];
            vip_typeArr[0] = BLUE_CARD;
            vip_typeArr[BLUE_CARD_VALUE] = GOLD_CARD;
            vip_typeArr[GOLD_CARD_VALUE] = PLATINUM_CARD;
            vip_typeArr[PLATINUM_CARD_VALUE] = BLACK_CARD;
            ENUM$VALUES = vip_typeArr;
            internalValueMap = new C01081();
            VALUES = values();
        }

        public static VIP_TYPE valueOf(int i) {
            switch (i) {
                case BLUE_CARD_VALUE:
                    return BLUE_CARD;
                case GOLD_CARD_VALUE:
                    return GOLD_CARD;
                case PLATINUM_CARD_VALUE:
                    return PLATINUM_CARD;
                case BLACK_CARD_VALUE:
                    return BLACK_CARD;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<VIP_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerCommon.m11a().getEnumTypes().get(BLUE_CARD_VALUE);
        }

        public static VIP_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static FileDescriptor m11a() {
        return f9I;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TexasPokerCmd.m0a()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016TexasPokerCommon.proto\u0012\ntexaspoker\u001a\u0013TexasPokerCmd.proto\"F\n\nBannerInfo\u0012\u0011\n\tsImageUrl\u0018\u0001 \u0002(\t\u0012\u0012\n\nsTargetUrl\u0018\u0002 \u0002(\t\u0012\u0011\n\tlBannerID\u0018\u0003 \u0001(\u0003\"\u0081\u0005\n\u000fUserBaseInfoNet\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\"\n\u0005eType\u0018\u0002 \u0002(\u000e2\u0013.texaspoker.ID_TYPE\u0012\r\n\u0005strID\u0018\u0003 \u0002(\t\u0012\u0010\n\bstrCover\u0018\u0004 \u0002(\t\u0012\u000f\n\u0007strNick\u0018\u0005 \u0001(\t\u0012\u0016\n\u000estrPhoneNumber\u0018\u0006 \u0001(\t\u0012&\n\beVipType\u0018\u0007 \u0001(\u000e2\u0014.texaspoker.VIP_TYPE\u0012\u000f\n\u0007iGender\u0018\b \u0001(\u0005\u0012\u0012\n\nlLoginTime\u0018\t \u0001(\u0003\u0012\u000f\n\u0007strDesc\u0018\n \u0001(\t\u0012\r\n\u0005lCoin\u0018\u000b \u0001(\u0003\u0012\u0013\n\u000blPopularity\u0018\f ", "\u0001(\u0003\u0012\u000e\n\u0006iLevel\u0018\r \u0001(\u0005\u0012\u0013\n\u000biExperience\u0018\u000e \u0001(\u0005\u0012\u0015\n\rlVIPLimitTime\u0018\u000f \u0001(\u0003\u0012\r\n\u0005iMute\u0018\u0010 \u0001(\u0005\u0012\u0010\n\biVibrate\u0018\u0011 \u0001(\u0005\u0012\u0015\n\rstrSmallCover\u0018\u0012 \u0001(\t\u0012\u0014\n\fsSmallAlbums\u0018\u0013 \u0003(\t\u0012\u0012\n\nsBigAlbums\u0018\u0014 \u0003(\t\u0012\u0014\n\flAndroidCoin\u0018\u0015 \u0001(\u0003\u0012\u001a\n\u0012lAndroidPopularity\u0018\u0016 \u0001(\u0003\u0012,\n\u000beDeviceType\u0018\u0017 \u0001(\u000e2\u0017.texaspoker.DEVICE_TYPE\u00120\n\reLanguageType\u0018\u0018 \u0001(\u000e2\u0019.texaspoker.LANGUAGE_TYPE\u0012\u0014\n\fsCountryCode\u0018\u0019 \u0001(\t\u0012\u000f\n\u0007sRemark\u0018\u001a \u0001(\t\u0012\u0019\n\u0011iFriendInviteMute\u0018\u001b \u0001(\u0005\"\u008a\u0001\n\u0010UserTokenInfoNet\u0012\f\n\u0004uu", "id\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000bstrAPNToken\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bstrSSOToken\u0018\u0003 \u0001(\t\u0012\u001f\n\u0017strAndroidXingeAPNToken\u0018\u0004 \u0001(\t\u0012\u001d\n\u0015strAndroidFCMAPNToken\u0018\u0005 \u0001(\t\"\u0084\u0001\n\fGameItemInfo\u0012\u000f\n\u0007iItemID\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tsItemName\u0018\u0002 \u0002(\t\u0012\u0011\n\tsItemIcon\u0018\u0003 \u0001(\t\u0012\u0011\n\tiItemType\u0018\u0004 \u0001(\u0005\u0012\u0010\n\biItemNum\u0018\u0005 \u0001(\u0005\u0012\u0018\n\u0010sItemDescription\u0018\u0006 \u0001(\t\"\u00b9\u0002\n\u0010PokerProcessInfo\u0012\u0017\n\u000flPokerProcessID\u0018\u0001 \u0002(\u0003\u0012\u001a\n\u0012strPokerProcessUrl\u0018\u0002 \u0002(\t\u00127\n\u0012stSaveUserBaseInfo\u0018\u0003 \u0002(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012\u0013\n\u000bstrRoomName\u0018\u0004 \u0002(", "\t\u0012\u0011\n\tlBigBlind\u0018\u0005 \u0002(\u0003\u0012\u0013\n\u000blSmallBlind\u0018\u0006 \u0002(\u0003\u0012\u0012\n\nlWinStacks\u0018\u0007 \u0002(\u0003\u00120\n\u000bstShareUser\u0018\b \u0002(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012\u0012\n\nvHandCards\u0018\t \u0003(\u0005\u0012\u0011\n\tlSaveTime\u0018\n \u0001(\u0003\u0012\r\n\u0005iAnte\u0018\u000b \u0001(\u0005\"\u00a8\u0003\n\u0010PokerHistoryInfo\u0012\u0011\n\tlSaveUuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lRoomID\u0018\u0002 \u0002(\u0003\u0012\u000f\n\u0007lHandID\u0018\u0003 \u0002(\u0003\u0012\u0019\n\u0011sPokerHistoryName\u0018\u0004 \u0002(\t\u0012\r\n\u0005lTime\u0018\u0005 \u0002(\u0003\u0012\u0013\n\u000blSmallBlind\u0018\u0006 \u0002(\u0003\u0012\u0011\n\tlBigBlind\u0018\u0007 \u0002(\u0003\u0012\u000f\n\u0007bInGame\u0018\b \u0002(\u0005\u0012\u0016\n\u000elGetPopularity\u0018\t \u0001(\u0003\u0012\u0018\n\u0010sPokerHistoryUrl\u0018\n \u0001(\t\u0012\u001d\n\u0015sPokerHi", "storyRoomName\u0018\u000b \u0001(\t\u0012\u0011\n\tiGameType\u0018\f \u0001(\u0005\u0012\u0010\n\blGroupId\u0018\r \u0001(\u0003\u0012\u0012\n\nvHandCards\u0018\u000e \u0003(\u0005\u0012\u001d\n\u0015sPokerHistoryShareUrl\u0018\u000f \u0001(\t\u0012\r\n\u0005iAnte\u0018\u0010 \u0001(\u0005\u0012\u000f\n\u0007lMaxPot\u0018\u0011 \u0001(\u0003\u0012\u0012\n\nsPokerDesc\u0018\u0012 \u0001(\t\u0012\r\n\u0005iType\u0018\u0013 \u0001(\u0005\u0012\u0010\n\blWinUuid\u0018\u0014 \u0001(\u0003\"\u009d\u0001\n\u0018FavoritePokerHistoryInfo\u0012\u0015\n\rlFavoriteUuid\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rsFavoriteName\u0018\u0002 \u0002(\t\u00128\n\u0012stPokerHistoryInfo\u0018\u0003 \u0002(\u000b2\u001c.texaspoker.PokerHistoryInfo\u0012\u0019\n\u0011lFavoriteSaveTime\u0018\u0004 \u0001(\u0003\"\u00b0\u0002\n\u0015BravoPokerHistoryInfo\u0012\u000f\n\u0007lRoomID\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007l", "HandID\u0018\u0002 \u0002(\u0003\u0012\r\n\u0005iType\u0018\u0003 \u0002(\u0005\u0012\u0010\n\blWinUuid\u0018\u0004 \u0001(\u0003\u0012\u0011\n\tsNickName\u0018\u0005 \u0001(\t\u0012\u0012\n\nsSmallIcon\u0018\u0006 \u0001(\t\u0012\r\n\u0005sDesc\u0018\u0007 \u0001(\t\u0012\u000f\n\u0007lMaxPot\u0018\b \u0001(\u0003\u0012\u0018\n\u0010sPokerHistoryUrl\u0018\t \u0001(\t\u0012\u001d\n\u0015sPokerHistoryShareUrl\u0018\n \u0001(\t\u0012\u0012\n\nvHandCards\u0018\u000b \u0003(\u0005\u0012\u0019\n\u0011sPokerHistoryName\u0018\f \u0002(\t\u0012\u0012\n\nsPokerDesc\u0018\r \u0001(\t\u0012\u0011\n\tlSaveUuid\u0018\u000e \u0002(\u0003\"u\n\u0015SharePokerHistoryInfo\u0012\u0012\n\nlShareUuid\u0018\u0001 \u0002(\u0003\u0012H\n\u001astFavoritePokerHistoryInfo\u0018\u0002 \u0002(\u000b2$.texaspoker.FavoritePokerHistoryInfo\"\u00a2\u0001\n\u0013PokerResultUserIn", "fo\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0012\n\nlWinStacks\u0018\u0002 \u0002(\u0003\u0012\r\n\u0005bFlod\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000bvGivenHands\u0018\u0004 \u0003(\u0005\u0012\u0011\n\tbShowCard\u0018\u0005 \u0003(\u0005\u0012\u001b\n\u0013lBuyInsuranceStacks\u0018\u0006 \u0001(\u0003\u0012\u0015\n\rlBuyGetStacks\u0018\u0007 \u0001(\u0003\"\u008d\u0001\n\u000fPokerHandResult\u0012\u000f\n\u0007lRoomID\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lHandID\u0018\u0002 \u0002(\u0003\u0012\u0017\n\u000fvCommunityCards\u0018\u0003 \u0003(\u0005\u0012?\n\u0016vPokerResultUserInfovs\u0018\u0004 \u0003(\u000b2\u001f.texaspoker.PokerResultUserInfo\"\u00b3\u0001\n\u0011PokerHandSaveInfo\u0012.\n\bbaseInfo\u0018\u0001 \u0002(\u000b2\u001c.texaspoker.PokerHistoryInfo\u0012/\n\nhandResult\u0018\u0002 \u0002(\u000b2\u001b.texaspoker.PokerHand", "Result\u0012\f\n\u0004logs\u0018\u0003 \u0003(\t\u0012/\n\u0007aliases\u0018\u0004 \u0003(\u000b2\u001e.texaspoker.PokerHandAliasInfo\"2\n\u0012PokerHandAliasInfo\u0012\r\n\u0005lUuid\u0018\u0001 \u0002(\u0003\u0012\r\n\u0005alias\u0018\u0002 \u0002(\t\"\u00c2\u0001\n\u0007Package\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004head\u0018\u0002 \u0002(\f\u0012\u0016\n\u000elMisSystemTime\u0018\u0003 \u0001(\u0003\u0012\f\n\u0004body\u0018\u0004 \u0002(\f\u0012\u001a\n\u0012lCurrentSystemTime\u0018\u0005 \u0001(\u0003\u0012\u000e\n\u0006iSeqNo\u0018\u0006 \u0002(\u0003\u0012#\n\u0004eCmd\u0018\u0007 \u0002(\u000e2\u0015.texaspoker.TEXAS_CMD\u0012\u0013\n\u000bcEncodeType\u0018\b \u0002(\u0005\u0012\u000f\n\u0007version\u0018\t \u0001(\u0005\"s\n\tCmdResult\u0012\u000e\n\u0006iCmdId\u0018\u0001 \u0002(\u0005\u0012-\n\beErrCode\u0018\u0002 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0012\n\nst", "rErrDesc\u0018\u0003 \u0002(\t\u0012\u0013\n\u000biSubErrCode\u0018\u0004 \u0001(\u0005\"\u009a\u0001\n\u0006Header\u0012\r\n\u0005shVer\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tlCurrTime\u0018\u0002 \u0002(\u0003\u0012/\n\nstUserInfo\u0018\u0003 \u0002(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012'\n\bstResult\u0018\u0004 \u0001(\u000b2\u0015.texaspoker.CmdResult\u0012\u0014\n\fsAccessToken\u0018\u0005 \u0001(\t\"\u00ca\u0003\n\fClubBaseInfo\u0012\u000f\n\u0007lClubID\u0018\u0001 \u0002(\u0003\u00129\n\u0014stCreateUserBaseInfo\u0018\u0002 \u0002(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012\u0011\n\tsClubName\u0018\u0003 \u0002(\t\u0012\u0015\n\rsClubLocation\u0018\u0004 \u0002(\t\u0012\u0014\n\fsSmallAlbums\u0018\u0005 \u0003(\t\u0012\u0012\n\nsBigAlbums\u0018\u0006 \u0003(\t\u0012\r\n\u0005lFund\u0018\u0007 \u0001(\u0003\u0012\u0012\n\nsSmallIcon\u0018\b", " \u0001(\t\u0012\u0010\n\bsBigIcon\u0018\t \u0001(\t\u0012\r\n\u0005sDesc\u0018\n \u0001(\t\u0012\u0014\n\fbClubMsgMute\u0018\u000b \u0001(\u0005\u0012\u0017\n\u000fbClubMsgVibrate\u0018\f \u0001(\u0005\u0012\u000f\n\u0007bVerify\u0018\r \u0001(\u0005\u0012\u0012\n\niClubLevel\u0018\u000e \u0001(\u0005\u0012\u0017\n\u000fiClubExperience\u0018\u000f \u0001(\u0005\u0012\u0013\n\u000blCreateTime\u0018\u0010 \u0001(\u0003\u0012\u0013\n\u000biMaxMembers\u0018\u0011 \u0001(\u0005\u0012\u0013\n\u000biCurMembers\u0018\u0012 \u0001(\u0005\u0012\u0012\n\nlClubScore\u0018\u0013 \u0001(\u0003\u0012\u0016\n\u000eiManagerCreate\u0018\u0014 \u0001(\u0005*\u0082\u0001\n\u0007ID_TYPE\u0012\u0015\n\u0011ID_TYPE_SINAWEIBO\u0010\u0001\u0012\u0013\n\u000fID_TYPE_QQWEIBO\u0010\u0002\u0012\u0012\n\u000eID_TYPE_RENREN\u0010\u0003\u0012\u0011\n\rID_TYPE_PHONE\u0010\u0004\u0012\u000e\n\nID_TYPE_NA\u0010\u0005\u0012\u0014\n\u0010ID_TYPE_FACEBOOK\u0010\u0006*K\n\bVIP_TYPE\u0012\r", "\n\tBLUE_CARD\u0010\u0001\u0012\r\n\tGOLD_CARD\u0010\u0002\u0012\u0011\n\rPLATINUM_CARD\u0010\u0003\u0012\u000e\n\nBLACK_CARD\u0010\u0004*;\n\u000bDEVICE_TYPE\u0012\u0013\n\u000fDEVICE_TYPE_IOS\u0010\u0001\u0012\u0017\n\u0013DEVICE_TYPE_ANDROID\u0010\u0002*w\n\rLANGUAGE_TYPE\u0012$\n LANGUAGE_TYPE_SIMPLIFIED_CHINESE\u0010\u0001\u0012\u0019\n\u0015LANGUAGE_TYPE_ENGLISH\u0010\u0002\u0012%\n!LANGUAGE_TYPE_TRADITIONAL_CHINESE\u0010\u0003*\u00a8\u001f\n\u000fERROR_CODE_TYPE\u0012\u001b\n\u0017ERROR_CODE_TYPE_SUCCESS\u0010\u0000\u0012\u001b\n\u0017ERROR_CODE_TYPE_NO_USER\u0010\u0001\u0012\u001f\n\u001bERROR_CODE_TYPE_NO_CHATROOM\u0010\u0002\u0012'\n#ERROR_CODE_TYPE_REGISTER_USER_EXIST\u0010\u0003\u0012%\n", "!ERROR_CODE_TYPE_VERIFY_CODE_ERROR\u0010\u0004\u0012 \n\u001cERROR_CODE_TYPE_ID_PWD_ERROR\u0010\u0005\u0012$\n ERROR_CODE_TYPE_FRIEND_NOT_EXIST\u0010\u0006\u0012\u001f\n\u001bERROR_CODE_TYPE_NOT_INVITED\u0010\u0007\u0012%\n!ERROR_CODE_TYPE_CHATROOM_OVERFLOW\u0010\b\u0012%\n!ERROR_CODE_TYPE_GAMEROOM_OVERFLOW\u0010\t\u0012 \n\u001cERROR_CODE_TYPE_SERVER_ERROR\u0010\n\u0012 \n\u001cERROR_CODE_TYPE_NO_GAME_ROOM\u0010\u000b\u0012\"\n\u001eERROR_CODE_TYPE_GAME_ROOM_FULL\u0010\f\u0012)\n%ERROR_CODE_TYPE_NOT_ENOUGH_POPULARITY\u0010\r\u0012\u001e\n\u001aERROR_CODE_TYPE_NOT_FRIEND\u0010\u000e\u0012 ", "\n\u001cERROR_CODE_TYPE_SHARE_ENOUGH\u0010\u000f\u0012!\n\u001dERROR_CODE_TYPE_MORE_REWARDED\u0010\u0010\u0012\u001b\n\u0017ERROR_CODE_TYPE_NO_BILL\u0010\u0011\u0012\u001f\n\u001bERROR_CODE_TYPE_NO_FAVORITE\u0010\u0012\u0012'\n#ERROR_CODE_TYPE_FAVORITE_DATA_ERROR\u0010\u0013\u0012#\n\u001fERROR_CODE_TYPE_NO_SELLING_ITEM\u0010\u0014\u0012#\n\u001fERROR_CODE_TYPE_NOT_ENOUGH_COIN\u0010\u0015\u0012+\n'ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM\u0010\u0016\u00120\n,ERROR_CODE_TYPE_NO_AUTH_REMOVE_CHATROOM_USER\u0010\u0017\u0012+\n'ERROR_CODE_TYPE_NO_AUTH_MODIFY_CHATROOM\u0010\u0018\u00120\n,ERROR_CODE_T", "YPE_NO_AUTH_MODIFY_CHATROOM_USER\u0010\u0019\u0012'\n#ERROR_CODE_TYPE_NO_USER_IN_CHATROOM\u0010\u001a\u0012'\n#ERROR_CODE_TYPE_LOGIN_KICKOFF_ERROR\u0010\u001b\u0012\u001b\n\u0017ERROR_CODE_TYPE_UNKNOWN\u0010\u001c\u0012!\n\u001dERROR_CODE_TYPE_NO_USER_INPOS\u0010\u001d\u0012\u001f\n\u001bERROR_CODE_TYPE_BUY_LOW_VIP\u0010\u001e\u0012*\n&ERROR_CODE_TYPE_NO_AUTH_START_GAMEROOM\u0010\u001f\u0012\"\n\u001eERROR_CODE_TYPE_FRIEND_ALREADY\u0010 \u0012'\n#ERROR_CODE_TYPE_OFFLINE_GAME_OVERED\u0010!\u0012!\n\u001dERROR_CODE_TYPE_CLUB_OVERFLOW\u0010\"\u0012\u001b\n\u0017ERROR_CODE_TYPE_NO_CLUB\u0010#\u0012 ", "\n\u001cERROR_CODE_TYPE_NO_CLUB_AUTH\u0010$\u0012 \n\u001cERROR_CODE_TYPE_CLUB_NO_USER\u0010%\u00121\n-ERROR_CODE_TYPE_CREATE_QUICK_GAMEROOM_ALREADY\u0010&\u0012%\n!ERROR_CODE_TYPE_NO_QUICK_GAMEROOM\u0010'\u00120\n,ERROR_CODE_TYPE_QUICK_GAMEROOM_ALREADY_START\u0010(\u0012%\n!ERROR_CODE_TYPE_NO_USER_GET_MONEY\u0010)\u0012-\n)ERROR_CODE_TYPE_NO_USER_IN_QUICK_GAMEROOM\u0010*\u0012$\n ERROR_CODE_TYPE_NO_TRANSACTIONID\u0010+\u0012(\n$ERROR_CODE_TYPE_TRANSACTIONID_REPEAT\u0010,\u0012'\n#ERROR_CODE_TYPE_TRANSACT", "IONID_ERROR\u0010-\u0012$\n ERROR_CODE_TYPE_BUYIN_MAX_STACKS\u0010.\u0012&\n\"ERROR_CODE_TYPE_GET_BENFIT_ALREADY\u0010/\u0012)\n%ERROR_CODE_TYPE_CLUB_MAX_MEMBER_LIMIT\u00100\u0012'\n#ERROR_CODE_TYPE_CLUB_NO_AUTH_MANAGE\u00101\u0012$\n ERROR_CODE_TYPE_CLUB_NO_MORE_MAX\u00102\u0012*\n&ERROR_CODE_TYPE_NICKNAME_NOT_AVAILABLE\u00103\u0012'\n#ERROR_CODE_TYPE_NO_SENIOR_GAME_ROOM\u00104\u0012'\n#ERROR_CODE_TYPE_NOT_GAME_ROOM_OWNER\u00105\u0012!\n\u001dERROR_CODE_TYPE_NO_HANDRESULT\u00106\u0012\"\n\u001eERROR_CODE_TYPE_NO_BEF", "ORE_GAME\u00107\u0012#\n\u001fERROR_CODE_TYPE_NO_POKERHISTORY\u00108\u0012(\n$ERROR_CODE_TYPE_ALREADY_INVITE_BUYIN\u00109\u0012#\n\u001fERROR_CODE_TYPE_NO_USER_IN_GAME\u0010:\u0012#\n\u001fERROR_CODE_TYPE_NO_INVITE_BUYIN\u0010;\u0012'\n#ERROR_CODE_TYPE_NO_AUTH_BUYINACTION\u0010<\u0012\u001a\n\u0016ERROR_CODE_TYPE_PAUSED\u0010=\u0012'\n#ERROR_CODE_TYPE_ERROR_PAUSE_COMMAND\u0010>\u0012\u001d\n\u0019ERROR_CODE_TYPE_NOT_START\u0010?\u0012\u001d\n\u0019ERROR_CODE_TYPE_NOT_OWNER\u0010@\u0012#\n\u001fERROR_CODE_TYPE_USER_ALREADY_IN\u0010A\u0012%\n!ERROR_CODE_TYPE_FAVORITE", "_OVERFLOW\u0010B\u0012.\n*ERROR_CODE_TYPE_SNG_GAMEROOM_ALREADY_START\u0010C\u0012)\n%ERROR_CODE_TYPE_SNG_BUYINCONTROL_WAIT\u0010D\u0012)\n%ERROR_CODE_TYPE_BUYINCONTROL_NO_MONEY\u0010E\u0012)\n%ERROR_CODE_TYPE_SERVER_MAINTENANCEING\u0010F\u0012!\n\u001dERROR_CODE_TYPE_SET_INSURANCE\u0010G\u0012%\n!ERROR_CODE_TYPE_NOT_ALLOW_STANDUP\u0010H\u0012!\n\u001dERROR_CODE_TYPE_TOKEN_EXPIRED\u0010I\u0012\u001b\n\u0017ERROR_CODE_TYPE_BLACKED\u0010J\u0012\"\n\u001eERROR_CODE_TYPE_IP_CHECK_ERROR\u0010K\u0012#\n\u001fERROR_CODE_TYPE_GPS_CHECK_ERROR\u0010L\u0012", ")\n%ERROR_CODE_TYPE_IP_CHECK_NOT_ENTIRELY\u0010M\u0012*\n&ERROR_CODE_TYPE_GPS_CHECK_NOT_ENTIRELY\u0010N\u0012\u001e\n\u001aERROR_CODE_TYPE_NOT_SITTED\u0010O\u0012)\n%ERROR_CODE_TYPE_BUYIN_LBS_CHECK_ERROR\u0010P\u0012#\n\u001fERROR_CODE_TYPE_LEAGUE_OVERFLOW\u0010Q\u0012)\n%ERROR_CODE_TYPE_LEAGUE_NO_AUTH_MANAGE\u0010R\u0012*\n&ERROR_CODE_TYPE_CREATE_LEAGUE_OVERFLOW\u0010S\u0012&\n\"ERROR_CODE_TYPE_IN_LEAGUE_OVERFLOW\u0010T\u0012)\n%ERROR_CODE_TYPE_LEAGUE_NO_AUTH_CREATE\u0010U\u0012\u001d\n\u0019ERROR_CODE_TYPE_NO_LEAGUE\u0010V\u0012", "&\n\"ERROR_CODE_TYPE_LEAGUE_NO_AUTH_GET\u0010W\u0012.\n*ERROR_CODE_TYPE_LEAGUE_BUYIN_NOT_SAME_CLUB\u0010X\u0012\u001f\n\u001bERROR_CODE_TYPE_LEAGUE_MUTE\u0010Y\u0012%\n!ERROR_CODE_TYPE_IN_LEAGUE_ALREADY\u0010Z\u0012!\n\u001dERROR_CODE_TYPE_NOT_IN_LEAGUE\u0010[\u0012*\n&ERROR_CODE_TYPE_INVITED_LEAGUE_ALREADY\u0010\\\u0012$\n ERROR_CODE_TYPE_LEAGUE_SAME_NAME\u0010]\u0012%\n!ERROR_CODE_TYPE_CLUB_MANAGER_FULL\u0010^\u0012(\n$ERROR_CODE_TYPE_CLUB_LEAGUE_OVERFLOW\u0010_\u0012&\n\"ERROR_CODE_TYPE_INVITE_FRIEND_MUTE\u0010`\u0012*\n", "&ERROR_CODE_TYPE_CLUB_NOT_REMOVE_LEAGUE\u0010a\u0012+\n'ERROR_CODE_TYPE_LEAGUE_NOT_IN_WHITELIST\u0010b\u0012+\n&ERROR_CODE_TYPE_MINI_GAME_INVALID_USER\u0010\u00a9F\u0012'\n\"ERROR_CODE_TYPE_MINI_GAME_NO_MONEY\u0010\u00aaF\u0012*\n%ERROR_CODE_TYPE_MINI_GAME_INVALID_CMD\u0010\u00abF\u0012&\n!ERROR_CODE_TYPE_MINI_GAME_TIMEOUT\u0010\u00acF*E\n\u0010CREATE_ROOM_TYPE\u0012\r\n\tCAHT_ROOM\u0010\u0001\u0012\r\n\tCLUB_ROOM\u0010\u0002\u0012\u0013\n\u000fQUICK_GAME_ROOM\u0010\u0003*\u00a0\u0001\n\u000eGAME_ROOM_TYPE\u0012\u0014\n\u0010GAME_ROOM_NORMAL\u0010\u0001\u0012\u0011\n\rGAME_ROOM_SNG\u0010\u0002\u0012\u001e\n\u001aGAME_ROOM", "_NORMAL_INSURANCE\u0010\u0003\u0012\u0011\n\rGAME_ROOM_SIX\u0010\u0004\u0012\u0013\n\u000fGAME_ROOM_OMAHA\u0010\u0005\u0012\u001d\n\u0019GAME_ROOM_OMAHA_INSURANCE\u0010\u0006*J\n\rSNG_ROOM_TYPE\u0012\r\n\tQUICK_SNG\u0010\u0001\u0012\u000e\n\nNORMAL_SNG\u0010\u0002\u0012\f\n\bLONG_SNG\u0010\u0003\u0012\f\n\bDEEP_SNG\u0010\u0004B)\n\u0015com.texaspoker.momentB\u0010TexasPokerCommon"}, fileDescriptorArr, new C00831());
        f10a = (Descriptor) f9I.getMessageTypes().get(0);
        f11b = new FieldAccessorTable(f10a, new String[]{"SImageUrl", "STargetUrl", "LBannerID"});
        f12c = (Descriptor) f9I.getMessageTypes().get(1);
        f13d = new FieldAccessorTable(f12c, new String[]{"Uuid", "EType", "StrID", "StrCover", "StrNick", "StrPhoneNumber", "EVipType", "IGender", "LLoginTime", "StrDesc", "LCoin", "LPopularity", "ILevel", "IExperience", "LVIPLimitTime", "IMute", "IVibrate", "StrSmallCover", "SSmallAlbums", "SBigAlbums", "LAndroidCoin", "LAndroidPopularity", "EDeviceType", "ELanguageType", "SCountryCode", "SRemark", "IFriendInviteMute"});
        f14e = (Descriptor) f9I.getMessageTypes().get(2);
        f15f = new FieldAccessorTable(f14e, new String[]{"Uuid", "StrAPNToken", "StrSSOToken", "StrAndroidXingeAPNToken", "StrAndroidFCMAPNToken"});
        f16g = (Descriptor) f9I.getMessageTypes().get(3);
        f17h = new FieldAccessorTable(f16g, new String[]{"IItemID", "SItemName", "SItemIcon", "IItemType", "IItemNum", "SItemDescription"});
        f18i = (Descriptor) f9I.getMessageTypes().get(4);
        f19j = new FieldAccessorTable(f18i, new String[]{"LPokerProcessID", "StrPokerProcessUrl", "StSaveUserBaseInfo", "StrRoomName", "LBigBlind", "LSmallBlind", "LWinStacks", "StShareUser", "VHandCards", "LSaveTime", "IAnte"});
        f20k = (Descriptor) f9I.getMessageTypes().get(5);
        f21l = new FieldAccessorTable(f20k, new String[]{"LSaveUuid", "LRoomID", "LHandID", "SPokerHistoryName", "LTime", "LSmallBlind", "LBigBlind", "BInGame", "LGetPopularity", "SPokerHistoryUrl", "SPokerHistoryRoomName", "IGameType", "LGroupId", "VHandCards", "SPokerHistoryShareUrl", "IAnte", "LMaxPot", "SPokerDesc", "IType", "LWinUuid"});
        f22m = (Descriptor) f9I.getMessageTypes().get(6);
        f23n = new FieldAccessorTable(f22m, new String[]{"LFavoriteUuid", "SFavoriteName", "StPokerHistoryInfo", "LFavoriteSaveTime"});
        f24o = (Descriptor) f9I.getMessageTypes().get(7);
        f25p = new FieldAccessorTable(f24o, new String[]{"LRoomID", "LHandID", "IType", "LWinUuid", "SNickName", "SSmallIcon", "SDesc", "LMaxPot", "SPokerHistoryUrl", "SPokerHistoryShareUrl", "VHandCards", "SPokerHistoryName", "SPokerDesc", "LSaveUuid"});
        f26q = (Descriptor) f9I.getMessageTypes().get(8);
        f27r = new FieldAccessorTable(f26q, new String[]{"LShareUuid", "StFavoritePokerHistoryInfo"});
        f28s = (Descriptor) f9I.getMessageTypes().get(9);
        f29t = new FieldAccessorTable(f28s, new String[]{"Uuid", "LWinStacks", "BFlod", "VGivenHands", "BShowCard", "LBuyInsuranceStacks", "LBuyGetStacks"});
        f30u = (Descriptor) f9I.getMessageTypes().get(10);
        f31v = new FieldAccessorTable(f30u, new String[]{"LRoomID", "LHandID", "VCommunityCards", "VPokerResultUserInfovs"});
        f32w = (Descriptor) f9I.getMessageTypes().get(11);
        f33x = new FieldAccessorTable(f32w, new String[]{"BaseInfo", "HandResult", "Logs", "Aliases"});
        f34y = (Descriptor) f9I.getMessageTypes().get(12);
        f35z = new FieldAccessorTable(f34y, new String[]{"LUuid", "Alias"});
        f1A = (Descriptor) f9I.getMessageTypes().get(13);
        f2B = new FieldAccessorTable(f1A, new String[]{"Uuid", "Head", "LMisSystemTime", "Body", "LCurrentSystemTime", "ISeqNo", "ECmd", "CEncodeType", "Version"});
        f3C = (Descriptor) f9I.getMessageTypes().get(14);
        f4D = new FieldAccessorTable(f3C, new String[]{"ICmdId", "EErrCode", "StrErrDesc", "ISubErrCode"});
        f5E = (Descriptor) f9I.getMessageTypes().get(15);
        f6F = new FieldAccessorTable(f5E, new String[]{"ShVer", "LCurrTime", "StUserInfo", "StResult", "SAccessToken"});
        f7G = (Descriptor) f9I.getMessageTypes().get(16);
        f8H = new FieldAccessorTable(f7G, new String[]{"LClubID", "StCreateUserBaseInfo", "SClubName", "SClubLocation", "SSmallAlbums", "SBigAlbums", "LFund", "SSmallIcon", "SBigIcon", "SDesc", "BClubMsgMute", "BClubMsgVibrate", "BVerify", "IClubLevel", "IClubExperience", "LCreateTime", "IMaxMembers", "ICurMembers", "LClubScore", "IManagerCreate"});
        TexasPokerCmd.m0a();
    }
}
