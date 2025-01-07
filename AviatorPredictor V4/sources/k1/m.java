package k1;

import java.util.Map;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final int f6172a;

    /* renamed from: b, reason: collision with root package name */
    private final c1.c<l1.l, l1.i> f6173b;

    m(int r12, c1.c<l1.l, l1.i> cVar) {
        this.f6172a = r12;
        this.f6173b = cVar;
    }

    public static m a(int r32, Map<l1.l, y0> map) {
        c1.c<l1.l, l1.i> a5 = l1.j.a();
        for (Map.Entry<l1.l, y0> entry : map.entrySet()) {
            a5 = a5.t(entry.getKey(), entry.getValue().a());
        }
        return new m(r32, a5);
    }

    public int b() {
        return this.f6172a;
    }

    public c1.c<l1.l, l1.i> c() {
        return this.f6173b;
    }
}
