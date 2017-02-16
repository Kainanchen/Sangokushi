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
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;
import java.util.List;

public final class TexasPokerMiniGame {
    private static final Descriptor f322a;
    private static FieldAccessorTable f323b;
    private static final Descriptor f324c;
    private static FieldAccessorTable f325d;
    private static final Descriptor f326e;
    private static FieldAccessorTable f327f;
    private static final Descriptor f328g;
    private static FieldAccessorTable f329h;
    private static final Descriptor f330i;
    private static FieldAccessorTable f331j;
    private static final Descriptor f332k;
    private static FieldAccessorTable f333l;
    private static final Descriptor f334m;
    private static FieldAccessorTable f335n;
    private static final Descriptor f336o;
    private static FieldAccessorTable f337p;
    private static final Descriptor f338q;
    private static FieldAccessorTable f339r;
    private static final Descriptor f340s;
    private static FieldAccessorTable f341t;
    private static final Descriptor f342u;
    private static FieldAccessorTable f343v;
    private static final Descriptor f344w;
    private static FieldAccessorTable f345x;
    private static FileDescriptor f346y;

    /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.1 */
    class C03591 implements InternalDescriptorAssigner {
        static {
            fixHelper.fixfunc(new int[]{11919, 11920});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C03591();

        public final native ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
    }

    public enum CHECK_RESULT implements ProtocolMessageEnum {
        ;
        
        public static final int RESULT_DRAW_VALUE = 9002;
        public static final int RESULT_LOST_VALUE = 9000;
        public static final int RESULT_WIN_VALUE = 9001;
        private static final CHECK_RESULT[] VALUES = null;
        private static EnumLiteMap<CHECK_RESULT> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.CHECK_RESULT.1 */
        class C03601 implements EnumLiteMap<CHECK_RESULT> {
            static {
                fixHelper.fixfunc(new int[]{26773, 26774});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03601();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{26057, 26058, 26059, 26060});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CHECK_RESULT(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            RESULT_LOST = new CHECK_RESULT("RESULT_LOST", 0, 0, RESULT_LOST_VALUE);
            RESULT_WIN = new CHECK_RESULT("RESULT_WIN", 1, 1, RESULT_WIN_VALUE);
            RESULT_DRAW = new CHECK_RESULT("RESULT_DRAW", 2, 2, RESULT_DRAW_VALUE);
            ENUM$VALUES = new CHECK_RESULT[]{RESULT_LOST, RESULT_WIN, RESULT_DRAW};
            internalValueMap = new C03601();
            VALUES = values();
        }

        public static CHECK_RESULT valueOf(int i) {
            switch (i) {
                case RESULT_LOST_VALUE:
                    return RESULT_LOST;
                case RESULT_WIN_VALUE:
                    return RESULT_WIN;
                case RESULT_DRAW_VALUE:
                    return RESULT_DRAW;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<CHECK_RESULT> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerMiniGame.m330a().getEnumTypes().get(1);
        }

        public static CHECK_RESULT valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface CSMiniGameChangeOrBuilder extends MessageOrBuilder {
        long getUuid();

        int getVSeqs(int i);

        int getVSeqsCount();

        List<Integer> getVSeqsList();

        boolean hasUuid();
    }

    public static final class CSMiniGameChange extends GeneratedMessage implements CSMiniGameChangeOrBuilder {
        public static Parser<CSMiniGameChange> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int VSEQS_FIELD_NUMBER = 2;
        private static final CSMiniGameChange defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;
        private List<Integer> vSeqs_;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.CSMiniGameChange.1 */
        class C03611 extends AbstractParser<CSMiniGameChange> {
            static {
                fixHelper.fixfunc(new int[]{19757, 19758});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03611();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSMiniGameChangeOrBuilder {
            private int bitField0_;
            private long uuid_;
            private List<Integer> vSeqs_;

            static {
                fixHelper.fixfunc(new int[]{9791, 9792, 9793, 9794, 9795, 9796, 9797, 9798, 9799, 9800, 9801, 9802, 9803, 9804, 9805, 9806, 9807, 9808, 9809, 9810, 9811, 9812, 9813, 9814, 9815, 9816, 9817, 9818, 9819, 9820, 9821, 9822, 9823, 9824, 9825, 9826, 9827, 9828, 9829, 9830, 9831, 9832, 9833, 9834});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVSeqsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVSeqs(Iterable<? extends Integer> iterable);

            public final native Builder addVSeqs(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3213build();

            public final native CSMiniGameChange m3214build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3215buildPartial();

            public final native CSMiniGameChange m3216buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3217clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3218clear();

            public final native Builder m3219clear();

            public final native Builder clearUuid();

            public final native Builder clearVSeqs();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3220clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3221clone();

            public final native Builder m3222clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3223getDefaultInstanceForType();

            public final native CSMiniGameChange m3224getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native int getVSeqs(int i);

            public final native int getVSeqsCount();

            public final native List<Integer> getVSeqsList();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3225mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3226mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3227mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3228mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3229mergeFrom(Message message);

            public final native Builder mergeFrom(CSMiniGameChange cSMiniGameChange);

            public final native Builder setUuid(long j);

            public final native Builder setVSeqs(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f330i;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16421, 16422, 16423, 16424, 16425, 16426, 16427, 16428, 16429, 16430, 16431, 16432, 16433, 16434, 16435, 16436, 16437, 16438, 16439, 16440, 16441, 16442, 16443, 16444, 16445, 16446, 16447, 16448, 16449});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSMiniGameChange(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSMiniGameChange(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSMiniGameChange cSMiniGameChange);

        private native CSMiniGameChange(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSMiniGameChange(com.google.protobuf.GeneratedMessage.Builder builder, CSMiniGameChange cSMiniGameChange);

        private native CSMiniGameChange(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3206getDefaultInstanceForType();

        public final native CSMiniGameChange m3207getDefaultInstanceForType();

        public final native Parser<CSMiniGameChange> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native int getVSeqs(int i);

        public final native int getVSeqsCount();

        public final native List<Integer> getVSeqsList();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3208newBuilderForType();

        public final native Builder m3209newBuilderForType();

        protected final native Builder m3210newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3211toBuilder();

        public final native Builder m3212toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSMiniGameChange getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f330i;
        }

        static void __clinit__() {
            PARSER = new C03611();
            CSMiniGameChange cSMiniGameChange = new CSMiniGameChange(true);
            defaultInstance = cSMiniGameChange;
            cSMiniGameChange.initFields();
        }

        public static CSMiniGameChange parseFrom(ByteString byteString) {
            return (CSMiniGameChange) PARSER.parseFrom(byteString);
        }

        public static CSMiniGameChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameChange) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSMiniGameChange parseFrom(byte[] bArr) {
            return (CSMiniGameChange) PARSER.parseFrom(bArr);
        }

        public static CSMiniGameChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameChange) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSMiniGameChange parseFrom(InputStream inputStream) {
            return (CSMiniGameChange) PARSER.parseFrom(inputStream);
        }

        public static CSMiniGameChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameChange) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameChange parseDelimitedFrom(InputStream inputStream) {
            return (CSMiniGameChange) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSMiniGameChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameChange) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameChange parseFrom(CodedInputStream codedInputStream) {
            return (CSMiniGameChange) PARSER.parseFrom(codedInputStream);
        }

        public static CSMiniGameChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameChange) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSMiniGameChange cSMiniGameChange) {
            return newBuilder().mergeFrom(cSMiniGameChange);
        }
    }

    public interface CSMiniGameCheckOrBuilder extends MessageOrBuilder {
        int getISeq();

        long getUuid();

        boolean hasISeq();

        boolean hasUuid();
    }

    public static final class CSMiniGameCheck extends GeneratedMessage implements CSMiniGameCheckOrBuilder {
        public static final int ISEQ_FIELD_NUMBER = 2;
        public static Parser<CSMiniGameCheck> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSMiniGameCheck defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iSeq_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.CSMiniGameCheck.1 */
        class C03621 extends AbstractParser<CSMiniGameCheck> {
            static {
                fixHelper.fixfunc(new int[]{26438, 26439});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03621();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSMiniGameCheckOrBuilder {
            private int bitField0_;
            private int iSeq_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{16657, 16658, 16659, 16660, 16661, 16662, 16663, 16664, 16665, 16666, 16667, 16668, 16669, 16670, 16671, 16672, 16673, 16674, 16675, 16676, 16677, 16678, 16679, 16680, 16681, 16682, 16683, 16684, 16685, 16686, 16687, 16688, 16689, 16690, 16691, 16692, 16693, 16694, 16695, 16696});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3237build();

            public final native CSMiniGameCheck m3238build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3239buildPartial();

            public final native CSMiniGameCheck m3240buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3241clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3242clear();

            public final native Builder m3243clear();

            public final native Builder clearISeq();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3244clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3245clone();

            public final native Builder m3246clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3247getDefaultInstanceForType();

            public final native CSMiniGameCheck m3248getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getISeq();

            public final native long getUuid();

            public final native boolean hasISeq();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3249mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3250mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3251mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3252mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3253mergeFrom(Message message);

            public final native Builder mergeFrom(CSMiniGameCheck cSMiniGameCheck);

            public final native Builder setISeq(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f338q;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7532, 7533, 7534, 7535, 7536, 7537, 7538, 7539, 7540, 7541, 7542, 7543, 7544, 7545, 7546, 7547, 7548, 7549, 7550, 7551, 7552, 7553, 7554, 7555, 7556, 7557, 7558, 7559});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSMiniGameCheck(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSMiniGameCheck(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSMiniGameCheck cSMiniGameCheck);

        private native CSMiniGameCheck(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSMiniGameCheck(com.google.protobuf.GeneratedMessage.Builder builder, CSMiniGameCheck cSMiniGameCheck);

        private native CSMiniGameCheck(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3230getDefaultInstanceForType();

        public final native CSMiniGameCheck m3231getDefaultInstanceForType();

        public final native int getISeq();

        public final native Parser<CSMiniGameCheck> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasISeq();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3232newBuilderForType();

        public final native Builder m3233newBuilderForType();

        protected final native Builder m3234newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3235toBuilder();

        public final native Builder m3236toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSMiniGameCheck getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f338q;
        }

        static void __clinit__() {
            PARSER = new C03621();
            CSMiniGameCheck cSMiniGameCheck = new CSMiniGameCheck(true);
            defaultInstance = cSMiniGameCheck;
            cSMiniGameCheck.initFields();
        }

        public static CSMiniGameCheck parseFrom(ByteString byteString) {
            return (CSMiniGameCheck) PARSER.parseFrom(byteString);
        }

        public static CSMiniGameCheck parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameCheck) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSMiniGameCheck parseFrom(byte[] bArr) {
            return (CSMiniGameCheck) PARSER.parseFrom(bArr);
        }

        public static CSMiniGameCheck parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameCheck) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSMiniGameCheck parseFrom(InputStream inputStream) {
            return (CSMiniGameCheck) PARSER.parseFrom(inputStream);
        }

        public static CSMiniGameCheck parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameCheck) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameCheck parseDelimitedFrom(InputStream inputStream) {
            return (CSMiniGameCheck) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSMiniGameCheck parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameCheck) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameCheck parseFrom(CodedInputStream codedInputStream) {
            return (CSMiniGameCheck) PARSER.parseFrom(codedInputStream);
        }

        public static CSMiniGameCheck parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameCheck) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSMiniGameCheck cSMiniGameCheck) {
            return newBuilder().mergeFrom(cSMiniGameCheck);
        }
    }

