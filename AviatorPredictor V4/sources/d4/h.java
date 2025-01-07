package d4;

/* loaded from: classes.dex */
public final class h {
    public static final <E> f<E> a(int r22, e eVar, u3.l<? super E, k3.s> lVar) {
        if (r22 == -2) {
            return new d(eVar == e.SUSPEND ? f.f3424a.a() : 1, eVar, lVar);
        }
        if (r22 != -1) {
            return r22 != 0 ? r22 != Integer.MAX_VALUE ? (r22 == 1 && eVar == e.DROP_OLDEST) ? new m(lVar) : new d(r22, eVar, lVar) : new n(lVar) : eVar == e.SUSPEND ? new r(lVar) : new d(1, eVar, lVar);
        }
        if ((eVar != e.SUSPEND ? 0 : 1) != 0) {
            return new m(lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }

    public static /* synthetic */ f b(int r02, e eVar, u3.l lVar, int r32, Object obj) {
        if ((r32 & 1) != 0) {
            r02 = 0;
        }
        if ((r32 & 2) != 0) {
            eVar = e.SUSPEND;
        }
        if ((r32 & 4) != 0) {
            lVar = null;
        }
        return a(r02, eVar, lVar);
    }
}
