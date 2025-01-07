package defpackage;

import java.util.List;
import javax.annotation.CheckForNull;

/* loaded from: classes61.dex */
final class ac extends ad {
    final transient int a;
    final transient int b;
    final /* synthetic */ ad c;

    ac(ad adVar, int r2, int r3) {
        this.c = adVar;
        this.a = r2;
        this.b = r3;
    }

    @Override // defpackage.aa
    final int a() {
        return this.c.b() + this.a + this.b;
    }

    @Override // defpackage.ad
    /* renamed from: a */
    public final ad subList(int r3, int r4) {
        v.a(r3, r4, this.b);
        ad adVar = this.c;
        int r1 = this.a;
        return adVar.subList(r3 + r1, r4 + r1);
    }

    @Override // defpackage.aa
    final int b() {
        return this.c.b() + this.a;
    }

    @Override // defpackage.aa
    @CheckForNull
    final Object[] c() {
        return this.c.c();
    }

    @Override // java.util.List
    public final Object get(int r3) {
        v.a(r3, this.b, "index");
        return this.c.get(r3 + this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.ad, java.util.List
    public final /* synthetic */ List subList(int r1, int r2) {
        return subList(r1, r2);
    }
}
