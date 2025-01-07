package b3;

import b3.n0;
import b3.w0;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class o0 extends n0.c {

    /* renamed from: a, reason: collision with root package name */
    private static final w0.c f870a = w0.c.a(new a());

    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public w0.c e(Map<String, ?> map) {
        return f870a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return q0.h.c(this).d("policy", b()).b("priority", c()).e("available", d()).toString();
    }
}
