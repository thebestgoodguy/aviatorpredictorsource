package i1;

import java.util.List;

/* loaded from: classes.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    private final l1.t f4190a;

    /* renamed from: b, reason: collision with root package name */
    private final m1.d f4191b;

    /* renamed from: c, reason: collision with root package name */
    private final List<m1.e> f4192c;

    p1(l1.t tVar, m1.d dVar, List<m1.e> list) {
        this.f4190a = tVar;
        this.f4191b = dVar;
        this.f4192c = list;
    }

    public m1.f a(l1.l lVar, m1.m mVar) {
        return new m1.l(lVar, this.f4190a, this.f4191b, mVar, this.f4192c);
    }
}
