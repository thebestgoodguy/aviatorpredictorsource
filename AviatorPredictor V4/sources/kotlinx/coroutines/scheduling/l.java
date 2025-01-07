package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.z;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6513a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6514b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6515c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6516d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f6517e;

    /* renamed from: f, reason: collision with root package name */
    public static h f6518f;

    static {
        long e5;
        int d5;
        int a5;
        int d6;
        int e6;
        int d7;
        long e7;
        e5 = b0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f6513a = e5;
        d5 = b0.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        f6514b = d5;
        a5 = x3.f.a(z.a(), 2);
        d6 = b0.d("kotlinx.coroutines.scheduler.core.pool.size", a5, 1, 0, 8, null);
        f6515c = d6;
        e6 = x3.f.e(z.a() * 128, d6, 2097150);
        d7 = b0.d("kotlinx.coroutines.scheduler.max.pool.size", e6, 0, 2097150, 4, null);
        f6516d = d7;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e7 = b0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f6517e = timeUnit.toNanos(e7);
        f6518f = f.f6507a;
    }
}
