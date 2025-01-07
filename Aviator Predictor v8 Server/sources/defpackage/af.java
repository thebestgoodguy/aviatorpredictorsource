package defpackage;

import java.util.Arrays;

/* loaded from: classes61.dex */
public final class af {
    Object[] a = new Object[8];
    int b = 0;
    ae c;

    public final af a(Object obj, Object obj2) {
        int r0 = this.b + 1;
        int r02 = r0 + r0;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (r02 > length) {
            int r2 = length + (length >> 1) + 1;
            if (r2 < r02) {
                int highestOneBit = Integer.highestOneBit(r02 - 1);
                r2 = highestOneBit + highestOneBit;
            }
            if (r2 < 0) {
                r2 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(objArr, r2);
        }
        y.a(obj, obj2);
        Object[] objArr2 = this.a;
        int r1 = this.b;
        int r22 = r1 + r1;
        objArr2[r22] = obj;
        objArr2[r22 + 1] = obj2;
        this.b = r1 + 1;
        return this;
    }

    public final ag a() {
        ae aeVar = this.c;
        if (aeVar != null) {
            throw aeVar.a();
        }
        g a = g.a(this.b, this.a, this);
        ae aeVar2 = this.c;
        if (aeVar2 == null) {
            return a;
        }
        throw aeVar2.a();
    }
}