    public interface CSMiniGameDoubleOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSMiniGameDouble extends GeneratedMessage implements CSMiniGameDoubleOrBuilder {
        public static Parser<CSMiniGameDouble> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSMiniGameDouble defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.CSMiniGameDouble.1 */
        class C03631 extends AbstractParser<CSMiniGameDouble> {
            static {
                fixHelper.fixfunc(new int[]{30390, 30391});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03631();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSMiniGameDoubleOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{25223, 25224, 25225, 25226, 25227, 25228, 25229, 25230, 25231, 25232, 25233, 25234, 25235, 25236, 25237, 25238, 25239, 25240, 25241, 25242, 25243, 25244, 25245, 25246, 25247, 25248, 25249, 25250, 25251, 25252, 25253, 25254, 25255, 25256, 25257, 25258});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3261build();

            public final native CSMiniGameDouble m3262build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3263buildPartial();

            public final native CSMiniGameDouble m3264buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3265clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3266clear();

            public final native Builder m3267clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3268clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3269clone();

            public final native Builder m3270clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3271getDefaultInstanceForType();

            public final native CSMiniGameDouble m3272getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3273mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3274mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3275mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3276mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3277mergeFrom(Message message);

            public final native Builder mergeFrom(CSMiniGameDouble cSMiniGameDouble);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f334m;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7970, 7971, 7972, 7973, 7974, 7975, 7976, 7977, 7978, 7979, 7980, 7981, 7982, 7983, 7984, 7985, 7986, 7987, 7988, 7989, 7990, 7991, 7992, 7993, 7994, 7995});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSMiniGameDouble(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSMiniGameDouble(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSMiniGameDouble cSMiniGameDouble);

        private native CSMiniGameDouble(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSMiniGameDouble(com.google.protobuf.GeneratedMessage.Builder builder, CSMiniGameDouble cSMiniGameDouble);

        private native CSMiniGameDouble(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3254getDefaultInstanceForType();

        public final native CSMiniGameDouble m3255getDefaultInstanceForType();

        public final native Parser<CSMiniGameDouble> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3256newBuilderForType();

        public final native Builder m3257newBuilderForType();

        protected final native Builder m3258newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3259toBuilder();

        public final native Builder m3260toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSMiniGameDouble getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f334m;
        }

        static void __clinit__() {
            PARSER = new C03631();
            CSMiniGameDouble cSMiniGameDouble = new CSMiniGameDouble(true);
            defaultInstance = cSMiniGameDouble;
            cSMiniGameDouble.initFields();
        }

        public static CSMiniGameDouble parseFrom(ByteString byteString) {
            return (CSMiniGameDouble) PARSER.parseFrom(byteString);
        }

        public static CSMiniGameDouble parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameDouble) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSMiniGameDouble parseFrom(byte[] bArr) {
            return (CSMiniGameDouble) PARSER.parseFrom(bArr);
        }

        public static CSMiniGameDouble parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameDouble) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSMiniGameDouble parseFrom(InputStream inputStream) {
            return (CSMiniGameDouble) PARSER.parseFrom(inputStream);
        }

        public static CSMiniGameDouble parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameDouble) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameDouble parseDelimitedFrom(InputStream inputStream) {
            return (CSMiniGameDouble) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSMiniGameDouble parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameDouble) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameDouble parseFrom(CodedInputStream codedInputStream) {
            return (CSMiniGameDouble) PARSER.parseFrom(codedInputStream);
        }

