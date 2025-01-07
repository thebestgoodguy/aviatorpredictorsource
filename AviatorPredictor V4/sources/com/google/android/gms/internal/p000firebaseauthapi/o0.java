package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class o0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f1981a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1982b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f1983c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1984d;

    o0(e0 e0Var, String str, Object[] objArr) {
        this.f1981a = e0Var;
        this.f1982b = str;
        this.f1983c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f1984d = charAt;
            return;
        }
        int r4 = charAt & 8191;
        int r02 = 13;
        int r12 = 1;
        while (true) {
            int r22 = r12 + 1;
            char charAt2 = str.charAt(r12);
            if (charAt2 < 55296) {
                this.f1984d = r4 | (charAt2 << r02);
                return;
            } else {
                r4 |= (charAt2 & 8191) << r02;
                r02 += 13;
                r12 = r22;
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a0
    public final e0 a() {
        return this.f1981a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a0
    public final boolean b() {
        return (this.f1984d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a0
    public final int c() {
        return (this.f1984d & 1) == 1 ? 1 : 2;
    }

    final String d() {
        return this.f1982b;
    }

    final Object[] e() {
        return this.f1983c;
    }
}
