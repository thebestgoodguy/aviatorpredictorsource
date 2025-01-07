package n3;

import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import n3.g;
import u3.p;

/* loaded from: classes.dex */
public final class c implements g, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private final g f6688e;

    /* renamed from: f, reason: collision with root package name */
    private final g.b f6689f;

    static final class a extends j implements p<String, g.b, String> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f6690e = new a();

        a() {
            super(2);
        }

        @Override // u3.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, g.b bVar) {
            i.d(str, "acc");
            i.d(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        i.d(gVar, "left");
        i.d(bVar, "element");
        this.f6688e = gVar;
        this.f6689f = bVar;
    }

    private final boolean b(g.b bVar) {
        return i.a(get(bVar.getKey()), bVar);
    }

    private final boolean c(c cVar) {
        while (b(cVar.f6689f)) {
            g gVar = cVar.f6688e;
            if (!(gVar instanceof c)) {
                return b((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int f() {
        int r02 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f6688e;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return r02;
            }
            r02++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f() != f() || !cVar.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // n3.g
    public <R> R fold(R r4, p<? super R, ? super g.b, ? extends R> pVar) {
        i.d(pVar, "operation");
        return pVar.invoke((Object) this.f6688e.fold(r4, pVar), this.f6689f);
    }

    @Override // n3.g
    public <E extends g.b> E get(g.c<E> cVar) {
        i.d(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e5 = (E) cVar2.f6689f.get(cVar);
            if (e5 != null) {
                return e5;
            }
            g gVar = cVar2.f6688e;
            if (!(gVar instanceof c)) {
                return (E) gVar.get(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f6688e.hashCode() + this.f6689f.hashCode();
    }

    @Override // n3.g
    public g minusKey(g.c<?> cVar) {
        i.d(cVar, "key");
        if (this.f6689f.get(cVar) != null) {
            return this.f6688e;
        }
        g minusKey = this.f6688e.minusKey(cVar);
        return minusKey == this.f6688e ? this : minusKey == h.f6694e ? this.f6689f : new c(minusKey, this.f6689f);
    }

    @Override // n3.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f6690e)) + ']';
    }
}
