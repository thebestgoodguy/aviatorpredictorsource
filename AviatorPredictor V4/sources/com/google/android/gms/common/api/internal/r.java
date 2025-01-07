package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Map;
import java.util.Set;
import t.a;
import w.c;

/* loaded from: classes.dex */
final class r implements c.InterfaceC0100c, u.z {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f1312a;

    /* renamed from: b, reason: collision with root package name */
    private final u.b<?> f1313b;

    /* renamed from: c, reason: collision with root package name */
    private w.j f1314c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set<Scope> f1315d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1316e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f1317f;

    public r(c cVar, a.f fVar, u.b<?> bVar) {
        this.f1317f = cVar;
        this.f1312a = fVar;
        this.f1313b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        w.j jVar;
        if (!this.f1316e || (jVar = this.f1314c) == null) {
            return;
        }
        this.f1312a.f(jVar, this.f1315d);
    }

    @Override // u.z
    public final void a(s.a aVar) {
        Map map;
        map = this.f1317f.f1257l;
        o oVar = (o) map.get(this.f1313b);
        if (oVar != null) {
            oVar.I(aVar);
        }
    }

    @Override // u.z
    public final void b(w.j jVar, Set<Scope> set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new s.a(4));
        } else {
            this.f1314c = jVar;
            this.f1315d = set;
            h();
        }
    }

    @Override // w.c.InterfaceC0100c
    public final void c(s.a aVar) {
        this.f1317f.f1261p.post(new q(this, aVar));
    }
}
