package org.apache.http.impl.conn.tsccm;

import java.util.Date;
import java.util.concurrent.locks.Condition;

@Deprecated
/* loaded from: classes.dex */
public class WaitingThread {
    public WaitingThread(Condition cond, RouteSpecificPool pool) {
        throw new RuntimeException("Stub!");
    }

    public final Condition getCondition() {
        throw new RuntimeException("Stub!");
    }

    public final RouteSpecificPool getPool() {
        throw new RuntimeException("Stub!");
    }

    public final Thread getThread() {
        throw new RuntimeException("Stub!");
    }

    public boolean await(Date deadline) throws InterruptedException {
        throw new RuntimeException("Stub!");
    }

    public void wakeup() {
        throw new RuntimeException("Stub!");
    }

    public void interrupt() {
        throw new RuntimeException("Stub!");
    }
}
