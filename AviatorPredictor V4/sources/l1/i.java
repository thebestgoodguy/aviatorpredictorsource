package l1;

import java.util.Comparator;

/* loaded from: classes.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator<i> f6544a = new Comparator() { // from class: l1.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int b5;
            b5 = h.b((i) obj, (i) obj2);
            return b5;
        }
    };

    s a();

    boolean b();

    boolean c();

    w d();

    boolean e();

    x1.x f(r rVar);

    boolean g();

    l getKey();

    boolean h();

    boolean i();

    w j();

    t k();
}
