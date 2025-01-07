package m1;

import l1.s;
import l1.w;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f6655c = new m(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final w f6656a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f6657b;

    private m(w wVar, Boolean bool) {
        p1.b.d(wVar == null || bool == null, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f6656a = wVar;
        this.f6657b = bool;
    }

    public static m a(boolean z4) {
        return new m(null, Boolean.valueOf(z4));
    }

    public static m f(w wVar) {
        return new m(wVar, null);
    }

    public Boolean b() {
        return this.f6657b;
    }

    public w c() {
        return this.f6656a;
    }

    public boolean d() {
        return this.f6656a == null && this.f6657b == null;
    }

    public boolean e(s sVar) {
        if (this.f6656a != null) {
            return sVar.b() && sVar.j().equals(this.f6656a);
        }
        Boolean bool = this.f6657b;
        if (bool != null) {
            return bool.booleanValue() == sVar.b();
        }
        p1.b.d(d(), "Precondition should be empty", new Object[0]);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        w wVar = this.f6656a;
        if (wVar == null ? mVar.f6656a != null : !wVar.equals(mVar.f6656a)) {
            return false;
        }
        Boolean bool = this.f6657b;
        Boolean bool2 = mVar.f6657b;
        return bool != null ? bool.equals(bool2) : bool2 == null;
    }

    public int hashCode() {
        w wVar = this.f6656a;
        int hashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        Boolean bool = this.f6657b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        if (d()) {
            return "Precondition{<none>}";
        }
        if (this.f6656a != null) {
            sb = new StringBuilder();
            sb.append("Precondition{updateTime=");
            obj = this.f6656a;
        } else {
            if (this.f6657b == null) {
                throw p1.b.a("Invalid Precondition", new Object[0]);
            }
            sb = new StringBuilder();
            sb.append("Precondition{exists=");
            obj = this.f6657b;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
