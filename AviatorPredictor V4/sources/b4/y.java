package b4;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1079a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1080b;

    /* renamed from: c, reason: collision with root package name */
    public final u3.l<Throwable, k3.s> f1081c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1082d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f1083e;

    /* JADX WARN: Multi-variable type inference failed */
    public y(Object obj, i iVar, u3.l<? super Throwable, k3.s> lVar, Object obj2, Throwable th) {
        this.f1079a = obj;
        this.f1080b = iVar;
        this.f1081c = lVar;
        this.f1082d = obj2;
        this.f1083e = th;
    }

    public /* synthetic */ y(Object obj, i iVar, u3.l lVar, Object obj2, Throwable th, int r13, kotlin.jvm.internal.e eVar) {
        this(obj, (r13 & 2) != 0 ? null : iVar, (r13 & 4) != 0 ? null : lVar, (r13 & 8) != 0 ? null : obj2, (r13 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ y b(y yVar, Object obj, i iVar, u3.l lVar, Object obj2, Throwable th, int r9, Object obj3) {
        if ((r9 & 1) != 0) {
            obj = yVar.f1079a;
        }
        if ((r9 & 2) != 0) {
            iVar = yVar.f1080b;
        }
        i iVar2 = iVar;
        if ((r9 & 4) != 0) {
            lVar = yVar.f1081c;
        }
        u3.l lVar2 = lVar;
        if ((r9 & 8) != 0) {
            obj2 = yVar.f1082d;
        }
        Object obj4 = obj2;
        if ((r9 & 16) != 0) {
            th = yVar.f1083e;
        }
        return yVar.a(obj, iVar2, lVar2, obj4, th);
    }

    public final y a(Object obj, i iVar, u3.l<? super Throwable, k3.s> lVar, Object obj2, Throwable th) {
        return new y(obj, iVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f1083e != null;
    }

    public final void d(m<?> mVar, Throwable th) {
        i iVar = this.f1080b;
        if (iVar != null) {
            mVar.k(iVar, th);
        }
        u3.l<Throwable, k3.s> lVar = this.f1081c;
        if (lVar == null) {
            return;
        }
        mVar.n(lVar, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.i.a(this.f1079a, yVar.f1079a) && kotlin.jvm.internal.i.a(this.f1080b, yVar.f1080b) && kotlin.jvm.internal.i.a(this.f1081c, yVar.f1081c) && kotlin.jvm.internal.i.a(this.f1082d, yVar.f1082d) && kotlin.jvm.internal.i.a(this.f1083e, yVar.f1083e);
    }

    public int hashCode() {
        Object obj = this.f1079a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f1080b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        u3.l<Throwable, k3.s> lVar = this.f1081c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f1082d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1083e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f1079a + ", cancelHandler=" + this.f1080b + ", onCancellation=" + this.f1081c + ", idempotentResume=" + this.f1082d + ", cancelCause=" + this.f1083e + ')';
    }
}
