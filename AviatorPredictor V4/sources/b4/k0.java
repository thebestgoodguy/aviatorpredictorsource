package b4;

import java.util.Objects;
import n3.g;

/* loaded from: classes.dex */
public final class k0 extends n3.a implements f2<String> {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1014f = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private final long f1015e;

    public static final class a implements g.c<k0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public k0(long j4) {
        super(f1014f);
        this.f1015e = j4;
    }

    public final long F() {
        return this.f1015e;
    }

    @Override // b4.f2
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void s(n3.g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // b4.f2
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public String d(n3.g gVar) {
        String F;
        l0 l0Var = (l0) gVar.get(l0.f1018f);
        String str = "coroutine";
        if (l0Var != null && (F = l0Var.F()) != null) {
            str = F;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int F2 = a4.n.F(name, " @", 0, false, 6, null);
        if (F2 < 0) {
            F2 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + F2 + 10);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String substring = name.substring(0, F2);
        kotlin.jvm.internal.i.c(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(F());
        k3.s sVar = k3.s.f6374a;
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.c(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.f1015e == ((k0) obj).f1015e;
    }

    public int hashCode() {
        return j0.a(this.f1015e);
    }

    public String toString() {
        return "CoroutineId(" + this.f1015e + ')';
    }
}
