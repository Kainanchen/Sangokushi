package bolts;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

public class AggregateException extends Exception {
    private static final String DEFAULT_MESSAGE = "There were multiple errors.";
    private static final long serialVersionUID = 1;
    private List<Throwable> innerThrowables;

    static {
        fixHelper.fixfunc(new int[]{2109, 2110, 2111, 2112, 2113, 2114, 2115, 2116});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public native AggregateException(String str, List<? extends Throwable> list);

    public native AggregateException(String str, Throwable[] thArr);

    public native AggregateException(List<? extends Throwable> list);

    @Deprecated
    public native Throwable[] getCauses();

    @Deprecated
    public native List<Exception> getErrors();

    public native List<Throwable> getInnerThrowables();

    public native void printStackTrace(PrintStream printStream);

    public native void printStackTrace(PrintWriter printWriter);
}
