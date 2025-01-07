package b4;

import n3.g;

/* loaded from: classes.dex */
public final class l0 extends n3.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1018f = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private final String f1019e;

    public static final class a implements g.c<l0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public final String F() {
        return this.f1019e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && kotlin.jvm.internal.i.a(this.f1019e, ((l0) obj).f1019e);
    }

    public int hashCode() {
        return this.f1019e.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f1019e + ')';
    }
}
