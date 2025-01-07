package i1;

import i1.n;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final TreeMap<l1.l, n> f4174a = new TreeMap<>();

    public void a(n nVar) {
        l1.l key = nVar.b().getKey();
        n nVar2 = this.f4174a.get(key);
        if (nVar2 == null) {
            this.f4174a.put(key, nVar);
            return;
        }
        n.a c5 = nVar2.c();
        n.a c6 = nVar.c();
        n.a aVar = n.a.ADDED;
        if (c6 == aVar || c5 != n.a.METADATA) {
            if (c6 != n.a.METADATA || c5 == n.a.REMOVED) {
                n.a aVar2 = n.a.MODIFIED;
                if (c6 != aVar2 || c5 != aVar2) {
                    if (c6 == aVar2 && c5 == aVar) {
                        nVar = n.a(aVar, nVar.b());
                    } else {
                        n.a aVar3 = n.a.REMOVED;
                        if (c6 == aVar3 && c5 == aVar) {
                            this.f4174a.remove(key);
                            return;
                        } else if (c6 == aVar3 && c5 == aVar2) {
                            nVar = n.a(aVar3, nVar2.b());
                        } else if (c6 != aVar || c5 != aVar3) {
                            throw p1.b.a("Unsupported combination of changes %s after %s", c6, c5);
                        }
                    }
                }
                nVar = n.a(aVar2, nVar.b());
            } else {
                nVar = n.a(c5, nVar.b());
            }
        }
        this.f4174a.put(key, nVar);
    }

    List<n> b() {
        return new ArrayList(this.f4174a.values());
    }
}
