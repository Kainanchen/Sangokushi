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
import com.google.protobuf.UnknownFieldSet;
import com.texaspoker.moment.TexasPoker.CHAT_TYPE;
import com.texaspoker.moment.TexasPokerCommon.ERROR_CODE_TYPE;
import java.io.InputStream;

public final class TexasPoker$SCSetChatInfoSettingRsp extends GeneratedMessage implements TexasPoker$SCSetChatInfoSettingRspOrBuilder {
    public static final int CHATUUID_FIELD_NUMBER = 4;
    public static final int ECHATTYPE_FIELD_NUMBER = 2;
    public static final int EERRCODE_FIELD_NUMBER = 1;
    public static final int IMUTE_FIELD_NUMBER = 5;
    public static final int IVIBRATE_FIELD_NUMBER = 6;
    public static final int LROOMID_FIELD_NUMBER = 3;
    public static Parser<TexasPoker$SCSetChatInfoSettingRsp> PARSER;
    private static final TexasPoker$SCSetChatInfoSettingRsp defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private long chatUuid_;
    private CHAT_TYPE eChatType_;
    private ERROR_CODE_TYPE eErrCode_;
    private int iMute_;
    private int iVibrate_;
    private long lRoomID_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final UnknownFieldSet unknownFields;

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetChatInfoSettingRsp.1 */
    class C00431 extends AbstractParser<TexasPoker$SCSetChatInfoSettingRsp> {
        static {
            fixHelper.fixfunc(new int[]{28441, 28442});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00431();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SCSetChatInfoSettingRsp.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SCSetChatInfoSettingRspOrBuilder {
        private int bitField0_;
        private long chatUuid_;
        private CHAT_TYPE eChatType_;
        private ERROR_CODE_TYPE eErrCode_;
        private int iMute_;
        private int iVibrate_;
        private long lRoomID_;

        static {
            fixHelper.fixfunc(new int[]{29706, 29707, 29708, 29709, 29710, 29711, 29712, 29713, 29714, 29715, 29716, 29717, 29718, 29719, 29720, 29721, 29722, 29723, 29724, 29725, 29726, 29727, 29728, 29729, 29730, 29731, 29732, 29733, 29734, 29735, 29736, 29737, 29738, 29739, 29740, 29741, 29742, 29743, 29744, 29745, 29746, 29747, 29748, 29749, 29750, 29751, 29752, 29753, 29754, 29755, 29756, 29757, 29758, 29759, 29760, 29761});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void maybeForceBuilderInitialization();

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m2037build();

        public final native TexasPoker$SCSetChatInfoSettingRsp m2038build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m2039buildPartial();

        public final native TexasPoker$SCSetChatInfoSettingRsp m2040buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2041clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2042clear();

        public final native Builder m2043clear();

        public final native Builder clearChatUuid();

        public final native Builder clearEChatType();

        public final native Builder clearEErrCode();

        public final native Builder clearIMute();

        public final native Builder clearIVibrate();

        public final native Builder clearLRoomID();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2044clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2045clone();

        public final native Builder m2046clone();

        public final native long getChatUuid();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m2047getDefaultInstanceForType();

        public final native TexasPoker$SCSetChatInfoSettingRsp m2048getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native CHAT_TYPE getEChatType();

        public final native ERROR_CODE_TYPE getEErrCode();

        public final native int getIMute();

        public final native int getIVibrate();

        public final native long getLRoomID();

        public final native boolean hasChatUuid();

        public final native boolean hasEChatType();

        public final native boolean hasEErrCode();

        public final native boolean hasIMute();

        public final native boolean hasIVibrate();

        public final native boolean hasLRoomID();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2049mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m2050mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2051mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2052mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m2053mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SCSetChatInfoSettingRsp texasPoker$SCSetChatInfoSettingRsp);

        public final native Builder setChatUuid(long j);

        public final native Builder setEChatType(CHAT_TYPE chat_type);

        public final native Builder setEErrCode(ERROR_CODE_TYPE error_code_type);

        public final native Builder setIMute(int i);

        public final native Builder setIVibrate(int i);

        public final native Builder setLRoomID(long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.bz();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{4449, 4450, 4451, 4452, 4453, 4454, 4455, 4456, 4457, 4458, 4459, 4460, 4461, 4462, 4463, 4464, 4465, 4466, 4467, 4468, 4469, 4470, 4471, 4472, 4473, 4474, 4475, 4476, 4477, 4478, 4479, 4480, 4481, 4482, 4483, 4484});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SCSetChatInfoSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SCSetChatInfoSettingRsp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SCSetChatInfoSettingRsp texasPoker$SCSetChatInfoSettingRsp);

    private native TexasPoker$SCSetChatInfoSettingRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SCSetChatInfoSettingRsp(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SCSetChatInfoSettingRsp texasPoker$SCSetChatInfoSettingRsp);

    private native TexasPoker$SCSetChatInfoSettingRsp(boolean z);

    private native void initFields();

    public final native long getChatUuid();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m2024getDefaultInstanceForType();

    public final native TexasPoker$SCSetChatInfoSettingRsp m2026getDefaultInstanceForType();

    public final native CHAT_TYPE getEChatType();

    public final native ERROR_CODE_TYPE getEErrCode();

    public final native int getIMute();

    public final native int getIVibrate();

    public final native long getLRoomID();

    public final native Parser<TexasPoker$SCSetChatInfoSettingRsp> getParserForType();

    public final native int getSerializedSize();

    public final native UnknownFieldSet getUnknownFields();

    public final native boolean hasChatUuid();

    public final native boolean hasEChatType();

    public final native boolean hasEErrCode();

    public final native boolean hasIMute();

    public final native boolean hasIVibrate();

    public final native boolean hasLRoomID();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2028newBuilderForType();

    public final native Builder m2029newBuilderForType();

    protected final native Builder m2031newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m2033toBuilder();

    public final native Builder m2035toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SCSetChatInfoSettingRsp getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.bz();
    }

    static void __clinit__() {
        PARSER = new C00431();
        TexasPoker$SCSetChatInfoSettingRsp texasPoker$SCSetChatInfoSettingRsp = new TexasPoker$SCSetChatInfoSettingRsp(true);
        defaultInstance = texasPoker$SCSetChatInfoSettingRsp;
        texasPoker$SCSetChatInfoSettingRsp.initFields();
    }

    public static TexasPoker$SCSetChatInfoSettingRsp parseFrom(ByteString byteString) {
        return (TexasPoker$SCSetChatInfoSettingRsp) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SCSetChatInfoSettingRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatInfoSettingRsp) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatInfoSettingRsp parseFrom(byte[] bArr) {
        return (TexasPoker$SCSetChatInfoSettingRsp) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SCSetChatInfoSettingRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatInfoSettingRsp) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatInfoSettingRsp parseFrom(InputStream inputStream) {
        return (TexasPoker$SCSetChatInfoSettingRsp) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SCSetChatInfoSettingRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatInfoSettingRsp) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatInfoSettingRsp parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SCSetChatInfoSettingRsp) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SCSetChatInfoSettingRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatInfoSettingRsp) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SCSetChatInfoSettingRsp parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SCSetChatInfoSettingRsp) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SCSetChatInfoSettingRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SCSetChatInfoSettingRsp) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SCSetChatInfoSettingRsp texasPoker$SCSetChatInfoSettingRsp) {
        return newBuilder().mergeFrom(texasPoker$SCSetChatInfoSettingRsp);
    }
}
