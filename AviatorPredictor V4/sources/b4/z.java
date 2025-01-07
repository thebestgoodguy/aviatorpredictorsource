package b4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1085b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1086a;

    public z(Throwable th, boolean z4) {
        this.f1086a = th;
        this._handled = z4 ? 1 : 0;
    }

    public /* synthetic */ z(Throwable th, boolean z4, int r32, kotlin.jvm.internal.e eVar) {
        this(th, (r32 & 2) != 0 ? false : z4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f1085b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return r0.a(this) + '[' + this.f1086a + ']';
    }
}
