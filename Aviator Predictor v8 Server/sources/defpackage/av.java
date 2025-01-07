package defpackage;

import com.android.tools.r8.annotations.SynthesizedClassV2;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes61.dex */
public interface av extends au, ScheduledExecutorService {

    /* compiled from: D8$$SyntheticClass */
    @SynthesizedClassV2(kind = 7, versionHash = "79350b666c61fb98f585652cf8eb3be7850d2ab8c16c1e890d0171be2ca2d761")
    /* renamed from: av$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    at<?> a(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    at<?> a(Runnable runnable, long j, TimeUnit timeUnit);

    <V> at<V> a(Callable<V> callable, long j, TimeUnit timeUnit);

    at<?> b(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
