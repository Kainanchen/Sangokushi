package net.sqlcipher;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.ArrayList;

public class MatrixCursor extends AbstractCursor {
    private final int columnCount;
    private final String[] columnNames;
    private Object[] data;
    private int rowCount;

    public class RowBuilder {
        private final int endIndex;
        private int index;
        final /* synthetic */ MatrixCursor this$0;

        static {
            fixHelper.fixfunc(new int[]{9296, 9297});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native RowBuilder(MatrixCursor matrixCursor, int i, int i2);

        public native RowBuilder add(Object obj);
    }

    static {
        fixHelper.fixfunc(new int[]{15696, 15697, 15698, 15699, 15700, 15701, 15702, 15703, 15704, 15705, 15706, 15707, 15708, 15709, 15710, 15711, 15712, 15713});
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    public native MatrixCursor(String[] strArr);

    public native MatrixCursor(String[] strArr, int i);

    private native void addRow(ArrayList<?> arrayList, int i);

    private native void ensureCapacity(int i);

    private native Object get(int i);

    public native void addRow(Iterable<?> iterable);

    public native void addRow(Object[] objArr);

    public native String[] getColumnNames();

    public native int getCount();

    public native double getDouble(int i);

    public native float getFloat(int i);

    public native int getInt(int i);

    public native long getLong(int i);

    public native short getShort(int i);

    public native String getString(int i);

    public native int getType(int i);

    public native boolean isNull(int i);

    public native RowBuilder newRow();
}
