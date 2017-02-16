package bolts;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public final class Bolts {
    public static final String VERSION = "1.4.0";

    static {
        fixHelper.fixfunc(new int[]{1114, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }
}
