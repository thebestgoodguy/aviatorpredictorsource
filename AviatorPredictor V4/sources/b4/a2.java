package b4;

/* loaded from: classes.dex */
public final class a2 extends kotlinx.coroutines.internal.l implements k1 {
    @Override // b4.k1
    public boolean e() {
        return true;
    }

    @Override // b4.k1
    public a2 f() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.n
    public String toString() {
        return q0.c() ? y("Active") : super.toString();
    }

    public final String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z4 = true;
        for (kotlinx.coroutines.internal.n nVar = (kotlinx.coroutines.internal.n) o(); !kotlin.jvm.internal.i.a(nVar, this); nVar = nVar.p()) {
            if (nVar instanceof v1) {
                v1 v1Var = (v1) nVar;
                if (z4) {
                    z4 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(v1Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.c(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
