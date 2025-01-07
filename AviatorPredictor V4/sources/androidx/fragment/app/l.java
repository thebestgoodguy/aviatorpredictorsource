package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.q;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
class l extends androidx.lifecycle.p {

    /* renamed from: i, reason: collision with root package name */
    private static final q.a f372i = new a();

    /* renamed from: f, reason: collision with root package name */
    private final boolean f376f;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet<Fragment> f373c = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, l> f374d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, androidx.lifecycle.r> f375e = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f377g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f378h = false;

    static class a implements q.a {
        a() {
        }

        @Override // androidx.lifecycle.q.a
        public <T extends androidx.lifecycle.p> T a(Class<T> cls) {
            return new l(true);
        }
    }

    l(boolean z4) {
        this.f376f = z4;
    }

    static l g(androidx.lifecycle.r rVar) {
        return (l) new androidx.lifecycle.q(rVar, f372i).a(l.class);
    }

    @Override // androidx.lifecycle.p
    protected void c() {
        if (j.L) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f377g = true;
    }

    boolean d(Fragment fragment) {
        return this.f373c.add(fragment);
    }

    void e(Fragment fragment) {
        if (j.L) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        l lVar = this.f374d.get(fragment.f225i);
        if (lVar != null) {
            lVar.c();
            this.f374d.remove(fragment.f225i);
        }
        androidx.lifecycle.r rVar = this.f375e.get(fragment.f225i);
        if (rVar != null) {
            rVar.a();
            this.f375e.remove(fragment.f225i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f373c.equals(lVar.f373c) && this.f374d.equals(lVar.f374d) && this.f375e.equals(lVar.f375e);
    }

    l f(Fragment fragment) {
        l lVar = this.f374d.get(fragment.f225i);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this.f376f);
        this.f374d.put(fragment.f225i, lVar2);
        return lVar2;
    }

    Collection<Fragment> h() {
        return this.f373c;
    }

    public int hashCode() {
        return (((this.f373c.hashCode() * 31) + this.f374d.hashCode()) * 31) + this.f375e.hashCode();
    }

    androidx.lifecycle.r i(Fragment fragment) {
        androidx.lifecycle.r rVar = this.f375e.get(fragment.f225i);
        if (rVar != null) {
            return rVar;
        }
        androidx.lifecycle.r rVar2 = new androidx.lifecycle.r();
        this.f375e.put(fragment.f225i, rVar2);
        return rVar2;
    }

    boolean j() {
        return this.f377g;
    }

    boolean k(Fragment fragment) {
        return this.f373c.remove(fragment);
    }

    boolean l(Fragment fragment) {
        if (this.f373c.contains(fragment)) {
            return this.f376f ? this.f377g : !this.f378h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f373c.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f374d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f375e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
