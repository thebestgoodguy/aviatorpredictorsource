package defpackage;

import com.android.tools.r8.annotations.SynthesizedClassV2;
import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@DoNotMock("Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator")
/* loaded from: classes61.dex */
public interface au extends ExecutorService {

    /* compiled from: D8$$SyntheticClass */
    @SynthesizedClassV2(kind = 7, versionHash = "79350b666c61fb98f585652cf8eb3be7850d2ab8c16c1e890d0171be2ca2d761")
    /* renamed from: au$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    as<?> a(Runnable runnable);

    <T> as<T> a(Runnable runnable, T t);

    <T> as<T> a(Callable<T> callable);

    @Override // java.util.concurrent.ExecutorService
    /* synthetic */ Future submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService
    /* synthetic */ Future submit(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService
    /* synthetic */ Future submit(Callable callable);
}