        public static CSMiniGameDouble parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameDouble) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSMiniGameDouble cSMiniGameDouble) {
            return newBuilder().mergeFrom(cSMiniGameDouble);
        }
    }

    public interface CSMiniGameExitOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSMiniGameExit extends GeneratedMessage implements CSMiniGameExitOrBuilder {
        public static Parser<CSMiniGameExit> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSMiniGameExit defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.CSMiniGameExit.1 */
        class C03641 extends AbstractParser<CSMiniGameExit> {
            static {
                fixHelper.fixfunc(new int[]{29120, 29121});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03641();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSMiniGameExitOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{11340, 11341, 11342, 11343, 11344, 11345, 11346, 11347, 11348, 11349, 11350, 11351, 11352, 11353, 11354, 11355, 11356, 11357, 11358, 11359, 11360, 11361, 11362, 11363, 11364, 11365, 11366, 11367, 11368, 11369, 11370, 11371, 11372, 11373, 11374, 11375});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3285build();

            public final native CSMiniGameExit m3286build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3287buildPartial();

            public final native CSMiniGameExit m3288buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3289clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3290clear();

            public final native Builder m3291clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3292clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3293clone();

            public final native Builder m3294clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3295getDefaultInstanceForType();

            public final native CSMiniGameExit m3296getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3297mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3298mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3299mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3300mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3301mergeFrom(Message message);

            public final native Builder mergeFrom(CSMiniGameExit cSMiniGameExit);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f342u;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{33190, 33191, 33192, 33193, 33194, 33195, 33196, 33197, 33198, 33199, 33200, 33201, 33202, 33203, 33204, 33205, 33206, 33207, 33208, 33209, 33210, 33211, 33212, 33213, 33214, 33215});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSMiniGameExit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSMiniGameExit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSMiniGameExit cSMiniGameExit);

        private native CSMiniGameExit(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSMiniGameExit(com.google.protobuf.GeneratedMessage.Builder builder, CSMiniGameExit cSMiniGameExit);

        private native CSMiniGameExit(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3278getDefaultInstanceForType();

        public final native CSMiniGameExit m3279getDefaultInstanceForType();

        public final native Parser<CSMiniGameExit> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3280newBuilderForType();

        public final native Builder m3281newBuilderForType();

        protected final native Builder m3282newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3283toBuilder();

        public final native Builder m3284toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSMiniGameExit getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f342u;
        }

        static void __clinit__() {
            PARSER = new C03641();
            CSMiniGameExit cSMiniGameExit = new CSMiniGameExit(true);
            defaultInstance = cSMiniGameExit;
            cSMiniGameExit.initFields();
        }

        public static CSMiniGameExit parseFrom(ByteString byteString) {
            return (CSMiniGameExit) PARSER.parseFrom(byteString);
        }

        public static CSMiniGameExit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameExit) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSMiniGameExit parseFrom(byte[] bArr) {
            return (CSMiniGameExit) PARSER.parseFrom(bArr);
        }

        public static CSMiniGameExit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameExit) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSMiniGameExit parseFrom(InputStream inputStream) {
            return (CSMiniGameExit) PARSER.parseFrom(inputStream);
        }

        public static CSMiniGameExit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameExit) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameExit parseDelimitedFrom(InputStream inputStream) {
            return (CSMiniGameExit) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSMiniGameExit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameExit) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameExit parseFrom(CodedInputStream codedInputStream) {
            return (CSMiniGameExit) PARSER.parseFrom(codedInputStream);
        }

        public static CSMiniGameExit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameExit) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSMiniGameExit cSMiniGameExit) {
            return newBuilder().mergeFrom(cSMiniGameExit);
        }
    }

    public interface CSMiniGameIniOrBuilder extends MessageOrBuilder {
        long getUuid();

        boolean hasUuid();
    }

    public static final class CSMiniGameIni extends GeneratedMessage implements CSMiniGameIniOrBuilder {
        public static Parser<CSMiniGameIni> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSMiniGameIni defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.CSMiniGameIni.1 */
        class C03651 extends AbstractParser<CSMiniGameIni> {
            static {
                fixHelper.fixfunc(new int[]{8884, 8885});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03651();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSMiniGameIniOrBuilder {
            private int bitField0_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{30318, 30319, 30320, 30321, 30322, 30323, 30324, 30325, 30326, 30327, 30328, 30329, 30330, 30331, 30332, 30333, 30334, 30335, 30336, 30337, 30338, 30339, 30340, 30341, 30342, 30343, 30344, 30345, 30346, 30347, 30348, 30349, 30350, 30351, 30352, 30353});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3309build();

            public final native CSMiniGameIni m3310build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3311buildPartial();

            public final native CSMiniGameIni m3312buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3313clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3314clear();

            public final native Builder m3315clear();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3316clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3317clone();

            public final native Builder m3318clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3319getDefaultInstanceForType();

            public final native CSMiniGameIni m3320getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native long getUuid();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3321mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3322mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3323mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3324mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3325mergeFrom(Message message);

            public final native Builder mergeFrom(CSMiniGameIni cSMiniGameIni);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f322a;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{15752, 15753, 15754, 15755, 15756, 15757, 15758, 15759, 15760, 15761, 15762, 15763, 15764, 15765, 15766, 15767, 15768, 15769, 15770, 15771, 15772, 15773, 15774, 15775, 15776, 15777});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSMiniGameIni(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSMiniGameIni(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSMiniGameIni cSMiniGameIni);

        private native CSMiniGameIni(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSMiniGameIni(com.google.protobuf.GeneratedMessage.Builder builder, CSMiniGameIni cSMiniGameIni);

        private native CSMiniGameIni(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3302getDefaultInstanceForType();

        public final native CSMiniGameIni m3303getDefaultInstanceForType();

        public final native Parser<CSMiniGameIni> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3304newBuilderForType();

        public final native Builder m3305newBuilderForType();

        protected final native Builder m3306newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3307toBuilder();

        public final native Builder m3308toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSMiniGameIni getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f322a;
        }

        static void __clinit__() {
            PARSER = new C03651();
            CSMiniGameIni cSMiniGameIni = new CSMiniGameIni(true);
            defaultInstance = cSMiniGameIni;
            cSMiniGameIni.initFields();
        }

        public static CSMiniGameIni parseFrom(ByteString byteString) {
            return (CSMiniGameIni) PARSER.parseFrom(byteString);
        }

        public static CSMiniGameIni parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameIni) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSMiniGameIni parseFrom(byte[] bArr) {
            return (CSMiniGameIni) PARSER.parseFrom(bArr);
        }

        public static CSMiniGameIni parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameIni) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSMiniGameIni parseFrom(InputStream inputStream) {
            return (CSMiniGameIni) PARSER.parseFrom(inputStream);
        }

        public static CSMiniGameIni parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameIni) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameIni parseDelimitedFrom(InputStream inputStream) {
            return (CSMiniGameIni) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSMiniGameIni parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameIni) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameIni parseFrom(CodedInputStream codedInputStream) {
            return (CSMiniGameIni) PARSER.parseFrom(codedInputStream);
        }

        public static CSMiniGameIni parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameIni) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSMiniGameIni cSMiniGameIni) {
            return newBuilder().mergeFrom(cSMiniGameIni);
        }
    }

    public interface CSMiniGameStartOrBuilder extends MessageOrBuilder {
        int getIBet();

        long getUuid();

        boolean hasIBet();

        boolean hasUuid();
    }

    public static final class CSMiniGameStart extends GeneratedMessage implements CSMiniGameStartOrBuilder {
        public static final int IBET_FIELD_NUMBER = 2;
        public static Parser<CSMiniGameStart> PARSER = null;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final CSMiniGameStart defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int iBet_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private long uuid_;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.CSMiniGameStart.1 */
        class C03661 extends AbstractParser<CSMiniGameStart> {
            static {
                fixHelper.fixfunc(new int[]{28232, 28233});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03661();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements CSMiniGameStartOrBuilder {
            private int bitField0_;
            private int iBet_;
            private long uuid_;

            static {
                fixHelper.fixfunc(new int[]{18962, 18963, 18964, 18965, 18966, 18967, 18968, 18969, 18970, 18971, 18972, 18973, 18974, 18975, 18976, 18977, 18978, 18979, 18980, 18981, 18982, 18983, 18984, 18985, 18986, 18987, 18988, 18989, 18990, 18991, 18992, 18993, 18994, 18995, 18996, 18997, 18998, 18999, TEXAS_CMD.Cmd_SCMiniGameStartRsp_VALUE, TEXAS_CMD.Cmd_SCMiniGameChangeRsp_VALUE});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3333build();

            public final native CSMiniGameStart m3334build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3335buildPartial();

            public final native CSMiniGameStart m3336buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3337clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3338clear();

            public final native Builder m3339clear();

            public final native Builder clearIBet();

            public final native Builder clearUuid();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3340clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3341clone();

            public final native Builder m3342clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3343getDefaultInstanceForType();

            public final native CSMiniGameStart m3344getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native int getIBet();

            public final native long getUuid();

            public final native boolean hasIBet();

            public final native boolean hasUuid();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3345mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3346mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3347mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3348mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3349mergeFrom(Message message);

            public final native Builder mergeFrom(CSMiniGameStart cSMiniGameStart);

            public final native Builder setIBet(int i);

            public final native Builder setUuid(long j);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f326e;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{22849, 22850, 22851, 22852, 22853, 22854, 22855, 22856, 22857, 22858, 22859, 22860, 22861, 22862, 22863, 22864, 22865, 22866, 22867, 22868, 22869, 22870, 22871, 22872, 22873, 22874, 22875, 22876});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native CSMiniGameStart(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ CSMiniGameStart(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, CSMiniGameStart cSMiniGameStart);

        private native CSMiniGameStart(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ CSMiniGameStart(com.google.protobuf.GeneratedMessage.Builder builder, CSMiniGameStart cSMiniGameStart);

        private native CSMiniGameStart(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3326getDefaultInstanceForType();

        public final native CSMiniGameStart m3327getDefaultInstanceForType();

        public final native int getIBet();

        public final native Parser<CSMiniGameStart> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native long getUuid();

        public final native boolean hasIBet();

        public final native boolean hasUuid();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3328newBuilderForType();

        public final native Builder m3329newBuilderForType();

        protected final native Builder m3330newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3331toBuilder();

        public final native Builder m3332toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static CSMiniGameStart getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f326e;
        }

        static void __clinit__() {
            PARSER = new C03661();
            CSMiniGameStart cSMiniGameStart = new CSMiniGameStart(true);
            defaultInstance = cSMiniGameStart;
            cSMiniGameStart.initFields();
        }

        public static CSMiniGameStart parseFrom(ByteString byteString) {
            return (CSMiniGameStart) PARSER.parseFrom(byteString);
        }

        public static CSMiniGameStart parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameStart) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CSMiniGameStart parseFrom(byte[] bArr) {
            return (CSMiniGameStart) PARSER.parseFrom(bArr);
        }

        public static CSMiniGameStart parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameStart) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CSMiniGameStart parseFrom(InputStream inputStream) {
            return (CSMiniGameStart) PARSER.parseFrom(inputStream);
        }

        public static CSMiniGameStart parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameStart) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameStart parseDelimitedFrom(InputStream inputStream) {
            return (CSMiniGameStart) PARSER.parseDelimitedFrom(inputStream);
        }

        public static CSMiniGameStart parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameStart) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static CSMiniGameStart parseFrom(CodedInputStream codedInputStream) {
            return (CSMiniGameStart) PARSER.parseFrom(codedInputStream);
        }

        public static CSMiniGameStart parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CSMiniGameStart) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(CSMiniGameStart cSMiniGameStart) {
            return newBuilder().mergeFrom(cSMiniGameStart);
        }
    }

    public enum PATTERNS_TYPE implements ProtocolMessageEnum {
        ;
        
        public static final int FLUSH_VALUE = 9005;
        public static final int FOUR_OF_A_KIND_VALUE = 9007;
        public static final int FULL_HOUSE_VALUE = 9006;
        public static final int NONE_VALUE = 9000;
        public static final int ONE_PAIR_JJ_VALUE = 9001;
        public static final int ROYAL_FLUSH_VALUE = 9009;
        public static final int STRAIGHT_FLUSH_VALUE = 9008;
        public static final int STRAIGHT_VALUE = 9004;
        public static final int THREE_OF_A_KIND_VALUE = 9003;
        public static final int TWO_PAIR_VALUE = 9002;
        private static final PATTERNS_TYPE[] VALUES = null;
        private static EnumLiteMap<PATTERNS_TYPE> internalValueMap;
        private final int index;
        private final int value;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.PATTERNS_TYPE.1 */
        class C03671 implements EnumLiteMap<PATTERNS_TYPE> {
            static {
                fixHelper.fixfunc(new int[]{28399, 28400});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03671();

            public final native /* synthetic */ EnumLite findValueByNumber(int i);
        }

        static {
            fixHelper.fixfunc(new int[]{15141, 15142, 15143, 15144});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native PATTERNS_TYPE(int i, int i2);

        public final native EnumDescriptor getDescriptorForType();

        public final native int getNumber();

        public final native EnumValueDescriptor getValueDescriptor();

        static void __clinit__() {
            NONE = new PATTERNS_TYPE("NONE", 0, 0, NONE_VALUE);
            ONE_PAIR_JJ = new PATTERNS_TYPE("ONE_PAIR_JJ", 1, 1, ONE_PAIR_JJ_VALUE);
            TWO_PAIR = new PATTERNS_TYPE("TWO_PAIR", 2, 2, TWO_PAIR_VALUE);
            THREE_OF_A_KIND = new PATTERNS_TYPE("THREE_OF_A_KIND", 3, 3, THREE_OF_A_KIND_VALUE);
            STRAIGHT = new PATTERNS_TYPE("STRAIGHT", 4, 4, STRAIGHT_VALUE);
            FLUSH = new PATTERNS_TYPE("FLUSH", 5, 5, FLUSH_VALUE);
            FULL_HOUSE = new PATTERNS_TYPE("FULL_HOUSE", 6, 6, FULL_HOUSE_VALUE);
            FOUR_OF_A_KIND = new PATTERNS_TYPE("FOUR_OF_A_KIND", 7, 7, FOUR_OF_A_KIND_VALUE);
            STRAIGHT_FLUSH = new PATTERNS_TYPE("STRAIGHT_FLUSH", 8, 8, STRAIGHT_FLUSH_VALUE);
            ROYAL_FLUSH = new PATTERNS_TYPE("ROYAL_FLUSH", 9, 9, ROYAL_FLUSH_VALUE);
            ENUM$VALUES = new PATTERNS_TYPE[]{NONE, ONE_PAIR_JJ, TWO_PAIR, THREE_OF_A_KIND, STRAIGHT, FLUSH, FULL_HOUSE, FOUR_OF_A_KIND, STRAIGHT_FLUSH, ROYAL_FLUSH};
            internalValueMap = new C03671();
            VALUES = values();
        }

        public static PATTERNS_TYPE valueOf(int i) {
            switch (i) {
                case NONE_VALUE:
                    return NONE;
                case ONE_PAIR_JJ_VALUE:
                    return ONE_PAIR_JJ;
                case TWO_PAIR_VALUE:
                    return TWO_PAIR;
                case THREE_OF_A_KIND_VALUE:
                    return THREE_OF_A_KIND;
                case STRAIGHT_VALUE:
                    return STRAIGHT;
                case FLUSH_VALUE:
                    return FLUSH;
                case FULL_HOUSE_VALUE:
                    return FULL_HOUSE;
                case FOUR_OF_A_KIND_VALUE:
                    return FOUR_OF_A_KIND;
                case STRAIGHT_FLUSH_VALUE:
                    return STRAIGHT_FLUSH;
                case ROYAL_FLUSH_VALUE:
                    return ROYAL_FLUSH;
                default:
                    return null;
            }
        }

        public static EnumLiteMap<PATTERNS_TYPE> internalGetValueMap() {
            return internalValueMap;
        }

        public static final EnumDescriptor getDescriptor() {
            return (EnumDescriptor) TexasPokerMiniGame.m330a().getEnumTypes().get(0);
        }

        public static PATTERNS_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public interface SCMiniGameChangeRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrorCode();

        PATTERNS_TYPE getEPattern();

        int getIPoolCoin();

        int getVCards(int i);

        int getVCardsCount();

        List<Integer> getVCardsList();

        boolean hasEErrorCode();

        boolean hasEPattern();

        boolean hasIPoolCoin();
    }

    public static final class SCMiniGameChangeRsp extends GeneratedMessage implements SCMiniGameChangeRspOrBuilder {
        public static final int EERRORCODE_FIELD_NUMBER = 1;
        public static final int EPATTERN_FIELD_NUMBER = 3;
        public static final int IPOOLCOIN_FIELD_NUMBER = 2;
        public static Parser<SCMiniGameChangeRsp> PARSER = null;
        public static final int VCARDS_FIELD_NUMBER = 4;
        private static final SCMiniGameChangeRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrorCode_;
        private PATTERNS_TYPE ePattern_;
        private int iPoolCoin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<Integer> vCards_;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.SCMiniGameChangeRsp.1 */
        class C03681 extends AbstractParser<SCMiniGameChangeRsp> {
            static {
                fixHelper.fixfunc(new int[]{24882, 24883});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03681();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCMiniGameChangeRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrorCode_;
            private PATTERNS_TYPE ePattern_;
            private int iPoolCoin_;
            private List<Integer> vCards_;

            static {
                fixHelper.fixfunc(new int[]{22918, 22919, 22920, 22921, 22922, 22923, 22924, 22925, 22926, 22927, 22928, 22929, 22930, 22931, 22932, 22933, 22934, 22935, 22936, 22937, 22938, 22939, 22940, 22941, 22942, 22943, 22944, 22945, 22946, 22947, 22948, 22949, 22950, 22951, 22952, 22953, 22954, 22955, 22956, 22957, 22958, 22959, 22960, 22961, 22962, 22963, 22964, 22965, 22966, 22967, 22968, 22969});
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

            public final native /* bridge */ /* synthetic */ MessageLite m3357build();

            public final native SCMiniGameChangeRsp m3358build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3359buildPartial();

            public final native SCMiniGameChangeRsp m3360buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3361clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3362clear();

            public final native Builder m3363clear();

            public final native Builder clearEErrorCode();

            public final native Builder clearEPattern();

            public final native Builder clearIPoolCoin();

            public final native Builder clearVCards();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3364clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3365clone();

            public final native Builder m3366clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3367getDefaultInstanceForType();

            public final native SCMiniGameChangeRsp m3368getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrorCode();

            public final native PATTERNS_TYPE getEPattern();

            public final native int getIPoolCoin();

            public final native int getVCards(int i);

            public final native int getVCardsCount();

            public final native List<Integer> getVCardsList();

            public final native boolean hasEErrorCode();

            public final native boolean hasEPattern();

            public final native boolean hasIPoolCoin();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3369mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3370mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3371mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3372mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3373mergeFrom(Message message);

            public final native Builder mergeFrom(SCMiniGameChangeRsp sCMiniGameChangeRsp);

            public final native Builder setEErrorCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setEPattern(PATTERNS_TYPE patterns_type);

            public final native Builder setIPoolCoin(int i);

            public final native Builder setVCards(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f332k;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{16450, 16451, 16452, 16453, 16454, 16455, 16456, 16457, 16458, 16459, 16460, 16461, 16462, 16463, 16464, 16465, 16466, 16467, 16468, 16469, 16470, 16471, 16472, 16473, 16474, 16475, 16476, 16477, 16478, 16479, 16480, 16481, 16482});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCMiniGameChangeRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCMiniGameChangeRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCMiniGameChangeRsp sCMiniGameChangeRsp);

        private native SCMiniGameChangeRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCMiniGameChangeRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCMiniGameChangeRsp sCMiniGameChangeRsp);

        private native SCMiniGameChangeRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3350getDefaultInstanceForType();

        public final native SCMiniGameChangeRsp m3351getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrorCode();

        public final native PATTERNS_TYPE getEPattern();

        public final native int getIPoolCoin();

        public final native Parser<SCMiniGameChangeRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native int getVCards(int i);

        public final native int getVCardsCount();

        public final native List<Integer> getVCardsList();

        public final native boolean hasEErrorCode();

        public final native boolean hasEPattern();

        public final native boolean hasIPoolCoin();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3352newBuilderForType();

        public final native Builder m3353newBuilderForType();

        protected final native Builder m3354newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3355toBuilder();

        public final native Builder m3356toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCMiniGameChangeRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f332k;
        }

        static void __clinit__() {
            PARSER = new C03681();
            SCMiniGameChangeRsp sCMiniGameChangeRsp = new SCMiniGameChangeRsp(true);
            defaultInstance = sCMiniGameChangeRsp;
            sCMiniGameChangeRsp.initFields();
        }

        public static SCMiniGameChangeRsp parseFrom(ByteString byteString) {
            return (SCMiniGameChangeRsp) PARSER.parseFrom(byteString);
        }

        public static SCMiniGameChangeRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameChangeRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCMiniGameChangeRsp parseFrom(byte[] bArr) {
            return (SCMiniGameChangeRsp) PARSER.parseFrom(bArr);
        }

        public static SCMiniGameChangeRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameChangeRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCMiniGameChangeRsp parseFrom(InputStream inputStream) {
            return (SCMiniGameChangeRsp) PARSER.parseFrom(inputStream);
        }

        public static SCMiniGameChangeRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameChangeRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameChangeRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCMiniGameChangeRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCMiniGameChangeRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameChangeRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameChangeRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCMiniGameChangeRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCMiniGameChangeRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameChangeRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCMiniGameChangeRsp sCMiniGameChangeRsp) {
            return newBuilder().mergeFrom(sCMiniGameChangeRsp);
        }
    }

    public interface SCMiniGameCheckRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrorCode();

        CHECK_RESULT getEResult();

        int getIPoolCoin();

        int getVCards(int i);

        int getVCardsCount();

        List<Integer> getVCardsList();

        boolean hasEErrorCode();

        boolean hasEResult();

        boolean hasIPoolCoin();
    }

    public static final class SCMiniGameCheckRsp extends GeneratedMessage implements SCMiniGameCheckRspOrBuilder {
        public static final int EERRORCODE_FIELD_NUMBER = 1;
        public static final int ERESULT_FIELD_NUMBER = 2;
        public static final int IPOOLCOIN_FIELD_NUMBER = 3;
        public static Parser<SCMiniGameCheckRsp> PARSER = null;
        public static final int VCARDS_FIELD_NUMBER = 4;
        private static final SCMiniGameCheckRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrorCode_;
        private CHECK_RESULT eResult_;
        private int iPoolCoin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<Integer> vCards_;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.SCMiniGameCheckRsp.1 */
        class C03691 extends AbstractParser<SCMiniGameCheckRsp> {
            static {
                fixHelper.fixfunc(new int[]{28585, 28586});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03691();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCMiniGameCheckRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrorCode_;
            private CHECK_RESULT eResult_;
            private int iPoolCoin_;
            private List<Integer> vCards_;

            static {
                fixHelper.fixfunc(new int[]{9413, 9414, 9415, 9416, 9417, 9418, 9419, 9420, 9421, 9422, 9423, 9424, 9425, 9426, 9427, 9428, 9429, 9430, 9431, 9432, 9433, 9434, 9435, 9436, 9437, 9438, 9439, 9440, 9441, 9442, 9443, 9444, 9445, 9446, 9447, 9448, 9449, 9450, 9451, 9452, 9453, 9454, 9455, 9456, 9457, 9458, 9459, 9460, 9461, 9462, 9463, 9464});
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

            public final native /* bridge */ /* synthetic */ MessageLite m3381build();

            public final native SCMiniGameCheckRsp m3382build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3383buildPartial();

            public final native SCMiniGameCheckRsp m3384buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3385clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3386clear();

            public final native Builder m3387clear();

            public final native Builder clearEErrorCode();

            public final native Builder clearEResult();

            public final native Builder clearIPoolCoin();

            public final native Builder clearVCards();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3388clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3389clone();

            public final native Builder m3390clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3391getDefaultInstanceForType();

            public final native SCMiniGameCheckRsp m3392getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrorCode();

            public final native CHECK_RESULT getEResult();

            public final native int getIPoolCoin();

            public final native int getVCards(int i);

            public final native int getVCardsCount();

            public final native List<Integer> getVCardsList();

            public final native boolean hasEErrorCode();

            public final native boolean hasEResult();

            public final native boolean hasIPoolCoin();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3393mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3394mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3395mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3396mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3397mergeFrom(Message message);

            public final native Builder mergeFrom(SCMiniGameCheckRsp sCMiniGameCheckRsp);

            public final native Builder setEErrorCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setEResult(CHECK_RESULT check_result);

            public final native Builder setIPoolCoin(int i);

            public final native Builder setVCards(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f340s;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{7723, 7724, 7725, 7726, 7727, 7728, 7729, 7730, 7731, 7732, 7733, 7734, 7735, 7736, 7737, 7738, 7739, 7740, 7741, 7742, 7743, 7744, 7745, 7746, 7747, 7748, 7749, 7750, 7751, 7752, 7753, 7754, 7755});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCMiniGameCheckRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCMiniGameCheckRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCMiniGameCheckRsp sCMiniGameCheckRsp);

        private native SCMiniGameCheckRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCMiniGameCheckRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCMiniGameCheckRsp sCMiniGameCheckRsp);

        private native SCMiniGameCheckRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3374getDefaultInstanceForType();

        public final native SCMiniGameCheckRsp m3375getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrorCode();

        public final native CHECK_RESULT getEResult();

        public final native int getIPoolCoin();

        public final native Parser<SCMiniGameCheckRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native int getVCards(int i);

        public final native int getVCardsCount();

        public final native List<Integer> getVCardsList();

        public final native boolean hasEErrorCode();

        public final native boolean hasEResult();

        public final native boolean hasIPoolCoin();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3376newBuilderForType();

        public final native Builder m3377newBuilderForType();

        protected final native Builder m3378newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3379toBuilder();

        public final native Builder m3380toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCMiniGameCheckRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f340s;
        }

        static void __clinit__() {
            PARSER = new C03691();
            SCMiniGameCheckRsp sCMiniGameCheckRsp = new SCMiniGameCheckRsp(true);
            defaultInstance = sCMiniGameCheckRsp;
            sCMiniGameCheckRsp.initFields();
        }

        public static SCMiniGameCheckRsp parseFrom(ByteString byteString) {
            return (SCMiniGameCheckRsp) PARSER.parseFrom(byteString);
        }

        public static SCMiniGameCheckRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameCheckRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCMiniGameCheckRsp parseFrom(byte[] bArr) {
            return (SCMiniGameCheckRsp) PARSER.parseFrom(bArr);
        }

        public static SCMiniGameCheckRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameCheckRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCMiniGameCheckRsp parseFrom(InputStream inputStream) {
            return (SCMiniGameCheckRsp) PARSER.parseFrom(inputStream);
        }

        public static SCMiniGameCheckRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameCheckRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameCheckRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCMiniGameCheckRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCMiniGameCheckRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameCheckRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameCheckRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCMiniGameCheckRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCMiniGameCheckRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameCheckRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCMiniGameCheckRsp sCMiniGameCheckRsp) {
            return newBuilder().mergeFrom(sCMiniGameCheckRsp);
        }
    }

    public interface SCMiniGameDoubleRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrorCode();

        int getICard();

        boolean hasEErrorCode();

        boolean hasICard();
    }

    public static final class SCMiniGameDoubleRsp extends GeneratedMessage implements SCMiniGameDoubleRspOrBuilder {
        public static final int EERRORCODE_FIELD_NUMBER = 1;
        public static final int ICARD_FIELD_NUMBER = 2;
        public static Parser<SCMiniGameDoubleRsp> PARSER;
        private static final SCMiniGameDoubleRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrorCode_;
        private int iCard_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.SCMiniGameDoubleRsp.1 */
        class C03701 extends AbstractParser<SCMiniGameDoubleRsp> {
            static {
                fixHelper.fixfunc(new int[]{4905, 4906});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03701();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCMiniGameDoubleRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrorCode_;
            private int iCard_;

            static {
                fixHelper.fixfunc(new int[]{16230, 16231, 16232, 16233, 16234, 16235, 16236, 16237, 16238, 16239, 16240, 16241, 16242, 16243, 16244, 16245, 16246, 16247, 16248, 16249, 16250, 16251, 16252, 16253, 16254, 16255, 16256, 16257, 16258, 16259, 16260, 16261, 16262, 16263, 16264, 16265, 16266, 16267, 16268, 16269});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3405build();

            public final native SCMiniGameDoubleRsp m3406build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3407buildPartial();

            public final native SCMiniGameDoubleRsp m3408buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3409clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3410clear();

            public final native Builder m3411clear();

            public final native Builder clearEErrorCode();

            public final native Builder clearICard();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3412clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3413clone();

            public final native Builder m3414clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3415getDefaultInstanceForType();

            public final native SCMiniGameDoubleRsp m3416getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrorCode();

            public final native int getICard();

            public final native boolean hasEErrorCode();

            public final native boolean hasICard();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3417mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3418mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3419mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3420mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3421mergeFrom(Message message);

            public final native Builder mergeFrom(SCMiniGameDoubleRsp sCMiniGameDoubleRsp);

            public final native Builder setEErrorCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setICard(int i);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f336o;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{28678, 28679, 28680, 28681, 28682, 28683, 28684, 28685, 28686, 28687, 28688, 28689, 28690, 28691, 28692, 28693, 28694, 28695, 28696, 28697, 28698, 28699, 28700, 28701, 28702, 28703, 28704, 28705});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCMiniGameDoubleRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCMiniGameDoubleRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCMiniGameDoubleRsp sCMiniGameDoubleRsp);

        private native SCMiniGameDoubleRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCMiniGameDoubleRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCMiniGameDoubleRsp sCMiniGameDoubleRsp);

        private native SCMiniGameDoubleRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3398getDefaultInstanceForType();

        public final native SCMiniGameDoubleRsp m3399getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrorCode();

        public final native int getICard();

        public final native Parser<SCMiniGameDoubleRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrorCode();

        public final native boolean hasICard();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3400newBuilderForType();

        public final native Builder m3401newBuilderForType();

        protected final native Builder m3402newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3403toBuilder();

        public final native Builder m3404toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCMiniGameDoubleRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f336o;
        }

        static void __clinit__() {
            PARSER = new C03701();
            SCMiniGameDoubleRsp sCMiniGameDoubleRsp = new SCMiniGameDoubleRsp(true);
            defaultInstance = sCMiniGameDoubleRsp;
            sCMiniGameDoubleRsp.initFields();
        }

        public static SCMiniGameDoubleRsp parseFrom(ByteString byteString) {
            return (SCMiniGameDoubleRsp) PARSER.parseFrom(byteString);
        }

        public static SCMiniGameDoubleRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameDoubleRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCMiniGameDoubleRsp parseFrom(byte[] bArr) {
            return (SCMiniGameDoubleRsp) PARSER.parseFrom(bArr);
        }

        public static SCMiniGameDoubleRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameDoubleRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCMiniGameDoubleRsp parseFrom(InputStream inputStream) {
            return (SCMiniGameDoubleRsp) PARSER.parseFrom(inputStream);
        }

        public static SCMiniGameDoubleRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameDoubleRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameDoubleRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCMiniGameDoubleRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCMiniGameDoubleRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameDoubleRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameDoubleRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCMiniGameDoubleRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCMiniGameDoubleRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameDoubleRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCMiniGameDoubleRsp sCMiniGameDoubleRsp) {
            return newBuilder().mergeFrom(sCMiniGameDoubleRsp);
        }
    }

    public interface SCMiniGameExitRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrorCode();

        boolean hasEErrorCode();
    }

    public static final class SCMiniGameExitRsp extends GeneratedMessage implements SCMiniGameExitRspOrBuilder {
        public static final int EERRORCODE_FIELD_NUMBER = 1;
        public static Parser<SCMiniGameExitRsp> PARSER;
        private static final SCMiniGameExitRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrorCode_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.SCMiniGameExitRsp.1 */
        class C03711 extends AbstractParser<SCMiniGameExitRsp> {
            static {
                fixHelper.fixfunc(new int[]{4608, 4609});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03711();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCMiniGameExitRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrorCode_;

            static {
                fixHelper.fixfunc(new int[]{30760, 30761, 30762, 30763, 30764, 30765, 30766, 30767, 30768, 30769, 30770, 30771, 30772, 30773, 30774, 30775, 30776, 30777, 30778, 30779, 30780, 30781, 30782, 30783, 30784, 30785, 30786, 30787, 30788, 30789, 30790, 30791, 30792, 30793, 30794, 30795});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void maybeForceBuilderInitialization();

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3429build();

            public final native SCMiniGameExitRsp m3430build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3431buildPartial();

            public final native SCMiniGameExitRsp m3432buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3433clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3434clear();

            public final native Builder m3435clear();

            public final native Builder clearEErrorCode();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3436clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3437clone();

            public final native Builder m3438clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3439getDefaultInstanceForType();

            public final native SCMiniGameExitRsp m3440getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrorCode();

            public final native boolean hasEErrorCode();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3441mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3442mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3443mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3444mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3445mergeFrom(Message message);

            public final native Builder mergeFrom(SCMiniGameExitRsp sCMiniGameExitRsp);

            public final native Builder setEErrorCode(ERROR_CODE_TYPE error_code_type);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f344w;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{14773, 14774, 14775, 14776, 14777, 14778, 14779, 14780, 14781, 14782, 14783, 14784, 14785, 14786, 14787, 14788, 14789, 14790, 14791, 14792, 14793, 14794, 14795, 14796, 14797, 14798});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCMiniGameExitRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCMiniGameExitRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCMiniGameExitRsp sCMiniGameExitRsp);

        private native SCMiniGameExitRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCMiniGameExitRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCMiniGameExitRsp sCMiniGameExitRsp);

        private native SCMiniGameExitRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3422getDefaultInstanceForType();

        public final native SCMiniGameExitRsp m3423getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrorCode();

        public final native Parser<SCMiniGameExitRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native boolean hasEErrorCode();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3424newBuilderForType();

        public final native Builder m3425newBuilderForType();

        protected final native Builder m3426newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3427toBuilder();

        public final native Builder m3428toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCMiniGameExitRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f344w;
        }

        static void __clinit__() {
            PARSER = new C03711();
            SCMiniGameExitRsp sCMiniGameExitRsp = new SCMiniGameExitRsp(true);
            defaultInstance = sCMiniGameExitRsp;
            sCMiniGameExitRsp.initFields();
        }

        public static SCMiniGameExitRsp parseFrom(ByteString byteString) {
            return (SCMiniGameExitRsp) PARSER.parseFrom(byteString);
        }

        public static SCMiniGameExitRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameExitRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCMiniGameExitRsp parseFrom(byte[] bArr) {
            return (SCMiniGameExitRsp) PARSER.parseFrom(bArr);
        }

        public static SCMiniGameExitRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameExitRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCMiniGameExitRsp parseFrom(InputStream inputStream) {
            return (SCMiniGameExitRsp) PARSER.parseFrom(inputStream);
        }

        public static SCMiniGameExitRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameExitRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameExitRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCMiniGameExitRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCMiniGameExitRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameExitRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameExitRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCMiniGameExitRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCMiniGameExitRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameExitRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCMiniGameExitRsp sCMiniGameExitRsp) {
            return newBuilder().mergeFrom(sCMiniGameExitRsp);
        }
    }

    public interface SCMiniGameIniRspOrBuilder extends MessageOrBuilder {
        TEXAS_CMD getECmd();

        PATTERNS_TYPE getECmdChangePattern();

        CHECK_RESULT getECmdCheckResult();

        ERROR_CODE_TYPE getEErrorCode();

        int getICmdCheckSeq();

        int getICmdDoubleCard();

        int getICurCoin();

        int getIFlag();

        int getIPoolCoin();

        int getVCmdChangeCards(int i);

        int getVCmdChangeCardsCount();

        List<Integer> getVCmdChangeCardsList();

        int getVCmdChangeSeqs(int i);

        int getVCmdChangeSeqsCount();

        List<Integer> getVCmdChangeSeqsList();

        int getVCmdCheckCards(int i);

        int getVCmdCheckCardsCount();

        List<Integer> getVCmdCheckCardsList();

        int getVCmdStartCards(int i);

        int getVCmdStartCardsCount();

        List<Integer> getVCmdStartCardsList();

        boolean hasECmd();

        boolean hasECmdChangePattern();

        boolean hasECmdCheckResult();

        boolean hasEErrorCode();

        boolean hasICmdCheckSeq();

        boolean hasICmdDoubleCard();

        boolean hasICurCoin();

        boolean hasIFlag();

        boolean hasIPoolCoin();
    }

    public static final class SCMiniGameIniRsp extends GeneratedMessage implements SCMiniGameIniRspOrBuilder {
        public static final int ECMD_CHANGE_PATTERN_FIELD_NUMBER = 7;
        public static final int ECMD_CHECK_RESULT_FIELD_NUMBER = 11;
        public static final int ECMD_FIELD_NUMBER = 3;
        public static final int EERRORCODE_FIELD_NUMBER = 1;
        public static final int ICMD_CHECK_SEQ_FIELD_NUMBER = 12;
        public static final int ICMD_DOUBLE_CARD_FIELD_NUMBER = 10;
        public static final int ICURCOIN_FIELD_NUMBER = 5;
        public static final int IFLAG_FIELD_NUMBER = 2;
        public static final int IPOOLCOIN_FIELD_NUMBER = 4;
        public static Parser<SCMiniGameIniRsp> PARSER = null;
        public static final int VCMD_CHANGE_CARDS_FIELD_NUMBER = 9;
        public static final int VCMD_CHANGE_SEQS_FIELD_NUMBER = 8;
        public static final int VCMD_CHECK_CARDS_FIELD_NUMBER = 13;
        public static final int VCMD_START_CARDS_FIELD_NUMBER = 6;
        private static final SCMiniGameIniRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private PATTERNS_TYPE eCmdChangePattern_;
        private CHECK_RESULT eCmdCheckResult_;
        private TEXAS_CMD eCmd_;
        private ERROR_CODE_TYPE eErrorCode_;
        private int iCmdCheckSeq_;
        private int iCmdDoubleCard_;
        private int iCurCoin_;
        private int iFlag_;
        private int iPoolCoin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<Integer> vCmdChangeCards_;
        private List<Integer> vCmdChangeSeqs_;
        private List<Integer> vCmdCheckCards_;
        private List<Integer> vCmdStartCards_;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.SCMiniGameIniRsp.1 */
        class C03721 extends AbstractParser<SCMiniGameIniRsp> {
            static {
                fixHelper.fixfunc(new int[]{16417, 16418});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03721();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCMiniGameIniRspOrBuilder {
            private int bitField0_;
            private PATTERNS_TYPE eCmdChangePattern_;
            private CHECK_RESULT eCmdCheckResult_;
            private TEXAS_CMD eCmd_;
            private ERROR_CODE_TYPE eErrorCode_;
            private int iCmdCheckSeq_;
            private int iCmdDoubleCard_;
            private int iCurCoin_;
            private int iFlag_;
            private int iPoolCoin_;
            private List<Integer> vCmdChangeCards_;
            private List<Integer> vCmdChangeSeqs_;
            private List<Integer> vCmdCheckCards_;
            private List<Integer> vCmdStartCards_;

            static {
                fixHelper.fixfunc(new int[]{25292, 25293, 25294, 25295, 25296, 25297, 25298, 25299, 25300, 25301, 25302, 25303, 25304, 25305, 25306, 25307, 25308, 25309, 25310, 25311, 25312, 25313, 25314, 25315, 25316, 25317, 25318, 25319, 25320, 25321, 25322, 25323, 25324, 25325, 25326, 25327, 25328, 25329, 25330, 25331, 25332, 25333, 25334, 25335, 25336, 25337, 25338, 25339, 25340, 25341, 25342, 25343, 25344, 25345, 25346, 25347, 25348, 25349, 25350, 25351, 25352, 25353, 25354, 25355, 25356, 25357, 25358, 25359, 25360, 25361, 25362, 25363, 25364, 25365, 25366, 25367, 25368, 25369, 25370, 25371, 25372, 25373, 25374, 25375, 25376, 25377, 25378, 25379, 25380, 25381, 25382, 25383, 25384, 25385, 25386, 25387, 25388, 25389, 25390, 25391});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            private native Builder();

            private native Builder(BuilderParent builderParent);

            native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

            private native void ensureVCmdChangeCardsIsMutable();

            private native void ensureVCmdChangeSeqsIsMutable();

            private native void ensureVCmdCheckCardsIsMutable();

            private native void ensureVCmdStartCardsIsMutable();

            private native void maybeForceBuilderInitialization();

            public final native Builder addAllVCmdChangeCards(Iterable<? extends Integer> iterable);

            public final native Builder addAllVCmdChangeSeqs(Iterable<? extends Integer> iterable);

            public final native Builder addAllVCmdCheckCards(Iterable<? extends Integer> iterable);

            public final native Builder addAllVCmdStartCards(Iterable<? extends Integer> iterable);

            public final native Builder addVCmdChangeCards(int i);

            public final native Builder addVCmdChangeSeqs(int i);

            public final native Builder addVCmdCheckCards(int i);

            public final native Builder addVCmdStartCards(int i);

            public final native /* bridge */ /* synthetic */ Message build();

            public final native /* bridge */ /* synthetic */ MessageLite m3453build();

            public final native SCMiniGameIniRsp m3454build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3455buildPartial();

            public final native SCMiniGameIniRsp m3456buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3457clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3458clear();

            public final native Builder m3459clear();

            public final native Builder clearECmd();

            public final native Builder clearECmdChangePattern();

            public final native Builder clearECmdCheckResult();

            public final native Builder clearEErrorCode();

            public final native Builder clearICmdCheckSeq();

            public final native Builder clearICmdDoubleCard();

            public final native Builder clearICurCoin();

            public final native Builder clearIFlag();

            public final native Builder clearIPoolCoin();

            public final native Builder clearVCmdChangeCards();

            public final native Builder clearVCmdChangeSeqs();

            public final native Builder clearVCmdCheckCards();

            public final native Builder clearVCmdStartCards();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3460clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3461clone();

            public final native Builder m3462clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3463getDefaultInstanceForType();

            public final native SCMiniGameIniRsp m3464getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native TEXAS_CMD getECmd();

            public final native PATTERNS_TYPE getECmdChangePattern();

            public final native CHECK_RESULT getECmdCheckResult();

            public final native ERROR_CODE_TYPE getEErrorCode();

            public final native int getICmdCheckSeq();

            public final native int getICmdDoubleCard();

            public final native int getICurCoin();

            public final native int getIFlag();

            public final native int getIPoolCoin();

            public final native int getVCmdChangeCards(int i);

            public final native int getVCmdChangeCardsCount();

            public final native List<Integer> getVCmdChangeCardsList();

            public final native int getVCmdChangeSeqs(int i);

            public final native int getVCmdChangeSeqsCount();

            public final native List<Integer> getVCmdChangeSeqsList();

            public final native int getVCmdCheckCards(int i);

            public final native int getVCmdCheckCardsCount();

            public final native List<Integer> getVCmdCheckCardsList();

            public final native int getVCmdStartCards(int i);

            public final native int getVCmdStartCardsCount();

            public final native List<Integer> getVCmdStartCardsList();

            public final native boolean hasECmd();

            public final native boolean hasECmdChangePattern();

            public final native boolean hasECmdCheckResult();

            public final native boolean hasEErrorCode();

            public final native boolean hasICmdCheckSeq();

            public final native boolean hasICmdDoubleCard();

            public final native boolean hasICurCoin();

            public final native boolean hasIFlag();

            public final native boolean hasIPoolCoin();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3465mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3466mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3467mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3468mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3469mergeFrom(Message message);

            public final native Builder mergeFrom(SCMiniGameIniRsp sCMiniGameIniRsp);

            public final native Builder setECmd(TEXAS_CMD texas_cmd);

            public final native Builder setECmdChangePattern(PATTERNS_TYPE patterns_type);

            public final native Builder setECmdCheckResult(CHECK_RESULT check_result);

            public final native Builder setEErrorCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setICmdCheckSeq(int i);

            public final native Builder setICmdDoubleCard(int i);

            public final native Builder setICurCoin(int i);

            public final native Builder setIFlag(int i);

            public final native Builder setIPoolCoin(int i);

            public final native Builder setVCmdChangeCards(int i, int i2);

            public final native Builder setVCmdChangeSeqs(int i, int i2);

            public final native Builder setVCmdCheckCards(int i, int i2);

            public final native Builder setVCmdStartCards(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f324c;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{9720, 9721, 9722, 9723, 9724, 9725, 9726, 9727, 9728, 9729, 9730, 9731, 9732, 9733, 9734, 9735, 9736, 9737, 9738, 9739, 9740, 9741, 9742, 9743, 9744, 9745, 9746, 9747, 9748, 9749, 9750, 9751, 9752, 9753, 9754, 9755, 9756, 9757, 9758, 9759, 9760, 9761, 9762, 9763, 9764, 9765, 9766, 9767, 9768, 9769, 9770, 9771, 9772, 9773});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCMiniGameIniRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCMiniGameIniRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCMiniGameIniRsp sCMiniGameIniRsp);

        private native SCMiniGameIniRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCMiniGameIniRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCMiniGameIniRsp sCMiniGameIniRsp);

        private native SCMiniGameIniRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3446getDefaultInstanceForType();

        public final native SCMiniGameIniRsp m3447getDefaultInstanceForType();

        public final native TEXAS_CMD getECmd();

        public final native PATTERNS_TYPE getECmdChangePattern();

        public final native CHECK_RESULT getECmdCheckResult();

        public final native ERROR_CODE_TYPE getEErrorCode();

        public final native int getICmdCheckSeq();

        public final native int getICmdDoubleCard();

        public final native int getICurCoin();

        public final native int getIFlag();

        public final native int getIPoolCoin();

        public final native Parser<SCMiniGameIniRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native int getVCmdChangeCards(int i);

        public final native int getVCmdChangeCardsCount();

        public final native List<Integer> getVCmdChangeCardsList();

        public final native int getVCmdChangeSeqs(int i);

        public final native int getVCmdChangeSeqsCount();

        public final native List<Integer> getVCmdChangeSeqsList();

        public final native int getVCmdCheckCards(int i);

        public final native int getVCmdCheckCardsCount();

        public final native List<Integer> getVCmdCheckCardsList();

        public final native int getVCmdStartCards(int i);

        public final native int getVCmdStartCardsCount();

        public final native List<Integer> getVCmdStartCardsList();

        public final native boolean hasECmd();

        public final native boolean hasECmdChangePattern();

        public final native boolean hasECmdCheckResult();

        public final native boolean hasEErrorCode();

        public final native boolean hasICmdCheckSeq();

        public final native boolean hasICmdDoubleCard();

        public final native boolean hasICurCoin();

        public final native boolean hasIFlag();

        public final native boolean hasIPoolCoin();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3448newBuilderForType();

        public final native Builder m3449newBuilderForType();

        protected final native Builder m3450newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3451toBuilder();

        public final native Builder m3452toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCMiniGameIniRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f324c;
        }

        static void __clinit__() {
            PARSER = new C03721();
            SCMiniGameIniRsp sCMiniGameIniRsp = new SCMiniGameIniRsp(true);
            defaultInstance = sCMiniGameIniRsp;
            sCMiniGameIniRsp.initFields();
        }

        public static SCMiniGameIniRsp parseFrom(ByteString byteString) {
            return (SCMiniGameIniRsp) PARSER.parseFrom(byteString);
        }

        public static SCMiniGameIniRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameIniRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCMiniGameIniRsp parseFrom(byte[] bArr) {
            return (SCMiniGameIniRsp) PARSER.parseFrom(bArr);
        }

        public static SCMiniGameIniRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameIniRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCMiniGameIniRsp parseFrom(InputStream inputStream) {
            return (SCMiniGameIniRsp) PARSER.parseFrom(inputStream);
        }

        public static SCMiniGameIniRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameIniRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameIniRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCMiniGameIniRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCMiniGameIniRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameIniRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameIniRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCMiniGameIniRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCMiniGameIniRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameIniRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCMiniGameIniRsp sCMiniGameIniRsp) {
            return newBuilder().mergeFrom(sCMiniGameIniRsp);
        }
    }

    public interface SCMiniGameStartRspOrBuilder extends MessageOrBuilder {
        ERROR_CODE_TYPE getEErrorCode();

        int getICurCoin();

        int getVCards(int i);

        int getVCardsCount();

        List<Integer> getVCardsList();

        boolean hasEErrorCode();

        boolean hasICurCoin();
    }

    public static final class SCMiniGameStartRsp extends GeneratedMessage implements SCMiniGameStartRspOrBuilder {
        public static final int EERRORCODE_FIELD_NUMBER = 1;
        public static final int ICURCOIN_FIELD_NUMBER = 3;
        public static Parser<SCMiniGameStartRsp> PARSER = null;
        public static final int VCARDS_FIELD_NUMBER = 2;
        private static final SCMiniGameStartRsp defaultInstance = null;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ERROR_CODE_TYPE eErrorCode_;
        private int iCurCoin_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final UnknownFieldSet unknownFields;
        private List<Integer> vCards_;

        /* renamed from: com.texaspoker.moment.TexasPokerMiniGame.SCMiniGameStartRsp.1 */
        class C03731 extends AbstractParser<SCMiniGameStartRsp> {
            static {
                fixHelper.fixfunc(new int[]{14447, 14448});
                if (VERSION.SDK_INT <= 0) {
                    Exists0.class.toString();
                }
            }

            native C03731();

            public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements SCMiniGameStartRspOrBuilder {
            private int bitField0_;
            private ERROR_CODE_TYPE eErrorCode_;
            private int iCurCoin_;
            private List<Integer> vCards_;

            static {
                fixHelper.fixfunc(new int[]{15271, 15272, 15273, 15274, 15275, 15276, 15277, 15278, 15279, 15280, 15281, 15282, 15283, 15284, 15285, 15286, 15287, 15288, 15289, 15290, 15291, 15292, 15293, 15294, 15295, 15296, 15297, 15298, 15299, 15300, 15301, 15302, 15303, 15304, 15305, 15306, 15307, 15308, 15309, 15310, 15311, 15312, 15313, 15314, 15315, 15316, 15317, 15318});
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

            public final native /* bridge */ /* synthetic */ MessageLite m3477build();

            public final native SCMiniGameStartRsp m3478build();

            public final native /* bridge */ /* synthetic */ Message buildPartial();

            public final native /* bridge */ /* synthetic */ MessageLite m3479buildPartial();

            public final native SCMiniGameStartRsp m3480buildPartial();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3481clear();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3482clear();

            public final native Builder m3483clear();

            public final native Builder clearEErrorCode();

            public final native Builder clearICurCoin();

            public final native Builder clearVCards();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3484clone();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3485clone();

            public final native Builder m3486clone();

            public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

            public final native /* bridge */ /* synthetic */ MessageLite m3487getDefaultInstanceForType();

            public final native SCMiniGameStartRsp m3488getDefaultInstanceForType();

            public final native Descriptor getDescriptorForType();

            public final native ERROR_CODE_TYPE getEErrorCode();

            public final native int getICurCoin();

            public final native int getVCards(int i);

            public final native int getVCardsCount();

            public final native List<Integer> getVCardsList();

            public final native boolean hasEErrorCode();

            public final native boolean hasICurCoin();

            protected final native FieldAccessorTable internalGetFieldAccessorTable();

            public final native boolean isInitialized();

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3489mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m3490mergeFrom(Message message);

            public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3491mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3492mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

            public final native Builder m3493mergeFrom(Message message);

            public final native Builder mergeFrom(SCMiniGameStartRsp sCMiniGameStartRsp);

            public final native Builder setEErrorCode(ERROR_CODE_TYPE error_code_type);

            public final native Builder setICurCoin(int i);

            public final native Builder setVCards(int i, int i2);

            public static final Descriptor getDescriptor() {
                return TexasPokerMiniGame.f328g;
            }

            private static Builder create() {
                return new Builder();
            }
        }

        static {
            fixHelper.fixfunc(new int[]{13120, 13121, 13122, 13123, 13124, 13125, 13126, 13127, 13128, 13129, 13130, 13131, 13132, 13133, 13134, 13135, 13136, 13137, 13138, 13139, 13140, 13141, 13142, 13143, 13144, 13145, 13146, 13147, 13148, 13149, 13150});
            __clinit__();
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native SCMiniGameStartRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        native /* synthetic */ SCMiniGameStartRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, SCMiniGameStartRsp sCMiniGameStartRsp);

        private native SCMiniGameStartRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

        native /* synthetic */ SCMiniGameStartRsp(com.google.protobuf.GeneratedMessage.Builder builder, SCMiniGameStartRsp sCMiniGameStartRsp);

        private native SCMiniGameStartRsp(boolean z);

        private native void initFields();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m3470getDefaultInstanceForType();

        public final native SCMiniGameStartRsp m3471getDefaultInstanceForType();

        public final native ERROR_CODE_TYPE getEErrorCode();

        public final native int getICurCoin();

        public final native Parser<SCMiniGameStartRsp> getParserForType();

        public final native int getSerializedSize();

        public final native UnknownFieldSet getUnknownFields();

        public final native int getVCards(int i);

        public final native int getVCardsCount();

        public final native List<Integer> getVCardsList();

        public final native boolean hasEErrorCode();

        public final native boolean hasICurCoin();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

        protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3472newBuilderForType();

        public final native Builder m3473newBuilderForType();

        protected final native Builder m3474newBuilderForType(BuilderParent builderParent);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m3475toBuilder();

        public final native Builder m3476toBuilder();

        protected final native Object writeReplace();

        public final native void writeTo(CodedOutputStream codedOutputStream);

        public static SCMiniGameStartRsp getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptor getDescriptor() {
            return TexasPokerMiniGame.f328g;
        }

        static void __clinit__() {
            PARSER = new C03731();
            SCMiniGameStartRsp sCMiniGameStartRsp = new SCMiniGameStartRsp(true);
            defaultInstance = sCMiniGameStartRsp;
            sCMiniGameStartRsp.initFields();
        }

        public static SCMiniGameStartRsp parseFrom(ByteString byteString) {
            return (SCMiniGameStartRsp) PARSER.parseFrom(byteString);
        }

        public static SCMiniGameStartRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameStartRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SCMiniGameStartRsp parseFrom(byte[] bArr) {
            return (SCMiniGameStartRsp) PARSER.parseFrom(bArr);
        }

        public static SCMiniGameStartRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameStartRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SCMiniGameStartRsp parseFrom(InputStream inputStream) {
            return (SCMiniGameStartRsp) PARSER.parseFrom(inputStream);
        }

        public static SCMiniGameStartRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameStartRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameStartRsp parseDelimitedFrom(InputStream inputStream) {
            return (SCMiniGameStartRsp) PARSER.parseDelimitedFrom(inputStream);
        }

        public static SCMiniGameStartRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameStartRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public static SCMiniGameStartRsp parseFrom(CodedInputStream codedInputStream) {
            return (SCMiniGameStartRsp) PARSER.parseFrom(codedInputStream);
        }

        public static SCMiniGameStartRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SCMiniGameStartRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static Builder newBuilder(SCMiniGameStartRsp sCMiniGameStartRsp) {
            return newBuilder().mergeFrom(sCMiniGameStartRsp);
        }
    }

    public static FileDescriptor m330a() {
        return f346y;
    }

    static {
        FileDescriptor[] fileDescriptorArr = new FileDescriptor[]{TexasPokerCommon.m11a(), TexasPokerCmd.m0a()};
        FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018TexasPokerMiniGame.proto\u0012\ntexaspoker\u001a\u0016TexasPokerCommon.proto\u001a\u0013TexasPokerCmd.proto\"\u001d\n\rCSMiniGameIni\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"\u00a4\u0003\n\u0010SCMiniGameIniRsp\u0012/\n\neErrorCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\r\n\u0005iFlag\u0018\u0002 \u0002(\u0005\u0012#\n\u0004eCmd\u0018\u0003 \u0001(\u000e2\u0015.texaspoker.TEXAS_CMD\u0012\u0011\n\tiPoolCoin\u0018\u0004 \u0001(\u0005\u0012\u0010\n\biCurCoin\u0018\u0005 \u0001(\u0005\u0012\u0018\n\u0010vCmd_start_cards\u0018\u0006 \u0003(\u0005\u00126\n\u0013eCmd_change_pattern\u0018\u0007 \u0001(\u000e2\u0019.texaspoker.PATTERNS_TYPE\u0012\u0018\n\u0010vCmd_change_seqs\u0018\b \u0003(\u0005\u0012\u0019\n\u0011vCmd_change_car", "ds\u0018\t \u0003(\u0005\u0012\u0018\n\u0010iCmd_double_card\u0018\n \u0001(\u0005\u00123\n\u0011eCmd_check_result\u0018\u000b \u0001(\u000e2\u0018.texaspoker.CHECK_RESULT\u0012\u0016\n\u000eiCmd_check_seq\u0018\f \u0001(\u0005\u0012\u0018\n\u0010vCmd_check_cards\u0018\r \u0003(\u0005\"-\n\u000fCSMiniGameStart\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004iBet\u0018\u0002 \u0002(\u0005\"g\n\u0012SCMiniGameStartRsp\u0012/\n\neErrorCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\u000e\n\u0006vCards\u0018\u0002 \u0003(\u0005\u0012\u0010\n\biCurCoin\u0018\u0003 \u0001(\u0005\"/\n\u0010CSMiniGameChange\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\r\n\u0005vSeqs\u0018\u0002 \u0003(\u0005\"\u0096\u0001\n\u0013SCMiniGameChangeRsp\u0012/\n\neErrorCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERRO", "R_CODE_TYPE\u0012\u0011\n\tiPoolCoin\u0018\u0002 \u0001(\u0005\u0012+\n\bePattern\u0018\u0003 \u0001(\u000e2\u0019.texaspoker.PATTERNS_TYPE\u0012\u000e\n\u0006vCards\u0018\u0004 \u0003(\u0005\" \n\u0010CSMiniGameDouble\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"U\n\u0013SCMiniGameDoubleRsp\u0012/\n\neErrorCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012\r\n\u0005iCard\u0018\u0002 \u0001(\u0005\"-\n\u000fCSMiniGameCheck\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\u0012\f\n\u0004iSeq\u0018\u0002 \u0002(\u0005\"\u0093\u0001\n\u0012SCMiniGameCheckRsp\u0012/\n\neErrorCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE\u0012)\n\u0007eResult\u0018\u0002 \u0001(\u000e2\u0018.texaspoker.CHECK_RESULT\u0012\u0011\n\tiPoolCoin\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006vCa", "rds\u0018\u0004 \u0003(\u0005\"\u001e\n\u000eCSMiniGameExit\u0012\f\n\u0004uuid\u0018\u0001 \u0002(\u0003\"D\n\u0011SCMiniGameExitRsp\u0012/\n\neErrorCode\u0018\u0001 \u0002(\u000e2\u001b.texaspoker.ERROR_CODE_TYPE*\u00b9\u0001\n\rPATTERNS_TYPE\u0012\t\n\u0004NONE\u0010\u00a8F\u0012\u0010\n\u000bONE_PAIR_JJ\u0010\u00a9F\u0012\r\n\bTWO_PAIR\u0010\u00aaF\u0012\u0014\n\u000fTHREE_OF_A_KIND\u0010\u00abF\u0012\r\n\bSTRAIGHT\u0010\u00acF\u0012\n\n\u0005FLUSH\u0010\u00adF\u0012\u000f\n\nFULL_HOUSE\u0010\u00aeF\u0012\u0013\n\u000eFOUR_OF_A_KIND\u0010\u00afF\u0012\u0013\n\u000eSTRAIGHT_FLUSH\u0010\u00b0F\u0012\u0010\n\u000bROYAL_FLUSH\u0010\u00b1F*C\n\fCHECK_RESULT\u0012\u0010\n\u000bRESULT_LOST\u0010\u00a8F\u0012\u000f\n\nRESULT_WIN\u0010\u00a9F\u0012\u0010\n\u000bRESULT_DRAW\u0010\u00aaFB+\n\u0015com.texaspoker.momentB\u0012Texas", "PokerMiniGame"}, fileDescriptorArr, new C03591());
        f322a = (Descriptor) f346y.getMessageTypes().get(0);
        f323b = new FieldAccessorTable(f322a, new String[]{"Uuid"});
        f324c = (Descriptor) f346y.getMessageTypes().get(1);
        f325d = new FieldAccessorTable(f324c, new String[]{"EErrorCode", "IFlag", "ECmd", "IPoolCoin", "ICurCoin", "VCmdStartCards", "ECmdChangePattern", "VCmdChangeSeqs", "VCmdChangeCards", "ICmdDoubleCard", "ECmdCheckResult", "ICmdCheckSeq", "VCmdCheckCards"});
        f326e = (Descriptor) f346y.getMessageTypes().get(2);
        f327f = new FieldAccessorTable(f326e, new String[]{"Uuid", "IBet"});
        f328g = (Descriptor) f346y.getMessageTypes().get(3);
        f329h = new FieldAccessorTable(f328g, new String[]{"EErrorCode", "VCards", "ICurCoin"});
        f330i = (Descriptor) f346y.getMessageTypes().get(4);
        f331j = new FieldAccessorTable(f330i, new String[]{"Uuid", "VSeqs"});
        f332k = (Descriptor) f346y.getMessageTypes().get(5);
        f333l = new FieldAccessorTable(f332k, new String[]{"EErrorCode", "IPoolCoin", "EPattern", "VCards"});
        f334m = (Descriptor) f346y.getMessageTypes().get(6);
        f335n = new FieldAccessorTable(f334m, new String[]{"Uuid"});
        f336o = (Descriptor) f346y.getMessageTypes().get(7);
        f337p = new FieldAccessorTable(f336o, new String[]{"EErrorCode", "ICard"});
        f338q = (Descriptor) f346y.getMessageTypes().get(8);
        f339r = new FieldAccessorTable(f338q, new String[]{"Uuid", "ISeq"});
        f340s = (Descriptor) f346y.getMessageTypes().get(9);
        f341t = new FieldAccessorTable(f340s, new String[]{"EErrorCode", "EResult", "IPoolCoin", "VCards"});
        f342u = (Descriptor) f346y.getMessageTypes().get(10);
        f343v = new FieldAccessorTable(f342u, new String[]{"Uuid"});
        f344w = (Descriptor) f346y.getMessageTypes().get(11);
        f345x = new FieldAccessorTable(f344w, new String[]{"EErrorCode"});
        TexasPokerCommon.m11a();
        TexasPokerCmd.m0a();
    }
}
