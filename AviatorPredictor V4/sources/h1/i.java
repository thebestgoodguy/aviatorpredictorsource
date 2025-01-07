package h1;

import i1.c1;
import i1.x0;

/* loaded from: classes.dex */
public class i implements c {

    /* renamed from: a, reason: collision with root package name */
    private final c1 f3925a;

    /* renamed from: b, reason: collision with root package name */
    private final x0.a f3926b;

    public i(c1 c1Var, x0.a aVar) {
        this.f3925a = c1Var;
        this.f3926b = aVar;
    }

    public x0.a a() {
        return this.f3926b;
    }

    public c1 b() {
        return this.f3925a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3925a.equals(iVar.f3925a) && this.f3926b == iVar.f3926b;
    }

    public int hashCode() {
        return (this.f3925a.hashCode() * 31) + this.f3926b.hashCode();
    }
}
