package r0;

import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes.dex */
final class s<K, V> extends i<K, V> {

    /* renamed from: l, reason: collision with root package name */
    static final i<Object, Object> f7410l = new s(null, new Object[0], 0);

    /* renamed from: i, reason: collision with root package name */
    private final transient Object f7411i;

    /* renamed from: j, reason: collision with root package name */
    final transient Object[] f7412j;

    /* renamed from: k, reason: collision with root package name */
    private final transient int f7413k;

    static class a<K, V> extends j<Map.Entry<K, V>> {

        /* renamed from: g, reason: collision with root package name */
        private final transient i<K, V> f7414g;

        /* renamed from: h, reason: collision with root package name */
        private final transient Object[] f7415h;

        /* renamed from: i, reason: collision with root package name */
        private final transient int f7416i;

        /* renamed from: j, reason: collision with root package name */
        private final transient int f7417j;

        /* renamed from: r0.s$a$a, reason: collision with other inner class name */
        class C0080a extends h<Map.Entry<K, V>> {
            C0080a() {
            }

            @Override // java.util.List
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int r4) {
                q0.l.l(r4, a.this.f7417j);
                int r42 = r4 * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.f7415h[a.this.f7416i + r42], a.this.f7415h[r42 + (a.this.f7416i ^ 1)]);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f7417j;
            }
        }

        a(i<K, V> iVar, Object[] objArr, int r32, int r4) {
            this.f7414g = iVar;
            this.f7415h = objArr;
            this.f7416i = r32;
            this.f7417j = r4;
        }

        @Override // r0.g, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f7414g.get(key));
        }

        @Override // r0.g
        int i(Object[] objArr, int r32) {
            return u().i(objArr, r32);
        }

        @Override // r0.g
        boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7417j;
        }

        @Override // r0.j, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: t */
        public x<Map.Entry<K, V>> iterator() {
            return u().iterator();
        }

        @Override // r0.j
        h<Map.Entry<K, V>> y() {
            return new C0080a();
        }
    }

    static final class b<K> extends j<K> {

        /* renamed from: g, reason: collision with root package name */
        private final transient i<K, ?> f7419g;

        /* renamed from: h, reason: collision with root package name */
        private final transient h<K> f7420h;

        b(i<K, ?> iVar, h<K> hVar) {
            this.f7419g = iVar;
            this.f7420h = hVar;
        }

        @Override // r0.g, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f7419g.get(obj) != null;
        }

        @Override // r0.g
        int i(Object[] objArr, int r32) {
            return u().i(objArr, r32);
        }

        @Override // r0.g
        boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7419g.size();
        }

        @Override // r0.j, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: t */
        public x<K> iterator() {
            return u().iterator();
        }

        @Override // r0.j
        public h<K> u() {
            return this.f7420h;
        }
    }

    static final class c extends h<Object> {

        /* renamed from: g, reason: collision with root package name */
        private final transient Object[] f7421g;

        /* renamed from: h, reason: collision with root package name */
        private final transient int f7422h;

        /* renamed from: i, reason: collision with root package name */
        private final transient int f7423i;

        c(Object[] objArr, int r22, int r32) {
            this.f7421g = objArr;
            this.f7422h = r22;
            this.f7423i = r32;
        }

        @Override // java.util.List
        public Object get(int r32) {
            q0.l.l(r32, this.f7423i);
            return this.f7421g[(r32 * 2) + this.f7422h];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7423i;
        }
    }

    private s(Object obj, Object[] objArr, int r32) {
        this.f7411i = obj;
        this.f7412j = objArr;
        this.f7413k = r32;
    }

    static <K, V> s<K, V> k(int r32, Object[] objArr) {
        if (r32 == 0) {
            return (s) f7410l;
        }
        if (r32 == 1) {
            r0.c.a(objArr[0], objArr[1]);
            return new s<>(null, objArr, 1);
        }
        q0.l.q(r32, objArr.length >> 1);
        return new s<>(l(objArr, r32, j.v(r32), 0), objArr, r32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
    
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object l(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 != r0) goto Le
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            r0.c.a(r10, r9)
            r9 = 0
            return r9
        Le:
            int r0 = r11 + (-1)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L50
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L1b:
            if (r2 >= r10) goto L4f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            r0.c.a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = r0.f.a(r5)
        L31:
            r5 = r5 & r0
            r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L3f
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L1b
        L3f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L4a
            int r5 = r5 + 1
            goto L31
        L4a:
            java.lang.IllegalArgumentException r9 = m(r3, r4, r9, r6)
            throw r9
        L4f:
            return r11
        L50:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L90
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L5a:
            if (r2 >= r10) goto L8f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            r0.c.a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = r0.f.a(r5)
        L70:
            r5 = r5 & r0
            short r6 = r11[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L7f
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L5a
        L7f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L8a
            int r5 = r5 + 1
            goto L70
        L8a:
            java.lang.IllegalArgumentException r9 = m(r3, r4, r9, r6)
            throw r9
        L8f:
            return r11
        L90:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L95:
            if (r2 >= r10) goto Lc5
            int r1 = r2 * 2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            r0.c.a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = r0.f.a(r6)
        Lab:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto Lb5
            r11[r6] = r1
            int r2 = r2 + 1
            goto L95
        Lb5:
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto Lc0
            int r6 = r6 + 1
            goto Lab
        Lc0:
            java.lang.IllegalArgumentException r9 = m(r4, r5, r9, r7)
            throw r9
        Lc5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.s.l(java.lang.Object[], int, int, int):java.lang.Object");
    }

    private static IllegalArgumentException m(Object obj, Object obj2, Object[] objArr, int r6) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[r6]);
        String valueOf4 = String.valueOf(objArr[r6 ^ 1]);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    static Object n(Object obj, Object[] objArr, int r6, int r7, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (r6 == 1) {
            if (objArr[r7].equals(obj2)) {
                return objArr[r7 ^ 1];
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int a5 = f.a(obj2.hashCode());
            while (true) {
                int r4 = a5 & length;
                int r22 = bArr[r4] & 255;
                if (r22 == 255) {
                    return null;
                }
                if (objArr[r22].equals(obj2)) {
                    return objArr[r22 ^ 1];
                }
                a5 = r4 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int a6 = f.a(obj2.hashCode());
            while (true) {
                int r42 = a6 & length2;
                int r23 = sArr[r42] & 65535;
                if (r23 == 65535) {
                    return null;
                }
                if (objArr[r23].equals(obj2)) {
                    return objArr[r23 ^ 1];
                }
                a6 = r42 + 1;
            }
        } else {
            int[] r43 = (int[]) obj;
            int length3 = r43.length - 1;
            int a7 = f.a(obj2.hashCode());
            while (true) {
                int r72 = a7 & length3;
                int r24 = r43[r72];
                if (r24 == -1) {
                    return null;
                }
                if (objArr[r24].equals(obj2)) {
                    return objArr[r24 ^ 1];
                }
                a7 = r72 + 1;
            }
        }
    }

    @Override // r0.i
    j<Map.Entry<K, V>> c() {
        return new a(this, this.f7412j, 0, this.f7413k);
    }

    @Override // r0.i
    j<K> d() {
        return new b(this, new c(this.f7412j, 0, this.f7413k));
    }

    @Override // r0.i
    g<V> e() {
        return new c(this.f7412j, 1, this.f7413k);
    }

    @Override // r0.i
    boolean g() {
        return false;
    }

    @Override // r0.i, java.util.Map
    public V get(Object obj) {
        return (V) n(this.f7411i, this.f7412j, this.f7413k, 0, obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f7413k;
    }
}
