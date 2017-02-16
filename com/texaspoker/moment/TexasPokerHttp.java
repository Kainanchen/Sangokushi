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
import com.texaspoker.moment.TexasPokerCommon.BannerInfo;
import com.texaspoker.moment.TexasPokerCommon.BannerInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.DEVICE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.LANGUAGE_TYPE;
import com.texaspoker.moment.TexasPokerCommon.PokerHandResult;
import com.texaspoker.moment.TexasPokerCommon.PokerHandResultOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo;
import com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo;
import com.texaspoker.moment.TexasPokerCommon.PokerProcessInfoOrBuilder;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.io.InputStream;
import java.util.List;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.slf4j.spi.LocationAwareLogger;

public final class TexasPokerHttp {
    private static final Descriptor f41A;
    private static FieldAccessorTable f42B;
    private static final Descriptor f43C;
    private static FieldAccessorTable f44D;
    private static final Descriptor f45E;
    private static FieldAccessorTable f46F;
    private static final Descriptor f47G;
    private static FieldAccessorTable f48H;
    private static final Descriptor f49I;
    private static FieldAccessorTable f50J;
    private static final Descriptor f51K;
    private static FieldAccessorTable f52L;
    private static final Descriptor f53M;
    private static FieldAccessorTable f54N;
    private static final Descriptor f55O;
    private static FieldAccessorTable f56P;
    private static final Descriptor f57Q;
    private static FieldAccessorTable f58R;
    private static final Descriptor f59S;
    private static FieldAccessorTable f60T;
    private static final Descriptor f61U;
    private static FieldAccessorTable f62V;
    private static final Descriptor f63W;
    private static FieldAccessorTable f64X;
    private static final Descriptor f65Y;
    private static FieldAccessorTable f66Z;
    private static final Descriptor f67a;
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
    private static FileDescriptor aM;
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
    private static FieldAccessorTable f68b;
    private static final Descriptor f69c;
    private static FieldAccessorTable f70d;
    private static final Descriptor f71e;
    private static FieldAccessorTable f72f;
    private static final Descriptor f73g;
    private static FieldAccessorTable f74h;
    private static final Descriptor f75i;
    private static FieldAccessorTable f76j;
    private static final Descriptor f77k;
    private static FieldAccessorTable f78l;
    private static final Descriptor f79m;
    private static FieldAccessorTable f80n;
    private static final Descriptor f81o;
    private static FieldAccessorTable f82p;
    private static final Descriptor f83q;
    private static FieldAccessorTable f84r;
    private static final Descriptor f85s;
    private static FieldAccessorTable f86t;
    private static final Descriptor f87u;
    private static FieldAccessorTable f88v;
    private static final Descriptor f89w;
    private static FieldAccessorTable f90x;
    private static final Descriptor f91y;
    private static FieldAccessorTable f92z;

    /* renamed from: com.texaspoker.moment.TexasPokerHttp.1 */
    class C01121 implements InternalDescriptorAssigner {
        static {
            fixHelper.fixfunc(new int[]{21008, 21009});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C01121();

        public final native ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
    }

    public interface AppUpdateInfoOrBuilder extends MessageOrBuilder {
        UPDATE_TYPE getEUpdateType();

        String getStrDesc();

        ByteString getStrDescBytes();

        String getStrURL();

        ByteString getStrURLBytes();

        boolean hasEUpdateType();

        boolean hasStrDesc();

        boolean hasStrURL();
    }

    public static final class AppUpdateInfo extends GeneratedMessage implements AppUpdateInfoOrBuilder {
        public static final int EUPDATETYPE_FIELD_NUMBER = 1;
        public static Parser<AppUpdateInfo> PARSER = null;
        public static final int STRDESC_FIELD_NUMBER = 3;
        public static final int STRURL_FIELD_NUMBER = 2;
        private static final AppUpdateInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private UPDATE_TYPE eUpdateType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object strDesc_;
        private Object strURL_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.AppUpdateInfo.1 */
        class C01131 extends AbstractParser<AppUpdateInfo> {
            static {
                fixHelper.fixfunc(new int[]{6427, 6428});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01131();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements AppUpdateInfoOrBuilder {
            private int bitField0_;
            private UPDATE_TYPE eUpdateType_;
            private Object strDesc_;
            private Object strURL_;

            static {
                fixHelper.fixfunc(new int[]{25844, 25845, 25846, 25847, 25848, 25849, 25850, 25851, 25852, 25853, 25854, 25855, 25856, 25857, 25858, 25859, 25860, 25861, 25862, 25863, 25864, 25865, 25866, 25867, 25868, 25869, 25870, 25871, 25872, 25873, 25874, 25875, 25876, 25877, 25878, 25879, 25880, 25881, 25882, 25883, 25884, 25885, 25886, 25887, 25888, 25889, 25890, 25891});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4431build();

            public final native AppUpdateInfo m4432build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4433buildPartial();

            public final native AppUpdateInfo m4434buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4435clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4436clear();

            public final native Builder m4437clear();

            public final native Builder clearEUpdateType();

            public final native Builder clearStrDesc();

            public final native Builder clearStrURL();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4438clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4439clone();

            public final native Builder m4440clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4441getDefaultInstanceForType();

            public final native AppUpdateInfo m4442getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native UPDATE_TYPE getEUpdateType();

            public final native String getStrDesc();

            public final native ByteString getStrDescBytes();

            public final native String getStrURL();

            public final native ByteString getStrURLBytes();

            public final native boolean hasEUpdateType();

            public final native boolean hasStrDesc();

            public final native boolean hasStrURL();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4443mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4444mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4445mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4446mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4447mergeFrom(Message message);

            public final native Builder mergeFrom(AppUpdateInfo appUpdateInfo);

            public final native Builder setEUpdateType(UPDATE_TYPE update_type);

            public final native Builder setStrDesc(String str);

            public final native Builder setStrDescBytes(ByteString byteString);

            public final native Builder setStrURL(String str);

            public final native Builder setStrURLBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f67a;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{12185, 12186, 12187, 12188, 12189, 12190, 12191, 12192, 12193, 12194, 12195, 12196, 12197, 12198, 12199, 12200, 12201, 12202, 12203, 12204, 12205, 12206, 12207, 12208, 12209, 12210, 12211, 12212, 12213, 12214, 12215, 12216});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native AppUpdateInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ AppUpdateInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, AppUpdateInfo appUpdateInfo);

        private native AppUpdateInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ AppUpdateInfo(com.google.protobuf.GeneratedMessage.Builder builder, AppUpdateInfo appUpdateInfo);

        private native AppUpdateInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4424getDefaultInstanceForType();

        public final native AppUpdateInfo m4425getDefaultInstanceForType();

        public final native UPDATE_TYPE getEUpdateType();

        public final native Parser<AppUpdateInfo> getParserForType();

        public final native int getSerializedSize();

        public final native String getStrDesc();

        public final native ByteString getStrDescBytes();

        public final native String getStrURL();

        public final native ByteString getStrURLBytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEUpdateType();

        public final native boolean hasStrDesc();

        public final native boolean hasStrURL();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4426newBuilderForType();

        public final native Builder m4427newBuilderForType();

        protected final native Builder m4428newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4429toBuilder();

        public final native Builder m4430toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static AppUpdateInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f67a;
        }

        static void __clinit__() {
            PARSER = new C01131();
            AppUpdateInfo appUpdateInfo = new AppUpdateInfo(true);
            defaultInstance = appUpdateInfo;
            appUpdateInfo.initFields();
        }

        public static AppUpdateInfo parseFrom(ByteString byteString) {
            return (AppUpdateInfo) PARSER.parseFrom(byteString);
        }

        public static AppUpdateInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AppUpdateInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AppUpdateInfo parseFrom(byte[] bArr) {
            return (AppUpdateInfo) PARSER.parseFrom(bArr);
        }

        public static AppUpdateInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AppUpdateInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AppUpdateInfo parseFrom(InputStream inputStream) {
            return (AppUpdateInfo) PARSER.parseFrom(inputStream);
        }

        public static AppUpdateInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppUpdateInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static AppUpdateInfo parseDelimitedFrom(InputStream inputStream) {
            return (AppUpdateInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static AppUpdateInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppUpdateInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static AppUpdateInfo parseFrom(CodedInputStream codedInputStream) {
            return (AppUpdateInfo) PARSER.parseFrom(codedInputStream);
        }

        public static AppUpdateInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppUpdateInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(AppUpdateInfo appUpdateInfo) {
            return newBuilder().mergeFrom(appUpdateInfo);
        }
    }

    public interface CSFeedbackOrBuilder extends MessageOrBuilder {
        int getIMobleSystem();

        int getISysVersion();

        long getLFeedbackID();

        String getSContent();

        ByteString getSContentBytes();

        long getUuid();

        boolean hasIMobleSystem();

        boolean hasISysVersion();

        boolean hasLFeedbackID();

        boolean hasSContent();

        boolean hasUuid();
    }

    public static final class CSFeedback extends GeneratedMessage implements CSFeedbackOrBuilder {
        public static final int IMOBLESYSTEM_FIELD_NUMBER = 3;
        public static final int ISYSVERSION_FIELD_NUMBER = 4;
        public static final int LFEEDBACKID_FIELD_NUMBER = 2;
        public static Parser<CSFeedback> PARSER = null;
        public static final int SCONTENT_FIELD_NUMBER = 5;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSFeedback defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iMobleSystem_;
        private int iSysVersion_;
        private long lFeedbackID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sContent_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSFeedback.1 */
        class C01141 extends AbstractParser<CSFeedback> {
            static {
                fixHelper.fixfunc(new int[]{9057, 9058});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01141();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSFeedbackOrBuilder {
            private int bitField0_;
            private int iMobleSystem_;
            private int iSysVersion_;
            private long lFeedbackID_;
            private Object sContent_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{33134, 33135, 33136, 33137, 33138, 33139, 33140, 33141, 33142, 33143, 33144, 33145, 33146, 33147, 33148, 33149, 33150, 33151, 33152, 33153, 33154, 33155, 33156, 33157, 33158, 33159, 33160, 33161, 33162, 33163, 33164, 33165, 33166, 33167, 33168, 33169, 33170, 33171, 33172, 33173, 33174, 33175, 33176, 33177, 33178, 33179, 33180, 33181, 33182, 33183, 33184, 33185, 33186, 33187});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4455build();

            public final native CSFeedback m4456build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4457buildPartial();

            public final native CSFeedback m4458buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4459clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4460clear();

            public final native Builder m4461clear();

            public final native Builder clearIMobleSystem();

            public final native Builder clearISysVersion();

            public final native Builder clearLFeedbackID();

            public final native Builder clearSContent();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4462clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4463clone();

            public final native Builder m4464clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4465getDefaultInstanceForType();

            public final native CSFeedback m4466getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIMobleSystem();

            public final native int getISysVersion();

            public final native long getLFeedbackID();

            public final native String getSContent();

            public final native ByteString getSContentBytes();

            public final native long getUuid();

            public final native boolean hasIMobleSystem();

            public final native boolean hasISysVersion();

            public final native boolean hasLFeedbackID();

            public final native boolean hasSContent();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4467mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4468mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4469mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4470mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4471mergeFrom(Message message);

            public final native Builder mergeFrom(CSFeedback cSFeedback);

            public final native Builder setIMobleSystem(int i);

            public final native Builder setISysVersion(int i);

            public final native Builder setLFeedbackID(long j);

            public final native Builder setSContent(String str);

            public final native Builder setSContentBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f75i;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{33027, 33028, 33029, 33030, 33031, 33032, 33033, 33034, 33035, 33036, 33037, 33038, 33039, 33040, 33041, 33042, 33043, 33044, 33045, 33046, 33047, 33048, 33049, 33050, 33051, 33052, 33053, 33054, 33055, 33056, 33057, 33058, 33059, 33060, 33061});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSFeedback(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSFeedback(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSFeedback cSFeedback);

        private native CSFeedback(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSFeedback(com.google.protobuf.GeneratedMessage.Builder builder, CSFeedback cSFeedback);

        private native CSFeedback(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4448getDefaultInstanceForType();

        public final native CSFeedback m4449getDefaultInstanceForType();

        public final native int getIMobleSystem();

        public final native int getISysVersion();

        public final native long getLFeedbackID();

        public final native Parser<CSFeedback> getParserForType();

        public final native String getSContent();

        public final native ByteString getSContentBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasIMobleSystem();

        public final native boolean hasISysVersion();

        public final native boolean hasLFeedbackID();

        public final native boolean hasSContent();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4450newBuilderForType();

        public final native Builder m4451newBuilderForType();

        protected final native Builder m4452newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4453toBuilder();

        public final native Builder m4454toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSFeedback getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f75i;
        }

        static void __clinit__() {
            PARSER = new C01141();
            CSFeedback cSFeedback = new CSFeedback(true);
            defaultInstance = cSFeedback;
            cSFeedback.initFields();
        }

        public static CSFeedback parseFrom(ByteString byteString) {
            return (CSFeedback) PARSER.parseFrom(byteString);
        }

        public static CSFeedback parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSFeedback) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSFeedback parseFrom(byte[] bArr) {
            return (CSFeedback) PARSER.parseFrom(bArr);
        }

        public static CSFeedback parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSFeedback) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSFeedback parseFrom(InputStream inputStream) {
            return (CSFeedback) PARSER.parseFrom(inputStream);
        }

        public static CSFeedback parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSFeedback) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSFeedback parseDelimitedFrom(InputStream inputStream) {
            return (CSFeedback) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSFeedback parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSFeedback) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSFeedback parseFrom(CodedInputStream codedInputStream) {
            return (CSFeedback) PARSER.parseFrom(codedInputStream);
        }

        public static CSFeedback parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSFeedback) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSFeedback cSFeedback) {
            return newBuilder().mergeFrom(cSFeedback);
        }
    }

    public interface CSGetAllPokerHistoryOrBuilder extends MessageOrBuilder {
        long getLGameRoomID();

        long getUuid();

        boolean hasLGameRoomID();

        boolean hasUuid();
    }

    public static final class CSGetAllPokerHistory extends GeneratedMessage implements CSGetAllPokerHistoryOrBuilder {
        public static final int LGAMEROOMID_FIELD_NUMBER = 2;
        public static Parser<CSGetAllPokerHistory> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetAllPokerHistory defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lGameRoomID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetAllPokerHistory.1 */
        class C01151 extends AbstractParser<CSGetAllPokerHistory> {
            static {
                fixHelper.fixfunc(new int[]{4489, 4490});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01151();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetAllPokerHistoryOrBuilder {
            private int bitField0_;
            private long lGameRoomID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{25689, 25690, 25691, 25692, 25693, 25694, 25695, 25696, 25697, 25698, 25699, 25700, 25701, 25702, 25703, 25704, 25705, 25706, 25707, 25708, 25709, 25710, 25711, 25712, 25713, 25714, 25715, 25716, 25717, 25718, 25719, 25720, 25721, 25722, 25723, 25724, 25725, 25726, 25727, 25728});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4479build();

            public final native CSGetAllPokerHistory m4480build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4481buildPartial();

            public final native CSGetAllPokerHistory m4482buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4483clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4484clear();

            public final native Builder m4485clear();

            public final native Builder clearLGameRoomID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4486clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4487clone();

            public final native Builder m4488clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4489getDefaultInstanceForType();

            public final native CSGetAllPokerHistory m4490getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLGameRoomID();

            public final native long getUuid();

            public final native boolean hasLGameRoomID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4491mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4492mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4493mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4494mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4495mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetAllPokerHistory cSGetAllPokerHistory);

            public final native Builder setLGameRoomID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.ai;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17718, 17719, 17720, 17721, 17722, 17723, 17724, 17725, 17726, 17727, 17728, 17729, 17730, 17731, 17732, 17733, 17734, 17735, 17736, 17737, 17738, 17739, 17740, 17741, 17742, 17743, 17744, 17745});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetAllPokerHistory(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetAllPokerHistory(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetAllPokerHistory cSGetAllPokerHistory);

        private native CSGetAllPokerHistory(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetAllPokerHistory(com.google.protobuf.GeneratedMessage.Builder builder, CSGetAllPokerHistory cSGetAllPokerHistory);

        private native CSGetAllPokerHistory(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4472getDefaultInstanceForType();

        public final native CSGetAllPokerHistory m4473getDefaultInstanceForType();

        public final native long getLGameRoomID();

        public final native Parser<CSGetAllPokerHistory> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLGameRoomID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4474newBuilderForType();

        public final native Builder m4475newBuilderForType();

        protected final native Builder m4476newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4477toBuilder();

        public final native Builder m4478toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetAllPokerHistory getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.ai;
        }

        static void __clinit__() {
            PARSER = new C01151();
            CSGetAllPokerHistory cSGetAllPokerHistory = new CSGetAllPokerHistory(true);
            defaultInstance = cSGetAllPokerHistory;
            cSGetAllPokerHistory.initFields();
        }

        public static CSGetAllPokerHistory parseFrom(ByteString byteString) {
            return (CSGetAllPokerHistory) PARSER.parseFrom(byteString);
        }

        public static CSGetAllPokerHistory parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetAllPokerHistory) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetAllPokerHistory parseFrom(byte[] bArr) {
            return (CSGetAllPokerHistory) PARSER.parseFrom(bArr);
        }

        public static CSGetAllPokerHistory parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetAllPokerHistory) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetAllPokerHistory parseFrom(InputStream inputStream) {
            return (CSGetAllPokerHistory) PARSER.parseFrom(inputStream);
        }

