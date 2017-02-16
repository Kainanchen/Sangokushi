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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo;
import com.texaspoker.moment.TexasPokerCommon.ClubBaseInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;
import java.util.List;

public final class TexasPokerHttpLeague {
    private static final Descriptor f174A;
    private static FieldAccessorTable f175B;
    private static final Descriptor f176C;
    private static FieldAccessorTable f177D;
    private static final Descriptor f178E;
    private static FieldAccessorTable f179F;
    private static final Descriptor f180G;
    private static FieldAccessorTable f181H;
    private static final Descriptor f182I;
    private static FieldAccessorTable f183J;
    private static final Descriptor f184K;
    private static FieldAccessorTable f185L;
    private static final Descriptor f186M;
    private static FieldAccessorTable f187N;
    private static final Descriptor f188O;
    private static FieldAccessorTable f189P;
    private static final Descriptor f190Q;
    private static FieldAccessorTable f191R;
    private static final Descriptor f192S;
    private static FieldAccessorTable f193T;
    private static final Descriptor f194U;
    private static FieldAccessorTable f195V;
    private static final Descriptor f196W;
    private static FieldAccessorTable f197X;
    private static FileDescriptor f198Y;
    private static final Descriptor f199a;
    private static FieldAccessorTable f200b;
    private static final Descriptor f201c;
    private static FieldAccessorTable f202d;
    private static final Descriptor f203e;
    private static FieldAccessorTable f204f;
    private static final Descriptor f205g;
    private static FieldAccessorTable f206h;
    private static final Descriptor f207i;
    private static FieldAccessorTable f208j;
    private static final Descriptor f209k;
    private static FieldAccessorTable f210l;
    private static final Descriptor f211m;
    private static FieldAccessorTable f212n;
    private static final Descriptor f213o;
    private static FieldAccessorTable f214p;
    private static final Descriptor f215q;
    private static FieldAccessorTable f216r;
    private static final Descriptor f217s;
    private static FieldAccessorTable f218t;
    private static final Descriptor f219u;
    private static FieldAccessorTable f220v;
    private static final Descriptor f221w;
    private static FieldAccessorTable f222x;
    private static final Descriptor f223y;
    private static FieldAccessorTable f224z;

    /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.1 */
    class C02431 implements InternalDescriptorAssigner {
        static {
            fixHelper.fixfunc(new int[]{21337, 21338});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C02431();

        public final native ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
    }

    public interface CSAddLeagueMaxMemberOrBuilder extends MessageOrBuilder {
        int getINum();

        long getLClubID();

        long getLLeagueID();

        long getUuid();

        boolean hasINum();

        boolean hasLClubID();

        boolean hasLLeagueID();

        boolean hasUuid();
    }

    public static final class CSAddLeagueMaxMember extends GeneratedMessage implements CSAddLeagueMaxMemberOrBuilder {
        public static final int INUM_FIELD_NUMBER = 4;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static final int LLEAGUEID_FIELD_NUMBER = 3;
        public static Parser<CSAddLeagueMaxMember> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSAddLeagueMaxMember defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iNum_;
        private long lClubID_;
        private long lLeagueID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSAddLeagueMaxMember.1 */
        class C02441 extends AbstractParser<CSAddLeagueMaxMember> {
            static {
                fixHelper.fixfunc(new int[]{16595, 16596});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02441();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSAddLeagueMaxMemberOrBuilder {
            private int bitField0_;
            private int iNum_;
            private long lClubID_;
            private long lLeagueID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{11382, 11383, 11384, 11385, 11386, 11387, 11388, 11389, 11390, 11391, 11392, 11393, 11394, 11395, 11396, 11397, 11398, 11399, 11400, 11401, 11402, 11403, 11404, 11405, 11406, 11407, 11408, 11409, 11410, 11411, 11412, 11413, 11414, 11415, 11416, 11417, 11418, 11419, 11420, 11421, 11422, 11423, 11424, 11425, 11426, 11427, 11428, 11429});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3925build();

            public final native CSAddLeagueMaxMember m3926build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3927buildPartial();

            public final native CSAddLeagueMaxMember m3928buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3929clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3930clear();

            public final native Builder m3931clear();

            public final native Builder clearINum();

            public final native Builder clearLClubID();

            public final native Builder clearLLeagueID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3932clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3933clone();

            public final native Builder m3934clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3935getDefaultInstanceForType();

            public final native CSAddLeagueMaxMember m3936getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getINum();

            public final native long getLClubID();

            public final native long getLLeagueID();

            public final native long getUuid();

            public final native boolean hasINum();

            public final native boolean hasLClubID();

            public final native boolean hasLLeagueID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3937mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3938mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3939mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3940mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3941mergeFrom(Message message);

            public final native Builder mergeFrom(CSAddLeagueMaxMember cSAddLeagueMaxMember);

            public final native Builder setINum(int i);

            public final native Builder setLClubID(long j);

            public final native Builder setLLeagueID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f188O;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7996, 7997, 7998, 7999, 8000, 8001, 8002, 8003, 8004, 8005, 8006, 8007, 8008, 8009, 8010, 8011, 8012, 8013, 8014, 8015, 8016, 8017, 8018, 8019, 8020, 8021, 8022, 8023, 8024, 8025, 8026, 8027});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSAddLeagueMaxMember(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSAddLeagueMaxMember(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSAddLeagueMaxMember cSAddLeagueMaxMember);

        private native CSAddLeagueMaxMember(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSAddLeagueMaxMember(com.google.protobuf.GeneratedMessage.Builder builder, CSAddLeagueMaxMember cSAddLeagueMaxMember);

        private native CSAddLeagueMaxMember(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3918getDefaultInstanceForType();

        public final native CSAddLeagueMaxMember m3919getDefaultInstanceForType();

        public final native int getINum();

        public final native long getLClubID();

        public final native long getLLeagueID();

        public final native Parser<CSAddLeagueMaxMember> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasINum();

        public final native boolean hasLClubID();

        public final native boolean hasLLeagueID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3920newBuilderForType();

        public final native Builder m3921newBuilderForType();

        protected final native Builder m3922newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3923toBuilder();

        public final native Builder m3924toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSAddLeagueMaxMember getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f188O;
        }

        static void __clinit__() {
            PARSER = new C02441();
            CSAddLeagueMaxMember cSAddLeagueMaxMember = new CSAddLeagueMaxMember(true);
            defaultInstance = cSAddLeagueMaxMember;
            cSAddLeagueMaxMember.initFields();
        }

        public static CSAddLeagueMaxMember parseFrom(ByteString byteString) {
            return (CSAddLeagueMaxMember) PARSER.parseFrom(byteString);
        }

        public static CSAddLeagueMaxMember parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddLeagueMaxMember) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSAddLeagueMaxMember parseFrom(byte[] bArr) {
            return (CSAddLeagueMaxMember) PARSER.parseFrom(bArr);
        }

        public static CSAddLeagueMaxMember parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddLeagueMaxMember) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSAddLeagueMaxMember parseFrom(InputStream inputStream) {
            return (CSAddLeagueMaxMember) PARSER.parseFrom(inputStream);
        }

        public static CSAddLeagueMaxMember parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddLeagueMaxMember) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSAddLeagueMaxMember parseDelimitedFrom(InputStream inputStream) {
            return (CSAddLeagueMaxMember) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSAddLeagueMaxMember parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddLeagueMaxMember) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSAddLeagueMaxMember parseFrom(CodedInputStream codedInputStream) {
            return (CSAddLeagueMaxMember) PARSER.parseFrom(codedInputStream);
        }

