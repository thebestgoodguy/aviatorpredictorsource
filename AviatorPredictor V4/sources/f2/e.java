package f2;

import android.os.Handler;
import android.os.Looper;
import f2.c;

/* loaded from: classes.dex */
public class e implements c.b {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f3690a = z2.a.a(Looper.getMainLooper());

    @Override // f2.c.b
    public void a(Runnable runnable) {
        this.f3690a.post(runnable);
    }
}
