package y;

import android.content.Context;
import com.google.android.gms.common.api.internal.d;
import o0.h;
import o0.i;
import t.a;
import t.e;
import u.j;
import w.v;
import w.x;
import w.y;

/* loaded from: classes.dex */
public final class d extends t.e<y> implements x {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g<e> f8307k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0089a<e, y> f8308l;

    /* renamed from: m, reason: collision with root package name */
    private static final t.a<y> f8309m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f8310n = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f8307k = gVar;
        c cVar = new c();
        f8308l = cVar;
        f8309m = new t.a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, y yVar) {
        super(context, f8309m, yVar, e.a.f7558c);
    }

    @Override // w.x
    public final h<Void> a(final v vVar) {
        d.a a5 = com.google.android.gms.common.api.internal.d.a();
        a5.d(g0.d.f3864a);
        a5.c(false);
        a5.b(new j() { // from class: y.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // u.j
            public final void a(Object obj, Object obj2) {
                v vVar2 = v.this;
                int r12 = d.f8310n;
                ((a) ((e) obj).C()).w(vVar2);
                ((i) obj2).c(null);
            }
        });
        return d(a5.a());
    }
}
