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
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.ID_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.io.InputStream;
import java.util.List;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

public final class TexasPokerHttpUser {
    private static final Descriptor f270A;
    private static FieldAccessorTable f271B;
    private static final Descriptor f272C;
    private static FieldAccessorTable f273D;
    private static final Descriptor f274E;
    private static FieldAccessorTable f275F;
    private static final Descriptor f276G;
    private static FieldAccessorTable f277H;
    private static final Descriptor f278I;
    private static FieldAccessorTable f279J;
    private static final Descriptor f280K;
    private static FieldAccessorTable f281L;
    private static final Descriptor f282M;
    private static FieldAccessorTable f283N;
    private static final Descriptor f284O;
    private static FieldAccessorTable f285P;
    private static final Descriptor f286Q;
    private static FieldAccessorTable f287R;
    private static final Descriptor f288S;
    private static FieldAccessorTable f289T;
    private static final Descriptor f290U;
    private static FieldAccessorTable f291V;
    private static final Descriptor f292W;
    private static FieldAccessorTable f293X;
    private static final Descriptor f294Y;
    private static FieldAccessorTable f295Z;
    private static final Descriptor f296a;
    private static final Descriptor aA;
    private static FieldAccessorTable aB;
    private static final Descriptor aC;
    private static FieldAccessorTable aD;
    private static final Descriptor aE;
    private static FieldAccessorTable aF;
    private static final Descriptor aG;
    private static FieldAccessorTable aH;
    private static final Descriptor aI;
    private static FieldAccessorTable aJ;
    private static final Descriptor aK;
    private static FieldAccessorTable aL;
    private static final Descriptor aM;
    private static FieldAccessorTable aN;
    private static final Descriptor aO;
    private static FieldAccessorTable aP;
    private static final Descriptor aQ;
    private static FieldAccessorTable aR;
    private static final Descriptor aS;
    private static FieldAccessorTable aT;
    private static final Descriptor aU;
    private static FieldAccessorTable aV;
    private static final Descriptor aW;
    private static FieldAccessorTable aX;
    private static final Descriptor aY;
    private static FieldAccessorTable aZ;
    private static final Descriptor aa;
    private static FieldAccessorTable ab;
    private static final Descriptor ac;
    private static FieldAccessorTable ad;
    private static final Descriptor ae;
    private static FieldAccessorTable af;
    private static final Descriptor ag;
    private static FieldAccessorTable ah;
    private static final Descriptor ai;
    private static FieldAccessorTable aj;
    private static final Descriptor ak;
    private static FieldAccessorTable al;
    private static final Descriptor am;
    private static FieldAccessorTable an;
    private static final Descriptor ao;
    private static FieldAccessorTable ap;
    private static final Descriptor aq;
    private static FieldAccessorTable ar;
    private static final Descriptor as;
    private static FieldAccessorTable at;
    private static final Descriptor au;
    private static FieldAccessorTable av;
    private static final Descriptor aw;
    private static FieldAccessorTable ax;
    private static final Descriptor ay;
    private static FieldAccessorTable az;
    private static FieldAccessorTable f297b;
    private static FileDescriptor ba;
    private static final Descriptor f298c;
    private static FieldAccessorTable f299d;
    private static final Descriptor f300e;
    private static FieldAccessorTable f301f;
    private static final Descriptor f302g;
    private static FieldAccessorTable f303h;
    private static final Descriptor f304i;
    private static FieldAccessorTable f305j;
    private static final Descriptor f306k;
    private static FieldAccessorTable f307l;
    private static final Descriptor f308m;
    private static FieldAccessorTable f309n;
    private static final Descriptor f310o;
    private static FieldAccessorTable f311p;
    private static final Descriptor f312q;
    private static FieldAccessorTable f313r;
    private static final Descriptor f314s;
    private static FieldAccessorTable f315t;
    private static final Descriptor f316u;
    private static FieldAccessorTable f317v;
    private static final Descriptor f318w;
    private static FieldAccessorTable f319x;
    private static final Descriptor f320y;
    private static FieldAccessorTable f321z;

    /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.1 */
    class C02991 implements InternalDescriptorAssigner {
        static {
            fixHelper.fixfunc(new int[]{26061, 26062});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C02991();

        public final native ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
    }

    public interface AchievementInfoNetOrBuilder extends MessageOrBuilder {
        int getIAchievementID();

        String getSAchievementDescription();

        ByteString getSAchievementDescriptionBytes();

        String getSAchievementIcon();

        ByteString getSAchievementIconBytes();

        String getSAchievementName();

        ByteString getSAchievementNameBytes();

        boolean hasIAchievementID();

        boolean hasSAchievementDescription();

        boolean hasSAchievementIcon();

        boolean hasSAchievementName();
    }

    public static final class AchievementInfoNet extends GeneratedMessage implements AchievementInfoNetOrBuilder {
        public static final int IACHIEVEMENTID_FIELD_NUMBER = 1;
        public static Parser<AchievementInfoNet> PARSER = null;
        public static final int SACHIEVEMENTDESCRIPTION_FIELD_NUMBER = 4;
        public static final int SACHIEVEMENTICON_FIELD_NUMBER = 3;
        public static final int SACHIEVEMENTNAME_FIELD_NUMBER = 2;
        private static final AchievementInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iAchievementID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sAchievementDescription_;
        private Object sAchievementIcon_;
        private Object sAchievementName_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.AchievementInfoNet.1 */
        class C03001 extends AbstractParser<AchievementInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{30161, 30162});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03001();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements AchievementInfoNetOrBuilder {
            private int bitField0_;
            private int iAchievementID_;
            private Object sAchievementDescription_;
            private Object sAchievementIcon_;
            private Object sAchievementName_;

            static {
                fixHelper.fixfunc(new int[]{33840, 33841, 33842, 33843, 33844, 33845, 33846, 33847, 33848, 33849, 33850, 33851, 33852, 33853, 33854, 33855, 33856, 33857, 33858, 33859, 33860, 33861, 33862, 33863, 33864, 33865, 33866, 33867, 33868, 33869, 33870, 33871, 33872, 33873, 33874, 33875, 33876, 33877, 33878, 33879, 33880, 33881, 33882, 33883, 33884, 33885, 33886, 33887, 33888, 33889, 33890, 33891, 33892, 33893});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7106build();

            public final native AchievementInfoNet m7107build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7108buildPartial();

            public final native AchievementInfoNet m7109buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7110clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7111clear();

            public final native Builder m7112clear();

            public final native Builder clearIAchievementID();

            public final native Builder clearSAchievementDescription();

            public final native Builder clearSAchievementIcon();

            public final native Builder clearSAchievementName();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7113clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7114clone();

            public final native Builder m7115clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7116getDefaultInstanceForType();

            public final native AchievementInfoNet m7117getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIAchievementID();

            public final native String getSAchievementDescription();

            public final native ByteString getSAchievementDescriptionBytes();

            public final native String getSAchievementIcon();

            public final native ByteString getSAchievementIconBytes();

            public final native String getSAchievementName();

            public final native ByteString getSAchievementNameBytes();

            public final native boolean hasIAchievementID();

            public final native boolean hasSAchievementDescription();

            public final native boolean hasSAchievementIcon();

            public final native boolean hasSAchievementName();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7118mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7119mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7120mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7121mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7122mergeFrom(Message message);

            public final native Builder mergeFrom(AchievementInfoNet achievementInfoNet);

            public final native Builder setIAchievementID(int i);

            public final native Builder setSAchievementDescription(String str);

            public final native Builder setSAchievementDescriptionBytes(ByteString byteString);

            public final native Builder setSAchievementIcon(String str);

            public final native Builder setSAchievementIconBytes(ByteString byteString);

            public final native Builder setSAchievementName(String str);

            public final native Builder setSAchievementNameBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f316u;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17649, 17650, 17651, 17652, 17653, 17654, 17655, 17656, 17657, 17658, 17659, 17660, 17661, 17662, 17663, 17664, 17665, 17666, 17667, 17668, 17669, 17670, 17671, 17672, 17673, 17674, 17675, 17676, 17677, 17678, 17679, 17680, 17681, 17682, 17683});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native AchievementInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ AchievementInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, AchievementInfoNet achievementInfoNet);

        private native AchievementInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ AchievementInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, AchievementInfoNet achievementInfoNet);

        private native AchievementInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7099getDefaultInstanceForType();

        public final native AchievementInfoNet m7100getDefaultInstanceForType();

        public final native int getIAchievementID();

        public final native Parser<AchievementInfoNet> getParserForType();

        public final native String getSAchievementDescription();

        public final native ByteString getSAchievementDescriptionBytes();

        public final native String getSAchievementIcon();

        public final native ByteString getSAchievementIconBytes();

        public final native String getSAchievementName();

        public final native ByteString getSAchievementNameBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasIAchievementID();

        public final native boolean hasSAchievementDescription();

        public final native boolean hasSAchievementIcon();

        public final native boolean hasSAchievementName();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7101newBuilderForType();

        public final native Builder m7102newBuilderForType();

        protected final native Builder m7103newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7104toBuilder();

        public final native Builder m7105toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static AchievementInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f316u;
        }

        static void __clinit__() {
            PARSER = new C03001();
            AchievementInfoNet achievementInfoNet = new AchievementInfoNet(true);
            defaultInstance = achievementInfoNet;
            achievementInfoNet.initFields();
        }

        public static AchievementInfoNet parseFrom(ByteString byteString) {
            return (AchievementInfoNet) PARSER.parseFrom(byteString);
        }

        public static AchievementInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AchievementInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AchievementInfoNet parseFrom(byte[] bArr) {
            return (AchievementInfoNet) PARSER.parseFrom(bArr);
        }

        public static AchievementInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AchievementInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AchievementInfoNet parseFrom(InputStream inputStream) {
            return (AchievementInfoNet) PARSER.parseFrom(inputStream);
        }

        public static AchievementInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AchievementInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static AchievementInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (AchievementInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static AchievementInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AchievementInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static AchievementInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (AchievementInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static AchievementInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AchievementInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(AchievementInfoNet achievementInfoNet) {
            return newBuilder().mergeFrom(achievementInfoNet);
        }
    }

    public interface CSBuyNicknameOrBuilder extends MessageOrBuilder {
        String getSNickname();

        ByteString getSNicknameBytes();

        long getUuid();

        boolean hasSNickname();

        boolean hasUuid();
    }

    public static final class CSBuyNickname extends GeneratedMessage implements CSBuyNicknameOrBuilder {
        public static Parser<CSBuyNickname> PARSER = null;
        public static final int SNICKNAME_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSBuyNickname defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sNickname_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSBuyNickname.1 */
        class C03011 extends AbstractParser<CSBuyNickname> {
            static {
                fixHelper.fixfunc(new int[]{21528, 21529});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03011();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSBuyNicknameOrBuilder {
            private int bitField0_;
            private Object sNickname_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{14662, 14663, 14664, 14665, 14666, 14667, 14668, 14669, 14670, 14671, 14672, 14673, 14674, 14675, 14676, 14677, 14678, 14679, 14680, 14681, 14682, 14683, 14684, 14685, 14686, 14687, 14688, 14689, 14690, 14691, 14692, 14693, 14694, 14695, 14696, 14697, 14698, 14699, 14700, 14701, 14702, 14703});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7130build();

            public final native CSBuyNickname m7131build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7132buildPartial();

            public final native CSBuyNickname m7133buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7134clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7135clear();

            public final native Builder m7136clear();

            public final native Builder clearSNickname();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7137clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7138clone();

            public final native Builder m7139clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7140getDefaultInstanceForType();

            public final native CSBuyNickname m7141getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native String getSNickname();

            public final native ByteString getSNicknameBytes();

            public final native long getUuid();

            public final native boolean hasSNickname();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7142mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7143mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7144mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7145mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7146mergeFrom(Message message);

            public final native Builder mergeFrom(CSBuyNickname cSBuyNickname);

            public final native Builder setSNickname(String str);

            public final native Builder setSNicknameBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aO;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14370, 14371, 14372, 14373, 14374, 14375, 14376, 14377, 14378, 14379, 14380, 14381, 14382, 14383, 14384, 14385, 14386, 14387, 14388, 14389, 14390, 14391, 14392, 14393, 14394, 14395, 14396, 14397, 14398});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSBuyNickname(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSBuyNickname(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSBuyNickname cSBuyNickname);

        private native CSBuyNickname(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSBuyNickname(com.google.protobuf.GeneratedMessage.Builder builder, CSBuyNickname cSBuyNickname);

        private native CSBuyNickname(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7123getDefaultInstanceForType();

        public final native CSBuyNickname m7124getDefaultInstanceForType();

        public final native Parser<CSBuyNickname> getParserForType();

        public final native String getSNickname();

        public final native ByteString getSNicknameBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasSNickname();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7125newBuilderForType();

        public final native Builder m7126newBuilderForType();

        protected final native Builder m7127newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7128toBuilder();

        public final native Builder m7129toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSBuyNickname getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aO;
        }

        static void __clinit__() {
            PARSER = new C03011();
            CSBuyNickname cSBuyNickname = new CSBuyNickname(true);
            defaultInstance = cSBuyNickname;
            cSBuyNickname.initFields();
        }

        public static CSBuyNickname parseFrom(ByteString byteString) {
            return (CSBuyNickname) PARSER.parseFrom(byteString);
        }

        public static CSBuyNickname parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyNickname) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSBuyNickname parseFrom(byte[] bArr) {
            return (CSBuyNickname) PARSER.parseFrom(bArr);
        }

        public static CSBuyNickname parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyNickname) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSBuyNickname parseFrom(InputStream inputStream) {
            return (CSBuyNickname) PARSER.parseFrom(inputStream);
        }

        public static CSBuyNickname parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyNickname) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSBuyNickname parseDelimitedFrom(InputStream inputStream) {
            return (CSBuyNickname) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSBuyNickname parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyNickname) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSBuyNickname parseFrom(CodedInputStream codedInputStream) {
            return (CSBuyNickname) PARSER.parseFrom(codedInputStream);
        }

        public static CSBuyNickname parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSBuyNickname) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSBuyNickname cSBuyNickname) {
            return newBuilder().mergeFrom(cSBuyNickname);
        }
    }

    public interface CSCheckNicknameStatusOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSCheckNicknameStatus extends GeneratedMessage implements CSCheckNicknameStatusOrBuilder {
        public static Parser<CSCheckNicknameStatus> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSCheckNicknameStatus defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSCheckNicknameStatus.1 */
        class C03021 extends AbstractParser<CSCheckNicknameStatus> {
            static {
                fixHelper.fixfunc(new int[]{32177, 32178});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03021();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSCheckNicknameStatusOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{22442, 22443, 22444, 22445, 22446, 22447, 22448, 22449, 22450, 22451, 22452, 22453, 22454, 22455, 22456, 22457, 22458, 22459, 22460, 22461, 22462, 22463, 22464, 22465, 22466, 22467, 22468, 22469, 22470, 22471, 22472, 22473, 22474, 22475, 22476, 22477});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7154build();

            public final native CSCheckNicknameStatus m7155build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7156buildPartial();

            public final native CSCheckNicknameStatus m7157buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7158clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7159clear();

            public final native Builder m7160clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7161clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7162clone();

            public final native Builder m7163clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7164getDefaultInstanceForType();

            public final native CSCheckNicknameStatus m7165getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7166mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7167mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7168mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7169mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7170mergeFrom(Message message);

            public final native Builder mergeFrom(CSCheckNicknameStatus cSCheckNicknameStatus);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aS;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{34097, 34098, 34099, 34100, 34101, 34102, 34103, 34104, 34105, 34106, 34107, 34108, 34109, 34110, 34111, 34112, 34113, 34114, 34115, 34116, 34117, 34118, 34119, 34120, 34121, 34122});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSCheckNicknameStatus(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSCheckNicknameStatus(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSCheckNicknameStatus cSCheckNicknameStatus);

        private native CSCheckNicknameStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSCheckNicknameStatus(com.google.protobuf.GeneratedMessage.Builder builder, CSCheckNicknameStatus cSCheckNicknameStatus);

        private native CSCheckNicknameStatus(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7147getDefaultInstanceForType();

        public final native CSCheckNicknameStatus m7148getDefaultInstanceForType();

        public final native Parser<CSCheckNicknameStatus> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7149newBuilderForType();

        public final native Builder m7150newBuilderForType();

        protected final native Builder m7151newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7152toBuilder();

        public final native Builder m7153toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSCheckNicknameStatus getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aS;
        }

        static void __clinit__() {
            PARSER = new C03021();
            CSCheckNicknameStatus cSCheckNicknameStatus = new CSCheckNicknameStatus(true);
            defaultInstance = cSCheckNicknameStatus;
            cSCheckNicknameStatus.initFields();
        }

        public static CSCheckNicknameStatus parseFrom(ByteString byteString) {
            return (CSCheckNicknameStatus) PARSER.parseFrom(byteString);
        }

        public static CSCheckNicknameStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCheckNicknameStatus) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSCheckNicknameStatus parseFrom(byte[] bArr) {
            return (CSCheckNicknameStatus) PARSER.parseFrom(bArr);
        }

        public static CSCheckNicknameStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCheckNicknameStatus) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSCheckNicknameStatus parseFrom(InputStream inputStream) {
            return (CSCheckNicknameStatus) PARSER.parseFrom(inputStream);
        }

        public static CSCheckNicknameStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCheckNicknameStatus) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSCheckNicknameStatus parseDelimitedFrom(InputStream inputStream) {
            return (CSCheckNicknameStatus) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSCheckNicknameStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCheckNicknameStatus) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSCheckNicknameStatus parseFrom(CodedInputStream codedInputStream) {
            return (CSCheckNicknameStatus) PARSER.parseFrom(codedInputStream);
        }

        public static CSCheckNicknameStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCheckNicknameStatus) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSCheckNicknameStatus cSCheckNicknameStatus) {
            return newBuilder().mergeFrom(cSCheckNicknameStatus);
        }
    }

    public interface CSDeleteUserCoverOrBuilder extends MessageOrBuilder {
        int getIPos();

        long getUuid();

        boolean hasIPos();

        boolean hasUuid();
    }

    public static final class CSDeleteUserCover extends GeneratedMessage implements CSDeleteUserCoverOrBuilder {
        public static final int IPOS_FIELD_NUMBER = 2;
        public static Parser<CSDeleteUserCover> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSDeleteUserCover defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iPos_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSDeleteUserCover.1 */
        class C03031 extends AbstractParser<CSDeleteUserCover> {
            static {
                fixHelper.fixfunc(new int[]{23980, 23981});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03031();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSDeleteUserCoverOrBuilder {
            private int bitField0_;
            private int iPos_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{3746, 3747, 3748, 3749, 3750, 3751, 3752, 3753, 3754, 3755, 3756, 3757, 3758, 3759, 3760, 3761, 3762, 3763, 3764, 3765, 3766, 3767, 3768, 3769, 3770, 3771, 3772, 3773, 3774, 3775, 3776, 3777, 3778, 3779, 3780, 3781, 3782, 3783, 3784, 3785});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7178build();

            public final native CSDeleteUserCover m7179build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7180buildPartial();

            public final native CSDeleteUserCover m7181buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7182clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7183clear();

            public final native Builder m7184clear();

            public final native Builder clearIPos();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7185clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7186clone();

            public final native Builder m7187clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7188getDefaultInstanceForType();

            public final native CSDeleteUserCover m7189getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIPos();

            public final native long getUuid();

            public final native boolean hasIPos();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7190mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7191mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7192mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7193mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7194mergeFrom(Message message);

            public final native Builder mergeFrom(CSDeleteUserCover cSDeleteUserCover);

            public final native Builder setIPos(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.ag;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{26029, 26030, 26031, 26032, 26033, 26034, 26035, 26036, 26037, 26038, 26039, 26040, 26041, 26042, 26043, 26044, 26045, 26046, 26047, 26048, 26049, 26050, 26051, 26052, 26053, 26054, 26055, 26056});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSDeleteUserCover(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSDeleteUserCover(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSDeleteUserCover cSDeleteUserCover);

        private native CSDeleteUserCover(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSDeleteUserCover(com.google.protobuf.GeneratedMessage.Builder builder, CSDeleteUserCover cSDeleteUserCover);

        private native CSDeleteUserCover(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7171getDefaultInstanceForType();

        public final native CSDeleteUserCover m7172getDefaultInstanceForType();

        public final native int getIPos();

        public final native Parser<CSDeleteUserCover> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasIPos();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7173newBuilderForType();

        public final native Builder m7174newBuilderForType();

        protected final native Builder m7175newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7176toBuilder();

        public final native Builder m7177toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSDeleteUserCover getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.ag;
        }

        static void __clinit__() {
            PARSER = new C03031();
            CSDeleteUserCover cSDeleteUserCover = new CSDeleteUserCover(true);
            defaultInstance = cSDeleteUserCover;
            cSDeleteUserCover.initFields();
        }

        public static CSDeleteUserCover parseFrom(ByteString byteString) {
            return (CSDeleteUserCover) PARSER.parseFrom(byteString);
        }

        public static CSDeleteUserCover parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSDeleteUserCover) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSDeleteUserCover parseFrom(byte[] bArr) {
            return (CSDeleteUserCover) PARSER.parseFrom(bArr);
        }

        public static CSDeleteUserCover parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSDeleteUserCover) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSDeleteUserCover parseFrom(InputStream inputStream) {
            return (CSDeleteUserCover) PARSER.parseFrom(inputStream);
        }

        public static CSDeleteUserCover parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSDeleteUserCover) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSDeleteUserCover parseDelimitedFrom(InputStream inputStream) {
            return (CSDeleteUserCover) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSDeleteUserCover parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSDeleteUserCover) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSDeleteUserCover parseFrom(CodedInputStream codedInputStream) {
            return (CSDeleteUserCover) PARSER.parseFrom(codedInputStream);
        }

        public static CSDeleteUserCover parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSDeleteUserCover) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSDeleteUserCover cSDeleteUserCover) {
            return newBuilder().mergeFrom(cSDeleteUserCover);
        }
    }

    public interface CSGetFriendStatusOrBuilder extends MessageOrBuilder {
        USER_FRIEND_STATE getEStatus();

        long getUuid();

        boolean hasEStatus();

        boolean hasUuid();
    }

    public static final class CSGetFriendStatus extends GeneratedMessage implements CSGetFriendStatusOrBuilder {
        public static final int ESTATUS_FIELD_NUMBER = 2;
        public static Parser<CSGetFriendStatus> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetFriendStatus defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private USER_FRIEND_STATE eStatus_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSGetFriendStatus.1 */
        class C03041 extends AbstractParser<CSGetFriendStatus> {
            static {
                fixHelper.fixfunc(new int[]{10269, 10270});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03041();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetFriendStatusOrBuilder {
            private int bitField0_;
            private USER_FRIEND_STATE eStatus_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{28401, 28402, 28403, 28404, 28405, 28406, 28407, 28408, 28409, 28410, 28411, 28412, 28413, 28414, 28415, 28416, 28417, 28418, 28419, 28420, 28421, 28422, 28423, 28424, 28425, 28426, 28427, 28428, 28429, 28430, 28431, 28432, 28433, 28434, 28435, 28436, 28437, 28438, 28439, 28440});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7202build();

            public final native CSGetFriendStatus m7203build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7204buildPartial();

            public final native CSGetFriendStatus m7205buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7206clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7207clear();

            public final native Builder m7208clear();

            public final native Builder clearEStatus();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7209clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7210clone();

            public final native Builder m7211clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7212getDefaultInstanceForType();

            public final native CSGetFriendStatus m7213getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native USER_FRIEND_STATE getEStatus();

            public final native long getUuid();

            public final native boolean hasEStatus();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7214mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7215mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7216mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7217mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7218mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetFriendStatus cSGetFriendStatus);

            public final native Builder setEStatus(USER_FRIEND_STATE user_friend_state);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.as;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{3870, 3871, 3872, 3873, 3874, 3875, 3876, 3877, 3878, 3879, 3880, 3881, 3882, 3883, 3884, 3885, 3886, 3887, 3888, 3889, 3890, 3891, 3892, 3893, 3894, 3895, 3896, 3897});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetFriendStatus(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetFriendStatus(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetFriendStatus cSGetFriendStatus);

        private native CSGetFriendStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetFriendStatus(com.google.protobuf.GeneratedMessage.Builder builder, CSGetFriendStatus cSGetFriendStatus);

        private native CSGetFriendStatus(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7195getDefaultInstanceForType();

        public final native CSGetFriendStatus m7196getDefaultInstanceForType();

        public final native USER_FRIEND_STATE getEStatus();

        public final native Parser<CSGetFriendStatus> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEStatus();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7197newBuilderForType();

        public final native Builder m7198newBuilderForType();

        protected final native Builder m7199newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7200toBuilder();

        public final native Builder m7201toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetFriendStatus getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.as;
        }

        static void __clinit__() {
            PARSER = new C03041();
            CSGetFriendStatus cSGetFriendStatus = new CSGetFriendStatus(true);
            defaultInstance = cSGetFriendStatus;
            cSGetFriendStatus.initFields();
        }

        public static CSGetFriendStatus parseFrom(ByteString byteString) {
            return (CSGetFriendStatus) PARSER.parseFrom(byteString);
        }

        public static CSGetFriendStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFriendStatus) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetFriendStatus parseFrom(byte[] bArr) {
            return (CSGetFriendStatus) PARSER.parseFrom(bArr);
        }

        public static CSGetFriendStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFriendStatus) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetFriendStatus parseFrom(InputStream inputStream) {
            return (CSGetFriendStatus) PARSER.parseFrom(inputStream);
        }

        public static CSGetFriendStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFriendStatus) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFriendStatus parseDelimitedFrom(InputStream inputStream) {
            return (CSGetFriendStatus) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetFriendStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFriendStatus) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFriendStatus parseFrom(CodedInputStream codedInputStream) {
            return (CSGetFriendStatus) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetFriendStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFriendStatus) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetFriendStatus cSGetFriendStatus) {
            return newBuilder().mergeFrom(cSGetFriendStatus);
        }
    }

    public interface CSGetLoginRewardOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSGetLoginReward extends GeneratedMessage implements CSGetLoginRewardOrBuilder {
        public static Parser<CSGetLoginReward> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetLoginReward defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSGetLoginReward.1 */
        class C03051 extends AbstractParser<CSGetLoginReward> {
            static {
                fixHelper.fixfunc(new int[]{33233, 33234});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03051();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetLoginRewardOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{32870, 32871, 32872, 32873, 32874, 32875, 32876, 32877, 32878, 32879, 32880, 32881, 32882, 32883, 32884, 32885, 32886, 32887, 32888, 32889, 32890, 32891, 32892, 32893, 32894, 32895, 32896, 32897, 32898, 32899, 32900, 32901, 32902, 32903, 32904, 32905});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7226build();

            public final native CSGetLoginReward m7227build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7228buildPartial();

            public final native CSGetLoginReward m7229buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7230clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7231clear();

            public final native Builder m7232clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7233clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7234clone();

            public final native Builder m7235clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7236getDefaultInstanceForType();

            public final native CSGetLoginReward m7237getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7238mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7239mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7240mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7241mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7242mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetLoginReward cSGetLoginReward);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f300e;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{32716, 32717, 32718, 32719, 32720, 32721, 32722, 32723, 32724, 32725, 32726, 32727, 32728, 32729, 32730, 32731, 32732, 32733, 32734, 32735, 32736, 32737, 32738, 32739, 32740, 32741});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetLoginReward(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetLoginReward(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetLoginReward cSGetLoginReward);

        private native CSGetLoginReward(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetLoginReward(com.google.protobuf.GeneratedMessage.Builder builder, CSGetLoginReward cSGetLoginReward);

        private native CSGetLoginReward(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7219getDefaultInstanceForType();

        public final native CSGetLoginReward m7220getDefaultInstanceForType();

        public final native Parser<CSGetLoginReward> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7221newBuilderForType();

        public final native Builder m7222newBuilderForType();

        protected final native Builder m7223newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7224toBuilder();

        public final native Builder m7225toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetLoginReward getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f300e;
        }

        static void __clinit__() {
            PARSER = new C03051();
            CSGetLoginReward cSGetLoginReward = new CSGetLoginReward(true);
            defaultInstance = cSGetLoginReward;
            cSGetLoginReward.initFields();
        }

        public static CSGetLoginReward parseFrom(ByteString byteString) {
            return (CSGetLoginReward) PARSER.parseFrom(byteString);
        }

        public static CSGetLoginReward parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLoginReward) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetLoginReward parseFrom(byte[] bArr) {
            return (CSGetLoginReward) PARSER.parseFrom(bArr);
        }

        public static CSGetLoginReward parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLoginReward) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetLoginReward parseFrom(InputStream inputStream) {
            return (CSGetLoginReward) PARSER.parseFrom(inputStream);
        }

        public static CSGetLoginReward parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLoginReward) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetLoginReward parseDelimitedFrom(InputStream inputStream) {
            return (CSGetLoginReward) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetLoginReward parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLoginReward) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetLoginReward parseFrom(CodedInputStream codedInputStream) {
            return (CSGetLoginReward) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetLoginReward parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLoginReward) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetLoginReward cSGetLoginReward) {
            return newBuilder().mergeFrom(cSGetLoginReward);
        }
    }

    public interface CSGetUserBaseInfoOrBuilder extends MessageOrBuilder {
        int getBRemark();

        long getLGetUuid();

        long getUuid();

        boolean hasBRemark();

        boolean hasLGetUuid();

        boolean hasUuid();
    }

    public static final class CSGetUserBaseInfo extends GeneratedMessage implements CSGetUserBaseInfoOrBuilder {
        public static final int BREMARK_FIELD_NUMBER = 3;
        public static final int LGETUUID_FIELD_NUMBER = 2;
        public static Parser<CSGetUserBaseInfo> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetUserBaseInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bRemark_;
        private int bitField0_;
        private long lGetUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSGetUserBaseInfo.1 */
        class C03061 extends AbstractParser<CSGetUserBaseInfo> {
            static {
                fixHelper.fixfunc(new int[]{33335, 33336});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03061();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetUserBaseInfoOrBuilder {
            private int bRemark_;
            private int bitField0_;
            private long lGetUuid_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{23072, 23073, 23074, 23075, 23076, 23077, 23078, 23079, 23080, 23081, 23082, 23083, 23084, 23085, 23086, 23087, 23088, 23089, 23090, 23091, 23092, 23093, 23094, 23095, 23096, 23097, 23098, 23099, 23100, 23101, 23102, 23103, 23104, 23105, 23106, 23107, 23108, 23109, 23110, 23111, 23112, 23113, 23114, 23115});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7250build();

            public final native CSGetUserBaseInfo m7251build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7252buildPartial();

            public final native CSGetUserBaseInfo m7253buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7254clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7255clear();

            public final native Builder m7256clear();

            public final native Builder clearBRemark();

            public final native Builder clearLGetUuid();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7257clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7258clone();

            public final native Builder m7259clone();

            public final native int getBRemark();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7260getDefaultInstanceForType();

            public final native CSGetUserBaseInfo m7261getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLGetUuid();

            public final native long getUuid();

            public final native boolean hasBRemark();

            public final native boolean hasLGetUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7262mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7263mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7264mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7265mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7266mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetUserBaseInfo cSGetUserBaseInfo);

            public final native Builder setBRemark(int i);

            public final native Builder setLGetUuid(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f270A;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{23739, 23740, 23741, 23742, 23743, 23744, 23745, 23746, 23747, 23748, 23749, 23750, 23751, 23752, 23753, 23754, 23755, 23756, 23757, 23758, 23759, 23760, 23761, 23762, 23763, 23764, 23765, 23766, 23767, 23768});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetUserBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetUserBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetUserBaseInfo cSGetUserBaseInfo);

        private native CSGetUserBaseInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetUserBaseInfo(com.google.protobuf.GeneratedMessage.Builder builder, CSGetUserBaseInfo cSGetUserBaseInfo);

        private native CSGetUserBaseInfo(boolean z);

        private native void initFields();

        public final native int getBRemark();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7243getDefaultInstanceForType();

        public final native CSGetUserBaseInfo m7244getDefaultInstanceForType();

        public final native long getLGetUuid();

        public final native Parser<CSGetUserBaseInfo> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasBRemark();

        public final native boolean hasLGetUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7245newBuilderForType();

        public final native Builder m7246newBuilderForType();

        protected final native Builder m7247newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7248toBuilder();

        public final native Builder m7249toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetUserBaseInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f270A;
        }

        static void __clinit__() {
            PARSER = new C03061();
            CSGetUserBaseInfo cSGetUserBaseInfo = new CSGetUserBaseInfo(true);
            defaultInstance = cSGetUserBaseInfo;
            cSGetUserBaseInfo.initFields();
        }

        public static CSGetUserBaseInfo parseFrom(ByteString byteString) {
            return (CSGetUserBaseInfo) PARSER.parseFrom(byteString);
        }

        public static CSGetUserBaseInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserBaseInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetUserBaseInfo parseFrom(byte[] bArr) {
            return (CSGetUserBaseInfo) PARSER.parseFrom(bArr);
        }

        public static CSGetUserBaseInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserBaseInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetUserBaseInfo parseFrom(InputStream inputStream) {
            return (CSGetUserBaseInfo) PARSER.parseFrom(inputStream);
        }

        public static CSGetUserBaseInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserBaseInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetUserBaseInfo parseDelimitedFrom(InputStream inputStream) {
            return (CSGetUserBaseInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetUserBaseInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserBaseInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetUserBaseInfo parseFrom(CodedInputStream codedInputStream) {
            return (CSGetUserBaseInfo) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetUserBaseInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserBaseInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetUserBaseInfo cSGetUserBaseInfo) {
            return newBuilder().mergeFrom(cSGetUserBaseInfo);
        }
    }

    public interface CSGetUserInfoOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSGetUserInfo extends GeneratedMessage implements CSGetUserInfoOrBuilder {
        public static Parser<CSGetUserInfo> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetUserInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSGetUserInfo.1 */
        class C03071 extends AbstractParser<CSGetUserInfo> {
            static {
                fixHelper.fixfunc(new int[]{28852, 28853});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03071();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetUserInfoOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{19151, 19152, 19153, 19154, 19155, 19156, 19157, 19158, 19159, 19160, 19161, 19162, 19163, 19164, 19165, 19166, 19167, 19168, 19169, 19170, 19171, 19172, 19173, 19174, 19175, 19176, 19177, 19178, 19179, 19180, 19181, 19182, 19183, 19184, 19185, 19186});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7274build();

            public final native CSGetUserInfo m7275build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7276buildPartial();

            public final native CSGetUserInfo m7277buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7278clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7279clear();

            public final native Builder m7280clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7281clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7282clone();

            public final native Builder m7283clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7284getDefaultInstanceForType();

            public final native CSGetUserInfo m7285getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7286mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7287mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7288mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7289mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7290mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetUserInfo cSGetUserInfo);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f274E;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31170, 31171, 31172, 31173, 31174, 31175, 31176, 31177, 31178, 31179, 31180, 31181, 31182, 31183, 31184, 31185, 31186, 31187, 31188, 31189, 31190, 31191, 31192, 31193, 31194, 31195});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetUserInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetUserInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetUserInfo cSGetUserInfo);

        private native CSGetUserInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetUserInfo(com.google.protobuf.GeneratedMessage.Builder builder, CSGetUserInfo cSGetUserInfo);

        private native CSGetUserInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7267getDefaultInstanceForType();

        public final native CSGetUserInfo m7268getDefaultInstanceForType();

        public final native Parser<CSGetUserInfo> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7269newBuilderForType();

        public final native Builder m7270newBuilderForType();

        protected final native Builder m7271newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7272toBuilder();

        public final native Builder m7273toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetUserInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f274E;
        }

        static void __clinit__() {
            PARSER = new C03071();
            CSGetUserInfo cSGetUserInfo = new CSGetUserInfo(true);
            defaultInstance = cSGetUserInfo;
            cSGetUserInfo.initFields();
        }

        public static CSGetUserInfo parseFrom(ByteString byteString) {
            return (CSGetUserInfo) PARSER.parseFrom(byteString);
        }

        public static CSGetUserInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetUserInfo parseFrom(byte[] bArr) {
            return (CSGetUserInfo) PARSER.parseFrom(bArr);
        }

        public static CSGetUserInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetUserInfo parseFrom(InputStream inputStream) {
            return (CSGetUserInfo) PARSER.parseFrom(inputStream);
        }

        public static CSGetUserInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetUserInfo parseDelimitedFrom(InputStream inputStream) {
            return (CSGetUserInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetUserInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetUserInfo parseFrom(CodedInputStream codedInputStream) {
            return (CSGetUserInfo) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetUserInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetUserInfo cSGetUserInfo) {
            return newBuilder().mergeFrom(cSGetUserInfo);
        }
    }

    public interface CSGetUserInfoV2OrBuilder extends MessageOrBuilder {
        int getBRemark();

        long getLClubID();

        long getLGetUuid();

        long getUuid();

        boolean hasBRemark();

        boolean hasLClubID();

        boolean hasLGetUuid();

        boolean hasUuid();
    }

    public static final class CSGetUserInfoV2 extends GeneratedMessage implements CSGetUserInfoV2OrBuilder {
        public static final int BREMARK_FIELD_NUMBER = 4;
        public static final int LCLUBID_FIELD_NUMBER = 3;
        public static final int LGETUUID_FIELD_NUMBER = 2;
        public static Parser<CSGetUserInfoV2> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetUserInfoV2 defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bRemark_;
        private int bitField0_;
        private long lClubID_;
        private long lGetUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSGetUserInfoV2.1 */
        class C03081 extends AbstractParser<CSGetUserInfoV2> {
            static {
                fixHelper.fixfunc(new int[]{33798, 33799});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03081();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetUserInfoV2OrBuilder {
            private int bRemark_;
            private int bitField0_;
            private long lClubID_;
            private long lGetUuid_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{24036, 24037, 24038, 24039, 24040, 24041, 24042, 24043, 24044, 24045, 24046, 24047, 24048, 24049, 24050, 24051, 24052, 24053, 24054, 24055, 24056, 24057, 24058, 24059, 24060, 24061, 24062, 24063, 24064, 24065, 24066, 24067, 24068, 24069, 24070, 24071, 24072, 24073, 24074, 24075, 24076, 24077, 24078, 24079, 24080, 24081, 24082, 24083});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7298build();

            public final native CSGetUserInfoV2 m7299build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7300buildPartial();

            public final native CSGetUserInfoV2 m7301buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7302clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7303clear();

            public final native Builder m7304clear();

            public final native Builder clearBRemark();

            public final native Builder clearLClubID();

            public final native Builder clearLGetUuid();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7305clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7306clone();

            public final native Builder m7307clone();

            public final native int getBRemark();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7308getDefaultInstanceForType();

            public final native CSGetUserInfoV2 m7309getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getLGetUuid();

            public final native long getUuid();

            public final native boolean hasBRemark();

            public final native boolean hasLClubID();

            public final native boolean hasLGetUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7310mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7311mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7312mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7313mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7314mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetUserInfoV2 cSGetUserInfoV2);

            public final native Builder setBRemark(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setLGetUuid(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f278I;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31507, 31508, 31509, 31510, 31511, 31512, 31513, 31514, 31515, 31516, 31517, 31518, 31519, 31520, 31521, 31522, 31523, 31524, 31525, 31526, 31527, 31528, 31529, 31530, 31531, 31532, 31533, 31534, 31535, 31536, 31537, 31538});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetUserInfoV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetUserInfoV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetUserInfoV2 cSGetUserInfoV2);

        private native CSGetUserInfoV2(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetUserInfoV2(com.google.protobuf.GeneratedMessage.Builder builder, CSGetUserInfoV2 cSGetUserInfoV2);

        private native CSGetUserInfoV2(boolean z);

        private native void initFields();

        public final native int getBRemark();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7291getDefaultInstanceForType();

        public final native CSGetUserInfoV2 m7292getDefaultInstanceForType();

        public final native long getLClubID();

        public final native long getLGetUuid();

        public final native Parser<CSGetUserInfoV2> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasBRemark();

        public final native boolean hasLClubID();

        public final native boolean hasLGetUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7293newBuilderForType();

        public final native Builder m7294newBuilderForType();

        protected final native Builder m7295newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7296toBuilder();

        public final native Builder m7297toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetUserInfoV2 getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f278I;
        }

        static void __clinit__() {
            PARSER = new C03081();
            CSGetUserInfoV2 cSGetUserInfoV2 = new CSGetUserInfoV2(true);
            defaultInstance = cSGetUserInfoV2;
            cSGetUserInfoV2.initFields();
        }

        public static CSGetUserInfoV2 parseFrom(ByteString byteString) {
            return (CSGetUserInfoV2) PARSER.parseFrom(byteString);
        }

        public static CSGetUserInfoV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserInfoV2) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetUserInfoV2 parseFrom(byte[] bArr) {
            return (CSGetUserInfoV2) PARSER.parseFrom(bArr);
        }

        public static CSGetUserInfoV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserInfoV2) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetUserInfoV2 parseFrom(InputStream inputStream) {
            return (CSGetUserInfoV2) PARSER.parseFrom(inputStream);
        }

        public static CSGetUserInfoV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserInfoV2) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetUserInfoV2 parseDelimitedFrom(InputStream inputStream) {
            return (CSGetUserInfoV2) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetUserInfoV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserInfoV2) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetUserInfoV2 parseFrom(CodedInputStream codedInputStream) {
            return (CSGetUserInfoV2) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetUserInfoV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetUserInfoV2) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetUserInfoV2 cSGetUserInfoV2) {
            return newBuilder().mergeFrom(cSGetUserInfoV2);
        }
    }

    public interface CSInviteActionOrBuilder extends MessageOrBuilder {
        MSG_ACT getEPartyAct();

        long getFrienduuid();

        String getSHint();

        ByteString getSHintBytes();

        long getUuid();

        boolean hasEPartyAct();

        boolean hasFrienduuid();

        boolean hasSHint();

        boolean hasUuid();
    }

    public static final class CSInviteAction extends GeneratedMessage implements CSInviteActionOrBuilder {
        public static final int EPARTYACT_FIELD_NUMBER = 3;
        public static final int FRIENDUUID_FIELD_NUMBER = 2;
        public static Parser<CSInviteAction> PARSER = null;
        public static final int SHINT_FIELD_NUMBER = 4;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSInviteAction defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private MSG_ACT ePartyAct_;
        private long frienduuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sHint_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSInviteAction.1 */
        class C03091 extends AbstractParser<CSInviteAction> {
            static {
                fixHelper.fixfunc(new int[]{31457, 31458});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03091();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSInviteActionOrBuilder {
            private int bitField0_;
            private MSG_ACT ePartyAct_;
            private long frienduuid_;
            private Object sHint_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{12341, 12342, 12343, 12344, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12353, 12354, 12355, 12356, 12357, 12358, 12359, 12360, 12361, 12362, 12363, 12364, 12365, 12366, 12367, 12368, 12369, 12370, 12371, 12372, 12373, 12374, 12375, 12376, 12377, 12378, 12379, 12380, 12381, 12382, 12383, 12384, 12385, 12386, 12387, 12388, 12389, 12390});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7322build();

            public final native CSInviteAction m7323build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7324buildPartial();

            public final native CSInviteAction m7325buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7326clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7327clear();

            public final native Builder m7328clear();

            public final native Builder clearEPartyAct();

            public final native Builder clearFrienduuid();

            public final native Builder clearSHint();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7329clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7330clone();

            public final native Builder m7331clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7332getDefaultInstanceForType();

            public final native CSInviteAction m7333getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native MSG_ACT getEPartyAct();

            public final native long getFrienduuid();

            public final native String getSHint();

            public final native ByteString getSHintBytes();

            public final native long getUuid();

            public final native boolean hasEPartyAct();

            public final native boolean hasFrienduuid();

            public final native boolean hasSHint();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7334mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7335mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7336mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7337mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7338mergeFrom(Message message);

            public final native Builder mergeFrom(CSInviteAction cSInviteAction);

            public final native Builder setEPartyAct(MSG_ACT msg_act);

            public final native Builder setFrienduuid(long j);

            public final native Builder setSHint(String str);

            public final native Builder setSHintBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aw;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{20627, 20628, 20629, 20630, 20631, 20632, 20633, 20634, 20635, 20636, 20637, 20638, 20639, 20640, 20641, 20642, 20643, 20644, 20645, 20646, 20647, 20648, 20649, 20650, 20651, 20652, 20653, 20654, 20655, 20656, 20657, 20658, 20659});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSInviteAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSInviteAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSInviteAction cSInviteAction);

        private native CSInviteAction(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSInviteAction(com.google.protobuf.GeneratedMessage.Builder builder, CSInviteAction cSInviteAction);

        private native CSInviteAction(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7315getDefaultInstanceForType();

        public final native CSInviteAction m7316getDefaultInstanceForType();

        public final native MSG_ACT getEPartyAct();

        public final native long getFrienduuid();

        public final native Parser<CSInviteAction> getParserForType();

        public final native String getSHint();

        public final native ByteString getSHintBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEPartyAct();

        public final native boolean hasFrienduuid();

        public final native boolean hasSHint();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7317newBuilderForType();

        public final native Builder m7318newBuilderForType();

        protected final native Builder m7319newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7320toBuilder();

        public final native Builder m7321toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSInviteAction getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aw;
        }

        static void __clinit__() {
            PARSER = new C03091();
            CSInviteAction cSInviteAction = new CSInviteAction(true);
            defaultInstance = cSInviteAction;
            cSInviteAction.initFields();
        }

        public static CSInviteAction parseFrom(ByteString byteString) {
            return (CSInviteAction) PARSER.parseFrom(byteString);
        }

        public static CSInviteAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSInviteAction) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSInviteAction parseFrom(byte[] bArr) {
            return (CSInviteAction) PARSER.parseFrom(bArr);
        }

        public static CSInviteAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSInviteAction) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSInviteAction parseFrom(InputStream inputStream) {
            return (CSInviteAction) PARSER.parseFrom(inputStream);
        }

        public static CSInviteAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSInviteAction) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSInviteAction parseDelimitedFrom(InputStream inputStream) {
            return (CSInviteAction) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSInviteAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSInviteAction) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSInviteAction parseFrom(CodedInputStream codedInputStream) {
            return (CSInviteAction) PARSER.parseFrom(codedInputStream);
        }

        public static CSInviteAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSInviteAction) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSInviteAction cSInviteAction) {
            return newBuilder().mergeFrom(cSInviteAction);
        }
    }

    public interface CSLoginRewardOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSLoginReward extends GeneratedMessage implements CSLoginRewardOrBuilder {
        public static Parser<CSLoginReward> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSLoginReward defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSLoginReward.1 */
        class C03101 extends AbstractParser<CSLoginReward> {
            static {
                fixHelper.fixfunc(new int[]{33956, 33957});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03101();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSLoginRewardOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{13911, 13912, 13913, 13914, 13915, 13916, 13917, 13918, 13919, 13920, 13921, 13922, 13923, 13924, 13925, 13926, 13927, 13928, 13929, 13930, 13931, 13932, 13933, 13934, 13935, 13936, 13937, 13938, 13939, 13940, 13941, 13942, 13943, 13944, 13945, 13946});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7346build();

            public final native CSLoginReward m7347build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7348buildPartial();

            public final native CSLoginReward m7349buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7350clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7351clear();

            public final native Builder m7352clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7353clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7354clone();

            public final native Builder m7355clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7356getDefaultInstanceForType();

            public final native CSLoginReward m7357getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7358mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7359mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7360mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7361mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7362mergeFrom(Message message);

            public final native Builder mergeFrom(CSLoginReward cSLoginReward);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f304i;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{19955, 19956, 19957, 19958, 19959, 19960, 19961, 19962, 19963, 19964, 19965, 19966, 19967, 19968, 19969, 19970, 19971, 19972, 19973, 19974, 19975, 19976, 19977, 19978, 19979, 19980});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSLoginReward(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSLoginReward(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSLoginReward cSLoginReward);

        private native CSLoginReward(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSLoginReward(com.google.protobuf.GeneratedMessage.Builder builder, CSLoginReward cSLoginReward);

        private native CSLoginReward(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7339getDefaultInstanceForType();

        public final native CSLoginReward m7340getDefaultInstanceForType();

        public final native Parser<CSLoginReward> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7341newBuilderForType();

        public final native Builder m7342newBuilderForType();

        protected final native Builder m7343newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7344toBuilder();

        public final native Builder m7345toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSLoginReward getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f304i;
        }

        static void __clinit__() {
            PARSER = new C03101();
            CSLoginReward cSLoginReward = new CSLoginReward(true);
            defaultInstance = cSLoginReward;
            cSLoginReward.initFields();
        }

        public static CSLoginReward parseFrom(ByteString byteString) {
            return (CSLoginReward) PARSER.parseFrom(byteString);
        }

        public static CSLoginReward parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSLoginReward) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSLoginReward parseFrom(byte[] bArr) {
            return (CSLoginReward) PARSER.parseFrom(bArr);
        }

        public static CSLoginReward parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSLoginReward) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSLoginReward parseFrom(InputStream inputStream) {
            return (CSLoginReward) PARSER.parseFrom(inputStream);
        }

        public static CSLoginReward parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSLoginReward) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSLoginReward parseDelimitedFrom(InputStream inputStream) {
            return (CSLoginReward) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSLoginReward parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSLoginReward) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSLoginReward parseFrom(CodedInputStream codedInputStream) {
            return (CSLoginReward) PARSER.parseFrom(codedInputStream);
        }

        public static CSLoginReward parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSLoginReward) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSLoginReward cSLoginReward) {
            return newBuilder().mergeFrom(cSLoginReward);
        }
    }

    public interface CSRemarkUserNickNameOrBuilder extends MessageOrBuilder {
        long getRemarkUuid();

        String getSRemarContent();

        ByteString getSRemarContentBytes();

        long getUuid();

        boolean hasRemarkUuid();

        boolean hasSRemarContent();

        boolean hasUuid();
    }

    public static final class CSRemarkUserNickName extends GeneratedMessage implements CSRemarkUserNickNameOrBuilder {
        public static Parser<CSRemarkUserNickName> PARSER = null;
        public static final int REMARKUUID_FIELD_NUMBER = 2;
        public static final int SREMARCONTENT_FIELD_NUMBER = 3;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSRemarkUserNickName defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private long remarkUuid_;
        private Object sRemarContent_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSRemarkUserNickName.1 */
        class C03111 extends AbstractParser<CSRemarkUserNickName> {
            static {
                fixHelper.fixfunc(new int[]{20832, 20833});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03111();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSRemarkUserNickNameOrBuilder {
            private int bitField0_;
            private long remarkUuid_;
            private Object sRemarContent_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{7890, 7891, 7892, 7893, 7894, 7895, 7896, 7897, 7898, 7899, 7900, 7901, 7902, 7903, 7904, 7905, 7906, 7907, 7908, 7909, 7910, 7911, 7912, 7913, 7914, 7915, 7916, 7917, 7918, 7919, 7920, 7921, 7922, 7923, 7924, 7925, 7926, 7927, 7928, 7929, 7930, 7931, 7932, 7933, 7934, 7935});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7370build();

            public final native CSRemarkUserNickName m7371build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7372buildPartial();

            public final native CSRemarkUserNickName m7373buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7374clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7375clear();

            public final native Builder m7376clear();

            public final native Builder clearRemarkUuid();

            public final native Builder clearSRemarContent();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7377clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7378clone();

            public final native Builder m7379clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7380getDefaultInstanceForType();

            public final native CSRemarkUserNickName m7381getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getRemarkUuid();

            public final native String getSRemarContent();

            public final native ByteString getSRemarContentBytes();

            public final native long getUuid();

            public final native boolean hasRemarkUuid();

            public final native boolean hasSRemarContent();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7382mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7383mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7384mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7385mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7386mergeFrom(Message message);

            public final native Builder mergeFrom(CSRemarkUserNickName cSRemarkUserNickName);

            public final native Builder setRemarkUuid(long j);

            public final native Builder setSRemarContent(String str);

            public final native Builder setSRemarContentBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aW;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{11884, 11885, 11886, 11887, 11888, 11889, 11890, 11891, 11892, 11893, 11894, 11895, 11896, 11897, 11898, 11899, 11900, 11901, 11902, 11903, 11904, 11905, 11906, 11907, 11908, 11909, 11910, 11911, 11912, 11913, 11914});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSRemarkUserNickName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSRemarkUserNickName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSRemarkUserNickName cSRemarkUserNickName);

        private native CSRemarkUserNickName(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSRemarkUserNickName(com.google.protobuf.GeneratedMessage.Builder builder, CSRemarkUserNickName cSRemarkUserNickName);

        private native CSRemarkUserNickName(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7363getDefaultInstanceForType();

        public final native CSRemarkUserNickName m7364getDefaultInstanceForType();

        public final native Parser<CSRemarkUserNickName> getParserForType();

        public final native long getRemarkUuid();

        public final native String getSRemarContent();

        public final native ByteString getSRemarContentBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasRemarkUuid();

        public final native boolean hasSRemarContent();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7365newBuilderForType();

        public final native Builder m7366newBuilderForType();

        protected final native Builder m7367newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7368toBuilder();

        public final native Builder m7369toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSRemarkUserNickName getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aW;
        }

        static void __clinit__() {
            PARSER = new C03111();
            CSRemarkUserNickName cSRemarkUserNickName = new CSRemarkUserNickName(true);
            defaultInstance = cSRemarkUserNickName;
            cSRemarkUserNickName.initFields();
        }

        public static CSRemarkUserNickName parseFrom(ByteString byteString) {
            return (CSRemarkUserNickName) PARSER.parseFrom(byteString);
        }

        public static CSRemarkUserNickName parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemarkUserNickName) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSRemarkUserNickName parseFrom(byte[] bArr) {
            return (CSRemarkUserNickName) PARSER.parseFrom(bArr);
        }

        public static CSRemarkUserNickName parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemarkUserNickName) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSRemarkUserNickName parseFrom(InputStream inputStream) {
            return (CSRemarkUserNickName) PARSER.parseFrom(inputStream);
        }

        public static CSRemarkUserNickName parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemarkUserNickName) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSRemarkUserNickName parseDelimitedFrom(InputStream inputStream) {
            return (CSRemarkUserNickName) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSRemarkUserNickName parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemarkUserNickName) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSRemarkUserNickName parseFrom(CodedInputStream codedInputStream) {
            return (CSRemarkUserNickName) PARSER.parseFrom(codedInputStream);
        }

        public static CSRemarkUserNickName parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemarkUserNickName) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSRemarkUserNickName cSRemarkUserNickName) {
            return newBuilder().mergeFrom(cSRemarkUserNickName);
        }
    }

    public interface CSRemoveFriendOrBuilder extends MessageOrBuilder {
        long getFriendUuid();

        long getUuid();

        boolean hasFriendUuid();

        boolean hasUuid();
    }

    public static final class CSRemoveFriend extends GeneratedMessage implements CSRemoveFriendOrBuilder {
        public static final int FRIENDUUID_FIELD_NUMBER = 2;
        public static Parser<CSRemoveFriend> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSRemoveFriend defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long friendUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSRemoveFriend.1 */
        class C03121 extends AbstractParser<CSRemoveFriend> {
            static {
                fixHelper.fixfunc(new int[]{9298, 9299});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03121();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSRemoveFriendOrBuilder {
            private int bitField0_;
            private long friendUuid_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{22096, 22097, 22098, 22099, 22100, 22101, 22102, 22103, 22104, 22105, 22106, 22107, 22108, 22109, 22110, 22111, 22112, 22113, 22114, 22115, 22116, 22117, 22118, 22119, 22120, 22121, 22122, 22123, 22124, 22125, 22126, 22127, 22128, 22129, 22130, 22131, 22132, 22133, 22134, 22135});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7394build();

            public final native CSRemoveFriend m7395build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7396buildPartial();

            public final native CSRemoveFriend m7397buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7398clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7399clear();

            public final native Builder m7400clear();

            public final native Builder clearFriendUuid();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7401clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7402clone();

            public final native Builder m7403clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7404getDefaultInstanceForType();

            public final native CSRemoveFriend m7405getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getFriendUuid();

            public final native long getUuid();

            public final native boolean hasFriendUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7406mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7407mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7408mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7409mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7410mergeFrom(Message message);

            public final native Builder mergeFrom(CSRemoveFriend cSRemoveFriend);

            public final native Builder setFriendUuid(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aA;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{32255, 32256, 32257, 32258, 32259, 32260, 32261, 32262, 32263, 32264, 32265, 32266, 32267, 32268, 32269, 32270, 32271, 32272, 32273, 32274, 32275, 32276, 32277, 32278, 32279, 32280, 32281, 32282});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSRemoveFriend(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSRemoveFriend(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSRemoveFriend cSRemoveFriend);

        private native CSRemoveFriend(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSRemoveFriend(com.google.protobuf.GeneratedMessage.Builder builder, CSRemoveFriend cSRemoveFriend);

        private native CSRemoveFriend(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7387getDefaultInstanceForType();

        public final native CSRemoveFriend m7388getDefaultInstanceForType();

        public final native long getFriendUuid();

        public final native Parser<CSRemoveFriend> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasFriendUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7389newBuilderForType();

        public final native Builder m7390newBuilderForType();

        protected final native Builder m7391newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7392toBuilder();

        public final native Builder m7393toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSRemoveFriend getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aA;
        }

        static void __clinit__() {
            PARSER = new C03121();
            CSRemoveFriend cSRemoveFriend = new CSRemoveFriend(true);
            defaultInstance = cSRemoveFriend;
            cSRemoveFriend.initFields();
        }

        public static CSRemoveFriend parseFrom(ByteString byteString) {
            return (CSRemoveFriend) PARSER.parseFrom(byteString);
        }

        public static CSRemoveFriend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFriend) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSRemoveFriend parseFrom(byte[] bArr) {
            return (CSRemoveFriend) PARSER.parseFrom(bArr);
        }

        public static CSRemoveFriend parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFriend) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSRemoveFriend parseFrom(InputStream inputStream) {
            return (CSRemoveFriend) PARSER.parseFrom(inputStream);
        }

        public static CSRemoveFriend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFriend) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSRemoveFriend parseDelimitedFrom(InputStream inputStream) {
            return (CSRemoveFriend) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSRemoveFriend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFriend) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSRemoveFriend parseFrom(CodedInputStream codedInputStream) {
            return (CSRemoveFriend) PARSER.parseFrom(codedInputStream);
        }

        public static CSRemoveFriend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFriend) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSRemoveFriend cSRemoveFriend) {
            return newBuilder().mergeFrom(cSRemoveFriend);
        }
    }

    public interface CSSearchFriendOrBuilder extends MessageOrBuilder {
        SEARCH_TYPE getESearchType();

        long getLSearchUuid();

        String getSSearchWord();

        ByteString getSSearchWordBytes();

        long getUuid();

        boolean hasESearchType();

        boolean hasLSearchUuid();

        boolean hasSSearchWord();

        boolean hasUuid();
    }

    public static final class CSSearchFriend extends GeneratedMessage implements CSSearchFriendOrBuilder {
        public static final int ESEARCHTYPE_FIELD_NUMBER = 2;
        public static final int LSEARCHUUID_FIELD_NUMBER = 4;
        public static Parser<CSSearchFriend> PARSER = null;
        public static final int SSEARCHWORD_FIELD_NUMBER = 3;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSearchFriend defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private SEARCH_TYPE eSearchType_;
        private long lSearchUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sSearchWord_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSSearchFriend.1 */
        class C03131 extends AbstractParser<CSSearchFriend> {
            static {
                fixHelper.fixfunc(new int[]{17647, 17648});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03131();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSearchFriendOrBuilder {
            private int bitField0_;
            private SEARCH_TYPE eSearchType_;
            private long lSearchUuid_;
            private Object sSearchWord_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{14051, 14052, 14053, 14054, 14055, 14056, 14057, 14058, 14059, 14060, 14061, 14062, 14063, 14064, 14065, 14066, 14067, 14068, 14069, 14070, 14071, 14072, 14073, 14074, 14075, 14076, 14077, 14078, 14079, 14080, 14081, 14082, 14083, 14084, 14085, 14086, 14087, 14088, 14089, 14090, 14091, 14092, 14093, 14094, 14095, 14096, 14097, 14098, 14099, 14100});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7418build();

            public final native CSSearchFriend m7419build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7420buildPartial();

            public final native CSSearchFriend m7421buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7422clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7423clear();

            public final native Builder m7424clear();

            public final native Builder clearESearchType();

            public final native Builder clearLSearchUuid();

            public final native Builder clearSSearchWord();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7425clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7426clone();

            public final native Builder m7427clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7428getDefaultInstanceForType();

            public final native CSSearchFriend m7429getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native SEARCH_TYPE getESearchType();

            public final native long getLSearchUuid();

            public final native String getSSearchWord();

            public final native ByteString getSSearchWordBytes();

            public final native long getUuid();

            public final native boolean hasESearchType();

            public final native boolean hasLSearchUuid();

            public final native boolean hasSSearchWord();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7430mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7431mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7432mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7433mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7434mergeFrom(Message message);

            public final native Builder mergeFrom(CSSearchFriend cSSearchFriend);

            public final native Builder setESearchType(SEARCH_TYPE search_type);

            public final native Builder setLSearchUuid(long j);

            public final native Builder setSSearchWord(String str);

            public final native Builder setSSearchWordBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aE;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{13848, 13849, 13850, 13851, 13852, 13853, 13854, 13855, 13856, 13857, 13858, 13859, 13860, 13861, 13862, 13863, 13864, 13865, 13866, 13867, 13868, 13869, 13870, 13871, 13872, 13873, 13874, 13875, 13876, 13877, 13878, 13879, 13880});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSearchFriend(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSearchFriend(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSearchFriend cSSearchFriend);

        private native CSSearchFriend(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSearchFriend(com.google.protobuf.GeneratedMessage.Builder builder, CSSearchFriend cSSearchFriend);

        private native CSSearchFriend(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7411getDefaultInstanceForType();

        public final native CSSearchFriend m7412getDefaultInstanceForType();

        public final native SEARCH_TYPE getESearchType();

        public final native long getLSearchUuid();

        public final native Parser<CSSearchFriend> getParserForType();

        public final native String getSSearchWord();

        public final native ByteString getSSearchWordBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasESearchType();

        public final native boolean hasLSearchUuid();

        public final native boolean hasSSearchWord();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7413newBuilderForType();

        public final native Builder m7414newBuilderForType();

        protected final native Builder m7415newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7416toBuilder();

        public final native Builder m7417toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSearchFriend getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aE;
        }

        static void __clinit__() {
            PARSER = new C03131();
            CSSearchFriend cSSearchFriend = new CSSearchFriend(true);
            defaultInstance = cSSearchFriend;
            cSSearchFriend.initFields();
        }

        public static CSSearchFriend parseFrom(ByteString byteString) {
            return (CSSearchFriend) PARSER.parseFrom(byteString);
        }

        public static CSSearchFriend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchFriend) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSearchFriend parseFrom(byte[] bArr) {
            return (CSSearchFriend) PARSER.parseFrom(bArr);
        }

        public static CSSearchFriend parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchFriend) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSearchFriend parseFrom(InputStream inputStream) {
            return (CSSearchFriend) PARSER.parseFrom(inputStream);
        }

        public static CSSearchFriend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchFriend) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSearchFriend parseDelimitedFrom(InputStream inputStream) {
            return (CSSearchFriend) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSearchFriend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchFriend) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSearchFriend parseFrom(CodedInputStream codedInputStream) {
            return (CSSearchFriend) PARSER.parseFrom(codedInputStream);
        }

        public static CSSearchFriend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchFriend) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSearchFriend cSSearchFriend) {
            return newBuilder().mergeFrom(cSSearchFriend);
        }
    }

    public interface CSSetUserInfoOrBuilder extends MessageOrBuilder {
        int getBMute();

        int getBVibrate();

        int getIGender();

        String getSDesc();

        ByteString getSDescBytes();

        String getSIconUrl();

        ByteString getSIconUrlBytes();

        String getSNickname();

        ByteString getSNicknameBytes();

        String getSPhhoneNumber();

        ByteString getSPhhoneNumberBytes();

        long getUuid();

        boolean hasBMute();

        boolean hasBVibrate();

        boolean hasIGender();

        boolean hasSDesc();

        boolean hasSIconUrl();

        boolean hasSNickname();

        boolean hasSPhhoneNumber();

        boolean hasUuid();
    }

    public static final class CSSetUserInfo extends GeneratedMessage implements CSSetUserInfoOrBuilder {
        public static final int BMUTE_FIELD_NUMBER = 7;
        public static final int BVIBRATE_FIELD_NUMBER = 8;
        public static final int IGENDER_FIELD_NUMBER = 3;
        public static Parser<CSSetUserInfo> PARSER = null;
        public static final int SDESC_FIELD_NUMBER = 6;
        public static final int SICONURL_FIELD_NUMBER = 4;
        public static final int SNICKNAME_FIELD_NUMBER = 2;
        public static final int SPHHONENUMBER_FIELD_NUMBER = 5;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSetUserInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bMute_;
        private int bVibrate_;
        private int bitField0_;
        private int iGender_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sDesc_;
        private Object sIconUrl_;
        private Object sNickname_;
        private Object sPhhoneNumber_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSSetUserInfo.1 */
        class C03141 extends AbstractParser<CSSetUserInfo> {
            static {
                fixHelper.fixfunc(new int[]{6937, 6938});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03141();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSetUserInfoOrBuilder {
            private int bMute_;
            private int bVibrate_;
            private int bitField0_;
            private int iGender_;
            private Object sDesc_;
            private Object sIconUrl_;
            private Object sNickname_;
            private Object sPhhoneNumber_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{24627, 24628, 24629, 24630, 24631, 24632, 24633, 24634, 24635, 24636, 24637, 24638, 24639, 24640, 24641, 24642, 24643, 24644, 24645, 24646, 24647, 24648, 24649, 24650, 24651, 24652, 24653, 24654, 24655, 24656, 24657, 24658, 24659, 24660, 24661, 24662, 24663, 24664, 24665, 24666, 24667, 24668, 24669, 24670, 24671, 24672, 24673, 24674, 24675, 24676, 24677, 24678, 24679, 24680, 24681, 24682, 24683, 24684, 24685, 24686, 24687, 24688, 24689, 24690, 24691, 24692, 24693, 24694, 24695, 24696, 24697, 24698});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7442build();

            public final native CSSetUserInfo m7443build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7444buildPartial();

            public final native CSSetUserInfo m7445buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7446clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7447clear();

            public final native Builder m7448clear();

            public final native Builder clearBMute();

            public final native Builder clearBVibrate();

            public final native Builder clearIGender();

            public final native Builder clearSDesc();

            public final native Builder clearSIconUrl();

            public final native Builder clearSNickname();

            public final native Builder clearSPhhoneNumber();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7449clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7450clone();

            public final native Builder m7451clone();

            public final native int getBMute();

            public final native int getBVibrate();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7452getDefaultInstanceForType();

            public final native CSSetUserInfo m7453getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIGender();

            public final native String getSDesc();

            public final native ByteString getSDescBytes();

            public final native String getSIconUrl();

            public final native ByteString getSIconUrlBytes();

            public final native String getSNickname();

            public final native ByteString getSNicknameBytes();

            public final native String getSPhhoneNumber();

            public final native ByteString getSPhhoneNumberBytes();

            public final native long getUuid();

            public final native boolean hasBMute();

            public final native boolean hasBVibrate();

            public final native boolean hasIGender();

            public final native boolean hasSDesc();

            public final native boolean hasSIconUrl();

            public final native boolean hasSNickname();

            public final native boolean hasSPhhoneNumber();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7454mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7455mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7456mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7457mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7458mergeFrom(Message message);

            public final native Builder mergeFrom(CSSetUserInfo cSSetUserInfo);

            public final native Builder setBMute(int i);

            public final native Builder setBVibrate(int i);

            public final native Builder setIGender(int i);

            public final native Builder setSDesc(String str);

            public final native Builder setSDescBytes(ByteString byteString);

            public final native Builder setSIconUrl(String str);

            public final native Builder setSIconUrlBytes(ByteString byteString);

            public final native Builder setSNickname(String str);

            public final native Builder setSNicknameBytes(ByteString byteString);

            public final native Builder setSPhhoneNumber(String str);

            public final native Builder setSPhhoneNumberBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f286Q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{28262, 28263, 28264, 28265, 28266, 28267, 28268, 28269, 28270, 28271, 28272, 28273, 28274, 28275, 28276, 28277, 28278, 28279, 28280, 28281, 28282, 28283, 28284, 28285, 28286, 28287, 28288, 28289, 28290, 28291, 28292, 28293, 28294, 28295, 28296, 28297, 28298, 28299, 28300, 28301, 28302, 28303, 28304, 28305});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSetUserInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSetUserInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSetUserInfo cSSetUserInfo);

        private native CSSetUserInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSetUserInfo(com.google.protobuf.GeneratedMessage.Builder builder, CSSetUserInfo cSSetUserInfo);

        private native CSSetUserInfo(boolean z);

        private native void initFields();

        public final native int getBMute();

        public final native int getBVibrate();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7435getDefaultInstanceForType();

        public final native CSSetUserInfo m7436getDefaultInstanceForType();

        public final native int getIGender();

        public final native Parser<CSSetUserInfo> getParserForType();

        public final native String getSDesc();

        public final native ByteString getSDescBytes();

        public final native String getSIconUrl();

        public final native ByteString getSIconUrlBytes();

        public final native String getSNickname();

        public final native ByteString getSNicknameBytes();

        public final native String getSPhhoneNumber();

        public final native ByteString getSPhhoneNumberBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasBMute();

        public final native boolean hasBVibrate();

        public final native boolean hasIGender();

        public final native boolean hasSDesc();

        public final native boolean hasSIconUrl();

        public final native boolean hasSNickname();

        public final native boolean hasSPhhoneNumber();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7437newBuilderForType();

        public final native Builder m7438newBuilderForType();

        protected final native Builder m7439newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7440toBuilder();

        public final native Builder m7441toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSetUserInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f286Q;
        }

        static void __clinit__() {
            PARSER = new C03141();
            CSSetUserInfo cSSetUserInfo = new CSSetUserInfo(true);
            defaultInstance = cSSetUserInfo;
            cSSetUserInfo.initFields();
        }

        public static CSSetUserInfo parseFrom(ByteString byteString) {
            return (CSSetUserInfo) PARSER.parseFrom(byteString);
        }

        public static CSSetUserInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSetUserInfo parseFrom(byte[] bArr) {
            return (CSSetUserInfo) PARSER.parseFrom(bArr);
        }

        public static CSSetUserInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSetUserInfo parseFrom(InputStream inputStream) {
            return (CSSetUserInfo) PARSER.parseFrom(inputStream);
        }

        public static CSSetUserInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetUserInfo parseDelimitedFrom(InputStream inputStream) {
            return (CSSetUserInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSetUserInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetUserInfo parseFrom(CodedInputStream codedInputStream) {
            return (CSSetUserInfo) PARSER.parseFrom(codedInputStream);
        }

        public static CSSetUserInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSetUserInfo cSSetUserInfo) {
            return newBuilder().mergeFrom(cSSetUserInfo);
        }
    }

    public interface CSSetUserInfoNewOrBuilder extends MessageOrBuilder {
        int getBMute();

        int getBVibrate();

        int getIGender();

        String getSDesc();

        ByteString getSDescBytes();

        String getSIconUrl();

        ByteString getSIconUrlBytes();

        String getSNickname();

        ByteString getSNicknameBytes();

        String getSPhhoneNumber();

        ByteString getSPhhoneNumberBytes();

        long getUuid();

        boolean hasBMute();

        boolean hasBVibrate();

        boolean hasIGender();

        boolean hasSDesc();

        boolean hasSIconUrl();

        boolean hasSNickname();

        boolean hasSPhhoneNumber();

        boolean hasUuid();
    }

    public static final class CSSetUserInfoNew extends GeneratedMessage implements CSSetUserInfoNewOrBuilder {
        public static final int BMUTE_FIELD_NUMBER = 7;
        public static final int BVIBRATE_FIELD_NUMBER = 8;
        public static final int IGENDER_FIELD_NUMBER = 3;
        public static Parser<CSSetUserInfoNew> PARSER = null;
        public static final int SDESC_FIELD_NUMBER = 6;
        public static final int SICONURL_FIELD_NUMBER = 4;
        public static final int SNICKNAME_FIELD_NUMBER = 2;
        public static final int SPHHONENUMBER_FIELD_NUMBER = 5;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSetUserInfoNew defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bMute_;
        private int bVibrate_;
        private int bitField0_;
        private int iGender_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sDesc_;
        private Object sIconUrl_;
        private Object sNickname_;
        private Object sPhhoneNumber_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSSetUserInfoNew.1 */
        class C03151 extends AbstractParser<CSSetUserInfoNew> {
            static {
                fixHelper.fixfunc(new int[]{21607, 21608});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03151();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSetUserInfoNewOrBuilder {
            private int bMute_;
            private int bVibrate_;
            private int bitField0_;
            private int iGender_;
            private Object sDesc_;
            private Object sIconUrl_;
            private Object sNickname_;
            private Object sPhhoneNumber_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{7460, 7461, 7462, 7463, 7464, 7465, 7466, 7467, 7468, 7469, 7470, 7471, 7472, 7473, 7474, 7475, 7476, 7477, 7478, 7479, 7480, 7481, 7482, 7483, 7484, 7485, 7486, 7487, 7488, 7489, 7490, 7491, 7492, 7493, 7494, 7495, 7496, 7497, 7498, 7499, 7500, 7501, 7502, 7503, 7504, 7505, 7506, 7507, 7508, 7509, 7510, 7511, 7512, 7513, 7514, 7515, 7516, 7517, 7518, 7519, 7520, 7521, 7522, 7523, 7524, 7525, 7526, 7527, 7528, 7529, 7530, 7531});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7466build();

            public final native CSSetUserInfoNew m7467build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7468buildPartial();

            public final native CSSetUserInfoNew m7469buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7470clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7471clear();

            public final native Builder m7472clear();

            public final native Builder clearBMute();

            public final native Builder clearBVibrate();

            public final native Builder clearIGender();

            public final native Builder clearSDesc();

            public final native Builder clearSIconUrl();

            public final native Builder clearSNickname();

            public final native Builder clearSPhhoneNumber();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7473clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7474clone();

            public final native Builder m7475clone();

            public final native int getBMute();

            public final native int getBVibrate();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7476getDefaultInstanceForType();

            public final native CSSetUserInfoNew m7477getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIGender();

            public final native String getSDesc();

            public final native ByteString getSDescBytes();

            public final native String getSIconUrl();

            public final native ByteString getSIconUrlBytes();

            public final native String getSNickname();

            public final native ByteString getSNicknameBytes();

            public final native String getSPhhoneNumber();

            public final native ByteString getSPhhoneNumberBytes();

            public final native long getUuid();

            public final native boolean hasBMute();

            public final native boolean hasBVibrate();

            public final native boolean hasIGender();

            public final native boolean hasSDesc();

            public final native boolean hasSIconUrl();

            public final native boolean hasSNickname();

            public final native boolean hasSPhhoneNumber();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7478mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7479mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7480mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7481mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7482mergeFrom(Message message);

            public final native Builder mergeFrom(CSSetUserInfoNew cSSetUserInfoNew);

            public final native Builder setBMute(int i);

            public final native Builder setBVibrate(int i);

            public final native Builder setIGender(int i);

            public final native Builder setSDesc(String str);

            public final native Builder setSDescBytes(ByteString byteString);

            public final native Builder setSIconUrl(String str);

            public final native Builder setSIconUrlBytes(ByteString byteString);

            public final native Builder setSNickname(String str);

            public final native Builder setSNicknameBytes(ByteString byteString);

            public final native Builder setSPhhoneNumber(String str);

            public final native Builder setSPhhoneNumberBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f282M;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{12869, 12870, 12871, 12872, 12873, 12874, 12875, 12876, 12877, 12878, 12879, 12880, 12881, 12882, 12883, 12884, 12885, 12886, 12887, 12888, 12889, 12890, 12891, 12892, 12893, 12894, 12895, 12896, 12897, 12898, 12899, 12900, 12901, 12902, 12903, 12904, 12905, 12906, 12907, 12908, 12909, 12910, 12911, 12912});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSetUserInfoNew(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSetUserInfoNew(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSetUserInfoNew cSSetUserInfoNew);

        private native CSSetUserInfoNew(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSetUserInfoNew(com.google.protobuf.GeneratedMessage.Builder builder, CSSetUserInfoNew cSSetUserInfoNew);

        private native CSSetUserInfoNew(boolean z);

        private native void initFields();

        public final native int getBMute();

        public final native int getBVibrate();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7459getDefaultInstanceForType();

        public final native CSSetUserInfoNew m7460getDefaultInstanceForType();

        public final native int getIGender();

        public final native Parser<CSSetUserInfoNew> getParserForType();

        public final native String getSDesc();

        public final native ByteString getSDescBytes();

        public final native String getSIconUrl();

        public final native ByteString getSIconUrlBytes();

        public final native String getSNickname();

        public final native ByteString getSNicknameBytes();

        public final native String getSPhhoneNumber();

        public final native ByteString getSPhhoneNumberBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasBMute();

        public final native boolean hasBVibrate();

        public final native boolean hasIGender();

        public final native boolean hasSDesc();

        public final native boolean hasSIconUrl();

        public final native boolean hasSNickname();

        public final native boolean hasSPhhoneNumber();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7461newBuilderForType();

        public final native Builder m7462newBuilderForType();

        protected final native Builder m7463newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7464toBuilder();

        public final native Builder m7465toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSetUserInfoNew getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f282M;
        }

        static void __clinit__() {
            PARSER = new C03151();
            CSSetUserInfoNew cSSetUserInfoNew = new CSSetUserInfoNew(true);
            defaultInstance = cSSetUserInfoNew;
            cSSetUserInfoNew.initFields();
        }

        public static CSSetUserInfoNew parseFrom(ByteString byteString) {
            return (CSSetUserInfoNew) PARSER.parseFrom(byteString);
        }

        public static CSSetUserInfoNew parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfoNew) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSetUserInfoNew parseFrom(byte[] bArr) {
            return (CSSetUserInfoNew) PARSER.parseFrom(bArr);
        }

        public static CSSetUserInfoNew parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfoNew) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSetUserInfoNew parseFrom(InputStream inputStream) {
            return (CSSetUserInfoNew) PARSER.parseFrom(inputStream);
        }

        public static CSSetUserInfoNew parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfoNew) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetUserInfoNew parseDelimitedFrom(InputStream inputStream) {
            return (CSSetUserInfoNew) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSetUserInfoNew parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfoNew) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetUserInfoNew parseFrom(CodedInputStream codedInputStream) {
            return (CSSetUserInfoNew) PARSER.parseFrom(codedInputStream);
        }

        public static CSSetUserInfoNew parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfoNew) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSetUserInfoNew cSSetUserInfoNew) {
            return newBuilder().mergeFrom(cSSetUserInfoNew);
        }
    }

    public interface CSSetUserInfoSettingOrBuilder extends MessageOrBuilder {
        int getIFriendInviteMute();

        int getIMute();

        int getIVibrate();

        long getUuid();

        boolean hasIFriendInviteMute();

        boolean hasIMute();

        boolean hasIVibrate();

        boolean hasUuid();
    }

    public static final class CSSetUserInfoSetting extends GeneratedMessage implements CSSetUserInfoSettingOrBuilder {
        public static final int IFRIENDINVITEMUTE_FIELD_NUMBER = 4;
        public static final int IMUTE_FIELD_NUMBER = 2;
        public static final int IVIBRATE_FIELD_NUMBER = 3;
        public static Parser<CSSetUserInfoSetting> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSetUserInfoSetting defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iFriendInviteMute_;
        private int iMute_;
        private int iVibrate_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSSetUserInfoSetting.1 */
        class C03161 extends AbstractParser<CSSetUserInfoSetting> {
            static {
                fixHelper.fixfunc(new int[]{17423, 17424});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03161();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSetUserInfoSettingOrBuilder {
            private int bitField0_;
            private int iFriendInviteMute_;
            private int iMute_;
            private int iVibrate_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{6198, 6199, 6200, 6201, 6202, 6203, 6204, 6205, 6206, 6207, 6208, 6209, 6210, 6211, 6212, 6213, 6214, 6215, 6216, 6217, 6218, 6219, 6220, 6221, 6222, 6223, 6224, 6225, 6226, 6227, 6228, 6229, 6230, 6231, 6232, 6233, 6234, 6235, 6236, 6237, 6238, 6239, 6240, 6241, 6242, 6243, 6244, 6245});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7490build();

            public final native CSSetUserInfoSetting m7491build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7492buildPartial();

            public final native CSSetUserInfoSetting m7493buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7494clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7495clear();

            public final native Builder m7496clear();

            public final native Builder clearIFriendInviteMute();

            public final native Builder clearIMute();

            public final native Builder clearIVibrate();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7497clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7498clone();

            public final native Builder m7499clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7500getDefaultInstanceForType();

            public final native CSSetUserInfoSetting m7501getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIFriendInviteMute();

            public final native int getIMute();

            public final native int getIVibrate();

            public final native long getUuid();

            public final native boolean hasIFriendInviteMute();

            public final native boolean hasIMute();

            public final native boolean hasIVibrate();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7502mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7503mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7504mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7505mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7506mergeFrom(Message message);

            public final native Builder mergeFrom(CSSetUserInfoSetting cSSetUserInfoSetting);

            public final native Builder setIFriendInviteMute(int i);

            public final native Builder setIMute(int i);

            public final native Builder setIVibrate(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f290U;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{5842, 5843, 5844, 5845, 5846, 5847, 5848, 5849, 5850, 5851, 5852, 5853, 5854, 5855, 5856, 5857, 5858, 5859, 5860, 5861, 5862, 5863, 5864, 5865, 5866, 5867, 5868, 5869, 5870, 5871, 5872, 5873});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSetUserInfoSetting(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSetUserInfoSetting(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSetUserInfoSetting cSSetUserInfoSetting);

        private native CSSetUserInfoSetting(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSetUserInfoSetting(com.google.protobuf.GeneratedMessage.Builder builder, CSSetUserInfoSetting cSSetUserInfoSetting);

        private native CSSetUserInfoSetting(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7483getDefaultInstanceForType();

        public final native CSSetUserInfoSetting m7484getDefaultInstanceForType();

        public final native int getIFriendInviteMute();

        public final native int getIMute();

        public final native int getIVibrate();

        public final native Parser<CSSetUserInfoSetting> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasIFriendInviteMute();

        public final native boolean hasIMute();

        public final native boolean hasIVibrate();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7485newBuilderForType();

        public final native Builder m7486newBuilderForType();

        protected final native Builder m7487newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7488toBuilder();

        public final native Builder m7489toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSetUserInfoSetting getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f290U;
        }

        static void __clinit__() {
            PARSER = new C03161();
            CSSetUserInfoSetting cSSetUserInfoSetting = new CSSetUserInfoSetting(true);
            defaultInstance = cSSetUserInfoSetting;
            cSSetUserInfoSetting.initFields();
        }

        public static CSSetUserInfoSetting parseFrom(ByteString byteString) {
            return (CSSetUserInfoSetting) PARSER.parseFrom(byteString);
        }

        public static CSSetUserInfoSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfoSetting) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSetUserInfoSetting parseFrom(byte[] bArr) {
            return (CSSetUserInfoSetting) PARSER.parseFrom(bArr);
        }

        public static CSSetUserInfoSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfoSetting) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSetUserInfoSetting parseFrom(InputStream inputStream) {
            return (CSSetUserInfoSetting) PARSER.parseFrom(inputStream);
        }

        public static CSSetUserInfoSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfoSetting) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetUserInfoSetting parseDelimitedFrom(InputStream inputStream) {
            return (CSSetUserInfoSetting) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSetUserInfoSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfoSetting) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetUserInfoSetting parseFrom(CodedInputStream codedInputStream) {
            return (CSSetUserInfoSetting) PARSER.parseFrom(codedInputStream);
        }

        public static CSSetUserInfoSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetUserInfoSetting) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSetUserInfoSetting cSSetUserInfoSetting) {
            return newBuilder().mergeFrom(cSSetUserInfoSetting);
        }
    }

    public interface CSSystemFriendMsgRspOrBuilder extends MessageOrBuilder {
        long getUuid();

        long getVMsgIds(int i);

        int getVMsgIdsCount();

        List<Long> getVMsgIdsList();

        boolean hasUuid();
    }

    public static final class CSSystemFriendMsgRsp extends GeneratedMessage implements CSSystemFriendMsgRspOrBuilder {
        public static Parser<CSSystemFriendMsgRsp> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VMSGIDS_FIELD_NUMBER = 2;
        private static final CSSystemFriendMsgRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private List<Long> vMsgIds_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSSystemFriendMsgRsp.1 */
        class C03171 extends AbstractParser<CSSystemFriendMsgRsp> {
            static {
                fixHelper.fixfunc(new int[]{25094, 25095});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03171();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSystemFriendMsgRspOrBuilder {
            private int bitField0_;
            private long uuid_;
            private List<Long> vMsgIds_;

            static {
                fixHelper.fixfunc(new int[]{33396, 33397, 33398, 33399, 33400, 33401, 33402, 33403, 33404, 33405, 33406, 33407, 33408, 33409, 33410, 33411, 33412, 33413, 33414, 33415, 33416, 33417, 33418, 33419, 33420, 33421, 33422, 33423, 33424, 33425, 33426, 33427, 33428, 33429, 33430, 33431, 33432, 33433, 33434, 33435, 33436, 33437, 33438, 33439});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVMsgIdsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVMsgIds(Iterable<? extends Long> iterable);

            public final native Builder addVMsgIds(long j);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7514build();

            public final native CSSystemFriendMsgRsp m7515build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7516buildPartial();

            public final native CSSystemFriendMsgRsp m7517buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7518clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7519clear();

            public final native Builder m7520clear();

            public final native Builder clearUuid();

            public final native Builder clearVMsgIds();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7521clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7522clone();

            public final native Builder m7523clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7524getDefaultInstanceForType();

            public final native CSSystemFriendMsgRsp m7525getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native long getVMsgIds(int i);

            public final native int getVMsgIdsCount();

            public final native List<Long> getVMsgIdsList();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7526mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7527mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7528mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7529mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7530mergeFrom(Message message);

            public final native Builder mergeFrom(CSSystemFriendMsgRsp cSSystemFriendMsgRsp);

            public final native Builder setUuid(long j);

            public final native Builder setVMsgIds(int i, long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aM;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{26563, 26564, 26565, 26566, 26567, 26568, 26569, 26570, 26571, 26572, 26573, 26574, 26575, 26576, 26577, 26578, 26579, 26580, 26581, 26582, 26583, 26584, 26585, 26586, 26587, 26588, 26589, 26590, 26591});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSystemFriendMsgRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSystemFriendMsgRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSystemFriendMsgRsp cSSystemFriendMsgRsp);

        private native CSSystemFriendMsgRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSystemFriendMsgRsp(com.google.protobuf.GeneratedMessage.Builder builder, CSSystemFriendMsgRsp cSSystemFriendMsgRsp);

        private native CSSystemFriendMsgRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7507getDefaultInstanceForType();

        public final native CSSystemFriendMsgRsp m7508getDefaultInstanceForType();

        public final native Parser<CSSystemFriendMsgRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native long getVMsgIds(int i);

        public final native int getVMsgIdsCount();

        public final native List<Long> getVMsgIdsList();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7509newBuilderForType();

        public final native Builder m7510newBuilderForType();

        protected final native Builder m7511newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7512toBuilder();

        public final native Builder m7513toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSystemFriendMsgRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aM;
        }

        static void __clinit__() {
            PARSER = new C03171();
            CSSystemFriendMsgRsp cSSystemFriendMsgRsp = new CSSystemFriendMsgRsp(true);
            defaultInstance = cSSystemFriendMsgRsp;
            cSSystemFriendMsgRsp.initFields();
        }

        public static CSSystemFriendMsgRsp parseFrom(ByteString byteString) {
            return (CSSystemFriendMsgRsp) PARSER.parseFrom(byteString);
        }

        public static CSSystemFriendMsgRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSystemFriendMsgRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSystemFriendMsgRsp parseFrom(byte[] bArr) {
            return (CSSystemFriendMsgRsp) PARSER.parseFrom(bArr);
        }

        public static CSSystemFriendMsgRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSystemFriendMsgRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSystemFriendMsgRsp parseFrom(InputStream inputStream) {
            return (CSSystemFriendMsgRsp) PARSER.parseFrom(inputStream);
        }

        public static CSSystemFriendMsgRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSystemFriendMsgRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSystemFriendMsgRsp parseDelimitedFrom(InputStream inputStream) {
            return (CSSystemFriendMsgRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSystemFriendMsgRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSystemFriendMsgRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSystemFriendMsgRsp parseFrom(CodedInputStream codedInputStream) {
            return (CSSystemFriendMsgRsp) PARSER.parseFrom(codedInputStream);
        }

        public static CSSystemFriendMsgRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSystemFriendMsgRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSystemFriendMsgRsp cSSystemFriendMsgRsp) {
            return newBuilder().mergeFrom(cSSystemFriendMsgRsp);
        }
    }

    public interface CSUploadFriendRelationOrBuilder extends MessageOrBuilder {
        UPLOAD_FRIEND_RELATION_TYPE getEUploadType();

        long getUuid();

        UploadUserInfoNet getVFriendsInfo(int i);

        int getVFriendsInfoCount();

        List<UploadUserInfoNet> getVFriendsInfoList();

        UploadUserInfoNetOrBuilder getVFriendsInfoOrBuilder(int i);

        List<? extends UploadUserInfoNetOrBuilder> getVFriendsInfoOrBuilderList();

        boolean hasEUploadType();

        boolean hasUuid();
    }

    public static final class CSUploadFriendRelation extends GeneratedMessage implements CSUploadFriendRelationOrBuilder {
        public static final int EUPLOADTYPE_FIELD_NUMBER = 2;
        public static Parser<CSUploadFriendRelation> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VFRIENDSINFO_FIELD_NUMBER = 3;
        private static final CSUploadFriendRelation defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private UPLOAD_FRIEND_RELATION_TYPE eUploadType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private List<UploadUserInfoNet> vFriendsInfo_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSUploadFriendRelation.1 */
        class C03181 extends AbstractParser<CSUploadFriendRelation> {
            static {
                fixHelper.fixfunc(new int[]{26063, 26064});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03181();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSUploadFriendRelationOrBuilder {
            private int bitField0_;
            private UPLOAD_FRIEND_RELATION_TYPE eUploadType_;
            private long uuid_;
            private RepeatedFieldBuilder<UploadUserInfoNet, Builder, UploadUserInfoNetOrBuilder> vFriendsInfoBuilder_;
            private List<UploadUserInfoNet> vFriendsInfo_;

            static {
                fixHelper.fixfunc(new int[]{27244, 27245, 27246, 27247, 27248, 27249, 27250, 27251, 27252, 27253, 27254, 27255, 27256, 27257, 27258, 27259, 27260, 27261, 27262, 27263, 27264, 27265, 27266, 27267, 27268, 27269, 27270, 27271, 27272, 27273, 27274, 27275, 27276, 27277, 27278, 27279, 27280, 27281, 27282, 27283, 27284, 27285, 27286, 27287, 27288, 27289, 27290, 27291, 27292, 27293, 27294, 27295, 27296, 27297, 27298, 27299, 27300, 27301, 27302, 27303});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVFriendsInfoIsMutable();

            private native RepeatedFieldBuilder<UploadUserInfoNet, Builder, UploadUserInfoNetOrBuilder> getVFriendsInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVFriendsInfo(Iterable<? extends UploadUserInfoNet> iterable);

            public final native Builder addVFriendsInfo(int i, Builder builder);

            public final native Builder addVFriendsInfo(int i, UploadUserInfoNet uploadUserInfoNet);

            public final native Builder addVFriendsInfo(Builder builder);

            public final native Builder addVFriendsInfo(UploadUserInfoNet uploadUserInfoNet);

            public final native Builder addVFriendsInfoBuilder();

            public final native Builder addVFriendsInfoBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7538build();

            public final native CSUploadFriendRelation m7539build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7540buildPartial();

            public final native CSUploadFriendRelation m7541buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7542clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7543clear();

            public final native Builder m7544clear();

            public final native Builder clearEUploadType();

            public final native Builder clearUuid();

            public final native Builder clearVFriendsInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7545clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7546clone();

            public final native Builder m7547clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7548getDefaultInstanceForType();

            public final native CSUploadFriendRelation m7549getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native UPLOAD_FRIEND_RELATION_TYPE getEUploadType();

            public final native long getUuid();

            public final native UploadUserInfoNet getVFriendsInfo(int i);

            public final native Builder getVFriendsInfoBuilder(int i);

            public final native List<Builder> getVFriendsInfoBuilderList();

            public final native int getVFriendsInfoCount();

            public final native List<UploadUserInfoNet> getVFriendsInfoList();

            public final native UploadUserInfoNetOrBuilder getVFriendsInfoOrBuilder(int i);

            public final native List<? extends UploadUserInfoNetOrBuilder> getVFriendsInfoOrBuilderList();

            public final native boolean hasEUploadType();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7550mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7551mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7552mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7553mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7554mergeFrom(Message message);

            public final native Builder mergeFrom(CSUploadFriendRelation cSUploadFriendRelation);

            public final native Builder removeVFriendsInfo(int i);

            public final native Builder setEUploadType(UPLOAD_FRIEND_RELATION_TYPE upload_friend_relation_type);

            public final native Builder setUuid(long j);

            public final native Builder setVFriendsInfo(int i, Builder builder);

            public final native Builder setVFriendsInfo(int i, UploadUserInfoNet uploadUserInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.ao;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{23420, 23421, 23422, 23423, 23424, 23425, 23426, 23427, 23428, 23429, 23430, 23431, 23432, 23433, 23434, 23435, 23436, 23437, 23438, 23439, 23440, 23441, 23442, 23443, 23444, 23445, 23446, 23447, 23448, 23449, 23450, 23451, 23452});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSUploadFriendRelation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSUploadFriendRelation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSUploadFriendRelation cSUploadFriendRelation);

        private native CSUploadFriendRelation(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSUploadFriendRelation(com.google.protobuf.GeneratedMessage.Builder builder, CSUploadFriendRelation cSUploadFriendRelation);

        private native CSUploadFriendRelation(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7531getDefaultInstanceForType();

        public final native CSUploadFriendRelation m7532getDefaultInstanceForType();

        public final native UPLOAD_FRIEND_RELATION_TYPE getEUploadType();

        public final native Parser<CSUploadFriendRelation> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native UploadUserInfoNet getVFriendsInfo(int i);

        public final native int getVFriendsInfoCount();

        public final native List<UploadUserInfoNet> getVFriendsInfoList();

        public final native UploadUserInfoNetOrBuilder getVFriendsInfoOrBuilder(int i);

        public final native List<? extends UploadUserInfoNetOrBuilder> getVFriendsInfoOrBuilderList();

        public final native boolean hasEUploadType();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7533newBuilderForType();

        public final native Builder m7534newBuilderForType();

        protected final native Builder m7535newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7536toBuilder();

        public final native Builder m7537toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSUploadFriendRelation getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.ao;
        }

        static void __clinit__() {
            PARSER = new C03181();
            CSUploadFriendRelation cSUploadFriendRelation = new CSUploadFriendRelation(true);
            defaultInstance = cSUploadFriendRelation;
            cSUploadFriendRelation.initFields();
        }

        public static CSUploadFriendRelation parseFrom(ByteString byteString) {
            return (CSUploadFriendRelation) PARSER.parseFrom(byteString);
        }

        public static CSUploadFriendRelation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadFriendRelation) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSUploadFriendRelation parseFrom(byte[] bArr) {
            return (CSUploadFriendRelation) PARSER.parseFrom(bArr);
        }

        public static CSUploadFriendRelation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadFriendRelation) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSUploadFriendRelation parseFrom(InputStream inputStream) {
            return (CSUploadFriendRelation) PARSER.parseFrom(inputStream);
        }

        public static CSUploadFriendRelation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadFriendRelation) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadFriendRelation parseDelimitedFrom(InputStream inputStream) {
            return (CSUploadFriendRelation) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSUploadFriendRelation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadFriendRelation) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadFriendRelation parseFrom(CodedInputStream codedInputStream) {
            return (CSUploadFriendRelation) PARSER.parseFrom(codedInputStream);
        }

        public static CSUploadFriendRelation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadFriendRelation) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSUploadFriendRelation cSUploadFriendRelation) {
            return newBuilder().mergeFrom(cSUploadFriendRelation);
        }
    }

    public interface CSUploadIconOrBuilder extends MessageOrBuilder {
        long getUuid();

        ByteString getVIconDatas();

        boolean hasUuid();

        boolean hasVIconDatas();
    }

    public static final class CSUploadIcon extends GeneratedMessage implements CSUploadIconOrBuilder {
        public static Parser<CSUploadIcon> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VICONDATAS_FIELD_NUMBER = 2;
        private static final CSUploadIcon defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private ByteString vIconDatas_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSUploadIcon.1 */
        class C03191 extends AbstractParser<CSUploadIcon> {
            static {
                fixHelper.fixfunc(new int[]{32218, 32219});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03191();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSUploadIconOrBuilder {
            private int bitField0_;
            private long uuid_;
            private ByteString vIconDatas_;

            static {
                fixHelper.fixfunc(new int[]{13421, 13422, 13423, 13424, 13425, 13426, 13427, 13428, 13429, 13430, 13431, 13432, 13433, 13434, 13435, 13436, 13437, 13438, 13439, 13440, 13441, 13442, 13443, 13444, 13445, 13446, 13447, 13448, 13449, 13450, 13451, 13452, 13453, 13454, 13455, 13456, 13457, 13458, 13459, 13460});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7562build();

            public final native CSUploadIcon m7563build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7564buildPartial();

            public final native CSUploadIcon m7565buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7566clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7567clear();

            public final native Builder m7568clear();

            public final native Builder clearUuid();

            public final native Builder clearVIconDatas();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7569clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7570clone();

            public final native Builder m7571clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7572getDefaultInstanceForType();

            public final native CSUploadIcon m7573getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native ByteString getVIconDatas();

            public final native boolean hasUuid();

            public final native boolean hasVIconDatas();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7574mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7575mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7576mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7577mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7578mergeFrom(Message message);

            public final native Builder mergeFrom(CSUploadIcon cSUploadIcon);

            public final native Builder setUuid(long j);

            public final native Builder setVIconDatas(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f294Y;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{24817, 24818, 24819, 24820, 24821, 24822, 24823, 24824, 24825, 24826, 24827, 24828, 24829, 24830, 24831, 24832, 24833, 24834, 24835, 24836, 24837, 24838, 24839, 24840, 24841, 24842, 24843, 24844});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSUploadIcon(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSUploadIcon(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSUploadIcon cSUploadIcon);

        private native CSUploadIcon(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSUploadIcon(com.google.protobuf.GeneratedMessage.Builder builder, CSUploadIcon cSUploadIcon);

        private native CSUploadIcon(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7555getDefaultInstanceForType();

        public final native CSUploadIcon m7556getDefaultInstanceForType();

        public final native Parser<CSUploadIcon> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native ByteString getVIconDatas();

        public final native boolean hasUuid();

        public final native boolean hasVIconDatas();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7557newBuilderForType();

        public final native Builder m7558newBuilderForType();

        protected final native Builder m7559newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7560toBuilder();

        public final native Builder m7561toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSUploadIcon getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f294Y;
        }

        static void __clinit__() {
            PARSER = new C03191();
            CSUploadIcon cSUploadIcon = new CSUploadIcon(true);
            defaultInstance = cSUploadIcon;
            cSUploadIcon.initFields();
        }

        public static CSUploadIcon parseFrom(ByteString byteString) {
            return (CSUploadIcon) PARSER.parseFrom(byteString);
        }

        public static CSUploadIcon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadIcon) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSUploadIcon parseFrom(byte[] bArr) {
            return (CSUploadIcon) PARSER.parseFrom(bArr);
        }

        public static CSUploadIcon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadIcon) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSUploadIcon parseFrom(InputStream inputStream) {
            return (CSUploadIcon) PARSER.parseFrom(inputStream);
        }

        public static CSUploadIcon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadIcon) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadIcon parseDelimitedFrom(InputStream inputStream) {
            return (CSUploadIcon) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSUploadIcon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadIcon) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadIcon parseFrom(CodedInputStream codedInputStream) {
            return (CSUploadIcon) PARSER.parseFrom(codedInputStream);
        }

        public static CSUploadIcon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadIcon) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSUploadIcon cSUploadIcon) {
            return newBuilder().mergeFrom(cSUploadIcon);
        }
    }

    public interface CSUploadSGScoreOrBuilder extends MessageOrBuilder {
        int getIBetTimes();

        int getIDoubleWinTimes();

        int getIWinTimes();

        long getLMsg();

        long getLPopularity();

        long getUuid();

        boolean hasIBetTimes();

        boolean hasIDoubleWinTimes();

        boolean hasIWinTimes();

        boolean hasLMsg();

        boolean hasLPopularity();

        boolean hasUuid();
    }

    public static final class CSUploadSGScore extends GeneratedMessage implements CSUploadSGScoreOrBuilder {
        public static final int IBETTIMES_FIELD_NUMBER = 3;
        public static final int IDOUBLEWINTIMES_FIELD_NUMBER = 5;
        public static final int IWINTIMES_FIELD_NUMBER = 4;
        public static final int LMSG_FIELD_NUMBER = 6;
        public static final int LPOPULARITY_FIELD_NUMBER = 2;
        public static Parser<CSUploadSGScore> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSUploadSGScore defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iBetTimes_;
        private int iDoubleWinTimes_;
        private int iWinTimes_;
        private long lMsg_;
        private long lPopularity_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSUploadSGScore.1 */
        class C03201 extends AbstractParser<CSUploadSGScore> {
            static {
                fixHelper.fixfunc(new int[]{34091, 34092});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03201();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSUploadSGScoreOrBuilder {
            private int bitField0_;
            private int iBetTimes_;
            private int iDoubleWinTimes_;
            private int iWinTimes_;
            private long lMsg_;
            private long lPopularity_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{8722, 8723, 8724, 8725, 8726, 8727, 8728, 8729, 8730, 8731, 8732, 8733, 8734, 8735, 8736, 8737, 8738, 8739, 8740, 8741, 8742, 8743, 8744, 8745, 8746, 8747, 8748, 8749, 8750, 8751, 8752, 8753, 8754, 8755, 8756, 8757, 8758, 8759, 8760, 8761, 8762, 8763, 8764, 8765, 8766, 8767, 8768, 8769, 8770, 8771, 8772, 8773, 8774, 8775, 8776, 8777});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7586build();

            public final native CSUploadSGScore m7587build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7588buildPartial();

            public final native CSUploadSGScore m7589buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7590clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7591clear();

            public final native Builder m7592clear();

            public final native Builder clearIBetTimes();

            public final native Builder clearIDoubleWinTimes();

            public final native Builder clearIWinTimes();

            public final native Builder clearLMsg();

            public final native Builder clearLPopularity();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7593clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7594clone();

            public final native Builder m7595clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7596getDefaultInstanceForType();

            public final native CSUploadSGScore m7597getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIBetTimes();

            public final native int getIDoubleWinTimes();

            public final native int getIWinTimes();

            public final native long getLMsg();

            public final native long getLPopularity();

            public final native long getUuid();

            public final native boolean hasIBetTimes();

            public final native boolean hasIDoubleWinTimes();

            public final native boolean hasIWinTimes();

            public final native boolean hasLMsg();

            public final native boolean hasLPopularity();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7598mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7599mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7600mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7601mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7602mergeFrom(Message message);

            public final native Builder mergeFrom(CSUploadSGScore cSUploadSGScore);

            public final native Builder setIBetTimes(int i);

            public final native Builder setIDoubleWinTimes(int i);

            public final native Builder setIWinTimes(int i);

            public final native Builder setLMsg(long j);

            public final native Builder setLPopularity(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f296a;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{11504, 11505, 11506, 11507, 11508, 11509, 11510, 11511, 11512, 11513, 11514, 11515, 11516, 11517, 11518, 11519, 11520, 11521, 11522, 11523, 11524, 11525, 11526, 11527, 11528, 11529, 11530, 11531, 11532, 11533, 11534, 11535, 11536, 11537, 11538, 11539});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSUploadSGScore(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSUploadSGScore(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSUploadSGScore cSUploadSGScore);

        private native CSUploadSGScore(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSUploadSGScore(com.google.protobuf.GeneratedMessage.Builder builder, CSUploadSGScore cSUploadSGScore);

        private native CSUploadSGScore(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7579getDefaultInstanceForType();

        public final native CSUploadSGScore m7580getDefaultInstanceForType();

        public final native int getIBetTimes();

        public final native int getIDoubleWinTimes();

        public final native int getIWinTimes();

        public final native long getLMsg();

        public final native long getLPopularity();

        public final native Parser<CSUploadSGScore> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasIBetTimes();

        public final native boolean hasIDoubleWinTimes();

        public final native boolean hasIWinTimes();

        public final native boolean hasLMsg();

        public final native boolean hasLPopularity();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7581newBuilderForType();

        public final native Builder m7582newBuilderForType();

        protected final native Builder m7583newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7584toBuilder();

        public final native Builder m7585toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSUploadSGScore getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f296a;
        }

        static void __clinit__() {
            PARSER = new C03201();
            CSUploadSGScore cSUploadSGScore = new CSUploadSGScore(true);
            defaultInstance = cSUploadSGScore;
            cSUploadSGScore.initFields();
        }

        public static CSUploadSGScore parseFrom(ByteString byteString) {
            return (CSUploadSGScore) PARSER.parseFrom(byteString);
        }

        public static CSUploadSGScore parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadSGScore) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSUploadSGScore parseFrom(byte[] bArr) {
            return (CSUploadSGScore) PARSER.parseFrom(bArr);
        }

        public static CSUploadSGScore parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadSGScore) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSUploadSGScore parseFrom(InputStream inputStream) {
            return (CSUploadSGScore) PARSER.parseFrom(inputStream);
        }

        public static CSUploadSGScore parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadSGScore) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadSGScore parseDelimitedFrom(InputStream inputStream) {
            return (CSUploadSGScore) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSUploadSGScore parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadSGScore) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadSGScore parseFrom(CodedInputStream codedInputStream) {
            return (CSUploadSGScore) PARSER.parseFrom(codedInputStream);
        }

        public static CSUploadSGScore parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadSGScore) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSUploadSGScore cSUploadSGScore) {
            return newBuilder().mergeFrom(cSUploadSGScore);
        }
    }

    public interface CSUploadUserCoverOrBuilder extends MessageOrBuilder {
        int getIPos();

        long getUuid();

        ByteString getVIconDatas();

        boolean hasIPos();

        boolean hasUuid();

        boolean hasVIconDatas();
    }

    public static final class CSUploadUserCover extends GeneratedMessage implements CSUploadUserCoverOrBuilder {
        public static final int IPOS_FIELD_NUMBER = 3;
        public static Parser<CSUploadUserCover> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VICONDATAS_FIELD_NUMBER = 2;
        private static final CSUploadUserCover defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iPos_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private ByteString vIconDatas_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.CSUploadUserCover.1 */
        class C03211 extends AbstractParser<CSUploadUserCover> {
            static {
                fixHelper.fixfunc(new int[]{24701, 24702});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03211();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSUploadUserCoverOrBuilder {
            private int bitField0_;
            private int iPos_;
            private long uuid_;
            private ByteString vIconDatas_;

            static {
                fixHelper.fixfunc(new int[]{16186, 16187, 16188, 16189, 16190, 16191, 16192, 16193, 16194, 16195, 16196, 16197, 16198, 16199, 16200, 16201, 16202, 16203, 16204, 16205, 16206, 16207, 16208, 16209, 16210, 16211, 16212, 16213, 16214, 16215, 16216, 16217, 16218, 16219, 16220, 16221, 16222, 16223, 16224, 16225, 16226, 16227, 16228, 16229});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7610build();

            public final native CSUploadUserCover m7611build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7612buildPartial();

            public final native CSUploadUserCover m7613buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7614clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7615clear();

            public final native Builder m7616clear();

            public final native Builder clearIPos();

            public final native Builder clearUuid();

            public final native Builder clearVIconDatas();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7617clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7618clone();

            public final native Builder m7619clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7620getDefaultInstanceForType();

            public final native CSUploadUserCover m7621getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIPos();

            public final native long getUuid();

            public final native ByteString getVIconDatas();

            public final native boolean hasIPos();

            public final native boolean hasUuid();

            public final native boolean hasVIconDatas();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7622mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7623mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7624mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7625mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7626mergeFrom(Message message);

            public final native Builder mergeFrom(CSUploadUserCover cSUploadUserCover);

            public final native Builder setIPos(int i);

            public final native Builder setUuid(long j);

            public final native Builder setVIconDatas(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.ac;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{24114, 24115, 24116, 24117, 24118, 24119, 24120, 24121, 24122, 24123, 24124, 24125, 24126, 24127, 24128, 24129, 24130, 24131, 24132, 24133, 24134, 24135, 24136, 24137, 24138, 24139, 24140, 24141, 24142, 24143});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSUploadUserCover(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSUploadUserCover(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSUploadUserCover cSUploadUserCover);

        private native CSUploadUserCover(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSUploadUserCover(com.google.protobuf.GeneratedMessage.Builder builder, CSUploadUserCover cSUploadUserCover);

        private native CSUploadUserCover(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7603getDefaultInstanceForType();

        public final native CSUploadUserCover m7604getDefaultInstanceForType();

        public final native int getIPos();

        public final native Parser<CSUploadUserCover> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native ByteString getVIconDatas();

        public final native boolean hasIPos();

        public final native boolean hasUuid();

        public final native boolean hasVIconDatas();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7605newBuilderForType();

        public final native Builder m7606newBuilderForType();

        protected final native Builder m7607newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7608toBuilder();

        public final native Builder m7609toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSUploadUserCover getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.ac;
        }

        static void __clinit__() {
            PARSER = new C03211();
            CSUploadUserCover cSUploadUserCover = new CSUploadUserCover(true);
            defaultInstance = cSUploadUserCover;
            cSUploadUserCover.initFields();
        }

        public static CSUploadUserCover parseFrom(ByteString byteString) {
            return (CSUploadUserCover) PARSER.parseFrom(byteString);
        }

        public static CSUploadUserCover parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadUserCover) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSUploadUserCover parseFrom(byte[] bArr) {
            return (CSUploadUserCover) PARSER.parseFrom(bArr);
        }

        public static CSUploadUserCover parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadUserCover) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSUploadUserCover parseFrom(InputStream inputStream) {
            return (CSUploadUserCover) PARSER.parseFrom(inputStream);
        }

        public static CSUploadUserCover parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadUserCover) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadUserCover parseDelimitedFrom(InputStream inputStream) {
            return (CSUploadUserCover) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSUploadUserCover parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadUserCover) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSUploadUserCover parseFrom(CodedInputStream codedInputStream) {
            return (CSUploadUserCover) PARSER.parseFrom(codedInputStream);
        }

        public static CSUploadUserCover parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUploadUserCover) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSUploadUserCover cSUploadUserCover) {
            return newBuilder().mergeFrom(cSUploadUserCover);
        }
    }

    public enum FRIEND_MESSAGE_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int FRIEND_MESSAGE_ACCEPT_FRIEND_VALUE = 2;
        public static final int FRIEND_MESSAGE_DELETE_FRIEND_VALUE = 4;
        public static final int FRIEND_MESSAGE_DENY_FRIEND_VALUE = 3;
        public static final int FRIEND_MESSAGE_INVITED_VALUE = 1;
        public static final int FRIEND_MESSAGE_RECOMMAND_FRIEND_VALUE = 5;
        private static final FRIEND_MESSAGE_TYPE[] VALUES = null;
        private static EnumLiteMap<FRIEND_MESSAGE_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.FRIEND_MESSAGE_TYPE.1 */
        class C03221 implements EnumLiteMap<FRIEND_MESSAGE_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{33227, 33228});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03221();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{28100, 28101, 28102, 28103});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native FRIEND_MESSAGE_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            FRIEND_MESSAGE_INVITED = new FRIEND_MESSAGE_TYPE("FRIEND_MESSAGE_INVITED", 0, 0, FRIEND_MESSAGE_INVITED_VALUE);
            FRIEND_MESSAGE_ACCEPT_FRIEND = new FRIEND_MESSAGE_TYPE("FRIEND_MESSAGE_ACCEPT_FRIEND", FRIEND_MESSAGE_INVITED_VALUE, FRIEND_MESSAGE_INVITED_VALUE, FRIEND_MESSAGE_ACCEPT_FRIEND_VALUE);
            FRIEND_MESSAGE_DENY_FRIEND = new FRIEND_MESSAGE_TYPE("FRIEND_MESSAGE_DENY_FRIEND", FRIEND_MESSAGE_ACCEPT_FRIEND_VALUE, FRIEND_MESSAGE_ACCEPT_FRIEND_VALUE, FRIEND_MESSAGE_DENY_FRIEND_VALUE);
            FRIEND_MESSAGE_DELETE_FRIEND = new FRIEND_MESSAGE_TYPE("FRIEND_MESSAGE_DELETE_FRIEND", FRIEND_MESSAGE_DENY_FRIEND_VALUE, FRIEND_MESSAGE_DENY_FRIEND_VALUE, FRIEND_MESSAGE_DELETE_FRIEND_VALUE);
            FRIEND_MESSAGE_RECOMMAND_FRIEND = new FRIEND_MESSAGE_TYPE("FRIEND_MESSAGE_RECOMMAND_FRIEND", FRIEND_MESSAGE_DELETE_FRIEND_VALUE, FRIEND_MESSAGE_DELETE_FRIEND_VALUE, FRIEND_MESSAGE_RECOMMAND_FRIEND_VALUE);
            FRIEND_MESSAGE_TYPE[] friend_message_typeArr = new FRIEND_MESSAGE_TYPE[FRIEND_MESSAGE_RECOMMAND_FRIEND_VALUE];
            friend_message_typeArr[0] = FRIEND_MESSAGE_INVITED;
            friend_message_typeArr[FRIEND_MESSAGE_INVITED_VALUE] = FRIEND_MESSAGE_ACCEPT_FRIEND;
            friend_message_typeArr[FRIEND_MESSAGE_ACCEPT_FRIEND_VALUE] = FRIEND_MESSAGE_DENY_FRIEND;
            friend_message_typeArr[FRIEND_MESSAGE_DENY_FRIEND_VALUE] = FRIEND_MESSAGE_DELETE_FRIEND;
            friend_message_typeArr[FRIEND_MESSAGE_DELETE_FRIEND_VALUE] = FRIEND_MESSAGE_RECOMMAND_FRIEND;
            ENUM$VALUES = friend_message_typeArr;
            internalValueMap = new C03221();
            VALUES = values();
        }

        public static FRIEND_MESSAGE_TYPE valueOf(int i) {
            switch (i) {
                case FRIEND_MESSAGE_INVITED_VALUE:
                    return FRIEND_MESSAGE_INVITED;
                case FRIEND_MESSAGE_ACCEPT_FRIEND_VALUE:
                    return FRIEND_MESSAGE_ACCEPT_FRIEND;
                case FRIEND_MESSAGE_DENY_FRIEND_VALUE:
                    return FRIEND_MESSAGE_DENY_FRIEND;
                case FRIEND_MESSAGE_DELETE_FRIEND_VALUE:
                    return FRIEND_MESSAGE_DELETE_FRIEND;
                case FRIEND_MESSAGE_RECOMMAND_FRIEND_VALUE:
                    return FRIEND_MESSAGE_RECOMMAND_FRIEND;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<FRIEND_MESSAGE_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpUser.m303a().getEnumTypes().get(6);
        }

        public static FRIEND_MESSAGE_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface FriendPushMsgOrBuilder extends MessageOrBuilder {
        FRIEND_MESSAGE_TYPE getEFriendMessageType();

        long getLCreateTime();

        long getLMsgID();

        String getSMsg();

        ByteString getSMsgBytes();

        UserBaseInfoNet getStFromUser();

        UserBaseInfoNetOrBuilder getStFromUserOrBuilder();

        UserBaseInfoNet getStToUser();

        UserBaseInfoNetOrBuilder getStToUserOrBuilder();

        boolean hasEFriendMessageType();

        boolean hasLCreateTime();

        boolean hasLMsgID();

        boolean hasSMsg();

        boolean hasStFromUser();

        boolean hasStToUser();
    }

    public static final class FriendPushMsg extends GeneratedMessage implements FriendPushMsgOrBuilder {
        public static final int EFRIENDMESSAGETYPE_FIELD_NUMBER = 2;
        public static final int LCREATETIME_FIELD_NUMBER = 6;
        public static final int LMSGID_FIELD_NUMBER = 1;
        public static Parser<FriendPushMsg> PARSER = null;
        public static final int SMSG_FIELD_NUMBER = 5;
        public static final int STFROMUSER_FIELD_NUMBER = 3;
        public static final int STTOUSER_FIELD_NUMBER = 4;
        private static final FriendPushMsg defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private FRIEND_MESSAGE_TYPE eFriendMessageType_;
        private long lCreateTime_;
        private long lMsgID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sMsg_;
        private UserBaseInfoNet stFromUser_;
        private UserBaseInfoNet stToUser_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.FriendPushMsg.1 */
        class C03231 extends AbstractParser<FriendPushMsg> {
            static {
                fixHelper.fixfunc(new int[]{33790, 33791});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03231();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements FriendPushMsgOrBuilder {
            private int bitField0_;
            private FRIEND_MESSAGE_TYPE eFriendMessageType_;
            private long lCreateTime_;
            private long lMsgID_;
            private Object sMsg_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stFromUserBuilder_;
            private UserBaseInfoNet stFromUser_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stToUserBuilder_;
            private UserBaseInfoNet stToUser_;

            static {
                fixHelper.fixfunc(new int[]{15626, 15627, 15628, 15629, 15630, 15631, 15632, 15633, 15634, 15635, 15636, 15637, 15638, 15639, 15640, 15641, 15642, 15643, 15644, 15645, 15646, 15647, 15648, 15649, 15650, 15651, 15652, 15653, 15654, 15655, 15656, 15657, 15658, 15659, 15660, 15661, 15662, 15663, 15664, 15665, 15666, 15667, 15668, 15669, 15670, 15671, 15672, 15673, 15674, 15675, 15676, 15677, 15678, 15679, 15680, 15681, 15682, 15683, 15684, 15685, 15686, 15687, 15688, 15689, 15690, 15691, 15692, 15693});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStFromUserFieldBuilder();

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStToUserFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7634build();

            public final native FriendPushMsg m7635build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7636buildPartial();

            public final native FriendPushMsg m7637buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7638clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7639clear();

            public final native Builder m7640clear();

            public final native Builder clearEFriendMessageType();

            public final native Builder clearLCreateTime();

            public final native Builder clearLMsgID();

            public final native Builder clearSMsg();

            public final native Builder clearStFromUser();

            public final native Builder clearStToUser();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7641clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7642clone();

            public final native Builder m7643clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7644getDefaultInstanceForType();

            public final native FriendPushMsg m7645getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native FRIEND_MESSAGE_TYPE getEFriendMessageType();

            public final native long getLCreateTime();

            public final native long getLMsgID();

            public final native String getSMsg();

            public final native ByteString getSMsgBytes();

            public final native UserBaseInfoNet getStFromUser();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStFromUserBuilder();

            public final native UserBaseInfoNetOrBuilder getStFromUserOrBuilder();

            public final native UserBaseInfoNet getStToUser();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStToUserBuilder();

            public final native UserBaseInfoNetOrBuilder getStToUserOrBuilder();

            public final native boolean hasEFriendMessageType();

            public final native boolean hasLCreateTime();

            public final native boolean hasLMsgID();

            public final native boolean hasSMsg();

            public final native boolean hasStFromUser();

            public final native boolean hasStToUser();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7646mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7647mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7648mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7649mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7650mergeFrom(Message message);

            public final native Builder mergeFrom(FriendPushMsg friendPushMsg);

            public final native Builder mergeStFromUser(UserBaseInfoNet userBaseInfoNet);

            public final native Builder mergeStToUser(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setEFriendMessageType(FRIEND_MESSAGE_TYPE friend_message_type);

            public final native Builder setLCreateTime(long j);

            public final native Builder setLMsgID(long j);

            public final native Builder setSMsg(String str);

            public final native Builder setSMsgBytes(ByteString byteString);

            public final native Builder setStFromUser(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStFromUser(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setStToUser(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStToUser(UserBaseInfoNet userBaseInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aI;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{11297, 11298, 11299, 11300, 11301, 11302, 11303, 11304, 11305, 11306, 11307, 11308, 11309, 11310, 11311, 11312, 11313, 11314, 11315, 11316, 11317, 11318, 11319, 11320, 11321, 11322, 11323, 11324, 11325, 11326, 11327, 11328, 11329, 11330, 11331, 11332, 11333, 11334, 11335});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native FriendPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ FriendPushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FriendPushMsg friendPushMsg);

        private native FriendPushMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ FriendPushMsg(com.google.protobuf.GeneratedMessage.Builder builder, FriendPushMsg friendPushMsg);

        private native FriendPushMsg(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7627getDefaultInstanceForType();

        public final native FriendPushMsg m7628getDefaultInstanceForType();

        public final native FRIEND_MESSAGE_TYPE getEFriendMessageType();

        public final native long getLCreateTime();

        public final native long getLMsgID();

        public final native Parser<FriendPushMsg> getParserForType();

        public final native String getSMsg();

        public final native ByteString getSMsgBytes();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStFromUser();

        public final native UserBaseInfoNetOrBuilder getStFromUserOrBuilder();

        public final native UserBaseInfoNet getStToUser();

        public final native UserBaseInfoNetOrBuilder getStToUserOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEFriendMessageType();

        public final native boolean hasLCreateTime();

        public final native boolean hasLMsgID();

        public final native boolean hasSMsg();

        public final native boolean hasStFromUser();

        public final native boolean hasStToUser();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7629newBuilderForType();

        public final native Builder m7630newBuilderForType();

        protected final native Builder m7631newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7632toBuilder();

        public final native Builder m7633toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static FriendPushMsg getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aI;
        }

        static void __clinit__() {
            PARSER = new C03231();
            FriendPushMsg friendPushMsg = new FriendPushMsg(true);
            defaultInstance = friendPushMsg;
            friendPushMsg.initFields();
        }

        public static FriendPushMsg parseFrom(ByteString byteString) {
            return (FriendPushMsg) PARSER.parseFrom(byteString);
        }

        public static FriendPushMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FriendPushMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FriendPushMsg parseFrom(byte[] bArr) {
            return (FriendPushMsg) PARSER.parseFrom(bArr);
        }

        public static FriendPushMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FriendPushMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FriendPushMsg parseFrom(InputStream inputStream) {
            return (FriendPushMsg) PARSER.parseFrom(inputStream);
        }

        public static FriendPushMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FriendPushMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static FriendPushMsg parseDelimitedFrom(InputStream inputStream) {
            return (FriendPushMsg) PARSER.parseDelimitedFrom(inputStream);
        }

        public static FriendPushMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FriendPushMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static FriendPushMsg parseFrom(CodedInputStream codedInputStream) {
            return (FriendPushMsg) PARSER.parseFrom(codedInputStream);
        }

        public static FriendPushMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FriendPushMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(FriendPushMsg friendPushMsg) {
            return newBuilder().mergeFrom(friendPushMsg);
        }
    }

    public enum MSG_ACT implements ProtocolMessageEnum {
        ;
        
        public static final int ACT_ACCEPT_INVITE_VALUE = 1;
        public static final int ACT_DENY_INVITE_VALUE = 2;
        public static final int ACT_LAUNCH_INVITE_VALUE = 3;
        private static final MSG_ACT[] VALUES = null;
        private static EnumLiteMap<MSG_ACT> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.MSG_ACT.1 */
        class C03241 implements EnumLiteMap<MSG_ACT> {
            static {
                fixHelper.fixfunc(new int[]{31808, 31809});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03241();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{5612, 5613, 5614, 5615});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native MSG_ACT(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            ACT_ACCEPT_INVITE = new MSG_ACT("ACT_ACCEPT_INVITE", 0, 0, ACT_ACCEPT_INVITE_VALUE);
            ACT_DENY_INVITE = new MSG_ACT("ACT_DENY_INVITE", ACT_ACCEPT_INVITE_VALUE, ACT_ACCEPT_INVITE_VALUE, ACT_DENY_INVITE_VALUE);
            ACT_LAUNCH_INVITE = new MSG_ACT("ACT_LAUNCH_INVITE", ACT_DENY_INVITE_VALUE, ACT_DENY_INVITE_VALUE, ACT_LAUNCH_INVITE_VALUE);
            MSG_ACT[] msg_actArr = new MSG_ACT[ACT_LAUNCH_INVITE_VALUE];
            msg_actArr[0] = ACT_ACCEPT_INVITE;
            msg_actArr[ACT_ACCEPT_INVITE_VALUE] = ACT_DENY_INVITE;
            msg_actArr[ACT_DENY_INVITE_VALUE] = ACT_LAUNCH_INVITE;
            ENUM$VALUES = msg_actArr;
            internalValueMap = new C03241();
            VALUES = values();
        }

        public static MSG_ACT valueOf(int i) {
            switch (i) {
                case ACT_ACCEPT_INVITE_VALUE:
                    return ACT_ACCEPT_INVITE;
                case ACT_DENY_INVITE_VALUE:
                    return ACT_DENY_INVITE;
                case ACT_LAUNCH_INVITE_VALUE:
                    return ACT_LAUNCH_INVITE;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<MSG_ACT> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpUser.m303a().getEnumTypes().get(ACT_DENY_INVITE_VALUE);
        }

        public static MSG_ACT valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface SCBuyNicknameRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLCoin();

        String getSNickname();

        ByteString getSNicknameBytes();

        boolean hasEErrCode();

        boolean hasLCoin();

        boolean hasSNickname();
    }

    public static final class SCBuyNicknameRsp extends GeneratedMessage implements SCBuyNicknameRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCOIN_FIELD_NUMBER = 3;
        public static Parser<SCBuyNicknameRsp> PARSER = null;
        public static final int SNICKNAME_FIELD_NUMBER = 2;
        private static final SCBuyNicknameRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lCoin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sNickname_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCBuyNicknameRsp.1 */
        class C03251 extends AbstractParser<SCBuyNicknameRsp> {
            static {
                fixHelper.fixfunc(new int[]{28098, 28099});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03251();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCBuyNicknameRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lCoin_;
            private Object sNickname_;

            static {
                fixHelper.fixfunc(new int[]{11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 11856, 11857, 11858, 11859, 11860, 11861, 11862, 11863, 11864, 11865, 11866, 11867, 11868, 11869, 11870, 11871, 11872, 11873, 11874, 11875, 11876, 11877, 11878, 11879, 11880, 11881, 11882, 11883});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7658build();

            public final native SCBuyNicknameRsp m7659build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7660buildPartial();

            public final native SCBuyNicknameRsp m7661buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7662clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7663clear();

            public final native Builder m7664clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLCoin();

            public final native Builder clearSNickname();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7665clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7666clone();

            public final native Builder m7667clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7668getDefaultInstanceForType();

            public final native SCBuyNicknameRsp m7669getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLCoin();

            public final native String getSNickname();

            public final native ByteString getSNicknameBytes();

            public final native boolean hasEErrCode();

            public final native boolean hasLCoin();

            public final native boolean hasSNickname();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7670mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7671mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7672mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7673mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7674mergeFrom(Message message);

            public final native Builder mergeFrom(SCBuyNicknameRsp sCBuyNicknameRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLCoin(long j);

            public final native Builder setSNickname(String str);

            public final native Builder setSNicknameBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aQ;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{30603, 30604, 30605, 30606, 30607, 30608, 30609, 30610, 30611, 30612, 30613, 30614, 30615, 30616, 30617, 30618, 30619, 30620, 30621, 30622, 30623, 30624, 30625, 30626, 30627, 30628, 30629, 30630, 30631, 30632, 30633});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCBuyNicknameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCBuyNicknameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCBuyNicknameRsp sCBuyNicknameRsp);

        private native SCBuyNicknameRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCBuyNicknameRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCBuyNicknameRsp sCBuyNicknameRsp);

        private native SCBuyNicknameRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7651getDefaultInstanceForType();

        public final native SCBuyNicknameRsp m7652getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLCoin();

        public final native Parser<SCBuyNicknameRsp> getParserForType();

        public final native String getSNickname();

        public final native ByteString getSNicknameBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLCoin();

        public final native boolean hasSNickname();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7653newBuilderForType();

        public final native Builder m7654newBuilderForType();

        protected final native Builder m7655newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7656toBuilder();

        public final native Builder m7657toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCBuyNicknameRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aQ;
        }

        static void __clinit__() {
            PARSER = new C03251();
            SCBuyNicknameRsp sCBuyNicknameRsp = new SCBuyNicknameRsp(true);
            defaultInstance = sCBuyNicknameRsp;
            sCBuyNicknameRsp.initFields();
        }

        public static SCBuyNicknameRsp parseFrom(ByteString byteString) {
            return (SCBuyNicknameRsp) PARSER.parseFrom(byteString);
        }

        public static SCBuyNicknameRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyNicknameRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCBuyNicknameRsp parseFrom(byte[] bArr) {
            return (SCBuyNicknameRsp) PARSER.parseFrom(bArr);
        }

        public static SCBuyNicknameRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyNicknameRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCBuyNicknameRsp parseFrom(InputStream inputStream) {
            return (SCBuyNicknameRsp) PARSER.parseFrom(inputStream);
        }

        public static SCBuyNicknameRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyNicknameRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCBuyNicknameRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCBuyNicknameRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCBuyNicknameRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyNicknameRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCBuyNicknameRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCBuyNicknameRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCBuyNicknameRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCBuyNicknameRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCBuyNicknameRsp sCBuyNicknameRsp) {
            return newBuilder().mergeFrom(sCBuyNicknameRsp);
        }
    }

    public interface SCCheckNicknameStatusRspOrBuilder extends MessageOrBuilder {
        int getBModifyed();

        ERROR_CODE_TYPE getEErrCode();

        long getLSpendCoin();

        boolean hasBModifyed();

        boolean hasEErrCode();

        boolean hasLSpendCoin();
    }

    public static final class SCCheckNicknameStatusRsp extends GeneratedMessage implements SCCheckNicknameStatusRspOrBuilder {
        public static final int BMODIFYED_FIELD_NUMBER = 2;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LSPENDCOIN_FIELD_NUMBER = 3;
        public static Parser<SCCheckNicknameStatusRsp> PARSER;
        private static final SCCheckNicknameStatusRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bModifyed_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lSpendCoin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCCheckNicknameStatusRsp.1 */
        class C03261 extends AbstractParser<SCCheckNicknameStatusRsp> {
            static {
                fixHelper.fixfunc(new int[]{15198, 15199});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03261();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCCheckNicknameStatusRspOrBuilder {
            private int bModifyed_;
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lSpendCoin_;

            static {
                fixHelper.fixfunc(new int[]{23453, 23454, 23455, 23456, 23457, 23458, 23459, 23460, 23461, 23462, 23463, 23464, 23465, 23466, 23467, 23468, 23469, 23470, 23471, 23472, 23473, 23474, 23475, 23476, 23477, 23478, 23479, 23480, 23481, 23482, 23483, 23484, 23485, 23486, 23487, 23488, 23489, 23490, 23491, 23492, 23493, 23494, 23495, 23496});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7682build();

            public final native SCCheckNicknameStatusRsp m7683build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7684buildPartial();

            public final native SCCheckNicknameStatusRsp m7685buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7686clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7687clear();

            public final native Builder m7688clear();

            public final native Builder clearBModifyed();

            public final native Builder clearEErrCode();

            public final native Builder clearLSpendCoin();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7689clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7690clone();

            public final native Builder m7691clone();

            public final native int getBModifyed();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7692getDefaultInstanceForType();

            public final native SCCheckNicknameStatusRsp m7693getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLSpendCoin();

            public final native boolean hasBModifyed();

            public final native boolean hasEErrCode();

            public final native boolean hasLSpendCoin();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7694mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7695mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7696mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7697mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7698mergeFrom(Message message);

            public final native Builder mergeFrom(SCCheckNicknameStatusRsp sCCheckNicknameStatusRsp);

            public final native Builder setBModifyed(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLSpendCoin(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aU;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{13881, 13882, 13883, 13884, 13885, 13886, 13887, 13888, 13889, 13890, 13891, 13892, 13893, 13894, 13895, 13896, 13897, 13898, 13899, 13900, 13901, 13902, 13903, 13904, 13905, 13906, 13907, 13908, 13909, 13910});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCCheckNicknameStatusRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCCheckNicknameStatusRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCCheckNicknameStatusRsp sCCheckNicknameStatusRsp);

        private native SCCheckNicknameStatusRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCCheckNicknameStatusRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCCheckNicknameStatusRsp sCCheckNicknameStatusRsp);

        private native SCCheckNicknameStatusRsp(boolean z);

        private native void initFields();

        public final native int getBModifyed();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7675getDefaultInstanceForType();

        public final native SCCheckNicknameStatusRsp m7676getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLSpendCoin();

        public final native Parser<SCCheckNicknameStatusRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBModifyed();

        public final native boolean hasEErrCode();

        public final native boolean hasLSpendCoin();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7677newBuilderForType();

        public final native Builder m7678newBuilderForType();

        protected final native Builder m7679newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7680toBuilder();

        public final native Builder m7681toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCCheckNicknameStatusRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aU;
        }

        static void __clinit__() {
            PARSER = new C03261();
            SCCheckNicknameStatusRsp sCCheckNicknameStatusRsp = new SCCheckNicknameStatusRsp(true);
            defaultInstance = sCCheckNicknameStatusRsp;
            sCCheckNicknameStatusRsp.initFields();
        }

        public static SCCheckNicknameStatusRsp parseFrom(ByteString byteString) {
            return (SCCheckNicknameStatusRsp) PARSER.parseFrom(byteString);
        }

        public static SCCheckNicknameStatusRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCheckNicknameStatusRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCCheckNicknameStatusRsp parseFrom(byte[] bArr) {
            return (SCCheckNicknameStatusRsp) PARSER.parseFrom(bArr);
        }

        public static SCCheckNicknameStatusRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCheckNicknameStatusRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCCheckNicknameStatusRsp parseFrom(InputStream inputStream) {
            return (SCCheckNicknameStatusRsp) PARSER.parseFrom(inputStream);
        }

        public static SCCheckNicknameStatusRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCheckNicknameStatusRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCCheckNicknameStatusRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCCheckNicknameStatusRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCCheckNicknameStatusRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCheckNicknameStatusRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCCheckNicknameStatusRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCCheckNicknameStatusRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCCheckNicknameStatusRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCheckNicknameStatusRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCCheckNicknameStatusRsp sCCheckNicknameStatusRsp) {
            return newBuilder().mergeFrom(sCCheckNicknameStatusRsp);
        }
    }

    public interface SCDeleteUserCoverRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        String getSBigAlbums(int i);

        ByteString getSBigAlbumsBytes(int i);

        int getSBigAlbumsCount();

        ProtocolStringList getSBigAlbumsList();

        String getSSmallAlbums(int i);

        ByteString getSSmallAlbumsBytes(int i);

        int getSSmallAlbumsCount();

        ProtocolStringList getSSmallAlbumsList();

        boolean hasEErrCode();
    }

    public static final class SCDeleteUserCoverRsp extends GeneratedMessage implements SCDeleteUserCoverRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCDeleteUserCoverRsp> PARSER = null;
        public static final int SBIGALBUMS_FIELD_NUMBER = 3;
        public static final int SSMALLALBUMS_FIELD_NUMBER = 2;
        private static final SCDeleteUserCoverRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LazyStringList sBigAlbums_;
        private LazyStringList sSmallAlbums_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCDeleteUserCoverRsp.1 */
        class C03271 extends AbstractParser<SCDeleteUserCoverRsp> {
            static {
                fixHelper.fixfunc(new int[]{11295, 11296});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03271();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCDeleteUserCoverRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private LazyStringList sBigAlbums_;
            private LazyStringList sSmallAlbums_;

            static {
                fixHelper.fixfunc(new int[]{21999, 22000, 22001, 22002, 22003, 22004, 22005, 22006, 22007, 22008, 22009, 22010, 22011, 22012, 22013, 22014, 22015, 22016, 22017, 22018, 22019, 22020, 22021, 22022, 22023, 22024, 22025, 22026, 22027, 22028, 22029, 22030, 22031, 22032, 22033, 22034, 22035, 22036, 22037, 22038, 22039, 22040, 22041, 22042, 22043, 22044, 22045, 22046, 22047, 22048, 22049, 22050, 22051, 22052, 22053, 22054});
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

            public final native /* bridge */ /* synthetic */ MessageLite m7706build();

            public final native SCDeleteUserCoverRsp m7707build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7708buildPartial();

            public final native SCDeleteUserCoverRsp m7709buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7710clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7711clear();

            public final native Builder m7712clear();

            public final native Builder clearEErrCode();

            public final native Builder clearSBigAlbums();

            public final native Builder clearSSmallAlbums();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7713clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7714clone();

            public final native Builder m7715clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7716getDefaultInstanceForType();

            public final native SCDeleteUserCoverRsp m7717getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native String getSBigAlbums(int i);

            public final native ByteString getSBigAlbumsBytes(int i);

            public final native int getSBigAlbumsCount();

            public final native ProtocolStringList getSBigAlbumsList();

            public final native String getSSmallAlbums(int i);

            public final native ByteString getSSmallAlbumsBytes(int i);

            public final native int getSSmallAlbumsCount();

            public final native ProtocolStringList getSSmallAlbumsList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7718mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7719mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7720mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7721mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7722mergeFrom(Message message);

            public final native Builder mergeFrom(SCDeleteUserCoverRsp sCDeleteUserCoverRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setSBigAlbums(int i, String str);

            public final native Builder setSSmallAlbums(int i, String str);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.ai;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{6598, 6599, 6600, 6601, 6602, 6603, 6604, 6605, 6606, 6607, 6608, 6609, 6610, 6611, 6612, 6613, 6614, 6615, 6616, 6617, 6618, 6619, 6620, 6621, 6622, 6623, 6624, 6625, 6626, 6627, 6628, 6629, 6630, 6631});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCDeleteUserCoverRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCDeleteUserCoverRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCDeleteUserCoverRsp sCDeleteUserCoverRsp);

        private native SCDeleteUserCoverRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCDeleteUserCoverRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCDeleteUserCoverRsp sCDeleteUserCoverRsp);

        private native SCDeleteUserCoverRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7699getDefaultInstanceForType();

        public final native SCDeleteUserCoverRsp m7700getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCDeleteUserCoverRsp> getParserForType();

        public final native String getSBigAlbums(int i);

        public final native ByteString getSBigAlbumsBytes(int i);

        public final native int getSBigAlbumsCount();

        public final native ProtocolStringList getSBigAlbumsList();

        public final native String getSSmallAlbums(int i);

        public final native ByteString getSSmallAlbumsBytes(int i);

        public final native int getSSmallAlbumsCount();

        public final native ProtocolStringList getSSmallAlbumsList();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7701newBuilderForType();

        public final native Builder m7702newBuilderForType();

        protected final native Builder m7703newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7704toBuilder();

        public final native Builder m7705toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCDeleteUserCoverRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.ai;
        }

        static void __clinit__() {
            PARSER = new C03271();
            SCDeleteUserCoverRsp sCDeleteUserCoverRsp = new SCDeleteUserCoverRsp(true);
            defaultInstance = sCDeleteUserCoverRsp;
            sCDeleteUserCoverRsp.initFields();
        }

        public static SCDeleteUserCoverRsp parseFrom(ByteString byteString) {
            return (SCDeleteUserCoverRsp) PARSER.parseFrom(byteString);
        }

        public static SCDeleteUserCoverRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCDeleteUserCoverRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCDeleteUserCoverRsp parseFrom(byte[] bArr) {
            return (SCDeleteUserCoverRsp) PARSER.parseFrom(bArr);
        }

        public static SCDeleteUserCoverRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCDeleteUserCoverRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCDeleteUserCoverRsp parseFrom(InputStream inputStream) {
            return (SCDeleteUserCoverRsp) PARSER.parseFrom(inputStream);
        }

        public static SCDeleteUserCoverRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCDeleteUserCoverRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCDeleteUserCoverRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCDeleteUserCoverRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCDeleteUserCoverRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCDeleteUserCoverRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCDeleteUserCoverRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCDeleteUserCoverRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCDeleteUserCoverRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCDeleteUserCoverRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCDeleteUserCoverRsp sCDeleteUserCoverRsp) {
            return newBuilder().mergeFrom(sCDeleteUserCoverRsp);
        }
    }

    public interface SCGetFriendStatusRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        UserFriendInfoNet getVFriendsInfo(int i);

        int getVFriendsInfoCount();

        List<UserFriendInfoNet> getVFriendsInfoList();

        UserFriendInfoNetOrBuilder getVFriendsInfoOrBuilder(int i);

        List<? extends UserFriendInfoNetOrBuilder> getVFriendsInfoOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetFriendStatusRsp extends GeneratedMessage implements SCGetFriendStatusRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetFriendStatusRsp> PARSER = null;
        public static final int VFRIENDSINFO_FIELD_NUMBER = 2;
        private static final SCGetFriendStatusRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<UserFriendInfoNet> vFriendsInfo_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCGetFriendStatusRsp.1 */
        class C03281 extends AbstractParser<SCGetFriendStatusRsp> {
            static {
                fixHelper.fixfunc(new int[]{23124, 23125});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03281();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetFriendStatusRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<UserFriendInfoNet, Builder, UserFriendInfoNetOrBuilder> vFriendsInfoBuilder_;
            private List<UserFriendInfoNet> vFriendsInfo_;

            static {
                fixHelper.fixfunc(new int[]{25479, 25480, 25481, 25482, 25483, 25484, 25485, 25486, 25487, 25488, 25489, 25490, 25491, 25492, 25493, 25494, 25495, 25496, 25497, 25498, 25499, 25500, 25501, 25502, 25503, 25504, 25505, 25506, 25507, 25508, 25509, 25510, 25511, 25512, 25513, 25514, 25515, 25516, 25517, 25518, 25519, 25520, 25521, 25522, 25523, 25524, 25525, 25526, 25527, 25528, 25529, 25530, 25531, 25532, 25533, 25534});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVFriendsInfoIsMutable();

            private native RepeatedFieldBuilder<UserFriendInfoNet, Builder, UserFriendInfoNetOrBuilder> getVFriendsInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVFriendsInfo(Iterable<? extends UserFriendInfoNet> iterable);

            public final native Builder addVFriendsInfo(int i, Builder builder);

            public final native Builder addVFriendsInfo(int i, UserFriendInfoNet userFriendInfoNet);

            public final native Builder addVFriendsInfo(Builder builder);

            public final native Builder addVFriendsInfo(UserFriendInfoNet userFriendInfoNet);

            public final native Builder addVFriendsInfoBuilder();

            public final native Builder addVFriendsInfoBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7730build();

            public final native SCGetFriendStatusRsp m7731build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7732buildPartial();

            public final native SCGetFriendStatusRsp m7733buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7734clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7735clear();

            public final native Builder m7736clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVFriendsInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7737clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7738clone();

            public final native Builder m7739clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7740getDefaultInstanceForType();

            public final native SCGetFriendStatusRsp m7741getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native UserFriendInfoNet getVFriendsInfo(int i);

            public final native Builder getVFriendsInfoBuilder(int i);

            public final native List<Builder> getVFriendsInfoBuilderList();

            public final native int getVFriendsInfoCount();

            public final native List<UserFriendInfoNet> getVFriendsInfoList();

            public final native UserFriendInfoNetOrBuilder getVFriendsInfoOrBuilder(int i);

            public final native List<? extends UserFriendInfoNetOrBuilder> getVFriendsInfoOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7742mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7743mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7744mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7745mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7746mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetFriendStatusRsp sCGetFriendStatusRsp);

            public final native Builder removeVFriendsInfo(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVFriendsInfo(int i, Builder builder);

            public final native Builder setVFriendsInfo(int i, UserFriendInfoNet userFriendInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.au;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{22707, 22708, 22709, 22710, 22711, 22712, 22713, 22714, 22715, 22716, 22717, 22718, 22719, 22720, 22721, 22722, 22723, 22724, 22725, 22726, 22727, 22728, 22729, 22730, 22731, 22732, 22733, 22734, 22735, 22736, 22737});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetFriendStatusRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetFriendStatusRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetFriendStatusRsp sCGetFriendStatusRsp);

        private native SCGetFriendStatusRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetFriendStatusRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetFriendStatusRsp sCGetFriendStatusRsp);

        private native SCGetFriendStatusRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7723getDefaultInstanceForType();

        public final native SCGetFriendStatusRsp m7724getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetFriendStatusRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native UserFriendInfoNet getVFriendsInfo(int i);

        public final native int getVFriendsInfoCount();

        public final native List<UserFriendInfoNet> getVFriendsInfoList();

        public final native UserFriendInfoNetOrBuilder getVFriendsInfoOrBuilder(int i);

        public final native List<? extends UserFriendInfoNetOrBuilder> getVFriendsInfoOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7725newBuilderForType();

        public final native Builder m7726newBuilderForType();

        protected final native Builder m7727newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7728toBuilder();

        public final native Builder m7729toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetFriendStatusRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.au;
        }

        static void __clinit__() {
            PARSER = new C03281();
            SCGetFriendStatusRsp sCGetFriendStatusRsp = new SCGetFriendStatusRsp(true);
            defaultInstance = sCGetFriendStatusRsp;
            sCGetFriendStatusRsp.initFields();
        }

        public static SCGetFriendStatusRsp parseFrom(ByteString byteString) {
            return (SCGetFriendStatusRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetFriendStatusRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFriendStatusRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetFriendStatusRsp parseFrom(byte[] bArr) {
            return (SCGetFriendStatusRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetFriendStatusRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFriendStatusRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetFriendStatusRsp parseFrom(InputStream inputStream) {
            return (SCGetFriendStatusRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetFriendStatusRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFriendStatusRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFriendStatusRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetFriendStatusRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetFriendStatusRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFriendStatusRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFriendStatusRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetFriendStatusRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetFriendStatusRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFriendStatusRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetFriendStatusRsp sCGetFriendStatusRsp) {
            return newBuilder().mergeFrom(sCGetFriendStatusRsp);
        }
    }

    public interface SCGetLoginRewardRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLAddCoin();

        long getLAddPopularity();

        long getLCoin();

        long getLPopularity();

        int getVCards(int i);

        int getVCardsCount();

        List<Integer> getVCardsList();

        boolean hasEErrCode();

        boolean hasLAddCoin();

        boolean hasLAddPopularity();

        boolean hasLCoin();

        boolean hasLPopularity();
    }

    public static final class SCGetLoginRewardRsp extends GeneratedMessage implements SCGetLoginRewardRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LADDCOIN_FIELD_NUMBER = 5;
        public static final int LADDPOPULARITY_FIELD_NUMBER = 4;
        public static final int LCOIN_FIELD_NUMBER = 3;
        public static final int LPOPULARITY_FIELD_NUMBER = 2;
        public static Parser<SCGetLoginRewardRsp> PARSER = null;
        public static final int VCARDS_FIELD_NUMBER = 6;
        private static final SCGetLoginRewardRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lAddCoin_;
        private long lAddPopularity_;
        private long lCoin_;
        private long lPopularity_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<Integer> vCards_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCGetLoginRewardRsp.1 */
        class C03291 extends AbstractParser<SCGetLoginRewardRsp> {
            static {
                fixHelper.fixfunc(new int[]{28230, 28231});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03291();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetLoginRewardRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lAddCoin_;
            private long lAddPopularity_;
            private long lCoin_;
            private long lPopularity_;
            private List<Integer> vCards_;

            static {
                fixHelper.fixfunc(new int[]{32576, 32577, 32578, 32579, 32580, 32581, 32582, 32583, 32584, 32585, 32586, 32587, 32588, 32589, 32590, 32591, 32592, 32593, 32594, 32595, 32596, 32597, 32598, 32599, 32600, 32601, 32602, 32603, 32604, 32605, 32606, 32607, 32608, 32609, 32610, 32611, 32612, 32613, 32614, 32615, 32616, 32617, 32618, 32619, 32620, 32621, 32622, 32623, 32624, 32625, 32626, 32627, 32628, 32629, 32630, 32631, 32632, 32633, 32634, 32635});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVCardsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVCards(Iterable<? extends Integer> iterable);

            public final native Builder addVCards(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7754build();

            public final native SCGetLoginRewardRsp m7755build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7756buildPartial();

            public final native SCGetLoginRewardRsp m7757buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7758clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7759clear();

            public final native Builder m7760clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLAddCoin();

            public final native Builder clearLAddPopularity();

            public final native Builder clearLCoin();

            public final native Builder clearLPopularity();

            public final native Builder clearVCards();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7761clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7762clone();

            public final native Builder m7763clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7764getDefaultInstanceForType();

            public final native SCGetLoginRewardRsp m7765getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLAddCoin();

            public final native long getLAddPopularity();

            public final native long getLCoin();

            public final native long getLPopularity();

            public final native int getVCards(int i);

            public final native int getVCardsCount();

            public final native List<Integer> getVCardsList();

            public final native boolean hasEErrCode();

            public final native boolean hasLAddCoin();

            public final native boolean hasLAddPopularity();

            public final native boolean hasLCoin();

            public final native boolean hasLPopularity();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7766mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7767mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7768mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7769mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7770mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetLoginRewardRsp sCGetLoginRewardRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLAddCoin(long j);

            public final native Builder setLAddPopularity(long j);

            public final native Builder setLCoin(long j);

            public final native Builder setLPopularity(long j);

            public final native Builder setVCards(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f302g;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{15200, 15201, 15202, 15203, 15204, 15205, 15206, 15207, 15208, 15209, 15210, 15211, 15212, 15213, 15214, 15215, 15216, 15217, 15218, 15219, 15220, 15221, 15222, 15223, 15224, 15225, 15226, 15227, 15228, 15229, 15230, 15231, 15232, 15233, 15234, 15235, 15236});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetLoginRewardRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetLoginRewardRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetLoginRewardRsp sCGetLoginRewardRsp);

        private native SCGetLoginRewardRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetLoginRewardRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetLoginRewardRsp sCGetLoginRewardRsp);

        private native SCGetLoginRewardRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7747getDefaultInstanceForType();

        public final native SCGetLoginRewardRsp m7748getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLAddCoin();

        public final native long getLAddPopularity();

        public final native long getLCoin();

        public final native long getLPopularity();

        public final native Parser<SCGetLoginRewardRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native int getVCards(int i);

        public final native int getVCardsCount();

        public final native List<Integer> getVCardsList();

        public final native boolean hasEErrCode();

        public final native boolean hasLAddCoin();

        public final native boolean hasLAddPopularity();

        public final native boolean hasLCoin();

        public final native boolean hasLPopularity();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7749newBuilderForType();

        public final native Builder m7750newBuilderForType();

        protected final native Builder m7751newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7752toBuilder();

        public final native Builder m7753toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetLoginRewardRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f302g;
        }

        static void __clinit__() {
            PARSER = new C03291();
            SCGetLoginRewardRsp sCGetLoginRewardRsp = new SCGetLoginRewardRsp(true);
            defaultInstance = sCGetLoginRewardRsp;
            sCGetLoginRewardRsp.initFields();
        }

        public static SCGetLoginRewardRsp parseFrom(ByteString byteString) {
            return (SCGetLoginRewardRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetLoginRewardRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLoginRewardRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetLoginRewardRsp parseFrom(byte[] bArr) {
            return (SCGetLoginRewardRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetLoginRewardRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLoginRewardRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetLoginRewardRsp parseFrom(InputStream inputStream) {
            return (SCGetLoginRewardRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetLoginRewardRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLoginRewardRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetLoginRewardRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetLoginRewardRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetLoginRewardRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLoginRewardRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetLoginRewardRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetLoginRewardRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetLoginRewardRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLoginRewardRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetLoginRewardRsp sCGetLoginRewardRsp) {
            return newBuilder().mergeFrom(sCGetLoginRewardRsp);
        }
    }

    public interface SCGetUserBaseInfoRspOrBuilder extends MessageOrBuilder {
        int getBRemark();

        ERROR_CODE_TYPE getEErrCode();

        UserBaseInfoNet getStUserBaseInfoNet();

        UserBaseInfoNetOrBuilder getStUserBaseInfoNetOrBuilder();

        boolean hasBRemark();

        boolean hasEErrCode();

        boolean hasStUserBaseInfoNet();
    }

    public static final class SCGetUserBaseInfoRsp extends GeneratedMessage implements SCGetUserBaseInfoRspOrBuilder {
        public static final int BREMARK_FIELD_NUMBER = 3;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetUserBaseInfoRsp> PARSER = null;
        public static final int STUSERBASEINFONET_FIELD_NUMBER = 2;
        private static final SCGetUserBaseInfoRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bRemark_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private UserBaseInfoNet stUserBaseInfoNet_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCGetUserBaseInfoRsp.1 */
        class C03301 extends AbstractParser<SCGetUserBaseInfoRsp> {
            static {
                fixHelper.fixfunc(new int[]{25221, 25222});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03301();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetUserBaseInfoRspOrBuilder {
            private int bRemark_;
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stUserBaseInfoNetBuilder_;
            private UserBaseInfoNet stUserBaseInfoNet_;

            static {
                fixHelper.fixfunc(new int[]{33675, 33676, 33677, 33678, 33679, 33680, 33681, 33682, 33683, 33684, 33685, 33686, 33687, 33688, 33689, 33690, 33691, 33692, 33693, 33694, 33695, 33696, 33697, 33698, 33699, 33700, 33701, 33702, 33703, 33704, 33705, 33706, 33707, 33708, 33709, 33710, 33711, 33712, 33713, 33714, 33715, 33716, 33717, 33718, 33719, 33720, 33721, 33722, 33723});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStUserBaseInfoNetFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7778build();

            public final native SCGetUserBaseInfoRsp m7779build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7780buildPartial();

            public final native SCGetUserBaseInfoRsp m7781buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7782clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7783clear();

            public final native Builder m7784clear();

            public final native Builder clearBRemark();

            public final native Builder clearEErrCode();

            public final native Builder clearStUserBaseInfoNet();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7785clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7786clone();

            public final native Builder m7787clone();

            public final native int getBRemark();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7788getDefaultInstanceForType();

            public final native SCGetUserBaseInfoRsp m7789getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native UserBaseInfoNet getStUserBaseInfoNet();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStUserBaseInfoNetBuilder();

            public final native UserBaseInfoNetOrBuilder getStUserBaseInfoNetOrBuilder();

            public final native boolean hasBRemark();

            public final native boolean hasEErrCode();

            public final native boolean hasStUserBaseInfoNet();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7790mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7791mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7792mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7793mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7794mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetUserBaseInfoRsp sCGetUserBaseInfoRsp);

            public final native Builder mergeStUserBaseInfoNet(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setBRemark(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStUserBaseInfoNet(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStUserBaseInfoNet(UserBaseInfoNet userBaseInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f272C;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{27306, 27307, 27308, 27309, 27310, 27311, 27312, 27313, 27314, 27315, 27316, 27317, 27318, 27319, 27320, 27321, 27322, 27323, 27324, 27325, 27326, 27327, 27328, 27329, 27330, 27331, 27332, 27333, 27334, 27335, 27336});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetUserBaseInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetUserBaseInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetUserBaseInfoRsp sCGetUserBaseInfoRsp);

        private native SCGetUserBaseInfoRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetUserBaseInfoRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetUserBaseInfoRsp sCGetUserBaseInfoRsp);

        private native SCGetUserBaseInfoRsp(boolean z);

        private native void initFields();

        public final native int getBRemark();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7771getDefaultInstanceForType();

        public final native SCGetUserBaseInfoRsp m7772getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetUserBaseInfoRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStUserBaseInfoNet();

        public final native UserBaseInfoNetOrBuilder getStUserBaseInfoNetOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBRemark();

        public final native boolean hasEErrCode();

        public final native boolean hasStUserBaseInfoNet();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7773newBuilderForType();

        public final native Builder m7774newBuilderForType();

        protected final native Builder m7775newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7776toBuilder();

        public final native Builder m7777toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetUserBaseInfoRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f272C;
        }

        static void __clinit__() {
            PARSER = new C03301();
            SCGetUserBaseInfoRsp sCGetUserBaseInfoRsp = new SCGetUserBaseInfoRsp(true);
            defaultInstance = sCGetUserBaseInfoRsp;
            sCGetUserBaseInfoRsp.initFields();
        }

        public static SCGetUserBaseInfoRsp parseFrom(ByteString byteString) {
            return (SCGetUserBaseInfoRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetUserBaseInfoRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserBaseInfoRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetUserBaseInfoRsp parseFrom(byte[] bArr) {
            return (SCGetUserBaseInfoRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetUserBaseInfoRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserBaseInfoRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetUserBaseInfoRsp parseFrom(InputStream inputStream) {
            return (SCGetUserBaseInfoRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetUserBaseInfoRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserBaseInfoRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetUserBaseInfoRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetUserBaseInfoRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetUserBaseInfoRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserBaseInfoRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetUserBaseInfoRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetUserBaseInfoRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetUserBaseInfoRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserBaseInfoRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetUserBaseInfoRsp sCGetUserBaseInfoRsp) {
            return newBuilder().mergeFrom(sCGetUserBaseInfoRsp);
        }
    }

    public interface SCGetUserInfoRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        UserInfoNet getStUserInfo();

        UserInfoNetOrBuilder getStUserInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStUserInfo();
    }

    public static final class SCGetUserInfoRsp extends GeneratedMessage implements SCGetUserInfoRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetUserInfoRsp> PARSER = null;
        public static final int STUSERINFO_FIELD_NUMBER = 2;
        private static final SCGetUserInfoRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private UserInfoNet stUserInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCGetUserInfoRsp.1 */
        class C03311 extends AbstractParser<SCGetUserInfoRsp> {
            static {
                fixHelper.fixfunc(new int[]{21290, 21291});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03311();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetUserInfoRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<UserInfoNet, Builder, UserInfoNetOrBuilder> stUserInfoBuilder_;
            private UserInfoNet stUserInfo_;

            static {
                fixHelper.fixfunc(new int[]{5359, 5360, 5361, 5362, 5363, 5364, 5365, 5366, 5367, 5368, 5369, 5370, 5371, 5372, 5373, 5374, 5375, 5376, 5377, 5378, 5379, 5380, 5381, 5382, 5383, 5384, 5385, 5386, 5387, 5388, 5389, 5390, 5391, 5392, 5393, 5394, 5395, 5396, 5397, 5398, 5399, 5400, 5401, 5402, 5403});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<UserInfoNet, Builder, UserInfoNetOrBuilder> getStUserInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7802build();

            public final native SCGetUserInfoRsp m7803build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7804buildPartial();

            public final native SCGetUserInfoRsp m7805buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7806clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7807clear();

            public final native Builder m7808clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStUserInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7809clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7810clone();

            public final native Builder m7811clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7812getDefaultInstanceForType();

            public final native SCGetUserInfoRsp m7813getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native UserInfoNet getStUserInfo();

            public final native Builder getStUserInfoBuilder();

            public final native UserInfoNetOrBuilder getStUserInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStUserInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7814mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7815mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7816mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7817mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7818mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetUserInfoRsp sCGetUserInfoRsp);

            public final native Builder mergeStUserInfo(UserInfoNet userInfoNet);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStUserInfo(Builder builder);

            public final native Builder setStUserInfo(UserInfoNet userInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f276G;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31428, 31429, 31430, 31431, 31432, 31433, 31434, 31435, 31436, 31437, 31438, 31439, 31440, 31441, 31442, 31443, 31444, 31445, 31446, 31447, 31448, 31449, 31450, 31451, 31452, 31453, 31454, 31455, 31456});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetUserInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetUserInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetUserInfoRsp sCGetUserInfoRsp);

        private native SCGetUserInfoRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetUserInfoRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetUserInfoRsp sCGetUserInfoRsp);

        private native SCGetUserInfoRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7795getDefaultInstanceForType();

        public final native SCGetUserInfoRsp m7796getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetUserInfoRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UserInfoNet getStUserInfo();

        public final native UserInfoNetOrBuilder getStUserInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStUserInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7797newBuilderForType();

        public final native Builder m7798newBuilderForType();

        protected final native Builder m7799newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7800toBuilder();

        public final native Builder m7801toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetUserInfoRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f276G;
        }

        static void __clinit__() {
            PARSER = new C03311();
            SCGetUserInfoRsp sCGetUserInfoRsp = new SCGetUserInfoRsp(true);
            defaultInstance = sCGetUserInfoRsp;
            sCGetUserInfoRsp.initFields();
        }

        public static SCGetUserInfoRsp parseFrom(ByteString byteString) {
            return (SCGetUserInfoRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetUserInfoRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserInfoRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetUserInfoRsp parseFrom(byte[] bArr) {
            return (SCGetUserInfoRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetUserInfoRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserInfoRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetUserInfoRsp parseFrom(InputStream inputStream) {
            return (SCGetUserInfoRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetUserInfoRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserInfoRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetUserInfoRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetUserInfoRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetUserInfoRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserInfoRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetUserInfoRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetUserInfoRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetUserInfoRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserInfoRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetUserInfoRsp sCGetUserInfoRsp) {
            return newBuilder().mergeFrom(sCGetUserInfoRsp);
        }
    }

    public interface SCGetUserInfoV2RspOrBuilder extends MessageOrBuilder {
        int getBRemark();

        ERROR_CODE_TYPE getEErrCode();

        UserInfoNetV2 getStUserInfo();

        UserInfoNetV2OrBuilder getStUserInfoOrBuilder();

        boolean hasBRemark();

        boolean hasEErrCode();

        boolean hasStUserInfo();
    }

    public static final class SCGetUserInfoV2Rsp extends GeneratedMessage implements SCGetUserInfoV2RspOrBuilder {
        public static final int BREMARK_FIELD_NUMBER = 3;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetUserInfoV2Rsp> PARSER = null;
        public static final int STUSERINFO_FIELD_NUMBER = 2;
        private static final SCGetUserInfoV2Rsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bRemark_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private UserInfoNetV2 stUserInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCGetUserInfoV2Rsp.1 */
        class C03321 extends AbstractParser<SCGetUserInfoV2Rsp> {
            static {
                fixHelper.fixfunc(new int[]{27043, 27044});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03321();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetUserInfoV2RspOrBuilder {
            private int bRemark_;
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<UserInfoNetV2, Builder, UserInfoNetV2OrBuilder> stUserInfoBuilder_;
            private UserInfoNetV2 stUserInfo_;

            static {
                fixHelper.fixfunc(new int[]{16368, 16369, 16370, 16371, 16372, 16373, 16374, 16375, 16376, 16377, 16378, 16379, 16380, 16381, 16382, 16383, NTLMConstants.FLAG_NEGOTIATE_LOCAL_CALL, 16385, 16386, 16387, 16388, 16389, 16390, 16391, 16392, 16393, 16394, 16395, 16396, 16397, 16398, 16399, 16400, 16401, 16402, 16403, 16404, 16405, 16406, 16407, 16408, 16409, 16410, 16411, 16412, 16413, 16414, 16415, 16416});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<UserInfoNetV2, Builder, UserInfoNetV2OrBuilder> getStUserInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7826build();

            public final native SCGetUserInfoV2Rsp m7827build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7828buildPartial();

            public final native SCGetUserInfoV2Rsp m7829buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7830clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7831clear();

            public final native Builder m7832clear();

            public final native Builder clearBRemark();

            public final native Builder clearEErrCode();

            public final native Builder clearStUserInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7833clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7834clone();

            public final native Builder m7835clone();

            public final native int getBRemark();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7836getDefaultInstanceForType();

            public final native SCGetUserInfoV2Rsp m7837getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native UserInfoNetV2 getStUserInfo();

            public final native Builder getStUserInfoBuilder();

            public final native UserInfoNetV2OrBuilder getStUserInfoOrBuilder();

            public final native boolean hasBRemark();

            public final native boolean hasEErrCode();

            public final native boolean hasStUserInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7838mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7839mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7840mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7841mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7842mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetUserInfoV2Rsp sCGetUserInfoV2Rsp);

            public final native Builder mergeStUserInfo(UserInfoNetV2 userInfoNetV2);

            public final native Builder setBRemark(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStUserInfo(Builder builder);

            public final native Builder setStUserInfo(UserInfoNetV2 userInfoNetV2);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f280K;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{5734, 5735, 5736, 5737, 5738, 5739, 5740, 5741, 5742, 5743, 5744, 5745, 5746, 5747, 5748, 5749, 5750, 5751, 5752, 5753, 5754, 5755, 5756, 5757, 5758, 5759, 5760, 5761, 5762, 5763, 5764});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetUserInfoV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetUserInfoV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetUserInfoV2Rsp sCGetUserInfoV2Rsp);

        private native SCGetUserInfoV2Rsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetUserInfoV2Rsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetUserInfoV2Rsp sCGetUserInfoV2Rsp);

        private native SCGetUserInfoV2Rsp(boolean z);

        private native void initFields();

        public final native int getBRemark();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7819getDefaultInstanceForType();

        public final native SCGetUserInfoV2Rsp m7820getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetUserInfoV2Rsp> getParserForType();

        public final native int getSerializedSize();

        public final native UserInfoNetV2 getStUserInfo();

        public final native UserInfoNetV2OrBuilder getStUserInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBRemark();

        public final native boolean hasEErrCode();

        public final native boolean hasStUserInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7821newBuilderForType();

        public final native Builder m7822newBuilderForType();

        protected final native Builder m7823newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7824toBuilder();

        public final native Builder m7825toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetUserInfoV2Rsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f280K;
        }

        static void __clinit__() {
            PARSER = new C03321();
            SCGetUserInfoV2Rsp sCGetUserInfoV2Rsp = new SCGetUserInfoV2Rsp(true);
            defaultInstance = sCGetUserInfoV2Rsp;
            sCGetUserInfoV2Rsp.initFields();
        }

        public static SCGetUserInfoV2Rsp parseFrom(ByteString byteString) {
            return (SCGetUserInfoV2Rsp) PARSER.parseFrom(byteString);
        }

        public static SCGetUserInfoV2Rsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserInfoV2Rsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetUserInfoV2Rsp parseFrom(byte[] bArr) {
            return (SCGetUserInfoV2Rsp) PARSER.parseFrom(bArr);
        }

        public static SCGetUserInfoV2Rsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserInfoV2Rsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetUserInfoV2Rsp parseFrom(InputStream inputStream) {
            return (SCGetUserInfoV2Rsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetUserInfoV2Rsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserInfoV2Rsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetUserInfoV2Rsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetUserInfoV2Rsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetUserInfoV2Rsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserInfoV2Rsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetUserInfoV2Rsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetUserInfoV2Rsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetUserInfoV2Rsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetUserInfoV2Rsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetUserInfoV2Rsp sCGetUserInfoV2Rsp) {
            return newBuilder().mergeFrom(sCGetUserInfoV2Rsp);
        }
    }

    public interface SCInviteActionRspOrBuilder extends MessageOrBuilder {
        USER_FRIEND_STATE getBState();

        ERROR_CODE_TYPE getEErrCode();

        UserFriendInfoNet getStInviteUser();

        UserFriendInfoNetOrBuilder getStInviteUserOrBuilder();

        String getStrMessage();

        ByteString getStrMessageBytes();

        boolean hasBState();

        boolean hasEErrCode();

        boolean hasStInviteUser();

        boolean hasStrMessage();
    }

    public static final class SCInviteActionRsp extends GeneratedMessage implements SCInviteActionRspOrBuilder {
        public static final int BSTATE_FIELD_NUMBER = 3;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCInviteActionRsp> PARSER = null;
        public static final int STINVITEUSER_FIELD_NUMBER = 2;
        public static final int STRMESSAGE_FIELD_NUMBER = 4;
        private static final SCInviteActionRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private USER_FRIEND_STATE bState_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private UserFriendInfoNet stInviteUser_;
        private Object strMessage_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCInviteActionRsp.1 */
        class C03331 extends AbstractParser<SCInviteActionRsp> {
            static {
                fixHelper.fixfunc(new int[]{23386, 23387});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03331();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCInviteActionRspOrBuilder {
            private USER_FRIEND_STATE bState_;
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<UserFriendInfoNet, Builder, UserFriendInfoNetOrBuilder> stInviteUserBuilder_;
            private UserFriendInfoNet stInviteUser_;
            private Object strMessage_;

            static {
                fixHelper.fixfunc(new int[]{23015, 23016, 23017, 23018, 23019, 23020, 23021, 23022, 23023, 23024, 23025, 23026, 23027, 23028, 23029, 23030, 23031, 23032, 23033, 23034, 23035, 23036, 23037, 23038, 23039, 23040, 23041, 23042, 23043, 23044, 23045, 23046, 23047, 23048, 23049, 23050, 23051, 23052, 23053, 23054, 23055, 23056, 23057, 23058, 23059, 23060, 23061, 23062, 23063, 23064, 23065, 23066, 23067, 23068, 23069});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<UserFriendInfoNet, Builder, UserFriendInfoNetOrBuilder> getStInviteUserFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7850build();

            public final native SCInviteActionRsp m7851build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7852buildPartial();

            public final native SCInviteActionRsp m7853buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7854clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7855clear();

            public final native Builder m7856clear();

            public final native Builder clearBState();

            public final native Builder clearEErrCode();

            public final native Builder clearStInviteUser();

            public final native Builder clearStrMessage();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7857clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7858clone();

            public final native Builder m7859clone();

            public final native USER_FRIEND_STATE getBState();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7860getDefaultInstanceForType();

            public final native SCInviteActionRsp m7861getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native UserFriendInfoNet getStInviteUser();

            public final native Builder getStInviteUserBuilder();

            public final native UserFriendInfoNetOrBuilder getStInviteUserOrBuilder();

            public final native String getStrMessage();

            public final native ByteString getStrMessageBytes();

            public final native boolean hasBState();

            public final native boolean hasEErrCode();

            public final native boolean hasStInviteUser();

            public final native boolean hasStrMessage();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7862mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7863mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7864mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7865mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7866mergeFrom(Message message);

            public final native Builder mergeFrom(SCInviteActionRsp sCInviteActionRsp);

            public final native Builder mergeStInviteUser(UserFriendInfoNet userFriendInfoNet);

            public final native Builder setBState(USER_FRIEND_STATE user_friend_state);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStInviteUser(Builder builder);

            public final native Builder setStInviteUser(UserFriendInfoNet userFriendInfoNet);

            public final native Builder setStrMessage(String str);

            public final native Builder setStrMessageBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.ay;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14902, 14903, 14904, 14905, 14906, 14907, 14908, 14909, 14910, 14911, 14912, 14913, 14914, 14915, 14916, 14917, 14918, 14919, 14920, 14921, 14922, 14923, 14924, 14925, 14926, 14927, 14928, 14929, 14930, 14931, 14932, 14933, 14934, 14935});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCInviteActionRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCInviteActionRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCInviteActionRsp sCInviteActionRsp);

        private native SCInviteActionRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCInviteActionRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCInviteActionRsp sCInviteActionRsp);

        private native SCInviteActionRsp(boolean z);

        private native void initFields();

        public final native USER_FRIEND_STATE getBState();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7843getDefaultInstanceForType();

        public final native SCInviteActionRsp m7844getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCInviteActionRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UserFriendInfoNet getStInviteUser();

        public final native UserFriendInfoNetOrBuilder getStInviteUserOrBuilder();

        public final native String getStrMessage();

        public final native ByteString getStrMessageBytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBState();

        public final native boolean hasEErrCode();

        public final native boolean hasStInviteUser();

        public final native boolean hasStrMessage();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7845newBuilderForType();

        public final native Builder m7846newBuilderForType();

        protected final native Builder m7847newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7848toBuilder();

        public final native Builder m7849toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCInviteActionRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.ay;
        }

        static void __clinit__() {
            PARSER = new C03331();
            SCInviteActionRsp sCInviteActionRsp = new SCInviteActionRsp(true);
            defaultInstance = sCInviteActionRsp;
            sCInviteActionRsp.initFields();
        }

        public static SCInviteActionRsp parseFrom(ByteString byteString) {
            return (SCInviteActionRsp) PARSER.parseFrom(byteString);
        }

        public static SCInviteActionRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCInviteActionRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCInviteActionRsp parseFrom(byte[] bArr) {
            return (SCInviteActionRsp) PARSER.parseFrom(bArr);
        }

        public static SCInviteActionRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCInviteActionRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCInviteActionRsp parseFrom(InputStream inputStream) {
            return (SCInviteActionRsp) PARSER.parseFrom(inputStream);
        }

        public static SCInviteActionRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCInviteActionRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCInviteActionRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCInviteActionRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCInviteActionRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCInviteActionRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCInviteActionRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCInviteActionRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCInviteActionRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCInviteActionRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCInviteActionRsp sCInviteActionRsp) {
            return newBuilder().mergeFrom(sCInviteActionRsp);
        }
    }

    public interface SCLoginRewardRspOrBuilder extends MessageOrBuilder {
        int getBLoginReward();

        ERROR_CODE_TYPE getEErrCode();

        boolean hasBLoginReward();

        boolean hasEErrCode();
    }

    public static final class SCLoginRewardRsp extends GeneratedMessage implements SCLoginRewardRspOrBuilder {
        public static final int BLOGINREWARD_FIELD_NUMBER = 2;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCLoginRewardRsp> PARSER;
        private static final SCLoginRewardRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bLoginReward_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCLoginRewardRsp.1 */
        class C03341 extends AbstractParser<SCLoginRewardRsp> {
            static {
                fixHelper.fixfunc(new int[]{14362, 14363});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03341();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCLoginRewardRspOrBuilder {
            private int bLoginReward_;
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;

            static {
                fixHelper.fixfunc(new int[]{26596, 26597, 26598, 26599, 26600, 26601, 26602, 26603, 26604, 26605, 26606, 26607, 26608, 26609, 26610, 26611, 26612, 26613, 26614, 26615, 26616, 26617, 26618, 26619, 26620, 26621, 26622, 26623, 26624, 26625, 26626, 26627, 26628, 26629, 26630, 26631, 26632, 26633, 26634, 26635});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7874build();

            public final native SCLoginRewardRsp m7875build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7876buildPartial();

            public final native SCLoginRewardRsp m7877buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7878clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7879clear();

            public final native Builder m7880clear();

            public final native Builder clearBLoginReward();

            public final native Builder clearEErrCode();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7881clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7882clone();

            public final native Builder m7883clone();

            public final native int getBLoginReward();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7884getDefaultInstanceForType();

            public final native SCLoginRewardRsp m7885getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native boolean hasBLoginReward();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7886mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7887mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7888mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7889mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7890mergeFrom(Message message);

            public final native Builder mergeFrom(SCLoginRewardRsp sCLoginRewardRsp);

            public final native Builder setBLoginReward(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f306k;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{5456, 5457, 5458, 5459, 5460, 5461, 5462, 5463, 5464, 5465, 5466, 5467, 5468, 5469, 5470, 5471, 5472, 5473, 5474, 5475, 5476, 5477, 5478, 5479, 5480, 5481, 5482, 5483});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCLoginRewardRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCLoginRewardRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCLoginRewardRsp sCLoginRewardRsp);

        private native SCLoginRewardRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCLoginRewardRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCLoginRewardRsp sCLoginRewardRsp);

        private native SCLoginRewardRsp(boolean z);

        private native void initFields();

        public final native int getBLoginReward();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7867getDefaultInstanceForType();

        public final native SCLoginRewardRsp m7868getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCLoginRewardRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBLoginReward();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7869newBuilderForType();

        public final native Builder m7870newBuilderForType();

        protected final native Builder m7871newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7872toBuilder();

        public final native Builder m7873toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCLoginRewardRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f306k;
        }

        static void __clinit__() {
            PARSER = new C03341();
            SCLoginRewardRsp sCLoginRewardRsp = new SCLoginRewardRsp(true);
            defaultInstance = sCLoginRewardRsp;
            sCLoginRewardRsp.initFields();
        }

        public static SCLoginRewardRsp parseFrom(ByteString byteString) {
            return (SCLoginRewardRsp) PARSER.parseFrom(byteString);
        }

        public static SCLoginRewardRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCLoginRewardRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCLoginRewardRsp parseFrom(byte[] bArr) {
            return (SCLoginRewardRsp) PARSER.parseFrom(bArr);
        }

        public static SCLoginRewardRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCLoginRewardRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCLoginRewardRsp parseFrom(InputStream inputStream) {
            return (SCLoginRewardRsp) PARSER.parseFrom(inputStream);
        }

        public static SCLoginRewardRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCLoginRewardRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCLoginRewardRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCLoginRewardRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCLoginRewardRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCLoginRewardRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCLoginRewardRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCLoginRewardRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCLoginRewardRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCLoginRewardRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCLoginRewardRsp sCLoginRewardRsp) {
            return newBuilder().mergeFrom(sCLoginRewardRsp);
        }
    }

    public interface SCRemarkUserNickNameRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getRemarkUuid();

        String getSRemarContent();

        ByteString getSRemarContentBytes();

        boolean hasEErrCode();

        boolean hasRemarkUuid();

        boolean hasSRemarContent();
    }

    public static final class SCRemarkUserNickNameRsp extends GeneratedMessage implements SCRemarkUserNickNameRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCRemarkUserNickNameRsp> PARSER = null;
        public static final int REMARKUUID_FIELD_NUMBER = 2;
        public static final int SREMARCONTENT_FIELD_NUMBER = 3;
        private static final SCRemarkUserNickNameRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private long remarkUuid_;
        private Object sRemarContent_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCRemarkUserNickNameRsp.1 */
        class C03351 extends AbstractParser<SCRemarkUserNickNameRsp> {
            static {
                fixHelper.fixfunc(new int[]{30428, 30429});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03351();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCRemarkUserNickNameRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long remarkUuid_;
            private Object sRemarContent_;

            static {
                fixHelper.fixfunc(new int[]{13335, 13336, 13337, 13338, 13339, 13340, 13341, 13342, 13343, 13344, 13345, 13346, 13347, 13348, 13349, 13350, 13351, 13352, 13353, 13354, 13355, 13356, 13357, 13358, 13359, 13360, 13361, 13362, 13363, 13364, 13365, 13366, 13367, 13368, 13369, 13370, 13371, 13372, 13373, 13374, 13375, 13376, 13377, 13378, 13379, 13380});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7898build();

            public final native SCRemarkUserNickNameRsp m7899build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7900buildPartial();

            public final native SCRemarkUserNickNameRsp m7901buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7902clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7903clear();

            public final native Builder m7904clear();

            public final native Builder clearEErrCode();

            public final native Builder clearRemarkUuid();

            public final native Builder clearSRemarContent();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7905clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7906clone();

            public final native Builder m7907clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7908getDefaultInstanceForType();

            public final native SCRemarkUserNickNameRsp m7909getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getRemarkUuid();

            public final native String getSRemarContent();

            public final native ByteString getSRemarContentBytes();

            public final native boolean hasEErrCode();

            public final native boolean hasRemarkUuid();

            public final native boolean hasSRemarContent();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7910mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7911mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7912mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7913mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7914mergeFrom(Message message);

            public final native Builder mergeFrom(SCRemarkUserNickNameRsp sCRemarkUserNickNameRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setRemarkUuid(long j);

            public final native Builder setSRemarContent(String str);

            public final native Builder setSRemarContentBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aY;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{22789, 22790, 22791, 22792, 22793, 22794, 22795, 22796, 22797, 22798, 22799, 22800, 22801, 22802, 22803, 22804, 22805, 22806, 22807, 22808, 22809, 22810, 22811, 22812, 22813, 22814, 22815, 22816, 22817, 22818, 22819});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCRemarkUserNickNameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCRemarkUserNickNameRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCRemarkUserNickNameRsp sCRemarkUserNickNameRsp);

        private native SCRemarkUserNickNameRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCRemarkUserNickNameRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCRemarkUserNickNameRsp sCRemarkUserNickNameRsp);

        private native SCRemarkUserNickNameRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7891getDefaultInstanceForType();

        public final native SCRemarkUserNickNameRsp m7892getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCRemarkUserNickNameRsp> getParserForType();

        public final native long getRemarkUuid();

        public final native String getSRemarContent();

        public final native ByteString getSRemarContentBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasRemarkUuid();

        public final native boolean hasSRemarContent();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7893newBuilderForType();

        public final native Builder m7894newBuilderForType();

        protected final native Builder m7895newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7896toBuilder();

        public final native Builder m7897toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCRemarkUserNickNameRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aY;
        }

        static void __clinit__() {
            PARSER = new C03351();
            SCRemarkUserNickNameRsp sCRemarkUserNickNameRsp = new SCRemarkUserNickNameRsp(true);
            defaultInstance = sCRemarkUserNickNameRsp;
            sCRemarkUserNickNameRsp.initFields();
        }

        public static SCRemarkUserNickNameRsp parseFrom(ByteString byteString) {
            return (SCRemarkUserNickNameRsp) PARSER.parseFrom(byteString);
        }

        public static SCRemarkUserNickNameRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemarkUserNickNameRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCRemarkUserNickNameRsp parseFrom(byte[] bArr) {
            return (SCRemarkUserNickNameRsp) PARSER.parseFrom(bArr);
        }

        public static SCRemarkUserNickNameRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemarkUserNickNameRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCRemarkUserNickNameRsp parseFrom(InputStream inputStream) {
            return (SCRemarkUserNickNameRsp) PARSER.parseFrom(inputStream);
        }

        public static SCRemarkUserNickNameRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemarkUserNickNameRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCRemarkUserNickNameRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCRemarkUserNickNameRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCRemarkUserNickNameRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemarkUserNickNameRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCRemarkUserNickNameRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCRemarkUserNickNameRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCRemarkUserNickNameRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemarkUserNickNameRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCRemarkUserNickNameRsp sCRemarkUserNickNameRsp) {
            return newBuilder().mergeFrom(sCRemarkUserNickNameRsp);
        }
    }

    public interface SCRemoveFriendRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getFriendUuid();

        boolean hasEErrCode();

        boolean hasFriendUuid();
    }

    public static final class SCRemoveFriendRsp extends GeneratedMessage implements SCRemoveFriendRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int FRIENDUUID_FIELD_NUMBER = 2;
        public static Parser<SCRemoveFriendRsp> PARSER;
        private static final SCRemoveFriendRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long friendUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCRemoveFriendRsp.1 */
        class C03361 extends AbstractParser<SCRemoveFriendRsp> {
            static {
                fixHelper.fixfunc(new int[]{28443, 28444});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03361();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCRemoveFriendRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long friendUuid_;

            static {
                fixHelper.fixfunc(new int[]{11057, 11058, 11059, 11060, 11061, 11062, 11063, 11064, 11065, 11066, 11067, 11068, 11069, 11070, 11071, 11072, 11073, 11074, 11075, 11076, 11077, 11078, 11079, 11080, 11081, 11082, 11083, 11084, 11085, 11086, 11087, 11088, 11089, 11090, 11091, 11092, 11093, 11094, 11095, 11096});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7922build();

            public final native SCRemoveFriendRsp m7923build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7924buildPartial();

            public final native SCRemoveFriendRsp m7925buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7926clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7927clear();

            public final native Builder m7928clear();

            public final native Builder clearEErrCode();

            public final native Builder clearFriendUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7929clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7930clone();

            public final native Builder m7931clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7932getDefaultInstanceForType();

            public final native SCRemoveFriendRsp m7933getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getFriendUuid();

            public final native boolean hasEErrCode();

            public final native boolean hasFriendUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7934mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7935mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7936mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7937mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7938mergeFrom(Message message);

            public final native Builder mergeFrom(SCRemoveFriendRsp sCRemoveFriendRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setFriendUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aC;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{24703, 24704, 24705, 24706, 24707, 24708, 24709, 24710, 24711, 24712, 24713, 24714, 24715, 24716, 24717, 24718, 24719, 24720, 24721, 24722, 24723, 24724, 24725, 24726, 24727, 24728, 24729, 24730});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCRemoveFriendRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCRemoveFriendRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCRemoveFriendRsp sCRemoveFriendRsp);

        private native SCRemoveFriendRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCRemoveFriendRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCRemoveFriendRsp sCRemoveFriendRsp);

        private native SCRemoveFriendRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7915getDefaultInstanceForType();

        public final native SCRemoveFriendRsp m7916getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getFriendUuid();

        public final native Parser<SCRemoveFriendRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasFriendUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7917newBuilderForType();

        public final native Builder m7918newBuilderForType();

        protected final native Builder m7919newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7920toBuilder();

        public final native Builder m7921toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCRemoveFriendRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aC;
        }

        static void __clinit__() {
            PARSER = new C03361();
            SCRemoveFriendRsp sCRemoveFriendRsp = new SCRemoveFriendRsp(true);
            defaultInstance = sCRemoveFriendRsp;
            sCRemoveFriendRsp.initFields();
        }

        public static SCRemoveFriendRsp parseFrom(ByteString byteString) {
            return (SCRemoveFriendRsp) PARSER.parseFrom(byteString);
        }

        public static SCRemoveFriendRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFriendRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCRemoveFriendRsp parseFrom(byte[] bArr) {
            return (SCRemoveFriendRsp) PARSER.parseFrom(bArr);
        }

        public static SCRemoveFriendRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFriendRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCRemoveFriendRsp parseFrom(InputStream inputStream) {
            return (SCRemoveFriendRsp) PARSER.parseFrom(inputStream);
        }

        public static SCRemoveFriendRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFriendRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCRemoveFriendRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCRemoveFriendRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCRemoveFriendRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFriendRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCRemoveFriendRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCRemoveFriendRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCRemoveFriendRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFriendRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCRemoveFriendRsp sCRemoveFriendRsp) {
            return newBuilder().mergeFrom(sCRemoveFriendRsp);
        }
    }

    public interface SCSearchFriendRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        UserFriendInfoNet getVUserFriendIfos(int i);

        int getVUserFriendIfosCount();

        List<UserFriendInfoNet> getVUserFriendIfosList();

        UserFriendInfoNetOrBuilder getVUserFriendIfosOrBuilder(int i);

        List<? extends UserFriendInfoNetOrBuilder> getVUserFriendIfosOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCSearchFriendRsp extends GeneratedMessage implements SCSearchFriendRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCSearchFriendRsp> PARSER = null;
        public static final int VUSERFRIENDIFOS_FIELD_NUMBER = 2;
        private static final SCSearchFriendRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<UserFriendInfoNet> vUserFriendIfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCSearchFriendRsp.1 */
        class C03371 extends AbstractParser<SCSearchFriendRsp> {
            static {
                fixHelper.fixfunc(new int[]{11659, 11660});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03371();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSearchFriendRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<UserFriendInfoNet, Builder, UserFriendInfoNetOrBuilder> vUserFriendIfosBuilder_;
            private List<UserFriendInfoNet> vUserFriendIfos_;

            static {
                fixHelper.fixfunc(new int[]{30973, 30974, 30975, 30976, 30977, 30978, 30979, 30980, 30981, 30982, 30983, 30984, 30985, 30986, 30987, 30988, 30989, 30990, 30991, 30992, 30993, 30994, 30995, 30996, 30997, 30998, 30999, 31000, 31001, 31002, 31003, 31004, 31005, 31006, 31007, 31008, 31009, 31010, 31011, 31012, 31013, 31014, 31015, 31016, 31017, 31018, 31019, 31020, 31021, 31022, 31023, 31024, 31025, 31026, 31027, 31028});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVUserFriendIfosIsMutable();

            private native RepeatedFieldBuilder<UserFriendInfoNet, Builder, UserFriendInfoNetOrBuilder> getVUserFriendIfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVUserFriendIfos(Iterable<? extends UserFriendInfoNet> iterable);

            public final native Builder addVUserFriendIfos(int i, Builder builder);

            public final native Builder addVUserFriendIfos(int i, UserFriendInfoNet userFriendInfoNet);

            public final native Builder addVUserFriendIfos(Builder builder);

            public final native Builder addVUserFriendIfos(UserFriendInfoNet userFriendInfoNet);

            public final native Builder addVUserFriendIfosBuilder();

            public final native Builder addVUserFriendIfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7946build();

            public final native SCSearchFriendRsp m7947build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7948buildPartial();

            public final native SCSearchFriendRsp m7949buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7950clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7951clear();

            public final native Builder m7952clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVUserFriendIfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7953clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7954clone();

            public final native Builder m7955clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7956getDefaultInstanceForType();

            public final native SCSearchFriendRsp m7957getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native UserFriendInfoNet getVUserFriendIfos(int i);

            public final native Builder getVUserFriendIfosBuilder(int i);

            public final native List<Builder> getVUserFriendIfosBuilderList();

            public final native int getVUserFriendIfosCount();

            public final native List<UserFriendInfoNet> getVUserFriendIfosList();

            public final native UserFriendInfoNetOrBuilder getVUserFriendIfosOrBuilder(int i);

            public final native List<? extends UserFriendInfoNetOrBuilder> getVUserFriendIfosOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7958mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7959mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7960mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7961mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7962mergeFrom(Message message);

            public final native Builder mergeFrom(SCSearchFriendRsp sCSearchFriendRsp);

            public final native Builder removeVUserFriendIfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVUserFriendIfos(int i, Builder builder);

            public final native Builder setVUserFriendIfos(int i, UserFriendInfoNet userFriendInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aG;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{20536, 20537, 20538, 20539, 20540, 20541, 20542, 20543, 20544, 20545, 20546, 20547, 20548, 20549, 20550, 20551, 20552, 20553, 20554, 20555, 20556, 20557, 20558, 20559, 20560, 20561, 20562, 20563, 20564, 20565, 20566});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSearchFriendRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSearchFriendRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSearchFriendRsp sCSearchFriendRsp);

        private native SCSearchFriendRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSearchFriendRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSearchFriendRsp sCSearchFriendRsp);

        private native SCSearchFriendRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7939getDefaultInstanceForType();

        public final native SCSearchFriendRsp m7940getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCSearchFriendRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native UserFriendInfoNet getVUserFriendIfos(int i);

        public final native int getVUserFriendIfosCount();

        public final native List<UserFriendInfoNet> getVUserFriendIfosList();

        public final native UserFriendInfoNetOrBuilder getVUserFriendIfosOrBuilder(int i);

        public final native List<? extends UserFriendInfoNetOrBuilder> getVUserFriendIfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7941newBuilderForType();

        public final native Builder m7942newBuilderForType();

        protected final native Builder m7943newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7944toBuilder();

        public final native Builder m7945toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSearchFriendRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aG;
        }

        static void __clinit__() {
            PARSER = new C03371();
            SCSearchFriendRsp sCSearchFriendRsp = new SCSearchFriendRsp(true);
            defaultInstance = sCSearchFriendRsp;
            sCSearchFriendRsp.initFields();
        }

        public static SCSearchFriendRsp parseFrom(ByteString byteString) {
            return (SCSearchFriendRsp) PARSER.parseFrom(byteString);
        }

        public static SCSearchFriendRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchFriendRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSearchFriendRsp parseFrom(byte[] bArr) {
            return (SCSearchFriendRsp) PARSER.parseFrom(bArr);
        }

        public static SCSearchFriendRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchFriendRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSearchFriendRsp parseFrom(InputStream inputStream) {
            return (SCSearchFriendRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSearchFriendRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchFriendRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSearchFriendRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSearchFriendRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSearchFriendRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchFriendRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSearchFriendRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSearchFriendRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSearchFriendRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchFriendRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSearchFriendRsp sCSearchFriendRsp) {
            return newBuilder().mergeFrom(sCSearchFriendRsp);
        }
    }

    public interface SCSetUserInfoNewRspOrBuilder extends MessageOrBuilder {
        int getBMute();

        int getBVibrate();

        ERROR_CODE_TYPE getEErrCode();

        int getIGender();

        String getSDesc();

        ByteString getSDescBytes();

        String getSIconUrl();

        ByteString getSIconUrlBytes();

        String getSNickname();

        ByteString getSNicknameBytes();

        String getSPhhoneNumber();

        ByteString getSPhhoneNumberBytes();

        boolean hasBMute();

        boolean hasBVibrate();

        boolean hasEErrCode();

        boolean hasIGender();

        boolean hasSDesc();

        boolean hasSIconUrl();

        boolean hasSNickname();

        boolean hasSPhhoneNumber();
    }

    public static final class SCSetUserInfoNewRsp extends GeneratedMessage implements SCSetUserInfoNewRspOrBuilder {
        public static final int BMUTE_FIELD_NUMBER = 7;
        public static final int BVIBRATE_FIELD_NUMBER = 8;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IGENDER_FIELD_NUMBER = 3;
        public static Parser<SCSetUserInfoNewRsp> PARSER = null;
        public static final int SDESC_FIELD_NUMBER = 6;
        public static final int SICONURL_FIELD_NUMBER = 4;
        public static final int SNICKNAME_FIELD_NUMBER = 2;
        public static final int SPHHONENUMBER_FIELD_NUMBER = 5;
        private static final SCSetUserInfoNewRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bMute_;
        private int bVibrate_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iGender_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sDesc_;
        private Object sIconUrl_;
        private Object sNickname_;
        private Object sPhhoneNumber_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCSetUserInfoNewRsp.1 */
        class C03381 extends AbstractParser<SCSetUserInfoNewRsp> {
            static {
                fixHelper.fixfunc(new int[]{25013, 25014});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03381();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSetUserInfoNewRspOrBuilder {
            private int bMute_;
            private int bVibrate_;
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iGender_;
            private Object sDesc_;
            private Object sIconUrl_;
            private Object sNickname_;
            private Object sPhhoneNumber_;

            static {
                fixHelper.fixfunc(new int[]{4536, 4537, 4538, 4539, 4540, 4541, 4542, 4543, 4544, 4545, 4546, 4547, 4548, 4549, 4550, 4551, 4552, 4553, 4554, 4555, 4556, 4557, 4558, 4559, 4560, 4561, 4562, 4563, 4564, 4565, 4566, 4567, 4568, 4569, 4570, 4571, 4572, 4573, 4574, 4575, 4576, 4577, 4578, 4579, 4580, 4581, 4582, 4583, 4584, 4585, 4586, 4587, 4588, 4589, 4590, 4591, 4592, 4593, 4594, 4595, 4596, 4597, 4598, 4599, 4600, 4601, 4602, 4603, 4604, 4605, 4606, 4607});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7970build();

            public final native SCSetUserInfoNewRsp m7971build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7972buildPartial();

            public final native SCSetUserInfoNewRsp m7973buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7974clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7975clear();

            public final native Builder m7976clear();

            public final native Builder clearBMute();

            public final native Builder clearBVibrate();

            public final native Builder clearEErrCode();

            public final native Builder clearIGender();

            public final native Builder clearSDesc();

            public final native Builder clearSIconUrl();

            public final native Builder clearSNickname();

            public final native Builder clearSPhhoneNumber();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7977clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7978clone();

            public final native Builder m7979clone();

            public final native int getBMute();

            public final native int getBVibrate();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m7980getDefaultInstanceForType();

            public final native SCSetUserInfoNewRsp m7981getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getIGender();

            public final native String getSDesc();

            public final native ByteString getSDescBytes();

            public final native String getSIconUrl();

            public final native ByteString getSIconUrlBytes();

            public final native String getSNickname();

            public final native ByteString getSNicknameBytes();

            public final native String getSPhhoneNumber();

            public final native ByteString getSPhhoneNumberBytes();

            public final native boolean hasBMute();

            public final native boolean hasBVibrate();

            public final native boolean hasEErrCode();

            public final native boolean hasIGender();

            public final native boolean hasSDesc();

            public final native boolean hasSIconUrl();

            public final native boolean hasSNickname();

            public final native boolean hasSPhhoneNumber();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7982mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7983mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7984mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7985mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m7986mergeFrom(Message message);

            public final native Builder mergeFrom(SCSetUserInfoNewRsp sCSetUserInfoNewRsp);

            public final native Builder setBMute(int i);

            public final native Builder setBVibrate(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIGender(int i);

            public final native Builder setSDesc(String str);

            public final native Builder setSDescBytes(ByteString byteString);

            public final native Builder setSIconUrl(String str);

            public final native Builder setSIconUrlBytes(ByteString byteString);

            public final native Builder setSNickname(String str);

            public final native Builder setSNicknameBytes(ByteString byteString);

            public final native Builder setSPhhoneNumber(String str);

            public final native Builder setSPhhoneNumberBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f284O;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16697, 16698, 16699, 16700, 16701, 16702, 16703, 16704, 16705, 16706, 16707, 16708, 16709, 16710, 16711, 16712, 16713, 16714, 16715, 16716, 16717, 16718, 16719, 16720, 16721, 16722, 16723, 16724, 16725, 16726, 16727, 16728, 16729, 16730, 16731, 16732, 16733, 16734, 16735, 16736, 16737, 16738, 16739, 16740});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSetUserInfoNewRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSetUserInfoNewRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSetUserInfoNewRsp sCSetUserInfoNewRsp);

        private native SCSetUserInfoNewRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSetUserInfoNewRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSetUserInfoNewRsp sCSetUserInfoNewRsp);

        private native SCSetUserInfoNewRsp(boolean z);

        private native void initFields();

        public final native int getBMute();

        public final native int getBVibrate();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7963getDefaultInstanceForType();

        public final native SCSetUserInfoNewRsp m7964getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIGender();

        public final native Parser<SCSetUserInfoNewRsp> getParserForType();

        public final native String getSDesc();

        public final native ByteString getSDescBytes();

        public final native String getSIconUrl();

        public final native ByteString getSIconUrlBytes();

        public final native String getSNickname();

        public final native ByteString getSNicknameBytes();

        public final native String getSPhhoneNumber();

        public final native ByteString getSPhhoneNumberBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBMute();

        public final native boolean hasBVibrate();

        public final native boolean hasEErrCode();

        public final native boolean hasIGender();

        public final native boolean hasSDesc();

        public final native boolean hasSIconUrl();

        public final native boolean hasSNickname();

        public final native boolean hasSPhhoneNumber();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7965newBuilderForType();

        public final native Builder m7966newBuilderForType();

        protected final native Builder m7967newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7968toBuilder();

        public final native Builder m7969toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSetUserInfoNewRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f284O;
        }

        static void __clinit__() {
            PARSER = new C03381();
            SCSetUserInfoNewRsp sCSetUserInfoNewRsp = new SCSetUserInfoNewRsp(true);
            defaultInstance = sCSetUserInfoNewRsp;
            sCSetUserInfoNewRsp.initFields();
        }

        public static SCSetUserInfoNewRsp parseFrom(ByteString byteString) {
            return (SCSetUserInfoNewRsp) PARSER.parseFrom(byteString);
        }

        public static SCSetUserInfoNewRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoNewRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSetUserInfoNewRsp parseFrom(byte[] bArr) {
            return (SCSetUserInfoNewRsp) PARSER.parseFrom(bArr);
        }

        public static SCSetUserInfoNewRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoNewRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSetUserInfoNewRsp parseFrom(InputStream inputStream) {
            return (SCSetUserInfoNewRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSetUserInfoNewRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoNewRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetUserInfoNewRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSetUserInfoNewRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSetUserInfoNewRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoNewRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetUserInfoNewRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSetUserInfoNewRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSetUserInfoNewRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoNewRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSetUserInfoNewRsp sCSetUserInfoNewRsp) {
            return newBuilder().mergeFrom(sCSetUserInfoNewRsp);
        }
    }

    public interface SCSetUserInfoRspOrBuilder extends MessageOrBuilder {
        int getBMute();

        int getBVibrate();

        ERROR_CODE_TYPE getEErrCode();

        int getIGender();

        String getSDesc();

        ByteString getSDescBytes();

        String getSIconUrl();

        ByteString getSIconUrlBytes();

        String getSNickname();

        ByteString getSNicknameBytes();

        String getSPhhoneNumber();

        ByteString getSPhhoneNumberBytes();

        boolean hasBMute();

        boolean hasBVibrate();

        boolean hasEErrCode();

        boolean hasIGender();

        boolean hasSDesc();

        boolean hasSIconUrl();

        boolean hasSNickname();

        boolean hasSPhhoneNumber();
    }

    public static final class SCSetUserInfoRsp extends GeneratedMessage implements SCSetUserInfoRspOrBuilder {
        public static final int BMUTE_FIELD_NUMBER = 7;
        public static final int BVIBRATE_FIELD_NUMBER = 8;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IGENDER_FIELD_NUMBER = 3;
        public static Parser<SCSetUserInfoRsp> PARSER = null;
        public static final int SDESC_FIELD_NUMBER = 6;
        public static final int SICONURL_FIELD_NUMBER = 4;
        public static final int SNICKNAME_FIELD_NUMBER = 2;
        public static final int SPHHONENUMBER_FIELD_NUMBER = 5;
        private static final SCSetUserInfoRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bMute_;
        private int bVibrate_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iGender_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sDesc_;
        private Object sIconUrl_;
        private Object sNickname_;
        private Object sPhhoneNumber_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCSetUserInfoRsp.1 */
        class C03391 extends AbstractParser<SCSetUserInfoRsp> {
            static {
                fixHelper.fixfunc(new int[]{23157, 23158});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03391();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSetUserInfoRspOrBuilder {
            private int bMute_;
            private int bVibrate_;
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iGender_;
            private Object sDesc_;
            private Object sIconUrl_;
            private Object sNickname_;
            private Object sPhhoneNumber_;

            static {
                fixHelper.fixfunc(new int[]{11997, 11998, 11999, 12000, 12001, 12002, 12003, 12004, 12005, 12006, 12007, 12008, 12009, 12010, 12011, 12012, 12013, 12014, 12015, 12016, 12017, 12018, 12019, 12020, 12021, 12022, 12023, 12024, 12025, 12026, 12027, 12028, 12029, 12030, 12031, 12032, 12033, 12034, 12035, 12036, 12037, 12038, 12039, 12040, 12041, 12042, 12043, 12044, 12045, 12046, 12047, 12048, 12049, 12050, 12051, 12052, 12053, 12054, 12055, 12056, 12057, 12058, 12059, 12060, 12061, 12062, 12063, 12064, 12065, 12066, 12067, 12068});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m7994build();

            public final native SCSetUserInfoRsp m7995build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m7996buildPartial();

            public final native SCSetUserInfoRsp m7997buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m7998clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7999clear();

            public final native Builder m8000clear();

            public final native Builder clearBMute();

            public final native Builder clearBVibrate();

            public final native Builder clearEErrCode();

            public final native Builder clearIGender();

            public final native Builder clearSDesc();

            public final native Builder clearSIconUrl();

            public final native Builder clearSNickname();

            public final native Builder clearSPhhoneNumber();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8001clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8002clone();

            public final native Builder m8003clone();

            public final native int getBMute();

            public final native int getBVibrate();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8004getDefaultInstanceForType();

            public final native SCSetUserInfoRsp m8005getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getIGender();

            public final native String getSDesc();

            public final native ByteString getSDescBytes();

            public final native String getSIconUrl();

            public final native ByteString getSIconUrlBytes();

            public final native String getSNickname();

            public final native ByteString getSNicknameBytes();

            public final native String getSPhhoneNumber();

            public final native ByteString getSPhhoneNumberBytes();

            public final native boolean hasBMute();

            public final native boolean hasBVibrate();

            public final native boolean hasEErrCode();

            public final native boolean hasIGender();

            public final native boolean hasSDesc();

            public final native boolean hasSIconUrl();

            public final native boolean hasSNickname();

            public final native boolean hasSPhhoneNumber();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8006mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8007mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8008mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8009mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8010mergeFrom(Message message);

            public final native Builder mergeFrom(SCSetUserInfoRsp sCSetUserInfoRsp);

            public final native Builder setBMute(int i);

            public final native Builder setBVibrate(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIGender(int i);

            public final native Builder setSDesc(String str);

            public final native Builder setSDescBytes(ByteString byteString);

            public final native Builder setSIconUrl(String str);

            public final native Builder setSIconUrlBytes(ByteString byteString);

            public final native Builder setSNickname(String str);

            public final native Builder setSNicknameBytes(ByteString byteString);

            public final native Builder setSPhhoneNumber(String str);

            public final native Builder setSPhhoneNumberBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f288S;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{25435, 25436, 25437, 25438, 25439, 25440, 25441, 25442, 25443, 25444, 25445, 25446, 25447, 25448, 25449, 25450, 25451, 25452, 25453, 25454, 25455, 25456, 25457, 25458, 25459, 25460, 25461, 25462, 25463, 25464, 25465, 25466, 25467, 25468, 25469, 25470, 25471, 25472, 25473, 25474, 25475, 25476, 25477, 25478});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSetUserInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSetUserInfoRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSetUserInfoRsp sCSetUserInfoRsp);

        private native SCSetUserInfoRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSetUserInfoRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSetUserInfoRsp sCSetUserInfoRsp);

        private native SCSetUserInfoRsp(boolean z);

        private native void initFields();

        public final native int getBMute();

        public final native int getBVibrate();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m7987getDefaultInstanceForType();

        public final native SCSetUserInfoRsp m7988getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIGender();

        public final native Parser<SCSetUserInfoRsp> getParserForType();

        public final native String getSDesc();

        public final native ByteString getSDescBytes();

        public final native String getSIconUrl();

        public final native ByteString getSIconUrlBytes();

        public final native String getSNickname();

        public final native ByteString getSNicknameBytes();

        public final native String getSPhhoneNumber();

        public final native ByteString getSPhhoneNumberBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBMute();

        public final native boolean hasBVibrate();

        public final native boolean hasEErrCode();

        public final native boolean hasIGender();

        public final native boolean hasSDesc();

        public final native boolean hasSIconUrl();

        public final native boolean hasSNickname();

        public final native boolean hasSPhhoneNumber();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7989newBuilderForType();

        public final native Builder m7990newBuilderForType();

        protected final native Builder m7991newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m7992toBuilder();

        public final native Builder m7993toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSetUserInfoRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f288S;
        }

        static void __clinit__() {
            PARSER = new C03391();
            SCSetUserInfoRsp sCSetUserInfoRsp = new SCSetUserInfoRsp(true);
            defaultInstance = sCSetUserInfoRsp;
            sCSetUserInfoRsp.initFields();
        }

        public static SCSetUserInfoRsp parseFrom(ByteString byteString) {
            return (SCSetUserInfoRsp) PARSER.parseFrom(byteString);
        }

        public static SCSetUserInfoRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSetUserInfoRsp parseFrom(byte[] bArr) {
            return (SCSetUserInfoRsp) PARSER.parseFrom(bArr);
        }

        public static SCSetUserInfoRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSetUserInfoRsp parseFrom(InputStream inputStream) {
            return (SCSetUserInfoRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSetUserInfoRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetUserInfoRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSetUserInfoRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSetUserInfoRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetUserInfoRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSetUserInfoRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSetUserInfoRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSetUserInfoRsp sCSetUserInfoRsp) {
            return newBuilder().mergeFrom(sCSetUserInfoRsp);
        }
    }

    public interface SCSetUserInfoSettingRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        int getIFriendInviteMute();

        int getIMute();

        int getIVibrate();

        long getUuid();

        boolean hasEErrCode();

        boolean hasIFriendInviteMute();

        boolean hasIMute();

        boolean hasIVibrate();

        boolean hasUuid();
    }

    public static final class SCSetUserInfoSettingRsp extends GeneratedMessage implements SCSetUserInfoSettingRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IFRIENDINVITEMUTE_FIELD_NUMBER = 5;
        public static final int IMUTE_FIELD_NUMBER = 3;
        public static final int IVIBRATE_FIELD_NUMBER = 4;
        public static Parser<SCSetUserInfoSettingRsp> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 2;
        private static final SCSetUserInfoSettingRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iFriendInviteMute_;
        private int iMute_;
        private int iVibrate_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCSetUserInfoSettingRsp.1 */
        class C03401 extends AbstractParser<SCSetUserInfoSettingRsp> {
            static {
                fixHelper.fixfunc(new int[]{29557, 29558});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03401();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSetUserInfoSettingRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iFriendInviteMute_;
            private int iMute_;
            private int iVibrate_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{21476, 21477, 21478, 21479, 21480, 21481, 21482, 21483, 21484, 21485, 21486, 21487, 21488, 21489, 21490, 21491, 21492, 21493, 21494, 21495, 21496, 21497, 21498, 21499, 21500, 21501, 21502, 21503, 21504, 21505, 21506, 21507, 21508, 21509, 21510, 21511, 21512, 21513, 21514, 21515, 21516, 21517, 21518, 21519, 21520, 21521, 21522, 21523, 21524, 21525, 21526, 21527});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8018build();

            public final native SCSetUserInfoSettingRsp m8019build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8020buildPartial();

            public final native SCSetUserInfoSettingRsp m8021buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8022clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8023clear();

            public final native Builder m8024clear();

            public final native Builder clearEErrCode();

            public final native Builder clearIFriendInviteMute();

            public final native Builder clearIMute();

            public final native Builder clearIVibrate();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8025clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8026clone();

            public final native Builder m8027clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8028getDefaultInstanceForType();

            public final native SCSetUserInfoSettingRsp m8029getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getIFriendInviteMute();

            public final native int getIMute();

            public final native int getIVibrate();

            public final native long getUuid();

            public final native boolean hasEErrCode();

            public final native boolean hasIFriendInviteMute();

            public final native boolean hasIMute();

            public final native boolean hasIVibrate();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8030mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8031mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8032mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8033mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8034mergeFrom(Message message);

            public final native Builder mergeFrom(SCSetUserInfoSettingRsp sCSetUserInfoSettingRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIFriendInviteMute(int i);

            public final native Builder setIMute(int i);

            public final native Builder setIVibrate(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f292W;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{12069, 12070, 12071, 12072, 12073, 12074, 12075, 12076, 12077, 12078, 12079, 12080, 12081, 12082, 12083, 12084, 12085, 12086, 12087, 12088, 12089, 12090, 12091, 12092, 12093, 12094, 12095, 12096, 12097, 12098, 12099, 12100, 12101, 12102});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSetUserInfoSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSetUserInfoSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSetUserInfoSettingRsp sCSetUserInfoSettingRsp);

        private native SCSetUserInfoSettingRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSetUserInfoSettingRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSetUserInfoSettingRsp sCSetUserInfoSettingRsp);

        private native SCSetUserInfoSettingRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8011getDefaultInstanceForType();

        public final native SCSetUserInfoSettingRsp m8012getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIFriendInviteMute();

        public final native int getIMute();

        public final native int getIVibrate();

        public final native Parser<SCSetUserInfoSettingRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEErrCode();

        public final native boolean hasIFriendInviteMute();

        public final native boolean hasIMute();

        public final native boolean hasIVibrate();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8013newBuilderForType();

        public final native Builder m8014newBuilderForType();

        protected final native Builder m8015newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8016toBuilder();

        public final native Builder m8017toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSetUserInfoSettingRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f292W;
        }

        static void __clinit__() {
            PARSER = new C03401();
            SCSetUserInfoSettingRsp sCSetUserInfoSettingRsp = new SCSetUserInfoSettingRsp(true);
            defaultInstance = sCSetUserInfoSettingRsp;
            sCSetUserInfoSettingRsp.initFields();
        }

        public static SCSetUserInfoSettingRsp parseFrom(ByteString byteString) {
            return (SCSetUserInfoSettingRsp) PARSER.parseFrom(byteString);
        }

        public static SCSetUserInfoSettingRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoSettingRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSetUserInfoSettingRsp parseFrom(byte[] bArr) {
            return (SCSetUserInfoSettingRsp) PARSER.parseFrom(bArr);
        }

        public static SCSetUserInfoSettingRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoSettingRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSetUserInfoSettingRsp parseFrom(InputStream inputStream) {
            return (SCSetUserInfoSettingRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSetUserInfoSettingRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoSettingRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetUserInfoSettingRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSetUserInfoSettingRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSetUserInfoSettingRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoSettingRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetUserInfoSettingRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSetUserInfoSettingRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSetUserInfoSettingRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetUserInfoSettingRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSetUserInfoSettingRsp sCSetUserInfoSettingRsp) {
            return newBuilder().mergeFrom(sCSetUserInfoSettingRsp);
        }
    }

    public interface SCSystemFriendMsgOrBuilder extends MessageOrBuilder {
        FriendPushMsg getVMsgs(int i);

        int getVMsgsCount();

        List<FriendPushMsg> getVMsgsList();

        FriendPushMsgOrBuilder getVMsgsOrBuilder(int i);

        List<? extends FriendPushMsgOrBuilder> getVMsgsOrBuilderList();
    }

    public static final class SCSystemFriendMsg extends GeneratedMessage implements SCSystemFriendMsgOrBuilder {
        public static Parser<SCSystemFriendMsg> PARSER = null;
        public static final int VMSGS_FIELD_NUMBER = 1;
        private static final SCSystemFriendMsg defaultInstance = null;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<FriendPushMsg> vMsgs_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCSystemFriendMsg.1 */
        class C03411 extends AbstractParser<SCSystemFriendMsg> {
            static {
                fixHelper.fixfunc(new int[]{24449, 24450});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03411();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSystemFriendMsgOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<FriendPushMsg, Builder, FriendPushMsgOrBuilder> vMsgsBuilder_;
            private List<FriendPushMsg> vMsgs_;

            static {
                fixHelper.fixfunc(new int[]{8888, 8889, 8890, 8891, 8892, 8893, 8894, 8895, 8896, 8897, 8898, 8899, 8900, 8901, 8902, 8903, 8904, 8905, 8906, 8907, 8908, 8909, 8910, 8911, 8912, 8913, 8914, 8915, 8916, 8917, 8918, 8919, 8920, 8921, 8922, 8923, 8924, 8925, 8926, 8927, 8928, 8929, 8930, 8931, 8932, 8933, 8934, 8935, 8936, 8937, 8938, 8939});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVMsgsIsMutable();

            private native RepeatedFieldBuilder<FriendPushMsg, Builder, FriendPushMsgOrBuilder> getVMsgsFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVMsgs(Iterable<? extends FriendPushMsg> iterable);

            public final native Builder addVMsgs(int i, Builder builder);

            public final native Builder addVMsgs(int i, FriendPushMsg friendPushMsg);

            public final native Builder addVMsgs(Builder builder);

            public final native Builder addVMsgs(FriendPushMsg friendPushMsg);

            public final native Builder addVMsgsBuilder();

            public final native Builder addVMsgsBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8042build();

            public final native SCSystemFriendMsg m8043build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8044buildPartial();

            public final native SCSystemFriendMsg m8045buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8046clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8047clear();

            public final native Builder m8048clear();

            public final native Builder clearVMsgs();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8049clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8050clone();

            public final native Builder m8051clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8052getDefaultInstanceForType();

            public final native SCSystemFriendMsg m8053getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native FriendPushMsg getVMsgs(int i);

            public final native Builder getVMsgsBuilder(int i);

            public final native List<Builder> getVMsgsBuilderList();

            public final native int getVMsgsCount();

            public final native List<FriendPushMsg> getVMsgsList();

            public final native FriendPushMsgOrBuilder getVMsgsOrBuilder(int i);

            public final native List<? extends FriendPushMsgOrBuilder> getVMsgsOrBuilderList();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8054mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8055mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8056mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8057mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8058mergeFrom(Message message);

            public final native Builder mergeFrom(SCSystemFriendMsg sCSystemFriendMsg);

            public final native Builder removeVMsgs(int i);

            public final native Builder setVMsgs(int i, Builder builder);

            public final native Builder setVMsgs(int i, FriendPushMsg friendPushMsg);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aK;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{5073, 5074, 5075, 5076, 5077, 5078, 5079, 5080, 5081, 5082, 5083, 5084, 5085, 5086, 5087, 5088, 5089, 5090, 5091, 5092, 5093, 5094, 5095, 5096, 5097, 5098, 5099, 5100, 5101});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSystemFriendMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSystemFriendMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSystemFriendMsg sCSystemFriendMsg);

        private native SCSystemFriendMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSystemFriendMsg(com.google.protobuf.GeneratedMessage.Builder builder, SCSystemFriendMsg sCSystemFriendMsg);

        private native SCSystemFriendMsg(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8035getDefaultInstanceForType();

        public final native SCSystemFriendMsg m8036getDefaultInstanceForType();

        public final native Parser<SCSystemFriendMsg> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native FriendPushMsg getVMsgs(int i);

        public final native int getVMsgsCount();

        public final native List<FriendPushMsg> getVMsgsList();

        public final native FriendPushMsgOrBuilder getVMsgsOrBuilder(int i);

        public final native List<? extends FriendPushMsgOrBuilder> getVMsgsOrBuilderList();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8037newBuilderForType();

        public final native Builder m8038newBuilderForType();

        protected final native Builder m8039newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8040toBuilder();

        public final native Builder m8041toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSystemFriendMsg getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aK;
        }

        static void __clinit__() {
            PARSER = new C03411();
            SCSystemFriendMsg sCSystemFriendMsg = new SCSystemFriendMsg(true);
            defaultInstance = sCSystemFriendMsg;
            sCSystemFriendMsg.initFields();
        }

        public static SCSystemFriendMsg parseFrom(ByteString byteString) {
            return (SCSystemFriendMsg) PARSER.parseFrom(byteString);
        }

        public static SCSystemFriendMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSystemFriendMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSystemFriendMsg parseFrom(byte[] bArr) {
            return (SCSystemFriendMsg) PARSER.parseFrom(bArr);
        }

        public static SCSystemFriendMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSystemFriendMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSystemFriendMsg parseFrom(InputStream inputStream) {
            return (SCSystemFriendMsg) PARSER.parseFrom(inputStream);
        }

        public static SCSystemFriendMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSystemFriendMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSystemFriendMsg parseDelimitedFrom(InputStream inputStream) {
            return (SCSystemFriendMsg) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSystemFriendMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSystemFriendMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSystemFriendMsg parseFrom(CodedInputStream codedInputStream) {
            return (SCSystemFriendMsg) PARSER.parseFrom(codedInputStream);
        }

        public static SCSystemFriendMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSystemFriendMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSystemFriendMsg sCSystemFriendMsg) {
            return newBuilder().mergeFrom(sCSystemFriendMsg);
        }
    }

    public interface SCUploadFriendRelationRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        UPLOAD_FRIEND_RELATION_TYPE getEUploadType();

        UserFriendInfoNet getVFriendsInfo(int i);

        int getVFriendsInfoCount();

        List<UserFriendInfoNet> getVFriendsInfoList();

        UserFriendInfoNetOrBuilder getVFriendsInfoOrBuilder(int i);

        List<? extends UserFriendInfoNetOrBuilder> getVFriendsInfoOrBuilderList();

        boolean hasEErrCode();

        boolean hasEUploadType();
    }

    public static final class SCUploadFriendRelationRsp extends GeneratedMessage implements SCUploadFriendRelationRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int EUPLOADTYPE_FIELD_NUMBER = 2;
        public static Parser<SCUploadFriendRelationRsp> PARSER = null;
        public static final int VFRIENDSINFO_FIELD_NUMBER = 3;
        private static final SCUploadFriendRelationRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private UPLOAD_FRIEND_RELATION_TYPE eUploadType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<UserFriendInfoNet> vFriendsInfo_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCUploadFriendRelationRsp.1 */
        class C03421 extends AbstractParser<SCUploadFriendRelationRsp> {
            static {
                fixHelper.fixfunc(new int[]{9019, 9020});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03421();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCUploadFriendRelationRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private UPLOAD_FRIEND_RELATION_TYPE eUploadType_;
            private RepeatedFieldBuilder<UserFriendInfoNet, Builder, UserFriendInfoNetOrBuilder> vFriendsInfoBuilder_;
            private List<UserFriendInfoNet> vFriendsInfo_;

            static {
                fixHelper.fixfunc(new int[]{15932, 15933, 15934, 15935, 15936, 15937, 15938, 15939, 15940, 15941, 15942, 15943, 15944, 15945, 15946, 15947, 15948, 15949, 15950, 15951, 15952, 15953, 15954, 15955, 15956, 15957, 15958, 15959, 15960, 15961, 15962, 15963, 15964, 15965, 15966, 15967, 15968, 15969, 15970, 15971, 15972, 15973, 15974, 15975, 15976, 15977, 15978, 15979, 15980, 15981, 15982, 15983, 15984, 15985, 15986, 15987, 15988, 15989, 15990, 15991});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVFriendsInfoIsMutable();

            private native RepeatedFieldBuilder<UserFriendInfoNet, Builder, UserFriendInfoNetOrBuilder> getVFriendsInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVFriendsInfo(Iterable<? extends UserFriendInfoNet> iterable);

            public final native Builder addVFriendsInfo(int i, Builder builder);

            public final native Builder addVFriendsInfo(int i, UserFriendInfoNet userFriendInfoNet);

            public final native Builder addVFriendsInfo(Builder builder);

            public final native Builder addVFriendsInfo(UserFriendInfoNet userFriendInfoNet);

            public final native Builder addVFriendsInfoBuilder();

            public final native Builder addVFriendsInfoBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8066build();

            public final native SCUploadFriendRelationRsp m8067build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8068buildPartial();

            public final native SCUploadFriendRelationRsp m8069buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8070clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8071clear();

            public final native Builder m8072clear();

            public final native Builder clearEErrCode();

            public final native Builder clearEUploadType();

            public final native Builder clearVFriendsInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8073clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8074clone();

            public final native Builder m8075clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8076getDefaultInstanceForType();

            public final native SCUploadFriendRelationRsp m8077getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native UPLOAD_FRIEND_RELATION_TYPE getEUploadType();

            public final native UserFriendInfoNet getVFriendsInfo(int i);

            public final native Builder getVFriendsInfoBuilder(int i);

            public final native List<Builder> getVFriendsInfoBuilderList();

            public final native int getVFriendsInfoCount();

            public final native List<UserFriendInfoNet> getVFriendsInfoList();

            public final native UserFriendInfoNetOrBuilder getVFriendsInfoOrBuilder(int i);

            public final native List<? extends UserFriendInfoNetOrBuilder> getVFriendsInfoOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasEUploadType();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8078mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8079mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8080mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8081mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8082mergeFrom(Message message);

            public final native Builder mergeFrom(SCUploadFriendRelationRsp sCUploadFriendRelationRsp);

            public final native Builder removeVFriendsInfo(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setEUploadType(UPLOAD_FRIEND_RELATION_TYPE upload_friend_relation_type);

            public final native Builder setVFriendsInfo(int i, Builder builder);

            public final native Builder setVFriendsInfo(int i, UserFriendInfoNet userFriendInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aq;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{TEXAS_CMD.Cmd_SCGetClubByClubIDRsp_VALUE, TEXAS_CMD.Cmd_SCGetFundBillInfosRsp_VALUE, TEXAS_CMD.Cmd_SCUploadSGScoreRsp_VALUE, TEXAS_CMD.Cmd_SCDeleteClubCoverRsp_VALUE, TEXAS_CMD.Cmd_SCGetClubInfoByUuidRsp_VALUE, TEXAS_CMD.Cmd_SCUploadUserCoverRsp_VALUE, TEXAS_CMD.Cmd_SCDeleteUserCoverRsp_VALUE, TEXAS_CMD.Cmd_SCGetChatRoomUsersByRoomIDRsp_VALUE, TEXAS_CMD.Cmd_SCGetChatRoomGamesByRoomIDRsp_VALUE, TEXAS_CMD.Cmd_SCGetClubUsersByClubIDRsp_VALUE, TEXAS_CMD.Cmd_SCGetClubGamesByClubIDRsp_VALUE, TEXAS_CMD.Cmd_SCGetClubBaseInfoByClubIDRsp_VALUE, TEXAS_CMD.Cmd_SCGetFrontPageInfoV2Rsp_VALUE, TEXAS_CMD.Cmd_SCGetRecommendClubsRsp_VALUE, TEXAS_CMD.Cmd_SCUseDelayItemRsp_VALUE, TEXAS_CMD.Cmd_SCGetAllBannerInfoRsp_VALUE, TEXAS_CMD.Cmd_SCSetBannerInfoRsp_VALUE, TEXAS_CMD.Cmd_SCGetAllRecommendUserInfoRsp_VALUE, TEXAS_CMD.Cmd_SCSetRecommendUserRsp_VALUE, TEXAS_CMD.Cmd_SCSearchUserRsp_VALUE, TEXAS_CMD.Cmd_SCShowCardRsp_VALUE, TEXAS_CMD.Cmd_SCGameActionV3Rsp_VALUE, TEXAS_CMD.Cmd_SCCreateQuickGameRoomRsp_VALUE, TEXAS_CMD.Cmd_SCEnterQuickGameRoomRsp_VALUE, TEXAS_CMD.Cmd_SCStandUpV3Rsp_VALUE, TEXAS_CMD.Cmd_SCStartQuickRoomGameRsp_VALUE, TEXAS_CMD.Cmd_SCGetQuickGameRoomRsp_VALUE, TEXAS_CMD.Cmd_SCGiveMoneyRsp_VALUE, TEXAS_CMD.Cmd_CSGiveMoneyPushMsgRsp_VALUE, TEXAS_CMD.Cmd_SCQuitQuickGameRoomRsp_VALUE, TEXAS_CMD.Cmd_CSSystemQuickGameRoomMsgRsp_VALUE, TEXAS_CMD.Cmd_SCGetFrontPageInfoV3Rsp_VALUE, TEXAS_CMD.Cmd_SCGetBannerInfosRsp_VALUE});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCUploadFriendRelationRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCUploadFriendRelationRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCUploadFriendRelationRsp sCUploadFriendRelationRsp);

        private native SCUploadFriendRelationRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCUploadFriendRelationRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCUploadFriendRelationRsp sCUploadFriendRelationRsp);

        private native SCUploadFriendRelationRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8059getDefaultInstanceForType();

        public final native SCUploadFriendRelationRsp m8060getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native UPLOAD_FRIEND_RELATION_TYPE getEUploadType();

        public final native Parser<SCUploadFriendRelationRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native UserFriendInfoNet getVFriendsInfo(int i);

        public final native int getVFriendsInfoCount();

        public final native List<UserFriendInfoNet> getVFriendsInfoList();

        public final native UserFriendInfoNetOrBuilder getVFriendsInfoOrBuilder(int i);

        public final native List<? extends UserFriendInfoNetOrBuilder> getVFriendsInfoOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasEUploadType();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8061newBuilderForType();

        public final native Builder m8062newBuilderForType();

        protected final native Builder m8063newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8064toBuilder();

        public final native Builder m8065toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCUploadFriendRelationRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aq;
        }

        static void __clinit__() {
            PARSER = new C03421();
            SCUploadFriendRelationRsp sCUploadFriendRelationRsp = new SCUploadFriendRelationRsp(true);
            defaultInstance = sCUploadFriendRelationRsp;
            sCUploadFriendRelationRsp.initFields();
        }

        public static SCUploadFriendRelationRsp parseFrom(ByteString byteString) {
            return (SCUploadFriendRelationRsp) PARSER.parseFrom(byteString);
        }

        public static SCUploadFriendRelationRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadFriendRelationRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCUploadFriendRelationRsp parseFrom(byte[] bArr) {
            return (SCUploadFriendRelationRsp) PARSER.parseFrom(bArr);
        }

        public static SCUploadFriendRelationRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadFriendRelationRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCUploadFriendRelationRsp parseFrom(InputStream inputStream) {
            return (SCUploadFriendRelationRsp) PARSER.parseFrom(inputStream);
        }

        public static SCUploadFriendRelationRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadFriendRelationRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadFriendRelationRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCUploadFriendRelationRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCUploadFriendRelationRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadFriendRelationRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadFriendRelationRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCUploadFriendRelationRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCUploadFriendRelationRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadFriendRelationRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCUploadFriendRelationRsp sCUploadFriendRelationRsp) {
            return newBuilder().mergeFrom(sCUploadFriendRelationRsp);
        }
    }

    public interface SCUploadIconRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        String getSIconUrl();

        ByteString getSIconUrlBytes();

        String getSSmallIconUrl();

        ByteString getSSmallIconUrlBytes();

        boolean hasEErrCode();

        boolean hasSIconUrl();

        boolean hasSSmallIconUrl();
    }

    public static final class SCUploadIconRsp extends GeneratedMessage implements SCUploadIconRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCUploadIconRsp> PARSER = null;
        public static final int SICONURL_FIELD_NUMBER = 2;
        public static final int SSMALLICONURL_FIELD_NUMBER = 3;
        private static final SCUploadIconRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sIconUrl_;
        private Object sSmallIconUrl_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCUploadIconRsp.1 */
        class C03431 extends AbstractParser<SCUploadIconRsp> {
            static {
                fixHelper.fixfunc(new int[]{18742, 18743});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03431();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCUploadIconRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private Object sIconUrl_;
            private Object sSmallIconUrl_;

            static {
                fixHelper.fixfunc(new int[]{10279, 10280, 10281, 10282, 10283, 10284, 10285, 10286, 10287, 10288, 10289, 10290, 10291, 10292, 10293, 10294, 10295, 10296, 10297, 10298, 10299, 10300, 10301, 10302, 10303, 10304, 10305, 10306, 10307, 10308, 10309, 10310, 10311, 10312, 10313, 10314, 10315, 10316, 10317, 10318, 10319, 10320, 10321, 10322, 10323, 10324, 10325, 10326});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8090build();

            public final native SCUploadIconRsp m8091build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8092buildPartial();

            public final native SCUploadIconRsp m8093buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8094clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8095clear();

            public final native Builder m8096clear();

            public final native Builder clearEErrCode();

            public final native Builder clearSIconUrl();

            public final native Builder clearSSmallIconUrl();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8097clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8098clone();

            public final native Builder m8099clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8100getDefaultInstanceForType();

            public final native SCUploadIconRsp m8101getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native String getSIconUrl();

            public final native ByteString getSIconUrlBytes();

            public final native String getSSmallIconUrl();

            public final native ByteString getSSmallIconUrlBytes();

            public final native boolean hasEErrCode();

            public final native boolean hasSIconUrl();

            public final native boolean hasSSmallIconUrl();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8102mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8103mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8104mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8105mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8106mergeFrom(Message message);

            public final native Builder mergeFrom(SCUploadIconRsp sCUploadIconRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setSIconUrl(String str);

            public final native Builder setSIconUrlBytes(ByteString byteString);

            public final native Builder setSSmallIconUrl(String str);

            public final native Builder setSSmallIconUrlBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.aa;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{12760, 12761, 12762, 12763, 12764, 12765, 12766, 12767, 12768, 12769, 12770, 12771, 12772, 12773, 12774, 12775, 12776, 12777, 12778, 12779, 12780, 12781, 12782, 12783, 12784, 12785, 12786, 12787, 12788, 12789, 12790, 12791});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCUploadIconRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCUploadIconRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCUploadIconRsp sCUploadIconRsp);

        private native SCUploadIconRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCUploadIconRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCUploadIconRsp sCUploadIconRsp);

        private native SCUploadIconRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8083getDefaultInstanceForType();

        public final native SCUploadIconRsp m8084getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCUploadIconRsp> getParserForType();

        public final native String getSIconUrl();

        public final native ByteString getSIconUrlBytes();

        public final native String getSSmallIconUrl();

        public final native ByteString getSSmallIconUrlBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasSIconUrl();

        public final native boolean hasSSmallIconUrl();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8085newBuilderForType();

        public final native Builder m8086newBuilderForType();

        protected final native Builder m8087newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8088toBuilder();

        public final native Builder m8089toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCUploadIconRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.aa;
        }

        static void __clinit__() {
            PARSER = new C03431();
            SCUploadIconRsp sCUploadIconRsp = new SCUploadIconRsp(true);
            defaultInstance = sCUploadIconRsp;
            sCUploadIconRsp.initFields();
        }

        public static SCUploadIconRsp parseFrom(ByteString byteString) {
            return (SCUploadIconRsp) PARSER.parseFrom(byteString);
        }

        public static SCUploadIconRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadIconRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCUploadIconRsp parseFrom(byte[] bArr) {
            return (SCUploadIconRsp) PARSER.parseFrom(bArr);
        }

        public static SCUploadIconRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadIconRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCUploadIconRsp parseFrom(InputStream inputStream) {
            return (SCUploadIconRsp) PARSER.parseFrom(inputStream);
        }

        public static SCUploadIconRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadIconRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadIconRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCUploadIconRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCUploadIconRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadIconRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadIconRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCUploadIconRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCUploadIconRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadIconRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCUploadIconRsp sCUploadIconRsp) {
            return newBuilder().mergeFrom(sCUploadIconRsp);
        }
    }

    public interface SCUploadSGScoreRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLMsg();

        long getLPopularity();

        boolean hasEErrCode();

        boolean hasLMsg();

        boolean hasLPopularity();
    }

    public static final class SCUploadSGScoreRsp extends GeneratedMessage implements SCUploadSGScoreRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LMSG_FIELD_NUMBER = 3;
        public static final int LPOPULARITY_FIELD_NUMBER = 2;
        public static Parser<SCUploadSGScoreRsp> PARSER;
        private static final SCUploadSGScoreRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lMsg_;
        private long lPopularity_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCUploadSGScoreRsp.1 */
        class C03441 extends AbstractParser<SCUploadSGScoreRsp> {
            static {
                fixHelper.fixfunc(new int[]{12183, 12184});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03441();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCUploadSGScoreRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lMsg_;
            private long lPopularity_;

            static {
                fixHelper.fixfunc(new int[]{13151, 13152, 13153, 13154, 13155, 13156, 13157, 13158, 13159, 13160, 13161, 13162, 13163, 13164, 13165, 13166, 13167, 13168, 13169, 13170, 13171, 13172, 13173, 13174, 13175, 13176, 13177, 13178, 13179, 13180, 13181, 13182, 13183, 13184, 13185, 13186, 13187, 13188, 13189, 13190, 13191, 13192, 13193, 13194});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8114build();

            public final native SCUploadSGScoreRsp m8115build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8116buildPartial();

            public final native SCUploadSGScoreRsp m8117buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8118clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8119clear();

            public final native Builder m8120clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLMsg();

            public final native Builder clearLPopularity();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8121clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8122clone();

            public final native Builder m8123clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8124getDefaultInstanceForType();

            public final native SCUploadSGScoreRsp m8125getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLMsg();

            public final native long getLPopularity();

            public final native boolean hasEErrCode();

            public final native boolean hasLMsg();

            public final native boolean hasLPopularity();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8126mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8127mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8128mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8129mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8130mergeFrom(Message message);

            public final native Builder mergeFrom(SCUploadSGScoreRsp sCUploadSGScoreRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLMsg(long j);

            public final native Builder setLPopularity(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f298c;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{18708, 18709, 18710, 18711, 18712, 18713, 18714, 18715, 18716, 18717, 18718, 18719, 18720, 18721, 18722, 18723, 18724, 18725, 18726, 18727, 18728, 18729, 18730, 18731, 18732, 18733, 18734, 18735, 18736, 18737});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCUploadSGScoreRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCUploadSGScoreRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCUploadSGScoreRsp sCUploadSGScoreRsp);

        private native SCUploadSGScoreRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCUploadSGScoreRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCUploadSGScoreRsp sCUploadSGScoreRsp);

        private native SCUploadSGScoreRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8107getDefaultInstanceForType();

        public final native SCUploadSGScoreRsp m8108getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLMsg();

        public final native long getLPopularity();

        public final native Parser<SCUploadSGScoreRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLMsg();

        public final native boolean hasLPopularity();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8109newBuilderForType();

        public final native Builder m8110newBuilderForType();

        protected final native Builder m8111newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8112toBuilder();

        public final native Builder m8113toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCUploadSGScoreRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f298c;
        }

        static void __clinit__() {
            PARSER = new C03441();
            SCUploadSGScoreRsp sCUploadSGScoreRsp = new SCUploadSGScoreRsp(true);
            defaultInstance = sCUploadSGScoreRsp;
            sCUploadSGScoreRsp.initFields();
        }

        public static SCUploadSGScoreRsp parseFrom(ByteString byteString) {
            return (SCUploadSGScoreRsp) PARSER.parseFrom(byteString);
        }

        public static SCUploadSGScoreRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadSGScoreRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCUploadSGScoreRsp parseFrom(byte[] bArr) {
            return (SCUploadSGScoreRsp) PARSER.parseFrom(bArr);
        }

        public static SCUploadSGScoreRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadSGScoreRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCUploadSGScoreRsp parseFrom(InputStream inputStream) {
            return (SCUploadSGScoreRsp) PARSER.parseFrom(inputStream);
        }

        public static SCUploadSGScoreRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadSGScoreRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadSGScoreRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCUploadSGScoreRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCUploadSGScoreRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadSGScoreRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadSGScoreRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCUploadSGScoreRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCUploadSGScoreRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadSGScoreRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCUploadSGScoreRsp sCUploadSGScoreRsp) {
            return newBuilder().mergeFrom(sCUploadSGScoreRsp);
        }
    }

    public interface SCUploadUserCoverRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        String getSBigAlbums(int i);

        ByteString getSBigAlbumsBytes(int i);

        int getSBigAlbumsCount();

        ProtocolStringList getSBigAlbumsList();

        String getSSmallAlbums(int i);

        ByteString getSSmallAlbumsBytes(int i);

        int getSSmallAlbumsCount();

        ProtocolStringList getSSmallAlbumsList();

        boolean hasEErrCode();
    }

    public static final class SCUploadUserCoverRsp extends GeneratedMessage implements SCUploadUserCoverRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCUploadUserCoverRsp> PARSER = null;
        public static final int SBIGALBUMS_FIELD_NUMBER = 3;
        public static final int SSMALLALBUMS_FIELD_NUMBER = 2;
        private static final SCUploadUserCoverRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LazyStringList sBigAlbums_;
        private LazyStringList sSmallAlbums_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SCUploadUserCoverRsp.1 */
        class C03451 extends AbstractParser<SCUploadUserCoverRsp> {
            static {
                fixHelper.fixfunc(new int[]{29078, 29079});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03451();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCUploadUserCoverRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private LazyStringList sBigAlbums_;
            private LazyStringList sSmallAlbums_;

            static {
                fixHelper.fixfunc(new int[]{20021, 20022, 20023, 20024, 20025, 20026, 20027, 20028, 20029, 20030, 20031, 20032, 20033, 20034, 20035, 20036, 20037, 20038, 20039, 20040, 20041, 20042, 20043, 20044, 20045, 20046, 20047, 20048, 20049, 20050, 20051, 20052, 20053, 20054, 20055, 20056, 20057, 20058, 20059, 20060, 20061, 20062, 20063, 20064, 20065, 20066, 20067, 20068, 20069, 20070, 20071, 20072, 20073, 20074, 20075, 20076});
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

            public final native /* bridge */ /* synthetic */ MessageLite m8138build();

            public final native SCUploadUserCoverRsp m8139build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8140buildPartial();

            public final native SCUploadUserCoverRsp m8141buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8142clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8143clear();

            public final native Builder m8144clear();

            public final native Builder clearEErrCode();

            public final native Builder clearSBigAlbums();

            public final native Builder clearSSmallAlbums();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8145clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8146clone();

            public final native Builder m8147clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8148getDefaultInstanceForType();

            public final native SCUploadUserCoverRsp m8149getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native String getSBigAlbums(int i);

            public final native ByteString getSBigAlbumsBytes(int i);

            public final native int getSBigAlbumsCount();

            public final native ProtocolStringList getSBigAlbumsList();

            public final native String getSSmallAlbums(int i);

            public final native ByteString getSSmallAlbumsBytes(int i);

            public final native int getSSmallAlbumsCount();

            public final native ProtocolStringList getSSmallAlbumsList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8150mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8151mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8152mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8153mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8154mergeFrom(Message message);

            public final native Builder mergeFrom(SCUploadUserCoverRsp sCUploadUserCoverRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setSBigAlbums(int i, String str);

            public final native Builder setSSmallAlbums(int i, String str);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.ae;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{15237, 15238, 15239, 15240, 15241, 15242, 15243, 15244, 15245, 15246, 15247, 15248, 15249, 15250, 15251, 15252, 15253, 15254, 15255, 15256, 15257, 15258, 15259, 15260, 15261, 15262, 15263, 15264, 15265, 15266, 15267, 15268, 15269, 15270});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCUploadUserCoverRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCUploadUserCoverRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCUploadUserCoverRsp sCUploadUserCoverRsp);

        private native SCUploadUserCoverRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCUploadUserCoverRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCUploadUserCoverRsp sCUploadUserCoverRsp);

        private native SCUploadUserCoverRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8131getDefaultInstanceForType();

        public final native SCUploadUserCoverRsp m8132getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCUploadUserCoverRsp> getParserForType();

        public final native String getSBigAlbums(int i);

        public final native ByteString getSBigAlbumsBytes(int i);

        public final native int getSBigAlbumsCount();

        public final native ProtocolStringList getSBigAlbumsList();

        public final native String getSSmallAlbums(int i);

        public final native ByteString getSSmallAlbumsBytes(int i);

        public final native int getSSmallAlbumsCount();

        public final native ProtocolStringList getSSmallAlbumsList();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8133newBuilderForType();

        public final native Builder m8134newBuilderForType();

        protected final native Builder m8135newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8136toBuilder();

        public final native Builder m8137toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCUploadUserCoverRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.ae;
        }

        static void __clinit__() {
            PARSER = new C03451();
            SCUploadUserCoverRsp sCUploadUserCoverRsp = new SCUploadUserCoverRsp(true);
            defaultInstance = sCUploadUserCoverRsp;
            sCUploadUserCoverRsp.initFields();
        }

        public static SCUploadUserCoverRsp parseFrom(ByteString byteString) {
            return (SCUploadUserCoverRsp) PARSER.parseFrom(byteString);
        }

        public static SCUploadUserCoverRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadUserCoverRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCUploadUserCoverRsp parseFrom(byte[] bArr) {
            return (SCUploadUserCoverRsp) PARSER.parseFrom(bArr);
        }

        public static SCUploadUserCoverRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadUserCoverRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCUploadUserCoverRsp parseFrom(InputStream inputStream) {
            return (SCUploadUserCoverRsp) PARSER.parseFrom(inputStream);
        }

        public static SCUploadUserCoverRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadUserCoverRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadUserCoverRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCUploadUserCoverRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCUploadUserCoverRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadUserCoverRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCUploadUserCoverRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCUploadUserCoverRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCUploadUserCoverRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUploadUserCoverRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCUploadUserCoverRsp sCUploadUserCoverRsp) {
            return newBuilder().mergeFrom(sCUploadUserCoverRsp);
        }
    }

    public enum SEARCH_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int ALL_SEARCH_TYPE_VALUE = 3;
        public static final int NICKNAME_SEARCH_TYPE_VALUE = 1;
        public static final int UUID_SEARCH_TYPE_VALUE = 2;
        private static final SEARCH_TYPE[] VALUES = null;
        private static EnumLiteMap<SEARCH_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.SEARCH_TYPE.1 */
        class C03461 implements EnumLiteMap<SEARCH_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{28850, 28851});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03461();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{7832, 7833, 7834, 7835});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SEARCH_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            NICKNAME_SEARCH_TYPE = new SEARCH_TYPE("NICKNAME_SEARCH_TYPE", 0, 0, NICKNAME_SEARCH_TYPE_VALUE);
            UUID_SEARCH_TYPE = new SEARCH_TYPE("UUID_SEARCH_TYPE", NICKNAME_SEARCH_TYPE_VALUE, NICKNAME_SEARCH_TYPE_VALUE, UUID_SEARCH_TYPE_VALUE);
            ALL_SEARCH_TYPE = new SEARCH_TYPE("ALL_SEARCH_TYPE", UUID_SEARCH_TYPE_VALUE, UUID_SEARCH_TYPE_VALUE, ALL_SEARCH_TYPE_VALUE);
            SEARCH_TYPE[] search_typeArr = new SEARCH_TYPE[ALL_SEARCH_TYPE_VALUE];
            search_typeArr[0] = NICKNAME_SEARCH_TYPE;
            search_typeArr[NICKNAME_SEARCH_TYPE_VALUE] = UUID_SEARCH_TYPE;
            search_typeArr[UUID_SEARCH_TYPE_VALUE] = ALL_SEARCH_TYPE;
            ENUM$VALUES = search_typeArr;
            internalValueMap = new C03461();
            VALUES = values();
        }

        public static SEARCH_TYPE valueOf(int i) {
            switch (i) {
                case NICKNAME_SEARCH_TYPE_VALUE:
                    return NICKNAME_SEARCH_TYPE;
                case UUID_SEARCH_TYPE_VALUE:
                    return UUID_SEARCH_TYPE;
                case ALL_SEARCH_TYPE_VALUE:
                    return ALL_SEARCH_TYPE;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<SEARCH_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpUser.m303a().getEnumTypes().get(0);
        }

        public static SEARCH_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum UPLOAD_ACTION_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int UPLOAD_ACTION_TYPE_ADD_VALUE = 1;
        public static final int UPLOAD_ACTION_TYPE_DELETE_VALUE = 2;
        private static final UPLOAD_ACTION_TYPE[] VALUES = null;
        private static EnumLiteMap<UPLOAD_ACTION_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.UPLOAD_ACTION_TYPE.1 */
        class C03471 implements EnumLiteMap<UPLOAD_ACTION_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{11097, 11098});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03471();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{17926, 17927, 17928, 17929});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UPLOAD_ACTION_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            UPLOAD_ACTION_TYPE_ADD = new UPLOAD_ACTION_TYPE("UPLOAD_ACTION_TYPE_ADD", 0, 0, UPLOAD_ACTION_TYPE_ADD_VALUE);
            UPLOAD_ACTION_TYPE_DELETE = new UPLOAD_ACTION_TYPE("UPLOAD_ACTION_TYPE_DELETE", UPLOAD_ACTION_TYPE_ADD_VALUE, UPLOAD_ACTION_TYPE_ADD_VALUE, UPLOAD_ACTION_TYPE_DELETE_VALUE);
            UPLOAD_ACTION_TYPE[] upload_action_typeArr = new UPLOAD_ACTION_TYPE[UPLOAD_ACTION_TYPE_DELETE_VALUE];
            upload_action_typeArr[0] = UPLOAD_ACTION_TYPE_ADD;
            upload_action_typeArr[UPLOAD_ACTION_TYPE_ADD_VALUE] = UPLOAD_ACTION_TYPE_DELETE;
            ENUM$VALUES = upload_action_typeArr;
            internalValueMap = new C03471();
            VALUES = values();
        }

        public static UPLOAD_ACTION_TYPE valueOf(int i) {
            switch (i) {
                case UPLOAD_ACTION_TYPE_ADD_VALUE:
                    return UPLOAD_ACTION_TYPE_ADD;
                case UPLOAD_ACTION_TYPE_DELETE_VALUE:
                    return UPLOAD_ACTION_TYPE_DELETE;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<UPLOAD_ACTION_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpUser.m303a().getEnumTypes().get(4);
        }

        public static UPLOAD_ACTION_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum UPLOAD_FRIEND_RELATION_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int UPLOAD_FRIEND_RELATION_FACEBOOK_VALUE = 3;
        public static final int UPLOAD_FRIEND_RELATION_PHONE_VALUE = 2;
        public static final int UPLOAD_FRIEND_RELATION_SINA_VALUE = 1;
        private static final UPLOAD_FRIEND_RELATION_TYPE[] VALUES = null;
        private static EnumLiteMap<UPLOAD_FRIEND_RELATION_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.UPLOAD_FRIEND_RELATION_TYPE.1 */
        class C03481 implements EnumLiteMap<UPLOAD_FRIEND_RELATION_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{31460, 31461});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03481();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{18958, 18959, 18960, 18961});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UPLOAD_FRIEND_RELATION_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            UPLOAD_FRIEND_RELATION_SINA = new UPLOAD_FRIEND_RELATION_TYPE("UPLOAD_FRIEND_RELATION_SINA", 0, 0, UPLOAD_FRIEND_RELATION_SINA_VALUE);
            UPLOAD_FRIEND_RELATION_PHONE = new UPLOAD_FRIEND_RELATION_TYPE("UPLOAD_FRIEND_RELATION_PHONE", UPLOAD_FRIEND_RELATION_SINA_VALUE, UPLOAD_FRIEND_RELATION_SINA_VALUE, UPLOAD_FRIEND_RELATION_PHONE_VALUE);
            UPLOAD_FRIEND_RELATION_FACEBOOK = new UPLOAD_FRIEND_RELATION_TYPE("UPLOAD_FRIEND_RELATION_FACEBOOK", UPLOAD_FRIEND_RELATION_PHONE_VALUE, UPLOAD_FRIEND_RELATION_PHONE_VALUE, UPLOAD_FRIEND_RELATION_FACEBOOK_VALUE);
            UPLOAD_FRIEND_RELATION_TYPE[] upload_friend_relation_typeArr = new UPLOAD_FRIEND_RELATION_TYPE[UPLOAD_FRIEND_RELATION_FACEBOOK_VALUE];
            upload_friend_relation_typeArr[0] = UPLOAD_FRIEND_RELATION_SINA;
            upload_friend_relation_typeArr[UPLOAD_FRIEND_RELATION_SINA_VALUE] = UPLOAD_FRIEND_RELATION_PHONE;
            upload_friend_relation_typeArr[UPLOAD_FRIEND_RELATION_PHONE_VALUE] = UPLOAD_FRIEND_RELATION_FACEBOOK;
            ENUM$VALUES = upload_friend_relation_typeArr;
            internalValueMap = new C03481();
            VALUES = values();
        }

        public static UPLOAD_FRIEND_RELATION_TYPE valueOf(int i) {
            switch (i) {
                case UPLOAD_FRIEND_RELATION_SINA_VALUE:
                    return UPLOAD_FRIEND_RELATION_SINA;
                case UPLOAD_FRIEND_RELATION_PHONE_VALUE:
                    return UPLOAD_FRIEND_RELATION_PHONE;
                case UPLOAD_FRIEND_RELATION_FACEBOOK_VALUE:
                    return UPLOAD_FRIEND_RELATION_FACEBOOK;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<UPLOAD_FRIEND_RELATION_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpUser.m303a().getEnumTypes().get(UPLOAD_FRIEND_RELATION_SINA_VALUE);
        }

        public static UPLOAD_FRIEND_RELATION_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum USER_FRIEND_STATE implements ProtocolMessageEnum {
        ;
        
        public static final int USER_FRIEND_STATE_ALL_VALUE = 6;
        public static final int USER_FRIEND_STATE_FRIEND_VALUE = 3;
        public static final int USER_FRIEND_STATE_INVITED_VALUE = 4;
        public static final int USER_FRIEND_STATE_INVITING_VALUE = 5;
        public static final int USER_FRIEND_STATE_NOT_FRIEND_VALUE = 1;
        public static final int USER_FRIEND_STATE_NOT_USER_VALUE = 0;
        public static final int USER_FRIEND_STATE_RECOMMAND_VALUE = 2;
        private static final USER_FRIEND_STATE[] VALUES = null;
        private static EnumLiteMap<USER_FRIEND_STATE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.USER_FRIEND_STATE.1 */
        class C03491 implements EnumLiteMap<USER_FRIEND_STATE> {
            static {
                fixHelper.fixfunc(new int[]{17688, 17689});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03491();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{6642, 6643, 6644, 6645});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native USER_FRIEND_STATE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            USER_FRIEND_STATE_NOT_USER = new USER_FRIEND_STATE("USER_FRIEND_STATE_NOT_USER", USER_FRIEND_STATE_NOT_USER_VALUE, USER_FRIEND_STATE_NOT_USER_VALUE, USER_FRIEND_STATE_NOT_USER_VALUE);
            USER_FRIEND_STATE_NOT_FRIEND = new USER_FRIEND_STATE("USER_FRIEND_STATE_NOT_FRIEND", USER_FRIEND_STATE_NOT_FRIEND_VALUE, USER_FRIEND_STATE_NOT_FRIEND_VALUE, USER_FRIEND_STATE_NOT_FRIEND_VALUE);
            USER_FRIEND_STATE_RECOMMAND = new USER_FRIEND_STATE("USER_FRIEND_STATE_RECOMMAND", USER_FRIEND_STATE_RECOMMAND_VALUE, USER_FRIEND_STATE_RECOMMAND_VALUE, USER_FRIEND_STATE_RECOMMAND_VALUE);
            USER_FRIEND_STATE_FRIEND = new USER_FRIEND_STATE("USER_FRIEND_STATE_FRIEND", USER_FRIEND_STATE_FRIEND_VALUE, USER_FRIEND_STATE_FRIEND_VALUE, USER_FRIEND_STATE_FRIEND_VALUE);
            USER_FRIEND_STATE_INVITED = new USER_FRIEND_STATE("USER_FRIEND_STATE_INVITED", USER_FRIEND_STATE_INVITED_VALUE, USER_FRIEND_STATE_INVITED_VALUE, USER_FRIEND_STATE_INVITED_VALUE);
            USER_FRIEND_STATE_INVITING = new USER_FRIEND_STATE("USER_FRIEND_STATE_INVITING", USER_FRIEND_STATE_INVITING_VALUE, USER_FRIEND_STATE_INVITING_VALUE, USER_FRIEND_STATE_INVITING_VALUE);
            USER_FRIEND_STATE_ALL = new USER_FRIEND_STATE("USER_FRIEND_STATE_ALL", USER_FRIEND_STATE_ALL_VALUE, USER_FRIEND_STATE_ALL_VALUE, USER_FRIEND_STATE_ALL_VALUE);
            ENUM$VALUES = new USER_FRIEND_STATE[]{USER_FRIEND_STATE_NOT_USER, USER_FRIEND_STATE_NOT_FRIEND, USER_FRIEND_STATE_RECOMMAND, USER_FRIEND_STATE_FRIEND, USER_FRIEND_STATE_INVITED, USER_FRIEND_STATE_INVITING, USER_FRIEND_STATE_ALL};
            internalValueMap = new C03491();
            VALUES = values();
        }

        public static USER_FRIEND_STATE valueOf(int i) {
            switch (i) {
                case USER_FRIEND_STATE_NOT_USER_VALUE:
                    return USER_FRIEND_STATE_NOT_USER;
                case USER_FRIEND_STATE_NOT_FRIEND_VALUE:
                    return USER_FRIEND_STATE_NOT_FRIEND;
                case USER_FRIEND_STATE_RECOMMAND_VALUE:
                    return USER_FRIEND_STATE_RECOMMAND;
                case USER_FRIEND_STATE_FRIEND_VALUE:
                    return USER_FRIEND_STATE_FRIEND;
                case USER_FRIEND_STATE_INVITED_VALUE:
                    return USER_FRIEND_STATE_INVITED;
                case USER_FRIEND_STATE_INVITING_VALUE:
                    return USER_FRIEND_STATE_INVITING;
                case USER_FRIEND_STATE_ALL_VALUE:
                    return USER_FRIEND_STATE_ALL;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<USER_FRIEND_STATE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpUser.m303a().getEnumTypes().get(USER_FRIEND_STATE_FRIEND_VALUE);
        }

        public static USER_FRIEND_STATE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum USER_STATE implements ProtocolMessageEnum {
        ;
        
        public static final int USER_STATE_GAMING_VALUE = 3;
        public static final int USER_STATE_OFFLINE_VALUE = 1;
        public static final int USER_STATE_ONLINE_VALUE = 2;
        public static final int USER_STATE_ROOM_VALUE = 4;
        private static final USER_STATE[] VALUES = null;
        private static EnumLiteMap<USER_STATE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.USER_STATE.1 */
        class C03501 implements EnumLiteMap<USER_STATE> {
            static {
                fixHelper.fixfunc(new int[]{25290, 25291});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03501();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{5616, 5617, 5618, 5619});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native USER_STATE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            USER_STATE_OFFLINE = new USER_STATE("USER_STATE_OFFLINE", 0, 0, USER_STATE_OFFLINE_VALUE);
            USER_STATE_ONLINE = new USER_STATE("USER_STATE_ONLINE", USER_STATE_OFFLINE_VALUE, USER_STATE_OFFLINE_VALUE, USER_STATE_ONLINE_VALUE);
            USER_STATE_GAMING = new USER_STATE("USER_STATE_GAMING", USER_STATE_ONLINE_VALUE, USER_STATE_ONLINE_VALUE, USER_STATE_GAMING_VALUE);
            USER_STATE_ROOM = new USER_STATE("USER_STATE_ROOM", USER_STATE_GAMING_VALUE, USER_STATE_GAMING_VALUE, USER_STATE_ROOM_VALUE);
            USER_STATE[] user_stateArr = new USER_STATE[USER_STATE_ROOM_VALUE];
            user_stateArr[0] = USER_STATE_OFFLINE;
            user_stateArr[USER_STATE_OFFLINE_VALUE] = USER_STATE_ONLINE;
            user_stateArr[USER_STATE_ONLINE_VALUE] = USER_STATE_GAMING;
            user_stateArr[USER_STATE_GAMING_VALUE] = USER_STATE_ROOM;
            ENUM$VALUES = user_stateArr;
            internalValueMap = new C03501();
            VALUES = values();
        }

        public static USER_STATE valueOf(int i) {
            switch (i) {
                case USER_STATE_OFFLINE_VALUE:
                    return USER_STATE_OFFLINE;
                case USER_STATE_ONLINE_VALUE:
                    return USER_STATE_ONLINE;
                case USER_STATE_GAMING_VALUE:
                    return USER_STATE_GAMING;
                case USER_STATE_ROOM_VALUE:
                    return USER_STATE_ROOM;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<USER_STATE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpUser.m303a().getEnumTypes().get(5);
        }

        public static USER_STATE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface UploadUserInfoNetOrBuilder extends MessageOrBuilder {
        ID_TYPE getEType();

        UPLOAD_ACTION_TYPE getEUploadActionType();

        int getIGender();

        String getSIcon();

        ByteString getSIconBytes();

        String getSNickname();

        ByteString getSNicknameBytes();

        String getSPhonenumber();

        ByteString getSPhonenumberBytes();

        String getStrIDMD5();

        ByteString getStrIDMD5Bytes();

        boolean hasEType();

        boolean hasEUploadActionType();

        boolean hasIGender();

        boolean hasSIcon();

        boolean hasSNickname();

        boolean hasSPhonenumber();

        boolean hasStrIDMD5();
    }

    public static final class UploadUserInfoNet extends GeneratedMessage implements UploadUserInfoNetOrBuilder {
        public static final int ETYPE_FIELD_NUMBER = 2;
        public static final int EUPLOADACTIONTYPE_FIELD_NUMBER = 3;
        public static final int IGENDER_FIELD_NUMBER = 6;
        public static Parser<UploadUserInfoNet> PARSER = null;
        public static final int SICON_FIELD_NUMBER = 5;
        public static final int SNICKNAME_FIELD_NUMBER = 4;
        public static final int SPHONENUMBER_FIELD_NUMBER = 7;
        public static final int STRIDMD5_FIELD_NUMBER = 1;
        private static final UploadUserInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ID_TYPE eType_;
        private UPLOAD_ACTION_TYPE eUploadActionType_;
        private int iGender_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sIcon_;
        private Object sNickname_;
        private Object sPhonenumber_;
        private Object strIDMD5_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.UploadUserInfoNet.1 */
        class C03511 extends AbstractParser<UploadUserInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{24880, 24881});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03511();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UploadUserInfoNetOrBuilder {
            private int bitField0_;
            private ID_TYPE eType_;
            private UPLOAD_ACTION_TYPE eUploadActionType_;
            private int iGender_;
            private Object sIcon_;
            private Object sNickname_;
            private Object sPhonenumber_;
            private Object strIDMD5_;

            static {
                fixHelper.fixfunc(new int[]{14184, 14185, 14186, 14187, 14188, 14189, 14190, 14191, 14192, 14193, 14194, 14195, 14196, 14197, 14198, 14199, 14200, 14201, 14202, 14203, 14204, 14205, 14206, 14207, 14208, 14209, 14210, 14211, 14212, 14213, 14214, 14215, 14216, 14217, 14218, 14219, 14220, 14221, 14222, 14223, 14224, 14225, 14226, 14227, 14228, 14229, 14230, 14231, 14232, 14233, 14234, 14235, 14236, 14237, 14238, 14239, 14240, 14241, 14242, 14243, 14244, 14245, 14246, 14247, 14248, 14249, 14250, 14251});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8162build();

            public final native UploadUserInfoNet m8163build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8164buildPartial();

            public final native UploadUserInfoNet m8165buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8166clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8167clear();

            public final native Builder m8168clear();

            public final native Builder clearEType();

            public final native Builder clearEUploadActionType();

            public final native Builder clearIGender();

            public final native Builder clearSIcon();

            public final native Builder clearSNickname();

            public final native Builder clearSPhonenumber();

            public final native Builder clearStrIDMD5();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8169clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8170clone();

            public final native Builder m8171clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8172getDefaultInstanceForType();

            public final native UploadUserInfoNet m8173getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ID_TYPE getEType();

            public final native UPLOAD_ACTION_TYPE getEUploadActionType();

            public final native int getIGender();

            public final native String getSIcon();

            public final native ByteString getSIconBytes();

            public final native String getSNickname();

            public final native ByteString getSNicknameBytes();

            public final native String getSPhonenumber();

            public final native ByteString getSPhonenumberBytes();

            public final native String getStrIDMD5();

            public final native ByteString getStrIDMD5Bytes();

            public final native boolean hasEType();

            public final native boolean hasEUploadActionType();

            public final native boolean hasIGender();

            public final native boolean hasSIcon();

            public final native boolean hasSNickname();

            public final native boolean hasSPhonenumber();

            public final native boolean hasStrIDMD5();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8174mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8175mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8176mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8177mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8178mergeFrom(Message message);

            public final native Builder mergeFrom(UploadUserInfoNet uploadUserInfoNet);

            public final native Builder setEType(ID_TYPE id_type);

            public final native Builder setEUploadActionType(UPLOAD_ACTION_TYPE upload_action_type);

            public final native Builder setIGender(int i);

            public final native Builder setSIcon(String str);

            public final native Builder setSIconBytes(ByteString byteString);

            public final native Builder setSNickname(String str);

            public final native Builder setSNicknameBytes(ByteString byteString);

            public final native Builder setSPhonenumber(String str);

            public final native Builder setSPhonenumberBytes(ByteString byteString);

            public final native Builder setStrIDMD5(String str);

            public final native Builder setStrIDMD5Bytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.ak;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{23982, 23983, 23984, 23985, 23986, 23987, 23988, 23989, 23990, 23991, 23992, 23993, 23994, 23995, 23996, 23997, 23998, 23999, 24000, 24001, 24002, 24003, 24004, 24005, 24006, 24007, 24008, 24009, 24010, 24011, 24012, 24013, 24014, 24015, 24016, 24017, 24018, 24019, 24020, 24021, 24022, 24023});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UploadUserInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UploadUserInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UploadUserInfoNet uploadUserInfoNet);

        private native UploadUserInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UploadUserInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, UploadUserInfoNet uploadUserInfoNet);

        private native UploadUserInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8155getDefaultInstanceForType();

        public final native UploadUserInfoNet m8156getDefaultInstanceForType();

        public final native ID_TYPE getEType();

        public final native UPLOAD_ACTION_TYPE getEUploadActionType();

        public final native int getIGender();

        public final native Parser<UploadUserInfoNet> getParserForType();

        public final native String getSIcon();

        public final native ByteString getSIconBytes();

        public final native String getSNickname();

        public final native ByteString getSNicknameBytes();

        public final native String getSPhonenumber();

        public final native ByteString getSPhonenumberBytes();

        public final native int getSerializedSize();

        public final native String getStrIDMD5();

        public final native ByteString getStrIDMD5Bytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEType();

        public final native boolean hasEUploadActionType();

        public final native boolean hasIGender();

        public final native boolean hasSIcon();

        public final native boolean hasSNickname();

        public final native boolean hasSPhonenumber();

        public final native boolean hasStrIDMD5();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8157newBuilderForType();

        public final native Builder m8158newBuilderForType();

        protected final native Builder m8159newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8160toBuilder();

        public final native Builder m8161toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UploadUserInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.ak;
        }

        static void __clinit__() {
            PARSER = new C03511();
            UploadUserInfoNet uploadUserInfoNet = new UploadUserInfoNet(true);
            defaultInstance = uploadUserInfoNet;
            uploadUserInfoNet.initFields();
        }

        public static UploadUserInfoNet parseFrom(ByteString byteString) {
            return (UploadUserInfoNet) PARSER.parseFrom(byteString);
        }

        public static UploadUserInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UploadUserInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UploadUserInfoNet parseFrom(byte[] bArr) {
            return (UploadUserInfoNet) PARSER.parseFrom(bArr);
        }

        public static UploadUserInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UploadUserInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UploadUserInfoNet parseFrom(InputStream inputStream) {
            return (UploadUserInfoNet) PARSER.parseFrom(inputStream);
        }

        public static UploadUserInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UploadUserInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UploadUserInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (UploadUserInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UploadUserInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UploadUserInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UploadUserInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (UploadUserInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static UploadUserInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UploadUserInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UploadUserInfoNet uploadUserInfoNet) {
            return newBuilder().mergeFrom(uploadUserInfoNet);
        }
    }

    public interface UserFriendInfoNetOrBuilder extends MessageOrBuilder {
        USER_FRIEND_STATE getEFriendState();

        USER_STATE getEUserState();

        int getIMute();

        int getIVibrate();

        long getLRoomId();

        UserBaseInfoNet getStUserBaseInfo();

        UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

        boolean hasEFriendState();

        boolean hasEUserState();

        boolean hasIMute();

        boolean hasIVibrate();

        boolean hasLRoomId();

        boolean hasStUserBaseInfo();
    }

    public static final class UserFriendInfoNet extends GeneratedMessage implements UserFriendInfoNetOrBuilder {
        public static final int EFRIENDSTATE_FIELD_NUMBER = 3;
        public static final int EUSERSTATE_FIELD_NUMBER = 2;
        public static final int IMUTE_FIELD_NUMBER = 5;
        public static final int IVIBRATE_FIELD_NUMBER = 6;
        public static final int LROOMID_FIELD_NUMBER = 4;
        public static Parser<UserFriendInfoNet> PARSER = null;
        public static final int STUSERBASEINFO_FIELD_NUMBER = 1;
        private static final UserFriendInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private USER_FRIEND_STATE eFriendState_;
        private USER_STATE eUserState_;
        private int iMute_;
        private int iVibrate_;
        private long lRoomId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private UserBaseInfoNet stUserBaseInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.UserFriendInfoNet.1 */
        class C03521 extends AbstractParser<UserFriendInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{23700, 23701});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03521();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UserFriendInfoNetOrBuilder {
            private int bitField0_;
            private USER_FRIEND_STATE eFriendState_;
            private USER_STATE eUserState_;
            private int iMute_;
            private int iVibrate_;
            private long lRoomId_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stUserBaseInfoBuilder_;
            private UserBaseInfoNet stUserBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{31287, 31288, 31289, 31290, 31291, 31292, 31293, 31294, 31295, 31296, 31297, 31298, 31299, 31300, 31301, 31302, 31303, 31304, 31305, 31306, 31307, 31308, 31309, 31310, 31311, 31312, 31313, 31314, 31315, 31316, 31317, 31318, 31319, 31320, 31321, 31322, 31323, 31324, 31325, 31326, 31327, 31328, 31329, 31330, 31331, 31332, 31333, 31334, 31335, 31336, 31337, 31338, 31339, 31340, 31341, 31342, 31343, 31344, 31345, 31346, 31347});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStUserBaseInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8186build();

            public final native UserFriendInfoNet m8187build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8188buildPartial();

            public final native UserFriendInfoNet m8189buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8190clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8191clear();

            public final native Builder m8192clear();

            public final native Builder clearEFriendState();

            public final native Builder clearEUserState();

            public final native Builder clearIMute();

            public final native Builder clearIVibrate();

            public final native Builder clearLRoomId();

            public final native Builder clearStUserBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8193clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8194clone();

            public final native Builder m8195clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8196getDefaultInstanceForType();

            public final native UserFriendInfoNet m8197getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native USER_FRIEND_STATE getEFriendState();

            public final native USER_STATE getEUserState();

            public final native int getIMute();

            public final native int getIVibrate();

            public final native long getLRoomId();

            public final native UserBaseInfoNet getStUserBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStUserBaseInfoBuilder();

            public final native UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

            public final native boolean hasEFriendState();

            public final native boolean hasEUserState();

            public final native boolean hasIMute();

            public final native boolean hasIVibrate();

            public final native boolean hasLRoomId();

            public final native boolean hasStUserBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8198mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8199mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8200mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8201mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8202mergeFrom(Message message);

            public final native Builder mergeFrom(UserFriendInfoNet userFriendInfoNet);

            public final native Builder mergeStUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setEFriendState(USER_FRIEND_STATE user_friend_state);

            public final native Builder setEUserState(USER_STATE user_state);

            public final native Builder setIMute(int i);

            public final native Builder setIVibrate(int i);

            public final native Builder setLRoomId(long j);

            public final native Builder setStUserBaseInfo(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.am;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{27090, 27091, 27092, 27093, 27094, 27095, 27096, 27097, 27098, 27099, 27100, 27101, 27102, 27103, 27104, 27105, 27106, 27107, 27108, 27109, 27110, 27111, 27112, 27113, 27114, 27115, 27116, 27117, 27118, 27119, 27120, 27121, 27122, 27123, 27124, 27125, 27126});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UserFriendInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UserFriendInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UserFriendInfoNet userFriendInfoNet);

        private native UserFriendInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UserFriendInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, UserFriendInfoNet userFriendInfoNet);

        private native UserFriendInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8179getDefaultInstanceForType();

        public final native UserFriendInfoNet m8180getDefaultInstanceForType();

        public final native USER_FRIEND_STATE getEFriendState();

        public final native USER_STATE getEUserState();

        public final native int getIMute();

        public final native int getIVibrate();

        public final native long getLRoomId();

        public final native Parser<UserFriendInfoNet> getParserForType();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStUserBaseInfo();

        public final native UserBaseInfoNetOrBuilder getStUserBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEFriendState();

        public final native boolean hasEUserState();

        public final native boolean hasIMute();

        public final native boolean hasIVibrate();

        public final native boolean hasLRoomId();

        public final native boolean hasStUserBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8181newBuilderForType();

        public final native Builder m8182newBuilderForType();

        protected final native Builder m8183newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8184toBuilder();

        public final native Builder m8185toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UserFriendInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.am;
        }

        static void __clinit__() {
            PARSER = new C03521();
            UserFriendInfoNet userFriendInfoNet = new UserFriendInfoNet(true);
            defaultInstance = userFriendInfoNet;
            userFriendInfoNet.initFields();
        }

        public static UserFriendInfoNet parseFrom(ByteString byteString) {
            return (UserFriendInfoNet) PARSER.parseFrom(byteString);
        }

        public static UserFriendInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UserFriendInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserFriendInfoNet parseFrom(byte[] bArr) {
            return (UserFriendInfoNet) PARSER.parseFrom(bArr);
        }

        public static UserFriendInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UserFriendInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserFriendInfoNet parseFrom(InputStream inputStream) {
            return (UserFriendInfoNet) PARSER.parseFrom(inputStream);
        }

        public static UserFriendInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserFriendInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UserFriendInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (UserFriendInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UserFriendInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserFriendInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UserFriendInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (UserFriendInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static UserFriendInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserFriendInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UserFriendInfoNet userFriendInfoNet) {
            return newBuilder().mergeFrom(userFriendInfoNet);
        }
    }

    public interface UserInfoNetOrBuilder extends MessageOrBuilder {
        AchievementInfoNet getStAchievementInfo(int i);

        int getStAchievementInfoCount();

        List<AchievementInfoNet> getStAchievementInfoList();

        AchievementInfoNetOrBuilder getStAchievementInfoOrBuilder(int i);

        List<? extends AchievementInfoNetOrBuilder> getStAchievementInfoOrBuilderList();

        UserBaseInfoNet getStBaseInfo();

        UserBaseInfoNetOrBuilder getStBaseInfoOrBuilder();

        UserStatisticsInfoNet getStUserStatisticsInfo();

        UserStatisticsInfoNetOrBuilder getStUserStatisticsInfoOrBuilder();

        UserVIPStatisticsInfoNet getStUserVipStatisticsInfo();

        UserVIPStatisticsInfoNetOrBuilder getStUserVipStatisticsInfoOrBuilder();

        boolean hasStBaseInfo();

        boolean hasStUserStatisticsInfo();

        boolean hasStUserVipStatisticsInfo();
    }

    public static final class UserInfoNet extends GeneratedMessage implements UserInfoNetOrBuilder {
        public static Parser<UserInfoNet> PARSER = null;
        public static final int STACHIEVEMENTINFO_FIELD_NUMBER = 4;
        public static final int STBASEINFO_FIELD_NUMBER = 1;
        public static final int STUSERSTATISTICSINFO_FIELD_NUMBER = 2;
        public static final int STUSERVIPSTATISTICSINFO_FIELD_NUMBER = 3;
        private static final UserInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<AchievementInfoNet> stAchievementInfo_;
        private UserBaseInfoNet stBaseInfo_;
        private UserStatisticsInfoNet stUserStatisticsInfo_;
        private UserVIPStatisticsInfoNet stUserVipStatisticsInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.UserInfoNet.1 */
        class C03531 extends AbstractParser<UserInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{33229, 33230});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03531();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UserInfoNetOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<AchievementInfoNet, Builder, AchievementInfoNetOrBuilder> stAchievementInfoBuilder_;
            private List<AchievementInfoNet> stAchievementInfo_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stBaseInfoBuilder_;
            private UserBaseInfoNet stBaseInfo_;
            private SingleFieldBuilder<UserStatisticsInfoNet, Builder, UserStatisticsInfoNetOrBuilder> stUserStatisticsInfoBuilder_;
            private UserStatisticsInfoNet stUserStatisticsInfo_;
            private SingleFieldBuilder<UserVIPStatisticsInfoNet, Builder, UserVIPStatisticsInfoNetOrBuilder> stUserVipStatisticsInfoBuilder_;
            private UserVIPStatisticsInfoNet stUserVipStatisticsInfo_;

            static {
                fixHelper.fixfunc(new int[]{15321, 15322, 15323, 15324, 15325, 15326, 15327, 15328, 15329, 15330, 15331, 15332, 15333, 15334, 15335, 15336, 15337, 15338, 15339, 15340, 15341, 15342, 15343, 15344, 15345, 15346, 15347, 15348, 15349, 15350, 15351, 15352, 15353, 15354, 15355, 15356, 15357, 15358, 15359, 15360, 15361, 15362, 15363, 15364, 15365, 15366, 15367, 15368, 15369, 15370, 15371, 15372, 15373, 15374, 15375, 15376, 15377, 15378, 15379, 15380, 15381, 15382, 15383, 15384, 15385, 15386, 15387, 15388, 15389, 15390, 15391, 15392, 15393, 15394, 15395, 15396, 15397, 15398, 15399});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureStAchievementInfoIsMutable();

            private native RepeatedFieldBuilder<AchievementInfoNet, Builder, AchievementInfoNetOrBuilder> getStAchievementInfoFieldBuilder();

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStBaseInfoFieldBuilder();

            private native SingleFieldBuilder<UserStatisticsInfoNet, Builder, UserStatisticsInfoNetOrBuilder> getStUserStatisticsInfoFieldBuilder();

            private native SingleFieldBuilder<UserVIPStatisticsInfoNet, Builder, UserVIPStatisticsInfoNetOrBuilder> getStUserVipStatisticsInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllStAchievementInfo(Iterable<? extends AchievementInfoNet> iterable);

            public final native Builder addStAchievementInfo(int i, Builder builder);

            public final native Builder addStAchievementInfo(int i, AchievementInfoNet achievementInfoNet);

            public final native Builder addStAchievementInfo(Builder builder);

            public final native Builder addStAchievementInfo(AchievementInfoNet achievementInfoNet);

            public final native Builder addStAchievementInfoBuilder();

            public final native Builder addStAchievementInfoBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8210build();

            public final native UserInfoNet m8211build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8212buildPartial();

            public final native UserInfoNet m8213buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8214clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8215clear();

            public final native Builder m8216clear();

            public final native Builder clearStAchievementInfo();

            public final native Builder clearStBaseInfo();

            public final native Builder clearStUserStatisticsInfo();

            public final native Builder clearStUserVipStatisticsInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8217clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8218clone();

            public final native Builder m8219clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8220getDefaultInstanceForType();

            public final native UserInfoNet m8221getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native AchievementInfoNet getStAchievementInfo(int i);

            public final native Builder getStAchievementInfoBuilder(int i);

            public final native List<Builder> getStAchievementInfoBuilderList();

            public final native int getStAchievementInfoCount();

            public final native List<AchievementInfoNet> getStAchievementInfoList();

            public final native AchievementInfoNetOrBuilder getStAchievementInfoOrBuilder(int i);

            public final native List<? extends AchievementInfoNetOrBuilder> getStAchievementInfoOrBuilderList();

            public final native UserBaseInfoNet getStBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStBaseInfoBuilder();

            public final native UserBaseInfoNetOrBuilder getStBaseInfoOrBuilder();

            public final native UserStatisticsInfoNet getStUserStatisticsInfo();

            public final native Builder getStUserStatisticsInfoBuilder();

            public final native UserStatisticsInfoNetOrBuilder getStUserStatisticsInfoOrBuilder();

            public final native UserVIPStatisticsInfoNet getStUserVipStatisticsInfo();

            public final native Builder getStUserVipStatisticsInfoBuilder();

            public final native UserVIPStatisticsInfoNetOrBuilder getStUserVipStatisticsInfoOrBuilder();

            public final native boolean hasStBaseInfo();

            public final native boolean hasStUserStatisticsInfo();

            public final native boolean hasStUserVipStatisticsInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8222mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8223mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8224mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8225mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8226mergeFrom(Message message);

            public final native Builder mergeFrom(UserInfoNet userInfoNet);

            public final native Builder mergeStBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder mergeStUserStatisticsInfo(UserStatisticsInfoNet userStatisticsInfoNet);

            public final native Builder mergeStUserVipStatisticsInfo(UserVIPStatisticsInfoNet userVIPStatisticsInfoNet);

            public final native Builder removeStAchievementInfo(int i);

            public final native Builder setStAchievementInfo(int i, Builder builder);

            public final native Builder setStAchievementInfo(int i, AchievementInfoNet achievementInfoNet);

            public final native Builder setStBaseInfo(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setStUserStatisticsInfo(Builder builder);

            public final native Builder setStUserStatisticsInfo(UserStatisticsInfoNet userStatisticsInfoNet);

            public final native Builder setStUserVipStatisticsInfo(Builder builder);

            public final native Builder setStUserVipStatisticsInfo(UserVIPStatisticsInfoNet userVIPStatisticsInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f318w;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{29444, 29445, 29446, 29447, 29448, 29449, 29450, 29451, 29452, 29453, 29454, 29455, 29456, 29457, 29458, 29459, 29460, 29461, 29462, 29463, 29464, 29465, 29466, 29467, 29468, 29469, 29470, 29471, 29472, 29473, 29474, 29475, 29476, 29477, 29478, 29479, 29480, 29481});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UserInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UserInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UserInfoNet userInfoNet);

        private native UserInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UserInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, UserInfoNet userInfoNet);

        private native UserInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8203getDefaultInstanceForType();

        public final native UserInfoNet m8204getDefaultInstanceForType();

        public final native Parser<UserInfoNet> getParserForType();

        public final native int getSerializedSize();

        public final native AchievementInfoNet getStAchievementInfo(int i);

        public final native int getStAchievementInfoCount();

        public final native List<AchievementInfoNet> getStAchievementInfoList();

        public final native AchievementInfoNetOrBuilder getStAchievementInfoOrBuilder(int i);

        public final native List<? extends AchievementInfoNetOrBuilder> getStAchievementInfoOrBuilderList();

        public final native UserBaseInfoNet getStBaseInfo();

        public final native UserBaseInfoNetOrBuilder getStBaseInfoOrBuilder();

        public final native UserStatisticsInfoNet getStUserStatisticsInfo();

        public final native UserStatisticsInfoNetOrBuilder getStUserStatisticsInfoOrBuilder();

        public final native UserVIPStatisticsInfoNet getStUserVipStatisticsInfo();

        public final native UserVIPStatisticsInfoNetOrBuilder getStUserVipStatisticsInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasStBaseInfo();

        public final native boolean hasStUserStatisticsInfo();

        public final native boolean hasStUserVipStatisticsInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8205newBuilderForType();

        public final native Builder m8206newBuilderForType();

        protected final native Builder m8207newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8208toBuilder();

        public final native Builder m8209toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UserInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f318w;
        }

        static void __clinit__() {
            PARSER = new C03531();
            UserInfoNet userInfoNet = new UserInfoNet(true);
            defaultInstance = userInfoNet;
            userInfoNet.initFields();
        }

        public static UserInfoNet parseFrom(ByteString byteString) {
            return (UserInfoNet) PARSER.parseFrom(byteString);
        }

        public static UserInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UserInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserInfoNet parseFrom(byte[] bArr) {
            return (UserInfoNet) PARSER.parseFrom(bArr);
        }

        public static UserInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UserInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserInfoNet parseFrom(InputStream inputStream) {
            return (UserInfoNet) PARSER.parseFrom(inputStream);
        }

        public static UserInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UserInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (UserInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UserInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UserInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (UserInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static UserInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UserInfoNet userInfoNet) {
            return newBuilder().mergeFrom(userInfoNet);
        }
    }

    public interface UserInfoNetV2OrBuilder extends MessageOrBuilder {
        UserBaseInfoNet getStBaseInfo();

        UserBaseInfoNetOrBuilder getStBaseInfoOrBuilder();

        UserStatisticsInfoNetV2 getStClubUserStatisticsInfo(int i);

        int getStClubUserStatisticsInfoCount();

        List<UserStatisticsInfoNetV2> getStClubUserStatisticsInfoList();

        UserStatisticsInfoNetV2OrBuilder getStClubUserStatisticsInfoOrBuilder(int i);

        List<? extends UserStatisticsInfoNetV2OrBuilder> getStClubUserStatisticsInfoOrBuilderList();

        UserStatisticsInfoNetV2 getStUserStatisticsInfo();

        UserStatisticsInfoNetV2OrBuilder getStUserStatisticsInfoOrBuilder();

        UserVIPStatisticsInfoNetV2 getStUserVipStatisticsInfo();

        UserVIPStatisticsInfoNetV2OrBuilder getStUserVipStatisticsInfoOrBuilder();

        boolean hasStBaseInfo();

        boolean hasStUserStatisticsInfo();

        boolean hasStUserVipStatisticsInfo();
    }

    public static final class UserInfoNetV2 extends GeneratedMessage implements UserInfoNetV2OrBuilder {
        public static Parser<UserInfoNetV2> PARSER = null;
        public static final int STBASEINFO_FIELD_NUMBER = 1;
        public static final int STCLUBUSERSTATISTICSINFO_FIELD_NUMBER = 3;
        public static final int STUSERSTATISTICSINFO_FIELD_NUMBER = 2;
        public static final int STUSERVIPSTATISTICSINFO_FIELD_NUMBER = 4;
        private static final UserInfoNetV2 defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private UserBaseInfoNet stBaseInfo_;
        private List<UserStatisticsInfoNetV2> stClubUserStatisticsInfo_;
        private UserStatisticsInfoNetV2 stUserStatisticsInfo_;
        private UserVIPStatisticsInfoNetV2 stUserVipStatisticsInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.UserInfoNetV2.1 */
        class C03541 extends AbstractParser<UserInfoNetV2> {
            static {
                fixHelper.fixfunc(new int[]{15134, 15135});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03541();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UserInfoNetV2OrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stBaseInfoBuilder_;
            private UserBaseInfoNet stBaseInfo_;
            private RepeatedFieldBuilder<UserStatisticsInfoNetV2, Builder, UserStatisticsInfoNetV2OrBuilder> stClubUserStatisticsInfoBuilder_;
            private List<UserStatisticsInfoNetV2> stClubUserStatisticsInfo_;
            private SingleFieldBuilder<UserStatisticsInfoNetV2, Builder, UserStatisticsInfoNetV2OrBuilder> stUserStatisticsInfoBuilder_;
            private UserStatisticsInfoNetV2 stUserStatisticsInfo_;
            private SingleFieldBuilder<UserVIPStatisticsInfoNetV2, Builder, UserVIPStatisticsInfoNetV2OrBuilder> stUserVipStatisticsInfoBuilder_;
            private UserVIPStatisticsInfoNetV2 stUserVipStatisticsInfo_;

            static {
                fixHelper.fixfunc(new int[]{17847, 17848, 17849, 17850, 17851, 17852, 17853, 17854, 17855, 17856, 17857, 17858, 17859, 17860, 17861, 17862, 17863, 17864, 17865, 17866, 17867, 17868, 17869, 17870, 17871, 17872, 17873, 17874, 17875, 17876, 17877, 17878, 17879, 17880, 17881, 17882, 17883, 17884, 17885, 17886, 17887, 17888, 17889, 17890, 17891, 17892, 17893, 17894, 17895, 17896, 17897, 17898, 17899, 17900, 17901, 17902, 17903, 17904, 17905, 17906, 17907, 17908, 17909, 17910, 17911, 17912, 17913, 17914, 17915, 17916, 17917, 17918, 17919, 17920, 17921, 17922, 17923, 17924, 17925});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureStClubUserStatisticsInfoIsMutable();

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStBaseInfoFieldBuilder();

            private native RepeatedFieldBuilder<UserStatisticsInfoNetV2, Builder, UserStatisticsInfoNetV2OrBuilder> getStClubUserStatisticsInfoFieldBuilder();

            private native SingleFieldBuilder<UserStatisticsInfoNetV2, Builder, UserStatisticsInfoNetV2OrBuilder> getStUserStatisticsInfoFieldBuilder();

            private native SingleFieldBuilder<UserVIPStatisticsInfoNetV2, Builder, UserVIPStatisticsInfoNetV2OrBuilder> getStUserVipStatisticsInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllStClubUserStatisticsInfo(Iterable<? extends UserStatisticsInfoNetV2> iterable);

            public final native Builder addStClubUserStatisticsInfo(int i, Builder builder);

            public final native Builder addStClubUserStatisticsInfo(int i, UserStatisticsInfoNetV2 userStatisticsInfoNetV2);

            public final native Builder addStClubUserStatisticsInfo(Builder builder);

            public final native Builder addStClubUserStatisticsInfo(UserStatisticsInfoNetV2 userStatisticsInfoNetV2);

            public final native Builder addStClubUserStatisticsInfoBuilder();

            public final native Builder addStClubUserStatisticsInfoBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8234build();

            public final native UserInfoNetV2 m8235build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8236buildPartial();

            public final native UserInfoNetV2 m8237buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8238clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8239clear();

            public final native Builder m8240clear();

            public final native Builder clearStBaseInfo();

            public final native Builder clearStClubUserStatisticsInfo();

            public final native Builder clearStUserStatisticsInfo();

            public final native Builder clearStUserVipStatisticsInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8241clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8242clone();

            public final native Builder m8243clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8244getDefaultInstanceForType();

            public final native UserInfoNetV2 m8245getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native UserBaseInfoNet getStBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStBaseInfoBuilder();

            public final native UserBaseInfoNetOrBuilder getStBaseInfoOrBuilder();

            public final native UserStatisticsInfoNetV2 getStClubUserStatisticsInfo(int i);

            public final native Builder getStClubUserStatisticsInfoBuilder(int i);

            public final native List<Builder> getStClubUserStatisticsInfoBuilderList();

            public final native int getStClubUserStatisticsInfoCount();

            public final native List<UserStatisticsInfoNetV2> getStClubUserStatisticsInfoList();

            public final native UserStatisticsInfoNetV2OrBuilder getStClubUserStatisticsInfoOrBuilder(int i);

            public final native List<? extends UserStatisticsInfoNetV2OrBuilder> getStClubUserStatisticsInfoOrBuilderList();

            public final native UserStatisticsInfoNetV2 getStUserStatisticsInfo();

            public final native Builder getStUserStatisticsInfoBuilder();

            public final native UserStatisticsInfoNetV2OrBuilder getStUserStatisticsInfoOrBuilder();

            public final native UserVIPStatisticsInfoNetV2 getStUserVipStatisticsInfo();

            public final native Builder getStUserVipStatisticsInfoBuilder();

            public final native UserVIPStatisticsInfoNetV2OrBuilder getStUserVipStatisticsInfoOrBuilder();

            public final native boolean hasStBaseInfo();

            public final native boolean hasStUserStatisticsInfo();

            public final native boolean hasStUserVipStatisticsInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8246mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8247mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8248mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8249mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8250mergeFrom(Message message);

            public final native Builder mergeFrom(UserInfoNetV2 userInfoNetV2);

            public final native Builder mergeStBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder mergeStUserStatisticsInfo(UserStatisticsInfoNetV2 userStatisticsInfoNetV2);

            public final native Builder mergeStUserVipStatisticsInfo(UserVIPStatisticsInfoNetV2 userVIPStatisticsInfoNetV2);

            public final native Builder removeStClubUserStatisticsInfo(int i);

            public final native Builder setStBaseInfo(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStBaseInfo(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setStClubUserStatisticsInfo(int i, Builder builder);

            public final native Builder setStClubUserStatisticsInfo(int i, UserStatisticsInfoNetV2 userStatisticsInfoNetV2);

            public final native Builder setStUserStatisticsInfo(Builder builder);

            public final native Builder setStUserStatisticsInfo(UserStatisticsInfoNetV2 userStatisticsInfoNetV2);

            public final native Builder setStUserVipStatisticsInfo(Builder builder);

            public final native Builder setStUserVipStatisticsInfo(UserVIPStatisticsInfoNetV2 userVIPStatisticsInfoNetV2);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f320y;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{20191, 20192, 20193, 20194, 20195, 20196, 20197, 20198, 20199, 20200, 20201, 20202, 20203, 20204, 20205, 20206, 20207, 20208, 20209, 20210, 20211, 20212, 20213, 20214, 20215, 20216, 20217, 20218, 20219, 20220, 20221, 20222, 20223, 20224, 20225, 20226, 20227, 20228});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UserInfoNetV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UserInfoNetV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UserInfoNetV2 userInfoNetV2);

        private native UserInfoNetV2(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UserInfoNetV2(com.google.protobuf.GeneratedMessage.Builder builder, UserInfoNetV2 userInfoNetV2);

        private native UserInfoNetV2(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8227getDefaultInstanceForType();

        public final native UserInfoNetV2 m8228getDefaultInstanceForType();

        public final native Parser<UserInfoNetV2> getParserForType();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStBaseInfo();

        public final native UserBaseInfoNetOrBuilder getStBaseInfoOrBuilder();

        public final native UserStatisticsInfoNetV2 getStClubUserStatisticsInfo(int i);

        public final native int getStClubUserStatisticsInfoCount();

        public final native List<UserStatisticsInfoNetV2> getStClubUserStatisticsInfoList();

        public final native UserStatisticsInfoNetV2OrBuilder getStClubUserStatisticsInfoOrBuilder(int i);

        public final native List<? extends UserStatisticsInfoNetV2OrBuilder> getStClubUserStatisticsInfoOrBuilderList();

        public final native UserStatisticsInfoNetV2 getStUserStatisticsInfo();

        public final native UserStatisticsInfoNetV2OrBuilder getStUserStatisticsInfoOrBuilder();

        public final native UserVIPStatisticsInfoNetV2 getStUserVipStatisticsInfo();

        public final native UserVIPStatisticsInfoNetV2OrBuilder getStUserVipStatisticsInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasStBaseInfo();

        public final native boolean hasStUserStatisticsInfo();

        public final native boolean hasStUserVipStatisticsInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8229newBuilderForType();

        public final native Builder m8230newBuilderForType();

        protected final native Builder m8231newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8232toBuilder();

        public final native Builder m8233toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UserInfoNetV2 getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f320y;
        }

        static void __clinit__() {
            PARSER = new C03541();
            UserInfoNetV2 userInfoNetV2 = new UserInfoNetV2(true);
            defaultInstance = userInfoNetV2;
            userInfoNetV2.initFields();
        }

        public static UserInfoNetV2 parseFrom(ByteString byteString) {
            return (UserInfoNetV2) PARSER.parseFrom(byteString);
        }

        public static UserInfoNetV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UserInfoNetV2) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserInfoNetV2 parseFrom(byte[] bArr) {
            return (UserInfoNetV2) PARSER.parseFrom(bArr);
        }

        public static UserInfoNetV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UserInfoNetV2) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserInfoNetV2 parseFrom(InputStream inputStream) {
            return (UserInfoNetV2) PARSER.parseFrom(inputStream);
        }

        public static UserInfoNetV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserInfoNetV2) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UserInfoNetV2 parseDelimitedFrom(InputStream inputStream) {
            return (UserInfoNetV2) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UserInfoNetV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserInfoNetV2) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UserInfoNetV2 parseFrom(CodedInputStream codedInputStream) {
            return (UserInfoNetV2) PARSER.parseFrom(codedInputStream);
        }

        public static UserInfoNetV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserInfoNetV2) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UserInfoNetV2 userInfoNetV2) {
            return newBuilder().mergeFrom(userInfoNetV2);
        }
    }

    public interface UserStatisticsInfoNetOrBuilder extends MessageOrBuilder {
        long getLAllInNum();

        long getLETFNum();

        long getLMaxGame();

        long getLMaxTurn();

        long getLTotalTimes();

        long getLVPIPNum();

        long getLWTSDNum();

        long getLWVSDNum();

        long getLWinTimes();

        int getVMaxCards(int i);

        int getVMaxCardsCount();

        List<Integer> getVMaxCardsList();

        boolean hasLAllInNum();

        boolean hasLETFNum();

        boolean hasLMaxGame();

        boolean hasLMaxTurn();

        boolean hasLTotalTimes();

        boolean hasLVPIPNum();

        boolean hasLWTSDNum();

        boolean hasLWVSDNum();

        boolean hasLWinTimes();
    }

    public static final class UserStatisticsInfoNet extends GeneratedMessage implements UserStatisticsInfoNetOrBuilder {
        public static final int LALLINNUM_FIELD_NUMBER = 3;
        public static final int LETFNUM_FIELD_NUMBER = 5;
        public static final int LMAXGAME_FIELD_NUMBER = 8;
        public static final int LMAXTURN_FIELD_NUMBER = 9;
        public static final int LTOTALTIMES_FIELD_NUMBER = 1;
        public static final int LVPIPNUM_FIELD_NUMBER = 4;
        public static final int LWINTIMES_FIELD_NUMBER = 2;
        public static final int LWTSDNUM_FIELD_NUMBER = 7;
        public static final int LWVSDNUM_FIELD_NUMBER = 6;
        public static Parser<UserStatisticsInfoNet> PARSER = null;
        public static final int VMAXCARDS_FIELD_NUMBER = 10;
        private static final UserStatisticsInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lAllInNum_;
        private long lETFNum_;
        private long lMaxGame_;
        private long lMaxTurn_;
        private long lTotalTimes_;
        private long lVPIPNum_;
        private long lWTSDNum_;
        private long lWVSDNum_;
        private long lWinTimes_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<Integer> vMaxCards_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.UserStatisticsInfoNet.1 */
        class C03551 extends AbstractParser<UserStatisticsInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{24847, 24848});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03551();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UserStatisticsInfoNetOrBuilder {
            private int bitField0_;
            private long lAllInNum_;
            private long lETFNum_;
            private long lMaxGame_;
            private long lMaxTurn_;
            private long lTotalTimes_;
            private long lVPIPNum_;
            private long lWTSDNum_;
            private long lWVSDNum_;
            private long lWinTimes_;
            private List<Integer> vMaxCards_;

            static {
                fixHelper.fixfunc(new int[]{20260, 20261, 20262, 20263, 20264, 20265, 20266, 20267, 20268, 20269, 20270, 20271, 20272, 20273, 20274, 20275, 20276, 20277, 20278, 20279, 20280, 20281, 20282, 20283, 20284, 20285, 20286, 20287, 20288, 20289, 20290, 20291, 20292, 20293, 20294, 20295, 20296, 20297, 20298, 20299, 20300, 20301, 20302, 20303, 20304, 20305, 20306, 20307, 20308, 20309, 20310, 20311, 20312, 20313, 20314, 20315, 20316, 20317, 20318, 20319, 20320, 20321, 20322, 20323, 20324, 20325, 20326, 20327, 20328, 20329, 20330, 20331, 20332, 20333, 20334, 20335});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVMaxCardsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVMaxCards(Iterable<? extends Integer> iterable);

            public final native Builder addVMaxCards(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8258build();

            public final native UserStatisticsInfoNet m8259build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8260buildPartial();

            public final native UserStatisticsInfoNet m8261buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8262clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8263clear();

            public final native Builder m8264clear();

            public final native Builder clearLAllInNum();

            public final native Builder clearLETFNum();

            public final native Builder clearLMaxGame();

            public final native Builder clearLMaxTurn();

            public final native Builder clearLTotalTimes();

            public final native Builder clearLVPIPNum();

            public final native Builder clearLWTSDNum();

            public final native Builder clearLWVSDNum();

            public final native Builder clearLWinTimes();

            public final native Builder clearVMaxCards();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8265clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8266clone();

            public final native Builder m8267clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8268getDefaultInstanceForType();

            public final native UserStatisticsInfoNet m8269getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLAllInNum();

            public final native long getLETFNum();

            public final native long getLMaxGame();

            public final native long getLMaxTurn();

            public final native long getLTotalTimes();

            public final native long getLVPIPNum();

            public final native long getLWTSDNum();

            public final native long getLWVSDNum();

            public final native long getLWinTimes();

            public final native int getVMaxCards(int i);

            public final native int getVMaxCardsCount();

            public final native List<Integer> getVMaxCardsList();

            public final native boolean hasLAllInNum();

            public final native boolean hasLETFNum();

            public final native boolean hasLMaxGame();

            public final native boolean hasLMaxTurn();

            public final native boolean hasLTotalTimes();

            public final native boolean hasLVPIPNum();

            public final native boolean hasLWTSDNum();

            public final native boolean hasLWVSDNum();

            public final native boolean hasLWinTimes();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8270mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8271mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8272mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8273mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8274mergeFrom(Message message);

            public final native Builder mergeFrom(UserStatisticsInfoNet userStatisticsInfoNet);

            public final native Builder setLAllInNum(long j);

            public final native Builder setLETFNum(long j);

            public final native Builder setLMaxGame(long j);

            public final native Builder setLMaxTurn(long j);

            public final native Builder setLTotalTimes(long j);

            public final native Builder setLVPIPNum(long j);

            public final native Builder setLWTSDNum(long j);

            public final native Builder setLWVSDNum(long j);

            public final native Builder setLWinTimes(long j);

            public final native Builder setVMaxCards(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f308m;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{12824, 12825, 12826, 12827, 12828, 12829, 12830, 12831, 12832, 12833, 12834, 12835, 12836, 12837, 12838, 12839, 12840, 12841, 12842, 12843, 12844, 12845, 12846, 12847, 12848, 12849, 12850, 12851, 12852, 12853, 12854, 12855, 12856, 12857, 12858, 12859, 12860, 12861, 12862, 12863, 12864, 12865, 12866, 12867, 12868});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UserStatisticsInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UserStatisticsInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UserStatisticsInfoNet userStatisticsInfoNet);

        private native UserStatisticsInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UserStatisticsInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, UserStatisticsInfoNet userStatisticsInfoNet);

        private native UserStatisticsInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8251getDefaultInstanceForType();

        public final native UserStatisticsInfoNet m8252getDefaultInstanceForType();

        public final native long getLAllInNum();

        public final native long getLETFNum();

        public final native long getLMaxGame();

        public final native long getLMaxTurn();

        public final native long getLTotalTimes();

        public final native long getLVPIPNum();

        public final native long getLWTSDNum();

        public final native long getLWVSDNum();

        public final native long getLWinTimes();

        public final native Parser<UserStatisticsInfoNet> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native int getVMaxCards(int i);

        public final native int getVMaxCardsCount();

        public final native List<Integer> getVMaxCardsList();

        public final native boolean hasLAllInNum();

        public final native boolean hasLETFNum();

        public final native boolean hasLMaxGame();

        public final native boolean hasLMaxTurn();

        public final native boolean hasLTotalTimes();

        public final native boolean hasLVPIPNum();

        public final native boolean hasLWTSDNum();

        public final native boolean hasLWVSDNum();

        public final native boolean hasLWinTimes();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8253newBuilderForType();

        public final native Builder m8254newBuilderForType();

        protected final native Builder m8255newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8256toBuilder();

        public final native Builder m8257toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UserStatisticsInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f308m;
        }

        static void __clinit__() {
            PARSER = new C03551();
            UserStatisticsInfoNet userStatisticsInfoNet = new UserStatisticsInfoNet(true);
            defaultInstance = userStatisticsInfoNet;
            userStatisticsInfoNet.initFields();
        }

        public static UserStatisticsInfoNet parseFrom(ByteString byteString) {
            return (UserStatisticsInfoNet) PARSER.parseFrom(byteString);
        }

        public static UserStatisticsInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UserStatisticsInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserStatisticsInfoNet parseFrom(byte[] bArr) {
            return (UserStatisticsInfoNet) PARSER.parseFrom(bArr);
        }

        public static UserStatisticsInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UserStatisticsInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserStatisticsInfoNet parseFrom(InputStream inputStream) {
            return (UserStatisticsInfoNet) PARSER.parseFrom(inputStream);
        }

        public static UserStatisticsInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserStatisticsInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UserStatisticsInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (UserStatisticsInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UserStatisticsInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserStatisticsInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UserStatisticsInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (UserStatisticsInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static UserStatisticsInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserStatisticsInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UserStatisticsInfoNet userStatisticsInfoNet) {
            return newBuilder().mergeFrom(userStatisticsInfoNet);
        }
    }

    public interface UserStatisticsInfoNetV2OrBuilder extends MessageOrBuilder {
        long getLBelongClubID();

        long getLTotalGames();

        long getLTotalHands();

        long getLVPIPNum();

        long getLWinTimes();

        boolean hasLBelongClubID();

        boolean hasLTotalGames();

        boolean hasLTotalHands();

        boolean hasLVPIPNum();

        boolean hasLWinTimes();
    }

    public static final class UserStatisticsInfoNetV2 extends GeneratedMessage implements UserStatisticsInfoNetV2OrBuilder {
        public static final int LBELONGCLUBID_FIELD_NUMBER = 5;
        public static final int LTOTALGAMES_FIELD_NUMBER = 1;
        public static final int LTOTALHANDS_FIELD_NUMBER = 2;
        public static final int LVPIPNUM_FIELD_NUMBER = 3;
        public static final int LWINTIMES_FIELD_NUMBER = 4;
        public static Parser<UserStatisticsInfoNetV2> PARSER;
        private static final UserStatisticsInfoNetV2 defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lBelongClubID_;
        private long lTotalGames_;
        private long lTotalHands_;
        private long lVPIPNum_;
        private long lWinTimes_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.UserStatisticsInfoNetV2.1 */
        class C03561 extends AbstractParser<UserStatisticsInfoNetV2> {
            static {
                fixHelper.fixfunc(new int[]{3963, 3964});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03561();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UserStatisticsInfoNetV2OrBuilder {
            private int bitField0_;
            private long lBelongClubID_;
            private long lTotalGames_;
            private long lTotalHands_;
            private long lVPIPNum_;
            private long lWinTimes_;

            static {
                fixHelper.fixfunc(new int[]{4782, 4783, 4784, 4785, 4786, 4787, 4788, 4789, 4790, 4791, 4792, 4793, 4794, 4795, 4796, 4797, 4798, 4799, 4800, 4801, 4802, 4803, 4804, 4805, 4806, 4807, 4808, 4809, 4810, 4811, 4812, 4813, 4814, 4815, 4816, 4817, 4818, 4819, 4820, 4821, 4822, 4823, 4824, 4825, 4826, 4827, 4828, 4829, 4830, 4831, 4832, 4833});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8282build();

            public final native UserStatisticsInfoNetV2 m8283build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8284buildPartial();

            public final native UserStatisticsInfoNetV2 m8285buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8286clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8287clear();

            public final native Builder m8288clear();

            public final native Builder clearLBelongClubID();

            public final native Builder clearLTotalGames();

            public final native Builder clearLTotalHands();

            public final native Builder clearLVPIPNum();

            public final native Builder clearLWinTimes();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8289clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8290clone();

            public final native Builder m8291clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8292getDefaultInstanceForType();

            public final native UserStatisticsInfoNetV2 m8293getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLBelongClubID();

            public final native long getLTotalGames();

            public final native long getLTotalHands();

            public final native long getLVPIPNum();

            public final native long getLWinTimes();

            public final native boolean hasLBelongClubID();

            public final native boolean hasLTotalGames();

            public final native boolean hasLTotalHands();

            public final native boolean hasLVPIPNum();

            public final native boolean hasLWinTimes();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8294mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8295mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8296mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8297mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8298mergeFrom(Message message);

            public final native Builder mergeFrom(UserStatisticsInfoNetV2 userStatisticsInfoNetV2);

            public final native Builder setLBelongClubID(long j);

            public final native Builder setLTotalGames(long j);

            public final native Builder setLTotalHands(long j);

            public final native Builder setLVPIPNum(long j);

            public final native Builder setLWinTimes(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f312q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{27586, 27587, 27588, 27589, 27590, 27591, 27592, 27593, 27594, 27595, 27596, 27597, 27598, 27599, 27600, 27601, 27602, 27603, 27604, 27605, 27606, 27607, 27608, 27609, 27610, 27611, 27612, 27613, 27614, 27615, 27616, 27617, 27618, 27619});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UserStatisticsInfoNetV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UserStatisticsInfoNetV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UserStatisticsInfoNetV2 userStatisticsInfoNetV2);

        private native UserStatisticsInfoNetV2(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UserStatisticsInfoNetV2(com.google.protobuf.GeneratedMessage.Builder builder, UserStatisticsInfoNetV2 userStatisticsInfoNetV2);

        private native UserStatisticsInfoNetV2(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8275getDefaultInstanceForType();

        public final native UserStatisticsInfoNetV2 m8276getDefaultInstanceForType();

        public final native long getLBelongClubID();

        public final native long getLTotalGames();

        public final native long getLTotalHands();

        public final native long getLVPIPNum();

        public final native long getLWinTimes();

        public final native Parser<UserStatisticsInfoNetV2> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasLBelongClubID();

        public final native boolean hasLTotalGames();

        public final native boolean hasLTotalHands();

        public final native boolean hasLVPIPNum();

        public final native boolean hasLWinTimes();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8277newBuilderForType();

        public final native Builder m8278newBuilderForType();

        protected final native Builder m8279newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8280toBuilder();

        public final native Builder m8281toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UserStatisticsInfoNetV2 getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f312q;
        }

        static void __clinit__() {
            PARSER = new C03561();
            UserStatisticsInfoNetV2 userStatisticsInfoNetV2 = new UserStatisticsInfoNetV2(true);
            defaultInstance = userStatisticsInfoNetV2;
            userStatisticsInfoNetV2.initFields();
        }

        public static UserStatisticsInfoNetV2 parseFrom(ByteString byteString) {
            return (UserStatisticsInfoNetV2) PARSER.parseFrom(byteString);
        }

        public static UserStatisticsInfoNetV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UserStatisticsInfoNetV2) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserStatisticsInfoNetV2 parseFrom(byte[] bArr) {
            return (UserStatisticsInfoNetV2) PARSER.parseFrom(bArr);
        }

        public static UserStatisticsInfoNetV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UserStatisticsInfoNetV2) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserStatisticsInfoNetV2 parseFrom(InputStream inputStream) {
            return (UserStatisticsInfoNetV2) PARSER.parseFrom(inputStream);
        }

        public static UserStatisticsInfoNetV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserStatisticsInfoNetV2) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UserStatisticsInfoNetV2 parseDelimitedFrom(InputStream inputStream) {
            return (UserStatisticsInfoNetV2) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UserStatisticsInfoNetV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserStatisticsInfoNetV2) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UserStatisticsInfoNetV2 parseFrom(CodedInputStream codedInputStream) {
            return (UserStatisticsInfoNetV2) PARSER.parseFrom(codedInputStream);
        }

        public static UserStatisticsInfoNetV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserStatisticsInfoNetV2) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UserStatisticsInfoNetV2 userStatisticsInfoNetV2) {
            return newBuilder().mergeFrom(userStatisticsInfoNetV2);
        }
    }

    public interface UserVIPStatisticsInfoNetOrBuilder extends MessageOrBuilder {
        long getL3BetDropNum();

        long getL3BetNum();

        long getLBe3BetedNum();

        long getLBeCBetedNum();

        long getLBeDonkBetedNum();

        long getLBetNum();

        long getLCBetDropNum();

        long getLCBetNum();

        long getLCallNum();

        long getLDonkBetDropNum();

        long getLDonkbetNum();

        long getLOpenRaiseNum();

        long getLPreFlopCallNum();

        long getLRaiseNum();

        long getLStoleNum();

        boolean hasL3BetDropNum();

        boolean hasL3BetNum();

        boolean hasLBe3BetedNum();

        boolean hasLBeCBetedNum();

        boolean hasLBeDonkBetedNum();

        boolean hasLBetNum();

        boolean hasLCBetDropNum();

        boolean hasLCBetNum();

        boolean hasLCallNum();

        boolean hasLDonkBetDropNum();

        boolean hasLDonkbetNum();

        boolean hasLOpenRaiseNum();

        boolean hasLPreFlopCallNum();

        boolean hasLRaiseNum();

        boolean hasLStoleNum();
    }

    public static final class UserVIPStatisticsInfoNet extends GeneratedMessage implements UserVIPStatisticsInfoNetOrBuilder {
        public static final int L3BETDROPNUM_FIELD_NUMBER = 8;
        public static final int L3BETNUM_FIELD_NUMBER = 6;
        public static final int LBE3BETEDNUM_FIELD_NUMBER = 7;
        public static final int LBECBETEDNUM_FIELD_NUMBER = 10;
        public static final int LBEDONKBETEDNUM_FIELD_NUMBER = 14;
        public static final int LBETNUM_FIELD_NUMBER = 1;
        public static final int LCALLNUM_FIELD_NUMBER = 3;
        public static final int LCBETDROPNUM_FIELD_NUMBER = 11;
        public static final int LCBETNUM_FIELD_NUMBER = 9;
        public static final int LDONKBETDROPNUM_FIELD_NUMBER = 15;
        public static final int LDONKBETNUM_FIELD_NUMBER = 13;
        public static final int LOPENRAISENUM_FIELD_NUMBER = 5;
        public static final int LPREFLOPCALLNUM_FIELD_NUMBER = 12;
        public static final int LRAISENUM_FIELD_NUMBER = 2;
        public static final int LSTOLENUM_FIELD_NUMBER = 4;
        public static Parser<UserVIPStatisticsInfoNet> PARSER;
        private static final UserVIPStatisticsInfoNet defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long l3BetDropNum_;
        private long l3BetNum_;
        private long lBe3BetedNum_;
        private long lBeCBetedNum_;
        private long lBeDonkBetedNum_;
        private long lBetNum_;
        private long lCBetDropNum_;
        private long lCBetNum_;
        private long lCallNum_;
        private long lDonkBetDropNum_;
        private long lDonkbetNum_;
        private long lOpenRaiseNum_;
        private long lPreFlopCallNum_;
        private long lRaiseNum_;
        private long lStoleNum_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.UserVIPStatisticsInfoNet.1 */
        class C03571 extends AbstractParser<UserVIPStatisticsInfoNet> {
            static {
                fixHelper.fixfunc(new int[]{20382, 20383});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03571();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UserVIPStatisticsInfoNetOrBuilder {
            private int bitField0_;
            private long l3BetDropNum_;
            private long l3BetNum_;
            private long lBe3BetedNum_;
            private long lBeCBetedNum_;
            private long lBeDonkBetedNum_;
            private long lBetNum_;
            private long lCBetDropNum_;
            private long lCBetNum_;
            private long lCallNum_;
            private long lDonkBetDropNum_;
            private long lDonkbetNum_;
            private long lOpenRaiseNum_;
            private long lPreFlopCallNum_;
            private long lRaiseNum_;
            private long lStoleNum_;

            static {
                fixHelper.fixfunc(new int[]{13195, 13196, 13197, 13198, 13199, 13200, 13201, 13202, 13203, 13204, 13205, 13206, 13207, 13208, 13209, 13210, 13211, 13212, 13213, 13214, 13215, 13216, 13217, 13218, 13219, 13220, 13221, 13222, 13223, 13224, 13225, 13226, 13227, 13228, 13229, 13230, 13231, 13232, 13233, 13234, 13235, 13236, 13237, 13238, 13239, 13240, 13241, 13242, 13243, 13244, 13245, 13246, 13247, 13248, 13249, 13250, 13251, 13252, 13253, 13254, 13255, 13256, 13257, 13258, 13259, 13260, 13261, 13262, 13263, 13264, 13265, 13266, 13267, 13268, 13269, 13270, 13271, 13272, 13273, 13274, 13275, 13276, 13277, 13278, 13279, 13280, 13281, 13282, 13283, 13284, 13285, 13286});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8306build();

            public final native UserVIPStatisticsInfoNet m8307build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8308buildPartial();

            public final native UserVIPStatisticsInfoNet m8309buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8310clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8311clear();

            public final native Builder m8312clear();

            public final native Builder clearL3BetDropNum();

            public final native Builder clearL3BetNum();

            public final native Builder clearLBe3BetedNum();

            public final native Builder clearLBeCBetedNum();

            public final native Builder clearLBeDonkBetedNum();

            public final native Builder clearLBetNum();

            public final native Builder clearLCBetDropNum();

            public final native Builder clearLCBetNum();

            public final native Builder clearLCallNum();

            public final native Builder clearLDonkBetDropNum();

            public final native Builder clearLDonkbetNum();

            public final native Builder clearLOpenRaiseNum();

            public final native Builder clearLPreFlopCallNum();

            public final native Builder clearLRaiseNum();

            public final native Builder clearLStoleNum();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8313clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8314clone();

            public final native Builder m8315clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8316getDefaultInstanceForType();

            public final native UserVIPStatisticsInfoNet m8317getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getL3BetDropNum();

            public final native long getL3BetNum();

            public final native long getLBe3BetedNum();

            public final native long getLBeCBetedNum();

            public final native long getLBeDonkBetedNum();

            public final native long getLBetNum();

            public final native long getLCBetDropNum();

            public final native long getLCBetNum();

            public final native long getLCallNum();

            public final native long getLDonkBetDropNum();

            public final native long getLDonkbetNum();

            public final native long getLOpenRaiseNum();

            public final native long getLPreFlopCallNum();

            public final native long getLRaiseNum();

            public final native long getLStoleNum();

            public final native boolean hasL3BetDropNum();

            public final native boolean hasL3BetNum();

            public final native boolean hasLBe3BetedNum();

            public final native boolean hasLBeCBetedNum();

            public final native boolean hasLBeDonkBetedNum();

            public final native boolean hasLBetNum();

            public final native boolean hasLCBetDropNum();

            public final native boolean hasLCBetNum();

            public final native boolean hasLCallNum();

            public final native boolean hasLDonkBetDropNum();

            public final native boolean hasLDonkbetNum();

            public final native boolean hasLOpenRaiseNum();

            public final native boolean hasLPreFlopCallNum();

            public final native boolean hasLRaiseNum();

            public final native boolean hasLStoleNum();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8318mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8319mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8320mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8321mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8322mergeFrom(Message message);

            public final native Builder mergeFrom(UserVIPStatisticsInfoNet userVIPStatisticsInfoNet);

            public final native Builder setL3BetDropNum(long j);

            public final native Builder setL3BetNum(long j);

            public final native Builder setLBe3BetedNum(long j);

            public final native Builder setLBeCBetedNum(long j);

            public final native Builder setLBeDonkBetedNum(long j);

            public final native Builder setLBetNum(long j);

            public final native Builder setLCBetDropNum(long j);

            public final native Builder setLCBetNum(long j);

            public final native Builder setLCallNum(long j);

            public final native Builder setLDonkBetDropNum(long j);

            public final native Builder setLDonkbetNum(long j);

            public final native Builder setLOpenRaiseNum(long j);

            public final native Builder setLPreFlopCallNum(long j);

            public final native Builder setLRaiseNum(long j);

            public final native Builder setLStoleNum(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f310o;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{4656, 4657, 4658, 4659, 4660, 4661, 4662, 4663, 4664, 4665, 4666, 4667, 4668, 4669, 4670, 4671, 4672, 4673, 4674, 4675, 4676, 4677, 4678, 4679, 4680, 4681, 4682, 4683, 4684, 4685, 4686, 4687, 4688, 4689, 4690, 4691, 4692, 4693, 4694, 4695, 4696, 4697, 4698, 4699, 4700, 4701, 4702, 4703, 4704, 4705, 4706, 4707, 4708, 4709});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UserVIPStatisticsInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UserVIPStatisticsInfoNet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UserVIPStatisticsInfoNet userVIPStatisticsInfoNet);

        private native UserVIPStatisticsInfoNet(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UserVIPStatisticsInfoNet(com.google.protobuf.GeneratedMessage.Builder builder, UserVIPStatisticsInfoNet userVIPStatisticsInfoNet);

        private native UserVIPStatisticsInfoNet(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8299getDefaultInstanceForType();

        public final native UserVIPStatisticsInfoNet m8300getDefaultInstanceForType();

        public final native long getL3BetDropNum();

        public final native long getL3BetNum();

        public final native long getLBe3BetedNum();

        public final native long getLBeCBetedNum();

        public final native long getLBeDonkBetedNum();

        public final native long getLBetNum();

        public final native long getLCBetDropNum();

        public final native long getLCBetNum();

        public final native long getLCallNum();

        public final native long getLDonkBetDropNum();

        public final native long getLDonkbetNum();

        public final native long getLOpenRaiseNum();

        public final native long getLPreFlopCallNum();

        public final native long getLRaiseNum();

        public final native long getLStoleNum();

        public final native Parser<UserVIPStatisticsInfoNet> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasL3BetDropNum();

        public final native boolean hasL3BetNum();

        public final native boolean hasLBe3BetedNum();

        public final native boolean hasLBeCBetedNum();

        public final native boolean hasLBeDonkBetedNum();

        public final native boolean hasLBetNum();

        public final native boolean hasLCBetDropNum();

        public final native boolean hasLCBetNum();

        public final native boolean hasLCallNum();

        public final native boolean hasLDonkBetDropNum();

        public final native boolean hasLDonkbetNum();

        public final native boolean hasLOpenRaiseNum();

        public final native boolean hasLPreFlopCallNum();

        public final native boolean hasLRaiseNum();

        public final native boolean hasLStoleNum();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8301newBuilderForType();

        public final native Builder m8302newBuilderForType();

        protected final native Builder m8303newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8304toBuilder();

        public final native Builder m8305toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UserVIPStatisticsInfoNet getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f310o;
        }

        static void __clinit__() {
            PARSER = new C03571();
            UserVIPStatisticsInfoNet userVIPStatisticsInfoNet = new UserVIPStatisticsInfoNet(true);
            defaultInstance = userVIPStatisticsInfoNet;
            userVIPStatisticsInfoNet.initFields();
        }

        public static UserVIPStatisticsInfoNet parseFrom(ByteString byteString) {
            return (UserVIPStatisticsInfoNet) PARSER.parseFrom(byteString);
        }

        public static UserVIPStatisticsInfoNet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVIPStatisticsInfoNet) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserVIPStatisticsInfoNet parseFrom(byte[] bArr) {
            return (UserVIPStatisticsInfoNet) PARSER.parseFrom(bArr);
        }

        public static UserVIPStatisticsInfoNet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVIPStatisticsInfoNet) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserVIPStatisticsInfoNet parseFrom(InputStream inputStream) {
            return (UserVIPStatisticsInfoNet) PARSER.parseFrom(inputStream);
        }

        public static UserVIPStatisticsInfoNet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVIPStatisticsInfoNet) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UserVIPStatisticsInfoNet parseDelimitedFrom(InputStream inputStream) {
            return (UserVIPStatisticsInfoNet) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UserVIPStatisticsInfoNet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVIPStatisticsInfoNet) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UserVIPStatisticsInfoNet parseFrom(CodedInputStream codedInputStream) {
            return (UserVIPStatisticsInfoNet) PARSER.parseFrom(codedInputStream);
        }

        public static UserVIPStatisticsInfoNet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVIPStatisticsInfoNet) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UserVIPStatisticsInfoNet userVIPStatisticsInfoNet) {
            return newBuilder().mergeFrom(userVIPStatisticsInfoNet);
        }
    }

    public interface UserVIPStatisticsInfoNetV2OrBuilder extends MessageOrBuilder {
        long getLAverageLoseStacks();

        long getLAverageWinStacks();

        long getLDays();

        long getLTotalBuyin();

        long getLTotalRemain();

        String getSRank();

        ByteString getSRankBytes();

        boolean hasLAverageLoseStacks();

        boolean hasLAverageWinStacks();

        boolean hasLDays();

        boolean hasLTotalBuyin();

        boolean hasLTotalRemain();

        boolean hasSRank();
    }

    public static final class UserVIPStatisticsInfoNetV2 extends GeneratedMessage implements UserVIPStatisticsInfoNetV2OrBuilder {
        public static final int LAVERAGELOSESTACKS_FIELD_NUMBER = 4;
        public static final int LAVERAGEWINSTACKS_FIELD_NUMBER = 3;
        public static final int LDAYS_FIELD_NUMBER = 6;
        public static final int LTOTALBUYIN_FIELD_NUMBER = 1;
        public static final int LTOTALREMAIN_FIELD_NUMBER = 2;
        public static Parser<UserVIPStatisticsInfoNetV2> PARSER = null;
        public static final int SRANK_FIELD_NUMBER = 5;
        private static final UserVIPStatisticsInfoNetV2 defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lAverageLoseStacks_;
        private long lAverageWinStacks_;
        private long lDays_;
        private long lTotalBuyin_;
        private long lTotalRemain_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sRank_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpUser.UserVIPStatisticsInfoNetV2.1 */
        class C03581 extends AbstractParser<UserVIPStatisticsInfoNetV2> {
            static {
                fixHelper.fixfunc(new int[]{14830, 14831});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03581();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements UserVIPStatisticsInfoNetV2OrBuilder {
            private int bitField0_;
            private long lAverageLoseStacks_;
            private long lAverageWinStacks_;
            private long lDays_;
            private long lTotalBuyin_;
            private long lTotalRemain_;
            private Object sRank_;

            static {
                fixHelper.fixfunc(new int[]{3688, 3689, 3690, 3691, 3692, 3693, 3694, 3695, 3696, 3697, 3698, 3699, 3700, 3701, 3702, 3703, 3704, 3705, 3706, 3707, 3708, 3709, 3710, 3711, 3712, 3713, 3714, 3715, 3716, 3717, 3718, 3719, 3720, 3721, 3722, 3723, 3724, 3725, 3726, 3727, 3728, 3729, 3730, 3731, 3732, 3733, 3734, 3735, 3736, 3737, 3738, 3739, 3740, 3741, 3742, 3743, 3744, 3745});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m8330build();

            public final native UserVIPStatisticsInfoNetV2 m8331build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m8332buildPartial();

            public final native UserVIPStatisticsInfoNetV2 m8333buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8334clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8335clear();

            public final native Builder m8336clear();

            public final native Builder clearLAverageLoseStacks();

            public final native Builder clearLAverageWinStacks();

            public final native Builder clearLDays();

            public final native Builder clearLTotalBuyin();

            public final native Builder clearLTotalRemain();

            public final native Builder clearSRank();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8337clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8338clone();

            public final native Builder m8339clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m8340getDefaultInstanceForType();

            public final native UserVIPStatisticsInfoNetV2 m8341getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLAverageLoseStacks();

            public final native long getLAverageWinStacks();

            public final native long getLDays();

            public final native long getLTotalBuyin();

            public final native long getLTotalRemain();

            public final native String getSRank();

            public final native ByteString getSRankBytes();

            public final native boolean hasLAverageLoseStacks();

            public final native boolean hasLAverageWinStacks();

            public final native boolean hasLDays();

            public final native boolean hasLTotalBuyin();

            public final native boolean hasLTotalRemain();

            public final native boolean hasSRank();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8342mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m8343mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8344mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8345mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m8346mergeFrom(Message message);

            public final native Builder mergeFrom(UserVIPStatisticsInfoNetV2 userVIPStatisticsInfoNetV2);

            public final native Builder setLAverageLoseStacks(long j);

            public final native Builder setLAverageWinStacks(long j);

            public final native Builder setLDays(long j);

            public final native Builder setLTotalBuyin(long j);

            public final native Builder setLTotalRemain(long j);

            public final native Builder setSRank(String str);

            public final native Builder setSRankBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpUser.f314s;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17930, 17931, 17932, 17933, 17934, 17935, 17936, 17937, 17938, 17939, 17940, 17941, 17942, 17943, 17944, 17945, 17946, 17947, 17948, 17949, 17950, 17951, 17952, 17953, 17954, 17955, 17956, 17957, 17958, 17959, 17960, 17961, 17962, 17963, 17964, 17965, 17966});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UserVIPStatisticsInfoNetV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ UserVIPStatisticsInfoNetV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, UserVIPStatisticsInfoNetV2 userVIPStatisticsInfoNetV2);

        private native UserVIPStatisticsInfoNetV2(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ UserVIPStatisticsInfoNetV2(com.google.protobuf.GeneratedMessage.Builder builder, UserVIPStatisticsInfoNetV2 userVIPStatisticsInfoNetV2);

        private native UserVIPStatisticsInfoNetV2(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m8323getDefaultInstanceForType();

        public final native UserVIPStatisticsInfoNetV2 m8324getDefaultInstanceForType();

        public final native long getLAverageLoseStacks();

        public final native long getLAverageWinStacks();

        public final native long getLDays();

        public final native long getLTotalBuyin();

        public final native long getLTotalRemain();

        public final native Parser<UserVIPStatisticsInfoNetV2> getParserForType();

        public final native String getSRank();

        public final native ByteString getSRankBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasLAverageLoseStacks();

        public final native boolean hasLAverageWinStacks();

        public final native boolean hasLDays();

        public final native boolean hasLTotalBuyin();

        public final native boolean hasLTotalRemain();

        public final native boolean hasSRank();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8325newBuilderForType();

        public final native Builder m8326newBuilderForType();

        protected final native Builder m8327newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m8328toBuilder();

        public final native Builder m8329toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static UserVIPStatisticsInfoNetV2 getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpUser.f314s;
        }

        static void __clinit__() {
            PARSER = new C03581();
            UserVIPStatisticsInfoNetV2 userVIPStatisticsInfoNetV2 = new UserVIPStatisticsInfoNetV2(true);
            defaultInstance = userVIPStatisticsInfoNetV2;
            userVIPStatisticsInfoNetV2.initFields();
        }

        public static UserVIPStatisticsInfoNetV2 parseFrom(ByteString byteString) {
            return (UserVIPStatisticsInfoNetV2) PARSER.parseFrom(byteString);
        }

        public static UserVIPStatisticsInfoNetV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVIPStatisticsInfoNetV2) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserVIPStatisticsInfoNetV2 parseFrom(byte[] bArr) {
            return (UserVIPStatisticsInfoNetV2) PARSER.parseFrom(bArr);
        }

        public static UserVIPStatisticsInfoNetV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVIPStatisticsInfoNetV2) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserVIPStatisticsInfoNetV2 parseFrom(InputStream inputStream) {
            return (UserVIPStatisticsInfoNetV2) PARSER.parseFrom(inputStream);
        }

        public static UserVIPStatisticsInfoNetV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVIPStatisticsInfoNetV2) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static UserVIPStatisticsInfoNetV2 parseDelimitedFrom(InputStream inputStream) {
            return (UserVIPStatisticsInfoNetV2) PARSER.parseDelimitedFrom(inputStream);
        }

        public static UserVIPStatisticsInfoNetV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVIPStatisticsInfoNetV2) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static UserVIPStatisticsInfoNetV2 parseFrom(CodedInputStream codedInputStream) {
            return (UserVIPStatisticsInfoNetV2) PARSER.parseFrom(codedInputStream);
        }

        public static UserVIPStatisticsInfoNetV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVIPStatisticsInfoNetV2) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(UserVIPStatisticsInfoNetV2 userVIPStatisticsInfoNetV2) {
            return newBuilder().mergeFrom(userVIPStatisticsInfoNetV2);
        }
    }

    public static FileDescriptor m303a() {
        return ba;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TexasPokerCommon.m11a()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018TexasPokerHttpUser.proto\u0012\ntexaspoker\u001a\u0016TexasPokerCommon.proto\"\u0081\u0001\n\u000fCSUploadSGScore\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000blPopularity\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tiBetTimes\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tiWinTimes\u0018\u0004 \u0002(\u0005\u0012\u0017\n\u000fiDoubleWinTimes\u0018\u0005 \u0002(\u0005\u0012\f\n\u0004lMsg\u0018\u0006 \u0001(\u0003\"f\n\u0012SCUploadSGScoreRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0013\n\u000blPopularity\u0018\u0002 \u0001(\u0003\u0012\f\n\u0004lMsg\u0018\u0003 \u0001(\u0003\" \n\u0010CSGetLoginReward\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"\u00a2\u0001\n\u0013SCGetLoginRewardRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_T", "YPE\u0012\u0013\n\u000blPopularity\u0018\u0002 \u0001(\u0003\u0012\r\n\u0005lCoin\u0018\u0003 \u0001(\u0003\u0012\u0016\n\u000elAddPopularity\u0018\u0004 \u0001(\u0003\u0012\u0010\n\blAddCoin\u0018\u0005 \u0001(\u0003\u0012\u000e\n\u0006vCards\u0018\u0006 \u0003(\u0005\"\u001d\n\rCSLoginReward\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"W\n\u0010SCLoginRewardRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0014\n\fbLoginReward\u0018\u0002 \u0001(\u0005\"\u00d0\u0001\n\u0015UserStatisticsInfoNet\u0012\u0013\n\u000blTotalTimes\u0018\u0001 \u0002(\u0003\u0012\u0011\n\tlWinTimes\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tlAllInNum\u0018\u0003 \u0002(\u0003\u0012\u0010\n\blVPIPNum\u0018\u0004 \u0002(\u0003\u0012\u000f\n\u0007lETFNum\u0018\u0005 \u0002(\u0003\u0012\u0010\n\blWVSDNum\u0018\u0006 \u0002(\u0003\u0012\u0010\n\blWTSDNum\u0018\u0007 \u0002(\u0003\u0012\u0010\n\blMaxGame\u0018\b \u0001(\u0003\u0012\u0010\n\blMaxT", "urn\u0018\t \u0001(\u0003\u0012\u0011\n\tvMaxCards\u0018\n \u0003(\u0005\"\u00d6\u0002\n\u0018UserVIPStatisticsInfoNet\u0012\u000f\n\u0007lBetNum\u0018\u0001 \u0002(\u0003\u0012\u0011\n\tlRaiseNum\u0018\u0002 \u0002(\u0003\u0012\u0010\n\blCallNum\u0018\u0003 \u0002(\u0003\u0012\u0011\n\tlStoleNum\u0018\u0004 \u0002(\u0003\u0012\u0015\n\rlOpenRaiseNum\u0018\u0005 \u0002(\u0003\u0012\u0010\n\bl3BetNum\u0018\u0006 \u0002(\u0003\u0012\u0014\n\flBe3BetedNum\u0018\u0007 \u0002(\u0003\u0012\u0014\n\fl3BetDropNum\u0018\b \u0002(\u0003\u0012\u0010\n\blCBetNum\u0018\t \u0002(\u0003\u0012\u0014\n\flBeCBetedNum\u0018\n \u0002(\u0003\u0012\u0014\n\flCBetDropNum\u0018\u000b \u0002(\u0003\u0012\u0017\n\u000flPreFlopCallNum\u0018\f \u0002(\u0003\u0012\u0013\n\u000blDonkbetNum\u0018\r \u0002(\u0003\u0012\u0017\n\u000flBeDonkBetedNum\u0018\u000e \u0002(\u0003\u0012\u0017\n\u000flDonkBetDropNum\u0018\u000f \u0002(\u0003\"\u007f\n\u0017UserStatisticsInfoNetV2", "\u0012\u0013\n\u000blTotalGames\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000blTotalHands\u0018\u0002 \u0002(\u0003\u0012\u0010\n\blVPIPNum\u0018\u0003 \u0002(\u0003\u0012\u0011\n\tlWinTimes\u0018\u0004 \u0002(\u0003\u0012\u0015\n\rlBelongClubID\u0018\u0005 \u0001(\u0003\"\u009c\u0001\n\u001aUserVIPStatisticsInfoNetV2\u0012\u0013\n\u000blTotalBuyin\u0018\u0001 \u0002(\u0003\u0012\u0014\n\flTotalRemain\u0018\u0002 \u0002(\u0003\u0012\u0019\n\u0011lAverageWinStacks\u0018\u0003 \u0002(\u0003\u0012\u001a\n\u0012lAverageLoseStacks\u0018\u0004 \u0002(\u0003\u0012\r\n\u0005sRank\u0018\u0005 \u0002(\t\u0012\r\n\u0005lDays\u0018\u0006 \u0002(\u0003\"\u0081\u0001\n\u0012AchievementInfoNet\u0012\u0016\n\u000eiAchievementID\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010sAchievementName\u0018\u0002 \u0002(\t\u0012\u0018\n\u0010sAchievementIcon\u0018\u0003 \u0001(\t\u0012\u001f\n\u0017sAchievementDescription\u0018\u0004 \u0001(\t\"\u0081\u0002\n\u000bUs", "erInfoNet\u0012/\n\nstBaseInfo\u0018\u0001 \u0002(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012?\n\u0014stUserStatisticsInfo\u0018\u0002 \u0001(\u000b2!.texaspoker.UserStatisticsInfoNet\u0012E\n\u0017stUserVipStatisticsInfo\u0018\u0003 \u0001(\u000b2$.texaspoker.UserVIPStatisticsInfoNet\u00129\n\u0011stAchievementInfo\u0018\u0004 \u0003(\u000b2\u001e.texaspoker.AchievementInfoNet\"\u0093\u0002\n\rUserInfoNetV2\u0012/\n\nstBaseInfo\u0018\u0001 \u0002(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012A\n\u0014stUserStatisticsInfo\u0018\u0002 \u0001(\u000b2#.texaspoker.UserStatisticsInfoNetV2\u0012E\n\u0018stClubUse", "rStatisticsInfo\u0018\u0003 \u0003(\u000b2#.texaspoker.UserStatisticsInfoNetV2\u0012G\n\u0017stUserVipStatisticsInfo\u0018\u0004 \u0001(\u000b2&.texaspoker.UserVIPStatisticsInfoNetV2\"D\n\u0011CSGetUserBaseInfo\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0010\n\blGetUuid\u0018\u0002 \u0002(\u0003\u0012\u000f\n\u0007bRemark\u0018\u0003 \u0001(\u0005\"\u008e\u0001\n\u0014SCGetUserBaseInfoRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00126\n\u0011stUserBaseInfoNet\u0018\u0002 \u0001(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012\u000f\n\u0007bRemark\u0018\u0003 \u0001(\u0005\"\u001d\n\rCSGetUserInfo\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"n\n\u0010SCGetUserInfoRsp\u0012-\n", "\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012+\n\nstUserInfo\u0018\u0002 \u0002(\u000b2\u0017.texaspoker.UserInfoNet\"S\n\u000fCSGetUserInfoV2\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0010\n\blGetUuid\u0018\u0002 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0003 \u0001(\u0003\u0012\u000f\n\u0007bRemark\u0018\u0004 \u0001(\u0005\"\u0083\u0001\n\u0012SCGetUserInfoV2Rsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012-\n\nstUserInfo\u0018\u0002 \u0002(\u000b2\u0019.texaspoker.UserInfoNetV2\u0012\u000f\n\u0007bRemark\u0018\u0003 \u0001(\u0005\"\u009d\u0001\n\u0010CSSetUserInfoNew\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0011\n\tsNickname\u0018\u0002 \u0002(\t\u0012\u000f\n\u0007iGender\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bsIconUrl\u0018\u0004 \u0002(\t\u0012\u0015\n", "\rsPhhoneNumber\u0018\u0005 \u0002(\t\u0012\r\n\u0005sDesc\u0018\u0006 \u0002(\t\u0012\r\n\u0005bMute\u0018\u0007 \u0001(\u0005\u0012\u0010\n\bbVibrate\u0018\b \u0001(\u0005\"\u00c1\u0001\n\u0013SCSetUserInfoNewRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0011\n\tsNickname\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007iGender\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bsIconUrl\u0018\u0004 \u0001(\t\u0012\u0015\n\rsPhhoneNumber\u0018\u0005 \u0001(\t\u0012\r\n\u0005sDesc\u0018\u0006 \u0001(\t\u0012\r\n\u0005bMute\u0018\u0007 \u0001(\u0005\u0012\u0010\n\bbVibrate\u0018\b \u0001(\u0005\"\u009a\u0001\n\rCSSetUserInfo\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0011\n\tsNickname\u0018\u0002 \u0002(\t\u0012\u000f\n\u0007iGender\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bsIconUrl\u0018\u0004 \u0002(\t\u0012\u0015\n\rsPhhoneNumber\u0018\u0005 \u0002(\t\u0012\r\n\u0005sDesc\u0018\u0006 \u0002(\t\u0012\r\n\u0005bMute\u0018\u0007 ", "\u0001(\u0005\u0012\u0010\n\bbVibrate\u0018\b \u0001(\u0005\"\u00be\u0001\n\u0010SCSetUserInfoRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0011\n\tsNickname\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007iGender\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bsIconUrl\u0018\u0004 \u0001(\t\u0012\u0015\n\rsPhhoneNumber\u0018\u0005 \u0001(\t\u0012\r\n\u0005sDesc\u0018\u0006 \u0001(\t\u0012\r\n\u0005bMute\u0018\u0007 \u0001(\u0005\u0012\u0010\n\bbVibrate\u0018\b \u0001(\u0005\"`\n\u0014CSSetUserInfoSetting\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\r\n\u0005iMute\u0018\u0002 \u0001(\u0005\u0012\u0010\n\biVibrate\u0018\u0003 \u0001(\u0005\u0012\u0019\n\u0011iFriendInviteMute\u0018\u0004 \u0001(\u0005\"\u0092\u0001\n\u0017SCSetUserInfoSettingRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\f\n\u0004uuid\u0018\u0002 \u0002(", "\u0003\u0012\r\n\u0005iMute\u0018\u0003 \u0001(\u0005\u0012\u0010\n\biVibrate\u0018\u0004 \u0001(\u0005\u0012\u0019\n\u0011iFriendInviteMute\u0018\u0005 \u0001(\u0005\"0\n\fCSUploadIcon\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0012\n\nvIconDatas\u0018\u0002 \u0001(\f\"i\n\u000fSCUploadIconRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0010\n\bsIconUrl\u0018\u0002 \u0001(\t\u0012\u0015\n\rsSmallIconUrl\u0018\u0003 \u0001(\t\"C\n\u0011CSUploadUserCover\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0012\n\nvIconDatas\u0018\u0002 \u0001(\f\u0012\f\n\u0004iPos\u0018\u0003 \u0001(\u0005\"o\n\u0014SCUploadUserCoverRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0014\n\fsSmallAlbums\u0018\u0002 \u0003(\t\u0012\u0012\n\nsBigAlbums\u0018\u0003 \u0003(\t", "\"/\n\u0011CSDeleteUserCover\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004iPos\u0018\u0002 \u0001(\u0005\"o\n\u0014SCDeleteUserCoverRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0014\n\fsSmallAlbums\u0018\u0002 \u0003(\t\u0012\u0012\n\nsBigAlbums\u0018\u0003 \u0003(\t\"\u00cd\u0001\n\u0011UploadUserInfoNet\u0012\u0010\n\bstrIDMD5\u0018\u0001 \u0002(\t\u0012\"\n\u0005eType\u0018\u0002 \u0002(\u000e2\u0013.texaspoker.ID_TYPE\u00129\n\u0011eUploadActionType\u0018\u0003 \u0002(\u000e2\u001e.texaspoker.UPLOAD_ACTION_TYPE\u0012\u0011\n\tsNickname\u0018\u0004 \u0001(\t\u0012\r\n\u0005sIcon\u0018\u0005 \u0001(\t\u0012\u000f\n\u0007iGender\u0018\u0006 \u0001(\u0005\u0012\u0014\n\fsPhonenumber\u0018\u0007 \u0001(\t\"\u00db\u0001\n\u0011UserFriendInfoNet\u00123\n\u000estUs", "erBaseInfo\u0018\u0001 \u0001(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012*\n\neUserState\u0018\u0002 \u0002(\u000e2\u0016.texaspoker.USER_STATE\u00123\n\feFriendState\u0018\u0003 \u0002(\u000e2\u001d.texaspoker.USER_FRIEND_STATE\u0012\u000f\n\u0007lRoomId\u0018\u0004 \u0002(\u0003\u0012\r\n\u0005iMute\u0018\u0005 \u0001(\u0005\u0012\u0010\n\biVibrate\u0018\u0006 \u0001(\u0005\"\u0099\u0001\n\u0016CSUploadFriendRelation\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012<\n\u000beUploadType\u0018\u0002 \u0002(\u000e2'.texaspoker.UPLOAD_FRIEND_RELATION_TYPE\u00123\n\fvFriendsInfo\u0018\u0003 \u0003(\u000b2\u001d.texaspoker.UploadUserInfoNet\"\u00bd\u0001\n\u0019SCUploadFriendRelationRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.t", "exaspoker.ERROR_CODE_TYPE\u0012<\n\u000beUploadType\u0018\u0002 \u0002(\u000e2'.texaspoker.UPLOAD_FRIEND_RELATION_TYPE\u00123\n\fvFriendsInfo\u0018\u0003 \u0003(\u000b2\u001d.texaspoker.UserFriendInfoNet\"Q\n\u0011CSGetFriendStatus\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012.\n\u0007eStatus\u0018\u0002 \u0002(\u000e2\u001d.texaspoker.USER_FRIEND_STATE\"z\n\u0014SCGetFriendStatusRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00123\n\fvFriendsInfo\u0018\u0002 \u0003(\u000b2\u001d.texaspoker.UserFriendInfoNet\"i\n\u000eCSInviteAction\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0012\n\nfrienduuid\u0018\u0002 \u0002(\u0003\u0012", "&\n\tePartyAct\u0018\u0003 \u0002(\u000e2\u0013.texaspoker.MSG_ACT\u0012\r\n\u0005sHint\u0018\u0004 \u0001(\t\"\u00ba\u0001\n\u0011SCInviteActionRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00123\n\fstInviteUser\u0018\u0002 \u0001(\u000b2\u001d.texaspoker.UserFriendInfoNet\u0012-\n\u0006bState\u0018\u0003 \u0001(\u000e2\u001d.texaspoker.USER_FRIEND_STATE\u0012\u0012\n\nstrMessage\u0018\u0004 \u0001(\t\"2\n\u000eCSRemoveFriend\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0012\n\nfriendUuid\u0018\u0002 \u0002(\u0003\"V\n\u0011SCRemoveFriendRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0012\n\nfriendUuid\u0018\u0002 \u0001(\u0003\"v\n\u000eCSSearchFrien", "d\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012,\n\u000beSearchType\u0018\u0002 \u0002(\u000e2\u0017.texaspoker.SEARCH_TYPE\u0012\u0013\n\u000bsSearchWord\u0018\u0003 \u0001(\t\u0012\u0013\n\u000blSearchUuid\u0018\u0004 \u0001(\u0003\"z\n\u0011SCSearchFriendRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00126\n\u000fvUserFriendIfos\u0018\u0002 \u0003(\u000b2\u001d.texaspoker.UserFriendInfoNet\"\u00df\u0001\n\rFriendPushMsg\u0012\u000e\n\u0006lMsgID\u0018\u0001 \u0002(\u0003\u0012;\n\u0012eFriendMessageType\u0018\u0002 \u0002(\u000e2\u001f.texaspoker.FRIEND_MESSAGE_TYPE\u0012/\n\nstFromUser\u0018\u0003 \u0002(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012-\n\bstToUser\u0018\u0004 \u0002(\u000b2\u001b.texaspok", "er.UserBaseInfoNet\u0012\f\n\u0004sMsg\u0018\u0005 \u0002(\t\u0012\u0013\n\u000blCreateTime\u0018\u0006 \u0001(\u0003\"=\n\u0011SCSystemFriendMsg\u0012(\n\u0005vMsgs\u0018\u0001 \u0003(\u000b2\u0019.texaspoker.FriendPushMsg\"5\n\u0014CSSystemFriendMsgRsp\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007vMsgIds\u0018\u0002 \u0003(\u0003\"0\n\rCSBuyNickname\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0011\n\tsNickname\u0018\u0002 \u0002(\t\"c\n\u0010SCBuyNicknameRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0011\n\tsNickname\u0018\u0002 \u0001(\t\u0012\r\n\u0005lCoin\u0018\u0003 \u0001(\u0003\"%\n\u0015CSCheckNicknameStatus\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"p\n\u0018SCCheckNicknameStatusRsp\u0012-\n\beErrCod", "e\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0011\n\tbModifyed\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nlSpendCoin\u0018\u0003 \u0001(\u0003\"O\n\u0014CSRemarkUserNickName\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0012\n\nremarkUuid\u0018\u0002 \u0002(\u0003\u0012\u0015\n\rsRemarContent\u0018\u0003 \u0002(\t\"s\n\u0017SCRemarkUserNickNameRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0012\n\nremarkUuid\u0018\u0002 \u0001(\u0003\u0012\u0015\n\rsRemarContent\u0018\u0003 \u0001(\t*R\n\u000bSEARCH_TYPE\u0012\u0018\n\u0014NICKNAME_SEARCH_TYPE\u0010\u0001\u0012\u0014\n\u0010UUID_SEARCH_TYPE\u0010\u0002\u0012\u0013\n\u000fALL_SEARCH_TYPE\u0010\u0003*\u0085\u0001\n\u001bUPLOAD_FRIEND_RELATION_TYPE\u0012\u001f\n\u001bUPLOAD_", "FRIEND_RELATION_SINA\u0010\u0001\u0012 \n\u001cUPLOAD_FRIEND_RELATION_PHONE\u0010\u0002\u0012#\n\u001fUPLOAD_FRIEND_RELATION_FACEBOOK\u0010\u0003*L\n\u0007MSG_ACT\u0012\u0015\n\u0011ACT_ACCEPT_INVITE\u0010\u0001\u0012\u0013\n\u000fACT_DENY_INVITE\u0010\u0002\u0012\u0015\n\u0011ACT_LAUNCH_INVITE\u0010\u0003*\u00ee\u0001\n\u0011USER_FRIEND_STATE\u0012\u001e\n\u001aUSER_FRIEND_STATE_NOT_USER\u0010\u0000\u0012 \n\u001cUSER_FRIEND_STATE_NOT_FRIEND\u0010\u0001\u0012\u001f\n\u001bUSER_FRIEND_STATE_RECOMMAND\u0010\u0002\u0012\u001c\n\u0018USER_FRIEND_STATE_FRIEND\u0010\u0003\u0012\u001d\n\u0019USER_FRIEND_STATE_INVITED\u0010\u0004\u0012\u001e\n\u001aUSER_FRIEND_STATE_INVITING\u0010\u0005\u0012\u0019\n\u0015USER_FRIEND", "_STATE_ALL\u0010\u0006*O\n\u0012UPLOAD_ACTION_TYPE\u0012\u001a\n\u0016UPLOAD_ACTION_TYPE_ADD\u0010\u0001\u0012\u001d\n\u0019UPLOAD_ACTION_TYPE_DELETE\u0010\u0002*g\n\nUSER_STATE\u0012\u0016\n\u0012USER_STATE_OFFLINE\u0010\u0001\u0012\u0015\n\u0011USER_STATE_ONLINE\u0010\u0002\u0012\u0015\n\u0011USER_STATE_GAMING\u0010\u0003\u0012\u0013\n\u000fUSER_STATE_ROOM\u0010\u0004*\u00ba\u0001\n\u0013FRIEND_MESSAGE_TYPE\u0012\u001a\n\u0016FRIEND_MESSAGE_INVITED\u0010\u0001\u0012 \n\u001cFRIEND_MESSAGE_ACCEPT_FRIEND\u0010\u0002\u0012\u001e\n\u001aFRIEND_MESSAGE_DENY_FRIEND\u0010\u0003\u0012 \n\u001cFRIEND_MESSAGE_DELETE_FRIEND\u0010\u0004\u0012#\n\u001fFRIEND_MESSAGE_RECOMMAND_FRIEND\u0010\u0005B+\n\u0015com.texas", "poker.momentB\u0012TexasPokerHttpUser"}, fileDescriptorArr, new C02991());
        f296a = (Descriptor) ba.getMessageTypes().get(0);
        f297b = new FieldAccessorTable(f296a, new String[]{"Uuid", "LPopularity", "IBetTimes", "IWinTimes", "IDoubleWinTimes", "LMsg"});
        f298c = (Descriptor) ba.getMessageTypes().get(1);
        f299d = new FieldAccessorTable(f298c, new String[]{"EErrCode", "LPopularity", "LMsg"});
        f300e = (Descriptor) ba.getMessageTypes().get(2);
        f301f = new FieldAccessorTable(f300e, new String[]{"Uuid"});
        f302g = (Descriptor) ba.getMessageTypes().get(3);
        f303h = new FieldAccessorTable(f302g, new String[]{"EErrCode", "LPopularity", "LCoin", "LAddPopularity", "LAddCoin", "VCards"});
        f304i = (Descriptor) ba.getMessageTypes().get(4);
        f305j = new FieldAccessorTable(f304i, new String[]{"Uuid"});
        f306k = (Descriptor) ba.getMessageTypes().get(5);
        f307l = new FieldAccessorTable(f306k, new String[]{"EErrCode", "BLoginReward"});
        f308m = (Descriptor) ba.getMessageTypes().get(6);
        f309n = new FieldAccessorTable(f308m, new String[]{"LTotalTimes", "LWinTimes", "LAllInNum", "LVPIPNum", "LETFNum", "LWVSDNum", "LWTSDNum", "LMaxGame", "LMaxTurn", "VMaxCards"});
        f310o = (Descriptor) ba.getMessageTypes().get(7);
        f311p = new FieldAccessorTable(f310o, new String[]{"LBetNum", "LRaiseNum", "LCallNum", "LStoleNum", "LOpenRaiseNum", "L3BetNum", "LBe3BetedNum", "L3BetDropNum", "LCBetNum", "LBeCBetedNum", "LCBetDropNum", "LPreFlopCallNum", "LDonkbetNum", "LBeDonkBetedNum", "LDonkBetDropNum"});
        f312q = (Descriptor) ba.getMessageTypes().get(8);
        f313r = new FieldAccessorTable(f312q, new String[]{"LTotalGames", "LTotalHands", "LVPIPNum", "LWinTimes", "LBelongClubID"});
        f314s = (Descriptor) ba.getMessageTypes().get(9);
        f315t = new FieldAccessorTable(f314s, new String[]{"LTotalBuyin", "LTotalRemain", "LAverageWinStacks", "LAverageLoseStacks", "SRank", "LDays"});
        f316u = (Descriptor) ba.getMessageTypes().get(10);
        f317v = new FieldAccessorTable(f316u, new String[]{"IAchievementID", "SAchievementName", "SAchievementIcon", "SAchievementDescription"});
        f318w = (Descriptor) ba.getMessageTypes().get(11);
        f319x = new FieldAccessorTable(f318w, new String[]{"StBaseInfo", "StUserStatisticsInfo", "StUserVipStatisticsInfo", "StAchievementInfo"});
        f320y = (Descriptor) ba.getMessageTypes().get(12);
        f321z = new FieldAccessorTable(f320y, new String[]{"StBaseInfo", "StUserStatisticsInfo", "StClubUserStatisticsInfo", "StUserVipStatisticsInfo"});
        f270A = (Descriptor) ba.getMessageTypes().get(13);
        f271B = new FieldAccessorTable(f270A, new String[]{"Uuid", "LGetUuid", "BRemark"});
        f272C = (Descriptor) ba.getMessageTypes().get(14);
        f273D = new FieldAccessorTable(f272C, new String[]{"EErrCode", "StUserBaseInfoNet", "BRemark"});
        f274E = (Descriptor) ba.getMessageTypes().get(15);
        f275F = new FieldAccessorTable(f274E, new String[]{"Uuid"});
        f276G = (Descriptor) ba.getMessageTypes().get(16);
        f277H = new FieldAccessorTable(f276G, new String[]{"EErrCode", "StUserInfo"});
        f278I = (Descriptor) ba.getMessageTypes().get(17);
        f279J = new FieldAccessorTable(f278I, new String[]{"Uuid", "LGetUuid", "LClubID", "BRemark"});
        f280K = (Descriptor) ba.getMessageTypes().get(18);
        f281L = new FieldAccessorTable(f280K, new String[]{"EErrCode", "StUserInfo", "BRemark"});
        f282M = (Descriptor) ba.getMessageTypes().get(19);
        f283N = new FieldAccessorTable(f282M, new String[]{"Uuid", "SNickname", "IGender", "SIconUrl", "SPhhoneNumber", "SDesc", "BMute", "BVibrate"});
        f284O = (Descriptor) ba.getMessageTypes().get(20);
        f285P = new FieldAccessorTable(f284O, new String[]{"EErrCode", "SNickname", "IGender", "SIconUrl", "SPhhoneNumber", "SDesc", "BMute", "BVibrate"});
        f286Q = (Descriptor) ba.getMessageTypes().get(21);
        f287R = new FieldAccessorTable(f286Q, new String[]{"Uuid", "SNickname", "IGender", "SIconUrl", "SPhhoneNumber", "SDesc", "BMute", "BVibrate"});
        f288S = (Descriptor) ba.getMessageTypes().get(22);
        f289T = new FieldAccessorTable(f288S, new String[]{"EErrCode", "SNickname", "IGender", "SIconUrl", "SPhhoneNumber", "SDesc", "BMute", "BVibrate"});
        f290U = (Descriptor) ba.getMessageTypes().get(23);
        f291V = new FieldAccessorTable(f290U, new String[]{"Uuid", "IMute", "IVibrate", "IFriendInviteMute"});
        f292W = (Descriptor) ba.getMessageTypes().get(24);
        f293X = new FieldAccessorTable(f292W, new String[]{"EErrCode", "Uuid", "IMute", "IVibrate", "IFriendInviteMute"});
        f294Y = (Descriptor) ba.getMessageTypes().get(25);
        f295Z = new FieldAccessorTable(f294Y, new String[]{"Uuid", "VIconDatas"});
        aa = (Descriptor) ba.getMessageTypes().get(26);
        ab = new FieldAccessorTable(aa, new String[]{"EErrCode", "SIconUrl", "SSmallIconUrl"});
        ac = (Descriptor) ba.getMessageTypes().get(27);
        ad = new FieldAccessorTable(ac, new String[]{"Uuid", "VIconDatas", "IPos"});
        ae = (Descriptor) ba.getMessageTypes().get(28);
        af = new FieldAccessorTable(ae, new String[]{"EErrCode", "SSmallAlbums", "SBigAlbums"});
        ag = (Descriptor) ba.getMessageTypes().get(29);
        ah = new FieldAccessorTable(ag, new String[]{"Uuid", "IPos"});
        ai = (Descriptor) ba.getMessageTypes().get(30);
        aj = new FieldAccessorTable(ai, new String[]{"EErrCode", "SSmallAlbums", "SBigAlbums"});
        ak = (Descriptor) ba.getMessageTypes().get(31);
        al = new FieldAccessorTable(ak, new String[]{"StrIDMD5", "EType", "EUploadActionType", "SNickname", "SIcon", "IGender", "SPhonenumber"});
        am = (Descriptor) ba.getMessageTypes().get(32);
        an = new FieldAccessorTable(am, new String[]{"StUserBaseInfo", "EUserState", "EFriendState", "LRoomId", "IMute", "IVibrate"});
        ao = (Descriptor) ba.getMessageTypes().get(33);
        ap = new FieldAccessorTable(ao, new String[]{"Uuid", "EUploadType", "VFriendsInfo"});
        aq = (Descriptor) ba.getMessageTypes().get(34);
        ar = new FieldAccessorTable(aq, new String[]{"EErrCode", "EUploadType", "VFriendsInfo"});
        as = (Descriptor) ba.getMessageTypes().get(35);
        at = new FieldAccessorTable(as, new String[]{"Uuid", "EStatus"});
        au = (Descriptor) ba.getMessageTypes().get(36);
        av = new FieldAccessorTable(au, new String[]{"EErrCode", "VFriendsInfo"});
        aw = (Descriptor) ba.getMessageTypes().get(37);
        ax = new FieldAccessorTable(aw, new String[]{"Uuid", "Frienduuid", "EPartyAct", "SHint"});
        ay = (Descriptor) ba.getMessageTypes().get(38);
        az = new FieldAccessorTable(ay, new String[]{"EErrCode", "StInviteUser", "BState", "StrMessage"});
        aA = (Descriptor) ba.getMessageTypes().get(39);
        aB = new FieldAccessorTable(aA, new String[]{"Uuid", "FriendUuid"});
        aC = (Descriptor) ba.getMessageTypes().get(40);
        aD = new FieldAccessorTable(aC, new String[]{"EErrCode", "FriendUuid"});
        aE = (Descriptor) ba.getMessageTypes().get(41);
        aF = new FieldAccessorTable(aE, new String[]{"Uuid", "ESearchType", "SSearchWord", "LSearchUuid"});
        aG = (Descriptor) ba.getMessageTypes().get(42);
        aH = new FieldAccessorTable(aG, new String[]{"EErrCode", "VUserFriendIfos"});
        aI = (Descriptor) ba.getMessageTypes().get(43);
        aJ = new FieldAccessorTable(aI, new String[]{"LMsgID", "EFriendMessageType", "StFromUser", "StToUser", "SMsg", "LCreateTime"});
        aK = (Descriptor) ba.getMessageTypes().get(44);
        aL = new FieldAccessorTable(aK, new String[]{"VMsgs"});
        aM = (Descriptor) ba.getMessageTypes().get(45);
        aN = new FieldAccessorTable(aM, new String[]{"Uuid", "VMsgIds"});
        aO = (Descriptor) ba.getMessageTypes().get(46);
        aP = new FieldAccessorTable(aO, new String[]{"Uuid", "SNickname"});
        aQ = (Descriptor) ba.getMessageTypes().get(47);
        aR = new FieldAccessorTable(aQ, new String[]{"EErrCode", "SNickname", "LCoin"});
        aS = (Descriptor) ba.getMessageTypes().get(48);
        aT = new FieldAccessorTable(aS, new String[]{"Uuid"});
        aU = (Descriptor) ba.getMessageTypes().get(49);
        aV = new FieldAccessorTable(aU, new String[]{"EErrCode", "BModifyed", "LSpendCoin"});
        aW = (Descriptor) ba.getMessageTypes().get(50);
        aX = new FieldAccessorTable(aW, new String[]{"Uuid", "RemarkUuid", "SRemarContent"});
        aY = (Descriptor) ba.getMessageTypes().get(51);
        aZ = new FieldAccessorTable(aY, new String[]{"EErrCode", "RemarkUuid", "SRemarContent"});
        TexasPokerCommon.m11a();
    }
}
