package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final u.b<?> f1308a;

    /* renamed from: b, reason: collision with root package name */
    private final s.c f1309b;

    /* synthetic */ p(u.b bVar, s.c cVar, u.o oVar) {
        this.f1308a = bVar;
        this.f1309b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p)) {
            p pVar = (p) obj;
            if (w.p.a(this.f1308a, pVar.f1308a) && w.p.a(this.f1309b, pVar.f1309b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return w.p.b(this.f1308a, this.f1309b);
    }

    public final String toString() {
        return w.p.c(this).a("key", this.f1308a).a("feature", this.f1309b).toString();
    }
}
