package net.sqlcipher.database;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.ali.fixHelper;
import com.texaspoker.moment.TexasPokerCmd.TEXAS_CMD;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import net.sqlcipher.Cursor;
import net.sqlcipher.DatabaseUtils;

public class SQLiteQueryBuilder {
    private static final String TAG = "SQLiteQueryBuilder";
    private static final Pattern sLimitPattern = null;
    private boolean mDistinct;
    private SQLiteDatabase$CursorFactory mFactory;
    private Map<String, String> mProjectionMap;
    private boolean mStrictProjectionMap;
    private String mTables;
    private StringBuilder mWhereClause;

    static {
        fixHelper.fixfunc(new int[]{31350, 31351, 31352, 31353, 31354, 31355, 31356, 31357, 31358, 31359, 31360, 31361, 31362, 31363, 31364});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    private native String[] computeProjection(String[] strArr);

    public native void appendWhere(CharSequence charSequence);

    public native void appendWhereEscapeString(String str);

    public native String buildQuery(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5);

    public native String buildUnionQuery(String[] strArr, String str, String str2);

    public native String buildUnionSubQuery(String str, String[] strArr, Set<String> set, int i, String str2, String str3, String[] strArr2, String str4, String str5);

    public native String getTables();

    public native Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4);

    public native Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5);

    public native void setCursorFactory(SQLiteDatabase$CursorFactory sQLiteDatabase$CursorFactory);

    public native void setDistinct(boolean z);

    public native void setProjectionMap(Map<String, String> map);

    public native void setStrictProjectionMap(boolean z);

    public native void setTables(String str);

    static void __clinit__() {
        sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    }

    public static String buildQueryString(boolean z, String str, String[] strArr, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        } else if (TextUtils.isEmpty(str6) || sLimitPattern.matcher(str6).matches()) {
            StringBuilder stringBuilder = new StringBuilder(TEXAS_CMD.Cmd_CSSetRecommendUser_VALUE);
            stringBuilder.append("SELECT ");
            if (z) {
                stringBuilder.append("DISTINCT ");
            }
            if (strArr == null || strArr.length == 0) {
                stringBuilder.append("* ");
            } else {
                appendColumns(stringBuilder, strArr);
            }
            stringBuilder.append("FROM ");
            stringBuilder.append(str);
            appendClause(stringBuilder, " WHERE ", str2);
            appendClause(stringBuilder, " GROUP BY ", str3);
            appendClause(stringBuilder, " HAVING ", str4);
            appendClause(stringBuilder, " ORDER BY ", str5);
            appendClause(stringBuilder, " LIMIT ", str6);
            return stringBuilder.toString();
        } else {
            throw new IllegalArgumentException("invalid LIMIT clauses:" + str6);
        }
    }

    private static void appendClause(StringBuilder stringBuilder, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append(str);
            stringBuilder.append(str2);
        }
    }

    private static void appendClauseEscapeClause(StringBuilder stringBuilder, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            stringBuilder.append(str);
            DatabaseUtils.appendEscapedSQLString(stringBuilder, str2);
        }
    }

    public static void appendColumns(StringBuilder stringBuilder, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str != null) {
                if (i > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(str);
            }
        }
        stringBuilder.append(' ');
    }
}
