package com.google.protobuf;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class j implements Iterable<Byte>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final j f2914f = new C0025j(d0.f2849d);

    /* renamed from: g, reason: collision with root package name */
    private static final f f2915g;

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<j> f2916h;

    /* renamed from: e, reason: collision with root package name */
    private int f2917e = 0;

    class a extends c {

        /* renamed from: e, reason: collision with root package name */
        private int f2918e = 0;

        /* renamed from: f, reason: collision with root package name */
        private final int f2919f;

        a() {
            this.f2919f = j.this.size();
        }

        @Override // com.google.protobuf.j.g
        public byte b() {
            int r02 = this.f2918e;
            if (r02 >= this.f2919f) {
                throw new NoSuchElementException();
            }
            this.f2918e = r02 + 1;
            return j.this.C(r02);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2918e < this.f2919f;
        }
    }

    static class b implements Comparator<j> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(j jVar, j jVar2) {
            g it = jVar.iterator();
            g it2 = jVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(j.O(it.b()), j.O(it2.b()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(jVar.size(), jVar2.size());
        }
    }

    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.protobuf.j.f
        public byte[] a(byte[] bArr, int r22, int r32) {
            return Arrays.copyOfRange(bArr, r22, r32 + r22);
        }
    }

    private static final class e extends C0025j {

        /* renamed from: j, reason: collision with root package name */
        private final int f2921j;

        /* renamed from: k, reason: collision with root package name */
        private final int f2922k;

        e(byte[] bArr, int r32, int r4) {
            super(bArr);
            j.t(r32, r32 + r4, bArr.length);
            this.f2921j = r32;
            this.f2922k = r4;
        }

        @Override // com.google.protobuf.j.C0025j, com.google.protobuf.j
        protected void A(byte[] bArr, int r4, int r5, int r6) {
            System.arraycopy(this.f2925i, Y() + r4, bArr, r5, r6);
        }

        @Override // com.google.protobuf.j.C0025j, com.google.protobuf.j
        byte C(int r32) {
            return this.f2925i[this.f2921j + r32];
        }

        @Override // com.google.protobuf.j.C0025j
        protected int Y() {
            return this.f2921j;
        }

        @Override // com.google.protobuf.j.C0025j, com.google.protobuf.j
        public byte r(int r32) {
            j.s(r32, size());
            return this.f2925i[this.f2921j + r32];
        }

        @Override // com.google.protobuf.j.C0025j, com.google.protobuf.j
        public int size() {
            return this.f2922k;
        }
    }

    private interface f {
        byte[] a(byte[] bArr, int r22, int r32);
    }

    public interface g extends Iterator<Byte> {
        byte b();
    }

    static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final m f2923a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f2924b;

        private h(int r12) {
            byte[] bArr = new byte[r12];
            this.f2924b = bArr;
            this.f2923a = m.h0(bArr);
        }

        /* synthetic */ h(int r12, a aVar) {
            this(r12);
        }

        public j a() {
            this.f2923a.d();
            return new C0025j(this.f2924b);
        }

        public m b() {
            return this.f2923a;
        }
    }

    static abstract class i extends j {
        i() {
        }

        @Override // com.google.protobuf.j
        protected final int B() {
            return 0;
        }

        @Override // com.google.protobuf.j
        protected final boolean D() {
            return true;
        }

        abstract boolean X(j jVar, int r22, int r32);

        @Override // com.google.protobuf.j, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* renamed from: com.google.protobuf.j$j, reason: collision with other inner class name */
    private static class C0025j extends i {

        /* renamed from: i, reason: collision with root package name */
        protected final byte[] f2925i;

        C0025j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f2925i = bArr;
        }

        @Override // com.google.protobuf.j
        protected void A(byte[] bArr, int r32, int r4, int r5) {
            System.arraycopy(this.f2925i, r32, bArr, r4, r5);
        }

        @Override // com.google.protobuf.j
        byte C(int r22) {
            return this.f2925i[r22];
        }

        @Override // com.google.protobuf.j
        public final boolean E() {
            int Y = Y();
            return a2.t(this.f2925i, Y, size() + Y);
        }

        @Override // com.google.protobuf.j
        public final com.google.protobuf.k H() {
            return com.google.protobuf.k.l(this.f2925i, Y(), size(), true);
        }

        @Override // com.google.protobuf.j
        protected final int I(int r32, int r4, int r5) {
            return d0.i(r32, this.f2925i, Y() + r4, r5);
        }

        @Override // com.google.protobuf.j
        protected final int J(int r22, int r32, int r4) {
            int Y = Y() + r32;
            return a2.v(r22, this.f2925i, Y, r4 + Y);
        }

        @Override // com.google.protobuf.j
        public final j M(int r4, int r5) {
            int t4 = j.t(r4, r5, size());
            return t4 == 0 ? j.f2914f : new e(this.f2925i, Y() + r4, t4);
        }

        @Override // com.google.protobuf.j
        protected final String Q(Charset charset) {
            return new String(this.f2925i, Y(), size(), charset);
        }

        @Override // com.google.protobuf.j
        final void W(com.google.protobuf.i iVar) {
            iVar.b(this.f2925i, Y(), size());
        }

        @Override // com.google.protobuf.j.i
        final boolean X(j jVar, int r7, int r8) {
            if (r8 > jVar.size()) {
                throw new IllegalArgumentException("Length too large: " + r8 + size());
            }
            int r02 = r7 + r8;
            if (r02 > jVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + r7 + ", " + r8 + ", " + jVar.size());
            }
            if (!(jVar instanceof C0025j)) {
                return jVar.M(r7, r02).equals(M(0, r8));
            }
            C0025j c0025j = (C0025j) jVar;
            byte[] bArr = this.f2925i;
            byte[] bArr2 = c0025j.f2925i;
            int Y = Y() + r8;
            int Y2 = Y();
            int Y3 = c0025j.Y() + r7;
            while (Y2 < Y) {
                if (bArr[Y2] != bArr2[Y3]) {
                    return false;
                }
                Y2++;
                Y3++;
            }
            return true;
        }

        protected int Y() {
            return 0;
        }

        @Override // com.google.protobuf.j
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j) || size() != ((j) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C0025j)) {
                return obj.equals(this);
            }
            C0025j c0025j = (C0025j) obj;
            int K = K();
            int K2 = c0025j.K();
            if (K == 0 || K2 == 0 || K == K2) {
                return X(c0025j, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.j
        public final ByteBuffer p() {
            return ByteBuffer.wrap(this.f2925i, Y(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.j
        public byte r(int r22) {
            return this.f2925i[r22];
        }

        @Override // com.google.protobuf.j
        public int size() {
            return this.f2925i.length;
        }
    }

    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.protobuf.j.f
        public byte[] a(byte[] bArr, int r4, int r5) {
            byte[] bArr2 = new byte[r5];
            System.arraycopy(bArr, r4, bArr2, 0, r5);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f2915g = com.google.protobuf.d.c() ? new k(aVar) : new d(aVar);
        f2916h = new b();
    }

    j() {
    }

    static h G(int r22) {
        return new h(r22, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int O(byte b5) {
        return b5 & 255;
    }

    private String S() {
        if (size() <= 50) {
            return s1.a(this);
        }
        return s1.a(M(0, 47)) + "...";
    }

    static j T(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new d1(byteBuffer);
        }
        return V(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    static j U(byte[] bArr) {
        return new C0025j(bArr);
    }

    static j V(byte[] bArr, int r22, int r32) {
        return new e(bArr, r22, r32);
    }

    private static j q(Iterator<j> it, int r32) {
        if (r32 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(r32)));
        }
        if (r32 == 1) {
            return it.next();
        }
        int r02 = r32 >>> 1;
        return q(it, r02).u(q(it, r32 - r02));
    }

    static void s(int r32, int r4) {
        if (((r4 - (r32 + 1)) | r32) < 0) {
            if (r32 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + r32);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + r32 + ", " + r4);
        }
    }

    static int t(int r32, int r4, int r5) {
        int r02 = r4 - r32;
        if ((r32 | r4 | r02 | (r5 - r4)) >= 0) {
            return r02;
        }
        if (r32 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + r32 + " < 0");
        }
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + r32 + ", " + r4);
        }
        throw new IndexOutOfBoundsException("End index: " + r4 + " >= " + r5);
    }

    public static j v(Iterable<j> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            size = 0;
            Iterator<j> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f2914f : q(iterable.iterator(), size);
    }

    public static j w(byte[] bArr) {
        return x(bArr, 0, bArr.length);
    }

    public static j x(byte[] bArr, int r32, int r4) {
        t(r32, r32 + r4, bArr.length);
        return new C0025j(f2915g.a(bArr, r32, r4));
    }

    public static j y(String str) {
        return new C0025j(str.getBytes(d0.f2847b));
    }

    protected abstract void A(byte[] bArr, int r22, int r32, int r4);

    protected abstract int B();

    abstract byte C(int r12);

    protected abstract boolean D();

    public abstract boolean E();

    @Override // java.lang.Iterable
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public g iterator() {
        return new a();
    }

    public abstract com.google.protobuf.k H();

    protected abstract int I(int r12, int r22, int r32);

    protected abstract int J(int r12, int r22, int r32);

    protected final int K() {
        return this.f2917e;
    }

    public final j L(int r22) {
        return M(r22, size());
    }

    public abstract j M(int r12, int r22);

    public final byte[] N() {
        int size = size();
        if (size == 0) {
            return d0.f2849d;
        }
        byte[] bArr = new byte[size];
        A(bArr, 0, 0, size);
        return bArr;
    }

    public final String P(Charset charset) {
        return size() == 0 ? "" : Q(charset);
    }

    protected abstract String Q(Charset charset);

    public final String R() {
        return P(d0.f2847b);
    }

    abstract void W(com.google.protobuf.i iVar);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int r02 = this.f2917e;
        if (r02 == 0) {
            int size = size();
            r02 = I(size, 0, size);
            if (r02 == 0) {
                r02 = 1;
            }
            this.f2917e = r02;
        }
        return r02;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract ByteBuffer p();

    public abstract byte r(int r12);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), S());
    }

    public final j u(j jVar) {
        if (Integer.MAX_VALUE - size() >= jVar.size()) {
            return m1.a0(this, jVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + jVar.size());
    }

    @Deprecated
    public final void z(byte[] bArr, int r4, int r5, int r6) {
        t(r4, r4 + r6, size());
        t(r5, r5 + r6, bArr.length);
        if (r6 > 0) {
            A(bArr, r4, r5, r6);
        }
    }
}
