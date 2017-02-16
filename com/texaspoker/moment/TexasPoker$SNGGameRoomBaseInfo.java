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
import com.texaspoker.moment.TexasPokerCommon.CREATE_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.SNG_ROOM_TYPE;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet;
import com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNetOrBuilder;
import java.io.InputStream;
import java.util.List;

public final class TexasPoker$SNGGameRoomBaseInfo extends GeneratedMessage implements TexasPoker$SNGGameRoomBaseInfoOrBuilder {
    public static final int BBUYINCONTROL_FIELD_NUMBER = 24;
    public static final int BGPSLIMIT_FIELD_NUMBER = 29;
    public static final int BINGAME_FIELD_NUMBER = 22;
    public static final int BIPLIMIT_FIELD_NUMBER = 28;
    public static final int BLEVELCHANGED_FIELD_NUMBER = 9;
    public static final int BPRIVATEROOM_FIELD_NUMBER = 4;
    public static final int BSIGNUPINVITING_FIELD_NUMBER = 23;
    public static final int BSTARTED_FIELD_NUMBER = 17;
    public static final int ECREATEROOMTYPE_FIELD_NUMBER = 13;
    public static final int ESNGROOMTYPE_FIELD_NUMBER = 20;
    public static final int IANTE_FIELD_NUMBER = 25;
    public static final int IBLINDINTERVAL_FIELD_NUMBER = 12;
    public static final int ICURRENTLEVEL_FIELD_NUMBER = 7;
    public static final int IGAMEROOMUSERMAXNUMS_FIELD_NUMBER = 15;
    public static final int IGAMEROOMUSERNUMS_FIELD_NUMBER = 21;
    public static final int IMAXILEVEL_FIELD_NUMBER = 8;
    public static final int ITHINKINGINTERVAL_FIELD_NUMBER = 32;
    public static final int LBIGBLINDS_FIELD_NUMBER = 6;
    public static final int LCANCELWAITINTERVAL_FIELD_NUMBER = 27;
    public static final int LCREATETIME_FIELD_NUMBER = 18;
    public static final int LFROMROOMID_FIELD_NUMBER = 14;
    public static final int LGAMEROOMID_FIELD_NUMBER = 1;
    public static final int LLEAGUEID_FIELD_NUMBER = 30;
    public static final int LORIGINALSTACKS_FIELD_NUMBER = 11;
    public static final int LPREPARETIME_FIELD_NUMBER = 26;
    public static final int LSMALLBLINDS_FIELD_NUMBER = 5;
    public static final int LSTARTTIME_FIELD_NUMBER = 19;
    public static Parser<TexasPoker$SNGGameRoomBaseInfo> PARSER = null;
    public static final int SFROMMSG_FIELD_NUMBER = 16;
    public static final int SLEAGUENAME_FIELD_NUMBER = 31;
    public static final int STCREATEUSERBASEINFO_FIELD_NUMBER = 3;
    public static final int STRROOMNAME_FIELD_NUMBER = 2;
    public static final int VWINLADDER_FIELD_NUMBER = 10;
    private static final TexasPoker$SNGGameRoomBaseInfo defaultInstance = null;
    private static final long serialVersionUID = 0;
    private int bBuyinControl_;
    private int bGPSLimit_;
    private int bIPLimit_;
    private int bInGame_;
    private int bLevelChanged_;
    private int bPrivateRoom_;
    private int bSignupInviting_;
    private int bStarted_;
    private int bitField0_;
    private CREATE_ROOM_TYPE eCreateRoomType_;
    private SNG_ROOM_TYPE eSNGRoomtype_;
    private int iAnte_;
    private int iBlindInterval_;
    private int iCurrentLevel_;
    private int iGameRoomUserMaxNums_;
    private int iGameRoomUserNums_;
    private int iMaxiLevel_;
    private int iThinkingInterval_;
    private long lBigBlinds_;
    private int lCancelWaitInterval_;
    private long lCreateTime_;
    private long lFromRoomID_;
    private long lGameRoomId_;
    private long lLeagueID_;
    private long lOriginalStacks_;
    private long lPrepareTime_;
    private long lSmallBlinds_;
    private long lStartTime_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private Object sFromMsg_;
    private Object sLeagueName_;
    private UserBaseInfoNet stCreateUserBaseInfo_;
    private Object strRoomName_;
    private final UnknownFieldSet unknownFields;
    private List<Long> vWinLadder_;

