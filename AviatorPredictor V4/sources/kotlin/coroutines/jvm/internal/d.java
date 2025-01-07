package kotlin.coroutines.jvm.internal;

import n3.g;

/* loaded from: classes.dex */
public abstract class d extends a {
    private final n3.g _context;
    private transient n3.d<Object> intercepted;

    public d(n3.d<Object> dVar) {
        this(dVar, dVar == null ? null : dVar.getContext());
    }

    public d(n3.d<Object> dVar, n3.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // n3.d
    public n3.g getContext() {
        n3.g gVar = this._context;
        kotlin.jvm.internal.i.b(gVar);
        return gVar;
    }

    public final n3.d<Object> intercepted() {
        n3.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            n3.e eVar = (n3.e) getContext().get(n3.e.f6691d);
            dVar = eVar == null ? this : eVar.k(this);
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        n3.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(n3.e.f6691d);
            kotlin.jvm.internal.i.b(bVar);
            ((n3.e) bVar).n(dVar);
        }
        this.intercepted = c.f6375e;
    }
}
