package m1;

import java.util.List;
import l1.w;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final g f6645a;

    /* renamed from: b, reason: collision with root package name */
    private final w f6646b;

    /* renamed from: c, reason: collision with root package name */
    private final List<i> f6647c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.protobuf.j f6648d;

    /* renamed from: e, reason: collision with root package name */
    private final c1.c<l1.l, w> f6649e;

    private h(g gVar, w wVar, List<i> list, com.google.protobuf.j jVar, c1.c<l1.l, w> cVar) {
        this.f6645a = gVar;
        this.f6646b = wVar;
        this.f6647c = list;
        this.f6648d = jVar;
        this.f6649e = cVar;
    }

    public static h a(g gVar, w wVar, List<i> list, com.google.protobuf.j jVar) {
        p1.b.d(gVar.h().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(gVar.h().size()), Integer.valueOf(list.size()));
        c1.c<l1.l, w> c5 = l1.j.c();
        List<f> h5 = gVar.h();
        c1.c<l1.l, w> cVar = c5;
        for (int r32 = 0; r32 < h5.size(); r32++) {
            cVar = cVar.t(h5.get(r32).g(), list.get(r32).b());
        }
        return new h(gVar, wVar, list, jVar, cVar);
    }

    public g b() {
        return this.f6645a;
    }

    public w c() {
        return this.f6646b;
    }

    public c1.c<l1.l, w> d() {
        return this.f6649e;
    }

    public List<i> e() {
        return this.f6647c;
    }

    public com.google.protobuf.j f() {
        return this.f6648d;
    }
}
