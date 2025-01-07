package h4;

/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f3996a;

    /* renamed from: b, reason: collision with root package name */
    int f3997b;

    /* renamed from: c, reason: collision with root package name */
    int f3998c;

    /* renamed from: d, reason: collision with root package name */
    boolean f3999d;

    /* renamed from: e, reason: collision with root package name */
    boolean f4000e;

    /* renamed from: f, reason: collision with root package name */
    j f4001f;

    /* renamed from: g, reason: collision with root package name */
    j f4002g;

    j() {
        this.f3996a = new byte[8192];
        this.f4000e = true;
        this.f3999d = false;
    }

    j(byte[] bArr, int r22, int r32, boolean z4, boolean z5) {
        this.f3996a = bArr;
        this.f3997b = r22;
        this.f3998c = r32;
        this.f3999d = z4;
        this.f4000e = z5;
    }

    public final void a() {
        j jVar = this.f4002g;
        if (jVar == this) {
            throw new IllegalStateException();
        }
        if (jVar.f4000e) {
            int r12 = this.f3998c - this.f3997b;
            if (r12 > (8192 - jVar.f3998c) + (jVar.f3999d ? 0 : jVar.f3997b)) {
                return;
            }
            f(jVar, r12);
            b();
            k.a(this);
        }
    }

    public final j b() {
        j jVar = this.f4001f;
        j jVar2 = jVar != this ? jVar : null;
        j jVar3 = this.f4002g;
        jVar3.f4001f = jVar;
        this.f4001f.f4002g = jVar3;
        this.f4001f = null;
        this.f4002g = null;
        return jVar2;
    }

    public final j c(j jVar) {
        jVar.f4002g = this;
        jVar.f4001f = this.f4001f;
        this.f4001f.f4002g = jVar;
        this.f4001f = jVar;
        return jVar;
    }

    final j d() {
        this.f3999d = true;
        return new j(this.f3996a, this.f3997b, this.f3998c, true, false);
    }

    public final j e(int r6) {
        j b5;
        if (r6 <= 0 || r6 > this.f3998c - this.f3997b) {
            throw new IllegalArgumentException();
        }
        if (r6 >= 1024) {
            b5 = d();
        } else {
            b5 = k.b();
            System.arraycopy(this.f3996a, this.f3997b, b5.f3996a, 0, r6);
        }
        b5.f3998c = b5.f3997b + r6;
        this.f3997b += r6;
        this.f4002g.c(b5);
        return b5;
    }

    public final void f(j jVar, int r6) {
        if (!jVar.f4000e) {
            throw new IllegalArgumentException();
        }
        int r02 = jVar.f3998c;
        if (r02 + r6 > 8192) {
            if (jVar.f3999d) {
                throw new IllegalArgumentException();
            }
            int r32 = jVar.f3997b;
            if ((r02 + r6) - r32 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = jVar.f3996a;
            System.arraycopy(bArr, r32, bArr, 0, r02 - r32);
            jVar.f3998c -= jVar.f3997b;
            jVar.f3997b = 0;
        }
        System.arraycopy(this.f3996a, this.f3997b, jVar.f3996a, jVar.f3998c, r6);
        jVar.f3998c += r6;
        this.f3997b += r6;
    }
}
