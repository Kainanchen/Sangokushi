package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.ProtocolMessageEnum;

public enum TexasPoker$USER_GAME_STATE implements ProtocolMessageEnum {
    ;
    
    public static final int USER_GAME_STATE_ALLIN_VALUE = 10;
    public static final int USER_GAME_STATE_BETTING_VALUE = 4;
    public static final int USER_GAME_STATE_BLIND_VALUE = 11;
    public static final int USER_GAME_STATE_CALL_VALUE = 8;
    public static final int USER_GAME_STATE_CHECK_VALUE = 7;
    public static final int USER_GAME_STATE_DEAD_VALUE = 12;
    public static final int USER_GAME_STATE_FOLD_VALUE = 5;
    public static final int USER_GAME_STATE_RAISE_VALUE = 9;
    public static final int USER_GAME_STATE_READY_VALUE = 3;
    public static final int USER_GAME_STATE_STANDBY_VALUE = 1;
    public static final int USER_GAME_STATE_WAIT_VALUE = 2;
    private static final TexasPoker$USER_GAME_STATE[] VALUES = null;
    private static EnumLiteMap<TexasPoker$USER_GAME_STATE> internalValueMap;
    private final int index;
    private final int value;

    /* renamed from: com.texaspoker.moment.TexasPoker.USER_GAME_STATE.1 */
    class C00781 implements EnumLiteMap<TexasPoker$USER_GAME_STATE> {
        static {
            fixHelper.fixfunc(new int[]{14364, 14365});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00781();

        public final native /* synthetic */ EnumLite findValueByNumber(int i);
    }

