package bolts;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR = null;
    private static final Executor IMMEDIATE_EXECUTOR = null;
    private static Task<?> TASK_CANCELLED;
    private static Task<Boolean> TASK_FALSE;
    private static Task<?> TASK_NULL;
    private static Task<Boolean> TASK_TRUE;
    public static final Executor UI_THREAD_EXECUTOR = null;
    private static volatile UnobservedExceptionHandler unobservedExceptionHandler;
    private boolean cancelled;
    private boolean complete;
    private List<Continuation<TResult, Void>> continuations;
    private Exception error;
    private boolean errorHasBeenObserved;
    private final Object lock;
    private TResult result;
    private UnobservedErrorNotifier unobservedErrorNotifier;

    /* renamed from: bolts.Task.10 */
    class AnonymousClass10 implements Continuation<TResult, Void> {
        final /* synthetic */ Continuation val$continuation;
        final /* synthetic */ CancellationToken val$ct;
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ TaskCompletionSource val$tcs;

        AnonymousClass10(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken) {
            this.val$tcs = taskCompletionSource;
            this.val$continuation = continuation;
            this.val$executor = executor;
            this.val$ct = cancellationToken;
        }

        public Void then(Task<TResult> task) {
            Task.completeImmediately(this.val$tcs, this.val$continuation, task, this.val$executor, this.val$ct);
            return null;
        }
    }

    /* renamed from: bolts.Task.11 */
    class AnonymousClass11 implements Continuation<TResult, Void> {
        final /* synthetic */ Continuation val$continuation;
        final /* synthetic */ CancellationToken val$ct;
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ TaskCompletionSource val$tcs;

        AnonymousClass11(TaskCompletionSource taskCompletionSource, Continuation continuation, Executor executor, CancellationToken cancellationToken) {
            this.val$tcs = taskCompletionSource;
            this.val$continuation = continuation;
            this.val$executor = executor;
            this.val$ct = cancellationToken;
        }

        public Void then(Task<TResult> task) {
            Task.completeAfterTask(this.val$tcs, this.val$continuation, task, this.val$executor, this.val$ct);
            return null;
        }
    }

    /* renamed from: bolts.Task.12 */
    class AnonymousClass12 implements Continuation<TResult, Task<TContinuationResult>> {
        final /* synthetic */ Continuation val$continuation;
        final /* synthetic */ CancellationToken val$ct;

        AnonymousClass12(CancellationToken cancellationToken, Continuation continuation) {
            this.val$ct = cancellationToken;
            this.val$continuation = continuation;
        }

        public Task<TContinuationResult> then(Task<TResult> task) {
            if (this.val$ct != null && this.val$ct.isCancellationRequested()) {
                return Task.cancelled();
            }
            if (task.isFaulted()) {
                return Task.forError(task.getError());
            }
            if (task.isCancelled()) {
                return Task.cancelled();
            }
            return task.continueWith(this.val$continuation);
        }
    }

    /* renamed from: bolts.Task.13 */
    class AnonymousClass13 implements Continuation<TResult, Task<TContinuationResult>> {
        final /* synthetic */ Continuation val$continuation;
        final /* synthetic */ CancellationToken val$ct;

        AnonymousClass13(CancellationToken cancellationToken, Continuation continuation) {
            this.val$ct = cancellationToken;
            this.val$continuation = continuation;
        }

        public Task<TContinuationResult> then(Task<TResult> task) {
            if (this.val$ct != null && this.val$ct.isCancellationRequested()) {
                return Task.cancelled();
            }
            if (task.isFaulted()) {
                return Task.forError(task.getError());
            }
            if (task.isCancelled()) {
                return Task.cancelled();
            }
            return task.continueWithTask(this.val$continuation);
        }
    }

    /* renamed from: bolts.Task.14 */
    static class AnonymousClass14 implements Runnable {
        final /* synthetic */ Continuation val$continuation;
        final /* synthetic */ CancellationToken val$ct;
        final /* synthetic */ Task val$task;
        final /* synthetic */ TaskCompletionSource val$tcs;

        AnonymousClass14(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
            this.val$ct = cancellationToken;
            this.val$tcs = taskCompletionSource;
            this.val$continuation = continuation;
            this.val$task = task;
        }

        public final void run() {
            if (this.val$ct == null || !this.val$ct.isCancellationRequested()) {
                try {
                    this.val$tcs.setResult(this.val$continuation.then(this.val$task));
                    return;
                } catch (CancellationException e) {
                    this.val$tcs.setCancelled();
                    return;
                } catch (Exception e2) {
                    this.val$tcs.setError(e2);
                    return;
                }
            }
            this.val$tcs.setCancelled();
        }
    }

    /* renamed from: bolts.Task.15 */
    static class AnonymousClass15 implements Runnable {
        final /* synthetic */ Continuation val$continuation;
        final /* synthetic */ CancellationToken val$ct;
        final /* synthetic */ Task val$task;
        final /* synthetic */ TaskCompletionSource val$tcs;

        /* renamed from: bolts.Task.15.1 */
        class C02421 implements Continuation<TContinuationResult, Void> {
            C02421() {
            }

            public Void then(Task<TContinuationResult> task) {
                if (AnonymousClass15.this.val$ct != null && AnonymousClass15.this.val$ct.isCancellationRequested()) {
                    AnonymousClass15.this.val$tcs.setCancelled();
                } else if (task.isCancelled()) {
                    AnonymousClass15.this.val$tcs.setCancelled();
                } else if (task.isFaulted()) {
                    AnonymousClass15.this.val$tcs.setError(task.getError());
                } else {
                    AnonymousClass15.this.val$tcs.setResult(task.getResult());
                }
                return null;
            }
        }

        AnonymousClass15(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Continuation continuation, Task task) {
            this.val$ct = cancellationToken;
            this.val$tcs = taskCompletionSource;
            this.val$continuation = continuation;
            this.val$task = task;
        }

        public final void run() {
            if (this.val$ct == null || !this.val$ct.isCancellationRequested()) {
                try {
                    Task task = (Task) this.val$continuation.then(this.val$task);
                    if (task == null) {
                        this.val$tcs.setResult(null);
                        return;
                    } else {
                        task.continueWith(new C02421());
                        return;
                    }
                } catch (CancellationException e) {
                    this.val$tcs.setCancelled();
                    return;
                } catch (Exception e2) {
                    this.val$tcs.setError(e2);
                    return;
                }
            }
            this.val$tcs.setCancelled();
        }
    }

    /* renamed from: bolts.Task.1 */
    static class C02431 implements Runnable {
        final /* synthetic */ TaskCompletionSource val$tcs;

        C02431(TaskCompletionSource taskCompletionSource) {
            this.val$tcs = taskCompletionSource;
        }

        public final void run() {
            this.val$tcs.trySetResult(null);
        }
    }

    /* renamed from: bolts.Task.2 */
    static class C02442 implements Runnable {
        final /* synthetic */ ScheduledFuture val$scheduled;
        final /* synthetic */ TaskCompletionSource val$tcs;

        C02442(ScheduledFuture scheduledFuture, TaskCompletionSource taskCompletionSource) {
            this.val$scheduled = scheduledFuture;
            this.val$tcs = taskCompletionSource;
        }

        public final void run() {
            this.val$scheduled.cancel(true);
            this.val$tcs.trySetCancelled();
        }
    }

    /* renamed from: bolts.Task.3 */
    class C02453 implements Continuation<TResult, Task<Void>> {
        C02453() {
        }

        public Task<Void> then(Task<TResult> task) {
            if (task.isCancelled()) {
                return Task.cancelled();
            }
            if (task.isFaulted()) {
                return Task.forError(task.getError());
            }
            return Task.forResult(null);
        }
    }

    /* renamed from: bolts.Task.4 */
    static class C02464 implements Runnable {
        final /* synthetic */ Callable val$callable;
        final /* synthetic */ CancellationToken val$ct;
        final /* synthetic */ TaskCompletionSource val$tcs;

        C02464(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, Callable callable) {
            this.val$ct = cancellationToken;
            this.val$tcs = taskCompletionSource;
            this.val$callable = callable;
        }

        public final void run() {
            if (this.val$ct == null || !this.val$ct.isCancellationRequested()) {
                try {
                    this.val$tcs.setResult(this.val$callable.call());
                    return;
                } catch (CancellationException e) {
                    this.val$tcs.setCancelled();
                    return;
                } catch (Exception e2) {
                    this.val$tcs.setError(e2);
                    return;
                }
            }
            this.val$tcs.setCancelled();
        }
    }

    /* renamed from: bolts.Task.5 */
    static class C02475 implements Continuation<TResult, Void> {
        final /* synthetic */ TaskCompletionSource val$firstCompleted;
        final /* synthetic */ AtomicBoolean val$isAnyTaskComplete;

        C02475(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource) {
            this.val$isAnyTaskComplete = atomicBoolean;
            this.val$firstCompleted = taskCompletionSource;
        }

        public final Void then(Task<TResult> task) {
            if (this.val$isAnyTaskComplete.compareAndSet(false, true)) {
                this.val$firstCompleted.setResult(task);
            } else {
                task.getError();
            }
            return null;
        }
    }

    /* renamed from: bolts.Task.6 */
    static class C02486 implements Continuation<Object, Void> {
        final /* synthetic */ TaskCompletionSource val$firstCompleted;
        final /* synthetic */ AtomicBoolean val$isAnyTaskComplete;

        C02486(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource) {
            this.val$isAnyTaskComplete = atomicBoolean;
            this.val$firstCompleted = taskCompletionSource;
        }

        public final Void then(Task<Object> task) {
            if (this.val$isAnyTaskComplete.compareAndSet(false, true)) {
                this.val$firstCompleted.setResult(task);
            } else {
                task.getError();
            }
            return null;
        }
    }

    /* renamed from: bolts.Task.7 */
    static class C02497 implements Continuation<Void, List<TResult>> {
        final /* synthetic */ Collection val$tasks;

        C02497(Collection collection) {
            this.val$tasks = collection;
        }

        public final List<TResult> then(Task<Void> task) {
            if (this.val$tasks.size() == 0) {
                return Collections.emptyList();
            }
            List<TResult> arrayList = new ArrayList();
            for (Task result : this.val$tasks) {
                arrayList.add(result.getResult());
            }
            return arrayList;
        }
    }

    /* renamed from: bolts.Task.8 */
    static class C02508 implements Continuation<Object, Void> {
        final /* synthetic */ TaskCompletionSource val$allFinished;
        final /* synthetic */ ArrayList val$causes;
        final /* synthetic */ AtomicInteger val$count;
        final /* synthetic */ Object val$errorLock;
        final /* synthetic */ AtomicBoolean val$isCancelled;

        C02508(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, TaskCompletionSource taskCompletionSource) {
            this.val$errorLock = obj;
            this.val$causes = arrayList;
            this.val$isCancelled = atomicBoolean;
            this.val$count = atomicInteger;
            this.val$allFinished = taskCompletionSource;
        }

        public final Void then(Task<Object> task) {
            if (task.isFaulted()) {
                synchronized (this.val$errorLock) {
                    this.val$causes.add(task.getError());
                }
            }
            if (task.isCancelled()) {
                this.val$isCancelled.set(true);
            }
            if (this.val$count.decrementAndGet() == 0) {
                if (this.val$causes.size() != 0) {
                    if (this.val$causes.size() == 1) {
                        this.val$allFinished.setError((Exception) this.val$causes.get(0));
                    } else {
                        this.val$allFinished.setError(new AggregateException(String.format("There were %d exceptions.", new Object[]{Integer.valueOf(this.val$causes.size())}), this.val$causes));
                    }
                } else if (this.val$isCancelled.get()) {
                    this.val$allFinished.setCancelled();
                } else {
                    this.val$allFinished.setResult(null);
                }
            }
            return null;
        }
    }

    /* renamed from: bolts.Task.9 */
    class C02519 implements Continuation<Void, Task<Void>> {
        final /* synthetic */ Continuation val$continuation;
        final /* synthetic */ CancellationToken val$ct;
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ Callable val$predicate;
        final /* synthetic */ Capture val$predicateContinuation;

        C02519(CancellationToken cancellationToken, Callable callable, Continuation continuation, Executor executor, Capture capture) {
            this.val$ct = cancellationToken;
            this.val$predicate = callable;
            this.val$continuation = continuation;
            this.val$executor = executor;
            this.val$predicateContinuation = capture;
        }

        public Task<Void> then(Task<Void> task) {
            if (this.val$ct != null && this.val$ct.isCancellationRequested()) {
                return Task.cancelled();
            }
            if (((Boolean) this.val$predicate.call()).booleanValue()) {
                return Task.forResult(null).onSuccessTask(this.val$continuation, this.val$executor).onSuccessTask((Continuation) this.val$predicateContinuation.get(), this.val$executor);
            }
            return Task.forResult(null);
        }
    }

    public class TaskCompletionSource extends TaskCompletionSource<TResult> {
        final /* synthetic */ Task this$0;

        static {
            fixHelper.fixfunc(new int[]{1518, 1});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        native TaskCompletionSource(Task task);
    }

    public interface UnobservedExceptionHandler {
        void unobservedException(Task<?> task, UnobservedTaskException unobservedTaskException);
    }

    static {
        fixHelper.fixfunc(new int[]{1482, 1483, 1484, 1485, 1486, 1487, 1488, 1489, 1490, 1491, 1492, 1493, 1494, 1495, 1496, 1497, 1498, 1499, 1500, 1501, 1502, 1503, 1504, 1505, 1506, 1507, 1508, 1509, 1510, 1511, 1512, 1513, 1514, 1515, 1516, 1517});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    native Task();

    private native Task(TResult tResult);

    private native Task(boolean z);

    private native void runContinuations();

    public native <TOut> Task<TOut> cast();

    public native Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation);

    public native Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, CancellationToken cancellationToken);

    public native Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, Executor executor);

    public native Task<Void> continueWhile(Callable<Boolean> callable, Continuation<Void, Task<Void>> continuation, Executor executor, CancellationToken cancellationToken);

    public native <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation);

    public native <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken);

    public native <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor);

    public native <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation, Executor executor, CancellationToken cancellationToken);

    public native <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation);

    public native <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken);

    public native <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor);

    public native <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, CancellationToken cancellationToken);

    public native Exception getError();

    public native TResult getResult();

    public native boolean isCancelled();

    public native boolean isCompleted();

    public native boolean isFaulted();

    public native Task<Void> makeVoid();

    public native <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation);

    public native <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, CancellationToken cancellationToken);

    public native <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor);

    public native <TContinuationResult> Task<TContinuationResult> onSuccess(Continuation<TResult, TContinuationResult> continuation, Executor executor, CancellationToken cancellationToken);

    public native <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation);

    public native <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, CancellationToken cancellationToken);

    public native <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor);

    public native <TContinuationResult> Task<TContinuationResult> onSuccessTask(Continuation<TResult, Task<TContinuationResult>> continuation, Executor executor, CancellationToken cancellationToken);

    native boolean trySetCancelled();

    native boolean trySetError(Exception exception);

    native boolean trySetResult(TResult tResult);

    public native void waitForCompletion();

    public native boolean waitForCompletion(long j, TimeUnit timeUnit);

    static void __clinit__() {
        BACKGROUND_EXECUTOR = BoltsExecutors.background();
        IMMEDIATE_EXECUTOR = BoltsExecutors.immediate();
        UI_THREAD_EXECUTOR = AndroidExecutors.uiThread();
        TASK_NULL = new Task(null);
        TASK_TRUE = new Task(Boolean.valueOf(true));
        TASK_FALSE = new Task(Boolean.valueOf(false));
        TASK_CANCELLED = new Task(true);
    }

    public static UnobservedExceptionHandler getUnobservedExceptionHandler() {
        return unobservedExceptionHandler;
    }

    public static void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedExceptionHandler) {
        unobservedExceptionHandler = unobservedExceptionHandler;
    }

    public static <TResult> TaskCompletionSource create() {
        Task task = new Task();
        task.getClass();
        return new TaskCompletionSource(task);
    }

    public static <TResult> Task<TResult> forResult(TResult tResult) {
        if (tResult == null) {
            return TASK_NULL;
        }
        if (tResult instanceof Boolean) {
            return ((Boolean) tResult).booleanValue() ? TASK_TRUE : TASK_FALSE;
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(tResult);
            return taskCompletionSource.getTask();
        }
    }

    public static <TResult> Task<TResult> forError(Exception exception) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setError(exception);
        return taskCompletionSource.getTask();
    }

    public static <TResult> Task<TResult> cancelled() {
        return TASK_CANCELLED;
    }

    public static Task<Void> delay(long j) {
        return delay(j, BoltsExecutors.scheduled(), null);
    }

    public static Task<Void> delay(long j, CancellationToken cancellationToken) {
        return delay(j, BoltsExecutors.scheduled(), cancellationToken);
    }

    static Task<Void> delay(long j, ScheduledExecutorService scheduledExecutorService, CancellationToken cancellationToken) {
        if (cancellationToken != null && cancellationToken.isCancellationRequested()) {
            return cancelled();
        }
        if (j <= 0) {
            return forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ScheduledFuture schedule = scheduledExecutorService.schedule(new C02431(taskCompletionSource), j, TimeUnit.MILLISECONDS);
        if (cancellationToken != null) {
            cancellationToken.register(new C02442(schedule, taskCompletionSource));
        }
        return taskCompletionSource.getTask();
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return call(callable, BACKGROUND_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable, CancellationToken cancellationToken) {
        return call(callable, BACKGROUND_EXECUTOR, cancellationToken);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return call(callable, executor, null);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, CancellationToken cancellationToken) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            executor.execute(new C02464(cancellationToken, taskCompletionSource, callable));
        } catch (Exception e) {
            taskCompletionSource.setError(new ExecutorException(e));
        }
        return taskCompletionSource.getTask();
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(callable, IMMEDIATE_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, CancellationToken cancellationToken) {
        return call(callable, IMMEDIATE_EXECUTOR, cancellationToken);
    }

    public static <TResult> Task<Task<TResult>> whenAnyResult(Collection<? extends Task<TResult>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task continueWith : collection) {
            continueWith.continueWith(new C02475(atomicBoolean, taskCompletionSource));
        }
        return taskCompletionSource.getTask();
    }

    public static Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task continueWith : collection) {
            continueWith.continueWith(new C02486(atomicBoolean, taskCompletionSource));
        }
        return taskCompletionSource.getTask();
    }

    public static <TResult> Task<List<TResult>> whenAllResult(Collection<? extends Task<TResult>> collection) {
        return whenAll(collection).onSuccess(new C02497(collection));
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task continueWith : collection) {
            continueWith.continueWith(new C02508(obj, arrayList, atomicBoolean, atomicInteger, taskCompletionSource));
        }
        return taskCompletionSource.getTask();
    }

    private static <TContinuationResult, TResult> void completeImmediately(TaskCompletionSource<TContinuationResult> taskCompletionSource, Continuation<TResult, TContinuationResult> continuation, Task<TResult> task, Executor executor, CancellationToken cancellationToken) {
        try {
            executor.execute(new AnonymousClass14(cancellationToken, taskCompletionSource, continuation, task));
        } catch (Exception e) {
            taskCompletionSource.setError(new ExecutorException(e));
        }
    }

    private static <TContinuationResult, TResult> void completeAfterTask(TaskCompletionSource<TContinuationResult> taskCompletionSource, Continuation<TResult, Task<TContinuationResult>> continuation, Task<TResult> task, Executor executor, CancellationToken cancellationToken) {
        try {
            executor.execute(new AnonymousClass15(cancellationToken, taskCompletionSource, continuation, task));
        } catch (Exception e) {
            taskCompletionSource.setError(new ExecutorException(e));
        }
    }
}
