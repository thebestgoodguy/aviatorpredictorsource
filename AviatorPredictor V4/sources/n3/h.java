package n3;

import java.io.Serializable;
import kotlin.jvm.internal.i;
import n3.g;
import u3.p;

/* loaded from: classes.dex */
public final class h implements g, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final h f6694e = new h();

    private h() {
    }

    @Override // n3.g
    public <R> R fold(R r4, p<? super R, ? super g.b, ? extends R> pVar) {
        i.d(pVar, "operation");
        return r4;
    }

    @Override // n3.g
    public <E extends g.b> E get(g.c<E> cVar) {
        i.d(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // n3.g
    public g minusKey(g.c<?> cVar) {
        i.d(cVar, "key");
        return this;
    }

    @Override // n3.g
    public g plus(g gVar) {
        i.d(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
