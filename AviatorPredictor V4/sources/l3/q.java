package l3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q extends p {
    public static final <T, A extends Appendable> A i(Iterable<? extends T> iterable, A a5, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int r7, CharSequence charSequence4, u3.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        kotlin.jvm.internal.i.d(a5, "buffer");
        kotlin.jvm.internal.i.d(charSequence, "separator");
        kotlin.jvm.internal.i.d(charSequence2, "prefix");
        kotlin.jvm.internal.i.d(charSequence3, "postfix");
        kotlin.jvm.internal.i.d(charSequence4, "truncated");
        a5.append(charSequence2);
        int r5 = 0;
        for (T t4 : iterable) {
            r5++;
            if (r5 > 1) {
                a5.append(charSequence);
            }
            if (r7 >= 0 && r5 > r7) {
                break;
            }
            a4.e.a(a5, t4, lVar);
        }
        if (r7 >= 0 && r5 > r7) {
            a5.append(charSequence4);
        }
        a5.append(charSequence3);
        return a5;
    }

    public static final <T> String k(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int r13, CharSequence charSequence4, u3.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        kotlin.jvm.internal.i.d(charSequence, "separator");
        kotlin.jvm.internal.i.d(charSequence2, "prefix");
        kotlin.jvm.internal.i.d(charSequence3, "postfix");
        kotlin.jvm.internal.i.d(charSequence4, "truncated");
        String sb = ((StringBuilder) i(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, r13, charSequence4, lVar)).toString();
        kotlin.jvm.internal.i.c(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String l(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int r8, CharSequence charSequence4, u3.l lVar, int r11, Object obj) {
        if ((r11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (r11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (r11 & 4) == 0 ? charSequence3 : "";
        int r12 = (r11 & 8) != 0 ? -1 : r8;
        if ((r11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((r11 & 32) != 0) {
            lVar = null;
        }
        return k(iterable, charSequence, charSequence5, charSequence6, r12, charSequence7, lVar);
    }

    public static <T extends Comparable<? super T>> T m(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> T n(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) o((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T o(List<? extends T> list) {
        kotlin.jvm.internal.i.d(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T, C extends Collection<? super T>> C p(Iterable<? extends T> iterable, C c5) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        kotlin.jvm.internal.i.d(c5, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c5.add(it.next());
        }
        return c5;
    }

    public static <T> List<T> q(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return i.e(r(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i.b();
        }
        if (size != 1) {
            return s(collection);
        }
        return h.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> r(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        return iterable instanceof Collection ? s((Collection) iterable) : (List) p(iterable, new ArrayList());
    }

    public static final <T> List<T> s(Collection<? extends T> collection) {
        kotlin.jvm.internal.i.d(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> t(Iterable<? extends T> iterable) {
        Set<T> b5;
        int a5;
        kotlin.jvm.internal.i.d(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return d0.c((Set) p(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            b5 = d0.b();
            return b5;
        }
        if (size == 1) {
            return c0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        a5 = y.a(collection.size());
        return (Set) p(iterable, new LinkedHashSet(a5));
    }
}
