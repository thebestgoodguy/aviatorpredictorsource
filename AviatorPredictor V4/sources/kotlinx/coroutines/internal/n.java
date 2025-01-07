package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class n {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f6438e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f6439f = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_prev");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6440g = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public static abstract class a extends c<n> {

        /* renamed from: b, reason: collision with root package name */
        public final n f6441b;

        /* renamed from: c, reason: collision with root package name */
        public n f6442c;

        public a(n nVar) {
            this.f6441b = nVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(n nVar, Object obj) {
            boolean z4 = obj == null;
            n nVar2 = z4 ? this.f6441b : this.f6442c;
            if (nVar2 != null && b4.l.a(n.f6438e, nVar, this, nVar2) && z4) {
                n nVar3 = this.f6441b;
                n nVar4 = this.f6442c;
                kotlin.jvm.internal.i.b(nVar4);
                nVar3.n(nVar4);
            }
        }
    }

    public static final class b extends u {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (b4.l.a(kotlinx.coroutines.internal.n.f6438e, r3, r2, ((kotlinx.coroutines.internal.v) r4).f6462a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.internal.n l(kotlinx.coroutines.internal.u r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.n r0 = (kotlinx.coroutines.internal.n) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.n.f6439f
            boolean r0 = b4.l.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.t()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.u
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.u r0 = (kotlinx.coroutines.internal.u) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.u r4 = (kotlinx.coroutines.internal.u) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.v
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.n.f6438e
            kotlinx.coroutines.internal.v r4 = (kotlinx.coroutines.internal.v) r4
            kotlinx.coroutines.internal.n r4 = r4.f6462a
            boolean r2 = b4.l.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.n r2 = (kotlinx.coroutines.internal.n) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.n r3 = (kotlinx.coroutines.internal.n) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.n.l(kotlinx.coroutines.internal.u):kotlinx.coroutines.internal.n");
    }

    private final n m(n nVar) {
        while (nVar.t()) {
            nVar = (n) nVar._prev;
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(n nVar) {
        n nVar2;
        do {
            nVar2 = (n) nVar._prev;
            if (o() != nVar) {
                return;
            }
        } while (!b4.l.a(f6439f, nVar, nVar2, this));
        if (t()) {
            nVar.l(null);
        }
    }

    private final v w() {
        v vVar = (v) this._removedRef;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this);
        f6440g.lazySet(this, vVar2);
        return vVar2;
    }

    public final boolean j(n nVar, n nVar2) {
        f6439f.lazySet(nVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6438e;
        atomicReferenceFieldUpdater.lazySet(nVar, nVar2);
        if (!b4.l.a(atomicReferenceFieldUpdater, this, nVar2, nVar)) {
            return false;
        }
        nVar.n(nVar2);
        return true;
    }

    public final boolean k(n nVar) {
        f6439f.lazySet(nVar, this);
        f6438e.lazySet(nVar, this);
        while (o() == this) {
            if (b4.l.a(f6438e, this, this, nVar)) {
                nVar.n(this);
                return true;
            }
        }
        return false;
    }

    public final Object o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof u)) {
                return obj;
            }
            ((u) obj).c(this);
        }
    }

    public final n p() {
        return m.b(o());
    }

    public final n q() {
        n l4 = l(null);
        return l4 == null ? m((n) this._prev) : l4;
    }

    public final void r() {
        ((v) o()).f6462a.s();
    }

    public final void s() {
        n nVar = this;
        while (true) {
            Object o4 = nVar.o();
            if (!(o4 instanceof v)) {
                nVar.l(null);
                return;
            }
            nVar = ((v) o4).f6462a;
        }
    }

    public boolean t() {
        return o() instanceof v;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public boolean u() {
        return v() == null;
    }

    public final n v() {
        Object o4;
        n nVar;
        do {
            o4 = o();
            if (o4 instanceof v) {
                return ((v) o4).f6462a;
            }
            if (o4 == this) {
                return (n) o4;
            }
            nVar = (n) o4;
        } while (!b4.l.a(f6438e, this, o4, nVar.w()));
        nVar.l(null);
        return null;
    }

    public final int x(n nVar, n nVar2, a aVar) {
        f6439f.lazySet(nVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6438e;
        atomicReferenceFieldUpdater.lazySet(nVar, nVar2);
        aVar.f6442c = nVar2;
        if (b4.l.a(atomicReferenceFieldUpdater, this, nVar2, aVar)) {
            return aVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }
}
