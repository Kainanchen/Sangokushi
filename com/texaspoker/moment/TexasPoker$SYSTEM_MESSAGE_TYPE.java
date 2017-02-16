package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.ProtocolMessageEnum;

public enum TexasPoker$SYSTEM_MESSAGE_TYPE implements ProtocolMessageEnum {
    ;
    
    public static final int SYSTEM_MESSAGE_CARD_TIMEOFF_VALUE = 3;
    public static final int SYSTEM_MESSAGE_FRIEND_GIFT_VALUE = 4;
    public static final int SYSTEM_MESSAGE_NOTICE_VALUE = 1;
    public static final int SYSTEM_MESSAGE_PROMOTION_VALUE = 2;
    private static final TexasPoker$SYSTEM_MESSAGE_TYPE[] VALUES = null;
    private static EnumLiteMap<TexasPoker$SYSTEM_MESSAGE_TYPE> internalValueMap;
    private final int index;
    private final int value;

    /* renamed from: com.texaspoker.moment.TexasPoker.SYSTEM_MESSAGE_TYPE.1 */
    class C00741 implements EnumLiteMap<TexasPoker$SYSTEM_MESSAGE_TYPE> {
        static {
            fixHelper.fixfunc(new int[]{15147, 15148});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00741();

        public final native /* synthetic */ EnumLite findValueByNumber(int i);
    }

    static {
        fixHelper.fixfunc(new int[]{26893, 26894, 26895, 26896});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$SYSTEM_MESSAGE_TYPE(int i, int i2);

    public final native EnumDescriptor getDescriptorForType();

    public final native int getNumber();

    public final native EnumValueDescriptor getValueDescriptor();

    static void __clinit__() {
        SYSTEM_MESSAGE_NOTICE = new TexasPoker$SYSTEM_MESSAGE_TYPE("SYSTEM_MESSAGE_NOTICE", 0, 0, SYSTEM_MESSAGE_NOTICE_VALUE);
        SYSTEM_MESSAGE_PROMOTION = new TexasPoker$SYSTEM_MESSAGE_TYPE("SYSTEM_MESSAGE_PROMOTION", SYSTEM_MESSAGE_NOTICE_VALUE, SYSTEM_MESSAGE_NOTICE_VALUE, SYSTEM_MESSAGE_PROMOTION_VALUE);
        SYSTEM_MESSAGE_CARD_TIMEOFF = new TexasPoker$SYSTEM_MESSAGE_TYPE("SYSTEM_MESSAGE_CARD_TIMEOFF", SYSTEM_MESSAGE_PROMOTION_VALUE, SYSTEM_MESSAGE_PROMOTION_VALUE, SYSTEM_MESSAGE_CARD_TIMEOFF_VALUE);
        SYSTEM_MESSAGE_FRIEND_GIFT = new TexasPoker$SYSTEM_MESSAGE_TYPE("SYSTEM_MESSAGE_FRIEND_GIFT", SYSTEM_MESSAGE_CARD_TIMEOFF_VALUE, SYSTEM_MESSAGE_CARD_TIMEOFF_VALUE, SYSTEM_MESSAGE_FRIEND_GIFT_VALUE);
        TexasPoker$SYSTEM_MESSAGE_TYPE[] texasPoker$SYSTEM_MESSAGE_TYPEArr = new TexasPoker$SYSTEM_MESSAGE_TYPE[SYSTEM_MESSAGE_FRIEND_GIFT_VALUE];
        texasPoker$SYSTEM_MESSAGE_TYPEArr[0] = SYSTEM_MESSAGE_NOTICE;
        texasPoker$SYSTEM_MESSAGE_TYPEArr[SYSTEM_MESSAGE_NOTICE_VALUE] = SYSTEM_MESSAGE_PROMOTION;
        texasPoker$SYSTEM_MESSAGE_TYPEArr[SYSTEM_MESSAGE_PROMOTION_VALUE] = SYSTEM_MESSAGE_CARD_TIMEOFF;
        texasPoker$SYSTEM_MESSAGE_TYPEArr[SYSTEM_MESSAGE_CARD_TIMEOFF_VALUE] = SYSTEM_MESSAGE_FRIEND_GIFT;
        ENUM$VALUES = texasPoker$SYSTEM_MESSAGE_TYPEArr;
        internalValueMap = new C00741();
        VALUES = values();
    }

    public static TexasPoker$SYSTEM_MESSAGE_TYPE valueOf(int i) {
        switch (i) {
            case SYSTEM_MESSAGE_NOTICE_VALUE:
                return SYSTEM_MESSAGE_NOTICE;
            case SYSTEM_MESSAGE_PROMOTION_VALUE:
                return SYSTEM_MESSAGE_PROMOTION;
            case SYSTEM_MESSAGE_CARD_TIMEOFF_VALUE:
                return SYSTEM_MESSAGE_CARD_TIMEOFF;
            case SYSTEM_MESSAGE_FRIEND_GIFT_VALUE:
                return SYSTEM_MESSAGE_FRIEND_GIFT;
            default:
                return null;
        }
    }

    public static EnumLiteMap<TexasPoker$SYSTEM_MESSAGE_TYPE> internalGetValueMap() {
        return internalValueMap;
    }

    public static final EnumDescriptor getDescriptor() {
        return (EnumDescriptor) TexasPoker.a().getEnumTypes().get(7);
    }

    public static TexasPoker$SYSTEM_MESSAGE_TYPE valueOf(EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
