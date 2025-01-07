package o1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p1.g;
import x1.z;

/* loaded from: classes.dex */
public class v0 extends c<x1.z, x1.a0, a> {

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.protobuf.j f6954v = com.google.protobuf.j.f2914f;

    /* renamed from: s, reason: collision with root package name */
    private final j0 f6955s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f6956t;

    /* renamed from: u, reason: collision with root package name */
    private com.google.protobuf.j f6957u;

    public interface a extends p0 {
        void c();

        void d(l1.w wVar, List<m1.i> list);
    }

    v0(u uVar, p1.g gVar, j0 j0Var, a aVar) {
        super(uVar, x1.o.d(), gVar, g.d.WRITE_STREAM_CONNECTION_BACKOFF, g.d.WRITE_STREAM_IDLE, g.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f6956t = false;
        this.f6957u = f6954v;
        this.f6955s = j0Var;
    }

    @Override // o1.c
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void r(x1.a0 a0Var) {
        this.f6957u = a0Var.W();
        if (!this.f6956t) {
            this.f6956t = true;
            ((a) this.f6770m).c();
            return;
        }
        this.f6769l.f();
        l1.w y4 = this.f6955s.y(a0Var.U());
        int Y = a0Var.Y();
        ArrayList arrayList = new ArrayList(Y);
        for (int r32 = 0; r32 < Y; r32++) {
            arrayList.add(this.f6955s.p(a0Var.X(r32), y4));
        }
        ((a) this.f6770m).d(y4, arrayList);
    }

    void B(com.google.protobuf.j jVar) {
        this.f6957u = (com.google.protobuf.j) p1.x.b(jVar);
    }

    void C() {
        p1.b.d(m(), "Writing handshake requires an opened stream", new Object[0]);
        p1.b.d(!this.f6956t, "Handshake already completed", new Object[0]);
        x(x1.z.a0().D(this.f6955s.a()).t());
    }

    void D(List<m1.f> list) {
        p1.b.d(m(), "Writing mutations requires an opened stream", new Object[0]);
        p1.b.d(this.f6956t, "Handshake must be complete before writing mutations", new Object[0]);
        z.b a02 = x1.z.a0();
        Iterator<m1.f> it = list.iterator();
        while (it.hasNext()) {
            a02.B(this.f6955s.O(it.next()));
        }
        a02.E(this.f6957u);
        x(a02.t());
    }

    @Override // o1.c
    public /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // o1.c
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // o1.c
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // o1.c
    public void u() {
        this.f6956t = false;
        super.u();
    }

    @Override // o1.c
    public /* bridge */ /* synthetic */ void v() {
        super.v();
    }

    @Override // o1.c
    protected void w() {
        if (this.f6956t) {
            D(Collections.emptyList());
        }
    }

    com.google.protobuf.j y() {
        return this.f6957u;
    }

    boolean z() {
        return this.f6956t;
    }
}
