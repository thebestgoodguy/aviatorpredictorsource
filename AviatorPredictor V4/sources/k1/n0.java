package k1;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class n0 implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, h1.e> f6184a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, h1.j> f6185b = new HashMap();

    n0() {
    }

    @Override // k1.a
    public h1.e a(String str) {
        return this.f6184a.get(str);
    }

    @Override // k1.a
    public void b(h1.e eVar) {
        this.f6184a.put(eVar.a(), eVar);
    }

    @Override // k1.a
    public h1.j c(String str) {
        return this.f6185b.get(str);
    }

    @Override // k1.a
    public void d(h1.j jVar) {
        this.f6185b.put(jVar.b(), jVar);
    }
}
