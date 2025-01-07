package d4;

import b4.r0;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.y;

/* loaded from: classes.dex */
public final class j<E> extends s implements q<E> {

    /* renamed from: h, reason: collision with root package name */
    public final Throwable f3430h;

    @Override // d4.s
    public y A(n.b bVar) {
        return b4.n.f1027a;
    }

    @Override // d4.q
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public j<E> a() {
        return this;
    }

    @Override // d4.s
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public j<E> z() {
        return this;
    }

    public final Throwable E() {
        Throwable th = this.f3430h;
        return th == null ? new k("Channel was closed") : th;
    }

    public final Throwable F() {
        Throwable th = this.f3430h;
        return th == null ? new l("Channel was closed") : th;
    }

    @Override // d4.q
    public y b(E e5, n.b bVar) {
        return b4.n.f1027a;
    }

    @Override // d4.q
    public void c(E e5) {
    }

    @Override // kotlinx.coroutines.internal.n
    public String toString() {
        return "Closed@" + r0.b(this) + '[' + this.f3430h + ']';
    }

    @Override // d4.s
    public void y() {
    }
}
