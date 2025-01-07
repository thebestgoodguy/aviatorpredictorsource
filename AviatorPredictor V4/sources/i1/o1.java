package i1;

import java.util.List;

/* loaded from: classes.dex */
public class o1 {

    /* renamed from: a, reason: collision with root package name */
    private final l1.t f4176a;

    /* renamed from: b, reason: collision with root package name */
    private final m1.d f4177b;

    /* renamed from: c, reason: collision with root package name */
    private final List<m1.e> f4178c;

    o1(l1.t tVar, m1.d dVar, List<m1.e> list) {
        this.f4176a = tVar;
        this.f4177b = dVar;
        this.f4178c = list;
    }

    public m1.f a(l1.l lVar, m1.m mVar) {
        m1.d dVar = this.f4177b;
        return dVar != null ? new m1.l(lVar, this.f4176a, dVar, mVar, this.f4178c) : new m1.o(lVar, this.f4176a, mVar, this.f4178c);
    }
}
