package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f5355c = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final String f5356a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f5357b;

    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f5358a;

        private b(long j4) {
            this.f5358a = j4;
        }

        public void a() {
            long j4 = this.f5358a;
            long max = Math.max(2 * j4, j4);
            if (h.this.f5357b.compareAndSet(this.f5358a, max)) {
                h.f5355c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{h.this.f5356a, Long.valueOf(max)});
            }
        }

        public long b() {
            return this.f5358a;
        }
    }

    public h(String str, long j4) {
        AtomicLong atomicLong = new AtomicLong();
        this.f5357b = atomicLong;
        q0.l.e(j4 > 0, "value must be positive");
        this.f5356a = str;
        atomicLong.set(j4);
    }

    public b d() {
        return new b(this.f5357b.get());
    }
}
