package w;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class e1 extends t0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f7969g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c cVar, int r22, Bundle bundle) {
        super(cVar, r22, null);
        this.f7969g = cVar;
    }

    @Override // w.t0
    protected final void f(s.a aVar) {
        if (this.f7969g.s() && c.f0(this.f7969g)) {
            c.b0(this.f7969g, 16);
        } else {
            this.f7969g.f7926p.c(aVar);
            this.f7969g.K(aVar);
        }
    }

    @Override // w.t0
    protected final boolean g() {
        this.f7969g.f7926p.c(s.a.f7474i);
        return true;
    }
}
