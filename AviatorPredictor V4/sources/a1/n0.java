package a1;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p000firebaseauthapi.c8;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n0 implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private static final n0 f95f = new n0();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f96e = new c8(Looper.getMainLooper());

    private n0() {
    }

    public static n0 a() {
        return f95f;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f96e.post(runnable);
    }
}
