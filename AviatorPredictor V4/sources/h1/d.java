package h1;

import com.google.firebase.firestore.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l1.l;
import l1.s;
import p1.x;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final a f3900a;

    /* renamed from: b, reason: collision with root package name */
    private final e f3901b;

    /* renamed from: f, reason: collision with root package name */
    private long f3905f;

    /* renamed from: g, reason: collision with root package name */
    private h f3906g;

    /* renamed from: c, reason: collision with root package name */
    private final List<j> f3902c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private c1.c<l, s> f3904e = l1.j.b();

    /* renamed from: d, reason: collision with root package name */
    private final Map<l, h> f3903d = new HashMap();

    public d(a aVar, e eVar) {
        this.f3900a = aVar;
        this.f3901b = eVar;
    }

    private Map<String, c1.e<l>> c() {
        HashMap hashMap = new HashMap();
        Iterator<j> it = this.f3902c.iterator();
        while (it.hasNext()) {
            hashMap.put(it.next().b(), l.i());
        }
        for (h hVar : this.f3903d.values()) {
            for (String str : hVar.c()) {
                hashMap.put(str, ((c1.e) hashMap.get(str)).q(hVar.b()));
            }
        }
        return hashMap;
    }

    public d0 a(c cVar, long j4) {
        c1.c<l, s> cVar2;
        l b5;
        s v4;
        x.a(!(cVar instanceof e), "Unexpected bundle metadata element.", new Object[0]);
        int size = this.f3904e.size();
        if (cVar instanceof j) {
            this.f3902c.add((j) cVar);
        } else if (cVar instanceof h) {
            h hVar = (h) cVar;
            this.f3903d.put(hVar.b(), hVar);
            this.f3906g = hVar;
            if (!hVar.a()) {
                cVar2 = this.f3904e;
                b5 = hVar.b();
                v4 = s.r(hVar.b(), hVar.d()).v(hVar.d());
                this.f3904e = cVar2.t(b5, v4);
                this.f3906g = null;
            }
        } else if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f3906g == null || !bVar.b().equals(this.f3906g.b())) {
                throw new IllegalArgumentException("The document being added does not match the stored metadata.");
            }
            cVar2 = this.f3904e;
            b5 = bVar.b();
            v4 = bVar.a().v(this.f3906g.d());
            this.f3904e = cVar2.t(b5, v4);
            this.f3906g = null;
        }
        this.f3905f += j4;
        if (size != this.f3904e.size()) {
            return new d0(this.f3904e.size(), this.f3901b.e(), this.f3905f, this.f3901b.d(), null, d0.a.RUNNING);
        }
        return null;
    }

    public c1.c<l, l1.i> b() {
        x.a(this.f3906g == null, "Bundled documents end with a document metadata element instead of a document.", new Object[0]);
        x.a(this.f3901b.a() != null, "Bundle ID must be set", new Object[0]);
        x.a(this.f3904e.size() == this.f3901b.e(), "Expected %s documents, but loaded %s.", Integer.valueOf(this.f3901b.e()), Integer.valueOf(this.f3904e.size()));
        c1.c<l, l1.i> a5 = this.f3900a.a(this.f3904e, this.f3901b.a());
        Map<String, c1.e<l>> c5 = c();
        for (j jVar : this.f3902c) {
            this.f3900a.c(jVar, c5.get(jVar.b()));
        }
        this.f3900a.b(this.f3901b);
        return a5;
    }
}
