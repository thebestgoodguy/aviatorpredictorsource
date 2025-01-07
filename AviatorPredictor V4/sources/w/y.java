package w;

import android.os.Bundle;
import t.a;

/* loaded from: classes.dex */
public class y implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final y f8077b = c().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f8078a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f8079a;

        /* synthetic */ a(a0 a0Var) {
        }

        public y a() {
            return new y(this.f8079a, null);
        }
    }

    /* synthetic */ y(String str, b0 b0Var) {
        this.f8078a = str;
    }

    public static a c() {
        return new a(null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f8078a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return p.a(this.f8078a, ((y) obj).f8078a);
        }
        return false;
    }

    public final int hashCode() {
        return p.b(this.f8078a);
    }
}
