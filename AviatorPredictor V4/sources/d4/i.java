package d4;

/* loaded from: classes.dex */
public final class i<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3427a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final c f3428b = new c();

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f3429a;

        public a(Throwable th) {
            this.f3429a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.i.a(this.f3429a, ((a) obj).f3429a);
        }

        public int hashCode() {
            Throwable th = this.f3429a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // d4.i.c
        public String toString() {
            return "Closed(" + this.f3429a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return i.b(new a(th));
        }

        public final <E> Object b() {
            return i.b(i.f3428b);
        }

        public final <E> Object c(E e5) {
            return i.b(e5);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static <T> Object b(Object obj) {
        return obj;
    }
}
