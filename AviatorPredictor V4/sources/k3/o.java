package k3;

import java.io.Serializable;

/* loaded from: classes.dex */
final class o<T> implements g<T>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private u3.a<? extends T> f6370e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f6371f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f6372g;

    public o(u3.a<? extends T> aVar, Object obj) {
        kotlin.jvm.internal.i.d(aVar, "initializer");
        this.f6370e = aVar;
        this.f6371f = q.f6373a;
        this.f6372g = obj == null ? this : obj;
    }

    public /* synthetic */ o(u3.a aVar, Object obj, int r32, kotlin.jvm.internal.e eVar) {
        this(aVar, (r32 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f6371f != q.f6373a;
    }

    @Override // k3.g
    public T getValue() {
        T t4;
        T t5 = (T) this.f6371f;
        q qVar = q.f6373a;
        if (t5 != qVar) {
            return t5;
        }
        synchronized (this.f6372g) {
            t4 = (T) this.f6371f;
            if (t4 == qVar) {
                u3.a<? extends T> aVar = this.f6370e;
                kotlin.jvm.internal.i.b(aVar);
                t4 = aVar.invoke();
                this.f6371f = t4;
                this.f6370e = null;
            }
        }
        return t4;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
