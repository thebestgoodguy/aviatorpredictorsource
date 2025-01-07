package kotlinx.coroutines.internal;

import b4.q0;
import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.e0;

/* loaded from: classes.dex */
public class d0<T extends e0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a, reason: collision with root package name */
    private T[] f6412a;

    private final T[] f() {
        T[] tArr = this.f6412a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new e0[4];
            this.f6412a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
        kotlin.jvm.internal.i.c(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((e0[]) copyOf);
        this.f6412a = tArr3;
        return tArr3;
    }

    private final void j(int r12) {
        this._size = r12;
    }

    private final void k(int r6) {
        while (true) {
            int r02 = (r6 * 2) + 1;
            if (r02 >= c()) {
                return;
            }
            T[] tArr = this.f6412a;
            kotlin.jvm.internal.i.b(tArr);
            int r22 = r02 + 1;
            if (r22 < c()) {
                T t4 = tArr[r22];
                kotlin.jvm.internal.i.b(t4);
                T t5 = tArr[r02];
                kotlin.jvm.internal.i.b(t5);
                if (((Comparable) t4).compareTo(t5) < 0) {
                    r02 = r22;
                }
            }
            T t6 = tArr[r6];
            kotlin.jvm.internal.i.b(t6);
            T t7 = tArr[r02];
            kotlin.jvm.internal.i.b(t7);
            if (((Comparable) t6).compareTo(t7) <= 0) {
                return;
            }
            m(r6, r02);
            r6 = r02;
        }
    }

    private final void l(int r4) {
        while (r4 > 0) {
            T[] tArr = this.f6412a;
            kotlin.jvm.internal.i.b(tArr);
            int r12 = (r4 - 1) / 2;
            T t4 = tArr[r12];
            kotlin.jvm.internal.i.b(t4);
            T t5 = tArr[r4];
            kotlin.jvm.internal.i.b(t5);
            if (((Comparable) t4).compareTo(t5) <= 0) {
                return;
            }
            m(r4, r12);
            r4 = r12;
        }
    }

    private final void m(int r4, int r5) {
        T[] tArr = this.f6412a;
        kotlin.jvm.internal.i.b(tArr);
        T t4 = tArr[r5];
        kotlin.jvm.internal.i.b(t4);
        T t5 = tArr[r4];
        kotlin.jvm.internal.i.b(t5);
        tArr[r4] = t4;
        tArr[r5] = t5;
        t4.g(r4);
        t5.g(r5);
    }

    public final void a(T t4) {
        if (q0.a()) {
            if (!(t4.k() == null)) {
                throw new AssertionError();
            }
        }
        t4.h(this);
        T[] f5 = f();
        int c5 = c();
        j(c5 + 1);
        f5[c5] = t4;
        t4.g(c5);
        l(c5);
    }

    public final T b() {
        T[] tArr = this.f6412a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b5;
        synchronized (this) {
            b5 = b();
        }
        return b5;
    }

    public final boolean g(T t4) {
        boolean z4;
        synchronized (this) {
            z4 = true;
            if (t4.k() == null) {
                z4 = false;
            } else {
                int n4 = t4.n();
                if (q0.a()) {
                    if (!(n4 >= 0)) {
                        throw new AssertionError();
                    }
                }
                h(n4);
            }
        }
        return z4;
    }

    public final T h(int r8) {
        if (q0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f6412a;
        kotlin.jvm.internal.i.b(tArr);
        j(c() - 1);
        if (r8 < c()) {
            m(r8, c());
            int r32 = (r8 - 1) / 2;
            if (r8 > 0) {
                T t4 = tArr[r8];
                kotlin.jvm.internal.i.b(t4);
                T t5 = tArr[r32];
                kotlin.jvm.internal.i.b(t5);
                if (((Comparable) t4).compareTo(t5) < 0) {
                    m(r8, r32);
                    l(r32);
                }
            }
            k(r8);
        }
        T t6 = tArr[c()];
        kotlin.jvm.internal.i.b(t6);
        if (q0.a()) {
            if (!(t6.k() == this)) {
                throw new AssertionError();
            }
        }
        t6.h(null);
        t6.g(-1);
        tArr[c()] = null;
        return t6;
    }

    public final T i() {
        T h5;
        synchronized (this) {
            h5 = c() > 0 ? h(0) : null;
        }
        return h5;
    }
}
