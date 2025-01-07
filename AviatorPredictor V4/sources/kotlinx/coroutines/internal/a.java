package kotlinx.coroutines.internal;

import java.util.Objects;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f6397a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    private int f6398b;

    /* renamed from: c, reason: collision with root package name */
    private int f6399c;

    private final void b() {
        Object[] objArr = this.f6397a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        l3.d.c(objArr, objArr2, 0, this.f6398b, 0, 10, null);
        Object[] objArr3 = this.f6397a;
        int length2 = objArr3.length;
        int r13 = this.f6398b;
        l3.d.c(objArr3, objArr2, length2 - r13, 0, r13, 4, null);
        this.f6397a = objArr2;
        this.f6398b = 0;
        this.f6399c = length;
    }

    public final void a(T t4) {
        Object[] objArr = this.f6397a;
        int r12 = this.f6399c;
        objArr[r12] = t4;
        int length = (objArr.length - 1) & (r12 + 1);
        this.f6399c = length;
        if (length == this.f6398b) {
            b();
        }
    }

    public final boolean c() {
        return this.f6398b == this.f6399c;
    }

    public final T d() {
        int r02 = this.f6398b;
        if (r02 == this.f6399c) {
            return null;
        }
        Object[] objArr = this.f6397a;
        T t4 = (T) objArr[r02];
        objArr[r02] = null;
        this.f6398b = (r02 + 1) & (objArr.length - 1);
        Objects.requireNonNull(t4, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t4;
    }
}
