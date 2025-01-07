package h4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a extends o {

    /* renamed from: h, reason: collision with root package name */
    private static final long f3963h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f3964i;

    /* renamed from: j, reason: collision with root package name */
    static a f3965j;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3966e;

    /* renamed from: f, reason: collision with root package name */
    private a f3967f;

    /* renamed from: g, reason: collision with root package name */
    private long f3968g;

    /* renamed from: h4.a$a, reason: collision with other inner class name */
    class C0043a implements m {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f3969e;

        C0043a(m mVar) {
            this.f3969e = mVar;
        }

        @Override // h4.m, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a.this.g();
            try {
                try {
                    this.f3969e.close();
                    a.this.i(true);
                } catch (IOException e5) {
                    throw a.this.h(e5);
                }
            } catch (Throwable th) {
                a.this.i(false);
                throw th;
            }
        }

        @Override // h4.m, java.io.Flushable
        public void flush() {
            a.this.g();
            try {
                try {
                    this.f3969e.flush();
                    a.this.i(true);
                } catch (IOException e5) {
                    throw a.this.h(e5);
                }
            } catch (Throwable th) {
                a.this.i(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f3969e + ")";
        }

        @Override // h4.m
        public void w(h4.c cVar, long j4) {
            p.b(cVar.f3977f, 0L, j4);
            while (true) {
                long j5 = 0;
                if (j4 <= 0) {
                    return;
                }
                j jVar = cVar.f3976e;
                while (true) {
                    if (j5 >= 65536) {
                        break;
                    }
                    j5 += jVar.f3998c - jVar.f3997b;
                    if (j5 >= j4) {
                        j5 = j4;
                        break;
                    }
                    jVar = jVar.f4001f;
                }
                a.this.g();
                try {
                    try {
                        this.f3969e.w(cVar, j5);
                        j4 -= j5;
                        a.this.i(true);
                    } catch (IOException e5) {
                        throw a.this.h(e5);
                    }
                } catch (Throwable th) {
                    a.this.i(false);
                    throw th;
                }
            }
        }
    }

    class b implements n {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f3971e;

        b(n nVar) {
            this.f3971e = nVar;
        }

        @Override // h4.n, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a.this.g();
            try {
                try {
                    this.f3971e.close();
                    a.this.i(true);
                } catch (IOException e5) {
                    throw a.this.h(e5);
                }
            } catch (Throwable th) {
                a.this.i(false);
                throw th;
            }
        }

        @Override // h4.n
        public long o(h4.c cVar, long j4) {
            a.this.g();
            try {
                try {
                    long o4 = this.f3971e.o(cVar, j4);
                    a.this.i(true);
                    return o4;
                } catch (IOException e5) {
                    throw a.this.h(e5);
                }
            } catch (Throwable th) {
                a.this.i(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f3971e + ")";
        }
    }

    private static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
        
            r1.p();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<h4.a> r0 = h4.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                h4.a r1 = h4.a.e()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                h4.a r2 = h4.a.f3965j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                h4.a.f3965j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.p()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: h4.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f3963h = millis;
        f3964i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    static a e() {
        a aVar = f3965j.f3967f;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            a.class.wait(f3963h);
            if (f3965j.f3967f != null || System.nanoTime() - nanoTime < f3964i) {
                return null;
            }
            return f3965j;
        }
        long l4 = aVar.l(nanoTime);
        if (l4 > 0) {
            long j4 = l4 / 1000000;
            a.class.wait(j4, (int) (l4 - (1000000 * j4)));
            return null;
        }
        f3965j.f3967f = aVar.f3967f;
        aVar.f3967f = null;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000b, code lost:
    
        r1.f3967f = r3.f3967f;
        r3.f3967f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized boolean f(h4.a r3) {
        /*
            java.lang.Class<h4.a> r0 = h4.a.class
            monitor-enter(r0)
            h4.a r1 = h4.a.f3965j     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L17
            h4.a r2 = r1.f3967f     // Catch: java.lang.Throwable -> L19
            if (r2 != r3) goto L15
            h4.a r2 = r3.f3967f     // Catch: java.lang.Throwable -> L19
            r1.f3967f = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.f3967f = r1     // Catch: java.lang.Throwable -> L19
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r1 = r2
            goto L5
        L17:
            r3 = 1
            goto L13
        L19:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.a.f(h4.a):boolean");
    }

    private long l(long j4) {
        return this.f3968g - j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:11:0x002b, B:12:0x003a, B:13:0x0040, B:15:0x0044, B:17:0x004d, B:20:0x0050, B:22:0x005a, B:30:0x0034, B:31:0x005f, B:32:0x0064), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized void m(h4.a r6, long r7, boolean r9) {
        /*
            java.lang.Class<h4.a> r0 = h4.a.class
            monitor-enter(r0)
            h4.a r1 = h4.a.f3965j     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L16
            h4.a r1 = new h4.a     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            h4.a.f3965j = r1     // Catch: java.lang.Throwable -> L65
            h4.a$c r1 = new h4.a$c     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            r1.start()     // Catch: java.lang.Throwable -> L65
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L65
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            if (r9 == 0) goto L2f
            long r3 = r6.a()     // Catch: java.lang.Throwable -> L65
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L65
        L2b:
            long r7 = r7 + r1
            r6.f3968g = r7     // Catch: java.lang.Throwable -> L65
            goto L3a
        L2f:
            if (r5 == 0) goto L32
            goto L2b
        L32:
            if (r9 == 0) goto L5f
            long r7 = r6.a()     // Catch: java.lang.Throwable -> L65
            r6.f3968g = r7     // Catch: java.lang.Throwable -> L65
        L3a:
            long r7 = r6.l(r1)     // Catch: java.lang.Throwable -> L65
            h4.a r9 = h4.a.f3965j     // Catch: java.lang.Throwable -> L65
        L40:
            h4.a r3 = r9.f3967f     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L50
            long r3 = r3.l(r1)     // Catch: java.lang.Throwable -> L65
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L4d
            goto L50
        L4d:
            h4.a r9 = r9.f3967f     // Catch: java.lang.Throwable -> L65
            goto L40
        L50:
            h4.a r7 = r9.f3967f     // Catch: java.lang.Throwable -> L65
            r6.f3967f = r7     // Catch: java.lang.Throwable -> L65
            r9.f3967f = r6     // Catch: java.lang.Throwable -> L65
            h4.a r6 = h4.a.f3965j     // Catch: java.lang.Throwable -> L65
            if (r9 != r6) goto L5d
            r0.notify()     // Catch: java.lang.Throwable -> L65
        L5d:
            monitor-exit(r0)
            return
        L5f:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L65
            r6.<init>()     // Catch: java.lang.Throwable -> L65
            throw r6     // Catch: java.lang.Throwable -> L65
        L65:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.a.m(h4.a, long, boolean):void");
    }

    public final void g() {
        if (this.f3966e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long d5 = d();
        boolean b5 = b();
        if (d5 != 0 || b5) {
            this.f3966e = true;
            m(this, d5, b5);
        }
    }

    final IOException h(IOException iOException) {
        return !j() ? iOException : k(iOException);
    }

    final void i(boolean z4) {
        if (j() && z4) {
            throw k(null);
        }
    }

    public final boolean j() {
        if (!this.f3966e) {
            return false;
        }
        this.f3966e = false;
        return f(this);
    }

    protected IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final m n(m mVar) {
        return new C0043a(mVar);
    }

    public final n o(n nVar) {
        return new b(nVar);
    }

    protected void p() {
    }
}
