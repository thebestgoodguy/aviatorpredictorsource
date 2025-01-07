package j1;

import com.google.protobuf.j;
import l1.q;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final g f5943a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final a f5944b = new a();

    /* renamed from: c, reason: collision with root package name */
    private final b f5945c = new b();

    class a extends j1.b {
        a() {
        }

        @Override // j1.b
        public void a(j jVar) {
            d.this.f5943a.h(jVar);
        }

        @Override // j1.b
        public void b(double d5) {
            d.this.f5943a.j(d5);
        }

        @Override // j1.b
        public void c() {
            d.this.f5943a.n();
        }

        @Override // j1.b
        public void d(long j4) {
            d.this.f5943a.r(j4);
        }

        @Override // j1.b
        public void e(String str) {
            d.this.f5943a.v(str);
        }
    }

    class b extends j1.b {
        b() {
        }

        @Override // j1.b
        public void a(j jVar) {
            d.this.f5943a.i(jVar);
        }

        @Override // j1.b
        public void b(double d5) {
            d.this.f5943a.k(d5);
        }

        @Override // j1.b
        public void c() {
            d.this.f5943a.o();
        }

        @Override // j1.b
        public void d(long j4) {
            d.this.f5943a.s(j4);
        }

        @Override // j1.b
        public void e(String str) {
            d.this.f5943a.w(str);
        }
    }

    public j1.b b(q.c.a aVar) {
        return aVar.equals(q.c.a.DESCENDING) ? this.f5945c : this.f5944b;
    }

    public byte[] c() {
        return this.f5943a.a();
    }

    public void d(byte[] bArr) {
        this.f5943a.c(bArr);
    }
}
