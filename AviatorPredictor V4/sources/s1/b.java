package s1;

import w.p;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f7538a;

    public b(String str) {
        this.f7538a = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return p.a(this.f7538a, ((b) obj).f7538a);
        }
        return false;
    }

    public int hashCode() {
        return p.b(this.f7538a);
    }

    public String toString() {
        return p.c(this).a("token", this.f7538a).toString();
    }
}
