package kotlinx.coroutines.scheduling;

import b4.g0;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.z;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: l, reason: collision with root package name */
    public static final b f6494l;

    /* renamed from: m, reason: collision with root package name */
    private static final g0 f6495m;

    static {
        int a5;
        int d5;
        b bVar = new b();
        f6494l = bVar;
        a5 = x3.f.a(64, z.a());
        d5 = b0.d("kotlinx.coroutines.io.parallelism", a5, 0, 0, 12, null);
        f6495m = new e(bVar, d5, "Dispatchers.IO", 1);
    }

    private b() {
        super(0, 0, null, 7, null);
    }

    public final g0 R() {
        return f6495m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // b4.g0
    public String toString() {
        return "Dispatchers.Default";
    }
}
