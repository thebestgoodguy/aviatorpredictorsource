package w;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import t.g;
import w.q;

/* loaded from: classes.dex */
final class m0 implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t.g f8014a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o0.i f8015b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q.a f8016c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o0 f8017d;

    m0(t.g gVar, o0.i iVar, q.a aVar, o0 o0Var) {
        this.f8014a = gVar;
        this.f8015b = iVar;
        this.f8016c = aVar;
        this.f8017d = o0Var;
    }

    @Override // t.g.a
    public final void a(Status status) {
        if (!status.n0()) {
            this.f8015b.b(b.a(status));
        } else {
            this.f8015b.c(this.f8016c.a(this.f8014a.b(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
