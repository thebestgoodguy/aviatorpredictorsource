package p1;

import android.os.Handler;
import android.os.Looper;
import b3.f1;
import b3.g1;
import b3.h1;
import com.google.firebase.firestore.u;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Random f7024a = new SecureRandom();

    /* renamed from: b, reason: collision with root package name */
    private static final o0.a<Void, Void> f7025b = new o0.a() { // from class: p1.f0
        @Override // o0.a
        public final Object a(o0.h hVar) {
            Void w4;
            w4 = g0.w(hVar);
            return w4;
        }
    };

    public static o0.a<Void, Void> A() {
        return f7025b;
    }

    private static <T> T e(Iterator<T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T extends Comparable<T>> Comparator<T> f() {
        return new Comparator() { // from class: p1.e0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Comparable) obj).compareTo((Comparable) obj2);
            }
        };
    }

    public static int g(boolean z4, boolean z5) {
        if (z4 == z5) {
            return 0;
        }
        return z4 ? 1 : -1;
    }

    public static int h(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int r12 = 0; r12 < min; r12++) {
            int r22 = bArr[r12] & 255;
            int r32 = bArr2[r12] & 255;
            if (r22 < r32) {
                return -1;
            }
            if (r22 > r32) {
                return 1;
            }
        }
        return k(bArr.length, bArr2.length);
    }

    public static int i(com.google.protobuf.j jVar, com.google.protobuf.j jVar2) {
        int min = Math.min(jVar.size(), jVar2.size());
        for (int r12 = 0; r12 < min; r12++) {
            int r4 = jVar.r(r12) & 255;
            int r5 = jVar2.r(r12) & 255;
            if (r4 < r5) {
                return -1;
            }
            if (r4 > r5) {
                return 1;
            }
        }
        return k(jVar.size(), jVar2.size());
    }

    public static int j(double d5, double d6) {
        return p0.a.c(d5, d6);
    }

    public static int k(int r02, int r12) {
        if (r02 < r12) {
            return -1;
        }
        return r02 > r12 ? 1 : 0;
    }

    public static int l(long j4, long j5) {
        return p0.a.a(j4, j5);
    }

    public static int m(double d5, long j4) {
        return p0.a.b(d5, j4);
    }

    private static Exception n(Exception exc) {
        f1 a5;
        if (exc instanceof g1) {
            a5 = ((g1) exc).a();
        } else {
            if (!(exc instanceof h1)) {
                return exc;
            }
            a5 = ((h1) exc).a();
        }
        return r(a5);
    }

    public static void o(final RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: p1.b0
            @Override // java.lang.Runnable
            public final void run() {
                g0.t(runtimeException);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r4 > 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001e, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[EDGE_INSN: B:17:0x0029->B:19:? BREAK  A[LOOP:1: B:2:0x0004->B:21:0x0025]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> void p(java.util.Iterator<T> r5, java.util.Iterator<T> r6, java.util.Comparator<? super T> r7, p1.n<T> r8, p1.n<T> r9) {
        /*
        L0:
            java.lang.Object r0 = e(r5)
        L4:
            java.lang.Object r1 = e(r6)
        L8:
            if (r0 != 0) goto Le
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1e
            if (r1 == 0) goto L1e
            int r4 = r7.compare(r0, r1)
            if (r4 >= 0) goto L1b
            goto L23
        L1b:
            if (r4 <= 0) goto L22
            goto L21
        L1e:
            if (r0 == 0) goto L21
            goto L23
        L21:
            r2 = 1
        L22:
            r3 = 0
        L23:
            if (r2 == 0) goto L29
            r8.accept(r1)
            goto L4
        L29:
            if (r3 == 0) goto L0
            r9.accept(r0)
            java.lang.Object r0 = e(r5)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.g0.p(java.util.Iterator, java.util.Iterator, java.util.Comparator, p1.n, p1.n):void");
    }

    public static <T extends Comparable<T>> void q(SortedSet<T> sortedSet, SortedSet<T> sortedSet2, n<T> nVar, n<T> nVar2) {
        p(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : new Comparator() { // from class: p1.d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareTo;
                compareTo = ((Comparable) obj).compareTo((Comparable) obj2);
                return compareTo;
            }
        }, nVar, nVar2);
    }

    public static com.google.firebase.firestore.u r(f1 f1Var) {
        g1 c5 = f1Var.c();
        return new com.google.firebase.firestore.u(c5.getMessage(), u.a.g(f1Var.m().h()), c5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> s(Map<K, V> map, int r4, final Comparator<V> comparator) {
        if (map.size() <= r4) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: p1.c0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int v4;
                v4 = g0.v(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                return v4;
            }
        });
        HashMap hashMap = new HashMap();
        for (int r5 = 0; r5 < r4; r5++) {
            hashMap.put(((Map.Entry) arrayList.get(r5)).getKey(), ((Map.Entry) arrayList.get(r5)).getValue());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(RuntimeException runtimeException) {
        throw runtimeException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int v(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        return comparator.compare(entry.getValue(), entry2.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void w(o0.h hVar) {
        if (hVar.p()) {
            return (Void) hVar.m();
        }
        Exception n4 = n(hVar.l());
        if (n4 instanceof com.google.firebase.firestore.u) {
            throw n4;
        }
        throw new com.google.firebase.firestore.u(n4.getMessage(), u.a.UNKNOWN, n4);
    }

    public static StringBuilder x(CharSequence charSequence, int r32, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (r32 != 0) {
            sb.append(charSequence);
            for (int r12 = 1; r12 < r32; r12++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String y(com.google.protobuf.j jVar) {
        int size = jVar.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int r22 = 0; r22 < size; r22++) {
            int r4 = jVar.r(r22) & 255;
            sb.append(Character.forDigit(r4 >>> 4, 16));
            sb.append(Character.forDigit(r4 & 15, 16));
        }
        return sb.toString();
    }

    public static String z(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }
}
