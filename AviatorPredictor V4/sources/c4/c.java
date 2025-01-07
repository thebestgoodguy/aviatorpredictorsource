package c4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import k3.m;
import k3.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1184a;
    private static volatile Choreographer choreographer;

    static {
        Object a5;
        try {
            m.a aVar = m.f6368e;
            a5 = m.a(new a(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            m.a aVar2 = m.f6368e;
            a5 = m.a(n.a(th));
        }
        f1184a = (b) (m.c(a5) ? null : a5);
    }

    public static final Handler a(Looper looper, boolean z4) {
        int r8;
        if (!z4 || (r8 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (r8 < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
