package k3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class m<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f6368e = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        public final Throwable f6369e;

        public b(Throwable th) {
            kotlin.jvm.internal.i.d(th, "exception");
            this.f6369e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.i.a(this.f6369e, ((b) obj).f6369e);
        }

        public int hashCode() {
            return this.f6369e.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f6369e + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f6369e;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
