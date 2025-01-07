package h4;

import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public class o {

    /* renamed from: d, reason: collision with root package name */
    public static final o f4007d = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f4008a;

    /* renamed from: b, reason: collision with root package name */
    private long f4009b;

    /* renamed from: c, reason: collision with root package name */
    private long f4010c;

    final class a extends o {
        a() {
        }

        @Override // h4.o
        public void c() {
        }
    }

    public long a() {
        if (this.f4008a) {
            return this.f4009b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean b() {
        return this.f4008a;
    }

    public void c() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4008a && this.f4009b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long d() {
        return this.f4010c;
    }
}
