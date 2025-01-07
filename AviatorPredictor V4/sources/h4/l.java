package h4;

import java.util.Arrays;

/* loaded from: classes.dex */
final class l extends f {

    /* renamed from: j, reason: collision with root package name */
    final transient byte[][] f4005j;

    /* renamed from: k, reason: collision with root package name */
    final transient int[] f4006k;

    l(c cVar, int r9) {
        super(null);
        p.b(cVar.f3977f, 0L, r9);
        j jVar = cVar.f3976e;
        int r12 = 0;
        int r22 = 0;
        int r32 = 0;
        while (r22 < r9) {
            int r4 = jVar.f3998c;
            int r5 = jVar.f3997b;
            if (r4 == r5) {
                throw new AssertionError("s.limit == s.pos");
            }
            r22 += r4 - r5;
            r32++;
            jVar = jVar.f4001f;
        }
        this.f4005j = new byte[r32][];
        this.f4006k = new int[r32 * 2];
        j jVar2 = cVar.f3976e;
        int r02 = 0;
        while (r12 < r9) {
            byte[][] bArr = this.f4005j;
            bArr[r02] = jVar2.f3996a;
            int r33 = jVar2.f3998c;
            int r42 = jVar2.f3997b;
            r12 += r33 - r42;
            if (r12 > r9) {
                r12 = r9;
            }
            int[] r34 = this.f4006k;
            r34[r02] = r12;
            r34[bArr.length + r02] = r42;
            jVar2.f3999d = true;
            r02++;
            jVar2 = jVar2.f4001f;
        }
    }

    private f A() {
        return new f(w());
    }

    private int z(int r4) {
        int binarySearch = Arrays.binarySearch(this.f4006k, 0, this.f4005j.length, r4 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // h4.f
    public String d() {
        return A().d();
    }

    @Override // h4.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.s() == s() && q(0, fVar, 0, s())) {
                return true;
            }
        }
        return false;
    }

    @Override // h4.f
    public int hashCode() {
        int r02 = this.f3982f;
        if (r02 != 0) {
            return r02;
        }
        int length = this.f4005j.length;
        int r12 = 0;
        int r22 = 0;
        int r32 = 1;
        while (r12 < length) {
            byte[] bArr = this.f4005j[r12];
            int[] r5 = this.f4006k;
            int r6 = r5[length + r12];
            int r52 = r5[r12];
            int r23 = (r52 - r22) + r6;
            while (r6 < r23) {
                r32 = (r32 * 31) + bArr[r6];
                r6++;
            }
            r12++;
            r22 = r52;
        }
        this.f3982f = r32;
        return r32;
    }

    @Override // h4.f
    public byte k(int r8) {
        p.b(this.f4006k[this.f4005j.length - 1], r8, 1L);
        int z4 = z(r8);
        int r12 = z4 == 0 ? 0 : this.f4006k[z4 - 1];
        int[] r22 = this.f4006k;
        byte[][] bArr = this.f4005j;
        return bArr[z4][(r8 - r12) + r22[bArr.length + z4]];
    }

    @Override // h4.f
    public String n() {
        return A().n();
    }

    @Override // h4.f
    public boolean q(int r8, f fVar, int r10, int r11) {
        if (r8 < 0 || r8 > s() - r11) {
            return false;
        }
        int z4 = z(r8);
        while (r11 > 0) {
            int r22 = z4 == 0 ? 0 : this.f4006k[z4 - 1];
            int min = Math.min(r11, ((this.f4006k[z4] - r22) + r22) - r8);
            int[] r4 = this.f4006k;
            byte[][] bArr = this.f4005j;
            if (!fVar.r(r10, bArr[z4], (r8 - r22) + r4[bArr.length + z4], min)) {
                return false;
            }
            r8 += min;
            r10 += min;
            r11 -= min;
            z4++;
        }
        return true;
    }

    @Override // h4.f
    public boolean r(int r8, byte[] bArr, int r10, int r11) {
        if (r8 < 0 || r8 > s() - r11 || r10 < 0 || r10 > bArr.length - r11) {
            return false;
        }
        int z4 = z(r8);
        while (r11 > 0) {
            int r22 = z4 == 0 ? 0 : this.f4006k[z4 - 1];
            int min = Math.min(r11, ((this.f4006k[z4] - r22) + r22) - r8);
            int[] r4 = this.f4006k;
            byte[][] bArr2 = this.f4005j;
            if (!p.a(bArr2[z4], (r8 - r22) + r4[bArr2.length + z4], bArr, r10, min)) {
                return false;
            }
            r8 += min;
            r10 += min;
            r11 -= min;
            z4++;
        }
        return true;
    }

    @Override // h4.f
    public int s() {
        return this.f4006k[this.f4005j.length - 1];
    }

    @Override // h4.f
    public String toString() {
        return A().toString();
    }

    @Override // h4.f
    public f u(int r22, int r32) {
        return A().u(r22, r32);
    }

    @Override // h4.f
    public f v() {
        return A().v();
    }

    @Override // h4.f
    public byte[] w() {
        int[] r02 = this.f4006k;
        byte[][] bArr = this.f4005j;
        byte[] bArr2 = new byte[r02[bArr.length - 1]];
        int length = bArr.length;
        int r22 = 0;
        int r32 = 0;
        while (r22 < length) {
            int[] r4 = this.f4006k;
            int r5 = r4[length + r22];
            int r42 = r4[r22];
            System.arraycopy(this.f4005j[r22], r5, bArr2, r32, r42 - r32);
            r22++;
            r32 = r42;
        }
        return bArr2;
    }

    @Override // h4.f
    public String x() {
        return A().x();
    }

    @Override // h4.f
    void y(c cVar) {
        int length = this.f4005j.length;
        int r12 = 0;
        int r22 = 0;
        while (r12 < length) {
            int[] r32 = this.f4006k;
            int r7 = r32[length + r12];
            int r33 = r32[r12];
            j jVar = new j(this.f4005j[r12], r7, (r7 + r33) - r22, true, false);
            j jVar2 = cVar.f3976e;
            if (jVar2 == null) {
                jVar.f4002g = jVar;
                jVar.f4001f = jVar;
                cVar.f3976e = jVar;
            } else {
                jVar2.f4002g.c(jVar);
            }
            r12++;
            r22 = r33;
        }
        cVar.f3977f += r22;
    }
}
