package b4;

import java.io.Closeable;
import n3.g;

/* loaded from: classes.dex */
public abstract class g1 extends g0 implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1003f = new a(null);

    public static final class a extends n3.b<g0, g1> {

        /* renamed from: b4.g1$a$a, reason: collision with other inner class name */
        static final class C0012a extends kotlin.jvm.internal.j implements u3.l<g.b, g1> {

            /* renamed from: e, reason: collision with root package name */
            public static final C0012a f1004e = new C0012a();

            C0012a() {
                super(1);
            }

            @Override // u3.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g1 invoke(g.b bVar) {
                if (bVar instanceof g1) {
                    return (g1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(g0.f1001e, C0012a.f1004e);
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }
}
