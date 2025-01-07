package o1;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private final l1.w f6804a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, q0> f6805b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Integer> f6806c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<l1.l, l1.s> f6807d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<l1.l> f6808e;

    public i0(l1.w wVar, Map<Integer, q0> map, Set<Integer> set, Map<l1.l, l1.s> map2, Set<l1.l> set2) {
        this.f6804a = wVar;
        this.f6805b = map;
        this.f6806c = set;
        this.f6807d = map2;
        this.f6808e = set2;
    }

    public Map<l1.l, l1.s> a() {
        return this.f6807d;
    }

    public Set<l1.l> b() {
        return this.f6808e;
    }

    public l1.w c() {
        return this.f6804a;
    }

    public Map<Integer, q0> d() {
        return this.f6805b;
    }

    public Set<Integer> e() {
        return this.f6806c;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f6804a + ", targetChanges=" + this.f6805b + ", targetMismatches=" + this.f6806c + ", documentUpdates=" + this.f6807d + ", resolvedLimboDocuments=" + this.f6808e + '}';
    }
}
