package u1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f7651b;

    /* renamed from: a, reason: collision with root package name */
    private final Set<f> f7652a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f7651b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f7651b;
                if (dVar == null) {
                    dVar = new d();
                    f7651b = dVar;
                }
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f7652a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f7652a);
        }
        return unmodifiableSet;
    }
}