    /* renamed from: com.texaspoker.moment.TexasPoker.SNGGameRoomBaseInfo.1 */
    class C00731 extends AbstractParser<TexasPoker$SNGGameRoomBaseInfo> {
        static {
            fixHelper.fixfunc(new int[]{26931, 26932});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00731();

        public final native /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* renamed from: com.texaspoker.moment.TexasPoker.SNGGameRoomBaseInfo.Builder */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder> implements TexasPoker$SNGGameRoomBaseInfoOrBuilder {
        private int bBuyinControl_;
        private int bGPSLimit_;
        private int bIPLimit_;
        private int bInGame_;
        private int bLevelChanged_;
        private int bPrivateRoom_;
        private int bSignupInviting_;
        private int bStarted_;
        private int bitField0_;
        private CREATE_ROOM_TYPE eCreateRoomType_;
        private SNG_ROOM_TYPE eSNGRoomtype_;
        private int iAnte_;
        private int iBlindInterval_;
        private int iCurrentLevel_;
        private int iGameRoomUserMaxNums_;
        private int iGameRoomUserNums_;
        private int iMaxiLevel_;
        private int iThinkingInterval_;
        private long lBigBlinds_;
        private int lCancelWaitInterval_;
        private long lCreateTime_;
        private long lFromRoomID_;
        private long lGameRoomId_;
        private long lLeagueID_;
        private long lOriginalStacks_;
        private long lPrepareTime_;
        private long lSmallBlinds_;
        private long lStartTime_;
        private Object sFromMsg_;
        private Object sLeagueName_;
        private SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> stCreateUserBaseInfoBuilder_;
        private UserBaseInfoNet stCreateUserBaseInfo_;
        private Object strRoomName_;
        private List<Long> vWinLadder_;

        static {
            fixHelper.fixfunc(new int[]{21679, 21680, 21681, 21682, 21683, 21684, 21685, 21686, 21687, 21688, 21689, 21690, 21691, 21692, 21693, 21694, 21695, 21696, 21697, 21698, 21699, 21700, 21701, 21702, 21703, 21704, 21705, 21706, 21707, 21708, 21709, 21710, 21711, 21712, 21713, 21714, 21715, 21716, 21717, 21718, 21719, 21720, 21721, 21722, 21723, 21724, 21725, 21726, 21727, 21728, 21729, 21730, 21731, 21732, 21733, 21734, 21735, 21736, 21737, 21738, 21739, 21740, 21741, 21742, 21743, 21744, 21745, 21746, 21747, 21748, 21749, 21750, 21751, 21752, 21753, 21754, 21755, 21756, 21757, 21758, 21759, 21760, 21761, 21762, 21763, 21764, 21765, 21766, 21767, 21768, 21769, 21770, 21771, 21772, 21773, 21774, 21775, 21776, 21777, 21778, 21779, 21780, 21781, 21782, 21783, 21784, 21785, 21786, 21787, 21788, 21789, 21790, 21791, 21792, 21793, 21794, 21795, 21796, 21797, 21798, 21799, 21800, 21801, 21802, 21803, 21804, 21805, 21806, 21807, 21808, 21809, 21810, 21811, 21812, 21813, 21814, 21815, 21816, 21817, 21818, 21819, 21820, 21821, 21822, 21823, 21824, 21825, 21826, 21827, 21828, 21829, 21830, 21831, 21832, 21833, 21834, 21835, 21836, 21837, 21838, 21839, 21840, 21841, 21842, 21843, 21844, 21845, 21846, 21847, 21848, 21849, 21850, 21851, 21852, 21853});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        private native Builder();

        private native Builder(BuilderParent builderParent);

        native /* synthetic */ Builder(BuilderParent builderParent, Builder builder);

        private native void ensureVWinLadderIsMutable();

        private native SingleFieldBuilder<UserBaseInfoNet, com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder, UserBaseInfoNetOrBuilder> getStCreateUserBaseInfoFieldBuilder();

        private native void maybeForceBuilderInitialization();

        public final native Builder addAllVWinLadder(Iterable<? extends Long> iterable);

        public final native Builder addVWinLadder(long j);

        public final native /* bridge */ /* synthetic */ Message build();

        public final native /* bridge */ /* synthetic */ MessageLite m741build();

        public final native TexasPoker$SNGGameRoomBaseInfo m742build();

        public final native /* bridge */ /* synthetic */ Message buildPartial();

        public final native /* bridge */ /* synthetic */ MessageLite m743buildPartial();

        public final native TexasPoker$SNGGameRoomBaseInfo m744buildPartial();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m745clear();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m746clear();

        public final native Builder m747clear();

        public final native Builder clearBBuyinControl();

        public final native Builder clearBGPSLimit();

        public final native Builder clearBIPLimit();

        public final native Builder clearBInGame();

        public final native Builder clearBLevelChanged();

        public final native Builder clearBPrivateRoom();

        public final native Builder clearBSignupInviting();

        public final native Builder clearBStarted();

        public final native Builder clearECreateRoomType();

        public final native Builder clearESNGRoomtype();

        public final native Builder clearIAnte();

        public final native Builder clearIBlindInterval();

        public final native Builder clearICurrentLevel();

        public final native Builder clearIGameRoomUserMaxNums();

        public final native Builder clearIGameRoomUserNums();

        public final native Builder clearIMaxiLevel();

        public final native Builder clearIThinkingInterval();

        public final native Builder clearLBigBlinds();

        public final native Builder clearLCancelWaitInterval();

        public final native Builder clearLCreateTime();

        public final native Builder clearLFromRoomID();

        public final native Builder clearLGameRoomId();

        public final native Builder clearLLeagueID();

        public final native Builder clearLOriginalStacks();

        public final native Builder clearLPrepareTime();

        public final native Builder clearLSmallBlinds();

        public final native Builder clearLStartTime();

        public final native Builder clearSFromMsg();

        public final native Builder clearSLeagueName();

        public final native Builder clearStCreateUserBaseInfo();

        public final native Builder clearStrRoomName();

        public final native Builder clearVWinLadder();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.GeneratedMessage.Builder clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m748clone();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m749clone();

        public final native Builder m750clone();

        public final native int getBBuyinControl();

        public final native int getBGPSLimit();

        public final native int getBIPLimit();

        public final native int getBInGame();

        public final native int getBLevelChanged();

        public final native int getBPrivateRoom();

        public final native int getBSignupInviting();

        public final native int getBStarted();

        public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

        public final native /* bridge */ /* synthetic */ MessageLite m751getDefaultInstanceForType();

        public final native TexasPoker$SNGGameRoomBaseInfo m752getDefaultInstanceForType();

        public final native Descriptor getDescriptorForType();

        public final native CREATE_ROOM_TYPE getECreateRoomType();

        public final native SNG_ROOM_TYPE getESNGRoomtype();

        public final native int getIAnte();

        public final native int getIBlindInterval();

        public final native int getICurrentLevel();

        public final native int getIGameRoomUserMaxNums();

        public final native int getIGameRoomUserNums();

        public final native int getIMaxiLevel();

        public final native int getIThinkingInterval();

        public final native long getLBigBlinds();

        public final native int getLCancelWaitInterval();

        public final native long getLCreateTime();

        public final native long getLFromRoomID();

        public final native long getLGameRoomId();

        public final native long getLLeagueID();

        public final native long getLOriginalStacks();

        public final native long getLPrepareTime();

        public final native long getLSmallBlinds();

        public final native long getLStartTime();

        public final native String getSFromMsg();

        public final native ByteString getSFromMsgBytes();

        public final native String getSLeagueName();

        public final native ByteString getSLeagueNameBytes();

        public final native UserBaseInfoNet getStCreateUserBaseInfo();

        public final native com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder getStCreateUserBaseInfoBuilder();

        public final native UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

        public final native String getStrRoomName();

        public final native ByteString getStrRoomNameBytes();

        public final native long getVWinLadder(int i);

        public final native int getVWinLadderCount();

        public final native List<Long> getVWinLadderList();

        public final native boolean hasBBuyinControl();

        public final native boolean hasBGPSLimit();

        public final native boolean hasBIPLimit();

        public final native boolean hasBInGame();

        public final native boolean hasBLevelChanged();

        public final native boolean hasBPrivateRoom();

        public final native boolean hasBSignupInviting();

        public final native boolean hasBStarted();

        public final native boolean hasECreateRoomType();

        public final native boolean hasESNGRoomtype();

        public final native boolean hasIAnte();

        public final native boolean hasIBlindInterval();

        public final native boolean hasICurrentLevel();

        public final native boolean hasIGameRoomUserMaxNums();

        public final native boolean hasIGameRoomUserNums();

        public final native boolean hasIMaxiLevel();

        public final native boolean hasIThinkingInterval();

        public final native boolean hasLBigBlinds();

        public final native boolean hasLCancelWaitInterval();

        public final native boolean hasLCreateTime();

        public final native boolean hasLFromRoomID();

        public final native boolean hasLGameRoomId();

        public final native boolean hasLLeagueID();

        public final native boolean hasLOriginalStacks();

        public final native boolean hasLPrepareTime();

        public final native boolean hasLSmallBlinds();

        public final native boolean hasLStartTime();

        public final native boolean hasSFromMsg();

        public final native boolean hasSLeagueName();

        public final native boolean hasStCreateUserBaseInfo();

        public final native boolean hasStrRoomName();

        protected final native FieldAccessorTable internalGetFieldAccessorTable();

        public final native boolean isInitialized();

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.AbstractMessage.Builder mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m753mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder m754mergeFrom(Message message);

        public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m755mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m756mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public final native Builder m757mergeFrom(Message message);

        public final native Builder mergeFrom(TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

        public final native Builder mergeStCreateUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

        public final native Builder setBBuyinControl(int i);

        public final native Builder setBGPSLimit(int i);

        public final native Builder setBIPLimit(int i);

        public final native Builder setBInGame(int i);

        public final native Builder setBLevelChanged(int i);

        public final native Builder setBPrivateRoom(int i);

        public final native Builder setBSignupInviting(int i);

        public final native Builder setBStarted(int i);

        public final native Builder setECreateRoomType(CREATE_ROOM_TYPE create_room_type);

        public final native Builder setESNGRoomtype(SNG_ROOM_TYPE sng_room_type);

        public final native Builder setIAnte(int i);

        public final native Builder setIBlindInterval(int i);

        public final native Builder setICurrentLevel(int i);

        public final native Builder setIGameRoomUserMaxNums(int i);

        public final native Builder setIGameRoomUserNums(int i);

        public final native Builder setIMaxiLevel(int i);

        public final native Builder setIThinkingInterval(int i);

        public final native Builder setLBigBlinds(long j);

        public final native Builder setLCancelWaitInterval(int i);

        public final native Builder setLCreateTime(long j);

        public final native Builder setLFromRoomID(long j);

        public final native Builder setLGameRoomId(long j);

        public final native Builder setLLeagueID(long j);

        public final native Builder setLOriginalStacks(long j);

        public final native Builder setLPrepareTime(long j);

        public final native Builder setLSmallBlinds(long j);

        public final native Builder setLStartTime(long j);

        public final native Builder setSFromMsg(String str);

        public final native Builder setSFromMsgBytes(ByteString byteString);

        public final native Builder setSLeagueName(String str);

        public final native Builder setSLeagueNameBytes(ByteString byteString);

        public final native Builder setStCreateUserBaseInfo(com.texaspoker.moment.TexasPokerCommon.UserBaseInfoNet.Builder builder);

        public final native Builder setStCreateUserBaseInfo(UserBaseInfoNet userBaseInfoNet);

        public final native Builder setStrRoomName(String str);

        public final native Builder setStrRoomNameBytes(ByteString byteString);

        public final native Builder setVWinLadder(int i, long j);

        public static final Descriptor getDescriptor() {
            return TexasPoker.bD();
        }

        private static Builder create() {
            return new Builder();
        }
    }

    static {
        fixHelper.fixfunc(new int[]{28953, 28954, 28955, 28956, 28957, 28958, 28959, 28960, 28961, 28962, 28963, 28964, 28965, 28966, 28967, 28968, 28969, 28970, 28971, 28972, 28973, 28974, 28975, 28976, 28977, 28978, 28979, 28980, 28981, 28982, 28983, 28984, 28985, 28986, 28987, 28988, 28989, 28990, 28991, 28992, 28993, 28994, 28995, 28996, 28997, 28998, 28999, 29000, 29001, 29002, 29003, 29004, 29005, 29006, 29007, 29008, 29009, 29010, 29011, 29012, 29013, 29014, 29015, 29016, 29017, 29018, 29019, 29020, 29021, 29022, 29023, 29024, 29025, 29026, 29027, 29028, 29029, 29030, 29031, 29032, 29033, 29034, 29035, 29036, 29037, 29038, 29039, 29040, 29041, 29042, 29043, 29044, 29045});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SNGGameRoomBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    native /* synthetic */ TexasPoker$SNGGameRoomBaseInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

    private native TexasPoker$SNGGameRoomBaseInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder);

    native /* synthetic */ TexasPoker$SNGGameRoomBaseInfo(com.google.protobuf.GeneratedMessage.Builder builder, TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo);

    private native TexasPoker$SNGGameRoomBaseInfo(boolean z);

    private native void initFields();

    public final native int getBBuyinControl();

    public final native int getBGPSLimit();

    public final native int getBIPLimit();

    public final native int getBInGame();

    public final native int getBLevelChanged();

    public final native int getBPrivateRoom();

    public final native int getBSignupInviting();

    public final native int getBStarted();

    public final native /* bridge */ /* synthetic */ Message getDefaultInstanceForType();

    public final native /* bridge */ /* synthetic */ MessageLite m734getDefaultInstanceForType();

    public final native TexasPoker$SNGGameRoomBaseInfo m735getDefaultInstanceForType();

    public final native CREATE_ROOM_TYPE getECreateRoomType();

    public final native SNG_ROOM_TYPE getESNGRoomtype();

    public final native int getIAnte();

    public final native int getIBlindInterval();

    public final native int getICurrentLevel();

    public final native int getIGameRoomUserMaxNums();

    public final native int getIGameRoomUserNums();

    public final native int getIMaxiLevel();

    public final native int getIThinkingInterval();

    public final native long getLBigBlinds();

    public final native int getLCancelWaitInterval();

    public final native long getLCreateTime();

    public final native long getLFromRoomID();

    public final native long getLGameRoomId();

    public final native long getLLeagueID();

    public final native long getLOriginalStacks();

    public final native long getLPrepareTime();

    public final native long getLSmallBlinds();

    public final native long getLStartTime();

    public final native Parser<TexasPoker$SNGGameRoomBaseInfo> getParserForType();

    public final native String getSFromMsg();

    public final native ByteString getSFromMsgBytes();

    public final native String getSLeagueName();

    public final native ByteString getSLeagueNameBytes();

    public final native int getSerializedSize();

    public final native UserBaseInfoNet getStCreateUserBaseInfo();

    public final native UserBaseInfoNetOrBuilder getStCreateUserBaseInfoOrBuilder();

    public final native String getStrRoomName();

    public final native ByteString getStrRoomNameBytes();

    public final native UnknownFieldSet getUnknownFields();

    public final native long getVWinLadder(int i);

    public final native int getVWinLadderCount();

    public final native List<Long> getVWinLadderList();

    public final native boolean hasBBuyinControl();

    public final native boolean hasBGPSLimit();

    public final native boolean hasBIPLimit();

    public final native boolean hasBInGame();

    public final native boolean hasBLevelChanged();

    public final native boolean hasBPrivateRoom();

    public final native boolean hasBSignupInviting();

    public final native boolean hasBStarted();

    public final native boolean hasECreateRoomType();

    public final native boolean hasESNGRoomtype();

    public final native boolean hasIAnte();

    public final native boolean hasIBlindInterval();

    public final native boolean hasICurrentLevel();

    public final native boolean hasIGameRoomUserMaxNums();

    public final native boolean hasIGameRoomUserNums();

    public final native boolean hasIMaxiLevel();

    public final native boolean hasIThinkingInterval();

    public final native boolean hasLBigBlinds();

    public final native boolean hasLCancelWaitInterval();

    public final native boolean hasLCreateTime();

    public final native boolean hasLFromRoomID();

    public final native boolean hasLGameRoomId();

    public final native boolean hasLLeagueID();

    public final native boolean hasLOriginalStacks();

    public final native boolean hasLPrepareTime();

    public final native boolean hasLSmallBlinds();

    public final native boolean hasLStartTime();

    public final native boolean hasSFromMsg();

    public final native boolean hasSLeagueName();

    public final native boolean hasStCreateUserBaseInfo();

    public final native boolean hasStrRoomName();

    protected final native FieldAccessorTable internalGetFieldAccessorTable();

    public final native boolean isInitialized();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType();

    protected final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m736newBuilderForType();

    public final native Builder m737newBuilderForType();

    protected final native Builder m738newBuilderForType(BuilderParent builderParent);

    public final native /* bridge */ /* synthetic */ com.google.protobuf.Message.Builder toBuilder();

    public final native /* bridge */ /* synthetic */ com.google.protobuf.MessageLite.Builder m739toBuilder();

    public final native Builder m740toBuilder();

    protected final native Object writeReplace();

    public final native void writeTo(CodedOutputStream codedOutputStream);

    public static TexasPoker$SNGGameRoomBaseInfo getDefaultInstance() {
        return defaultInstance;
    }

    public static final Descriptor getDescriptor() {
        return TexasPoker.bD();
    }

    static void __clinit__() {
        PARSER = new C00731();
        TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo = new TexasPoker$SNGGameRoomBaseInfo(true);
        defaultInstance = texasPoker$SNGGameRoomBaseInfo;
        texasPoker$SNGGameRoomBaseInfo.initFields();
    }

    public static TexasPoker$SNGGameRoomBaseInfo parseFrom(ByteString byteString) {
        return (TexasPoker$SNGGameRoomBaseInfo) PARSER.parseFrom(byteString);
    }

    public static TexasPoker$SNGGameRoomBaseInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SNGGameRoomBaseInfo) PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static TexasPoker$SNGGameRoomBaseInfo parseFrom(byte[] bArr) {
        return (TexasPoker$SNGGameRoomBaseInfo) PARSER.parseFrom(bArr);
    }

    public static TexasPoker$SNGGameRoomBaseInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SNGGameRoomBaseInfo) PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TexasPoker$SNGGameRoomBaseInfo parseFrom(InputStream inputStream) {
        return (TexasPoker$SNGGameRoomBaseInfo) PARSER.parseFrom(inputStream);
    }

    public static TexasPoker$SNGGameRoomBaseInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SNGGameRoomBaseInfo) PARSER.parseFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SNGGameRoomBaseInfo parseDelimitedFrom(InputStream inputStream) {
        return (TexasPoker$SNGGameRoomBaseInfo) PARSER.parseDelimitedFrom(inputStream);
    }

    public static TexasPoker$SNGGameRoomBaseInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SNGGameRoomBaseInfo) PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
    }

    public static TexasPoker$SNGGameRoomBaseInfo parseFrom(CodedInputStream codedInputStream) {
        return (TexasPoker$SNGGameRoomBaseInfo) PARSER.parseFrom(codedInputStream);
    }

    public static TexasPoker$SNGGameRoomBaseInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TexasPoker$SNGGameRoomBaseInfo) PARSER.parseFrom(codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return Builder.create();
    }

    public static Builder newBuilder(TexasPoker$SNGGameRoomBaseInfo texasPoker$SNGGameRoomBaseInfo) {
        return newBuilder().mergeFrom(texasPoker$SNGGameRoomBaseInfo);
    }
}
