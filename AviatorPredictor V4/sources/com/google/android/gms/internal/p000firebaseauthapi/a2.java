package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
abstract class a2 extends d9 {

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f1370g;

    /* renamed from: h, reason: collision with root package name */
    final jf f1371h;

    /* renamed from: i, reason: collision with root package name */
    int f1372i = 0;

    /* renamed from: j, reason: collision with root package name */
    int f1373j;

    protected a2(c2 c2Var, CharSequence charSequence) {
        jf jfVar;
        jfVar = c2Var.f1447a;
        this.f1371h = jfVar;
        this.f1373j = Integer.MAX_VALUE;
        this.f1370g = charSequence;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.d9
    protected final /* bridge */ /* synthetic */ Object c() {
        int e5;
        int r02 = this.f1372i;
        while (true) {
            int r12 = this.f1372i;
            if (r12 == -1) {
                d();
                return null;
            }
            int f5 = f(r12);
            if (f5 == -1) {
                f5 = this.f1370g.length();
                this.f1372i = -1;
                e5 = -1;
            } else {
                e5 = e(f5);
                this.f1372i = e5;
            }
            if (e5 != r02) {
                if (r02 < f5) {
                    this.f1370g.charAt(r02);
                }
                if (r02 < f5) {
                    this.f1370g.charAt(f5 - 1);
                }
                int r32 = this.f1373j;
                if (r32 == 1) {
                    f5 = this.f1370g.length();
                    this.f1372i = -1;
                    if (f5 > r02) {
                        this.f1370g.charAt(f5 - 1);
                    }
                } else {
                    this.f1373j = r32 - 1;
                }
                return this.f1370g.subSequence(r02, f5).toString();
            }
            int r33 = e5 + 1;
            this.f1372i = r33;
            if (r33 > this.f1370g.length()) {
                this.f1372i = -1;
            }
        }
    }

    abstract int e(int r12);

    abstract int f(int r12);
}
