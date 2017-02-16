package bolts;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;

public class UnobservedTaskException extends RuntimeException {
    static {
        fixHelper.fixfunc(new int[]{1470, 1});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native UnobservedTaskException(Throwable th);
}
