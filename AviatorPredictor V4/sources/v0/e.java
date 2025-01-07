package v0;

import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f7827a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f7828b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f7829c = null;

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f7830d = null;

    /* renamed from: e, reason: collision with root package name */
    private ThreadFactory f7831e = null;

    class a implements ThreadFactory {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f7832e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f7833f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AtomicLong f7834g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Boolean f7835h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Integer f7836i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f7837j;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f7832e = threadFactory;
            this.f7833f = str;
            this.f7834g = atomicLong;
            this.f7835h = bool;
            this.f7836i = num;
            this.f7837j = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f7832e.newThread(runnable);
            String str = this.f7833f;
            if (str != null) {
                newThread.setName(e.d(str, Long.valueOf(this.f7834g.getAndIncrement())));
            }
            Boolean bool = this.f7835h;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f7836i;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7837j;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    private static ThreadFactory c(e eVar) {
        String str = eVar.f7827a;
        Boolean bool = eVar.f7828b;
        Integer num = eVar.f7829c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = eVar.f7830d;
        ThreadFactory threadFactory = eVar.f7831e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public e e(boolean z4) {
        this.f7828b = Boolean.valueOf(z4);
        return this;
    }

    public e f(String str) {
        d(str, 0);
        this.f7827a = str;
        return this;
    }
}
