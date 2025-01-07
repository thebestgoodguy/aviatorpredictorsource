package d3;

import io.grpc.internal.o2;

/* loaded from: classes.dex */
class n implements o2 {

    /* renamed from: a, reason: collision with root package name */
    private final h4.c f3380a;

    /* renamed from: b, reason: collision with root package name */
    private int f3381b;

    /* renamed from: c, reason: collision with root package name */
    private int f3382c;

    n(h4.c cVar, int r22) {
        this.f3380a = cVar;
        this.f3381b = r22;
    }

    @Override // io.grpc.internal.o2
    public void a() {
    }

    @Override // io.grpc.internal.o2
    public int b() {
        return this.f3382c;
    }

    @Override // io.grpc.internal.o2
    public void c(byte[] bArr, int r32, int r4) {
        this.f3380a.o0(bArr, r32, r4);
        this.f3381b -= r4;
        this.f3382c += r4;
    }

    @Override // io.grpc.internal.o2
    public int d() {
        return this.f3381b;
    }

    @Override // io.grpc.internal.o2
    public void e(byte b5) {
        this.f3380a.Z(b5);
        this.f3381b--;
        this.f3382c++;
    }

    h4.c f() {
        return this.f3380a;
    }
}
