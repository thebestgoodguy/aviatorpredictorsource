package kotlinx.coroutines.internal;

import b4.q0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import k3.m;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6464a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f6465b;

    static {
        Object a5;
        Object a6;
        try {
            m.a aVar = k3.m.f6368e;
            a5 = k3.m.a(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            m.a aVar2 = k3.m.f6368e;
            a5 = k3.m.a(k3.n.a(th));
        }
        if (k3.m.b(a5) != null) {
            a5 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f6464a = (String) a5;
        try {
            m.a aVar3 = k3.m.f6368e;
            a6 = k3.m.a(x.class.getCanonicalName());
        } catch (Throwable th2) {
            m.a aVar4 = k3.m.f6368e;
            a6 = k3.m.a(k3.n.a(th2));
        }
        if (k3.m.b(a6) != null) {
            a6 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f6465b = (String) a6;
    }

    public static final StackTraceElement b(String str) {
        return new StackTraceElement(kotlin.jvm.internal.i.i("\b\b\b(", str), "\b", "\b", -1);
    }

    private static final <E extends Throwable> k3.l<E, StackTraceElement[]> c(E e5) {
        boolean z4;
        Throwable cause = e5.getCause();
        if (cause == null || !kotlin.jvm.internal.i.a(cause.getClass(), e5.getClass())) {
            return k3.p.a(e5, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e5.getStackTrace();
        int length = stackTrace.length;
        int r4 = 0;
        while (true) {
            if (r4 >= length) {
                z4 = false;
                break;
            }
            if (h(stackTrace[r4])) {
                z4 = true;
                break;
            }
            r4++;
        }
        return z4 ? k3.p.a(cause, stackTrace) : k3.p.a(e5, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E d(E e5, E e6, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e5.getStackTrace();
        int g5 = g(stackTrace, f6464a);
        int r12 = 0;
        if (g5 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            e6.setStackTrace((StackTraceElement[]) array);
            return e6;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + g5];
        if (g5 > 0) {
            int r32 = 0;
            while (true) {
                int r4 = r32 + 1;
                stackTraceElementArr[r32] = stackTrace[r32];
                if (r4 >= g5) {
                    break;
                }
                r32 = r4;
            }
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int r8 = r12 + 1;
            stackTraceElementArr[r12 + g5] = it.next();
            r12 = r8;
        }
        e6.setStackTrace(stackTraceElementArr);
        return e6;
    }

    private static final ArrayDeque<StackTraceElement> e(kotlin.coroutines.jvm.internal.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.i.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.i.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.i.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int r12 = 0; r12 < length; r12++) {
            if (kotlin.jvm.internal.i.a(str, stackTraceElementArr[r12].getClassName())) {
                return r12;
            }
        }
        return -1;
    }

    public static final boolean h(StackTraceElement stackTraceElement) {
        boolean o4;
        o4 = a4.m.o(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
        return o4;
    }

    private static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int r12 = 0;
        while (true) {
            if (r12 >= length) {
                r12 = -1;
                break;
            } else if (h(stackTraceElementArr[r12])) {
                break;
            } else {
                r12++;
            }
        }
        int r13 = r12 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (r13 > length2) {
            return;
        }
        while (true) {
            int r22 = length2 - 1;
            if (f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == r13) {
                return;
            } else {
                length2 = r22;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E j(E e5, kotlin.coroutines.jvm.internal.e eVar) {
        k3.l c5 = c(e5);
        Throwable th = (Throwable) c5.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c5.b();
        Throwable m4 = m(th);
        if (m4 == null) {
            return e5;
        }
        ArrayDeque<StackTraceElement> e6 = e(eVar);
        if (e6.isEmpty()) {
            return e5;
        }
        if (th != e5) {
            i(stackTraceElementArr, e6);
        }
        return (E) d(th, m4, e6);
    }

    public static final <E extends Throwable> E k(E e5) {
        Throwable m4;
        return (q0.d() && (m4 = m(e5)) != null) ? (E) l(m4) : e5;
    }

    private static final <E extends Throwable> E l(E e5) {
        StackTraceElement[] stackTrace = e5.getStackTrace();
        int length = stackTrace.length;
        int g5 = g(stackTrace, f6465b);
        int r32 = g5 + 1;
        int g6 = g(stackTrace, f6464a);
        int r5 = 0;
        int r12 = (length - g5) - (g6 == -1 ? 0 : length - g6);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[r12];
        while (r5 < r12) {
            stackTraceElementArr[r5] = r5 == 0 ? b("Coroutine boundary") : stackTrace[(r32 + r5) - 1];
            r5++;
        }
        e5.setStackTrace(stackTraceElementArr);
        return e5;
    }

    private static final <E extends Throwable> E m(E e5) {
        E e6 = (E) h.e(e5);
        if (e6 == null) {
            return null;
        }
        if ((e5 instanceof b4.e0) || kotlin.jvm.internal.i.a(e6.getMessage(), e5.getMessage())) {
            return e6;
        }
        return null;
    }

    public static final <E extends Throwable> E n(E e5) {
        E e6 = (E) e5.getCause();
        if (e6 != null && kotlin.jvm.internal.i.a(e6.getClass(), e5.getClass())) {
            StackTraceElement[] stackTrace = e5.getStackTrace();
            int length = stackTrace.length;
            boolean z4 = false;
            int r4 = 0;
            while (true) {
                if (r4 >= length) {
                    break;
                }
                if (h(stackTrace[r4])) {
                    z4 = true;
                    break;
                }
                r4++;
            }
            if (z4) {
                return e6;
            }
        }
        return e5;
    }
}
