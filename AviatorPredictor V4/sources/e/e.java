package e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class e<K, V> {

    /* renamed from: h, reason: collision with root package name */
    static Object[] f3464h;

    /* renamed from: i, reason: collision with root package name */
    static int f3465i;

    /* renamed from: j, reason: collision with root package name */
    static Object[] f3466j;

    /* renamed from: k, reason: collision with root package name */
    static int f3467k;

    /* renamed from: e, reason: collision with root package name */
    int[] f3468e;

    /* renamed from: f, reason: collision with root package name */
    Object[] f3469f;

    /* renamed from: g, reason: collision with root package name */
    int f3470g;

    public e() {
        this.f3468e = c.f3446a;
        this.f3469f = c.f3448c;
        this.f3470g = 0;
    }

    public e(int r12) {
        if (r12 == 0) {
            this.f3468e = c.f3446a;
            this.f3469f = c.f3448c;
        } else {
            a(r12);
        }
        this.f3470g = 0;
    }

    private void a(int r6) {
        if (r6 == 8) {
            synchronized (e.class) {
                Object[] objArr = f3466j;
                if (objArr != null) {
                    this.f3469f = objArr;
                    f3466j = (Object[]) objArr[0];
                    this.f3468e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3467k--;
                    return;
                }
            }
        } else if (r6 == 4) {
            synchronized (e.class) {
                Object[] objArr2 = f3464h;
                if (objArr2 != null) {
                    this.f3469f = objArr2;
                    f3464h = (Object[]) objArr2[0];
                    this.f3468e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3465i--;
                    return;
                }
            }
        }
        this.f3468e = new int[r6];
        this.f3469f = new Object[r6 << 1];
    }

    private static int b(int[] r02, int r12, int r22) {
        try {
            return c.a(r02, r12, r22);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] r8, Object[] objArr, int r10) {
        if (r8.length == 8) {
            synchronized (e.class) {
                if (f3467k < 10) {
                    objArr[0] = f3466j;
                    objArr[1] = r8;
                    for (int r82 = (r10 << 1) - 1; r82 >= 2; r82--) {
                        objArr[r82] = null;
                    }
                    f3466j = objArr;
                    f3467k++;
                }
            }
            return;
        }
        if (r8.length == 4) {
            synchronized (e.class) {
                if (f3465i < 10) {
                    objArr[0] = f3464h;
                    objArr[1] = r8;
                    for (int r83 = (r10 << 1) - 1; r83 >= 2; r83--) {
                        objArr[r83] = null;
                    }
                    f3464h = objArr;
                    f3465i++;
                }
            }
        }
    }

    public void c(int r6) {
        int r02 = this.f3470g;
        int[] r12 = this.f3468e;
        if (r12.length < r6) {
            Object[] objArr = this.f3469f;
            a(r6);
            if (this.f3470g > 0) {
                System.arraycopy(r12, 0, this.f3468e, 0, r02);
                System.arraycopy(objArr, 0, this.f3469f, 0, r02 << 1);
            }
            d(r12, objArr, r02);
        }
        if (this.f3470g != r02) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int r02 = this.f3470g;
        if (r02 > 0) {
            int[] r12 = this.f3468e;
            Object[] objArr = this.f3469f;
            this.f3468e = c.f3446a;
            this.f3469f = c.f3448c;
            this.f3470g = 0;
            d(r12, objArr, r02);
        }
        if (this.f3470g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int r7) {
        int r02 = this.f3470g;
        if (r02 == 0) {
            return -1;
        }
        int b5 = b(this.f3468e, r02, r7);
        if (b5 < 0 || obj.equals(this.f3469f[b5 << 1])) {
            return b5;
        }
        int r22 = b5 + 1;
        while (r22 < r02 && this.f3468e[r22] == r7) {
            if (obj.equals(this.f3469f[r22 << 1])) {
                return r22;
            }
            r22++;
        }
        for (int r12 = b5 - 1; r12 >= 0 && this.f3468e[r12] == r7; r12--) {
            if (obj.equals(this.f3469f[r12 << 1])) {
                return r12;
            }
        }
        return ~r22;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (size() != eVar.size()) {
                return false;
            }
            for (int r12 = 0; r12 < this.f3470g; r12++) {
                try {
                    K i4 = i(r12);
                    V l4 = l(r12);
                    Object obj2 = eVar.get(i4);
                    if (l4 == null) {
                        if (obj2 != null || !eVar.containsKey(i4)) {
                            return false;
                        }
                    } else if (!l4.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int r13 = 0; r13 < this.f3470g; r13++) {
                try {
                    K i5 = i(r13);
                    V l5 = l(r13);
                    Object obj3 = map.get(i5);
                    if (l5 == null) {
                        if (obj3 != null || !map.containsKey(i5)) {
                            return false;
                        }
                    } else if (!l5.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int r02 = this.f3470g;
        if (r02 == 0) {
            return -1;
        }
        int b5 = b(this.f3468e, r02, 0);
        if (b5 < 0 || this.f3469f[b5 << 1] == null) {
            return b5;
        }
        int r22 = b5 + 1;
        while (r22 < r02 && this.f3468e[r22] == 0) {
            if (this.f3469f[r22 << 1] == null) {
                return r22;
            }
            r22++;
        }
        for (int r12 = b5 - 1; r12 >= 0 && this.f3468e[r12] == 0; r12--) {
            if (this.f3469f[r12 << 1] == null) {
                return r12;
            }
        }
        return ~r22;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v4) {
        int f5 = f(obj);
        return f5 >= 0 ? (V) this.f3469f[(f5 << 1) + 1] : v4;
    }

    int h(Object obj) {
        int r02 = this.f3470g * 2;
        Object[] objArr = this.f3469f;
        if (obj == null) {
            for (int r6 = 1; r6 < r02; r6 += 2) {
                if (objArr[r6] == null) {
                    return r6 >> 1;
                }
            }
            return -1;
        }
        for (int r32 = 1; r32 < r02; r32 += 2) {
            if (obj.equals(objArr[r32])) {
                return r32 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] r02 = this.f3468e;
        Object[] objArr = this.f3469f;
        int r22 = this.f3470g;
        int r32 = 1;
        int r5 = 0;
        int r6 = 0;
        while (r5 < r22) {
            Object obj = objArr[r32];
            r6 += (obj == null ? 0 : obj.hashCode()) ^ r02[r5];
            r5++;
            r32 += 2;
        }
        return r6;
    }

    public K i(int r22) {
        return (K) this.f3469f[r22 << 1];
    }

    public boolean isEmpty() {
        return this.f3470g <= 0;
    }

    public V j(int r11) {
        Object[] objArr = this.f3469f;
        int r12 = r11 << 1;
        V v4 = (V) objArr[r12 + 1];
        int r32 = this.f3470g;
        int r4 = 0;
        if (r32 <= 1) {
            d(this.f3468e, objArr, r32);
            this.f3468e = c.f3446a;
            this.f3469f = c.f3448c;
        } else {
            int r6 = r32 - 1;
            int[] r7 = this.f3468e;
            if (r7.length <= 8 || r32 >= r7.length / 3) {
                if (r11 < r6) {
                    int r02 = r11 + 1;
                    int r42 = r6 - r11;
                    System.arraycopy(r7, r02, r7, r11, r42);
                    Object[] objArr2 = this.f3469f;
                    System.arraycopy(objArr2, r02 << 1, objArr2, r12, r42 << 1);
                }
                Object[] objArr3 = this.f3469f;
                int r03 = r6 << 1;
                objArr3[r03] = null;
                objArr3[r03 + 1] = null;
            } else {
                a(r32 > 8 ? r32 + (r32 >> 1) : 8);
                if (r32 != this.f3470g) {
                    throw new ConcurrentModificationException();
                }
                if (r11 > 0) {
                    System.arraycopy(r7, 0, this.f3468e, 0, r11);
                    System.arraycopy(objArr, 0, this.f3469f, 0, r12);
                }
                if (r11 < r6) {
                    int r43 = r11 + 1;
                    int r9 = r6 - r11;
                    System.arraycopy(r7, r43, this.f3468e, r11, r9);
                    System.arraycopy(objArr, r43 << 1, this.f3469f, r12, r9 << 1);
                }
            }
            r4 = r6;
        }
        if (r32 != this.f3470g) {
            throw new ConcurrentModificationException();
        }
        this.f3470g = r4;
        return v4;
    }

    public V k(int r32, V v4) {
        int r33 = (r32 << 1) + 1;
        Object[] objArr = this.f3469f;
        V v5 = (V) objArr[r33];
        objArr[r33] = v4;
        return v5;
    }

    public V l(int r22) {
        return (V) this.f3469f[(r22 << 1) + 1];
    }

    public V put(K k4, V v4) {
        int r32;
        int e5;
        int r02 = this.f3470g;
        if (k4 == null) {
            e5 = g();
            r32 = 0;
        } else {
            int hashCode = k4.hashCode();
            r32 = hashCode;
            e5 = e(k4, hashCode);
        }
        if (e5 >= 0) {
            int r10 = (e5 << 1) + 1;
            Object[] objArr = this.f3469f;
            V v5 = (V) objArr[r10];
            objArr[r10] = v4;
            return v5;
        }
        int r22 = ~e5;
        int[] r4 = this.f3468e;
        if (r02 >= r4.length) {
            int r5 = 4;
            if (r02 >= 8) {
                r5 = (r02 >> 1) + r02;
            } else if (r02 >= 4) {
                r5 = 8;
            }
            Object[] objArr2 = this.f3469f;
            a(r5);
            if (r02 != this.f3470g) {
                throw new ConcurrentModificationException();
            }
            int[] r52 = this.f3468e;
            if (r52.length > 0) {
                System.arraycopy(r4, 0, r52, 0, r4.length);
                System.arraycopy(objArr2, 0, this.f3469f, 0, objArr2.length);
            }
            d(r4, objArr2, r02);
        }
        if (r22 < r02) {
            int[] r12 = this.f3468e;
            int r42 = r22 + 1;
            System.arraycopy(r12, r22, r12, r42, r02 - r22);
            Object[] objArr3 = this.f3469f;
            System.arraycopy(objArr3, r22 << 1, objArr3, r42 << 1, (this.f3470g - r22) << 1);
        }
        int r13 = this.f3470g;
        if (r02 == r13) {
            int[] r03 = this.f3468e;
            if (r22 < r03.length) {
                r03[r22] = r32;
                Object[] objArr4 = this.f3469f;
                int r23 = r22 << 1;
                objArr4[r23] = k4;
                objArr4[r23 + 1] = v4;
                this.f3470g = r13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k4, V v4) {
        V v5 = get(k4);
        return v5 == null ? put(k4, v4) : v5;
    }

    public V remove(Object obj) {
        int f5 = f(obj);
        if (f5 >= 0) {
            return j(f5);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f5 = f(obj);
        if (f5 < 0) {
            return false;
        }
        V l4 = l(f5);
        if (obj2 != l4 && (obj2 == null || !obj2.equals(l4))) {
            return false;
        }
        j(f5);
        return true;
    }

    public V replace(K k4, V v4) {
        int f5 = f(k4);
        if (f5 >= 0) {
            return k(f5, v4);
        }
        return null;
    }

    public boolean replace(K k4, V v4, V v5) {
        int f5 = f(k4);
        if (f5 < 0) {
            return false;
        }
        V l4 = l(f5);
        if (l4 != v4 && (v4 == null || !v4.equals(l4))) {
            return false;
        }
        k(f5, v5);
        return true;
    }

    public int size() {
        return this.f3470g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3470g * 28);
        sb.append('{');
        for (int r12 = 0; r12 < this.f3470g; r12++) {
            if (r12 > 0) {
                sb.append(", ");
            }
            K i4 = i(r12);
            if (i4 != this) {
                sb.append(i4);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V l4 = l(r12);
            if (l4 != this) {
                sb.append(l4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
