package k1;

import i1.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6094a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6095b;

    /* renamed from: c, reason: collision with root package name */
    private final c1.e<l1.l> f6096c;

    /* renamed from: d, reason: collision with root package name */
    private final c1.e<l1.l> f6097d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6098a;

        static {
            int[] r02 = new int[n.a.values().length];
            f6098a = r02;
            try {
                r02[n.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6098a[n.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g0(int r12, boolean z4, c1.e<l1.l> eVar, c1.e<l1.l> eVar2) {
        this.f6094a = r12;
        this.f6095b = z4;
        this.f6096c = eVar;
        this.f6097d = eVar2;
    }

    public static g0 a(int r6, i1.u1 u1Var) {
        c1.e eVar = new c1.e(new ArrayList(), l1.l.d());
        c1.e eVar2 = new c1.e(new ArrayList(), l1.l.d());
        for (i1.n nVar : u1Var.d()) {
            int r4 = a.f6098a[nVar.c().ordinal()];
            if (r4 == 1) {
                eVar = eVar.q(nVar.b().getKey());
            } else if (r4 == 2) {
                eVar2 = eVar2.q(nVar.b().getKey());
            }
        }
        return new g0(r6, u1Var.j(), eVar, eVar2);
    }

    public c1.e<l1.l> b() {
        return this.f6096c;
    }

    public c1.e<l1.l> c() {
        return this.f6097d;
    }

    public int d() {
        return this.f6094a;
    }

    public boolean e() {
        return this.f6095b;
    }
}
