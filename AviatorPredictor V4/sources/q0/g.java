package q0;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f7143a;

    private g(String str) {
        this.f7143a = (String) l.n(str);
    }

    public static g e(char c5) {
        return new g(String.valueOf(c5));
    }

    public <A extends Appendable> A a(A a5, Iterator<?> it) {
        l.n(a5);
        if (it.hasNext()) {
            while (true) {
                a5.append(f(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                a5.append(this.f7143a);
            }
        }
        return a5;
    }

    public final StringBuilder b(StringBuilder sb, Iterator<?> it) {
        try {
            a(sb, it);
            return sb;
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    public final String c(Iterable<?> iterable) {
        return d(iterable.iterator());
    }

    public final String d(Iterator<?> it) {
        return b(new StringBuilder(), it).toString();
    }

    CharSequence f(Object obj) {
        l.n(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
