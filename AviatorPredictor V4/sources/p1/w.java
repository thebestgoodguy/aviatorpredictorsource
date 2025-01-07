package p1;

import i1.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class w {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [i1.r] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [i1.l] */
    protected static i1.r a(i1.r rVar) {
        f(rVar);
        if (l(rVar)) {
            return rVar;
        }
        i1.l lVar = (i1.l) rVar;
        List<i1.r> b5 = lVar.b();
        if (b5.size() == 1) {
            return a(b5.get(0));
        }
        if (lVar.k()) {
            return lVar;
        }
        ArrayList<??> arrayList = new ArrayList();
        Iterator<i1.r> it = b5.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (?? r4 : arrayList) {
            if (!(r4 instanceof i1.q)) {
                if (r4 instanceof i1.l) {
                    r4 = (i1.l) r4;
                    if (r4.h().equals(lVar.h())) {
                        arrayList2.addAll(r4.b());
                    }
                }
            }
            arrayList2.add(r4);
        }
        return arrayList2.size() == 1 ? (i1.r) arrayList2.get(0) : new i1.l(arrayList2, lVar.h());
    }

    private static i1.r b(i1.l lVar, i1.l lVar2) {
        b.d((lVar.b().isEmpty() || lVar2.b().isEmpty()) ? false : true, "Found an empty composite filter", new Object[0]);
        if (lVar.i() && lVar2.i()) {
            return lVar.n(lVar2.b());
        }
        i1.l lVar3 = lVar.j() ? lVar : lVar2;
        if (lVar.j()) {
            lVar = lVar2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<i1.r> it = lVar3.b().iterator();
        while (it.hasNext()) {
            arrayList.add(e(it.next(), lVar));
        }
        return new i1.l(arrayList, l.a.OR);
    }

    private static i1.r c(i1.q qVar, i1.l lVar) {
        if (lVar.i()) {
            return lVar.n(Collections.singletonList(qVar));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<i1.r> it = lVar.b().iterator();
        while (it.hasNext()) {
            arrayList.add(e(qVar, it.next()));
        }
        return new i1.l(arrayList, l.a.OR);
    }

    private static i1.r d(i1.q qVar, i1.q qVar2) {
        return new i1.l(Arrays.asList(qVar, qVar2), l.a.AND);
    }

    protected static i1.r e(i1.r rVar, i1.r rVar2) {
        f(rVar);
        f(rVar2);
        boolean z4 = rVar instanceof i1.q;
        return a((z4 && (rVar2 instanceof i1.q)) ? d((i1.q) rVar, (i1.q) rVar2) : (z4 && (rVar2 instanceof i1.l)) ? c((i1.q) rVar, (i1.l) rVar2) : ((rVar instanceof i1.l) && (rVar2 instanceof i1.q)) ? c((i1.q) rVar2, (i1.l) rVar) : b((i1.l) rVar, (i1.l) rVar2));
    }

    private static void f(i1.r rVar) {
        b.d((rVar instanceof i1.q) || (rVar instanceof i1.l), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    protected static i1.r g(i1.r rVar) {
        f(rVar);
        if (rVar instanceof i1.q) {
            return rVar;
        }
        i1.l lVar = (i1.l) rVar;
        if (lVar.b().size() == 1) {
            return g(rVar.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<i1.r> it = lVar.b().iterator();
        while (it.hasNext()) {
            arrayList.add(g(it.next()));
        }
        i1.r a5 = a(new i1.l(arrayList, lVar.h()));
        if (j(a5)) {
            return a5;
        }
        b.d(a5 instanceof i1.l, "field filters are already in DNF form.", new Object[0]);
        i1.l lVar2 = (i1.l) a5;
        b.d(lVar2.i(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        b.d(lVar2.b().size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        i1.r rVar2 = lVar2.b().get(0);
        for (int r22 = 1; r22 < lVar2.b().size(); r22++) {
            rVar2 = e(rVar2, lVar2.b().get(r22));
        }
        return rVar2;
    }

    public static List<i1.r> h(i1.l lVar) {
        if (lVar.b().isEmpty()) {
            return Collections.emptyList();
        }
        i1.r g5 = g(lVar);
        b.d(j(g5), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
        return (l(g5) || k(g5)) ? Collections.singletonList(g5) : g5.b();
    }

    private static boolean i(i1.r rVar) {
        if (rVar instanceof i1.l) {
            i1.l lVar = (i1.l) rVar;
            if (lVar.j()) {
                for (i1.r rVar2 : lVar.b()) {
                    if (!l(rVar2) && !k(rVar2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static boolean j(i1.r rVar) {
        return l(rVar) || k(rVar) || i(rVar);
    }

    private static boolean k(i1.r rVar) {
        return (rVar instanceof i1.l) && ((i1.l) rVar).l();
    }

    private static boolean l(i1.r rVar) {
        return rVar instanceof i1.q;
    }
}