        public static CSGetAllPokerHistory parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetAllPokerHistory) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetAllPokerHistory parseDelimitedFrom(InputStream inputStream) {
            return (CSGetAllPokerHistory) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetAllPokerHistory parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetAllPokerHistory) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetAllPokerHistory parseFrom(CodedInputStream codedInputStream) {
            return (CSGetAllPokerHistory) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetAllPokerHistory parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetAllPokerHistory) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetAllPokerHistory cSGetAllPokerHistory) {
            return newBuilder().mergeFrom(cSGetAllPokerHistory);
        }
    }

    public interface CSGetBannerInfosOrBuilder extends MessageOrBuilder {
        int getINum();

        int getIOffset();

        long getUuid();

        boolean hasINum();

        boolean hasIOffset();

        boolean hasUuid();
    }

    public static final class CSGetBannerInfos extends GeneratedMessage implements CSGetBannerInfosOrBuilder {
        public static final int INUM_FIELD_NUMBER = 3;
        public static final int IOFFSET_FIELD_NUMBER = 2;
        public static Parser<CSGetBannerInfos> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetBannerInfos defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iNum_;
        private int iOffset_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetBannerInfos.1 */
        class C01161 extends AbstractParser<CSGetBannerInfos> {
            static {
                fixHelper.fixfunc(new int[]{19795, 19796});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01161();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetBannerInfosOrBuilder {
            private int bitField0_;
            private int iNum_;
            private int iOffset_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{27622, 27623, 27624, 27625, 27626, 27627, 27628, 27629, 27630, 27631, 27632, 27633, 27634, 27635, 27636, 27637, 27638, 27639, 27640, 27641, 27642, 27643, 27644, 27645, 27646, 27647, 27648, 27649, 27650, 27651, 27652, 27653, 27654, 27655, 27656, 27657, 27658, 27659, 27660, 27661, 27662, 27663, 27664, 27665});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4503build();

            public final native CSGetBannerInfos m4504build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4505buildPartial();

            public final native CSGetBannerInfos m4506buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4507clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4508clear();

            public final native Builder m4509clear();

            public final native Builder clearINum();

            public final native Builder clearIOffset();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4510clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4511clone();

            public final native Builder m4512clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4513getDefaultInstanceForType();

            public final native CSGetBannerInfos m4514getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getINum();

            public final native int getIOffset();

            public final native long getUuid();

            public final native boolean hasINum();

            public final native boolean hasIOffset();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4515mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4516mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4517mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4518mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4519mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetBannerInfos cSGetBannerInfos);

            public final native Builder setINum(int i);

            public final native Builder setIOffset(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f79m;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31776, 31777, 31778, 31779, 31780, 31781, 31782, 31783, 31784, 31785, 31786, 31787, 31788, 31789, 31790, 31791, 31792, 31793, 31794, 31795, 31796, 31797, 31798, 31799, 31800, 31801, 31802, 31803, 31804, 31805});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetBannerInfos(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetBannerInfos(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetBannerInfos cSGetBannerInfos);

        private native CSGetBannerInfos(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetBannerInfos(com.google.protobuf.GeneratedMessage.Builder builder, CSGetBannerInfos cSGetBannerInfos);

        private native CSGetBannerInfos(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4496getDefaultInstanceForType();

        public final native CSGetBannerInfos m4497getDefaultInstanceForType();

        public final native int getINum();

        public final native int getIOffset();

        public final native Parser<CSGetBannerInfos> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasINum();

        public final native boolean hasIOffset();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4498newBuilderForType();

        public final native Builder m4499newBuilderForType();

        protected final native Builder m4500newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4501toBuilder();

        public final native Builder m4502toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetBannerInfos getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f79m;
        }

        static void __clinit__() {
            PARSER = new C01161();
            CSGetBannerInfos cSGetBannerInfos = new CSGetBannerInfos(true);
            defaultInstance = cSGetBannerInfos;
            cSGetBannerInfos.initFields();
        }

        public static CSGetBannerInfos parseFrom(ByteString byteString) {
            return (CSGetBannerInfos) PARSER.parseFrom(byteString);
        }

        public static CSGetBannerInfos parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBannerInfos) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetBannerInfos parseFrom(byte[] bArr) {
            return (CSGetBannerInfos) PARSER.parseFrom(bArr);
        }

        public static CSGetBannerInfos parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBannerInfos) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetBannerInfos parseFrom(InputStream inputStream) {
            return (CSGetBannerInfos) PARSER.parseFrom(inputStream);
        }

        public static CSGetBannerInfos parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBannerInfos) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetBannerInfos parseDelimitedFrom(InputStream inputStream) {
            return (CSGetBannerInfos) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetBannerInfos parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBannerInfos) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetBannerInfos parseFrom(CodedInputStream codedInputStream) {
            return (CSGetBannerInfos) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetBannerInfos parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBannerInfos) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetBannerInfos cSGetBannerInfos) {
            return newBuilder().mergeFrom(cSGetBannerInfos);
        }
    }

    public interface CSGetBenefitsOrBuilder extends MessageOrBuilder {
        long getLSystemMsgID();

        long getUuid();

        boolean hasLSystemMsgID();

        boolean hasUuid();
    }

    public static final class CSGetBenefits extends GeneratedMessage implements CSGetBenefitsOrBuilder {
        public static final int LSYSTEMMSGID_FIELD_NUMBER = 2;
        public static Parser<CSGetBenefits> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetBenefits defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lSystemMsgID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetBenefits.1 */
        class C01171 extends AbstractParser<CSGetBenefits> {
            static {
                fixHelper.fixfunc(new int[]{28306, 28307});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01171();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetBenefitsOrBuilder {
            private int bitField0_;
            private long lSystemMsgID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{4065, 4066, 4067, 4068, 4069, 4070, 4071, 4072, 4073, 4074, 4075, 4076, 4077, 4078, 4079, 4080, 4081, 4082, 4083, 4084, 4085, 4086, 4087, 4088, 4089, 4090, 4091, 4092, 4093, 4094, 4095, NTLMConstants.FLAG_NEGOTIATE_DOMAIN_SUPPLIED, 4097, 4098, 4099, 4100, 4101, 4102, 4103, 4104});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4527build();

            public final native CSGetBenefits m4528build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4529buildPartial();

            public final native CSGetBenefits m4530buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4531clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4532clear();

            public final native Builder m4533clear();

            public final native Builder clearLSystemMsgID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4534clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4535clone();

            public final native Builder m4536clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4537getDefaultInstanceForType();

            public final native CSGetBenefits m4538getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLSystemMsgID();

            public final native long getUuid();

            public final native boolean hasLSystemMsgID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4539mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4540mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4541mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4542mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4543mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetBenefits cSGetBenefits);

            public final native Builder setLSystemMsgID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.ay;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{25892, 25893, 25894, 25895, 25896, 25897, 25898, 25899, 25900, 25901, 25902, 25903, 25904, 25905, 25906, 25907, 25908, 25909, 25910, 25911, 25912, 25913, 25914, 25915, 25916, 25917, 25918, 25919});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetBenefits(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetBenefits(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetBenefits cSGetBenefits);

        private native CSGetBenefits(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetBenefits(com.google.protobuf.GeneratedMessage.Builder builder, CSGetBenefits cSGetBenefits);

        private native CSGetBenefits(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4520getDefaultInstanceForType();

        public final native CSGetBenefits m4521getDefaultInstanceForType();

        public final native long getLSystemMsgID();

        public final native Parser<CSGetBenefits> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLSystemMsgID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4522newBuilderForType();

        public final native Builder m4523newBuilderForType();

        protected final native Builder m4524newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4525toBuilder();

        public final native Builder m4526toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetBenefits getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.ay;
        }

        static void __clinit__() {
            PARSER = new C01171();
            CSGetBenefits cSGetBenefits = new CSGetBenefits(true);
            defaultInstance = cSGetBenefits;
            cSGetBenefits.initFields();
        }

        public static CSGetBenefits parseFrom(ByteString byteString) {
            return (CSGetBenefits) PARSER.parseFrom(byteString);
        }

        public static CSGetBenefits parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBenefits) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetBenefits parseFrom(byte[] bArr) {
            return (CSGetBenefits) PARSER.parseFrom(bArr);
        }

        public static CSGetBenefits parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBenefits) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetBenefits parseFrom(InputStream inputStream) {
            return (CSGetBenefits) PARSER.parseFrom(inputStream);
        }

        public static CSGetBenefits parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBenefits) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetBenefits parseDelimitedFrom(InputStream inputStream) {
            return (CSGetBenefits) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetBenefits parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBenefits) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetBenefits parseFrom(CodedInputStream codedInputStream) {
            return (CSGetBenefits) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetBenefits parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetBenefits) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetBenefits cSGetBenefits) {
            return newBuilder().mergeFrom(cSGetBenefits);
        }
    }

    public interface CSGetFavoriteListOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSGetFavoriteList extends GeneratedMessage implements CSGetFavoriteListOrBuilder {
        public static Parser<CSGetFavoriteList> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetFavoriteList defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetFavoriteList.1 */
        class C01181 extends AbstractParser<CSGetFavoriteList> {
            static {
                fixHelper.fixfunc(new int[]{22355, 22356});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01181();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetFavoriteListOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{10940, 10941, 10942, 10943, 10944, 10945, 10946, 10947, 10948, 10949, 10950, 10951, 10952, 10953, 10954, 10955, 10956, 10957, 10958, 10959, 10960, 10961, 10962, 10963, 10964, 10965, 10966, 10967, 10968, 10969, 10970, 10971, 10972, 10973, 10974, 10975});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4551build();

            public final native CSGetFavoriteList m4552build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4553buildPartial();

            public final native CSGetFavoriteList m4554buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4555clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4556clear();

            public final native Builder m4557clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4558clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4559clone();

            public final native Builder m4560clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4561getDefaultInstanceForType();

            public final native CSGetFavoriteList m4562getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4563mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4564mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4565mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4566mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4567mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetFavoriteList cSGetFavoriteList);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f91y;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17746, 17747, 17748, 17749, 17750, 17751, 17752, 17753, 17754, 17755, 17756, 17757, 17758, 17759, 17760, 17761, 17762, 17763, 17764, 17765, 17766, 17767, 17768, 17769, 17770, 17771});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetFavoriteList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetFavoriteList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetFavoriteList cSGetFavoriteList);

        private native CSGetFavoriteList(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetFavoriteList(com.google.protobuf.GeneratedMessage.Builder builder, CSGetFavoriteList cSGetFavoriteList);

        private native CSGetFavoriteList(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4544getDefaultInstanceForType();

        public final native CSGetFavoriteList m4545getDefaultInstanceForType();

        public final native Parser<CSGetFavoriteList> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4546newBuilderForType();

        public final native Builder m4547newBuilderForType();

        protected final native Builder m4548newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4549toBuilder();

        public final native Builder m4550toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetFavoriteList getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f91y;
        }

        static void __clinit__() {
            PARSER = new C01181();
            CSGetFavoriteList cSGetFavoriteList = new CSGetFavoriteList(true);
            defaultInstance = cSGetFavoriteList;
            cSGetFavoriteList.initFields();
        }

        public static CSGetFavoriteList parseFrom(ByteString byteString) {
            return (CSGetFavoriteList) PARSER.parseFrom(byteString);
        }

        public static CSGetFavoriteList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFavoriteList) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetFavoriteList parseFrom(byte[] bArr) {
            return (CSGetFavoriteList) PARSER.parseFrom(bArr);
        }

        public static CSGetFavoriteList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFavoriteList) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetFavoriteList parseFrom(InputStream inputStream) {
            return (CSGetFavoriteList) PARSER.parseFrom(inputStream);
        }

        public static CSGetFavoriteList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFavoriteList) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFavoriteList parseDelimitedFrom(InputStream inputStream) {
            return (CSGetFavoriteList) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetFavoriteList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFavoriteList) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFavoriteList parseFrom(CodedInputStream codedInputStream) {
            return (CSGetFavoriteList) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetFavoriteList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFavoriteList) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetFavoriteList cSGetFavoriteList) {
            return newBuilder().mergeFrom(cSGetFavoriteList);
        }
    }

    public interface CSGetFavoriteListV2OrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSGetFavoriteListV2 extends GeneratedMessage implements CSGetFavoriteListV2OrBuilder {
        public static Parser<CSGetFavoriteListV2> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetFavoriteListV2 defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetFavoriteListV2.1 */
        class C01191 extends AbstractParser<CSGetFavoriteListV2> {
            static {
                fixHelper.fixfunc(new int[]{26859, 26860});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01191();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetFavoriteListV2OrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{21071, 21072, 21073, 21074, 21075, 21076, 21077, 21078, 21079, 21080, 21081, 21082, 21083, 21084, 21085, 21086, 21087, 21088, 21089, 21090, 21091, 21092, 21093, 21094, 21095, 21096, 21097, 21098, 21099, 21100, 21101, 21102, 21103, 21104, 21105, 21106});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4575build();

            public final native CSGetFavoriteListV2 m4576build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4577buildPartial();

            public final native CSGetFavoriteListV2 m4578buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4579clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4580clear();

            public final native Builder m4581clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4582clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4583clone();

            public final native Builder m4584clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4585getDefaultInstanceForType();

            public final native CSGetFavoriteListV2 m4586getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4587mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4588mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4589mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4590mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4591mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetFavoriteListV2 cSGetFavoriteListV2);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f63W;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{30358, 30359, 30360, 30361, 30362, 30363, 30364, 30365, 30366, 30367, 30368, 30369, 30370, 30371, 30372, 30373, 30374, 30375, 30376, 30377, 30378, 30379, 30380, 30381, 30382, 30383});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetFavoriteListV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetFavoriteListV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetFavoriteListV2 cSGetFavoriteListV2);

        private native CSGetFavoriteListV2(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetFavoriteListV2(com.google.protobuf.GeneratedMessage.Builder builder, CSGetFavoriteListV2 cSGetFavoriteListV2);

        private native CSGetFavoriteListV2(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4568getDefaultInstanceForType();

        public final native CSGetFavoriteListV2 m4569getDefaultInstanceForType();

        public final native Parser<CSGetFavoriteListV2> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4570newBuilderForType();

        public final native Builder m4571newBuilderForType();

        protected final native Builder m4572newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4573toBuilder();

        public final native Builder m4574toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetFavoriteListV2 getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f63W;
        }

        static void __clinit__() {
            PARSER = new C01191();
            CSGetFavoriteListV2 cSGetFavoriteListV2 = new CSGetFavoriteListV2(true);
            defaultInstance = cSGetFavoriteListV2;
            cSGetFavoriteListV2.initFields();
        }

        public static CSGetFavoriteListV2 parseFrom(ByteString byteString) {
            return (CSGetFavoriteListV2) PARSER.parseFrom(byteString);
        }

        public static CSGetFavoriteListV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFavoriteListV2) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetFavoriteListV2 parseFrom(byte[] bArr) {
            return (CSGetFavoriteListV2) PARSER.parseFrom(bArr);
        }

        public static CSGetFavoriteListV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFavoriteListV2) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetFavoriteListV2 parseFrom(InputStream inputStream) {
            return (CSGetFavoriteListV2) PARSER.parseFrom(inputStream);
        }

        public static CSGetFavoriteListV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFavoriteListV2) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFavoriteListV2 parseDelimitedFrom(InputStream inputStream) {
            return (CSGetFavoriteListV2) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetFavoriteListV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFavoriteListV2) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFavoriteListV2 parseFrom(CodedInputStream codedInputStream) {
            return (CSGetFavoriteListV2) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetFavoriteListV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFavoriteListV2) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetFavoriteListV2 cSGetFavoriteListV2) {
            return newBuilder().mergeFrom(cSGetFavoriteListV2);
        }
    }

    public interface CSGetFestivalModeOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSGetFestivalMode extends GeneratedMessage implements CSGetFestivalModeOrBuilder {
        public static Parser<CSGetFestivalMode> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetFestivalMode defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetFestivalMode.1 */
        class C01201 extends AbstractParser<CSGetFestivalMode> {
            static {
                fixHelper.fixfunc(new int[]{23116, 23117});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01201();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetFestivalModeOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{9513, 9514, 9515, 9516, 9517, 9518, 9519, 9520, 9521, 9522, 9523, 9524, 9525, 9526, 9527, 9528, 9529, 9530, 9531, 9532, 9533, 9534, 9535, 9536, 9537, 9538, 9539, 9540, 9541, 9542, 9543, 9544, 9545, 9546, 9547, 9548});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4599build();

            public final native CSGetFestivalMode m4600build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4601buildPartial();

            public final native CSGetFestivalMode m4602buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4603clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4604clear();

            public final native Builder m4605clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4606clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4607clone();

            public final native Builder m4608clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4609getDefaultInstanceForType();

            public final native CSGetFestivalMode m4610getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4611mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4612mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4613mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4614mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4615mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetFestivalMode cSGetFestivalMode);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.aI;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{15523, 15524, 15525, 15526, 15527, 15528, 15529, 15530, 15531, 15532, 15533, 15534, 15535, 15536, 15537, 15538, 15539, 15540, 15541, 15542, 15543, 15544, 15545, 15546, 15547, 15548});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetFestivalMode(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetFestivalMode(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetFestivalMode cSGetFestivalMode);

        private native CSGetFestivalMode(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetFestivalMode(com.google.protobuf.GeneratedMessage.Builder builder, CSGetFestivalMode cSGetFestivalMode);

        private native CSGetFestivalMode(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4592getDefaultInstanceForType();

        public final native CSGetFestivalMode m4593getDefaultInstanceForType();

        public final native Parser<CSGetFestivalMode> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4594newBuilderForType();

        public final native Builder m4595newBuilderForType();

        protected final native Builder m4596newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4597toBuilder();

        public final native Builder m4598toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetFestivalMode getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.aI;
        }

        static void __clinit__() {
            PARSER = new C01201();
            CSGetFestivalMode cSGetFestivalMode = new CSGetFestivalMode(true);
            defaultInstance = cSGetFestivalMode;
            cSGetFestivalMode.initFields();
        }

        public static CSGetFestivalMode parseFrom(ByteString byteString) {
            return (CSGetFestivalMode) PARSER.parseFrom(byteString);
        }

        public static CSGetFestivalMode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFestivalMode) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetFestivalMode parseFrom(byte[] bArr) {
            return (CSGetFestivalMode) PARSER.parseFrom(bArr);
        }

        public static CSGetFestivalMode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFestivalMode) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetFestivalMode parseFrom(InputStream inputStream) {
            return (CSGetFestivalMode) PARSER.parseFrom(inputStream);
        }

        public static CSGetFestivalMode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFestivalMode) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFestivalMode parseDelimitedFrom(InputStream inputStream) {
            return (CSGetFestivalMode) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetFestivalMode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFestivalMode) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFestivalMode parseFrom(CodedInputStream codedInputStream) {
            return (CSGetFestivalMode) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetFestivalMode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFestivalMode) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetFestivalMode cSGetFestivalMode) {
            return newBuilder().mergeFrom(cSGetFestivalMode);
        }
    }

    public interface CSGetFlashPageInfosOrBuilder extends MessageOrBuilder {
        LANGUAGE_TYPE getELanguageType();

        int getIScreenHeight();

        int getIScreenWidth();

        long getUuid();

        boolean hasELanguageType();

        boolean hasIScreenHeight();

        boolean hasIScreenWidth();

        boolean hasUuid();
    }

    public static final class CSGetFlashPageInfos extends GeneratedMessage implements CSGetFlashPageInfosOrBuilder {
        public static final int ELANGUAGETYPE_FIELD_NUMBER = 4;
        public static final int ISCREENHEIGHT_FIELD_NUMBER = 3;
        public static final int ISCREENWIDTH_FIELD_NUMBER = 2;
        public static Parser<CSGetFlashPageInfos> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetFlashPageInfos defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LANGUAGE_TYPE eLanguageType_;
        private int iScreenHeight_;
        private int iScreenWidth_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetFlashPageInfos.1 */
        class C01211 extends AbstractParser<CSGetFlashPageInfos> {
            static {
                fixHelper.fixfunc(new int[]{18515, 18516});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01211();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetFlashPageInfosOrBuilder {
            private int bitField0_;
            private LANGUAGE_TYPE eLanguageType_;
            private int iScreenHeight_;
            private int iScreenWidth_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{11743, 11744, 11745, 11746, 11747, 11748, 11749, 11750, 11751, 11752, 11753, 11754, 11755, 11756, 11757, 11758, 11759, 11760, 11761, 11762, 11763, 11764, 11765, 11766, 11767, 11768, 11769, 11770, 11771, 11772, 11773, 11774, 11775, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4623build();

            public final native CSGetFlashPageInfos m4624build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4625buildPartial();

            public final native CSGetFlashPageInfos m4626buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4627clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4628clear();

            public final native Builder m4629clear();

            public final native Builder clearELanguageType();

            public final native Builder clearIScreenHeight();

            public final native Builder clearIScreenWidth();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4630clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4631clone();

            public final native Builder m4632clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4633getDefaultInstanceForType();

            public final native CSGetFlashPageInfos m4634getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native LANGUAGE_TYPE getELanguageType();

            public final native int getIScreenHeight();

            public final native int getIScreenWidth();

            public final native long getUuid();

            public final native boolean hasELanguageType();

            public final native boolean hasIScreenHeight();

            public final native boolean hasIScreenWidth();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4635mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4636mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4637mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4638mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4639mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetFlashPageInfos cSGetFlashPageInfos);

            public final native Builder setELanguageType(LANGUAGE_TYPE language_type);

            public final native Builder setIScreenHeight(int i);

            public final native Builder setIScreenWidth(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.aE;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17178, 17179, 17180, 17181, 17182, 17183, 17184, 17185, 17186, 17187, 17188, 17189, 17190, 17191, 17192, 17193, 17194, 17195, 17196, 17197, 17198, 17199, 17200, 17201, 17202, 17203, 17204, 17205, 17206, 17207, 17208, 17209});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetFlashPageInfos(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetFlashPageInfos(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetFlashPageInfos cSGetFlashPageInfos);

        private native CSGetFlashPageInfos(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetFlashPageInfos(com.google.protobuf.GeneratedMessage.Builder builder, CSGetFlashPageInfos cSGetFlashPageInfos);

        private native CSGetFlashPageInfos(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4616getDefaultInstanceForType();

        public final native CSGetFlashPageInfos m4617getDefaultInstanceForType();

        public final native LANGUAGE_TYPE getELanguageType();

        public final native int getIScreenHeight();

        public final native int getIScreenWidth();

        public final native Parser<CSGetFlashPageInfos> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasELanguageType();

        public final native boolean hasIScreenHeight();

        public final native boolean hasIScreenWidth();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4618newBuilderForType();

        public final native Builder m4619newBuilderForType();

        protected final native Builder m4620newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4621toBuilder();

        public final native Builder m4622toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetFlashPageInfos getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.aE;
        }

        static void __clinit__() {
            PARSER = new C01211();
            CSGetFlashPageInfos cSGetFlashPageInfos = new CSGetFlashPageInfos(true);
            defaultInstance = cSGetFlashPageInfos;
            cSGetFlashPageInfos.initFields();
        }

        public static CSGetFlashPageInfos parseFrom(ByteString byteString) {
            return (CSGetFlashPageInfos) PARSER.parseFrom(byteString);
        }

        public static CSGetFlashPageInfos parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFlashPageInfos) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetFlashPageInfos parseFrom(byte[] bArr) {
            return (CSGetFlashPageInfos) PARSER.parseFrom(bArr);
        }

        public static CSGetFlashPageInfos parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFlashPageInfos) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetFlashPageInfos parseFrom(InputStream inputStream) {
            return (CSGetFlashPageInfos) PARSER.parseFrom(inputStream);
        }

        public static CSGetFlashPageInfos parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFlashPageInfos) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFlashPageInfos parseDelimitedFrom(InputStream inputStream) {
            return (CSGetFlashPageInfos) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetFlashPageInfos parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFlashPageInfos) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetFlashPageInfos parseFrom(CodedInputStream codedInputStream) {
            return (CSGetFlashPageInfos) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetFlashPageInfos parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetFlashPageInfos) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetFlashPageInfos cSGetFlashPageInfos) {
            return newBuilder().mergeFrom(cSGetFlashPageInfos);
        }
    }

    public interface CSGetLastPokerHandResultOrBuilder extends MessageOrBuilder {
        long getLGameRoomID();

        long getUuid();

        boolean hasLGameRoomID();

        boolean hasUuid();
    }

    public static final class CSGetLastPokerHandResult extends GeneratedMessage implements CSGetLastPokerHandResultOrBuilder {
        public static final int LGAMEROOMID_FIELD_NUMBER = 2;
        public static Parser<CSGetLastPokerHandResult> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetLastPokerHandResult defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lGameRoomID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetLastPokerHandResult.1 */
        class C01221 extends AbstractParser<CSGetLastPokerHandResult> {
            static {
                fixHelper.fixfunc(new int[]{25099, 25100});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01221();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetLastPokerHandResultOrBuilder {
            private int bitField0_;
            private long lGameRoomID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{28025, 28026, 28027, 28028, 28029, 28030, 28031, 28032, 28033, 28034, 28035, 28036, 28037, 28038, 28039, 28040, 28041, 28042, 28043, 28044, 28045, 28046, 28047, 28048, 28049, 28050, 28051, 28052, 28053, 28054, 28055, 28056, 28057, 28058, 28059, 28060, 28061, 28062, 28063, 28064});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4647build();

            public final native CSGetLastPokerHandResult m4648build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4649buildPartial();

            public final native CSGetLastPokerHandResult m4650buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4651clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4652clear();

            public final native Builder m4653clear();

            public final native Builder clearLGameRoomID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4654clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4655clone();

            public final native Builder m4656clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4657getDefaultInstanceForType();

            public final native CSGetLastPokerHandResult m4658getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLGameRoomID();

            public final native long getUuid();

            public final native boolean hasLGameRoomID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4659mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4660mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4661mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4662mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4663mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetLastPokerHandResult cSGetLastPokerHandResult);

            public final native Builder setLGameRoomID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.aa;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{21448, 21449, 21450, 21451, 21452, 21453, 21454, 21455, 21456, 21457, 21458, 21459, 21460, 21461, 21462, 21463, 21464, 21465, 21466, 21467, 21468, 21469, 21470, 21471, 21472, 21473, 21474, 21475});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetLastPokerHandResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetLastPokerHandResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetLastPokerHandResult cSGetLastPokerHandResult);

        private native CSGetLastPokerHandResult(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetLastPokerHandResult(com.google.protobuf.GeneratedMessage.Builder builder, CSGetLastPokerHandResult cSGetLastPokerHandResult);

        private native CSGetLastPokerHandResult(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4640getDefaultInstanceForType();

        public final native CSGetLastPokerHandResult m4641getDefaultInstanceForType();

        public final native long getLGameRoomID();

        public final native Parser<CSGetLastPokerHandResult> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLGameRoomID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4642newBuilderForType();

        public final native Builder m4643newBuilderForType();

        protected final native Builder m4644newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4645toBuilder();

        public final native Builder m4646toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetLastPokerHandResult getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.aa;
        }

        static void __clinit__() {
            PARSER = new C01221();
            CSGetLastPokerHandResult cSGetLastPokerHandResult = new CSGetLastPokerHandResult(true);
            defaultInstance = cSGetLastPokerHandResult;
            cSGetLastPokerHandResult.initFields();
        }

        public static CSGetLastPokerHandResult parseFrom(ByteString byteString) {
            return (CSGetLastPokerHandResult) PARSER.parseFrom(byteString);
        }

        public static CSGetLastPokerHandResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLastPokerHandResult) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetLastPokerHandResult parseFrom(byte[] bArr) {
            return (CSGetLastPokerHandResult) PARSER.parseFrom(bArr);
        }

        public static CSGetLastPokerHandResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLastPokerHandResult) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetLastPokerHandResult parseFrom(InputStream inputStream) {
            return (CSGetLastPokerHandResult) PARSER.parseFrom(inputStream);
        }

        public static CSGetLastPokerHandResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLastPokerHandResult) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetLastPokerHandResult parseDelimitedFrom(InputStream inputStream) {
            return (CSGetLastPokerHandResult) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetLastPokerHandResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLastPokerHandResult) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetLastPokerHandResult parseFrom(CodedInputStream codedInputStream) {
            return (CSGetLastPokerHandResult) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetLastPokerHandResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetLastPokerHandResult) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetLastPokerHandResult cSGetLastPokerHandResult) {
            return newBuilder().mergeFrom(cSGetLastPokerHandResult);
        }
    }

    public interface CSGetPokerHandResultByHandIDOrBuilder extends MessageOrBuilder {
        long getLGameHandID();

        long getLGameRoomID();

        long getUuid();

        boolean hasLGameHandID();

        boolean hasLGameRoomID();

        boolean hasUuid();
    }

    public static final class CSGetPokerHandResultByHandID extends GeneratedMessage implements CSGetPokerHandResultByHandIDOrBuilder {
        public static final int LGAMEHANDID_FIELD_NUMBER = 3;
        public static final int LGAMEROOMID_FIELD_NUMBER = 2;
        public static Parser<CSGetPokerHandResultByHandID> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetPokerHandResultByHandID defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lGameHandID_;
        private long lGameRoomID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetPokerHandResultByHandID.1 */
        class C01231 extends AbstractParser<CSGetPokerHandResultByHandID> {
            static {
                fixHelper.fixfunc(new int[]{20828, 20829});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01231();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetPokerHandResultByHandIDOrBuilder {
            private int bitField0_;
            private long lGameHandID_;
            private long lGameRoomID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{5199, 5200, 5201, 5202, 5203, 5204, 5205, 5206, 5207, 5208, 5209, 5210, 5211, 5212, 5213, 5214, 5215, 5216, 5217, 5218, 5219, 5220, 5221, 5222, 5223, 5224, 5225, 5226, 5227, 5228, 5229, 5230, 5231, 5232, 5233, 5234, 5235, 5236, 5237, 5238, 5239, 5240, 5241, 5242});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4671build();

            public final native CSGetPokerHandResultByHandID m4672build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4673buildPartial();

            public final native CSGetPokerHandResultByHandID m4674buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4675clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4676clear();

            public final native Builder m4677clear();

            public final native Builder clearLGameHandID();

            public final native Builder clearLGameRoomID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4678clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4679clone();

            public final native Builder m4680clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4681getDefaultInstanceForType();

            public final native CSGetPokerHandResultByHandID m4682getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLGameHandID();

            public final native long getLGameRoomID();

            public final native long getUuid();

            public final native boolean hasLGameHandID();

            public final native boolean hasLGameRoomID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4683mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4684mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4685mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4686mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4687mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetPokerHandResultByHandID cSGetPokerHandResultByHandID);

            public final native Builder setLGameHandID(long j);

            public final native Builder setLGameRoomID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.ae;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{20798, 20799, 20800, 20801, 20802, 20803, 20804, 20805, 20806, 20807, 20808, 20809, 20810, 20811, 20812, 20813, 20814, 20815, 20816, 20817, 20818, 20819, 20820, 20821, 20822, 20823, 20824, 20825, 20826, 20827});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetPokerHandResultByHandID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetPokerHandResultByHandID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetPokerHandResultByHandID cSGetPokerHandResultByHandID);

        private native CSGetPokerHandResultByHandID(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetPokerHandResultByHandID(com.google.protobuf.GeneratedMessage.Builder builder, CSGetPokerHandResultByHandID cSGetPokerHandResultByHandID);

        private native CSGetPokerHandResultByHandID(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4664getDefaultInstanceForType();

        public final native CSGetPokerHandResultByHandID m4665getDefaultInstanceForType();

        public final native long getLGameHandID();

        public final native long getLGameRoomID();

        public final native Parser<CSGetPokerHandResultByHandID> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLGameHandID();

        public final native boolean hasLGameRoomID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4666newBuilderForType();

        public final native Builder m4667newBuilderForType();

        protected final native Builder m4668newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4669toBuilder();

        public final native Builder m4670toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetPokerHandResultByHandID getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.ae;
        }

        static void __clinit__() {
            PARSER = new C01231();
            CSGetPokerHandResultByHandID cSGetPokerHandResultByHandID = new CSGetPokerHandResultByHandID(true);
            defaultInstance = cSGetPokerHandResultByHandID;
            cSGetPokerHandResultByHandID.initFields();
        }

        public static CSGetPokerHandResultByHandID parseFrom(ByteString byteString) {
            return (CSGetPokerHandResultByHandID) PARSER.parseFrom(byteString);
        }

        public static CSGetPokerHandResultByHandID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetPokerHandResultByHandID) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetPokerHandResultByHandID parseFrom(byte[] bArr) {
            return (CSGetPokerHandResultByHandID) PARSER.parseFrom(bArr);
        }

        public static CSGetPokerHandResultByHandID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetPokerHandResultByHandID) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetPokerHandResultByHandID parseFrom(InputStream inputStream) {
            return (CSGetPokerHandResultByHandID) PARSER.parseFrom(inputStream);
        }

        public static CSGetPokerHandResultByHandID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetPokerHandResultByHandID) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetPokerHandResultByHandID parseDelimitedFrom(InputStream inputStream) {
            return (CSGetPokerHandResultByHandID) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetPokerHandResultByHandID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetPokerHandResultByHandID) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetPokerHandResultByHandID parseFrom(CodedInputStream codedInputStream) {
            return (CSGetPokerHandResultByHandID) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetPokerHandResultByHandID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetPokerHandResultByHandID) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetPokerHandResultByHandID cSGetPokerHandResultByHandID) {
            return newBuilder().mergeFrom(cSGetPokerHandResultByHandID);
        }
    }

    public interface CSGetSystemMsgByIDOrBuilder extends MessageOrBuilder {
        long getLSystemMsgID();

        long getUuid();

        boolean hasLSystemMsgID();

        boolean hasUuid();
    }

    public static final class CSGetSystemMsgByID extends GeneratedMessage implements CSGetSystemMsgByIDOrBuilder {
        public static final int LSYSTEMMSGID_FIELD_NUMBER = 2;
        public static Parser<CSGetSystemMsgByID> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetSystemMsgByID defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lSystemMsgID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetSystemMsgByID.1 */
        class C01241 extends AbstractParser<CSGetSystemMsgByID> {
            static {
                fixHelper.fixfunc(new int[]{15694, 15695});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01241();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetSystemMsgByIDOrBuilder {
            private int bitField0_;
            private long lSystemMsgID_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{19261, 19262, 19263, 19264, 19265, 19266, 19267, 19268, 19269, 19270, 19271, 19272, 19273, 19274, 19275, 19276, 19277, 19278, 19279, 19280, 19281, 19282, 19283, 19284, 19285, 19286, 19287, 19288, 19289, 19290, 19291, 19292, 19293, 19294, 19295, 19296, 19297, 19298, 19299, 19300});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4695build();

            public final native CSGetSystemMsgByID m4696build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4697buildPartial();

            public final native CSGetSystemMsgByID m4698buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4699clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4700clear();

            public final native Builder m4701clear();

            public final native Builder clearLSystemMsgID();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4702clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4703clone();

            public final native Builder m4704clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4705getDefaultInstanceForType();

            public final native CSGetSystemMsgByID m4706getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLSystemMsgID();

            public final native long getUuid();

            public final native boolean hasLSystemMsgID();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4707mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4708mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4709mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4710mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4711mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetSystemMsgByID cSGetSystemMsgByID);

            public final native Builder setLSystemMsgID(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.au;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{18174, 18175, 18176, 18177, 18178, 18179, 18180, 18181, 18182, 18183, 18184, 18185, 18186, 18187, 18188, 18189, 18190, 18191, 18192, 18193, 18194, 18195, 18196, 18197, 18198, 18199, 18200, 18201});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetSystemMsgByID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetSystemMsgByID(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetSystemMsgByID cSGetSystemMsgByID);

        private native CSGetSystemMsgByID(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetSystemMsgByID(com.google.protobuf.GeneratedMessage.Builder builder, CSGetSystemMsgByID cSGetSystemMsgByID);

        private native CSGetSystemMsgByID(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4688getDefaultInstanceForType();

        public final native CSGetSystemMsgByID m4689getDefaultInstanceForType();

        public final native long getLSystemMsgID();

        public final native Parser<CSGetSystemMsgByID> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLSystemMsgID();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4690newBuilderForType();

        public final native Builder m4691newBuilderForType();

        protected final native Builder m4692newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4693toBuilder();

        public final native Builder m4694toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetSystemMsgByID getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.au;
        }

        static void __clinit__() {
            PARSER = new C01241();
            CSGetSystemMsgByID cSGetSystemMsgByID = new CSGetSystemMsgByID(true);
            defaultInstance = cSGetSystemMsgByID;
            cSGetSystemMsgByID.initFields();
        }

        public static CSGetSystemMsgByID parseFrom(ByteString byteString) {
            return (CSGetSystemMsgByID) PARSER.parseFrom(byteString);
        }

        public static CSGetSystemMsgByID parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSystemMsgByID) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetSystemMsgByID parseFrom(byte[] bArr) {
            return (CSGetSystemMsgByID) PARSER.parseFrom(bArr);
        }

        public static CSGetSystemMsgByID parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSystemMsgByID) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetSystemMsgByID parseFrom(InputStream inputStream) {
            return (CSGetSystemMsgByID) PARSER.parseFrom(inputStream);
        }

        public static CSGetSystemMsgByID parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSystemMsgByID) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetSystemMsgByID parseDelimitedFrom(InputStream inputStream) {
            return (CSGetSystemMsgByID) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetSystemMsgByID parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSystemMsgByID) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetSystemMsgByID parseFrom(CodedInputStream codedInputStream) {
            return (CSGetSystemMsgByID) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetSystemMsgByID parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSystemMsgByID) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetSystemMsgByID cSGetSystemMsgByID) {
            return newBuilder().mergeFrom(cSGetSystemMsgByID);
        }
    }

    public interface CSGetSystemMsgsOrBuilder extends MessageOrBuilder {
        int getINum();

        int getIOffset();

        long getUuid();

        boolean hasINum();

        boolean hasIOffset();

        boolean hasUuid();
    }

    public static final class CSGetSystemMsgs extends GeneratedMessage implements CSGetSystemMsgsOrBuilder {
        public static final int INUM_FIELD_NUMBER = 2;
        public static final int IOFFSET_FIELD_NUMBER = 3;
        public static Parser<CSGetSystemMsgs> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSGetSystemMsgs defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iNum_;
        private int iOffset_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSGetSystemMsgs.1 */
        class C01251 extends AbstractParser<CSGetSystemMsgs> {
            static {
                fixHelper.fixfunc(new int[]{21937, 21938});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01251();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSGetSystemMsgsOrBuilder {
            private int bitField0_;
            private int iNum_;
            private int iOffset_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{29256, 29257, 29258, 29259, 29260, 29261, 29262, 29263, 29264, 29265, 29266, 29267, 29268, 29269, 29270, 29271, 29272, 29273, 29274, 29275, 29276, 29277, 29278, 29279, 29280, 29281, 29282, 29283, 29284, 29285, 29286, 29287, 29288, 29289, 29290, 29291, 29292, 29293, 29294, 29295, 29296, 29297, 29298, 29299});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4719build();

            public final native CSGetSystemMsgs m4720build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4721buildPartial();

            public final native CSGetSystemMsgs m4722buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4723clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4724clear();

            public final native Builder m4725clear();

            public final native Builder clearINum();

            public final native Builder clearIOffset();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4726clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4727clone();

            public final native Builder m4728clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4729getDefaultInstanceForType();

            public final native CSGetSystemMsgs m4730getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getINum();

            public final native int getIOffset();

            public final native long getUuid();

            public final native boolean hasINum();

            public final native boolean hasIOffset();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4731mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4732mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4733mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4734mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4735mergeFrom(Message message);

            public final native Builder mergeFrom(CSGetSystemMsgs cSGetSystemMsgs);

            public final native Builder setINum(int i);

            public final native Builder setIOffset(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.aq;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{25729, 25730, 25731, 25732, 25733, 25734, 25735, 25736, 25737, 25738, 25739, 25740, 25741, 25742, 25743, 25744, 25745, 25746, 25747, 25748, 25749, 25750, 25751, 25752, 25753, 25754, 25755, 25756, 25757, 25758});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSGetSystemMsgs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSGetSystemMsgs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSGetSystemMsgs cSGetSystemMsgs);

        private native CSGetSystemMsgs(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSGetSystemMsgs(com.google.protobuf.GeneratedMessage.Builder builder, CSGetSystemMsgs cSGetSystemMsgs);

        private native CSGetSystemMsgs(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4712getDefaultInstanceForType();

        public final native CSGetSystemMsgs m4713getDefaultInstanceForType();

        public final native int getINum();

        public final native int getIOffset();

        public final native Parser<CSGetSystemMsgs> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasINum();

        public final native boolean hasIOffset();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4714newBuilderForType();

        public final native Builder m4715newBuilderForType();

        protected final native Builder m4716newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4717toBuilder();

        public final native Builder m4718toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSGetSystemMsgs getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.aq;
        }

        static void __clinit__() {
            PARSER = new C01251();
            CSGetSystemMsgs cSGetSystemMsgs = new CSGetSystemMsgs(true);
            defaultInstance = cSGetSystemMsgs;
            cSGetSystemMsgs.initFields();
        }

        public static CSGetSystemMsgs parseFrom(ByteString byteString) {
            return (CSGetSystemMsgs) PARSER.parseFrom(byteString);
        }

        public static CSGetSystemMsgs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSystemMsgs) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSGetSystemMsgs parseFrom(byte[] bArr) {
            return (CSGetSystemMsgs) PARSER.parseFrom(bArr);
        }

        public static CSGetSystemMsgs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSystemMsgs) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSGetSystemMsgs parseFrom(InputStream inputStream) {
            return (CSGetSystemMsgs) PARSER.parseFrom(inputStream);
        }

        public static CSGetSystemMsgs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSystemMsgs) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetSystemMsgs parseDelimitedFrom(InputStream inputStream) {
            return (CSGetSystemMsgs) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSGetSystemMsgs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSystemMsgs) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSGetSystemMsgs parseFrom(CodedInputStream codedInputStream) {
            return (CSGetSystemMsgs) PARSER.parseFrom(codedInputStream);
        }

        public static CSGetSystemMsgs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSGetSystemMsgs) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSGetSystemMsgs cSGetSystemMsgs) {
            return newBuilder().mergeFrom(cSGetSystemMsgs);
        }
    }

    public interface CSRemoveFavoriteOrBuilder extends MessageOrBuilder {
        long getPokerprocessid();

        long getUuid();

        boolean hasPokerprocessid();

        boolean hasUuid();
    }

    public static final class CSRemoveFavorite extends GeneratedMessage implements CSRemoveFavoriteOrBuilder {
        public static Parser<CSRemoveFavorite> PARSER = null;
        public static final int POKERPROCESSID_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSRemoveFavorite defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private long pokerprocessid_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSRemoveFavorite.1 */
        class C01261 extends AbstractParser<CSRemoveFavorite> {
            static {
                fixHelper.fixfunc(new int[]{22660, 22661});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01261();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSRemoveFavoriteOrBuilder {
            private int bitField0_;
            private long pokerprocessid_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{22055, 22056, 22057, 22058, 22059, 22060, 22061, 22062, 22063, 22064, 22065, 22066, 22067, 22068, 22069, 22070, 22071, 22072, 22073, 22074, 22075, 22076, 22077, 22078, 22079, 22080, 22081, 22082, 22083, 22084, 22085, 22086, 22087, 22088, 22089, 22090, 22091, 22092, 22093, 22094});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4743build();

            public final native CSRemoveFavorite m4744build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4745buildPartial();

            public final native CSRemoveFavorite m4746buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4747clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4748clear();

            public final native Builder m4749clear();

            public final native Builder clearPokerprocessid();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4750clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4751clone();

            public final native Builder m4752clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4753getDefaultInstanceForType();

            public final native CSRemoveFavorite m4754getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getPokerprocessid();

            public final native long getUuid();

            public final native boolean hasPokerprocessid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4755mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4756mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4757mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4758mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4759mergeFrom(Message message);

            public final native Builder mergeFrom(CSRemoveFavorite cSRemoveFavorite);

            public final native Builder setPokerprocessid(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f43C;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{27666, 27667, 27668, 27669, 27670, 27671, 27672, 27673, 27674, 27675, 27676, 27677, 27678, 27679, 27680, 27681, 27682, 27683, 27684, 27685, 27686, 27687, 27688, 27689, 27690, 27691, 27692, 27693});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSRemoveFavorite(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSRemoveFavorite(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSRemoveFavorite cSRemoveFavorite);

        private native CSRemoveFavorite(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSRemoveFavorite(com.google.protobuf.GeneratedMessage.Builder builder, CSRemoveFavorite cSRemoveFavorite);

        private native CSRemoveFavorite(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4736getDefaultInstanceForType();

        public final native CSRemoveFavorite m4737getDefaultInstanceForType();

        public final native Parser<CSRemoveFavorite> getParserForType();

        public final native long getPokerprocessid();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasPokerprocessid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4738newBuilderForType();

        public final native Builder m4739newBuilderForType();

        protected final native Builder m4740newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4741toBuilder();

        public final native Builder m4742toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSRemoveFavorite getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f43C;
        }

        static void __clinit__() {
            PARSER = new C01261();
            CSRemoveFavorite cSRemoveFavorite = new CSRemoveFavorite(true);
            defaultInstance = cSRemoveFavorite;
            cSRemoveFavorite.initFields();
        }

        public static CSRemoveFavorite parseFrom(ByteString byteString) {
            return (CSRemoveFavorite) PARSER.parseFrom(byteString);
        }

        public static CSRemoveFavorite parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFavorite) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSRemoveFavorite parseFrom(byte[] bArr) {
            return (CSRemoveFavorite) PARSER.parseFrom(bArr);
        }

        public static CSRemoveFavorite parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFavorite) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSRemoveFavorite parseFrom(InputStream inputStream) {
            return (CSRemoveFavorite) PARSER.parseFrom(inputStream);
        }

        public static CSRemoveFavorite parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFavorite) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSRemoveFavorite parseDelimitedFrom(InputStream inputStream) {
            return (CSRemoveFavorite) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSRemoveFavorite parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFavorite) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSRemoveFavorite parseFrom(CodedInputStream codedInputStream) {
            return (CSRemoveFavorite) PARSER.parseFrom(codedInputStream);
        }

        public static CSRemoveFavorite parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFavorite) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSRemoveFavorite cSRemoveFavorite) {
            return newBuilder().mergeFrom(cSRemoveFavorite);
        }
    }

    public interface CSRemoveFavoriteV2OrBuilder extends MessageOrBuilder {
        long getLHandID();

        long getLRoomID();

        long getLSaveUserUuid();

        long getUuid();

        boolean hasLHandID();

        boolean hasLRoomID();

        boolean hasLSaveUserUuid();

        boolean hasUuid();
    }

    public static final class CSRemoveFavoriteV2 extends GeneratedMessage implements CSRemoveFavoriteV2OrBuilder {
        public static final int LHANDID_FIELD_NUMBER = 4;
        public static final int LROOMID_FIELD_NUMBER = 3;
        public static final int LSAVEUSERUUID_FIELD_NUMBER = 2;
        public static Parser<CSRemoveFavoriteV2> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSRemoveFavoriteV2 defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lHandID_;
        private long lRoomID_;
        private long lSaveUserUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSRemoveFavoriteV2.1 */
        class C01271 extends AbstractParser<CSRemoveFavoriteV2> {
            static {
                fixHelper.fixfunc(new int[]{8987, 8988});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01271();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSRemoveFavoriteV2OrBuilder {
            private int bitField0_;
            private long lHandID_;
            private long lRoomID_;
            private long lSaveUserUuid_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{9889, 9890, 9891, 9892, 9893, 9894, 9895, 9896, 9897, 9898, 9899, 9900, 9901, 9902, 9903, 9904, 9905, 9906, 9907, 9908, 9909, 9910, 9911, 9912, 9913, 9914, 9915, 9916, 9917, 9918, 9919, 9920, 9921, 9922, 9923, 9924, 9925, 9926, 9927, 9928, 9929, 9930, 9931, 9932, 9933, 9934, 9935, 9936});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4767build();

            public final native CSRemoveFavoriteV2 m4768build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4769buildPartial();

            public final native CSRemoveFavoriteV2 m4770buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4771clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4772clear();

            public final native Builder m4773clear();

            public final native Builder clearLHandID();

            public final native Builder clearLRoomID();

            public final native Builder clearLSaveUserUuid();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4774clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4775clone();

            public final native Builder m4776clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4777getDefaultInstanceForType();

            public final native CSRemoveFavoriteV2 m4778getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getLHandID();

            public final native long getLRoomID();

            public final native long getLSaveUserUuid();

            public final native long getUuid();

            public final native boolean hasLHandID();

            public final native boolean hasLRoomID();

            public final native boolean hasLSaveUserUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4779mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4780mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4781mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4782mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4783mergeFrom(Message message);

            public final native Builder mergeFrom(CSRemoveFavoriteV2 cSRemoveFavoriteV2);

            public final native Builder setLHandID(long j);

            public final native Builder setLRoomID(long j);

            public final native Builder setLSaveUserUuid(long j);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f47G;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{26861, 26862, 26863, 26864, 26865, 26866, 26867, 26868, 26869, 26870, 26871, 26872, 26873, 26874, 26875, 26876, 26877, 26878, 26879, 26880, 26881, 26882, 26883, 26884, 26885, 26886, 26887, 26888, 26889, 26890, 26891, 26892});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSRemoveFavoriteV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSRemoveFavoriteV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSRemoveFavoriteV2 cSRemoveFavoriteV2);

        private native CSRemoveFavoriteV2(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSRemoveFavoriteV2(com.google.protobuf.GeneratedMessage.Builder builder, CSRemoveFavoriteV2 cSRemoveFavoriteV2);

        private native CSRemoveFavoriteV2(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4760getDefaultInstanceForType();

        public final native CSRemoveFavoriteV2 m4761getDefaultInstanceForType();

        public final native long getLHandID();

        public final native long getLRoomID();

        public final native long getLSaveUserUuid();

        public final native Parser<CSRemoveFavoriteV2> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasLHandID();

        public final native boolean hasLRoomID();

        public final native boolean hasLSaveUserUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4762newBuilderForType();

        public final native Builder m4763newBuilderForType();

        protected final native Builder m4764newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4765toBuilder();

        public final native Builder m4766toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSRemoveFavoriteV2 getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f47G;
        }

        static void __clinit__() {
            PARSER = new C01271();
            CSRemoveFavoriteV2 cSRemoveFavoriteV2 = new CSRemoveFavoriteV2(true);
            defaultInstance = cSRemoveFavoriteV2;
            cSRemoveFavoriteV2.initFields();
        }

        public static CSRemoveFavoriteV2 parseFrom(ByteString byteString) {
            return (CSRemoveFavoriteV2) PARSER.parseFrom(byteString);
        }

        public static CSRemoveFavoriteV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFavoriteV2) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSRemoveFavoriteV2 parseFrom(byte[] bArr) {
            return (CSRemoveFavoriteV2) PARSER.parseFrom(bArr);
        }

        public static CSRemoveFavoriteV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFavoriteV2) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSRemoveFavoriteV2 parseFrom(InputStream inputStream) {
            return (CSRemoveFavoriteV2) PARSER.parseFrom(inputStream);
        }

        public static CSRemoveFavoriteV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFavoriteV2) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSRemoveFavoriteV2 parseDelimitedFrom(InputStream inputStream) {
            return (CSRemoveFavoriteV2) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSRemoveFavoriteV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFavoriteV2) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSRemoveFavoriteV2 parseFrom(CodedInputStream codedInputStream) {
            return (CSRemoveFavoriteV2) PARSER.parseFrom(codedInputStream);
        }

        public static CSRemoveFavoriteV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRemoveFavoriteV2) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSRemoveFavoriteV2 cSRemoveFavoriteV2) {
            return newBuilder().mergeFrom(cSRemoveFavoriteV2);
        }
    }

    public interface CSRenameFavoriteOrBuilder extends MessageOrBuilder {
        int getBSaved();

        SAVE_FAVORITE_TYPE getESaveFavoriteType();

        long getLHandID();

        long getLRoomID();

        long getLSaveUserUuid();

        String getSFavoriteName();

        ByteString getSFavoriteNameBytes();

        String getSFavoriteUrl();

        ByteString getSFavoriteUrlBytes();

        long getUuid();

        boolean hasBSaved();

        boolean hasESaveFavoriteType();

        boolean hasLHandID();

        boolean hasLRoomID();

        boolean hasLSaveUserUuid();

        boolean hasSFavoriteName();

        boolean hasSFavoriteUrl();

        boolean hasUuid();
    }

    public static final class CSRenameFavorite extends GeneratedMessage implements CSRenameFavoriteOrBuilder {
        public static final int BSAVED_FIELD_NUMBER = 8;
        public static final int ESAVEFAVORITETYPE_FIELD_NUMBER = 6;
        public static final int LHANDID_FIELD_NUMBER = 4;
        public static final int LROOMID_FIELD_NUMBER = 3;
        public static final int LSAVEUSERUUID_FIELD_NUMBER = 2;
        public static Parser<CSRenameFavorite> PARSER = null;
        public static final int SFAVORITENAME_FIELD_NUMBER = 7;
        public static final int SFAVORITEURL_FIELD_NUMBER = 5;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSRenameFavorite defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bSaved_;
        private int bitField0_;
        private SAVE_FAVORITE_TYPE eSaveFavoriteType_;
        private long lHandID_;
        private long lRoomID_;
        private long lSaveUserUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sFavoriteName_;
        private Object sFavoriteUrl_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSRenameFavorite.1 */
        class C01281 extends AbstractParser<CSRenameFavorite> {
            static {
                fixHelper.fixfunc(new int[]{26484, 26485});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01281();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSRenameFavoriteOrBuilder {
            private int bSaved_;
            private int bitField0_;
            private SAVE_FAVORITE_TYPE eSaveFavoriteType_;
            private long lHandID_;
            private long lRoomID_;
            private long lSaveUserUuid_;
            private Object sFavoriteName_;
            private Object sFavoriteUrl_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{18517, 18518, 18519, 18520, 18521, 18522, 18523, 18524, 18525, 18526, 18527, 18528, 18529, 18530, 18531, 18532, 18533, 18534, 18535, 18536, 18537, 18538, 18539, 18540, 18541, 18542, 18543, 18544, 18545, 18546, 18547, 18548, 18549, 18550, 18551, 18552, 18553, 18554, 18555, 18556, 18557, 18558, 18559, 18560, 18561, 18562, 18563, 18564, 18565, 18566, 18567, 18568, 18569, 18570, 18571, 18572, 18573, 18574, 18575, 18576, 18577, 18578, 18579, 18580, 18581, 18582, 18583, 18584});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m4791build();

            public final native CSRenameFavorite m4792build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m4793buildPartial();

            public final native CSRenameFavorite m4794buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4795clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4796clear();

            public final native Builder m4797clear();

            public final native Builder clearBSaved();

            public final native Builder clearESaveFavoriteType();

            public final native Builder clearLHandID();

            public final native Builder clearLRoomID();

            public final native Builder clearLSaveUserUuid();

            public final native Builder clearSFavoriteName();

            public final native Builder clearSFavoriteUrl();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4798clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4799clone();

            public final native Builder m4800clone();

            public final native int getBSaved();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m4801getDefaultInstanceForType();

            public final native CSRenameFavorite m4802getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native SAVE_FAVORITE_TYPE getESaveFavoriteType();

            public final native long getLHandID();

            public final native long getLRoomID();

            public final native long getLSaveUserUuid();

            public final native String getSFavoriteName();

            public final native ByteString getSFavoriteNameBytes();

            public final native String getSFavoriteUrl();

            public final native ByteString getSFavoriteUrlBytes();

            public final native long getUuid();

            public final native boolean hasBSaved();

            public final native boolean hasESaveFavoriteType();

            public final native boolean hasLHandID();

            public final native boolean hasLRoomID();

            public final native boolean hasLSaveUserUuid();

            public final native boolean hasSFavoriteName();

            public final native boolean hasSFavoriteUrl();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4803mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m4804mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4805mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4806mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m4807mergeFrom(Message message);

            public final native Builder mergeFrom(CSRenameFavorite cSRenameFavorite);

            public final native Builder setBSaved(int i);

            public final native Builder setESaveFavoriteType(SAVE_FAVORITE_TYPE save_favorite_type);

            public final native Builder setLHandID(long j);

            public final native Builder setLRoomID(long j);

            public final native Builder setLSaveUserUuid(long j);

            public final native Builder setSFavoriteName(String str);

            public final native Builder setSFavoriteNameBytes(ByteString byteString);

            public final native Builder setSFavoriteUrl(String str);

            public final native Builder setSFavoriteUrlBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f59S;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{29819, 29820, 29821, 29822, 29823, 29824, 29825, 29826, 29827, 29828, 29829, 29830, 29831, 29832, 29833, 29834, 29835, 29836, 29837, 29838, 29839, 29840, 29841, 29842, 29843, 29844, 29845, 29846, 29847, 29848, 29849, 29850, 29851, 29852, 29853, 29854, 29855, 29856, 29857, 29858, 29859, 29860});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSRenameFavorite(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSRenameFavorite(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSRenameFavorite cSRenameFavorite);

        private native CSRenameFavorite(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSRenameFavorite(com.google.protobuf.GeneratedMessage.Builder builder, CSRenameFavorite cSRenameFavorite);

        private native CSRenameFavorite(boolean z);

        private native void initFields();

        public final native int getBSaved();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4784getDefaultInstanceForType();

        public final native CSRenameFavorite m4785getDefaultInstanceForType();

        public final native SAVE_FAVORITE_TYPE getESaveFavoriteType();

        public final native long getLHandID();

        public final native long getLRoomID();

        public final native long getLSaveUserUuid();

        public final native Parser<CSRenameFavorite> getParserForType();

        public final native String getSFavoriteName();

        public final native ByteString getSFavoriteNameBytes();

        public final native String getSFavoriteUrl();

        public final native ByteString getSFavoriteUrlBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasBSaved();

        public final native boolean hasESaveFavoriteType();

        public final native boolean hasLHandID();

        public final native boolean hasLRoomID();

        public final native boolean hasLSaveUserUuid();

        public final native boolean hasSFavoriteName();

        public final native boolean hasSFavoriteUrl();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4786newBuilderForType();

        public final native Builder m4787newBuilderForType();

        protected final native Builder m4788newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4789toBuilder();

        public final native Builder m4790toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSRenameFavorite getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f59S;
        }

        static void __clinit__() {
            PARSER = new C01281();
            CSRenameFavorite cSRenameFavorite = new CSRenameFavorite(true);
            defaultInstance = cSRenameFavorite;
            cSRenameFavorite.initFields();
        }

        public static CSRenameFavorite parseFrom(ByteString byteString) {
            return (CSRenameFavorite) PARSER.parseFrom(byteString);
        }

        public static CSRenameFavorite parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRenameFavorite) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSRenameFavorite parseFrom(byte[] bArr) {
            return (CSRenameFavorite) PARSER.parseFrom(bArr);
        }

        public static CSRenameFavorite parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRenameFavorite) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSRenameFavorite parseFrom(InputStream inputStream) {
            return (CSRenameFavorite) PARSER.parseFrom(inputStream);
        }

        public static CSRenameFavorite parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRenameFavorite) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSRenameFavorite parseDelimitedFrom(InputStream inputStream) {
            return (CSRenameFavorite) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSRenameFavorite parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRenameFavorite) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSRenameFavorite parseFrom(CodedInputStream codedInputStream) {
            return (CSRenameFavorite) PARSER.parseFrom(codedInputStream);
        }

        public static CSRenameFavorite parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSRenameFavorite) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSRenameFavorite cSRenameFavorite) {
            return newBuilder().mergeFrom(cSRenameFavorite);
        }
    }

    public interface CSSaveFavoriteOrBuilder extends MessageOrBuilder {
        LANGUAGE_TYPE getELanguageType();

        int getIAnte();

        long getLBigBlind();

        long getLSaveUserUuid();

        long getLShareUserUuid();

        long getLSmallBlind();

        long getLWinStacks();

        String getStrRoomName();

        ByteString getStrRoomNameBytes();

        long getUuid();

        int getVHandCards(int i);

        int getVHandCardsCount();

        List<Integer> getVHandCardsList();

        ByteString getVVoiceDatas();

        boolean hasELanguageType();

        boolean hasIAnte();

        boolean hasLBigBlind();

        boolean hasLSaveUserUuid();

        boolean hasLShareUserUuid();

        boolean hasLSmallBlind();

        boolean hasLWinStacks();

        boolean hasStrRoomName();

        boolean hasUuid();

        boolean hasVVoiceDatas();
    }

    public static final class CSSaveFavorite extends GeneratedMessage implements CSSaveFavoriteOrBuilder {
        public static final int ELANGUAGETYPE_FIELD_NUMBER = 11;
        public static final int IANTE_FIELD_NUMBER = 10;
        public static final int LBIGBLIND_FIELD_NUMBER = 4;
        public static final int LSAVEUSERUUID_FIELD_NUMBER = 2;
        public static final int LSHAREUSERUUID_FIELD_NUMBER = 3;
        public static final int LSMALLBLIND_FIELD_NUMBER = 5;
        public static final int LWINSTACKS_FIELD_NUMBER = 6;
        public static Parser<CSSaveFavorite> PARSER = null;
        public static final int STRROOMNAME_FIELD_NUMBER = 7;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VHANDCARDS_FIELD_NUMBER = 8;
        public static final int VVOICEDATAS_FIELD_NUMBER = 9;
        private static final CSSaveFavorite defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LANGUAGE_TYPE eLanguageType_;
        private int iAnte_;
        private long lBigBlind_;
        private long lSaveUserUuid_;
        private long lShareUserUuid_;
        private long lSmallBlind_;
        private long lWinStacks_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object strRoomName_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private List<Integer> vHandCards_;
        private ByteString vVoiceDatas_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSSaveFavorite.1 */
        class C01291 extends AbstractParser<CSSaveFavorite> {
            static {
                fixHelper.fixfunc(new int[]{3686, 3687});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01291();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSaveFavoriteOrBuilder {
            private int bitField0_;
            private LANGUAGE_TYPE eLanguageType_;
            private int iAnte_;
            private long lBigBlind_;
            private long lSaveUserUuid_;
            private long lShareUserUuid_;
            private long lSmallBlind_;
            private long lWinStacks_;
            private Object strRoomName_;
            private long uuid_;
            private List<Integer> vHandCards_;
            private ByteString vVoiceDatas_;

            static {
                fixHelper.fixfunc(new int[]{11661, 11662, 11663, 11664, 11665, 11666, 11667, 11668, 11669, 11670, 11671, 11672, 11673, 11674, 11675, 11676, 11677, 11678, 11679, 11680, 11681, 11682, 11683, 11684, 11685, 11686, 11687, 11688, 11689, 11690, 11691, 11692, 11693, 11694, 11695, 11696, 11697, 11698, 11699, 11700, 11701, 11702, 11703, 11704, 11705, 11706, 11707, 11708, 11709, 11710, 11711, 11712, 11713, 11714, 11715, 11716, 11717, 11718, 11719, 11720, 11721, 11722, 11723, 11724, 11725, 11726, 11727, 11728, 11729, 11730, 11731, 11732, 11733, 11734, 11735, 11736, 11737, 11738, 11739, 11740, 11741, 11742});
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

            public final native /* bridge */ /* synthetic */ MessageLite m4815build();

            public final native CSSaveFavorite m4816build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5015buildPartial();

            public final native CSSaveFavorite m5016buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5017clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5018clear();

            public final native Builder m5019clear();

            public final native Builder clearELanguageType();

            public final native Builder clearIAnte();

            public final native Builder clearLBigBlind();

            public final native Builder clearLSaveUserUuid();

            public final native Builder clearLShareUserUuid();

            public final native Builder clearLSmallBlind();

            public final native Builder clearLWinStacks();

            public final native Builder clearStrRoomName();

            public final native Builder clearUuid();

            public final native Builder clearVHandCards();

            public final native Builder clearVVoiceDatas();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5020clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5021clone();

            public final native Builder m5022clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5023getDefaultInstanceForType();

            public final native CSSaveFavorite m5024getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native LANGUAGE_TYPE getELanguageType();

            public final native int getIAnte();

            public final native long getLBigBlind();

            public final native long getLSaveUserUuid();

            public final native long getLShareUserUuid();

            public final native long getLSmallBlind();

            public final native long getLWinStacks();

            public final native String getStrRoomName();

            public final native ByteString getStrRoomNameBytes();

            public final native long getUuid();

            public final native int getVHandCards(int i);

            public final native int getVHandCardsCount();

            public final native List<Integer> getVHandCardsList();

            public final native ByteString getVVoiceDatas();

            public final native boolean hasELanguageType();

            public final native boolean hasIAnte();

            public final native boolean hasLBigBlind();

            public final native boolean hasLSaveUserUuid();

            public final native boolean hasLShareUserUuid();

            public final native boolean hasLSmallBlind();

            public final native boolean hasLWinStacks();

            public final native boolean hasStrRoomName();

            public final native boolean hasUuid();

            public final native boolean hasVVoiceDatas();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5025mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5026mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5027mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5028mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5029mergeFrom(Message message);

            public final native Builder mergeFrom(CSSaveFavorite cSSaveFavorite);

            public final native Builder setELanguageType(LANGUAGE_TYPE language_type);

            public final native Builder setIAnte(int i);

            public final native Builder setLBigBlind(long j);

            public final native Builder setLSaveUserUuid(long j);

            public final native Builder setLShareUserUuid(long j);

            public final native Builder setLSmallBlind(long j);

            public final native Builder setLWinStacks(long j);

            public final native Builder setStrRoomName(String str);

            public final native Builder setStrRoomNameBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public final native Builder setVHandCards(int i, int i2);

            public final native Builder setVVoiceDatas(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f83q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{27447, 27448, 27449, 27450, 27451, 27452, 27453, 27454, 27455, 27456, 27457, 27458, 27459, 27460, 27461, 27462, 27463, 27464, 27465, 27466, 27467, 27468, 27469, 27470, 27471, 27472, 27473, 27474, 27475, 27476, 27477, 27478, 27479, 27480, 27481, 27482, 27483, 27484, 27485, 27486, 27487, 27488, 27489, 27490, 27491, 27492, 27493, 27494});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSaveFavorite(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSaveFavorite(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSaveFavorite cSSaveFavorite);

        private native CSSaveFavorite(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSaveFavorite(com.google.protobuf.GeneratedMessage.Builder builder, CSSaveFavorite cSSaveFavorite);

        private native CSSaveFavorite(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m4808getDefaultInstanceForType();

        public final native CSSaveFavorite m4809getDefaultInstanceForType();

        public final native LANGUAGE_TYPE getELanguageType();

        public final native int getIAnte();

        public final native long getLBigBlind();

        public final native long getLSaveUserUuid();

        public final native long getLShareUserUuid();

        public final native long getLSmallBlind();

        public final native long getLWinStacks();

        public final native Parser<CSSaveFavorite> getParserForType();

        public final native int getSerializedSize();

        public final native String getStrRoomName();

        public final native ByteString getStrRoomNameBytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native int getVHandCards(int i);

        public final native int getVHandCardsCount();

        public final native List<Integer> getVHandCardsList();

        public final native ByteString getVVoiceDatas();

        public final native boolean hasELanguageType();

        public final native boolean hasIAnte();

        public final native boolean hasLBigBlind();

        public final native boolean hasLSaveUserUuid();

        public final native boolean hasLShareUserUuid();

        public final native boolean hasLSmallBlind();

        public final native boolean hasLWinStacks();

        public final native boolean hasStrRoomName();

        public final native boolean hasUuid();

        public final native boolean hasVVoiceDatas();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4810newBuilderForType();

        public final native Builder m4811newBuilderForType();

        protected final native Builder m4812newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m4813toBuilder();

        public final native Builder m4814toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSaveFavorite getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f83q;
        }

        static void __clinit__() {
            PARSER = new C01291();
            CSSaveFavorite cSSaveFavorite = new CSSaveFavorite(true);
            defaultInstance = cSSaveFavorite;
            cSSaveFavorite.initFields();
        }

        public static CSSaveFavorite parseFrom(ByteString byteString) {
            return (CSSaveFavorite) PARSER.parseFrom(byteString);
        }

        public static CSSaveFavorite parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavorite) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSaveFavorite parseFrom(byte[] bArr) {
            return (CSSaveFavorite) PARSER.parseFrom(bArr);
        }

        public static CSSaveFavorite parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavorite) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSaveFavorite parseFrom(InputStream inputStream) {
            return (CSSaveFavorite) PARSER.parseFrom(inputStream);
        }

        public static CSSaveFavorite parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavorite) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSaveFavorite parseDelimitedFrom(InputStream inputStream) {
            return (CSSaveFavorite) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSaveFavorite parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavorite) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSaveFavorite parseFrom(CodedInputStream codedInputStream) {
            return (CSSaveFavorite) PARSER.parseFrom(codedInputStream);
        }

        public static CSSaveFavorite parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavorite) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSaveFavorite cSSaveFavorite) {
            return newBuilder().mergeFrom(cSSaveFavorite);
        }
    }

    public interface CSSaveFavoriteUrlOrBuilder extends MessageOrBuilder {
        LANGUAGE_TYPE getELanguageType();

        int getIAnte();

        long getLBigBlind();

        long getLPokerProcessID();

        long getLSaveUserUuid();

        long getLShareUserUuid();

        long getLSmallBlind();

        long getLWinStacks();

        String getStrRoomName();

        ByteString getStrRoomNameBytes();

        long getUuid();

        int getVHandCards(int i);

        int getVHandCardsCount();

        List<Integer> getVHandCardsList();

        boolean hasELanguageType();

        boolean hasIAnte();

        boolean hasLBigBlind();

        boolean hasLPokerProcessID();

        boolean hasLSaveUserUuid();

        boolean hasLShareUserUuid();

        boolean hasLSmallBlind();

        boolean hasLWinStacks();

        boolean hasStrRoomName();

        boolean hasUuid();
    }

    public static final class CSSaveFavoriteUrl extends GeneratedMessage implements CSSaveFavoriteUrlOrBuilder {
        public static final int ELANGUAGETYPE_FIELD_NUMBER = 11;
        public static final int IANTE_FIELD_NUMBER = 10;
        public static final int LBIGBLIND_FIELD_NUMBER = 4;
        public static final int LPOKERPROCESSID_FIELD_NUMBER = 9;
        public static final int LSAVEUSERUUID_FIELD_NUMBER = 2;
        public static final int LSHAREUSERUUID_FIELD_NUMBER = 3;
        public static final int LSMALLBLIND_FIELD_NUMBER = 5;
        public static final int LWINSTACKS_FIELD_NUMBER = 6;
        public static Parser<CSSaveFavoriteUrl> PARSER = null;
        public static final int STRROOMNAME_FIELD_NUMBER = 7;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VHANDCARDS_FIELD_NUMBER = 8;
        private static final CSSaveFavoriteUrl defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LANGUAGE_TYPE eLanguageType_;
        private int iAnte_;
        private long lBigBlind_;
        private long lPokerProcessID_;
        private long lSaveUserUuid_;
        private long lShareUserUuid_;
        private long lSmallBlind_;
        private long lWinStacks_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object strRoomName_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private List<Integer> vHandCards_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSSaveFavoriteUrl.1 */
        class C01301 extends AbstractParser<CSSaveFavoriteUrl> {
            static {
                fixHelper.fixfunc(new int[]{5664, 5665});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01301();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSaveFavoriteUrlOrBuilder {
            private int bitField0_;
            private LANGUAGE_TYPE eLanguageType_;
            private int iAnte_;
            private long lBigBlind_;
            private long lPokerProcessID_;
            private long lSaveUserUuid_;
            private long lShareUserUuid_;
            private long lSmallBlind_;
            private long lWinStacks_;
            private Object strRoomName_;
            private long uuid_;
            private List<Integer> vHandCards_;

            static {
                fixHelper.fixfunc(new int[]{30466, 30467, 30468, 30469, 30470, 30471, 30472, 30473, 30474, 30475, 30476, 30477, 30478, 30479, 30480, 30481, 30482, 30483, 30484, 30485, 30486, 30487, 30488, 30489, 30490, 30491, 30492, 30493, 30494, 30495, 30496, 30497, 30498, 30499, 30500, 30501, 30502, 30503, 30504, 30505, 30506, 30507, 30508, 30509, 30510, 30511, 30512, 30513, 30514, 30515, 30516, 30517, 30518, 30519, 30520, 30521, 30522, 30523, 30524, 30525, 30526, 30527, 30528, 30529, 30530, 30531, 30532, 30533, 30534, 30535, 30536, 30537, 30538, 30539, 30540, 30541, 30542, 30543, 30544, 30545, 30546, 30547});
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

            public final native /* bridge */ /* synthetic */ MessageLite m5037build();

            public final native CSSaveFavoriteUrl m5038build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5039buildPartial();

            public final native CSSaveFavoriteUrl m5040buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5041clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5042clear();

            public final native Builder m5043clear();

            public final native Builder clearELanguageType();

            public final native Builder clearIAnte();

            public final native Builder clearLBigBlind();

            public final native Builder clearLPokerProcessID();

            public final native Builder clearLSaveUserUuid();

            public final native Builder clearLShareUserUuid();

            public final native Builder clearLSmallBlind();

            public final native Builder clearLWinStacks();

            public final native Builder clearStrRoomName();

            public final native Builder clearUuid();

            public final native Builder clearVHandCards();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5044clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5045clone();

            public final native Builder m5046clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5047getDefaultInstanceForType();

            public final native CSSaveFavoriteUrl m5048getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native LANGUAGE_TYPE getELanguageType();

            public final native int getIAnte();

            public final native long getLBigBlind();

            public final native long getLPokerProcessID();

            public final native long getLSaveUserUuid();

            public final native long getLShareUserUuid();

            public final native long getLSmallBlind();

            public final native long getLWinStacks();

            public final native String getStrRoomName();

            public final native ByteString getStrRoomNameBytes();

            public final native long getUuid();

            public final native int getVHandCards(int i);

            public final native int getVHandCardsCount();

            public final native List<Integer> getVHandCardsList();

            public final native boolean hasELanguageType();

            public final native boolean hasIAnte();

            public final native boolean hasLBigBlind();

            public final native boolean hasLPokerProcessID();

            public final native boolean hasLSaveUserUuid();

            public final native boolean hasLShareUserUuid();

            public final native boolean hasLSmallBlind();

            public final native boolean hasLWinStacks();

            public final native boolean hasStrRoomName();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5049mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5050mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5051mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5052mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5053mergeFrom(Message message);

            public final native Builder mergeFrom(CSSaveFavoriteUrl cSSaveFavoriteUrl);

            public final native Builder setELanguageType(LANGUAGE_TYPE language_type);

            public final native Builder setIAnte(int i);

            public final native Builder setLBigBlind(long j);

            public final native Builder setLPokerProcessID(long j);

            public final native Builder setLSaveUserUuid(long j);

            public final native Builder setLShareUserUuid(long j);

            public final native Builder setLSmallBlind(long j);

            public final native Builder setLWinStacks(long j);

            public final native Builder setStrRoomName(String str);

            public final native Builder setStrRoomNameBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public final native Builder setVHandCards(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f87u;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{21854, 21855, 21856, 21857, 21858, 21859, 21860, 21861, 21862, 21863, 21864, 21865, 21866, 21867, 21868, 21869, 21870, 21871, 21872, 21873, 21874, 21875, 21876, 21877, 21878, 21879, 21880, 21881, 21882, 21883, 21884, 21885, 21886, 21887, 21888, 21889, 21890, 21891, 21892, 21893, 21894, 21895, 21896, 21897, 21898, 21899, 21900, 21901});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSaveFavoriteUrl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSaveFavoriteUrl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSaveFavoriteUrl cSSaveFavoriteUrl);

        private native CSSaveFavoriteUrl(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSaveFavoriteUrl(com.google.protobuf.GeneratedMessage.Builder builder, CSSaveFavoriteUrl cSSaveFavoriteUrl);

        private native CSSaveFavoriteUrl(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5030getDefaultInstanceForType();

        public final native CSSaveFavoriteUrl m5031getDefaultInstanceForType();

        public final native LANGUAGE_TYPE getELanguageType();

        public final native int getIAnte();

        public final native long getLBigBlind();

        public final native long getLPokerProcessID();

        public final native long getLSaveUserUuid();

        public final native long getLShareUserUuid();

        public final native long getLSmallBlind();

        public final native long getLWinStacks();

        public final native Parser<CSSaveFavoriteUrl> getParserForType();

        public final native int getSerializedSize();

        public final native String getStrRoomName();

        public final native ByteString getStrRoomNameBytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native int getVHandCards(int i);

        public final native int getVHandCardsCount();

        public final native List<Integer> getVHandCardsList();

        public final native boolean hasELanguageType();

        public final native boolean hasIAnte();

        public final native boolean hasLBigBlind();

        public final native boolean hasLPokerProcessID();

        public final native boolean hasLSaveUserUuid();

        public final native boolean hasLShareUserUuid();

        public final native boolean hasLSmallBlind();

        public final native boolean hasLWinStacks();

        public final native boolean hasStrRoomName();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5032newBuilderForType();

        public final native Builder m5033newBuilderForType();

        protected final native Builder m5034newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5035toBuilder();

        public final native Builder m5036toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSaveFavoriteUrl getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f87u;
        }

        static void __clinit__() {
            PARSER = new C01301();
            CSSaveFavoriteUrl cSSaveFavoriteUrl = new CSSaveFavoriteUrl(true);
            defaultInstance = cSSaveFavoriteUrl;
            cSSaveFavoriteUrl.initFields();
        }

        public static CSSaveFavoriteUrl parseFrom(ByteString byteString) {
            return (CSSaveFavoriteUrl) PARSER.parseFrom(byteString);
        }

        public static CSSaveFavoriteUrl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavoriteUrl) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSaveFavoriteUrl parseFrom(byte[] bArr) {
            return (CSSaveFavoriteUrl) PARSER.parseFrom(bArr);
        }

        public static CSSaveFavoriteUrl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavoriteUrl) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSaveFavoriteUrl parseFrom(InputStream inputStream) {
            return (CSSaveFavoriteUrl) PARSER.parseFrom(inputStream);
        }

        public static CSSaveFavoriteUrl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavoriteUrl) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSaveFavoriteUrl parseDelimitedFrom(InputStream inputStream) {
            return (CSSaveFavoriteUrl) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSaveFavoriteUrl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavoriteUrl) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSaveFavoriteUrl parseFrom(CodedInputStream codedInputStream) {
            return (CSSaveFavoriteUrl) PARSER.parseFrom(codedInputStream);
        }

        public static CSSaveFavoriteUrl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavoriteUrl) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSaveFavoriteUrl cSSaveFavoriteUrl) {
            return newBuilder().mergeFrom(cSSaveFavoriteUrl);
        }
    }

    public interface CSSaveFavoriteV2OrBuilder extends MessageOrBuilder {
        LANGUAGE_TYPE getELanguageType();

        SAVE_FAVORITE_TYPE getESaveFavoriteType();

        long getLHandID();

        long getLRoomID();

        long getLSaveUserUuid();

        String getSFavoriteName();

        ByteString getSFavoriteNameBytes();

        String getSFavoriteUrl();

        ByteString getSFavoriteUrlBytes();

        long getUuid();

        boolean hasELanguageType();

        boolean hasESaveFavoriteType();

        boolean hasLHandID();

        boolean hasLRoomID();

        boolean hasLSaveUserUuid();

        boolean hasSFavoriteName();

        boolean hasSFavoriteUrl();

        boolean hasUuid();
    }

    public static final class CSSaveFavoriteV2 extends GeneratedMessage implements CSSaveFavoriteV2OrBuilder {
        public static final int ELANGUAGETYPE_FIELD_NUMBER = 8;
        public static final int ESAVEFAVORITETYPE_FIELD_NUMBER = 6;
        public static final int LHANDID_FIELD_NUMBER = 4;
        public static final int LROOMID_FIELD_NUMBER = 3;
        public static final int LSAVEUSERUUID_FIELD_NUMBER = 2;
        public static Parser<CSSaveFavoriteV2> PARSER = null;
        public static final int SFAVORITENAME_FIELD_NUMBER = 7;
        public static final int SFAVORITEURL_FIELD_NUMBER = 5;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSSaveFavoriteV2 defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LANGUAGE_TYPE eLanguageType_;
        private SAVE_FAVORITE_TYPE eSaveFavoriteType_;
        private long lHandID_;
        private long lRoomID_;
        private long lSaveUserUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sFavoriteName_;
        private Object sFavoriteUrl_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSSaveFavoriteV2.1 */
        class C01311 extends AbstractParser<CSSaveFavoriteV2> {
            static {
                fixHelper.fixfunc(new int[]{22738, 22739});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01311();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSSaveFavoriteV2OrBuilder {
            private int bitField0_;
            private LANGUAGE_TYPE eLanguageType_;
            private SAVE_FAVORITE_TYPE eSaveFavoriteType_;
            private long lHandID_;
            private long lRoomID_;
            private long lSaveUserUuid_;
            private Object sFavoriteName_;
            private Object sFavoriteUrl_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{33607, 33608, 33609, 33610, 33611, 33612, 33613, 33614, 33615, 33616, 33617, 33618, 33619, 33620, 33621, 33622, 33623, 33624, 33625, 33626, 33627, 33628, 33629, 33630, 33631, 33632, 33633, 33634, 33635, 33636, 33637, 33638, 33639, 33640, 33641, 33642, 33643, 33644, 33645, 33646, 33647, 33648, 33649, 33650, 33651, 33652, 33653, 33654, 33655, 33656, 33657, 33658, 33659, 33660, 33661, 33662, 33663, 33664, 33665, 33666, 33667, 33668, 33669, 33670, 33671, 33672, 33673, 33674});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5061build();

            public final native CSSaveFavoriteV2 m5062build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5063buildPartial();

            public final native CSSaveFavoriteV2 m5064buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5065clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5066clear();

            public final native Builder m5067clear();

            public final native Builder clearELanguageType();

            public final native Builder clearESaveFavoriteType();

            public final native Builder clearLHandID();

            public final native Builder clearLRoomID();

            public final native Builder clearLSaveUserUuid();

            public final native Builder clearSFavoriteName();

            public final native Builder clearSFavoriteUrl();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5068clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5069clone();

            public final native Builder m5070clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5071getDefaultInstanceForType();

            public final native CSSaveFavoriteV2 m5072getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native LANGUAGE_TYPE getELanguageType();

            public final native SAVE_FAVORITE_TYPE getESaveFavoriteType();

            public final native long getLHandID();

            public final native long getLRoomID();

            public final native long getLSaveUserUuid();

            public final native String getSFavoriteName();

            public final native ByteString getSFavoriteNameBytes();

            public final native String getSFavoriteUrl();

            public final native ByteString getSFavoriteUrlBytes();

            public final native long getUuid();

            public final native boolean hasELanguageType();

            public final native boolean hasESaveFavoriteType();

            public final native boolean hasLHandID();

            public final native boolean hasLRoomID();

            public final native boolean hasLSaveUserUuid();

            public final native boolean hasSFavoriteName();

            public final native boolean hasSFavoriteUrl();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5073mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5074mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5075mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5076mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5077mergeFrom(Message message);

            public final native Builder mergeFrom(CSSaveFavoriteV2 cSSaveFavoriteV2);

            public final native Builder setELanguageType(LANGUAGE_TYPE language_type);

            public final native Builder setESaveFavoriteType(SAVE_FAVORITE_TYPE save_favorite_type);

            public final native Builder setLHandID(long j);

            public final native Builder setLRoomID(long j);

            public final native Builder setLSaveUserUuid(long j);

            public final native Builder setSFavoriteName(String str);

            public final native Builder setSFavoriteNameBytes(ByteString byteString);

            public final native Builder setSFavoriteUrl(String str);

            public final native Builder setSFavoriteUrlBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f51K;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31682, 31683, 31684, 31685, 31686, 31687, 31688, 31689, 31690, 31691, 31692, 31693, 31694, 31695, 31696, 31697, 31698, 31699, 31700, 31701, 31702, 31703, 31704, 31705, 31706, 31707, 31708, 31709, 31710, 31711, 31712, 31713, 31714, 31715, 31716, 31717, 31718, 31719, 31720, 31721, 31722, 31723});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSSaveFavoriteV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSSaveFavoriteV2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSSaveFavoriteV2 cSSaveFavoriteV2);

        private native CSSaveFavoriteV2(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSSaveFavoriteV2(com.google.protobuf.GeneratedMessage.Builder builder, CSSaveFavoriteV2 cSSaveFavoriteV2);

        private native CSSaveFavoriteV2(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5054getDefaultInstanceForType();

        public final native CSSaveFavoriteV2 m5055getDefaultInstanceForType();

        public final native LANGUAGE_TYPE getELanguageType();

        public final native SAVE_FAVORITE_TYPE getESaveFavoriteType();

        public final native long getLHandID();

        public final native long getLRoomID();

        public final native long getLSaveUserUuid();

        public final native Parser<CSSaveFavoriteV2> getParserForType();

        public final native String getSFavoriteName();

        public final native ByteString getSFavoriteNameBytes();

        public final native String getSFavoriteUrl();

        public final native ByteString getSFavoriteUrlBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasELanguageType();

        public final native boolean hasESaveFavoriteType();

        public final native boolean hasLHandID();

        public final native boolean hasLRoomID();

        public final native boolean hasLSaveUserUuid();

        public final native boolean hasSFavoriteName();

        public final native boolean hasSFavoriteUrl();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5056newBuilderForType();

        public final native Builder m5057newBuilderForType();

        protected final native Builder m5058newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5059toBuilder();

        public final native Builder m5060toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSSaveFavoriteV2 getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f51K;
        }

        static void __clinit__() {
            PARSER = new C01311();
            CSSaveFavoriteV2 cSSaveFavoriteV2 = new CSSaveFavoriteV2(true);
            defaultInstance = cSSaveFavoriteV2;
            cSSaveFavoriteV2.initFields();
        }

        public static CSSaveFavoriteV2 parseFrom(ByteString byteString) {
            return (CSSaveFavoriteV2) PARSER.parseFrom(byteString);
        }

        public static CSSaveFavoriteV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavoriteV2) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSSaveFavoriteV2 parseFrom(byte[] bArr) {
            return (CSSaveFavoriteV2) PARSER.parseFrom(bArr);
        }

        public static CSSaveFavoriteV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavoriteV2) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSSaveFavoriteV2 parseFrom(InputStream inputStream) {
            return (CSSaveFavoriteV2) PARSER.parseFrom(inputStream);
        }

        public static CSSaveFavoriteV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavoriteV2) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSSaveFavoriteV2 parseDelimitedFrom(InputStream inputStream) {
            return (CSSaveFavoriteV2) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSSaveFavoriteV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavoriteV2) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSSaveFavoriteV2 parseFrom(CodedInputStream codedInputStream) {
            return (CSSaveFavoriteV2) PARSER.parseFrom(codedInputStream);
        }

        public static CSSaveFavoriteV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSSaveFavoriteV2) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSSaveFavoriteV2 cSSaveFavoriteV2) {
            return newBuilder().mergeFrom(cSSaveFavoriteV2);
        }
    }

    public interface CSShareFavoriteOrBuilder extends MessageOrBuilder {
        LANGUAGE_TYPE getELanguageType();

        SAVE_FAVORITE_TYPE getESaveFavoriteType();

        long getLHandID();

        long getLRoomID();

        long getLSaveUserUuid();

        String getSFavoriteUrl();

        ByteString getSFavoriteUrlBytes();

        long getUuid();

        boolean hasELanguageType();

        boolean hasESaveFavoriteType();

        boolean hasLHandID();

        boolean hasLRoomID();

        boolean hasLSaveUserUuid();

        boolean hasSFavoriteUrl();

        boolean hasUuid();
    }

    public static final class CSShareFavorite extends GeneratedMessage implements CSShareFavoriteOrBuilder {
        public static final int ELANGUAGETYPE_FIELD_NUMBER = 7;
        public static final int ESAVEFAVORITETYPE_FIELD_NUMBER = 6;
        public static final int LHANDID_FIELD_NUMBER = 4;
        public static final int LROOMID_FIELD_NUMBER = 3;
        public static final int LSAVEUSERUUID_FIELD_NUMBER = 2;
        public static Parser<CSShareFavorite> PARSER = null;
        public static final int SFAVORITEURL_FIELD_NUMBER = 5;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSShareFavorite defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LANGUAGE_TYPE eLanguageType_;
        private SAVE_FAVORITE_TYPE eSaveFavoriteType_;
        private long lHandID_;
        private long lRoomID_;
        private long lSaveUserUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sFavoriteUrl_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSShareFavorite.1 */
        class C01321 extends AbstractParser<CSShareFavorite> {
            static {
                fixHelper.fixfunc(new int[]{18738, 18739});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01321();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSShareFavoriteOrBuilder {
            private int bitField0_;
            private LANGUAGE_TYPE eLanguageType_;
            private SAVE_FAVORITE_TYPE eSaveFavoriteType_;
            private long lHandID_;
            private long lRoomID_;
            private long lSaveUserUuid_;
            private Object sFavoriteUrl_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{22263, 22264, 22265, 22266, 22267, 22268, 22269, 22270, 22271, 22272, 22273, 22274, 22275, 22276, 22277, 22278, 22279, 22280, 22281, 22282, 22283, 22284, 22285, 22286, 22287, 22288, 22289, 22290, 22291, 22292, 22293, 22294, 22295, 22296, 22297, 22298, 22299, 22300, 22301, 22302, 22303, 22304, 22305, 22306, 22307, 22308, 22309, 22310, 22311, 22312, 22313, 22314, 22315, 22316, 22317, 22318, 22319, 22320, 22321, 22322, 22323, 22324});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5085build();

            public final native CSShareFavorite m5086build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5087buildPartial();

            public final native CSShareFavorite m5088buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5089clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5090clear();

            public final native Builder m5091clear();

            public final native Builder clearELanguageType();

            public final native Builder clearESaveFavoriteType();

            public final native Builder clearLHandID();

            public final native Builder clearLRoomID();

            public final native Builder clearLSaveUserUuid();

            public final native Builder clearSFavoriteUrl();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5092clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5093clone();

            public final native Builder m5094clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5095getDefaultInstanceForType();

            public final native CSShareFavorite m5096getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native LANGUAGE_TYPE getELanguageType();

            public final native SAVE_FAVORITE_TYPE getESaveFavoriteType();

            public final native long getLHandID();

            public final native long getLRoomID();

            public final native long getLSaveUserUuid();

            public final native String getSFavoriteUrl();

            public final native ByteString getSFavoriteUrlBytes();

            public final native long getUuid();

            public final native boolean hasELanguageType();

            public final native boolean hasESaveFavoriteType();

            public final native boolean hasLHandID();

            public final native boolean hasLRoomID();

            public final native boolean hasLSaveUserUuid();

            public final native boolean hasSFavoriteUrl();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5097mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5098mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5099mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5100mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5101mergeFrom(Message message);

            public final native Builder mergeFrom(CSShareFavorite cSShareFavorite);

            public final native Builder setELanguageType(LANGUAGE_TYPE language_type);

            public final native Builder setESaveFavoriteType(SAVE_FAVORITE_TYPE save_favorite_type);

            public final native Builder setLHandID(long j);

            public final native Builder setLRoomID(long j);

            public final native Builder setLSaveUserUuid(long j);

            public final native Builder setSFavoriteUrl(String str);

            public final native Builder setSFavoriteUrlBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f55O;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7280, 7281, 7282, 7283, 7284, 7285, 7286, 7287, 7288, 7289, 7290, 7291, 7292, 7293, 7294, 7295, 7296, 7297, 7298, 7299, 7300, 7301, 7302, 7303, 7304, 7305, 7306, 7307, 7308, 7309, 7310, 7311, 7312, 7313, 7314, 7315, 7316, 7317, 7318});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSShareFavorite(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSShareFavorite(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSShareFavorite cSShareFavorite);

        private native CSShareFavorite(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSShareFavorite(com.google.protobuf.GeneratedMessage.Builder builder, CSShareFavorite cSShareFavorite);

        private native CSShareFavorite(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5078getDefaultInstanceForType();

        public final native CSShareFavorite m5079getDefaultInstanceForType();

        public final native LANGUAGE_TYPE getELanguageType();

        public final native SAVE_FAVORITE_TYPE getESaveFavoriteType();

        public final native long getLHandID();

        public final native long getLRoomID();

        public final native long getLSaveUserUuid();

        public final native Parser<CSShareFavorite> getParserForType();

        public final native String getSFavoriteUrl();

        public final native ByteString getSFavoriteUrlBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasELanguageType();

        public final native boolean hasESaveFavoriteType();

        public final native boolean hasLHandID();

        public final native boolean hasLRoomID();

        public final native boolean hasLSaveUserUuid();

        public final native boolean hasSFavoriteUrl();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5080newBuilderForType();

        public final native Builder m5081newBuilderForType();

        protected final native Builder m5082newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5083toBuilder();

        public final native Builder m5084toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSShareFavorite getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f55O;
        }

        static void __clinit__() {
            PARSER = new C01321();
            CSShareFavorite cSShareFavorite = new CSShareFavorite(true);
            defaultInstance = cSShareFavorite;
            cSShareFavorite.initFields();
        }

        public static CSShareFavorite parseFrom(ByteString byteString) {
            return (CSShareFavorite) PARSER.parseFrom(byteString);
        }

        public static CSShareFavorite parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSShareFavorite) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSShareFavorite parseFrom(byte[] bArr) {
            return (CSShareFavorite) PARSER.parseFrom(bArr);
        }

        public static CSShareFavorite parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSShareFavorite) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSShareFavorite parseFrom(InputStream inputStream) {
            return (CSShareFavorite) PARSER.parseFrom(inputStream);
        }

        public static CSShareFavorite parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSShareFavorite) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSShareFavorite parseDelimitedFrom(InputStream inputStream) {
            return (CSShareFavorite) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSShareFavorite parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSShareFavorite) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSShareFavorite parseFrom(CodedInputStream codedInputStream) {
            return (CSShareFavorite) PARSER.parseFrom(codedInputStream);
        }

        public static CSShareFavorite parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSShareFavorite) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSShareFavorite cSShareFavorite) {
            return newBuilder().mergeFrom(cSShareFavorite);
        }
    }

    public interface CSUpdateOrBuilder extends MessageOrBuilder {
        DEVICE_TYPE getEDeviceType();

        LANGUAGE_TYPE getELanguageType();

        int getIAuto();

        int getIChannel();

        int getILuaVersion();

        int getIMobleSystem();

        int getISysVersion();

        String getSExtra();

        ByteString getSExtraBytes();

        String getStrMobileScreen();

        ByteString getStrMobileScreenBytes();

        String getStrMobileVersion();

        ByteString getStrMobileVersionBytes();

        long getUuid();

        boolean hasEDeviceType();

        boolean hasELanguageType();

        boolean hasIAuto();

        boolean hasIChannel();

        boolean hasILuaVersion();

        boolean hasIMobleSystem();

        boolean hasISysVersion();

        boolean hasSExtra();

        boolean hasStrMobileScreen();

        boolean hasStrMobileVersion();

        boolean hasUuid();
    }

    public static final class CSUpdate extends GeneratedMessage implements CSUpdateOrBuilder {
        public static final int EDEVICETYPE_FIELD_NUMBER = 10;
        public static final int ELANGUAGETYPE_FIELD_NUMBER = 9;
        public static final int IAUTO_FIELD_NUMBER = 6;
        public static final int ICHANNEL_FIELD_NUMBER = 11;
        public static final int ILUAVERSION_FIELD_NUMBER = 7;
        public static final int IMOBLESYSTEM_FIELD_NUMBER = 2;
        public static final int ISYSVERSION_FIELD_NUMBER = 3;
        public static Parser<CSUpdate> PARSER = null;
        public static final int SEXTRA_FIELD_NUMBER = 8;
        public static final int STRMOBILESCREEN_FIELD_NUMBER = 5;
        public static final int STRMOBILEVERSION_FIELD_NUMBER = 4;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSUpdate defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DEVICE_TYPE eDeviceType_;
        private LANGUAGE_TYPE eLanguageType_;
        private int iAuto_;
        private int iChannel_;
        private int iLuaVersion_;
        private int iMobleSystem_;
        private int iSysVersion_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sExtra_;
        private Object strMobileScreen_;
        private Object strMobileVersion_;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.CSUpdate.1 */
        class C01331 extends AbstractParser<CSUpdate> {
            static {
                fixHelper.fixfunc(new int[]{17120, 17121});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01331();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSUpdateOrBuilder {
            private int bitField0_;
            private DEVICE_TYPE eDeviceType_;
            private LANGUAGE_TYPE eLanguageType_;
            private int iAuto_;
            private int iChannel_;
            private int iLuaVersion_;
            private int iMobleSystem_;
            private int iSysVersion_;
            private Object sExtra_;
            private Object strMobileScreen_;
            private Object strMobileVersion_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{15822, 15823, 15824, 15825, 15826, 15827, 15828, 15829, 15830, 15831, 15832, 15833, 15834, 15835, 15836, 15837, 15838, 15839, 15840, 15841, 15842, 15843, 15844, 15845, 15846, 15847, 15848, 15849, 15850, 15851, 15852, 15853, 15854, 15855, 15856, 15857, 15858, 15859, 15860, 15861, 15862, 15863, 15864, 15865, 15866, 15867, 15868, 15869, 15870, 15871, 15872, 15873, 15874, 15875, 15876, 15877, 15878, 15879, 15880, 15881, 15882, 15883, 15884, 15885, 15886, 15887, 15888, 15889, 15890, 15891, 15892, 15893, 15894, 15895, 15896, 15897, 15898, 15899, 15900, 15901, 15902, 15903});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5109build();

            public final native CSUpdate m5110build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5111buildPartial();

            public final native CSUpdate m5112buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5113clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5114clear();

            public final native Builder m5115clear();

            public final native Builder clearEDeviceType();

            public final native Builder clearELanguageType();

            public final native Builder clearIAuto();

            public final native Builder clearIChannel();

            public final native Builder clearILuaVersion();

            public final native Builder clearIMobleSystem();

            public final native Builder clearISysVersion();

            public final native Builder clearSExtra();

            public final native Builder clearStrMobileScreen();

            public final native Builder clearStrMobileVersion();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5116clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5117clone();

            public final native Builder m5118clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5119getDefaultInstanceForType();

            public final native CSUpdate m5120getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native DEVICE_TYPE getEDeviceType();

            public final native LANGUAGE_TYPE getELanguageType();

            public final native int getIAuto();

            public final native int getIChannel();

            public final native int getILuaVersion();

            public final native int getIMobleSystem();

            public final native int getISysVersion();

            public final native String getSExtra();

            public final native ByteString getSExtraBytes();

            public final native String getStrMobileScreen();

            public final native ByteString getStrMobileScreenBytes();

            public final native String getStrMobileVersion();

            public final native ByteString getStrMobileVersionBytes();

            public final native long getUuid();

            public final native boolean hasEDeviceType();

            public final native boolean hasELanguageType();

            public final native boolean hasIAuto();

            public final native boolean hasIChannel();

            public final native boolean hasILuaVersion();

            public final native boolean hasIMobleSystem();

            public final native boolean hasISysVersion();

            public final native boolean hasSExtra();

            public final native boolean hasStrMobileScreen();

            public final native boolean hasStrMobileVersion();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5121mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5122mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5123mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5124mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5125mergeFrom(Message message);

            public final native Builder mergeFrom(CSUpdate cSUpdate);

            public final native Builder setEDeviceType(DEVICE_TYPE device_type);

            public final native Builder setELanguageType(LANGUAGE_TYPE language_type);

            public final native Builder setIAuto(int i);

            public final native Builder setIChannel(int i);

            public final native Builder setILuaVersion(int i);

            public final native Builder setIMobleSystem(int i);

            public final native Builder setISysVersion(int i);

            public final native Builder setSExtra(String str);

            public final native Builder setSExtraBytes(ByteString byteString);

            public final native Builder setStrMobileScreen(String str);

            public final native Builder setStrMobileScreenBytes(ByteString byteString);

            public final native Builder setStrMobileVersion(String str);

            public final native Builder setStrMobileVersionBytes(ByteString byteString);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f71e;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{32521, 32522, 32523, 32524, 32525, 32526, 32527, 32528, 32529, 32530, 32531, 32532, 32533, 32534, 32535, 32536, 32537, 32538, 32539, 32540, 32541, 32542, 32543, 32544, 32545, 32546, 32547, 32548, 32549, 32550, 32551, 32552, 32553, 32554, 32555, 32556, 32557, 32558, 32559, 32560, 32561, 32562, 32563, 32564, 32565, 32566, 32567, 32568, 32569});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSUpdate(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSUpdate(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSUpdate cSUpdate);

        private native CSUpdate(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSUpdate(com.google.protobuf.GeneratedMessage.Builder builder, CSUpdate cSUpdate);

        private native CSUpdate(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5102getDefaultInstanceForType();

        public final native CSUpdate m5103getDefaultInstanceForType();

        public final native DEVICE_TYPE getEDeviceType();

        public final native LANGUAGE_TYPE getELanguageType();

        public final native int getIAuto();

        public final native int getIChannel();

        public final native int getILuaVersion();

        public final native int getIMobleSystem();

        public final native int getISysVersion();

        public final native Parser<CSUpdate> getParserForType();

        public final native String getSExtra();

        public final native ByteString getSExtraBytes();

        public final native int getSerializedSize();

        public final native String getStrMobileScreen();

        public final native ByteString getStrMobileScreenBytes();

        public final native String getStrMobileVersion();

        public final native ByteString getStrMobileVersionBytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasEDeviceType();

        public final native boolean hasELanguageType();

        public final native boolean hasIAuto();

        public final native boolean hasIChannel();

        public final native boolean hasILuaVersion();

        public final native boolean hasIMobleSystem();

        public final native boolean hasISysVersion();

        public final native boolean hasSExtra();

        public final native boolean hasStrMobileScreen();

        public final native boolean hasStrMobileVersion();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5104newBuilderForType();

        public final native Builder m5105newBuilderForType();

        protected final native Builder m5106newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5107toBuilder();

        public final native Builder m5108toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSUpdate getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f71e;
        }

        static void __clinit__() {
            PARSER = new C01331();
            CSUpdate cSUpdate = new CSUpdate(true);
            defaultInstance = cSUpdate;
            cSUpdate.initFields();
        }

        public static CSUpdate parseFrom(ByteString byteString) {
            return (CSUpdate) PARSER.parseFrom(byteString);
        }

        public static CSUpdate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUpdate) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSUpdate parseFrom(byte[] bArr) {
            return (CSUpdate) PARSER.parseFrom(bArr);
        }

        public static CSUpdate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUpdate) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSUpdate parseFrom(InputStream inputStream) {
            return (CSUpdate) PARSER.parseFrom(inputStream);
        }

        public static CSUpdate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUpdate) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSUpdate parseDelimitedFrom(InputStream inputStream) {
            return (CSUpdate) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSUpdate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUpdate) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSUpdate parseFrom(CodedInputStream codedInputStream) {
            return (CSUpdate) PARSER.parseFrom(codedInputStream);
        }

        public static CSUpdate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSUpdate) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSUpdate cSUpdate) {
            return newBuilder().mergeFrom(cSUpdate);
        }
    }

    public enum FLASH_PAGE_ACT_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int FLASH_PAGE_ACT_NATIVE_TYPE_VALUE = 1;
        public static final int FLASH_PAGE_ACT_NO_TYPE_VALUE = 0;
        public static final int FLASH_PAGE_ACT_URL_TYPE_VALUE = 2;
        private static final FLASH_PAGE_ACT_TYPE[] VALUES = null;
        private static EnumLiteMap<FLASH_PAGE_ACT_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.FLASH_PAGE_ACT_TYPE.1 */
        class C01341 implements EnumLiteMap<FLASH_PAGE_ACT_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{27238, 27239});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01341();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{26592, 26593, 26594, 26595});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native FLASH_PAGE_ACT_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            FLASH_PAGE_ACT_NO_TYPE = new FLASH_PAGE_ACT_TYPE("FLASH_PAGE_ACT_NO_TYPE", FLASH_PAGE_ACT_NO_TYPE_VALUE, FLASH_PAGE_ACT_NO_TYPE_VALUE, FLASH_PAGE_ACT_NO_TYPE_VALUE);
            FLASH_PAGE_ACT_NATIVE_TYPE = new FLASH_PAGE_ACT_TYPE("FLASH_PAGE_ACT_NATIVE_TYPE", FLASH_PAGE_ACT_NATIVE_TYPE_VALUE, FLASH_PAGE_ACT_NATIVE_TYPE_VALUE, FLASH_PAGE_ACT_NATIVE_TYPE_VALUE);
            FLASH_PAGE_ACT_URL_TYPE = new FLASH_PAGE_ACT_TYPE("FLASH_PAGE_ACT_URL_TYPE", FLASH_PAGE_ACT_URL_TYPE_VALUE, FLASH_PAGE_ACT_URL_TYPE_VALUE, FLASH_PAGE_ACT_URL_TYPE_VALUE);
            ENUM$VALUES = new FLASH_PAGE_ACT_TYPE[]{FLASH_PAGE_ACT_NO_TYPE, FLASH_PAGE_ACT_NATIVE_TYPE, FLASH_PAGE_ACT_URL_TYPE};
            internalValueMap = new C01341();
            VALUES = values();
        }

        public static FLASH_PAGE_ACT_TYPE valueOf(int i) {
            switch (i) {
                case FLASH_PAGE_ACT_NO_TYPE_VALUE:
                    return FLASH_PAGE_ACT_NO_TYPE;
                case FLASH_PAGE_ACT_NATIVE_TYPE_VALUE:
                    return FLASH_PAGE_ACT_NATIVE_TYPE;
                case FLASH_PAGE_ACT_URL_TYPE_VALUE:
                    return FLASH_PAGE_ACT_URL_TYPE;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<FLASH_PAGE_ACT_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttp.m69a().getEnumTypes().get(FLASH_PAGE_ACT_NATIVE_TYPE_VALUE);
        }

        public static FLASH_PAGE_ACT_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface FlashPageInfoOrBuilder extends MessageOrBuilder {
        FLASH_PAGE_ACT_TYPE getEFlashPageActType();

        long getIBeginTime();

        int getIDuration();

        long getIEndTime();

        long getLFlashPageID();

        String getSFlashUrl();

        ByteString getSFlashUrlBytes();

        String getSJumpUrl();

        ByteString getSJumpUrlBytes();

        String getSNativeExtra();

        ByteString getSNativeExtraBytes();

        boolean hasEFlashPageActType();

        boolean hasIBeginTime();

        boolean hasIDuration();

        boolean hasIEndTime();

        boolean hasLFlashPageID();

        boolean hasSFlashUrl();

        boolean hasSJumpUrl();

        boolean hasSNativeExtra();
    }

    public static final class FlashPageInfo extends GeneratedMessage implements FlashPageInfoOrBuilder {
        public static final int EFLASHPAGEACTTYPE_FIELD_NUMBER = 6;
        public static final int IBEGINTIME_FIELD_NUMBER = 3;
        public static final int IDURATION_FIELD_NUMBER = 5;
        public static final int IENDTIME_FIELD_NUMBER = 4;
        public static final int LFLASHPAGEID_FIELD_NUMBER = 1;
        public static Parser<FlashPageInfo> PARSER = null;
        public static final int SFLASHURL_FIELD_NUMBER = 2;
        public static final int SJUMPURL_FIELD_NUMBER = 7;
        public static final int SNATIVEEXTRA_FIELD_NUMBER = 8;
        private static final FlashPageInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private FLASH_PAGE_ACT_TYPE eFlashPageActType_;
        private long iBeginTime_;
        private int iDuration_;
        private long iEndTime_;
        private long lFlashPageID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sFlashUrl_;
        private Object sJumpUrl_;
        private Object sNativeExtra_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.FlashPageInfo.1 */
        class C01351 extends AbstractParser<FlashPageInfo> {
            static {
                fixHelper.fixfunc(new int[]{17118, 17119});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01351();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements FlashPageInfoOrBuilder {
            private int bitField0_;
            private FLASH_PAGE_ACT_TYPE eFlashPageActType_;
            private long iBeginTime_;
            private int iDuration_;
            private long iEndTime_;
            private long lFlashPageID_;
            private Object sFlashUrl_;
            private Object sJumpUrl_;
            private Object sNativeExtra_;

            static {
                fixHelper.fixfunc(new int[]{17210, 17211, 17212, 17213, 17214, 17215, 17216, 17217, 17218, 17219, 17220, 17221, 17222, 17223, 17224, 17225, 17226, 17227, 17228, 17229, 17230, 17231, 17232, 17233, 17234, 17235, 17236, 17237, 17238, 17239, 17240, 17241, 17242, 17243, 17244, 17245, 17246, 17247, 17248, 17249, 17250, 17251, 17252, 17253, 17254, 17255, 17256, 17257, 17258, 17259, 17260, 17261, 17262, 17263, 17264, 17265, 17266, 17267, 17268, 17269, 17270, 17271, 17272, 17273, 17274, 17275, 17276, 17277, 17278, 17279});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5133build();

            public final native FlashPageInfo m5134build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5135buildPartial();

            public final native FlashPageInfo m5136buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5137clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5138clear();

            public final native Builder m5139clear();

            public final native Builder clearEFlashPageActType();

            public final native Builder clearIBeginTime();

            public final native Builder clearIDuration();

            public final native Builder clearIEndTime();

            public final native Builder clearLFlashPageID();

            public final native Builder clearSFlashUrl();

            public final native Builder clearSJumpUrl();

            public final native Builder clearSNativeExtra();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5140clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5141clone();

            public final native Builder m5142clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5143getDefaultInstanceForType();

            public final native FlashPageInfo m5144getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native FLASH_PAGE_ACT_TYPE getEFlashPageActType();

            public final native long getIBeginTime();

            public final native int getIDuration();

            public final native long getIEndTime();

            public final native long getLFlashPageID();

            public final native String getSFlashUrl();

            public final native ByteString getSFlashUrlBytes();

            public final native String getSJumpUrl();

            public final native ByteString getSJumpUrlBytes();

            public final native String getSNativeExtra();

            public final native ByteString getSNativeExtraBytes();

            public final native boolean hasEFlashPageActType();

            public final native boolean hasIBeginTime();

            public final native boolean hasIDuration();

            public final native boolean hasIEndTime();

            public final native boolean hasLFlashPageID();

            public final native boolean hasSFlashUrl();

            public final native boolean hasSJumpUrl();

            public final native boolean hasSNativeExtra();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5145mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5146mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5147mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5148mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5149mergeFrom(Message message);

            public final native Builder mergeFrom(FlashPageInfo flashPageInfo);

            public final native Builder setEFlashPageActType(FLASH_PAGE_ACT_TYPE flash_page_act_type);

            public final native Builder setIBeginTime(long j);

            public final native Builder setIDuration(int i);

            public final native Builder setIEndTime(long j);

            public final native Builder setLFlashPageID(long j);

            public final native Builder setSFlashUrl(String str);

            public final native Builder setSFlashUrlBytes(ByteString byteString);

            public final native Builder setSJumpUrl(String str);

            public final native Builder setSJumpUrlBytes(ByteString byteString);

            public final native Builder setSNativeExtra(String str);

            public final native Builder setSNativeExtraBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.aC;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{9610, 9611, 9612, 9613, 9614, 9615, 9616, 9617, 9618, 9619, 9620, 9621, 9622, 9623, 9624, 9625, 9626, 9627, 9628, 9629, 9630, 9631, 9632, 9633, 9634, 9635, 9636, 9637, 9638, 9639, 9640, 9641, 9642, 9643, 9644, 9645, 9646, 9647, 9648, 9649, 9650, 9651, 9652});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native FlashPageInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ FlashPageInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, FlashPageInfo flashPageInfo);

        private native FlashPageInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ FlashPageInfo(com.google.protobuf.GeneratedMessage.Builder builder, FlashPageInfo flashPageInfo);

        private native FlashPageInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5126getDefaultInstanceForType();

        public final native FlashPageInfo m5127getDefaultInstanceForType();

        public final native FLASH_PAGE_ACT_TYPE getEFlashPageActType();

        public final native long getIBeginTime();

        public final native int getIDuration();

        public final native long getIEndTime();

        public final native long getLFlashPageID();

        public final native Parser<FlashPageInfo> getParserForType();

        public final native String getSFlashUrl();

        public final native ByteString getSFlashUrlBytes();

        public final native String getSJumpUrl();

        public final native ByteString getSJumpUrlBytes();

        public final native String getSNativeExtra();

        public final native ByteString getSNativeExtraBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEFlashPageActType();

        public final native boolean hasIBeginTime();

        public final native boolean hasIDuration();

        public final native boolean hasIEndTime();

        public final native boolean hasLFlashPageID();

        public final native boolean hasSFlashUrl();

        public final native boolean hasSJumpUrl();

        public final native boolean hasSNativeExtra();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5128newBuilderForType();

        public final native Builder m5129newBuilderForType();

        protected final native Builder m5130newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5131toBuilder();

        public final native Builder m5132toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static FlashPageInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.aC;
        }

        static void __clinit__() {
            PARSER = new C01351();
            FlashPageInfo flashPageInfo = new FlashPageInfo(true);
            defaultInstance = flashPageInfo;
            flashPageInfo.initFields();
        }

        public static FlashPageInfo parseFrom(ByteString byteString) {
            return (FlashPageInfo) PARSER.parseFrom(byteString);
        }

        public static FlashPageInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FlashPageInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FlashPageInfo parseFrom(byte[] bArr) {
            return (FlashPageInfo) PARSER.parseFrom(bArr);
        }

        public static FlashPageInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FlashPageInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FlashPageInfo parseFrom(InputStream inputStream) {
            return (FlashPageInfo) PARSER.parseFrom(inputStream);
        }

        public static FlashPageInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FlashPageInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static FlashPageInfo parseDelimitedFrom(InputStream inputStream) {
            return (FlashPageInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static FlashPageInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FlashPageInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static FlashPageInfo parseFrom(CodedInputStream codedInputStream) {
            return (FlashPageInfo) PARSER.parseFrom(codedInputStream);
        }

        public static FlashPageInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FlashPageInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(FlashPageInfo flashPageInfo) {
            return newBuilder().mergeFrom(flashPageInfo);
        }
    }

    public interface LuaUpdateInfoOrBuilder extends MessageOrBuilder {
        UPDATE_TYPE getEUpdateType();

        String getStrConfig();

        ByteString getStrConfigBytes();

        String getStrDesc();

        ByteString getStrDescBytes();

        boolean hasEUpdateType();

        boolean hasStrConfig();

        boolean hasStrDesc();
    }

    public static final class LuaUpdateInfo extends GeneratedMessage implements LuaUpdateInfoOrBuilder {
        public static final int EUPDATETYPE_FIELD_NUMBER = 1;
        public static Parser<LuaUpdateInfo> PARSER = null;
        public static final int STRCONFIG_FIELD_NUMBER = 2;
        public static final int STRDESC_FIELD_NUMBER = 3;
        private static final LuaUpdateInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private UPDATE_TYPE eUpdateType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object strConfig_;
        private Object strDesc_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.LuaUpdateInfo.1 */
        class C01361 extends AbstractParser<LuaUpdateInfo> {
            static {
                fixHelper.fixfunc(new int[]{14735, 14736});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01361();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements LuaUpdateInfoOrBuilder {
            private int bitField0_;
            private UPDATE_TYPE eUpdateType_;
            private Object strConfig_;
            private Object strDesc_;

            static {
                fixHelper.fixfunc(new int[]{17425, 17426, 17427, 17428, 17429, 17430, 17431, 17432, 17433, 17434, 17435, 17436, 17437, 17438, 17439, 17440, 17441, 17442, 17443, 17444, 17445, 17446, 17447, 17448, 17449, 17450, 17451, 17452, 17453, 17454, 17455, 17456, 17457, 17458, 17459, 17460, 17461, 17462, 17463, 17464, 17465, 17466, 17467, 17468, 17469, 17470, 17471, 17472});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5157build();

            public final native LuaUpdateInfo m5158build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5159buildPartial();

            public final native LuaUpdateInfo m5160buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5161clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5162clear();

            public final native Builder m5163clear();

            public final native Builder clearEUpdateType();

            public final native Builder clearStrConfig();

            public final native Builder clearStrDesc();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5164clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5165clone();

            public final native Builder m5166clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5167getDefaultInstanceForType();

            public final native LuaUpdateInfo m5168getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native UPDATE_TYPE getEUpdateType();

            public final native String getStrConfig();

            public final native ByteString getStrConfigBytes();

            public final native String getStrDesc();

            public final native ByteString getStrDescBytes();

            public final native boolean hasEUpdateType();

            public final native boolean hasStrConfig();

            public final native boolean hasStrDesc();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5169mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5170mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5171mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5172mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5173mergeFrom(Message message);

            public final native Builder mergeFrom(LuaUpdateInfo luaUpdateInfo);

            public final native Builder setEUpdateType(UPDATE_TYPE update_type);

            public final native Builder setStrConfig(String str);

            public final native Builder setStrConfigBytes(ByteString byteString);

            public final native Builder setStrDesc(String str);

            public final native Builder setStrDescBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f69c;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{9835, 9836, 9837, 9838, 9839, 9840, 9841, 9842, 9843, 9844, 9845, 9846, 9847, 9848, 9849, 9850, 9851, 9852, 9853, 9854, 9855, 9856, 9857, 9858, 9859, 9860, 9861, 9862, 9863, 9864, 9865, 9866});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native LuaUpdateInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ LuaUpdateInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, LuaUpdateInfo luaUpdateInfo);

        private native LuaUpdateInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ LuaUpdateInfo(com.google.protobuf.GeneratedMessage.Builder builder, LuaUpdateInfo luaUpdateInfo);

        private native LuaUpdateInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5150getDefaultInstanceForType();

        public final native LuaUpdateInfo m5151getDefaultInstanceForType();

        public final native UPDATE_TYPE getEUpdateType();

        public final native Parser<LuaUpdateInfo> getParserForType();

        public final native int getSerializedSize();

        public final native String getStrConfig();

        public final native ByteString getStrConfigBytes();

        public final native String getStrDesc();

        public final native ByteString getStrDescBytes();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEUpdateType();

        public final native boolean hasStrConfig();

        public final native boolean hasStrDesc();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5152newBuilderForType();

        public final native Builder m5153newBuilderForType();

        protected final native Builder m5154newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5155toBuilder();

        public final native Builder m5156toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static LuaUpdateInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f69c;
        }

        static void __clinit__() {
            PARSER = new C01361();
            LuaUpdateInfo luaUpdateInfo = new LuaUpdateInfo(true);
            defaultInstance = luaUpdateInfo;
            luaUpdateInfo.initFields();
        }

        public static LuaUpdateInfo parseFrom(ByteString byteString) {
            return (LuaUpdateInfo) PARSER.parseFrom(byteString);
        }

        public static LuaUpdateInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LuaUpdateInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LuaUpdateInfo parseFrom(byte[] bArr) {
            return (LuaUpdateInfo) PARSER.parseFrom(bArr);
        }

        public static LuaUpdateInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LuaUpdateInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LuaUpdateInfo parseFrom(InputStream inputStream) {
            return (LuaUpdateInfo) PARSER.parseFrom(inputStream);
        }

        public static LuaUpdateInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LuaUpdateInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static LuaUpdateInfo parseDelimitedFrom(InputStream inputStream) {
            return (LuaUpdateInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static LuaUpdateInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LuaUpdateInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static LuaUpdateInfo parseFrom(CodedInputStream codedInputStream) {
            return (LuaUpdateInfo) PARSER.parseFrom(codedInputStream);
        }

        public static LuaUpdateInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LuaUpdateInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(LuaUpdateInfo luaUpdateInfo) {
            return newBuilder().mergeFrom(luaUpdateInfo);
        }
    }

    public enum NEW_SYSTEM_MESSAGE_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int SYSTEM_MESSAGE_ACTIVITY_VALUE = 2;
        public static final int SYSTEM_MESSAGE_ALL_VALUE = 4;
        public static final int SYSTEM_MESSAGE_BENEFITS_VALUE = 3;
        public static final int SYSTEM_MESSAGE_NOTIFY_VALUE = 1;
        private static final NEW_SYSTEM_MESSAGE_TYPE[] VALUES = null;
        private static EnumLiteMap<NEW_SYSTEM_MESSAGE_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.NEW_SYSTEM_MESSAGE_TYPE.1 */
        class C01371 implements EnumLiteMap<NEW_SYSTEM_MESSAGE_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{24345, 24346});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01371();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{30386, 30387, 30388, 30389});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native NEW_SYSTEM_MESSAGE_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            SYSTEM_MESSAGE_NOTIFY = new NEW_SYSTEM_MESSAGE_TYPE("SYSTEM_MESSAGE_NOTIFY", 0, 0, SYSTEM_MESSAGE_NOTIFY_VALUE);
            SYSTEM_MESSAGE_ACTIVITY = new NEW_SYSTEM_MESSAGE_TYPE("SYSTEM_MESSAGE_ACTIVITY", SYSTEM_MESSAGE_NOTIFY_VALUE, SYSTEM_MESSAGE_NOTIFY_VALUE, SYSTEM_MESSAGE_ACTIVITY_VALUE);
            SYSTEM_MESSAGE_BENEFITS = new NEW_SYSTEM_MESSAGE_TYPE("SYSTEM_MESSAGE_BENEFITS", SYSTEM_MESSAGE_ACTIVITY_VALUE, SYSTEM_MESSAGE_ACTIVITY_VALUE, SYSTEM_MESSAGE_BENEFITS_VALUE);
            SYSTEM_MESSAGE_ALL = new NEW_SYSTEM_MESSAGE_TYPE("SYSTEM_MESSAGE_ALL", SYSTEM_MESSAGE_BENEFITS_VALUE, SYSTEM_MESSAGE_BENEFITS_VALUE, SYSTEM_MESSAGE_ALL_VALUE);
            NEW_SYSTEM_MESSAGE_TYPE[] new_system_message_typeArr = new NEW_SYSTEM_MESSAGE_TYPE[SYSTEM_MESSAGE_ALL_VALUE];
            new_system_message_typeArr[0] = SYSTEM_MESSAGE_NOTIFY;
            new_system_message_typeArr[SYSTEM_MESSAGE_NOTIFY_VALUE] = SYSTEM_MESSAGE_ACTIVITY;
            new_system_message_typeArr[SYSTEM_MESSAGE_ACTIVITY_VALUE] = SYSTEM_MESSAGE_BENEFITS;
            new_system_message_typeArr[SYSTEM_MESSAGE_BENEFITS_VALUE] = SYSTEM_MESSAGE_ALL;
            ENUM$VALUES = new_system_message_typeArr;
            internalValueMap = new C01371();
            VALUES = values();
        }

        public static NEW_SYSTEM_MESSAGE_TYPE valueOf(int i) {
            switch (i) {
                case SYSTEM_MESSAGE_NOTIFY_VALUE:
                    return SYSTEM_MESSAGE_NOTIFY;
                case SYSTEM_MESSAGE_ACTIVITY_VALUE:
                    return SYSTEM_MESSAGE_ACTIVITY;
                case SYSTEM_MESSAGE_BENEFITS_VALUE:
                    return SYSTEM_MESSAGE_BENEFITS;
                case SYSTEM_MESSAGE_ALL_VALUE:
                    return SYSTEM_MESSAGE_ALL;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<NEW_SYSTEM_MESSAGE_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttp.m69a().getEnumTypes().get(SYSTEM_MESSAGE_BENEFITS_VALUE);
        }

        public static NEW_SYSTEM_MESSAGE_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum SAVE_FAVORITE_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int SAVE_FAVORITE_TYPE_ID_VALUE = 1;
        public static final int SAVE_FAVORITE_TYPE_URL_VALUE = 2;
        private static final SAVE_FAVORITE_TYPE[] VALUES = null;
        private static EnumLiteMap<SAVE_FAVORITE_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SAVE_FAVORITE_TYPE.1 */
        class C01381 implements EnumLiteMap<SAVE_FAVORITE_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{30796, 30797});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01381();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{13085, 13086, 13087, 13088});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SAVE_FAVORITE_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            SAVE_FAVORITE_TYPE_ID = new SAVE_FAVORITE_TYPE("SAVE_FAVORITE_TYPE_ID", 0, 0, SAVE_FAVORITE_TYPE_ID_VALUE);
            SAVE_FAVORITE_TYPE_URL = new SAVE_FAVORITE_TYPE("SAVE_FAVORITE_TYPE_URL", SAVE_FAVORITE_TYPE_ID_VALUE, SAVE_FAVORITE_TYPE_ID_VALUE, SAVE_FAVORITE_TYPE_URL_VALUE);
            SAVE_FAVORITE_TYPE[] save_favorite_typeArr = new SAVE_FAVORITE_TYPE[SAVE_FAVORITE_TYPE_URL_VALUE];
            save_favorite_typeArr[0] = SAVE_FAVORITE_TYPE_ID;
            save_favorite_typeArr[SAVE_FAVORITE_TYPE_ID_VALUE] = SAVE_FAVORITE_TYPE_URL;
            ENUM$VALUES = save_favorite_typeArr;
            internalValueMap = new C01381();
            VALUES = values();
        }

        public static SAVE_FAVORITE_TYPE valueOf(int i) {
            switch (i) {
                case SAVE_FAVORITE_TYPE_ID_VALUE:
                    return SAVE_FAVORITE_TYPE_ID;
                case SAVE_FAVORITE_TYPE_URL_VALUE:
                    return SAVE_FAVORITE_TYPE_URL;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<SAVE_FAVORITE_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttp.m69a().getEnumTypes().get(SAVE_FAVORITE_TYPE_URL_VALUE);
        }

        public static SAVE_FAVORITE_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface SCFeedbackRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLFeedbackID();

        boolean hasEErrCode();

        boolean hasLFeedbackID();
    }

    public static final class SCFeedbackRsp extends GeneratedMessage implements SCFeedbackRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LFEEDBACKID_FIELD_NUMBER = 2;
        public static Parser<SCFeedbackRsp> PARSER;
        private static final SCFeedbackRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lFeedbackID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCFeedbackRsp.1 */
        class C01391 extends AbstractParser<SCFeedbackRsp> {
            static {
                fixHelper.fixfunc(new int[]{8942, 8943});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01391();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCFeedbackRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lFeedbackID_;

            static {
                fixHelper.fixfunc(new int[]{26973, 26974, 26975, 26976, 26977, 26978, 26979, 26980, 26981, 26982, 26983, 26984, 26985, 26986, 26987, 26988, 26989, 26990, 26991, 26992, 26993, 26994, 26995, 26996, 26997, 26998, 26999, 27000, 27001, 27002, 27003, 27004, 27005, 27006, 27007, 27008, 27009, 27010, 27011, 27012});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5181build();

            public final native SCFeedbackRsp m5182build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5183buildPartial();

            public final native SCFeedbackRsp m5184buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5185clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5186clear();

            public final native Builder m5187clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLFeedbackID();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5188clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5189clone();

            public final native Builder m5190clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5191getDefaultInstanceForType();

            public final native SCFeedbackRsp m5192getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLFeedbackID();

            public final native boolean hasEErrCode();

            public final native boolean hasLFeedbackID();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5193mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5194mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5195mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5196mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5197mergeFrom(Message message);

            public final native Builder mergeFrom(SCFeedbackRsp sCFeedbackRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLFeedbackID(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f77k;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31810, 31811, 31812, 31813, 31814, 31815, 31816, 31817, 31818, 31819, 31820, 31821, 31822, 31823, 31824, 31825, 31826, 31827, 31828, 31829, 31830, 31831, 31832, 31833, 31834, 31835, 31836, 31837});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCFeedbackRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCFeedbackRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCFeedbackRsp sCFeedbackRsp);

        private native SCFeedbackRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCFeedbackRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCFeedbackRsp sCFeedbackRsp);

        private native SCFeedbackRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5174getDefaultInstanceForType();

        public final native SCFeedbackRsp m5175getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLFeedbackID();

        public final native Parser<SCFeedbackRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLFeedbackID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5176newBuilderForType();

        public final native Builder m5177newBuilderForType();

        protected final native Builder m5178newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5179toBuilder();

        public final native Builder m5180toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCFeedbackRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f77k;
        }

        static void __clinit__() {
            PARSER = new C01391();
            SCFeedbackRsp sCFeedbackRsp = new SCFeedbackRsp(true);
            defaultInstance = sCFeedbackRsp;
            sCFeedbackRsp.initFields();
        }

        public static SCFeedbackRsp parseFrom(ByteString byteString) {
            return (SCFeedbackRsp) PARSER.parseFrom(byteString);
        }

        public static SCFeedbackRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCFeedbackRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCFeedbackRsp parseFrom(byte[] bArr) {
            return (SCFeedbackRsp) PARSER.parseFrom(bArr);
        }

        public static SCFeedbackRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCFeedbackRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCFeedbackRsp parseFrom(InputStream inputStream) {
            return (SCFeedbackRsp) PARSER.parseFrom(inputStream);
        }

        public static SCFeedbackRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCFeedbackRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCFeedbackRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCFeedbackRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCFeedbackRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCFeedbackRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCFeedbackRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCFeedbackRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCFeedbackRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCFeedbackRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCFeedbackRsp sCFeedbackRsp) {
            return newBuilder().mergeFrom(sCFeedbackRsp);
        }
    }

    public interface SCGetAllPokerHistoryRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        BravoPokerHistoryInfo getVBravoPokerHistoryInfos(int i);

        int getVBravoPokerHistoryInfosCount();

        List<BravoPokerHistoryInfo> getVBravoPokerHistoryInfosList();

        BravoPokerHistoryInfoOrBuilder getVBravoPokerHistoryInfosOrBuilder(int i);

        List<? extends BravoPokerHistoryInfoOrBuilder> getVBravoPokerHistoryInfosOrBuilderList();

        PokerHistoryInfo getVPokerHistoryInfos(int i);

        int getVPokerHistoryInfosCount();

        List<PokerHistoryInfo> getVPokerHistoryInfosList();

        PokerHistoryInfoOrBuilder getVPokerHistoryInfosOrBuilder(int i);

        List<? extends PokerHistoryInfoOrBuilder> getVPokerHistoryInfosOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetAllPokerHistoryRsp extends GeneratedMessage implements SCGetAllPokerHistoryRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetAllPokerHistoryRsp> PARSER = null;
        public static final int VBRAVOPOKERHISTORYINFOS_FIELD_NUMBER = 3;
        public static final int VPOKERHISTORYINFOS_FIELD_NUMBER = 2;
        private static final SCGetAllPokerHistoryRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<BravoPokerHistoryInfo> vBravoPokerHistoryInfos_;
        private List<PokerHistoryInfo> vPokerHistoryInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetAllPokerHistoryRsp.1 */
        class C01401 extends AbstractParser<SCGetAllPokerHistoryRsp> {
            static {
                fixHelper.fixfunc(new int[]{32714, 32715});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01401();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetAllPokerHistoryRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<BravoPokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo.Builder, BravoPokerHistoryInfoOrBuilder> vBravoPokerHistoryInfosBuilder_;
            private List<BravoPokerHistoryInfo> vBravoPokerHistoryInfos_;
            private RepeatedFieldBuilder<PokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo.Builder, PokerHistoryInfoOrBuilder> vPokerHistoryInfosBuilder_;
            private List<PokerHistoryInfo> vPokerHistoryInfos_;

            static {
                fixHelper.fixfunc(new int[]{9188, 9189, 9190, 9191, 9192, 9193, 9194, 9195, 9196, 9197, 9198, 9199, 9200, 9201, 9202, 9203, 9204, 9205, 9206, 9207, 9208, 9209, 9210, 9211, 9212, 9213, 9214, 9215, 9216, 9217, 9218, 9219, 9220, 9221, 9222, 9223, 9224, 9225, 9226, 9227, 9228, 9229, 9230, 9231, 9232, 9233, 9234, 9235, 9236, 9237, 9238, 9239, 9240, 9241, 9242, 9243, 9244, 9245, 9246, 9247, 9248, 9249, 9250, 9251, 9252, 9253, 9254, 9255, 9256, 9257, 9258, 9259, 9260, 9261, 9262, 9263});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVBravoPokerHistoryInfosIsMutable();

            private native void ensureVPokerHistoryInfosIsMutable();

            private native RepeatedFieldBuilder<BravoPokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo.Builder, BravoPokerHistoryInfoOrBuilder> getVBravoPokerHistoryInfosFieldBuilder();

            private native RepeatedFieldBuilder<PokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo.Builder, PokerHistoryInfoOrBuilder> getVPokerHistoryInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVBravoPokerHistoryInfos(Iterable<? extends BravoPokerHistoryInfo> iterable);

            public final native Builder addAllVPokerHistoryInfos(Iterable<? extends PokerHistoryInfo> iterable);

            public final native Builder addVBravoPokerHistoryInfos(int i, com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo.Builder builder);

            public final native Builder addVBravoPokerHistoryInfos(int i, BravoPokerHistoryInfo bravoPokerHistoryInfo);

            public final native Builder addVBravoPokerHistoryInfos(com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo.Builder builder);

            public final native Builder addVBravoPokerHistoryInfos(BravoPokerHistoryInfo bravoPokerHistoryInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo.Builder addVBravoPokerHistoryInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo.Builder addVBravoPokerHistoryInfosBuilder(int i);

            public final native Builder addVPokerHistoryInfos(int i, com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo.Builder builder);

            public final native Builder addVPokerHistoryInfos(int i, PokerHistoryInfo pokerHistoryInfo);

            public final native Builder addVPokerHistoryInfos(com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo.Builder builder);

            public final native Builder addVPokerHistoryInfos(PokerHistoryInfo pokerHistoryInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo.Builder addVPokerHistoryInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo.Builder addVPokerHistoryInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5205build();

            public final native SCGetAllPokerHistoryRsp m5206build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5207buildPartial();

            public final native SCGetAllPokerHistoryRsp m5208buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5209clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5210clear();

            public final native Builder m5211clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVBravoPokerHistoryInfos();

            public final native Builder clearVPokerHistoryInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5212clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5213clone();

            public final native Builder m5214clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5215getDefaultInstanceForType();

            public final native SCGetAllPokerHistoryRsp m5216getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native BravoPokerHistoryInfo getVBravoPokerHistoryInfos(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo.Builder getVBravoPokerHistoryInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo.Builder> getVBravoPokerHistoryInfosBuilderList();

            public final native int getVBravoPokerHistoryInfosCount();

            public final native List<BravoPokerHistoryInfo> getVBravoPokerHistoryInfosList();

            public final native BravoPokerHistoryInfoOrBuilder getVBravoPokerHistoryInfosOrBuilder(int i);

            public final native List<? extends BravoPokerHistoryInfoOrBuilder> getVBravoPokerHistoryInfosOrBuilderList();

            public final native PokerHistoryInfo getVPokerHistoryInfos(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo.Builder getVPokerHistoryInfosBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo.Builder> getVPokerHistoryInfosBuilderList();

            public final native int getVPokerHistoryInfosCount();

            public final native List<PokerHistoryInfo> getVPokerHistoryInfosList();

            public final native PokerHistoryInfoOrBuilder getVPokerHistoryInfosOrBuilder(int i);

            public final native List<? extends PokerHistoryInfoOrBuilder> getVPokerHistoryInfosOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5217mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5218mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5219mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5220mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5221mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetAllPokerHistoryRsp sCGetAllPokerHistoryRsp);

            public final native Builder removeVBravoPokerHistoryInfos(int i);

            public final native Builder removeVPokerHistoryInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVBravoPokerHistoryInfos(int i, com.texaspoker.moment.TexasPokerCommon.BravoPokerHistoryInfo.Builder builder);

            public final native Builder setVBravoPokerHistoryInfos(int i, BravoPokerHistoryInfo bravoPokerHistoryInfo);

            public final native Builder setVPokerHistoryInfos(int i, com.texaspoker.moment.TexasPokerCommon.PokerHistoryInfo.Builder builder);

            public final native Builder setVPokerHistoryInfos(int i, PokerHistoryInfo pokerHistoryInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.ak;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31105, 31106, 31107, 31108, 31109, 31110, 31111, 31112, 31113, 31114, 31115, 31116, 31117, 31118, 31119, 31120, 31121, 31122, 31123, 31124, 31125, 31126, 31127, 31128, 31129, 31130, 31131, 31132, 31133, 31134, 31135, 31136, 31137, 31138, 31139, 31140});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetAllPokerHistoryRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetAllPokerHistoryRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetAllPokerHistoryRsp sCGetAllPokerHistoryRsp);

        private native SCGetAllPokerHistoryRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetAllPokerHistoryRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetAllPokerHistoryRsp sCGetAllPokerHistoryRsp);

        private native SCGetAllPokerHistoryRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5198getDefaultInstanceForType();

        public final native SCGetAllPokerHistoryRsp m5199getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetAllPokerHistoryRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native BravoPokerHistoryInfo getVBravoPokerHistoryInfos(int i);

        public final native int getVBravoPokerHistoryInfosCount();

        public final native List<BravoPokerHistoryInfo> getVBravoPokerHistoryInfosList();

        public final native BravoPokerHistoryInfoOrBuilder getVBravoPokerHistoryInfosOrBuilder(int i);

        public final native List<? extends BravoPokerHistoryInfoOrBuilder> getVBravoPokerHistoryInfosOrBuilderList();

        public final native PokerHistoryInfo getVPokerHistoryInfos(int i);

        public final native int getVPokerHistoryInfosCount();

        public final native List<PokerHistoryInfo> getVPokerHistoryInfosList();

        public final native PokerHistoryInfoOrBuilder getVPokerHistoryInfosOrBuilder(int i);

        public final native List<? extends PokerHistoryInfoOrBuilder> getVPokerHistoryInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5200newBuilderForType();

        public final native Builder m5201newBuilderForType();

        protected final native Builder m5202newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5203toBuilder();

        public final native Builder m5204toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetAllPokerHistoryRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.ak;
        }

        static void __clinit__() {
            PARSER = new C01401();
            SCGetAllPokerHistoryRsp sCGetAllPokerHistoryRsp = new SCGetAllPokerHistoryRsp(true);
            defaultInstance = sCGetAllPokerHistoryRsp;
            sCGetAllPokerHistoryRsp.initFields();
        }

        public static SCGetAllPokerHistoryRsp parseFrom(ByteString byteString) {
            return (SCGetAllPokerHistoryRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetAllPokerHistoryRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetAllPokerHistoryRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetAllPokerHistoryRsp parseFrom(byte[] bArr) {
            return (SCGetAllPokerHistoryRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetAllPokerHistoryRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetAllPokerHistoryRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetAllPokerHistoryRsp parseFrom(InputStream inputStream) {
            return (SCGetAllPokerHistoryRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetAllPokerHistoryRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetAllPokerHistoryRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetAllPokerHistoryRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetAllPokerHistoryRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetAllPokerHistoryRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetAllPokerHistoryRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetAllPokerHistoryRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetAllPokerHistoryRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetAllPokerHistoryRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetAllPokerHistoryRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetAllPokerHistoryRsp sCGetAllPokerHistoryRsp) {
            return newBuilder().mergeFrom(sCGetAllPokerHistoryRsp);
        }
    }

    public interface SCGetBannerInfosRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        int getIOffset();

        BannerInfo getVBannerInfos(int i);

        int getVBannerInfosCount();

        List<BannerInfo> getVBannerInfosList();

        BannerInfoOrBuilder getVBannerInfosOrBuilder(int i);

        List<? extends BannerInfoOrBuilder> getVBannerInfosOrBuilderList();

        boolean hasEErrCode();

        boolean hasIOffset();
    }

    public static final class SCGetBannerInfosRsp extends GeneratedMessage implements SCGetBannerInfosRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int IOFFSET_FIELD_NUMBER = 6;
        public static Parser<SCGetBannerInfosRsp> PARSER = null;
        public static final int VBANNERINFOS_FIELD_NUMBER = 2;
        private static final SCGetBannerInfosRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iOffset_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<BannerInfo> vBannerInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetBannerInfosRsp.1 */
        class C01411 extends AbstractParser<SCGetBannerInfosRsp> {
            static {
                fixHelper.fixfunc(new int[]{13991, 13992});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01411();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetBannerInfosRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private int iOffset_;
            private RepeatedFieldBuilder<BannerInfo, com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder, BannerInfoOrBuilder> vBannerInfosBuilder_;
            private List<BannerInfo> vBannerInfos_;

            static {
                fixHelper.fixfunc(new int[]{23260, 23261, 23262, 23263, 23264, 23265, 23266, 23267, 23268, 23269, 23270, 23271, 23272, 23273, 23274, 23275, 23276, 23277, 23278, 23279, 23280, 23281, 23282, 23283, 23284, 23285, 23286, 23287, 23288, 23289, 23290, 23291, 23292, 23293, 23294, 23295, 23296, 23297, 23298, 23299, 23300, 23301, 23302, 23303, 23304, 23305, 23306, 23307, 23308, 23309, 23310, 23311, 23312, 23313, 23314, 23315, 23316, 23317, 23318, 23319});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVBannerInfosIsMutable();

            private native RepeatedFieldBuilder<BannerInfo, com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder, BannerInfoOrBuilder> getVBannerInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVBannerInfos(Iterable<? extends BannerInfo> iterable);

            public final native Builder addVBannerInfos(int i, com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder builder);

            public final native Builder addVBannerInfos(int i, BannerInfo bannerInfo);

            public final native Builder addVBannerInfos(com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder builder);

            public final native Builder addVBannerInfos(BannerInfo bannerInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder addVBannerInfosBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder addVBannerInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5229build();

            public final native SCGetBannerInfosRsp m5230build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5231buildPartial();

            public final native SCGetBannerInfosRsp m5232buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5233clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5234clear();

            public final native Builder m5235clear();

            public final native Builder clearEErrCode();

            public final native Builder clearIOffset();

            public final native Builder clearVBannerInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5236clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5237clone();

            public final native Builder m5238clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5239getDefaultInstanceForType();

            public final native SCGetBannerInfosRsp m5240getDefaultInstanceForType();

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

            public final native boolean hasEErrCode();

            public final native boolean hasIOffset();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5241mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5242mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5243mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5244mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5245mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetBannerInfosRsp sCGetBannerInfosRsp);

            public final native Builder removeVBannerInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setIOffset(int i);

            public final native Builder setVBannerInfos(int i, com.texaspoker.moment.TexasPokerCommon.BannerInfo.Builder builder);

            public final native Builder setVBannerInfos(int i, BannerInfo bannerInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f81o;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17473, 17474, 17475, 17476, 17477, 17478, 17479, 17480, 17481, 17482, 17483, 17484, 17485, 17486, 17487, 17488, 17489, 17490, 17491, 17492, 17493, 17494, 17495, 17496, 17497, 17498, 17499, 17500, 17501, 17502, 17503, 17504, 17505});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetBannerInfosRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetBannerInfosRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetBannerInfosRsp sCGetBannerInfosRsp);

        private native SCGetBannerInfosRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetBannerInfosRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetBannerInfosRsp sCGetBannerInfosRsp);

        private native SCGetBannerInfosRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5222getDefaultInstanceForType();

        public final native SCGetBannerInfosRsp m5223getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIOffset();

        public final native Parser<SCGetBannerInfosRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native BannerInfo getVBannerInfos(int i);

        public final native int getVBannerInfosCount();

        public final native List<BannerInfo> getVBannerInfosList();

        public final native BannerInfoOrBuilder getVBannerInfosOrBuilder(int i);

        public final native List<? extends BannerInfoOrBuilder> getVBannerInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasIOffset();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5224newBuilderForType();

        public final native Builder m5225newBuilderForType();

        protected final native Builder m5226newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5227toBuilder();

        public final native Builder m5228toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetBannerInfosRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f81o;
        }

        static void __clinit__() {
            PARSER = new C01411();
            SCGetBannerInfosRsp sCGetBannerInfosRsp = new SCGetBannerInfosRsp(true);
            defaultInstance = sCGetBannerInfosRsp;
            sCGetBannerInfosRsp.initFields();
        }

        public static SCGetBannerInfosRsp parseFrom(ByteString byteString) {
            return (SCGetBannerInfosRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetBannerInfosRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBannerInfosRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetBannerInfosRsp parseFrom(byte[] bArr) {
            return (SCGetBannerInfosRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetBannerInfosRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBannerInfosRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetBannerInfosRsp parseFrom(InputStream inputStream) {
            return (SCGetBannerInfosRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetBannerInfosRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBannerInfosRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetBannerInfosRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetBannerInfosRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetBannerInfosRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBannerInfosRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetBannerInfosRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetBannerInfosRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetBannerInfosRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBannerInfosRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetBannerInfosRsp sCGetBannerInfosRsp) {
            return newBuilder().mergeFrom(sCGetBannerInfosRsp);
        }
    }

    public interface SCGetBenefitsRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLCoin();

        long getLPopularity();

        long getLSystemMsgID();

        UserBaseInfoNet getStUserBaseInfoN();

        UserBaseInfoNetOrBuilder getStUserBaseInfoNOrBuilder();

        boolean hasEErrCode();

        boolean hasLCoin();

        boolean hasLPopularity();

        boolean hasLSystemMsgID();

        boolean hasStUserBaseInfoN();
    }

    public static final class SCGetBenefitsRsp extends GeneratedMessage implements SCGetBenefitsRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LCOIN_FIELD_NUMBER = 3;
        public static final int LPOPULARITY_FIELD_NUMBER = 4;
        public static final int LSYSTEMMSGID_FIELD_NUMBER = 5;
        public static Parser<SCGetBenefitsRsp> PARSER = null;
        public static final int STUSERBASEINFON_FIELD_NUMBER = 2;
        private static final SCGetBenefitsRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lCoin_;
        private long lPopularity_;
        private long lSystemMsgID_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private UserBaseInfoNet stUserBaseInfoN_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetBenefitsRsp.1 */
        class C01421 extends AbstractParser<SCGetBenefitsRsp> {
            static {
                fixHelper.fixfunc(new int[]{14531, 14532});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01421();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetBenefitsRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lCoin_;
            private long lPopularity_;
            private long lSystemMsgID_;
            private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stUserBaseInfoNBuilder_;
            private UserBaseInfoNet stUserBaseInfoN_;

            static {
                fixHelper.fixfunc(new int[]{30221, 30222, 30223, 30224, 30225, 30226, 30227, 30228, 30229, 30230, 30231, 30232, 30233, 30234, 30235, 30236, 30237, 30238, 30239, 30240, 30241, 30242, 30243, 30244, 30245, 30246, 30247, 30248, 30249, 30250, 30251, 30252, 30253, 30254, 30255, 30256, 30257, 30258, 30259, 30260, 30261, 30262, 30263, 30264, 30265, 30266, 30267, 30268, 30269, 30270, 30271, 30272, 30273, 30274, 30275, 30276, 30277});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStUserBaseInfoNFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5253build();

            public final native SCGetBenefitsRsp m5254build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5255buildPartial();

            public final native SCGetBenefitsRsp m5256buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5257clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5258clear();

            public final native Builder m5259clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLCoin();

            public final native Builder clearLPopularity();

            public final native Builder clearLSystemMsgID();

            public final native Builder clearStUserBaseInfoN();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5260clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5261clone();

            public final native Builder m5262clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5263getDefaultInstanceForType();

            public final native SCGetBenefitsRsp m5264getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLCoin();

            public final native long getLPopularity();

            public final native long getLSystemMsgID();

            public final native UserBaseInfoNet getStUserBaseInfoN();

            public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStUserBaseInfoNBuilder();

            public final native UserBaseInfoNetOrBuilder getStUserBaseInfoNOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasLCoin();

            public final native boolean hasLPopularity();

            public final native boolean hasLSystemMsgID();

            public final native boolean hasStUserBaseInfoN();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5265mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5266mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5267mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5268mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5269mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetBenefitsRsp sCGetBenefitsRsp);

            public final native Builder mergeStUserBaseInfoN(UserBaseInfoNet userBaseInfoNet);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLCoin(long j);

            public final native Builder setLPopularity(long j);

            public final native Builder setLSystemMsgID(long j);

            public final native Builder setStUserBaseInfoN(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

            public final native Builder setStUserBaseInfoN(UserBaseInfoNet userBaseInfoNet);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.aA;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{21339, 21340, 21341, 21342, 21343, 21344, 21345, 21346, 21347, 21348, 21349, 21350, 21351, 21352, 21353, 21354, 21355, 21356, 21357, 21358, 21359, 21360, 21361, 21362, 21363, 21364, 21365, 21366, 21367, 21368, 21369, 21370, 21371, 21372, 21373});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetBenefitsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetBenefitsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetBenefitsRsp sCGetBenefitsRsp);

        private native SCGetBenefitsRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetBenefitsRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetBenefitsRsp sCGetBenefitsRsp);

        private native SCGetBenefitsRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5246getDefaultInstanceForType();

        public final native SCGetBenefitsRsp m5247getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLCoin();

        public final native long getLPopularity();

        public final native long getLSystemMsgID();

        public final native Parser<SCGetBenefitsRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UserBaseInfoNet getStUserBaseInfoN();

        public final native UserBaseInfoNetOrBuilder getStUserBaseInfoNOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLCoin();

        public final native boolean hasLPopularity();

        public final native boolean hasLSystemMsgID();

        public final native boolean hasStUserBaseInfoN();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5248newBuilderForType();

        public final native Builder m5249newBuilderForType();

        protected final native Builder m5250newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5251toBuilder();

        public final native Builder m5252toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetBenefitsRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.aA;
        }

        static void __clinit__() {
            PARSER = new C01421();
            SCGetBenefitsRsp sCGetBenefitsRsp = new SCGetBenefitsRsp(true);
            defaultInstance = sCGetBenefitsRsp;
            sCGetBenefitsRsp.initFields();
        }

        public static SCGetBenefitsRsp parseFrom(ByteString byteString) {
            return (SCGetBenefitsRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetBenefitsRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBenefitsRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetBenefitsRsp parseFrom(byte[] bArr) {
            return (SCGetBenefitsRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetBenefitsRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBenefitsRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetBenefitsRsp parseFrom(InputStream inputStream) {
            return (SCGetBenefitsRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetBenefitsRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBenefitsRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetBenefitsRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetBenefitsRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetBenefitsRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBenefitsRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetBenefitsRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetBenefitsRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetBenefitsRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetBenefitsRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetBenefitsRsp sCGetBenefitsRsp) {
            return newBuilder().mergeFrom(sCGetBenefitsRsp);
        }
    }

    public interface SCGetFavoriteListRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        PokerProcessInfo getVPokerProcessBaseInfo(int i);

        int getVPokerProcessBaseInfoCount();

        List<PokerProcessInfo> getVPokerProcessBaseInfoList();

        PokerProcessInfoOrBuilder getVPokerProcessBaseInfoOrBuilder(int i);

        List<? extends PokerProcessInfoOrBuilder> getVPokerProcessBaseInfoOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetFavoriteListRsp extends GeneratedMessage implements SCGetFavoriteListRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetFavoriteListRsp> PARSER = null;
        public static final int VPOKERPROCESSBASEINFO_FIELD_NUMBER = 2;
        private static final SCGetFavoriteListRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<PokerProcessInfo> vPokerProcessBaseInfo_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetFavoriteListRsp.1 */
        class C01431 extends AbstractParser<SCGetFavoriteListRsp> {
            static {
                fixHelper.fixfunc(new int[]{34087, 34088});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01431();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetFavoriteListRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<PokerProcessInfo, com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder, PokerProcessInfoOrBuilder> vPokerProcessBaseInfoBuilder_;
            private List<PokerProcessInfo> vPokerProcessBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{9937, 9938, 9939, 9940, 9941, 9942, 9943, 9944, 9945, 9946, 9947, 9948, 9949, 9950, 9951, 9952, 9953, 9954, 9955, 9956, 9957, 9958, 9959, 9960, 9961, 9962, 9963, 9964, 9965, 9966, 9967, 9968, 9969, 9970, 9971, 9972, 9973, 9974, 9975, 9976, 9977, 9978, 9979, 9980, 9981, 9982, 9983, 9984, 9985, 9986, 9987, 9988, 9989, 9990, 9991, 9992});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVPokerProcessBaseInfoIsMutable();

            private native RepeatedFieldBuilder<PokerProcessInfo, com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder, PokerProcessInfoOrBuilder> getVPokerProcessBaseInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVPokerProcessBaseInfo(Iterable<? extends PokerProcessInfo> iterable);

            public final native Builder addVPokerProcessBaseInfo(int i, com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder builder);

            public final native Builder addVPokerProcessBaseInfo(int i, PokerProcessInfo pokerProcessInfo);

            public final native Builder addVPokerProcessBaseInfo(com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder builder);

            public final native Builder addVPokerProcessBaseInfo(PokerProcessInfo pokerProcessInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder addVPokerProcessBaseInfoBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder addVPokerProcessBaseInfoBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5277build();

            public final native SCGetFavoriteListRsp m5278build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5279buildPartial();

            public final native SCGetFavoriteListRsp m5280buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5281clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5282clear();

            public final native Builder m5283clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVPokerProcessBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5284clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5285clone();

            public final native Builder m5286clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5287getDefaultInstanceForType();

            public final native SCGetFavoriteListRsp m5288getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native PokerProcessInfo getVPokerProcessBaseInfo(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder getVPokerProcessBaseInfoBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder> getVPokerProcessBaseInfoBuilderList();

            public final native int getVPokerProcessBaseInfoCount();

            public final native List<PokerProcessInfo> getVPokerProcessBaseInfoList();

            public final native PokerProcessInfoOrBuilder getVPokerProcessBaseInfoOrBuilder(int i);

            public final native List<? extends PokerProcessInfoOrBuilder> getVPokerProcessBaseInfoOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5289mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5290mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5291mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5292mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5293mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetFavoriteListRsp sCGetFavoriteListRsp);

            public final native Builder removeVPokerProcessBaseInfo(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVPokerProcessBaseInfo(int i, com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder builder);

            public final native Builder setVPokerProcessBaseInfo(int i, PokerProcessInfo pokerProcessInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f41A;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{11540, 11541, 11542, 11543, 11544, 11545, 11546, 11547, 11548, 11549, 11550, 11551, 11552, 11553, 11554, 11555, 11556, 11557, 11558, 11559, 11560, 11561, 11562, 11563, 11564, 11565, 11566, 11567, 11568, 11569, 11570});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetFavoriteListRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetFavoriteListRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetFavoriteListRsp sCGetFavoriteListRsp);

        private native SCGetFavoriteListRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetFavoriteListRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetFavoriteListRsp sCGetFavoriteListRsp);

        private native SCGetFavoriteListRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5270getDefaultInstanceForType();

        public final native SCGetFavoriteListRsp m5271getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetFavoriteListRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native PokerProcessInfo getVPokerProcessBaseInfo(int i);

        public final native int getVPokerProcessBaseInfoCount();

        public final native List<PokerProcessInfo> getVPokerProcessBaseInfoList();

        public final native PokerProcessInfoOrBuilder getVPokerProcessBaseInfoOrBuilder(int i);

        public final native List<? extends PokerProcessInfoOrBuilder> getVPokerProcessBaseInfoOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5272newBuilderForType();

        public final native Builder m5273newBuilderForType();

        protected final native Builder m5274newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5275toBuilder();

        public final native Builder m5276toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetFavoriteListRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f41A;
        }

        static void __clinit__() {
            PARSER = new C01431();
            SCGetFavoriteListRsp sCGetFavoriteListRsp = new SCGetFavoriteListRsp(true);
            defaultInstance = sCGetFavoriteListRsp;
            sCGetFavoriteListRsp.initFields();
        }

        public static SCGetFavoriteListRsp parseFrom(ByteString byteString) {
            return (SCGetFavoriteListRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetFavoriteListRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFavoriteListRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetFavoriteListRsp parseFrom(byte[] bArr) {
            return (SCGetFavoriteListRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetFavoriteListRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFavoriteListRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetFavoriteListRsp parseFrom(InputStream inputStream) {
            return (SCGetFavoriteListRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetFavoriteListRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFavoriteListRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFavoriteListRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetFavoriteListRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetFavoriteListRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFavoriteListRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFavoriteListRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetFavoriteListRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetFavoriteListRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFavoriteListRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetFavoriteListRsp sCGetFavoriteListRsp) {
            return newBuilder().mergeFrom(sCGetFavoriteListRsp);
        }
    }

    public interface SCGetFavoriteListV2RspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo(int i);

        int getStFavoritePokerHistoryInfoCount();

        List<FavoritePokerHistoryInfo> getStFavoritePokerHistoryInfoList();

        FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder(int i);

        List<? extends FavoritePokerHistoryInfoOrBuilder> getStFavoritePokerHistoryInfoOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetFavoriteListV2Rsp extends GeneratedMessage implements SCGetFavoriteListV2RspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetFavoriteListV2Rsp> PARSER = null;
        public static final int STFAVORITEPOKERHISTORYINFO_FIELD_NUMBER = 2;
        private static final SCGetFavoriteListV2Rsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<FavoritePokerHistoryInfo> stFavoritePokerHistoryInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetFavoriteListV2Rsp.1 */
        class C01441 extends AbstractParser<SCGetFavoriteListV2Rsp> {
            static {
                fixHelper.fixfunc(new int[]{30356, 30357});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01441();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetFavoriteListV2RspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<FavoritePokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder, FavoritePokerHistoryInfoOrBuilder> stFavoritePokerHistoryInfoBuilder_;
            private List<FavoritePokerHistoryInfo> stFavoritePokerHistoryInfo_;

            static {
                fixHelper.fixfunc(new int[]{6881, 6882, 6883, 6884, 6885, 6886, 6887, 6888, 6889, 6890, 6891, 6892, 6893, 6894, 6895, 6896, 6897, 6898, 6899, 6900, 6901, 6902, 6903, 6904, 6905, 6906, 6907, 6908, 6909, 6910, 6911, 6912, 6913, 6914, 6915, 6916, 6917, 6918, 6919, 6920, 6921, 6922, 6923, 6924, 6925, 6926, 6927, 6928, 6929, 6930, 6931, 6932, 6933, 6934, 6935, 6936});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureStFavoritePokerHistoryInfoIsMutable();

            private native RepeatedFieldBuilder<FavoritePokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder, FavoritePokerHistoryInfoOrBuilder> getStFavoritePokerHistoryInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllStFavoritePokerHistoryInfo(Iterable<? extends FavoritePokerHistoryInfo> iterable);

            public final native Builder addStFavoritePokerHistoryInfo(int i, com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder builder);

            public final native Builder addStFavoritePokerHistoryInfo(int i, FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public final native Builder addStFavoritePokerHistoryInfo(com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder builder);

            public final native Builder addStFavoritePokerHistoryInfo(FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public final native com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder addStFavoritePokerHistoryInfoBuilder();

            public final native com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder addStFavoritePokerHistoryInfoBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5301build();

            public final native SCGetFavoriteListV2Rsp m5302build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5303buildPartial();

            public final native SCGetFavoriteListV2Rsp m5304buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5305clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5306clear();

            public final native Builder m5307clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStFavoritePokerHistoryInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5308clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5309clone();

            public final native Builder m5310clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5311getDefaultInstanceForType();

            public final native SCGetFavoriteListV2Rsp m5312getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo(int i);

            public final native com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder getStFavoritePokerHistoryInfoBuilder(int i);

            public final native List<com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder> getStFavoritePokerHistoryInfoBuilderList();

            public final native int getStFavoritePokerHistoryInfoCount();

            public final native List<FavoritePokerHistoryInfo> getStFavoritePokerHistoryInfoList();

            public final native FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder(int i);

            public final native List<? extends FavoritePokerHistoryInfoOrBuilder> getStFavoritePokerHistoryInfoOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5313mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5314mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5315mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5316mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5317mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetFavoriteListV2Rsp sCGetFavoriteListV2Rsp);

            public final native Builder removeStFavoritePokerHistoryInfo(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStFavoritePokerHistoryInfo(int i, com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder builder);

            public final native Builder setStFavoritePokerHistoryInfo(int i, FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f65Y;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{6739, 6740, 6741, 6742, 6743, 6744, 6745, 6746, 6747, 6748, 6749, 6750, 6751, 6752, 6753, 6754, 6755, 6756, 6757, 6758, 6759, 6760, 6761, 6762, 6763, 6764, 6765, 6766, 6767, 6768, 6769});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetFavoriteListV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetFavoriteListV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetFavoriteListV2Rsp sCGetFavoriteListV2Rsp);

        private native SCGetFavoriteListV2Rsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetFavoriteListV2Rsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetFavoriteListV2Rsp sCGetFavoriteListV2Rsp);

        private native SCGetFavoriteListV2Rsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5294getDefaultInstanceForType();

        public final native SCGetFavoriteListV2Rsp m5295getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetFavoriteListV2Rsp> getParserForType();

        public final native int getSerializedSize();

        public final native FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo(int i);

        public final native int getStFavoritePokerHistoryInfoCount();

        public final native List<FavoritePokerHistoryInfo> getStFavoritePokerHistoryInfoList();

        public final native FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder(int i);

        public final native List<? extends FavoritePokerHistoryInfoOrBuilder> getStFavoritePokerHistoryInfoOrBuilderList();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5296newBuilderForType();

        public final native Builder m5297newBuilderForType();

        protected final native Builder m5298newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5299toBuilder();

        public final native Builder m5300toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetFavoriteListV2Rsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f65Y;
        }

        static void __clinit__() {
            PARSER = new C01441();
            SCGetFavoriteListV2Rsp sCGetFavoriteListV2Rsp = new SCGetFavoriteListV2Rsp(true);
            defaultInstance = sCGetFavoriteListV2Rsp;
            sCGetFavoriteListV2Rsp.initFields();
        }

        public static SCGetFavoriteListV2Rsp parseFrom(ByteString byteString) {
            return (SCGetFavoriteListV2Rsp) PARSER.parseFrom(byteString);
        }

        public static SCGetFavoriteListV2Rsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFavoriteListV2Rsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetFavoriteListV2Rsp parseFrom(byte[] bArr) {
            return (SCGetFavoriteListV2Rsp) PARSER.parseFrom(bArr);
        }

        public static SCGetFavoriteListV2Rsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFavoriteListV2Rsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetFavoriteListV2Rsp parseFrom(InputStream inputStream) {
            return (SCGetFavoriteListV2Rsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetFavoriteListV2Rsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFavoriteListV2Rsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFavoriteListV2Rsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetFavoriteListV2Rsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetFavoriteListV2Rsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFavoriteListV2Rsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFavoriteListV2Rsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetFavoriteListV2Rsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetFavoriteListV2Rsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFavoriteListV2Rsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetFavoriteListV2Rsp sCGetFavoriteListV2Rsp) {
            return newBuilder().mergeFrom(sCGetFavoriteListV2Rsp);
        }
    }

    public interface SCGetFestivalModeRspOrBuilder extends MessageOrBuilder {
        int getBFestivalMode();

        ERROR_CODE_TYPE getEErrCode();

        boolean hasBFestivalMode();

        boolean hasEErrCode();
    }

    public static final class SCGetFestivalModeRsp extends GeneratedMessage implements SCGetFestivalModeRspOrBuilder {
        public static final int BFESTIVALMODE_FIELD_NUMBER = 2;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetFestivalModeRsp> PARSER;
        private static final SCGetFestivalModeRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bFestivalMode_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetFestivalModeRsp.1 */
        class C01451 extends AbstractParser<SCGetFestivalModeRsp> {
            static {
                fixHelper.fixfunc(new int[]{9059, 9060});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01451();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetFestivalModeRspOrBuilder {
            private int bFestivalMode_;
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;

            static {
                fixHelper.fixfunc(new int[]{30877, 30878, 30879, 30880, 30881, 30882, 30883, 30884, 30885, 30886, 30887, 30888, 30889, 30890, 30891, 30892, 30893, 30894, 30895, 30896, 30897, 30898, 30899, 30900, 30901, 30902, 30903, 30904, 30905, 30906, 30907, 30908, 30909, 30910, 30911, 30912, 30913, 30914, 30915, 30916});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5325build();

            public final native SCGetFestivalModeRsp m5326build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5327buildPartial();

            public final native SCGetFestivalModeRsp m5328buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5329clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5330clear();

            public final native Builder m5331clear();

            public final native Builder clearBFestivalMode();

            public final native Builder clearEErrCode();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5332clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5333clone();

            public final native Builder m5334clone();

            public final native int getBFestivalMode();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5335getDefaultInstanceForType();

            public final native SCGetFestivalModeRsp m5336getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native boolean hasBFestivalMode();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5337mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5338mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5339mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5340mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5341mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetFestivalModeRsp sCGetFestivalModeRsp);

            public final native Builder setBFestivalMode(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.aK;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{17690, 17691, 17692, 17693, 17694, 17695, 17696, 17697, 17698, 17699, 17700, 17701, 17702, 17703, 17704, 17705, 17706, 17707, 17708, 17709, 17710, 17711, 17712, 17713, 17714, 17715, 17716, 17717});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetFestivalModeRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetFestivalModeRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetFestivalModeRsp sCGetFestivalModeRsp);

        private native SCGetFestivalModeRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetFestivalModeRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetFestivalModeRsp sCGetFestivalModeRsp);

        private native SCGetFestivalModeRsp(boolean z);

        private native void initFields();

        public final native int getBFestivalMode();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5318getDefaultInstanceForType();

        public final native SCGetFestivalModeRsp m5319getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetFestivalModeRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBFestivalMode();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5320newBuilderForType();

        public final native Builder m5321newBuilderForType();

        protected final native Builder m5322newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5323toBuilder();

        public final native Builder m5324toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetFestivalModeRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.aK;
        }

        static void __clinit__() {
            PARSER = new C01451();
            SCGetFestivalModeRsp sCGetFestivalModeRsp = new SCGetFestivalModeRsp(true);
            defaultInstance = sCGetFestivalModeRsp;
            sCGetFestivalModeRsp.initFields();
        }

        public static SCGetFestivalModeRsp parseFrom(ByteString byteString) {
            return (SCGetFestivalModeRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetFestivalModeRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFestivalModeRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetFestivalModeRsp parseFrom(byte[] bArr) {
            return (SCGetFestivalModeRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetFestivalModeRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFestivalModeRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetFestivalModeRsp parseFrom(InputStream inputStream) {
            return (SCGetFestivalModeRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetFestivalModeRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFestivalModeRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFestivalModeRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetFestivalModeRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetFestivalModeRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFestivalModeRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFestivalModeRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetFestivalModeRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetFestivalModeRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFestivalModeRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetFestivalModeRsp sCGetFestivalModeRsp) {
            return newBuilder().mergeFrom(sCGetFestivalModeRsp);
        }
    }

    public interface SCGetFlashPageInfosRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        FlashPageInfo getVFlashPageInfos(int i);

        int getVFlashPageInfosCount();

        List<FlashPageInfo> getVFlashPageInfosList();

        FlashPageInfoOrBuilder getVFlashPageInfosOrBuilder(int i);

        List<? extends FlashPageInfoOrBuilder> getVFlashPageInfosOrBuilderList();

        boolean hasEErrCode();
    }

    public static final class SCGetFlashPageInfosRsp extends GeneratedMessage implements SCGetFlashPageInfosRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetFlashPageInfosRsp> PARSER = null;
        public static final int VFLASHPAGEINFOS_FIELD_NUMBER = 2;
        private static final SCGetFlashPageInfosRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<FlashPageInfo> vFlashPageInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetFlashPageInfosRsp.1 */
        class C01461 extends AbstractParser<SCGetFlashPageInfosRsp> {
            static {
                fixHelper.fixfunc(new int[]{18057, 18058});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01461();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetFlashPageInfosRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private RepeatedFieldBuilder<FlashPageInfo, Builder, FlashPageInfoOrBuilder> vFlashPageInfosBuilder_;
            private List<FlashPageInfo> vFlashPageInfos_;

            static {
                fixHelper.fixfunc(new int[]{12281, 12282, 12283, 12284, 12285, 12286, 12287, 12288, 12289, 12290, NTLMConstants.DEFAULT_FLAGS, 12292, 12293, 12294, 12295, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12306, 12307, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVFlashPageInfosIsMutable();

            private native RepeatedFieldBuilder<FlashPageInfo, Builder, FlashPageInfoOrBuilder> getVFlashPageInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVFlashPageInfos(Iterable<? extends FlashPageInfo> iterable);

            public final native Builder addVFlashPageInfos(int i, Builder builder);

            public final native Builder addVFlashPageInfos(int i, FlashPageInfo flashPageInfo);

            public final native Builder addVFlashPageInfos(Builder builder);

            public final native Builder addVFlashPageInfos(FlashPageInfo flashPageInfo);

            public final native Builder addVFlashPageInfosBuilder();

            public final native Builder addVFlashPageInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5349build();

            public final native SCGetFlashPageInfosRsp m5350build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5351buildPartial();

            public final native SCGetFlashPageInfosRsp m5352buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5353clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5354clear();

            public final native Builder m5355clear();

            public final native Builder clearEErrCode();

            public final native Builder clearVFlashPageInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5356clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5357clone();

            public final native Builder m5358clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5359getDefaultInstanceForType();

            public final native SCGetFlashPageInfosRsp m5360getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native FlashPageInfo getVFlashPageInfos(int i);

            public final native Builder getVFlashPageInfosBuilder(int i);

            public final native List<Builder> getVFlashPageInfosBuilderList();

            public final native int getVFlashPageInfosCount();

            public final native List<FlashPageInfo> getVFlashPageInfosList();

            public final native FlashPageInfoOrBuilder getVFlashPageInfosOrBuilder(int i);

            public final native List<? extends FlashPageInfoOrBuilder> getVFlashPageInfosOrBuilderList();

            public final native boolean hasEErrCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5361mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5362mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5363mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5364mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5365mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetFlashPageInfosRsp sCGetFlashPageInfosRsp);

            public final native Builder removeVFlashPageInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setVFlashPageInfos(int i, Builder builder);

            public final native Builder setVFlashPageInfos(int i, FlashPageInfo flashPageInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.aG;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16966, 16967, 16968, 16969, 16970, 16971, 16972, 16973, 16974, 16975, 16976, 16977, 16978, 16979, 16980, 16981, 16982, 16983, 16984, 16985, 16986, 16987, 16988, 16989, 16990, 16991, 16992, 16993, 16994, 16995, 16996});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetFlashPageInfosRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetFlashPageInfosRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetFlashPageInfosRsp sCGetFlashPageInfosRsp);

        private native SCGetFlashPageInfosRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetFlashPageInfosRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetFlashPageInfosRsp sCGetFlashPageInfosRsp);

        private native SCGetFlashPageInfosRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5342getDefaultInstanceForType();

        public final native SCGetFlashPageInfosRsp m5343getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetFlashPageInfosRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native FlashPageInfo getVFlashPageInfos(int i);

        public final native int getVFlashPageInfosCount();

        public final native List<FlashPageInfo> getVFlashPageInfosList();

        public final native FlashPageInfoOrBuilder getVFlashPageInfosOrBuilder(int i);

        public final native List<? extends FlashPageInfoOrBuilder> getVFlashPageInfosOrBuilderList();

        public final native boolean hasEErrCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5344newBuilderForType();

        public final native Builder m5345newBuilderForType();

        protected final native Builder m5346newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5347toBuilder();

        public final native Builder m5348toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetFlashPageInfosRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.aG;
        }

        static void __clinit__() {
            PARSER = new C01461();
            SCGetFlashPageInfosRsp sCGetFlashPageInfosRsp = new SCGetFlashPageInfosRsp(true);
            defaultInstance = sCGetFlashPageInfosRsp;
            sCGetFlashPageInfosRsp.initFields();
        }

        public static SCGetFlashPageInfosRsp parseFrom(ByteString byteString) {
            return (SCGetFlashPageInfosRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetFlashPageInfosRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFlashPageInfosRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetFlashPageInfosRsp parseFrom(byte[] bArr) {
            return (SCGetFlashPageInfosRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetFlashPageInfosRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFlashPageInfosRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetFlashPageInfosRsp parseFrom(InputStream inputStream) {
            return (SCGetFlashPageInfosRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetFlashPageInfosRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFlashPageInfosRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFlashPageInfosRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetFlashPageInfosRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetFlashPageInfosRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFlashPageInfosRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetFlashPageInfosRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetFlashPageInfosRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetFlashPageInfosRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetFlashPageInfosRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetFlashPageInfosRsp sCGetFlashPageInfosRsp) {
            return newBuilder().mergeFrom(sCGetFlashPageInfosRsp);
        }
    }

    public interface SCGetLastPokerHandResultRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        PokerHandResult getStPokerHandResult();

        PokerHandResultOrBuilder getStPokerHandResultOrBuilder();

        boolean hasEErrCode();

        boolean hasStPokerHandResult();
    }

    public static final class SCGetLastPokerHandResultRsp extends GeneratedMessage implements SCGetLastPokerHandResultRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetLastPokerHandResultRsp> PARSER = null;
        public static final int STPOKERHANDRESULT_FIELD_NUMBER = 2;
        private static final SCGetLastPokerHandResultRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private PokerHandResult stPokerHandResult_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetLastPokerHandResultRsp.1 */
        class C01471 extends AbstractParser<SCGetLastPokerHandResultRsp> {
            static {
                fixHelper.fixfunc(new int[]{11055, 11056});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01471();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetLastPokerHandResultRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<PokerHandResult, com.texaspoker.moment.TexasPokerCommon.PokerHandResult.Builder, PokerHandResultOrBuilder> stPokerHandResultBuilder_;
            private PokerHandResult stPokerHandResult_;

            static {
                fixHelper.fixfunc(new int[]{6646, 6647, 6648, 6649, 6650, 6651, 6652, 6653, 6654, 6655, 6656, 6657, 6658, 6659, 6660, 6661, 6662, 6663, 6664, 6665, 6666, 6667, 6668, 6669, 6670, 6671, 6672, 6673, 6674, 6675, 6676, 6677, 6678, 6679, 6680, 6681, 6682, 6683, 6684, 6685, 6686, 6687, 6688, 6689, 6690});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<PokerHandResult, com.texaspoker.moment.TexasPokerCommon.PokerHandResult.Builder, PokerHandResultOrBuilder> getStPokerHandResultFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5373build();

            public final native SCGetLastPokerHandResultRsp m5374build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5375buildPartial();

            public final native SCGetLastPokerHandResultRsp m5376buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5377clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5378clear();

            public final native Builder m5379clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStPokerHandResult();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5380clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5381clone();

            public final native Builder m5382clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5383getDefaultInstanceForType();

            public final native SCGetLastPokerHandResultRsp m5384getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native PokerHandResult getStPokerHandResult();

            public final native com.texaspoker.moment.TexasPokerCommon.PokerHandResult.Builder getStPokerHandResultBuilder();

            public final native PokerHandResultOrBuilder getStPokerHandResultOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStPokerHandResult();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5385mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5386mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5387mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5388mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5389mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetLastPokerHandResultRsp sCGetLastPokerHandResultRsp);

            public final native Builder mergeStPokerHandResult(PokerHandResult pokerHandResult);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStPokerHandResult(com.texaspoker.moment.TexasPokerCommon.PokerHandResult.Builder builder);

            public final native Builder setStPokerHandResult(PokerHandResult pokerHandResult);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.ac;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{13091, 13092, 13093, 13094, 13095, 13096, 13097, 13098, 13099, 13100, 13101, 13102, 13103, 13104, 13105, 13106, 13107, 13108, 13109, 13110, 13111, 13112, 13113, 13114, 13115, 13116, 13117, 13118, 13119});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetLastPokerHandResultRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetLastPokerHandResultRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetLastPokerHandResultRsp sCGetLastPokerHandResultRsp);

        private native SCGetLastPokerHandResultRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetLastPokerHandResultRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetLastPokerHandResultRsp sCGetLastPokerHandResultRsp);

        private native SCGetLastPokerHandResultRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5366getDefaultInstanceForType();

        public final native SCGetLastPokerHandResultRsp m5367getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetLastPokerHandResultRsp> getParserForType();

        public final native int getSerializedSize();

        public final native PokerHandResult getStPokerHandResult();

        public final native PokerHandResultOrBuilder getStPokerHandResultOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStPokerHandResult();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5368newBuilderForType();

        public final native Builder m5369newBuilderForType();

        protected final native Builder m5370newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5371toBuilder();

        public final native Builder m5372toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetLastPokerHandResultRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.ac;
        }

        static void __clinit__() {
            PARSER = new C01471();
            SCGetLastPokerHandResultRsp sCGetLastPokerHandResultRsp = new SCGetLastPokerHandResultRsp(true);
            defaultInstance = sCGetLastPokerHandResultRsp;
            sCGetLastPokerHandResultRsp.initFields();
        }

        public static SCGetLastPokerHandResultRsp parseFrom(ByteString byteString) {
            return (SCGetLastPokerHandResultRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetLastPokerHandResultRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLastPokerHandResultRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetLastPokerHandResultRsp parseFrom(byte[] bArr) {
            return (SCGetLastPokerHandResultRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetLastPokerHandResultRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLastPokerHandResultRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetLastPokerHandResultRsp parseFrom(InputStream inputStream) {
            return (SCGetLastPokerHandResultRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetLastPokerHandResultRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLastPokerHandResultRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetLastPokerHandResultRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetLastPokerHandResultRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetLastPokerHandResultRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLastPokerHandResultRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetLastPokerHandResultRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetLastPokerHandResultRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetLastPokerHandResultRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetLastPokerHandResultRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetLastPokerHandResultRsp sCGetLastPokerHandResultRsp) {
            return newBuilder().mergeFrom(sCGetLastPokerHandResultRsp);
        }
    }

    public interface SCGetPokerHandResultByHandIDRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        PokerHandResult getStPokerHandResult();

        PokerHandResultOrBuilder getStPokerHandResultOrBuilder();

        boolean hasEErrCode();

        boolean hasStPokerHandResult();
    }

    public static final class SCGetPokerHandResultByHandIDRsp extends GeneratedMessage implements SCGetPokerHandResultByHandIDRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetPokerHandResultByHandIDRsp> PARSER = null;
        public static final int STPOKERHANDRESULT_FIELD_NUMBER = 2;
        private static final SCGetPokerHandResultByHandIDRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private PokerHandResult stPokerHandResult_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetPokerHandResultByHandIDRsp.1 */
        class C01481 extends AbstractParser<SCGetPokerHandResultByHandIDRsp> {
            static {
                fixHelper.fixfunc(new int[]{27759, 27760});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01481();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetPokerHandResultByHandIDRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<PokerHandResult, com.texaspoker.moment.TexasPokerCommon.PokerHandResult.Builder, PokerHandResultOrBuilder> stPokerHandResultBuilder_;
            private PokerHandResult stPokerHandResult_;

            static {
                fixHelper.fixfunc(new int[]{31838, 31839, 31840, 31841, 31842, 31843, 31844, 31845, 31846, 31847, 31848, 31849, 31850, 31851, 31852, 31853, 31854, 31855, 31856, 31857, 31858, 31859, 31860, 31861, 31862, 31863, 31864, 31865, 31866, 31867, 31868, 31869, 31870, 31871, 31872, 31873, 31874, 31875, 31876, 31877, 31878, 31879, 31880, 31881, 31882});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<PokerHandResult, com.texaspoker.moment.TexasPokerCommon.PokerHandResult.Builder, PokerHandResultOrBuilder> getStPokerHandResultFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5397build();

            public final native SCGetPokerHandResultByHandIDRsp m5398build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5399buildPartial();

            public final native SCGetPokerHandResultByHandIDRsp m5400buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5401clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5402clear();

            public final native Builder m5403clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStPokerHandResult();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5404clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5405clone();

            public final native Builder m5406clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5407getDefaultInstanceForType();

            public final native SCGetPokerHandResultByHandIDRsp m5408getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native PokerHandResult getStPokerHandResult();

            public final native com.texaspoker.moment.TexasPokerCommon.PokerHandResult.Builder getStPokerHandResultBuilder();

            public final native PokerHandResultOrBuilder getStPokerHandResultOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStPokerHandResult();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5409mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5410mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5411mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5412mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5413mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetPokerHandResultByHandIDRsp sCGetPokerHandResultByHandIDRsp);

            public final native Builder mergeStPokerHandResult(PokerHandResult pokerHandResult);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStPokerHandResult(com.texaspoker.moment.TexasPokerCommon.PokerHandResult.Builder builder);

            public final native Builder setStPokerHandResult(PokerHandResult pokerHandResult);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.ag;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{31074, 31075, 31076, 31077, 31078, 31079, 31080, 31081, 31082, 31083, 31084, 31085, 31086, 31087, 31088, 31089, 31090, 31091, 31092, 31093, 31094, 31095, 31096, 31097, 31098, 31099, 31100, 31101, 31102});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetPokerHandResultByHandIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetPokerHandResultByHandIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetPokerHandResultByHandIDRsp sCGetPokerHandResultByHandIDRsp);

        private native SCGetPokerHandResultByHandIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetPokerHandResultByHandIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetPokerHandResultByHandIDRsp sCGetPokerHandResultByHandIDRsp);

        private native SCGetPokerHandResultByHandIDRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5390getDefaultInstanceForType();

        public final native SCGetPokerHandResultByHandIDRsp m5391getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetPokerHandResultByHandIDRsp> getParserForType();

        public final native int getSerializedSize();

        public final native PokerHandResult getStPokerHandResult();

        public final native PokerHandResultOrBuilder getStPokerHandResultOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStPokerHandResult();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5392newBuilderForType();

        public final native Builder m5393newBuilderForType();

        protected final native Builder m5394newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5395toBuilder();

        public final native Builder m5396toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetPokerHandResultByHandIDRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.ag;
        }

        static void __clinit__() {
            PARSER = new C01481();
            SCGetPokerHandResultByHandIDRsp sCGetPokerHandResultByHandIDRsp = new SCGetPokerHandResultByHandIDRsp(true);
            defaultInstance = sCGetPokerHandResultByHandIDRsp;
            sCGetPokerHandResultByHandIDRsp.initFields();
        }

        public static SCGetPokerHandResultByHandIDRsp parseFrom(ByteString byteString) {
            return (SCGetPokerHandResultByHandIDRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetPokerHandResultByHandIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetPokerHandResultByHandIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetPokerHandResultByHandIDRsp parseFrom(byte[] bArr) {
            return (SCGetPokerHandResultByHandIDRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetPokerHandResultByHandIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetPokerHandResultByHandIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetPokerHandResultByHandIDRsp parseFrom(InputStream inputStream) {
            return (SCGetPokerHandResultByHandIDRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetPokerHandResultByHandIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetPokerHandResultByHandIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetPokerHandResultByHandIDRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetPokerHandResultByHandIDRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetPokerHandResultByHandIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetPokerHandResultByHandIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetPokerHandResultByHandIDRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetPokerHandResultByHandIDRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetPokerHandResultByHandIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetPokerHandResultByHandIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetPokerHandResultByHandIDRsp sCGetPokerHandResultByHandIDRsp) {
            return newBuilder().mergeFrom(sCGetPokerHandResultByHandIDRsp);
        }
    }

    public interface SCGetSystemMsgByIDRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        SystemMsgInfo getStSystemMsgInfo();

        SystemMsgInfoOrBuilder getStSystemMsgInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStSystemMsgInfo();
    }

    public static final class SCGetSystemMsgByIDRsp extends GeneratedMessage implements SCGetSystemMsgByIDRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCGetSystemMsgByIDRsp> PARSER = null;
        public static final int STSYSTEMMSGINFO_FIELD_NUMBER = 2;
        private static final SCGetSystemMsgByIDRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private SystemMsgInfo stSystemMsgInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetSystemMsgByIDRsp.1 */
        class C01491 extends AbstractParser<SCGetSystemMsgByIDRsp> {
            static {
                fixHelper.fixfunc(new int[]{24024, 24025});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01491();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetSystemMsgByIDRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<SystemMsgInfo, Builder, SystemMsgInfoOrBuilder> stSystemMsgInfoBuilder_;
            private SystemMsgInfo stSystemMsgInfo_;

            static {
                fixHelper.fixfunc(new int[]{14990, 14991, 14992, 14993, 14994, 14995, 14996, 14997, 14998, 14999, 15000, 15001, 15002, 15003, 15004, 15005, 15006, 15007, 15008, 15009, 15010, 15011, 15012, 15013, 15014, 15015, 15016, 15017, 15018, 15019, 15020, 15021, 15022, 15023, 15024, 15025, 15026, 15027, 15028, 15029, 15030, 15031, 15032, 15033, 15034});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<SystemMsgInfo, Builder, SystemMsgInfoOrBuilder> getStSystemMsgInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5421build();

            public final native SCGetSystemMsgByIDRsp m5422build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5423buildPartial();

            public final native SCGetSystemMsgByIDRsp m5424buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5425clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5426clear();

            public final native Builder m5427clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStSystemMsgInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5428clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5429clone();

            public final native Builder m5430clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5431getDefaultInstanceForType();

            public final native SCGetSystemMsgByIDRsp m5432getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native SystemMsgInfo getStSystemMsgInfo();

            public final native Builder getStSystemMsgInfoBuilder();

            public final native SystemMsgInfoOrBuilder getStSystemMsgInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStSystemMsgInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5433mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5434mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5435mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5436mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5437mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetSystemMsgByIDRsp sCGetSystemMsgByIDRsp);

            public final native Builder mergeStSystemMsgInfo(SystemMsgInfo systemMsgInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStSystemMsgInfo(Builder builder);

            public final native Builder setStSystemMsgInfo(SystemMsgInfo systemMsgInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.aw;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{21532, 21533, 21534, 21535, 21536, 21537, 21538, 21539, 21540, 21541, 21542, 21543, 21544, 21545, 21546, 21547, 21548, 21549, 21550, 21551, 21552, 21553, 21554, 21555, 21556, 21557, 21558, 21559, 21560});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetSystemMsgByIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetSystemMsgByIDRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetSystemMsgByIDRsp sCGetSystemMsgByIDRsp);

        private native SCGetSystemMsgByIDRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetSystemMsgByIDRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetSystemMsgByIDRsp sCGetSystemMsgByIDRsp);

        private native SCGetSystemMsgByIDRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5414getDefaultInstanceForType();

        public final native SCGetSystemMsgByIDRsp m5415getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCGetSystemMsgByIDRsp> getParserForType();

        public final native int getSerializedSize();

        public final native SystemMsgInfo getStSystemMsgInfo();

        public final native SystemMsgInfoOrBuilder getStSystemMsgInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStSystemMsgInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5416newBuilderForType();

        public final native Builder m5417newBuilderForType();

        protected final native Builder m5418newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5419toBuilder();

        public final native Builder m5420toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetSystemMsgByIDRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.aw;
        }

        static void __clinit__() {
            PARSER = new C01491();
            SCGetSystemMsgByIDRsp sCGetSystemMsgByIDRsp = new SCGetSystemMsgByIDRsp(true);
            defaultInstance = sCGetSystemMsgByIDRsp;
            sCGetSystemMsgByIDRsp.initFields();
        }

        public static SCGetSystemMsgByIDRsp parseFrom(ByteString byteString) {
            return (SCGetSystemMsgByIDRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetSystemMsgByIDRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSystemMsgByIDRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetSystemMsgByIDRsp parseFrom(byte[] bArr) {
            return (SCGetSystemMsgByIDRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetSystemMsgByIDRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSystemMsgByIDRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetSystemMsgByIDRsp parseFrom(InputStream inputStream) {
            return (SCGetSystemMsgByIDRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetSystemMsgByIDRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSystemMsgByIDRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetSystemMsgByIDRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetSystemMsgByIDRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetSystemMsgByIDRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSystemMsgByIDRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetSystemMsgByIDRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetSystemMsgByIDRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetSystemMsgByIDRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSystemMsgByIDRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetSystemMsgByIDRsp sCGetSystemMsgByIDRsp) {
            return newBuilder().mergeFrom(sCGetSystemMsgByIDRsp);
        }
    }

    public interface SCGetSystemMsgsRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getINum();

        int getIOffset();

        SystemMsgBaseInfo getVSystemMsgBaseInfos(int i);

        int getVSystemMsgBaseInfosCount();

        List<SystemMsgBaseInfo> getVSystemMsgBaseInfosList();

        SystemMsgBaseInfoOrBuilder getVSystemMsgBaseInfosOrBuilder(int i);

        List<? extends SystemMsgBaseInfoOrBuilder> getVSystemMsgBaseInfosOrBuilderList();

        boolean hasEErrCode();

        boolean hasINum();

        boolean hasIOffset();
    }

    public static final class SCGetSystemMsgsRsp extends GeneratedMessage implements SCGetSystemMsgsRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int INUM_FIELD_NUMBER = 3;
        public static final int IOFFSET_FIELD_NUMBER = 4;
        public static Parser<SCGetSystemMsgsRsp> PARSER = null;
        public static final int VSYSTEMMSGBASEINFOS_FIELD_NUMBER = 2;
        private static final SCGetSystemMsgsRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long iNum_;
        private int iOffset_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<SystemMsgBaseInfo> vSystemMsgBaseInfos_;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCGetSystemMsgsRsp.1 */
        class C01501 extends AbstractParser<SCGetSystemMsgsRsp> {
            static {
                fixHelper.fixfunc(new int[]{11336, 11337});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01501();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCGetSystemMsgsRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long iNum_;
            private int iOffset_;
            private RepeatedFieldBuilder<SystemMsgBaseInfo, Builder, SystemMsgBaseInfoOrBuilder> vSystemMsgBaseInfosBuilder_;
            private List<SystemMsgBaseInfo> vSystemMsgBaseInfos_;

            static {
                fixHelper.fixfunc(new int[]{9061, 9062, 9063, 9064, 9065, 9066, 9067, 9068, 9069, 9070, 9071, 9072, 9073, 9074, 9075, 9076, 9077, 9078, 9079, 9080, 9081, 9082, 9083, 9084, 9085, 9086, 9087, 9088, 9089, 9090, 9091, 9092, 9093, 9094, 9095, 9096, 9097, 9098, 9099, 9100, 9101, 9102, 9103, 9104, 9105, 9106, 9107, 9108, 9109, 9110, 9111, 9112, 9113, 9114, 9115, 9116, 9117, 9118, 9119, 9120, 9121, 9122, 9123, 9124});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVSystemMsgBaseInfosIsMutable();

            private native RepeatedFieldBuilder<SystemMsgBaseInfo, Builder, SystemMsgBaseInfoOrBuilder> getVSystemMsgBaseInfosFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVSystemMsgBaseInfos(Iterable<? extends SystemMsgBaseInfo> iterable);

            public final native Builder addVSystemMsgBaseInfos(int i, Builder builder);

            public final native Builder addVSystemMsgBaseInfos(int i, SystemMsgBaseInfo systemMsgBaseInfo);

            public final native Builder addVSystemMsgBaseInfos(Builder builder);

            public final native Builder addVSystemMsgBaseInfos(SystemMsgBaseInfo systemMsgBaseInfo);

            public final native Builder addVSystemMsgBaseInfosBuilder();

            public final native Builder addVSystemMsgBaseInfosBuilder(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5445build();

            public final native SCGetSystemMsgsRsp m5446build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5447buildPartial();

            public final native SCGetSystemMsgsRsp m5448buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5449clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5450clear();

            public final native Builder m5451clear();

            public final native Builder clearEErrCode();

            public final native Builder clearINum();

            public final native Builder clearIOffset();

            public final native Builder clearVSystemMsgBaseInfos();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5452clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5453clone();

            public final native Builder m5454clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5455getDefaultInstanceForType();

            public final native SCGetSystemMsgsRsp m5456getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getINum();

            public final native int getIOffset();

            public final native SystemMsgBaseInfo getVSystemMsgBaseInfos(int i);

            public final native Builder getVSystemMsgBaseInfosBuilder(int i);

            public final native List<Builder> getVSystemMsgBaseInfosBuilderList();

            public final native int getVSystemMsgBaseInfosCount();

            public final native List<SystemMsgBaseInfo> getVSystemMsgBaseInfosList();

            public final native SystemMsgBaseInfoOrBuilder getVSystemMsgBaseInfosOrBuilder(int i);

            public final native List<? extends SystemMsgBaseInfoOrBuilder> getVSystemMsgBaseInfosOrBuilderList();

            public final native boolean hasEErrCode();

            public final native boolean hasINum();

            public final native boolean hasIOffset();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5457mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5458mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5459mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5460mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5461mergeFrom(Message message);

            public final native Builder mergeFrom(SCGetSystemMsgsRsp sCGetSystemMsgsRsp);

            public final native Builder removeVSystemMsgBaseInfos(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setINum(long j);

            public final native Builder setIOffset(int i);

            public final native Builder setVSystemMsgBaseInfos(int i, Builder builder);

            public final native Builder setVSystemMsgBaseInfos(int i, SystemMsgBaseInfo systemMsgBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.as;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{23704, 23705, 23706, 23707, 23708, 23709, 23710, 23711, 23712, 23713, 23714, 23715, 23716, 23717, 23718, 23719, 23720, 23721, 23722, 23723, 23724, 23725, 23726, 23727, 23728, 23729, 23730, 23731, 23732, 23733, 23734, 23735, 23736, 23737, 23738});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCGetSystemMsgsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCGetSystemMsgsRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCGetSystemMsgsRsp sCGetSystemMsgsRsp);

        private native SCGetSystemMsgsRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCGetSystemMsgsRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCGetSystemMsgsRsp sCGetSystemMsgsRsp);

        private native SCGetSystemMsgsRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5438getDefaultInstanceForType();

        public final native SCGetSystemMsgsRsp m5439getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getINum();

        public final native int getIOffset();

        public final native Parser<SCGetSystemMsgsRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native SystemMsgBaseInfo getVSystemMsgBaseInfos(int i);

        public final native int getVSystemMsgBaseInfosCount();

        public final native List<SystemMsgBaseInfo> getVSystemMsgBaseInfosList();

        public final native SystemMsgBaseInfoOrBuilder getVSystemMsgBaseInfosOrBuilder(int i);

        public final native List<? extends SystemMsgBaseInfoOrBuilder> getVSystemMsgBaseInfosOrBuilderList();

        public final native boolean hasEErrCode();

        public final native boolean hasINum();

        public final native boolean hasIOffset();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5440newBuilderForType();

        public final native Builder m5441newBuilderForType();

        protected final native Builder m5442newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5443toBuilder();

        public final native Builder m5444toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCGetSystemMsgsRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.as;
        }

        static void __clinit__() {
            PARSER = new C01501();
            SCGetSystemMsgsRsp sCGetSystemMsgsRsp = new SCGetSystemMsgsRsp(true);
            defaultInstance = sCGetSystemMsgsRsp;
            sCGetSystemMsgsRsp.initFields();
        }

        public static SCGetSystemMsgsRsp parseFrom(ByteString byteString) {
            return (SCGetSystemMsgsRsp) PARSER.parseFrom(byteString);
        }

        public static SCGetSystemMsgsRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSystemMsgsRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCGetSystemMsgsRsp parseFrom(byte[] bArr) {
            return (SCGetSystemMsgsRsp) PARSER.parseFrom(bArr);
        }

        public static SCGetSystemMsgsRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSystemMsgsRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCGetSystemMsgsRsp parseFrom(InputStream inputStream) {
            return (SCGetSystemMsgsRsp) PARSER.parseFrom(inputStream);
        }

        public static SCGetSystemMsgsRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSystemMsgsRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetSystemMsgsRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCGetSystemMsgsRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCGetSystemMsgsRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSystemMsgsRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCGetSystemMsgsRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCGetSystemMsgsRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCGetSystemMsgsRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCGetSystemMsgsRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCGetSystemMsgsRsp sCGetSystemMsgsRsp) {
            return newBuilder().mergeFrom(sCGetSystemMsgsRsp);
        }
    }

    public interface SCRemoveFavoriteRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getPokerprocessid();

        boolean hasEErrCode();

        boolean hasPokerprocessid();
    }

    public static final class SCRemoveFavoriteRsp extends GeneratedMessage implements SCRemoveFavoriteRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCRemoveFavoriteRsp> PARSER = null;
        public static final int POKERPROCESSID_FIELD_NUMBER = 2;
        private static final SCRemoveFavoriteRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private long pokerprocessid_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCRemoveFavoriteRsp.1 */
        class C01511 extends AbstractParser<SCRemoveFavoriteRsp> {
            static {
                fixHelper.fixfunc(new int[]{30106, 30107});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01511();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCRemoveFavoriteRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long pokerprocessid_;

            static {
                fixHelper.fixfunc(new int[]{19717, 19718, 19719, 19720, 19721, 19722, 19723, 19724, 19725, 19726, 19727, 19728, 19729, 19730, 19731, 19732, 19733, 19734, 19735, 19736, 19737, 19738, 19739, 19740, 19741, 19742, 19743, 19744, 19745, 19746, 19747, 19748, 19749, 19750, 19751, 19752, 19753, 19754, 19755, 19756});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5469build();

            public final native SCRemoveFavoriteRsp m5470build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5471buildPartial();

            public final native SCRemoveFavoriteRsp m5472buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5473clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5474clear();

            public final native Builder m5475clear();

            public final native Builder clearEErrCode();

            public final native Builder clearPokerprocessid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5476clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5477clone();

            public final native Builder m5478clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5479getDefaultInstanceForType();

            public final native SCRemoveFavoriteRsp m5480getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getPokerprocessid();

            public final native boolean hasEErrCode();

            public final native boolean hasPokerprocessid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5481mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5482mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5483mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5484mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5485mergeFrom(Message message);

            public final native Builder mergeFrom(SCRemoveFavoriteRsp sCRemoveFavoriteRsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setPokerprocessid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f45E;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{28202, 28203, 28204, 28205, 28206, 28207, 28208, 28209, 28210, 28211, 28212, 28213, 28214, 28215, 28216, 28217, 28218, 28219, 28220, 28221, 28222, 28223, 28224, 28225, 28226, 28227, 28228, 28229});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCRemoveFavoriteRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCRemoveFavoriteRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCRemoveFavoriteRsp sCRemoveFavoriteRsp);

        private native SCRemoveFavoriteRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCRemoveFavoriteRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCRemoveFavoriteRsp sCRemoveFavoriteRsp);

        private native SCRemoveFavoriteRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5462getDefaultInstanceForType();

        public final native SCRemoveFavoriteRsp m5463getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCRemoveFavoriteRsp> getParserForType();

        public final native long getPokerprocessid();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasPokerprocessid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5464newBuilderForType();

        public final native Builder m5465newBuilderForType();

        protected final native Builder m5466newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5467toBuilder();

        public final native Builder m5468toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCRemoveFavoriteRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f45E;
        }

        static void __clinit__() {
            PARSER = new C01511();
            SCRemoveFavoriteRsp sCRemoveFavoriteRsp = new SCRemoveFavoriteRsp(true);
            defaultInstance = sCRemoveFavoriteRsp;
            sCRemoveFavoriteRsp.initFields();
        }

        public static SCRemoveFavoriteRsp parseFrom(ByteString byteString) {
            return (SCRemoveFavoriteRsp) PARSER.parseFrom(byteString);
        }

        public static SCRemoveFavoriteRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFavoriteRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCRemoveFavoriteRsp parseFrom(byte[] bArr) {
            return (SCRemoveFavoriteRsp) PARSER.parseFrom(bArr);
        }

        public static SCRemoveFavoriteRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFavoriteRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCRemoveFavoriteRsp parseFrom(InputStream inputStream) {
            return (SCRemoveFavoriteRsp) PARSER.parseFrom(inputStream);
        }

        public static SCRemoveFavoriteRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFavoriteRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCRemoveFavoriteRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCRemoveFavoriteRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCRemoveFavoriteRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFavoriteRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCRemoveFavoriteRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCRemoveFavoriteRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCRemoveFavoriteRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFavoriteRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCRemoveFavoriteRsp sCRemoveFavoriteRsp) {
            return newBuilder().mergeFrom(sCRemoveFavoriteRsp);
        }
    }

    public interface SCRemoveFavoriteV2RspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        long getLHandID();

        long getLRoomID();

        long getLSaveUserUuid();

        boolean hasEErrCode();

        boolean hasLHandID();

        boolean hasLRoomID();

        boolean hasLSaveUserUuid();
    }

    public static final class SCRemoveFavoriteV2Rsp extends GeneratedMessage implements SCRemoveFavoriteV2RspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static final int LHANDID_FIELD_NUMBER = 4;
        public static final int LROOMID_FIELD_NUMBER = 3;
        public static final int LSAVEUSERUUID_FIELD_NUMBER = 2;
        public static Parser<SCRemoveFavoriteV2Rsp> PARSER;
        private static final SCRemoveFavoriteV2Rsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private long lHandID_;
        private long lRoomID_;
        private long lSaveUserUuid_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCRemoveFavoriteV2Rsp.1 */
        class C01521 extends AbstractParser<SCRemoveFavoriteV2Rsp> {
            static {
                fixHelper.fixfunc(new int[]{13949, 13950});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01521();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCRemoveFavoriteV2RspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private long lHandID_;
            private long lRoomID_;
            private long lSaveUserUuid_;

            static {
                fixHelper.fixfunc(new int[]{32334, 32335, 32336, 32337, 32338, 32339, 32340, 32341, 32342, 32343, 32344, 32345, 32346, 32347, 32348, 32349, 32350, 32351, 32352, 32353, 32354, 32355, 32356, 32357, 32358, 32359, 32360, 32361, 32362, 32363, 32364, 32365, 32366, 32367, 32368, 32369, 32370, 32371, 32372, 32373, 32374, 32375, 32376, 32377, 32378, 32379, 32380, 32381});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5493build();

            public final native SCRemoveFavoriteV2Rsp m5494build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5495buildPartial();

            public final native SCRemoveFavoriteV2Rsp m5496buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5497clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5498clear();

            public final native Builder m5499clear();

            public final native Builder clearEErrCode();

            public final native Builder clearLHandID();

            public final native Builder clearLRoomID();

            public final native Builder clearLSaveUserUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5500clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5501clone();

            public final native Builder m5502clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5503getDefaultInstanceForType();

            public final native SCRemoveFavoriteV2Rsp m5504getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native long getLHandID();

            public final native long getLRoomID();

            public final native long getLSaveUserUuid();

            public final native boolean hasEErrCode();

            public final native boolean hasLHandID();

            public final native boolean hasLRoomID();

            public final native boolean hasLSaveUserUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5505mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5506mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5507mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5508mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5509mergeFrom(Message message);

            public final native Builder mergeFrom(SCRemoveFavoriteV2Rsp sCRemoveFavoriteV2Rsp);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setLHandID(long j);

            public final native Builder setLRoomID(long j);

            public final native Builder setLSaveUserUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f49I;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{11223, 11224, 11225, 11226, 11227, 11228, 11229, 11230, 11231, 11232, 11233, 11234, 11235, 11236, 11237, 11238, 11239, 11240, 11241, 11242, 11243, 11244, 11245, 11246, 11247, 11248, 11249, 11250, 11251, 11252, 11253, 11254});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCRemoveFavoriteV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCRemoveFavoriteV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCRemoveFavoriteV2Rsp sCRemoveFavoriteV2Rsp);

        private native SCRemoveFavoriteV2Rsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCRemoveFavoriteV2Rsp(com.google.protobuf.GeneratedMessage.Builder builder, SCRemoveFavoriteV2Rsp sCRemoveFavoriteV2Rsp);

        private native SCRemoveFavoriteV2Rsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5486getDefaultInstanceForType();

        public final native SCRemoveFavoriteV2Rsp m5487getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native long getLHandID();

        public final native long getLRoomID();

        public final native long getLSaveUserUuid();

        public final native Parser<SCRemoveFavoriteV2Rsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasLHandID();

        public final native boolean hasLRoomID();

        public final native boolean hasLSaveUserUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5488newBuilderForType();

        public final native Builder m5489newBuilderForType();

        protected final native Builder m5490newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5491toBuilder();

        public final native Builder m5492toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCRemoveFavoriteV2Rsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f49I;
        }

        static void __clinit__() {
            PARSER = new C01521();
            SCRemoveFavoriteV2Rsp sCRemoveFavoriteV2Rsp = new SCRemoveFavoriteV2Rsp(true);
            defaultInstance = sCRemoveFavoriteV2Rsp;
            sCRemoveFavoriteV2Rsp.initFields();
        }

        public static SCRemoveFavoriteV2Rsp parseFrom(ByteString byteString) {
            return (SCRemoveFavoriteV2Rsp) PARSER.parseFrom(byteString);
        }

        public static SCRemoveFavoriteV2Rsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFavoriteV2Rsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCRemoveFavoriteV2Rsp parseFrom(byte[] bArr) {
            return (SCRemoveFavoriteV2Rsp) PARSER.parseFrom(bArr);
        }

        public static SCRemoveFavoriteV2Rsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFavoriteV2Rsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCRemoveFavoriteV2Rsp parseFrom(InputStream inputStream) {
            return (SCRemoveFavoriteV2Rsp) PARSER.parseFrom(inputStream);
        }

        public static SCRemoveFavoriteV2Rsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFavoriteV2Rsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCRemoveFavoriteV2Rsp parseDelimitedFrom(InputStream inputStream) {
            return (SCRemoveFavoriteV2Rsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCRemoveFavoriteV2Rsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFavoriteV2Rsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCRemoveFavoriteV2Rsp parseFrom(CodedInputStream codedInputStream) {
            return (SCRemoveFavoriteV2Rsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCRemoveFavoriteV2Rsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRemoveFavoriteV2Rsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCRemoveFavoriteV2Rsp sCRemoveFavoriteV2Rsp) {
            return newBuilder().mergeFrom(sCRemoveFavoriteV2Rsp);
        }
    }

    public interface SCRenameFavoriteRspOrBuilder extends MessageOrBuilder {
        int getBSaved();

        ERROR_CODE_TYPE getEErrCode();

        FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

        FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

        boolean hasBSaved();

        boolean hasEErrCode();

        boolean hasStFavoritePokerHistoryInfo();
    }

    public static final class SCRenameFavoriteRsp extends GeneratedMessage implements SCRenameFavoriteRspOrBuilder {
        public static final int BSAVED_FIELD_NUMBER = 3;
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCRenameFavoriteRsp> PARSER = null;
        public static final int STFAVORITEPOKERHISTORYINFO_FIELD_NUMBER = 2;
        private static final SCRenameFavoriteRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bSaved_;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private FavoritePokerHistoryInfo stFavoritePokerHistoryInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCRenameFavoriteRsp.1 */
        class C01531 extends AbstractParser<SCRenameFavoriteRsp> {
            static {
                fixHelper.fixfunc(new int[]{31348, 31349});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01531();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCRenameFavoriteRspOrBuilder {
            private int bSaved_;
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<FavoritePokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder, FavoritePokerHistoryInfoOrBuilder> stFavoritePokerHistoryInfoBuilder_;
            private FavoritePokerHistoryInfo stFavoritePokerHistoryInfo_;

            static {
                fixHelper.fixfunc(new int[]{20487, 20488, 20489, 20490, 20491, 20492, 20493, 20494, 20495, 20496, 20497, 20498, 20499, 20500, 20501, 20502, 20503, 20504, 20505, 20506, 20507, 20508, 20509, 20510, 20511, 20512, 20513, 20514, 20515, 20516, 20517, 20518, 20519, 20520, 20521, 20522, 20523, 20524, 20525, 20526, 20527, 20528, 20529, 20530, 20531, 20532, 20533, 20534, 20535});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<FavoritePokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder, FavoritePokerHistoryInfoOrBuilder> getStFavoritePokerHistoryInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5517build();

            public final native SCRenameFavoriteRsp m5518build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5519buildPartial();

            public final native SCRenameFavoriteRsp m5520buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5521clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5522clear();

            public final native Builder m5523clear();

            public final native Builder clearBSaved();

            public final native Builder clearEErrCode();

            public final native Builder clearStFavoritePokerHistoryInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5524clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5525clone();

            public final native Builder m5526clone();

            public final native int getBSaved();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5527getDefaultInstanceForType();

            public final native SCRenameFavoriteRsp m5528getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder getStFavoritePokerHistoryInfoBuilder();

            public final native FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

            public final native boolean hasBSaved();

            public final native boolean hasEErrCode();

            public final native boolean hasStFavoritePokerHistoryInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5529mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5530mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5531mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5532mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5533mergeFrom(Message message);

            public final native Builder mergeFrom(SCRenameFavoriteRsp sCRenameFavoriteRsp);

            public final native Builder mergeStFavoritePokerHistoryInfo(FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public final native Builder setBSaved(int i);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStFavoritePokerHistoryInfo(com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder builder);

            public final native Builder setStFavoritePokerHistoryInfo(FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f61U;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{25622, 25623, 25624, 25625, 25626, 25627, 25628, 25629, 25630, 25631, 25632, 25633, 25634, 25635, 25636, 25637, 25638, 25639, 25640, 25641, 25642, 25643, 25644, 25645, 25646, 25647, 25648, 25649, 25650, 25651, 25652});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCRenameFavoriteRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCRenameFavoriteRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCRenameFavoriteRsp sCRenameFavoriteRsp);

        private native SCRenameFavoriteRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCRenameFavoriteRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCRenameFavoriteRsp sCRenameFavoriteRsp);

        private native SCRenameFavoriteRsp(boolean z);

        private native void initFields();

        public final native int getBSaved();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5510getDefaultInstanceForType();

        public final native SCRenameFavoriteRsp m5511getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCRenameFavoriteRsp> getParserForType();

        public final native int getSerializedSize();

        public final native FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

        public final native FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBSaved();

        public final native boolean hasEErrCode();

        public final native boolean hasStFavoritePokerHistoryInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5512newBuilderForType();

        public final native Builder m5513newBuilderForType();

        protected final native Builder m5514newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5515toBuilder();

        public final native Builder m5516toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCRenameFavoriteRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f61U;
        }

        static void __clinit__() {
            PARSER = new C01531();
            SCRenameFavoriteRsp sCRenameFavoriteRsp = new SCRenameFavoriteRsp(true);
            defaultInstance = sCRenameFavoriteRsp;
            sCRenameFavoriteRsp.initFields();
        }

        public static SCRenameFavoriteRsp parseFrom(ByteString byteString) {
            return (SCRenameFavoriteRsp) PARSER.parseFrom(byteString);
        }

        public static SCRenameFavoriteRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRenameFavoriteRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCRenameFavoriteRsp parseFrom(byte[] bArr) {
            return (SCRenameFavoriteRsp) PARSER.parseFrom(bArr);
        }

        public static SCRenameFavoriteRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRenameFavoriteRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCRenameFavoriteRsp parseFrom(InputStream inputStream) {
            return (SCRenameFavoriteRsp) PARSER.parseFrom(inputStream);
        }

        public static SCRenameFavoriteRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRenameFavoriteRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCRenameFavoriteRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCRenameFavoriteRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCRenameFavoriteRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRenameFavoriteRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCRenameFavoriteRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCRenameFavoriteRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCRenameFavoriteRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCRenameFavoriteRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCRenameFavoriteRsp sCRenameFavoriteRsp) {
            return newBuilder().mergeFrom(sCRenameFavoriteRsp);
        }
    }

    public interface SCSaveFavoriteRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        PokerProcessInfo getStPokerProcessBaseInfo();

        PokerProcessInfoOrBuilder getStPokerProcessBaseInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStPokerProcessBaseInfo();
    }

    public static final class SCSaveFavoriteRsp extends GeneratedMessage implements SCSaveFavoriteRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCSaveFavoriteRsp> PARSER = null;
        public static final int STPOKERPROCESSBASEINFO_FIELD_NUMBER = 2;
        private static final SCSaveFavoriteRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private PokerProcessInfo stPokerProcessBaseInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCSaveFavoriteRsp.1 */
        class C01541 extends AbstractParser<SCSaveFavoriteRsp> {
            static {
                fixHelper.fixfunc(new int[]{14658, 14659});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01541();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSaveFavoriteRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<PokerProcessInfo, com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder, PokerProcessInfoOrBuilder> stPokerProcessBaseInfoBuilder_;
            private PokerProcessInfo stPokerProcessBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{21292, 21293, 21294, 21295, 21296, 21297, 21298, 21299, 21300, 21301, 21302, 21303, 21304, 21305, 21306, 21307, 21308, 21309, 21310, 21311, 21312, 21313, 21314, 21315, 21316, 21317, 21318, 21319, 21320, 21321, 21322, 21323, 21324, 21325, 21326, 21327, 21328, 21329, 21330, 21331, 21332, 21333, 21334, 21335, 21336});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<PokerProcessInfo, com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder, PokerProcessInfoOrBuilder> getStPokerProcessBaseInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5541build();

            public final native SCSaveFavoriteRsp m5542build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5543buildPartial();

            public final native SCSaveFavoriteRsp m5544buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5545clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5546clear();

            public final native Builder m5547clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStPokerProcessBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5548clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5549clone();

            public final native Builder m5550clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5551getDefaultInstanceForType();

            public final native SCSaveFavoriteRsp m5552getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native PokerProcessInfo getStPokerProcessBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder getStPokerProcessBaseInfoBuilder();

            public final native PokerProcessInfoOrBuilder getStPokerProcessBaseInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStPokerProcessBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5553mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5554mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5555mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5556mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5557mergeFrom(Message message);

            public final native Builder mergeFrom(SCSaveFavoriteRsp sCSaveFavoriteRsp);

            public final native Builder mergeStPokerProcessBaseInfo(PokerProcessInfo pokerProcessInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStPokerProcessBaseInfo(com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder builder);

            public final native Builder setStPokerProcessBaseInfo(PokerProcessInfo pokerProcessInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f85s;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{29415, 29416, 29417, 29418, 29419, 29420, 29421, 29422, 29423, 29424, 29425, 29426, 29427, 29428, 29429, 29430, 29431, 29432, 29433, 29434, 29435, 29436, 29437, 29438, 29439, 29440, 29441, 29442, 29443});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSaveFavoriteRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSaveFavoriteRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSaveFavoriteRsp sCSaveFavoriteRsp);

        private native SCSaveFavoriteRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSaveFavoriteRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSaveFavoriteRsp sCSaveFavoriteRsp);

        private native SCSaveFavoriteRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5534getDefaultInstanceForType();

        public final native SCSaveFavoriteRsp m5535getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCSaveFavoriteRsp> getParserForType();

        public final native int getSerializedSize();

        public final native PokerProcessInfo getStPokerProcessBaseInfo();

        public final native PokerProcessInfoOrBuilder getStPokerProcessBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStPokerProcessBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5536newBuilderForType();

        public final native Builder m5537newBuilderForType();

        protected final native Builder m5538newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5539toBuilder();

        public final native Builder m5540toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSaveFavoriteRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f85s;
        }

        static void __clinit__() {
            PARSER = new C01541();
            SCSaveFavoriteRsp sCSaveFavoriteRsp = new SCSaveFavoriteRsp(true);
            defaultInstance = sCSaveFavoriteRsp;
            sCSaveFavoriteRsp.initFields();
        }

        public static SCSaveFavoriteRsp parseFrom(ByteString byteString) {
            return (SCSaveFavoriteRsp) PARSER.parseFrom(byteString);
        }

        public static SCSaveFavoriteRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSaveFavoriteRsp parseFrom(byte[] bArr) {
            return (SCSaveFavoriteRsp) PARSER.parseFrom(bArr);
        }

        public static SCSaveFavoriteRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSaveFavoriteRsp parseFrom(InputStream inputStream) {
            return (SCSaveFavoriteRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSaveFavoriteRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSaveFavoriteRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSaveFavoriteRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSaveFavoriteRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSaveFavoriteRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSaveFavoriteRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSaveFavoriteRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSaveFavoriteRsp sCSaveFavoriteRsp) {
            return newBuilder().mergeFrom(sCSaveFavoriteRsp);
        }
    }

    public interface SCSaveFavoriteUrlRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        PokerProcessInfo getStPokerProcessBaseInfo();

        PokerProcessInfoOrBuilder getStPokerProcessBaseInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStPokerProcessBaseInfo();
    }

    public static final class SCSaveFavoriteUrlRsp extends GeneratedMessage implements SCSaveFavoriteUrlRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCSaveFavoriteUrlRsp> PARSER = null;
        public static final int STPOKERPROCESSBASEINFO_FIELD_NUMBER = 2;
        private static final SCSaveFavoriteUrlRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private PokerProcessInfo stPokerProcessBaseInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCSaveFavoriteUrlRsp.1 */
        class C01551 extends AbstractParser<SCSaveFavoriteUrlRsp> {
            static {
                fixHelper.fixfunc(new int[]{33231, 33232});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01551();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSaveFavoriteUrlRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<PokerProcessInfo, com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder, PokerProcessInfoOrBuilder> stPokerProcessBaseInfoBuilder_;
            private PokerProcessInfo stPokerProcessBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{23207, 23208, 23209, 23210, 23211, 23212, 23213, 23214, 23215, 23216, 23217, 23218, 23219, 23220, 23221, 23222, 23223, 23224, 23225, 23226, 23227, 23228, 23229, 23230, 23231, 23232, 23233, 23234, 23235, 23236, 23237, 23238, 23239, 23240, 23241, 23242, 23243, 23244, 23245, 23246, 23247, 23248, 23249, 23250, 23251});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<PokerProcessInfo, com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder, PokerProcessInfoOrBuilder> getStPokerProcessBaseInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5565build();

            public final native SCSaveFavoriteUrlRsp m5566build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5567buildPartial();

            public final native SCSaveFavoriteUrlRsp m5568buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5569clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5570clear();

            public final native Builder m5571clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStPokerProcessBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5572clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5573clone();

            public final native Builder m5574clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5575getDefaultInstanceForType();

            public final native SCSaveFavoriteUrlRsp m5576getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native PokerProcessInfo getStPokerProcessBaseInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder getStPokerProcessBaseInfoBuilder();

            public final native PokerProcessInfoOrBuilder getStPokerProcessBaseInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStPokerProcessBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5577mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5578mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5579mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5580mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5581mergeFrom(Message message);

            public final native Builder mergeFrom(SCSaveFavoriteUrlRsp sCSaveFavoriteUrlRsp);

            public final native Builder mergeStPokerProcessBaseInfo(PokerProcessInfo pokerProcessInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStPokerProcessBaseInfo(com.texaspoker.moment.TexasPokerCommon.PokerProcessInfo.Builder builder);

            public final native Builder setStPokerProcessBaseInfo(PokerProcessInfo pokerProcessInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f89w;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{19232, 19233, 19234, 19235, 19236, 19237, 19238, 19239, 19240, 19241, 19242, 19243, 19244, 19245, 19246, 19247, 19248, 19249, 19250, 19251, 19252, 19253, 19254, 19255, 19256, 19257, 19258, 19259, 19260});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSaveFavoriteUrlRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSaveFavoriteUrlRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSaveFavoriteUrlRsp sCSaveFavoriteUrlRsp);

        private native SCSaveFavoriteUrlRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSaveFavoriteUrlRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSaveFavoriteUrlRsp sCSaveFavoriteUrlRsp);

        private native SCSaveFavoriteUrlRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5558getDefaultInstanceForType();

        public final native SCSaveFavoriteUrlRsp m5559getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCSaveFavoriteUrlRsp> getParserForType();

        public final native int getSerializedSize();

        public final native PokerProcessInfo getStPokerProcessBaseInfo();

        public final native PokerProcessInfoOrBuilder getStPokerProcessBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStPokerProcessBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5560newBuilderForType();

        public final native Builder m5561newBuilderForType();

        protected final native Builder m5562newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5563toBuilder();

        public final native Builder m5564toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSaveFavoriteUrlRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f89w;
        }

        static void __clinit__() {
            PARSER = new C01551();
            SCSaveFavoriteUrlRsp sCSaveFavoriteUrlRsp = new SCSaveFavoriteUrlRsp(true);
            defaultInstance = sCSaveFavoriteUrlRsp;
            sCSaveFavoriteUrlRsp.initFields();
        }

        public static SCSaveFavoriteUrlRsp parseFrom(ByteString byteString) {
            return (SCSaveFavoriteUrlRsp) PARSER.parseFrom(byteString);
        }

        public static SCSaveFavoriteUrlRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteUrlRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSaveFavoriteUrlRsp parseFrom(byte[] bArr) {
            return (SCSaveFavoriteUrlRsp) PARSER.parseFrom(bArr);
        }

        public static SCSaveFavoriteUrlRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteUrlRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSaveFavoriteUrlRsp parseFrom(InputStream inputStream) {
            return (SCSaveFavoriteUrlRsp) PARSER.parseFrom(inputStream);
        }

        public static SCSaveFavoriteUrlRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteUrlRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSaveFavoriteUrlRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSaveFavoriteUrlRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSaveFavoriteUrlRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteUrlRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSaveFavoriteUrlRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSaveFavoriteUrlRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSaveFavoriteUrlRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteUrlRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSaveFavoriteUrlRsp sCSaveFavoriteUrlRsp) {
            return newBuilder().mergeFrom(sCSaveFavoriteUrlRsp);
        }
    }

    public interface SCSaveFavoriteV2RspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

        FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStFavoritePokerHistoryInfo();
    }

    public static final class SCSaveFavoriteV2Rsp extends GeneratedMessage implements SCSaveFavoriteV2RspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCSaveFavoriteV2Rsp> PARSER = null;
        public static final int STFAVORITEPOKERHISTORYINFO_FIELD_NUMBER = 2;
        private static final SCSaveFavoriteV2Rsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private FavoritePokerHistoryInfo stFavoritePokerHistoryInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCSaveFavoriteV2Rsp.1 */
        class C01561 extends AbstractParser<SCSaveFavoriteV2Rsp> {
            static {
                fixHelper.fixfunc(new int[]{13089, 13090});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01561();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCSaveFavoriteV2RspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<FavoritePokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder, FavoritePokerHistoryInfoOrBuilder> stFavoritePokerHistoryInfoBuilder_;
            private FavoritePokerHistoryInfo stFavoritePokerHistoryInfo_;

            static {
                fixHelper.fixfunc(new int[]{26518, 26519, 26520, 26521, 26522, 26523, 26524, 26525, 26526, 26527, 26528, 26529, 26530, 26531, 26532, 26533, 26534, 26535, 26536, 26537, 26538, 26539, 26540, 26541, 26542, 26543, 26544, 26545, 26546, 26547, 26548, 26549, 26550, 26551, 26552, 26553, 26554, 26555, 26556, 26557, 26558, 26559, 26560, 26561, 26562});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<FavoritePokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder, FavoritePokerHistoryInfoOrBuilder> getStFavoritePokerHistoryInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5589build();

            public final native SCSaveFavoriteV2Rsp m5590build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5591buildPartial();

            public final native SCSaveFavoriteV2Rsp m5592buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5593clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5594clear();

            public final native Builder m5595clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStFavoritePokerHistoryInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5596clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5597clone();

            public final native Builder m5598clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5599getDefaultInstanceForType();

            public final native SCSaveFavoriteV2Rsp m5600getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder getStFavoritePokerHistoryInfoBuilder();

            public final native FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStFavoritePokerHistoryInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5601mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5602mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5603mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5604mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5605mergeFrom(Message message);

            public final native Builder mergeFrom(SCSaveFavoriteV2Rsp sCSaveFavoriteV2Rsp);

            public final native Builder mergeStFavoritePokerHistoryInfo(FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStFavoritePokerHistoryInfo(com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder builder);

            public final native Builder setStFavoritePokerHistoryInfo(FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f53M;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{9691, 9692, 9693, 9694, 9695, 9696, 9697, 9698, 9699, 9700, 9701, 9702, 9703, 9704, 9705, 9706, 9707, 9708, 9709, 9710, 9711, 9712, 9713, 9714, 9715, 9716, 9717, 9718, 9719});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCSaveFavoriteV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCSaveFavoriteV2Rsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCSaveFavoriteV2Rsp sCSaveFavoriteV2Rsp);

        private native SCSaveFavoriteV2Rsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCSaveFavoriteV2Rsp(com.google.protobuf.GeneratedMessage.Builder builder, SCSaveFavoriteV2Rsp sCSaveFavoriteV2Rsp);

        private native SCSaveFavoriteV2Rsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5582getDefaultInstanceForType();

        public final native SCSaveFavoriteV2Rsp m5583getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCSaveFavoriteV2Rsp> getParserForType();

        public final native int getSerializedSize();

        public final native FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

        public final native FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStFavoritePokerHistoryInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5584newBuilderForType();

        public final native Builder m5585newBuilderForType();

        protected final native Builder m5586newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5587toBuilder();

        public final native Builder m5588toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCSaveFavoriteV2Rsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f53M;
        }

        static void __clinit__() {
            PARSER = new C01561();
            SCSaveFavoriteV2Rsp sCSaveFavoriteV2Rsp = new SCSaveFavoriteV2Rsp(true);
            defaultInstance = sCSaveFavoriteV2Rsp;
            sCSaveFavoriteV2Rsp.initFields();
        }

        public static SCSaveFavoriteV2Rsp parseFrom(ByteString byteString) {
            return (SCSaveFavoriteV2Rsp) PARSER.parseFrom(byteString);
        }

        public static SCSaveFavoriteV2Rsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteV2Rsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCSaveFavoriteV2Rsp parseFrom(byte[] bArr) {
            return (SCSaveFavoriteV2Rsp) PARSER.parseFrom(bArr);
        }

        public static SCSaveFavoriteV2Rsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteV2Rsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCSaveFavoriteV2Rsp parseFrom(InputStream inputStream) {
            return (SCSaveFavoriteV2Rsp) PARSER.parseFrom(inputStream);
        }

        public static SCSaveFavoriteV2Rsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteV2Rsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCSaveFavoriteV2Rsp parseDelimitedFrom(InputStream inputStream) {
            return (SCSaveFavoriteV2Rsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCSaveFavoriteV2Rsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteV2Rsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCSaveFavoriteV2Rsp parseFrom(CodedInputStream codedInputStream) {
            return (SCSaveFavoriteV2Rsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCSaveFavoriteV2Rsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCSaveFavoriteV2Rsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCSaveFavoriteV2Rsp sCSaveFavoriteV2Rsp) {
            return newBuilder().mergeFrom(sCSaveFavoriteV2Rsp);
        }
    }

    public interface SCShareFavoriteRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

        FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasStFavoritePokerHistoryInfo();
    }

    public static final class SCShareFavoriteRsp extends GeneratedMessage implements SCShareFavoriteRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCShareFavoriteRsp> PARSER = null;
        public static final int STFAVORITEPOKERHISTORYINFO_FIELD_NUMBER = 2;
        private static final SCShareFavoriteRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private FavoritePokerHistoryInfo stFavoritePokerHistoryInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCShareFavoriteRsp.1 */
        class C01571 extends AbstractParser<SCShareFavoriteRsp> {
            static {
                fixHelper.fixfunc(new int[]{7366, 7367});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01571();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCShareFavoriteRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private SingleFieldBuilder<FavoritePokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder, FavoritePokerHistoryInfoOrBuilder> stFavoritePokerHistoryInfoBuilder_;
            private FavoritePokerHistoryInfo stFavoritePokerHistoryInfo_;

            static {
                fixHelper.fixfunc(new int[]{17540, 17541, 17542, 17543, 17544, 17545, 17546, 17547, 17548, 17549, 17550, 17551, 17552, 17553, 17554, 17555, 17556, 17557, 17558, 17559, 17560, 17561, 17562, 17563, 17564, 17565, 17566, 17567, 17568, 17569, 17570, 17571, 17572, 17573, 17574, 17575, 17576, 17577, 17578, 17579, 17580, 17581, 17582, 17583, 17584});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<FavoritePokerHistoryInfo, com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder, FavoritePokerHistoryInfoOrBuilder> getStFavoritePokerHistoryInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5613build();

            public final native SCShareFavoriteRsp m5614build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5615buildPartial();

            public final native SCShareFavoriteRsp m5616buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5617clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5618clear();

            public final native Builder m5619clear();

            public final native Builder clearEErrCode();

            public final native Builder clearStFavoritePokerHistoryInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5620clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5621clone();

            public final native Builder m5622clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5623getDefaultInstanceForType();

            public final native SCShareFavoriteRsp m5624getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

            public final native com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder getStFavoritePokerHistoryInfoBuilder();

            public final native FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasStFavoritePokerHistoryInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5625mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5626mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5627mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5628mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5629mergeFrom(Message message);

            public final native Builder mergeFrom(SCShareFavoriteRsp sCShareFavoriteRsp);

            public final native Builder mergeStFavoritePokerHistoryInfo(FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setStFavoritePokerHistoryInfo(com.texaspoker.moment.TexasPokerCommon.FavoritePokerHistoryInfo.Builder builder);

            public final native Builder setStFavoritePokerHistoryInfo(FavoritePokerHistoryInfo favoritePokerHistoryInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f57Q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{30815, 30816, 30817, 30818, 30819, 30820, 30821, 30822, 30823, 30824, 30825, 30826, 30827, 30828, 30829, 30830, 30831, 30832, 30833, 30834, 30835, 30836, 30837, 30838, 30839, 30840, 30841, 30842, 30843});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCShareFavoriteRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCShareFavoriteRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCShareFavoriteRsp sCShareFavoriteRsp);

        private native SCShareFavoriteRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCShareFavoriteRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCShareFavoriteRsp sCShareFavoriteRsp);

        private native SCShareFavoriteRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5606getDefaultInstanceForType();

        public final native SCShareFavoriteRsp m5607getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCShareFavoriteRsp> getParserForType();

        public final native int getSerializedSize();

        public final native FavoritePokerHistoryInfo getStFavoritePokerHistoryInfo();

        public final native FavoritePokerHistoryInfoOrBuilder getStFavoritePokerHistoryInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasStFavoritePokerHistoryInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5608newBuilderForType();

        public final native Builder m5609newBuilderForType();

        protected final native Builder m5610newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5611toBuilder();

        public final native Builder m5612toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCShareFavoriteRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f57Q;
        }

        static void __clinit__() {
            PARSER = new C01571();
            SCShareFavoriteRsp sCShareFavoriteRsp = new SCShareFavoriteRsp(true);
            defaultInstance = sCShareFavoriteRsp;
            sCShareFavoriteRsp.initFields();
        }

        public static SCShareFavoriteRsp parseFrom(ByteString byteString) {
            return (SCShareFavoriteRsp) PARSER.parseFrom(byteString);
        }

        public static SCShareFavoriteRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCShareFavoriteRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCShareFavoriteRsp parseFrom(byte[] bArr) {
            return (SCShareFavoriteRsp) PARSER.parseFrom(bArr);
        }

        public static SCShareFavoriteRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCShareFavoriteRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCShareFavoriteRsp parseFrom(InputStream inputStream) {
            return (SCShareFavoriteRsp) PARSER.parseFrom(inputStream);
        }

        public static SCShareFavoriteRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCShareFavoriteRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCShareFavoriteRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCShareFavoriteRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCShareFavoriteRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCShareFavoriteRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCShareFavoriteRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCShareFavoriteRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCShareFavoriteRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCShareFavoriteRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCShareFavoriteRsp sCShareFavoriteRsp) {
            return newBuilder().mergeFrom(sCShareFavoriteRsp);
        }
    }

    public interface SCUpdateRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrCode();

        String getSHint();

        ByteString getSHintBytes();

        AppUpdateInfo getStAppUpdateInfo();

        AppUpdateInfoOrBuilder getStAppUpdateInfoOrBuilder();

        LuaUpdateInfo getStLuaUpdateInfo();

        LuaUpdateInfoOrBuilder getStLuaUpdateInfoOrBuilder();

        boolean hasEErrCode();

        boolean hasSHint();

        boolean hasStAppUpdateInfo();

        boolean hasStLuaUpdateInfo();
    }

    public static final class SCUpdateRsp extends GeneratedMessage implements SCUpdateRspOrBuilder {
        public static final int EERRCODE_FIELD_NUMBER = 1;
        public static Parser<SCUpdateRsp> PARSER = null;
        public static final int SHINT_FIELD_NUMBER = 4;
        public static final int STAPPUPDATEINFO_FIELD_NUMBER = 2;
        public static final int STLUAUPDATEINFO_FIELD_NUMBER = 3;
        private static final SCUpdateRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sHint_;
        private AppUpdateInfo stAppUpdateInfo_;
        private LuaUpdateInfo stLuaUpdateInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SCUpdateRsp.1 */
        class C01581 extends AbstractParser<SCUpdateRsp> {
            static {
                fixHelper.fixfunc(new int[]{17585, 17586});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01581();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCUpdateRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrCode_;
            private Object sHint_;
            private SingleFieldBuilder<AppUpdateInfo, Builder, AppUpdateInfoOrBuilder> stAppUpdateInfoBuilder_;
            private AppUpdateInfo stAppUpdateInfo_;
            private SingleFieldBuilder<LuaUpdateInfo, Builder, LuaUpdateInfoOrBuilder> stLuaUpdateInfoBuilder_;
            private LuaUpdateInfo stLuaUpdateInfo_;

            static {
                fixHelper.fixfunc(new int[]{23320, 23321, 23322, 23323, 23324, 23325, 23326, 23327, 23328, 23329, 23330, 23331, 23332, 23333, 23334, 23335, 23336, 23337, 23338, 23339, 23340, 23341, 23342, 23343, 23344, 23345, 23346, 23347, 23348, 23349, 23350, 23351, 23352, 23353, 23354, 23355, 23356, 23357, 23358, 23359, 23360, 23361, 23362, 23363, 23364, 23365, 23366, 23367, 23368, 23369, 23370, 23371, 23372, 23373, 23374, 23375, 23376, 23377, 23378, 23379});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<AppUpdateInfo, Builder, AppUpdateInfoOrBuilder> getStAppUpdateInfoFieldBuilder();

            private native SingleFieldBuilder<LuaUpdateInfo, Builder, LuaUpdateInfoOrBuilder> getStLuaUpdateInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5637build();

            public final native SCUpdateRsp m5638build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5639buildPartial();

            public final native SCUpdateRsp m5640buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5641clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5642clear();

            public final native Builder m5643clear();

            public final native Builder clearEErrCode();

            public final native Builder clearSHint();

            public final native Builder clearStAppUpdateInfo();

            public final native Builder clearStLuaUpdateInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5644clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5645clone();

            public final native Builder m5646clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5647getDefaultInstanceForType();

            public final native SCUpdateRsp m5648getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrCode();

            public final native String getSHint();

            public final native ByteString getSHintBytes();

            public final native AppUpdateInfo getStAppUpdateInfo();

            public final native Builder getStAppUpdateInfoBuilder();

            public final native AppUpdateInfoOrBuilder getStAppUpdateInfoOrBuilder();

            public final native LuaUpdateInfo getStLuaUpdateInfo();

            public final native Builder getStLuaUpdateInfoBuilder();

            public final native LuaUpdateInfoOrBuilder getStLuaUpdateInfoOrBuilder();

            public final native boolean hasEErrCode();

            public final native boolean hasSHint();

            public final native boolean hasStAppUpdateInfo();

            public final native boolean hasStLuaUpdateInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5649mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5650mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5651mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5652mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5653mergeFrom(Message message);

            public final native Builder mergeFrom(SCUpdateRsp sCUpdateRsp);

            public final native Builder mergeStAppUpdateInfo(AppUpdateInfo appUpdateInfo);

            public final native Builder mergeStLuaUpdateInfo(LuaUpdateInfo luaUpdateInfo);

            public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setSHint(String str);

            public final native Builder setSHintBytes(ByteString byteString);

            public final native Builder setStAppUpdateInfo(Builder builder);

            public final native Builder setStAppUpdateInfo(AppUpdateInfo appUpdateInfo);

            public final native Builder setStLuaUpdateInfo(Builder builder);

            public final native Builder setStLuaUpdateInfo(LuaUpdateInfo luaUpdateInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.f73g;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16741, 16742, 16743, 16744, 16745, 16746, 16747, 16748, 16749, 16750, 16751, 16752, 16753, 16754, 16755, 16756, 16757, 16758, 16759, 16760, 16761, 16762, 16763, 16764, 16765, 16766, 16767, 16768, 16769, 16770, 16771, 16772, 16773, 16774, 16775});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCUpdateRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCUpdateRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCUpdateRsp sCUpdateRsp);

        private native SCUpdateRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCUpdateRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCUpdateRsp sCUpdateRsp);

        private native SCUpdateRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5630getDefaultInstanceForType();

        public final native SCUpdateRsp m5631getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native Parser<SCUpdateRsp> getParserForType();

        public final native String getSHint();

        public final native ByteString getSHintBytes();

        public final native int getSerializedSize();

        public final native AppUpdateInfo getStAppUpdateInfo();

        public final native AppUpdateInfoOrBuilder getStAppUpdateInfoOrBuilder();

        public final native LuaUpdateInfo getStLuaUpdateInfo();

        public final native LuaUpdateInfoOrBuilder getStLuaUpdateInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrCode();

        public final native boolean hasSHint();

        public final native boolean hasStAppUpdateInfo();

        public final native boolean hasStLuaUpdateInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5632newBuilderForType();

        public final native Builder m5633newBuilderForType();

        protected final native Builder m5634newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5635toBuilder();

        public final native Builder m5636toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCUpdateRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.f73g;
        }

        static void __clinit__() {
            PARSER = new C01581();
            SCUpdateRsp sCUpdateRsp = new SCUpdateRsp(true);
            defaultInstance = sCUpdateRsp;
            sCUpdateRsp.initFields();
        }

        public static SCUpdateRsp parseFrom(ByteString byteString) {
            return (SCUpdateRsp) PARSER.parseFrom(byteString);
        }

        public static SCUpdateRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUpdateRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCUpdateRsp parseFrom(byte[] bArr) {
            return (SCUpdateRsp) PARSER.parseFrom(bArr);
        }

        public static SCUpdateRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUpdateRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCUpdateRsp parseFrom(InputStream inputStream) {
            return (SCUpdateRsp) PARSER.parseFrom(inputStream);
        }

        public static SCUpdateRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUpdateRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCUpdateRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCUpdateRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCUpdateRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUpdateRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCUpdateRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCUpdateRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCUpdateRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCUpdateRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCUpdateRsp sCUpdateRsp) {
            return newBuilder().mergeFrom(sCUpdateRsp);
        }
    }

    public enum SYSTEM_MESSAGE_CONTENT_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int SYSTEM_MESSAGE_CONTENT_NATIVE_VALUE = 2;
        public static final int SYSTEM_MESSAGE_CONTENT_URL_VALUE = 1;
        private static final SYSTEM_MESSAGE_CONTENT_TYPE[] VALUES = null;
        private static EnumLiteMap<SYSTEM_MESSAGE_CONTENT_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SYSTEM_MESSAGE_CONTENT_TYPE.1 */
        class C01591 implements EnumLiteMap<SYSTEM_MESSAGE_CONTENT_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{34089, 34090});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01591();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{24915, 24916, 24917, 24918});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SYSTEM_MESSAGE_CONTENT_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            SYSTEM_MESSAGE_CONTENT_URL = new SYSTEM_MESSAGE_CONTENT_TYPE("SYSTEM_MESSAGE_CONTENT_URL", 0, 0, SYSTEM_MESSAGE_CONTENT_URL_VALUE);
            SYSTEM_MESSAGE_CONTENT_NATIVE = new SYSTEM_MESSAGE_CONTENT_TYPE("SYSTEM_MESSAGE_CONTENT_NATIVE", SYSTEM_MESSAGE_CONTENT_URL_VALUE, SYSTEM_MESSAGE_CONTENT_URL_VALUE, SYSTEM_MESSAGE_CONTENT_NATIVE_VALUE);
            SYSTEM_MESSAGE_CONTENT_TYPE[] system_message_content_typeArr = new SYSTEM_MESSAGE_CONTENT_TYPE[SYSTEM_MESSAGE_CONTENT_NATIVE_VALUE];
            system_message_content_typeArr[0] = SYSTEM_MESSAGE_CONTENT_URL;
            system_message_content_typeArr[SYSTEM_MESSAGE_CONTENT_URL_VALUE] = SYSTEM_MESSAGE_CONTENT_NATIVE;
            ENUM$VALUES = system_message_content_typeArr;
            internalValueMap = new C01591();
            VALUES = values();
        }

        public static SYSTEM_MESSAGE_CONTENT_TYPE valueOf(int i) {
            switch (i) {
                case SYSTEM_MESSAGE_CONTENT_URL_VALUE:
                    return SYSTEM_MESSAGE_CONTENT_URL;
                case SYSTEM_MESSAGE_CONTENT_NATIVE_VALUE:
                    return SYSTEM_MESSAGE_CONTENT_NATIVE;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<SYSTEM_MESSAGE_CONTENT_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttp.m69a().getEnumTypes().get(4);
        }

        public static SYSTEM_MESSAGE_CONTENT_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface SystemMsgBaseInfoOrBuilder extends MessageOrBuilder {
        SYSTEM_MESSAGE_CONTENT_TYPE getESystemMessageContentType();

        NEW_SYSTEM_MESSAGE_TYPE getESystemMessageType();

        long getLSystemMsgID();

        long getLSystemSendTime();

        String getSSystemMsgImgUrl();

        ByteString getSSystemMsgImgUrlBytes();

        String getSSystemMsgSummary();

        ByteString getSSystemMsgSummaryBytes();

        String getSSystemMsgTitle();

        ByteString getSSystemMsgTitleBytes();

        String getSSystemMsgUrl();

        ByteString getSSystemMsgUrlBytes();

        boolean hasESystemMessageContentType();

        boolean hasESystemMessageType();

        boolean hasLSystemMsgID();

        boolean hasLSystemSendTime();

        boolean hasSSystemMsgImgUrl();

        boolean hasSSystemMsgSummary();

        boolean hasSSystemMsgTitle();

        boolean hasSSystemMsgUrl();
    }

    public static final class SystemMsgBaseInfo extends GeneratedMessage implements SystemMsgBaseInfoOrBuilder {
        public static final int ESYSTEMMESSAGECONTENTTYPE_FIELD_NUMBER = 5;
        public static final int ESYSTEMMESSAGETYPE_FIELD_NUMBER = 2;
        public static final int LSYSTEMMSGID_FIELD_NUMBER = 1;
        public static final int LSYSTEMSENDTIME_FIELD_NUMBER = 8;
        public static Parser<SystemMsgBaseInfo> PARSER = null;
        public static final int SSYSTEMMSGIMGURL_FIELD_NUMBER = 7;
        public static final int SSYSTEMMSGSUMMARY_FIELD_NUMBER = 4;
        public static final int SSYSTEMMSGTITLE_FIELD_NUMBER = 3;
        public static final int SSYSTEMMSGURL_FIELD_NUMBER = 6;
        private static final SystemMsgBaseInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private SYSTEM_MESSAGE_CONTENT_TYPE eSystemMessageContentType_;
        private NEW_SYSTEM_MESSAGE_TYPE eSystemMessageType_;
        private long lSystemMsgID_;
        private long lSystemSendTime_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sSystemMsgImgUrl_;
        private Object sSystemMsgSummary_;
        private Object sSystemMsgTitle_;
        private Object sSystemMsgUrl_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SystemMsgBaseInfo.1 */
        class C01601 extends AbstractParser<SystemMsgBaseInfo> {
            static {
                fixHelper.fixfunc(new int[]{8160, 8161});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01601();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SystemMsgBaseInfoOrBuilder {
            private int bitField0_;
            private SYSTEM_MESSAGE_CONTENT_TYPE eSystemMessageContentType_;
            private NEW_SYSTEM_MESSAGE_TYPE eSystemMessageType_;
            private long lSystemMsgID_;
            private long lSystemSendTime_;
            private Object sSystemMsgImgUrl_;
            private Object sSystemMsgSummary_;
            private Object sSystemMsgTitle_;
            private Object sSystemMsgUrl_;

            static {
                fixHelper.fixfunc(new int[]{27953, 27954, 27955, 27956, 27957, 27958, 27959, 27960, 27961, 27962, 27963, 27964, 27965, 27966, 27967, 27968, 27969, 27970, 27971, 27972, 27973, 27974, 27975, 27976, 27977, 27978, 27979, 27980, 27981, 27982, 27983, 27984, 27985, 27986, 27987, 27988, 27989, 27990, 27991, 27992, 27993, 27994, 27995, 27996, 27997, 27998, 27999, 28000, 28001, 28002, 28003, 28004, 28005, 28006, 28007, 28008, 28009, 28010, 28011, 28012, 28013, 28014, 28015, 28016, 28017, 28018, 28019, 28020, 28021, 28022, 28023, 28024});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5661build();

            public final native SystemMsgBaseInfo m5662build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5663buildPartial();

            public final native SystemMsgBaseInfo m5664buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5665clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5666clear();

            public final native Builder m5667clear();

            public final native Builder clearESystemMessageContentType();

            public final native Builder clearESystemMessageType();

            public final native Builder clearLSystemMsgID();

            public final native Builder clearLSystemSendTime();

            public final native Builder clearSSystemMsgImgUrl();

            public final native Builder clearSSystemMsgSummary();

            public final native Builder clearSSystemMsgTitle();

            public final native Builder clearSSystemMsgUrl();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5668clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5669clone();

            public final native Builder m5670clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5671getDefaultInstanceForType();

            public final native SystemMsgBaseInfo m5672getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native SYSTEM_MESSAGE_CONTENT_TYPE getESystemMessageContentType();

            public final native NEW_SYSTEM_MESSAGE_TYPE getESystemMessageType();

            public final native long getLSystemMsgID();

            public final native long getLSystemSendTime();

            public final native String getSSystemMsgImgUrl();

            public final native ByteString getSSystemMsgImgUrlBytes();

            public final native String getSSystemMsgSummary();

            public final native ByteString getSSystemMsgSummaryBytes();

            public final native String getSSystemMsgTitle();

            public final native ByteString getSSystemMsgTitleBytes();

            public final native String getSSystemMsgUrl();

            public final native ByteString getSSystemMsgUrlBytes();

            public final native boolean hasESystemMessageContentType();

            public final native boolean hasESystemMessageType();

            public final native boolean hasLSystemMsgID();

            public final native boolean hasLSystemSendTime();

            public final native boolean hasSSystemMsgImgUrl();

            public final native boolean hasSSystemMsgSummary();

            public final native boolean hasSSystemMsgTitle();

            public final native boolean hasSSystemMsgUrl();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5673mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5674mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5675mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5676mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5677mergeFrom(Message message);

            public final native Builder mergeFrom(SystemMsgBaseInfo systemMsgBaseInfo);

            public final native Builder setESystemMessageContentType(SYSTEM_MESSAGE_CONTENT_TYPE system_message_content_type);

            public final native Builder setESystemMessageType(NEW_SYSTEM_MESSAGE_TYPE new_system_message_type);

            public final native Builder setLSystemMsgID(long j);

            public final native Builder setLSystemSendTime(long j);

            public final native Builder setSSystemMsgImgUrl(String str);

            public final native Builder setSSystemMsgImgUrlBytes(ByteString byteString);

            public final native Builder setSSystemMsgSummary(String str);

            public final native Builder setSSystemMsgSummaryBytes(ByteString byteString);

            public final native Builder setSSystemMsgTitle(String str);

            public final native Builder setSSystemMsgTitleBytes(ByteString byteString);

            public final native Builder setSSystemMsgUrl(String str);

            public final native Builder setSSystemMsgUrlBytes(ByteString byteString);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.am;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{33563, 33564, 33565, 33566, 33567, 33568, 33569, 33570, 33571, 33572, 33573, 33574, 33575, 33576, 33577, 33578, 33579, 33580, 33581, 33582, 33583, 33584, 33585, 33586, 33587, 33588, 33589, 33590, 33591, 33592, 33593, 33594, 33595, 33596, 33597, 33598, 33599, 33600, 33601, 33602, 33603, 33604, 33605, 33606});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SystemMsgBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SystemMsgBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SystemMsgBaseInfo systemMsgBaseInfo);

        private native SystemMsgBaseInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SystemMsgBaseInfo(com.google.protobuf.GeneratedMessage.Builder builder, SystemMsgBaseInfo systemMsgBaseInfo);

        private native SystemMsgBaseInfo(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5654getDefaultInstanceForType();

        public final native SystemMsgBaseInfo m5655getDefaultInstanceForType();

        public final native SYSTEM_MESSAGE_CONTENT_TYPE getESystemMessageContentType();

        public final native NEW_SYSTEM_MESSAGE_TYPE getESystemMessageType();

        public final native long getLSystemMsgID();

        public final native long getLSystemSendTime();

        public final native Parser<SystemMsgBaseInfo> getParserForType();

        public final native String getSSystemMsgImgUrl();

        public final native ByteString getSSystemMsgImgUrlBytes();

        public final native String getSSystemMsgSummary();

        public final native ByteString getSSystemMsgSummaryBytes();

        public final native String getSSystemMsgTitle();

        public final native ByteString getSSystemMsgTitleBytes();

        public final native String getSSystemMsgUrl();

        public final native ByteString getSSystemMsgUrlBytes();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasESystemMessageContentType();

        public final native boolean hasESystemMessageType();

        public final native boolean hasLSystemMsgID();

        public final native boolean hasLSystemSendTime();

        public final native boolean hasSSystemMsgImgUrl();

        public final native boolean hasSSystemMsgSummary();

        public final native boolean hasSSystemMsgTitle();

        public final native boolean hasSSystemMsgUrl();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5656newBuilderForType();

        public final native Builder m5657newBuilderForType();

        protected final native Builder m5658newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5659toBuilder();

        public final native Builder m5660toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SystemMsgBaseInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.am;
        }

        static void __clinit__() {
            PARSER = new C01601();
            SystemMsgBaseInfo systemMsgBaseInfo = new SystemMsgBaseInfo(true);
            defaultInstance = systemMsgBaseInfo;
            systemMsgBaseInfo.initFields();
        }

        public static SystemMsgBaseInfo parseFrom(ByteString byteString) {
            return (SystemMsgBaseInfo) PARSER.parseFrom(byteString);
        }

        public static SystemMsgBaseInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SystemMsgBaseInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SystemMsgBaseInfo parseFrom(byte[] bArr) {
            return (SystemMsgBaseInfo) PARSER.parseFrom(bArr);
        }

        public static SystemMsgBaseInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SystemMsgBaseInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SystemMsgBaseInfo parseFrom(InputStream inputStream) {
            return (SystemMsgBaseInfo) PARSER.parseFrom(inputStream);
        }

        public static SystemMsgBaseInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SystemMsgBaseInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SystemMsgBaseInfo parseDelimitedFrom(InputStream inputStream) {
            return (SystemMsgBaseInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SystemMsgBaseInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SystemMsgBaseInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SystemMsgBaseInfo parseFrom(CodedInputStream codedInputStream) {
            return (SystemMsgBaseInfo) PARSER.parseFrom(codedInputStream);
        }

        public static SystemMsgBaseInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SystemMsgBaseInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SystemMsgBaseInfo systemMsgBaseInfo) {
            return newBuilder().mergeFrom(systemMsgBaseInfo);
        }
    }

    public interface SystemMsgInfoOrBuilder extends MessageOrBuilder {
        int getBGet();

        String getSSystemMsgDetail();

        ByteString getSSystemMsgDetailBytes();

        String getSSystemMsgDetailImgUrl();

        ByteString getSSystemMsgDetailImgUrlBytes();

        SystemMsgBaseInfo getStSystemMsgBaseInfo();

        SystemMsgBaseInfoOrBuilder getStSystemMsgBaseInfoOrBuilder();

        boolean hasBGet();

        boolean hasSSystemMsgDetail();

        boolean hasSSystemMsgDetailImgUrl();

        boolean hasStSystemMsgBaseInfo();
    }

    public static final class SystemMsgInfo extends GeneratedMessage implements SystemMsgInfoOrBuilder {
        public static final int BGET_FIELD_NUMBER = 4;
        public static Parser<SystemMsgInfo> PARSER = null;
        public static final int SSYSTEMMSGDETAILIMGURL_FIELD_NUMBER = 3;
        public static final int SSYSTEMMSGDETAIL_FIELD_NUMBER = 2;
        public static final int STSYSTEMMSGBASEINFO_FIELD_NUMBER = 1;
        private static final SystemMsgInfo defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bGet_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object sSystemMsgDetailImgUrl_;
        private Object sSystemMsgDetail_;
        private SystemMsgBaseInfo stSystemMsgBaseInfo_;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.SystemMsgInfo.1 */
        class C01611 extends AbstractParser<SystemMsgInfo> {
            static {
                fixHelper.fixfunc(new int[]{22883, 22884});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01611();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SystemMsgInfoOrBuilder {
            private int bGet_;
            private int bitField0_;
            private Object sSystemMsgDetailImgUrl_;
            private Object sSystemMsgDetail_;
            private SingleFieldBuilder<SystemMsgBaseInfo, Builder, SystemMsgBaseInfoOrBuilder> stSystemMsgBaseInfoBuilder_;
            private SystemMsgBaseInfo stSystemMsgBaseInfo_;

            static {
                fixHelper.fixfunc(new int[]{18089, 18090, 18091, 18092, 18093, 18094, 18095, 18096, 18097, 18098, 18099, 18100, 18101, 18102, 18103, 18104, 18105, 18106, 18107, 18108, 18109, 18110, 18111, 18112, 18113, 18114, 18115, 18116, 18117, 18118, 18119, 18120, 18121, 18122, 18123, 18124, 18125, 18126, 18127, 18128, 18129, 18130, 18131, 18132, 18133, 18134, 18135, 18136, 18137, 18138, 18139, 18140, 18141, 18142, 18143, 18144, 18145});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native SingleFieldBuilder<SystemMsgBaseInfo, Builder, SystemMsgBaseInfoOrBuilder> getStSystemMsgBaseInfoFieldBuilder();

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m5685build();

            public final native SystemMsgInfo m5686build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m5687buildPartial();

            public final native SystemMsgInfo m5688buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5689clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5690clear();

            public final native Builder m5691clear();

            public final native Builder clearBGet();

            public final native Builder clearSSystemMsgDetail();

            public final native Builder clearSSystemMsgDetailImgUrl();

            public final native Builder clearStSystemMsgBaseInfo();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5692clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5693clone();

            public final native Builder m5694clone();

            public final native int getBGet();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m5695getDefaultInstanceForType();

            public final native SystemMsgInfo m5696getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native String getSSystemMsgDetail();

            public final native ByteString getSSystemMsgDetailBytes();

            public final native String getSSystemMsgDetailImgUrl();

            public final native ByteString getSSystemMsgDetailImgUrlBytes();

            public final native SystemMsgBaseInfo getStSystemMsgBaseInfo();

            public final native Builder getStSystemMsgBaseInfoBuilder();

            public final native SystemMsgBaseInfoOrBuilder getStSystemMsgBaseInfoOrBuilder();

            public final native boolean hasBGet();

            public final native boolean hasSSystemMsgDetail();

            public final native boolean hasSSystemMsgDetailImgUrl();

            public final native boolean hasStSystemMsgBaseInfo();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5697mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m5698mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5699mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5700mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m5701mergeFrom(Message message);

            public final native Builder mergeFrom(SystemMsgInfo systemMsgInfo);

            public final native Builder mergeStSystemMsgBaseInfo(SystemMsgBaseInfo systemMsgBaseInfo);

            public final native Builder setBGet(int i);

            public final native Builder setSSystemMsgDetail(String str);

            public final native Builder setSSystemMsgDetailBytes(ByteString byteString);

            public final native Builder setSSystemMsgDetailImgUrl(String str);

            public final native Builder setSSystemMsgDetailImgUrlBytes(ByteString byteString);

            public final native Builder setStSystemMsgBaseInfo(Builder builder);

            public final native Builder setStSystemMsgBaseInfo(SystemMsgBaseInfo systemMsgBaseInfo);

            public static final Descriptor getDescriptor() {
                return TexasPokerHttp.ao;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{32220, 32221, 32222, 32223, 32224, 32225, 32226, 32227, 32228, 32229, 32230, 32231, 32232, 32233, 32234, 32235, 32236, 32237, 32238, 32239, 32240, 32241, 32242, 32243, 32244, 32245, 32246, 32247, 32248, 32249, 32250, 32251, 32252, 32253, 32254});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SystemMsgInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SystemMsgInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SystemMsgInfo systemMsgInfo);

        private native SystemMsgInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SystemMsgInfo(com.google.protobuf.GeneratedMessage.Builder builder, SystemMsgInfo systemMsgInfo);

        private native SystemMsgInfo(boolean z);

        private native void initFields();

        public final native int getBGet();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m5678getDefaultInstanceForType();

        public final native SystemMsgInfo m5679getDefaultInstanceForType();

        public final native Parser<SystemMsgInfo> getParserForType();

        public final native String getSSystemMsgDetail();

        public final native ByteString getSSystemMsgDetailBytes();

        public final native String getSSystemMsgDetailImgUrl();

        public final native ByteString getSSystemMsgDetailImgUrlBytes();

        public final native int getSerializedSize();

        public final native SystemMsgBaseInfo getStSystemMsgBaseInfo();

        public final native SystemMsgBaseInfoOrBuilder getStSystemMsgBaseInfoOrBuilder();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasBGet();

        public final native boolean hasSSystemMsgDetail();

        public final native boolean hasSSystemMsgDetailImgUrl();

        public final native boolean hasStSystemMsgBaseInfo();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5680newBuilderForType();

        public final native Builder m5681newBuilderForType();

        protected final native Builder m5682newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m5683toBuilder();

        public final native Builder m5684toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SystemMsgInfo getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerHttp.ao;
        }

        static void __clinit__() {
            PARSER = new C01611();
            SystemMsgInfo systemMsgInfo = new SystemMsgInfo(true);
            defaultInstance = systemMsgInfo;
            systemMsgInfo.initFields();
        }

        public static SystemMsgInfo parseFrom(ByteString byteString) {
            return (SystemMsgInfo) PARSER.parseFrom(byteString);
        }

        public static SystemMsgInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SystemMsgInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SystemMsgInfo parseFrom(byte[] bArr) {
            return (SystemMsgInfo) PARSER.parseFrom(bArr);
        }

        public static SystemMsgInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SystemMsgInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SystemMsgInfo parseFrom(InputStream inputStream) {
            return (SystemMsgInfo) PARSER.parseFrom(inputStream);
        }

        public static SystemMsgInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SystemMsgInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SystemMsgInfo parseDelimitedFrom(InputStream inputStream) {
            return (SystemMsgInfo) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SystemMsgInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SystemMsgInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SystemMsgInfo parseFrom(CodedInputStream codedInputStream) {
            return (SystemMsgInfo) PARSER.parseFrom(codedInputStream);
        }

        public static SystemMsgInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SystemMsgInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SystemMsgInfo systemMsgInfo) {
            return newBuilder().mergeFrom(systemMsgInfo);
        }
    }

    public enum UPDATE_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int UPDATE_FORCE_VALUE = 1;
        public static final int UPDATE_MAINTENANCE_VALUE = 4;
        public static final int UPDATE_NO_FORCE_VALUE = 2;
        public static final int UPDATE_NO_VALUE = 0;
        private static final UPDATE_TYPE[] VALUES = null;
        private static EnumLiteMap<UPDATE_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerHttp.UPDATE_TYPE.1 */
        class C01621 implements EnumLiteMap<UPDATE_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{31365, 31366});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C01621();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{23254, 23255, 23256, 23257});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native UPDATE_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            UPDATE_NO = new UPDATE_TYPE("UPDATE_NO", 0, 0, 0);
            UPDATE_FORCE = new UPDATE_TYPE("UPDATE_FORCE", UPDATE_FORCE_VALUE, UPDATE_FORCE_VALUE, UPDATE_FORCE_VALUE);
            UPDATE_NO_FORCE = new UPDATE_TYPE("UPDATE_NO_FORCE", UPDATE_NO_FORCE_VALUE, UPDATE_NO_FORCE_VALUE, UPDATE_NO_FORCE_VALUE);
            UPDATE_MAINTENANCE = new UPDATE_TYPE("UPDATE_MAINTENANCE", 3, 3, UPDATE_MAINTENANCE_VALUE);
            UPDATE_TYPE[] update_typeArr = new UPDATE_TYPE[UPDATE_MAINTENANCE_VALUE];
            update_typeArr[0] = UPDATE_NO;
            update_typeArr[UPDATE_FORCE_VALUE] = UPDATE_FORCE;
            update_typeArr[UPDATE_NO_FORCE_VALUE] = UPDATE_NO_FORCE;
            update_typeArr[3] = UPDATE_MAINTENANCE;
            ENUM$VALUES = update_typeArr;
            internalValueMap = new C01621();
            VALUES = values();
        }

        public static UPDATE_TYPE valueOf(int i) {
            switch (i) {
                case LocationAwareLogger.TRACE_INT /*0*/:
                    return UPDATE_NO;
                case UPDATE_FORCE_VALUE:
                    return UPDATE_FORCE;
                case UPDATE_NO_FORCE_VALUE:
                    return UPDATE_NO_FORCE;
                case UPDATE_MAINTENANCE_VALUE:
                    return UPDATE_MAINTENANCE;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<UPDATE_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerHttp.m69a().getEnumTypes().get(0);
        }

        public static UPDATE_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static FileDescriptor m69a() {
        return aM;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TexasPokerCommon.m11a()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014TexasPokerHttp.proto\u0012\ntexaspoker\u001a\u0016TexasPokerCommon.proto\"^\n\rAppUpdateInfo\u0012,\n\u000beUpdateType\u0018\u0001 \u0002(\u000e2\u0017.texaspoker.UPDATE_TYPE\u0012\u000e\n\u0006strURL\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007strDesc\u0018\u0003 \u0001(\t\"a\n\rLuaUpdateInfo\u0012,\n\u000beUpdateType\u0018\u0001 \u0002(\u000e2\u0017.texaspoker.UPDATE_TYPE\u0012\u0011\n\tstrConfig\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007strDesc\u0018\u0003 \u0001(\t\"\u009c\u0002\n\bCSUpdate\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0014\n\fiMobleSystem\u0018\u0002 \u0002(\u0005\u0012\u0013\n\u000biSysVersion\u0018\u0003 \u0002(\u0005\u0012\u0018\n\u0010strMobileVersion\u0018\u0004 \u0001(\t\u0012\u0017\n\u000fstrMobileScreen\u0018\u0005 \u0001(\t\u0012\r\n\u0005iAuto\u0018\u0006 \u0002(\u0005\u0012\u0013\n\u000biLuaVer", "sion\u0018\u0007 \u0001(\u0005\u0012\u000e\n\u0006sExtra\u0018\b \u0001(\t\u00120\n\reLanguageType\u0018\t \u0001(\u000e2\u0019.texaspoker.LANGUAGE_TYPE\u0012,\n\u000beDeviceType\u0018\n \u0001(\u000e2\u0017.texaspoker.DEVICE_TYPE\u0012\u0010\n\biChannel\u0018\u000b \u0001(\u0005\"\u00b3\u0001\n\u000bSCUpdateRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00122\n\u000fstAppUpdateInfo\u0018\u0002 \u0001(\u000b2\u0019.texaspoker.AppUpdateInfo\u00122\n\u000fstLuaUpdateInfo\u0018\u0003 \u0001(\u000b2\u0019.texaspoker.LuaUpdateInfo\u0012\r\n\u0005sHint\u0018\u0004 \u0001(\t\"l\n\nCSFeedback\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000blFeedbackID\u0018\u0002 \u0002(\u0003\u0012\u0014\n\fiMobleSystem\u0018\u0003 \u0002(\u0005\u0012\u0013\n\u000biSy", "sVersion\u0018\u0004 \u0002(\u0005\u0012\u0010\n\bsContent\u0018\u0005 \u0002(\t\"S\n\rSCFeedbackRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0013\n\u000blFeedbackID\u0018\u0002 \u0001(\u0003\"?\n\u0010CSGetBannerInfos\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u000f\n\u0007iOffset\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004iNum\u0018\u0003 \u0002(\u0005\"\u0083\u0001\n\u0013SCGetBannerInfosRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012,\n\fvBannerInfos\u0018\u0002 \u0003(\u000b2\u0016.texaspoker.BannerInfo\u0012\u000f\n\u0007iOffset\u0018\u0006 \u0001(\u0005\"\u0088\u0002\n\u000eCSSaveFavorite\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rlSaveUserUuid\u0018\u0002 \u0002(\u0003\u0012\u0016\n\u000elShareUserUuid\u0018\u0003 \u0002(\u0003\u0012\u0011\n\t", "lBigBlind\u0018\u0004 \u0002(\u0003\u0012\u0013\n\u000blSmallBlind\u0018\u0005 \u0002(\u0003\u0012\u0012\n\nlWinStacks\u0018\u0006 \u0002(\u0003\u0012\u0013\n\u000bstrRoomName\u0018\u0007 \u0002(\t\u0012\u0012\n\nvHandCards\u0018\b \u0003(\u0005\u0012\u0013\n\u000bvVoiceDatas\u0018\t \u0001(\f\u0012\r\n\u0005iAnte\u0018\n \u0001(\u0005\u00120\n\reLanguageType\u0018\u000b \u0001(\u000e2\u0019.texaspoker.LANGUAGE_TYPE\"\u0080\u0001\n\u0011SCSaveFavoriteRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012<\n\u0016stPokerProcessBaseInfo\u0018\u0002 \u0001(\u000b2\u001c.texaspoker.PokerProcessInfo\"\u008f\u0002\n\u0011CSSaveFavoriteUrl\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rlSaveUserUuid\u0018\u0002 \u0002(\u0003\u0012\u0016\n\u000elShareUserUuid\u0018\u0003 \u0002(\u0003\u0012\u0011\n", "\tlBigBlind\u0018\u0004 \u0002(\u0003\u0012\u0013\n\u000blSmallBlind\u0018\u0005 \u0002(\u0003\u0012\u0012\n\nlWinStacks\u0018\u0006 \u0002(\u0003\u0012\u0013\n\u000bstrRoomName\u0018\u0007 \u0002(\t\u0012\u0012\n\nvHandCards\u0018\b \u0003(\u0005\u0012\u0017\n\u000flPokerProcessID\u0018\t \u0002(\u0003\u0012\r\n\u0005iAnte\u0018\n \u0001(\u0005\u00120\n\reLanguageType\u0018\u000b \u0001(\u000e2\u0019.texaspoker.LANGUAGE_TYPE\"\u0083\u0001\n\u0014SCSaveFavoriteUrlRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012<\n\u0016stPokerProcessBaseInfo\u0018\u0002 \u0001(\u000b2\u001c.texaspoker.PokerProcessInfo\"!\n\u0011CSGetFavoriteList\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"\u0082\u0001\n\u0014SCGetFavoriteListRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e", "2\u001b.texaspoker.ERROR_CODE_TYPE\u0012;\n\u0015vPokerProcessBaseInfo\u0018\u0002 \u0003(\u000b2\u001c.texaspoker.PokerProcessInfo\"8\n\u0010CSRemoveFavorite\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0016\n\u000epokerprocessid\u0018\u0002 \u0002(\u0003\"\\\n\u0013SCRemoveFavoriteRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0016\n\u000epokerprocessid\u0018\u0002 \u0001(\u0003\"[\n\u0012CSRemoveFavoriteV2\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rlSaveUserUuid\u0018\u0002 \u0002(\u0003\u0012\u000f\n\u0007lRoomID\u0018\u0003 \u0002(\u0003\u0012\u000f\n\u0007lHandID\u0018\u0004 \u0002(\u0003\"\u007f\n\u0015SCRemoveFavoriteV2Rsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CO", "DE_TYPE\u0012\u0015\n\rlSaveUserUuid\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007lRoomID\u0018\u0003 \u0001(\u0003\u0012\u000f\n\u0007lHandID\u0018\u0004 \u0001(\u0003\"\u00f3\u0001\n\u0010CSSaveFavoriteV2\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rlSaveUserUuid\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007lRoomID\u0018\u0003 \u0001(\u0003\u0012\u000f\n\u0007lHandID\u0018\u0004 \u0001(\u0003\u0012\u0014\n\fsFavoriteUrl\u0018\u0005 \u0001(\t\u00129\n\u0011eSaveFavoriteType\u0018\u0006 \u0001(\u000e2\u001e.texaspoker.SAVE_FAVORITE_TYPE\u0012\u0015\n\rsFavoriteName\u0018\u0007 \u0001(\t\u00120\n\reLanguageType\u0018\b \u0001(\u000e2\u0019.texaspoker.LANGUAGE_TYPE\"\u008e\u0001\n\u0013SCSaveFavoriteV2Rsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012H\n\u001astFavoritePoker", "HistoryInfo\u0018\u0002 \u0001(\u000b2$.texaspoker.FavoritePokerHistoryInfo\"\u00db\u0001\n\u000fCSShareFavorite\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rlSaveUserUuid\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007lRoomID\u0018\u0003 \u0001(\u0003\u0012\u000f\n\u0007lHandID\u0018\u0004 \u0001(\u0003\u0012\u0014\n\fsFavoriteUrl\u0018\u0005 \u0001(\t\u00129\n\u0011eSaveFavoriteType\u0018\u0006 \u0001(\u000e2\u001e.texaspoker.SAVE_FAVORITE_TYPE\u00120\n\reLanguageType\u0018\u0007 \u0001(\u000e2\u0019.texaspoker.LANGUAGE_TYPE\"\u008d\u0001\n\u0012SCShareFavoriteRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012H\n\u001astFavoritePokerHistoryInfo\u0018\u0002 \u0001(\u000b2$.texaspoker.Fav", "oritePokerHistoryInfo\"\u00d1\u0001\n\u0010CSRenameFavorite\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rlSaveUserUuid\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007lRoomID\u0018\u0003 \u0001(\u0003\u0012\u000f\n\u0007lHandID\u0018\u0004 \u0001(\u0003\u0012\u0014\n\fsFavoriteUrl\u0018\u0005 \u0001(\t\u00129\n\u0011eSaveFavoriteType\u0018\u0006 \u0001(\u000e2\u001e.texaspoker.SAVE_FAVORITE_TYPE\u0012\u0015\n\rsFavoriteName\u0018\u0007 \u0002(\t\u0012\u000e\n\u0006bSaved\u0018\b \u0001(\u0005\"\u009e\u0001\n\u0013SCRenameFavoriteRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012H\n\u001astFavoritePokerHistoryInfo\u0018\u0002 \u0001(\u000b2$.texaspoker.FavoritePokerHistoryInfo\u0012\u000e\n\u0006bSaved\u0018\u0003 \u0001(\u0005\"#\n\u0013CS", "GetFavoriteListV2\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"\u0091\u0001\n\u0016SCGetFavoriteListV2Rsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012H\n\u001astFavoritePokerHistoryInfo\u0018\u0002 \u0003(\u000b2$.texaspoker.FavoritePokerHistoryInfo\"=\n\u0018CSGetLastPokerHandResult\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000blGameRoomID\u0018\u0002 \u0002(\u0003\"\u0084\u0001\n\u001bSCGetLastPokerHandResultRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00126\n\u0011stPokerHandResult\u0018\u0002 \u0001(\u000b2\u001b.texaspoker.PokerHandResult\"V\n\u001cCSGetPokerHandResul", "tByHandID\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000blGameRoomID\u0018\u0002 \u0002(\u0003\u0012\u0013\n\u000blGameHandID\u0018\u0003 \u0002(\u0003\"\u0088\u0001\n\u001fSCGetPokerHandResultByHandIDRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00126\n\u0011stPokerHandResult\u0018\u0002 \u0001(\u000b2\u001b.texaspoker.PokerHandResult\"9\n\u0014CSGetAllPokerHistory\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0013\n\u000blGameRoomID\u0018\u0002 \u0002(\u0003\"\u00c6\u0001\n\u0017SCGetAllPokerHistoryRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00128\n\u0012vPokerHistoryInfos\u0018\u0002 \u0003(\u000b2\u001c.texaspoker.PokerHistoryInfo\u0012B\n\u0017", "vBravoPokerHistoryInfos\u0018\u0003 \u0003(\u000b2!.texaspoker.BravoPokerHistoryInfo\"\u00b4\u0002\n\u0011SystemMsgBaseInfo\u0012\u0014\n\flSystemMsgID\u0018\u0001 \u0002(\u0003\u0012?\n\u0012eSystemMessageType\u0018\u0002 \u0002(\u000e2#.texaspoker.NEW_SYSTEM_MESSAGE_TYPE\u0012\u0017\n\u000fsSystemMsgTitle\u0018\u0003 \u0002(\t\u0012\u0019\n\u0011sSystemMsgSummary\u0018\u0004 \u0002(\t\u0012J\n\u0019eSystemMessageContentType\u0018\u0005 \u0002(\u000e2'.texaspoker.SYSTEM_MESSAGE_CONTENT_TYPE\u0012\u0015\n\rsSystemMsgUrl\u0018\u0006 \u0001(\t\u0012\u0018\n\u0010sSystemMsgImgUrl\u0018\u0007 \u0001(\t\u0012\u0017\n\u000flSystemSendTime\u0018\b \u0001(\u0003\"\u0093\u0001\n\rSystemMsgInfo\u0012:\n\u0013stS", "ystemMsgBaseInfo\u0018\u0001 \u0002(\u000b2\u001d.texaspoker.SystemMsgBaseInfo\u0012\u0018\n\u0010sSystemMsgDetail\u0018\u0002 \u0001(\t\u0012\u001e\n\u0016sSystemMsgDetailImgUrl\u0018\u0003 \u0001(\t\u0012\f\n\u0004bGet\u0018\u0004 \u0001(\u0005\">\n\u000fCSGetSystemMsgs\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004iNum\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007iOffset\u0018\u0003 \u0002(\u0005\"\u009e\u0001\n\u0012SCGetSystemMsgsRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012:\n\u0013vSystemMsgBaseInfos\u0018\u0002 \u0003(\u000b2\u001d.texaspoker.SystemMsgBaseInfo\u0012\f\n\u0004iNum\u0018\u0003 \u0001(\u0003\u0012\u000f\n\u0007iOffset\u0018\u0004 \u0001(\u0005\"8\n\u0012CSGetSystemMsgByID\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0014\n\flSystemMsg", "ID\u0018\u0002 \u0002(\u0003\"z\n\u0015SCGetSystemMsgByIDRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00122\n\u000fstSystemMsgInfo\u0018\u0002 \u0001(\u000b2\u0019.texaspoker.SystemMsgInfo\"3\n\rCSGetBenefits\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0014\n\flSystemMsgID\u0018\u0002 \u0002(\u0003\"\u00b1\u0001\n\u0010SCGetBenefitsRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00124\n\u000fstUserBaseInfoN\u0018\u0002 \u0001(\u000b2\u001b.texaspoker.UserBaseInfoNet\u0012\r\n\u0005lCoin\u0018\u0003 \u0001(\u0003\u0012\u0013\n\u000blPopularity\u0018\u0004 \u0001(\u0003\u0012\u0014\n\flSystemMsgID\u0018\u0005 \u0001(\u0003\"\u00d5\u0001\n\rFlashPageInfo\u0012\u0014\n\flFlashPageID\u0018", "\u0001 \u0002(\u0003\u0012\u0011\n\tsFlashUrl\u0018\u0002 \u0002(\t\u0012\u0012\n\niBeginTime\u0018\u0003 \u0001(\u0003\u0012\u0010\n\biEndTime\u0018\u0004 \u0001(\u0003\u0012\u0011\n\tiDuration\u0018\u0005 \u0001(\u0005\u0012:\n\u0011eFlashPageActType\u0018\u0006 \u0001(\u000e2\u001f.texaspoker.FLASH_PAGE_ACT_TYPE\u0012\u0010\n\bsJumpUrl\u0018\u0007 \u0001(\t\u0012\u0014\n\fsNativeExtra\u0018\b \u0001(\t\"\u0082\u0001\n\u0013CSGetFlashPageInfos\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\u0014\n\fiScreenWidth\u0018\u0002 \u0001(\u0005\u0012\u0015\n\riScreenHeight\u0018\u0003 \u0001(\u0005\u00120\n\reLanguageType\u0018\u0004 \u0001(\u000e2\u0019.texaspoker.LANGUAGE_TYPE\"{\n\u0016SCGetFlashPageInfosRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u00122\n\u000fvFlashPag", "eInfos\u0018\u0002 \u0003(\u000b2\u0019.texaspoker.FlashPageInfo\"!\n\u0011CSGetFestivalMode\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"\\\n\u0014SCGetFestivalModeRsp\u0012-\n\beErrCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u0015\n\rbFestivalMode\u0018\u0002 \u0001(\u0005*[\n\u000bUPDATE_TYPE\u0012\r\n\tUPDATE_NO\u0010\u0000\u0012\u0010\n\fUPDATE_FORCE\u0010\u0001\u0012\u0013\n\u000fUPDATE_NO_FORCE\u0010\u0002\u0012\u0016\n\u0012UPDATE_MAINTENANCE\u0010\u0004*n\n\u0013FLASH_PAGE_ACT_TYPE\u0012\u001a\n\u0016FLASH_PAGE_ACT_NO_TYPE\u0010\u0000\u0012\u001e\n\u001aFLASH_PAGE_ACT_NATIVE_TYPE\u0010\u0001\u0012\u001b\n\u0017FLASH_PAGE_ACT_URL_TYPE\u0010\u0002*K\n\u0012SAVE_FAVORITE_TYPE\u0012\u0019\n\u0015S", "AVE_FAVORITE_TYPE_ID\u0010\u0001\u0012\u001a\n\u0016SAVE_FAVORITE_TYPE_URL\u0010\u0002*\u0086\u0001\n\u0017NEW_SYSTEM_MESSAGE_TYPE\u0012\u0019\n\u0015SYSTEM_MESSAGE_NOTIFY\u0010\u0001\u0012\u001b\n\u0017SYSTEM_MESSAGE_ACTIVITY\u0010\u0002\u0012\u001b\n\u0017SYSTEM_MESSAGE_BENEFITS\u0010\u0003\u0012\u0016\n\u0012SYSTEM_MESSAGE_ALL\u0010\u0004*`\n\u001bSYSTEM_MESSAGE_CONTENT_TYPE\u0012\u001e\n\u001aSYSTEM_MESSAGE_CONTENT_URL\u0010\u0001\u0012!\n\u001dSYSTEM_MESSAGE_CONTENT_NATIVE\u0010\u0002B'\n\u0015com.texaspoker.momentB\u000eTexasPokerHttp"}, fileDescriptorArr, new C01121());
        f67a = (Descriptor) aM.getMessageTypes().get(0);
        f68b = new FieldAccessorTable(f67a, new String[]{"EUpdateType", "StrURL", "StrDesc"});
        f69c = (Descriptor) aM.getMessageTypes().get(1);
        f70d = new FieldAccessorTable(f69c, new String[]{"EUpdateType", "StrConfig", "StrDesc"});
        f71e = (Descriptor) aM.getMessageTypes().get(2);
        f72f = new FieldAccessorTable(f71e, new String[]{"Uuid", "IMobleSystem", "ISysVersion", "StrMobileVersion", "StrMobileScreen", "IAuto", "ILuaVersion", "SExtra", "ELanguageType", "EDeviceType", "IChannel"});
        f73g = (Descriptor) aM.getMessageTypes().get(3);
        f74h = new FieldAccessorTable(f73g, new String[]{"EErrCode", "StAppUpdateInfo", "StLuaUpdateInfo", "SHint"});
        f75i = (Descriptor) aM.getMessageTypes().get(4);
        f76j = new FieldAccessorTable(f75i, new String[]{"Uuid", "LFeedbackID", "IMobleSystem", "ISysVersion", "SContent"});
        f77k = (Descriptor) aM.getMessageTypes().get(5);
        f78l = new FieldAccessorTable(f77k, new String[]{"EErrCode", "LFeedbackID"});
        f79m = (Descriptor) aM.getMessageTypes().get(6);
        f80n = new FieldAccessorTable(f79m, new String[]{"Uuid", "IOffset", "INum"});
        f81o = (Descriptor) aM.getMessageTypes().get(7);
        f82p = new FieldAccessorTable(f81o, new String[]{"EErrCode", "VBannerInfos", "IOffset"});
        f83q = (Descriptor) aM.getMessageTypes().get(8);
        f84r = new FieldAccessorTable(f83q, new String[]{"Uuid", "LSaveUserUuid", "LShareUserUuid", "LBigBlind", "LSmallBlind", "LWinStacks", "StrRoomName", "VHandCards", "VVoiceDatas", "IAnte", "ELanguageType"});
        f85s = (Descriptor) aM.getMessageTypes().get(9);
        f86t = new FieldAccessorTable(f85s, new String[]{"EErrCode", "StPokerProcessBaseInfo"});
        f87u = (Descriptor) aM.getMessageTypes().get(10);
        f88v = new FieldAccessorTable(f87u, new String[]{"Uuid", "LSaveUserUuid", "LShareUserUuid", "LBigBlind", "LSmallBlind", "LWinStacks", "StrRoomName", "VHandCards", "LPokerProcessID", "IAnte", "ELanguageType"});
        f89w = (Descriptor) aM.getMessageTypes().get(11);
        f90x = new FieldAccessorTable(f89w, new String[]{"EErrCode", "StPokerProcessBaseInfo"});
        f91y = (Descriptor) aM.getMessageTypes().get(12);
        f92z = new FieldAccessorTable(f91y, new String[]{"Uuid"});
        f41A = (Descriptor) aM.getMessageTypes().get(13);
        f42B = new FieldAccessorTable(f41A, new String[]{"EErrCode", "VPokerProcessBaseInfo"});
        f43C = (Descriptor) aM.getMessageTypes().get(14);
        f44D = new FieldAccessorTable(f43C, new String[]{"Uuid", "Pokerprocessid"});
        f45E = (Descriptor) aM.getMessageTypes().get(15);
        f46F = new FieldAccessorTable(f45E, new String[]{"EErrCode", "Pokerprocessid"});
        f47G = (Descriptor) aM.getMessageTypes().get(16);
        f48H = new FieldAccessorTable(f47G, new String[]{"Uuid", "LSaveUserUuid", "LRoomID", "LHandID"});
        f49I = (Descriptor) aM.getMessageTypes().get(17);
        f50J = new FieldAccessorTable(f49I, new String[]{"EErrCode", "LSaveUserUuid", "LRoomID", "LHandID"});
        f51K = (Descriptor) aM.getMessageTypes().get(18);
        f52L = new FieldAccessorTable(f51K, new String[]{"Uuid", "LSaveUserUuid", "LRoomID", "LHandID", "SFavoriteUrl", "ESaveFavoriteType", "SFavoriteName", "ELanguageType"});
        f53M = (Descriptor) aM.getMessageTypes().get(19);
        f54N = new FieldAccessorTable(f53M, new String[]{"EErrCode", "StFavoritePokerHistoryInfo"});
        f55O = (Descriptor) aM.getMessageTypes().get(20);
        f56P = new FieldAccessorTable(f55O, new String[]{"Uuid", "LSaveUserUuid", "LRoomID", "LHandID", "SFavoriteUrl", "ESaveFavoriteType", "ELanguageType"});
        f57Q = (Descriptor) aM.getMessageTypes().get(21);
        f58R = new FieldAccessorTable(f57Q, new String[]{"EErrCode", "StFavoritePokerHistoryInfo"});
        f59S = (Descriptor) aM.getMessageTypes().get(22);
        f60T = new FieldAccessorTable(f59S, new String[]{"Uuid", "LSaveUserUuid", "LRoomID", "LHandID", "SFavoriteUrl", "ESaveFavoriteType", "SFavoriteName", "BSaved"});
        f61U = (Descriptor) aM.getMessageTypes().get(23);
        f62V = new FieldAccessorTable(f61U, new String[]{"EErrCode", "StFavoritePokerHistoryInfo", "BSaved"});
        f63W = (Descriptor) aM.getMessageTypes().get(24);
        f64X = new FieldAccessorTable(f63W, new String[]{"Uuid"});
        f65Y = (Descriptor) aM.getMessageTypes().get(25);
        f66Z = new FieldAccessorTable(f65Y, new String[]{"EErrCode", "StFavoritePokerHistoryInfo"});
        aa = (Descriptor) aM.getMessageTypes().get(26);
        ab = new FieldAccessorTable(aa, new String[]{"Uuid", "LGameRoomID"});
        ac = (Descriptor) aM.getMessageTypes().get(27);
        ad = new FieldAccessorTable(ac, new String[]{"EErrCode", "StPokerHandResult"});
        ae = (Descriptor) aM.getMessageTypes().get(28);
        af = new FieldAccessorTable(ae, new String[]{"Uuid", "LGameRoomID", "LGameHandID"});
        ag = (Descriptor) aM.getMessageTypes().get(29);
        ah = new FieldAccessorTable(ag, new String[]{"EErrCode", "StPokerHandResult"});
        ai = (Descriptor) aM.getMessageTypes().get(30);
        aj = new FieldAccessorTable(ai, new String[]{"Uuid", "LGameRoomID"});
        ak = (Descriptor) aM.getMessageTypes().get(31);
        al = new FieldAccessorTable(ak, new String[]{"EErrCode", "VPokerHistoryInfos", "VBravoPokerHistoryInfos"});
        am = (Descriptor) aM.getMessageTypes().get(32);
        an = new FieldAccessorTable(am, new String[]{"LSystemMsgID", "ESystemMessageType", "SSystemMsgTitle", "SSystemMsgSummary", "ESystemMessageContentType", "SSystemMsgUrl", "SSystemMsgImgUrl", "LSystemSendTime"});
        ao = (Descriptor) aM.getMessageTypes().get(33);
        ap = new FieldAccessorTable(ao, new String[]{"StSystemMsgBaseInfo", "SSystemMsgDetail", "SSystemMsgDetailImgUrl", "BGet"});
        aq = (Descriptor) aM.getMessageTypes().get(34);
        ar = new FieldAccessorTable(aq, new String[]{"Uuid", "INum", "IOffset"});
        as = (Descriptor) aM.getMessageTypes().get(35);
        at = new FieldAccessorTable(as, new String[]{"EErrCode", "VSystemMsgBaseInfos", "INum", "IOffset"});
        au = (Descriptor) aM.getMessageTypes().get(36);
        av = new FieldAccessorTable(au, new String[]{"Uuid", "LSystemMsgID"});
        aw = (Descriptor) aM.getMessageTypes().get(37);
        ax = new FieldAccessorTable(aw, new String[]{"EErrCode", "StSystemMsgInfo"});
        ay = (Descriptor) aM.getMessageTypes().get(38);
        az = new FieldAccessorTable(ay, new String[]{"Uuid", "LSystemMsgID"});
        aA = (Descriptor) aM.getMessageTypes().get(39);
        aB = new FieldAccessorTable(aA, new String[]{"EErrCode", "StUserBaseInfoN", "LCoin", "LPopularity", "LSystemMsgID"});
        aC = (Descriptor) aM.getMessageTypes().get(40);
        aD = new FieldAccessorTable(aC, new String[]{"LFlashPageID", "SFlashUrl", "IBeginTime", "IEndTime", "IDuration", "EFlashPageActType", "SJumpUrl", "SNativeExtra"});
        aE = (Descriptor) aM.getMessageTypes().get(41);
        aF = new FieldAccessorTable(aE, new String[]{"Uuid", "IScreenWidth", "IScreenHeight", "ELanguageType"});
        aG = (Descriptor) aM.getMessageTypes().get(42);
        aH = new FieldAccessorTable(aG, new String[]{"EErrCode", "VFlashPageInfos"});
        aI = (Descriptor) aM.getMessageTypes().get(43);
        aJ = new FieldAccessorTable(aI, new String[]{"Uuid"});
        aK = (Descriptor) aM.getMessageTypes().get(44);
        aL = new FieldAccessorTable(aK, new String[]{"EErrCode", "BFestivalMode"});
        TexasPokerCommon.m11a();
    }
}
