package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
public final class z extends v<Boolean> {

    /* renamed from: c, reason: collision with root package name */
    public final u.f<?> f1333c;

    public z(u.f<?> fVar, o0.i<Boolean> iVar) {
        super(4, iVar);
        this.f1333c = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final /* bridge */ /* synthetic */ void d(g gVar, boolean z4) {
    }

    @Override // u.s
    public final boolean f(o<?> oVar) {
        if (oVar.x().get(this.f1333c) == null) {
            return false;
        }
        throw null;
    }

    @Override // u.s
    public final s.c[] g(o<?> oVar) {
        if (oVar.x().get(this.f1333c) == null) {
            return null;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.v
    public final void h(o<?> oVar) {
        if (oVar.x().remove(this.f1333c) == null) {
            this.f1328b.e(Boolean.FALSE);
        } else {
            oVar.v();
            throw null;
        }
    }
}
