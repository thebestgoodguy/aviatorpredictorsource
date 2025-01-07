package u1;

import b1.q;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f7649a;

    /* renamed from: b, reason: collision with root package name */
    private final d f7650b;

    c(Set<f> set, d dVar) {
        this.f7649a = e(set);
        this.f7650b = dVar;
    }

    public static b1.d<i> c() {
        return b1.d.c(i.class).b(q.l(f.class)).e(new b1.h() { // from class: u1.b
            @Override // b1.h
            public final Object a(b1.e eVar) {
                i d5;
                d5 = c.d(eVar);
                return d5;
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(b1.e eVar) {
        return new c(eVar.c(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // u1.i
    public String a() {
        if (this.f7650b.b().isEmpty()) {
            return this.f7649a;
        }
        return this.f7649a + ' ' + e(this.f7650b.b());
    }
}
