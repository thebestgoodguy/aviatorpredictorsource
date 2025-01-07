package a;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f0c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f1d = new ExecutorC0000a();

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f2e = new b();

    /* renamed from: a, reason: collision with root package name */
    private c f3a;

    /* renamed from: b, reason: collision with root package name */
    private c f4b;

    /* renamed from: a.a$a, reason: collision with other inner class name */
    static class ExecutorC0000a implements Executor {
        ExecutorC0000a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().c(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().a(runnable);
        }
    }

    private a() {
        a.b bVar = new a.b();
        this.f4b = bVar;
        this.f3a = bVar;
    }

    public static a d() {
        if (f0c != null) {
            return f0c;
        }
        synchronized (a.class) {
            if (f0c == null) {
                f0c = new a();
            }
        }
        return f0c;
    }

    @Override // a.c
    public void a(Runnable runnable) {
        this.f3a.a(runnable);
    }

    @Override // a.c
    public boolean b() {
        return this.f3a.b();
    }

    @Override // a.c
    public void c(Runnable runnable) {
        this.f3a.c(runnable);
    }
}