    static {
        fixHelper.fixfunc(new int[]{3682, 3683, 3684, 3685});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$USER_GAME_STATE(int i, int i2);

    public final native EnumDescriptor getDescriptorForType();

    public final native int getNumber();

    public final native EnumValueDescriptor getValueDescriptor();

    static void __clinit__() {
        USER_GAME_STATE_STANDBY = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_STANDBY", 0, 0, USER_GAME_STATE_STANDBY_VALUE);
        USER_GAME_STATE_WAIT = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_WAIT", USER_GAME_STATE_STANDBY_VALUE, USER_GAME_STATE_STANDBY_VALUE, USER_GAME_STATE_WAIT_VALUE);
        USER_GAME_STATE_READY = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_READY", USER_GAME_STATE_WAIT_VALUE, USER_GAME_STATE_WAIT_VALUE, USER_GAME_STATE_READY_VALUE);
        USER_GAME_STATE_BETTING = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_BETTING", USER_GAME_STATE_READY_VALUE, USER_GAME_STATE_READY_VALUE, USER_GAME_STATE_BETTING_VALUE);
        USER_GAME_STATE_FOLD = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_FOLD", USER_GAME_STATE_BETTING_VALUE, USER_GAME_STATE_BETTING_VALUE, USER_GAME_STATE_FOLD_VALUE);
        USER_GAME_STATE_CHECK = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_CHECK", USER_GAME_STATE_FOLD_VALUE, USER_GAME_STATE_FOLD_VALUE, USER_GAME_STATE_CHECK_VALUE);
        USER_GAME_STATE_CALL = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_CALL", 6, 6, USER_GAME_STATE_CALL_VALUE);
        USER_GAME_STATE_RAISE = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_RAISE", USER_GAME_STATE_CHECK_VALUE, USER_GAME_STATE_CHECK_VALUE, USER_GAME_STATE_RAISE_VALUE);
        USER_GAME_STATE_ALLIN = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_ALLIN", USER_GAME_STATE_CALL_VALUE, USER_GAME_STATE_CALL_VALUE, USER_GAME_STATE_ALLIN_VALUE);
        USER_GAME_STATE_BLIND = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_BLIND", USER_GAME_STATE_RAISE_VALUE, USER_GAME_STATE_RAISE_VALUE, USER_GAME_STATE_BLIND_VALUE);
        USER_GAME_STATE_DEAD = new TexasPoker$USER_GAME_STATE("USER_GAME_STATE_DEAD", USER_GAME_STATE_ALLIN_VALUE, USER_GAME_STATE_ALLIN_VALUE, USER_GAME_STATE_DEAD_VALUE);
        TexasPoker$USER_GAME_STATE[] texasPoker$USER_GAME_STATEArr = new TexasPoker$USER_GAME_STATE[USER_GAME_STATE_BLIND_VALUE];
        texasPoker$USER_GAME_STATEArr[0] = USER_GAME_STATE_STANDBY;
        texasPoker$USER_GAME_STATEArr[USER_GAME_STATE_STANDBY_VALUE] = USER_GAME_STATE_WAIT;
        texasPoker$USER_GAME_STATEArr[USER_GAME_STATE_WAIT_VALUE] = USER_GAME_STATE_READY;
        texasPoker$USER_GAME_STATEArr[USER_GAME_STATE_READY_VALUE] = USER_GAME_STATE_BETTING;
        texasPoker$USER_GAME_STATEArr[USER_GAME_STATE_BETTING_VALUE] = USER_GAME_STATE_FOLD;
        texasPoker$USER_GAME_STATEArr[USER_GAME_STATE_FOLD_VALUE] = USER_GAME_STATE_CHECK;
        texasPoker$USER_GAME_STATEArr[6] = USER_GAME_STATE_CALL;
        texasPoker$USER_GAME_STATEArr[USER_GAME_STATE_CHECK_VALUE] = USER_GAME_STATE_RAISE;
        texasPoker$USER_GAME_STATEArr[USER_GAME_STATE_CALL_VALUE] = USER_GAME_STATE_ALLIN;
        texasPoker$USER_GAME_STATEArr[USER_GAME_STATE_RAISE_VALUE] = USER_GAME_STATE_BLIND;
        texasPoker$USER_GAME_STATEArr[USER_GAME_STATE_ALLIN_VALUE] = USER_GAME_STATE_DEAD;
        ENUM$VALUES = texasPoker$USER_GAME_STATEArr;
        internalValueMap = new C00781();
        VALUES = values();
    }

    public static TexasPoker$USER_GAME_STATE valueOf(int i) {
        switch (i) {
            case USER_GAME_STATE_STANDBY_VALUE:
                return USER_GAME_STATE_STANDBY;
            case USER_GAME_STATE_WAIT_VALUE:
                return USER_GAME_STATE_WAIT;
            case USER_GAME_STATE_READY_VALUE:
                return USER_GAME_STATE_READY;
            case USER_GAME_STATE_BETTING_VALUE:
                return USER_GAME_STATE_BETTING;
            case USER_GAME_STATE_FOLD_VALUE:
                return USER_GAME_STATE_FOLD;
            case USER_GAME_STATE_CHECK_VALUE:
                return USER_GAME_STATE_CHECK;
            case USER_GAME_STATE_CALL_VALUE:
                return USER_GAME_STATE_CALL;
            case USER_GAME_STATE_RAISE_VALUE:
                return USER_GAME_STATE_RAISE;
            case USER_GAME_STATE_ALLIN_VALUE:
                return USER_GAME_STATE_ALLIN;
            case USER_GAME_STATE_BLIND_VALUE:
                return USER_GAME_STATE_BLIND;
            case USER_GAME_STATE_DEAD_VALUE:
                return USER_GAME_STATE_DEAD;
            default:
                return null;
        }
    }

    public static EnumLiteMap<TexasPoker$USER_GAME_STATE> internalGetValueMap() {
        return internalValueMap;
    }

    public static final EnumDescriptor getDescriptor() {
        return (EnumDescriptor) TexasPoker.a().getEnumTypes().get(0);
    }

    public static TexasPoker$USER_GAME_STATE valueOf(EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
