package i;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class b {

    private static class a implements Executor {

        /* renamed from: e, reason: collision with root package name */
        private final Handler f4012e;

        a(Handler handler) {
            this.f4012e = (Handler) j.d.a(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f4012e.post((Runnable) j.d.a(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f4012e + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
