package e4;

import k3.s;
import u3.p;

/* loaded from: classes.dex */
final class f<T> extends a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p<c<? super T>, n3.d<? super s>, Object> f3614a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(p<? super c<? super T>, ? super n3.d<? super s>, ? extends Object> pVar) {
        this.f3614a = pVar;
    }

    @Override // e4.a
    public Object b(c<? super T> cVar, n3.d<? super s> dVar) {
        Object c5;
        Object invoke = this.f3614a.invoke(cVar, dVar);
        c5 = o3.d.c();
        return invoke == c5 ? invoke : s.f6374a;
    }
}