        public static CSAddLeagueMaxMember parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSAddLeagueMaxMember) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSAddLeagueMaxMember cSAddLeagueMaxMember) {
            return newBuilder().mergeFrom(cSAddLeagueMaxMember);
        }
    }

    public interface CSCreateLeagueOrBuilder extends MessageOrBuilder {
        long getLClubID();

        String getSLeagueName();

        ByteString getSLeagueNameBytes();

        long getUuid();

        boolean hasLClubID();

        boolean hasSLeagueName();

        boolean hasUuid();
    }

    public static final class CSCreateLeague extends GeneratedMessage implements CSCreateLeagueOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSCreateLeague> PARSER = null;
        public static final int SLEAGUENAME_FIELD_NUMBER = 3;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSCreateLeague defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sLeagueName_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSCreateLeague.1 */
        class C02451 extends AbstractParser<CSCreateLeague> {
            static {
                fixHelper.fixfunc(new int[]{4534, 4535});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02451();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSCreateLeagueOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private Object sLeagueName_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{16000, 16001, 16002, 16003, 16004, 16005, 16006, 16007, 16008, 16009, 16010, 16011, 16012, 16013, 16014, 16015, 16016, 16017, 16018, 16019, 16020, 16021, 16022, 16023, 16024, 16025, 16026, 16027, 16028, 16029, 16030, 16031, 16032, 16033, 16034, 16035, 16036, 16037, 16038, 16039, 16040, 16041, 16042, 16043, 16044, 16045});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3949build();

            public final native CSCreateLeague m3950build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3951buildPartial();

            public final native CSCreateLeague m3952buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3953clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3954clear();

            public final native Builder m3955clear();

            public final native Builder clearLClubID();

            public final native Builder clearSLeagueName();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3956clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3957clone();

            public final native Builder m3958clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3959getDefaultInstanceForType();

            public final native CSCreateLeague m3960getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native String getSLeagueName();

            public final native ByteString getSLeagueNameBytes();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasSLeagueName();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3961mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3962mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3963mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3964mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3965mergeFrom(Message message);

            public final native Builder mergeFrom(CSCreateLeague cSCreateLeague);

            public final native Builder setLClubID(long j);

            public final native Builder setSLeagueName(String str);

            public final native Builder setSLeagueNameBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f203e;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14799, 14800, 14801, 14802, 14803, 14804, 14805, 14806, 14807, 14808, 14809, 14810, 14811, 14812, 14813, 14814, 14815, 14816, 14817, 14818, 14819, 14820, 14821, 14822, 14823, 14824, 14825, 14826, 14827, 14828, 14829});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSCreateLeague(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSCreateLeague(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSCreateLeague cSCreateLeague);

        private native CSCreateLeague(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSCreateLeague(com.google.protobuf.GeneratedMessage.Builder builder, CSCreateLeague cSCreateLeague);

        private native CSCreateLeague(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3942getDefaultInstanceForType();

        public final native CSCreateLeague m3943getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSCreateLeague> getParserForType();

        public final native String getSLeagueName();

        public final native ByteString getSLeagueNameBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasSLeagueName();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3944newBuilderForType();

        public final native Builder m3945newBuilderForType();

        protected final native Builder m3946newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3947toBuilder();

        public final native Builder m3948toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSCreateLeague getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f203e;
        }

        static void __clinit__() {
            PARSER = new C02451();
            CSCreateLeague cSCreateLeague = new CSCreateLeague(true);
            defaultInstance = cSCreateLeague;
            cSCreateLeague.initFields();
        }

        public static CSCreateLeague parseFrom(ByteString byteString) {
            return (CSCreateLeague) PARSER.parseFrom(byteString);
        }

        public static CSCreateLeague parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCreateLeague) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSCreateLeague parseFrom(byte[] bArr) {
            return (CSCreateLeague) PARSER.parseFrom(bArr);
        }

        public static CSCreateLeague parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCreateLeague) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSCreateLeague parseFrom(InputStream inputStream) {
            return (CSCreateLeague) PARSER.parseFrom(inputStream);
        }

        public static CSCreateLeague parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCreateLeague) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSCreateLeague parseDelimitedFrom(InputStream inputStream) {
            return (CSCreateLeague) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSCreateLeague parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCreateLeague) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSCreateLeague parseFrom(CodedInputStream codedInputStream) {
            return (CSCreateLeague) PARSER.parseFrom(codedInputStream);
        }

        public static CSCreateLeague parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSCreateLeague) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSCreateLeague cSCreateLeague) {
            return newBuilder().mergeFrom(cSCreateLeague);
        }
    }

    public interface CSEnterLeagueOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getLLeagueID();

        String getSHint();

        ByteString getSHintBytes();

        long getUuid();

        boolean hasLClubID();

        boolean hasLLeagueID();

        boolean hasSHint();

        boolean hasUuid();
    }

    public static final class CSEnterLeague extends GeneratedMessage implements CSEnterLeagueOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static final int LLEAGUEID_FIELD_NUMBER = 3;
        public static Parser<CSEnterLeague> PARSER = null;
        public static final int SHINT_FIELD_NUMBER = 4;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSEnterLeague defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private long lLeagueID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sHint_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSEnterLeague.1 */
        class C02461 extends AbstractParser<CSEnterLeague> {
            static {
                fixHelper.fixfunc(new int[]{19301, 19302});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02461();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSEnterLeagueOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long lLeagueID_;
            private Object sHint_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{17122, 17123, 17124, 17125, 17126, 17127, 17128, 17129, 17130, 17131, 17132, 17133, 17134, 17135, 17136, 17137, 17138, 17139, 17140, 17141, 17142, 17143, 17144, 17145, 17146, 17147, 17148, 17149, 17150, 17151, 17152, 17153, 17154, 17155, 17156, 17157, 17158, 17159, 17160, 17161, 17162, 17163, 17164, 17165, 17166, 17167, 17168, 17169, 17170, 17171});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3973build();

            public final native CSEnterLeague m3974build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3975buildPartial();

            public final native CSEnterLeague m3976buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3977clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3978clear();

            public final native Builder m3979clear();

            public final native Builder clearLClubID();

            public final native Builder clearLLeagueID();

            public final native Builder clearSHint();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3980clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3981clone();

            public final native Builder m3982clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3983getDefaultInstanceForType();

            public final native CSEnterLeague m3984getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getLLeagueID();

            public final native String getSHint();

            public final native ByteString getSHintBytes();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasLLeagueID();

            public final native boolean hasSHint();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3985mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3986mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3987mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3988mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3989mergeFrom(Message message);

            public final native Builder mergeFrom(CSEnterLeague cSEnterLeague);

            public final native Builder setLClubID(long j);

            public final native Builder setLLeagueID(long j);

            public final native Builder setSHint(String str);

            public final native Builder setSHintBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f207i;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{26351, 26352, 26353, 26354, 26355, 26356, 26357, 26358, 26359, 26360, 26361, 26362, 26363, 26364, 26365, 26366, 26367, 26368, 26369, 26370, 26371, 26372, 26373, 26374, 26375, 26376, 26377, 26378, 26379, 26380, 26381, 26382, 26383});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSEnterLeague(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSEnterLeague(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSEnterLeague cSEnterLeague);

        private native CSEnterLeague(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSEnterLeague(com.google.protobuf.GeneratedMessage.Builder builder, CSEnterLeague cSEnterLeague);

        private native CSEnterLeague(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3966getDefaultInstanceForType();

        public final native CSEnterLeague m3967getDefaultInstanceForType();

        public final native long getLClubID();

        public final native long getLLeagueID();

        public final native Parser<CSEnterLeague> getParserForType();

        public final native String getSHint();

        public final native ByteString getSHintBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasLLeagueID();

        public final native boolean hasSHint();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3968newBuilderForType();

        public final native Builder m3969newBuilderForType();

        protected final native Builder m3970newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3971toBuilder();

        public final native Builder m3972toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSEnterLeague getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f207i;
        }

        static void __clinit__() {
            PARSER = new C02461();
            CSEnterLeague cSEnterLeague = new CSEnterLeague(true);
            defaultInstance = cSEnterLeague;
            cSEnterLeague.initFields();
        }

        public static CSEnterLeague parseFrom(ByteString byteString) {
            return (CSEnterLeague) PARSER.parseFrom(byteString);
        }

        public static CSEnterLeague parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSEnterLeague) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSEnterLeague parseFrom(byte[] bArr) {
            return (CSEnterLeague) PARSER.parseFrom(bArr);
        }

        public static CSEnterLeague parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSEnterLeague) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSEnterLeague parseFrom(InputStream inputStream) {
            return (CSEnterLeague) PARSER.parseFrom(inputStream);
        }

        public static CSEnterLeague parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSEnterLeague) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSEnterLeague parseDelimitedFrom(InputStream inputStream) {
            return (CSEnterLeague) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSEnterLeague parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSEnterLeague) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSEnterLeague parseFrom(CodedInputStream codedInputStream) {
            return (CSEnterLeague) PARSER.parseFrom(codedInputStream);
        }

        public static CSEnterLeague parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSEnterLeague) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSEnterLeague cSEnterLeague) {
            return newBuilder().mergeFrom(cSEnterLeague);
        }
    }

    public interface CSGetLeagueBaseInfoByLeagueIDOrBuilder extends MessageOrBuilder {
        long getLLeagueID();

        long getUuid();

        boolean hasLLeagueID();

        boolean hasUuid();
    }

    public static final class CSGetLeagueBaseInfoByLeagueID extends GeneratedMessage implements CSGetLeagueBaseInfoByLeagueIDOrBuilder {
        public static final int LLEAGUEID_FIELD_NUMBER = 2;
        public static Parser<CSGetLeagueBaseInfoByLeagueID> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetLeagueBaseInfoByLeagueID defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lLeagueID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSGetLeagueBaseInfoByLeagueID.1 */
        class C02471 extends AbstractParser<CSGetLeagueBaseInfoByLeagueID> {
            static {
                fixHelper.fixfunc(new int[]{9300, 9301});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02471();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetLeagueBaseInfoByLeagueIDOrBuilder {
            private int bitField0_;
            private long lLeagueID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{15553, 15554, 15555, 15556, 15557, 15558, 15559, 15560, 15561, 15562, 15563, 15564, 15565, 15566, 15567, 15568, 15569, 15570, 15571, 15572, 15573, 15574, 15575, 15576, 15577, 15578, 15579, 15580, 15581, 15582, 15583, 15584, 15585, 15586, 15587, 15588, 15589, 15590, 15591, 15592});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3997build();

            public final native CSGetLeagueBaseInfoByLeagueID m3998build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3999buildPartial();

            public final native CSGetLeagueBaseInfoByLeagueID m4000buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4001clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4002clear();

            public final native Builder m4003clear();

            public final native Builder clearLLeagueID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4004clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4005clone();

            public final native Builder m4006clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4007getDefaultInstanceForType();

            public final native CSGetLeagueBaseInfoByLeagueID m4008getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLLeagueID();

            public final native long getUuid();

            public final native boolean hasLLeagueID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4009mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4010mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4011mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4012mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4013mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetLeagueBaseInfoByLeagueID cSGetLeagueBaseInfoByLeagueID);

            public final native Builder setLLeagueID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f176C;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{5287, 5288, 5289, 5290, 5291, 5292, 5293, 5294, 5295, 5296, 5297, 5298, 5299, 5300, 5301, 5302, 5303, 5304, 5305, 5306, 5307, 5308, 5309, 5310, 5311, 5312, 5313, 5314});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetLeagueBaseInfoByLeagueID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetLeagueBaseInfoByLeagueID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetLeagueBaseInfoByLeagueID cSGetLeagueBaseInfoByLeagueID);

        private native CSGetLeagueBaseInfoByLeagueID(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetLeagueBaseInfoByLeagueID(com.google.protobuf.GeneratedMessage.Builder builder, CSGetLeagueBaseInfoByLeagueID cSGetLeagueBaseInfoByLeagueID);

        private native CSGetLeagueBaseInfoByLeagueID(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3990getDefaultInstanceForType();

        public final native CSGetLeagueBaseInfoByLeagueID m3991getDefaultInstanceForType();

        public final native long getLLeagueID();

        public final native Parser<CSGetLeagueBaseInfoByLeagueID> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLLeagueID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3992newBuilderForType();

        public final native Builder m3993newBuilderForType();

        protected final native Builder m3994newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3995toBuilder();

        public final native Builder m3996toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetLeagueBaseInfoByLeagueID getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f176C;
        }

        static void __clinit__() {
            PARSER = new C02471();
            CSGetLeagueBaseInfoByLeagueID cSGetLeagueBaseInfoByLeagueID = new CSGetLeagueBaseInfoByLeagueID(true);
            defaultInstance = cSGetLeagueBaseInfoByLeagueID;
            cSGetLeagueBaseInfoByLeagueID.initFields();
        }

        public static CSGetLeagueBaseInfoByLeagueID parseFrom(ByteString byteString) {
            return (CSGetLeagueBaseInfoByLeagueID) PARSER.parseFrom(byteString);
        }

        public static CSGetLeagueBaseInfoByLeagueID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueBaseInfoByLeagueID) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetLeagueBaseInfoByLeagueID parseFrom(byte[] bArr) {
            return (CSGetLeagueBaseInfoByLeagueID) PARSER.parseFrom(bArr);
        }

        public static CSGetLeagueBaseInfoByLeagueID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueBaseInfoByLeagueID) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetLeagueBaseInfoByLeagueID parseFrom(InputStream inputStream) {
            return (CSGetLeagueBaseInfoByLeagueID) PARSER.parseFrom(inputStream);
        }

        public static CSGetLeagueBaseInfoByLeagueID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueBaseInfoByLeagueID) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetLeagueBaseInfoByLeagueID parseDelimitedFrom(InputStream inputStream) {
            return (CSGetLeagueBaseInfoByLeagueID) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetLeagueBaseInfoByLeagueID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueBaseInfoByLeagueID) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetLeagueBaseInfoByLeagueID parseFrom(CodedInputStream codedInputStream) {
            return (CSGetLeagueBaseInfoByLeagueID) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetLeagueBaseInfoByLeagueID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueBaseInfoByLeagueID) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetLeagueBaseInfoByLeagueID cSGetLeagueBaseInfoByLeagueID) {
            return newBuilder().mergeFrom(cSGetLeagueBaseInfoByLeagueID);
        }
    }

    public interface CSGetLeagueByLeagueIDOrBuilder extends MessageOrBuilder {
        long getLLeagueID();

        long getUuid();

        boolean hasLLeagueID();

        boolean hasUuid();
    }

    public static final class CSGetLeagueByLeagueID extends GeneratedMessage implements CSGetLeagueByLeagueIDOrBuilder {
        public static final int LLEAGUEID_FIELD_NUMBER = 2;
        public static Parser<CSGetLeagueByLeagueID> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetLeagueByLeagueID defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lLeagueID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSGetLeagueByLeagueID.1 */
        class C02481 extends AbstractParser<CSGetLeagueByLeagueID> {
            static {
                fixHelper.fixfunc(new int[]{24913, 24914});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02481();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetLeagueByLeagueIDOrBuilder {
            private int bitField0_;
            private long lLeagueID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{18325, 18326, 18327, 18328, 18329, 18330, 18331, 18332, 18333, 18334, 18335, 18336, 18337, 18338, 18339, 18340, 18341, 18342, 18343, 18344, 18345, 18346, 18347, 18348, 18349, 18350, 18351, 18352, 18353, 18354, 18355, 18356, 18357, 18358, 18359, 18360, 18361, 18362, 18363, 18364});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4021build();

            public final native CSGetLeagueByLeagueID m4022build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4023buildPartial();

            public final native CSGetLeagueByLeagueID m4024buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4025clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4026clear();

            public final native Builder m4027clear();

            public final native Builder clearLLeagueID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4028clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4029clone();

            public final native Builder m4030clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4031getDefaultInstanceForType();

            public final native CSGetLeagueByLeagueID m4032getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLLeagueID();

            public final native long getUuid();

            public final native boolean hasLLeagueID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4033mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4034mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4035mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4036mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4037mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetLeagueByLeagueID cSGetLeagueByLeagueID);

            public final native Builder setLLeagueID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f180G;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{20980, 20981, 20982, 20983, 20984, 20985, 20986, 20987, 20988, 20989, 20990, 20991, 20992, 20993, 20994, 20995, 20996, 20997, 20998, 20999, 21000, 21001, 21002, 21003, 21004, 21005, 21006, 21007});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetLeagueByLeagueID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetLeagueByLeagueID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetLeagueByLeagueID cSGetLeagueByLeagueID);

        private native CSGetLeagueByLeagueID(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetLeagueByLeagueID(com.google.protobuf.GeneratedMessage.Builder builder, CSGetLeagueByLeagueID cSGetLeagueByLeagueID);

        private native CSGetLeagueByLeagueID(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4014getDefaultInstanceForType();

        public final native CSGetLeagueByLeagueID m4015getDefaultInstanceForType();

        public final native long getLLeagueID();

        public final native Parser<CSGetLeagueByLeagueID> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLLeagueID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4016newBuilderForType();

        public final native Builder m4017newBuilderForType();

        protected final native Builder m4018newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4019toBuilder();

        public final native Builder m4020toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetLeagueByLeagueID getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f180G;
        }

        static void __clinit__() {
            PARSER = new C02481();
            CSGetLeagueByLeagueID cSGetLeagueByLeagueID = new CSGetLeagueByLeagueID(true);
            defaultInstance = cSGetLeagueByLeagueID;
            cSGetLeagueByLeagueID.initFields();
        }

        public static CSGetLeagueByLeagueID parseFrom(ByteString byteString) {
            return (CSGetLeagueByLeagueID) PARSER.parseFrom(byteString);
        }

        public static CSGetLeagueByLeagueID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueByLeagueID) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetLeagueByLeagueID parseFrom(byte[] bArr) {
            return (CSGetLeagueByLeagueID) PARSER.parseFrom(bArr);
        }

        public static CSGetLeagueByLeagueID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueByLeagueID) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetLeagueByLeagueID parseFrom(InputStream inputStream) {
            return (CSGetLeagueByLeagueID) PARSER.parseFrom(inputStream);
        }

        public static CSGetLeagueByLeagueID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueByLeagueID) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetLeagueByLeagueID parseDelimitedFrom(InputStream inputStream) {
            return (CSGetLeagueByLeagueID) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetLeagueByLeagueID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueByLeagueID) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetLeagueByLeagueID parseFrom(CodedInputStream codedInputStream) {
            return (CSGetLeagueByLeagueID) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetLeagueByLeagueID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueByLeagueID) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetLeagueByLeagueID cSGetLeagueByLeagueID) {
            return newBuilder().mergeFrom(cSGetLeagueByLeagueID);
        }
    }

    public interface CSGetLeagueInfoByClubIDOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getUuid();

        boolean hasLClubID();

        boolean hasUuid();
    }

    public static final class CSGetLeagueInfoByClubID extends GeneratedMessage implements CSGetLeagueInfoByClubIDOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSGetLeagueInfoByClubID> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetLeagueInfoByClubID defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSGetLeagueInfoByClubID.1 */
        class C02491 extends AbstractParser<CSGetLeagueInfoByClubID> {
            static {
                fixHelper.fixfunc(new int[]{23070, 23071});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02491();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetLeagueInfoByClubIDOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{21609, 21610, 21611, 21612, 21613, 21614, 21615, 21616, 21617, 21618, 21619, 21620, 21621, 21622, 21623, 21624, 21625, 21626, 21627, 21628, 21629, 21630, 21631, 21632, 21633, 21634, 21635, 21636, 21637, 21638, 21639, 21640, 21641, 21642, 21643, 21644, 21645, 21646, 21647, 21648});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4045build();

            public final native CSGetLeagueInfoByClubID m4046build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4047buildPartial();

            public final native CSGetLeagueInfoByClubID m4048buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4049clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4050clear();

            public final native Builder m4051clear();

            public final native Builder clearLClubID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4052clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4053clone();

            public final native Builder m4054clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4055getDefaultInstanceForType();

            public final native CSGetLeagueInfoByClubID m4056getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4057mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4058mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4059mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4060mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4061mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetLeagueInfoByClubID cSGetLeagueInfoByClubID);

            public final native Builder setLClubID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f184K;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17778, 17779, 17780, 17781, 17782, 17783, 17784, 17785, 17786, 17787, 17788, 17789, 17790, 17791, 17792, 17793, 17794, 17795, 17796, 17797, 17798, 17799, 17800, 17801, 17802, 17803, 17804, 17805});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetLeagueInfoByClubID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetLeagueInfoByClubID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetLeagueInfoByClubID cSGetLeagueInfoByClubID);

        private native CSGetLeagueInfoByClubID(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetLeagueInfoByClubID(com.google.protobuf.GeneratedMessage.Builder builder, CSGetLeagueInfoByClubID cSGetLeagueInfoByClubID);

        private native CSGetLeagueInfoByClubID(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4038getDefaultInstanceForType();

        public final native CSGetLeagueInfoByClubID m4039getDefaultInstanceForType();

        public final native long getLClubID();

        public final native Parser<CSGetLeagueInfoByClubID> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4040newBuilderForType();

        public final native Builder m4041newBuilderForType();

        protected final native Builder m4042newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4043toBuilder();

        public final native Builder m4044toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetLeagueInfoByClubID getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f184K;
        }

        static void __clinit__() {
            PARSER = new C02491();
            CSGetLeagueInfoByClubID cSGetLeagueInfoByClubID = new CSGetLeagueInfoByClubID(true);
            defaultInstance = cSGetLeagueInfoByClubID;
            cSGetLeagueInfoByClubID.initFields();
        }

        public static CSGetLeagueInfoByClubID parseFrom(ByteString byteString) {
            return (CSGetLeagueInfoByClubID) PARSER.parseFrom(byteString);
        }

        public static CSGetLeagueInfoByClubID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueInfoByClubID) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetLeagueInfoByClubID parseFrom(byte[] bArr) {
            return (CSGetLeagueInfoByClubID) PARSER.parseFrom(bArr);
        }

        public static CSGetLeagueInfoByClubID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueInfoByClubID) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetLeagueInfoByClubID parseFrom(InputStream inputStream) {
            return (CSGetLeagueInfoByClubID) PARSER.parseFrom(inputStream);
        }

        public static CSGetLeagueInfoByClubID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueInfoByClubID) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetLeagueInfoByClubID parseDelimitedFrom(InputStream inputStream) {
            return (CSGetLeagueInfoByClubID) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetLeagueInfoByClubID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueInfoByClubID) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetLeagueInfoByClubID parseFrom(CodedInputStream codedInputStream) {
            return (CSGetLeagueInfoByClubID) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetLeagueInfoByClubID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLeagueInfoByClubID) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetLeagueInfoByClubID cSGetLeagueInfoByClubID) {
            return newBuilder().mergeFrom(cSGetLeagueInfoByClubID);
        }
    }

    public interface CSLeagueActionOrBuilder extends MessageOrBuilder {
        LEAGUE_ACT getELeagueAct();

        long getLActionedClubdID();

        long getLClubID();

        long getLLeagueID();

        String getSHint();

        ByteString getSHintBytes();

        long getUuid();

        boolean hasELeagueAct();

        boolean hasLActionedClubdID();

        boolean hasLClubID();

        boolean hasLLeagueID();

        boolean hasSHint();

        boolean hasUuid();
    }

    public static final class CSLeagueAction extends GeneratedMessage implements CSLeagueActionOrBuilder {
        public static final int ELEAGUEACT_FIELD_NUMBER = 5;
        public static final int LACTIONEDCLUBDID_FIELD_NUMBER = 4;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static final int LLEAGUEID_FIELD_NUMBER = 3;
        public static Parser<CSLeagueAction> PARSER = null;
        public static final int SHINT_FIELD_NUMBER = 6;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSLeagueAction defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LEAGUE_ACT eLeagueAct_;
        private long lActionedClubdID_;
        private long lClubID_;
        private long lLeagueID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sHint_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSLeagueAction.1 */
        class C02501 extends AbstractParser<CSLeagueAction> {
            static {
                fixHelper.fixfunc(new int[]{29246, 29247});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02501();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSLeagueActionOrBuilder {
            private int bitField0_;
            private LEAGUE_ACT eLeagueAct_;
            private long lActionedClubdID_;
            private long lClubID_;
            private long lLeagueID_;
            private Object sHint_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{27528, 27529, 27530, 27531, 27532, 27533, 27534, 27535, 27536, 27537, 27538, 27539, 27540, 27541, 27542, 27543, 27544, 27545, 27546, 27547, 27548, 27549, 27550, 27551, 27552, 27553, 27554, 27555, 27556, 27557, 27558, 27559, 27560, 27561, 27562, 27563, 27564, 27565, 27566, 27567, 27568, 27569, 27570, 27571, 27572, 27573, 27574, 27575, 27576, 27577, 27578, 27579, 27580, 27581, 27582, 27583, 27584, 27585});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4069build();

            public final native CSLeagueAction m4070build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4071buildPartial();

            public final native CSLeagueAction m4072buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4073clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4074clear();

            public final native Builder m4075clear();

            public final native Builder clearELeagueAct();

            public final native Builder clearLActionedClubdID();

            public final native Builder clearLClubID();

            public final native Builder clearLLeagueID();

            public final native Builder clearSHint();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4076clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4077clone();

            public final native Builder m4078clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4079getDefaultInstanceForType();

            public final native CSLeagueAction m4080getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native LEAGUE_ACT getELeagueAct();

            public final native long getLActionedClubdID();

            public final native long getLClubID();

            public final native long getLLeagueID();

            public final native String getSHint();

            public final native ByteString getSHintBytes();

            public final native long getUuid();

            public final native boolean hasELeagueAct();

            public final native boolean hasLActionedClubdID();

            public final native boolean hasLClubID();

            public final native boolean hasLLeagueID();

            public final native boolean hasSHint();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4081mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4082mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4083mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4084mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4085mergeFrom(Message message);

            public final native Builder mergeFrom(CSLeagueAction cSLeagueAction);

            public final native Builder setELeagueAct(LEAGUE_ACT league_act);

            public final native Builder setLActionedClubdID(long j);

            public final native Builder setLClubID(long j);

            public final native Builder setLLeagueID(long j);

            public final native Builder setSHint(String str);

            public final native Builder setSHintBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f211m;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14865, 14866, 14867, 14868, 14869, 14870, 14871, 14872, 14873, 14874, 14875, 14876, 14877, 14878, 14879, 14880, 14881, 14882, 14883, 14884, 14885, 14886, 14887, 14888, 14889, 14890, 14891, 14892, 14893, 14894, 14895, 14896, 14897, 14898, 14899, 14900, 14901});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSLeagueAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSLeagueAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSLeagueAction cSLeagueAction);

        private native CSLeagueAction(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSLeagueAction(com.google.protobuf.GeneratedMessage.Builder builder, CSLeagueAction cSLeagueAction);

        private native CSLeagueAction(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4062getDefaultInstanceForType();

        public final native CSLeagueAction m4063getDefaultInstanceForType();

        public final native LEAGUE_ACT getELeagueAct();

        public final native long getLActionedClubdID();

        public final native long getLClubID();

        public final native long getLLeagueID();

        public final native Parser<CSLeagueAction> getParserForType();

        public final native String getSHint();

        public final native ByteString getSHintBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasELeagueAct();

        public final native boolean hasLActionedClubdID();

        public final native boolean hasLClubID();

        public final native boolean hasLLeagueID();

        public final native boolean hasSHint();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4064newBuilderForType();

        public final native Builder m4065newBuilderForType();

        protected final native Builder m4066newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4067toBuilder();

        public final native Builder m4068toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSLeagueAction getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f211m;
        }

        static void __clinit__() {
            PARSER = new C02501();
            CSLeagueAction cSLeagueAction = new CSLeagueAction(true);
            defaultInstance = cSLeagueAction;
            cSLeagueAction.initFields();
        }

        public static CSLeagueAction parseFrom(ByteString byteString) {
            return (CSLeagueAction) PARSER.parseFrom(byteString);
        }

        public static CSLeagueAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSLeagueAction) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSLeagueAction parseFrom(byte[] bArr) {
            return (CSLeagueAction) PARSER.parseFrom(bArr);
        }

        public static CSLeagueAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSLeagueAction) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSLeagueAction parseFrom(InputStream inputStream) {
            return (CSLeagueAction) PARSER.parseFrom(inputStream);
        }

        public static CSLeagueAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSLeagueAction) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSLeagueAction parseDelimitedFrom(InputStream inputStream) {
            return (CSLeagueAction) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSLeagueAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSLeagueAction) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSLeagueAction parseFrom(CodedInputStream codedInputStream) {
            return (CSLeagueAction) PARSER.parseFrom(codedInputStream);
        }

        public static CSLeagueAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSLeagueAction) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSLeagueAction cSLeagueAction) {
            return newBuilder().mergeFrom(cSLeagueAction);
        }
    }

    public interface CSQuitLeagueOrBuilder extends MessageOrBuilder {
        long getLClubID();

        long getLLeagueID();

        long getUuid();

        boolean hasLClubID();

        boolean hasLLeagueID();

        boolean hasUuid();
    }

    public static final class CSQuitLeague extends GeneratedMessage implements CSQuitLeagueOrBuilder {
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static final int LLEAGUEID_FIELD_NUMBER = 3;
        public static Parser<CSQuitLeague> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSQuitLeague defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lClubID_;
        private long lLeagueID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSQuitLeague.1 */
        class C02511 extends AbstractParser<CSQuitLeague> {
            static {
                fixHelper.fixfunc(new int[]{11378, 11379});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02511();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSQuitLeagueOrBuilder {
            private int bitField0_;
            private long lClubID_;
            private long lLeagueID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{19303, 19304, 19305, 19306, 19307, 19308, 19309, 19310, 19311, 19312, 19313, 19314, 19315, 19316, 19317, 19318, 19319, 19320, 19321, 19322, 19323, 19324, 19325, 19326, 19327, 19328, 19329, 19330, 19331, 19332, 19333, 19334, 19335, 19336, 19337, 19338, 19339, 19340, 19341, 19342, 19343, 19344, 19345, 19346});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4093build();

            public final native CSQuitLeague m4094build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4095buildPartial();

            public final native CSQuitLeague m4096buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4097clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4098clear();

            public final native Builder m4099clear();

            public final native Builder clearLClubID();

            public final native Builder clearLLeagueID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4100clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4101clone();

            public final native Builder m4102clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4103getDefaultInstanceForType();

            public final native CSQuitLeague m4104getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLClubID();

            public final native long getLLeagueID();

            public final native long getUuid();

            public final native boolean hasLClubID();

            public final native boolean hasLLeagueID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4105mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4106mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4107mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4108mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4109mergeFrom(Message message);

            public final native Builder mergeFrom(CSQuitLeague cSQuitLeague);

            public final native Builder setLClubID(long j);

            public final native Builder setLLeagueID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f223y;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{32990, 32991, 32992, 32993, 32994, 32995, 32996, 32997, 32998, 32999, 33000, 33001, 33002, 33003, 33004, 33005, 33006, 33007, 33008, 33009, 33010, 33011, 33012, 33013, 33014, 33015, 33016, 33017, 33018, 33019});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSQuitLeague(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSQuitLeague(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSQuitLeague cSQuitLeague);

        private native CSQuitLeague(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSQuitLeague(com.google.protobuf.GeneratedMessage.Builder builder, CSQuitLeague cSQuitLeague);

        private native CSQuitLeague(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4086getDefaultInstanceForType();

        public final native CSQuitLeague m4087getDefaultInstanceForType();

        public final native long getLClubID();

        public final native long getLLeagueID();

        public final native Parser<CSQuitLeague> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLClubID();

        public final native boolean hasLLeagueID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4088newBuilderForType();

        public final native Builder m4089newBuilderForType();

        protected final native Builder m4090newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4091toBuilder();

        public final native Builder m4092toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSQuitLeague getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f223y;
        }

        static void __clinit__() {
            PARSER = new C02511();
            CSQuitLeague cSQuitLeague = new CSQuitLeague(true);
            defaultInstance = cSQuitLeague;
            cSQuitLeague.initFields();
        }

        public static CSQuitLeague parseFrom(ByteString byteString) {
            return (CSQuitLeague) PARSER.parseFrom(byteString);
        }

        public static CSQuitLeague parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSQuitLeague) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSQuitLeague parseFrom(byte[] bArr) {
            return (CSQuitLeague) PARSER.parseFrom(bArr);
        }

        public static CSQuitLeague parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSQuitLeague) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSQuitLeague parseFrom(InputStream inputStream) {
            return (CSQuitLeague) PARSER.parseFrom(inputStream);
        }

        public static CSQuitLeague parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSQuitLeague) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSQuitLeague parseDelimitedFrom(InputStream inputStream) {
            return (CSQuitLeague) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSQuitLeague parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSQuitLeague) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSQuitLeague parseFrom(CodedInputStream codedInputStream) {
            return (CSQuitLeague) PARSER.parseFrom(codedInputStream);
        }

        public static CSQuitLeague parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSQuitLeague) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSQuitLeague cSQuitLeague) {
            return newBuilder().mergeFrom(cSQuitLeague);
        }
    }

    public interface CSSearchLeagueOrBuilder extends MessageOrBuilder {
        LEAGUE_SEARCH_TYPE getEClubSearchType();

        long getLClubID();

        String getSKeyWord();

        ByteString getSKeyWordBytes();

        long getUuid();

        boolean hasEClubSearchType();

        boolean hasLClubID();

        boolean hasSKeyWord();

        boolean hasUuid();
    }

    public static final class CSSearchLeague extends GeneratedMessage implements CSSearchLeagueOrBuilder {
        public static final int ECLUBSEARCHTYPE_FIELD_NUMBER = 4;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<CSSearchLeague> PARSER = null;
        public static final int SKEYWORD_FIELD_NUMBER = 3;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSearchLeague defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LEAGUE_SEARCH_TYPE eClubSearchType_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sKeyWord_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSSearchLeague.1 */
        class C02521 extends AbstractParser<CSSearchLeague> {
            static {
                fixHelper.fixfunc(new int[]{11995, 11996});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02521();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSearchLeagueOrBuilder {
            private int bitField0_;
            private LEAGUE_SEARCH_TYPE eClubSearchType_;
            private long lClubID_;
            private Object sKeyWord_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{7624, 7625, 7626, 7627, 7628, 7629, 7630, 7631, 7632, 7633, 7634, 7635, 7636, 7637, 7638, 7639, 7640, 7641, 7642, 7643, 7644, 7645, 7646, 7647, 7648, 7649, 7650, 7651, 7652, 7653, 7654, 7655, 7656, 7657, 7658, 7659, 7660, 7661, 7662, 7663, 7664, 7665, 7666, 7667, 7668, 7669, 7670, 7671, 7672, 7673});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4117build();

            public final native CSSearchLeague m4118build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4119buildPartial();

            public final native CSSearchLeague m4120buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4121clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4122clear();

            public final native Builder m4123clear();

            public final native Builder clearEClubSearchType();

            public final native Builder clearLClubID();

            public final native Builder clearSKeyWord();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4124clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4125clone();

            public final native Builder m4126clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4127getDefaultInstanceForType();

            public final native CSSearchLeague m4128getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native LEAGUE_SEARCH_TYPE getEClubSearchType();

            public final native long getLClubID();

            public final native String getSKeyWord();

            public final native ByteString getSKeyWordBytes();

            public final native long getUuid();

            public final native boolean hasEClubSearchType();

            public final native boolean hasLClubID();

            public final native boolean hasSKeyWord();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4129mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4130mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4131mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4132mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4133mergeFrom(Message message);

            public final native Builder mergeFrom(CSSearchLeague cSSearchLeague);

            public final native Builder setEClubSearchType(LEAGUE_SEARCH_TYPE league_search_type);

            public final native Builder setLClubID(long j);

            public final native Builder setSKeyWord(String str);

            public final native Builder setSKeyWordBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f215q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{27920, 27921, 27922, 27923, 27924, 27925, 27926, 27927, 27928, 27929, 27930, 27931, 27932, 27933, 27934, 27935, 27936, 27937, 27938, 27939, 27940, 27941, 27942, 27943, 27944, 27945, 27946, 27947, 27948, 27949, 27950, 27951, 27952});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSearchLeague(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSearchLeague(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSearchLeague cSSearchLeague);

        private native CSSearchLeague(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSearchLeague(com.google.protobuf.GeneratedMessage.Builder builder, CSSearchLeague cSSearchLeague);

        private native CSSearchLeague(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4110getDefaultInstanceForType();

        public final native CSSearchLeague m4111getDefaultInstanceForType();

        public final native LEAGUE_SEARCH_TYPE getEClubSearchType();

        public final native long getLClubID();

        public final native Parser<CSSearchLeague> getParserForType();

        public final native String getSKeyWord();

        public final native ByteString getSKeyWordBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEClubSearchType();

        public final native boolean hasLClubID();

        public final native boolean hasSKeyWord();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4112newBuilderForType();

        public final native Builder m4113newBuilderForType();

        protected final native Builder m4114newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4115toBuilder();

        public final native Builder m4116toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSearchLeague getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f215q;
        }

        static void __clinit__() {
            PARSER = new C02521();
            CSSearchLeague cSSearchLeague = new CSSearchLeague(true);
            defaultInstance = cSSearchLeague;
            cSSearchLeague.initFields();
        }

        public static CSSearchLeague parseFrom(ByteString byteString) {
            return (CSSearchLeague) PARSER.parseFrom(byteString);
        }

        public static CSSearchLeague parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchLeague) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSearchLeague parseFrom(byte[] bArr) {
            return (CSSearchLeague) PARSER.parseFrom(bArr);
        }

        public static CSSearchLeague parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchLeague) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSearchLeague parseFrom(InputStream inputStream) {
            return (CSSearchLeague) PARSER.parseFrom(inputStream);
        }

        public static CSSearchLeague parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchLeague) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSearchLeague parseDelimitedFrom(InputStream inputStream) {
            return (CSSearchLeague) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSearchLeague parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchLeague) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSearchLeague parseFrom(CodedInputStream codedInputStream) {
            return (CSSearchLeague) PARSER.parseFrom(codedInputStream);
        }

        public static CSSearchLeague parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSearchLeague) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSearchLeague cSSearchLeague) {
            return newBuilder().mergeFrom(cSSearchLeague);
        }
    }

    public interface CSSetLeagueSettingOrBuilder extends MessageOrBuilder {
        int getBLeagueMute();

        long getLLeagueID();

        long getUuid();

        boolean hasBLeagueMute();

        boolean hasLLeagueID();

        boolean hasUuid();
    }

    public static final class CSSetLeagueSetting extends GeneratedMessage implements CSSetLeagueSettingOrBuilder {
        public static final int BLEAGUEMUTE_FIELD_NUMBER = 3;
        public static final int LLEAGUEID_FIELD_NUMBER = 2;
        public static Parser<CSSetLeagueSetting> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSetLeagueSetting defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bLeagueMute_;
        private int bitField0_;
        private long lLeagueID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSSetLeagueSetting.1 */
        class C02531 extends AbstractParser<CSSetLeagueSetting> {
            static {
                fixHelper.fixfunc(new int[]{12917, 12918});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02531();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSetLeagueSettingOrBuilder {
            private int bLeagueMute_;
            private int bitField0_;
            private long lLeagueID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{16997, 16998, 16999, 17000, 17001, 17002, 17003, 17004, 17005, 17006, 17007, 17008, 17009, 17010, 17011, 17012, 17013, 17014, 17015, 17016, 17017, 17018, 17019, 17020, 17021, 17022, 17023, 17024, 17025, 17026, 17027, 17028, 17029, 17030, 17031, 17032, 17033, 17034, 17035, 17036, 17037, 17038, 17039, 17040});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4141build();

            public final native CSSetLeagueSetting m4142build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4143buildPartial();

            public final native CSSetLeagueSetting m4144buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4145clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4146clear();

            public final native Builder m4147clear();

            public final native Builder clearBLeagueMute();

            public final native Builder clearLLeagueID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4148clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4149clone();

            public final native Builder m4150clone();

            public final native int getBLeagueMute();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4151getDefaultInstanceForType();

            public final native CSSetLeagueSetting m4152getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLLeagueID();

            public final native long getUuid();

            public final native boolean hasBLeagueMute();

            public final native boolean hasLLeagueID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4153mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4154mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4155mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4156mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4157mergeFrom(Message message);

            public final native Builder mergeFrom(CSSetLeagueSetting cSSetLeagueSetting);

            public final native Builder setBLeagueMute(int i);

            public final native Builder setLLeagueID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f219u;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{4712, 4713, 4714, 4715, 4716, 4717, 4718, 4719, 4720, 4721, 4722, 4723, 4724, 4725, 4726, 4727, 4728, 4729, 4730, 4731, 4732, 4733, 4734, 4735, 4736, 4737, 4738, 4739, 4740, 4741});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSetLeagueSetting(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSetLeagueSetting(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSetLeagueSetting cSSetLeagueSetting);

        private native CSSetLeagueSetting(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSetLeagueSetting(com.google.protobuf.GeneratedMessage.Builder builder, CSSetLeagueSetting cSSetLeagueSetting);

        private native CSSetLeagueSetting(boolean z);

        private native void initFields();

        public final native int getBLeagueMute();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4134getDefaultInstanceForType();

        public final native CSSetLeagueSetting m4135getDefaultInstanceForType();

        public final native long getLLeagueID();

        public final native Parser<CSSetLeagueSetting> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasBLeagueMute();

        public final native boolean hasLLeagueID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4136newBuilderForType();

        public final native Builder m4137newBuilderForType();

        protected final native Builder m4138newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4139toBuilder();

        public final native Builder m4140toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSetLeagueSetting getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f219u;
        }

        static void __clinit__() {
            PARSER = new C02531();
            CSSetLeagueSetting cSSetLeagueSetting = new CSSetLeagueSetting(true);
            defaultInstance = cSSetLeagueSetting;
            cSSetLeagueSetting.initFields();
        }

        public static CSSetLeagueSetting parseFrom(ByteString byteString) {
            return (CSSetLeagueSetting) PARSER.parseFrom(byteString);
        }

        public static CSSetLeagueSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetLeagueSetting) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSetLeagueSetting parseFrom(byte[] bArr) {
            return (CSSetLeagueSetting) PARSER.parseFrom(bArr);
        }

        public static CSSetLeagueSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetLeagueSetting) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSetLeagueSetting parseFrom(InputStream inputStream) {
            return (CSSetLeagueSetting) PARSER.parseFrom(inputStream);
        }

        public static CSSetLeagueSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetLeagueSetting) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetLeagueSetting parseDelimitedFrom(InputStream inputStream) {
            return (CSSetLeagueSetting) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSetLeagueSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetLeagueSetting) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSetLeagueSetting parseFrom(CodedInputStream codedInputStream) {
            return (CSSetLeagueSetting) PARSER.parseFrom(codedInputStream);
        }

        public static CSSetLeagueSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSetLeagueSetting) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSetLeagueSetting cSSetLeagueSetting) {
            return newBuilder().mergeFrom(cSSetLeagueSetting);
        }
    }

    public interface CSSystemLeagueMsgRspOrBuilder extends MessageOrBuilder {
        long getUuid();

        long getVMsgIds(int i);

        int getVMsgIdsCount();

        List<Long> getVMsgIdsList();

        boolean hasUuid();
    }

    public static final class CSSystemLeagueMsgRsp extends GeneratedMessage implements CSSystemLeagueMsgRspOrBuilder {
        public static Parser<CSSystemLeagueMsgRsp> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VMSGIDS_FIELD_NUMBER = 2;
        private static final CSSystemLeagueMsgRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private List<Long> vMsgIds_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.CSSystemLeagueMsgRsp.1 */
        class C02541 extends AbstractParser<CSSystemLeagueMsgRsp> {
            static {
                fixHelper.fixfunc(new int[]{29076, 29077});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02541();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSystemLeagueMsgRspOrBuilder {
            private int bitField0_;
            private long uuid_;
            private List<Long> vMsgIds_;

            static {
                fixHelper.fixfunc(new int[]{24969, 24970, 24971, 24972, 24973, 24974, 24975, 24976, 24977, 24978, 24979, 24980, 24981, 24982, 24983, 24984, 24985, 24986, 24987, 24988, 24989, 24990, 24991, 24992, 24993, 24994, 24995, 24996, 24997, 24998, 24999, 25000, 25001, 25002, 25003, 25004, 25005, 25006, 25007, 25008, 25009, 25010, 25011, 25012});
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

            public final native /* bridge */ /* synthetic */ MessageLite m4165build();

            public final native CSSystemLeagueMsgRsp m4166build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4167buildPartial();

            public final native CSSystemLeagueMsgRsp m4168buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4169clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4170clear();

            public final native Builder m4171clear();

            public final native Builder clearUuid();

            public final native Builder clearVMsgIds();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4172clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4173clone();

            public final native Builder m4174clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4175getDefaultInstanceForType();

            public final native CSSystemLeagueMsgRsp m4176getDefaultInstanceForType();

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

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4177mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4178mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4179mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4180mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4181mergeFrom(Message message);

            public final native Builder mergeFrom(CSSystemLeagueMsgRsp cSSystemLeagueMsgRsp);

            public final native Builder setUuid(long j);

            public final native Builder setVMsgIds(int i, long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f196W;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{25259, 25260, 25261, 25262, 25263, 25264, 25265, 25266, 25267, 25268, 25269, 25270, 25271, 25272, 25273, 25274, 25275, 25276, 25277, 25278, 25279, 25280, 25281, 25282, 25283, 25284, 25285, 25286, 25287});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSystemLeagueMsgRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSystemLeagueMsgRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSystemLeagueMsgRsp cSSystemLeagueMsgRsp);

        private native CSSystemLeagueMsgRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSystemLeagueMsgRsp(com.google.protobuf.GeneratedMessage.Builder builder, CSSystemLeagueMsgRsp cSSystemLeagueMsgRsp);

        private native CSSystemLeagueMsgRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4158getDefaultInstanceForType();

        public final native CSSystemLeagueMsgRsp m4159getDefaultInstanceForType();

        public final native Parser<CSSystemLeagueMsgRsp> getParserForType();

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

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4160newBuilderForType();

        public final native Builder m4161newBuilderForType();

        protected final native Builder m4162newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4163toBuilder();

        public final native Builder m4164toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSystemLeagueMsgRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f196W;
        }

        static void __clinit__() {
            PARSER = new C02541();
            CSSystemLeagueMsgRsp cSSystemLeagueMsgRsp = new CSSystemLeagueMsgRsp(true);
            defaultInstance = cSSystemLeagueMsgRsp;
            cSSystemLeagueMsgRsp.initFields();
        }

        public static CSSystemLeagueMsgRsp parseFrom(ByteString byteString) {
            return (CSSystemLeagueMsgRsp) PARSER.parseFrom(byteString);
        }

        public static CSSystemLeagueMsgRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSystemLeagueMsgRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSystemLeagueMsgRsp parseFrom(byte[] bArr) {
            return (CSSystemLeagueMsgRsp) PARSER.parseFrom(bArr);
        }

        public static CSSystemLeagueMsgRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSystemLeagueMsgRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSystemLeagueMsgRsp parseFrom(InputStream inputStream) {
            return (CSSystemLeagueMsgRsp) PARSER.parseFrom(inputStream);
        }

        public static CSSystemLeagueMsgRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSystemLeagueMsgRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSystemLeagueMsgRsp parseDelimitedFrom(InputStream inputStream) {
            return (CSSystemLeagueMsgRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSystemLeagueMsgRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSystemLeagueMsgRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSystemLeagueMsgRsp parseFrom(CodedInputStream codedInputStream) {
            return (CSSystemLeagueMsgRsp) PARSER.parseFrom(codedInputStream);
        }

        public static CSSystemLeagueMsgRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSystemLeagueMsgRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSystemLeagueMsgRsp cSSystemLeagueMsgRsp) {
            return newBuilder().mergeFrom(cSSystemLeagueMsgRsp);
        }
    }

    public enum LEAGUE_ACT implements ProtocolMessageEnum {
        ;
        
        public static final int LEAGUE_ACCEPT_INVITE_VALUE = 1;
        public static final int LEAGUE_DENY_INVITE_VALUE = 2;
        public static final int LEAGUE_REMOVE_INVITE_VALUE = 3;
        private static final LEAGUE_ACT[] VALUES = null;
        private static EnumLiteMap<LEAGUE_ACT> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.LEAGUE_ACT.1 */
        class C02551 implements EnumLiteMap<LEAGUE_ACT> {
            static {
                fixHelper.fixfunc(new int[]{10273, 10274});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02551();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{29248, 29249, 29250, 29251});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native LEAGUE_ACT(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            LEAGUE_ACCEPT_INVITE = new LEAGUE_ACT("LEAGUE_ACCEPT_INVITE", 0, 0, LEAGUE_ACCEPT_INVITE_VALUE);
            LEAGUE_DENY_INVITE = new LEAGUE_ACT("LEAGUE_DENY_INVITE", LEAGUE_ACCEPT_INVITE_VALUE, LEAGUE_ACCEPT_INVITE_VALUE, LEAGUE_DENY_INVITE_VALUE);
            LEAGUE_REMOVE_INVITE = new LEAGUE_ACT("LEAGUE_REMOVE_INVITE", LEAGUE_DENY_INVITE_VALUE, LEAGUE_DENY_INVITE_VALUE, LEAGUE_REMOVE_INVITE_VALUE);
            LEAGUE_ACT[] league_actArr = new LEAGUE_ACT[LEAGUE_REMOVE_INVITE_VALUE];
            league_actArr[0] = LEAGUE_ACCEPT_INVITE;
            league_actArr[LEAGUE_ACCEPT_INVITE_VALUE] = LEAGUE_DENY_INVITE;
            league_actArr[LEAGUE_DENY_INVITE_VALUE] = LEAGUE_REMOVE_INVITE;
            ENUM$VALUES = league_actArr;
            internalValueMap = new C02551();
            VALUES = values();
        }

        public static LEAGUE_ACT valueOf(int i) {
            switch (i) {
                case LEAGUE_ACCEPT_INVITE_VALUE:
                    return LEAGUE_ACCEPT_INVITE;
                case LEAGUE_DENY_INVITE_VALUE:
                    return LEAGUE_DENY_INVITE;
                case LEAGUE_REMOVE_INVITE_VALUE:
                    return LEAGUE_REMOVE_INVITE;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<LEAGUE_ACT> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpLeague.m204a().getEnumTypes().get(0);
        }

        public static LEAGUE_ACT valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum LEAGUE_MESSAGE_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int LEAGUE_MESSAGE_ACCEPT_VALUE = 2;
        public static final int LEAGUE_MESSAGE_APPLY_VALUE = 1;
        public static final int LEAGUE_MESSAGE_DENY_VALUE = 3;
        public static final int LEAGUE_MESSAGE_ENTER_VALUE = 6;
        public static final int LEAGUE_MESSAGE_QUIT_VALUE = 5;
        public static final int LEAGUE_MESSAGE_REMOVE_VALUE = 4;
        private static final LEAGUE_MESSAGE_TYPE[] VALUES = null;
        private static EnumLiteMap<LEAGUE_MESSAGE_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.LEAGUE_MESSAGE_TYPE.1 */
        class C02561 implements EnumLiteMap<LEAGUE_MESSAGE_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{7236, 7237});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02561();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{14366, 14367, 14368, 14369});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native LEAGUE_MESSAGE_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            LEAGUE_MESSAGE_APPLY = new LEAGUE_MESSAGE_TYPE("LEAGUE_MESSAGE_APPLY", 0, 0, LEAGUE_MESSAGE_APPLY_VALUE);
            LEAGUE_MESSAGE_ACCEPT = new LEAGUE_MESSAGE_TYPE("LEAGUE_MESSAGE_ACCEPT", LEAGUE_MESSAGE_APPLY_VALUE, LEAGUE_MESSAGE_APPLY_VALUE, LEAGUE_MESSAGE_ACCEPT_VALUE);
            LEAGUE_MESSAGE_DENY = new LEAGUE_MESSAGE_TYPE("LEAGUE_MESSAGE_DENY", LEAGUE_MESSAGE_ACCEPT_VALUE, LEAGUE_MESSAGE_ACCEPT_VALUE, LEAGUE_MESSAGE_DENY_VALUE);
            LEAGUE_MESSAGE_REMOVE = new LEAGUE_MESSAGE_TYPE("LEAGUE_MESSAGE_REMOVE", LEAGUE_MESSAGE_DENY_VALUE, LEAGUE_MESSAGE_DENY_VALUE, LEAGUE_MESSAGE_REMOVE_VALUE);
            LEAGUE_MESSAGE_QUIT = new LEAGUE_MESSAGE_TYPE("LEAGUE_MESSAGE_QUIT", LEAGUE_MESSAGE_REMOVE_VALUE, LEAGUE_MESSAGE_REMOVE_VALUE, LEAGUE_MESSAGE_QUIT_VALUE);
            LEAGUE_MESSAGE_ENTER = new LEAGUE_MESSAGE_TYPE("LEAGUE_MESSAGE_ENTER", LEAGUE_MESSAGE_QUIT_VALUE, LEAGUE_MESSAGE_QUIT_VALUE, LEAGUE_MESSAGE_ENTER_VALUE);
            LEAGUE_MESSAGE_TYPE[] league_message_typeArr = new LEAGUE_MESSAGE_TYPE[LEAGUE_MESSAGE_ENTER_VALUE];
            league_message_typeArr[0] = LEAGUE_MESSAGE_APPLY;
            league_message_typeArr[LEAGUE_MESSAGE_APPLY_VALUE] = LEAGUE_MESSAGE_ACCEPT;
            league_message_typeArr[LEAGUE_MESSAGE_ACCEPT_VALUE] = LEAGUE_MESSAGE_DENY;
            league_message_typeArr[LEAGUE_MESSAGE_DENY_VALUE] = LEAGUE_MESSAGE_REMOVE;
            league_message_typeArr[LEAGUE_MESSAGE_REMOVE_VALUE] = LEAGUE_MESSAGE_QUIT;
            league_message_typeArr[LEAGUE_MESSAGE_QUIT_VALUE] = LEAGUE_MESSAGE_ENTER;
            ENUM$VALUES = league_message_typeArr;
            internalValueMap = new C02561();
            VALUES = values();
        }

        public static LEAGUE_MESSAGE_TYPE valueOf(int i) {
            switch (i) {
                case LEAGUE_MESSAGE_APPLY_VALUE:
                    return LEAGUE_MESSAGE_APPLY;
                case LEAGUE_MESSAGE_ACCEPT_VALUE:
                    return LEAGUE_MESSAGE_ACCEPT;
                case LEAGUE_MESSAGE_DENY_VALUE:
                    return LEAGUE_MESSAGE_DENY;
                case LEAGUE_MESSAGE_REMOVE_VALUE:
                    return LEAGUE_MESSAGE_REMOVE;
                case LEAGUE_MESSAGE_QUIT_VALUE:
                    return LEAGUE_MESSAGE_QUIT;
                case LEAGUE_MESSAGE_ENTER_VALUE:
                    return LEAGUE_MESSAGE_ENTER;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<LEAGUE_MESSAGE_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpLeague.m204a().getEnumTypes().get(LEAGUE_MESSAGE_ACCEPT_VALUE);
        }

        public static LEAGUE_MESSAGE_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum LEAGUE_SEARCH_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int LEAGUE_ID_SEARCH_VALUE = 1;
        private static final LEAGUE_SEARCH_TYPE[] VALUES = null;
        private static EnumLiteMap<LEAGUE_SEARCH_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.LEAGUE_SEARCH_TYPE.1 */
        class C02571 implements EnumLiteMap<LEAGUE_SEARCH_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{14988, 14989});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02571();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{32572, 32573, 32574, 32575});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native LEAGUE_SEARCH_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            LEAGUE_ID_SEARCH = new LEAGUE_SEARCH_TYPE("LEAGUE_ID_SEARCH", 0, 0, LEAGUE_ID_SEARCH_VALUE);
            LEAGUE_SEARCH_TYPE[] league_search_typeArr = new LEAGUE_SEARCH_TYPE[LEAGUE_ID_SEARCH_VALUE];
            league_search_typeArr[0] = LEAGUE_ID_SEARCH;
            ENUM$VALUES = league_search_typeArr;
            internalValueMap = new C02571();
            VALUES = values();
        }

        public static LEAGUE_SEARCH_TYPE valueOf(int i) {
            switch (i) {
                case LEAGUE_ID_SEARCH_VALUE:
                    return LEAGUE_ID_SEARCH;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<LEAGUE_SEARCH_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttpLeague.m204a().getEnumTypes().get(LEAGUE_ID_SEARCH_VALUE);
        }

        public static LEAGUE_SEARCH_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface LeagueBaseInfoOrBuilder extends MessageOrBuilder {
        int getBLeagueMute();

        int getIMaxMembers();

        long getLCreateTime();

        long getLLeagueID();

        String getSLeagueName();

        ByteString getSLeagueNameBytes();

        long getStLeagueCreator();

        boolean hasBLeagueMute();

        boolean hasIMaxMembers();

        boolean hasLCreateTime();

        boolean hasLLeagueID();

        boolean hasSLeagueName();

        boolean hasStLeagueCreator();
    }

    public static final class LeagueBaseInfo extends GeneratedMessage implements LeagueBaseInfoOrBuilder {
        public static final int BLEAGUEMUTE_FIELD_NUMBER = 4;
        public static final int IMAXMEMBERS_FIELD_NUMBER = 5;
        public static final int LCREATETIME_FIELD_NUMBER = 6;
        public static final int LLEAGUEID_FIELD_NUMBER = 1;
        public static Parser<LeagueBaseInfo> PARSER = null;
        public static final int SLEAGUENAME_FIELD_NUMBER = 3;
        public static final int STLEAGUECREATOR_FIELD_NUMBER = 2;
        private static final LeagueBaseInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bLeagueMute_;
        private int bitField0_;
        private int iMaxMembers_;
        private long lCreateTime_;
        private long lLeagueID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sLeagueName_;
        private long stLeagueCreator_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.LeagueBaseInfo.1 */
        class C02581 extends AbstractParser<LeagueBaseInfo> {
            static {
                fixHelper.fixfunc(new int[]{31806, 31807});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02581();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements LeagueBaseInfoOrBuilder {
            private int bLeagueMute_;
            private int bitField0_;
            private int iMaxMembers_;
            private long lCreateTime_;
            private long lLeagueID_;
            private Object sLeagueName_;
            private long stLeagueCreator_;

            static {
                fixHelper.fixfunc(new int[]{23590, 23591, 23592, 23593, 23594, 23595, 23596, 23597, 23598, 23599, 23600, 23601, 23602, 23603, 23604, 23605, 23606, 23607, 23608, 23609, 23610, 23611, 23612, 23613, 23614, 23615, 23616, 23617, 23618, 23619, 23620, 23621, 23622, 23623, 23624, 23625, 23626, 23627, 23628, 23629, 23630, 23631, 23632, 23633, 23634, 23635, 23636, 23637, 23638, 23639, 23640, 23641, 23642, 23643, 23644, 23645, 23646, 23647});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4189build();

            public final native LeagueBaseInfo m4190build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4191buildPartial();

            public final native LeagueBaseInfo m4192buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4193clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4194clear();

            public final native Builder m4195clear();

            public final native Builder clearBLeagueMute();

            public final native Builder clearIMaxMembers();

            public final native Builder clearLCreateTime();

            public final native Builder clearLLeagueID();

            public final native Builder clearSLeagueName();

            public final native Builder clearStLeagueCreator();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4196clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4197clone();

            public final native Builder m4198clone();

            public final native int getBLeagueMute();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4199getDefaultInstanceForType();

            public final native LeagueBaseInfo m4200getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIMaxMembers();

            public final native long getLCreateTime();

            public final native long getLLeagueID();

            public final native String getSLeagueName();

            public final native ByteString getSLeagueNameBytes();

            public final native long getStLeagueCreator();

            public final native boolean hasBLeagueMute();

            public final native boolean hasIMaxMembers();

            public final native boolean hasLCreateTime();

            public final native boolean hasLLeagueID();

            public final native boolean hasSLeagueName();

            public final native boolean hasStLeagueCreator();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4201mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4202mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4203mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4204mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4205mergeFrom(Message message);

            public final native Builder mergeFrom(LeagueBaseInfo leagueBaseInfo);

            public final native Builder setBLeagueMute(int i);

            public final native Builder setIMaxMembers(int i);

            public final native Builder setLCreateTime(long j);

            public final native Builder setLLeagueID(long j);

            public final native Builder setSLeagueName(String str);

            public final native Builder setSLeagueNameBytes(ByteString byteString);

            public final native Builder setStLeagueCreator(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f199a;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{30019, 30020, 30021, 30022, 30023, 30024, 30025, 30026, 30027, 30028, 30029, 30030, 30031, 30032, 30033, 30034, 30035, 30036, 30037, 30038, 30039, 30040, 30041, 30042, 30043, 30044, 30045, 30046, 30047, 30048, 30049, 30050, 30051, 30052, 30053, 30054, 30055});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native LeagueBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ LeagueBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, LeagueBaseInfo leagueBaseInfo);

        private native LeagueBaseInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ LeagueBaseInfo(com.google.protobuf.GeneratedMessage.Builder builder, LeagueBaseInfo leagueBaseInfo);

        private native LeagueBaseInfo(boolean z);

        private native void initFields();

        public final native int getBLeagueMute();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4182getDefaultInstanceForType();

        public final native LeagueBaseInfo m4183getDefaultInstanceForType();

        public final native int getIMaxMembers();

        public final native long getLCreateTime();

        public final native long getLLeagueID();

        public final native Parser<LeagueBaseInfo> getParserForType();

        public final native String getSLeagueName();

        public final native ByteString getSLeagueNameBytes();

        public final native int getSerializedSize();

        public final native long getStLeagueCreator();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBLeagueMute();

        public final native boolean hasIMaxMembers();

        public final native boolean hasLCreateTime();

        public final native boolean hasLLeagueID();

        public final native boolean hasSLeagueName();

        public final native boolean hasStLeagueCreator();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4184newBuilderForType();

        public final native Builder m4185newBuilderForType();

        protected final native Builder m4186newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4187toBuilder();

        public final native Builder m4188toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static LeagueBaseInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f199a;
        }

        static void __clinit__() {
            PARSER = new C02581();
            LeagueBaseInfo leagueBaseInfo = new LeagueBaseInfo(true);
            defaultInstance = leagueBaseInfo;
            leagueBaseInfo.initFields();
        }

        public static LeagueBaseInfo parseFrom(ByteString byteString) {
            return (LeagueBaseInfo) PARSER.parseFrom(byteString);
        }

        public static LeagueBaseInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LeagueBaseInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LeagueBaseInfo parseFrom(byte[] bArr) {
            return (LeagueBaseInfo) PARSER.parseFrom(bArr);
        }

        public static LeagueBaseInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LeagueBaseInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LeagueBaseInfo parseFrom(InputStream inputStream) {
            return (LeagueBaseInfo) PARSER.parseFrom(inputStream);
        }

        public static LeagueBaseInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LeagueBaseInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static LeagueBaseInfo parseDelimitedFrom(InputStream inputStream) {
            return (LeagueBaseInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static LeagueBaseInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LeagueBaseInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static LeagueBaseInfo parseFrom(CodedInputStream codedInputStream) {
            return (LeagueBaseInfo) PARSER.parseFrom(codedInputStream);
        }

        public static LeagueBaseInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LeagueBaseInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(LeagueBaseInfo leagueBaseInfo) {
            return newBuilder().mergeFrom(leagueBaseInfo);
        }
    }

    public interface LeagueInfoOrBuilder extends MessageOrBuilder {
        LeagueBaseInfo getStLeagueBaseInfo();

        LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

        ClubBaseInfo getVClubBaseInfos(int i);

        int getVClubBaseInfosCount();

        List<ClubBaseInfo> getVClubBaseInfosList();

        ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        boolean hasStLeagueBaseInfo();
    }

    public static final class LeagueInfo extends GeneratedMessage implements LeagueInfoOrBuilder {
        public static Parser<LeagueInfo> PARSER = null;
        public static final int STLEAGUEBASEINFO_FIELD_NUMBER = 1;
        public static final int VCLUBBASEINFOS_FIELD_NUMBER = 2;
        private static final LeagueInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LeagueBaseInfo stLeagueBaseInfo_;
        private final UnknownFieldSet unknownFields;
        private List<ClubBaseInfo> vClubBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.LeagueInfo.1 */
        class C02591 extends AbstractParser<LeagueInfo> {
            static {
                fixHelper.fixfunc(new int[]{34095, 34096});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02591();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements LeagueInfoOrBuilder {
            private int bitField0_;
            private SingleFieldBuilder<LeagueBaseInfo, Builder, LeagueBaseInfoOrBuilder> stLeagueBaseInfoBuilder_;
            private LeagueBaseInfo stLeagueBaseInfo_;
            private RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> vClubBaseInfosBuilder_;
            private List<ClubBaseInfo> vClubBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{28445, 28446, 28447, 28448, 28449, 28450, 28451, 28452, 28453, 28454, 28455, 28456, 28457, 28458, 28459, 28460, 28461, 28462, 28463, 28464, 28465, 28466, 28467, 28468, 28469, 28470, 28471, 28472, 28473, 28474, 28475, 28476, 28477, 28478, 28479, 28480, 28481, 28482, 28483, 28484, 28485, 28486, 28487, 28488, 28489, 28490, 28491, 28492, 28493, 28494, 28495, 28496, 28497, 28498, 28499, 28500, 28501, 28502, 28503, 28504, 28505});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVClubBaseInfosIsMutable();

            private native SingleFieldBuilder<LeagueBaseInfo, Builder, LeagueBaseInfoOrBuilder> getStLeagueBaseInfoFieldBuilder();

            private native RepeatedFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getVClubBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVClubBaseInfos(Iterable<? extends ClubBaseInfo> iterable);

            public final native Builder addVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public final native Builder addVClubBaseInfos(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder addVClubBaseInfos(ClubBaseInfo clubBaseInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder addVClubBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4213build();

            public final native LeagueInfo m4214build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4215buildPartial();

            public final native LeagueInfo m4216buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4217clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4218clear();

            public final native Builder m4219clear();

            public final native Builder clearStLeagueBaseInfo();

            public final native Builder clearVClubBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4220clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4221clone();

            public final native Builder m4222clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4223getDefaultInstanceForType();

            public final native LeagueInfo m4224getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native LeagueBaseInfo getStLeagueBaseInfo();

            public final native Builder getStLeagueBaseInfoBuilder();

            public final native LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

            public final native ClubBaseInfo getVClubBaseInfos(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getVClubBaseInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder> getVClubBaseInfosBuilderList();

            public final native int getVClubBaseInfosCount();

            public final native List<ClubBaseInfo> getVClubBaseInfosList();

            public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

            public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

            public final native boolean hasStLeagueBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4225mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4226mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4227mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4228mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4229mergeFrom(Message message);

            public final native Builder mergeFrom(LeagueInfo leagueInfo);

            public final native Builder mergeStLeagueBaseInfo(LeagueBaseInfo leagueBaseInfo);

            public final native Builder removeVClubBaseInfos(int i);

            public final native Builder setStLeagueBaseInfo(Builder builder);

            public final native Builder setStLeagueBaseInfo(LeagueBaseInfo leagueBaseInfo);

            public final native Builder setVClubBaseInfos(int i, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setVClubBaseInfos(int i, ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f201c;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{6941, 6942, 6943, 6944, 6945, 6946, 6947, 6948, 6949, 6950, 6951, 6952, 6953, 6954, 6955, 6956, 6957, 6958, 6959, 6960, 6961, 6962, 6963, 6964, 6965, 6966, 6967, 6968, 6969, 6970, 6971, 6972});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native LeagueInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ LeagueInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, LeagueInfo leagueInfo);

        private native LeagueInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ LeagueInfo(com.google.protobuf.GeneratedMessage.Builder builder, LeagueInfo leagueInfo);

        private native LeagueInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4206getDefaultInstanceForType();

        public final native LeagueInfo m4207getDefaultInstanceForType();

        public final native Parser<LeagueInfo> getParserForType();

        public final native int getSerializedSize();

        public final native LeagueBaseInfo getStLeagueBaseInfo();

        public final native LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native ClubBaseInfo getVClubBaseInfos(int i);

        public final native int getVClubBaseInfosCount();

        public final native List<ClubBaseInfo> getVClubBaseInfosList();

        public final native ClubBaseInfoOrBuilder getVClubBaseInfosOrBuilder(int i);

        public final native List<? extends ClubBaseInfoOrBuilder> getVClubBaseInfosOrBuilderList();

        public final native boolean hasStLeagueBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4208newBuilderForType();

        public final native Builder m4209newBuilderForType();

        protected final native Builder m4210newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4211toBuilder();

        public final native Builder m4212toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static LeagueInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f201c;
        }

        static void __clinit__() {
            PARSER = new C02591();
            LeagueInfo leagueInfo = new LeagueInfo(true);
            defaultInstance = leagueInfo;
            leagueInfo.initFields();
        }

        public static LeagueInfo parseFrom(ByteString byteString) {
            return (LeagueInfo) PARSER.parseFrom(byteString);
        }

        public static LeagueInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LeagueInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LeagueInfo parseFrom(byte[] bArr) {
            return (LeagueInfo) PARSER.parseFrom(bArr);
        }

        public static LeagueInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LeagueInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LeagueInfo parseFrom(InputStream inputStream) {
            return (LeagueInfo) PARSER.parseFrom(inputStream);
        }

        public static LeagueInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LeagueInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static LeagueInfo parseDelimitedFrom(InputStream inputStream) {
            return (LeagueInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static LeagueInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LeagueInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static LeagueInfo parseFrom(CodedInputStream codedInputStream) {
            return (LeagueInfo) PARSER.parseFrom(codedInputStream);
        }

        public static LeagueInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LeagueInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(LeagueInfo leagueInfo) {
            return newBuilder().mergeFrom(leagueInfo);
        }
    }

    public interface LeaguePushMsgOrBuilder extends MessageOrBuilder {
        LEAGUE_MESSAGE_TYPE getELeagueMessageType();

        long getLFromUuid();

        long getLMsgID();

        String getSFromNick();

        ByteString getSFromNickBytes();

        String getSMsg();

        ByteString getSMsgBytes();

        ClubBaseInfo getStFromClub();

        ClubBaseInfoOrBuilder getStFromClubOrBuilder();

        LeagueBaseInfo getStLeagueBaseInfo();

        LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

        ClubBaseInfo getStToClub();

        ClubBaseInfoOrBuilder getStToClubOrBuilder();

        boolean hasELeagueMessageType();

        boolean hasLFromUuid();

        boolean hasLMsgID();

        boolean hasSFromNick();

        boolean hasSMsg();

        boolean hasStFromClub();

        boolean hasStLeagueBaseInfo();

        boolean hasStToClub();
    }

    public static final class LeaguePushMsg extends GeneratedMessage implements LeaguePushMsgOrBuilder {
        public static final int ELEAGUEMESSAGETYPE_FIELD_NUMBER = 2;
        public static final int LFROMUUID_FIELD_NUMBER = 7;
        public static final int LMSGID_FIELD_NUMBER = 1;
        public static Parser<LeaguePushMsg> PARSER = null;
        public static final int SFROMNICK_FIELD_NUMBER = 8;
        public static final int SMSG_FIELD_NUMBER = 6;
        public static final int STFROMCLUB_FIELD_NUMBER = 3;
        public static final int STLEAGUEBASEINFO_FIELD_NUMBER = 5;
        public static final int STTOCLUB_FIELD_NUMBER = 4;
        private static final LeaguePushMsg defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LEAGUE_MESSAGE_TYPE eLeagueMessageType_;
        private long lFromUuid_;
        private long lMsgID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sFromNick_;
        private Object sMsg_;
        private ClubBaseInfo stFromClub_;
        private LeagueBaseInfo stLeagueBaseInfo_;
        private ClubBaseInfo stToClub_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.LeaguePushMsg.1 */
        class C02601 extends AbstractParser<LeaguePushMsg> {
            static {
                fixHelper.fixfunc(new int[]{24699, 24700});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02601();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements LeaguePushMsgOrBuilder {
            private int bitField0_;
            private LEAGUE_MESSAGE_TYPE eLeagueMessageType_;
            private long lFromUuid_;
            private long lMsgID_;
            private Object sFromNick_;
            private Object sMsg_;
            private SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> stFromClubBuilder_;
            private ClubBaseInfo stFromClub_;
            private SingleFieldBuilder<LeagueBaseInfo, Builder, LeagueBaseInfoOrBuilder> stLeagueBaseInfoBuilder_;
            private LeagueBaseInfo stLeagueBaseInfo_;
            private SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> stToClubBuilder_;
            private ClubBaseInfo stToClub_;

            static {
                fixHelper.fixfunc(new int[]{30634, 30635, 30636, 30637, 30638, 30639, 30640, 30641, 30642, 30643, 30644, 30645, 30646, 30647, 30648, 30649, 30650, 30651, 30652, 30653, 30654, 30655, 30656, 30657, 30658, 30659, 30660, 30661, 30662, 30663, 30664, 30665, 30666, 30667, 30668, 30669, 30670, 30671, 30672, 30673, 30674, 30675, 30676, 30677, 30678, 30679, 30680, 30681, 30682, 30683, 30684, 30685, 30686, 30687, 30688, 30689, 30690, 30691, 30692, 30693, 30694, 30695, 30696, 30697, 30698, 30699, 30700, 30701, 30702, 30703, 30704, 30705, 30706, 30707, 30708, 30709, 30710, 30711, 30712, 30713, 30714, 30715, 30716});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getStFromClubFieldBuilder();

            private native SingleFieldBuilder<LeagueBaseInfo, Builder, LeagueBaseInfoOrBuilder> getStLeagueBaseInfoFieldBuilder();

            private native SingleFieldBuilder<ClubBaseInfo, com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder, ClubBaseInfoOrBuilder> getStToClubFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4237build();

            public final native LeaguePushMsg m4238build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4239buildPartial();

            public final native LeaguePushMsg m4240buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4241clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4242clear();

            public final native Builder m4243clear();

            public final native Builder clearELeagueMessageType();

            public final native Builder clearLFromUuid();

            public final native Builder clearLMsgID();

            public final native Builder clearSFromNick();

            public final native Builder clearSMsg();

            public final native Builder clearStFromClub();

            public final native Builder clearStLeagueBaseInfo();

            public final native Builder clearStToClub();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4244clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4245clone();

            public final native Builder m4246clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4247getDefaultInstanceForType();

            public final native LeaguePushMsg m4248getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native LEAGUE_MESSAGE_TYPE getELeagueMessageType();

            public final native long getLFromUuid();

            public final native long getLMsgID();

            public final native String getSFromNick();

            public final native ByteString getSFromNickBytes();

            public final native String getSMsg();

            public final native ByteString getSMsgBytes();

            public final native ClubBaseInfo getStFromClub();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getStFromClubBuilder();

            public final native ClubBaseInfoOrBuilder getStFromClubOrBuilder();

            public final native LeagueBaseInfo getStLeagueBaseInfo();

            public final native Builder getStLeagueBaseInfoBuilder();

            public final native LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

            public final native ClubBaseInfo getStToClub();

            public final native com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder getStToClubBuilder();

            public final native ClubBaseInfoOrBuilder getStToClubOrBuilder();

            public final native boolean hasELeagueMessageType();

            public final native boolean hasLFromUuid();

            public final native boolean hasLMsgID();

            public final native boolean hasSFromNick();

            public final native boolean hasSMsg();

            public final native boolean hasStFromClub();

            public final native boolean hasStLeagueBaseInfo();

            public final native boolean hasStToClub();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4249mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4250mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4251mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4252mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4253mergeFrom(Message message);

            public final native Builder mergeFrom(LeaguePushMsg leaguePushMsg);

            public final native Builder mergeStFromClub(ClubBaseInfo clubBaseInfo);

            public final native Builder mergeStLeagueBaseInfo(LeagueBaseInfo leagueBaseInfo);

            public final native Builder mergeStToClub(ClubBaseInfo clubBaseInfo);

            public final native Builder setELeagueMessageType(LEAGUE_MESSAGE_TYPE league_message_type);

            public final native Builder setLFromUuid(long j);

            public final native Builder setLMsgID(long j);

            public final native Builder setSFromNick(String str);

            public final native Builder setSFromNickBytes(ByteString byteString);

            public final native Builder setSMsg(String str);

            public final native Builder setSMsgBytes(ByteString byteString);

            public final native Builder setStFromClub(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setStFromClub(ClubBaseInfo clubBaseInfo);

            public final native Builder setStLeagueBaseInfo(Builder builder);

            public final native Builder setStLeagueBaseInfo(LeagueBaseInfo leagueBaseInfo);

            public final native Builder setStToClub(com.texaspoker.moment.TexasPokerCommon.ClubBaseInfo.Builder builder);

            public final native Builder setStToClub(ClubBaseInfo clubBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f192S;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7321, 7322, 7323, 7324, 7325, 7326, 7327, 7328, 7329, 7330, 7331, 7332, 7333, 7334, 7335, 7336, 7337, 7338, 7339, 7340, 7341, 7342, 7343, 7344, 7345, 7346, 7347, 7348, 7349, 7350, 7351, 7352, 7353, 7354, 7355, 7356, 7357, 7358, 7359, 7360, 7361, 7362, 7363, 7364, 7365});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native LeaguePushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ LeaguePushMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, LeaguePushMsg leaguePushMsg);

        private native LeaguePushMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ LeaguePushMsg(com.google.protobuf.GeneratedMessage.Builder builder, LeaguePushMsg leaguePushMsg);

        private native LeaguePushMsg(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4230getDefaultInstanceForType();

        public final native LeaguePushMsg m4231getDefaultInstanceForType();

        public final native LEAGUE_MESSAGE_TYPE getELeagueMessageType();

        public final native long getLFromUuid();

        public final native long getLMsgID();

        public final native Parser<LeaguePushMsg> getParserForType();

        public final native String getSFromNick();

        public final native ByteString getSFromNickBytes();

        public final native String getSMsg();

        public final native ByteString getSMsgBytes();

        public final native int getSerializedSize();

        public final native ClubBaseInfo getStFromClub();

        public final native ClubBaseInfoOrBuilder getStFromClubOrBuilder();

        public final native LeagueBaseInfo getStLeagueBaseInfo();

        public final native LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

        public final native ClubBaseInfo getStToClub();

        public final native ClubBaseInfoOrBuilder getStToClubOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasELeagueMessageType();

        public final native boolean hasLFromUuid();

        public final native boolean hasLMsgID();

        public final native boolean hasSFromNick();

        public final native boolean hasSMsg();

        public final native boolean hasStFromClub();

        public final native boolean hasStLeagueBaseInfo();

        public final native boolean hasStToClub();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4232newBuilderForType();

        public final native Builder m4233newBuilderForType();

        protected final native Builder m4234newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4235toBuilder();

        public final native Builder m4236toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static LeaguePushMsg getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f192S;
        }

        static void __clinit__() {
            PARSER = new C02601();
            LeaguePushMsg leaguePushMsg = new LeaguePushMsg(true);
            defaultInstance = leaguePushMsg;
            leaguePushMsg.initFields();
        }

        public static LeaguePushMsg parseFrom(ByteString byteString) {
            return (LeaguePushMsg) PARSER.parseFrom(byteString);
        }

        public static LeaguePushMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LeaguePushMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LeaguePushMsg parseFrom(byte[] bArr) {
            return (LeaguePushMsg) PARSER.parseFrom(bArr);
        }

        public static LeaguePushMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LeaguePushMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LeaguePushMsg parseFrom(InputStream inputStream) {
            return (LeaguePushMsg) PARSER.parseFrom(inputStream);
        }

        public static LeaguePushMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LeaguePushMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static LeaguePushMsg parseDelimitedFrom(InputStream inputStream) {
            return (LeaguePushMsg) PARSER.parseDelimitedFrom(inputStream);
        }

        public static LeaguePushMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LeaguePushMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static LeaguePushMsg parseFrom(CodedInputStream codedInputStream) {
            return (LeaguePushMsg) PARSER.parseFrom(codedInputStream);
        }

        public static LeaguePushMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LeaguePushMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(LeaguePushMsg leaguePushMsg) {
            return newBuilder().mergeFrom(leaguePushMsg);
        }
    }

    public interface SCAddLeagueMaxMemberRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        int getIMaxMembers();

        long getLClubID();

        boolean hasEErrCode();

        boolean hasIMaxMembers();

        boolean hasLClubID();
    }

    public static final class SCAddLeagueMaxMemberRsp extends GeneratedMessage implements SCAddLeagueMaxMemberRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IMAXMEMBERS_FIELD_NUMBER = 3;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<SCAddLeagueMaxMemberRsp> PARSER;
        private static final SCAddLeagueMaxMemberRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iMaxMembers_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCAddLeagueMaxMemberRsp.1 */
        class C02611 extends AbstractParser<SCAddLeagueMaxMemberRsp> {
            static {
                fixHelper.fixfunc(new int[]{25021, 25022});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02611();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCAddLeagueMaxMemberRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iMaxMembers_;
            private long lClubID_;

            static {
                fixHelper.fixfunc(new int[]{10807, 10808, 10809, 10810, 10811, 10812, 10813, 10814, 10815, 10816, 10817, 10818, 10819, 10820, 10821, 10822, 10823, 10824, 10825, 10826, 10827, 10828, 10829, 10830, 10831, 10832, 10833, 10834, 10835, 10836, 10837, 10838, 10839, 10840, 10841, 10842, 10843, 10844, 10845, 10846, 10847, 10848, 10849, 10850});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4261build();

            public final native SCAddLeagueMaxMemberRsp m4262build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4263buildPartial();

            public final native SCAddLeagueMaxMemberRsp m4264buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4265clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4266clear();

            public final native Builder m4267clear();

            public final native Builder clearEErrCode();

            public final native Builder clearIMaxMembers();

            public final native Builder clearLClubID();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4268clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4269clone();

            public final native Builder m4270clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4271getDefaultInstanceForType();

            public final native SCAddLeagueMaxMemberRsp m4272getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native int getIMaxMembers();

            public final native long getLClubID();

            public final native boolean hasEErrCode();

            public final native boolean hasIMaxMembers();

            public final native boolean hasLClubID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4273mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4274mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4275mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4276mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4277mergeFrom(Message message);

            public final native Builder mergeFrom(SCAddLeagueMaxMemberRsp sCAddLeagueMaxMemberRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIMaxMembers(int i);

            public final native Builder setLClubID(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f190Q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{20457, 20458, 20459, 20460, 20461, 20462, 20463, 20464, 20465, 20466, 20467, 20468, 20469, 20470, 20471, 20472, 20473, 20474, 20475, 20476, 20477, 20478, 20479, 20480, 20481, 20482, 20483, 20484, 20485, 20486});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCAddLeagueMaxMemberRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCAddLeagueMaxMemberRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCAddLeagueMaxMemberRsp sCAddLeagueMaxMemberRsp);

        private native SCAddLeagueMaxMemberRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCAddLeagueMaxMemberRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCAddLeagueMaxMemberRsp sCAddLeagueMaxMemberRsp);

        private native SCAddLeagueMaxMemberRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4254getDefaultInstanceForType();

        public final native SCAddLeagueMaxMemberRsp m4255getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIMaxMembers();

        public final native long getLClubID();

        public final native Parser<SCAddLeagueMaxMemberRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasIMaxMembers();

        public final native boolean hasLClubID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4256newBuilderForType();

        public final native Builder m4257newBuilderForType();

        protected final native Builder m4258newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4259toBuilder();

        public final native Builder m4260toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCAddLeagueMaxMemberRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f190Q;
        }

        static void __clinit__() {
            PARSER = new C02611();
            SCAddLeagueMaxMemberRsp sCAddLeagueMaxMemberRsp = new SCAddLeagueMaxMemberRsp(true);
            defaultInstance = sCAddLeagueMaxMemberRsp;
            sCAddLeagueMaxMemberRsp.initFields();
        }

        public static SCAddLeagueMaxMemberRsp parseFrom(ByteString byteString) {
            return (SCAddLeagueMaxMemberRsp) PARSER.parseFrom(byteString);
        }

        public static SCAddLeagueMaxMemberRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddLeagueMaxMemberRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCAddLeagueMaxMemberRsp parseFrom(byte[] bArr) {
            return (SCAddLeagueMaxMemberRsp) PARSER.parseFrom(bArr);
        }

        public static SCAddLeagueMaxMemberRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddLeagueMaxMemberRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCAddLeagueMaxMemberRsp parseFrom(InputStream inputStream) {
            return (SCAddLeagueMaxMemberRsp) PARSER.parseFrom(inputStream);
        }

        public static SCAddLeagueMaxMemberRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddLeagueMaxMemberRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCAddLeagueMaxMemberRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCAddLeagueMaxMemberRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCAddLeagueMaxMemberRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddLeagueMaxMemberRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCAddLeagueMaxMemberRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCAddLeagueMaxMemberRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCAddLeagueMaxMemberRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCAddLeagueMaxMemberRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCAddLeagueMaxMemberRsp sCAddLeagueMaxMemberRsp) {
            return newBuilder().mergeFrom(sCAddLeagueMaxMemberRsp);
        }
    }

    public interface SCCreateLeagueRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        LeagueInfo getStLeagueInfo();

        LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStLeagueInfo();
    }

    public static final class SCCreateLeagueRsp extends GeneratedMessage implements SCCreateLeagueRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCCreateLeagueRsp> PARSER = null;
        public static final int STLEAGUEINFO_FIELD_NUMBER = 2;
        private static final SCCreateLeagueRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LeagueInfo stLeagueInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCCreateLeagueRsp.1 */
        class C02621 extends AbstractParser<SCCreateLeagueRsp> {
            static {
                fixHelper.fixfunc(new int[]{12245, 12246});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02621();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCCreateLeagueRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<LeagueInfo, Builder, LeagueInfoOrBuilder> stLeagueInfoBuilder_;
            private LeagueInfo stLeagueInfo_;

            static {
                fixHelper.fixfunc(new int[]{19452, 19453, 19454, 19455, 19456, 19457, 19458, 19459, 19460, 19461, 19462, 19463, 19464, 19465, 19466, 19467, 19468, 19469, 19470, 19471, 19472, 19473, 19474, 19475, 19476, 19477, 19478, 19479, 19480, 19481, 19482, 19483, 19484, 19485, 19486, 19487, 19488, 19489, 19490, 19491, 19492, 19493, 19494, 19495, 19496});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<LeagueInfo, Builder, LeagueInfoOrBuilder> getStLeagueInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4285build();

            public final native SCCreateLeagueRsp m4286build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4287buildPartial();

            public final native SCCreateLeagueRsp m4288buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4289clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4290clear();

            public final native Builder m4291clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStLeagueInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4292clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4293clone();

            public final native Builder m4294clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4295getDefaultInstanceForType();

            public final native SCCreateLeagueRsp m4296getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native LeagueInfo getStLeagueInfo();

            public final native Builder getStLeagueInfoBuilder();

            public final native LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStLeagueInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4297mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4298mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4299mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4300mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4301mergeFrom(Message message);

            public final native Builder mergeFrom(SCCreateLeagueRsp sCCreateLeagueRsp);

            public final native Builder mergeStLeagueInfo(LeagueInfo leagueInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStLeagueInfo(Builder builder);

            public final native Builder setStLeagueInfo(LeagueInfo leagueInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f205g;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{28821, 28822, 28823, 28824, 28825, 28826, 28827, 28828, 28829, 28830, 28831, 28832, 28833, 28834, 28835, 28836, 28837, 28838, 28839, 28840, 28841, 28842, 28843, 28844, 28845, 28846, 28847, 28848, 28849});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCCreateLeagueRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCCreateLeagueRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCCreateLeagueRsp sCCreateLeagueRsp);

        private native SCCreateLeagueRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCCreateLeagueRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCCreateLeagueRsp sCCreateLeagueRsp);

        private native SCCreateLeagueRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4278getDefaultInstanceForType();

        public final native SCCreateLeagueRsp m4279getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCCreateLeagueRsp> getParserForType();

        public final native int getSerializedSize();

        public final native LeagueInfo getStLeagueInfo();

        public final native LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStLeagueInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4280newBuilderForType();

        public final native Builder m4281newBuilderForType();

        protected final native Builder m4282newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4283toBuilder();

        public final native Builder m4284toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCCreateLeagueRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f205g;
        }

        static void __clinit__() {
            PARSER = new C02621();
            SCCreateLeagueRsp sCCreateLeagueRsp = new SCCreateLeagueRsp(true);
            defaultInstance = sCCreateLeagueRsp;
            sCCreateLeagueRsp.initFields();
        }

        public static SCCreateLeagueRsp parseFrom(ByteString byteString) {
            return (SCCreateLeagueRsp) PARSER.parseFrom(byteString);
        }

        public static SCCreateLeagueRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCreateLeagueRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCCreateLeagueRsp parseFrom(byte[] bArr) {
            return (SCCreateLeagueRsp) PARSER.parseFrom(bArr);
        }

        public static SCCreateLeagueRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCreateLeagueRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCCreateLeagueRsp parseFrom(InputStream inputStream) {
            return (SCCreateLeagueRsp) PARSER.parseFrom(inputStream);
        }

        public static SCCreateLeagueRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCreateLeagueRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCCreateLeagueRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCCreateLeagueRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCCreateLeagueRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCreateLeagueRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCCreateLeagueRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCCreateLeagueRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCCreateLeagueRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCCreateLeagueRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCCreateLeagueRsp sCCreateLeagueRsp) {
            return newBuilder().mergeFrom(sCCreateLeagueRsp);
        }
    }

    public interface SCEnterLeagueRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLLeagueID();

        boolean hasEErrCode();

        boolean hasLLeagueID();
    }

    public static final class SCEnterLeagueRsp extends GeneratedMessage implements SCEnterLeagueRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LLEAGUEID_FIELD_NUMBER = 2;
        public static Parser<SCEnterLeagueRsp> PARSER;
        private static final SCEnterLeagueRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lLeagueID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCEnterLeagueRsp.1 */
        class C02631 extends AbstractParser<SCEnterLeagueRsp> {
            static {
                fixHelper.fixfunc(new int[]{11829, 11830});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02631();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCEnterLeagueRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lLeagueID_;

            static {
                fixHelper.fixfunc(new int[]{24305, 24306, 24307, 24308, 24309, 24310, 24311, 24312, 24313, 24314, 24315, 24316, 24317, 24318, 24319, 24320, 24321, 24322, 24323, 24324, 24325, 24326, 24327, 24328, 24329, 24330, 24331, 24332, 24333, 24334, 24335, 24336, 24337, 24338, 24339, 24340, 24341, 24342, 24343, 24344});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4309build();

            public final native SCEnterLeagueRsp m4310build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4311buildPartial();

            public final native SCEnterLeagueRsp m4312buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4313clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4314clear();

            public final native Builder m4315clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLLeagueID();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4316clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4317clone();

            public final native Builder m4318clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4319getDefaultInstanceForType();

            public final native SCEnterLeagueRsp m4817getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLLeagueID();

            public final native boolean hasEErrCode();

            public final native boolean hasLLeagueID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4818mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4819mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4820mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4821mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4822mergeFrom(Message message);

            public final native Builder mergeFrom(SCEnterLeagueRsp sCEnterLeagueRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLLeagueID(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f209k;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{15904, 15905, 15906, 15907, 15908, 15909, 15910, 15911, 15912, 15913, 15914, 15915, 15916, 15917, 15918, 15919, 15920, 15921, 15922, 15923, 15924, 15925, 15926, 15927, 15928, 15929, 15930, 15931});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCEnterLeagueRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCEnterLeagueRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCEnterLeagueRsp sCEnterLeagueRsp);

        private native SCEnterLeagueRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCEnterLeagueRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCEnterLeagueRsp sCEnterLeagueRsp);

        private native SCEnterLeagueRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4302getDefaultInstanceForType();

        public final native SCEnterLeagueRsp m4303getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLLeagueID();

        public final native Parser<SCEnterLeagueRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLLeagueID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4304newBuilderForType();

        public final native Builder m4305newBuilderForType();

        protected final native Builder m4306newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4307toBuilder();

        public final native Builder m4308toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCEnterLeagueRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f209k;
        }

        static void __clinit__() {
            PARSER = new C02631();
            SCEnterLeagueRsp sCEnterLeagueRsp = new SCEnterLeagueRsp(true);
            defaultInstance = sCEnterLeagueRsp;
            sCEnterLeagueRsp.initFields();
        }

        public static SCEnterLeagueRsp parseFrom(ByteString byteString) {
            return (SCEnterLeagueRsp) PARSER.parseFrom(byteString);
        }

        public static SCEnterLeagueRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCEnterLeagueRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCEnterLeagueRsp parseFrom(byte[] bArr) {
            return (SCEnterLeagueRsp) PARSER.parseFrom(bArr);
        }

        public static SCEnterLeagueRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCEnterLeagueRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCEnterLeagueRsp parseFrom(InputStream inputStream) {
            return (SCEnterLeagueRsp) PARSER.parseFrom(inputStream);
        }

        public static SCEnterLeagueRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCEnterLeagueRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCEnterLeagueRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCEnterLeagueRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCEnterLeagueRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCEnterLeagueRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCEnterLeagueRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCEnterLeagueRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCEnterLeagueRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCEnterLeagueRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCEnterLeagueRsp sCEnterLeagueRsp) {
            return newBuilder().mergeFrom(sCEnterLeagueRsp);
        }
    }

    public interface SCGetLeagueBaseInfoByLeagueIDRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        LeagueBaseInfo getStLeagueBaseInfo();

        LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStLeagueBaseInfo();
    }

    public static final class SCGetLeagueBaseInfoByLeagueIDRsp extends GeneratedMessage implements SCGetLeagueBaseInfoByLeagueIDRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetLeagueBaseInfoByLeagueIDRsp> PARSER = null;
        public static final int STLEAGUEBASEINFO_FIELD_NUMBER = 2;
        private static final SCGetLeagueBaseInfoByLeagueIDRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LeagueBaseInfo stLeagueBaseInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCGetLeagueBaseInfoByLeagueIDRsp.1 */
        class C02641 extends AbstractParser<SCGetLeagueBaseInfoByLeagueIDRsp> {
            static {
                fixHelper.fixfunc(new int[]{18172, 18173});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02641();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetLeagueBaseInfoByLeagueIDRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<LeagueBaseInfo, Builder, LeagueBaseInfoOrBuilder> stLeagueBaseInfoBuilder_;
            private LeagueBaseInfo stLeagueBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{23162, 23163, 23164, 23165, 23166, 23167, 23168, 23169, 23170, 23171, 23172, 23173, 23174, 23175, 23176, 23177, 23178, 23179, 23180, 23181, 23182, 23183, 23184, 23185, 23186, 23187, 23188, 23189, 23190, 23191, 23192, 23193, 23194, 23195, 23196, 23197, 23198, 23199, 23200, 23201, 23202, 23203, 23204, 23205, 23206});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<LeagueBaseInfo, Builder, LeagueBaseInfoOrBuilder> getStLeagueBaseInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4830build();

            public final native SCGetLeagueBaseInfoByLeagueIDRsp m4831build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4832buildPartial();

            public final native SCGetLeagueBaseInfoByLeagueIDRsp m4833buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4834clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4835clear();

            public final native Builder m4836clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStLeagueBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4837clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4838clone();

            public final native Builder m4839clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4840getDefaultInstanceForType();

            public final native SCGetLeagueBaseInfoByLeagueIDRsp m4841getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native LeagueBaseInfo getStLeagueBaseInfo();

            public final native Builder getStLeagueBaseInfoBuilder();

            public final native LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStLeagueBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4842mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4843mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4844mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4845mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4846mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetLeagueBaseInfoByLeagueIDRsp sCGetLeagueBaseInfoByLeagueIDRsp);

            public final native Builder mergeStLeagueBaseInfo(LeagueBaseInfo leagueBaseInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStLeagueBaseInfo(Builder builder);

            public final native Builder setStLeagueBaseInfo(LeagueBaseInfo leagueBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f178E;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31141, 31142, 31143, 31144, 31145, 31146, 31147, 31148, 31149, 31150, 31151, 31152, 31153, 31154, 31155, 31156, 31157, 31158, 31159, 31160, 31161, 31162, 31163, 31164, 31165, 31166, 31167, 31168, 31169});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetLeagueBaseInfoByLeagueIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetLeagueBaseInfoByLeagueIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetLeagueBaseInfoByLeagueIDRsp sCGetLeagueBaseInfoByLeagueIDRsp);

        private native SCGetLeagueBaseInfoByLeagueIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetLeagueBaseInfoByLeagueIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetLeagueBaseInfoByLeagueIDRsp sCGetLeagueBaseInfoByLeagueIDRsp);

        private native SCGetLeagueBaseInfoByLeagueIDRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4823getDefaultInstanceForType();

        public final native SCGetLeagueBaseInfoByLeagueIDRsp m4824getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetLeagueBaseInfoByLeagueIDRsp> getParserForType();

        public final native int getSerializedSize();

        public final native LeagueBaseInfo getStLeagueBaseInfo();

        public final native LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStLeagueBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4825newBuilderForType();

        public final native Builder m4826newBuilderForType();

        protected final native Builder m4827newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4828toBuilder();

        public final native Builder m4829toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetLeagueBaseInfoByLeagueIDRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f178E;
        }

        static void __clinit__() {
            PARSER = new C02641();
            SCGetLeagueBaseInfoByLeagueIDRsp sCGetLeagueBaseInfoByLeagueIDRsp = new SCGetLeagueBaseInfoByLeagueIDRsp(true);
            defaultInstance = sCGetLeagueBaseInfoByLeagueIDRsp;
            sCGetLeagueBaseInfoByLeagueIDRsp.initFields();
        }

        public static SCGetLeagueBaseInfoByLeagueIDRsp parseFrom(ByteString byteString) {
            return (SCGetLeagueBaseInfoByLeagueIDRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetLeagueBaseInfoByLeagueIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueBaseInfoByLeagueIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetLeagueBaseInfoByLeagueIDRsp parseFrom(byte[] bArr) {
            return (SCGetLeagueBaseInfoByLeagueIDRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetLeagueBaseInfoByLeagueIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueBaseInfoByLeagueIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetLeagueBaseInfoByLeagueIDRsp parseFrom(InputStream inputStream) {
            return (SCGetLeagueBaseInfoByLeagueIDRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetLeagueBaseInfoByLeagueIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueBaseInfoByLeagueIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetLeagueBaseInfoByLeagueIDRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetLeagueBaseInfoByLeagueIDRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetLeagueBaseInfoByLeagueIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueBaseInfoByLeagueIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetLeagueBaseInfoByLeagueIDRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetLeagueBaseInfoByLeagueIDRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetLeagueBaseInfoByLeagueIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueBaseInfoByLeagueIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetLeagueBaseInfoByLeagueIDRsp sCGetLeagueBaseInfoByLeagueIDRsp) {
            return newBuilder().mergeFrom(sCGetLeagueBaseInfoByLeagueIDRsp);
        }
    }

    public interface SCGetLeagueByLeagueIDRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        LeagueInfo getStLeagueInfo();

        LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStLeagueInfo();
    }

    public static final class SCGetLeagueByLeagueIDRsp extends GeneratedMessage implements SCGetLeagueByLeagueIDRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetLeagueByLeagueIDRsp> PARSER = null;
        public static final int STLEAGUEINFO_FIELD_NUMBER = 2;
        private static final SCGetLeagueByLeagueIDRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LeagueInfo stLeagueInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCGetLeagueByLeagueIDRsp.1 */
        class C02651 extends AbstractParser<SCGetLeagueByLeagueIDRsp> {
            static {
                fixHelper.fixfunc(new int[]{24030, 24031});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02651();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetLeagueByLeagueIDRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<LeagueInfo, Builder, LeagueInfoOrBuilder> stLeagueInfoBuilder_;
            private LeagueInfo stLeagueInfo_;

            static {
                fixHelper.fixfunc(new int[]{11430, 11431, 11432, 11433, 11434, 11435, 11436, 11437, 11438, 11439, 11440, 11441, 11442, 11443, 11444, 11445, 11446, 11447, 11448, 11449, 11450, 11451, 11452, 11453, 11454, 11455, 11456, 11457, 11458, 11459, 11460, 11461, 11462, 11463, 11464, 11465, 11466, 11467, 11468, 11469, 11470, 11471, 11472, 11473, 11474});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<LeagueInfo, Builder, LeagueInfoOrBuilder> getStLeagueInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4854build();

            public final native SCGetLeagueByLeagueIDRsp m4855build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4856buildPartial();

            public final native SCGetLeagueByLeagueIDRsp m4857buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4858clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4859clear();

            public final native Builder m4860clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStLeagueInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4861clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4862clone();

            public final native Builder m4863clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4864getDefaultInstanceForType();

            public final native SCGetLeagueByLeagueIDRsp m4865getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native LeagueInfo getStLeagueInfo();

            public final native Builder getStLeagueInfoBuilder();

            public final native LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStLeagueInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4866mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4867mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4868mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4869mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4870mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetLeagueByLeagueIDRsp sCGetLeagueByLeagueIDRsp);

            public final native Builder mergeStLeagueInfo(LeagueInfo leagueInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStLeagueInfo(Builder builder);

            public final native Builder setStLeagueInfo(LeagueInfo leagueInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f182I;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{18060, 18061, 18062, 18063, 18064, 18065, 18066, 18067, 18068, 18069, 18070, 18071, 18072, 18073, 18074, 18075, 18076, 18077, 18078, 18079, 18080, 18081, 18082, 18083, 18084, 18085, 18086, 18087, 18088});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetLeagueByLeagueIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetLeagueByLeagueIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetLeagueByLeagueIDRsp sCGetLeagueByLeagueIDRsp);

        private native SCGetLeagueByLeagueIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetLeagueByLeagueIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetLeagueByLeagueIDRsp sCGetLeagueByLeagueIDRsp);

        private native SCGetLeagueByLeagueIDRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4847getDefaultInstanceForType();

        public final native SCGetLeagueByLeagueIDRsp m4848getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetLeagueByLeagueIDRsp> getParserForType();

        public final native int getSerializedSize();

        public final native LeagueInfo getStLeagueInfo();

        public final native LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStLeagueInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4849newBuilderForType();

        public final native Builder m4850newBuilderForType();

        protected final native Builder m4851newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4852toBuilder();

        public final native Builder m4853toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetLeagueByLeagueIDRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f182I;
        }

        static void __clinit__() {
            PARSER = new C02651();
            SCGetLeagueByLeagueIDRsp sCGetLeagueByLeagueIDRsp = new SCGetLeagueByLeagueIDRsp(true);
            defaultInstance = sCGetLeagueByLeagueIDRsp;
            sCGetLeagueByLeagueIDRsp.initFields();
        }

        public static SCGetLeagueByLeagueIDRsp parseFrom(ByteString byteString) {
            return (SCGetLeagueByLeagueIDRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetLeagueByLeagueIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueByLeagueIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetLeagueByLeagueIDRsp parseFrom(byte[] bArr) {
            return (SCGetLeagueByLeagueIDRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetLeagueByLeagueIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueByLeagueIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetLeagueByLeagueIDRsp parseFrom(InputStream inputStream) {
            return (SCGetLeagueByLeagueIDRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetLeagueByLeagueIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueByLeagueIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetLeagueByLeagueIDRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetLeagueByLeagueIDRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetLeagueByLeagueIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueByLeagueIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetLeagueByLeagueIDRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetLeagueByLeagueIDRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetLeagueByLeagueIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueByLeagueIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetLeagueByLeagueIDRsp sCGetLeagueByLeagueIDRsp) {
            return newBuilder().mergeFrom(sCGetLeagueByLeagueIDRsp);
        }
    }

    public interface SCGetLeagueInfoByClubIDRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLClubID();

        LeagueInfo getVLeagueInfos(int i);

        int getVLeagueInfosCount();

        List<LeagueInfo> getVLeagueInfosList();

        LeagueInfoOrBuilder getVLeagueInfosOrBuilder(int i);

        List<? extends LeagueInfoOrBuilder> getVLeagueInfosOrBuilderList();

        boolean hasEErrCode();

        boolean hasLClubID();
    }

    public static final class SCGetLeagueInfoByClubIDRsp extends GeneratedMessage implements SCGetLeagueInfoByClubIDRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static Parser<SCGetLeagueInfoByClubIDRsp> PARSER = null;
        public static final int VLEAGUEINFOS_FIELD_NUMBER = 3;
        private static final SCGetLeagueInfoByClubIDRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lClubID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<LeagueInfo> vLeagueInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCGetLeagueInfoByClubIDRsp.1 */
        class C02661 extends AbstractParser<SCGetLeagueInfoByClubIDRsp> {
            static {
                fixHelper.fixfunc(new int[]{5102, 5103});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02661();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetLeagueInfoByClubIDRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lClubID_;
            private RepeatedFieldBuilder<LeagueInfo, Builder, LeagueInfoOrBuilder> vLeagueInfosBuilder_;
            private List<LeagueInfo> vLeagueInfos_;

            static {
                fixHelper.fixfunc(new int[]{20567, 20568, 20569, 20570, 20571, 20572, 20573, 20574, 20575, 20576, 20577, 20578, 20579, 20580, 20581, 20582, 20583, 20584, 20585, 20586, 20587, 20588, 20589, 20590, 20591, 20592, 20593, 20594, 20595, 20596, 20597, 20598, 20599, 20600, 20601, 20602, 20603, 20604, 20605, 20606, 20607, 20608, 20609, 20610, 20611, 20612, 20613, 20614, 20615, 20616, 20617, 20618, 20619, 20620, 20621, 20622, 20623, 20624, 20625, 20626});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVLeagueInfosIsMutable();

            private native RepeatedFieldBuilder<LeagueInfo, Builder, LeagueInfoOrBuilder> getVLeagueInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVLeagueInfos(Iterable<? extends LeagueInfo> iterable);

            public final native Builder addVLeagueInfos(int i, Builder builder);

            public final native Builder addVLeagueInfos(int i, LeagueInfo leagueInfo);

            public final native Builder addVLeagueInfos(Builder builder);

            public final native Builder addVLeagueInfos(LeagueInfo leagueInfo);

            public final native Builder addVLeagueInfosBuilder();

            public final native Builder addVLeagueInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4878build();

            public final native SCGetLeagueInfoByClubIDRsp m4879build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4880buildPartial();

            public final native SCGetLeagueInfoByClubIDRsp m4881buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4882clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4883clear();

            public final native Builder m4884clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLClubID();

            public final native Builder clearVLeagueInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4885clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4886clone();

            public final native Builder m4887clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4888getDefaultInstanceForType();

            public final native SCGetLeagueInfoByClubIDRsp m4889getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLClubID();

            public final native LeagueInfo getVLeagueInfos(int i);

            public final native Builder getVLeagueInfosBuilder(int i);

            public final native List<Builder> getVLeagueInfosBuilderList();

            public final native int getVLeagueInfosCount();

            public final native List<LeagueInfo> getVLeagueInfosList();

            public final native LeagueInfoOrBuilder getVLeagueInfosOrBuilder(int i);

            public final native List<? extends LeagueInfoOrBuilder> getVLeagueInfosOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasLClubID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4890mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4891mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4892mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4893mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4894mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetLeagueInfoByClubIDRsp sCGetLeagueInfoByClubIDRsp);

            public final native Builder removeVLeagueInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLClubID(long j);

            public final native Builder setVLeagueInfos(int i, Builder builder);

            public final native Builder setVLeagueInfos(int i, LeagueInfo leagueInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f186M;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17041, 17042, 17043, 17044, 17045, 17046, 17047, 17048, 17049, 17050, 17051, 17052, 17053, 17054, 17055, 17056, 17057, 17058, 17059, 17060, 17061, 17062, 17063, 17064, 17065, 17066, 17067, 17068, 17069, 17070, 17071, 17072, 17073});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetLeagueInfoByClubIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetLeagueInfoByClubIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetLeagueInfoByClubIDRsp sCGetLeagueInfoByClubIDRsp);

        private native SCGetLeagueInfoByClubIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetLeagueInfoByClubIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetLeagueInfoByClubIDRsp sCGetLeagueInfoByClubIDRsp);

        private native SCGetLeagueInfoByClubIDRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4871getDefaultInstanceForType();

        public final native SCGetLeagueInfoByClubIDRsp m4872getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLClubID();

        public final native Parser<SCGetLeagueInfoByClubIDRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native LeagueInfo getVLeagueInfos(int i);

        public final native int getVLeagueInfosCount();

        public final native List<LeagueInfo> getVLeagueInfosList();

        public final native LeagueInfoOrBuilder getVLeagueInfosOrBuilder(int i);

        public final native List<? extends LeagueInfoOrBuilder> getVLeagueInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasLClubID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4873newBuilderForType();

        public final native Builder m4874newBuilderForType();

        protected final native Builder m4875newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4876toBuilder();

        public final native Builder m4877toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetLeagueInfoByClubIDRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f186M;
        }

        static void __clinit__() {
            PARSER = new C02661();
            SCGetLeagueInfoByClubIDRsp sCGetLeagueInfoByClubIDRsp = new SCGetLeagueInfoByClubIDRsp(true);
            defaultInstance = sCGetLeagueInfoByClubIDRsp;
            sCGetLeagueInfoByClubIDRsp.initFields();
        }

        public static SCGetLeagueInfoByClubIDRsp parseFrom(ByteString byteString) {
            return (SCGetLeagueInfoByClubIDRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetLeagueInfoByClubIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueInfoByClubIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetLeagueInfoByClubIDRsp parseFrom(byte[] bArr) {
            return (SCGetLeagueInfoByClubIDRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetLeagueInfoByClubIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueInfoByClubIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetLeagueInfoByClubIDRsp parseFrom(InputStream inputStream) {
            return (SCGetLeagueInfoByClubIDRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetLeagueInfoByClubIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueInfoByClubIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetLeagueInfoByClubIDRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetLeagueInfoByClubIDRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetLeagueInfoByClubIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueInfoByClubIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetLeagueInfoByClubIDRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetLeagueInfoByClubIDRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetLeagueInfoByClubIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLeagueInfoByClubIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetLeagueInfoByClubIDRsp sCGetLeagueInfoByClubIDRsp) {
            return newBuilder().mergeFrom(sCGetLeagueInfoByClubIDRsp);
        }
    }

    public interface SCLeagueActionRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        LEAGUE_ACT getELeagueAct();

        long getLActionedClubdID();

        LeagueInfo getStLeagueInfo();

        LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasELeagueAct();

        boolean hasLActionedClubdID();

        boolean hasStLeagueInfo();
    }

    public static final class SCLeagueActionRsp extends GeneratedMessage implements SCLeagueActionRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int ELEAGUEACT_FIELD_NUMBER = 3;
        public static final int LACTIONEDCLUBDID_FIELD_NUMBER = 4;
        public static Parser<SCLeagueActionRsp> PARSER = null;
        public static final int STLEAGUEINFO_FIELD_NUMBER = 2;
        private static final SCLeagueActionRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private LEAGUE_ACT eLeagueAct_;
        private long lActionedClubdID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LeagueInfo stLeagueInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCLeagueActionRsp.1 */
        class C02671 extends AbstractParser<SCLeagueActionRsp> {
            static {
                fixHelper.fixfunc(new int[]{31505, 31506});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02671();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCLeagueActionRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private LEAGUE_ACT eLeagueAct_;
            private long lActionedClubdID_;
            private SingleFieldBuilder<LeagueInfo, Builder, LeagueInfoOrBuilder> stLeagueInfoBuilder_;
            private LeagueInfo stLeagueInfo_;

            static {
                fixHelper.fixfunc(new int[]{30548, 30549, 30550, 30551, 30552, 30553, 30554, 30555, 30556, 30557, 30558, 30559, 30560, 30561, 30562, 30563, 30564, 30565, 30566, 30567, 30568, 30569, 30570, 30571, 30572, 30573, 30574, 30575, 30576, 30577, 30578, 30579, 30580, 30581, 30582, 30583, 30584, 30585, 30586, 30587, 30588, 30589, 30590, 30591, 30592, 30593, 30594, 30595, 30596, 30597, 30598, 30599, 30600});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<LeagueInfo, Builder, LeagueInfoOrBuilder> getStLeagueInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4902build();

            public final native SCLeagueActionRsp m4903build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4904buildPartial();

            public final native SCLeagueActionRsp m4905buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4906clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4907clear();

            public final native Builder m4908clear();

            public final native Builder clearEErrCode();

            public final native Builder clearELeagueAct();

            public final native Builder clearLActionedClubdID();

            public final native Builder clearStLeagueInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4909clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4910clone();

            public final native Builder m4911clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4912getDefaultInstanceForType();

            public final native SCLeagueActionRsp m4913getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native LEAGUE_ACT getELeagueAct();

            public final native long getLActionedClubdID();

            public final native LeagueInfo getStLeagueInfo();

            public final native Builder getStLeagueInfoBuilder();

            public final native LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasELeagueAct();

            public final native boolean hasLActionedClubdID();

            public final native boolean hasStLeagueInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4914mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4915mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4916mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4917mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4918mergeFrom(Message message);

            public final native Builder mergeFrom(SCLeagueActionRsp sCLeagueActionRsp);

            public final native Builder mergeStLeagueInfo(LeagueInfo leagueInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setELeagueAct(LEAGUE_ACT league_act);

            public final native Builder setLActionedClubdID(long j);

            public final native Builder setStLeagueInfo(Builder builder);

            public final native Builder setStLeagueInfo(LeagueInfo leagueInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f213o;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{10374, 10375, 10376, 10377, 10378, 10379, 10380, 10381, 10382, 10383, 10384, 10385, 10386, 10387, 10388, 10389, 10390, 10391, 10392, 10393, 10394, 10395, 10396, 10397, 10398, 10399, 10400, 10401, 10402, 10403, 10404, 10405, 10406});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCLeagueActionRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCLeagueActionRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCLeagueActionRsp sCLeagueActionRsp);

        private native SCLeagueActionRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCLeagueActionRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCLeagueActionRsp sCLeagueActionRsp);

        private native SCLeagueActionRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4895getDefaultInstanceForType();

        public final native SCLeagueActionRsp m4896getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native LEAGUE_ACT getELeagueAct();

        public final native long getLActionedClubdID();

        public final native Parser<SCLeagueActionRsp> getParserForType();

        public final native int getSerializedSize();

        public final native LeagueInfo getStLeagueInfo();

        public final native LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasELeagueAct();

        public final native boolean hasLActionedClubdID();

        public final native boolean hasStLeagueInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4897newBuilderForType();

        public final native Builder m4898newBuilderForType();

        protected final native Builder m4899newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4900toBuilder();

        public final native Builder m4901toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCLeagueActionRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f213o;
        }

        static void __clinit__() {
            PARSER = new C02671();
            SCLeagueActionRsp sCLeagueActionRsp = new SCLeagueActionRsp(true);
            defaultInstance = sCLeagueActionRsp;
            sCLeagueActionRsp.initFields();
        }

        public static SCLeagueActionRsp parseFrom(ByteString byteString) {
            return (SCLeagueActionRsp) PARSER.parseFrom(byteString);
        }

        public static SCLeagueActionRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCLeagueActionRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCLeagueActionRsp parseFrom(byte[] bArr) {
            return (SCLeagueActionRsp) PARSER.parseFrom(bArr);
        }

        public static SCLeagueActionRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCLeagueActionRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCLeagueActionRsp parseFrom(InputStream inputStream) {
            return (SCLeagueActionRsp) PARSER.parseFrom(inputStream);
        }

        public static SCLeagueActionRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCLeagueActionRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCLeagueActionRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCLeagueActionRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCLeagueActionRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCLeagueActionRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCLeagueActionRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCLeagueActionRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCLeagueActionRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCLeagueActionRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCLeagueActionRsp sCLeagueActionRsp) {
            return newBuilder().mergeFrom(sCLeagueActionRsp);
        }
    }

    public interface SCQuitLeagueRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLClubID();

        long getLLeagueID();

        boolean hasEErrCode();

        boolean hasLClubID();

        boolean hasLLeagueID();
    }

    public static final class SCQuitLeagueRsp extends GeneratedMessage implements SCQuitLeagueRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCLUBID_FIELD_NUMBER = 2;
        public static final int LLEAGUEID_FIELD_NUMBER = 3;
        public static Parser<SCQuitLeagueRsp> PARSER;
        private static final SCQuitLeagueRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lClubID_;
        private long lLeagueID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCQuitLeagueRsp.1 */
        class C02681 extends AbstractParser<SCQuitLeagueRsp> {
            static {
                fixHelper.fixfunc(new int[]{10805, 10806});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02681();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCQuitLeagueRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lClubID_;
            private long lLeagueID_;

            static {
                fixHelper.fixfunc(new int[]{29863, 29864, 29865, 29866, 29867, 29868, 29869, 29870, 29871, 29872, 29873, 29874, 29875, 29876, 29877, 29878, 29879, 29880, 29881, 29882, 29883, 29884, 29885, 29886, 29887, 29888, 29889, 29890, 29891, 29892, 29893, 29894, 29895, 29896, 29897, 29898, 29899, 29900, 29901, 29902, 29903, 29904, 29905, 29906});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4926build();

            public final native SCQuitLeagueRsp m4927build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4928buildPartial();

            public final native SCQuitLeagueRsp m4929buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4930clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4931clear();

            public final native Builder m4932clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLClubID();

            public final native Builder clearLLeagueID();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4933clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4934clone();

            public final native Builder m4935clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4936getDefaultInstanceForType();

            public final native SCQuitLeagueRsp m4937getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLClubID();

            public final native long getLLeagueID();

            public final native boolean hasEErrCode();

            public final native boolean hasLClubID();

            public final native boolean hasLLeagueID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4938mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4939mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4940mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4941mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4942mergeFrom(Message message);

            public final native Builder mergeFrom(SCQuitLeagueRsp sCQuitLeagueRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLClubID(long j);

            public final native Builder setLLeagueID(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f174A;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{9659, 9660, 9661, 9662, 9663, 9664, 9665, 9666, 9667, 9668, 9669, 9670, 9671, 9672, 9673, 9674, 9675, 9676, 9677, 9678, 9679, 9680, 9681, 9682, 9683, 9684, 9685, 9686, 9687, 9688});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCQuitLeagueRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCQuitLeagueRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCQuitLeagueRsp sCQuitLeagueRsp);

        private native SCQuitLeagueRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCQuitLeagueRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCQuitLeagueRsp sCQuitLeagueRsp);

        private native SCQuitLeagueRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4919getDefaultInstanceForType();

        public final native SCQuitLeagueRsp m4920getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLClubID();

        public final native long getLLeagueID();

        public final native Parser<SCQuitLeagueRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLClubID();

        public final native boolean hasLLeagueID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4921newBuilderForType();

        public final native Builder m4922newBuilderForType();

        protected final native Builder m4923newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4924toBuilder();

        public final native Builder m4925toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCQuitLeagueRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f174A;
        }

        static void __clinit__() {
            PARSER = new C02681();
            SCQuitLeagueRsp sCQuitLeagueRsp = new SCQuitLeagueRsp(true);
            defaultInstance = sCQuitLeagueRsp;
            sCQuitLeagueRsp.initFields();
        }

        public static SCQuitLeagueRsp parseFrom(ByteString byteString) {
            return (SCQuitLeagueRsp) PARSER.parseFrom(byteString);
        }

        public static SCQuitLeagueRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCQuitLeagueRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCQuitLeagueRsp parseFrom(byte[] bArr) {
            return (SCQuitLeagueRsp) PARSER.parseFrom(bArr);
        }

        public static SCQuitLeagueRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCQuitLeagueRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCQuitLeagueRsp parseFrom(InputStream inputStream) {
            return (SCQuitLeagueRsp) PARSER.parseFrom(inputStream);
        }

        public static SCQuitLeagueRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCQuitLeagueRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCQuitLeagueRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCQuitLeagueRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCQuitLeagueRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCQuitLeagueRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCQuitLeagueRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCQuitLeagueRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCQuitLeagueRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCQuitLeagueRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCQuitLeagueRsp sCQuitLeagueRsp) {
            return newBuilder().mergeFrom(sCQuitLeagueRsp);
        }
    }

    public interface SCSearchLeagueRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        LeagueInfo getStLeagueInfo();

        LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStLeagueInfo();
    }

    public static final class SCSearchLeagueRsp extends GeneratedMessage implements SCSearchLeagueRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCSearchLeagueRsp> PARSER = null;
        public static final int STLEAGUEINFO_FIELD_NUMBER = 2;
        private static final SCSearchLeagueRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LeagueInfo stLeagueInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCSearchLeagueRsp.1 */
        class C02691 extends AbstractParser<SCSearchLeagueRsp> {
            static {
                fixHelper.fixfunc(new int[]{7458, 7459});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02691();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSearchLeagueRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<LeagueInfo, Builder, LeagueInfoOrBuilder> stLeagueInfoBuilder_;
            private LeagueInfo stLeagueInfo_;

            static {
                fixHelper.fixfunc(new int[]{11571, 11572, 11573, 11574, 11575, 11576, 11577, 11578, 11579, 11580, 11581, 11582, 11583, 11584, 11585, 11586, 11587, 11588, 11589, 11590, 11591, 11592, 11593, 11594, 11595, 11596, 11597, 11598, 11599, 11600, 11601, 11602, 11603, 11604, 11605, 11606, 11607, 11608, 11609, 11610, 11611, 11612, 11613, 11614, 11615});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<LeagueInfo, Builder, LeagueInfoOrBuilder> getStLeagueInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4950build();

            public final native SCSearchLeagueRsp m4951build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4952buildPartial();

            public final native SCSearchLeagueRsp m4953buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4954clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4955clear();

            public final native Builder m4956clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStLeagueInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4957clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4958clone();

            public final native Builder m4959clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4960getDefaultInstanceForType();

            public final native SCSearchLeagueRsp m4961getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native LeagueInfo getStLeagueInfo();

            public final native Builder getStLeagueInfoBuilder();

            public final native LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStLeagueInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4962mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4963mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4964mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4965mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4966mergeFrom(Message message);

            public final native Builder mergeFrom(SCSearchLeagueRsp sCSearchLeagueRsp);

            public final native Builder mergeStLeagueInfo(LeagueInfo leagueInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStLeagueInfo(Builder builder);

            public final native Builder setStLeagueInfo(LeagueInfo leagueInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f217s;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{30396, 30397, 30398, 30399, 30400, 30401, 30402, 30403, 30404, 30405, 30406, 30407, 30408, 30409, 30410, 30411, 30412, 30413, 30414, 30415, 30416, 30417, 30418, 30419, 30420, 30421, 30422, 30423, 30424});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSearchLeagueRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSearchLeagueRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSearchLeagueRsp sCSearchLeagueRsp);

        private native SCSearchLeagueRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSearchLeagueRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSearchLeagueRsp sCSearchLeagueRsp);

        private native SCSearchLeagueRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4943getDefaultInstanceForType();

        public final native SCSearchLeagueRsp m4944getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCSearchLeagueRsp> getParserForType();

        public final native int getSerializedSize();

        public final native LeagueInfo getStLeagueInfo();

        public final native LeagueInfoOrBuilder getStLeagueInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStLeagueInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4945newBuilderForType();

        public final native Builder m4946newBuilderForType();

        protected final native Builder m4947newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4948toBuilder();

        public final native Builder m4949toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSearchLeagueRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f217s;
        }

        static void __clinit__() {
            PARSER = new C02691();
            SCSearchLeagueRsp sCSearchLeagueRsp = new SCSearchLeagueRsp(true);
            defaultInstance = sCSearchLeagueRsp;
            sCSearchLeagueRsp.initFields();
        }

        public static SCSearchLeagueRsp parseFrom(ByteString byteString) {
            return (SCSearchLeagueRsp) PARSER.parseFrom(byteString);
        }

        public static SCSearchLeagueRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchLeagueRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSearchLeagueRsp parseFrom(byte[] bArr) {
            return (SCSearchLeagueRsp) PARSER.parseFrom(bArr);
        }

        public static SCSearchLeagueRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchLeagueRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSearchLeagueRsp parseFrom(InputStream inputStream) {
            return (SCSearchLeagueRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSearchLeagueRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchLeagueRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSearchLeagueRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSearchLeagueRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSearchLeagueRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchLeagueRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSearchLeagueRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSearchLeagueRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSearchLeagueRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSearchLeagueRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSearchLeagueRsp sCSearchLeagueRsp) {
            return newBuilder().mergeFrom(sCSearchLeagueRsp);
        }
    }

    public interface SCSetLeagueSettingRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        LeagueBaseInfo getStLeagueBaseInfo();

        LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStLeagueBaseInfo();
    }

    public static final class SCSetLeagueSettingRsp extends GeneratedMessage implements SCSetLeagueSettingRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCSetLeagueSettingRsp> PARSER = null;
        public static final int STLEAGUEBASEINFO_FIELD_NUMBER = 2;
        private static final SCSetLeagueSettingRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private LeagueBaseInfo stLeagueBaseInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCSetLeagueSettingRsp.1 */
        class C02701 extends AbstractParser<SCSetLeagueSettingRsp> {
            static {
                fixHelper.fixfunc(new int[]{7319, 7320});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02701();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSetLeagueSettingRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<LeagueBaseInfo, Builder, LeagueBaseInfoOrBuilder> stLeagueBaseInfoBuilder_;
            private LeagueBaseInfo stLeagueBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{20834, 20835, 20836, 20837, 20838, 20839, 20840, 20841, 20842, 20843, 20844, 20845, 20846, 20847, 20848, 20849, 20850, 20851, 20852, 20853, 20854, 20855, 20856, 20857, 20858, 20859, 20860, 20861, 20862, 20863, 20864, 20865, 20866, 20867, 20868, 20869, 20870, 20871, 20872, 20873, 20874, 20875, 20876, 20877, 20878});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<LeagueBaseInfo, Builder, LeagueBaseInfoOrBuilder> getStLeagueBaseInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4974build();

            public final native SCSetLeagueSettingRsp m4975build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4976buildPartial();

            public final native SCSetLeagueSettingRsp m4977buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4978clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4979clear();

            public final native Builder m4980clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStLeagueBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4981clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4982clone();

            public final native Builder m4983clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4984getDefaultInstanceForType();

            public final native SCSetLeagueSettingRsp m4985getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native LeagueBaseInfo getStLeagueBaseInfo();

            public final native Builder getStLeagueBaseInfoBuilder();

            public final native LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStLeagueBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4986mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4987mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4988mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4989mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4990mergeFrom(Message message);

            public final native Builder mergeFrom(SCSetLeagueSettingRsp sCSetLeagueSettingRsp);

            public final native Builder mergeStLeagueBaseInfo(LeagueBaseInfo leagueBaseInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStLeagueBaseInfo(Builder builder);

            public final native Builder setStLeagueBaseInfo(LeagueBaseInfo leagueBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f221w;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{10851, 10852, 10853, 10854, 10855, 10856, 10857, 10858, 10859, 10860, 10861, 10862, 10863, 10864, 10865, 10866, 10867, 10868, 10869, 10870, 10871, 10872, 10873, 10874, 10875, 10876, 10877, 10878, 10879});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSetLeagueSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSetLeagueSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSetLeagueSettingRsp sCSetLeagueSettingRsp);

        private native SCSetLeagueSettingRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSetLeagueSettingRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSetLeagueSettingRsp sCSetLeagueSettingRsp);

        private native SCSetLeagueSettingRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4967getDefaultInstanceForType();

        public final native SCSetLeagueSettingRsp m4968getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCSetLeagueSettingRsp> getParserForType();

        public final native int getSerializedSize();

        public final native LeagueBaseInfo getStLeagueBaseInfo();

        public final native LeagueBaseInfoOrBuilder getStLeagueBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStLeagueBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4969newBuilderForType();

        public final native Builder m4970newBuilderForType();

        protected final native Builder m4971newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4972toBuilder();

        public final native Builder m4973toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSetLeagueSettingRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f221w;
        }

        static void __clinit__() {
            PARSER = new C02701();
            SCSetLeagueSettingRsp sCSetLeagueSettingRsp = new SCSetLeagueSettingRsp(true);
            defaultInstance = sCSetLeagueSettingRsp;
            sCSetLeagueSettingRsp.initFields();
        }

        public static SCSetLeagueSettingRsp parseFrom(ByteString byteString) {
            return (SCSetLeagueSettingRsp) PARSER.parseFrom(byteString);
        }

        public static SCSetLeagueSettingRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetLeagueSettingRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSetLeagueSettingRsp parseFrom(byte[] bArr) {
            return (SCSetLeagueSettingRsp) PARSER.parseFrom(bArr);
        }

        public static SCSetLeagueSettingRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetLeagueSettingRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSetLeagueSettingRsp parseFrom(InputStream inputStream) {
            return (SCSetLeagueSettingRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSetLeagueSettingRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetLeagueSettingRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetLeagueSettingRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSetLeagueSettingRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSetLeagueSettingRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetLeagueSettingRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSetLeagueSettingRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSetLeagueSettingRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSetLeagueSettingRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSetLeagueSettingRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSetLeagueSettingRsp sCSetLeagueSettingRsp) {
            return newBuilder().mergeFrom(sCSetLeagueSettingRsp);
        }
    }

    public interface SCSystemLeagueMsgOrBuilder extends MessageOrBuilder {
        LeaguePushMsg getVMsgs(int i);

        int getVMsgsCount();

        List<LeaguePushMsg> getVMsgsList();

        LeaguePushMsgOrBuilder getVMsgsOrBuilder(int i);

        List<? extends LeaguePushMsgOrBuilder> getVMsgsOrBuilderList();
    }

    public static final class SCSystemLeagueMsg extends GeneratedMessage implements SCSystemLeagueMsgOrBuilder {
        public static Parser<SCSystemLeagueMsg> PARSER = null;
        public static final int VMSGS_FIELD_NUMBER = 1;
        private static final SCSystemLeagueMsg defaultInstance = null;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<LeaguePushMsg> vMsgs_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttpLeague.SCSystemLeagueMsg.1 */
        class C02711 extends AbstractParser<SCSystemLeagueMsg> {
            static {
                fixHelper.fixfunc(new int[]{20229, 20230});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C02711();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSystemLeagueMsgOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<LeaguePushMsg, Builder, LeaguePushMsgOrBuilder> vMsgsBuilder_;
            private List<LeaguePushMsg> vMsgs_;

            static {
                fixHelper.fixfunc(new int[]{30167, 30168, 30169, 30170, 30171, 30172, 30173, 30174, 30175, 30176, 30177, 30178, 30179, 30180, 30181, 30182, 30183, 30184, 30185, 30186, 30187, 30188, 30189, 30190, 30191, 30192, 30193, 30194, 30195, 30196, 30197, 30198, 30199, 30200, 30201, 30202, 30203, 30204, 30205, 30206, 30207, 30208, 30209, 30210, 30211, 30212, 30213, 30214, 30215, 30216, 30217, 30218});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVMsgsIsMutable();

            private native RepeatedFieldBuilder<LeaguePushMsg, Builder, LeaguePushMsgOrBuilder> getVMsgsFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVMsgs(Iterable<? extends LeaguePushMsg> iterable);

            public final native Builder addVMsgs(int i, Builder builder);

            public final native Builder addVMsgs(int i, LeaguePushMsg leaguePushMsg);

            public final native Builder addVMsgs(Builder builder);

            public final native Builder addVMsgs(LeaguePushMsg leaguePushMsg);

            public final native Builder addVMsgsBuilder();

            public final native Builder addVMsgsBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4998build();

            public final native SCSystemLeagueMsg m4999build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5000buildPartial();

            public final native SCSystemLeagueMsg m5001buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5002clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5003clear();

            public final native Builder m5004clear();

            public final native Builder clearVMsgs();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5005clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5006clone();

            public final native Builder m5007clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5008getDefaultInstanceForType();

            public final native SCSystemLeagueMsg m5009getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native LeaguePushMsg getVMsgs(int i);

            public final native Builder getVMsgsBuilder(int i);

            public final native List<Builder> getVMsgsBuilderList();

            public final native int getVMsgsCount();

            public final native List<LeaguePushMsg> getVMsgsList();

            public final native LeaguePushMsgOrBuilder getVMsgsOrBuilder(int i);

            public final native List<? extends LeaguePushMsgOrBuilder> getVMsgsOrBuilderList();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5010mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5011mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5012mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5013mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5014mergeFrom(Message message);

            public final native Builder mergeFrom(SCSystemLeagueMsg sCSystemLeagueMsg);

            public final native Builder removeVMsgs(int i);

            public final native Builder setVMsgs(int i, Builder builder);

            public final native Builder setVMsgs(int i, LeaguePushMsg leaguePushMsg);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttpLeague.f194U;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{24194, 24195, 24196, 24197, 24198, 24199, 24200, 24201, 24202, 24203, 24204, 24205, 24206, 24207, 24208, 24209, 24210, 24211, 24212, 24213, 24214, 24215, 24216, 24217, 24218, 24219, 24220, 24221, 24222});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSystemLeagueMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSystemLeagueMsg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSystemLeagueMsg sCSystemLeagueMsg);

        private native SCSystemLeagueMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSystemLeagueMsg(com.google.protobuf.GeneratedMessage.Builder builder, SCSystemLeagueMsg sCSystemLeagueMsg);

        private native SCSystemLeagueMsg(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4991getDefaultInstanceForType();

        public final native SCSystemLeagueMsg m4992getDefaultInstanceForType();

        public final native Parser<SCSystemLeagueMsg> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native LeaguePushMsg getVMsgs(int i);

        public final native int getVMsgsCount();

        public final native List<LeaguePushMsg> getVMsgsList();

        public final native LeaguePushMsgOrBuilder getVMsgsOrBuilder(int i);

        public final native List<? extends LeaguePushMsgOrBuilder> getVMsgsOrBuilderList();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4993newBuilderForType();

        public final native Builder m4994newBuilderForType();

        protected final native Builder m4995newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4996toBuilder();

        public final native Builder m4997toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSystemLeagueMsg getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttpLeague.f194U;
        }

        static void __clinit__() {
            PARSER = new C02711();
            SCSystemLeagueMsg sCSystemLeagueMsg = new SCSystemLeagueMsg(true);
            defaultInstance = sCSystemLeagueMsg;
            sCSystemLeagueMsg.initFields();
        }

        public static SCSystemLeagueMsg parseFrom(ByteString byteString) {
            return (SCSystemLeagueMsg) PARSER.parseFrom(byteString);
        }

        public static SCSystemLeagueMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSystemLeagueMsg) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSystemLeagueMsg parseFrom(byte[] bArr) {
            return (SCSystemLeagueMsg) PARSER.parseFrom(bArr);
        }

        public static SCSystemLeagueMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSystemLeagueMsg) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSystemLeagueMsg parseFrom(InputStream inputStream) {
            return (SCSystemLeagueMsg) PARSER.parseFrom(inputStream);
        }

        public static SCSystemLeagueMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSystemLeagueMsg) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSystemLeagueMsg parseDelimitedFrom(InputStream inputStream) {
            return (SCSystemLeagueMsg) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSystemLeagueMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSystemLeagueMsg) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSystemLeagueMsg parseFrom(CodedInputStream codedInputStream) {
            return (SCSystemLeagueMsg) PARSER.parseFrom(codedInputStream);
        }

        public static SCSystemLeagueMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSystemLeagueMsg) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSystemLeagueMsg sCSystemLeagueMsg) {
            return newBuilder().mergeFrom(sCSystemLeagueMsg);
        }
    }

    public static FileDescriptor m204a() {
        return f198Y;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TexasPokerCommon.m11a()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001aTexasPokerHttpLeague.proto\u0012\ntexaspoker\u001a\u0016TexasPokerCommon.proto\"\u0090\u0001\n\u000eLeagueBaseInfo\u0012\u0011\n\tlLeagueID\u0018\u0001 \u0002(\u0003\u0012\u0017\n\u000fstLeagueCreator\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bsLeagueName\u0018\u0003 \u0002(\t\u0012\u0013\n\u000bbLeagueMute\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u000biMaxMembers\u0018\u0005 \u0001(\u0005\u0012\u0013\n\u000blCreateTime\u0018\u0006 \u0001(\u0003\"t\n\nLeagueInfo\u00124\n\u0010stLeagueBaseInfo\u0018\u0001 \u0002(\u000b2\u001a.texaspoker.LeagueBaseInfo\u00120\n\u000evClubBaseInfos\u0018\u0002 \u0003(\u000b2\u0018.texaspoker.ClubBaseInfo\"D\n\u000eCSCreateLeague\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bsLeagueName\u0018\u0003 \u0002(\t\"", "p\n\u0011SCCreateLeagueRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012,\n\fstLeagueInfo\u0018\u0002 \u0001(\u000b2\u0016.texaspoker.LeagueInfo\"P\n\rCSEnterLeague\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tlLeagueID\u0018\u0003 \u0002(\u0003\u0012\r\n\u0005sHint\u0018\u0004 \u0001(\t\"T\n\u0010SCEnterLeagueRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0011\n\tlLeagueID\u0018\u0002 \u0001(\u0003\"\u0097\u0001\n\u000eCSLeagueAction\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tlLeagueID\u0018\u0003 \u0002(\u0003\u0012\u0018\n\u0010lActionedClubdID\u0018\u0004 \u0002(\u0003\u0012*\n\neLeagueAct\u0018\u0005 \u0002(\u000e2\u0016.t", "exaspoker.LEAGUE_ACT\u0012\r\n\u0005sHint\u0018\u0006 \u0001(\t\"\u00b6\u0001\n\u0011SCLeagueActionRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012,\n\fstLeagueInfo\u0018\u0002 \u0001(\u000b2\u0016.texaspoker.LeagueInfo\u0012*\n\neLeagueAct\u0018\u0003 \u0001(\u000e2\u0016.texaspoker.LEAGUE_ACT\u0012\u0018\n\u0010lActionedClubdID\u0018\u0004 \u0001(\u0003\"z\n\u000eCSSearchLeague\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0010\n\bsKeyWord\u0018\u0003 \u0002(\t\u00127\n\u000feClubSearchType\u0018\u0004 \u0001(\u000e2\u001e.texaspoker.LEAGUE_SEARCH_TYPE\"p\n\u0011SCSearchLeagueRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERR", "OR_CODE_TYPE\u0012,\n\fstLeagueInfo\u0018\u0002 \u0001(\u000b2\u0016.texaspoker.LeagueInfo\"J\n\u0012CSSetLeagueSetting\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0011\n\tlLeagueID\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000bbLeagueMute\u0018\u0003 \u0001(\u0005\"|\n\u0015SCSetLeagueSettingRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00124\n\u0010stLeagueBaseInfo\u0018\u0002 \u0001(\u000b2\u001a.texaspoker.LeagueBaseInfo\"@\n\fCSQuitLeague\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tlLeagueID\u0018\u0003 \u0002(\u0003\"d\n\u000fSCQuitLeagueRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lClu", "bID\u0018\u0002 \u0001(\u0003\u0012\u0011\n\tlLeagueID\u0018\u0003 \u0001(\u0003\"@\n\u001dCSGetLeagueBaseInfoByLeagueID\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0011\n\tlLeagueID\u0018\u0002 \u0002(\u0003\"\u0087\u0001\n SCGetLeagueBaseInfoByLeagueIDRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00124\n\u0010stLeagueBaseInfo\u0018\u0002 \u0001(\u000b2\u001a.texaspoker.LeagueBaseInfo\"8\n\u0015CSGetLeagueByLeagueID\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0011\n\tlLeagueID\u0018\u0002 \u0002(\u0003\"w\n\u0018SCGetLeagueByLeagueIDRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012,\n\fstLeagueInfo\u0018\u0002 \u0001(\u000b2\u0016.texaspoker", ".LeagueInfo\"8\n\u0017CSGetLeagueInfoByClubID\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\"\u008a\u0001\n\u001aSCGetLeagueInfoByClubIDRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0001(\u0003\u0012,\n\fvLeagueInfos\u0018\u0003 \u0003(\u000b2\u0016.texaspoker.LeagueInfo\"V\n\u0014CSAddLeagueMaxMember\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0002(\u0003\u0012\u0011\n\tlLeagueID\u0018\u0003 \u0002(\u0003\u0012\f\n\u0004iNum\u0018\u0004 \u0002(\u0005\"n\n\u0017SCAddLeagueMaxMemberRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000f\n\u0007lClubID\u0018\u0002 \u0001(\u0003\u0012\u0013\n\u000biMaxMem", "bers\u0018\u0003 \u0001(\u0005\"\u00a0\u0002\n\rLeaguePushMsg\u0012\u000e\n\u0006lMsgID\u0018\u0001 \u0002(\u0003\u0012;\n\u0012eLeagueMessageType\u0018\u0002 \u0002(\u000e2\u001f.texaspoker.LEAGUE_MESSAGE_TYPE\u0012,\n\nstFromClub\u0018\u0003 \u0001(\u000b2\u0018.texaspoker.ClubBaseInfo\u0012*\n\bstToClub\u0018\u0004 \u0001(\u000b2\u0018.texaspoker.ClubBaseInfo\u00124\n\u0010stLeagueBaseInfo\u0018\u0005 \u0001(\u000b2\u001a.texaspoker.LeagueBaseInfo\u0012\f\n\u0004sMsg\u0018\u0006 \u0001(\t\u0012\u0011\n\tlFromUuid\u0018\u0007 \u0001(\u0003\u0012\u0011\n\tsFromNick\u0018\b \u0001(\t\"=\n\u0011SCSystemLeagueMsg\u0012(\n\u0005vMsgs\u0018\u0001 \u0003(\u000b2\u0019.texaspoker.LeaguePushMsg\"5\n\u0014CSSystemLeagueMsgRsp\u0012\f\n\u0004uuid\u0018\u0001 \u0002", "(\u0003\u0012\u000f\n\u0007vMsgIds\u0018\u0002 \u0003(\u0003*X\n\nLEAGUE_ACT\u0012\u0018\n\u0014LEAGUE_ACCEPT_INVITE\u0010\u0001\u0012\u0016\n\u0012LEAGUE_DENY_INVITE\u0010\u0002\u0012\u0018\n\u0014LEAGUE_REMOVE_INVITE\u0010\u0003**\n\u0012LEAGUE_SEARCH_TYPE\u0012\u0014\n\u0010LEAGUE_ID_SEARCH\u0010\u0001*\u00b1\u0001\n\u0013LEAGUE_MESSAGE_TYPE\u0012\u0018\n\u0014LEAGUE_MESSAGE_APPLY\u0010\u0001\u0012\u0019\n\u0015LEAGUE_MESSAGE_ACCEPT\u0010\u0002\u0012\u0017\n\u0013LEAGUE_MESSAGE_DENY\u0010\u0003\u0012\u0019\n\u0015LEAGUE_MESSAGE_REMOVE\u0010\u0004\u0012\u0017\n\u0013LEAGUE_MESSAGE_QUIT\u0010\u0005\u0012\u0018\n\u0014LEAGUE_MESSAGE_ENTER\u0010\u0006B-\n\u0015com.texaspoker.momentB\u0014TexasPokerHttpLeague"}, fileDescriptorArr, new C02431());
        f199a = (Descriptor) f198Y.getMessageTypes().get(0);
        f200b = new FieldAccessorTable(f199a, new String[]{"LLeagueID", "StLeagueCreator", "SLeagueName", "BLeagueMute", "IMaxMembers", "LCreateTime"});
        f201c = (Descriptor) f198Y.getMessageTypes().get(1);
        f202d = new FieldAccessorTable(f201c, new String[]{"StLeagueBaseInfo", "VClubBaseInfos"});
        f203e = (Descriptor) f198Y.getMessageTypes().get(2);
        f204f = new FieldAccessorTable(f203e, new String[]{"Uuid", "LClubID", "SLeagueName"});
        f205g = (Descriptor) f198Y.getMessageTypes().get(3);
        f206h = new FieldAccessorTable(f205g, new String[]{"EErrCode", "StLeagueInfo"});
        f207i = (Descriptor) f198Y.getMessageTypes().get(4);
        f208j = new FieldAccessorTable(f207i, new String[]{"Uuid", "LClubID", "LLeagueID", "SHint"});
        f209k = (Descriptor) f198Y.getMessageTypes().get(5);
        f210l = new FieldAccessorTable(f209k, new String[]{"EErrCode", "LLeagueID"});
        f211m = (Descriptor) f198Y.getMessageTypes().get(6);
        f212n = new FieldAccessorTable(f211m, new String[]{"Uuid", "LClubID", "LLeagueID", "LActionedClubdID", "ELeagueAct", "SHint"});
        f213o = (Descriptor) f198Y.getMessageTypes().get(7);
        f214p = new FieldAccessorTable(f213o, new String[]{"EErrCode", "StLeagueInfo", "ELeagueAct", "LActionedClubdID"});
        f215q = (Descriptor) f198Y.getMessageTypes().get(8);
        f216r = new FieldAccessorTable(f215q, new String[]{"Uuid", "LClubID", "SKeyWord", "EClubSearchType"});
        f217s = (Descriptor) f198Y.getMessageTypes().get(9);
        f218t = new FieldAccessorTable(f217s, new String[]{"EErrCode", "StLeagueInfo"});
        f219u = (Descriptor) f198Y.getMessageTypes().get(10);
        f220v = new FieldAccessorTable(f219u, new String[]{"Uuid", "LLeagueID", "BLeagueMute"});
        f221w = (Descriptor) f198Y.getMessageTypes().get(11);
        f222x = new FieldAccessorTable(f221w, new String[]{"EErrCode", "StLeagueBaseInfo"});
        f223y = (Descriptor) f198Y.getMessageTypes().get(12);
        f224z = new FieldAccessorTable(f223y, new String[]{"Uuid", "LClubID", "LLeagueID"});
        f174A = (Descriptor) f198Y.getMessageTypes().get(13);
        f175B = new FieldAccessorTable(f174A, new String[]{"EErrCode", "LClubID", "LLeagueID"});
        f176C = (Descriptor) f198Y.getMessageTypes().get(14);
        f177D = new FieldAccessorTable(f176C, new String[]{"Uuid", "LLeagueID"});
        f178E = (Descriptor) f198Y.getMessageTypes().get(15);
        f179F = new FieldAccessorTable(f178E, new String[]{"EErrCode", "StLeagueBaseInfo"});
        f180G = (Descriptor) f198Y.getMessageTypes().get(16);
        f181H = new FieldAccessorTable(f180G, new String[]{"Uuid", "LLeagueID"});
        f182I = (Descriptor) f198Y.getMessageTypes().get(17);
        f183J = new FieldAccessorTable(f182I, new String[]{"EErrCode", "StLeagueInfo"});
        f184K = (Descriptor) f198Y.getMessageTypes().get(18);
        f185L = new FieldAccessorTable(f184K, new String[]{"Uuid", "LClubID"});
        f186M = (Descriptor) f198Y.getMessageTypes().get(19);
        f187N = new FieldAccessorTable(f186M, new String[]{"EErrCode", "LClubID", "VLeagueInfos"});
        f188O = (Descriptor) f198Y.getMessageTypes().get(20);
        f189P = new FieldAccessorTable(f188O, new String[]{"Uuid", "LClubID", "LLeagueID", "INum"});
        f190Q = (Descriptor) f198Y.getMessageTypes().get(21);
        f191R = new FieldAccessorTable(f190Q, new String[]{"EErrCode", "LClubID", "IMaxMembers"});
        f192S = (Descriptor) f198Y.getMessageTypes().get(22);
        f193T = new FieldAccessorTable(f192S, new String[]{"LMsgID", "ELeagueMessageType", "StFromClub", "StToClub", "StLeagueBaseInfo", "SMsg", "LFromUuid", "SFromNick"});
        f194U = (Descriptor) f198Y.getMessageTypes().get(23);
        f195V = new FieldAccessorTable(f194U, new String[]{"VMsgs"});
        f196W = (Descriptor) f198Y.getMessageTypes().get(24);
        f197X = new FieldAccessorTable(f196W, new String[]{"Uuid", "VMsgIds"});
        TexasPokerCommon.m11a();
    }
}
