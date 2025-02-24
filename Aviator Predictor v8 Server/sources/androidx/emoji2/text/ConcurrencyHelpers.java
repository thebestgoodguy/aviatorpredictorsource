package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes27.dex */
class ConcurrencyHelpers {
    private static final int FONT_LOAD_TIMEOUT_SECONDS = 15;

    private ConcurrencyHelpers() {
    }

    static ThreadPoolExecutor createBackgroundPriorityExecutor(final String name) {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ConcurrencyHelpers.lambda$createBackgroundPriorityExecutor$0(name, runnable);
            }
        };
        ThreadPoolExecutor executor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactory);
        executor.allowCoreThreadTimeOut(true);
        return executor;
    }

    static /* synthetic */ Thread lambda$createBackgroundPriorityExecutor$0(String name, Runnable runnable) {
        Thread t = new Thread(runnable, name);
        t.setPriority(10);
        return t;
    }

    static Handler mainHandlerAsync() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler28Impl.createAsync(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }

    @Deprecated
    static Executor convertHandlerToExecutor(final Handler handler) {
        handler.getClass();
        return new Executor() { // from class: androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    static class Handler28Impl {
        private Handler28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
