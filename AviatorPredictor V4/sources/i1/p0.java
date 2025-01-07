package i1;

import java.util.List;

/* loaded from: classes.dex */
public class p0 extends q {

    /* renamed from: d, reason: collision with root package name */
    private final List<l1.l> f4189d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    p0(l1.r r2, x1.x r3) {
        /*
            r1 = this;
            i1.q$b r0 = i1.q.b.NOT_IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4189d = r2
            java.util.List r3 = i1.o0.l(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.p0.<init>(l1.r, x1.x):void");
    }

    @Override // i1.q, i1.r
    public boolean e(l1.i iVar) {
        return !this.f4189d.contains(iVar.getKey());
    }
}
