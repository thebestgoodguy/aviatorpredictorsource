package b3;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t implements Comparable<t> {

    /* renamed from: h, reason: collision with root package name */
    private static final b f889h = new b();

    /* renamed from: i, reason: collision with root package name */
    private static final long f890i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f891j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f892k;

    /* renamed from: e, reason: collision with root package name */
    private final c f893e;

    /* renamed from: f, reason: collision with root package name */
    private final long f894f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f895g;

    private static class b extends c {
        private b() {
        }

        @Override // b3.t.c
        public long a() {
            return System.nanoTime();
        }
    }

    public static abstract class c {
        public abstract long a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f890i = nanos;
        f891j = -nanos;
        f892k = TimeUnit.SECONDS.toNanos(1L);
    }

    private t(c cVar, long j4, long j5, boolean z4) {
        this.f893e = cVar;
        long min = Math.min(f890i, Math.max(f891j, j5));
        this.f894f = j4 + min;
        this.f895g = z4 && min <= 0;
    }

    private t(c cVar, long j4, boolean z4) {
        this(cVar, cVar.a(), j4, z4);
    }

    public static t d(long j4, TimeUnit timeUnit) {
        return g(j4, timeUnit, f889h);
    }

    public static t g(long j4, TimeUnit timeUnit, c cVar) {
        h(timeUnit, "units");
        return new t(cVar, timeUnit.toNanos(j4), true);
    }

    private static <T> T h(T t4, Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private void i(t tVar) {
        if (this.f893e == tVar.f893e) {
            return;
        }
        throw new AssertionError("Tickers (" + this.f893e + " and " + tVar.f893e + ") don't match. Custom Ticker should only be used in tests!");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        c cVar = this.f893e;
        if (cVar != null ? cVar == tVar.f893e : tVar.f893e == null) {
            return this.f894f == tVar.f894f;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f893e, Long.valueOf(this.f894f)).hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compareTo(t tVar) {
        i(tVar);
        long j4 = this.f894f - tVar.f894f;
        if (j4 < 0) {
            return -1;
        }
        return j4 > 0 ? 1 : 0;
    }

    public boolean n(t tVar) {
        i(tVar);
        return this.f894f - tVar.f894f < 0;
    }

    public boolean p() {
        if (!this.f895g) {
            if (this.f894f - this.f893e.a() > 0) {
                return false;
            }
            this.f895g = true;
        }
        return true;
    }

    public t q(t tVar) {
        i(tVar);
        return n(tVar) ? this : tVar;
    }

    public long r(TimeUnit timeUnit) {
        long a5 = this.f893e.a();
        if (!this.f895g && this.f894f - a5 <= 0) {
            this.f895g = true;
        }
        return timeUnit.convert(this.f894f - a5, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long r4 = r(TimeUnit.NANOSECONDS);
        long abs = Math.abs(r4);
        long j4 = f892k;
        long j5 = abs / j4;
        long abs2 = Math.abs(r4) % j4;
        StringBuilder sb = new StringBuilder();
        if (r4 < 0) {
            sb.append('-');
        }
        sb.append(j5);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        if (this.f893e != f889h) {
            sb.append(" (ticker=" + this.f893e + ")");
        }
        return sb.toString();
    }
}
