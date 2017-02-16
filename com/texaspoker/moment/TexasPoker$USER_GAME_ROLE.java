package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.ProtocolMessageEnum;

public enum TexasPoker$USER_GAME_ROLE implements ProtocolMessageEnum {
    ;
    
    public static final int USER_GAME_ROLE_BIG_BLIND_VALUE = 3;
    public static final int USER_GAME_ROLE_DEAL_VALUE = 1;
    public static final int USER_GAME_ROLE_NORMAL_VALUE = 4;
    public static final int USER_GAME_ROLE_SMALL_BLIND_VALUE = 2;
    public static final int USER_GAME_ROLE_STRADDLE_VALUE = 5;
    private static final TexasPoker$USER_GAME_ROLE[] VALUES = null;
    private static EnumLiteMap<TexasPoker$USER_GAME_ROLE> internalValueMap;
    private final int index;
    private final int value;

    /* renamed from: com.texaspoker.moment.TexasPoker.USER_GAME_ROLE.1 */
    class C00771 implements EnumLiteMap<TexasPoker$USER_GAME_ROLE> {
        static {
            fixHelper.fixfunc(new int[]{33225, 33226});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00771();

        public final native /* synthetic */ EnumLite findValueByNumber(int i);
    }

    static {
        fixHelper.fixfunc(new int[]{12277, 12278, 12279, 12280});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$USER_GAME_ROLE(int i, int i2);

    public final native EnumDescriptor getDescriptorForType();

    public final native int getNumber();

    public final native EnumValueDescriptor getValueDescriptor();

    static void __clinit__() {
        USER_GAME_ROLE_DEAL = new TexasPoker$USER_GAME_ROLE("USER_GAME_ROLE_DEAL", 0, 0, USER_GAME_ROLE_DEAL_VALUE);
        USER_GAME_ROLE_SMALL_BLIND = new TexasPoker$USER_GAME_ROLE("USER_GAME_ROLE_SMALL_BLIND", USER_GAME_ROLE_DEAL_VALUE, USER_GAME_ROLE_DEAL_VALUE, USER_GAME_ROLE_SMALL_BLIND_VALUE);
        USER_GAME_ROLE_BIG_BLIND = new TexasPoker$USER_GAME_ROLE("USER_GAME_ROLE_BIG_BLIND", USER_GAME_ROLE_SMALL_BLIND_VALUE, USER_GAME_ROLE_SMALL_BLIND_VALUE, USER_GAME_ROLE_BIG_BLIND_VALUE);
        USER_GAME_ROLE_NORMAL = new TexasPoker$USER_GAME_ROLE("USER_GAME_ROLE_NORMAL", USER_GAME_ROLE_BIG_BLIND_VALUE, USER_GAME_ROLE_BIG_BLIND_VALUE, USER_GAME_ROLE_NORMAL_VALUE);
        USER_GAME_ROLE_STRADDLE = new TexasPoker$USER_GAME_ROLE("USER_GAME_ROLE_STRADDLE", USER_GAME_ROLE_NORMAL_VALUE, USER_GAME_ROLE_NORMAL_VALUE, USER_GAME_ROLE_STRADDLE_VALUE);
        TexasPoker$USER_GAME_ROLE[] texasPoker$USER_GAME_ROLEArr = new TexasPoker$USER_GAME_ROLE[USER_GAME_ROLE_STRADDLE_VALUE];
        texasPoker$USER_GAME_ROLEArr[0] = USER_GAME_ROLE_DEAL;
        texasPoker$USER_GAME_ROLEArr[USER_GAME_ROLE_DEAL_VALUE] = USER_GAME_ROLE_SMALL_BLIND;
        texasPoker$USER_GAME_ROLEArr[USER_GAME_ROLE_SMALL_BLIND_VALUE] = USER_GAME_ROLE_BIG_BLIND;
        texasPoker$USER_GAME_ROLEArr[USER_GAME_ROLE_BIG_BLIND_VALUE] = USER_GAME_ROLE_NORMAL;
        texasPoker$USER_GAME_ROLEArr[USER_GAME_ROLE_NORMAL_VALUE] = USER_GAME_ROLE_STRADDLE;
        ENUM$VALUES = texasPoker$USER_GAME_ROLEArr;
        internalValueMap = new C00771();
        VALUES = values();
    }

    public static TexasPoker$USER_GAME_ROLE valueOf(int i) {
        switch (i) {
            case USER_GAME_ROLE_DEAL_VALUE:
                return USER_GAME_ROLE_DEAL;
            case USER_GAME_ROLE_SMALL_BLIND_VALUE:
                return USER_GAME_ROLE_SMALL_BLIND;
            case USER_GAME_ROLE_BIG_BLIND_VALUE:
                return USER_GAME_ROLE_BIG_BLIND;
            case USER_GAME_ROLE_NORMAL_VALUE:
                return USER_GAME_ROLE_NORMAL;
            case USER_GAME_ROLE_STRADDLE_VALUE:
                return USER_GAME_ROLE_STRADDLE;
            default:
                return null;
        }
    }

    public static EnumLiteMap<TexasPoker$USER_GAME_ROLE> internalGetValueMap() {
        return internalValueMap;
    }

    public static final EnumDescriptor getDescriptor() {
        return (EnumDescriptor) TexasPoker.a().getEnumTypes().get(USER_GAME_ROLE_DEAL_VALUE);
    }

    public static TexasPoker$USER_GAME_ROLE valueOf(EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
