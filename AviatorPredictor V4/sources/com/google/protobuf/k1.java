package com.google.protobuf;

/* loaded from: classes.dex */
final class k1 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    private final v0 f2981a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2982b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f2983c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2984d;

    k1(v0 v0Var, String str, Object[] objArr) {
        char charAt;
        this.f2981a = v0Var;
        this.f2982b = str;
        this.f2983c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int r4 = charAt2 & 8191;
            int r02 = 13;
            int r12 = 1;
            while (true) {
                int r22 = r12 + 1;
                charAt = str.charAt(r12);
                if (charAt < 55296) {
                    break;
                }
                r4 |= (charAt & 8191) << r02;
                r02 += 13;
                r12 = r22;
            }
            charAt2 = r4 | (charAt << r02);
        }
        this.f2984d = charAt2;
    }

    @Override // com.google.protobuf.t0
    public h1 a() {
        return (this.f2984d & 1) == 1 ? h1.PROTO2 : h1.PROTO3;
    }

    @Override // com.google.protobuf.t0
    public v0 b() {
        return this.f2981a;
    }

    @Override // com.google.protobuf.t0
    public boolean c() {
        return (this.f2984d & 2) == 2;
    }

    Object[] d() {
        return this.f2983c;
    }

    String e() {
        return this.f2982b;
    }
}
