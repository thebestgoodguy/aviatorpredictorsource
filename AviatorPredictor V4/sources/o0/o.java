package o0;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6714a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f6715b;

    /* renamed from: c, reason: collision with root package name */
    private final f0<Void> f6716c;

    /* renamed from: d, reason: collision with root package name */
    private int f6717d;

    /* renamed from: e, reason: collision with root package name */
    private int f6718e;

    /* renamed from: f, reason: collision with root package name */
    private int f6719f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f6720g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6721h;

    public o(int r22, f0<Void> f0Var) {
        this.f6715b = r22;
        this.f6716c = f0Var;
    }

    private final void a() {
        if (this.f6717d + this.f6718e + this.f6719f == this.f6715b) {
            if (this.f6720g == null) {
                if (this.f6721h) {
                    this.f6716c.s();
                    return;
                } else {
                    this.f6716c.r(null);
                    return;
                }
            }
            f0<Void> f0Var = this.f6716c;
            int r22 = this.f6718e;
            int r32 = this.f6715b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(r22);
            sb.append(" out of ");
            sb.append(r32);
            sb.append(" underlying tasks failed");
            f0Var.q(new ExecutionException(sb.toString(), this.f6720g));
        }
    }

    @Override // o0.c
    public final void b() {
        synchronized (this.f6714a) {
            this.f6719f++;
            this.f6721h = true;
            a();
        }
    }

    @Override // o0.e
    public final void c(Exception exc) {
        synchronized (this.f6714a) {
            this.f6718e++;
            this.f6720g = exc;
            a();
        }
    }

    @Override // o0.f
    public final void d(Object obj) {
        synchronized (this.f6714a) {
            this.f6717d++;
            a();
        }
    }
}
