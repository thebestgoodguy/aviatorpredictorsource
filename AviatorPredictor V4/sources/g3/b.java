package g3;

import b3.m0;
import b3.v0;
import com.google.protobuf.e0;
import com.google.protobuf.f1;
import com.google.protobuf.k;
import com.google.protobuf.r;
import com.google.protobuf.v0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import q0.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static volatile r f3888a = r.b();

    private static final class a<T extends v0> implements v0.c {

        /* renamed from: c, reason: collision with root package name */
        private static final ThreadLocal<Reference<byte[]>> f3889c = new ThreadLocal<>();

        /* renamed from: a, reason: collision with root package name */
        private final f1<T> f3890a;

        /* renamed from: b, reason: collision with root package name */
        private final T f3891b;

        a(T t4) {
            this.f3891b = t4;
            this.f3890a = (f1<T>) t4.h();
        }

        private T d(k kVar) {
            T b5 = this.f3890a.b(kVar, b.f3888a);
            try {
                kVar.a(0);
                return b5;
            } catch (e0 e5) {
                e5.k(b5);
                throw e5;
            }
        }

        @Override // b3.v0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public T a(InputStream inputStream) {
            byte[] bArr;
            if ((inputStream instanceof g3.a) && ((g3.a) inputStream).e() == this.f3890a) {
                try {
                    return (T) ((g3.a) inputStream).d();
                } catch (IllegalStateException unused) {
                }
            }
            k kVar = null;
            try {
                if (inputStream instanceof m0) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal<Reference<byte[]>> threadLocal = f3889c;
                        Reference<byte[]> reference = threadLocal.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < available) {
                            bArr = new byte[available];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int r02 = available;
                        while (r02 > 0) {
                            int read = inputStream.read(bArr, available - r02, r02);
                            if (read == -1) {
                                break;
                            }
                            r02 -= read;
                        }
                        if (r02 != 0) {
                            throw new RuntimeException("size inaccurate: " + available + " != " + (available - r02));
                        }
                        kVar = k.k(bArr, 0, available);
                    } else if (available == 0) {
                        return this.f3891b;
                    }
                }
                if (kVar == null) {
                    kVar = k.f(inputStream);
                }
                kVar.G(Integer.MAX_VALUE);
                try {
                    return d(kVar);
                } catch (e0 e5) {
                    throw b3.f1.f770t.q("Invalid protobuf byte sequence").p(e5).d();
                }
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }

        @Override // b3.v0.c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InputStream b(T t4) {
            return new g3.a(t4, this.f3890a);
        }
    }

    static long a(InputStream inputStream, OutputStream outputStream) {
        l.o(inputStream, "inputStream cannot be null!");
        l.o(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j4 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j4;
            }
            outputStream.write(bArr, 0, read);
            j4 += read;
        }
    }

    public static <T extends com.google.protobuf.v0> v0.c<T> b(T t4) {
        return new a(t4);
    }
}
