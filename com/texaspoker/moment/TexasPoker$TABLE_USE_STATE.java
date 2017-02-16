package com.texaspoker.moment;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.ProtocolMessageEnum;

public enum TexasPoker$TABLE_USE_STATE implements ProtocolMessageEnum {
    ;
    
    public static final int TABLE_STATE_Empty_VALUE = 4;
    public static final int TABLE_STATE_OVer_VALUE = 3;
    public static final int TABLE_STATE_Play_VALUE = 1;
    public static final int TABLE_STATE_Ready_VALUE = 2;
    private static final TexasPoker$TABLE_USE_STATE[] VALUES = null;
    private static EnumLiteMap<TexasPoker$TABLE_USE_STATE> internalValueMap;
    private final int index;
    private final int value;

    /* renamed from: com.texaspoker.moment.TexasPoker.TABLE_USE_STATE.1 */
    class C00761 implements EnumLiteMap<TexasPoker$TABLE_USE_STATE> {
        static {
            fixHelper.fixfunc(new int[]{9653, 9654});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C00761();

        public final native /* synthetic */ EnumLite findValueByNumber(int i);
    }

    static {
        fixHelper.fixfunc(new int[]{31588, 31589, 31590, 31591});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native TexasPoker$TABLE_USE_STATE(int i, int i2);

    public final native EnumDescriptor getDescriptorForType();

    public final native int getNumber();

    public final native EnumValueDescriptor getValueDescriptor();

    static void __clinit__() {
        TABLE_STATE_Play = new TexasPoker$TABLE_USE_STATE("TABLE_STATE_Play", 0, 0, TABLE_STATE_Play_VALUE);
        TABLE_STATE_Ready = new TexasPoker$TABLE_USE_STATE("TABLE_STATE_Ready", TABLE_STATE_Play_VALUE, TABLE_STATE_Play_VALUE, TABLE_STATE_Ready_VALUE);
        TABLE_STATE_OVer = new TexasPoker$TABLE_USE_STATE("TABLE_STATE_OVer", TABLE_STATE_Ready_VALUE, TABLE_STATE_Ready_VALUE, TABLE_STATE_OVer_VALUE);
        TABLE_STATE_Empty = new TexasPoker$TABLE_USE_STATE("TABLE_STATE_Empty", TABLE_STATE_OVer_VALUE, TABLE_STATE_OVer_VALUE, TABLE_STATE_Empty_VALUE);
        TexasPoker$TABLE_USE_STATE[] texasPoker$TABLE_USE_STATEArr = new TexasPoker$TABLE_USE_STATE[TABLE_STATE_Empty_VALUE];
        texasPoker$TABLE_USE_STATEArr[0] = TABLE_STATE_Play;
        texasPoker$TABLE_USE_STATEArr[TABLE_STATE_Play_VALUE] = TABLE_STATE_Ready;
        texasPoker$TABLE_USE_STATEArr[TABLE_STATE_Ready_VALUE] = TABLE_STATE_OVer;
        texasPoker$TABLE_USE_STATEArr[TABLE_STATE_OVer_VALUE] = TABLE_STATE_Empty;
        ENUM$VALUES = texasPoker$TABLE_USE_STATEArr;
        internalValueMap = new C00761();
        VALUES = values();
    }

    public static TexasPoker$TABLE_USE_STATE valueOf(int i) {
        switch (i) {
            case TABLE_STATE_Play_VALUE:
                return TABLE_STATE_Play;
            case TABLE_STATE_Ready_VALUE:
                return TABLE_STATE_Ready;
            case TABLE_STATE_OVer_VALUE:
                return TABLE_STATE_OVer;
            case TABLE_STATE_Empty_VALUE:
                return TABLE_STATE_Empty;
            default:
                return null;
        }
    }

    public static EnumLiteMap<TexasPoker$TABLE_USE_STATE> internalGetValueMap() {
        return internalValueMap;
    }

    public static final EnumDescriptor getDescriptor() {
        return (EnumDescriptor) TexasPoker.a().getEnumTypes().get(16);
    }

    public static TexasPoker$TABLE_USE_STATE valueOf(EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}
