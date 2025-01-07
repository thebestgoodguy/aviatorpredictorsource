package w;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import t.a;
import t.f;

/* loaded from: classes.dex */
public abstract class g<T extends IInterface> extends c<T> implements a.f {
    private final d F;
    private final Set<Scope> G;
    private final Account H;

    @Deprecated
    protected g(Context context, Looper looper, int r32, d dVar, f.a aVar, f.b bVar) {
        this(context, looper, r32, dVar, (u.c) aVar, (u.h) bVar);
    }

    protected g(Context context, Looper looper, int r12, d dVar, u.c cVar, u.h hVar) {
        this(context, looper, h.b(context), s.d.m(), r12, dVar, (u.c) r.i(cVar), (u.h) r.i(hVar));
    }

    protected g(Context context, Looper looper, h hVar, s.d dVar, int r15, d dVar2, u.c cVar, u.h hVar2) {
        super(context, looper, hVar, dVar, r15, cVar == null ? null : new h0(cVar), hVar2 == null ? null : new i0(hVar2), dVar2.h());
        this.F = dVar2;
        this.H = dVar2.a();
        this.G = i0(dVar2.c());
    }

    private final Set<Scope> i0(Set<Scope> set) {
        Set<Scope> h02 = h0(set);
        Iterator<Scope> it = h02.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return h02;
    }

    @Override // w.c
    protected final Set<Scope> B() {
        return this.G;
    }

    protected Set<Scope> h0(Set<Scope> set) {
        return set;
    }

    @Override // t.a.f
    public Set<Scope> i() {
        return m() ? this.G : Collections.emptySet();
    }

    @Override // w.c
    public final Account t() {
        return this.H;
    }

    @Override // w.c
    protected final Executor v() {
        return null;
    }
}
