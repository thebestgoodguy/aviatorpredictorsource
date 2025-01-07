package l1;

/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: b, reason: collision with root package name */
    private final l f6565b;

    /* renamed from: c, reason: collision with root package name */
    private b f6566c;

    /* renamed from: d, reason: collision with root package name */
    private w f6567d;

    /* renamed from: e, reason: collision with root package name */
    private w f6568e;

    /* renamed from: f, reason: collision with root package name */
    private t f6569f;

    /* renamed from: g, reason: collision with root package name */
    private a f6570g;

    private enum a {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    private enum b {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    private s(l lVar) {
        this.f6565b = lVar;
        this.f6568e = w.f6583f;
    }

    private s(l lVar, b bVar, w wVar, w wVar2, t tVar, a aVar) {
        this.f6565b = lVar;
        this.f6567d = wVar;
        this.f6568e = wVar2;
        this.f6566c = bVar;
        this.f6570g = aVar;
        this.f6569f = tVar;
    }

    public static s p(l lVar, w wVar, t tVar) {
        return new s(lVar).l(wVar, tVar);
    }

    public static s q(l lVar) {
        b bVar = b.INVALID;
        w wVar = w.f6583f;
        return new s(lVar, bVar, wVar, wVar, new t(), a.SYNCED);
    }

    public static s r(l lVar, w wVar) {
        return new s(lVar).m(wVar);
    }

    public static s s(l lVar, w wVar) {
        return new s(lVar).n(wVar);
    }

    @Override // l1.i
    public s a() {
        return new s(this.f6565b, this.f6566c, this.f6567d, this.f6568e, this.f6569f.clone(), this.f6570g);
    }

    @Override // l1.i
    public boolean b() {
        return this.f6566c.equals(b.FOUND_DOCUMENT);
    }

    @Override // l1.i
    public boolean c() {
        return i() || g();
    }

    @Override // l1.i
    public w d() {
        return this.f6568e;
    }

    @Override // l1.i
    public boolean e() {
        return this.f6566c.equals(b.NO_DOCUMENT);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f6565b.equals(sVar.f6565b) && this.f6567d.equals(sVar.f6567d) && this.f6566c.equals(sVar.f6566c) && this.f6570g.equals(sVar.f6570g)) {
            return this.f6569f.equals(sVar.f6569f);
        }
        return false;
    }

    @Override // l1.i
    public x1.x f(r rVar) {
        return k().h(rVar);
    }

    @Override // l1.i
    public boolean g() {
        return this.f6570g.equals(a.HAS_COMMITTED_MUTATIONS);
    }

    @Override // l1.i
    public l getKey() {
        return this.f6565b;
    }

    @Override // l1.i
    public boolean h() {
        return this.f6566c.equals(b.UNKNOWN_DOCUMENT);
    }

    public int hashCode() {
        return this.f6565b.hashCode();
    }

    @Override // l1.i
    public boolean i() {
        return this.f6570g.equals(a.HAS_LOCAL_MUTATIONS);
    }

    @Override // l1.i
    public w j() {
        return this.f6567d;
    }

    @Override // l1.i
    public t k() {
        return this.f6569f;
    }

    public s l(w wVar, t tVar) {
        this.f6567d = wVar;
        this.f6566c = b.FOUND_DOCUMENT;
        this.f6569f = tVar;
        this.f6570g = a.SYNCED;
        return this;
    }

    public s m(w wVar) {
        this.f6567d = wVar;
        this.f6566c = b.NO_DOCUMENT;
        this.f6569f = new t();
        this.f6570g = a.SYNCED;
        return this;
    }

    public s n(w wVar) {
        this.f6567d = wVar;
        this.f6566c = b.UNKNOWN_DOCUMENT;
        this.f6569f = new t();
        this.f6570g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public boolean o() {
        return !this.f6566c.equals(b.INVALID);
    }

    public s t() {
        this.f6570g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public String toString() {
        return "Document{key=" + this.f6565b + ", version=" + this.f6567d + ", readTime=" + this.f6568e + ", type=" + this.f6566c + ", documentState=" + this.f6570g + ", value=" + this.f6569f + '}';
    }

    public s u() {
        this.f6570g = a.HAS_LOCAL_MUTATIONS;
        this.f6567d = w.f6583f;
        return this;
    }

    public s v(w wVar) {
        this.f6568e = wVar;
        return this;
    }
}
