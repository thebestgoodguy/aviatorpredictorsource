package kotlinx.coroutines.internal;

import b4.f2;

/* loaded from: classes.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final n3.g f6419a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f6420b;

    /* renamed from: c, reason: collision with root package name */
    private final f2<Object>[] f6421c;

    /* renamed from: d, reason: collision with root package name */
    private int f6422d;

    public f0(n3.g gVar, int r22) {
        this.f6419a = gVar;
        this.f6420b = new Object[r22];
        this.f6421c = new f2[r22];
    }

    public final void a(f2<?> f2Var, Object obj) {
        Object[] objArr = this.f6420b;
        int r12 = this.f6422d;
        objArr[r12] = obj;
        f2<Object>[] f2VarArr = this.f6421c;
        this.f6422d = r12 + 1;
        f2VarArr[r12] = f2Var;
    }

    public final void b(n3.g gVar) {
        int length = this.f6421c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int r12 = length - 1;
            f2<Object> f2Var = this.f6421c[length];
            kotlin.jvm.internal.i.b(f2Var);
            f2Var.s(gVar, this.f6420b[length]);
            if (r12 < 0) {
                return;
            } else {
                length = r12;
            }
        }
    }
}
