package h1;

import l1.l;
import l1.s;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private s f3899a;

    public b(s sVar) {
        this.f3899a = sVar;
    }

    public s a() {
        return this.f3899a;
    }

    public l b() {
        return this.f3899a.getKey();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3899a.equals(((b) obj).f3899a);
    }

    public int hashCode() {
        return this.f3899a.hashCode();
    }
}
