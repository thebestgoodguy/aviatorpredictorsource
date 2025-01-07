package c1;

import c1.c;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c<K, V> implements Iterable<Map.Entry<K, V>> {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final InterfaceC0014a f1103a = new InterfaceC0014a() { // from class: c1.b
            @Override // c1.c.a.InterfaceC0014a
            public final Object a(Object obj) {
                Object e5;
                e5 = c.a.e(obj);
                return e5;
            }
        };

        /* renamed from: c1.c$a$a, reason: collision with other inner class name */
        public interface InterfaceC0014a<C, D> {
            D a(C c5);
        }

        public static <A, B, C> c<A, C> b(List<A> list, Map<B, C> map, InterfaceC0014a<A, B> interfaceC0014a, Comparator<A> comparator) {
            return list.size() < 25 ? c1.a.z(list, map, interfaceC0014a, comparator) : k.w(list, map, interfaceC0014a, comparator);
        }

        public static <K, V> c<K, V> c(Comparator<K> comparator) {
            return new c1.a(comparator);
        }

        public static <A> InterfaceC0014a<A, A> d() {
            return f1103a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object e(Object obj) {
            return obj;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!q().equals(cVar.q()) || size() != cVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = cVar.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = q().hashCode();
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + it.next().hashCode();
        }
        return hashCode;
    }

    public abstract boolean i(K k4);

    public abstract int indexOf(K k4);

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    public abstract V p(K k4);

    public abstract Comparator<K> q();

    public abstract K r();

    public abstract K s();

    public abstract int size();

    public abstract c<K, V> t(K k4, V v4);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator<Map.Entry<K, V>> it = iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(next.getKey());
            sb.append("=>");
            sb.append(next.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    public abstract Iterator<Map.Entry<K, V>> u(K k4);

    public abstract c<K, V> v(K k4);
}
