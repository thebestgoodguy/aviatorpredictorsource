package defpackage;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes61.dex */
final class g extends ag {
    static final ag a = new g(null, new Object[0], 0);
    final transient Object[] b;

    @CheckForNull
    private final transient Object c;
    private final transient int d;

    private g(@CheckForNull Object obj, Object[] objArr, int r3) {
        this.c = obj;
        this.b = objArr;
        this.d = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    static g a(int r17, Object[] objArr, af afVar) {
        short[] sArr;
        Object[] objArr2;
        int r0 = r17;
        Object[] objArr3 = objArr;
        if (r0 == 0) {
            return (g) a;
        }
        Object obj = null;
        if (r0 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            y.a(obj2, obj3);
            return new g(null, objArr3, 1);
        }
        v.b(r0, objArr3.length >> 1, "index");
        char c = 2;
        int max = Math.max(r0, 2);
        int r8 = BasicMeasure.EXACTLY;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            r8 = highestOneBit + highestOneBit;
            while (r8 * 0.7d < max) {
                r8 += r8;
            }
        } else if (max >= 1073741824) {
            throw new IllegalArgumentException("collection too large");
        }
        if (r0 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            y.a(obj4, obj5);
        } else {
            int r6 = r8 - 1;
            char c2 = 65535;
            if (r8 <= 128) {
                byte[] bArr = new byte[r8];
                Arrays.fill(bArr, (byte) -1);
                int r10 = 0;
                for (int r82 = 0; r82 < r0; r82++) {
                    int r11 = r82 + r82;
                    int r12 = r10 + r10;
                    Object obj6 = objArr3[r11];
                    obj6.getClass();
                    Object obj7 = objArr3[r11 ^ 1];
                    obj7.getClass();
                    y.a(obj6, obj7);
                    int a2 = z.a(obj6.hashCode());
                    while (true) {
                        int r14 = a2 & r6;
                        int r15 = bArr[r14] & 255;
                        if (r15 == 255) {
                            bArr[r14] = (byte) r12;
                            if (r10 < r82) {
                                objArr3[r12] = obj6;
                                objArr3[r12 ^ 1] = obj7;
                            }
                            r10++;
                        } else {
                            if (obj6.equals(objArr3[r15])) {
                                int r2 = r15 ^ 1;
                                Object obj8 = objArr3[r2];
                                obj8.getClass();
                                ae aeVar = new ae(obj6, obj7, obj8);
                                objArr3[r2] = obj7;
                                obj = aeVar;
                                break;
                            }
                            a2 = r14 + 1;
                        }
                    }
                }
                if (r10 == r0) {
                    obj = bArr;
                    c = 2;
                } else {
                    sArr = new Object[]{bArr, Integer.valueOf(r10), obj};
                }
            } else if (r8 <= 32768) {
                sArr = new short[r8];
                Arrays.fill(sArr, (short) -1);
                int r83 = 0;
                for (int r7 = 0; r7 < r0; r7++) {
                    int r102 = r7 + r7;
                    int r112 = r83 + r83;
                    Object obj9 = objArr3[r102];
                    obj9.getClass();
                    Object obj10 = objArr3[r102 ^ 1];
                    obj10.getClass();
                    y.a(obj9, obj10);
                    int a3 = z.a(obj9.hashCode());
                    while (true) {
                        int r13 = a3 & r6;
                        char c3 = (char) sArr[r13];
                        if (c3 == 65535) {
                            sArr[r13] = (short) r112;
                            if (r83 < r7) {
                                objArr3[r112] = obj9;
                                objArr3[r112 ^ 1] = obj10;
                            }
                            r83++;
                        } else {
                            if (obj9.equals(objArr3[c3])) {
                                int r22 = c3 ^ 1;
                                Object obj11 = objArr3[r22];
                                obj11.getClass();
                                ae aeVar2 = new ae(obj9, obj10, obj11);
                                objArr3[r22] = obj10;
                                obj = aeVar2;
                                break;
                            }
                            a3 = r13 + 1;
                        }
                    }
                }
                if (r83 != r0) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(r83), obj};
                    obj = objArr2;
                }
            } else {
                sArr = new int[r8];
                Arrays.fill((int[]) sArr, -1);
                int r72 = 0;
                int r84 = 0;
                while (r72 < r0) {
                    int r113 = r72 + r72;
                    int r122 = r84 + r84;
                    Object obj12 = objArr3[r113];
                    obj12.getClass();
                    Object obj13 = objArr3[r113 ^ 1];
                    obj13.getClass();
                    y.a(obj12, obj13);
                    int a4 = z.a(obj12.hashCode());
                    while (true) {
                        int r142 = a4 & r6;
                        ?? r152 = sArr[r142];
                        if (r152 == c2) {
                            sArr[r142] = r122;
                            if (r84 < r72) {
                                objArr3[r122] = obj12;
                                objArr3[r122 ^ 1] = obj13;
                            }
                            r84++;
                        } else {
                            if (obj12.equals(objArr3[r152])) {
                                int r23 = r152 ^ 1;
                                Object obj14 = objArr3[r23];
                                obj14.getClass();
                                ae aeVar3 = new ae(obj12, obj13, obj14);
                                objArr3[r23] = obj13;
                                obj = aeVar3;
                                break;
                            }
                            a4 = r142 + 1;
                            c2 = 65535;
                        }
                    }
                    r72++;
                    c2 = 65535;
                }
                if (r84 != r0) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(r84), obj};
                    obj = objArr2;
                }
            }
            obj = sArr;
            c = 2;
        }
        boolean z = obj instanceof Object[];
        Object obj15 = obj;
        if (z) {
            Object[] objArr4 = (Object[]) obj;
            afVar.c = (ae) objArr4[c];
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            r0 = intValue;
        }
        return new g(obj15, objArr3, r0);
    }

    @Override // defpackage.ag
    final aa a() {
        return new f(this.b, 1, this.d);
    }

    @Override // defpackage.ag
    final ah b() {
        return new d(this, this.b, 0, this.d);
    }

    @Override // defpackage.ag
    final ah c() {
        return new e(this, new f(this.b, 0, this.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // defpackage.ag, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            java.lang.Object[] r1 = r9.b
            int r2 = r9.d
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = defpackage.z.a(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = defpackage.z.a(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = defpackage.z.a(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }
}
