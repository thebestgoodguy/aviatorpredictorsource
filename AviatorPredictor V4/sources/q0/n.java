package q0;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final r f7158a = r.b();

    /* renamed from: b, reason: collision with root package name */
    private boolean f7159b;

    /* renamed from: c, reason: collision with root package name */
    private long f7160c;

    /* renamed from: d, reason: collision with root package name */
    private long f7161d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7162a;

        static {
            int[] r02 = new int[TimeUnit.values().length];
            f7162a = r02;
            try {
                r02[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7162a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7162a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7162a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7162a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7162a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7162a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    n() {
    }

    private static String a(TimeUnit timeUnit) {
        switch (a.f7162a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit b(long j4) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j4, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j4, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j4, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j4, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j4, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j4, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static n c() {
        return new n();
    }

    private long e() {
        return this.f7159b ? (this.f7158a.a() - this.f7161d) + this.f7160c : this.f7160c;
    }

    public long d(TimeUnit timeUnit) {
        return timeUnit.convert(e(), TimeUnit.NANOSECONDS);
    }

    public n f() {
        this.f7160c = 0L;
        this.f7159b = false;
        return this;
    }

    public n g() {
        l.u(!this.f7159b, "This stopwatch is already running.");
        this.f7159b = true;
        this.f7161d = this.f7158a.a();
        return this;
    }

    public String toString() {
        long e5 = e();
        TimeUnit b5 = b(e5);
        String a5 = k.a(e5 / TimeUnit.NANOSECONDS.convert(1L, b5));
        String a6 = a(b5);
        StringBuilder sb = new StringBuilder(String.valueOf(a5).length() + 1 + String.valueOf(a6).length());
        sb.append(a5);
        sb.append(" ");
        sb.append(a6);
        return sb.toString();
    }
}
