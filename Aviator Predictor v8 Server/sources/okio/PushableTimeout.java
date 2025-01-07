package okio;

import java.util.concurrent.TimeUnit;

/* loaded from: classes60.dex */
final class PushableTimeout extends Timeout {
    private long originalDeadlineNanoTime;
    private boolean originalHasDeadline;
    private long originalTimeoutNanos;
    private Timeout pushed;

    PushableTimeout() {
    }

    void push(Timeout pushed) {
        this.pushed = pushed;
        this.originalHasDeadline = pushed.hasDeadline();
        this.originalDeadlineNanoTime = this.originalHasDeadline ? pushed.deadlineNanoTime() : -1L;
        this.originalTimeoutNanos = pushed.timeoutNanos();
        pushed.timeout(minTimeout(this.originalTimeoutNanos, timeoutNanos()), TimeUnit.NANOSECONDS);
        if (this.originalHasDeadline && hasDeadline()) {
            pushed.deadlineNanoTime(Math.min(deadlineNanoTime(), this.originalDeadlineNanoTime));
        } else if (hasDeadline()) {
            pushed.deadlineNanoTime(deadlineNanoTime());
        }
    }

    void pop() {
        this.pushed.timeout(this.originalTimeoutNanos, TimeUnit.NANOSECONDS);
        if (this.originalHasDeadline) {
            this.pushed.deadlineNanoTime(this.originalDeadlineNanoTime);
        } else {
            this.pushed.clearDeadline();
        }
    }
}
