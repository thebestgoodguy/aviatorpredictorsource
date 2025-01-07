package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, p> f541a = new HashMap<>();

    public final void a() {
        Iterator<p> it = this.f541a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f541a.clear();
    }

    final p b(String str) {
        return this.f541a.get(str);
    }

    final void c(String str, p pVar) {
        p put = this.f541a.put(str, pVar);
        if (put != null) {
            put.c();
        }
    }
}
