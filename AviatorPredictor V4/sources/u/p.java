package u;

import android.os.Looper;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import t.a;
import t.a.d;

/* loaded from: classes.dex */
public final class p<O extends a.d> extends m {

    /* renamed from: c, reason: collision with root package name */
    @NotOnlyInitialized
    private final t.e<O> f7632c;

    public p(t.e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f7632c = eVar;
    }

    @Override // t.f
    public final <A extends a.b, R extends t.k, T extends com.google.android.gms.common.api.internal.b<R, A>> T a(T t4) {
        return (T) this.f7632c.e(t4);
    }

    @Override // t.f
    public final Looper b() {
        return this.f7632c.i();
    }
}
