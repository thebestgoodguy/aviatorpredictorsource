package u;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final e.a<b<?>, s.a> f7596a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a<b<?>, String> f7597b;

    /* renamed from: c, reason: collision with root package name */
    private final o0.i<Map<b<?>, String>> f7598c;

    /* renamed from: d, reason: collision with root package name */
    private int f7599d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7600e;

    public final Set<b<?>> a() {
        return this.f7596a.keySet();
    }

    public final void b(b<?> bVar, s.a aVar, String str) {
        this.f7596a.put(bVar, aVar);
        this.f7597b.put(bVar, str);
        this.f7599d--;
        if (!aVar.n0()) {
            this.f7600e = true;
        }
        if (this.f7599d == 0) {
            if (!this.f7600e) {
                this.f7598c.c(this.f7597b);
            } else {
                this.f7598c.b(new t.c(this.f7596a));
            }
        }
    }
}
