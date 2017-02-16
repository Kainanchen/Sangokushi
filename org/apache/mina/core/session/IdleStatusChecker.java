package org.apache.mina.core.session;

import java.util.Set;
import org.apache.mina.core.future.IoFuture;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.util.ConcurrentHashSet;

public class IdleStatusChecker {
    private final NotifyingTask notifyingTask;
    private final IoFutureListener<IoFuture> sessionCloseListener;
    private final Set<AbstractIoSession> sessions;

    public class NotifyingTask implements Runnable {
        private volatile boolean cancelled;
        private volatile Thread thread;

        NotifyingTask() {
        }

        public void run() {
            this.thread = Thread.currentThread();
            while (!this.cancelled) {
                try {
                    notifySessions(System.currentTimeMillis());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                } finally {
                    this.thread = null;
                }
            }
        }

        public void cancel() {
            this.cancelled = true;
            Thread thread = this.thread;
            if (thread != null) {
                thread.interrupt();
            }
        }

        private void notifySessions(long j) {
            for (AbstractIoSession abstractIoSession : IdleStatusChecker.this.sessions) {
                if (abstractIoSession.isConnected()) {
                    AbstractIoSession.notifyIdleSession(abstractIoSession, j);
                }
            }
        }
    }

    private class SessionCloseListener implements IoFutureListener<IoFuture> {
        public void operationComplete(IoFuture ioFuture) {
            IdleStatusChecker.this.removeSession((AbstractIoSession) ioFuture.getSession());
        }
    }

    public IdleStatusChecker() {
        this.sessions = new ConcurrentHashSet();
        this.notifyingTask = new NotifyingTask();
        this.sessionCloseListener = new SessionCloseListener();
    }

    public void addSession(AbstractIoSession abstractIoSession) {
        this.sessions.add(abstractIoSession);
        abstractIoSession.getCloseFuture().addListener(this.sessionCloseListener);
    }

    private void removeSession(AbstractIoSession abstractIoSession) {
        this.sessions.remove(abstractIoSession);
    }

    public NotifyingTask getNotifyingTask() {
        return this.notifyingTask;
    }
}
